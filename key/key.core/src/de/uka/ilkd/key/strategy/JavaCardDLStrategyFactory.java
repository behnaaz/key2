package de.uka.ilkd.key.strategy;

import de.uka.ilkd.key.logic.Name;
import de.uka.ilkd.key.proof.Proof;
import de.uka.ilkd.key.strategy.definition.AbstractStrategyPropertyDefinition;
import de.uka.ilkd.key.strategy.definition.OneOfStrategyPropertyDefinition;
import de.uka.ilkd.key.strategy.definition.StrategyPropertyValueDefinition;
import de.uka.ilkd.key.strategy.definition.StrategySettingsDefinition;
import de.uka.ilkd.key.strategy.feature.QueryExpandCost;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kai Wallisch <kai.wallisch@ira.uka.de>
 */
public class JavaCardDLStrategyFactory implements StrategyFactory {

    /**
     * The unique {@link Name} of this {@link StrategyFactory}.
     */
    public static final Name NAME = new Name(JavaCardDLStrategy.JavaCardDLStrategy);

    public static final String TOOL_TIP_STOP_AT_DEFAULT
            = "<html>Stop when (i) the maximum number of rule<br>"
            + "applications is reached or (ii) no more rules are<br>"
            + "applicable on the proof tree.</html>";
    public static final String TOOL_TIP_STOP_AT_UNCLOSABLE
            = "<html>Stop as soon as the first not automatically<br>"
            + "closable goal is encountered.</html>";
    public static final String TOOL_TIP_PROOF_SPLITTING_FREE = "<html>"
            + "Split formulas (if-then-else expressions,<br>"
            + "disjunctions in the antecedent, conjunctions in<br>"
            + "the succedent) freely without restrictions." + "</html>";
    public static final String TOOL_TIP_PROOF_SPLITTING_DELAYED = "<html>"
            + "Do not split formulas (if-then-else expressions,<br>"
            + "disjunctions in the antecedent, conjunctions in<br>"
            + "the succedent) as long as programs are present in<br>"
            + "the sequent.<br>"
            + "NB: This does not affect the splitting of formulas<br>"
            + "that themselves contain programs.<br>"
            + "NB2: Delaying splits often prevents KeY from finding<br>"
            + "short proofs, but in some cases it can significantly<br>"
            + "improve the performance." + "</html>";
    public static final String TOOL_TIP_PROOF_SPLITTING_OFF = "<html>"
            + "Do never split formulas (if-then-else expressions,<br>"
            + "disjunctions in the antecedent, conjunctions in<br>"
            + "the succedent).<br>"
            + "NB: This does not affect the splitting of formulas<br>"
            + "that contain programs.<br>"
            + "NB2: Without splitting, KeY is often unable to find<br>"
            + "proofs even for simple problems. This option can,<br>"
            + "nevertheless, be meaningful to keep the complexity<br>"
            + "of proofs small and support interactive proving."
            + "</html>";
    public static final String TOOL_TIP_LOOP_INVARIANT
            = "<html>"
            + "Use loop invariants for loops.<br>"
            + "Three properties have to be shown:<br>"
            + "<ul><li>Validity of invariant of a loop is preserved by the<br>"
            + "loop guard and loop body (initially valid).</li>"
            + "<li>If the invariant was valid at the start of the loop, it holds <br>"
            + "after arbitrarily many loop iterations (body preserves invariant).</li>"
            + "<li>Invariant holds after the loop terminates (use case).</li>"
            + "</ul></html>";
    public static final String TOOL_TIP_LOOP_EXPAND = "<html>"
            + "Unroll loop body." + "</html>";
    public static final String TOOL_TIP_LOOP_NONE = "<html>"
            + "Leave loops untouched." + "</html>";
    public static final String TOOL_TIP_BLOCK_CONTRACT
            = "<html>"
            + "If block contracts are specified, Java blocks are replaced by their contract.<br>"
            + "Three properties have to be shown:"
            + "<ul><li>Validity of block contract</li>"
            + "<li>Precondition of contract holds</li>"
            + "<li>Postcondition holds after block terminates</li>"
            + "</ul></html>";
    public static final String TOOL_TIP_BLOCK_EXPAND
            = "<html>"
            + "Do not use block contracts for Java blocks. Expand Java blocks."
            + "</html>";
    public static final String TOOL_TIP_METHOD_CONTRACT
            = "<html>Replace method calls by contracts. In some cases<br>"
            + "a method call may also be replaced by its method body.<br>"
            + "If query treatment is activated, this behavior applies<br>"
            + "to queries as well.</html>";
    public static final String TOOL_TIP_METHOD_EXPAND
            = "<html>Replace method calls by their bodies, i.e. by their<br>"
            + "implementation. Method contracts are strictly deactivated.</html>";
    public static final String TOOL_TIP_METHOD_NONE = "<html>"
            + "Stop when encountering a method" + "</html>";
    public static final String TOOL_TIP_CLASSAXIOM_FREE
            = "<html>Expand class axioms (such as invariants) freely.</html>";
    public static final String TOOL_TIP_CLASSAXIOM_DELAYED
            = "<html>Expand class axioms (such as invariants) only after symbolic execution.</html>";
    public static final String TOOL_TIP_CLASSAXIOM_OFF
            = "<html>Do not expand class axioms (such as invariants).</html>";
    public static final String TOOL_TIP_DEPENDENCY_ON
            = "<html>Uses the information in JML's <tt>accessible</tt> clauses<br>"
            + "in order to simplify heap terms. For instance, consider the term<br>"
            + "<center><i>f(store(heap,o,a,1))</i></center>"
            + "If <i>f</i> does not depend on the location <i>(o,a)</i>, which is<br>"
            + "expressed by an <tt>accessible</tt> clause, then the term can be <br>"
            + "simplified to <i>f(heap)</i>.</html>";
    public static final String TOOL_TIP_DEPENDENCY_OFF
            = "<html>Does <i>not</i> use the framing information contained in JML's <br>"
            + "<tt>accessible</tt> clauses automatically in order to simplify heap terms.<br>"
            + "This prevents the automatic proof search to find proofs for a number of problems.<br>"
            + "On the other hand, the automatic proof search does not use a particular order in<br>"
            + "which <tt>accessible</tt> clauses are used. Since the usage of an <tt>accessible</tt><br>"
            + "clause is splitting, this might result in huge (or even infeasible) proofs.</html>";
    public static final String TOOL_TIP_QUERY_ON
            = "<html>Rewrite query to a method call so that contracts or inlining<br>"
            + "can be used. A query is a method that is used as a function <br>"
            + "in the logic and stems from the specification.<br><br>"
            + "Whether contracts or inlining are used depends on the <br>"
            + "Method Treatment settings.</html>";
    public static final String TOOL_TIP_QUERY_RESTRICTED
            = "<html>Rewrite query to a method call (expanded) so that contracts or inlining can be used.<br>"
            + "<ul><li> Priority of expanding queries occuring earlier on a branch is higher than<br>"
            + " for queries introduced more recently. This approximates in a breath-first search<br>"
            + " with respect to query expansion.</li>"
            + "<li> Reexpansion of identical query terms is suppressed.</li>"
            + "<li> A query is not expanded if one of its arguments contains a literal greater<br>"
            + " than "
            + QueryExpandCost.ConsideredAsBigLiteral
            + ", or smaller than "
            + (-QueryExpandCost.ConsideredAsBigLiteral)
            + ". This helps detecting loops in a proof.</li>"
            + "<li> Queries are expanded after the loop body in the \"Preserves Invariant\"<br>"
            + " branch of the loop invariant rule.</li>"
            + "<li> Queries are expanded in the Base Case and the conclusio of the Step Case <br>"
            + " branch when using Auto Induction.</li>"
            + "</ul></html>";
    public static final String TOOL_TIP_QUERY_OFF = "<html>"
            + "Turn rewriting of query off." + "</html>";
    public static final String TOOL_TIP_EXPAND_LOCAL_QUERIES_ON
            = "<html>Replaces queries by their method body in certain safe cases.<br>"
            + "Safe cases are:"
            + "<ul><li>the return type of the expanded method is known</li>"
            + "<li>the object on which the methodcall is invoked, is self or a parent of self</li></ul>"
            + "This mechanism works independently of the query treatment <br>"
            + "and method treatment settings above.<br>"
            + "<i>The internal rule name is Query Axiom</i></html>";
    public static final String TOOL_TIP_EXPAND_LOCAL_QUERIES_OFF = "<html>"
            + "Expansion of local queries is turned off. <br>"
            + "This setting is independent of the query treatment setting."
            + "</html>";
    public static final String TOOL_TIP_ARITHMETIC_BASE
            = "<html>"
            + "Basic arithmetic support:"
            + "<ul>"
            + "<li>Simplification of polynomial expressions</li>"
            + "<li>Computation of Gr&ouml;bner Bases for polynomials in the antecedent</li>"
            + "<li>(Partial) Omega procedure for handling linear inequations</li>"
            + "</ul>" + "</html>";
    public static final String TOOL_TIP_ARITHMETIC_DEF_OPS
            = "<html>"
            + "Automatically expand defined symbols like:"
            + "<ul>"
            + "<li><tt>/</tt>, <tt>%</tt>, <tt>jdiv</tt>, <tt>jmod</tt>, ...</li>"
            + "<li><tt>int_RANGE</tt>, <tt>short_MIN</tt>, ...</li>"
            + "<li><tt>inInt</tt>, <tt>inByte</tt>, ...</li>"
            + "<li><tt>addJint</tt>, <tt>mulJshort</tt>, ...</li>"
            + "</ul>" + "</html>";
    public static final String TOOL_TIP_ARITHMETIC_MODEL_SEARCH
            = "<html>"
            + "Support for non-linear inequations and model search.<br>"
            + "In addition, this performs:"
            + "<ul>"
            + "<li>Multiplication of inequations with each other</li>"
            + "<li>Systematic case distinctions (cuts)</li>"
            + "</ul>"
            + "This method is guaranteed to find counterexamples for<br>"
            + "invalid goals that only contain polynomial (in)equations.<br>"
            + "Such counterexamples turn up as trivially unprovable goals.<br>"
            + "It is also able to prove many more valid goals involving<br>"
            + "(in)equations, but will in general not terminate on such goals."
            + "</html>";
    public static final String TOOL_TIP_QUANTIFIER_NONE = "<html>"
            + "Do not instantiate quantified formulas automatically"
            + "</html>";
    public static final String TOOL_TIP_QUANTIFIER_NO_SPLITS
            = "<html>"
            + "Instantiate quantified formulas automatically<br>"
            + "with terms that occur in a sequent, but only if<br>"
            + "this does not cause proof splitting. Further, quantified<br>"
            + "formulas that contain queries are not instantiated<br>"
            + "automatically." + "</html>";
    public static final String TOOL_TIP_QUANTIFIER_NO_SPLITS_WITH_PROGS
            = "<html>"
            + "Instantiate quantified formulas automatically<br>"
            + "with terms that occur in a sequent, but if the<br>"
            + "sequent contains programs then only perform<br>"
            + "instantiations that do not cause proof splitting.<br>"
            + "Further, quantified formulas that contain queries<br>"
            + "are not instantiated automatically." + "</html>";
    public static final String TOOL_TIP_QUANTIFIER_FREE = "<html>"
            + "Instantiate quantified formulas automatically<br>"
            + "with terms that occur in a sequent, also if this<br>"
            + "might cause proof splitting." + "</html>";
    public static final String TOOL_TIP_AUTO_INDUCTION_ON = "<html>"
            + "Create an inductive proof for formulas of the form:<br>"
            + "      ==>  \\forall int i; 0&lt;=i->phi <br>"
            + "and certain other forms. The induction hypothesis<br>"
            + "is the subformula phi. The rule is applied before<br>"
            + "beta rules are applied.<br>" + "<br>"
            + "When encountering a formula of the form<br>"
            + "      ==>  (\\forall int i; 0&lt;=i->phi) & psi <br>"
            + "and certain similar forms, then the quantified formula<br>"
            + "is used in the Use Case branch as a lemma for psi,<br>"
            + "i.e., the sequent in the Use Case has the form:<br>"
            + "      (\\forall int i; 0&lt;=i->phi) ==>  psi <br>"
            + "</html>";
    public static final String TOOL_TIP_AUTO_INDUCTION_RESTRICTED
            = "<html>"
            + "Performs auto induction only on quantified formulas that<br>"
            + "(a) fullfill a certain pattern (as described for the \"on\"option)<br>"
            + "and (b) whose quantified variable has the suffix \"Ind\" or \"IND\".<br>"
            + "For instance, auto induction will be applied on:<br>"
            + "      ==>  \\forall int iIND; 0&lt;=iIND->phi <br>"
            + "but not on: <br>"
            + "      ==>  \\forall int i; 0&lt;=i->phi <br>"
            + "</html>";
    public static final String TOOL_TIP_AUTO_INDUCTION_OFF = "<html>"
            + "Deactivates automatic creation of inductive proofs.<br>"
            + "In order to make use of auto induction, activate <br>"
            + "auto induction early in proofs before the <br>"
            + "quantified formula that is to be proven inductively<br>"
            + "is Skolemized (using the delta rule). Auto induction<br>"
            + "is not applied on Skolemized formulas in order to<br>"
            + "limit the number of inductive proofs." + "</html>";

