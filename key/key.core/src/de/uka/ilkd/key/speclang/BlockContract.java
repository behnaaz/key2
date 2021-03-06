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

package de.uka.ilkd.key.speclang;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.key_project.util.collection.ImmutableList;
import org.key_project.util.collection.ImmutableSet;

import de.uka.ilkd.key.java.Label;
import de.uka.ilkd.key.java.Services;
import de.uka.ilkd.key.java.StatementBlock;
import de.uka.ilkd.key.java.abstraction.KeYJavaType;
import de.uka.ilkd.key.java.statement.Break;
import de.uka.ilkd.key.java.statement.Continue;
import de.uka.ilkd.key.java.statement.LabelJumpStatement;
import de.uka.ilkd.key.java.visitor.OuterBreakContinueAndReturnCollector;
import de.uka.ilkd.key.java.visitor.Visitor;
import de.uka.ilkd.key.logic.ProgramElementName;
import de.uka.ilkd.key.logic.Term;
import de.uka.ilkd.key.logic.TermBuilder;
import de.uka.ilkd.key.logic.TermServices;
import de.uka.ilkd.key.logic.op.IObserverFunction;
import de.uka.ilkd.key.logic.op.IProgramMethod;
import de.uka.ilkd.key.logic.op.LocationVariable;
import de.uka.ilkd.key.logic.op.Modality;
import de.uka.ilkd.key.logic.op.ProgramVariable;
import de.uka.ilkd.key.rule.join.JoinProcedure;
import de.uka.ilkd.key.speclang.Contract.OriginalVariables;
import de.uka.ilkd.key.util.InfFlowSpec;
import de.uka.ilkd.key.util.MiscTools;

public interface BlockContract extends SpecificationElement {

    public StatementBlock getBlock();
    public List<Label> getLabels();
    public IProgramMethod getMethod();
    public Modality getModality();
    public Variables getPlaceholderVariables();
    public boolean isTransactionApplicable();
    public boolean isReadOnly(Services services);
    
    /**
     * Returns <code>true</code> iff the method (according to the contract) does
     * not modify the heap at all, i.e., iff it is "strictly pure."
     * 
     * @return whether this contract is strictly pure.
     */
    public boolean hasModifiesClause(LocationVariable heap);

    // TODO Why do we need remembranceHeaps for the precondition? Do we also need remembranceLocalVariables?
    public Term getPrecondition(LocationVariable heap,
                                ProgramVariable self,
                                Map<LocationVariable, LocationVariable> remembranceHeaps,
                                Services services);
    public Term getPrecondition(LocationVariable heapVariable,
                                Term heap,
                                Term self,
                                Map<LocationVariable, Term> remembranceHeaps,
                                Services services);
    public Term getPrecondition(LocationVariable heap, Services services);

    public Term getPostcondition(LocationVariable heap, Variables variables, Services services);
    public Term getPostcondition(LocationVariable heapVariable, Term heap,
                                 Terms terms, Services services);
    public Term getPostcondition(LocationVariable heap, Services services);

    public Term getModifiesClause(LocationVariable heap, ProgramVariable self, Services services);
    public Term getModifiesClause(LocationVariable heapVariable, Term heap,
                                  Term self, Services services);
    public Term getModifiesClause(LocationVariable heap, Services services);

    public Term getRequires(LocationVariable heap);

    public Term getEnsures(LocationVariable heap);

    public Term getAssignable(LocationVariable heap);
    
    public JoinProcedure getJoinProcedure();

    public void visit(Visitor visitor);

    public String getUniqueName();

    public String getHtmlText(Services services);

    public String getPlainText(Services services, Terms terms);

    // TODO Find better name: Creates a new block contract with the given changes.
    public BlockContract update(StatementBlock newBlock,
                                Map<LocationVariable,Term> newPreconditions,
                                Map<LocationVariable,Term> newPostconditions,
                                Map<LocationVariable,Term> newModifiesClauses,
                                final ImmutableList<InfFlowSpec> newInfFlowSpecs,
                                final JoinProcedure newJoinProcedure,
                                Variables newVariables);

