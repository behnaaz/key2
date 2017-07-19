// This file is part of KeY - Integrated Deductive Software Design
//
// Copyright (C) 2001-2011 Universitaet Karlsruhe (TH), Germany
//                         Universitaet Koblenz-Landau, Germany
//                         Chalmers University of Technology, Sweden
// Copyright (C) 2011-2014 Karlsruhe Institute of Technology, Germany
//                         Technical University Darmstadt, Germany
//                         Chalmers University of Technology, Sweden
//
// The KeY system is protected by the GNU General
// Public License. See LICENSE.TXT for details.
//

package de.uka.ilkd.key.taclettranslation.lemma;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

import org.key_project.util.collection.DefaultImmutableSet;
import org.key_project.util.collection.ImmutableList;
import org.key_project.util.collection.ImmutableSet;

import de.uka.ilkd.key.proof.CompoundProof;
import de.uka.ilkd.key.proof.Proof;
import de.uka.ilkd.key.proof.ProofAggregate;
import de.uka.ilkd.key.proof.SingleProof;
import de.uka.ilkd.key.proof.init.InitConfig;
import de.uka.ilkd.key.proof.init.ProofInputException;
import de.uka.ilkd.key.proof.init.ProofOblInput;
import de.uka.ilkd.key.proof.mgt.AxiomJustification;
import de.uka.ilkd.key.proof.mgt.ProofEnvironment;
import de.uka.ilkd.key.rule.Taclet;

public class TacletSoundnessPOLoader {

        private final boolean loadAsLemmata;


        /**
         * If this InitConfig is unequal to null, the taclets will be loaded using this config
         * as well. This is used for the mode when a proof obligation already exists and the taclets
         * should be added to that proof obligation. The taclets then are loaded twice. Once for generating
         * proof obligations and once for adding them to the already existing proof obligation. This is necessary
         * in order to omit name clashes.
         */
        private final InitConfig originalConfig;

        private final List<LoaderListener> listeners = new LinkedList<LoaderListener>();
        private ProofAggregate resultingProof;
        private ImmutableSet<Taclet> resultingTaclets = DefaultImmutableSet
                        .nil();
        private ImmutableSet<Taclet> resultingTacletsForOriginalProof = DefaultImmutableSet.<Taclet>nil();


        private final boolean isOnlyUsedForProvingTaclets;

        private final TacletLoader       tacletLoader;
        private final TacletFilter tacletFilter;


        static public interface LoaderListener {
                public void started();

                public void stopped(ProofAggregate p,
                                ImmutableSet<Taclet> taclets, boolean addAsAxioms);

                public void stopped(Throwable exception);

                public void progressStarted(Object sender);

                public void reportStatus(Object sender,String string);

                public void resetStatus(Object sender);
        }

        static public interface TacletFilter {
                public ImmutableSet<Taclet> filter(List<TacletInfo> taclets);
        }



        static public class TacletInfo {
                private final Taclet taclet;
                private final boolean alreadyInUse;
                private final boolean notSupported;
                private final String   nameLowerCase;

                public Taclet getTaclet() {
                        return taclet;
                }

                public boolean isAlreadyInUse() {
                        return alreadyInUse;
                }

                public String getNameLowerCase() {
                        return nameLowerCase;
                }

                public boolean isNotSupported() {
                        return notSupported;
                }

                public TacletInfo(Taclet taclet, boolean alreadyInUse,
                                boolean notSupported) {
                        super();
                        this.taclet = taclet;
                        this.alreadyInUse = alreadyInUse;
                        this.notSupported = notSupported;
                        this.nameLowerCase = taclet.name().toString().toLowerCase();
                }

