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

package de.uka.ilkd.key.rule.label;

import java.util.Set;

import org.key_project.util.collection.ImmutableArray;
import org.key_project.util.collection.ImmutableList;
import org.key_project.util.collection.ImmutableSLList;
import org.key_project.util.java.CollectionUtil;
import org.key_project.util.java.IFilter;
import org.key_project.util.java.StringUtil;

import de.uka.ilkd.key.java.Services;
import de.uka.ilkd.key.logic.JavaBlock;
import de.uka.ilkd.key.logic.Name;
import de.uka.ilkd.key.logic.PosInOccurrence;
import de.uka.ilkd.key.logic.Term;
import de.uka.ilkd.key.logic.label.SymbolicExecutionTermLabel;
import de.uka.ilkd.key.logic.label.TermLabel;
import de.uka.ilkd.key.logic.label.TermLabelState;
import de.uka.ilkd.key.logic.op.Operator;
import de.uka.ilkd.key.logic.op.QuantifiableVariable;
import de.uka.ilkd.key.proof.Goal;
import de.uka.ilkd.key.rule.BlockContractRule;
import de.uka.ilkd.key.rule.Rule;
import de.uka.ilkd.key.rule.RuleApp;
import de.uka.ilkd.key.rule.WhileInvariantRule;

/**
 * Makes sure that the ID of {@link SymbolicExecutionTermLabel}s is increased
 * when a {@link WhileInvariantRule} is applied.
 * @author Martin Hentschel
 */
public class SymbolicExecutionTermLabelUpdate implements TermLabelUpdate {
   /**
    * {@inheritDoc}
    */
   @Override
   public ImmutableList<Name> getSupportedRuleNames() {
      return ImmutableSLList.<Name>nil()
                            .prepend(WhileInvariantRule.INSTANCE.name())
                            .prepend(BlockContractRule.INSTANCE.name());
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public void updateLabels(TermLabelState state,
                            Services services,
                            PosInOccurrence applicationPosInOccurrence,
                            Term applicationTerm,
                            Term modalityTerm,
                            Rule rule,
                            RuleApp ruleApp,
                            Goal goal,
                            Object hint,
                            Term tacletTerm,
                            Operator newTermOp,
                            ImmutableArray<Term> newTermSubs,
                            ImmutableArray<QuantifiableVariable> newTermBoundVars,
                            JavaBlock newTermJavaBlock,
                            Set<TermLabel> labels) {
      if (rule instanceof WhileInvariantRule && "LoopBodyModality".equals(hint) ||
          rule instanceof BlockContractRule && StringUtil.startsWith(hint, "ValidityModality: exceptionVar=")) {
         TermLabel label = CollectionUtil.searchAndRemove(labels, new IFilter<TermLabel>() {
            @Override
            public boolean select(TermLabel element) {
               return element instanceof SymbolicExecutionTermLabel;
            }
         });
         if (label instanceof SymbolicExecutionTermLabel) {
            int labelID = services.getCounter(SymbolicExecutionTermLabel.PROOF_COUNTER_NAME).getCountPlusPlus();
            labels.add(new SymbolicExecutionTermLabel(labelID));
         }
      }
   }
}