    public BlockContract setBlock(StatementBlock newBlock);

    /**
     * Returns the method in which the block is located.
     */
    public IProgramMethod getTarget();


    /**
     * Tells whether the contract contains a measured_by clause.
     */
    public boolean hasMby();


    public boolean hasInfFlowSpecs();
    
    /**
     * @return True iff a join procedure has been specified for this block contract.
     */
    public boolean hasJoinProcedure();


    public void setInstantiationSelf(Term selfInstantiation);


    /**
     * Returns the term internally used for self or a newly instantiated one.
     * Use with care - it is likely that this is *not* the right "self" for you.
     */
    public Term getInstantiationSelfTerm(TermServices services);


    /**
     * Returns the original precondition of the contract.
     */
    Term getPre(Services services);


    /**
     * Returns the original postcondition of the contract.
     */
    Term getPost(Services services);


    /**
     * Returns the original modifies clause of the contract.
     */
    Term getMod(Services services);


    /**
     * Returns the original information flow specification clause of the contract.
     */
    public ImmutableList<InfFlowSpec> getInfFlowSpecs();


    /**
     * Returns the original used variables like self, result etc..
     */
    public Variables getVariables();


    /**
     * Returns the original used variables like self, result etc. as terms.
     */
    public Terms getVariablesAsTerms(Services services);

    public BlockContract setTarget(KeYJavaType newKJT, IObserverFunction newPM);

    public OriginalVariables getOrigVars();

    public static class Variables {
        private final TermServices services;

        public static Variables create(final StatementBlock block,
                                       final List<Label> labels,
                                       final IProgramMethod method,
                                       final Services services) {
            return new VariablesCreator(block, labels, method, services).create();
        }

        public final ProgramVariable self;
        public final Map<Label, ProgramVariable> breakFlags;
        public final Map<Label, ProgramVariable> continueFlags;
        public final ProgramVariable returnFlag;
        public final ProgramVariable result;
        public final ProgramVariable exception;
        public final Map<LocationVariable, LocationVariable> remembranceHeaps;
        public final Map<LocationVariable, LocationVariable> remembranceLocalVariables;

        public Variables(final ProgramVariable self,
                         final Map<Label, ProgramVariable> breakFlags,
                         final Map<Label, ProgramVariable> continueFlags,
                         final ProgramVariable returnFlag,
                         final ProgramVariable result,
                         final ProgramVariable exception,
                         final Map<LocationVariable, LocationVariable> remembranceHeaps,
                         final Map<LocationVariable, LocationVariable> remembranceLocalVariables,
                         final TermServices services)
        {
            this.services = services;
            this.self = self;
            this.breakFlags = breakFlags;
            this.continueFlags = continueFlags;
            this.returnFlag = returnFlag;
            this.result = result;
            this.exception = exception;
            this.remembranceHeaps = remembranceHeaps;
            this.remembranceLocalVariables = remembranceLocalVariables;
        }

        public Map<LocationVariable, LocationVariable> combineRemembranceVariables()
        {
            final Map<LocationVariable, LocationVariable> result =
                    new LinkedHashMap<LocationVariable, LocationVariable>();
            result.putAll(remembranceHeaps);
            result.putAll(remembranceLocalVariables);
            return result;
        }

        public Terms termify(Term self)
        {
            return new BlockContract.Terms(
                self,
                termifyFlags(breakFlags),
                termifyFlags(continueFlags),
                termifyVariable(returnFlag),
                termifyVariable(result),
                termifyVariable(exception),
                termifyRemembranceVariables(remembranceHeaps),
                termifyRemembranceVariables(remembranceLocalVariables)
            );
        }

        private Map<Label, Term> termifyFlags(final Map<Label, ProgramVariable> flags)
        {
            final Map<Label, Term> result = new LinkedHashMap<Label, Term>();
            for (Map.Entry<Label, ProgramVariable> flag : flags.entrySet()) {
                result.put(flag.getKey(), termifyVariable(flag.getValue()));
            }
            return result;
        }