                @Override
                public String toString() {
                        return taclet.name().toString()+ (notSupported ? " (not supported)" : isAlreadyInUse() ? "(already in use)" : "");
                }

        }

        
        public TacletSoundnessPOLoader(
                        LoaderListener listener,
                        TacletFilter filter,
                        boolean loadAsLemmata,
                        TacletLoader loader,
                        InitConfig originalConfig,
                        boolean isOnlyUsedForProvingTaclets) {
                super();
                this.tacletLoader = loader;
                this.tacletFilter = filter;
                this.loadAsLemmata = loadAsLemmata;
                this.originalConfig = originalConfig;

                this.isOnlyUsedForProvingTaclets = isOnlyUsedForProvingTaclets;

                if (listener != null) {
                        listeners.add(listener);
                }
        }

        public void addListener(LoaderListener listener) {
                listeners.add(listener);
        }

        public void removeListener(LoaderListener listener) {
                listeners.remove(listener);
        }

        public void start() {
                for (LoaderListener listener : listeners) {
                        listener.started();
                }
                Thread thread = new Thread(new Working(),"TacletSoundnessPOLoader");
                thread.start();
        }
        
        public void startSynchronously() {
            for (LoaderListener listener : listeners) {
                    listener.started();
            }
            try {
                doWork();
            } catch (ProofInputException exception) {
                for (LoaderListener listener : listeners) {
                    listener.stopped(exception);
                }
            } finally {
                for (LoaderListener listener : listeners) {
                    listener.stopped(
                                    resultingProof,
                                    isUsedOnlyForProvingTaclets() ? 
                                    getResultingTaclets() : getResultingTacletsForOriginalProof(),
                                    !loadAsLemmata);
                }
            }
            
        }
        
        public ImmutableSet<Taclet> getResultingTacletsForOriginalProof() {
                return resultingTacletsForOriginalProof;
        }

        private class Working implements Runnable {
                @Override
                public void run() {
                        try {
                                doWork();
                        } catch (final Throwable exception) {
                           for (LoaderListener listener : listeners) {
                              listener.stopped(exception);
                           }
                        } finally {
                           for (LoaderListener listener : listeners) {
                              listener.stopped(
                                              resultingProof,
                                              isUsedOnlyForProvingTaclets() ?
                                              getResultingTaclets() : getResultingTacletsForOriginalProof(),
                                              !loadAsLemmata);
                           }
                        }
                }
        }



        private Vector<TacletInfo> createTacletInfo(
                        ImmutableList<Taclet> taclets, ImmutableSet<Taclet> base) {
                Vector<TacletInfo> collectionOfTacletInfo = new Vector<TacletInfo>();
                TreeSet<Taclet> treeSet = new TreeSet<Taclet>(
                                new Comparator<Taclet>() {
                                        @Override
                                        public int compare(Taclet o1, Taclet o2) {
                                                return o1.name()
                                                                .toString()
                                                                .compareTo(o2.name()
                                                                                .toString());
                                        }
                                });
                for (Taclet taclet : base) {
                        treeSet.add(taclet);
                }

                for (Taclet taclet : taclets) {
                        collectionOfTacletInfo
                                        .add(new TacletInfo(taclet, treeSet
                                                        .contains(taclet),
                                                        loadAsLemmata ? check(taclet) : false));
                }
                return collectionOfTacletInfo;
        }

        private boolean check(Taclet taclet) {
                return DefaultLemmaGenerator.checkTaclet(taclet) != null;
        }


        private void doWork() throws ProofInputException {
                // Axioms can only be loaded when the taclets are loaded as lemmata.
                ImmutableSet<Taclet> axioms = tacletLoader.loadAxioms();

                ImmutableList<Taclet> taclets = tacletLoader.loadTaclets();


                Vector<TacletInfo> collectionOfTacletInfo = createTacletInfo(
                                taclets, getAlreadyInUseTaclets());

                // filter the taclets that should be proved.
                computeResultingTaclets(collectionOfTacletInfo);

                if (getResultingTaclets().isEmpty()) {
                        return;
                }

                resultingProof = loadAsLemmata ? 
                        createProof(tacletLoader.getProofEnvForTaclets(), 
                                getResultingTaclets(),
                                axioms, taclets) : null;

        }


