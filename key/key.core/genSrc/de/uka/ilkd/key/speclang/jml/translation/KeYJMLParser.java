// $ANTLR 3.5.2 /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g 2017-04-13 18:24:18

    package de.uka.ilkd.key.speclang.jml.translation;

    import java.io.StringReader;

    import org.key_project.util.collection.*;
    import de.uka.ilkd.key.java.JavaInfo;
    import de.uka.ilkd.key.java.Position;
    import de.uka.ilkd.key.java.Services;
    import de.uka.ilkd.key.java.abstraction.*;
    import de.uka.ilkd.key.java.expression.literal.StringLiteral;
    import de.uka.ilkd.key.java.expression.literal.CharLiteral;
    import de.uka.ilkd.key.java.recoderext.ImplicitFieldAdder;
    import de.uka.ilkd.key.ldt.*;
    import de.uka.ilkd.key.logic.*;
    import de.uka.ilkd.key.logic.op.*;
    import de.uka.ilkd.key.logic.sort.*;
    import de.uka.ilkd.key.proof.OpReplacer;
    import de.uka.ilkd.key.speclang.HeapContext;
    import de.uka.ilkd.key.speclang.PositionedString;
    import de.uka.ilkd.key.speclang.translation.*;
    import de.uka.ilkd.key.util.Pair;
    import de.uka.ilkd.key.util.Triple;
    import de.uka.ilkd.key.util.InfFlowSpec;

    import java.math.BigInteger;
    import java.util.List;
    import java.util.Map;
    import java.util.LinkedHashMap;
    import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class KeYJMLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESSIBLE", "ALLFIELDS", "ALLOBJECTS", 
		"AND", "ASSIGNABLE", "BACKSLASH_PREFIXED", "BACKUP", "BIGINT", "BITWISENOT", 
		"BOOLEAN", "BREAKS", "BSUM", "BY", "BYTE", "CHAR_LITERAL", "COLON", "COMMA", 
		"CONTINUES", "DECLASSIFIES", "DECREASES", "DEPENDS", "DETERMINES", "DIGIT", 
		"DIGITS", "DISJOINT", "DIV", "DL_ESCAPE", "DOC_COMMENT", "DOMAIN_IMPLIES_CREATED", 
		"DOT", "DOTDOT", "DURATION", "ELEMTYPE", "EMPTYSET", "ENSURES", "ENSURES_FREE", 
		"EQUAL_SINGLE", "EQV_ANTIV", "EQ_NEQ", "ERASES", "ESC", "EVERYTHING", 
		"EXCEPTION", "EXISTS", "FALSE", "FORALL", "FREE", "FRESH", "GEQ", "GT", 
		"HEXDIGIT", "HEXNUMERAL", "IDENT", "IMPLIES", "IMPLIESBACKWARD", "INCLUSIVEOR", 
		"INDEX", "INDEXOF", "INFORMAL_DESCRIPTION", "INSTANCEOF", "INT", "INTERSECT", 
		"INTO", "INV", "INVARIANT_FOR", "IN_DOMAIN", "IS_FINITE", "IS_INITIALIZED", 
		"ITSELF", "JML_IDENT", "JOIN_PROC", "LARROW", "LBLNEG", "LBLPOS", "LBRACE", 
		"LBRACKET", "LEQ", "LETTER", "LETTERORDIGIT", "LOCKSET", "LOCKSET_LEQ", 
		"LOCKSET_LT", "LOCSET", "LOGICALAND", "LOGICALOR", "LONG", "LOOP_DETERMINES", 
		"LOOP_SEPARATES", "LPAREN", "LT", "LT_IMPLICIT_GT_DISPATCH", "MAP", "MAPEMPTY", 
		"MAP_GET", "MAP_OVERRIDE", "MAP_REMOVE", "MAP_SINGLETON", "MAP_SIZE", 
		"MAP_UPDATE", "MAX", "MEASURED_BY", "MIN", "MINUS", "MOD", "MODEL_METHOD_AXIOM", 
		"MULT", "NEW", "NEWELEMSFRESH", "NEW_OBJECTS", "NONNULLELEMENTS", "NON_NULL", 
		"NOT", "NOTHING", "NOT_ASSIGNED", "NOT_MODIFIED", "NOT_SPECIFIED", "NULL", 
		"NULLABLE", "NUM_OF", "OLD", "PERMISSION", "PLUS", "PRAGMA", "PRE", "PRODUCT", 
		"QUESTIONMARK", "RBRACE", "RBRACKET", "REACH", "REACHLOCS", "REAL", "REPRESENTS", 
		"REQUIRES", "REQUIRES_FREE", "RESULT", "RETURNS", "RPAREN", "SAME", "SEMI", 
		"SEPARATES", "SEQ", "SEQ2MAP", "SEQCONCAT", "SEQDEF", "SEQEMPTY", "SEQGET", 
		"SEQREPLACE", "SEQREVERSE", "SEQSINGLETON", "SEQSUB", "SETMINUS", "SHIFTLEFT", 
		"SHIFTRIGHT", "SHORT", "SIGNALS", "SIGNALS_ONLY", "SINGLETON", "SL_COMMENT", 
		"SPACE", "ST", "STATIC_INVARIANT_FOR", "STRICTLY_NOTHING", "STRING_EQUAL", 
		"STRING_LITERAL", "SUBSET", "SUCH_THAT", "SUM", "SUPER", "THIS", "TRANSACTIONUPDATED", 
		"TRANSIENT", "TRUE", "TYPE", "TYPEOF", "TYPE_SMALL", "UNION", "UNIONINF", 
		"UNSIGNEDSHIFTRIGHT", "VALUES", "VOID", "WORKINGSPACE", "WS", "XOR", "UNION_2"
	};
	public static final int EOF=-1;
	public static final int ACCESSIBLE=4;
	public static final int ALLFIELDS=5;
	public static final int ALLOBJECTS=6;
	public static final int AND=7;
	public static final int ASSIGNABLE=8;
	public static final int BACKSLASH_PREFIXED=9;
	public static final int BACKUP=10;
	public static final int BIGINT=11;
	public static final int BITWISENOT=12;
	public static final int BOOLEAN=13;
	public static final int BREAKS=14;
	public static final int BSUM=15;
	public static final int BY=16;
	public static final int BYTE=17;
	public static final int CHAR_LITERAL=18;
	public static final int COLON=19;
	public static final int COMMA=20;
	public static final int CONTINUES=21;
	public static final int DECLASSIFIES=22;
	public static final int DECREASES=23;
	public static final int DEPENDS=24;
	public static final int DETERMINES=25;
	public static final int DIGIT=26;
	public static final int DIGITS=27;
	public static final int DISJOINT=28;
	public static final int DIV=29;
	public static final int DL_ESCAPE=30;
	public static final int DOC_COMMENT=31;
	public static final int DOMAIN_IMPLIES_CREATED=32;
	public static final int DOT=33;
	public static final int DOTDOT=34;
	public static final int DURATION=35;
	public static final int ELEMTYPE=36;
	public static final int EMPTYSET=37;
	public static final int ENSURES=38;
	public static final int ENSURES_FREE=39;
	public static final int EQUAL_SINGLE=40;
	public static final int EQV_ANTIV=41;
	public static final int EQ_NEQ=42;
	public static final int ERASES=43;
	public static final int ESC=44;
	public static final int EVERYTHING=45;
	public static final int EXCEPTION=46;
	public static final int EXISTS=47;
	public static final int FALSE=48;
	public static final int FORALL=49;
	public static final int FREE=50;
	public static final int FRESH=51;
	public static final int GEQ=52;
	public static final int GT=53;
	public static final int HEXDIGIT=54;
	public static final int HEXNUMERAL=55;
	public static final int IDENT=56;
	public static final int IMPLIES=57;
	public static final int IMPLIESBACKWARD=58;
	public static final int INCLUSIVEOR=59;
	public static final int INDEX=60;
	public static final int INDEXOF=61;
	public static final int INFORMAL_DESCRIPTION=62;
	public static final int INSTANCEOF=63;
	public static final int INT=64;
	public static final int INTERSECT=65;
	public static final int INTO=66;
	public static final int INV=67;
	public static final int INVARIANT_FOR=68;
	public static final int IN_DOMAIN=69;
	public static final int IS_FINITE=70;
	public static final int IS_INITIALIZED=71;
	public static final int ITSELF=72;
	public static final int JML_IDENT=73;
	public static final int JOIN_PROC=74;
	public static final int LARROW=75;
	public static final int LBLNEG=76;
	public static final int LBLPOS=77;
	public static final int LBRACE=78;
	public static final int LBRACKET=79;
	public static final int LEQ=80;
	public static final int LETTER=81;
	public static final int LETTERORDIGIT=82;
	public static final int LOCKSET=83;
	public static final int LOCKSET_LEQ=84;
	public static final int LOCKSET_LT=85;
	public static final int LOCSET=86;
	public static final int LOGICALAND=87;
	public static final int LOGICALOR=88;
	public static final int LONG=89;
	public static final int LOOP_DETERMINES=90;
	public static final int LOOP_SEPARATES=91;
	public static final int LPAREN=92;
	public static final int LT=93;
	public static final int LT_IMPLICIT_GT_DISPATCH=94;
	public static final int MAP=95;
	public static final int MAPEMPTY=96;
	public static final int MAP_GET=97;
	public static final int MAP_OVERRIDE=98;
	public static final int MAP_REMOVE=99;
	public static final int MAP_SINGLETON=100;
	public static final int MAP_SIZE=101;
	public static final int MAP_UPDATE=102;
	public static final int MAX=103;
	public static final int MEASURED_BY=104;
	public static final int MIN=105;
	public static final int MINUS=106;
	public static final int MOD=107;
	public static final int MODEL_METHOD_AXIOM=108;
	public static final int MULT=109;
	public static final int NEW=110;
	public static final int NEWELEMSFRESH=111;
	public static final int NEW_OBJECTS=112;
	public static final int NONNULLELEMENTS=113;
	public static final int NON_NULL=114;
	public static final int NOT=115;
	public static final int NOTHING=116;
	public static final int NOT_ASSIGNED=117;
	public static final int NOT_MODIFIED=118;
	public static final int NOT_SPECIFIED=119;
	public static final int NULL=120;
	public static final int NULLABLE=121;
	public static final int NUM_OF=122;
	public static final int OLD=123;
	public static final int PERMISSION=124;
	public static final int PLUS=125;
	public static final int PRAGMA=126;
	public static final int PRE=127;
	public static final int PRODUCT=128;
	public static final int QUESTIONMARK=129;
	public static final int RBRACE=130;
	public static final int RBRACKET=131;
	public static final int REACH=132;
	public static final int REACHLOCS=133;
	public static final int REAL=134;
	public static final int REPRESENTS=135;
	public static final int REQUIRES=136;
	public static final int REQUIRES_FREE=137;
	public static final int RESULT=138;
	public static final int RETURNS=139;
	public static final int RPAREN=140;
	public static final int SAME=141;
	public static final int SEMI=142;
	public static final int SEPARATES=143;
	public static final int SEQ=144;
	public static final int SEQ2MAP=145;
	public static final int SEQCONCAT=146;
	public static final int SEQDEF=147;
	public static final int SEQEMPTY=148;
	public static final int SEQGET=149;
	public static final int SEQREPLACE=150;
	public static final int SEQREVERSE=151;
	public static final int SEQSINGLETON=152;
	public static final int SEQSUB=153;
	public static final int SETMINUS=154;
	public static final int SHIFTLEFT=155;
	public static final int SHIFTRIGHT=156;
	public static final int SHORT=157;
	public static final int SIGNALS=158;
	public static final int SIGNALS_ONLY=159;
	public static final int SINGLETON=160;
	public static final int SL_COMMENT=161;
	public static final int SPACE=162;
	public static final int ST=163;
	public static final int STATIC_INVARIANT_FOR=164;
	public static final int STRICTLY_NOTHING=165;
	public static final int STRING_EQUAL=166;
	public static final int STRING_LITERAL=167;
	public static final int SUBSET=168;
	public static final int SUCH_THAT=169;
	public static final int SUM=170;
	public static final int SUPER=171;
	public static final int THIS=172;
	public static final int TRANSACTIONUPDATED=173;
	public static final int TRANSIENT=174;
	public static final int TRUE=175;
	public static final int TYPE=176;
	public static final int TYPEOF=177;
	public static final int TYPE_SMALL=178;
	public static final int UNION=179;
	public static final int UNIONINF=180;
	public static final int UNSIGNEDSHIFTRIGHT=181;
	public static final int VALUES=182;
	public static final int VOID=183;
	public static final int WORKINGSPACE=184;
	public static final int WS=185;
	public static final int XOR=186;
	public static final int UNION_2=187;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public KeYJMLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public KeYJMLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return KeYJMLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g"; }



	    private TermBuilder tb;

	    private Services services;
	    private JavaInfo javaInfo;
	    private KeYJavaType containerType;
	    private IntegerLDT intLDT;
	    private HeapLDT heapLDT;
	    private LocSetLDT locSetLDT;
	    private BooleanLDT booleanLDT;
	    private SLTranslationExceptionManager excManager;
	    private List<PositionedString> warnings = new java.util.ArrayList<PositionedString>();

	    private JMLTranslator translator;

	    private ProgramVariable selfVar;
	    private ImmutableList<ProgramVariable> paramVars;
	    private ProgramVariable resultVar;
	    private ProgramVariable excVar;
	    private Map<LocationVariable,Term> atPres;

	    // Helper objects
	    private JMLResolverManager resolverManager;
	    private JavaIntegerSemanticsHelper intHelper;


	    private KeYJMLParser(KeYJMLLexer lexer,
			String fileName,
			Services services,
			KeYJavaType specInClass,
			ProgramVariable self,
			ImmutableList<ProgramVariable> paramVars,
			ProgramVariable result,
			ProgramVariable exc,
			Map<LocationVariable,Term> atPres) {
		this(new CommonTokenStream(lexer));

		// save parameters
		this.services       = services;
		this.tb             = services.getTermBuilder();
		this.javaInfo       = services.getJavaInfo();
		containerType  =   specInClass;
		this.intLDT         = services.getTypeConverter().getIntegerLDT();
		this.heapLDT        = services.getTypeConverter().getHeapLDT();
		this.locSetLDT      = services.getTypeConverter().getLocSetLDT();
		this.booleanLDT     = services.getTypeConverter().getBooleanLDT();
		this.excManager     = new SLTranslationExceptionManager(this,
					    				fileName,
					    				new Position(0,0));
	        this.translator     = new JMLTranslator(excManager, fileName, services);

		this.selfVar	    = self;
		this.paramVars      = paramVars;
		this.resultVar      = result;
		this.excVar	    = exc;
		this.atPres         = atPres;

	        intHelper = new JavaIntegerSemanticsHelper(services, excManager);
		// initialize helper objects
		this.resolverManager = new JMLResolverManager(this.javaInfo,
							      specInClass,
							      selfVar,
							      this.excManager);

		// initialize namespaces
		resolverManager.pushLocalVariablesNamespace();
		if(paramVars != null) {
		    resolverManager.putIntoTopLocalVariablesNamespace(paramVars);

		}
		if(resultVar != null) {
		    resolverManager.putIntoTopLocalVariablesNamespace(resultVar);
		}
	    }

	    static ANTLRStringStream createANTLRStringStream(PositionedString ps){
	       ANTLRStringStream result = new ANTLRStringStream(ps.text);
	       result.name = ps.fileName;
	       result.setCharPositionInLine(ps.pos.getColumn());
	       result.setLine(ps.pos.getLine() + 1);
	       return result;
	    }

	    public KeYJMLParser(PositionedString ps,
			Services services,
			KeYJavaType specInClass,
			ProgramVariable self,
			ImmutableList<ProgramVariable> paramVars,
			ProgramVariable result,
			ProgramVariable exc,
			Map<LocationVariable,Term> atPres) {
		this(new KeYJMLLexer(createANTLRStringStream(ps)),
		     ps.fileName,
		     services,
		     specInClass,
		     self,
		     paramVars,
		     result,
		     exc,
		     atPres);
	    }


	    public SLTranslationExceptionManager getExceptionManager() {
	        return excManager;
	    }


	    private void raiseError(String msg) throws SLTranslationException {
		throw excManager.createException(msg);
	    }

	    private void raiseError(String msg, Token t) throws SLTranslationException {
		throw excManager.createException(msg, t);
	    }

	    private void raiseNotSupported(String feature)
		    throws SLTranslationException {
		throw excManager.createWarningException(feature + " not supported");
	    }

	    /**
	     * This is used for features without semantics such as labels or annotations.
	     * @author bruns
	     * @since 1.7.2178
	     */
	    private void addIgnoreWarning(String feature, Token t) {
	        String msg = feature + " is not supported and has been silently ignored.";
	        warnings.add(new PositionedString(msg,t));
	    }

	    public List<PositionedString> getWarnings(){
	        List<PositionedString> res = new ArrayList<PositionedString>(warnings.size());
	        res.addAll(translator.getWarnings());
	        return res;
	    }


	    public Term parseExpression() throws SLTranslationException {
		Term result = null;

		try {
		    result = expression().getTerm();
		} catch (RecognitionException e) {
		    throw excManager.convertException(e);
		}

		return tb.convertToFormula(result);
	    }


	    public ImmutableList<ProgramVariable> parseVariableDeclaration() throws SLTranslationException {

		Pair<KeYJavaType,ImmutableList<LogicVariable>> vars;
		try {
		    vars = quantifiedvardecls();
		} catch (RecognitionException e) {
		    throw excManager.convertException(e);
		}

		ImmutableList<ProgramVariable> result = ImmutableSLList.<ProgramVariable>nil();
		for(LogicVariable lv : vars.second) {
		    ProgramVariable pv
		    	= new LocationVariable(new ProgramElementName(
		    	                           lv.name().toString()),
		                               vars.first);
		    result = result.append(pv);
		}
		return result;
	    }



	    /**
	     * Extracts a term's subterms as an array.
	     */
	    private Term[] getSubTerms(Term term) {
		Term[] result = new Term[term.arity()];
		for(int i = 0; i < term.arity(); i++) {
		    result[i] = term.sub(i);
		    assert result[i] != null;
		}
		return result;
	    }


	    /**
	     * Extracts the sorts from an array of terms as an array.
	     */
	    private Sort[] getSorts(Term[] terms) {
		Sort[] result = new Sort[terms.length];
		for(int i = 0; i < terms.length; i++) {
		    result[i] = terms[i].sort();
		}
		return result;
	    }

		private LocationVariable getBaseHeap() {
			return services.getTypeConverter().getHeapLDT().getHeap();
		}

		private LocationVariable getSavedHeap() {
			return services.getTypeConverter().getHeapLDT().getSavedHeap();
		}

		private LocationVariable getPermissionHeap() {
			return services.getTypeConverter().getHeapLDT().getPermissionHeap();
		}

	    /**
	     * Converts a term so that all of its non-rigid operators refer to the pre-state.
	     */
	    // TODO: remove when all clients have been moved to JMLTranslator
	    private Term convertToOld(final Term term) {
		    assert atPres != null && atPres.get(getBaseHeap()) != null;
		    Map<Term, Term> map = new LinkedHashMap<Term, Term>();
	        for (LocationVariable var : atPres.keySet()) {
	            // caution: That may now also be other variables than only heaps.
	            Term varAtPre = atPres.get(var);
	            if (varAtPre != null) {
	                map.put(tb.var(var), varAtPre);
	            }
	        }
		    OpReplacer or = new OpReplacer(map, tb.tf());
		    return or.replace(term);
	    }

	    private Term convertToBackup(Term term) {
		assert atPres != null && atPres.get(getSavedHeap()) != null;
		Map map = new LinkedHashMap();
		map.put(tb.var(getBaseHeap()), tb.var(getSavedHeap()));
	        if(atPres.get(getBaseHeap()) != null) {
		  map.put(atPres.get(getBaseHeap()), atPres.get(getSavedHeap()));
	        }
		OpReplacer or = new OpReplacer(map, tb.tf());
		return or.replace(term);
	    }

	    private Term convertToPermission(Term term) throws SLTranslationException {
	        LocationVariable permissionHeap = getPermissionHeap();
	        if(permissionHeap == null) {
	           raiseError("\\permission expression used in a non-permission context and permissions not enabled.");
	        }
	        if(!term.op().name().toString().endsWith("::select")) {
	           raiseError("\\permission expression used with non store-ref expression.");
	        }
	        return tb.select(services.getTypeConverter().getPermissionLDT().targetSort(), tb.var(getPermissionHeap()), term.sub(1), term.sub(2));
	    }

	    private String createSignatureString(ImmutableList<SLExpression> signature) {
		if (signature == null || signature.isEmpty()) {
		    return "";
		}
		String sigString = "";

		for(SLExpression expr : signature) {
		    final KeYJavaType t = expr.getType();
		    sigString += (t==null? "<unknown type>": t.getFullName()) + ", ";
		}

		return sigString.substring(0, sigString.length() - 2);
	    }


	    private SLExpression lookupIdentifier(String lookupName,
						  SLExpression receiver,
						  SLParameters params,
						  Token t)
					       throws SLTranslationException {

		// Identifier with suffix in parentheses? Probably a method call
		// parse in the parameter list and call again
	    if (input.LA(1) == LPAREN) {
	    	return receiver;
	    }

		SLExpression result = null;
		try {
		 result = resolverManager.resolve(receiver,
		   			      lookupName,
					      params);
		} catch(SLTranslationException exc) {
		   // no type name found maybe package?
		}

		if(result != null) {
		    return result;
		}

		// no identifier found, maybe it was just a package prefix.
		// but package prefixes don't have a receiver!
		// Let primarysuffix handle faulty method call.
		if (receiver != null && params == null) {
		    raiseError("Identifier " + lookupName + " not found: " +
		               lookupName);
		}

		return null;
	    }
	    
	    // Helper variable, which is necessary because antlr doesn't forward local variables to generated DFAs.
	    // It is used in a semantic predicate to determine the branch that will be taken by the generated DFA.
	    private boolean representsClauseLhsIsLocSet;


	    /* ---- antlr stuff ---- (Exception handling) */

	    @Override
	    public void reportError(RecognitionException ex) {
	        // dont do anything
	    }

	    public void recover(IntStream input, RecognitionException re) {
	        throw new RuntimeException(re);
	    }

	    /** Not currently used */
	    @Override
	    public Object recoverFromMismatchedSet(IntStream input,
	            RecognitionException e, BitSet follow) throws RecognitionException {
	        // comment says it is never used, still make sure ...
	        throw e;
	    }

	    protected Object recoverFromMismatchedToken(IntStream input, int ttype,
	            BitSet follow) throws RecognitionException {
	        throw new MismatchedTokenException(ttype, input);
	    }
	    
	    protected void mismatch(IntStream input, int ttype, BitSet follow) throws RecognitionException
	    {
	        throw new MismatchedTokenException(ttype, input);
	    }




	// $ANTLR start "top"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:383:1: top returns [Object ret = null] : ( accessibleclause | assignableclause | breaksclause | continuesclause | dependsclause | ensuresclause | ensuresfreeclause | representsclause | axiomsclause | requiresclause | joinprocclause | requiresfreeclause | decreasesclause | separatesclause | determinesclause | loopseparatesclause | loopdeterminesclause | returnsclause | signalsclause | signalsonlyclause | termexpression ) ( SEMI )? EOF ;
	public final Object top() throws RecognitionException, SLTranslationException {
		Object ret =  null;


		Term accessibleclause1 =null;
		Term assignableclause2 =null;
		Pair breaksclause3 =null;
		Pair continuesclause4 =null;
		Triple<ObserverFunction,Term,Term> dependsclause5 =null;
		Term ensuresclause6 =null;
		Term ensuresfreeclause7 =null;
		Pair<ObserverFunction,Term> representsclause8 =null;
		Term axiomsclause9 =null;
		Term requiresclause10 =null;
		Term joinprocclause11 =null;
		Term requiresfreeclause12 =null;
		Term decreasesclause13 =null;
		InfFlowSpec separatesclause14 =null;
		InfFlowSpec determinesclause15 =null;
		InfFlowSpec loopseparatesclause16 =null;
		InfFlowSpec loopdeterminesclause17 =null;
		Term returnsclause18 =null;
		Term signalsclause19 =null;
		Term signalsonlyclause20 =null;
		Term termexpression21 =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:384:5: ( ( accessibleclause | assignableclause | breaksclause | continuesclause | dependsclause | ensuresclause | ensuresfreeclause | representsclause | axiomsclause | requiresclause | joinprocclause | requiresfreeclause | decreasesclause | separatesclause | determinesclause | loopseparatesclause | loopdeterminesclause | returnsclause | signalsclause | signalsonlyclause | termexpression ) ( SEMI )? EOF )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:385:5: ( accessibleclause | assignableclause | breaksclause | continuesclause | dependsclause | ensuresclause | ensuresfreeclause | representsclause | axiomsclause | requiresclause | joinprocclause | requiresfreeclause | decreasesclause | separatesclause | determinesclause | loopseparatesclause | loopdeterminesclause | returnsclause | signalsclause | signalsonlyclause | termexpression ) ( SEMI )? EOF
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:385:5: ( accessibleclause | assignableclause | breaksclause | continuesclause | dependsclause | ensuresclause | ensuresfreeclause | representsclause | axiomsclause | requiresclause | joinprocclause | requiresfreeclause | decreasesclause | separatesclause | determinesclause | loopseparatesclause | loopdeterminesclause | returnsclause | signalsclause | signalsonlyclause | termexpression )
			int alt1=21;
			alt1 = dfa1.predict(input);
			switch (alt1) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:385:9: accessibleclause
					{
					pushFollow(FOLLOW_accessibleclause_in_top74);
					accessibleclause1=accessibleclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = accessibleclause1; }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:386:9: assignableclause
					{
					pushFollow(FOLLOW_assignableclause_in_top86);
					assignableclause2=assignableclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = assignableclause2; }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:387:9: breaksclause
					{
					pushFollow(FOLLOW_breaksclause_in_top98);
					breaksclause3=breaksclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = breaksclause3; }
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:388:9: continuesclause
					{
					pushFollow(FOLLOW_continuesclause_in_top110);
					continuesclause4=continuesclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = continuesclause4; }
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:389:9: dependsclause
					{
					pushFollow(FOLLOW_dependsclause_in_top122);
					dependsclause5=dependsclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = dependsclause5; }
					}
					break;
				case 6 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:390:9: ensuresclause
					{
					pushFollow(FOLLOW_ensuresclause_in_top134);
					ensuresclause6=ensuresclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = ensuresclause6; }
					}
					break;
				case 7 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:391:9: ensuresfreeclause
					{
					pushFollow(FOLLOW_ensuresfreeclause_in_top146);
					ensuresfreeclause7=ensuresfreeclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = ensuresfreeclause7; }
					}
					break;
				case 8 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:392:9: representsclause
					{
					pushFollow(FOLLOW_representsclause_in_top158);
					representsclause8=representsclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = representsclause8; }
					}
					break;
				case 9 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:393:9: axiomsclause
					{
					pushFollow(FOLLOW_axiomsclause_in_top170);
					axiomsclause9=axiomsclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = axiomsclause9; }
					}
					break;
				case 10 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:394:9: requiresclause
					{
					pushFollow(FOLLOW_requiresclause_in_top182);
					requiresclause10=requiresclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = requiresclause10; }
					}
					break;
				case 11 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:395:9: joinprocclause
					{
					pushFollow(FOLLOW_joinprocclause_in_top194);
					joinprocclause11=joinprocclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = joinprocclause11; }
					}
					break;
				case 12 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:396:9: requiresfreeclause
					{
					pushFollow(FOLLOW_requiresfreeclause_in_top206);
					requiresfreeclause12=requiresfreeclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = requiresfreeclause12; }
					}
					break;
				case 13 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:397:9: decreasesclause
					{
					pushFollow(FOLLOW_decreasesclause_in_top218);
					decreasesclause13=decreasesclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = decreasesclause13; }
					}
					break;
				case 14 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:398:9: separatesclause
					{
					pushFollow(FOLLOW_separatesclause_in_top230);
					separatesclause14=separatesclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = separatesclause14; }
					}
					break;
				case 15 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:399:9: determinesclause
					{
					pushFollow(FOLLOW_determinesclause_in_top243);
					determinesclause15=determinesclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = determinesclause15; }
					}
					break;
				case 16 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:400:9: loopseparatesclause
					{
					pushFollow(FOLLOW_loopseparatesclause_in_top256);
					loopseparatesclause16=loopseparatesclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = loopseparatesclause16; }
					}
					break;
				case 17 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:401:9: loopdeterminesclause
					{
					pushFollow(FOLLOW_loopdeterminesclause_in_top269);
					loopdeterminesclause17=loopdeterminesclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = loopdeterminesclause17; }
					}
					break;
				case 18 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:402:9: returnsclause
					{
					pushFollow(FOLLOW_returnsclause_in_top282);
					returnsclause18=returnsclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = returnsclause18; }
					}
					break;
				case 19 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:403:9: signalsclause
					{
					pushFollow(FOLLOW_signalsclause_in_top294);
					signalsclause19=signalsclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = signalsclause19; }
					}
					break;
				case 20 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:404:9: signalsonlyclause
					{
					pushFollow(FOLLOW_signalsonlyclause_in_top306);
					signalsonlyclause20=signalsonlyclause();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = signalsonlyclause20; }
					}
					break;
				case 21 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:405:9: termexpression
					{
					pushFollow(FOLLOW_termexpression_in_top318);
					termexpression21=termexpression();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret = termexpression21; }
					}
					break;

			}

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:407:5: ( SEMI )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==SEMI) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:407:6: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_top333); if (state.failed) return ret;
					}
					break;

			}

			match(input,EOF,FOLLOW_EOF_in_top337); if (state.failed) return ret;
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "top"



	// $ANTLR start "accessibleclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:410:1: accessibleclause returns [Term ret = null] : acc= ACCESSIBLE result= storeRefUnion ;
	public final Term accessibleclause() throws RecognitionException, SLTranslationException {
		Term ret =  null;


		Token acc=null;
		Term result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:412:5: (acc= ACCESSIBLE result= storeRefUnion )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:413:5: acc= ACCESSIBLE result= storeRefUnion
			{
			acc=(Token)match(input,ACCESSIBLE,FOLLOW_ACCESSIBLE_in_accessibleclause368); if (state.failed) return ret;
			pushFollow(FOLLOW_storeRefUnion_in_accessibleclause372);
			result=storeRefUnion();
			state._fsp--;
			if (state.failed) return ret;
			if ( state.backtracking==0 ) { result = translator.translate(acc.getText(), Term.class, result, services); }
			}

			if ( state.backtracking==0 ) { ret = result; }
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "accessibleclause"



	// $ANTLR start "assignableclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:418:1: assignableclause returns [Term ret = null] : ass= ASSIGNABLE (result= storeRefUnion | STRICTLY_NOTHING ) ;
	public final Term assignableclause() throws RecognitionException, SLTranslationException {
		Term ret =  null;


		Token ass=null;
		Term result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:420:5: (ass= ASSIGNABLE (result= storeRefUnion | STRICTLY_NOTHING ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:421:5: ass= ASSIGNABLE (result= storeRefUnion | STRICTLY_NOTHING )
			{
			ass=(Token)match(input,ASSIGNABLE,FOLLOW_ASSIGNABLE_in_assignableclause414); if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:422:5: (result= storeRefUnion | STRICTLY_NOTHING )
			int alt3=2;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:422:7: result= storeRefUnion
					{
					pushFollow(FOLLOW_storeRefUnion_in_assignableclause424);
					result=storeRefUnion();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = translator.translate(ass.getText(), Term.class, result, services); }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:424:7: STRICTLY_NOTHING
					{
					match(input,STRICTLY_NOTHING,FOLLOW_STRICTLY_NOTHING_in_assignableclause442); if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = tb.strictlyNothing(); }
					}
					break;

			}

			}

			if ( state.backtracking==0 ) { ret = result; }
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "assignableclause"



	// $ANTLR start "dependsclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:430:1: dependsclause returns [Triple<ObserverFunction,Term,Term> result=null] : dep= DEPENDS lhs= expression COLON rhs= storeRefUnion ( MEASURED_BY mby= expression )? SEMI ;
	public final Triple<ObserverFunction,Term,Term> dependsclause() throws RecognitionException, SLTranslationException {
		Triple<ObserverFunction,Term,Term> result = null;


		Token dep=null;
		SLExpression lhs =null;
		Term rhs =null;
		SLExpression mby =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:431:5: (dep= DEPENDS lhs= expression COLON rhs= storeRefUnion ( MEASURED_BY mby= expression )? SEMI )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:432:5: dep= DEPENDS lhs= expression COLON rhs= storeRefUnion ( MEASURED_BY mby= expression )? SEMI
			{
			dep=(Token)match(input,DEPENDS,FOLLOW_DEPENDS_in_dependsclause486); if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_dependsclause490);
			lhs=expression();
			state._fsp--;
			if (state.failed) return result;
			match(input,COLON,FOLLOW_COLON_in_dependsclause496); if (state.failed) return result;
			pushFollow(FOLLOW_storeRefUnion_in_dependsclause500);
			rhs=storeRefUnion();
			state._fsp--;
			if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:434:5: ( MEASURED_BY mby= expression )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==MEASURED_BY) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:434:6: MEASURED_BY mby= expression
					{
					match(input,MEASURED_BY,FOLLOW_MEASURED_BY_in_dependsclause507); if (state.failed) return result;
					pushFollow(FOLLOW_expression_in_dependsclause511);
					mby=expression();
					state._fsp--;
					if (state.failed) return result;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_dependsclause515); if (state.failed) return result;
			if ( state.backtracking==0 ) { result = translator.translate(
			                dep.getText(), Triple.class, lhs, rhs, mby, services); }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "dependsclause"



	// $ANTLR start "decreasesclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:439:1: decreasesclause returns [Term ret = null] : dec= DECREASES result= termexpression ( COMMA t= termexpression )* ;
	public final Term decreasesclause() throws RecognitionException, SLTranslationException {
		Term ret =  null;


		Token dec=null;
		Term result =null;
		Term t =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:441:5: (dec= DECREASES result= termexpression ( COMMA t= termexpression )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:442:5: dec= DECREASES result= termexpression ( COMMA t= termexpression )*
			{
			dec=(Token)match(input,DECREASES,FOLLOW_DECREASES_in_decreasesclause556); if (state.failed) return ret;
			pushFollow(FOLLOW_termexpression_in_decreasesclause560);
			result=termexpression();
			state._fsp--;
			if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:443:9: ( COMMA t= termexpression )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:443:10: COMMA t= termexpression
					{
					match(input,COMMA,FOLLOW_COMMA_in_decreasesclause571); if (state.failed) return ret;
					pushFollow(FOLLOW_termexpression_in_decreasesclause575);
					t=termexpression();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = tb.pair(result, t); }
					}
					break;

				default :
					break loop5;
				}
			}

			}

			if ( state.backtracking==0 ) {ret=result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "decreasesclause"



	// $ANTLR start "requiresclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:446:1: requiresclause returns [Term ret = null] : req= REQUIRES result= predornot ;
	public final Term requiresclause() throws RecognitionException, SLTranslationException {
		Term ret =  null;


		Token req=null;
		Term result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:447:5: (req= REQUIRES result= predornot )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:448:5: req= REQUIRES result= predornot
			{
			req=(Token)match(input,REQUIRES,FOLLOW_REQUIRES_in_requiresclause607); if (state.failed) return ret;
			pushFollow(FOLLOW_predornot_in_requiresclause611);
			result=predornot();
			state._fsp--;
			if (state.failed) return ret;
			if ( state.backtracking==0 ) { ret = translator.translate(req.getText(), Term.class, result, services); }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "requiresclause"



	// $ANTLR start "requiresfreeclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:452:1: requiresfreeclause returns [Term ret = null] : req= REQUIRES_FREE result= predornot ;
	public final Term requiresfreeclause() throws RecognitionException, SLTranslationException {
		Term ret =  null;


		Token req=null;
		Term result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:453:5: (req= REQUIRES_FREE result= predornot )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:454:5: req= REQUIRES_FREE result= predornot
			{
			req=(Token)match(input,REQUIRES_FREE,FOLLOW_REQUIRES_FREE_in_requiresfreeclause652); if (state.failed) return ret;
			pushFollow(FOLLOW_predornot_in_requiresfreeclause656);
			result=predornot();
			state._fsp--;
			if (state.failed) return ret;
			if ( state.backtracking==0 ) { ret = translator.translate(req.getText(), Term.class, result, services); }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "requiresfreeclause"



	// $ANTLR start "joinprocclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:458:1: joinprocclause returns [Term ret = null] : jpr= JOIN_PROC result= predornot ;
	public final Term joinprocclause() throws RecognitionException, SLTranslationException {
		Term ret =  null;


		Token jpr=null;
		Term result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:459:5: (jpr= JOIN_PROC result= predornot )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:460:5: jpr= JOIN_PROC result= predornot
			{
			jpr=(Token)match(input,JOIN_PROC,FOLLOW_JOIN_PROC_in_joinprocclause697); if (state.failed) return ret;
			pushFollow(FOLLOW_predornot_in_joinprocclause701);
			result=predornot();
			state._fsp--;
			if (state.failed) return ret;
			if ( state.backtracking==0 ) { ret = translator.translate(jpr.getText(), Term.class, result, services); }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "joinprocclause"



	// $ANTLR start "ensuresclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:464:1: ensuresclause returns [Term ret = null] : ens= ENSURES result= predornot ;
	public final Term ensuresclause() throws RecognitionException, SLTranslationException {
		Term ret =  null;


		Token ens=null;
		Term result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:465:5: (ens= ENSURES result= predornot )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:466:5: ens= ENSURES result= predornot
			{
			ens=(Token)match(input,ENSURES,FOLLOW_ENSURES_in_ensuresclause742); if (state.failed) return ret;
			pushFollow(FOLLOW_predornot_in_ensuresclause746);
			result=predornot();
			state._fsp--;
			if (state.failed) return ret;
			if ( state.backtracking==0 ) { ret = translator.translate(ens.getText(), Term.class, result, services); }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "ensuresclause"



	// $ANTLR start "ensuresfreeclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:470:1: ensuresfreeclause returns [Term ret = null] : ens= ENSURES_FREE result= predornot ;
	public final Term ensuresfreeclause() throws RecognitionException, SLTranslationException {
		Term ret =  null;


		Token ens=null;
		Term result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:471:5: (ens= ENSURES_FREE result= predornot )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:472:5: ens= ENSURES_FREE result= predornot
			{
			ens=(Token)match(input,ENSURES_FREE,FOLLOW_ENSURES_FREE_in_ensuresfreeclause787); if (state.failed) return ret;
			pushFollow(FOLLOW_predornot_in_ensuresfreeclause791);
			result=predornot();
			state._fsp--;
			if (state.failed) return ret;
			if ( state.backtracking==0 ) { ret = translator.translate(ens.getText(), Term.class, result, services); }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "ensuresfreeclause"



	// $ANTLR start "axiomsclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:476:1: axiomsclause returns [Term ret = null] : axm= MODEL_METHOD_AXIOM result= termexpression ;
	public final Term axiomsclause() throws RecognitionException, SLTranslationException {
		Term ret =  null;


		Token axm=null;
		Term result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:477:5: (axm= MODEL_METHOD_AXIOM result= termexpression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:478:5: axm= MODEL_METHOD_AXIOM result= termexpression
			{
			axm=(Token)match(input,MODEL_METHOD_AXIOM,FOLLOW_MODEL_METHOD_AXIOM_in_axiomsclause832); if (state.failed) return ret;
			pushFollow(FOLLOW_termexpression_in_axiomsclause836);
			result=termexpression();
			state._fsp--;
			if (state.failed) return ret;
			if ( state.backtracking==0 ) { ret = translator.translate(axm.getText(), Term.class, result, services); }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "axiomsclause"



	// $ANTLR start "representsclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:482:1: representsclause returns [Pair<ObserverFunction,Term> result=null] : rep= REPRESENTS lhs= expression ( ( ( LARROW | EQUAL_SINGLE ) ({...}?rhs= expression |t= storeRefUnion ) ) | ( SUCH_THAT t= predicate ) ) ;
	public final Pair<ObserverFunction,Term> representsclause() throws RecognitionException, SLTranslationException {
		Pair<ObserverFunction,Term> result = null;


		Token rep=null;
		SLExpression lhs =null;
		SLExpression rhs =null;
		Term t =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:483:5: (rep= REPRESENTS lhs= expression ( ( ( LARROW | EQUAL_SINGLE ) ({...}?rhs= expression |t= storeRefUnion ) ) | ( SUCH_THAT t= predicate ) ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:484:5: rep= REPRESENTS lhs= expression ( ( ( LARROW | EQUAL_SINGLE ) ({...}?rhs= expression |t= storeRefUnion ) ) | ( SUCH_THAT t= predicate ) )
			{
			rep=(Token)match(input,REPRESENTS,FOLLOW_REPRESENTS_in_representsclause877); if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_representsclause881);
			lhs=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {representsClauseLhsIsLocSet = lhs.getTerm().sort().equals(locSetLDT.targetSort());}
			if ( state.backtracking==0 ) {
			        // TODO: move code out of the parser!
			        if(!lhs.isTerm()
			            || !(lhs.getTerm().op() instanceof ObserverFunction)
			            || lhs.getTerm().sub(0).op() != heapLDT.getHeap()) {
			            raiseError("Represents clause with unexpected lhs: " + lhs);
			        } else if(selfVar != null
			                  && ((ObserverFunction)lhs.getTerm().op()).isStatic()) {
			            raiseError("Represents clauses for static model fields must be static.");
			        }
			    }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:496:5: ( ( ( LARROW | EQUAL_SINGLE ) ({...}?rhs= expression |t= storeRefUnion ) ) | ( SUCH_THAT t= predicate ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==EQUAL_SINGLE||LA7_0==LARROW) ) {
				alt7=1;
			}
			else if ( (LA7_0==SUCH_THAT) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:497:9: ( ( LARROW | EQUAL_SINGLE ) ({...}?rhs= expression |t= storeRefUnion ) )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:497:9: ( ( LARROW | EQUAL_SINGLE ) ({...}?rhs= expression |t= storeRefUnion ) )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:498:9: ( LARROW | EQUAL_SINGLE ) ({...}?rhs= expression |t= storeRefUnion )
					{
					if ( input.LA(1)==EQUAL_SINGLE||input.LA(1)==LARROW ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return result;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:499:9: ({...}?rhs= expression |t= storeRefUnion )
					int alt6=2;
					alt6 = dfa6.predict(input);
					switch (alt6) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:500:9: {...}?rhs= expression
							{
							if ( !(( !representsClauseLhsIsLocSet)) ) {
								if (state.backtracking>0) {state.failed=true; return result;}
								throw new FailedPredicateException(input, "representsclause", " !representsClauseLhsIsLocSet");
							}
							pushFollow(FOLLOW_expression_in_representsclause958);
							rhs=expression();
							state._fsp--;
							if (state.failed) return result;
							if ( state.backtracking==0 ) {   // TODO: move code out of the parser!
							                if(!rhs.isTerm()) {
							                    raiseError("Represents clause with unexpected rhs: " + rhs);
							                }
							                Term rhsTerm = rhs.getTerm();
							                if(rhsTerm.sort() == Sort.FORMULA) {
							                    rhsTerm = tb.ife(rhsTerm, tb.TRUE(), tb.FALSE());
							                }
							                t = tb.equals(lhs.getTerm(), rhsTerm);
							            }
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:513:13: t= storeRefUnion
							{
							pushFollow(FOLLOW_storeRefUnion_in_representsclause998);
							t=storeRefUnion();
							state._fsp--;
							if (state.failed) return result;
							if ( state.backtracking==0 ) {   // TODO: move code out of the parser!
							                t = tb.equals(lhs.getTerm(), t);
							            }
							}
							break;

					}

					}

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:519:9: ( SUCH_THAT t= predicate )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:519:9: ( SUCH_THAT t= predicate )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:520:13: SUCH_THAT t= predicate
					{
					match(input,SUCH_THAT,FOLLOW_SUCH_THAT_in_representsclause1057); if (state.failed) return result;
					pushFollow(FOLLOW_predicate_in_representsclause1061);
					t=predicate();
					state._fsp--;
					if (state.failed) return result;
					}

					}
					break;

			}

			if ( state.backtracking==0 ) { result = translator.translate(rep.getText(), Pair.class, lhs, t, services); }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "representsclause"



	// $ANTLR start "separatesclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:527:1: separatesclause returns [InfFlowSpec result = InfFlowSpec.EMPTY_INF_FLOW_SPEC] : SEPARATES ( NOTHING |sep= infflowspeclist ) ( ( DECLASSIFIES ( NOTHING |tmp= infflowspeclist ) ) | ( ERASES ( NOTHING |tmp= infflowspeclist ) ) | ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) ) )* ;
	public final InfFlowSpec separatesclause() throws RecognitionException, SLTranslationException {
		InfFlowSpec result =  InfFlowSpec.EMPTY_INF_FLOW_SPEC;


		ImmutableList<Term> sep =null;
		ImmutableList<Term> tmp =null;


		    ImmutableList<Term> decl = ImmutableSLList.<Term>nil();
		    ImmutableList<Term> erases = ImmutableSLList.<Term>nil();
		    ImmutableList<Term> newObs = ImmutableSLList.<Term>nil();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:533:5: ( SEPARATES ( NOTHING |sep= infflowspeclist ) ( ( DECLASSIFIES ( NOTHING |tmp= infflowspeclist ) ) | ( ERASES ( NOTHING |tmp= infflowspeclist ) ) | ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) ) )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:534:5: SEPARATES ( NOTHING |sep= infflowspeclist ) ( ( DECLASSIFIES ( NOTHING |tmp= infflowspeclist ) ) | ( ERASES ( NOTHING |tmp= infflowspeclist ) ) | ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) ) )*
			{
			match(input,SEPARATES,FOLLOW_SEPARATES_in_separatesclause1115); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:534:15: ( NOTHING |sep= infflowspeclist )
			int alt8=2;
			alt8 = dfa8.predict(input);
			switch (alt8) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:534:16: NOTHING
					{
					match(input,NOTHING,FOLLOW_NOTHING_in_separatesclause1118); if (state.failed) return result;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:534:26: sep= infflowspeclist
					{
					pushFollow(FOLLOW_infflowspeclist_in_separatesclause1126);
					sep=infflowspeclist();
					state._fsp--;
					if (state.failed) return result;
					}
					break;

			}

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:535:5: ( ( DECLASSIFIES ( NOTHING |tmp= infflowspeclist ) ) | ( ERASES ( NOTHING |tmp= infflowspeclist ) ) | ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) ) )*
			loop12:
			while (true) {
				int alt12=4;
				switch ( input.LA(1) ) {
				case DECLASSIFIES:
					{
					alt12=1;
					}
					break;
				case ERASES:
					{
					alt12=2;
					}
					break;
				case NEW_OBJECTS:
					{
					alt12=3;
					}
					break;
				}
				switch (alt12) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:535:9: ( DECLASSIFIES ( NOTHING |tmp= infflowspeclist ) )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:535:9: ( DECLASSIFIES ( NOTHING |tmp= infflowspeclist ) )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:535:10: DECLASSIFIES ( NOTHING |tmp= infflowspeclist )
					{
					match(input,DECLASSIFIES,FOLLOW_DECLASSIFIES_in_separatesclause1138); if (state.failed) return result;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:535:23: ( NOTHING |tmp= infflowspeclist )
					int alt9=2;
					alt9 = dfa9.predict(input);
					switch (alt9) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:535:24: NOTHING
							{
							match(input,NOTHING,FOLLOW_NOTHING_in_separatesclause1141); if (state.failed) return result;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:535:34: tmp= infflowspeclist
							{
							pushFollow(FOLLOW_infflowspeclist_in_separatesclause1149);
							tmp=infflowspeclist();
							state._fsp--;
							if (state.failed) return result;
							if ( state.backtracking==0 ) {decl = decl.append(tmp);}
							}
							break;

					}

					}

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:536:9: ( ERASES ( NOTHING |tmp= infflowspeclist ) )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:536:9: ( ERASES ( NOTHING |tmp= infflowspeclist ) )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:536:10: ERASES ( NOTHING |tmp= infflowspeclist )
					{
					match(input,ERASES,FOLLOW_ERASES_in_separatesclause1166); if (state.failed) return result;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:536:17: ( NOTHING |tmp= infflowspeclist )
					int alt10=2;
					alt10 = dfa10.predict(input);
					switch (alt10) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:536:18: NOTHING
							{
							match(input,NOTHING,FOLLOW_NOTHING_in_separatesclause1169); if (state.failed) return result;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:536:28: tmp= infflowspeclist
							{
							pushFollow(FOLLOW_infflowspeclist_in_separatesclause1177);
							tmp=infflowspeclist();
							state._fsp--;
							if (state.failed) return result;
							if ( state.backtracking==0 ) {erases = erases.append(tmp);}
							}
							break;

					}

					}

					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:537:9: ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:537:9: ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:537:10: NEW_OBJECTS ( NOTHING |tmp= infflowspeclist )
					{
					match(input,NEW_OBJECTS,FOLLOW_NEW_OBJECTS_in_separatesclause1194); if (state.failed) return result;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:537:22: ( NOTHING |tmp= infflowspeclist )
					int alt11=2;
					alt11 = dfa11.predict(input);
					switch (alt11) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:537:23: NOTHING
							{
							match(input,NOTHING,FOLLOW_NOTHING_in_separatesclause1197); if (state.failed) return result;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:537:33: tmp= infflowspeclist
							{
							pushFollow(FOLLOW_infflowspeclist_in_separatesclause1205);
							tmp=infflowspeclist();
							state._fsp--;
							if (state.failed) return result;
							if ( state.backtracking==0 ) {newObs = newObs.append(tmp);}
							}
							break;

					}

					}

					}
					break;

				default :
					break loop12;
				}
			}

			if ( state.backtracking==0 ) {decl = sep.append(decl);
			     erases = sep.append(erases);
			     result = new InfFlowSpec(decl, erases, newObs);}
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "separatesclause"



	// $ANTLR start "loopseparatesclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:545:1: loopseparatesclause returns [InfFlowSpec result = InfFlowSpec.EMPTY_INF_FLOW_SPEC] : LOOP_SEPARATES ( NOTHING |tmp= infflowspeclist ) ( ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) ) )* ;
	public final InfFlowSpec loopseparatesclause() throws RecognitionException, SLTranslationException {
		InfFlowSpec result =  InfFlowSpec.EMPTY_INF_FLOW_SPEC;


		ImmutableList<Term> tmp =null;


		    ImmutableList<Term> sep = ImmutableSLList.<Term>nil();
		    ImmutableList<Term> newObs = ImmutableSLList.<Term>nil();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:550:5: ( LOOP_SEPARATES ( NOTHING |tmp= infflowspeclist ) ( ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) ) )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:551:5: LOOP_SEPARATES ( NOTHING |tmp= infflowspeclist ) ( ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) ) )*
			{
			match(input,LOOP_SEPARATES,FOLLOW_LOOP_SEPARATES_in_loopseparatesclause1254); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:551:20: ( NOTHING |tmp= infflowspeclist )
			int alt13=2;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:551:21: NOTHING
					{
					match(input,NOTHING,FOLLOW_NOTHING_in_loopseparatesclause1257); if (state.failed) return result;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:551:31: tmp= infflowspeclist
					{
					pushFollow(FOLLOW_infflowspeclist_in_loopseparatesclause1265);
					tmp=infflowspeclist();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) {sep=tmp;}
					}
					break;

			}

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:552:5: ( ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) ) )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==NEW_OBJECTS) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:552:9: ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:552:9: ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:552:10: NEW_OBJECTS ( NOTHING |tmp= infflowspeclist )
					{
					match(input,NEW_OBJECTS,FOLLOW_NEW_OBJECTS_in_loopseparatesclause1279); if (state.failed) return result;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:552:22: ( NOTHING |tmp= infflowspeclist )
					int alt14=2;
					alt14 = dfa14.predict(input);
					switch (alt14) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:552:23: NOTHING
							{
							match(input,NOTHING,FOLLOW_NOTHING_in_loopseparatesclause1282); if (state.failed) return result;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:552:33: tmp= infflowspeclist
							{
							pushFollow(FOLLOW_infflowspeclist_in_loopseparatesclause1290);
							tmp=infflowspeclist();
							state._fsp--;
							if (state.failed) return result;
							if ( state.backtracking==0 ) {newObs = newObs.append(tmp);}
							}
							break;

					}

					}

					}
					break;

				default :
					break loop15;
				}
			}

			if ( state.backtracking==0 ) {result = new InfFlowSpec(sep, sep, newObs);}
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "loopseparatesclause"



	// $ANTLR start "determinesclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:558:1: determinesclause returns [InfFlowSpec result = InfFlowSpec.EMPTY_INF_FLOW_SPEC] : DETERMINES ( NOTHING |det= infflowspeclist ) BY ( NOTHING | ( ITSELF ) |by= infflowspeclist ) ( ( DECLASSIFIES ( NOTHING |tmp= infflowspeclist ) ) | ( ERASES ( NOTHING |tmp= infflowspeclist ) ) | ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) ) )* ;
	public final InfFlowSpec determinesclause() throws RecognitionException, SLTranslationException {
		InfFlowSpec result =  InfFlowSpec.EMPTY_INF_FLOW_SPEC;


		ImmutableList<Term> det =null;
		ImmutableList<Term> by =null;
		ImmutableList<Term> tmp =null;


		    ImmutableList<Term> decl = ImmutableSLList.<Term>nil();
		    ImmutableList<Term> erases = ImmutableSLList.<Term>nil();
		    ImmutableList<Term> newObs = ImmutableSLList.<Term>nil();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:564:5: ( DETERMINES ( NOTHING |det= infflowspeclist ) BY ( NOTHING | ( ITSELF ) |by= infflowspeclist ) ( ( DECLASSIFIES ( NOTHING |tmp= infflowspeclist ) ) | ( ERASES ( NOTHING |tmp= infflowspeclist ) ) | ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) ) )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:565:5: DETERMINES ( NOTHING |det= infflowspeclist ) BY ( NOTHING | ( ITSELF ) |by= infflowspeclist ) ( ( DECLASSIFIES ( NOTHING |tmp= infflowspeclist ) ) | ( ERASES ( NOTHING |tmp= infflowspeclist ) ) | ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) ) )*
			{
			match(input,DETERMINES,FOLLOW_DETERMINES_in_determinesclause1339); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:565:16: ( NOTHING |det= infflowspeclist )
			int alt16=2;
			alt16 = dfa16.predict(input);
			switch (alt16) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:565:17: NOTHING
					{
					match(input,NOTHING,FOLLOW_NOTHING_in_determinesclause1342); if (state.failed) return result;
					if ( state.backtracking==0 ) {det=ImmutableSLList.<Term>nil();}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:565:62: det= infflowspeclist
					{
					pushFollow(FOLLOW_infflowspeclist_in_determinesclause1352);
					det=infflowspeclist();
					state._fsp--;
					if (state.failed) return result;
					}
					break;

			}

			match(input,BY,FOLLOW_BY_in_determinesclause1359); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:566:8: ( NOTHING | ( ITSELF ) |by= infflowspeclist )
			int alt17=3;
			alt17 = dfa17.predict(input);
			switch (alt17) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:566:9: NOTHING
					{
					match(input,NOTHING,FOLLOW_NOTHING_in_determinesclause1362); if (state.failed) return result;
					if ( state.backtracking==0 ) {by = ImmutableSLList.<Term>nil();}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:566:55: ( ITSELF )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:566:55: ( ITSELF )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:566:56: ITSELF
					{
					match(input,ITSELF,FOLLOW_ITSELF_in_determinesclause1369); if (state.failed) return result;
					if ( state.backtracking==0 ) {by = det;}
					}

					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:566:78: by= infflowspeclist
					{
					pushFollow(FOLLOW_infflowspeclist_in_determinesclause1380);
					by=infflowspeclist();
					state._fsp--;
					if (state.failed) return result;
					}
					break;

			}

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:567:5: ( ( DECLASSIFIES ( NOTHING |tmp= infflowspeclist ) ) | ( ERASES ( NOTHING |tmp= infflowspeclist ) ) | ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) ) )*
			loop21:
			while (true) {
				int alt21=4;
				switch ( input.LA(1) ) {
				case DECLASSIFIES:
					{
					alt21=1;
					}
					break;
				case ERASES:
					{
					alt21=2;
					}
					break;
				case NEW_OBJECTS:
					{
					alt21=3;
					}
					break;
				}
				switch (alt21) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:567:9: ( DECLASSIFIES ( NOTHING |tmp= infflowspeclist ) )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:567:9: ( DECLASSIFIES ( NOTHING |tmp= infflowspeclist ) )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:567:10: DECLASSIFIES ( NOTHING |tmp= infflowspeclist )
					{
					match(input,DECLASSIFIES,FOLLOW_DECLASSIFIES_in_determinesclause1392); if (state.failed) return result;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:567:23: ( NOTHING |tmp= infflowspeclist )
					int alt18=2;
					alt18 = dfa18.predict(input);
					switch (alt18) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:567:24: NOTHING
							{
							match(input,NOTHING,FOLLOW_NOTHING_in_determinesclause1395); if (state.failed) return result;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:567:34: tmp= infflowspeclist
							{
							pushFollow(FOLLOW_infflowspeclist_in_determinesclause1403);
							tmp=infflowspeclist();
							state._fsp--;
							if (state.failed) return result;
							if ( state.backtracking==0 ) {decl = decl.append(tmp);}
							}
							break;

					}

					}

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:568:9: ( ERASES ( NOTHING |tmp= infflowspeclist ) )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:568:9: ( ERASES ( NOTHING |tmp= infflowspeclist ) )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:568:10: ERASES ( NOTHING |tmp= infflowspeclist )
					{
					match(input,ERASES,FOLLOW_ERASES_in_determinesclause1420); if (state.failed) return result;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:568:17: ( NOTHING |tmp= infflowspeclist )
					int alt19=2;
					alt19 = dfa19.predict(input);
					switch (alt19) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:568:18: NOTHING
							{
							match(input,NOTHING,FOLLOW_NOTHING_in_determinesclause1423); if (state.failed) return result;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:568:28: tmp= infflowspeclist
							{
							pushFollow(FOLLOW_infflowspeclist_in_determinesclause1431);
							tmp=infflowspeclist();
							state._fsp--;
							if (state.failed) return result;
							if ( state.backtracking==0 ) {erases = erases.append(tmp);}
							}
							break;

					}

					}

					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:569:9: ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:569:9: ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:569:10: NEW_OBJECTS ( NOTHING |tmp= infflowspeclist )
					{
					match(input,NEW_OBJECTS,FOLLOW_NEW_OBJECTS_in_determinesclause1448); if (state.failed) return result;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:569:22: ( NOTHING |tmp= infflowspeclist )
					int alt20=2;
					alt20 = dfa20.predict(input);
					switch (alt20) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:569:23: NOTHING
							{
							match(input,NOTHING,FOLLOW_NOTHING_in_determinesclause1451); if (state.failed) return result;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:569:33: tmp= infflowspeclist
							{
							pushFollow(FOLLOW_infflowspeclist_in_determinesclause1459);
							tmp=infflowspeclist();
							state._fsp--;
							if (state.failed) return result;
							if ( state.backtracking==0 ) {newObs = newObs.append(tmp);}
							}
							break;

					}

					}

					}
					break;

				default :
					break loop21;
				}
			}

			if ( state.backtracking==0 ) {det = det.append(erases);
			     by = by.append(decl);
			     result = new InfFlowSpec(by, det, newObs);}
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "determinesclause"



	// $ANTLR start "loopdeterminesclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:577:1: loopdeterminesclause returns [InfFlowSpec result = InfFlowSpec.EMPTY_INF_FLOW_SPEC] : LOOP_DETERMINES ( NOTHING |det= infflowspeclist ) BY ITSELF ( ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) ) )* ;
	public final InfFlowSpec loopdeterminesclause() throws RecognitionException, SLTranslationException {
		InfFlowSpec result =  InfFlowSpec.EMPTY_INF_FLOW_SPEC;


		ImmutableList<Term> det =null;
		ImmutableList<Term> tmp =null;


		    ImmutableList<Term> newObs = ImmutableSLList.<Term>nil();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:581:5: ( LOOP_DETERMINES ( NOTHING |det= infflowspeclist ) BY ITSELF ( ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) ) )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:582:5: LOOP_DETERMINES ( NOTHING |det= infflowspeclist ) BY ITSELF ( ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) ) )*
			{
			match(input,LOOP_DETERMINES,FOLLOW_LOOP_DETERMINES_in_loopdeterminesclause1508); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:582:21: ( NOTHING |det= infflowspeclist )
			int alt22=2;
			alt22 = dfa22.predict(input);
			switch (alt22) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:582:22: NOTHING
					{
					match(input,NOTHING,FOLLOW_NOTHING_in_loopdeterminesclause1511); if (state.failed) return result;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:582:32: det= infflowspeclist
					{
					pushFollow(FOLLOW_infflowspeclist_in_loopdeterminesclause1519);
					det=infflowspeclist();
					state._fsp--;
					if (state.failed) return result;
					}
					break;

			}

			match(input,BY,FOLLOW_BY_in_loopdeterminesclause1526); if (state.failed) return result;
			match(input,ITSELF,FOLLOW_ITSELF_in_loopdeterminesclause1528); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:584:5: ( ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) ) )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==NEW_OBJECTS) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:584:9: ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:584:9: ( NEW_OBJECTS ( NOTHING |tmp= infflowspeclist ) )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:584:10: NEW_OBJECTS ( NOTHING |tmp= infflowspeclist )
					{
					match(input,NEW_OBJECTS,FOLLOW_NEW_OBJECTS_in_loopdeterminesclause1539); if (state.failed) return result;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:584:22: ( NOTHING |tmp= infflowspeclist )
					int alt23=2;
					alt23 = dfa23.predict(input);
					switch (alt23) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:584:23: NOTHING
							{
							match(input,NOTHING,FOLLOW_NOTHING_in_loopdeterminesclause1542); if (state.failed) return result;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:584:33: tmp= infflowspeclist
							{
							pushFollow(FOLLOW_infflowspeclist_in_loopdeterminesclause1550);
							tmp=infflowspeclist();
							state._fsp--;
							if (state.failed) return result;
							if ( state.backtracking==0 ) {newObs = newObs.append(tmp);}
							}
							break;

					}

					}

					}
					break;

				default :
					break loop24;
				}
			}

			if ( state.backtracking==0 ) {result = new InfFlowSpec(det, det, newObs);}
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "loopdeterminesclause"



	// $ANTLR start "infflowspeclist"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:590:1: infflowspeclist returns [ImmutableList<Term> result = ImmutableSLList.<Term>nil()] : term= termexpression ( COMMA term= termexpression )* ;
	public final ImmutableList<Term> infflowspeclist() throws RecognitionException, SLTranslationException {
		ImmutableList<Term> result =  ImmutableSLList.<Term>nil();


		Term term =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:591:5: (term= termexpression ( COMMA term= termexpression )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:592:5: term= termexpression ( COMMA term= termexpression )*
			{
			pushFollow(FOLLOW_termexpression_in_infflowspeclist1598);
			term=termexpression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result = result.append(term); }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:593:5: ( COMMA term= termexpression )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==COMMA) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:593:6: COMMA term= termexpression
					{
					match(input,COMMA,FOLLOW_COMMA_in_infflowspeclist1607); if (state.failed) return result;
					pushFollow(FOLLOW_termexpression_in_infflowspeclist1613);
					term=termexpression();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = result.append(term); }
					}
					break;

				default :
					break loop25;
				}
			}

			if ( state.backtracking==0 ) { result = translator.translate("infflowspeclist", ImmutableList.class, result, services); }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "infflowspeclist"



	// $ANTLR start "signalsclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:598:1: signalsclause returns [Term ret=null] : sig= SIGNALS LPAREN excType= referencetype (id= IDENT )? RPAREN (result= predornot )? ;
	public final Term signalsclause() throws RecognitionException, SLTranslationException {
		Term ret = null;


		Token sig=null;
		Token id=null;
		KeYJavaType excType =null;
		Term result =null;


		    Term pred = null;
		    String vName = null;
		    LogicVariable eVar = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:605:2: (sig= SIGNALS LPAREN excType= referencetype (id= IDENT )? RPAREN (result= predornot )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:606:2: sig= SIGNALS LPAREN excType= referencetype (id= IDENT )? RPAREN (result= predornot )?
			{
			sig=(Token)match(input,SIGNALS,FOLLOW_SIGNALS_in_signalsclause1661); if (state.failed) return ret;
			match(input,LPAREN,FOLLOW_LPAREN_in_signalsclause1663); if (state.failed) return ret;
			pushFollow(FOLLOW_referencetype_in_signalsclause1667);
			excType=referencetype();
			state._fsp--;
			if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:606:43: (id= IDENT )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==IDENT) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:606:44: id= IDENT
					{
					id=(Token)match(input,IDENT,FOLLOW_IDENT_in_signalsclause1672); if (state.failed) return ret;
					if ( state.backtracking==0 ) { vName = id.getText(); }
					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_signalsclause1678); if (state.failed) return ret;
			if ( state.backtracking==0 ) {
				    if (vName != null) {
					eVar = new LogicVariable(new Name(vName), excType.getSort());
					resolverManager.pushLocalVariablesNamespace();
					resolverManager.putIntoTopLocalVariablesNamespace(eVar, excType);
				    }
				}
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:614:2: (result= predornot )?
			int alt27=2;
			alt27 = dfa27.predict(input);
			switch (alt27) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:614:3: result= predornot
					{
					pushFollow(FOLLOW_predornot_in_signalsclause1689);
					result=predornot();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;

			}

			if ( state.backtracking==0 ) {
				    if (vName != null) {
					resolverManager.popLocalVariablesNamespace();
				    }
			            result = translator.translate(sig.getText(), Term.class, result, eVar, excVar, excType, services);
				}
			}

			if ( state.backtracking==0 ) {ret=result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "signalsclause"



	// $ANTLR start "signalsonlyclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:624:1: signalsonlyclause returns [Term result = null] : sigo= SIGNALS_ONLY ( NOTHING |rtype= referencetype ( COMMA rtype= referencetype )* ) ;
	public final Term signalsonlyclause() throws RecognitionException, SLTranslationException {
		Term result =  null;


		Token sigo=null;
		KeYJavaType rtype =null;


		    ImmutableList<KeYJavaType> typeList = ImmutableSLList.<KeYJavaType>nil();
		    KeYJavaType type = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:629:5: (sigo= SIGNALS_ONLY ( NOTHING |rtype= referencetype ( COMMA rtype= referencetype )* ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:630:5: sigo= SIGNALS_ONLY ( NOTHING |rtype= referencetype ( COMMA rtype= referencetype )* )
			{
			sigo=(Token)match(input,SIGNALS_ONLY,FOLLOW_SIGNALS_ONLY_in_signalsonlyclause1727); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:631:5: ( NOTHING |rtype= referencetype ( COMMA rtype= referencetype )* )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==NOTHING) ) {
				alt29=1;
			}
			else if ( (LA29_0==IDENT) ) {
				alt29=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:631:9: NOTHING
					{
					match(input,NOTHING,FOLLOW_NOTHING_in_signalsonlyclause1737); if (state.failed) return result;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:632:9: rtype= referencetype ( COMMA rtype= referencetype )*
					{
					pushFollow(FOLLOW_referencetype_in_signalsonlyclause1751);
					rtype=referencetype();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { typeList = typeList.append(rtype); }
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:633:9: ( COMMA rtype= referencetype )*
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==COMMA) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:633:10: COMMA rtype= referencetype
							{
							match(input,COMMA,FOLLOW_COMMA_in_signalsonlyclause1764); if (state.failed) return result;
							pushFollow(FOLLOW_referencetype_in_signalsonlyclause1770);
							rtype=referencetype();
							state._fsp--;
							if (state.failed) return result;
							if ( state.backtracking==0 ) { typeList = typeList.append(rtype); }
							}
							break;

						default :
							break loop28;
						}
					}

					}
					break;

			}

			if ( state.backtracking==0 ) { result = translator.translate(sigo.getText(), Term.class, typeList, this.excVar, services); }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "signalsonlyclause"



	// $ANTLR start "termexpression"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:639:1: termexpression returns [Term result = null] : exp= expression ;
	public final Term termexpression() throws RecognitionException, SLTranslationException {
		Term result =  null;


		SLExpression exp =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:640:5: (exp= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:641:5: exp= expression
			{
			pushFollow(FOLLOW_expression_in_termexpression1814);
			exp=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result = (Term) exp.getTerm(); }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "termexpression"



	// $ANTLR start "breaksclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:645:1: breaksclause returns [Pair result=null] : breaks= BREAKS LPAREN (id= IDENT )? RPAREN (pred= predornot )? ;
	public final Pair breaksclause() throws RecognitionException, SLTranslationException {
		Pair result = null;


		Token breaks=null;
		Token id=null;
		Term pred =null;


		    String label = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:649:2: (breaks= BREAKS LPAREN (id= IDENT )? RPAREN (pred= predornot )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:650:2: breaks= BREAKS LPAREN (id= IDENT )? RPAREN (pred= predornot )?
			{
			breaks=(Token)match(input,BREAKS,FOLLOW_BREAKS_in_breaksclause1846); if (state.failed) return result;
			match(input,LPAREN,FOLLOW_LPAREN_in_breaksclause1848); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:650:23: (id= IDENT )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==IDENT) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:650:24: id= IDENT
					{
					id=(Token)match(input,IDENT,FOLLOW_IDENT_in_breaksclause1853); if (state.failed) return result;
					if ( state.backtracking==0 ) { label = id.getText(); }
					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_breaksclause1859); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:651:2: (pred= predornot )?
			int alt31=2;
			alt31 = dfa31.predict(input);
			switch (alt31) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:651:3: pred= predornot
					{
					pushFollow(FOLLOW_predornot_in_breaksclause1867);
					pred=predornot();
					state._fsp--;
					if (state.failed) return result;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			        result = translator.translate(breaks.getText(), Pair.class, pred, label, services);
				}
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "breaksclause"



	// $ANTLR start "continuesclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:658:1: continuesclause returns [Pair result=null] : continues= CONTINUES LPAREN (id= IDENT )? RPAREN (pred= predornot )? ;
	public final Pair continuesclause() throws RecognitionException, SLTranslationException {
		Pair result = null;


		Token continues=null;
		Token id=null;
		Term pred =null;


		    String label = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:662:2: (continues= CONTINUES LPAREN (id= IDENT )? RPAREN (pred= predornot )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:663:2: continues= CONTINUES LPAREN (id= IDENT )? RPAREN (pred= predornot )?
			{
			continues=(Token)match(input,CONTINUES,FOLLOW_CONTINUES_in_continuesclause1898); if (state.failed) return result;
			match(input,LPAREN,FOLLOW_LPAREN_in_continuesclause1900); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:663:29: (id= IDENT )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==IDENT) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:663:30: id= IDENT
					{
					id=(Token)match(input,IDENT,FOLLOW_IDENT_in_continuesclause1905); if (state.failed) return result;
					if ( state.backtracking==0 ) { label = id.getText(); }
					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_continuesclause1911); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:664:2: (pred= predornot )?
			int alt33=2;
			alt33 = dfa33.predict(input);
			switch (alt33) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:664:3: pred= predornot
					{
					pushFollow(FOLLOW_predornot_in_continuesclause1919);
					pred=predornot();
					state._fsp--;
					if (state.failed) return result;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			        result = translator.translate(continues.getText(), Pair.class, pred, label, services);
				}
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "continuesclause"



	// $ANTLR start "returnsclause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:671:1: returnsclause returns [Term ret=null] : rtrns= RETURNS (result= predornot )? ;
	public final Term returnsclause() throws RecognitionException, SLTranslationException {
		Term ret = null;


		Token rtrns=null;
		Term result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:673:2: (rtrns= RETURNS (result= predornot )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:674:2: rtrns= RETURNS (result= predornot )?
			{
			rtrns=(Token)match(input,RETURNS,FOLLOW_RETURNS_in_returnsclause1950); if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:675:2: (result= predornot )?
			int alt34=2;
			alt34 = dfa34.predict(input);
			switch (alt34) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:675:3: result= predornot
					{
					pushFollow(FOLLOW_predornot_in_returnsclause1958);
					result=predornot();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			        result = translator.translate(rtrns.getText(), Term.class, result, services);
				}
			}

			if ( state.backtracking==0 ) {ret=result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "returnsclause"



	// $ANTLR start "storeRefUnion"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:682:1: storeRefUnion returns [Term result = null] : list= storeRefList ;
	public final Term storeRefUnion() throws RecognitionException, SLTranslationException {
		Term result =  null;


		ImmutableList<Term> list =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:683:5: (list= storeRefList )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:683:5: list= storeRefList
			{
			pushFollow(FOLLOW_storeRefList_in_storeRefUnion1991);
			list=storeRefList();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result = tb.union(list); }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "storeRefUnion"



	// $ANTLR start "storeRefList"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:687:1: storeRefList returns [ImmutableList<Term> result = ImmutableSLList.<Term>nil()] : t= storeref ( COMMA t= storeref )* ;
	public final ImmutableList<Term> storeRefList() throws RecognitionException, SLTranslationException {
		ImmutableList<Term> result =  ImmutableSLList.<Term>nil();


		Term t =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:688:5: (t= storeref ( COMMA t= storeref )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:688:5: t= storeref ( COMMA t= storeref )*
			{
			pushFollow(FOLLOW_storeref_in_storeRefList2020);
			t=storeref();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result = result.append(t); }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:689:2: ( COMMA t= storeref )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==COMMA) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:689:3: COMMA t= storeref
					{
					match(input,COMMA,FOLLOW_COMMA_in_storeRefList2026); if (state.failed) return result;
					pushFollow(FOLLOW_storeref_in_storeRefList2032);
					t=storeref();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = result.append(t); }
					}
					break;

				default :
					break loop35;
				}
			}

			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "storeRefList"



	// $ANTLR start "storeRefIntersect"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:693:1: storeRefIntersect returns [Term result = null] : list= storeRefList ;
	public final Term storeRefIntersect() throws RecognitionException, SLTranslationException {
		Term result =  null;


		ImmutableList<Term> list =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:694:5: (list= storeRefList )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:694:5: list= storeRefList
			{
			pushFollow(FOLLOW_storeRefList_in_storeRefIntersect2061);
			list=storeRefList();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result = tb.intersect(list); }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "storeRefIntersect"



	// $ANTLR start "storeref"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:697:1: storeref returns [Term ret = null] : ( NOTHING | EVERYTHING | NOT_SPECIFIED |result= storeRefExpr );
	public final Term storeref() throws RecognitionException, SLTranslationException {
		Term ret =  null;


		Term result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:699:9: ( NOTHING | EVERYTHING | NOT_SPECIFIED |result= storeRefExpr )
			int alt36=4;
			alt36 = dfa36.predict(input);
			switch (alt36) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:699:9: NOTHING
					{
					match(input,NOTHING,FOLLOW_NOTHING_in_storeref2090); if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = tb.empty(); }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:700:9: EVERYTHING
					{
					match(input,EVERYTHING,FOLLOW_EVERYTHING_in_storeref2102); if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = tb.createdLocs(); }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:701:9: NOT_SPECIFIED
					{
					match(input,NOT_SPECIFIED,FOLLOW_NOT_SPECIFIED_in_storeref2114); if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = tb.createdLocs(); }
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:702:9: result= storeRefExpr
					{
					pushFollow(FOLLOW_storeRefExpr_in_storeref2130);
					result=storeRefExpr();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;

			}
			if ( state.backtracking==0 ) {ret=result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "storeref"



	// $ANTLR start "createLocset"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:705:1: createLocset returns [Term result = null] : ( LOCSET | SINGLETON ) LPAREN list= exprList RPAREN ;
	public final Term createLocset() throws RecognitionException, SLTranslationException {
		Term result =  null;


		ImmutableList<SLExpression> list =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:706:5: ( ( LOCSET | SINGLETON ) LPAREN list= exprList RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:707:5: ( LOCSET | SINGLETON ) LPAREN list= exprList RPAREN
			{
			if ( input.LA(1)==LOCSET||input.LA(1)==SINGLETON ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return result;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,LPAREN,FOLLOW_LPAREN_in_createLocset2159); if (state.failed) return result;
			pushFollow(FOLLOW_exprList_in_createLocset2163);
			list=exprList();
			state._fsp--;
			if (state.failed) return result;
			match(input,RPAREN,FOLLOW_RPAREN_in_createLocset2165); if (state.failed) return result;
			if ( state.backtracking==0 ) {
			        result = translator.translate("create locset", Term.class, list, services);
			    }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "createLocset"



	// $ANTLR start "exprList"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:714:1: exprList returns [ImmutableList<SLExpression> result = ImmutableSLList.<SLExpression>nil()] : expr= expression ( COMMA expr= expression )* ;
	public final ImmutableList<SLExpression> exprList() throws RecognitionException, SLTranslationException {
		ImmutableList<SLExpression> result =  ImmutableSLList.<SLExpression>nil();


		SLExpression expr =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:715:5: (expr= expression ( COMMA expr= expression )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:715:5: expr= expression ( COMMA expr= expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList2199);
			expr=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result = result.append(expr); }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:716:2: ( COMMA expr= expression )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==COMMA) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:716:3: COMMA expr= expression
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprList2205); if (state.failed) return result;
					pushFollow(FOLLOW_expression_in_exprList2211);
					expr=expression();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = result.append(expr); }
					}
					break;

				default :
					break loop37;
				}
			}

			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "exprList"



	// $ANTLR start "storeRefExpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:719:1: storeRefExpr returns [Term result = null] : expr= expression ;
	public final Term storeRefExpr() throws RecognitionException, SLTranslationException {
		Term result =  null;


		SLExpression expr =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:720:5: (expr= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:721:5: expr= expression
			{
			pushFollow(FOLLOW_expression_in_storeRefExpr2239);
			expr=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
			        result = translator.translate("store_ref_expr", Term.class, expr, services);
			    }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "storeRefExpr"



	// $ANTLR start "specarrayrefexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:728:1: specarrayrefexpr[SLExpression receiver, String fullyQualifiedName, Token lbrack] returns [SLExpression result = null] : ( (rangeFrom= expression ( DOTDOT rangeTo= expression )? ) | MULT ) ;
	public final SLExpression specarrayrefexpr(SLExpression receiver, String fullyQualifiedName, Token lbrack) throws RecognitionException, SLTranslationException {
		SLExpression result =  null;


		SLExpression rangeFrom =null;
		SLExpression rangeTo =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:731:5: ( ( (rangeFrom= expression ( DOTDOT rangeTo= expression )? ) | MULT ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:732:5: ( (rangeFrom= expression ( DOTDOT rangeTo= expression )? ) | MULT )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:732:5: ( (rangeFrom= expression ( DOTDOT rangeTo= expression )? ) | MULT )
			int alt39=2;
			alt39 = dfa39.predict(input);
			switch (alt39) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:733:2: (rangeFrom= expression ( DOTDOT rangeTo= expression )? )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:733:2: (rangeFrom= expression ( DOTDOT rangeTo= expression )? )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:733:4: rangeFrom= expression ( DOTDOT rangeTo= expression )?
					{
					pushFollow(FOLLOW_expression_in_specarrayrefexpr2309);
					rangeFrom=expression();
					state._fsp--;
					if (state.failed) return result;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:733:25: ( DOTDOT rangeTo= expression )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==DOTDOT) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:733:26: DOTDOT rangeTo= expression
							{
							match(input,DOTDOT,FOLLOW_DOTDOT_in_specarrayrefexpr2312); if (state.failed) return result;
							pushFollow(FOLLOW_expression_in_specarrayrefexpr2316);
							rangeTo=expression();
							state._fsp--;
							if (state.failed) return result;
							}
							break;

					}

					}

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:734:4: MULT
					{
					match(input,MULT,FOLLOW_MULT_in_specarrayrefexpr2325); if (state.failed) return result;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			        result = translator.translate("array reference", SLExpression.class, services, receiver, fullyQualifiedName, lbrack, rangeFrom, rangeTo);
			    }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "specarrayrefexpr"



	// $ANTLR start "predornot"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:742:1: predornot returns [Term ret=null] : (result= predicate |n= NOT_SPECIFIED | SAME );
	public final Term predornot() throws RecognitionException, SLTranslationException {
		Term ret = null;


		Token n=null;
		Term result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:744:2: (result= predicate |n= NOT_SPECIFIED | SAME )
			int alt40=3;
			alt40 = dfa40.predict(input);
			switch (alt40) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:745:2: result= predicate
					{
					pushFollow(FOLLOW_predicate_in_predornot2362);
					result=predicate();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:746:9: n= NOT_SPECIFIED
					{
					n=(Token)match(input,NOT_SPECIFIED,FOLLOW_NOT_SPECIFIED_in_predornot2374); if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = translator.createSkolemExprBool(n).getTerm(); }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:748:9: SAME
					{
					match(input,SAME,FOLLOW_SAME_in_predornot2394); if (state.failed) return ret;
					}
					break;

			}
			if ( state.backtracking==0 ) { ret = result; }
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "predornot"



	// $ANTLR start "predicate"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:751:1: predicate returns [Term result=null] : expr= expression ;
	public final Term predicate() throws RecognitionException, SLTranslationException {
		Term result = null;


		SLExpression expr =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:752:2: (expr= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:753:2: expr= expression
			{
			pushFollow(FOLLOW_expression_in_predicate2418);
			expr=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
				    if(!expr.isTerm() && expr.getTerm().sort() == Sort.FORMULA) {
				        raiseError("Expected a formula: " + expr);
				    }
				    result = expr.getTerm();
				}
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "predicate"



	// $ANTLR start "expression"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:763:1: expression returns [SLExpression ret=null] : result= conditionalexpr ;
	public final SLExpression expression() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		SLExpression result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:764:2: (result= conditionalexpr )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:765:2: result= conditionalexpr
			{
			pushFollow(FOLLOW_conditionalexpr_in_expression2446);
			result=conditionalexpr();
			state._fsp--;
			if (state.failed) return ret;
			if ( state.backtracking==0 ) {
				    if(!result.isTerm()) {
				        raiseError("Expected a term: " + result);
				    }
				    ret = result;
				}
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "expression"



	// $ANTLR start "conditionalexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:774:1: conditionalexpr returns [SLExpression ret=null] : result= equivalenceexpr ( QUESTIONMARK a= conditionalexpr COLON b= conditionalexpr )? ;
	public final SLExpression conditionalexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		SLExpression result =null;
		SLExpression a =null;
		SLExpression b =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:776:2: (result= equivalenceexpr ( QUESTIONMARK a= conditionalexpr COLON b= conditionalexpr )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:777:2: result= equivalenceexpr ( QUESTIONMARK a= conditionalexpr COLON b= conditionalexpr )?
			{
			pushFollow(FOLLOW_equivalenceexpr_in_conditionalexpr2477);
			result=equivalenceexpr();
			state._fsp--;
			if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:778:2: ( QUESTIONMARK a= conditionalexpr COLON b= conditionalexpr )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==QUESTIONMARK) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:779:6: QUESTIONMARK a= conditionalexpr COLON b= conditionalexpr
					{
					match(input,QUESTIONMARK,FOLLOW_QUESTIONMARK_in_conditionalexpr2487); if (state.failed) return ret;
					pushFollow(FOLLOW_conditionalexpr_in_conditionalexpr2491);
					a=conditionalexpr();
					state._fsp--;
					if (state.failed) return ret;
					match(input,COLON,FOLLOW_COLON_in_conditionalexpr2493); if (state.failed) return ret;
					pushFollow(FOLLOW_conditionalexpr_in_conditionalexpr2497);
					b=conditionalexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    	result = translator.translate(JMLTranslator.JMLKeyWord.CONDITIONAL, services, result, a, b);
						    }
					}
					break;

			}

			}

			if ( state.backtracking==0 ) {ret=result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "conditionalexpr"



	// $ANTLR start "equivalenceexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:787:1: equivalenceexpr returns [SLExpression ret=null] : result= impliesexpr (eq= EQV_ANTIV right= impliesexpr )* ;
	public final SLExpression equivalenceexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		Token eq=null;
		SLExpression result =null;
		SLExpression right =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:789:2: (result= impliesexpr (eq= EQV_ANTIV right= impliesexpr )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:790:2: result= impliesexpr (eq= EQV_ANTIV right= impliesexpr )*
			{
			pushFollow(FOLLOW_impliesexpr_in_equivalenceexpr2539);
			result=impliesexpr();
			state._fsp--;
			if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:791:9: (eq= EQV_ANTIV right= impliesexpr )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==EQV_ANTIV) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:791:13: eq= EQV_ANTIV right= impliesexpr
					{
					eq=(Token)match(input,EQV_ANTIV,FOLLOW_EQV_ANTIV_in_equivalenceexpr2555); if (state.failed) return ret;
					pushFollow(FOLLOW_impliesexpr_in_equivalenceexpr2559);
					right=impliesexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = translator.translate(eq.getText(), SLExpression.class, result, right, services); }
					}
					break;

				default :
					break loop42;
				}
			}

			}

			if ( state.backtracking==0 ) {ret=result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "equivalenceexpr"



	// $ANTLR start "impliesexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:800:1: impliesexpr returns [SLExpression ret=null] : result= logicalorexpr ( IMPLIES expr= impliesforwardexpr | ( IMPLIESBACKWARD expr= logicalorexpr )+ )? ;
	public final SLExpression impliesexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		SLExpression result =null;
		SLExpression expr =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:802:2: (result= logicalorexpr ( IMPLIES expr= impliesforwardexpr | ( IMPLIESBACKWARD expr= logicalorexpr )+ )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:803:2: result= logicalorexpr ( IMPLIES expr= impliesforwardexpr | ( IMPLIESBACKWARD expr= logicalorexpr )+ )?
			{
			pushFollow(FOLLOW_logicalorexpr_in_impliesexpr2614);
			result=logicalorexpr();
			state._fsp--;
			if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:804:2: ( IMPLIES expr= impliesforwardexpr | ( IMPLIESBACKWARD expr= logicalorexpr )+ )?
			int alt44=3;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==IMPLIES) ) {
				alt44=1;
			}
			else if ( (LA44_0==IMPLIESBACKWARD) ) {
				alt44=2;
			}
			switch (alt44) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:805:6: IMPLIES expr= impliesforwardexpr
					{
					match(input,IMPLIES,FOLLOW_IMPLIES_in_impliesexpr2624); if (state.failed) return ret;
					pushFollow(FOLLOW_impliesforwardexpr_in_impliesexpr2628);
					expr=impliesforwardexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
							result = new SLExpression(tb.imp(tb.convertToFormula(result.getTerm()),
							                                 tb.convertToFormula(expr.getTerm())));
						    }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:812:6: ( IMPLIESBACKWARD expr= logicalorexpr )+
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:812:6: ( IMPLIESBACKWARD expr= logicalorexpr )+
					int cnt43=0;
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==IMPLIESBACKWARD) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:813:3: IMPLIESBACKWARD expr= logicalorexpr
							{
							match(input,IMPLIESBACKWARD,FOLLOW_IMPLIESBACKWARD_in_impliesexpr2652); if (state.failed) return ret;
							pushFollow(FOLLOW_logicalorexpr_in_impliesexpr2656);
							expr=logicalorexpr();
							state._fsp--;
							if (state.failed) return ret;
							if ( state.backtracking==0 ) {
									result = new SLExpression(tb.imp(tb.convertToFormula(expr.getTerm()),
									                                 tb.convertToFormula(result.getTerm())));
									}
							}
							break;

						default :
							if ( cnt43 >= 1 ) break loop43;
							if (state.backtracking>0) {state.failed=true; return ret;}
							EarlyExitException eee = new EarlyExitException(43, input);
							throw eee;
						}
						cnt43++;
					}

					}
					break;

			}

			}

			if ( state.backtracking==0 ) {ret=result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "impliesexpr"



	// $ANTLR start "impliesforwardexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:822:1: impliesforwardexpr returns [SLExpression ret=null] : result= logicalorexpr ( IMPLIES expr= impliesforwardexpr )? ;
	public final SLExpression impliesforwardexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		SLExpression result =null;
		SLExpression expr =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:824:2: (result= logicalorexpr ( IMPLIES expr= impliesforwardexpr )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:825:2: result= logicalorexpr ( IMPLIES expr= impliesforwardexpr )?
			{
			pushFollow(FOLLOW_logicalorexpr_in_impliesforwardexpr2696);
			result=logicalorexpr();
			state._fsp--;
			if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:826:2: ( IMPLIES expr= impliesforwardexpr )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==IMPLIES) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:827:6: IMPLIES expr= impliesforwardexpr
					{
					match(input,IMPLIES,FOLLOW_IMPLIES_in_impliesforwardexpr2706); if (state.failed) return ret;
					pushFollow(FOLLOW_impliesforwardexpr_in_impliesforwardexpr2710);
					expr=impliesforwardexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
							result = new SLExpression(tb.imp(tb.convertToFormula(result.getTerm()),
							                                 tb.convertToFormula(expr.getTerm())));
						    }
					}
					break;

			}

			}

			if ( state.backtracking==0 ) {ret=result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "impliesforwardexpr"



	// $ANTLR start "logicalorexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:835:1: logicalorexpr returns [SLExpression ret=null] : result= logicalandexpr ( LOGICALOR expr= logicalandexpr )* ;
	public final SLExpression logicalorexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		SLExpression result =null;
		SLExpression expr =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:837:2: (result= logicalandexpr ( LOGICALOR expr= logicalandexpr )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:838:2: result= logicalandexpr ( LOGICALOR expr= logicalandexpr )*
			{
			pushFollow(FOLLOW_logicalandexpr_in_logicalorexpr2745);
			result=logicalandexpr();
			state._fsp--;
			if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:839:2: ( LOGICALOR expr= logicalandexpr )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==LOGICALOR) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:840:6: LOGICALOR expr= logicalandexpr
					{
					match(input,LOGICALOR,FOLLOW_LOGICALOR_in_logicalorexpr2755); if (state.failed) return ret;
					pushFollow(FOLLOW_logicalandexpr_in_logicalorexpr2759);
					expr=logicalandexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						        result = new SLExpression(tb.orSC(tb.convertToFormula(result.getTerm()),
					                                                  tb.convertToFormula(expr.getTerm())));
						    }
					}
					break;

				default :
					break loop46;
				}
			}

			}

			if ( state.backtracking==0 ) {ret=result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "logicalorexpr"



	// $ANTLR start "logicalandexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:848:1: logicalandexpr returns [SLExpression ret=null] : result= inclusiveorexpr ( LOGICALAND expr= inclusiveorexpr )* ;
	public final SLExpression logicalandexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		SLExpression result =null;
		SLExpression expr =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:850:2: (result= inclusiveorexpr ( LOGICALAND expr= inclusiveorexpr )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:851:2: result= inclusiveorexpr ( LOGICALAND expr= inclusiveorexpr )*
			{
			pushFollow(FOLLOW_inclusiveorexpr_in_logicalandexpr2794);
			result=inclusiveorexpr();
			state._fsp--;
			if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:852:2: ( LOGICALAND expr= inclusiveorexpr )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==LOGICALAND) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:853:6: LOGICALAND expr= inclusiveorexpr
					{
					match(input,LOGICALAND,FOLLOW_LOGICALAND_in_logicalandexpr2804); if (state.failed) return ret;
					pushFollow(FOLLOW_inclusiveorexpr_in_logicalandexpr2808);
					expr=inclusiveorexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
							result = new SLExpression(tb.andSC(tb.convertToFormula(result.getTerm()),
					                                                   tb.convertToFormula(expr.getTerm())));
						    }
					}
					break;

				default :
					break loop47;
				}
			}

			}

			if ( state.backtracking==0 ) {ret=result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "logicalandexpr"



	// $ANTLR start "inclusiveorexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:862:1: inclusiveorexpr returns [SLExpression ret=null] : result= exclusiveorexpr ( INCLUSIVEOR expr= exclusiveorexpr )* ;
	public final SLExpression inclusiveorexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		SLExpression result =null;
		SLExpression expr =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:864:2: (result= exclusiveorexpr ( INCLUSIVEOR expr= exclusiveorexpr )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:865:2: result= exclusiveorexpr ( INCLUSIVEOR expr= exclusiveorexpr )*
			{
			pushFollow(FOLLOW_exclusiveorexpr_in_inclusiveorexpr2844);
			result=exclusiveorexpr();
			state._fsp--;
			if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:866:2: ( INCLUSIVEOR expr= exclusiveorexpr )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==INCLUSIVEOR) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:867:6: INCLUSIVEOR expr= exclusiveorexpr
					{
					match(input,INCLUSIVEOR,FOLLOW_INCLUSIVEOR_in_inclusiveorexpr2854); if (state.failed) return ret;
					pushFollow(FOLLOW_exclusiveorexpr_in_inclusiveorexpr2858);
					expr=exclusiveorexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						       if(intHelper.isIntegerTerm(result)) {
					                   result = intHelper.buildPromotedOrExpression(result,expr);
					               } else {
					                   result = new SLExpression(tb.or(tb.convertToFormula(result.getTerm()),
					                                                   tb.convertToFormula(expr.getTerm())));
					               }
						    }
					}
					break;

				default :
					break loop48;
				}
			}

			}

			if ( state.backtracking==0 ) {ret=result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "inclusiveorexpr"



	// $ANTLR start "exclusiveorexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:880:1: exclusiveorexpr returns [SLExpression ret=null] : result= andexpr ( XOR expr= andexpr )* ;
	public final SLExpression exclusiveorexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		SLExpression result =null;
		SLExpression expr =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:882:2: (result= andexpr ( XOR expr= andexpr )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:883:2: result= andexpr ( XOR expr= andexpr )*
			{
			pushFollow(FOLLOW_andexpr_in_exclusiveorexpr2894);
			result=andexpr();
			state._fsp--;
			if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:884:2: ( XOR expr= andexpr )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==XOR) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:885:6: XOR expr= andexpr
					{
					match(input,XOR,FOLLOW_XOR_in_exclusiveorexpr2904); if (state.failed) return ret;
					pushFollow(FOLLOW_andexpr_in_exclusiveorexpr2908);
					expr=andexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						       if(intHelper.isIntegerTerm(result)) {
					                   result = intHelper.buildPromotedXorExpression(result,expr);
					               } else {
					                   Term resultFormula = tb.convertToFormula(result.getTerm());
					                   Term exprFormula = tb.convertToFormula(expr.getTerm());
					                   result = new SLExpression(tb.or(tb.and(resultFormula, tb.not(exprFormula)),
					                                                   tb.and(tb.not(resultFormula), exprFormula)));
					               }
						    }
					}
					break;

				default :
					break loop49;
				}
			}

			}

			if ( state.backtracking==0 ) {ret=result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "exclusiveorexpr"



	// $ANTLR start "andexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:900:1: andexpr returns [SLExpression ret=null] : result= equalityexpr ( AND expr= equalityexpr )* ;
	public final SLExpression andexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		SLExpression result =null;
		SLExpression expr =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:902:2: (result= equalityexpr ( AND expr= equalityexpr )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:903:2: result= equalityexpr ( AND expr= equalityexpr )*
			{
			pushFollow(FOLLOW_equalityexpr_in_andexpr2944);
			result=equalityexpr();
			state._fsp--;
			if (state.failed) return ret;
			if ( state.backtracking==0 ) {
				    if(!result.isTerm()) {
					raiseError("Found a type where only a term is allowed: "
						   + result);
				    }
				}
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:910:2: ( AND expr= equalityexpr )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==AND) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:911:6: AND expr= equalityexpr
					{
					match(input,AND,FOLLOW_AND_in_andexpr2957); if (state.failed) return ret;
					pushFollow(FOLLOW_equalityexpr_in_andexpr2961);
					expr=equalityexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						       if(intHelper.isIntegerTerm(result)) {
					                   result = intHelper.buildPromotedAndExpression(result, expr);
					               } else {
					                   result = new SLExpression(tb.and(tb.convertToFormula(result.getTerm()),
					                                                    tb.convertToFormula(expr.getTerm())));
					               }
						    }
					}
					break;

				default :
					break loop50;
				}
			}

			}

			if ( state.backtracking==0 ) {ret=result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "andexpr"



	// $ANTLR start "equalityexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:923:1: equalityexpr returns [SLExpression ret=null] : result= relationalexpr (eq= EQ_NEQ right= relationalexpr )* ;
	public final SLExpression equalityexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		Token eq=null;
		SLExpression result =null;
		SLExpression right =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:925:3: (result= relationalexpr (eq= EQ_NEQ right= relationalexpr )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:926:2: result= relationalexpr (eq= EQ_NEQ right= relationalexpr )*
			{
			pushFollow(FOLLOW_relationalexpr_in_equalityexpr2998);
			result=relationalexpr();
			state._fsp--;
			if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:927:2: (eq= EQ_NEQ right= relationalexpr )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==EQ_NEQ) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:927:6: eq= EQ_NEQ right= relationalexpr
					{
					eq=(Token)match(input,EQ_NEQ,FOLLOW_EQ_NEQ_in_equalityexpr3007); if (state.failed) return ret;
					pushFollow(FOLLOW_relationalexpr_in_equalityexpr3011);
					right=relationalexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = translator.translate(eq.getText(), SLExpression.class, result, right, services); }
					}
					break;

				default :
					break loop51;
				}
			}

			}

			if ( state.backtracking==0 ) {ret=result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "equalityexpr"



	// $ANTLR start "relationalexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:932:1: relationalexpr returns [SLExpression ret=null] : result= shiftexpr (lt= LT right= shiftexpr ( LT right2= shiftexpr )? |gt= GT right= shiftexpr |leq= LEQ right= shiftexpr ( LT right2= shiftexpr )? |geq= GEQ right= shiftexpr |llt= LOCKSET_LT right= postfixexpr |lleq= LOCKSET_LEQ right= postfixexpr |io= INSTANCEOF rtype= typespec |st= ST right= shiftexpr )? ;
	public final SLExpression relationalexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		Token lt=null;
		Token gt=null;
		Token leq=null;
		Token geq=null;
		Token llt=null;
		Token lleq=null;
		Token io=null;
		Token st=null;
		SLExpression result =null;
		SLExpression right =null;
		SLExpression right2 =null;
		KeYJavaType rtype =null;


		    Function f = null;
		    KeYJavaType type = null;
		    Token opToken = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:939:2: (result= shiftexpr (lt= LT right= shiftexpr ( LT right2= shiftexpr )? |gt= GT right= shiftexpr |leq= LEQ right= shiftexpr ( LT right2= shiftexpr )? |geq= GEQ right= shiftexpr |llt= LOCKSET_LT right= postfixexpr |lleq= LOCKSET_LEQ right= postfixexpr |io= INSTANCEOF rtype= typespec |st= ST right= shiftexpr )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:940:2: result= shiftexpr (lt= LT right= shiftexpr ( LT right2= shiftexpr )? |gt= GT right= shiftexpr |leq= LEQ right= shiftexpr ( LT right2= shiftexpr )? |geq= GEQ right= shiftexpr |llt= LOCKSET_LT right= postfixexpr |lleq= LOCKSET_LEQ right= postfixexpr |io= INSTANCEOF rtype= typespec |st= ST right= shiftexpr )?
			{
			pushFollow(FOLLOW_shiftexpr_in_relationalexpr3055);
			result=shiftexpr();
			state._fsp--;
			if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:941:2: (lt= LT right= shiftexpr ( LT right2= shiftexpr )? |gt= GT right= shiftexpr |leq= LEQ right= shiftexpr ( LT right2= shiftexpr )? |geq= GEQ right= shiftexpr |llt= LOCKSET_LT right= postfixexpr |lleq= LOCKSET_LEQ right= postfixexpr |io= INSTANCEOF rtype= typespec |st= ST right= shiftexpr )?
			int alt54=9;
			switch ( input.LA(1) ) {
				case LT:
					{
					alt54=1;
					}
					break;
				case GT:
					{
					alt54=2;
					}
					break;
				case LEQ:
					{
					alt54=3;
					}
					break;
				case GEQ:
					{
					alt54=4;
					}
					break;
				case LOCKSET_LT:
					{
					alt54=5;
					}
					break;
				case LOCKSET_LEQ:
					{
					alt54=6;
					}
					break;
				case INSTANCEOF:
					{
					alt54=7;
					}
					break;
				case ST:
					{
					alt54=8;
					}
					break;
			}
			switch (alt54) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:942:6: lt= LT right= shiftexpr ( LT right2= shiftexpr )?
					{
					lt=(Token)match(input,LT,FOLLOW_LT_in_relationalexpr3067); if (state.failed) return ret;
					pushFollow(FOLLOW_shiftexpr_in_relationalexpr3071);
					right=shiftexpr();
					state._fsp--;
					if (state.failed) return ret;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:944:6: ( LT right2= shiftexpr )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==LT) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:944:8: LT right2= shiftexpr
							{
							match(input,LT,FOLLOW_LT_in_relationalexpr3087); if (state.failed) return ret;
							pushFollow(FOLLOW_shiftexpr_in_relationalexpr3091);
							right2=shiftexpr();
							state._fsp--;
							if (state.failed) return ret;
							}
							break;

					}

					if ( state.backtracking==0 ) {
							f = intLDT.getLessThan();
							opToken = lt;
						    }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:950:6: gt= GT right= shiftexpr
					{
					gt=(Token)match(input,GT,FOLLOW_GT_in_relationalexpr3113); if (state.failed) return ret;
					pushFollow(FOLLOW_shiftexpr_in_relationalexpr3117);
					right=shiftexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
							f = intLDT.getGreaterThan();
							opToken = gt;
						    }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:956:6: leq= LEQ right= shiftexpr ( LT right2= shiftexpr )?
					{
					leq=(Token)match(input,LEQ,FOLLOW_LEQ_in_relationalexpr3136); if (state.failed) return ret;
					pushFollow(FOLLOW_shiftexpr_in_relationalexpr3140);
					right=shiftexpr();
					state._fsp--;
					if (state.failed) return ret;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:958:6: ( LT right2= shiftexpr )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==LT) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:958:8: LT right2= shiftexpr
							{
							match(input,LT,FOLLOW_LT_in_relationalexpr3155); if (state.failed) return ret;
							pushFollow(FOLLOW_shiftexpr_in_relationalexpr3159);
							right2=shiftexpr();
							state._fsp--;
							if (state.failed) return ret;
							}
							break;

					}

					if ( state.backtracking==0 ) {
							f = intLDT.getLessOrEquals();
							opToken = leq;
						    }
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:964:6: geq= GEQ right= shiftexpr
					{
					geq=(Token)match(input,GEQ,FOLLOW_GEQ_in_relationalexpr3181); if (state.failed) return ret;
					pushFollow(FOLLOW_shiftexpr_in_relationalexpr3185);
					right=shiftexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
							f = intLDT.getGreaterOrEquals();
							opToken = geq;
						    }
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:970:6: llt= LOCKSET_LT right= postfixexpr
					{
					llt=(Token)match(input,LOCKSET_LT,FOLLOW_LOCKSET_LT_in_relationalexpr3204); if (state.failed) return ret;
					pushFollow(FOLLOW_postfixexpr_in_relationalexpr3208);
					right=postfixexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						        addIgnoreWarning("Lockset ordering is not supported",llt);
						        final Sort objSort = services.getJavaInfo().getJavaLangObject().getSort();
						        f = new Function(new Name("lockset_lt"), Sort.FORMULA, objSort, objSort);
						        opToken = llt;
						    }
					}
					break;
				case 6 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:978:6: lleq= LOCKSET_LEQ right= postfixexpr
					{
					lleq=(Token)match(input,LOCKSET_LEQ,FOLLOW_LOCKSET_LEQ_in_relationalexpr3227); if (state.failed) return ret;
					pushFollow(FOLLOW_postfixexpr_in_relationalexpr3231);
					right=postfixexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						        addIgnoreWarning("Lockset ordering is not supported",lleq);
						        final Sort objSort = services.getJavaInfo().getJavaLangObject().getSort();
						        f = new Function(new Name("lockset_leq"), Sort.FORMULA, objSort, objSort);
						        opToken = lleq;
						    }
					}
					break;
				case 7 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:986:6: io= INSTANCEOF rtype= typespec
					{
					io=(Token)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_relationalexpr3250); if (state.failed) return ret;
					pushFollow(FOLLOW_typespec_in_relationalexpr3254);
					rtype=typespec();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
							f = rtype.getSort().getInstanceofSymbol(services);
							opToken = io;
						    }
					}
					break;
				case 8 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:992:6: st= ST right= shiftexpr
					{
					st=(Token)match(input,ST,FOLLOW_ST_in_relationalexpr3273); if (state.failed) return ret;
					pushFollow(FOLLOW_shiftexpr_in_relationalexpr3277);
					right=shiftexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
							if (result.isTerm() || right.isTerm()) {
							    raiseError("Cannot build subtype expression from terms.", st);
							}
							assert result.isType();
							assert right.isType();

							if (result.getTerm() == null) {
							    addIgnoreWarning("subtype expression <: only supported for" +
								" \\typeof() arguments on the left side.", st);
								final Namespace fns = services.getNamespaces().functions();
								int x = -1; Name name = null;
								do name = new Name("subtype_"+ ++x);
								while (fns.lookup(name)!= null);
								final Function z = new Function(name,Sort.FORMULA);
								fns.add(z);
								result = new SLExpression(tb.func(z));
							} else {

							Sort os = right.getType().getSort();
							Function ioFunc = os.getInstanceofSymbol(services);

							result = new SLExpression(
							    tb.equals(
								tb.func(ioFunc, result.getTerm()),
								tb.TRUE()));
						    }
						    }
					}
					break;

			}

			if ( state.backtracking==0 ) {
				    if (f != null) {
					assert opToken != null;
					if (result.isType()) {
					    raiseError("Cannot build relational expression from type " +
						result.getType().getName() + ".", opToken);
					}
					assert result.isTerm();

					try {
						if (right == null) {
						    // instanceof-expression
						    result = new SLExpression(
							tb.and(tb.not(tb.equals(result.getTerm(), tb.NULL())),
							       tb.equals(tb.func(f, result.getTerm()), tb.TRUE())));
						} else {
						    if (right.isType()) {
						    raiseError("Cannot build relational expression from type " +
							right.getType().getName() + ".", opToken);
						    }
						    assert right.isTerm();

						    result = new SLExpression(
							tb.func(f,result.getTerm(),right.getTerm()));
						} 
						if (right2 != null) { // range expressions like 0 <= x < 23
						    if (right2.isType()) {
						    raiseError("Cannot build relational expression from type " +
							right2.getType().getName() + ".", opToken);
						    }
						    assert right2.isTerm();
						    final Term upperBound = tb.func(intLDT.getLessThan(),right.getTerm(),right2.getTerm());
						    result = new SLExpression(tb.and(result.getTerm(),upperBound));
						}
					} catch (TermCreationException e) {
					    raiseError("Error in relational expression: " + e.getMessage());
					} catch (IllegalArgumentException e) {
					    raiseError("Internal error.");
					}
				    }
				}
			}

			if ( state.backtracking==0 ) {ret=result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "relationalexpr"



	// $ANTLR start "shiftexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1065:1: shiftexpr returns [SLExpression ret=null] : result= additiveexpr (sr= SHIFTRIGHT e= additiveexpr |sl= SHIFTLEFT e= additiveexpr |usr= UNSIGNEDSHIFTRIGHT e= additiveexpr )* ;
	public final SLExpression shiftexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		Token sr=null;
		Token sl=null;
		Token usr=null;
		SLExpression result =null;
		SLExpression e =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1067:5: (result= additiveexpr (sr= SHIFTRIGHT e= additiveexpr |sl= SHIFTLEFT e= additiveexpr |usr= UNSIGNEDSHIFTRIGHT e= additiveexpr )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1068:5: result= additiveexpr (sr= SHIFTRIGHT e= additiveexpr |sl= SHIFTLEFT e= additiveexpr |usr= UNSIGNEDSHIFTRIGHT e= additiveexpr )*
			{
			pushFollow(FOLLOW_additiveexpr_in_shiftexpr3318);
			result=additiveexpr();
			state._fsp--;
			if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1069:5: (sr= SHIFTRIGHT e= additiveexpr |sl= SHIFTLEFT e= additiveexpr |usr= UNSIGNEDSHIFTRIGHT e= additiveexpr )*
			loop55:
			while (true) {
				int alt55=4;
				switch ( input.LA(1) ) {
				case SHIFTRIGHT:
					{
					alt55=1;
					}
					break;
				case SHIFTLEFT:
					{
					alt55=2;
					}
					break;
				case UNSIGNEDSHIFTRIGHT:
					{
					alt55=3;
					}
					break;
				}
				switch (alt55) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1070:2: sr= SHIFTRIGHT e= additiveexpr
					{
					sr=(Token)match(input,SHIFTRIGHT,FOLLOW_SHIFTRIGHT_in_shiftexpr3329); if (state.failed) return ret;
					pushFollow(FOLLOW_additiveexpr_in_shiftexpr3333);
					e=additiveexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					        result = translator.<SLExpression>translate(sr.getText(), SLExpression.class, services, result, e);
						}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1075:2: sl= SHIFTLEFT e= additiveexpr
					{
					sl=(Token)match(input,SHIFTLEFT,FOLLOW_SHIFTLEFT_in_shiftexpr3347); if (state.failed) return ret;
					pushFollow(FOLLOW_additiveexpr_in_shiftexpr3351);
					e=additiveexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					        result = translator.<SLExpression>translate(sl.getText(), SLExpression.class, services, result, e);
						}
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1080:2: usr= UNSIGNEDSHIFTRIGHT e= additiveexpr
					{
					usr=(Token)match(input,UNSIGNEDSHIFTRIGHT,FOLLOW_UNSIGNEDSHIFTRIGHT_in_shiftexpr3365); if (state.failed) return ret;
					pushFollow(FOLLOW_additiveexpr_in_shiftexpr3369);
					e=additiveexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					        result = translator.<SLExpression>translate(usr.getText(), SLExpression.class, services, result, e);
						}
					}
					break;

				default :
					break loop55;
				}
			}

			}

			if ( state.backtracking==0 ) {ret=result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "shiftexpr"



	// $ANTLR start "additiveexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1088:1: additiveexpr returns [SLExpression ret=null] : result= multexpr (plus= PLUS e= multexpr |minus= MINUS e= multexpr )* ;
	public final SLExpression additiveexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		Token plus=null;
		Token minus=null;
		SLExpression result =null;
		SLExpression e =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1090:5: (result= multexpr (plus= PLUS e= multexpr |minus= MINUS e= multexpr )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1091:5: result= multexpr (plus= PLUS e= multexpr |minus= MINUS e= multexpr )*
			{
			pushFollow(FOLLOW_multexpr_in_additiveexpr3407);
			result=multexpr();
			state._fsp--;
			if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1092:5: (plus= PLUS e= multexpr |minus= MINUS e= multexpr )*
			loop56:
			while (true) {
				int alt56=3;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==PLUS) ) {
					alt56=1;
				}
				else if ( (LA56_0==MINUS) ) {
					alt56=2;
				}

				switch (alt56) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1093:2: plus= PLUS e= multexpr
					{
					plus=(Token)match(input,PLUS,FOLLOW_PLUS_in_additiveexpr3418); if (state.failed) return ret;
					pushFollow(FOLLOW_multexpr_in_additiveexpr3422);
					e=multexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					        result = translator.<SLExpression>translate(plus.getText(), SLExpression.class, services, result, e);
						}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1098:2: minus= MINUS e= multexpr
					{
					minus=(Token)match(input,MINUS,FOLLOW_MINUS_in_additiveexpr3436); if (state.failed) return ret;
					pushFollow(FOLLOW_multexpr_in_additiveexpr3440);
					e=multexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    result = translator.<SLExpression>translate(minus.getText(), SLExpression.class, services, result, e);
						}
					}
					break;

				default :
					break loop56;
				}
			}

			}

			if ( state.backtracking==0 ) {ret = result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "additiveexpr"



	// $ANTLR start "multexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1106:1: multexpr returns [SLExpression ret=null] : result= unaryexpr ( MULT e= unaryexpr | DIV e= unaryexpr | MOD e= unaryexpr )* ;
	public final SLExpression multexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		SLExpression result =null;
		SLExpression e =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1108:5: (result= unaryexpr ( MULT e= unaryexpr | DIV e= unaryexpr | MOD e= unaryexpr )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1109:5: result= unaryexpr ( MULT e= unaryexpr | DIV e= unaryexpr | MOD e= unaryexpr )*
			{
			pushFollow(FOLLOW_unaryexpr_in_multexpr3479);
			result=unaryexpr();
			state._fsp--;
			if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1110:5: ( MULT e= unaryexpr | DIV e= unaryexpr | MOD e= unaryexpr )*
			loop57:
			while (true) {
				int alt57=4;
				switch ( input.LA(1) ) {
				case MULT:
					{
					alt57=1;
					}
					break;
				case DIV:
					{
					alt57=2;
					}
					break;
				case MOD:
					{
					alt57=3;
					}
					break;
				}
				switch (alt57) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1111:2: MULT e= unaryexpr
					{
					match(input,MULT,FOLLOW_MULT_in_multexpr3488); if (state.failed) return ret;
					pushFollow(FOLLOW_unaryexpr_in_multexpr3492);
					e=unaryexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    if (result.isType()) {
							raiseError("Cannot build multiplicative expression from type " +
							    result.getType().getName() + ".");
						    }
						    if (e.isType()) {
							raiseError("Cannot multiply by type " +
							    e.getType().getName() + ".");
						    }
						    assert result.isTerm();
						    assert e.isTerm();

						    result = intHelper.buildMulExpression(result, e);
						}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1127:2: DIV e= unaryexpr
					{
					match(input,DIV,FOLLOW_DIV_in_multexpr3504); if (state.failed) return ret;
					pushFollow(FOLLOW_unaryexpr_in_multexpr3508);
					e=unaryexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    if (result.isType()) {
							raiseError("Cannot build multiplicative expression from type " +
							    result.getType().getName() + ".");
						    }
						    if (e.isType()) {
							raiseError("Cannot divide by type " +
							    e.getType().getName() + ".");
						    }
						    assert result.isTerm();
						    assert e.isTerm();

						    result = intHelper.buildDivExpression(result, e);
						}
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1143:2: MOD e= unaryexpr
					{
					match(input,MOD,FOLLOW_MOD_in_multexpr3520); if (state.failed) return ret;
					pushFollow(FOLLOW_unaryexpr_in_multexpr3524);
					e=unaryexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    if (result.isType()) {
							raiseError("Cannot build multiplicative expression from type " +
							    result.getType().getName() + ".");
						    }
						    if (e.isType()) {
							raiseError("Cannot build modulo expression from type " +
							    e.getType().getName() + ".");
						    }
						    assert result.isTerm();
						    assert e.isTerm();

						    result = intHelper.buildModExpression(result, e);
						}
					}
					break;

				default :
					break loop57;
				}
			}

			}

			if ( state.backtracking==0 ) {ret = result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "multexpr"



	// $ANTLR start "unaryexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1162:1: unaryexpr returns [SLExpression ret=null] : ( PLUS result= unaryexpr | MINUS result= unaryexpr | ( LPAREN typespec RPAREN )=>result= castexpr |result= unaryexprnotplusminus );
	public final SLExpression unaryexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		SLExpression result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1164:5: ( PLUS result= unaryexpr | MINUS result= unaryexpr | ( LPAREN typespec RPAREN )=>result= castexpr |result= unaryexprnotplusminus )
			int alt58=4;
			alt58 = dfa58.predict(input);
			switch (alt58) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1165:5: PLUS result= unaryexpr
					{
					match(input,PLUS,FOLLOW_PLUS_in_unaryexpr3561); if (state.failed) return ret;
					pushFollow(FOLLOW_unaryexpr_in_unaryexpr3565);
					result=unaryexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    if (result.isType()) {
							raiseError("Cannot build  +" + result.getType().getName() + ".");
						    }
						    assert result.isTerm();

						    result = intHelper.buildPromotedUnaryPlusExpression(result);
						}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1175:2: MINUS result= unaryexpr
					{
					match(input,MINUS,FOLLOW_MINUS_in_unaryexpr3577); if (state.failed) return ret;
					pushFollow(FOLLOW_unaryexpr_in_unaryexpr3581);
					result=unaryexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    if (result.isType()) {
							raiseError("Cannot build  -" + result.getType().getName() + ".");
						    }
						    assert result.isTerm();

						    result = intHelper.buildUnaryMinusExpression(result);
						}
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1185:2: ( LPAREN typespec RPAREN )=>result= castexpr
					{
					pushFollow(FOLLOW_castexpr_in_unaryexpr3608);
					result=castexpr();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1187:6: result= unaryexprnotplusminus
					{
					pushFollow(FOLLOW_unaryexprnotplusminus_in_unaryexpr3623);
					result=unaryexprnotplusminus();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;

			}
			if ( state.backtracking==0 ) {ret = result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "unaryexpr"



	// $ANTLR start "castexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1190:1: castexpr returns [SLExpression ret = null] : LPAREN rtype= typespec RPAREN result= unaryexpr ;
	public final SLExpression castexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret =  null;


		KeYJavaType rtype =null;
		SLExpression result =null;


		    KeYJavaType type = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1194:1: ( LPAREN rtype= typespec RPAREN result= unaryexpr )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1195:1: LPAREN rtype= typespec RPAREN result= unaryexpr
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_castexpr3646); if (state.failed) return ret;
			pushFollow(FOLLOW_typespec_in_castexpr3650);
			rtype=typespec();
			state._fsp--;
			if (state.failed) return ret;
			match(input,RPAREN,FOLLOW_RPAREN_in_castexpr3652); if (state.failed) return ret;
			pushFollow(FOLLOW_unaryexpr_in_castexpr3656);
			result=unaryexpr();
			state._fsp--;
			if (state.failed) return ret;
			if ( state.backtracking==0 ) {
			    ret = translator.translate(JMLTranslator.JMLKeyWord.CAST, services, intHelper, rtype, result);
			}
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "castexpr"



	// $ANTLR start "unaryexprnotplusminus"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1201:1: unaryexprnotplusminus returns [SLExpression ret=null] : ( NOT e= unaryexpr | BITWISENOT e= unaryexpr |result= postfixexpr );
	public final SLExpression unaryexprnotplusminus() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		SLExpression e =null;
		SLExpression result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1203:2: ( NOT e= unaryexpr | BITWISENOT e= unaryexpr |result= postfixexpr )
			int alt59=3;
			alt59 = dfa59.predict(input);
			switch (alt59) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1204:2: NOT e= unaryexpr
					{
					match(input,NOT,FOLLOW_NOT_in_unaryexprnotplusminus3681); if (state.failed) return ret;
					pushFollow(FOLLOW_unaryexpr_in_unaryexprnotplusminus3685);
					e=unaryexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    if (e.isType()) {
							raiseError("Cannot negate type " + e.getType().getName() + ".");
						    }

						    Term t = e.getTerm();
						    assert t != null;

						    if (t.sort() == Sort.FORMULA) {
							result = new SLExpression(tb.not(t));
						    } else if(t.sort() == booleanLDT.targetSort()) {
							result = new SLExpression(tb.not(tb.equals(t, tb.TRUE())));
						    } else {
							raiseError("Wrong type in not-expression: " + t);
						    }
						}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1222:2: BITWISENOT e= unaryexpr
					{
					match(input,BITWISENOT,FOLLOW_BITWISENOT_in_unaryexprnotplusminus3697); if (state.failed) return ret;
					pushFollow(FOLLOW_unaryexpr_in_unaryexprnotplusminus3701);
					e=unaryexpr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    if(e.isType()) {
							raiseError("Cannot negate type " + e.getType().getName() + ".");
						    }

						    result = intHelper.buildPromotedNegExpression(e);
						}
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1232:2: result= postfixexpr
					{
					pushFollow(FOLLOW_postfixexpr_in_unaryexprnotplusminus3716);
					result=postfixexpr();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;

			}
			if ( state.backtracking==0 ) {ret = result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "unaryexprnotplusminus"



	// $ANTLR start "postfixexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1236:1: postfixexpr returns [SLExpression ret=null] : expr= primaryexpr (expr= primarysuffix[expr, fullyQualifiedName] )* ;
	public final SLExpression postfixexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		SLExpression expr =null;


		    String fullyQualifiedName = "";
		    SLExpression result=null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1242:2: (expr= primaryexpr (expr= primarysuffix[expr, fullyQualifiedName] )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1243:2: expr= primaryexpr (expr= primarysuffix[expr, fullyQualifiedName] )*
			{
			pushFollow(FOLLOW_primaryexpr_in_postfixexpr3747);
			expr=primaryexpr();
			state._fsp--;
			if (state.failed) return ret;
			if ( state.backtracking==0 ) {  
				    fullyQualifiedName = input.LT(-1).getText();
				}
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1247:2: (expr= primarysuffix[expr, fullyQualifiedName] )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==DOT||LA60_0==LBRACKET||LA60_0==LPAREN) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1248:6: expr= primarysuffix[expr, fullyQualifiedName]
					{
					if ( state.backtracking==0 ) {
						        if (expr != null && expr.getType() == null) {
						            raiseError("SLExpression without a type: " + expr);
						        }/* else if (expr != null && expr.getType().getJavaType() instanceof PrimitiveType) {
							    raiseError("Cannot build postfix expression from primitive type.");
							}*/
						    }
					pushFollow(FOLLOW_primarysuffix_in_postfixexpr3769);
					expr=primarysuffix(expr, fullyQualifiedName);
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
							fullyQualifiedName += "." + input.LT(-1).getText();
						    }
					}
					break;

				default :
					break loop60;
				}
			}

			if ( state.backtracking==0 ) {
				    if (expr == null) {
					raiseError("Expression " + fullyQualifiedName + " cannot be resolved.");
				    }
				    result = expr; //.getTerm();
				}
			}

			if ( state.backtracking==0 ) { ret = result; }
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "postfixexpr"



	// $ANTLR start "primaryexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1269:1: primaryexpr returns [SLExpression ret=null] : (result= constant |id= IDENT |inv= INV | TRUE | FALSE | NULL |result= jmlprimary | THIS | new_expr | array_initializer );
	public final SLExpression primaryexpr() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		Token id=null;
		Token inv=null;
		SLExpression result =null;


		    Term s1, s2;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1274:2: (result= constant |id= IDENT |inv= INV | TRUE | FALSE | NULL |result= jmlprimary | THIS | new_expr | array_initializer )
			int alt61=10;
			alt61 = dfa61.predict(input);
			switch (alt61) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1275:2: result= constant
					{
					pushFollow(FOLLOW_constant_in_primaryexpr3817);
					result=constant();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1276:9: id= IDENT
					{
					id=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryexpr3829); if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = lookupIdentifier(id.getText(), null, null, id); }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1277:9: inv= INV
					{
					inv=(Token)match(input,INV,FOLLOW_INV_in_primaryexpr3847); if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = translator.translate(inv.getText(),services,
					                                selfVar==null? null: tb.var(selfVar),containerType);}
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1279:9: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_primaryexpr3864); if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = new SLExpression(tb.tt()); }
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1280:9: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_primaryexpr3884); if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = new SLExpression(tb.ff()); }
					}
					break;
				case 6 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1281:9: NULL
					{
					match(input,NULL,FOLLOW_NULL_in_primaryexpr3903); if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = new SLExpression(tb.NULL()); }
					}
					break;
				case 7 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1282:9: result= jmlprimary
					{
					pushFollow(FOLLOW_jmlprimary_in_primaryexpr3925);
					result=jmlprimary();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;
				case 8 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1283:9: THIS
					{
					match(input,THIS,FOLLOW_THIS_in_primaryexpr3935); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            if(selfVar == null) {
					            	raiseError("Cannot access \"this\" in a static context!");
					            }
					            try {
					                result = new SLExpression(tb.var(selfVar), selfVar.getKeYJavaType());
					            } catch (Throwable e) { raiseError(e.getMessage()); }
					        }
					}
					break;
				case 9 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1292:9: new_expr
					{
					pushFollow(FOLLOW_new_expr_in_primaryexpr3955);
					new_expr();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;
				case 10 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1293:9: array_initializer
					{
					pushFollow(FOLLOW_array_initializer_in_primaryexpr3965);
					array_initializer();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;

			}
			if ( state.backtracking==0 ) {ret = result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "primaryexpr"



	// $ANTLR start "transactionUpdated"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1296:1: transactionUpdated returns [SLExpression result=null] : tk= TRANSACTIONUPDATED LPAREN expr= expression RPAREN ;
	public final SLExpression transactionUpdated() throws RecognitionException, SLTranslationException {
		SLExpression result = null;


		Token tk=null;
		SLExpression expr =null;


		   String fieldName = "<transactionConditionallyUpdated>";

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1302:4: (tk= TRANSACTIONUPDATED LPAREN expr= expression RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1304:4: tk= TRANSACTIONUPDATED LPAREN expr= expression RPAREN
			{
			tk=(Token)match(input,TRANSACTIONUPDATED,FOLLOW_TRANSACTIONUPDATED_in_transactionUpdated3997); if (state.failed) return result;
			match(input,LPAREN,FOLLOW_LPAREN_in_transactionUpdated3999); if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_transactionUpdated4003);
			expr=expression();
			state._fsp--;
			if (state.failed) return result;
			match(input,RPAREN,FOLLOW_RPAREN_in_transactionUpdated4005); if (state.failed) return result;
			if ( state.backtracking==0 ) {
			      result = lookupIdentifier(fieldName, expr, null, tk);
			   }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "transactionUpdated"



	// $ANTLR start "primarysuffix"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1310:1: primarysuffix[SLExpression receiver, String fullyQualifiedName] returns [SLExpression ret=null] : ( DOT (id= IDENT |tr= TRANSIENT | THIS | INV | MULT ) |l= LPAREN (params= expressionlist )? RPAREN |lbrack= LBRACKET result= specarrayrefexpr[receiver, fullyQualifiedName, lbrack] RBRACKET ) ;
	public final SLExpression primarysuffix(SLExpression receiver, String fullyQualifiedName) throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		Token id=null;
		Token tr=null;
		Token l=null;
		Token lbrack=null;
		ImmutableList<SLExpression> params =null;
		SLExpression result =null;


		    String lookupName = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1317:1: ( ( DOT (id= IDENT |tr= TRANSIENT | THIS | INV | MULT ) |l= LPAREN (params= expressionlist )? RPAREN |lbrack= LBRACKET result= specarrayrefexpr[receiver, fullyQualifiedName, lbrack] RBRACKET ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1318:1: ( DOT (id= IDENT |tr= TRANSIENT | THIS | INV | MULT ) |l= LPAREN (params= expressionlist )? RPAREN |lbrack= LBRACKET result= specarrayrefexpr[receiver, fullyQualifiedName, lbrack] RBRACKET )
			{
			if ( state.backtracking==0 ) {
			    lookupName = fullyQualifiedName;
			}
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1321:3: ( DOT (id= IDENT |tr= TRANSIENT | THIS | INV | MULT ) |l= LPAREN (params= expressionlist )? RPAREN |lbrack= LBRACKET result= specarrayrefexpr[receiver, fullyQualifiedName, lbrack] RBRACKET )
			int alt64=3;
			switch ( input.LA(1) ) {
			case DOT:
				{
				alt64=1;
				}
				break;
			case LPAREN:
				{
				alt64=2;
				}
				break;
			case LBRACKET:
				{
				alt64=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ret;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}
			switch (alt64) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1321:3: DOT (id= IDENT |tr= TRANSIENT | THIS | INV | MULT )
					{
					match(input,DOT,FOLLOW_DOT_in_primarysuffix4046); if (state.failed) return ret;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1322:5: (id= IDENT |tr= TRANSIENT | THIS | INV | MULT )
					int alt62=5;
					switch ( input.LA(1) ) {
					case IDENT:
						{
						alt62=1;
						}
						break;
					case TRANSIENT:
						{
						alt62=2;
						}
						break;
					case THIS:
						{
						alt62=3;
						}
						break;
					case INV:
						{
						alt62=4;
						}
						break;
					case MULT:
						{
						alt62=5;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return ret;}
						NoViableAltException nvae =
							new NoViableAltException("", 62, 0, input);
						throw nvae;
					}
					switch (alt62) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1322:7: id= IDENT
							{
							id=(Token)match(input,IDENT,FOLLOW_IDENT_in_primarysuffix4056); if (state.failed) return ret;
							if ( state.backtracking==0 ) {
								    if(receiver == null) {
									// Receiver was only a package/classname prefix
									lookupName = fullyQualifiedName + "." + id.getText();
								    } else {
									lookupName = id.getText();
								    }
								    try {
								    	result = lookupIdentifier(lookupName, receiver, null, id);
								    } catch(SLTranslationException e) {
								    	result = lookupIdentifier(fullyQualifiedName + "." + lookupName, null, null, id);
								    }
								}
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1336:7: tr= TRANSIENT
							{
							tr=(Token)match(input,TRANSIENT,FOLLOW_TRANSIENT_in_primarysuffix4069); if (state.failed) return ret;
							if ( state.backtracking==0 ) {
							        result = lookupIdentifier("<transient>", receiver, null, tr);
							    }
							}
							break;
						case 3 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1341:6: THIS
							{
							match(input,THIS,FOLLOW_THIS_in_primarysuffix4092); if (state.failed) return ret;
							if ( state.backtracking==0 ) {
							    	result = new SLExpression(
							    		services.getTypeConverter().findThisForSort(receiver.getType().getSort(),
							    							    tb.var(selfVar),
							    							    javaInfo.getKeYJavaType(selfVar.sort()),
							    							    true),
							                receiver.getType());
							    }
							}
							break;
						case 4 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1350:7: INV
							{
							match(input,INV,FOLLOW_INV_in_primarysuffix4106); if (state.failed) return ret;
							if ( state.backtracking==0 ) {
							        result = translator.translate("\\inv",services,receiver.getTerm(),receiver.getType());
							    }
							}
							break;
						case 5 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1354:7: MULT
							{
							match(input,MULT,FOLLOW_MULT_in_primarysuffix4120); if (state.failed) return ret;
							if ( state.backtracking==0 ) {
								     result = new SLExpression(tb.allFields(receiver.getTerm()),
								                               javaInfo.getPrimitiveKeYJavaType(PrimitiveType.JAVA_LOCSET));
							         }
							}
							break;

					}

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1361:2: l= LPAREN (params= expressionlist )? RPAREN
					{
					l=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primarysuffix4147); if (state.failed) return ret;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1361:11: (params= expressionlist )?
					int alt63=2;
					alt63 = dfa63.predict(input);
					switch (alt63) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1361:12: params= expressionlist
							{
							pushFollow(FOLLOW_expressionlist_in_primarysuffix4152);
							params=expressionlist();
							state._fsp--;
							if (state.failed) return ret;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_primarysuffix4156); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            ImmutableList<SLExpression> preHeapParams = ImmutableSLList.<SLExpression>nil();
					            for(LocationVariable heap : HeapContext.getModHeaps(services, false)) {
					              Term p;
					              if(atPres == null || atPres.get(heap) == null) { p = tb.var(heap); } else { p = atPres.get(heap); }
					              preHeapParams = preHeapParams.append(new SLExpression(p));
					            }
					            params = (params == null) ? preHeapParams : params.prepend(preHeapParams);

						    lookupName = lookupName.substring(lookupName.lastIndexOf('.')+1);

						    result = lookupIdentifier(lookupName, receiver, new SLParameters(params), l);
						    if (result == null) {
							raiseError("Method " + lookupName + "("
							           + createSignatureString(params) + ") not found!", l);
						    }
					            if(((IProgramMethod)result.getTerm().op()).getStateCount() > 1 &&
					               (atPres == null || atPres.get(getBaseHeap()) == null)) {
					               raiseError("Two-state model method " + lookupName + " not allowed in this context!", l);
					            }

						}
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1385:2: lbrack= LBRACKET result= specarrayrefexpr[receiver, fullyQualifiedName, lbrack] RBRACKET
					{
					lbrack=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_primarysuffix4170); if (state.failed) return ret;
					pushFollow(FOLLOW_specarrayrefexpr_in_primarysuffix4174);
					result=specarrayrefexpr(receiver, fullyQualifiedName, lbrack);
					state._fsp--;
					if (state.failed) return ret;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_primarysuffix4177); if (state.failed) return ret;
					}
					break;

			}

			}

			if ( state.backtracking==0 ) { ret = result; }
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "primarysuffix"



	// $ANTLR start "new_expr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1390:1: new_expr : NEW typ= type ( LPAREN (params= expressionlist )? RPAREN | array_dimensions ( array_initializer )? ) ;
	public final void new_expr() throws RecognitionException, SLTranslationException {
		KeYJavaType typ =null;
		ImmutableList<SLExpression> params =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1391:2: ( NEW typ= type ( LPAREN (params= expressionlist )? RPAREN | array_dimensions ( array_initializer )? ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1392:2: NEW typ= type ( LPAREN (params= expressionlist )? RPAREN | array_dimensions ( array_initializer )? )
			{
			match(input,NEW,FOLLOW_NEW_in_new_expr4194); if (state.failed) return;
			pushFollow(FOLLOW_type_in_new_expr4198);
			typ=type();
			state._fsp--;
			if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1392:15: ( LPAREN (params= expressionlist )? RPAREN | array_dimensions ( array_initializer )? )
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==LPAREN) ) {
				alt67=1;
			}
			else if ( (LA67_0==LBRACKET) ) {
				alt67=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}

			switch (alt67) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1393:6: LPAREN (params= expressionlist )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_new_expr4207); if (state.failed) return;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1393:13: (params= expressionlist )?
					int alt65=2;
					alt65 = dfa65.predict(input);
					switch (alt65) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1393:15: params= expressionlist
							{
							pushFollow(FOLLOW_expressionlist_in_new_expr4213);
							params=expressionlist();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_new_expr4218); if (state.failed) return;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1395:6: array_dimensions ( array_initializer )?
					{
					pushFollow(FOLLOW_array_dimensions_in_new_expr4231);
					array_dimensions();
					state._fsp--;
					if (state.failed) return;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1395:23: ( array_initializer )?
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0==LBRACE) ) {
						alt66=1;
					}
					switch (alt66) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1395:24: array_initializer
							{
							pushFollow(FOLLOW_array_initializer_in_new_expr4234);
							array_initializer();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			        	raiseNotSupported("'new' within specifications");
			        }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "new_expr"



	// $ANTLR start "array_dimensions"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1402:1: array_dimensions : array_dimension ;
	public final void array_dimensions() throws RecognitionException, SLTranslationException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1403:5: ( array_dimension )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1404:5: array_dimension
			{
			pushFollow(FOLLOW_array_dimension_in_array_dimensions4273);
			array_dimension();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "array_dimensions"



	// $ANTLR start "array_dimension"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1408:1: array_dimension : LBRACKET (length= expression )? RBRACKET ;
	public final void array_dimension() throws RecognitionException, SLTranslationException {
		SLExpression length =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1409:5: ( LBRACKET (length= expression )? RBRACKET )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1410:5: LBRACKET (length= expression )? RBRACKET
			{
			match(input,LBRACKET,FOLLOW_LBRACKET_in_array_dimension4295); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1410:14: (length= expression )?
			int alt68=2;
			alt68 = dfa68.predict(input);
			switch (alt68) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1410:15: length= expression
					{
					pushFollow(FOLLOW_expression_in_array_dimension4300);
					length=expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,RBRACKET,FOLLOW_RBRACKET_in_array_dimension4304); if (state.failed) return;
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "array_dimension"



	// $ANTLR start "array_initializer"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1413:1: array_initializer : LBRACE init= expressionlist RBRACE ;
	public final void array_initializer() throws RecognitionException, SLTranslationException {
		ImmutableList<SLExpression> init =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1414:5: ( LBRACE init= expressionlist RBRACE )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1415:5: LBRACE init= expressionlist RBRACE
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_array_initializer4321); if (state.failed) return;
			pushFollow(FOLLOW_expressionlist_in_array_initializer4325);
			init=expressionlist();
			state._fsp--;
			if (state.failed) return;
			match(input,RBRACE,FOLLOW_RBRACE_in_array_initializer4327); if (state.failed) return;
			if ( state.backtracking==0 ) {
			        raiseNotSupported("array initializer");
			    }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "array_initializer"



	// $ANTLR start "expressionlist"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1421:1: expressionlist returns [ImmutableList<SLExpression> result=ImmutableSLList.<SLExpression>nil()] : expr= expression ( COMMA expr= expression )* ;
	public final ImmutableList<SLExpression> expressionlist() throws RecognitionException, SLTranslationException {
		ImmutableList<SLExpression> result = ImmutableSLList.<SLExpression>nil();


		SLExpression expr =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1423:2: (expr= expression ( COMMA expr= expression )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1424:2: expr= expression ( COMMA expr= expression )*
			{
			pushFollow(FOLLOW_expression_in_expressionlist4368);
			expr=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result = result.append(expr); }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1424:52: ( COMMA expr= expression )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==COMMA) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1424:53: COMMA expr= expression
					{
					match(input,COMMA,FOLLOW_COMMA_in_expressionlist4373); if (state.failed) return result;
					pushFollow(FOLLOW_expression_in_expressionlist4377);
					expr=expression();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) {result = result.append(expr);}
					}
					break;

				default :
					break loop69;
				}
			}

			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "expressionlist"



	// $ANTLR start "constant"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1427:1: constant returns [SLExpression ret=null] : result= javaliteral ;
	public final SLExpression constant() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		SLExpression result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1428:2: (result= javaliteral )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1429:2: result= javaliteral
			{
			pushFollow(FOLLOW_javaliteral_in_constant4402);
			result=javaliteral();
			state._fsp--;
			if (state.failed) return ret;
			if ( state.backtracking==0 ) { ret = result; }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "constant"



	// $ANTLR start "javaliteral"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1432:1: javaliteral returns [SLExpression ret=null] : (result= integerliteral |l= STRING_LITERAL |c= CHAR_LITERAL );
	public final SLExpression javaliteral() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		Token l=null;
		Token c=null;
		SLExpression result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1434:2: (result= integerliteral |l= STRING_LITERAL |c= CHAR_LITERAL )
			int alt70=3;
			switch ( input.LA(1) ) {
			case DIGITS:
			case HEXNUMERAL:
				{
				alt70=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt70=2;
				}
				break;
			case CHAR_LITERAL:
				{
				alt70=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ret;}
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}
			switch (alt70) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1435:2: result= integerliteral
					{
					pushFollow(FOLLOW_integerliteral_in_javaliteral4428);
					result=integerliteral();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1437:2: l= STRING_LITERAL
					{
					l=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_javaliteral4439); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    Term charListTerm
						       = services.getTypeConverter()
						                 .convertToLogicElement(
						                 	new StringLiteral(l.getText()));
						    Function strPool
						    	= (Function) services.getNamespaces()
						    	                     .functions()
						    	                     .lookup(CharListLDT.STRINGPOOL_NAME);
						    if(strPool == null) {
						        raiseError("string literals used in specification, "
						                   + "but string pool function not found");
						    }
						    Term stringTerm = tb.func(strPool, charListTerm);
						    return new SLExpression(stringTerm,
						                            javaInfo.getKeYJavaType("java.lang.String"));
						}
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1456:2: c= CHAR_LITERAL
					{
					c=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_javaliteral4453); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					       Term charLit = 
					         services.getTypeConverter().getIntegerLDT().translateLiteral(new CharLiteral(c.getText()), services);
					        	   
						    return new SLExpression(charLit, javaInfo.getKeYJavaType("char"));
						}
					}
					break;

			}
			if ( state.backtracking==0 ) { ret = result; }
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "javaliteral"



	// $ANTLR start "integerliteral"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1465:1: integerliteral returns [SLExpression ret=null] : (result= decimalintegerliteral |result= hexintegerliteral );
	public final SLExpression integerliteral() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		SLExpression result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1467:2: (result= decimalintegerliteral |result= hexintegerliteral )
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==DIGITS) ) {
				alt71=1;
			}
			else if ( (LA71_0==HEXNUMERAL) ) {
				alt71=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return ret;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1468:2: result= decimalintegerliteral
					{
					pushFollow(FOLLOW_decimalintegerliteral_in_integerliteral4485);
					result=decimalintegerliteral();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1470:2: result= hexintegerliteral
					{
					pushFollow(FOLLOW_hexintegerliteral_in_integerliteral4496);
					result=hexintegerliteral();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;

			}
			if ( state.backtracking==0 ) {ret = result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "integerliteral"



	// $ANTLR start "hexintegerliteral"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1473:1: hexintegerliteral returns [SLExpression result=null] : n= HEXNUMERAL ;
	public final SLExpression hexintegerliteral() throws RecognitionException, SLTranslationException {
		SLExpression result = null;


		Token n=null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1474:5: (n= HEXNUMERAL )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1475:5: n= HEXNUMERAL
			{
			n=(Token)match(input,HEXNUMERAL,FOLLOW_HEXNUMERAL_in_hexintegerliteral4519); if (state.failed) return result;
			if ( state.backtracking==0 ) {
				BigInteger decInteger = new BigInteger(n.getText().substring(2), 16);
				result = new SLExpression(tb.zTerm(decInteger.toString()),
				                          javaInfo.getPrimitiveKeYJavaType(PrimitiveType.JAVA_INT));
			    }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "hexintegerliteral"



	// $ANTLR start "decimalintegerliteral"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1483:1: decimalintegerliteral returns [SLExpression ret=null] : result= decimalnumeral ;
	public final SLExpression decimalintegerliteral() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		SLExpression result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1484:2: (result= decimalnumeral )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1485:2: result= decimalnumeral
			{
			pushFollow(FOLLOW_decimalnumeral_in_decimalintegerliteral4545);
			result=decimalnumeral();
			state._fsp--;
			if (state.failed) return ret;
			if ( state.backtracking==0 ) {ret = result;}
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "decimalintegerliteral"



	// $ANTLR start "decimalnumeral"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1488:1: decimalnumeral returns [SLExpression result=null] : n= DIGITS ;
	public final SLExpression decimalnumeral() throws RecognitionException, SLTranslationException {
		SLExpression result = null;


		Token n=null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1489:5: (n= DIGITS )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1490:5: n= DIGITS
			{
			n=(Token)match(input,DIGITS,FOLLOW_DIGITS_in_decimalnumeral4569); if (state.failed) return result;
			if ( state.backtracking==0 ) {
			      if(n.getText().startsWith("0")) {
			          n.setText(new java.math.BigInteger(n.getText(), 8).toString());
			      }
				  result = new SLExpression(tb.zTerm(n.getText()),
				                            javaInfo.getPrimitiveKeYJavaType(PrimitiveType.JAVA_INT));
			    }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "decimalnumeral"



	// $ANTLR start "jmlprimary"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1500:1: jmlprimary returns [SLExpression ret=null] : ( RESULT | EXCEPTION | ( LPAREN quantifier )=>result= specquantifiedexpression | ( LPAREN BSUM )=>result= bsumterm | ( LPAREN SEQDEF )=>result= seqdefterm | ( OLD | PRE )=>result= oldexpression |result= transactionUpdated | BACKUP LPAREN result= expression RPAREN | PERMISSION LPAREN result= expression RPAREN | NONNULLELEMENTS LPAREN result= expression RPAREN |desc= INFORMAL_DESCRIPTION |escape= DL_ESCAPE ( ( LPAREN )=> LPAREN (list= expressionlist )? RPAREN )? |mapEmpty= MAPEMPTY |tk= mapExpression LPAREN (list= expressionlist )? RPAREN |s2m= SEQ2MAP LPAREN (list= expressionlist )? RPAREN | NOT_MODIFIED LPAREN t= storeRefUnion RPAREN |na= NOT_ASSIGNED LPAREN t= storeRefUnion RPAREN | FRESH LPAREN list= expressionlist RPAREN | REACH LPAREN t= storeref COMMA e1= expression COMMA e2= expression ( COMMA e3= expression )? RPAREN | REACHLOCS LPAREN t= storeref COMMA e1= expression ( COMMA e3= expression )? RPAREN |duration= DURATION LPAREN result= expression RPAREN |space= SPACE LPAREN result= expression RPAREN |wspace= WORKINGSPACE LPAREN result= expression RPAREN | ( MAX )=>max= MAX LPAREN result= expression RPAREN | TYPEOF LPAREN result= expression RPAREN | ELEMTYPE LPAREN result= expression RPAREN | TYPE_SMALL LPAREN typ= typespec RPAREN |lockset= LOCKSET | IS_INITIALIZED LPAREN typ= referencetype RPAREN | INVARIANT_FOR LPAREN result= expression RPAREN | STATIC_INVARIANT_FOR LPAREN typ= referencetype RPAREN | ( LPAREN LBLNEG )=> LPAREN lblneg= LBLNEG IDENT result= expression RPAREN | ( LPAREN LBLPOS )=> LPAREN lblpos= LBLPOS IDENT result= expression RPAREN | INDEX | VALUES | STRING_EQUAL LPAREN e1= expression COMMA e2= expression RPAREN | EMPTYSET |t= createLocset | ( UNION | UNION_2 ) LPAREN t= storeRefUnion RPAREN | INTERSECT LPAREN t= storeRefIntersect RPAREN | SETMINUS LPAREN t= storeref COMMA t2= storeref RPAREN | ALLFIELDS LPAREN e1= expression RPAREN | ALLOBJECTS LPAREN t= storeref RPAREN | UNIONINF LPAREN (nullable= boundvarmodifiers )? declVars= quantifiedvardecls SEMI ( ( predicate SEMI )=>t2= predicate SEMI | SEMI )? t= storeref RPAREN |pd= DISJOINT LPAREN tlist= storeRefList RPAREN | SUBSET LPAREN t= storeref COMMA t2= storeref RPAREN | NEWELEMSFRESH LPAREN t= storeref RPAREN | ( SEQEMPTY | ( LPAREN ( SEQDEF | SEQ ) quantifiedvardecls SEMI ) | ( SEQSINGLETON | SEQ ) LPAREN | SEQSUB LPAREN | SEQREVERSE | SEQREPLACE | SEQCONCAT | SEQGET | INDEXOF )=>result= sequence | LPAREN result= expression RPAREN );
	public final SLExpression jmlprimary() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		Token desc=null;
		Token escape=null;
		Token mapEmpty=null;
		Token s2m=null;
		Token na=null;
		Token duration=null;
		Token space=null;
		Token wspace=null;
		Token max=null;
		Token lockset=null;
		Token lblneg=null;
		Token lblpos=null;
		Token pd=null;
		SLExpression result =null;
		ImmutableList<SLExpression> list =null;
		Token tk =null;
		Term t =null;
		SLExpression e1 =null;
		SLExpression e2 =null;
		SLExpression e3 =null;
		KeYJavaType typ =null;
		Term t2 =null;
		boolean nullable =false;
		Pair<KeYJavaType,ImmutableList<LogicVariable>> declVars =null;
		ImmutableList<Term> tlist =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1502:2: ( RESULT | EXCEPTION | ( LPAREN quantifier )=>result= specquantifiedexpression | ( LPAREN BSUM )=>result= bsumterm | ( LPAREN SEQDEF )=>result= seqdefterm | ( OLD | PRE )=>result= oldexpression |result= transactionUpdated | BACKUP LPAREN result= expression RPAREN | PERMISSION LPAREN result= expression RPAREN | NONNULLELEMENTS LPAREN result= expression RPAREN |desc= INFORMAL_DESCRIPTION |escape= DL_ESCAPE ( ( LPAREN )=> LPAREN (list= expressionlist )? RPAREN )? |mapEmpty= MAPEMPTY |tk= mapExpression LPAREN (list= expressionlist )? RPAREN |s2m= SEQ2MAP LPAREN (list= expressionlist )? RPAREN | NOT_MODIFIED LPAREN t= storeRefUnion RPAREN |na= NOT_ASSIGNED LPAREN t= storeRefUnion RPAREN | FRESH LPAREN list= expressionlist RPAREN | REACH LPAREN t= storeref COMMA e1= expression COMMA e2= expression ( COMMA e3= expression )? RPAREN | REACHLOCS LPAREN t= storeref COMMA e1= expression ( COMMA e3= expression )? RPAREN |duration= DURATION LPAREN result= expression RPAREN |space= SPACE LPAREN result= expression RPAREN |wspace= WORKINGSPACE LPAREN result= expression RPAREN | ( MAX )=>max= MAX LPAREN result= expression RPAREN | TYPEOF LPAREN result= expression RPAREN | ELEMTYPE LPAREN result= expression RPAREN | TYPE_SMALL LPAREN typ= typespec RPAREN |lockset= LOCKSET | IS_INITIALIZED LPAREN typ= referencetype RPAREN | INVARIANT_FOR LPAREN result= expression RPAREN | STATIC_INVARIANT_FOR LPAREN typ= referencetype RPAREN | ( LPAREN LBLNEG )=> LPAREN lblneg= LBLNEG IDENT result= expression RPAREN | ( LPAREN LBLPOS )=> LPAREN lblpos= LBLPOS IDENT result= expression RPAREN | INDEX | VALUES | STRING_EQUAL LPAREN e1= expression COMMA e2= expression RPAREN | EMPTYSET |t= createLocset | ( UNION | UNION_2 ) LPAREN t= storeRefUnion RPAREN | INTERSECT LPAREN t= storeRefIntersect RPAREN | SETMINUS LPAREN t= storeref COMMA t2= storeref RPAREN | ALLFIELDS LPAREN e1= expression RPAREN | ALLOBJECTS LPAREN t= storeref RPAREN | UNIONINF LPAREN (nullable= boundvarmodifiers )? declVars= quantifiedvardecls SEMI ( ( predicate SEMI )=>t2= predicate SEMI | SEMI )? t= storeref RPAREN |pd= DISJOINT LPAREN tlist= storeRefList RPAREN | SUBSET LPAREN t= storeref COMMA t2= storeref RPAREN | NEWELEMSFRESH LPAREN t= storeref RPAREN | ( SEQEMPTY | ( LPAREN ( SEQDEF | SEQ ) quantifiedvardecls SEMI ) | ( SEQSINGLETON | SEQ ) LPAREN | SEQSUB LPAREN | SEQREVERSE | SEQREPLACE | SEQCONCAT | SEQGET | INDEXOF )=>result= sequence | LPAREN result= expression RPAREN )
			int alt80=49;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==RESULT) ) {
				alt80=1;
			}
			else if ( (LA80_0==EXCEPTION) ) {
				alt80=2;
			}
			else if ( (LA80_0==LPAREN) ) {
				int LA80_3 = input.LA(2);
				if ( (synpred2_KeYJMLParser()) ) {
					alt80=3;
				}
				else if ( (synpred3_KeYJMLParser()) ) {
					alt80=4;
				}
				else if ( (synpred4_KeYJMLParser()) ) {
					alt80=5;
				}
				else if ( (synpred8_KeYJMLParser()) ) {
					alt80=32;
				}
				else if ( (synpred9_KeYJMLParser()) ) {
					alt80=33;
				}
				else if ( (synpred11_KeYJMLParser()) ) {
					alt80=48;
				}
				else if ( (true) ) {
					alt80=49;
				}

			}
			else if ( (LA80_0==PRE) && (synpred5_KeYJMLParser())) {
				alt80=6;
			}
			else if ( (LA80_0==OLD) && (synpred5_KeYJMLParser())) {
				alt80=6;
			}
			else if ( (LA80_0==TRANSACTIONUPDATED) ) {
				alt80=7;
			}
			else if ( (LA80_0==BACKUP) ) {
				alt80=8;
			}
			else if ( (LA80_0==PERMISSION) ) {
				alt80=9;
			}
			else if ( (LA80_0==NONNULLELEMENTS) ) {
				alt80=10;
			}
			else if ( (LA80_0==INFORMAL_DESCRIPTION) ) {
				alt80=11;
			}
			else if ( (LA80_0==DL_ESCAPE) ) {
				alt80=12;
			}
			else if ( (LA80_0==MAPEMPTY) ) {
				alt80=13;
			}
			else if ( (LA80_0==DOMAIN_IMPLIES_CREATED||(LA80_0 >= IN_DOMAIN && LA80_0 <= IS_FINITE)||(LA80_0 >= MAP_GET && LA80_0 <= MAP_UPDATE)) ) {
				alt80=14;
			}
			else if ( (LA80_0==SEQ2MAP) ) {
				alt80=15;
			}
			else if ( (LA80_0==NOT_MODIFIED) ) {
				alt80=16;
			}
			else if ( (LA80_0==NOT_ASSIGNED) ) {
				alt80=17;
			}
			else if ( (LA80_0==FRESH) ) {
				alt80=18;
			}
			else if ( (LA80_0==REACH) ) {
				alt80=19;
			}
			else if ( (LA80_0==REACHLOCS) ) {
				alt80=20;
			}
			else if ( (LA80_0==DURATION) ) {
				alt80=21;
			}
			else if ( (LA80_0==SPACE) ) {
				alt80=22;
			}
			else if ( (LA80_0==WORKINGSPACE) ) {
				alt80=23;
			}
			else if ( (LA80_0==MAX) && (synpred7_KeYJMLParser())) {
				alt80=24;
			}
			else if ( (LA80_0==TYPEOF) ) {
				alt80=25;
			}
			else if ( (LA80_0==ELEMTYPE) ) {
				alt80=26;
			}
			else if ( (LA80_0==TYPE_SMALL) ) {
				alt80=27;
			}
			else if ( (LA80_0==LOCKSET) ) {
				alt80=28;
			}
			else if ( (LA80_0==IS_INITIALIZED) ) {
				alt80=29;
			}
			else if ( (LA80_0==INVARIANT_FOR) ) {
				alt80=30;
			}
			else if ( (LA80_0==STATIC_INVARIANT_FOR) ) {
				alt80=31;
			}
			else if ( (LA80_0==INDEX) ) {
				alt80=34;
			}
			else if ( (LA80_0==VALUES) ) {
				alt80=35;
			}
			else if ( (LA80_0==STRING_EQUAL) ) {
				alt80=36;
			}
			else if ( (LA80_0==EMPTYSET) ) {
				alt80=37;
			}
			else if ( (LA80_0==LOCSET||LA80_0==SINGLETON) ) {
				alt80=38;
			}
			else if ( (LA80_0==UNION||LA80_0==UNION_2) ) {
				alt80=39;
			}
			else if ( (LA80_0==INTERSECT) ) {
				alt80=40;
			}
			else if ( (LA80_0==SETMINUS) ) {
				alt80=41;
			}
			else if ( (LA80_0==ALLFIELDS) ) {
				alt80=42;
			}
			else if ( (LA80_0==ALLOBJECTS) ) {
				alt80=43;
			}
			else if ( (LA80_0==UNIONINF) ) {
				alt80=44;
			}
			else if ( (LA80_0==DISJOINT) ) {
				alt80=45;
			}
			else if ( (LA80_0==SUBSET) ) {
				alt80=46;
			}
			else if ( (LA80_0==NEWELEMSFRESH) ) {
				alt80=47;
			}
			else if ( (LA80_0==SEQEMPTY) && (synpred11_KeYJMLParser())) {
				alt80=48;
			}
			else if ( (LA80_0==SEQ||LA80_0==SEQSINGLETON) && (synpred11_KeYJMLParser())) {
				alt80=48;
			}
			else if ( (LA80_0==SEQSUB) && (synpred11_KeYJMLParser())) {
				alt80=48;
			}
			else if ( (LA80_0==SEQREVERSE) && (synpred11_KeYJMLParser())) {
				alt80=48;
			}
			else if ( (LA80_0==SEQREPLACE) && (synpred11_KeYJMLParser())) {
				alt80=48;
			}
			else if ( (LA80_0==SEQCONCAT) && (synpred11_KeYJMLParser())) {
				alt80=48;
			}
			else if ( (LA80_0==SEQGET) && (synpred11_KeYJMLParser())) {
				alt80=48;
			}
			else if ( (LA80_0==INDEXOF) && (synpred11_KeYJMLParser())) {
				alt80=48;
			}

			switch (alt80) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1503:2: RESULT
					{
					match(input,RESULT,FOLLOW_RESULT_in_jmlprimary4598); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    if(resultVar==null) {
							raiseError("\\result used in wrong context");
						    } else
						    result = new SLExpression(tb.var(resultVar), resultVar.getKeYJavaType());
						}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1511:4: EXCEPTION
					{
					match(input,EXCEPTION,FOLLOW_EXCEPTION_in_jmlprimary4609); if (state.failed) return ret;
					if ( state.backtracking==0 ) { if (excVar==null) raiseError("\\exception may only appear in determines clauses");
						    else result = new SLExpression(tb.var(excVar), excVar.getKeYJavaType()); }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1515:2: ( LPAREN quantifier )=>result= specquantifiedexpression
					{
					pushFollow(FOLLOW_specquantifiedexpression_in_jmlprimary4634);
					result=specquantifiedexpression();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1517:9: ( LPAREN BSUM )=>result= bsumterm
					{
					pushFollow(FOLLOW_bsumterm_in_jmlprimary4660);
					result=bsumterm();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1519:9: ( LPAREN SEQDEF )=>result= seqdefterm
					{
					pushFollow(FOLLOW_seqdefterm_in_jmlprimary4686);
					result=seqdefterm();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;
				case 6 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1521:2: ( OLD | PRE )=>result= oldexpression
					{
					pushFollow(FOLLOW_oldexpression_in_jmlprimary4707);
					result=oldexpression();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;
				case 7 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1523:9: result= transactionUpdated
					{
					pushFollow(FOLLOW_transactionUpdated_in_jmlprimary4722);
					result=transactionUpdated();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;
				case 8 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1525:2: BACKUP LPAREN result= expression RPAREN
					{
					match(input,BACKUP,FOLLOW_BACKUP_in_jmlprimary4731); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary4733); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary4737);
					result=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary4739); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    if (atPres == null || atPres.get(getSavedHeap()) == null) {
							raiseError("JML construct " +
								   "\\backup not allowed in this context.");
						    }
						    typ = result.getType();
						    if(typ != null) {
						      result = new SLExpression(convertToBackup(result.getTerm()),
						                                result.getType());
						    } else {
						      result = new SLExpression(convertToBackup(result.getTerm()));
						    }
						}
					}
					break;
				case 9 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1540:9: PERMISSION LPAREN result= expression RPAREN
					{
					match(input,PERMISSION,FOLLOW_PERMISSION_in_jmlprimary4758); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary4760); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary4764);
					result=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary4766); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            result = new SLExpression(convertToPermission(result.getTerm()));
					        }
					}
					break;
				case 10 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1545:2: NONNULLELEMENTS LPAREN result= expression RPAREN
					{
					match(input,NONNULLELEMENTS,FOLLOW_NONNULLELEMENTS_in_jmlprimary4785); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary4787); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary4791);
					result=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary4793); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    t = result.getTerm();
						    Term resTerm = tb.not(tb.equals(t, tb.NULL()));

						    if (t.sort() instanceof ArraySort) {
							LogicVariable i = new LogicVariable(new Name("i"), javaInfo
									.getKeYJavaType(PrimitiveType.JAVA_INT)
									.getSort());

							// See JML reference manual
							// http://www.cs.iastate.edu/~leavens/JML/jmlrefman/jmlrefman_11.html#SEC139
							Term range = tb.and(
							    tb.leq(tb.zero(), tb.var(i)),
							    tb.lt(tb.var(i), tb.dotLength(t)));
							Term body = tb.equals(tb.dotArr(t, tb.var(i)), tb.NULL());
							body = tb.not(body);
							body = tb.imp(range, body);

							result = new SLExpression(tb.and(resTerm, tb.all(i, body)));
						    } else {
						        raiseError("\\nonnullelements may only be applied to arrays");
						    }
						}
					}
					break;
				case 11 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1570:9: desc= INFORMAL_DESCRIPTION
					{
					desc=(Token)match(input,INFORMAL_DESCRIPTION,FOLLOW_INFORMAL_DESCRIPTION_in_jmlprimary4809); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    result = translator.translate("(* *)", SLExpression.class, services, desc,
						        selfVar, resultVar, paramVars, atPres == null ? null : atPres.get(getBaseHeap()));
						}
					}
					break;
				case 12 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1576:9: escape= DL_ESCAPE ( ( LPAREN )=> LPAREN (list= expressionlist )? RPAREN )?
					{
					escape=(Token)match(input,DL_ESCAPE,FOLLOW_DL_ESCAPE_in_jmlprimary4825); if (state.failed) return ret;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1576:26: ( ( LPAREN )=> LPAREN (list= expressionlist )? RPAREN )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==LPAREN) ) {
						int LA73_1 = input.LA(2);
						if ( (synpred6_KeYJMLParser()) ) {
							alt73=1;
						}
					}
					switch (alt73) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1576:28: ( LPAREN )=> LPAREN (list= expressionlist )? RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary4835); if (state.failed) return ret;
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1576:47: (list= expressionlist )?
							int alt72=2;
							alt72 = dfa72.predict(input);
							switch (alt72) {
								case 1 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1576:49: list= expressionlist
									{
									pushFollow(FOLLOW_expressionlist_in_jmlprimary4841);
									list=expressionlist();
									state._fsp--;
									if (state.failed) return ret;
									}
									break;

							}

							match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary4846); if (state.failed) return ret;
							}
							break;

					}

					if ( state.backtracking==0 ) {
					            result = translator.translate("\\dl_", SLExpression.class, escape, list, services);
					        }
					}
					break;
				case 13 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1581:9: mapEmpty= MAPEMPTY
					{
					mapEmpty=(Token)match(input,MAPEMPTY,FOLLOW_MAPEMPTY_in_jmlprimary4880); if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = translator.translateMapExpressionToJDL(mapEmpty,list,services); }
					}
					break;
				case 14 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1583:9: tk= mapExpression LPAREN (list= expressionlist )? RPAREN
					{
					pushFollow(FOLLOW_mapExpression_in_jmlprimary4903);
					tk=mapExpression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary4905); if (state.failed) return ret;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1583:33: (list= expressionlist )?
					int alt74=2;
					alt74 = dfa74.predict(input);
					switch (alt74) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1583:35: list= expressionlist
							{
							pushFollow(FOLLOW_expressionlist_in_jmlprimary4911);
							list=expressionlist();
							state._fsp--;
							if (state.failed) return ret;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary4916); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
							    result = translator.translateMapExpressionToJDL(tk,list,services);
							}
					}
					break;
				case 15 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1588:9: s2m= SEQ2MAP LPAREN (list= expressionlist )? RPAREN
					{
					s2m=(Token)match(input,SEQ2MAP,FOLLOW_SEQ2MAP_in_jmlprimary4933); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary4935); if (state.failed) return ret;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1588:28: (list= expressionlist )?
					int alt75=2;
					alt75 = dfa75.predict(input);
					switch (alt75) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1588:30: list= expressionlist
							{
							pushFollow(FOLLOW_expressionlist_in_jmlprimary4941);
							list=expressionlist();
							state._fsp--;
							if (state.failed) return ret;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary4946); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
							    result = translator.translateMapExpressionToJDL(s2m,list,services);
							}
					}
					break;
				case 16 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1593:9: NOT_MODIFIED LPAREN t= storeRefUnion RPAREN
					{
					match(input,NOT_MODIFIED,FOLLOW_NOT_MODIFIED_in_jmlprimary4961); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary4963); if (state.failed) return ret;
					pushFollow(FOLLOW_storeRefUnion_in_jmlprimary4967);
					t=storeRefUnion();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary4969); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					        result = new SLExpression(translator.translate("\\not_modified", Term.class, services, atPres == null ? null : atPres.get(getBaseHeap()), t));
					        }
					}
					break;
				case 17 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1597:9: na= NOT_ASSIGNED LPAREN t= storeRefUnion RPAREN
					{
					na=(Token)match(input,NOT_ASSIGNED,FOLLOW_NOT_ASSIGNED_in_jmlprimary4991); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary4993); if (state.failed) return ret;
					pushFollow(FOLLOW_storeRefUnion_in_jmlprimary4997);
					t=storeRefUnion();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary4999); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					        result = translator.createSkolemExprBool(na);
					        }
					}
					break;
				case 18 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1604:9: FRESH LPAREN list= expressionlist RPAREN
					{
					match(input,FRESH,FOLLOW_FRESH_in_jmlprimary5026); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5028); if (state.failed) return ret;
					pushFollow(FOLLOW_expressionlist_in_jmlprimary5032);
					list=expressionlist();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5034); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					        result = translator.translate("\\fresh", SLExpression.class, list, atPres, services);
						}
					}
					break;
				case 19 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1609:9: REACH LPAREN t= storeref COMMA e1= expression COMMA e2= expression ( COMMA e3= expression )? RPAREN
					{
					match(input,REACH,FOLLOW_REACH_in_jmlprimary5048); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5050); if (state.failed) return ret;
					pushFollow(FOLLOW_storeref_in_jmlprimary5054);
					t=storeref();
					state._fsp--;
					if (state.failed) return ret;
					match(input,COMMA,FOLLOW_COMMA_in_jmlprimary5056); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary5060);
					e1=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,COMMA,FOLLOW_COMMA_in_jmlprimary5062); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary5066);
					e2=expression();
					state._fsp--;
					if (state.failed) return ret;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1609:73: ( COMMA e3= expression )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==COMMA) ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1609:74: COMMA e3= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_jmlprimary5069); if (state.failed) return ret;
							pushFollow(FOLLOW_expression_in_jmlprimary5073);
							e3=expression();
							state._fsp--;
							if (state.failed) return ret;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5077); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					        result = translator.translate("reach", SLExpression.class, t, e1, e2, e3, services);
						}
					}
					break;
				case 20 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1614:9: REACHLOCS LPAREN t= storeref COMMA e1= expression ( COMMA e3= expression )? RPAREN
					{
					match(input,REACHLOCS,FOLLOW_REACHLOCS_in_jmlprimary5091); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5093); if (state.failed) return ret;
					pushFollow(FOLLOW_storeref_in_jmlprimary5097);
					t=storeref();
					state._fsp--;
					if (state.failed) return ret;
					match(input,COMMA,FOLLOW_COMMA_in_jmlprimary5099); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary5103);
					e1=expression();
					state._fsp--;
					if (state.failed) return ret;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1614:57: ( COMMA e3= expression )?
					int alt77=2;
					int LA77_0 = input.LA(1);
					if ( (LA77_0==COMMA) ) {
						alt77=1;
					}
					switch (alt77) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1614:58: COMMA e3= expression
							{
							match(input,COMMA,FOLLOW_COMMA_in_jmlprimary5106); if (state.failed) return ret;
							pushFollow(FOLLOW_expression_in_jmlprimary5110);
							e3=expression();
							state._fsp--;
							if (state.failed) return ret;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5114); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					        result = translator.translate("reachLocs", SLExpression.class, t, e1, e3, services);
						}
					}
					break;
				case 21 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1619:9: duration= DURATION LPAREN result= expression RPAREN
					{
					duration=(Token)match(input,DURATION,FOLLOW_DURATION_in_jmlprimary5130); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5132); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary5136);
					result=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5138); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    result = translator.createSkolemExprLong(duration,services);
						}
					}
					break;
				case 22 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1624:9: space= SPACE LPAREN result= expression RPAREN
					{
					space=(Token)match(input,SPACE,FOLLOW_SPACE_in_jmlprimary5154); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5156); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary5160);
					result=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5162); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    result = translator.createSkolemExprLong(space,services);
						}
					}
					break;
				case 23 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1629:9: wspace= WORKINGSPACE LPAREN result= expression RPAREN
					{
					wspace=(Token)match(input,WORKINGSPACE,FOLLOW_WORKINGSPACE_in_jmlprimary5178); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5180); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary5184);
					result=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5186); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    result = translator.createSkolemExprLong(wspace,services);
						}
					}
					break;
				case 24 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1634:9: ( MAX )=>max= MAX LPAREN result= expression RPAREN
					{
					max=(Token)match(input,MAX,FOLLOW_MAX_in_jmlprimary5208); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5210); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary5214);
					result=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5216); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					        result = translator.createSkolemExprObject(max,services);
					    }
					}
					break;
				case 25 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1638:9: TYPEOF LPAREN result= expression RPAREN
					{
					match(input,TYPEOF,FOLLOW_TYPEOF_in_jmlprimary5232); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5234); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary5238);
					result=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5240); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    result = new SLExpression(result.getTerm(),
						                              result.getType(),
						                              false);
						}
					}
					break;
				case 26 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1645:9: ELEMTYPE LPAREN result= expression RPAREN
					{
					match(input,ELEMTYPE,FOLLOW_ELEMTYPE_in_jmlprimary5254); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5256); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary5260);
					result=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5262); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    raiseNotSupported("\\elemtype");
						}
					}
					break;
				case 27 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1650:9: TYPE_SMALL LPAREN typ= typespec RPAREN
					{
					match(input,TYPE_SMALL,FOLLOW_TYPE_SMALL_in_jmlprimary5276); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5278); if (state.failed) return ret;
					pushFollow(FOLLOW_typespec_in_jmlprimary5282);
					typ=typespec();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5284); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    result = new SLExpression(typ);
						}
					}
					break;
				case 28 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1655:9: lockset= LOCKSET
					{
					lockset=(Token)match(input,LOCKSET,FOLLOW_LOCKSET_in_jmlprimary5300); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    result = translator.createSkolemExprObject(lockset,services);
						}
					}
					break;
				case 29 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1660:9: IS_INITIALIZED LPAREN typ= referencetype RPAREN
					{
					match(input,IS_INITIALIZED,FOLLOW_IS_INITIALIZED_in_jmlprimary5314); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5316); if (state.failed) return ret;
					pushFollow(FOLLOW_referencetype_in_jmlprimary5320);
					typ=referencetype();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5322); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    Term resTerm = tb.equals(
							tb.var(
							    javaInfo.getAttribute(ImplicitFieldAdder.IMPLICIT_CLASS_INITIALIZED,
										  typ)),
							tb.TRUE());
						    result = new SLExpression(resTerm);
						}
					}
					break;
				case 30 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1670:9: INVARIANT_FOR LPAREN result= expression RPAREN
					{
					match(input,INVARIANT_FOR,FOLLOW_INVARIANT_FOR_in_jmlprimary5336); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5338); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary5342);
					result=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5344); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    result = translator.translate("\\invariant_for", SLExpression.class, services, result);

						}
					}
					break;
				case 31 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1676:6: STATIC_INVARIANT_FOR LPAREN typ= referencetype RPAREN
					{
					match(input,STATIC_INVARIANT_FOR,FOLLOW_STATIC_INVARIANT_FOR_in_jmlprimary5355); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5357); if (state.failed) return ret;
					pushFollow(FOLLOW_referencetype_in_jmlprimary5361);
					typ=referencetype();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5363); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    result = translator.translate("\\static_invariant_for", SLExpression.class, services, typ);
						}
					}
					break;
				case 32 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1681:9: ( LPAREN LBLNEG )=> LPAREN lblneg= LBLNEG IDENT result= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5387); if (state.failed) return ret;
					lblneg=(Token)match(input,LBLNEG,FOLLOW_LBLNEG_in_jmlprimary5391); if (state.failed) return ret;
					match(input,IDENT,FOLLOW_IDENT_in_jmlprimary5393); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary5397);
					result=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5399); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    addIgnoreWarning("\\lblneg",lblneg);
						}
					}
					break;
				case 33 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1686:9: ( LPAREN LBLPOS )=> LPAREN lblpos= LBLPOS IDENT result= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5423); if (state.failed) return ret;
					lblpos=(Token)match(input,LBLPOS,FOLLOW_LBLPOS_in_jmlprimary5427); if (state.failed) return ret;
					match(input,IDENT,FOLLOW_IDENT_in_jmlprimary5429); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary5433);
					result=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5435); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    addIgnoreWarning("\\lblpos",lblpos);
						}
					}
					break;
				case 34 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1690:6: INDEX
					{
					match(input,INDEX,FOLLOW_INDEX_in_jmlprimary5445); if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = translator.translate(JMLTranslator.JMLKeyWord.INDEX, services); }
					}
					break;
				case 35 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1691:6: VALUES
					{
					match(input,VALUES,FOLLOW_VALUES_in_jmlprimary5454); if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = translator.translate(JMLTranslator.JMLKeyWord.VALUES, services); }
					}
					break;
				case 36 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1692:9: STRING_EQUAL LPAREN e1= expression COMMA e2= expression RPAREN
					{
					match(input,STRING_EQUAL,FOLLOW_STRING_EQUAL_in_jmlprimary5466); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5468); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary5472);
					e1=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,COMMA,FOLLOW_COMMA_in_jmlprimary5474); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary5478);
					e2=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5480); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    Function strContent
						    	= (Function) services.getNamespaces()
					            	                     .functions()
					            	                     .lookup(CharListLDT.STRINGCONTENT_NAME);
					            if(strContent == null) {
					                raiseError("strings used in spec, but string content "
					                           + "function not found");
					            }
					            return new SLExpression(tb.equals(tb.func(strContent, e1.getTerm()),
					                                              tb.func(strContent, e2.getTerm())));
					        }
					}
					break;
				case 37 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1706:9: EMPTYSET
					{
					match(input,EMPTYSET,FOLLOW_EMPTYSET_in_jmlprimary5501); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            result = translator.translate(JMLTranslator.JMLKeyWord.EMPTY, services, javaInfo);
					        }
					}
					break;
				case 38 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1711:9: t= createLocset
					{
					pushFollow(FOLLOW_createLocset_in_jmlprimary5526);
					t=createLocset();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = new SLExpression(t, javaInfo.getPrimitiveKeYJavaType(PrimitiveType.JAVA_LOCSET)); }
					}
					break;
				case 39 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1714:9: ( UNION | UNION_2 ) LPAREN t= storeRefUnion RPAREN
					{
					if ( input.LA(1)==UNION||input.LA(1)==UNION_2 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ret;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5555); if (state.failed) return ret;
					pushFollow(FOLLOW_storeRefUnion_in_jmlprimary5559);
					t=storeRefUnion();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5561); if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = translator.translate(JMLTranslator.JMLKeyWord.UNION, t, javaInfo); }
					}
					break;
				case 40 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1717:9: INTERSECT LPAREN t= storeRefIntersect RPAREN
					{
					match(input,INTERSECT,FOLLOW_INTERSECT_in_jmlprimary5582); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5584); if (state.failed) return ret;
					pushFollow(FOLLOW_storeRefIntersect_in_jmlprimary5588);
					t=storeRefIntersect();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5590); if (state.failed) return ret;
					if ( state.backtracking==0 ) { result = translator.translate(JMLTranslator.JMLKeyWord.INTERSECT, t, javaInfo); }
					}
					break;
				case 41 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1720:9: SETMINUS LPAREN t= storeref COMMA t2= storeref RPAREN
					{
					match(input,SETMINUS,FOLLOW_SETMINUS_in_jmlprimary5611); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5613); if (state.failed) return ret;
					pushFollow(FOLLOW_storeref_in_jmlprimary5617);
					t=storeref();
					state._fsp--;
					if (state.failed) return ret;
					match(input,COMMA,FOLLOW_COMMA_in_jmlprimary5619); if (state.failed) return ret;
					pushFollow(FOLLOW_storeref_in_jmlprimary5623);
					t2=storeref();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5625); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            result = new SLExpression(tb.setMinus(t, t2),
					                                      javaInfo.getPrimitiveKeYJavaType(PrimitiveType.JAVA_LOCSET));
					        }
					}
					break;
				case 42 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1726:9: ALLFIELDS LPAREN e1= expression RPAREN
					{
					match(input,ALLFIELDS,FOLLOW_ALLFIELDS_in_jmlprimary5646); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5648); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary5652);
					e1=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5654); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            if(!e1.isTerm() || !e1.getTerm().sort().extendsTrans(services.getJavaInfo().objectSort())) {
					                raiseError("Invalid argument to \\allFields: " + e1);
					            }
					            result = new SLExpression(tb.allFields(e1.getTerm()),
					                                      javaInfo.getPrimitiveKeYJavaType(PrimitiveType.JAVA_LOCSET));
					        }
					}
					break;
				case 43 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1735:8: ALLOBJECTS LPAREN t= storeref RPAREN
					{
					match(input,ALLOBJECTS,FOLLOW_ALLOBJECTS_in_jmlprimary5674); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5676); if (state.failed) return ret;
					pushFollow(FOLLOW_storeref_in_jmlprimary5680);
					t=storeref();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5682); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            result = new SLExpression(tb.allObjects(t.sub(1)),
					                                      javaInfo.getPrimitiveKeYJavaType(PrimitiveType.JAVA_LOCSET));
					        }
					}
					break;
				case 44 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1740:9: UNIONINF LPAREN (nullable= boundvarmodifiers )? declVars= quantifiedvardecls SEMI ( ( predicate SEMI )=>t2= predicate SEMI | SEMI )? t= storeref RPAREN
					{
					match(input,UNIONINF,FOLLOW_UNIONINF_in_jmlprimary5702); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5712); if (state.failed) return ret;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1742:9: (nullable= boundvarmodifiers )?
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==NON_NULL||LA78_0==NULLABLE) ) {
						alt78=1;
					}
					switch (alt78) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1742:10: nullable= boundvarmodifiers
							{
							pushFollow(FOLLOW_boundvarmodifiers_in_jmlprimary5725);
							nullable=boundvarmodifiers();
							state._fsp--;
							if (state.failed) return ret;
							}
							break;

					}

					pushFollow(FOLLOW_quantifiedvardecls_in_jmlprimary5739);
					declVars=quantifiedvardecls();
					state._fsp--;
					if (state.failed) return ret;
					match(input,SEMI,FOLLOW_SEMI_in_jmlprimary5749); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            resolverManager.pushLocalVariablesNamespace();
					            resolverManager.putIntoTopLocalVariablesNamespace(declVars.second, declVars.first);
					        }
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1749:9: ( ( predicate SEMI )=>t2= predicate SEMI | SEMI )?
					int alt79=3;
					alt79 = dfa79.predict(input);
					switch (alt79) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1749:10: ( predicate SEMI )=>t2= predicate SEMI
							{
							pushFollow(FOLLOW_predicate_in_jmlprimary5780);
							t2=predicate();
							state._fsp--;
							if (state.failed) return ret;
							match(input,SEMI,FOLLOW_SEMI_in_jmlprimary5782); if (state.failed) return ret;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1749:50: SEMI
							{
							match(input,SEMI,FOLLOW_SEMI_in_jmlprimary5786); if (state.failed) return ret;
							}
							break;

					}

					pushFollow(FOLLOW_storeref_in_jmlprimary5801);
					t=storeref();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5811); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					               resolverManager.popLocalVariablesNamespace();
					               result = translator.translate(JMLTranslator.JMLKeyWord.UNIONINF, nullable, declVars, t, t2, services);
					        }
					}
					break;
				case 45 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1757:9: pd= DISJOINT LPAREN tlist= storeRefList RPAREN
					{
					pd=(Token)match(input,DISJOINT,FOLLOW_DISJOINT_in_jmlprimary5834); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5836); if (state.failed) return ret;
					pushFollow(FOLLOW_storeRefList_in_jmlprimary5840);
					tlist=storeRefList();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5842); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            result = translator.translate(pd.getText(), SLExpression.class, tlist, services);
					        }
					}
					break;
				case 46 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1761:9: SUBSET LPAREN t= storeref COMMA t2= storeref RPAREN
					{
					match(input,SUBSET,FOLLOW_SUBSET_in_jmlprimary5855); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5857); if (state.failed) return ret;
					pushFollow(FOLLOW_storeref_in_jmlprimary5861);
					t=storeref();
					state._fsp--;
					if (state.failed) return ret;
					match(input,COMMA,FOLLOW_COMMA_in_jmlprimary5863); if (state.failed) return ret;
					pushFollow(FOLLOW_storeref_in_jmlprimary5867);
					t2=storeref();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5869); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            result = new SLExpression(tb.subset(t, t2));
					        }
					}
					break;
				case 47 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1766:9: NEWELEMSFRESH LPAREN t= storeref RPAREN
					{
					match(input,NEWELEMSFRESH,FOLLOW_NEWELEMSFRESH_in_jmlprimary5890); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary5892); if (state.failed) return ret;
					pushFollow(FOLLOW_storeref_in_jmlprimary5896);
					t=storeref();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary5898); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            result = new SLExpression(tb.subset(t,
					                                                tb.union(convertToOld(t),
					                                                         tb.freshLocs(atPres == null ? null : atPres.get(getBaseHeap())))));

					        }
					}
					break;
				case 48 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1774:9: ( SEQEMPTY | ( LPAREN ( SEQDEF | SEQ ) quantifiedvardecls SEMI ) | ( SEQSINGLETON | SEQ ) LPAREN | SEQSUB LPAREN | SEQREVERSE | SEQREPLACE | SEQCONCAT | SEQGET | INDEXOF )=>result= sequence
					{
					pushFollow(FOLLOW_sequence_in_jmlprimary6067);
					result=sequence();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;
				case 49 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1786:9: LPAREN result= expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_jmlprimary6086); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_jmlprimary6090);
					result=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_jmlprimary6092); if (state.failed) return ret;
					}
					break;

			}
			if ( state.backtracking==0 ) {ret = result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "jmlprimary"



	// $ANTLR start "sequence"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1790:1: sequence returns [SLExpression ret = null] : ( SEQEMPTY | ( LPAREN ( SEQDEF | SEQ ) quantifiedvardecls SEMI )=>result= seqdefterm | ( SEQSINGLETON | SEQ ) LPAREN list= exprList RPAREN | SEQSUB LPAREN e1= expression COMMA e2= expression COMMA e3= expression RPAREN | SEQREVERSE LPAREN e1= expression RPAREN | SEQREPLACE LPAREN e1= expression COMMA e2= expression COMMA e3= expression RPAREN | (tk2= SEQCONCAT |tk3= SEQGET |tk4= INDEXOF ) LPAREN e1= expression COMMA e2= expression RPAREN );
	public final SLExpression sequence() throws RecognitionException, SLTranslationException {
		SLExpression ret =  null;


		Token tk2=null;
		Token tk3=null;
		Token tk4=null;
		SLExpression result =null;
		ImmutableList<SLExpression> list =null;
		SLExpression e1 =null;
		SLExpression e2 =null;
		SLExpression e3 =null;


		    ImmutableList<Term> tlist = null;
		    KeYJavaType typ;
		    Term t, t2;
		    Token tk = null;
		    Pair<KeYJavaType,ImmutableList<LogicVariable>> declVars = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1799:9: ( SEQEMPTY | ( LPAREN ( SEQDEF | SEQ ) quantifiedvardecls SEMI )=>result= seqdefterm | ( SEQSINGLETON | SEQ ) LPAREN list= exprList RPAREN | SEQSUB LPAREN e1= expression COMMA e2= expression COMMA e3= expression RPAREN | SEQREVERSE LPAREN e1= expression RPAREN | SEQREPLACE LPAREN e1= expression COMMA e2= expression COMMA e3= expression RPAREN | (tk2= SEQCONCAT |tk3= SEQGET |tk4= INDEXOF ) LPAREN e1= expression COMMA e2= expression RPAREN )
			int alt82=7;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==SEQEMPTY) ) {
				alt82=1;
			}
			else if ( (LA82_0==LPAREN) && (synpred12_KeYJMLParser())) {
				alt82=2;
			}
			else if ( (LA82_0==SEQ||LA82_0==SEQSINGLETON) ) {
				alt82=3;
			}
			else if ( (LA82_0==SEQSUB) ) {
				alt82=4;
			}
			else if ( (LA82_0==SEQREVERSE) ) {
				alt82=5;
			}
			else if ( (LA82_0==SEQREPLACE) ) {
				alt82=6;
			}
			else if ( (LA82_0==INDEXOF||LA82_0==SEQCONCAT||LA82_0==SEQGET) ) {
				alt82=7;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return ret;}
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}

			switch (alt82) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1800:9: SEQEMPTY
					{
					match(input,SEQEMPTY,FOLLOW_SEQEMPTY_in_sequence6128); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            result = new SLExpression(tb.seqEmpty());
					        }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1804:9: ( LPAREN ( SEQDEF | SEQ ) quantifiedvardecls SEMI )=>result= seqdefterm
					{
					pushFollow(FOLLOW_seqdefterm_in_sequence6168);
					result=seqdefterm();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1805:9: ( SEQSINGLETON | SEQ ) LPAREN list= exprList RPAREN
					{
					if ( input.LA(1)==SEQ||input.LA(1)==SEQSINGLETON ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ret;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,LPAREN,FOLLOW_LPAREN_in_sequence6186); if (state.failed) return ret;
					pushFollow(FOLLOW_exprList_in_sequence6190);
					list=exprList();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_sequence6192); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            result = translator.translate("\\seq", SLExpression.class, list, services);
					        }
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1810:9: SEQSUB LPAREN e1= expression COMMA e2= expression COMMA e3= expression RPAREN
					{
					match(input,SEQSUB,FOLLOW_SEQSUB_in_sequence6213); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_sequence6215); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_sequence6219);
					e1=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,COMMA,FOLLOW_COMMA_in_sequence6221); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_sequence6225);
					e2=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,COMMA,FOLLOW_COMMA_in_sequence6227); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_sequence6231);
					e3=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_sequence6233); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            result = new SLExpression(tb.seqSub(e1.getTerm(), e2.getTerm(), e3.getTerm()));
					        }
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1815:9: SEQREVERSE LPAREN e1= expression RPAREN
					{
					match(input,SEQREVERSE,FOLLOW_SEQREVERSE_in_sequence6254); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_sequence6256); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_sequence6260);
					e1=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_sequence6262); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            result = new SLExpression(tb.seqReverse(e1.getTerm()));
					        }
					}
					break;
				case 6 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1819:9: SEQREPLACE LPAREN e1= expression COMMA e2= expression COMMA e3= expression RPAREN
					{
					match(input,SEQREPLACE,FOLLOW_SEQREPLACE_in_sequence6282); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_sequence6284); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_sequence6288);
					e1=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,COMMA,FOLLOW_COMMA_in_sequence6290); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_sequence6294);
					e2=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,COMMA,FOLLOW_COMMA_in_sequence6296); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_sequence6300);
					e3=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_sequence6302); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            // short for "e1[0..e2-1]+e3+e1[e2+1..e1.length-1]"
					            final Term minusOne = tb.zTerm("-1");
					            final Term ante = tb.seqSub(e1.getTerm(), tb.zero(), tb.add(e2.getTerm(), minusOne));
					            final Term insert = tb.seqSingleton(e3.getTerm());
					            final Term post = tb.seqSub(e1.getTerm(), tb.add(e2.getTerm(), tb.one()), tb.add(tb.seqLen(e1.getTerm()), minusOne));
					            final Term put = tb.seqConcat(ante, tb.seqConcat(insert, post));
					            result = new SLExpression(put);
					        }
					}
					break;
				case 7 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1830:9: (tk2= SEQCONCAT |tk3= SEQGET |tk4= INDEXOF ) LPAREN e1= expression COMMA e2= expression RPAREN
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1830:9: (tk2= SEQCONCAT |tk3= SEQGET |tk4= INDEXOF )
					int alt81=3;
					switch ( input.LA(1) ) {
					case SEQCONCAT:
						{
						alt81=1;
						}
						break;
					case SEQGET:
						{
						alt81=2;
						}
						break;
					case INDEXOF:
						{
						alt81=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return ret;}
						NoViableAltException nvae =
							new NoViableAltException("", 81, 0, input);
						throw nvae;
					}
					switch (alt81) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1830:10: tk2= SEQCONCAT
							{
							tk2=(Token)match(input,SEQCONCAT,FOLLOW_SEQCONCAT_in_sequence6335); if (state.failed) return ret;
							if ( state.backtracking==0 ) {tk=tk2;}
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1830:36: tk3= SEQGET
							{
							tk3=(Token)match(input,SEQGET,FOLLOW_SEQGET_in_sequence6343); if (state.failed) return ret;
							if ( state.backtracking==0 ) {tk=tk3;}
							}
							break;
						case 3 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1830:59: tk4= INDEXOF
							{
							tk4=(Token)match(input,INDEXOF,FOLLOW_INDEXOF_in_sequence6351); if (state.failed) return ret;
							if ( state.backtracking==0 ) {tk=tk4;}
							}
							break;

					}

					match(input,LPAREN,FOLLOW_LPAREN_in_sequence6363); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_sequence6367);
					e1=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,COMMA,FOLLOW_COMMA_in_sequence6369); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_sequence6373);
					e2=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_sequence6375); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
					            result = translator.translate(tk.getText(), SLExpression.class, services, e1, e2);
					        }
					}
					break;

			}
			if ( state.backtracking==0 ) { ret = result; }
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "sequence"



	// $ANTLR start "mapExpression"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1837:1: mapExpression returns [Token token = null] : ( MAP_GET | MAP_OVERRIDE | MAP_UPDATE | MAP_REMOVE | IN_DOMAIN | DOMAIN_IMPLIES_CREATED | MAP_SIZE | MAP_SINGLETON | IS_FINITE ) ;
	public final Token mapExpression() throws RecognitionException {
		Token token =  null;


		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1837:44: ( ( MAP_GET | MAP_OVERRIDE | MAP_UPDATE | MAP_REMOVE | IN_DOMAIN | DOMAIN_IMPLIES_CREATED | MAP_SIZE | MAP_SINGLETON | IS_FINITE ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1838:3: ( MAP_GET | MAP_OVERRIDE | MAP_UPDATE | MAP_REMOVE | IN_DOMAIN | DOMAIN_IMPLIES_CREATED | MAP_SIZE | MAP_SINGLETON | IS_FINITE )
			{
			if ( input.LA(1)==DOMAIN_IMPLIES_CREATED||(input.LA(1) >= IN_DOMAIN && input.LA(1) <= IS_FINITE)||(input.LA(1) >= MAP_GET && input.LA(1) <= MAP_UPDATE) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return token;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( state.backtracking==0 ) { token = input.LT(-2); }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return token;
	}
	// $ANTLR end "mapExpression"



	// $ANTLR start "quantifier"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1851:1: quantifier returns [Token token = null] : ( FORALL | EXISTS | MIN | MAX | NUM_OF | PRODUCT | SUM ) ;
	public final Token quantifier() throws RecognitionException {
		Token token =  null;


		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1851:41: ( ( FORALL | EXISTS | MIN | MAX | NUM_OF | PRODUCT | SUM ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1852:3: ( FORALL | EXISTS | MIN | MAX | NUM_OF | PRODUCT | SUM )
			{
			if ( input.LA(1)==EXISTS||input.LA(1)==FORALL||input.LA(1)==MAX||input.LA(1)==MIN||input.LA(1)==NUM_OF||input.LA(1)==PRODUCT||input.LA(1)==SUM ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return token;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( state.backtracking==0 ) { token = input.LT(-1); }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return token;
	}
	// $ANTLR end "quantifier"



	// $ANTLR start "specquantifiedexpression"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1863:1: specquantifiedexpression returns [SLExpression result = null] : LPAREN q= quantifier (nullable= boundvarmodifiers )? declVars= quantifiedvardecls SEMI ( ( predicate SEMI )=>p= predicate SEMI | SEMI )? expr= expression RPAREN ;
	public final SLExpression specquantifiedexpression() throws RecognitionException, SLTranslationException {
		SLExpression result =  null;


		Token q =null;
		boolean nullable =false;
		Pair<KeYJavaType,ImmutableList<LogicVariable>> declVars =null;
		Term p =null;
		SLExpression expr =null;


		    p = tb.tt();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1867:2: ( LPAREN q= quantifier (nullable= boundvarmodifiers )? declVars= quantifiedvardecls SEMI ( ( predicate SEMI )=>p= predicate SEMI | SEMI )? expr= expression RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1868:2: LPAREN q= quantifier (nullable= boundvarmodifiers )? declVars= quantifiedvardecls SEMI ( ( predicate SEMI )=>p= predicate SEMI | SEMI )? expr= expression RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_specquantifiedexpression6550); if (state.failed) return result;
			pushFollow(FOLLOW_quantifier_in_specquantifiedexpression6555);
			q=quantifier();
			state._fsp--;
			if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1870:2: (nullable= boundvarmodifiers )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==NON_NULL||LA83_0==NULLABLE) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1870:3: nullable= boundvarmodifiers
					{
					pushFollow(FOLLOW_boundvarmodifiers_in_specquantifiedexpression6561);
					nullable=boundvarmodifiers();
					state._fsp--;
					if (state.failed) return result;
					}
					break;

			}

			pushFollow(FOLLOW_quantifiedvardecls_in_specquantifiedexpression6568);
			declVars=quantifiedvardecls();
			state._fsp--;
			if (state.failed) return result;
			match(input,SEMI,FOLLOW_SEMI_in_specquantifiedexpression6570); if (state.failed) return result;
			if ( state.backtracking==0 ) {
				    resolverManager.pushLocalVariablesNamespace();
				    resolverManager.putIntoTopLocalVariablesNamespace(declVars.second, declVars.first);
				}
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1876:2: ( ( predicate SEMI )=>p= predicate SEMI | SEMI )?
			int alt84=3;
			alt84 = dfa84.predict(input);
			switch (alt84) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1876:3: ( predicate SEMI )=>p= predicate SEMI
					{
					pushFollow(FOLLOW_predicate_in_specquantifiedexpression6587);
					p=predicate();
					state._fsp--;
					if (state.failed) return result;
					match(input,SEMI,FOLLOW_SEMI_in_specquantifiedexpression6589); if (state.failed) return result;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1876:42: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_specquantifiedexpression6593); if (state.failed) return result;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_specquantifiedexpression6600);
			expr=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
				    resolverManager.popLocalVariablesNamespace();

				    p = tb.convertToFormula(p);
				    result = translator.translate(q.getText(), SLExpression.class, p, expr.getTerm(), declVars.first, declVars.second, nullable, expr.getType(), services);
				}
			match(input,RPAREN,FOLLOW_RPAREN_in_specquantifiedexpression6606); if (state.failed) return result;
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "specquantifiedexpression"



	// $ANTLR start "oldexpression"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1887:1: oldexpression returns [SLExpression ret=null] : ( PRE LPAREN result= expression RPAREN | OLD LPAREN result= expression ( COMMA id= IDENT )? RPAREN ) ;
	public final SLExpression oldexpression() throws RecognitionException, SLTranslationException {
		SLExpression ret = null;


		Token id=null;
		SLExpression result =null;


		    KeYJavaType typ;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1892:5: ( ( PRE LPAREN result= expression RPAREN | OLD LPAREN result= expression ( COMMA id= IDENT )? RPAREN ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1893:5: ( PRE LPAREN result= expression RPAREN | OLD LPAREN result= expression ( COMMA id= IDENT )? RPAREN )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1893:5: ( PRE LPAREN result= expression RPAREN | OLD LPAREN result= expression ( COMMA id= IDENT )? RPAREN )
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==PRE) ) {
				alt86=1;
			}
			else if ( (LA86_0==OLD) ) {
				alt86=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return ret;}
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				throw nvae;
			}

			switch (alt86) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1894:5: PRE LPAREN result= expression RPAREN
					{
					match(input,PRE,FOLLOW_PRE_in_oldexpression6643); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_oldexpression6645); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_oldexpression6649);
					result=expression();
					state._fsp--;
					if (state.failed) return ret;
					match(input,RPAREN,FOLLOW_RPAREN_in_oldexpression6651); if (state.failed) return ret;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1896:5: OLD LPAREN result= expression ( COMMA id= IDENT )? RPAREN
					{
					match(input,OLD,FOLLOW_OLD_in_oldexpression6663); if (state.failed) return ret;
					match(input,LPAREN,FOLLOW_LPAREN_in_oldexpression6665); if (state.failed) return ret;
					pushFollow(FOLLOW_expression_in_oldexpression6669);
					result=expression();
					state._fsp--;
					if (state.failed) return ret;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1896:34: ( COMMA id= IDENT )?
					int alt85=2;
					int LA85_0 = input.LA(1);
					if ( (LA85_0==COMMA) ) {
						alt85=1;
					}
					switch (alt85) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1896:35: COMMA id= IDENT
							{
							match(input,COMMA,FOLLOW_COMMA_in_oldexpression6672); if (state.failed) return ret;
							id=(Token)match(input,IDENT,FOLLOW_IDENT_in_oldexpression6676); if (state.failed) return ret;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_oldexpression6680); if (state.failed) return ret;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			        if (atPres == null || atPres.get(getBaseHeap()) == null) {
			        raiseError("JML construct " +
			               "\\old not allowed in this context.");
			        }

			        if (id != null) addIgnoreWarning("\\old with label",id);

			        typ = result.getType();
			        if(typ != null) {
			          result = new SLExpression(convertToOld(result.getTerm()),
			                                    result.getType());
			        } else {
			          result = new SLExpression(convertToOld(result.getTerm()));
			        }
			    }
			}

			if ( state.backtracking==0 ) {ret = result;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "oldexpression"



	// $ANTLR start "bsumterm"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1916:1: bsumterm returns [SLExpression result=null] : LPAREN q= BSUM decls= quantifiedvardecls SEMI (a= expression SEMI b= expression SEMI t= expression ) RPAREN ;
	public final SLExpression bsumterm() throws RecognitionException, SLTranslationException {
		SLExpression result = null;


		Token q=null;
		Pair<KeYJavaType,ImmutableList<LogicVariable>> decls =null;
		SLExpression a =null;
		SLExpression b =null;
		SLExpression t =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1917:5: ( LPAREN q= BSUM decls= quantifiedvardecls SEMI (a= expression SEMI b= expression SEMI t= expression ) RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1918:9: LPAREN q= BSUM decls= quantifiedvardecls SEMI (a= expression SEMI b= expression SEMI t= expression ) RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_bsumterm6721); if (state.failed) return result;
			q=(Token)match(input,BSUM,FOLLOW_BSUM_in_bsumterm6733); if (state.failed) return result;
			pushFollow(FOLLOW_quantifiedvardecls_in_bsumterm6737);
			decls=quantifiedvardecls();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
			            resolverManager.pushLocalVariablesNamespace();
			            resolverManager.putIntoTopLocalVariablesNamespace(decls.second, decls.first);
			        }
			match(input,SEMI,FOLLOW_SEMI_in_bsumterm6757); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1925:9: (a= expression SEMI b= expression SEMI t= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1926:13: a= expression SEMI b= expression SEMI t= expression
			{
			pushFollow(FOLLOW_expression_in_bsumterm6783);
			a=expression();
			state._fsp--;
			if (state.failed) return result;
			match(input,SEMI,FOLLOW_SEMI_in_bsumterm6785); if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_bsumterm6790);
			b=expression();
			state._fsp--;
			if (state.failed) return result;
			match(input,SEMI,FOLLOW_SEMI_in_bsumterm6792); if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_bsumterm6796);
			t=expression();
			state._fsp--;
			if (state.failed) return result;
			}

			if ( state.backtracking==0 ) {
			            result = translator.translate(q.getText(), SLExpression.class, a, b, t, decls.first, decls.second, services);
			            resolverManager.popLocalVariablesNamespace();
			        }
			match(input,RPAREN,FOLLOW_RPAREN_in_bsumterm6826); if (state.failed) return result;
			}

		}
		catch (SLTranslationException ex) {

			        resolverManager.popLocalVariablesNamespace();
			        throw ex;
			        
		}

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "bsumterm"



	// $ANTLR start "seqdefterm"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1940:1: seqdefterm returns [SLExpression result=null] : LPAREN q= SEQDEF decls= quantifiedvardecls SEMI (a= expression SEMI b= expression SEMI t= expression ) RPAREN ;
	public final SLExpression seqdefterm() throws RecognitionException, SLTranslationException {
		SLExpression result = null;


		Token q=null;
		Pair<KeYJavaType,ImmutableList<LogicVariable>> decls =null;
		SLExpression a =null;
		SLExpression b =null;
		SLExpression t =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1941:5: ( LPAREN q= SEQDEF decls= quantifiedvardecls SEMI (a= expression SEMI b= expression SEMI t= expression ) RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1942:9: LPAREN q= SEQDEF decls= quantifiedvardecls SEMI (a= expression SEMI b= expression SEMI t= expression ) RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_seqdefterm6870); if (state.failed) return result;
			q=(Token)match(input,SEQDEF,FOLLOW_SEQDEF_in_seqdefterm6882); if (state.failed) return result;
			pushFollow(FOLLOW_quantifiedvardecls_in_seqdefterm6886);
			decls=quantifiedvardecls();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
			            resolverManager.pushLocalVariablesNamespace();
			            resolverManager.putIntoTopLocalVariablesNamespace(decls.second, decls.first);
			        }
			match(input,SEMI,FOLLOW_SEMI_in_seqdefterm6906); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1949:9: (a= expression SEMI b= expression SEMI t= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1950:13: a= expression SEMI b= expression SEMI t= expression
			{
			pushFollow(FOLLOW_expression_in_seqdefterm6932);
			a=expression();
			state._fsp--;
			if (state.failed) return result;
			match(input,SEMI,FOLLOW_SEMI_in_seqdefterm6934); if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_seqdefterm6939);
			b=expression();
			state._fsp--;
			if (state.failed) return result;
			match(input,SEMI,FOLLOW_SEMI_in_seqdefterm6941); if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_seqdefterm6945);
			t=expression();
			state._fsp--;
			if (state.failed) return result;
			}

			if ( state.backtracking==0 ) {
			            result = translator.translate(q.getText(), SLExpression.class, a, b, t, decls.first, decls.second, services);
			            resolverManager.popLocalVariablesNamespace();
			        }
			match(input,RPAREN,FOLLOW_RPAREN_in_seqdefterm6975); if (state.failed) return result;
			}

		}
		catch (SLTranslationException ex) {

			        resolverManager.popLocalVariablesNamespace();
			        throw ex;
			        
		}

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "seqdefterm"



	// $ANTLR start "quantifiedvardecls"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1963:1: quantifiedvardecls returns [Pair<KeYJavaType,ImmutableList<LogicVariable>> result = null] : t= typespec v= quantifiedvariabledeclarator[t] ( COMMA v= quantifiedvariabledeclarator[t] )* ;
	public final Pair<KeYJavaType,ImmutableList<LogicVariable>> quantifiedvardecls() throws RecognitionException, SLTranslationException {
		Pair<KeYJavaType,ImmutableList<LogicVariable>> result =  null;


		KeYJavaType t =null;
		LogicVariable v =null;


		    ImmutableList<LogicVariable> vars = ImmutableSLList.<LogicVariable>nil();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1968:2: (t= typespec v= quantifiedvariabledeclarator[t] ( COMMA v= quantifiedvariabledeclarator[t] )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1969:2: t= typespec v= quantifiedvariabledeclarator[t] ( COMMA v= quantifiedvariabledeclarator[t] )*
			{
			pushFollow(FOLLOW_typespec_in_quantifiedvardecls7033);
			t=typespec();
			state._fsp--;
			if (state.failed) return result;
			pushFollow(FOLLOW_quantifiedvariabledeclarator_in_quantifiedvardecls7037);
			v=quantifiedvariabledeclarator(t);
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { vars = vars.append(v); }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1973:2: ( COMMA v= quantifiedvariabledeclarator[t] )*
			loop87:
			while (true) {
				int alt87=2;
				int LA87_0 = input.LA(1);
				if ( (LA87_0==COMMA) ) {
					alt87=1;
				}

				switch (alt87) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1974:6: COMMA v= quantifiedvariabledeclarator[t]
					{
					match(input,COMMA,FOLLOW_COMMA_in_quantifiedvardecls7053); if (state.failed) return result;
					pushFollow(FOLLOW_quantifiedvariabledeclarator_in_quantifiedvardecls7057);
					v=quantifiedvariabledeclarator(t);
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { vars = vars.append(v); }
					}
					break;

				default :
					break loop87;
				}
			}

			if ( state.backtracking==0 ) {
				    result = new Pair<KeYJavaType,ImmutableList<LogicVariable>>(t, vars);
				}
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "quantifiedvardecls"



	// $ANTLR start "boundvarmodifiers"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1983:1: boundvarmodifiers returns [boolean nullable = false] : ( NON_NULL | NULLABLE );
	public final boolean boundvarmodifiers() throws RecognitionException, SLTranslationException {
		boolean nullable =  false;


		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1984:2: ( NON_NULL | NULLABLE )
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==NON_NULL) ) {
				alt88=1;
			}
			else if ( (LA88_0==NULLABLE) ) {
				alt88=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return nullable;}
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}

			switch (alt88) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1985:2: NON_NULL
					{
					match(input,NON_NULL,FOLLOW_NON_NULL_in_boundvarmodifiers7091); if (state.failed) return nullable;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1985:13: NULLABLE
					{
					match(input,NULLABLE,FOLLOW_NULLABLE_in_boundvarmodifiers7095); if (state.failed) return nullable;
					if ( state.backtracking==0 ) { nullable = true; }
					}
					break;

			}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return nullable;
	}
	// $ANTLR end "boundvarmodifiers"



	// $ANTLR start "typespec"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1988:1: typespec returns [KeYJavaType ret = null] : t= type (dim= dims )? ;
	public final KeYJavaType typespec() throws RecognitionException, SLTranslationException {
		KeYJavaType ret =  null;


		KeYJavaType t =null;
		int dim =0;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1990:2: (t= type (dim= dims )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1991:2: t= type (dim= dims )?
			{
			pushFollow(FOLLOW_type_in_typespec7122);
			t=type();
			state._fsp--;
			if (state.failed) return ret;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1992:2: (dim= dims )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==LBRACKET) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1993:6: dim= dims
					{
					pushFollow(FOLLOW_dims_in_typespec7134);
					dim=dims();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) {
							String fullName = t.getFullName();
							for (int i=0; i < dim; i++) {
							    fullName += "[]";
							}
							t = javaInfo.getKeYJavaType(fullName);
						if(t == null && dim > 0) {
						    //try to create missing array type
						      try {
						    javaInfo.readJavaBlock("{" + fullName + " k;}");
						    t = javaInfo.getKeYJavaType(fullName);
						    } catch (Exception e) {
						    t = null;
							}
						    }
						    }
					}
					break;

			}

			}

			if ( state.backtracking==0 ) {ret = t;}
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "typespec"



	// $ANTLR start "dims"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2013:1: dims returns [int dimension = 0] : ( LBRACKET RBRACKET )+ ;
	public final int dims() throws RecognitionException, SLTranslationException {
		int dimension =  0;


		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2014:2: ( ( LBRACKET RBRACKET )+ )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2015:2: ( LBRACKET RBRACKET )+
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2015:2: ( LBRACKET RBRACKET )+
			int cnt90=0;
			loop90:
			while (true) {
				int alt90=2;
				int LA90_0 = input.LA(1);
				if ( (LA90_0==LBRACKET) ) {
					alt90=1;
				}

				switch (alt90) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2015:3: LBRACKET RBRACKET
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_dims7164); if (state.failed) return dimension;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_dims7166); if (state.failed) return dimension;
					if ( state.backtracking==0 ) { dimension++; }
					}
					break;

				default :
					if ( cnt90 >= 1 ) break loop90;
					if (state.backtracking>0) {state.failed=true; return dimension;}
					EarlyExitException eee = new EarlyExitException(90, input);
					throw eee;
				}
				cnt90++;
			}

			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return dimension;
	}
	// $ANTLR end "dims"



	// $ANTLR start "type"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2018:1: type returns [KeYJavaType ret = null] : ( ( builtintype )=>t= builtintype |t= referencetype | TYPE );
	public final KeYJavaType type() throws RecognitionException, SLTranslationException {
		KeYJavaType ret =  null;


		KeYJavaType t =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2020:2: ( ( builtintype )=>t= builtintype |t= referencetype | TYPE )
			int alt91=3;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==BYTE) && (synpred14_KeYJMLParser())) {
				alt91=1;
			}
			else if ( (LA91_0==SHORT) && (synpred14_KeYJMLParser())) {
				alt91=1;
			}
			else if ( (LA91_0==INT) && (synpred14_KeYJMLParser())) {
				alt91=1;
			}
			else if ( (LA91_0==LONG) && (synpred14_KeYJMLParser())) {
				alt91=1;
			}
			else if ( (LA91_0==BOOLEAN) && (synpred14_KeYJMLParser())) {
				alt91=1;
			}
			else if ( (LA91_0==VOID) && (synpred14_KeYJMLParser())) {
				alt91=1;
			}
			else if ( (LA91_0==BIGINT) && (synpred14_KeYJMLParser())) {
				alt91=1;
			}
			else if ( (LA91_0==REAL) && (synpred14_KeYJMLParser())) {
				alt91=1;
			}
			else if ( (LA91_0==LOCSET) && (synpred14_KeYJMLParser())) {
				alt91=1;
			}
			else if ( (LA91_0==SEQ) && (synpred14_KeYJMLParser())) {
				alt91=1;
			}
			else if ( (LA91_0==FREE) && (synpred14_KeYJMLParser())) {
				alt91=1;
			}
			else if ( (LA91_0==IDENT) ) {
				alt91=2;
			}
			else if ( (LA91_0==TYPE) ) {
				alt91=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return ret;}
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}

			switch (alt91) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2021:2: ( builtintype )=>t= builtintype
					{
					pushFollow(FOLLOW_builtintype_in_type7205);
					t=builtintype();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2023:2: t= referencetype
					{
					pushFollow(FOLLOW_referencetype_in_type7216);
					t=referencetype();
					state._fsp--;
					if (state.failed) return ret;
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2025:2: TYPE
					{
					match(input,TYPE,FOLLOW_TYPE_in_type7225); if (state.failed) return ret;
					if ( state.backtracking==0 ) {
						    raiseNotSupported("\\TYPE");
						}
					}
					break;

			}
			if ( state.backtracking==0 ) { ret = t; }
		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "type"



	// $ANTLR start "referencetype"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2032:1: referencetype returns [KeYJavaType type = null] : typename= name ;
	public final KeYJavaType referencetype() throws RecognitionException, SLTranslationException {
		KeYJavaType type =  null;


		String typename =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2033:5: (typename= name )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2034:2: typename= name
			{
			pushFollow(FOLLOW_name_in_referencetype7253);
			typename=name();
			state._fsp--;
			if (state.failed) return type;
			if ( state.backtracking==0 ) {
				    try {
					type = resolverManager.resolve(null, typename, null).getType();
				    } catch (NullPointerException e) {
					raiseError("Type " + typename + " not found.");
				    }
				}
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "referencetype"



	// $ANTLR start "builtintype"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2044:1: builtintype returns [KeYJavaType type = null] : ( BYTE | SHORT | INT | LONG | BOOLEAN | VOID | BIGINT | REAL | LOCSET | SEQ | FREE ) ;
	public final KeYJavaType builtintype() throws RecognitionException, SLTranslationException {
		KeYJavaType type =  null;


		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2045:2: ( ( BYTE | SHORT | INT | LONG | BOOLEAN | VOID | BIGINT | REAL | LOCSET | SEQ | FREE ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2046:2: ( BYTE | SHORT | INT | LONG | BOOLEAN | VOID | BIGINT | REAL | LOCSET | SEQ | FREE )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2046:2: ( BYTE | SHORT | INT | LONG | BOOLEAN | VOID | BIGINT | REAL | LOCSET | SEQ | FREE )
			int alt92=11;
			switch ( input.LA(1) ) {
			case BYTE:
				{
				alt92=1;
				}
				break;
			case SHORT:
				{
				alt92=2;
				}
				break;
			case INT:
				{
				alt92=3;
				}
				break;
			case LONG:
				{
				alt92=4;
				}
				break;
			case BOOLEAN:
				{
				alt92=5;
				}
				break;
			case VOID:
				{
				alt92=6;
				}
				break;
			case BIGINT:
				{
				alt92=7;
				}
				break;
			case REAL:
				{
				alt92=8;
				}
				break;
			case LOCSET:
				{
				alt92=9;
				}
				break;
			case SEQ:
				{
				alt92=10;
				}
				break;
			case FREE:
				{
				alt92=11;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return type;}
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}
			switch (alt92) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2047:6: BYTE
					{
					match(input,BYTE,FOLLOW_BYTE_in_builtintype7281); if (state.failed) return type;
					if ( state.backtracking==0 ) {
							type = javaInfo.getKeYJavaType(PrimitiveType.JAVA_BYTE);
						    }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2052:6: SHORT
					{
					match(input,SHORT,FOLLOW_SHORT_in_builtintype7298); if (state.failed) return type;
					if ( state.backtracking==0 ) {
							type = javaInfo.getKeYJavaType(PrimitiveType.JAVA_SHORT);
						    }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2057:6: INT
					{
					match(input,INT,FOLLOW_INT_in_builtintype7315); if (state.failed) return type;
					if ( state.backtracking==0 ) {
							type = javaInfo.getKeYJavaType(PrimitiveType.JAVA_INT);
						    }
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2062:6: LONG
					{
					match(input,LONG,FOLLOW_LONG_in_builtintype7332); if (state.failed) return type;
					if ( state.backtracking==0 ) {
							type = javaInfo.getKeYJavaType(PrimitiveType.JAVA_LONG);
						    }
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2067:6: BOOLEAN
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_builtintype7349); if (state.failed) return type;
					if ( state.backtracking==0 ) {
							type = javaInfo.getKeYJavaType(PrimitiveType.JAVA_BOOLEAN);
						    }
					}
					break;
				case 6 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2072:6: VOID
					{
					match(input,VOID,FOLLOW_VOID_in_builtintype7366); if (state.failed) return type;
					if ( state.backtracking==0 ) {
							type = KeYJavaType.VOID_TYPE;
						    }
					}
					break;
				case 7 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2077:6: BIGINT
					{
					match(input,BIGINT,FOLLOW_BIGINT_in_builtintype7383); if (state.failed) return type;
					if ( state.backtracking==0 ) {
							type = javaInfo.getKeYJavaType(PrimitiveType.JAVA_BIGINT);
						    }
					}
					break;
				case 8 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2082:6: REAL
					{
					match(input,REAL,FOLLOW_REAL_in_builtintype7400); if (state.failed) return type;
					if ( state.backtracking==0 ) {
							type = javaInfo.getKeYJavaType(PrimitiveType.JAVA_REAL);
						    }
					}
					break;
				case 9 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2086:13: LOCSET
					{
					match(input,LOCSET,FOLLOW_LOCSET_in_builtintype7421); if (state.failed) return type;
					if ( state.backtracking==0 ) {
					                type = javaInfo.getKeYJavaType(PrimitiveType.JAVA_LOCSET);
					            }
					}
					break;
				case 10 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2090:13: SEQ
					{
					match(input,SEQ,FOLLOW_SEQ_in_builtintype7449); if (state.failed) return type;
					if ( state.backtracking==0 ) {
					                type = javaInfo.getKeYJavaType(PrimitiveType.JAVA_SEQ);
					            }
					}
					break;
				case 11 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2094:11: FREE
					{
					match(input,FREE,FOLLOW_FREE_in_builtintype7475); if (state.failed) return type;
					if ( state.backtracking==0 ) { type = javaInfo.getKeYJavaType(PrimitiveType.JAVA_FREE_ADT); }
					}
					break;

			}

			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "builtintype"



	// $ANTLR start "name"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2099:1: name returns [String result = \"\"] : id= IDENT ( DOT id1= IDENT )* ;
	public final String name() throws RecognitionException, SLTranslationException {
		String result =  "";


		Token id=null;
		Token id1=null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2100:2: (id= IDENT ( DOT id1= IDENT )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2101:2: id= IDENT ( DOT id1= IDENT )*
			{
			id=(Token)match(input,IDENT,FOLLOW_IDENT_in_name7501); if (state.failed) return result;
			if ( state.backtracking==0 ) { result += id.getText(); }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2103:2: ( DOT id1= IDENT )*
			loop93:
			while (true) {
				int alt93=2;
				int LA93_0 = input.LA(1);
				if ( (LA93_0==DOT) ) {
					alt93=1;
				}

				switch (alt93) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2104:6: DOT id1= IDENT
					{
					match(input,DOT,FOLLOW_DOT_in_name7514); if (state.failed) return result;
					id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_name7518); if (state.failed) return result;
					if ( state.backtracking==0 ) { result += "." + id1.getText(); }
					}
					break;

				default :
					break loop93;
				}
			}

			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "name"



	// $ANTLR start "quantifiedvariabledeclarator"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2109:1: quantifiedvariabledeclarator[KeYJavaType t] returns [LogicVariable v = null] : id= IDENT (dim= dims )? ;
	public final LogicVariable quantifiedvariabledeclarator(KeYJavaType t) throws RecognitionException, SLTranslationException {
		LogicVariable v =  null;


		Token id=null;
		int dim =0;


		    KeYJavaType varType = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2113:4: (id= IDENT (dim= dims )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2114:4: id= IDENT (dim= dims )?
			{
			id=(Token)match(input,IDENT,FOLLOW_IDENT_in_quantifiedvariabledeclarator7557); if (state.failed) return v;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2114:13: (dim= dims )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==LBRACKET) ) {
				alt94=1;
			}
			switch (alt94) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2114:14: dim= dims
					{
					pushFollow(FOLLOW_dims_in_quantifiedvariabledeclarator7562);
					dim=dims();
					state._fsp--;
					if (state.failed) return v;
					}
					break;

			}

			if ( state.backtracking==0 ) {
				  if (dim > 0) {
				    String fullName;
				    if (t.getJavaType() instanceof ArrayType) {
					fullName = ((ArrayType) t.getJavaType()).getAlternativeNameRepresentation();
				    } else {
					fullName = t.getFullName();
				    }
				    for (int i=0; i < dim; i++) {
					fullName += "[]";
				    }

				    varType = javaInfo.getKeYJavaType(fullName);
				  } else {
					  varType = t;
				  }

				  v = new LogicVariable(new Name(id.getText()), varType.getSort());
			   }
			}

		}

		    catch(RecognitionException re) {
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return v;
	}
	// $ANTLR end "quantifiedvariabledeclarator"

	// $ANTLR start synpred1_KeYJMLParser
	public final void synpred1_KeYJMLParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1185:2: ( LPAREN typespec RPAREN )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1185:3: LPAREN typespec RPAREN
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred1_KeYJMLParser3594); if (state.failed) return;
		pushFollow(FOLLOW_typespec_in_synpred1_KeYJMLParser3596);
		typespec();
		state._fsp--;
		if (state.failed) return;
		match(input,RPAREN,FOLLOW_RPAREN_in_synpred1_KeYJMLParser3598); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_KeYJMLParser

	// $ANTLR start synpred2_KeYJMLParser
	public final void synpred2_KeYJMLParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1515:2: ( LPAREN quantifier )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1515:3: LPAREN quantifier
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred2_KeYJMLParser4625); if (state.failed) return;
		pushFollow(FOLLOW_quantifier_in_synpred2_KeYJMLParser4627);
		quantifier();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_KeYJMLParser

	// $ANTLR start synpred3_KeYJMLParser
	public final void synpred3_KeYJMLParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1517:9: ( LPAREN BSUM )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1517:10: LPAREN BSUM
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred3_KeYJMLParser4651); if (state.failed) return;
		match(input,BSUM,FOLLOW_BSUM_in_synpred3_KeYJMLParser4653); if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_KeYJMLParser

	// $ANTLR start synpred4_KeYJMLParser
	public final void synpred4_KeYJMLParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1519:9: ( LPAREN SEQDEF )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1519:10: LPAREN SEQDEF
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred4_KeYJMLParser4677); if (state.failed) return;
		match(input,SEQDEF,FOLLOW_SEQDEF_in_synpred4_KeYJMLParser4679); if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_KeYJMLParser

	// $ANTLR start synpred5_KeYJMLParser
	public final void synpred5_KeYJMLParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1521:2: ( OLD | PRE )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:
		{
		if ( input.LA(1)==OLD||input.LA(1)==PRE ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		}

	}
	// $ANTLR end synpred5_KeYJMLParser

	// $ANTLR start synpred6_KeYJMLParser
	public final void synpred6_KeYJMLParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1576:28: ( LPAREN )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1576:29: LPAREN
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred6_KeYJMLParser4830); if (state.failed) return;
		}

	}
	// $ANTLR end synpred6_KeYJMLParser

	// $ANTLR start synpred7_KeYJMLParser
	public final void synpred7_KeYJMLParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1634:9: ( MAX )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1634:10: MAX
		{
		match(input,MAX,FOLLOW_MAX_in_synpred7_KeYJMLParser5201); if (state.failed) return;
		}

	}
	// $ANTLR end synpred7_KeYJMLParser

	// $ANTLR start synpred8_KeYJMLParser
	public final void synpred8_KeYJMLParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1681:9: ( LPAREN LBLNEG )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1681:11: LPAREN LBLNEG
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred8_KeYJMLParser5379); if (state.failed) return;
		match(input,LBLNEG,FOLLOW_LBLNEG_in_synpred8_KeYJMLParser5381); if (state.failed) return;
		}

	}
	// $ANTLR end synpred8_KeYJMLParser

	// $ANTLR start synpred9_KeYJMLParser
	public final void synpred9_KeYJMLParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1686:9: ( LPAREN LBLPOS )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1686:11: LPAREN LBLPOS
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred9_KeYJMLParser5415); if (state.failed) return;
		match(input,LBLPOS,FOLLOW_LBLPOS_in_synpred9_KeYJMLParser5417); if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_KeYJMLParser

	// $ANTLR start synpred10_KeYJMLParser
	public final void synpred10_KeYJMLParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1749:10: ( predicate SEMI )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1749:11: predicate SEMI
		{
		pushFollow(FOLLOW_predicate_in_synpred10_KeYJMLParser5771);
		predicate();
		state._fsp--;
		if (state.failed) return;
		match(input,SEMI,FOLLOW_SEMI_in_synpred10_KeYJMLParser5773); if (state.failed) return;
		}

	}
	// $ANTLR end synpred10_KeYJMLParser

	// $ANTLR start synpred11_KeYJMLParser
	public final void synpred11_KeYJMLParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1774:9: ( SEQEMPTY | ( LPAREN ( SEQDEF | SEQ ) quantifiedvardecls SEMI ) | ( SEQSINGLETON | SEQ ) LPAREN | SEQSUB LPAREN | SEQREVERSE | SEQREPLACE | SEQCONCAT | SEQGET | INDEXOF )
		int alt95=9;
		switch ( input.LA(1) ) {
		case SEQEMPTY:
			{
			alt95=1;
			}
			break;
		case LPAREN:
			{
			alt95=2;
			}
			break;
		case SEQ:
		case SEQSINGLETON:
			{
			alt95=3;
			}
			break;
		case SEQSUB:
			{
			alt95=4;
			}
			break;
		case SEQREVERSE:
			{
			alt95=5;
			}
			break;
		case SEQREPLACE:
			{
			alt95=6;
			}
			break;
		case SEQCONCAT:
			{
			alt95=7;
			}
			break;
		case SEQGET:
			{
			alt95=8;
			}
			break;
		case INDEXOF:
			{
			alt95=9;
			}
			break;
		default:
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 95, 0, input);
			throw nvae;
		}
		switch (alt95) {
			case 1 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1774:10: SEQEMPTY
				{
				match(input,SEQEMPTY,FOLLOW_SEQEMPTY_in_synpred11_KeYJMLParser5920); if (state.failed) return;
				}
				break;
			case 2 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1775:11: ( LPAREN ( SEQDEF | SEQ ) quantifiedvardecls SEMI )
				{
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1775:11: ( LPAREN ( SEQDEF | SEQ ) quantifiedvardecls SEMI )
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1775:12: LPAREN ( SEQDEF | SEQ ) quantifiedvardecls SEMI
				{
				match(input,LPAREN,FOLLOW_LPAREN_in_synpred11_KeYJMLParser5933); if (state.failed) return;
				if ( input.LA(1)==SEQ||input.LA(1)==SEQDEF ) {
					input.consume();
					state.errorRecovery=false;
					state.failed=false;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return;}
					MismatchedSetException mse = new MismatchedSetException(null,input);
					throw mse;
				}
				pushFollow(FOLLOW_quantifiedvardecls_in_synpred11_KeYJMLParser5943);
				quantifiedvardecls();
				state._fsp--;
				if (state.failed) return;
				match(input,SEMI,FOLLOW_SEMI_in_synpred11_KeYJMLParser5945); if (state.failed) return;
				}

				}
				break;
			case 3 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1776:11: ( SEQSINGLETON | SEQ ) LPAREN
				{
				if ( input.LA(1)==SEQ||input.LA(1)==SEQSINGLETON ) {
					input.consume();
					state.errorRecovery=false;
					state.failed=false;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return;}
					MismatchedSetException mse = new MismatchedSetException(null,input);
					throw mse;
				}
				match(input,LPAREN,FOLLOW_LPAREN_in_synpred11_KeYJMLParser5966); if (state.failed) return;
				}
				break;
			case 4 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1777:11: SEQSUB LPAREN
				{
				match(input,SEQSUB,FOLLOW_SEQSUB_in_synpred11_KeYJMLParser5978); if (state.failed) return;
				match(input,LPAREN,FOLLOW_LPAREN_in_synpred11_KeYJMLParser5980); if (state.failed) return;
				}
				break;
			case 5 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1778:11: SEQREVERSE
				{
				match(input,SEQREVERSE,FOLLOW_SEQREVERSE_in_synpred11_KeYJMLParser5992); if (state.failed) return;
				}
				break;
			case 6 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1779:11: SEQREPLACE
				{
				match(input,SEQREPLACE,FOLLOW_SEQREPLACE_in_synpred11_KeYJMLParser6004); if (state.failed) return;
				}
				break;
			case 7 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1781:11: SEQCONCAT
				{
				match(input,SEQCONCAT,FOLLOW_SEQCONCAT_in_synpred11_KeYJMLParser6025); if (state.failed) return;
				}
				break;
			case 8 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1782:11: SEQGET
				{
				match(input,SEQGET,FOLLOW_SEQGET_in_synpred11_KeYJMLParser6037); if (state.failed) return;
				}
				break;
			case 9 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1783:11: INDEXOF
				{
				match(input,INDEXOF,FOLLOW_INDEXOF_in_synpred11_KeYJMLParser6049); if (state.failed) return;
				}
				break;

		}
	}
	// $ANTLR end synpred11_KeYJMLParser

	// $ANTLR start synpred12_KeYJMLParser
	public final void synpred12_KeYJMLParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1804:9: ( LPAREN ( SEQDEF | SEQ ) quantifiedvardecls SEMI )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1804:10: LPAREN ( SEQDEF | SEQ ) quantifiedvardecls SEMI
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred12_KeYJMLParser6149); if (state.failed) return;
		if ( input.LA(1)==SEQ||input.LA(1)==SEQDEF ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_quantifiedvardecls_in_synpred12_KeYJMLParser6159);
		quantifiedvardecls();
		state._fsp--;
		if (state.failed) return;
		match(input,SEMI,FOLLOW_SEMI_in_synpred12_KeYJMLParser6161); if (state.failed) return;
		}

	}
	// $ANTLR end synpred12_KeYJMLParser

	// $ANTLR start synpred13_KeYJMLParser
	public final void synpred13_KeYJMLParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1876:3: ( predicate SEMI )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:1876:4: predicate SEMI
		{
		pushFollow(FOLLOW_predicate_in_synpred13_KeYJMLParser6578);
		predicate();
		state._fsp--;
		if (state.failed) return;
		match(input,SEMI,FOLLOW_SEMI_in_synpred13_KeYJMLParser6580); if (state.failed) return;
		}

	}
	// $ANTLR end synpred13_KeYJMLParser

	// $ANTLR start synpred14_KeYJMLParser
	public final void synpred14_KeYJMLParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2021:2: ( builtintype )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLParser.g:2021:3: builtintype
		{
		pushFollow(FOLLOW_builtintype_in_synpred14_KeYJMLParser7198);
		builtintype();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred14_KeYJMLParser

	// Delegated rules

	public final boolean synpred8_KeYJMLParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_KeYJMLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_KeYJMLParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_KeYJMLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred11_KeYJMLParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred11_KeYJMLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_KeYJMLParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_KeYJMLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_KeYJMLParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_KeYJMLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_KeYJMLParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_KeYJMLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred14_KeYJMLParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred14_KeYJMLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_KeYJMLParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_KeYJMLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_KeYJMLParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_KeYJMLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred13_KeYJMLParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred13_KeYJMLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_KeYJMLParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_KeYJMLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_KeYJMLParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_KeYJMLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_KeYJMLParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_KeYJMLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred12_KeYJMLParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_KeYJMLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA1 dfa1 = new DFA1(this);
	protected DFA3 dfa3 = new DFA3(this);
	protected DFA6 dfa6 = new DFA6(this);
	protected DFA8 dfa8 = new DFA8(this);
	protected DFA9 dfa9 = new DFA9(this);
	protected DFA10 dfa10 = new DFA10(this);
	protected DFA11 dfa11 = new DFA11(this);
	protected DFA13 dfa13 = new DFA13(this);
	protected DFA14 dfa14 = new DFA14(this);
	protected DFA16 dfa16 = new DFA16(this);
	protected DFA17 dfa17 = new DFA17(this);
	protected DFA18 dfa18 = new DFA18(this);
	protected DFA19 dfa19 = new DFA19(this);
	protected DFA20 dfa20 = new DFA20(this);
	protected DFA22 dfa22 = new DFA22(this);
	protected DFA23 dfa23 = new DFA23(this);
	protected DFA27 dfa27 = new DFA27(this);
	protected DFA31 dfa31 = new DFA31(this);
	protected DFA33 dfa33 = new DFA33(this);
	protected DFA34 dfa34 = new DFA34(this);
	protected DFA36 dfa36 = new DFA36(this);
	protected DFA39 dfa39 = new DFA39(this);
	protected DFA40 dfa40 = new DFA40(this);
	protected DFA58 dfa58 = new DFA58(this);
	protected DFA59 dfa59 = new DFA59(this);
	protected DFA61 dfa61 = new DFA61(this);
	protected DFA63 dfa63 = new DFA63(this);
	protected DFA65 dfa65 = new DFA65(this);
	protected DFA68 dfa68 = new DFA68(this);
	protected DFA72 dfa72 = new DFA72(this);
	protected DFA74 dfa74 = new DFA74(this);
	protected DFA75 dfa75 = new DFA75(this);
	protected DFA79 dfa79 = new DFA79(this);
	protected DFA84 dfa84 = new DFA84(this);
	static final String DFA1_eotS =
		"\131\uffff";
	static final String DFA1_eofS =
		"\131\uffff";
	static final String DFA1_minS =
		"\1\4\130\uffff";
	static final String DFA1_maxS =
		"\1\u00bb\130\uffff";
	static final String DFA1_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
		"\1\17\1\20\1\21\1\22\1\23\1\24\1\25\103\uffff";
	static final String DFA1_specialS =
		"\131\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\1\2\25\1\uffff\1\2\1\uffff\1\25\1\uffff\1\25\1\uffff\1\3\3\uffff\1"+
			"\25\2\uffff\1\4\1\uffff\1\15\1\5\1\17\1\uffff\2\25\1\uffff\1\25\1\uffff"+
			"\1\25\2\uffff\3\25\1\6\1\7\6\uffff\1\25\1\uffff\1\25\2\uffff\1\25\3\uffff"+
			"\2\25\3\uffff\3\25\2\uffff\1\25\1\uffff\5\25\2\uffff\1\13\3\uffff\1\25"+
			"\4\uffff\1\25\2\uffff\1\25\3\uffff\1\21\1\20\1\25\3\uffff\10\25\2\uffff"+
			"\1\25\1\uffff\1\11\1\uffff\2\25\1\uffff\1\25\1\uffff\1\25\1\uffff\2\25"+
			"\1\uffff\1\25\2\uffff\3\25\1\uffff\1\25\4\uffff\2\25\1\uffff\1\10\1\12"+
			"\1\14\1\25\1\22\3\uffff\1\16\3\25\1\uffff\7\25\3\uffff\1\23\1\24\1\25"+
			"\1\uffff\1\25\1\uffff\1\25\1\uffff\3\25\3\uffff\2\25\1\uffff\1\25\1\uffff"+
			"\4\25\1\uffff\1\25\1\uffff\1\25\2\uffff\1\25",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "385:5: ( accessibleclause | assignableclause | breaksclause | continuesclause | dependsclause | ensuresclause | ensuresfreeclause | representsclause | axiomsclause | requiresclause | joinprocclause | requiresfreeclause | decreasesclause | separatesclause | determinesclause | loopseparatesclause | loopdeterminesclause | returnsclause | signalsclause | signalsonlyclause | termexpression )";
		}
	}

	static final String DFA3_eotS =
		"\111\uffff";
	static final String DFA3_eofS =
		"\111\uffff";
	static final String DFA3_minS =
		"\1\5\110\uffff";
	static final String DFA3_maxS =
		"\1\u00bb\110\uffff";
	static final String DFA3_acceptS =
		"\1\uffff\1\1\106\uffff\1\2";
	static final String DFA3_specialS =
		"\111\uffff}>";
	static final String[] DFA3_transitionS = {
			"\2\1\3\uffff\1\1\1\uffff\1\1\5\uffff\1\1\10\uffff\2\1\1\uffff\1\1\1\uffff"+
			"\1\1\2\uffff\3\1\7\uffff\2\1\1\uffff\1\1\2\uffff\1\1\3\uffff\2\1\3\uffff"+
			"\3\1\2\uffff\1\1\1\uffff\5\1\6\uffff\1\1\4\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1\3\uffff\10\1\2\uffff\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\6\1\2\uffff"+
			"\3\1\1\uffff\1\1\4\uffff\2\1\4\uffff\1\1\5\uffff\3\1\1\uffff\7\1\5\uffff"+
			"\1\1\1\uffff\1\1\1\uffff\1\1\1\110\3\1\3\uffff\2\1\1\uffff\1\1\1\uffff"+
			"\4\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "422:5: (result= storeRefUnion | STRICTLY_NOTHING )";
		}
	}

	static final String DFA6_eotS =
		"\111\uffff";
	static final String DFA6_eofS =
		"\111\uffff";
	static final String DFA6_minS =
		"\1\5\104\0\4\uffff";
	static final String DFA6_maxS =
		"\1\u00bb\104\0\4\uffff";
	static final String DFA6_acceptS =
		"\105\uffff\1\2\2\uffff\1\1";
	static final String DFA6_specialS =
		"\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
		"\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
		"\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
		"\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
		"\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\4\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\64\1\65\3\uffff\1\24\1\uffff\1\5\5\uffff\1\11\10\uffff\1\6\1\67\1"+
			"\uffff\1\30\1\uffff\1\32\2\uffff\1\41\1\46\1\57\7\uffff\1\105\1\20\1"+
			"\uffff\1\15\2\uffff\1\36\3\uffff\1\7\1\12\3\uffff\1\54\1\101\1\27\2\uffff"+
			"\1\62\1\uffff\1\13\1\52\2\32\1\51\6\uffff\1\104\4\uffff\1\50\2\uffff"+
			"\1\60\5\uffff\1\3\3\uffff\1\31\6\32\1\44\2\uffff\1\2\3\uffff\1\103\1"+
			"\71\1\uffff\1\26\1\uffff\1\4\1\105\1\35\1\34\1\105\1\16\2\uffff\1\22"+
			"\1\25\1\1\1\uffff\1\21\4\uffff\1\37\1\40\4\uffff\1\17\5\uffff\1\73\1"+
			"\33\1\77\1\uffff\1\72\1\100\1\76\1\75\1\73\1\74\1\63\5\uffff\1\60\1\uffff"+
			"\1\42\1\uffff\1\53\1\uffff\1\56\1\10\1\70\3\uffff\1\102\1\23\1\uffff"+
			"\1\14\1\uffff\1\45\1\47\1\61\1\66\1\uffff\1\55\1\uffff\1\43\2\uffff\1"+
			"\61",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "499:9: ({...}?rhs= expression |t= storeRefUnion )";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA6_1 = input.LA(1);
						 
						int index6_1 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_1);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA6_2 = input.LA(1);
						 
						int index6_2 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_2);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA6_3 = input.LA(1);
						 
						int index6_3 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_3);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA6_4 = input.LA(1);
						 
						int index6_4 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_4);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA6_5 = input.LA(1);
						 
						int index6_5 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_5);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA6_6 = input.LA(1);
						 
						int index6_6 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_6);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA6_7 = input.LA(1);
						 
						int index6_7 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_7);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA6_8 = input.LA(1);
						 
						int index6_8 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_8);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA6_9 = input.LA(1);
						 
						int index6_9 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_9);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA6_10 = input.LA(1);
						 
						int index6_10 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_10);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA6_11 = input.LA(1);
						 
						int index6_11 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_11);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA6_12 = input.LA(1);
						 
						int index6_12 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_12);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA6_13 = input.LA(1);
						 
						int index6_13 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_13);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA6_14 = input.LA(1);
						 
						int index6_14 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_14);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA6_15 = input.LA(1);
						 
						int index6_15 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_15);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA6_16 = input.LA(1);
						 
						int index6_16 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_16);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA6_17 = input.LA(1);
						 
						int index6_17 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_17);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA6_18 = input.LA(1);
						 
						int index6_18 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_18);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA6_19 = input.LA(1);
						 
						int index6_19 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_19);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA6_20 = input.LA(1);
						 
						int index6_20 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_20);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA6_21 = input.LA(1);
						 
						int index6_21 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_21);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA6_22 = input.LA(1);
						 
						int index6_22 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_22);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA6_23 = input.LA(1);
						 
						int index6_23 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_23);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA6_24 = input.LA(1);
						 
						int index6_24 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_24);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA6_25 = input.LA(1);
						 
						int index6_25 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_25);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA6_26 = input.LA(1);
						 
						int index6_26 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_26);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA6_27 = input.LA(1);
						 
						int index6_27 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_27);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA6_28 = input.LA(1);
						 
						int index6_28 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_28);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA6_29 = input.LA(1);
						 
						int index6_29 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_29);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA6_30 = input.LA(1);
						 
						int index6_30 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_30);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA6_31 = input.LA(1);
						 
						int index6_31 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_31);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA6_32 = input.LA(1);
						 
						int index6_32 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_32);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA6_33 = input.LA(1);
						 
						int index6_33 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_33);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA6_34 = input.LA(1);
						 
						int index6_34 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_34);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA6_35 = input.LA(1);
						 
						int index6_35 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_35);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA6_36 = input.LA(1);
						 
						int index6_36 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_36);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA6_37 = input.LA(1);
						 
						int index6_37 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_37);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA6_38 = input.LA(1);
						 
						int index6_38 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_38);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA6_39 = input.LA(1);
						 
						int index6_39 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_39);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA6_40 = input.LA(1);
						 
						int index6_40 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_40);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA6_41 = input.LA(1);
						 
						int index6_41 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_41);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA6_42 = input.LA(1);
						 
						int index6_42 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_42);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA6_43 = input.LA(1);
						 
						int index6_43 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_43);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA6_44 = input.LA(1);
						 
						int index6_44 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_44);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA6_45 = input.LA(1);
						 
						int index6_45 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_45);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA6_46 = input.LA(1);
						 
						int index6_46 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_46);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA6_47 = input.LA(1);
						 
						int index6_47 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_47);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA6_48 = input.LA(1);
						 
						int index6_48 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_48);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA6_49 = input.LA(1);
						 
						int index6_49 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_49);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA6_50 = input.LA(1);
						 
						int index6_50 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_50);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA6_51 = input.LA(1);
						 
						int index6_51 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_51);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA6_52 = input.LA(1);
						 
						int index6_52 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_52);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA6_53 = input.LA(1);
						 
						int index6_53 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_53);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA6_54 = input.LA(1);
						 
						int index6_54 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_54);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA6_55 = input.LA(1);
						 
						int index6_55 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_55);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA6_56 = input.LA(1);
						 
						int index6_56 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_56);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA6_57 = input.LA(1);
						 
						int index6_57 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_57);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA6_58 = input.LA(1);
						 
						int index6_58 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_58);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA6_59 = input.LA(1);
						 
						int index6_59 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_59);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA6_60 = input.LA(1);
						 
						int index6_60 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_60);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA6_61 = input.LA(1);
						 
						int index6_61 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_61);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA6_62 = input.LA(1);
						 
						int index6_62 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_62);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA6_63 = input.LA(1);
						 
						int index6_63 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_63);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA6_64 = input.LA(1);
						 
						int index6_64 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_64);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA6_65 = input.LA(1);
						 
						int index6_65 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_65);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA6_66 = input.LA(1);
						 
						int index6_66 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_66);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA6_67 = input.LA(1);
						 
						int index6_67 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_67);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA6_68 = input.LA(1);
						 
						int index6_68 = input.index();
						input.rewind();
						s = -1;
						if ( (( !representsClauseLhsIsLocSet)) ) {s = 72;}
						else if ( (true) ) {s = 69;}
						 
						input.seek(index6_68);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 6, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA8_eotS =
		"\106\uffff";
	static final String DFA8_eofS =
		"\106\uffff";
	static final String DFA8_minS =
		"\1\5\105\uffff";
	static final String DFA8_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\103\uffff";
	static final String DFA8_specialS =
		"\106\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\2\3\uffff\1\2\1\uffff\1\2\5\uffff\1\2\10\uffff\2\2\1\uffff\1\2\1\uffff"+
			"\1\2\2\uffff\3\2\10\uffff\1\2\1\uffff\1\2\2\uffff\1\2\3\uffff\2\2\3\uffff"+
			"\3\2\2\uffff\1\2\1\uffff\5\2\6\uffff\1\2\4\uffff\1\2\2\uffff\1\2\5\uffff"+
			"\1\2\3\uffff\10\2\2\uffff\1\2\3\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\1"+
			"\2\2\1\uffff\1\2\2\uffff\3\2\1\uffff\1\2\4\uffff\2\2\4\uffff\1\2\5\uffff"+
			"\3\2\1\uffff\7\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\3\2\3\uffff"+
			"\2\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "534:15: ( NOTHING |sep= infflowspeclist )";
		}
	}

	static final String DFA9_eotS =
		"\106\uffff";
	static final String DFA9_eofS =
		"\106\uffff";
	static final String DFA9_minS =
		"\1\5\105\uffff";
	static final String DFA9_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\1\2\103\uffff";
	static final String DFA9_specialS =
		"\106\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\2\3\uffff\1\2\1\uffff\1\2\5\uffff\1\2\10\uffff\2\2\1\uffff\1\2\1\uffff"+
			"\1\2\2\uffff\3\2\10\uffff\1\2\1\uffff\1\2\2\uffff\1\2\3\uffff\2\2\3\uffff"+
			"\3\2\2\uffff\1\2\1\uffff\5\2\6\uffff\1\2\4\uffff\1\2\2\uffff\1\2\5\uffff"+
			"\1\2\3\uffff\10\2\2\uffff\1\2\3\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\1"+
			"\2\2\1\uffff\1\2\2\uffff\3\2\1\uffff\1\2\4\uffff\2\2\4\uffff\1\2\5\uffff"+
			"\3\2\1\uffff\7\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\3\2\3\uffff"+
			"\2\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "535:23: ( NOTHING |tmp= infflowspeclist )";
		}
	}

	static final String DFA10_eotS =
		"\106\uffff";
	static final String DFA10_eofS =
		"\106\uffff";
	static final String DFA10_minS =
		"\1\5\105\uffff";
	static final String DFA10_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA10_acceptS =
		"\1\uffff\1\1\1\2\103\uffff";
	static final String DFA10_specialS =
		"\106\uffff}>";
	static final String[] DFA10_transitionS = {
			"\2\2\3\uffff\1\2\1\uffff\1\2\5\uffff\1\2\10\uffff\2\2\1\uffff\1\2\1\uffff"+
			"\1\2\2\uffff\3\2\10\uffff\1\2\1\uffff\1\2\2\uffff\1\2\3\uffff\2\2\3\uffff"+
			"\3\2\2\uffff\1\2\1\uffff\5\2\6\uffff\1\2\4\uffff\1\2\2\uffff\1\2\5\uffff"+
			"\1\2\3\uffff\10\2\2\uffff\1\2\3\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\1"+
			"\2\2\1\uffff\1\2\2\uffff\3\2\1\uffff\1\2\4\uffff\2\2\4\uffff\1\2\5\uffff"+
			"\3\2\1\uffff\7\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\3\2\3\uffff"+
			"\2\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "536:17: ( NOTHING |tmp= infflowspeclist )";
		}
	}

	static final String DFA11_eotS =
		"\106\uffff";
	static final String DFA11_eofS =
		"\106\uffff";
	static final String DFA11_minS =
		"\1\5\105\uffff";
	static final String DFA11_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA11_acceptS =
		"\1\uffff\1\1\1\2\103\uffff";
	static final String DFA11_specialS =
		"\106\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\2\3\uffff\1\2\1\uffff\1\2\5\uffff\1\2\10\uffff\2\2\1\uffff\1\2\1\uffff"+
			"\1\2\2\uffff\3\2\10\uffff\1\2\1\uffff\1\2\2\uffff\1\2\3\uffff\2\2\3\uffff"+
			"\3\2\2\uffff\1\2\1\uffff\5\2\6\uffff\1\2\4\uffff\1\2\2\uffff\1\2\5\uffff"+
			"\1\2\3\uffff\10\2\2\uffff\1\2\3\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\1"+
			"\2\2\1\uffff\1\2\2\uffff\3\2\1\uffff\1\2\4\uffff\2\2\4\uffff\1\2\5\uffff"+
			"\3\2\1\uffff\7\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\3\2\3\uffff"+
			"\2\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "537:22: ( NOTHING |tmp= infflowspeclist )";
		}
	}

	static final String DFA13_eotS =
		"\106\uffff";
	static final String DFA13_eofS =
		"\106\uffff";
	static final String DFA13_minS =
		"\1\5\105\uffff";
	static final String DFA13_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA13_acceptS =
		"\1\uffff\1\1\1\2\103\uffff";
	static final String DFA13_specialS =
		"\106\uffff}>";
	static final String[] DFA13_transitionS = {
			"\2\2\3\uffff\1\2\1\uffff\1\2\5\uffff\1\2\10\uffff\2\2\1\uffff\1\2\1\uffff"+
			"\1\2\2\uffff\3\2\10\uffff\1\2\1\uffff\1\2\2\uffff\1\2\3\uffff\2\2\3\uffff"+
			"\3\2\2\uffff\1\2\1\uffff\5\2\6\uffff\1\2\4\uffff\1\2\2\uffff\1\2\5\uffff"+
			"\1\2\3\uffff\10\2\2\uffff\1\2\3\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\1"+
			"\2\2\1\uffff\1\2\2\uffff\3\2\1\uffff\1\2\4\uffff\2\2\4\uffff\1\2\5\uffff"+
			"\3\2\1\uffff\7\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\3\2\3\uffff"+
			"\2\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "551:20: ( NOTHING |tmp= infflowspeclist )";
		}
	}

	static final String DFA14_eotS =
		"\106\uffff";
	static final String DFA14_eofS =
		"\106\uffff";
	static final String DFA14_minS =
		"\1\5\105\uffff";
	static final String DFA14_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA14_acceptS =
		"\1\uffff\1\1\1\2\103\uffff";
	static final String DFA14_specialS =
		"\106\uffff}>";
	static final String[] DFA14_transitionS = {
			"\2\2\3\uffff\1\2\1\uffff\1\2\5\uffff\1\2\10\uffff\2\2\1\uffff\1\2\1\uffff"+
			"\1\2\2\uffff\3\2\10\uffff\1\2\1\uffff\1\2\2\uffff\1\2\3\uffff\2\2\3\uffff"+
			"\3\2\2\uffff\1\2\1\uffff\5\2\6\uffff\1\2\4\uffff\1\2\2\uffff\1\2\5\uffff"+
			"\1\2\3\uffff\10\2\2\uffff\1\2\3\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\1"+
			"\2\2\1\uffff\1\2\2\uffff\3\2\1\uffff\1\2\4\uffff\2\2\4\uffff\1\2\5\uffff"+
			"\3\2\1\uffff\7\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\3\2\3\uffff"+
			"\2\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "552:22: ( NOTHING |tmp= infflowspeclist )";
		}
	}

	static final String DFA16_eotS =
		"\106\uffff";
	static final String DFA16_eofS =
		"\106\uffff";
	static final String DFA16_minS =
		"\1\5\105\uffff";
	static final String DFA16_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA16_acceptS =
		"\1\uffff\1\1\1\2\103\uffff";
	static final String DFA16_specialS =
		"\106\uffff}>";
	static final String[] DFA16_transitionS = {
			"\2\2\3\uffff\1\2\1\uffff\1\2\5\uffff\1\2\10\uffff\2\2\1\uffff\1\2\1\uffff"+
			"\1\2\2\uffff\3\2\10\uffff\1\2\1\uffff\1\2\2\uffff\1\2\3\uffff\2\2\3\uffff"+
			"\3\2\2\uffff\1\2\1\uffff\5\2\6\uffff\1\2\4\uffff\1\2\2\uffff\1\2\5\uffff"+
			"\1\2\3\uffff\10\2\2\uffff\1\2\3\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\1"+
			"\2\2\1\uffff\1\2\2\uffff\3\2\1\uffff\1\2\4\uffff\2\2\4\uffff\1\2\5\uffff"+
			"\3\2\1\uffff\7\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\3\2\3\uffff"+
			"\2\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "565:16: ( NOTHING |det= infflowspeclist )";
		}
	}

	static final String DFA17_eotS =
		"\107\uffff";
	static final String DFA17_eofS =
		"\107\uffff";
	static final String DFA17_minS =
		"\1\5\106\uffff";
	static final String DFA17_maxS =
		"\1\u00bb\106\uffff";
	static final String DFA17_acceptS =
		"\1\uffff\1\1\1\2\1\3\103\uffff";
	static final String DFA17_specialS =
		"\107\uffff}>";
	static final String[] DFA17_transitionS = {
			"\2\3\3\uffff\1\3\1\uffff\1\3\5\uffff\1\3\10\uffff\2\3\1\uffff\1\3\1\uffff"+
			"\1\3\2\uffff\3\3\10\uffff\1\3\1\uffff\1\3\2\uffff\1\3\3\uffff\2\3\3\uffff"+
			"\3\3\2\uffff\1\3\1\uffff\5\3\1\2\5\uffff\1\3\4\uffff\1\3\2\uffff\1\3"+
			"\5\uffff\1\3\3\uffff\10\3\2\uffff\1\3\3\uffff\2\3\1\uffff\1\3\1\uffff"+
			"\1\3\1\1\2\3\1\uffff\1\3\2\uffff\3\3\1\uffff\1\3\4\uffff\2\3\4\uffff"+
			"\1\3\5\uffff\3\3\1\uffff\7\3\5\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff"+
			"\3\3\3\uffff\2\3\1\uffff\1\3\1\uffff\4\3\1\uffff\1\3\1\uffff\1\3\2\uffff"+
			"\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "566:8: ( NOTHING | ( ITSELF ) |by= infflowspeclist )";
		}
	}

	static final String DFA18_eotS =
		"\106\uffff";
	static final String DFA18_eofS =
		"\106\uffff";
	static final String DFA18_minS =
		"\1\5\105\uffff";
	static final String DFA18_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA18_acceptS =
		"\1\uffff\1\1\1\2\103\uffff";
	static final String DFA18_specialS =
		"\106\uffff}>";
	static final String[] DFA18_transitionS = {
			"\2\2\3\uffff\1\2\1\uffff\1\2\5\uffff\1\2\10\uffff\2\2\1\uffff\1\2\1\uffff"+
			"\1\2\2\uffff\3\2\10\uffff\1\2\1\uffff\1\2\2\uffff\1\2\3\uffff\2\2\3\uffff"+
			"\3\2\2\uffff\1\2\1\uffff\5\2\6\uffff\1\2\4\uffff\1\2\2\uffff\1\2\5\uffff"+
			"\1\2\3\uffff\10\2\2\uffff\1\2\3\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\1"+
			"\2\2\1\uffff\1\2\2\uffff\3\2\1\uffff\1\2\4\uffff\2\2\4\uffff\1\2\5\uffff"+
			"\3\2\1\uffff\7\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\3\2\3\uffff"+
			"\2\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "567:23: ( NOTHING |tmp= infflowspeclist )";
		}
	}

	static final String DFA19_eotS =
		"\106\uffff";
	static final String DFA19_eofS =
		"\106\uffff";
	static final String DFA19_minS =
		"\1\5\105\uffff";
	static final String DFA19_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA19_acceptS =
		"\1\uffff\1\1\1\2\103\uffff";
	static final String DFA19_specialS =
		"\106\uffff}>";
	static final String[] DFA19_transitionS = {
			"\2\2\3\uffff\1\2\1\uffff\1\2\5\uffff\1\2\10\uffff\2\2\1\uffff\1\2\1\uffff"+
			"\1\2\2\uffff\3\2\10\uffff\1\2\1\uffff\1\2\2\uffff\1\2\3\uffff\2\2\3\uffff"+
			"\3\2\2\uffff\1\2\1\uffff\5\2\6\uffff\1\2\4\uffff\1\2\2\uffff\1\2\5\uffff"+
			"\1\2\3\uffff\10\2\2\uffff\1\2\3\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\1"+
			"\2\2\1\uffff\1\2\2\uffff\3\2\1\uffff\1\2\4\uffff\2\2\4\uffff\1\2\5\uffff"+
			"\3\2\1\uffff\7\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\3\2\3\uffff"+
			"\2\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	protected class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "568:17: ( NOTHING |tmp= infflowspeclist )";
		}
	}

	static final String DFA20_eotS =
		"\106\uffff";
	static final String DFA20_eofS =
		"\106\uffff";
	static final String DFA20_minS =
		"\1\5\105\uffff";
	static final String DFA20_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA20_acceptS =
		"\1\uffff\1\1\1\2\103\uffff";
	static final String DFA20_specialS =
		"\106\uffff}>";
	static final String[] DFA20_transitionS = {
			"\2\2\3\uffff\1\2\1\uffff\1\2\5\uffff\1\2\10\uffff\2\2\1\uffff\1\2\1\uffff"+
			"\1\2\2\uffff\3\2\10\uffff\1\2\1\uffff\1\2\2\uffff\1\2\3\uffff\2\2\3\uffff"+
			"\3\2\2\uffff\1\2\1\uffff\5\2\6\uffff\1\2\4\uffff\1\2\2\uffff\1\2\5\uffff"+
			"\1\2\3\uffff\10\2\2\uffff\1\2\3\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\1"+
			"\2\2\1\uffff\1\2\2\uffff\3\2\1\uffff\1\2\4\uffff\2\2\4\uffff\1\2\5\uffff"+
			"\3\2\1\uffff\7\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\3\2\3\uffff"+
			"\2\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "569:22: ( NOTHING |tmp= infflowspeclist )";
		}
	}

	static final String DFA22_eotS =
		"\106\uffff";
	static final String DFA22_eofS =
		"\106\uffff";
	static final String DFA22_minS =
		"\1\5\105\uffff";
	static final String DFA22_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA22_acceptS =
		"\1\uffff\1\1\1\2\103\uffff";
	static final String DFA22_specialS =
		"\106\uffff}>";
	static final String[] DFA22_transitionS = {
			"\2\2\3\uffff\1\2\1\uffff\1\2\5\uffff\1\2\10\uffff\2\2\1\uffff\1\2\1\uffff"+
			"\1\2\2\uffff\3\2\10\uffff\1\2\1\uffff\1\2\2\uffff\1\2\3\uffff\2\2\3\uffff"+
			"\3\2\2\uffff\1\2\1\uffff\5\2\6\uffff\1\2\4\uffff\1\2\2\uffff\1\2\5\uffff"+
			"\1\2\3\uffff\10\2\2\uffff\1\2\3\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\1"+
			"\2\2\1\uffff\1\2\2\uffff\3\2\1\uffff\1\2\4\uffff\2\2\4\uffff\1\2\5\uffff"+
			"\3\2\1\uffff\7\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\3\2\3\uffff"+
			"\2\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "582:21: ( NOTHING |det= infflowspeclist )";
		}
	}

	static final String DFA23_eotS =
		"\106\uffff";
	static final String DFA23_eofS =
		"\106\uffff";
	static final String DFA23_minS =
		"\1\5\105\uffff";
	static final String DFA23_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA23_acceptS =
		"\1\uffff\1\1\1\2\103\uffff";
	static final String DFA23_specialS =
		"\106\uffff}>";
	static final String[] DFA23_transitionS = {
			"\2\2\3\uffff\1\2\1\uffff\1\2\5\uffff\1\2\10\uffff\2\2\1\uffff\1\2\1\uffff"+
			"\1\2\2\uffff\3\2\10\uffff\1\2\1\uffff\1\2\2\uffff\1\2\3\uffff\2\2\3\uffff"+
			"\3\2\2\uffff\1\2\1\uffff\5\2\6\uffff\1\2\4\uffff\1\2\2\uffff\1\2\5\uffff"+
			"\1\2\3\uffff\10\2\2\uffff\1\2\3\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\1"+
			"\2\2\1\uffff\1\2\2\uffff\3\2\1\uffff\1\2\4\uffff\2\2\4\uffff\1\2\5\uffff"+
			"\3\2\1\uffff\7\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\3\2\3\uffff"+
			"\2\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "584:22: ( NOTHING |tmp= infflowspeclist )";
		}
	}

	static final String DFA27_eotS =
		"\111\uffff";
	static final String DFA27_eofS =
		"\1\107\110\uffff";
	static final String DFA27_minS =
		"\1\5\110\uffff";
	static final String DFA27_maxS =
		"\1\u00bb\110\uffff";
	static final String DFA27_acceptS =
		"\1\uffff\1\1\105\uffff\1\2\1\uffff";
	static final String DFA27_specialS =
		"\111\uffff}>";
	static final String[] DFA27_transitionS = {
			"\2\1\3\uffff\1\1\1\uffff\1\1\5\uffff\1\1\10\uffff\2\1\1\uffff\1\1\1\uffff"+
			"\1\1\2\uffff\3\1\10\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\2\1\3\uffff"+
			"\3\1\2\uffff\1\1\1\uffff\5\1\6\uffff\1\1\4\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1\3\uffff\10\1\2\uffff\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\4\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\4\uffff\1\1\2\uffff\1\1\1\107"+
			"\1\uffff\3\1\1\uffff\7\1\5\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\3\1\3\uffff\2\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\2\uffff"+
			"\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
	static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
	static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
	static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
	static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
	static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
	static final short[][] DFA27_transition;

	static {
		int numStates = DFA27_transitionS.length;
		DFA27_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
		}
	}

	protected class DFA27 extends DFA {

		public DFA27(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 27;
			this.eot = DFA27_eot;
			this.eof = DFA27_eof;
			this.min = DFA27_min;
			this.max = DFA27_max;
			this.accept = DFA27_accept;
			this.special = DFA27_special;
			this.transition = DFA27_transition;
		}
		@Override
		public String getDescription() {
			return "614:2: (result= predornot )?";
		}
	}

	static final String DFA31_eotS =
		"\111\uffff";
	static final String DFA31_eofS =
		"\1\107\110\uffff";
	static final String DFA31_minS =
		"\1\5\110\uffff";
	static final String DFA31_maxS =
		"\1\u00bb\110\uffff";
	static final String DFA31_acceptS =
		"\1\uffff\1\1\105\uffff\1\2\1\uffff";
	static final String DFA31_specialS =
		"\111\uffff}>";
	static final String[] DFA31_transitionS = {
			"\2\1\3\uffff\1\1\1\uffff\1\1\5\uffff\1\1\10\uffff\2\1\1\uffff\1\1\1\uffff"+
			"\1\1\2\uffff\3\1\10\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\2\1\3\uffff"+
			"\3\1\2\uffff\1\1\1\uffff\5\1\6\uffff\1\1\4\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1\3\uffff\10\1\2\uffff\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\4\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\4\uffff\1\1\2\uffff\1\1\1\107"+
			"\1\uffff\3\1\1\uffff\7\1\5\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\3\1\3\uffff\2\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\2\uffff"+
			"\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
	static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
	static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
	static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
	static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
	static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
	static final short[][] DFA31_transition;

	static {
		int numStates = DFA31_transitionS.length;
		DFA31_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
		}
	}

	protected class DFA31 extends DFA {

		public DFA31(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 31;
			this.eot = DFA31_eot;
			this.eof = DFA31_eof;
			this.min = DFA31_min;
			this.max = DFA31_max;
			this.accept = DFA31_accept;
			this.special = DFA31_special;
			this.transition = DFA31_transition;
		}
		@Override
		public String getDescription() {
			return "651:2: (pred= predornot )?";
		}
	}

	static final String DFA33_eotS =
		"\111\uffff";
	static final String DFA33_eofS =
		"\1\107\110\uffff";
	static final String DFA33_minS =
		"\1\5\110\uffff";
	static final String DFA33_maxS =
		"\1\u00bb\110\uffff";
	static final String DFA33_acceptS =
		"\1\uffff\1\1\105\uffff\1\2\1\uffff";
	static final String DFA33_specialS =
		"\111\uffff}>";
	static final String[] DFA33_transitionS = {
			"\2\1\3\uffff\1\1\1\uffff\1\1\5\uffff\1\1\10\uffff\2\1\1\uffff\1\1\1\uffff"+
			"\1\1\2\uffff\3\1\10\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\2\1\3\uffff"+
			"\3\1\2\uffff\1\1\1\uffff\5\1\6\uffff\1\1\4\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1\3\uffff\10\1\2\uffff\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\4\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\4\uffff\1\1\2\uffff\1\1\1\107"+
			"\1\uffff\3\1\1\uffff\7\1\5\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\3\1\3\uffff\2\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\2\uffff"+
			"\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
	static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
	static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
	static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
	static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
	static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
	static final short[][] DFA33_transition;

	static {
		int numStates = DFA33_transitionS.length;
		DFA33_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
		}
	}

	protected class DFA33 extends DFA {

		public DFA33(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 33;
			this.eot = DFA33_eot;
			this.eof = DFA33_eof;
			this.min = DFA33_min;
			this.max = DFA33_max;
			this.accept = DFA33_accept;
			this.special = DFA33_special;
			this.transition = DFA33_transition;
		}
		@Override
		public String getDescription() {
			return "664:2: (pred= predornot )?";
		}
	}

	static final String DFA34_eotS =
		"\111\uffff";
	static final String DFA34_eofS =
		"\1\107\110\uffff";
	static final String DFA34_minS =
		"\1\5\110\uffff";
	static final String DFA34_maxS =
		"\1\u00bb\110\uffff";
	static final String DFA34_acceptS =
		"\1\uffff\1\1\105\uffff\1\2\1\uffff";
	static final String DFA34_specialS =
		"\111\uffff}>";
	static final String[] DFA34_transitionS = {
			"\2\1\3\uffff\1\1\1\uffff\1\1\5\uffff\1\1\10\uffff\2\1\1\uffff\1\1\1\uffff"+
			"\1\1\2\uffff\3\1\10\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\2\1\3\uffff"+
			"\3\1\2\uffff\1\1\1\uffff\5\1\6\uffff\1\1\4\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1\3\uffff\10\1\2\uffff\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\4\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\4\uffff\1\1\2\uffff\1\1\1\107"+
			"\1\uffff\3\1\1\uffff\7\1\5\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\3\1\3\uffff\2\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\2\uffff"+
			"\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
	static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
	static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
	static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
	static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
	static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
	static final short[][] DFA34_transition;

	static {
		int numStates = DFA34_transitionS.length;
		DFA34_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
		}
	}

	protected class DFA34 extends DFA {

		public DFA34(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 34;
			this.eot = DFA34_eot;
			this.eof = DFA34_eof;
			this.min = DFA34_min;
			this.max = DFA34_max;
			this.accept = DFA34_accept;
			this.special = DFA34_special;
			this.transition = DFA34_transition;
		}
		@Override
		public String getDescription() {
			return "675:2: (result= predornot )?";
		}
	}

	static final String DFA36_eotS =
		"\110\uffff";
	static final String DFA36_eofS =
		"\110\uffff";
	static final String DFA36_minS =
		"\1\5\107\uffff";
	static final String DFA36_maxS =
		"\1\u00bb\107\uffff";
	static final String DFA36_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\103\uffff";
	static final String DFA36_specialS =
		"\110\uffff}>";
	static final String[] DFA36_transitionS = {
			"\2\4\3\uffff\1\4\1\uffff\1\4\5\uffff\1\4\10\uffff\2\4\1\uffff\1\4\1\uffff"+
			"\1\4\2\uffff\3\4\7\uffff\1\2\1\4\1\uffff\1\4\2\uffff\1\4\3\uffff\2\4"+
			"\3\uffff\3\4\2\uffff\1\4\1\uffff\5\4\6\uffff\1\4\4\uffff\1\4\2\uffff"+
			"\1\4\5\uffff\1\4\3\uffff\10\4\2\uffff\1\4\3\uffff\2\4\1\uffff\1\4\1\uffff"+
			"\1\4\1\1\2\4\1\3\1\4\2\uffff\3\4\1\uffff\1\4\4\uffff\2\4\4\uffff\1\4"+
			"\5\uffff\3\4\1\uffff\7\4\5\uffff\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff"+
			"\3\4\3\uffff\2\4\1\uffff\1\4\1\uffff\4\4\1\uffff\1\4\1\uffff\1\4\2\uffff"+
			"\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
	static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
	static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
	static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
	static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
	static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
	static final short[][] DFA36_transition;

	static {
		int numStates = DFA36_transitionS.length;
		DFA36_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
		}
	}

	protected class DFA36 extends DFA {

		public DFA36(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 36;
			this.eot = DFA36_eot;
			this.eof = DFA36_eof;
			this.min = DFA36_min;
			this.max = DFA36_max;
			this.accept = DFA36_accept;
			this.special = DFA36_special;
			this.transition = DFA36_transition;
		}
		@Override
		public String getDescription() {
			return "697:1: storeref returns [Term ret = null] : ( NOTHING | EVERYTHING | NOT_SPECIFIED |result= storeRefExpr );";
		}
	}

	static final String DFA39_eotS =
		"\106\uffff";
	static final String DFA39_eofS =
		"\106\uffff";
	static final String DFA39_minS =
		"\1\5\105\uffff";
	static final String DFA39_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA39_acceptS =
		"\1\uffff\1\1\103\uffff\1\2";
	static final String DFA39_specialS =
		"\106\uffff}>";
	static final String[] DFA39_transitionS = {
			"\2\1\3\uffff\1\1\1\uffff\1\1\5\uffff\1\1\10\uffff\2\1\1\uffff\1\1\1\uffff"+
			"\1\1\2\uffff\3\1\10\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\2\1\3\uffff"+
			"\3\1\2\uffff\1\1\1\uffff\5\1\6\uffff\1\1\4\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1\3\uffff\10\1\2\uffff\1\1\2\uffff\1\105\2\1\1\uffff\1\1\1\uffff\1"+
			"\1\1\uffff\2\1\1\uffff\1\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\4\uffff"+
			"\1\1\5\uffff\3\1\1\uffff\7\1\5\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\3\1\3\uffff\2\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\2\uffff"+
			"\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
	static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
	static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
	static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
	static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
	static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
	static final short[][] DFA39_transition;

	static {
		int numStates = DFA39_transitionS.length;
		DFA39_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
		}
	}

	protected class DFA39 extends DFA {

		public DFA39(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 39;
			this.eot = DFA39_eot;
			this.eof = DFA39_eof;
			this.min = DFA39_min;
			this.max = DFA39_max;
			this.accept = DFA39_accept;
			this.special = DFA39_special;
			this.transition = DFA39_transition;
		}
		@Override
		public String getDescription() {
			return "732:5: ( (rangeFrom= expression ( DOTDOT rangeTo= expression )? ) | MULT )";
		}
	}

	static final String DFA40_eotS =
		"\107\uffff";
	static final String DFA40_eofS =
		"\107\uffff";
	static final String DFA40_minS =
		"\1\5\106\uffff";
	static final String DFA40_maxS =
		"\1\u00bb\106\uffff";
	static final String DFA40_acceptS =
		"\1\uffff\1\1\103\uffff\1\2\1\3";
	static final String DFA40_specialS =
		"\107\uffff}>";
	static final String[] DFA40_transitionS = {
			"\2\1\3\uffff\1\1\1\uffff\1\1\5\uffff\1\1\10\uffff\2\1\1\uffff\1\1\1\uffff"+
			"\1\1\2\uffff\3\1\10\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\2\1\3\uffff"+
			"\3\1\2\uffff\1\1\1\uffff\5\1\6\uffff\1\1\4\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1\3\uffff\10\1\2\uffff\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\2\1\1\105\1\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\4\uffff\1\1\2\uffff"+
			"\1\106\2\uffff\3\1\1\uffff\7\1\5\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1"+
			"\uffff\3\1\3\uffff\2\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1"+
			"\1\2\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
	static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
	static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
	static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
	static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
	static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
	static final short[][] DFA40_transition;

	static {
		int numStates = DFA40_transitionS.length;
		DFA40_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
		}
	}

	protected class DFA40 extends DFA {

		public DFA40(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 40;
			this.eot = DFA40_eot;
			this.eof = DFA40_eof;
			this.min = DFA40_min;
			this.max = DFA40_max;
			this.accept = DFA40_accept;
			this.special = DFA40_special;
			this.transition = DFA40_transition;
		}
		@Override
		public String getDescription() {
			return "742:1: predornot returns [Term ret=null] : (result= predicate |n= NOT_SPECIFIED | SAME );";
		}
	}

	static final String DFA58_eotS =
		"\106\uffff";
	static final String DFA58_eofS =
		"\106\uffff";
	static final String DFA58_minS =
		"\1\5\2\uffff\1\0\102\uffff";
	static final String DFA58_maxS =
		"\1\u00bb\2\uffff\1\0\102\uffff";
	static final String DFA58_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\4\100\uffff\1\3";
	static final String DFA58_specialS =
		"\3\uffff\1\0\102\uffff}>";
	static final String[] DFA58_transitionS = {
			"\2\4\3\uffff\1\4\1\uffff\1\4\5\uffff\1\4\10\uffff\2\4\1\uffff\1\4\1\uffff"+
			"\1\4\2\uffff\3\4\10\uffff\1\4\1\uffff\1\4\2\uffff\1\4\3\uffff\2\4\3\uffff"+
			"\3\4\2\uffff\1\4\1\uffff\5\4\6\uffff\1\4\4\uffff\1\4\2\uffff\1\4\5\uffff"+
			"\1\3\3\uffff\10\4\2\uffff\1\2\3\uffff\2\4\1\uffff\1\4\1\uffff\1\4\1\uffff"+
			"\2\4\1\uffff\1\4\2\uffff\2\4\1\1\1\uffff\1\4\4\uffff\2\4\4\uffff\1\4"+
			"\5\uffff\3\4\1\uffff\7\4\5\uffff\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff"+
			"\3\4\3\uffff\2\4\1\uffff\1\4\1\uffff\4\4\1\uffff\1\4\1\uffff\1\4\2\uffff"+
			"\1\4",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
	static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
	static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
	static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
	static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
	static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
	static final short[][] DFA58_transition;

	static {
		int numStates = DFA58_transitionS.length;
		DFA58_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
		}
	}

	protected class DFA58 extends DFA {

		public DFA58(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 58;
			this.eot = DFA58_eot;
			this.eof = DFA58_eof;
			this.min = DFA58_min;
			this.max = DFA58_max;
			this.accept = DFA58_accept;
			this.special = DFA58_special;
			this.transition = DFA58_transition;
		}
		@Override
		public String getDescription() {
			return "1162:1: unaryexpr returns [SLExpression ret=null] : ( PLUS result= unaryexpr | MINUS result= unaryexpr | ( LPAREN typespec RPAREN )=>result= castexpr |result= unaryexprnotplusminus );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA58_3 = input.LA(1);
						 
						int index58_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_KeYJMLParser()) ) {s = 69;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index58_3);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 58, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA59_eotS =
		"\103\uffff";
	static final String DFA59_eofS =
		"\103\uffff";
	static final String DFA59_minS =
		"\1\5\102\uffff";
	static final String DFA59_maxS =
		"\1\u00bb\102\uffff";
	static final String DFA59_acceptS =
		"\1\uffff\1\1\1\2\1\3\77\uffff";
	static final String DFA59_specialS =
		"\103\uffff}>";
	static final String[] DFA59_transitionS = {
			"\2\3\3\uffff\1\3\1\uffff\1\2\5\uffff\1\3\10\uffff\2\3\1\uffff\1\3\1\uffff"+
			"\1\3\2\uffff\3\3\10\uffff\1\3\1\uffff\1\3\2\uffff\1\3\3\uffff\2\3\3\uffff"+
			"\3\3\2\uffff\1\3\1\uffff\5\3\6\uffff\1\3\4\uffff\1\3\2\uffff\1\3\5\uffff"+
			"\1\3\3\uffff\10\3\6\uffff\2\3\1\uffff\1\3\1\uffff\1\1\1\uffff\2\3\1\uffff"+
			"\1\3\2\uffff\2\3\2\uffff\1\3\4\uffff\2\3\4\uffff\1\3\5\uffff\3\3\1\uffff"+
			"\7\3\5\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\3\3\3\uffff\2\3\1\uffff"+
			"\1\3\1\uffff\4\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
	static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
	static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
	static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
	static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
	static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
	static final short[][] DFA59_transition;

	static {
		int numStates = DFA59_transitionS.length;
		DFA59_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
		}
	}

	protected class DFA59 extends DFA {

		public DFA59(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 59;
			this.eot = DFA59_eot;
			this.eof = DFA59_eof;
			this.min = DFA59_min;
			this.max = DFA59_max;
			this.accept = DFA59_accept;
			this.special = DFA59_special;
			this.transition = DFA59_transition;
		}
		@Override
		public String getDescription() {
			return "1201:1: unaryexprnotplusminus returns [SLExpression ret=null] : ( NOT e= unaryexpr | BITWISENOT e= unaryexpr |result= postfixexpr );";
		}
	}

	static final String DFA61_eotS =
		"\101\uffff";
	static final String DFA61_eofS =
		"\101\uffff";
	static final String DFA61_minS =
		"\1\5\100\uffff";
	static final String DFA61_maxS =
		"\1\u00bb\100\uffff";
	static final String DFA61_acceptS =
		"\1\uffff\1\1\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7\63\uffff\1\10\1\11\1\12";
	static final String DFA61_specialS =
		"\101\uffff}>";
	static final String[] DFA61_transitionS = {
			"\2\12\3\uffff\1\12\7\uffff\1\1\10\uffff\1\1\1\12\1\uffff\1\12\1\uffff"+
			"\1\12\2\uffff\3\12\10\uffff\1\12\1\uffff\1\10\2\uffff\1\12\3\uffff\1"+
			"\1\1\5\3\uffff\3\12\2\uffff\1\12\1\uffff\1\6\4\12\6\uffff\1\100\4\uffff"+
			"\1\12\2\uffff\1\12\5\uffff\1\12\3\uffff\10\12\6\uffff\1\77\1\12\1\uffff"+
			"\1\12\3\uffff\2\12\1\uffff\1\11\2\uffff\2\12\2\uffff\1\12\4\uffff\2\12"+
			"\4\uffff\1\12\5\uffff\3\12\1\uffff\7\12\5\uffff\1\12\1\uffff\1\12\1\uffff"+
			"\1\12\1\uffff\1\12\1\1\1\12\3\uffff\1\76\1\12\1\uffff\1\7\1\uffff\4\12"+
			"\1\uffff\1\12\1\uffff\1\12\2\uffff\1\12",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
	static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
	static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
	static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
	static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
	static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
	static final short[][] DFA61_transition;

	static {
		int numStates = DFA61_transitionS.length;
		DFA61_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
		}
	}

	protected class DFA61 extends DFA {

		public DFA61(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 61;
			this.eot = DFA61_eot;
			this.eof = DFA61_eof;
			this.min = DFA61_min;
			this.max = DFA61_max;
			this.accept = DFA61_accept;
			this.special = DFA61_special;
			this.transition = DFA61_transition;
		}
		@Override
		public String getDescription() {
			return "1269:1: primaryexpr returns [SLExpression ret=null] : (result= constant |id= IDENT |inv= INV | TRUE | FALSE | NULL |result= jmlprimary | THIS | new_expr | array_initializer );";
		}
	}

	static final String DFA63_eotS =
		"\106\uffff";
	static final String DFA63_eofS =
		"\106\uffff";
	static final String DFA63_minS =
		"\1\5\105\uffff";
	static final String DFA63_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA63_acceptS =
		"\1\uffff\1\1\103\uffff\1\2";
	static final String DFA63_specialS =
		"\106\uffff}>";
	static final String[] DFA63_transitionS = {
			"\2\1\3\uffff\1\1\1\uffff\1\1\5\uffff\1\1\10\uffff\2\1\1\uffff\1\1\1\uffff"+
			"\1\1\2\uffff\3\1\10\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\2\1\3\uffff"+
			"\3\1\2\uffff\1\1\1\uffff\5\1\6\uffff\1\1\4\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1\3\uffff\10\1\2\uffff\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\2\1\1\uffff\1\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\4\uffff\1\1\1\uffff"+
			"\1\105\3\uffff\3\1\1\uffff\7\1\5\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1"+
			"\uffff\3\1\3\uffff\2\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1"+
			"\1\2\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
	static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
	static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
	static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
	static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
	static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
	static final short[][] DFA63_transition;

	static {
		int numStates = DFA63_transitionS.length;
		DFA63_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
		}
	}

	protected class DFA63 extends DFA {

		public DFA63(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 63;
			this.eot = DFA63_eot;
			this.eof = DFA63_eof;
			this.min = DFA63_min;
			this.max = DFA63_max;
			this.accept = DFA63_accept;
			this.special = DFA63_special;
			this.transition = DFA63_transition;
		}
		@Override
		public String getDescription() {
			return "1361:11: (params= expressionlist )?";
		}
	}

	static final String DFA65_eotS =
		"\106\uffff";
	static final String DFA65_eofS =
		"\106\uffff";
	static final String DFA65_minS =
		"\1\5\105\uffff";
	static final String DFA65_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA65_acceptS =
		"\1\uffff\1\1\103\uffff\1\2";
	static final String DFA65_specialS =
		"\106\uffff}>";
	static final String[] DFA65_transitionS = {
			"\2\1\3\uffff\1\1\1\uffff\1\1\5\uffff\1\1\10\uffff\2\1\1\uffff\1\1\1\uffff"+
			"\1\1\2\uffff\3\1\10\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\2\1\3\uffff"+
			"\3\1\2\uffff\1\1\1\uffff\5\1\6\uffff\1\1\4\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1\3\uffff\10\1\2\uffff\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\2\1\1\uffff\1\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\4\uffff\1\1\1\uffff"+
			"\1\105\3\uffff\3\1\1\uffff\7\1\5\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1"+
			"\uffff\3\1\3\uffff\2\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1"+
			"\1\2\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
	static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
	static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
	static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
	static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
	static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
	static final short[][] DFA65_transition;

	static {
		int numStates = DFA65_transitionS.length;
		DFA65_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
		}
	}

	protected class DFA65 extends DFA {

		public DFA65(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 65;
			this.eot = DFA65_eot;
			this.eof = DFA65_eof;
			this.min = DFA65_min;
			this.max = DFA65_max;
			this.accept = DFA65_accept;
			this.special = DFA65_special;
			this.transition = DFA65_transition;
		}
		@Override
		public String getDescription() {
			return "1393:13: (params= expressionlist )?";
		}
	}

	static final String DFA68_eotS =
		"\106\uffff";
	static final String DFA68_eofS =
		"\106\uffff";
	static final String DFA68_minS =
		"\1\5\105\uffff";
	static final String DFA68_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA68_acceptS =
		"\1\uffff\1\1\103\uffff\1\2";
	static final String DFA68_specialS =
		"\106\uffff}>";
	static final String[] DFA68_transitionS = {
			"\2\1\3\uffff\1\1\1\uffff\1\1\5\uffff\1\1\10\uffff\2\1\1\uffff\1\1\1\uffff"+
			"\1\1\2\uffff\3\1\10\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\2\1\3\uffff"+
			"\3\1\2\uffff\1\1\1\uffff\5\1\6\uffff\1\1\4\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1\3\uffff\10\1\2\uffff\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\2\1\1\uffff\1\1\2\uffff\3\1\1\uffff\1\1\3\uffff\1\105\2\1\4\uffff\1"+
			"\1\5\uffff\3\1\1\uffff\7\1\5\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\3\1\3\uffff\2\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\2\uffff"+
			"\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
	static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
	static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
	static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
	static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
	static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
	static final short[][] DFA68_transition;

	static {
		int numStates = DFA68_transitionS.length;
		DFA68_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
		}
	}

	protected class DFA68 extends DFA {

		public DFA68(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 68;
			this.eot = DFA68_eot;
			this.eof = DFA68_eof;
			this.min = DFA68_min;
			this.max = DFA68_max;
			this.accept = DFA68_accept;
			this.special = DFA68_special;
			this.transition = DFA68_transition;
		}
		@Override
		public String getDescription() {
			return "1410:14: (length= expression )?";
		}
	}

	static final String DFA72_eotS =
		"\106\uffff";
	static final String DFA72_eofS =
		"\106\uffff";
	static final String DFA72_minS =
		"\1\5\105\uffff";
	static final String DFA72_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA72_acceptS =
		"\1\uffff\1\1\103\uffff\1\2";
	static final String DFA72_specialS =
		"\106\uffff}>";
	static final String[] DFA72_transitionS = {
			"\2\1\3\uffff\1\1\1\uffff\1\1\5\uffff\1\1\10\uffff\2\1\1\uffff\1\1\1\uffff"+
			"\1\1\2\uffff\3\1\10\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\2\1\3\uffff"+
			"\3\1\2\uffff\1\1\1\uffff\5\1\6\uffff\1\1\4\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1\3\uffff\10\1\2\uffff\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\2\1\1\uffff\1\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\4\uffff\1\1\1\uffff"+
			"\1\105\3\uffff\3\1\1\uffff\7\1\5\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1"+
			"\uffff\3\1\3\uffff\2\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1"+
			"\1\2\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
	static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
	static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
	static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
	static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
	static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
	static final short[][] DFA72_transition;

	static {
		int numStates = DFA72_transitionS.length;
		DFA72_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
		}
	}

	protected class DFA72 extends DFA {

		public DFA72(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 72;
			this.eot = DFA72_eot;
			this.eof = DFA72_eof;
			this.min = DFA72_min;
			this.max = DFA72_max;
			this.accept = DFA72_accept;
			this.special = DFA72_special;
			this.transition = DFA72_transition;
		}
		@Override
		public String getDescription() {
			return "1576:47: (list= expressionlist )?";
		}
	}

	static final String DFA74_eotS =
		"\106\uffff";
	static final String DFA74_eofS =
		"\106\uffff";
	static final String DFA74_minS =
		"\1\5\105\uffff";
	static final String DFA74_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA74_acceptS =
		"\1\uffff\1\1\103\uffff\1\2";
	static final String DFA74_specialS =
		"\106\uffff}>";
	static final String[] DFA74_transitionS = {
			"\2\1\3\uffff\1\1\1\uffff\1\1\5\uffff\1\1\10\uffff\2\1\1\uffff\1\1\1\uffff"+
			"\1\1\2\uffff\3\1\10\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\2\1\3\uffff"+
			"\3\1\2\uffff\1\1\1\uffff\5\1\6\uffff\1\1\4\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1\3\uffff\10\1\2\uffff\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\2\1\1\uffff\1\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\4\uffff\1\1\1\uffff"+
			"\1\105\3\uffff\3\1\1\uffff\7\1\5\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1"+
			"\uffff\3\1\3\uffff\2\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1"+
			"\1\2\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
	static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
	static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
	static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
	static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
	static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
	static final short[][] DFA74_transition;

	static {
		int numStates = DFA74_transitionS.length;
		DFA74_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
		}
	}

	protected class DFA74 extends DFA {

		public DFA74(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 74;
			this.eot = DFA74_eot;
			this.eof = DFA74_eof;
			this.min = DFA74_min;
			this.max = DFA74_max;
			this.accept = DFA74_accept;
			this.special = DFA74_special;
			this.transition = DFA74_transition;
		}
		@Override
		public String getDescription() {
			return "1583:33: (list= expressionlist )?";
		}
	}

	static final String DFA75_eotS =
		"\106\uffff";
	static final String DFA75_eofS =
		"\106\uffff";
	static final String DFA75_minS =
		"\1\5\105\uffff";
	static final String DFA75_maxS =
		"\1\u00bb\105\uffff";
	static final String DFA75_acceptS =
		"\1\uffff\1\1\103\uffff\1\2";
	static final String DFA75_specialS =
		"\106\uffff}>";
	static final String[] DFA75_transitionS = {
			"\2\1\3\uffff\1\1\1\uffff\1\1\5\uffff\1\1\10\uffff\2\1\1\uffff\1\1\1\uffff"+
			"\1\1\2\uffff\3\1\10\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\2\1\3\uffff"+
			"\3\1\2\uffff\1\1\1\uffff\5\1\6\uffff\1\1\4\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1\3\uffff\10\1\2\uffff\1\1\3\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\2\1\1\uffff\1\1\2\uffff\3\1\1\uffff\1\1\4\uffff\2\1\4\uffff\1\1\1\uffff"+
			"\1\105\3\uffff\3\1\1\uffff\7\1\5\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1"+
			"\uffff\3\1\3\uffff\2\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1"+
			"\1\2\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
	static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
	static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
	static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
	static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
	static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
	static final short[][] DFA75_transition;

	static {
		int numStates = DFA75_transitionS.length;
		DFA75_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
		}
	}

	protected class DFA75 extends DFA {

		public DFA75(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 75;
			this.eot = DFA75_eot;
			this.eof = DFA75_eof;
			this.min = DFA75_min;
			this.max = DFA75_max;
			this.accept = DFA75_accept;
			this.special = DFA75_special;
			this.transition = DFA75_transition;
		}
		@Override
		public String getDescription() {
			return "1588:28: (list= expressionlist )?";
		}
	}

	static final String DFA79_eotS =
		"\112\uffff";
	static final String DFA79_eofS =
		"\112\uffff";
	static final String DFA79_minS =
		"\1\5\104\0\5\uffff";
	static final String DFA79_maxS =
		"\1\u00bb\104\0\5\uffff";
	static final String DFA79_acceptS =
		"\105\uffff\1\2\1\3\2\uffff\1\1";
	static final String DFA79_specialS =
		"\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
		"\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
		"\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
		"\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
		"\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\5\uffff}>";
	static final String[] DFA79_transitionS = {
			"\1\64\1\65\3\uffff\1\24\1\uffff\1\5\5\uffff\1\11\10\uffff\1\6\1\67\1"+
			"\uffff\1\30\1\uffff\1\32\2\uffff\1\41\1\46\1\57\7\uffff\1\106\1\20\1"+
			"\uffff\1\15\2\uffff\1\36\3\uffff\1\7\1\12\3\uffff\1\54\1\101\1\27\2\uffff"+
			"\1\62\1\uffff\1\13\1\52\2\32\1\51\6\uffff\1\104\4\uffff\1\50\2\uffff"+
			"\1\60\5\uffff\1\3\3\uffff\1\31\6\32\1\44\2\uffff\1\2\3\uffff\1\103\1"+
			"\71\1\uffff\1\26\1\uffff\1\4\1\106\1\35\1\34\1\106\1\16\2\uffff\1\22"+
			"\1\25\1\1\1\uffff\1\21\4\uffff\1\37\1\40\4\uffff\1\17\3\uffff\1\105\1"+
			"\uffff\1\73\1\33\1\77\1\uffff\1\72\1\100\1\76\1\75\1\73\1\74\1\63\5\uffff"+
			"\1\60\1\uffff\1\42\1\uffff\1\53\1\uffff\1\56\1\10\1\70\3\uffff\1\102"+
			"\1\23\1\uffff\1\14\1\uffff\1\45\1\47\1\61\1\66\1\uffff\1\55\1\uffff\1"+
			"\43\2\uffff\1\61",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
	static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
	static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
	static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
	static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
	static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
	static final short[][] DFA79_transition;

	static {
		int numStates = DFA79_transitionS.length;
		DFA79_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
		}
	}

	protected class DFA79 extends DFA {

		public DFA79(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 79;
			this.eot = DFA79_eot;
			this.eof = DFA79_eof;
			this.min = DFA79_min;
			this.max = DFA79_max;
			this.accept = DFA79_accept;
			this.special = DFA79_special;
			this.transition = DFA79_transition;
		}
		@Override
		public String getDescription() {
			return "1749:9: ( ( predicate SEMI )=>t2= predicate SEMI | SEMI )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA79_1 = input.LA(1);
						 
						int index79_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_1);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA79_2 = input.LA(1);
						 
						int index79_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_2);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA79_3 = input.LA(1);
						 
						int index79_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_3);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA79_4 = input.LA(1);
						 
						int index79_4 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_4);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA79_5 = input.LA(1);
						 
						int index79_5 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_5);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA79_6 = input.LA(1);
						 
						int index79_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_6);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA79_7 = input.LA(1);
						 
						int index79_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_7);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA79_8 = input.LA(1);
						 
						int index79_8 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_8);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA79_9 = input.LA(1);
						 
						int index79_9 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_9);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA79_10 = input.LA(1);
						 
						int index79_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_10);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA79_11 = input.LA(1);
						 
						int index79_11 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_11);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA79_12 = input.LA(1);
						 
						int index79_12 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_12);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA79_13 = input.LA(1);
						 
						int index79_13 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_13);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA79_14 = input.LA(1);
						 
						int index79_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_14);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA79_15 = input.LA(1);
						 
						int index79_15 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_15);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA79_16 = input.LA(1);
						 
						int index79_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_16);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA79_17 = input.LA(1);
						 
						int index79_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_17);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA79_18 = input.LA(1);
						 
						int index79_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_18);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA79_19 = input.LA(1);
						 
						int index79_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_19);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA79_20 = input.LA(1);
						 
						int index79_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_20);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA79_21 = input.LA(1);
						 
						int index79_21 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_21);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA79_22 = input.LA(1);
						 
						int index79_22 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_22);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA79_23 = input.LA(1);
						 
						int index79_23 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_23);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA79_24 = input.LA(1);
						 
						int index79_24 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_24);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA79_25 = input.LA(1);
						 
						int index79_25 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_25);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA79_26 = input.LA(1);
						 
						int index79_26 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_26);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA79_27 = input.LA(1);
						 
						int index79_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_27);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA79_28 = input.LA(1);
						 
						int index79_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_28);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA79_29 = input.LA(1);
						 
						int index79_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_29);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA79_30 = input.LA(1);
						 
						int index79_30 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_30);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA79_31 = input.LA(1);
						 
						int index79_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_31);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA79_32 = input.LA(1);
						 
						int index79_32 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_32);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA79_33 = input.LA(1);
						 
						int index79_33 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_33);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA79_34 = input.LA(1);
						 
						int index79_34 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_34);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA79_35 = input.LA(1);
						 
						int index79_35 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_35);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA79_36 = input.LA(1);
						 
						int index79_36 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_36);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA79_37 = input.LA(1);
						 
						int index79_37 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_37);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA79_38 = input.LA(1);
						 
						int index79_38 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_38);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA79_39 = input.LA(1);
						 
						int index79_39 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_39);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA79_40 = input.LA(1);
						 
						int index79_40 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_40);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA79_41 = input.LA(1);
						 
						int index79_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_41);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA79_42 = input.LA(1);
						 
						int index79_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_42);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA79_43 = input.LA(1);
						 
						int index79_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_43);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA79_44 = input.LA(1);
						 
						int index79_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_44);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA79_45 = input.LA(1);
						 
						int index79_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_45);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA79_46 = input.LA(1);
						 
						int index79_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_46);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA79_47 = input.LA(1);
						 
						int index79_47 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_47);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA79_48 = input.LA(1);
						 
						int index79_48 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_48);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA79_49 = input.LA(1);
						 
						int index79_49 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_49);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA79_50 = input.LA(1);
						 
						int index79_50 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_50);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA79_51 = input.LA(1);
						 
						int index79_51 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_51);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA79_52 = input.LA(1);
						 
						int index79_52 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_52);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA79_53 = input.LA(1);
						 
						int index79_53 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_53);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA79_54 = input.LA(1);
						 
						int index79_54 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_54);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA79_55 = input.LA(1);
						 
						int index79_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_55);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA79_56 = input.LA(1);
						 
						int index79_56 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_56);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA79_57 = input.LA(1);
						 
						int index79_57 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_57);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA79_58 = input.LA(1);
						 
						int index79_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_58);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA79_59 = input.LA(1);
						 
						int index79_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_59);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA79_60 = input.LA(1);
						 
						int index79_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_60);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA79_61 = input.LA(1);
						 
						int index79_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_61);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA79_62 = input.LA(1);
						 
						int index79_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_62);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA79_63 = input.LA(1);
						 
						int index79_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_63);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA79_64 = input.LA(1);
						 
						int index79_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_64);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA79_65 = input.LA(1);
						 
						int index79_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_65);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA79_66 = input.LA(1);
						 
						int index79_66 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_66);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA79_67 = input.LA(1);
						 
						int index79_67 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_67);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA79_68 = input.LA(1);
						 
						int index79_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_KeYJMLParser()) ) {s = 73;}
						else if ( (true) ) {s = 70;}
						 
						input.seek(index79_68);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 79, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA84_eotS =
		"\110\uffff";
	static final String DFA84_eofS =
		"\110\uffff";
	static final String DFA84_minS =
		"\1\5\104\0\3\uffff";
	static final String DFA84_maxS =
		"\1\u00bb\104\0\3\uffff";
	static final String DFA84_acceptS =
		"\105\uffff\1\2\1\1\1\3";
	static final String DFA84_specialS =
		"\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
		"\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
		"\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
		"\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
		"\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\3\uffff}>";
	static final String[] DFA84_transitionS = {
			"\1\64\1\65\3\uffff\1\24\1\uffff\1\5\5\uffff\1\11\10\uffff\1\6\1\67\1"+
			"\uffff\1\30\1\uffff\1\32\2\uffff\1\41\1\46\1\57\10\uffff\1\20\1\uffff"+
			"\1\15\2\uffff\1\36\3\uffff\1\7\1\12\3\uffff\1\54\1\101\1\27\2\uffff\1"+
			"\62\1\uffff\1\13\1\52\2\32\1\51\6\uffff\1\104\4\uffff\1\50\2\uffff\1"+
			"\60\5\uffff\1\3\3\uffff\1\31\6\32\1\44\2\uffff\1\2\3\uffff\1\103\1\71"+
			"\1\uffff\1\26\1\uffff\1\4\1\uffff\1\35\1\34\1\uffff\1\16\2\uffff\1\22"+
			"\1\25\1\1\1\uffff\1\21\4\uffff\1\37\1\40\4\uffff\1\17\3\uffff\1\105\1"+
			"\uffff\1\73\1\33\1\77\1\uffff\1\72\1\100\1\76\1\75\1\73\1\74\1\63\5\uffff"+
			"\1\60\1\uffff\1\42\1\uffff\1\53\1\uffff\1\56\1\10\1\70\3\uffff\1\102"+
			"\1\23\1\uffff\1\14\1\uffff\1\45\1\47\1\61\1\66\1\uffff\1\55\1\uffff\1"+
			"\43\2\uffff\1\61",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			""
	};

	static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
	static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
	static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
	static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
	static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
	static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
	static final short[][] DFA84_transition;

	static {
		int numStates = DFA84_transitionS.length;
		DFA84_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
		}
	}

	protected class DFA84 extends DFA {

		public DFA84(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 84;
			this.eot = DFA84_eot;
			this.eof = DFA84_eof;
			this.min = DFA84_min;
			this.max = DFA84_max;
			this.accept = DFA84_accept;
			this.special = DFA84_special;
			this.transition = DFA84_transition;
		}
		@Override
		public String getDescription() {
			return "1876:2: ( ( predicate SEMI )=>p= predicate SEMI | SEMI )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA84_1 = input.LA(1);
						 
						int index84_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_1);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA84_2 = input.LA(1);
						 
						int index84_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_2);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA84_3 = input.LA(1);
						 
						int index84_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_3);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA84_4 = input.LA(1);
						 
						int index84_4 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_4);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA84_5 = input.LA(1);
						 
						int index84_5 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_5);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA84_6 = input.LA(1);
						 
						int index84_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_6);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA84_7 = input.LA(1);
						 
						int index84_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_7);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA84_8 = input.LA(1);
						 
						int index84_8 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_8);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA84_9 = input.LA(1);
						 
						int index84_9 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_9);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA84_10 = input.LA(1);
						 
						int index84_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_10);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA84_11 = input.LA(1);
						 
						int index84_11 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_11);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA84_12 = input.LA(1);
						 
						int index84_12 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_12);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA84_13 = input.LA(1);
						 
						int index84_13 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_13);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA84_14 = input.LA(1);
						 
						int index84_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_14);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA84_15 = input.LA(1);
						 
						int index84_15 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_15);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA84_16 = input.LA(1);
						 
						int index84_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_16);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA84_17 = input.LA(1);
						 
						int index84_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_17);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA84_18 = input.LA(1);
						 
						int index84_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_18);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA84_19 = input.LA(1);
						 
						int index84_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_19);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA84_20 = input.LA(1);
						 
						int index84_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_20);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA84_21 = input.LA(1);
						 
						int index84_21 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_21);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA84_22 = input.LA(1);
						 
						int index84_22 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_22);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA84_23 = input.LA(1);
						 
						int index84_23 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_23);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA84_24 = input.LA(1);
						 
						int index84_24 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_24);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA84_25 = input.LA(1);
						 
						int index84_25 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_25);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA84_26 = input.LA(1);
						 
						int index84_26 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_26);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA84_27 = input.LA(1);
						 
						int index84_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_27);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA84_28 = input.LA(1);
						 
						int index84_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_28);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA84_29 = input.LA(1);
						 
						int index84_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_29);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA84_30 = input.LA(1);
						 
						int index84_30 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_30);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA84_31 = input.LA(1);
						 
						int index84_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_31);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA84_32 = input.LA(1);
						 
						int index84_32 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_32);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA84_33 = input.LA(1);
						 
						int index84_33 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_33);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA84_34 = input.LA(1);
						 
						int index84_34 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_34);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA84_35 = input.LA(1);
						 
						int index84_35 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_35);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA84_36 = input.LA(1);
						 
						int index84_36 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_36);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA84_37 = input.LA(1);
						 
						int index84_37 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_37);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA84_38 = input.LA(1);
						 
						int index84_38 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_38);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA84_39 = input.LA(1);
						 
						int index84_39 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_39);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA84_40 = input.LA(1);
						 
						int index84_40 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_40);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA84_41 = input.LA(1);
						 
						int index84_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_41);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA84_42 = input.LA(1);
						 
						int index84_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_42);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA84_43 = input.LA(1);
						 
						int index84_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_43);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA84_44 = input.LA(1);
						 
						int index84_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_44);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA84_45 = input.LA(1);
						 
						int index84_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_45);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA84_46 = input.LA(1);
						 
						int index84_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_46);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA84_47 = input.LA(1);
						 
						int index84_47 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_47);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA84_48 = input.LA(1);
						 
						int index84_48 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_48);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA84_49 = input.LA(1);
						 
						int index84_49 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_49);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA84_50 = input.LA(1);
						 
						int index84_50 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_50);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA84_51 = input.LA(1);
						 
						int index84_51 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_51);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA84_52 = input.LA(1);
						 
						int index84_52 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_52);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA84_53 = input.LA(1);
						 
						int index84_53 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_53);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA84_54 = input.LA(1);
						 
						int index84_54 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_54);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA84_55 = input.LA(1);
						 
						int index84_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_55);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA84_56 = input.LA(1);
						 
						int index84_56 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_56);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA84_57 = input.LA(1);
						 
						int index84_57 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_57);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA84_58 = input.LA(1);
						 
						int index84_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_58);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA84_59 = input.LA(1);
						 
						int index84_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_59);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA84_60 = input.LA(1);
						 
						int index84_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_60);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA84_61 = input.LA(1);
						 
						int index84_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_61);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA84_62 = input.LA(1);
						 
						int index84_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_62);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA84_63 = input.LA(1);
						 
						int index84_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_63);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA84_64 = input.LA(1);
						 
						int index84_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_64);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA84_65 = input.LA(1);
						 
						int index84_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_65);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA84_66 = input.LA(1);
						 
						int index84_66 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_66);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA84_67 = input.LA(1);
						 
						int index84_67 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_67);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA84_68 = input.LA(1);
						 
						int index84_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred13_KeYJMLParser()) ) {s = 70;}
						else if ( (true) ) {s = 71;}
						 
						input.seek(index84_68);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 84, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_accessibleclause_in_top74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_assignableclause_in_top86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_breaksclause_in_top98 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_continuesclause_in_top110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_dependsclause_in_top122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ensuresclause_in_top134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ensuresfreeclause_in_top146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_representsclause_in_top158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_axiomsclause_in_top170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_requiresclause_in_top182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_joinprocclause_in_top194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_requiresfreeclause_in_top206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_decreasesclause_in_top218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_separatesclause_in_top230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_determinesclause_in_top243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_loopseparatesclause_in_top256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_loopdeterminesclause_in_top269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_returnsclause_in_top282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_signalsclause_in_top294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_signalsonlyclause_in_top306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_termexpression_in_top318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SEMI_in_top333 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_top337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCESSIBLE_in_accessibleclause368 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeRefUnion_in_accessibleclause372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNABLE_in_assignableclause414 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1F507F70430L});
	public static final BitSet FOLLOW_storeRefUnion_in_assignableclause424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRICTLY_NOTHING_in_assignableclause442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEPENDS_in_dependsclause486 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_dependsclause490 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_COLON_in_dependsclause496 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeRefUnion_in_dependsclause500 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_MEASURED_BY_in_dependsclause507 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_dependsclause511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SEMI_in_dependsclause515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECREASES_in_decreasesclause556 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_termexpression_in_decreasesclause560 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_decreasesclause571 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_termexpression_in_decreasesclause575 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_REQUIRES_in_requiresclause607 = new BitSet(new long[]{0x7189403958041460L,0xB9EAC4FF104840FAL,0x095EB1D507F72430L});
	public static final BitSet FOLLOW_predornot_in_requiresclause611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REQUIRES_FREE_in_requiresfreeclause652 = new BitSet(new long[]{0x7189403958041460L,0xB9EAC4FF104840FAL,0x095EB1D507F72430L});
	public static final BitSet FOLLOW_predornot_in_requiresfreeclause656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOIN_PROC_in_joinprocclause697 = new BitSet(new long[]{0x7189403958041460L,0xB9EAC4FF104840FAL,0x095EB1D507F72430L});
	public static final BitSet FOLLOW_predornot_in_joinprocclause701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENSURES_in_ensuresclause742 = new BitSet(new long[]{0x7189403958041460L,0xB9EAC4FF104840FAL,0x095EB1D507F72430L});
	public static final BitSet FOLLOW_predornot_in_ensuresclause746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENSURES_FREE_in_ensuresfreeclause787 = new BitSet(new long[]{0x7189403958041460L,0xB9EAC4FF104840FAL,0x095EB1D507F72430L});
	public static final BitSet FOLLOW_predornot_in_ensuresfreeclause791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MODEL_METHOD_AXIOM_in_axiomsclause832 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_termexpression_in_axiomsclause836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REPRESENTS_in_representsclause877 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_representsclause881 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000800L,0x0000020000000000L});
	public static final BitSet FOLLOW_set_in_representsclause915 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_representsclause958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_storeRefUnion_in_representsclause998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUCH_THAT_in_representsclause1057 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_predicate_in_representsclause1061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEPARATES_in_separatesclause1115 = new BitSet(new long[]{0x7189403958041460L,0xB97AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_NOTHING_in_separatesclause1118 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_infflowspeclist_in_separatesclause1126 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_DECLASSIFIES_in_separatesclause1138 = new BitSet(new long[]{0x7189403958041460L,0xB97AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_NOTHING_in_separatesclause1141 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_infflowspeclist_in_separatesclause1149 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_ERASES_in_separatesclause1166 = new BitSet(new long[]{0x7189403958041460L,0xB97AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_NOTHING_in_separatesclause1169 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_infflowspeclist_in_separatesclause1177 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_NEW_OBJECTS_in_separatesclause1194 = new BitSet(new long[]{0x7189403958041460L,0xB97AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_NOTHING_in_separatesclause1197 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_infflowspeclist_in_separatesclause1205 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_LOOP_SEPARATES_in_loopseparatesclause1254 = new BitSet(new long[]{0x7189403958041460L,0xB97AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_NOTHING_in_loopseparatesclause1257 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_infflowspeclist_in_loopseparatesclause1265 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_NEW_OBJECTS_in_loopseparatesclause1279 = new BitSet(new long[]{0x7189403958041460L,0xB97AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_NOTHING_in_loopseparatesclause1282 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_infflowspeclist_in_loopseparatesclause1290 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_DETERMINES_in_determinesclause1339 = new BitSet(new long[]{0x7189403958041460L,0xB97AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_NOTHING_in_determinesclause1342 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_infflowspeclist_in_determinesclause1352 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_BY_in_determinesclause1359 = new BitSet(new long[]{0x7189403958041460L,0xB97AC4FF104841FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_NOTHING_in_determinesclause1362 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_ITSELF_in_determinesclause1369 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_infflowspeclist_in_determinesclause1380 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_DECLASSIFIES_in_determinesclause1392 = new BitSet(new long[]{0x7189403958041460L,0xB97AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_NOTHING_in_determinesclause1395 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_infflowspeclist_in_determinesclause1403 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_ERASES_in_determinesclause1420 = new BitSet(new long[]{0x7189403958041460L,0xB97AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_NOTHING_in_determinesclause1423 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_infflowspeclist_in_determinesclause1431 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_NEW_OBJECTS_in_determinesclause1448 = new BitSet(new long[]{0x7189403958041460L,0xB97AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_NOTHING_in_determinesclause1451 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_infflowspeclist_in_determinesclause1459 = new BitSet(new long[]{0x0000080000400002L,0x0001000000000000L});
	public static final BitSet FOLLOW_LOOP_DETERMINES_in_loopdeterminesclause1508 = new BitSet(new long[]{0x7189403958041460L,0xB97AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_NOTHING_in_loopdeterminesclause1511 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_infflowspeclist_in_loopdeterminesclause1519 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_BY_in_loopdeterminesclause1526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_ITSELF_in_loopdeterminesclause1528 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_NEW_OBJECTS_in_loopdeterminesclause1539 = new BitSet(new long[]{0x7189403958041460L,0xB97AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_NOTHING_in_loopdeterminesclause1542 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_infflowspeclist_in_loopdeterminesclause1550 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_termexpression_in_infflowspeclist1598 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_infflowspeclist1607 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_termexpression_in_infflowspeclist1613 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_SIGNALS_in_signalsclause1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_signalsclause1663 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_referencetype_in_signalsclause1667 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENT_in_signalsclause1672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_signalsclause1678 = new BitSet(new long[]{0x7189403958041462L,0xB9EAC4FF104840FAL,0x095EB1D507F72430L});
	public static final BitSet FOLLOW_predornot_in_signalsclause1689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIGNALS_ONLY_in_signalsonlyclause1727 = new BitSet(new long[]{0x0100000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_NOTHING_in_signalsonlyclause1737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_referencetype_in_signalsonlyclause1751 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_signalsonlyclause1764 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_referencetype_in_signalsonlyclause1770 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_expression_in_termexpression1814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAKS_in_breaksclause1846 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_breaksclause1848 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENT_in_breaksclause1853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_breaksclause1859 = new BitSet(new long[]{0x7189403958041462L,0xB9EAC4FF104840FAL,0x095EB1D507F72430L});
	public static final BitSet FOLLOW_predornot_in_breaksclause1867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUES_in_continuesclause1898 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_continuesclause1900 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENT_in_continuesclause1905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_continuesclause1911 = new BitSet(new long[]{0x7189403958041462L,0xB9EAC4FF104840FAL,0x095EB1D507F72430L});
	public static final BitSet FOLLOW_predornot_in_continuesclause1919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURNS_in_returnsclause1950 = new BitSet(new long[]{0x7189403958041462L,0xB9EAC4FF104840FAL,0x095EB1D507F72430L});
	public static final BitSet FOLLOW_predornot_in_returnsclause1958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_storeRefList_in_storeRefUnion1991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_storeref_in_storeRefList2020 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_storeRefList2026 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeref_in_storeRefList2032 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_storeRefList_in_storeRefIntersect2061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTHING_in_storeref2090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EVERYTHING_in_storeref2102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_SPECIFIED_in_storeref2114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_storeRefExpr_in_storeref2130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_createLocset2151 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_createLocset2159 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_exprList_in_createLocset2163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_createLocset2165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprList2199 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_exprList2205 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_exprList2211 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_expression_in_storeRefExpr2239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_specarrayrefexpr2309 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_DOTDOT_in_specarrayrefexpr2312 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_specarrayrefexpr2316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_specarrayrefexpr2325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_predornot2362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_SPECIFIED_in_predornot2374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SAME_in_predornot2394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_predicate2418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalexpr_in_expression2446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_equivalenceexpr_in_conditionalexpr2477 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_QUESTIONMARK_in_conditionalexpr2487 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_conditionalexpr_in_conditionalexpr2491 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_COLON_in_conditionalexpr2493 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_conditionalexpr_in_conditionalexpr2497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_impliesexpr_in_equivalenceexpr2539 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_EQV_ANTIV_in_equivalenceexpr2555 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_impliesexpr_in_equivalenceexpr2559 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_logicalorexpr_in_impliesexpr2614 = new BitSet(new long[]{0x0600000000000002L});
	public static final BitSet FOLLOW_IMPLIES_in_impliesexpr2624 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_impliesforwardexpr_in_impliesexpr2628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPLIESBACKWARD_in_impliesexpr2652 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_logicalorexpr_in_impliesexpr2656 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_logicalorexpr_in_impliesforwardexpr2696 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_IMPLIES_in_impliesforwardexpr2706 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_impliesforwardexpr_in_impliesforwardexpr2710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalandexpr_in_logicalorexpr2745 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_LOGICALOR_in_logicalorexpr2755 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_logicalandexpr_in_logicalorexpr2759 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_inclusiveorexpr_in_logicalandexpr2794 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_LOGICALAND_in_logicalandexpr2804 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_inclusiveorexpr_in_logicalandexpr2808 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_exclusiveorexpr_in_inclusiveorexpr2844 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_INCLUSIVEOR_in_inclusiveorexpr2854 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_exclusiveorexpr_in_inclusiveorexpr2858 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_andexpr_in_exclusiveorexpr2894 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_XOR_in_exclusiveorexpr2904 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_andexpr_in_exclusiveorexpr2908 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_equalityexpr_in_andexpr2944 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_AND_in_andexpr2957 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_equalityexpr_in_andexpr2961 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_relationalexpr_in_equalityexpr2998 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_EQ_NEQ_in_equalityexpr3007 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_relationalexpr_in_equalityexpr3011 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_shiftexpr_in_relationalexpr3055 = new BitSet(new long[]{0x8030000000000002L,0x0000000020310000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LT_in_relationalexpr3067 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_shiftexpr_in_relationalexpr3071 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
	public static final BitSet FOLLOW_LT_in_relationalexpr3087 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_shiftexpr_in_relationalexpr3091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_relationalexpr3113 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_shiftexpr_in_relationalexpr3117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEQ_in_relationalexpr3136 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_shiftexpr_in_relationalexpr3140 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
	public static final BitSet FOLLOW_LT_in_relationalexpr3155 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_shiftexpr_in_relationalexpr3159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GEQ_in_relationalexpr3181 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_shiftexpr_in_relationalexpr3185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCKSET_LT_in_relationalexpr3204 = new BitSet(new long[]{0x7189403958040460L,0x9962C0FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_postfixexpr_in_relationalexpr3208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCKSET_LEQ_in_relationalexpr3227 = new BitSet(new long[]{0x7189403958040460L,0x9962C0FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_postfixexpr_in_relationalexpr3231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTANCEOF_in_relationalexpr3250 = new BitSet(new long[]{0x0104000000022800L,0x0000000002400001L,0x0081000020010040L});
	public static final BitSet FOLLOW_typespec_in_relationalexpr3254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ST_in_relationalexpr3273 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_shiftexpr_in_relationalexpr3277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_additiveexpr_in_shiftexpr3318 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020000018000000L});
	public static final BitSet FOLLOW_SHIFTRIGHT_in_shiftexpr3329 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_additiveexpr_in_shiftexpr3333 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020000018000000L});
	public static final BitSet FOLLOW_SHIFTLEFT_in_shiftexpr3347 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_additiveexpr_in_shiftexpr3351 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020000018000000L});
	public static final BitSet FOLLOW_UNSIGNEDSHIFTRIGHT_in_shiftexpr3365 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_additiveexpr_in_shiftexpr3369 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020000018000000L});
	public static final BitSet FOLLOW_multexpr_in_additiveexpr3407 = new BitSet(new long[]{0x0000000000000002L,0x2000040000000000L});
	public static final BitSet FOLLOW_PLUS_in_additiveexpr3418 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_multexpr_in_additiveexpr3422 = new BitSet(new long[]{0x0000000000000002L,0x2000040000000000L});
	public static final BitSet FOLLOW_MINUS_in_additiveexpr3436 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_multexpr_in_additiveexpr3440 = new BitSet(new long[]{0x0000000000000002L,0x2000040000000000L});
	public static final BitSet FOLLOW_unaryexpr_in_multexpr3479 = new BitSet(new long[]{0x0000000020000002L,0x0000280000000000L});
	public static final BitSet FOLLOW_MULT_in_multexpr3488 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_unaryexpr_in_multexpr3492 = new BitSet(new long[]{0x0000000020000002L,0x0000280000000000L});
	public static final BitSet FOLLOW_DIV_in_multexpr3504 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_unaryexpr_in_multexpr3508 = new BitSet(new long[]{0x0000000020000002L,0x0000280000000000L});
	public static final BitSet FOLLOW_MOD_in_multexpr3520 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_unaryexpr_in_multexpr3524 = new BitSet(new long[]{0x0000000020000002L,0x0000280000000000L});
	public static final BitSet FOLLOW_PLUS_in_unaryexpr3561 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_unaryexpr_in_unaryexpr3565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryexpr3577 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_unaryexpr_in_unaryexpr3581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castexpr_in_unaryexpr3608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryexprnotplusminus_in_unaryexpr3623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_castexpr3646 = new BitSet(new long[]{0x0104000000022800L,0x0000000002400001L,0x0081000020010040L});
	public static final BitSet FOLLOW_typespec_in_castexpr3650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_castexpr3652 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_unaryexpr_in_castexpr3656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unaryexprnotplusminus3681 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_unaryexpr_in_unaryexprnotplusminus3685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BITWISENOT_in_unaryexprnotplusminus3697 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_unaryexpr_in_unaryexprnotplusminus3701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfixexpr_in_unaryexprnotplusminus3716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryexpr_in_postfixexpr3747 = new BitSet(new long[]{0x0000000200000002L,0x0000000010008000L});
	public static final BitSet FOLLOW_primarysuffix_in_postfixexpr3769 = new BitSet(new long[]{0x0000000200000002L,0x0000000010008000L});
	public static final BitSet FOLLOW_constant_in_primaryexpr3817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryexpr3829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INV_in_primaryexpr3847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_primaryexpr3864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_primaryexpr3884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_primaryexpr3903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jmlprimary_in_primaryexpr3925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIS_in_primaryexpr3935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_new_expr_in_primaryexpr3955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_initializer_in_primaryexpr3965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRANSACTIONUPDATED_in_transactionUpdated3997 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_transactionUpdated3999 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_transactionUpdated4003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_transactionUpdated4005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_primarysuffix4046 = new BitSet(new long[]{0x0100000000000000L,0x0000200000000008L,0x0000500000000000L});
	public static final BitSet FOLLOW_IDENT_in_primarysuffix4056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRANSIENT_in_primarysuffix4069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIS_in_primarysuffix4092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INV_in_primarysuffix4106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_primarysuffix4120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_primarysuffix4147 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F71430L});
	public static final BitSet FOLLOW_expressionlist_in_primarysuffix4152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_primarysuffix4156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_primarysuffix4170 = new BitSet(new long[]{0x7189403958041460L,0xB96AE4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_specarrayrefexpr_in_primarysuffix4174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_RBRACKET_in_primarysuffix4177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_new_expr4194 = new BitSet(new long[]{0x0104000000022800L,0x0000000002400001L,0x0081000020010040L});
	public static final BitSet FOLLOW_type_in_new_expr4198 = new BitSet(new long[]{0x0000000000000000L,0x0000000010008000L});
	public static final BitSet FOLLOW_LPAREN_in_new_expr4207 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F71430L});
	public static final BitSet FOLLOW_expressionlist_in_new_expr4213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_new_expr4218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_dimensions_in_new_expr4231 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_array_initializer_in_new_expr4234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_dimension_in_array_dimensions4273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_array_dimension4295 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70438L});
	public static final BitSet FOLLOW_expression_in_array_dimension4300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_RBRACKET_in_array_dimension4304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_array_initializer4321 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expressionlist_in_array_initializer4325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RBRACE_in_array_initializer4327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionlist4368 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_expressionlist4373 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_expressionlist4377 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_javaliteral_in_constant4402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integerliteral_in_javaliteral4428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_javaliteral4439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_javaliteral4453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decimalintegerliteral_in_integerliteral4485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hexintegerliteral_in_integerliteral4496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEXNUMERAL_in_hexintegerliteral4519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decimalnumeral_in_decimalintegerliteral4545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGITS_in_decimalnumeral4569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESULT_in_jmlprimary4598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXCEPTION_in_jmlprimary4609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specquantifiedexpression_in_jmlprimary4634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bsumterm_in_jmlprimary4660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_seqdefterm_in_jmlprimary4686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oldexpression_in_jmlprimary4707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transactionUpdated_in_jmlprimary4722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BACKUP_in_jmlprimary4731 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary4733 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary4737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary4739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERMISSION_in_jmlprimary4758 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary4760 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary4764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary4766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NONNULLELEMENTS_in_jmlprimary4785 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary4787 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary4791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary4793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INFORMAL_DESCRIPTION_in_jmlprimary4809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DL_ESCAPE_in_jmlprimary4825 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary4835 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F71430L});
	public static final BitSet FOLLOW_expressionlist_in_jmlprimary4841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary4846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAPEMPTY_in_jmlprimary4880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mapExpression_in_jmlprimary4903 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary4905 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F71430L});
	public static final BitSet FOLLOW_expressionlist_in_jmlprimary4911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary4916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEQ2MAP_in_jmlprimary4933 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary4935 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F71430L});
	public static final BitSet FOLLOW_expressionlist_in_jmlprimary4941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary4946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_MODIFIED_in_jmlprimary4961 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary4963 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeRefUnion_in_jmlprimary4967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary4969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_ASSIGNED_in_jmlprimary4991 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary4993 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeRefUnion_in_jmlprimary4997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary4999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FRESH_in_jmlprimary5026 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5028 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expressionlist_in_jmlprimary5032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REACH_in_jmlprimary5048 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5050 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeref_in_jmlprimary5054 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_jmlprimary5056 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5060 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_jmlprimary5062 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5066 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_COMMA_in_jmlprimary5069 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REACHLOCS_in_jmlprimary5091 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5093 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeref_in_jmlprimary5097 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_jmlprimary5099 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5103 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_COMMA_in_jmlprimary5106 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DURATION_in_jmlprimary5130 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5132 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPACE_in_jmlprimary5154 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5156 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORKINGSPACE_in_jmlprimary5178 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5180 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAX_in_jmlprimary5208 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5210 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEOF_in_jmlprimary5232 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5234 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELEMTYPE_in_jmlprimary5254 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5256 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_SMALL_in_jmlprimary5276 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5278 = new BitSet(new long[]{0x0104000000022800L,0x0000000002400001L,0x0081000020010040L});
	public static final BitSet FOLLOW_typespec_in_jmlprimary5282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCKSET_in_jmlprimary5300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IS_INITIALIZED_in_jmlprimary5314 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5316 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_referencetype_in_jmlprimary5320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INVARIANT_FOR_in_jmlprimary5336 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5338 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_INVARIANT_FOR_in_jmlprimary5355 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5357 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_referencetype_in_jmlprimary5361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LBLNEG_in_jmlprimary5391 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_IDENT_in_jmlprimary5393 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LBLPOS_in_jmlprimary5427 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_IDENT_in_jmlprimary5429 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INDEX_in_jmlprimary5445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VALUES_in_jmlprimary5454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_EQUAL_in_jmlprimary5466 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5468 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5472 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_jmlprimary5474 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMPTYSET_in_jmlprimary5501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createLocset_in_jmlprimary5526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_jmlprimary5547 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5555 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeRefUnion_in_jmlprimary5559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERSECT_in_jmlprimary5582 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5584 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeRefIntersect_in_jmlprimary5588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SETMINUS_in_jmlprimary5611 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5613 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeref_in_jmlprimary5617 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_jmlprimary5619 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeref_in_jmlprimary5623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALLFIELDS_in_jmlprimary5646 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5648 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary5652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALLOBJECTS_in_jmlprimary5674 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5676 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeref_in_jmlprimary5680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIONINF_in_jmlprimary5702 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5712 = new BitSet(new long[]{0x0104000000022800L,0x0204000002400001L,0x0081000020010040L});
	public static final BitSet FOLLOW_boundvarmodifiers_in_jmlprimary5725 = new BitSet(new long[]{0x0104000000022800L,0x0000000002400001L,0x0081000020010040L});
	public static final BitSet FOLLOW_quantifiedvardecls_in_jmlprimary5739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SEMI_in_jmlprimary5749 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F74430L});
	public static final BitSet FOLLOW_predicate_in_jmlprimary5780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SEMI_in_jmlprimary5782 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_SEMI_in_jmlprimary5786 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeref_in_jmlprimary5801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISJOINT_in_jmlprimary5834 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5836 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeRefList_in_jmlprimary5840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBSET_in_jmlprimary5855 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5857 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeref_in_jmlprimary5861 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_jmlprimary5863 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeref_in_jmlprimary5867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWELEMSFRESH_in_jmlprimary5890 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary5892 = new BitSet(new long[]{0x7189603958041460L,0xB9FAC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_storeref_in_jmlprimary5896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary5898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sequence_in_jmlprimary6067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_jmlprimary6086 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_jmlprimary6090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_jmlprimary6092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEQEMPTY_in_sequence6128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_seqdefterm_in_sequence6168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_sequence6178 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_sequence6186 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_exprList_in_sequence6190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_sequence6192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEQSUB_in_sequence6213 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_sequence6215 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_sequence6219 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_sequence6221 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_sequence6225 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_sequence6227 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_sequence6231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_sequence6233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEQREVERSE_in_sequence6254 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_sequence6256 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_sequence6260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_sequence6262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEQREPLACE_in_sequence6282 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_sequence6284 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_sequence6288 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_sequence6290 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_sequence6294 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_sequence6296 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_sequence6300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_sequence6302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEQCONCAT_in_sequence6335 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SEQGET_in_sequence6343 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_INDEXOF_in_sequence6351 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_sequence6363 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_sequence6367 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_COMMA_in_sequence6369 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_sequence6373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_sequence6375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_mapExpression6400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_quantifier6477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_specquantifiedexpression6550 = new BitSet(new long[]{0x0002800000000000L,0x0400028000000000L,0x0000040000000001L});
	public static final BitSet FOLLOW_quantifier_in_specquantifiedexpression6555 = new BitSet(new long[]{0x0104000000022800L,0x0204000002400001L,0x0081000020010040L});
	public static final BitSet FOLLOW_boundvarmodifiers_in_specquantifiedexpression6561 = new BitSet(new long[]{0x0104000000022800L,0x0000000002400001L,0x0081000020010040L});
	public static final BitSet FOLLOW_quantifiedvardecls_in_specquantifiedexpression6568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SEMI_in_specquantifiedexpression6570 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F74430L});
	public static final BitSet FOLLOW_predicate_in_specquantifiedexpression6587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SEMI_in_specquantifiedexpression6589 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_SEMI_in_specquantifiedexpression6593 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_specquantifiedexpression6600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_specquantifiedexpression6606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRE_in_oldexpression6643 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_oldexpression6645 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_oldexpression6649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_oldexpression6651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLD_in_oldexpression6663 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_oldexpression6665 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_oldexpression6669 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_COMMA_in_oldexpression6672 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_IDENT_in_oldexpression6676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_oldexpression6680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_bsumterm6721 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_BSUM_in_bsumterm6733 = new BitSet(new long[]{0x0104000000022800L,0x0000000002400001L,0x0081000020010040L});
	public static final BitSet FOLLOW_quantifiedvardecls_in_bsumterm6737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SEMI_in_bsumterm6757 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_bsumterm6783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SEMI_in_bsumterm6785 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_bsumterm6790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SEMI_in_bsumterm6792 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_bsumterm6796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_bsumterm6826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_seqdefterm6870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_SEQDEF_in_seqdefterm6882 = new BitSet(new long[]{0x0104000000022800L,0x0000000002400001L,0x0081000020010040L});
	public static final BitSet FOLLOW_quantifiedvardecls_in_seqdefterm6886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SEMI_in_seqdefterm6906 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_seqdefterm6932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SEMI_in_seqdefterm6934 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_seqdefterm6939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SEMI_in_seqdefterm6941 = new BitSet(new long[]{0x7189403958041460L,0xB96AC4FF104840FAL,0x095EB1D507F70430L});
	public static final BitSet FOLLOW_expression_in_seqdefterm6945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_seqdefterm6975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typespec_in_quantifiedvardecls7033 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_quantifiedvariabledeclarator_in_quantifiedvardecls7037 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_COMMA_in_quantifiedvardecls7053 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_quantifiedvariabledeclarator_in_quantifiedvardecls7057 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_NON_NULL_in_boundvarmodifiers7091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULLABLE_in_boundvarmodifiers7095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typespec7122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_dims_in_typespec7134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_dims7164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_RBRACKET_in_dims7166 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_builtintype_in_type7205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_referencetype_in_type7216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type7225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_referencetype7253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTE_in_builtintype7281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_in_builtintype7298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_builtintype7315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_in_builtintype7332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_builtintype7349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_builtintype7366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIGINT_in_builtintype7383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REAL_in_builtintype7400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCSET_in_builtintype7421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEQ_in_builtintype7449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FREE_in_builtintype7475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_name7501 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_DOT_in_name7514 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_IDENT_in_name7518 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_IDENT_in_quantifiedvariabledeclarator7557 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_dims_in_quantifiedvariabledeclarator7562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred1_KeYJMLParser3594 = new BitSet(new long[]{0x0104000000022800L,0x0000000002400001L,0x0081000020010040L});
	public static final BitSet FOLLOW_typespec_in_synpred1_KeYJMLParser3596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred1_KeYJMLParser3598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred2_KeYJMLParser4625 = new BitSet(new long[]{0x0002800000000000L,0x0400028000000000L,0x0000040000000001L});
	public static final BitSet FOLLOW_quantifier_in_synpred2_KeYJMLParser4627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred3_KeYJMLParser4651 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_BSUM_in_synpred3_KeYJMLParser4653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred4_KeYJMLParser4677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_SEQDEF_in_synpred4_KeYJMLParser4679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred6_KeYJMLParser4830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAX_in_synpred7_KeYJMLParser5201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred8_KeYJMLParser5379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LBLNEG_in_synpred8_KeYJMLParser5381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred9_KeYJMLParser5415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LBLPOS_in_synpred9_KeYJMLParser5417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_synpred10_KeYJMLParser5771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SEMI_in_synpred10_KeYJMLParser5773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEQEMPTY_in_synpred11_KeYJMLParser5920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred11_KeYJMLParser5933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000090000L});
	public static final BitSet FOLLOW_set_in_synpred11_KeYJMLParser5935 = new BitSet(new long[]{0x0104000000022800L,0x0000000002400001L,0x0081000020010040L});
	public static final BitSet FOLLOW_quantifiedvardecls_in_synpred11_KeYJMLParser5943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SEMI_in_synpred11_KeYJMLParser5945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred11_KeYJMLParser5958 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred11_KeYJMLParser5966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEQSUB_in_synpred11_KeYJMLParser5978 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred11_KeYJMLParser5980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEQREVERSE_in_synpred11_KeYJMLParser5992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEQREPLACE_in_synpred11_KeYJMLParser6004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEQCONCAT_in_synpred11_KeYJMLParser6025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEQGET_in_synpred11_KeYJMLParser6037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INDEXOF_in_synpred11_KeYJMLParser6049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred12_KeYJMLParser6149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000090000L});
	public static final BitSet FOLLOW_set_in_synpred12_KeYJMLParser6151 = new BitSet(new long[]{0x0104000000022800L,0x0000000002400001L,0x0081000020010040L});
	public static final BitSet FOLLOW_quantifiedvardecls_in_synpred12_KeYJMLParser6159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SEMI_in_synpred12_KeYJMLParser6161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_synpred13_KeYJMLParser6578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SEMI_in_synpred13_KeYJMLParser6580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_builtintype_in_synpred14_KeYJMLParser7198 = new BitSet(new long[]{0x0000000000000002L});
}