        private Map<LocationVariable, Term> termifyRemembranceVariables(
                    final Map<LocationVariable, LocationVariable> remembranceVariables) {
            final Map<LocationVariable, Term> result = new LinkedHashMap<LocationVariable, Term>();
            for (Map.Entry<LocationVariable, LocationVariable> remembranceVariable
                    : remembranceVariables.entrySet()) {
                result.put(remembranceVariable.getKey(),
                           termifyVariable(remembranceVariable.getValue()));
            }
            return result;
        }

        private Term termifyVariable(final ProgramVariable variable)
        {
            if (variable != null) {
                return services.getTermBuilder().var(variable);
            }
            else {
                return null;
            }
        }

        /* (non-Javadoc)
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result
                    + ((breakFlags == null) ? 0 : breakFlags.hashCode());
            result = prime * result
                    + ((continueFlags == null) ? 0 : continueFlags.hashCode());
            result = prime * result
                    + ((exception == null) ? 0 : exception.hashCode());
            result = prime
                    * result
                    + ((remembranceHeaps == null) ? 0 : remembranceHeaps
                            .hashCode());
            result = prime
                    * result
                    + ((remembranceLocalVariables == null) ? 0
                            : remembranceLocalVariables.hashCode());
            result = prime * result
                    + ((this.result == null) ? 0 : this.result.hashCode());
            result = prime * result
                    + ((returnFlag == null) ? 0 : returnFlag.hashCode());
            result = prime * result + ((self == null) ? 0 : self.hashCode());
            return result;
        }

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Variables other = (Variables) obj;
            if (breakFlags == null) {
                if (other.breakFlags != null)
                    return false;
            }
            else if (!breakFlags.equals(other.breakFlags))
                return false;
            if (continueFlags == null) {
                if (other.continueFlags != null)
                    return false;
            }
            else if (!continueFlags.equals(other.continueFlags))
                return false;
            if (exception == null) {
                if (other.exception != null)
                    return false;
            }
            else if (!exception.equals(other.exception))
                return false;
            if (remembranceHeaps == null) {
                if (other.remembranceHeaps != null)
                    return false;
            }
            else if (!remembranceHeaps.equals(other.remembranceHeaps))
                return false;
            if (remembranceLocalVariables == null) {
                if (other.remembranceLocalVariables != null)
                    return false;
            }
            else if (!remembranceLocalVariables
                    .equals(other.remembranceLocalVariables))
                return false;
            if (result == null) {
                if (other.result != null)
                    return false;
            }
            else if (!result.equals(other.result))
                return false;
            if (returnFlag == null) {
                if (other.returnFlag != null)
                    return false;
            }
            else if (!returnFlag.equals(other.returnFlag))
                return false;
            if (self == null) {
                if (other.self != null)
                    return false;
            }
            else if (!self.equals(other.self))
                return false;
            return true;
        }

    }

    public static class VariablesCreator extends TermBuilder {

        private static final String BREAK_FLAG_BASE_NAME = "broke";
        private static final String CONTINUE_FLAG_BASE_NAME = "continued";
        private static final String RETURN_FLAG_NAME = "returned";
        private static final String FLAG_INFIX = "To";
        private static final String REMEMBRANCE_SUFFIX = "Before_BLOCK";

        private final StatementBlock block;
        private final List<Label> labels;
        private final IProgramMethod method;
        private Map<Label, ProgramVariable> breakFlags;
        private Map<Label, ProgramVariable> continueFlags;
        private ProgramVariable returnFlag;

        public VariablesCreator(final StatementBlock block, final List<Label> labels,
                                final IProgramMethod method, final Services services) {
            super(services.getTermFactory(), services);
            this.block = block;
            this.labels = labels;
            this.method = method;
        }

        public Variables create()
        {
            createAndStoreFlags();
            return new Variables(
                selfVar(method, method.getContainerType(), false),
                breakFlags,
                continueFlags,
                returnFlag,
                resultVar(method, false),
                excVar(method, false),
                createRemembranceHeaps(),
                createRemembranceLocalVariables(),
                services
            );
        }

        private void createAndStoreFlags() {
            final OuterBreakContinueAndReturnCollector collector =
                    new OuterBreakContinueAndReturnCollector(block, labels, services);
            collector.collect();

            final List<Break> breaks = collector.getBreaks();
            final List<Continue> continues = collector.getContinues();
            final boolean returnOccurred = collector.hasReturns();

            final Set<Label> breakLabels = collectLabels(breaks);
            final Set<Label> continueLabels = collectLabels(continues);

            breakFlags = createFlags(breakLabels, BREAK_FLAG_BASE_NAME);
            continueFlags = createFlags(continueLabels, CONTINUE_FLAG_BASE_NAME);
            returnFlag = returnOccurred ? createFlag(RETURN_FLAG_NAME) : null;
        }

        private Set<Label> collectLabels(final List<? extends LabelJumpStatement> jumps) {
            final Set<Label> result = new LinkedHashSet<Label>();
            for (LabelJumpStatement jump : jumps) {
                result.add(jump.getLabel());
            }
            return result;
        }

        private Map<Label, ProgramVariable> createFlags(final Set<Label> labels,
                                                        final String baseName) {
            final Map<Label, ProgramVariable> result = new LinkedHashMap<Label, ProgramVariable>();
            for (Label label : labels) {
                final String suffix = label == null ? "" : FLAG_INFIX + label;
                result.put(label, createFlag(baseName + suffix));
            }
            return result;
        }

        private ProgramVariable createFlag(final String name)
        {
            return createVariable(name, services.getJavaInfo().getKeYJavaType("boolean"));
        }

        private Map<LocationVariable, LocationVariable> createRemembranceHeaps()
        {
            final Map<LocationVariable, LocationVariable> result =
                    new LinkedHashMap<LocationVariable, LocationVariable>();
            for (LocationVariable heap : services.getTypeConverter().getHeapLDT().getAllHeaps()) {
                result.put(heap, heapAtPreVar(heap + "_" + REMEMBRANCE_SUFFIX, heap.sort(), false));
            }
            return result;
        }

        private Map<LocationVariable, LocationVariable> createRemembranceLocalVariables()
        {
            Map<LocationVariable, LocationVariable> result =
                    new LinkedHashMap<LocationVariable, LocationVariable>();
            ImmutableSet<ProgramVariable> localOutVariables =
                    MiscTools.getLocalOuts(block, services);
            for (ProgramVariable localOutVariable : localOutVariables) {
                result.put(
                    (LocationVariable) localOutVariable,
                    createVariable(localOutVariable.name() + "_" + REMEMBRANCE_SUFFIX,
                                   localOutVariable.getKeYJavaType())
                );
            }
            return result;
        }

        private LocationVariable createVariable(final String name, final KeYJavaType type) {
            return new LocationVariable(new ProgramElementName(name), type);
        }

    }

    public static class Terms {

        public final Term self;
        public final Map<Label, Term> breakFlags;
        public final Map<Label, Term> continueFlags;
        public final Term returnFlag;
        public final Term result;
        public final Term exception;
        public final Map<LocationVariable, Term> remembranceHeaps;
        public final Map<LocationVariable, Term> remembranceLocalVariables;

        public Terms(final Term self,
                     final Map<Label, Term> breakFlags,
                     final Map<Label, Term> continueFlags,
                     final Term returnFlag,
                     final Term result,
                     final Term exception,
                     final Map<LocationVariable, Term> remembranceHeaps,
                     final Map<LocationVariable, Term> remembranceLocalVariables)
        {
            this.self = self;
            this.breakFlags = breakFlags;
            this.continueFlags = continueFlags;
            this.returnFlag = returnFlag;
            this.result= result;
            this.exception= exception;
            this.remembranceHeaps = remembranceHeaps;
            this.remembranceLocalVariables = remembranceLocalVariables;
        }

    }

}