        private ImmutableSet<Taclet> computeCommonTaclets(
                        ImmutableList<Taclet> taclets, ImmutableSet<Taclet> reference) {
                TreeSet<Taclet> treeSet = new TreeSet<Taclet>(
                                new Comparator<Taclet>() {
                                        @Override
                                        public int compare(Taclet o1, Taclet o2) {
                                                return o1.name()
                                                                .toString()
                                                                .compareTo(o2.name()
                                                                                .toString());
                                        }
                                });
                for (Taclet taclet : reference) {
                        treeSet.add(taclet);
                }
                ImmutableSet<Taclet> result = DefaultImmutableSet.<Taclet>nil();

                for (Taclet taclet : taclets) {
                     if(treeSet.contains(taclet)){
                            result = result.add(taclet);
                     }
                }
                return result;
        }


        private void computeResultingTaclets(List<TacletInfo> collectionOfTacletInfo){
                resultingTaclets = tacletFilter.filter(collectionOfTacletInfo);
                if(!isUsedOnlyForProvingTaclets()){
                        assert tacletLoader instanceof TacletLoader.TacletFromFileLoader;
                        TacletLoader loader =
                                        new TacletLoader.TacletFromFileLoader((TacletLoader.TacletFromFileLoader)
                                                        tacletLoader,originalConfig.copy());
                        ImmutableList<Taclet> unfilteredResult = loader.loadTaclets();
                        resultingTacletsForOriginalProof = computeCommonTaclets(unfilteredResult, resultingTaclets);
                }

        }

        private ImmutableSet<Taclet> getAlreadyInUseTaclets() {
                return tacletLoader.getTacletsAlreadyInUse();
        }

        /**
         * @return returns <code>true</code> if and only if the taclets should be proved sound
         * and are not added to an already existing proof obligation. 
         */
        private boolean isUsedOnlyForProvingTaclets(){
                return isOnlyUsedForProvingTaclets;
        }

        private ProofAggregate createProof(ProofEnvironment proofEnvForTaclets,
                        ImmutableSet<Taclet> tacletsToProve,
                        ImmutableSet<Taclet> axioms, 
                        ImmutableList<Taclet> loadedTaclets) {


                ProofObligationCreator creator = new ProofObligationCreator();


                List<Taclet> tacletsToProveList = new ArrayList<Taclet>();
                for (Taclet taclet : tacletsToProve) {
                    tacletsToProveList.add(taclet);
                }

                InitConfig[] proofConfigs = new InitConfig[tacletsToProve.size()];
                for (int i = 0; i<proofConfigs.length; i++) {
                   proofConfigs[i] = originalConfig.deepCopy();
                   proofConfigs[i].registerRules(tacletsToProve, AxiomJustification.INSTANCE);

                   tacletLoader.manageAvailableTaclets(proofConfigs[i], tacletsToProveList.get(i));

                }
                
                ProofAggregate p = creator.create(tacletsToProve, proofConfigs, axioms, listeners);
                

                if(isUsedOnlyForProvingTaclets()){
                   for (InitConfig proofConfig : proofConfigs)
                        for(Taclet taclet : proofConfig.getTaclets()){
                           proofConfig.getJustifInfo().addJustification(taclet, AxiomJustification.INSTANCE);
                        }
                }

                registerProofs(p, proofEnvForTaclets);
                return p;
        }
        

        public void registerProofs(ProofAggregate aggregate,
                        ProofEnvironment proofEnv) {
            if (aggregate instanceof CompoundProof) {
                CompoundProof cp = (CompoundProof) aggregate;
                for (ProofAggregate child : cp.getChildren()) {
                    registerProofs(child, proofEnv);
                }
            } else {
                assert aggregate instanceof SingleProof;
                Proof proof = aggregate.getFirstProof();
                ProofOblInput keyFile = tacletLoader.getTacletFile(proof);
                proofEnv.registerProof(keyFile, aggregate);
            }
        }

        public ProofAggregate getResultingProof() {
                return resultingProof;
        }

        public ImmutableSet<Taclet> getResultingTaclets() {
                return resultingTaclets;
        }

}