    public static String TOOL_TIP_USER_OFF(int i) {
        return "Taclets of the rule set \"userTaclets" + i
                + "\" are not applied automatically";
    }

    public static String TOOL_TIP_USER_LOW(int i) {
        return "Taclets of the rule set \"userTaclets" + i
                + "\" are applied automatically with low priority";
    }

    public static String TOOL_TIP_USER_HIGH(int i) {
        return "Taclets of the rule set \"userTaclets" + i
                + "\" are applied automatically with high priority";
    }

    public JavaCardDLStrategyFactory() {
    }

    public Strategy create(Proof p_proof,
            StrategyProperties strategyProperties) {
        return new JavaCardDLStrategy(p_proof, strategyProperties);
    }

    @Override
    public Name name() {
        return NAME;
    }

    @Override
    public StrategySettingsDefinition getSettingsDefinition() {
        // Properties
        OneOfStrategyPropertyDefinition stopAt
                = new OneOfStrategyPropertyDefinition(
                        StrategyProperties.STOPMODE_OPTIONS_KEY, "Stop at",
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.STOPMODE_DEFAULT,
                                "Default", TOOL_TIP_STOP_AT_DEFAULT),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.STOPMODE_NONCLOSE,
                                "Unclosable", TOOL_TIP_STOP_AT_UNCLOSABLE));
        OneOfStrategyPropertyDefinition proofSplitting
                = new OneOfStrategyPropertyDefinition(
                        StrategyProperties.SPLITTING_OPTIONS_KEY,
                        "Proof splitting",
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.SPLITTING_NORMAL,
                                "Free", TOOL_TIP_PROOF_SPLITTING_FREE),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.SPLITTING_DELAYED,
                                "Delayed", TOOL_TIP_PROOF_SPLITTING_DELAYED),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.SPLITTING_OFF, "Off",
                                TOOL_TIP_PROOF_SPLITTING_OFF));
        OneOfStrategyPropertyDefinition loopTreatment
                = new OneOfStrategyPropertyDefinition(
                        StrategyProperties.LOOP_OPTIONS_KEY,
                        "Loop treatment",
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.LOOP_INVARIANT,
                                "Invariant", TOOL_TIP_LOOP_INVARIANT),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.LOOP_EXPAND, "Expand",
                                TOOL_TIP_LOOP_EXPAND),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.LOOP_NONE, "None",
                                TOOL_TIP_LOOP_NONE));
        OneOfStrategyPropertyDefinition blockTreatment
                = new OneOfStrategyPropertyDefinition(
                        StrategyProperties.BLOCK_OPTIONS_KEY,
                        "Block treatment",
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.BLOCK_CONTRACT,
                                "Contract", TOOL_TIP_BLOCK_CONTRACT),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.BLOCK_EXPAND, "Expand",
                                TOOL_TIP_BLOCK_EXPAND));
        OneOfStrategyPropertyDefinition methodTreatment
                = new OneOfStrategyPropertyDefinition(
                        StrategyProperties.METHOD_OPTIONS_KEY,
                        "Method treatment",
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.METHOD_CONTRACT,
                                "Contract", TOOL_TIP_METHOD_CONTRACT),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.METHOD_EXPAND, "Expand",
                                TOOL_TIP_METHOD_EXPAND),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.METHOD_NONE, "None",
                                TOOL_TIP_METHOD_NONE));
        OneOfStrategyPropertyDefinition dependencyContracts
                = new OneOfStrategyPropertyDefinition(
                        StrategyProperties.DEP_OPTIONS_KEY,
                        "Dependency contracts",
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.DEP_ON, "On",
                                TOOL_TIP_DEPENDENCY_ON),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.DEP_OFF, "Off",
                                TOOL_TIP_DEPENDENCY_OFF));
        OneOfStrategyPropertyDefinition expandLocalQueries
                = new OneOfStrategyPropertyDefinition(
                        StrategyProperties.QUERYAXIOM_OPTIONS_KEY,
                        "Expand local queries:",
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.QUERYAXIOM_ON, "On",
                                TOOL_TIP_EXPAND_LOCAL_QUERIES_ON),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.QUERYAXIOM_OFF, "Off",
                                TOOL_TIP_EXPAND_LOCAL_QUERIES_OFF));
        OneOfStrategyPropertyDefinition queryTreatment
                = new OneOfStrategyPropertyDefinition(
                        StrategyProperties.QUERY_OPTIONS_KEY,
                        "Query treatment",
                        new AbstractStrategyPropertyDefinition[]{expandLocalQueries},
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.QUERY_ON, "On",
                                TOOL_TIP_QUERY_ON),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.QUERY_RESTRICTED,
                                "Restricted", TOOL_TIP_QUERY_RESTRICTED),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.QUERY_OFF, "Off",
                                TOOL_TIP_QUERY_OFF));
        OneOfStrategyPropertyDefinition arithmeticTreatment
                = new OneOfStrategyPropertyDefinition(
                        StrategyProperties.NON_LIN_ARITH_OPTIONS_KEY,
                        "Arithmetic treatment",
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.NON_LIN_ARITH_NONE,
                                "Basic", TOOL_TIP_ARITHMETIC_BASE),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.NON_LIN_ARITH_DEF_OPS,
                                "DefOps", TOOL_TIP_ARITHMETIC_DEF_OPS),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.NON_LIN_ARITH_COMPLETION,
                                "Model Search",
                                TOOL_TIP_ARITHMETIC_MODEL_SEARCH));
        OneOfStrategyPropertyDefinition quantifierTreatment
                = new OneOfStrategyPropertyDefinition(
                        StrategyProperties.QUANTIFIERS_OPTIONS_KEY,
                        "Quantifier treatment",
                        2,
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.QUANTIFIERS_NONE,
                                "None", TOOL_TIP_QUANTIFIER_NONE, 2, 4),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.QUANTIFIERS_NON_SPLITTING,
                                "No Splits", TOOL_TIP_QUANTIFIER_NO_SPLITS,
                                6, 2),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.QUANTIFIERS_NON_SPLITTING_WITH_PROGS,
                                "No Splits with Progs",
                                TOOL_TIP_QUANTIFIER_NO_SPLITS_WITH_PROGS,
                                2, 4), new StrategyPropertyValueDefinition(
                                StrategyProperties.QUANTIFIERS_INSTANTIATE,
                                "Free", TOOL_TIP_QUANTIFIER_FREE, 6, 2));
        OneOfStrategyPropertyDefinition classAxiom
                = new OneOfStrategyPropertyDefinition(
                        StrategyProperties.CLASS_AXIOM_OPTIONS_KEY,
                        "Class axiom rule",
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.CLASS_AXIOM_FREE,
                                "Free", TOOL_TIP_CLASSAXIOM_FREE),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.CLASS_AXIOM_DELAYED,
                                "Delayed", TOOL_TIP_CLASSAXIOM_DELAYED),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.CLASS_AXIOM_OFF, "Off",
                                TOOL_TIP_CLASSAXIOM_OFF));
        OneOfStrategyPropertyDefinition autoInduction
                = new OneOfStrategyPropertyDefinition(
                        StrategyProperties.AUTO_INDUCTION_OPTIONS_KEY,
                        "Auto Induction",
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.AUTO_INDUCTION_LEMMA_ON,
                                "On", TOOL_TIP_AUTO_INDUCTION_ON),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.AUTO_INDUCTION_RESTRICTED,
                                "Restricted",
                                TOOL_TIP_AUTO_INDUCTION_RESTRICTED),
                        new StrategyPropertyValueDefinition(
                                StrategyProperties.AUTO_INDUCTION_OFF,
                                "Off", TOOL_TIP_AUTO_INDUCTION_OFF));
        // User properties
        List<AbstractStrategyPropertyDefinition> props
                = new LinkedList<>();
        for (int i = 1; i <= StrategyProperties.USER_TACLETS_NUM; ++i) {
            OneOfStrategyPropertyDefinition user
                    = new OneOfStrategyPropertyDefinition(
                            StrategyProperties.USER_TACLETS_OPTIONS_KEY(i),
                            i + ":  ", new StrategyPropertyValueDefinition(
                                    StrategyProperties.USER_TACLETS_OFF,
                                    "Off", TOOL_TIP_USER_OFF(i), 3, 1),
                            new StrategyPropertyValueDefinition(
                                    StrategyProperties.USER_TACLETS_LOW,
                                    "Low prior.", TOOL_TIP_USER_LOW(i), 4,
                                    2),
                            new StrategyPropertyValueDefinition(
                                    StrategyProperties.USER_TACLETS_HIGH,
                                    "High prior.", TOOL_TIP_USER_HIGH(i),
                                    6, 2));
            props.add(user);
        }

        OneOfStrategyPropertyDefinition userOptions
                = new OneOfStrategyPropertyDefinition(
                        null,
                        "User-specific taclet sets",
                        "<html>"
                        + "These options define whether user- and problem-specific taclet sets<br>"
                        + "are applied automatically by the strategy. Problem-specific taclets<br>"
                        + "can be defined in the \\rules-section of a .key-problem file. For<br>"
                        + "automatic application, the taclets have to contain a clause<br>"
                        + "\\heuristics(userTaclets1), \\heuristics(userTaclets2), etc."
                        + "</html>",
                        -1,
                        props.toArray(new AbstractStrategyPropertyDefinition[props
                                .size()]));
        // Model
        return new StrategySettingsDefinition("Java DL Options", stopAt,
                proofSplitting, loopTreatment, blockTreatment,
                methodTreatment, dependencyContracts, queryTreatment,
                arithmeticTreatment, quantifierTreatment, classAxiom,
                autoInduction, userOptions);
    }
}
