// $ANTLR 3.5.2 /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g 2017-04-13 18:24:06


  package de.uka.ilkd.key.parser;

  import de.uka.ilkd.key.parser.AmbigiousDeclException;
  import de.uka.ilkd.key.parser.GenericSortException;
  import de.uka.ilkd.key.parser.InvalidFindException;
  import de.uka.ilkd.key.parser.KeYSemanticException;
  import de.uka.ilkd.key.parser.NotDeclException;
  import de.uka.ilkd.key.parser.SchemaVariableModifierSet;
  import de.uka.ilkd.key.parser.UnfittingReplacewithException;
  import de.uka.ilkd.key.parser.ParserMode;
  import de.uka.ilkd.key.parser.IdDeclaration;
  import de.uka.ilkd.key.parser.ParserConfig;

  import antlr.CharScanner;
  import antlr.SemanticException;
  import antlr.LexerSharedInputState;
  import antlr.TokenStreamException;
  import antlr.TokenStreamSelector;
  import org.antlr.runtime.*;

  import java.io.*;
  import java.util.HashSet;
  import java.util.Iterator;
  import java.util.LinkedHashMap;
  import java.util.LinkedHashSet;
  import java.util.LinkedList;
  import java.util.Set;
  import java.util.Vector;
  import java.math.BigInteger;

  import org.key_project.util.collection.DefaultImmutableSet;
  import org.key_project.util.collection.ImmutableArray;
  import org.key_project.util.collection.ImmutableList;
  import org.key_project.util.collection.ImmutableSLList;
  import org.key_project.util.collection.ImmutableSet;
  import de.uka.ilkd.key.logic.*;
  import de.uka.ilkd.key.logic.op.*;
  import de.uka.ilkd.key.logic.sort.*;
  import de.uka.ilkd.key.logic.label.*;

  import de.uka.ilkd.key.proof.init.*;
  import de.uka.ilkd.key.proof.io.*;
  import static de.uka.ilkd.key.proof.io.IProofFileParser.*;
  
  import de.uka.ilkd.key.rule.*;
  import de.uka.ilkd.key.rule.tacletbuilder.*;
  import de.uka.ilkd.key.rule.conditions.*;
  import de.uka.ilkd.key.rule.label.*;
 
  import de.uka.ilkd.key.speclang.*;

  import de.uka.ilkd.key.speclang.dl.translation.DLSpecFactory;

  import de.uka.ilkd.key.util.*;

  import de.uka.ilkd.key.java.JavaInfo;
  import de.uka.ilkd.key.java.Services;
  import de.uka.ilkd.key.java.JavaReader;
  import de.uka.ilkd.key.java.SchemaJavaReader;
  import de.uka.ilkd.key.java.abstraction.*;
  import de.uka.ilkd.key.java.visitor.*;
  import de.uka.ilkd.key.java.Recoder2KeY;
  import de.uka.ilkd.key.java.SchemaRecoder2KeY;
  import de.uka.ilkd.key.java.StatementBlock;
  import de.uka.ilkd.key.java.declaration.VariableDeclaration;
  import de.uka.ilkd.key.java.recoderext.*;
  import de.uka.ilkd.key.pp.AbbrevMap;
  import de.uka.ilkd.key.pp.LogicPrinter;
  
  import de.uka.ilkd.key.ldt.SeqLDT;
  import de.uka.ilkd.key.ldt.IntegerLDT;
  
  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class KeYParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ADD", "ADDPROGVARS", 
		"ADDRULES", "AND", "ANTECEDENTPOLARITY", "APPLY_UPDATE_ON_RIGID", "ASSIGN", 
		"ASSUMES", "AT", "AVOID", "AXIOMS", "BACKSLASH", "BIGINT", "BOOTCLASSPATH", 
		"CHAR_LITERAL", "CHOOSECONTRACT", "CLASSPATH", "CLOSEGOAL", "COLON", "COMMA", 
		"CONTAINERTYPE", "CONTAINS_ASSIGNMENT", "CONTRACTS", "DEPENDINGON", "DIFFERENT", 
		"DIFFERENTFIELDS", "DIGIT", "DIGIT_DISPATCH", "DISJOINTMODULONULL", "DISPLAYNAME", 
		"DOT", "DOTRANGE", "DOUBLECOLON", "DROP_EFFECTLESS_ELEMENTARIES", "DROP_EFFECTLESS_STORES", 
		"ELEMSORT", "ELSE", "EMPTYBRACKETS", "ENUM_CONST", "EQUALS", "EQUAL_UNIQUE", 
		"EQV", "EXISTS", "EXP", "EXTENDS", "FALSE", "FIELDTYPE", "FINAL", "FIND", 
		"FORALL", "FORMULA", "FREELABELIN", "FUNCTIONS", "GENERIC", "GREATER", 
		"GREATEREQUAL", "HASLABEL", "HASSORT", "HASSUBFORMULAS", "HELPTEXT", "HEURISTICS", 
		"HEURISTICSDECL", "HEX", "HEX_LITERAL", "IDCHAR", "IDENT", "IF", "IFEX", 
		"IMP", "IMPLICIT_IDENT", "INCLUDE", "INCLUDELDTS", "INSEQUENTSTATE", "INSTANTIATE_GENERIC", 
		"INVARIANTS", "IN_TYPE", "ISARRAY", "ISARRAYLENGTH", "ISCONSTANT", "ISENUMTYPE", 
		"ISINDUCTVAR", "ISLOCALVARIABLE", "ISOBSERVER", "ISREFERENCE", "ISREFERENCEARRAY", 
		"ISSTATICFIELD", "ISSUBTYPE", "ISTHISREFERENCE", "IS_ABSTRACT_OR_INTERFACE", 
		"JAVABLOCK", "JAVASOURCE", "KEYSETTINGS", "LBRACE", "LBRACKET", "LEMMA", 
		"LESS", "LESSEQUAL", "LESS_DISPATCH", "LETTER", "LGUILLEMETS", "LIMITED", 
		"LOCSET", "LPAREN", "METADISJOINT", "MINUS", "ML_COMMENT", "MODALITY", 
		"MODALITYEND", "MODALOPERATOR", "MODIFIES", "NEW", "NEWLABEL", "NODEFAULTCLASSES", 
		"NONINTERACTIVE", "NOT", "NOTFREEIN", "NOT_", "NOT_EQUALS", "NUM_LITERAL", 
		"ONEOF", "OPTIONSDECL", "OR", "PARALLEL", "PERCENT", "PLUS", "PREDICATES", 
		"PRIMES", "PRIMES_OR_CHARLITERAL", "PROBLEM", "PROFILE", "PROGRAM", "PROGRAMVARIABLES", 
		"PROOF", "PROOFOBLIGATION", "PROOFSCRIPT", "PROXY", "QUOTED_STRING_LITERAL", 
		"RBRACE", "RBRACKET", "REPLACEWITH", "RGUILLEMETS", "RPAREN", "RULES", 
		"SAME", "SAMEUPDATELEVEL", "SCHEMAVAR", "SCHEMAVARIABLES", "SEMI", "SEQ", 
		"SEQARROW", "SIMPLIFY_IF_THEN_ELSE_UPDATE", "SKOLEMFORMULA", "SKOLEMTERM", 
		"SLASH", "SL_COMMENT", "SORTS", "STAR", "STATIC", "STATICMETHODREFERENCE", 
		"STRICT", "STRING_LITERAL", "SUBST", "SUCCEDENTPOLARITY", "TERM", "TERMLABEL", 
		"THEN", "TILDE", "TRANSFORMERS", "TRIGGER", "TRUE", "TYPEOF", "UNIQUE", 
		"UPDATE", "UTF_EMPTY", "UTF_IN", "UTF_INTERSECT", "UTF_PRECEDES", "UTF_SETMINUS", 
		"UTF_SUBSET", "UTF_UNION", "VARCOND", "VARIABLE", "VARIABLES", "VOCAB", 
		"WITHOPTIONS", "WS"
	};
	public static final int EOF=-1;
	public static final int ABSTRACT=4;
	public static final int ADD=5;
	public static final int ADDPROGVARS=6;
	public static final int ADDRULES=7;
	public static final int AND=8;
	public static final int ANTECEDENTPOLARITY=9;
	public static final int APPLY_UPDATE_ON_RIGID=10;
	public static final int ASSIGN=11;
	public static final int ASSUMES=12;
	public static final int AT=13;
	public static final int AVOID=14;
	public static final int AXIOMS=15;
	public static final int BACKSLASH=16;
	public static final int BIGINT=17;
	public static final int BOOTCLASSPATH=18;
	public static final int CHAR_LITERAL=19;
	public static final int CHOOSECONTRACT=20;
	public static final int CLASSPATH=21;
	public static final int CLOSEGOAL=22;
	public static final int COLON=23;
	public static final int COMMA=24;
	public static final int CONTAINERTYPE=25;
	public static final int CONTAINS_ASSIGNMENT=26;
	public static final int CONTRACTS=27;
	public static final int DEPENDINGON=28;
	public static final int DIFFERENT=29;
	public static final int DIFFERENTFIELDS=30;
	public static final int DIGIT=31;
	public static final int DIGIT_DISPATCH=32;
	public static final int DISJOINTMODULONULL=33;
	public static final int DISPLAYNAME=34;
	public static final int DOT=35;
	public static final int DOTRANGE=36;
	public static final int DOUBLECOLON=37;
	public static final int DROP_EFFECTLESS_ELEMENTARIES=38;
	public static final int DROP_EFFECTLESS_STORES=39;
	public static final int ELEMSORT=40;
	public static final int ELSE=41;
	public static final int EMPTYBRACKETS=42;
	public static final int ENUM_CONST=43;
	public static final int EQUALS=44;
	public static final int EQUAL_UNIQUE=45;
	public static final int EQV=46;
	public static final int EXISTS=47;
	public static final int EXP=48;
	public static final int EXTENDS=49;
	public static final int FALSE=50;
	public static final int FIELDTYPE=51;
	public static final int FINAL=52;
	public static final int FIND=53;
	public static final int FORALL=54;
	public static final int FORMULA=55;
	public static final int FREELABELIN=56;
	public static final int FUNCTIONS=57;
	public static final int GENERIC=58;
	public static final int GREATER=59;
	public static final int GREATEREQUAL=60;
	public static final int HASLABEL=61;
	public static final int HASSORT=62;
	public static final int HASSUBFORMULAS=63;
	public static final int HELPTEXT=64;
	public static final int HEURISTICS=65;
	public static final int HEURISTICSDECL=66;
	public static final int HEX=67;
	public static final int HEX_LITERAL=68;
	public static final int IDCHAR=69;
	public static final int IDENT=70;
	public static final int IF=71;
	public static final int IFEX=72;
	public static final int IMP=73;
	public static final int IMPLICIT_IDENT=74;
	public static final int INCLUDE=75;
	public static final int INCLUDELDTS=76;
	public static final int INSEQUENTSTATE=77;
	public static final int INSTANTIATE_GENERIC=78;
	public static final int INVARIANTS=79;
	public static final int IN_TYPE=80;
	public static final int ISARRAY=81;
	public static final int ISARRAYLENGTH=82;
	public static final int ISCONSTANT=83;
	public static final int ISENUMTYPE=84;
	public static final int ISINDUCTVAR=85;
	public static final int ISLOCALVARIABLE=86;
	public static final int ISOBSERVER=87;
	public static final int ISREFERENCE=88;
	public static final int ISREFERENCEARRAY=89;
	public static final int ISSTATICFIELD=90;
	public static final int ISSUBTYPE=91;
	public static final int ISTHISREFERENCE=92;
	public static final int IS_ABSTRACT_OR_INTERFACE=93;
	public static final int JAVABLOCK=94;
	public static final int JAVASOURCE=95;
	public static final int KEYSETTINGS=96;
	public static final int LBRACE=97;
	public static final int LBRACKET=98;
	public static final int LEMMA=99;
	public static final int LESS=100;
	public static final int LESSEQUAL=101;
	public static final int LESS_DISPATCH=102;
	public static final int LETTER=103;
	public static final int LGUILLEMETS=104;
	public static final int LIMITED=105;
	public static final int LOCSET=106;
	public static final int LPAREN=107;
	public static final int METADISJOINT=108;
	public static final int MINUS=109;
	public static final int ML_COMMENT=110;
	public static final int MODALITY=111;
	public static final int MODALITYEND=112;
	public static final int MODALOPERATOR=113;
	public static final int MODIFIES=114;
	public static final int NEW=115;
	public static final int NEWLABEL=116;
	public static final int NODEFAULTCLASSES=117;
	public static final int NONINTERACTIVE=118;
	public static final int NOT=119;
	public static final int NOTFREEIN=120;
	public static final int NOT_=121;
	public static final int NOT_EQUALS=122;
	public static final int NUM_LITERAL=123;
	public static final int ONEOF=124;
	public static final int OPTIONSDECL=125;
	public static final int OR=126;
	public static final int PARALLEL=127;
	public static final int PERCENT=128;
	public static final int PLUS=129;
	public static final int PREDICATES=130;
	public static final int PRIMES=131;
	public static final int PRIMES_OR_CHARLITERAL=132;
	public static final int PROBLEM=133;
	public static final int PROFILE=134;
	public static final int PROGRAM=135;
	public static final int PROGRAMVARIABLES=136;
	public static final int PROOF=137;
	public static final int PROOFOBLIGATION=138;
	public static final int PROOFSCRIPT=139;
	public static final int PROXY=140;
	public static final int QUOTED_STRING_LITERAL=141;
	public static final int RBRACE=142;
	public static final int RBRACKET=143;
	public static final int REPLACEWITH=144;
	public static final int RGUILLEMETS=145;
	public static final int RPAREN=146;
	public static final int RULES=147;
	public static final int SAME=148;
	public static final int SAMEUPDATELEVEL=149;
	public static final int SCHEMAVAR=150;
	public static final int SCHEMAVARIABLES=151;
	public static final int SEMI=152;
	public static final int SEQ=153;
	public static final int SEQARROW=154;
	public static final int SIMPLIFY_IF_THEN_ELSE_UPDATE=155;
	public static final int SKOLEMFORMULA=156;
	public static final int SKOLEMTERM=157;
	public static final int SLASH=158;
	public static final int SL_COMMENT=159;
	public static final int SORTS=160;
	public static final int STAR=161;
	public static final int STATIC=162;
	public static final int STATICMETHODREFERENCE=163;
	public static final int STRICT=164;
	public static final int STRING_LITERAL=165;
	public static final int SUBST=166;
	public static final int SUCCEDENTPOLARITY=167;
	public static final int TERM=168;
	public static final int TERMLABEL=169;
	public static final int THEN=170;
	public static final int TILDE=171;
	public static final int TRANSFORMERS=172;
	public static final int TRIGGER=173;
	public static final int TRUE=174;
	public static final int TYPEOF=175;
	public static final int UNIQUE=176;
	public static final int UPDATE=177;
	public static final int UTF_EMPTY=178;
	public static final int UTF_IN=179;
	public static final int UTF_INTERSECT=180;
	public static final int UTF_PRECEDES=181;
	public static final int UTF_SETMINUS=182;
	public static final int UTF_SUBSET=183;
	public static final int UTF_UNION=184;
	public static final int VARCOND=185;
	public static final int VARIABLE=186;
	public static final int VARIABLES=187;
	public static final int VOCAB=188;
	public static final int WITHOPTIONS=189;
	public static final int WS=190;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public KeYParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public KeYParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return KeYParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g"; }



	    private static final Sort[] AN_ARRAY_OF_SORTS = new Sort[0];
	    private static final Term[] AN_ARRAY_OF_TERMS = new Term[0];

	    private static final int NORMAL_NONRIGID = 0;
	    private static final int LOCATION_MODIFIER = 1;

	    static HashMap<String, IProofFileParser.ProofElementID> prooflabel2tag = new LinkedHashMap<>(15);
	    static {
	         prooflabel2tag.put("branch", ProofElementID.BRANCH);
	         prooflabel2tag.put("rule", ProofElementID.RULE);
	         prooflabel2tag.put("term", ProofElementID.TERM);
	         prooflabel2tag.put("formula", ProofElementID.FORMULA);
	         prooflabel2tag.put("inst", ProofElementID.INSTANTIATION);
	         prooflabel2tag.put("ifseqformula", ProofElementID.ASSUMES_FORMULA_IN_SEQUENT);
	         prooflabel2tag.put("ifdirectformula", ProofElementID.ASSUMES_FORMULA_DIRECT);
	         prooflabel2tag.put("heur", ProofElementID.RULESET);
	         prooflabel2tag.put("builtin", ProofElementID.BUILT_IN_RULE);
	         prooflabel2tag.put("keyLog", ProofElementID.KeY_LOG);
	         prooflabel2tag.put("keyUser", ProofElementID.KeY_USER);
	         prooflabel2tag.put("keyVersion", ProofElementID.KeY_VERSION);
	         prooflabel2tag.put("keySettings", ProofElementID.KeY_SETTINGS);
	         prooflabel2tag.put("contract", ProofElementID.CONTRACT);
	         prooflabel2tag.put("ifInst", ProofElementID.ASSUMES_INST_BUILT_IN);     
	         prooflabel2tag.put("userinteraction", ProofElementID.USER_INTERACTION);
	         prooflabel2tag.put("newnames", ProofElementID.NEW_NAMES);
	         prooflabel2tag.put("autoModeTime", ProofElementID.AUTOMODE_TIME);  
	         prooflabel2tag.put("joinProc", ProofElementID.JOIN_PROCEDURE);
	         prooflabel2tag.put("nrJoinPartners", ProofElementID.NUMBER_JOIN_PARTNERS);
	         prooflabel2tag.put("distFormula", ProofElementID.JOIN_DIST_FORMULA);
	         prooflabel2tag.put("joinNode", ProofElementID.JOIN_NODE);
	         prooflabel2tag.put("joinId", ProofElementID.JOIN_ID);
	         prooflabel2tag.put("opengoal", ProofElementID.OPEN_GOAL);
	   }

	   private NamespaceSet nss;
	   private HashMap<String, String> category2Default = new LinkedHashMap<String, String>();
	   private boolean onlyWith=false;
	   private ImmutableSet<Choice> activatedChoices = DefaultImmutableSet.<Choice>nil();
	   private HashSet usedChoiceCategories = new LinkedHashSet();
	   private HashMap taclet2Builder;
	   private AbbrevMap scm;
	   
	   
	   private String filename;

	   // these variables are set if a file is read in step by
	   // step. This used when reading in LDTs because of cyclic
	   // dependencies.
	   private boolean skip_schemavariables;
	   private boolean skip_functions;
	   private boolean skip_transformers;
	   private boolean skip_predicates;
	   private boolean skip_sorts;
	   private boolean skip_rulesets;
	   private boolean skip_taclets;
	   private boolean parse_includes = false;
	   private Includes includes = new Includes();

	   private boolean schemaMode = false;
	   private ParserMode parserMode;

	   private String chooseContract = null;
	   private String proofObligation = null;
	   private String problemHeader = null;
	    
	   private int savedGuessing = -1;
	   
	   /*
	    counter variable for parser rules accessterm and heap_selection suffix:
	    - stores nesting depth of alpha::select(heap,o,f)-terms created via pretty syntax	(i.e. terms of the form: o.f)
	    - rule accessterm increases the counter
	    - rule heap_selection_suffix calls method heapSelectionSuffix(), which resets
	      the counter
	    - In case a term similar to o.f1.f2.f3.f4 would occur, this variable should have a value of 4.
	      The non-pretty syntax of this term would look similar to the following:
	          T::select(h, T::select(h, T::select(h, T::select(h, o, f1) , f2) , f3), f4)
	   */
	   protected int globalSelectNestingDepth = 0;

	   private int lineOffset=0;
	   private int colOffset=0;
	   private int stringLiteralLine=0; // HACK!

	   private Services services;
	   private JavaReader javaReader;

	   // if this is used then we can capture parts of the input for later use
	   private IProgramMethod pm = null;

	   private LinkedHashMap<RuleKey, Taclet> taclets = new LinkedHashMap<RuleKey, Taclet>();
	            
	   private ImmutableList<Contract> contracts = ImmutableSLList.nil();
	   private ImmutableSet<ClassInvariant> invs = DefaultImmutableSet.<ClassInvariant>nil();

	   private ParserConfig schemaConfig;
	   private ParserConfig normalConfig;
	    
	   // the current active config
	   private ParserConfig parserConfig;

	    private Term quantifiedArrayGuard = null;
	    
	    private String profileName;
	    
	    private TokenStream lexer;

	    /**
	     * Although the parser mode can be deduced from the particular constructor
	     * used we still require the caller to provide the parser mode explicitly, 
	     * so that the code is readable.
	     */

	   public KeYParser(ParserMode mode, TokenStream lexer, Services services) {
	       this(mode, lexer);
	   }

	   /* Most general constructor, should only be used internally */
	   private KeYParser(TokenStream lexer,
	                     Services services,
			     NamespaceSet nss,
			     ParserMode mode) {
	        this(lexer);
	        this.lexer = lexer;
	        this.parserMode = mode;
	 	this.services = services;
		this.nss = nss;
	    if (this.isTacletParser()) {
	        switchToSchemaMode();
	    } else {
	        switchToNormalMode();
	    }
	   }

	   /**
	    * Used to construct Term parser - for first-order terms
	    * and formulae.
	    */
	   public KeYParser(ParserMode mode,
	                    TokenStream lexer,
	                    JavaReader jr,
	                    Services services,
	                    NamespaceSet nss,
	                    AbbrevMap scm) {
	        this(lexer, services, nss, mode);
	        this.javaReader = jr;
	        this.scm = scm;
	   }


	    /** ONLY FOR TEST CASES.
	     * Used to construct Global Declaration Term parser - for first-order 
	     * terms and formulae. Variables in quantifiers are expected to be
	     * declared globally in the variable namespace.  This parser is used
	     * for test cases, where you want to know in advance which objects
	     * will represent bound variables.
	     */
	    public KeYParser(ParserMode mode, 
	                     TokenStream lexer,
			     Services services,
			     NamespaceSet nss) {
	        this(mode,
	             lexer,
	             new SchemaRecoder2KeY(services, nss),
	             services,
	             nss,
	             new LinkedHashMap());
	    }

	    /**
	     * Used to construct Taclet parser
	     */  
	    public KeYParser(ParserMode mode, 
	                     TokenStream lexer,
	                     SchemaJavaReader jr, 
	                     Services services,  
	                     NamespaceSet nss, 
	                     HashMap taclet2Builder) {
	        this(lexer, services, nss, mode);
	        switchToSchemaMode();
	        this.scm = new AbbrevMap();
	        this.javaReader = jr;
	        this.taclet2Builder = taclet2Builder;
	    }


	    /** 
	     * Used to construct Problem parser
	     */  
	    public KeYParser(ParserMode mode, 
	    		     TokenStream lexer, 
	                     ParserConfig schemaConfig,
	                     ParserConfig normalConfig, 
	                     HashMap taclet2Builder,
	                     ImmutableList<Taclet> taclets) { 
	        this(lexer, null, null, mode);
	        if (normalConfig!=null)
	        scm = new AbbrevMap();
	        this.schemaConfig = schemaConfig;
	        this.normalConfig = normalConfig;       
		switchToNormalMode();
	        this.taclet2Builder = taclet2Builder;
	        
	        if (taclets != null && !taclets.isEmpty()) {
	        	for (Taclet t : taclets) {
		  		this.taclets.put(new RuleKey(t), t);        	
	        	}
	        }
	        
	    }

	    public KeYParser(ParserMode mode, TokenStream lexer) {
	        this(lexer, null, null, mode);
	        scm = new AbbrevMap();
	        this.schemaConfig = null;
	        this.normalConfig = null;       
		switchToNormalMode();
	        this.taclet2Builder = null;
	        this.taclets = new LinkedHashMap<RuleKey, Taclet>();
	    }


	    /**
	     * Parses taclet from string.
	     */
	    public static Taclet parseTaclet(String s, Services services) {
	   	try {
		    KeYParserF p =
	                new KeYParserF(ParserMode.TACLET,
	                              new KeYLexerF(s,
	                                      "No file. KeYParser.parseTaclet(\n" + s + ")\n"),
	                              services,
	                              services.getNamespaces());
		    return p.taclet(DefaultImmutableSet.<Choice>nil(), false);
		} catch (Exception e) {
		    StringWriter sw = new StringWriter();
		    PrintWriter pw = new PrintWriter(sw);
		    e.printStackTrace(pw);
		    throw new RuntimeException("Exc while Parsing:\n" + sw );
		}
	    }

	    public String getSourceName() {
	    	if (super.getSourceName() == null) {
	    		return filename;
	    	}
	    	return super.getSourceName();
	    }

	    public String getChooseContract() {
	        return chooseContract;
	    }
	    
	    public String getProofObligation() {
	        return proofObligation;
	    }
	    public String getProblemHeader() {
	        return problemHeader;
	    }
	    
	    public String getProfileName() {
	      return profileName;
	    }
	    
	    private boolean isDeclParser() {
	        return parserMode == ParserMode.DECLARATION;
	    }

	    private boolean isTermParser() {
		return parserMode == ParserMode.TERM;
	    }

	    private boolean isGlobalDeclTermParser() {
		return parserMode == ParserMode.GLOBALDECL;
	    }

	    private boolean isTacletParser() {
		return parserMode == ParserMode.TACLET;
	    }

	    private boolean isProblemParser() {
		return parserMode == ParserMode.PROBLEM;
	    }

	    public void raiseException(RecognitionException ex) throws RecognitionException {
	        throw ex;
	    }

	    public ImmutableSet<Choice> getActivatedChoices(){
	        return activatedChoices;
	    }
	    
	    public Includes getIncludes(){
	        return includes;
	    }

	    public JavaInfo getJavaInfo() {
	        if(isProblemParser()) 
	          return parserConfig.javaInfo();
	    	if(getServices() != null)
	          return getServices().getJavaInfo();
		else
		  return null;
	    }

	    public Services getServices() {
	        if(isProblemParser()) 
	          return parserConfig.services();
	        return services;
	    }
	    
	     public TermFactory getTermFactory() {
	       return getServices().getTermFactory();
	    }

	    public NamespaceSet namespaces() {
	        if(isProblemParser()) 
	          return parserConfig.namespaces();
	        return nss;
	    }

	    private Namespace sorts() {
	        return namespaces().sorts();
	    }

	    private Namespace functions() {
	        return namespaces().functions();
	    }

	    private Namespace ruleSets() {
	        return namespaces().ruleSets();
	    }

	    private Namespace variables() {
	        return namespaces().variables();
	    }

	    private Namespace programVariables() {
	        return namespaces().programVariables();
	    }

	    private Namespace choices(){
	        return namespaces().choices();
	    }

	    public ImmutableList<Taclet> getTaclets(){
	        ImmutableList<Taclet> result = ImmutableSLList.<Taclet>nil();
		
	        /* maintain correct order for taclet lemma proofs */
		for (Taclet t : taclets.values()) {
	            result = result.prepend(t);
		}
		
	        // restore the order
	        result = result.reverse();
		
	        return result;
	    }

	    public ImmutableSet<Contract> getContracts(){
	        return DefaultImmutableSet.fromImmutableList(contracts);
	    }
	    
	    public ImmutableSet<ClassInvariant> getInvariants(){
	    	return invs;
	    }
	    
	    public HashMap<String, String> getCategory2Default(){
	        return category2Default;
	    }

	    private boolean inSchemaMode() {
		if(isTermParser() && schemaMode)
		   Debug.fail("In Term parser mode schemaMode cannot be true.");
		if(isTacletParser() && !schemaMode)
		   Debug.fail("In Taclet parser mode schemaMode should always be true.");
	        return schemaMode;
	    }

	    private void switchToSchemaMode() {
		if(!isTermParser()) {
	          schemaMode = true;
		  if(isProblemParser())
	            parserConfig = schemaConfig;    
		}
	    }

	    private void switchToNormalMode() {
		if(!isTermParser() && !isTacletParser()) {
	          schemaMode = false;      
		  if(isProblemParser())
	            parserConfig = normalConfig;
		}
	    }

	    private int getLine() {
	        Token token = ((TokenStream)input).LT(1);
	        return token.getLine();
	    }

	    private int getColumn() {
	        Token token = ((TokenStream)input).LT(1);
	        return token.getCharPositionInLine();
	    }

	    private void resetSkips() {
	       skip_schemavariables = false;
	       skip_functions       = false;
	       skip_transformers    = false;
	       skip_predicates      = false;
	       skip_sorts           = false;
	       skip_rulesets        = false;
	       skip_taclets         = false;
	    }

	    private void skipFuncs() {
	        skip_functions = true;
	    }

	    private void skipTransformers() {
	        skip_transformers = true;
	    }

	    private void skipPreds() {
	        skip_predicates = true;
	    }

	    private void skipTaclets() {
	        skip_taclets = true;
	    }

	    private void skipVars() {
	        skip_schemavariables = true;
	    }

	    private void skipSorts() {
	        skip_sorts = true;
	    }

	    private void skipRuleSets() {
	        skip_rulesets = true;
	    }
	    
	    private Named lookup(Name n) {
	       if(isProblemParser()) {
	          final Namespace[] lookups = {
	            schemaConfig.namespaces().programVariables(),
	            normalConfig.namespaces().variables(), 
	            schemaConfig.namespaces().variables(), 
	            normalConfig.namespaces().functions(), 
	            schemaConfig.namespaces().functions(), 
	          };
	          return doLookup(n,lookups);
	       } else {
	          final Namespace[] lookups = {
	              programVariables(), variables(),
	              functions()
	          };
	          return doLookup(n,lookups);
	       }
	    }

	    private Named doLookup(Name n, Namespace[] lookups) {
	        for (int i = 0; i<lookups.length; i++) {
	            if (lookups[i].lookup(n) != null) {
	                return lookups[i].lookup(n);
	            }
	        }
	        return null;    
	    }

	    private void addInclude(String filename, boolean relativePath, boolean ldt){
	        RuleSource source=null;
	        if (relativePath) {
	               filename = filename.replace('/', File.separatorChar); // Not required for Windows, but whatsoever
	               filename = filename.replace('\\', File.separatorChar); // Special handling for Linux
	               File parent = new File(getSourceName()).getParentFile();
	               File path = new File(parent, filename);
	               source = RuleSourceFactory.initRuleFile(path); 
	        } else {
	            source = RuleSourceFactory.fromDefaultLocation(filename+".key"); 
	        }
	        if (ldt) {
	            includes.putLDT(filename, source);
	        } else {
	            includes.put(filename, source);
	        }
	    }  

	    
	    public void parseSorts() throws RecognitionException/*,
	    				    TokenStreamException*/ {
	      resetSkips();
	      skipFuncs();
	      skipTransformers();
	      skipPreds();
	      skipRuleSets();
	      skipVars();
	      skipTaclets();
	      decls();
	      resetSkips();
	    }

	    public void parseFunctions() throws RecognitionException/*, 
	    					TokenStreamException*/ {
	      resetSkips();
	      skipSorts();
	      skipTransformers();
	      skipPreds();      
	      skipRuleSets();
	      skipVars();
	      skipTaclets(); 
	      decls();
	      resetSkips();
	    }

	    public void parsePredicates() throws RecognitionException/*, 
	    					 TokenStreamException*/ {
	      resetSkips();
	      skipSorts();
	      skipFuncs();
	      skipTransformers();
	      skipRuleSets();
	      skipVars();
	      skipTaclets();
	      decls();
	      resetSkips();
	    }

	    public void parseFuncAndPred() throws RecognitionException/*, 
	    					  TokenStreamException*/ {
	      resetSkips();
	      skipSorts();
	      skipTransformers();
	      skipRuleSets();
	      skipVars();
	      skipTaclets();
	      decls();
	      resetSkips();
	    }
	    
	    public void parseRuleSets() throws RecognitionException/*, 
	    				       TokenStreamException*/ {
	      resetSkips();
	      skipSorts();      
	      skipFuncs();
	      skipTransformers();
	      skipPreds();
	      skipVars();
	      skipTaclets();
	      decls();
	      resetSkips();
	    }
	    
	    public void parseVariables() throws RecognitionException/*, 
	                                        TokenStreamException*/ {
	      resetSkips();
	      skipSorts();
	      skipFuncs();
	      skipTransformers();
	      skipPreds();
	      skipRuleSets();      
	      skipTaclets();
	      decls();
	      resetSkips();
	    }  

	    public Term parseProblem() throws RecognitionException {
	        resetSkips();
	        skipSorts();
	        skipFuncs();
	        skipTransformers();
	        skipPreds();
	        skipRuleSets();
	        //skipVars();
	        skipTaclets();
	        Term result = problem();
	        // The parser may be ok if a totally unexpected token has turned up
	        // We better check that either the file has ended or a "\proof" follows.
	        if(input.LA(1) != EOF && input.LA(1) != PROOF && input.LA(1) != PROOFSCRIPT) {
	            throw new NoViableAltException("after problem", -1, -1, input);
	        }
	        return result;
	      }

	    public void parseIncludes() throws RecognitionException/*, 
	    				        TokenStreamException*/ {
	      parse_includes=true;
	      problem();
	    }

	    public void parseWith() throws RecognitionException/*, 
	    				   TokenStreamException*/ {
	      onlyWith=true;
	      problem();
	    }

	    public Taclet taclet(ImmutableSet<Choice> choices) throws RecognitionException {
	       return taclet(choices, false);
	    }

	    private void schema_var_decl(String name, 
	    				 Sort s, 
	    				 boolean makeVariableSV,
	            			 boolean makeSkolemTermSV,
	                                 boolean makeTermLabelSV,
	            			 SchemaVariableModifierSet mods) 
	            			 	throws AmbigiousDeclException {
	        if (!skip_schemavariables) {
	            SchemaVariable v;
	            if(s == Sort.FORMULA && !makeSkolemTermSV) {
	                v = SchemaVariableFactory.createFormulaSV(new Name(name), 
	                					  mods.rigid());
	            } else if(s == Sort.UPDATE) {
	                v = SchemaVariableFactory.createUpdateSV(new Name(name));
	            } else if(s instanceof ProgramSVSort) {
	                v = SchemaVariableFactory.createProgramSV(
	                		new ProgramElementName(name),
	                		(ProgramSVSort) s,
	                		mods.list());
	            } else {
	                if(makeVariableSV) {
	                    v = SchemaVariableFactory.createVariableSV
	                    (new Name(name), s);
	                } else if(makeSkolemTermSV) {
	                    v = SchemaVariableFactory.createSkolemTermSV(new Name(name), 
	                    				                 s);
	                } else if (makeTermLabelSV) {
	                    v = SchemaVariableFactory.createTermLabelSV(new Name(name));
	                } else { v = SchemaVariableFactory.createTermSV(
	                					new Name(name), 
	                					s, 
	                					mods.rigid(), 
	                					mods.strict());
	                }
	            }          

	            if (inSchemaMode()) {
	               if (variables().lookup(v.name()) != null) {
	            	 throw new AmbigiousDeclException(v.name().toString(), 
	            	 			          getSourceName(), 
	            	  				  getLine(), 
	            	  				  getColumn());
	               }
	               variables().add(v);
	            }
	        }
	    }

	    private Term toZNotation(String number, Namespace functions){    
		String s = number;
	        final boolean negative = (s.charAt(0) == '-');
		if (negative) {
		    s = number.substring(1, s.length());
		}
	        if(s.startsWith("0x")) {
		  try {
		    BigInteger bi = new BigInteger(s.substring(2),16);
		    s = bi.toString();
		  } catch(NumberFormatException nfe) {
		    Debug.fail("Not a hexadecimal constant (BTW, this should not have happened).");
		  }
		}
	        Term result = getTermFactory().createTerm((Function)functions.lookup(new Name("#")));

	        for(int i = 0; i<s.length(); i++){
	            result = getTermFactory().createTerm((Function)functions.lookup(new Name(s.substring(i,i+1))), result);
	        }

	       	if (negative) {
	  	    result = getTermFactory().createTerm((Function) functions.lookup(new Name("neglit")), result);
	        }
		return getTermFactory().createTerm
	            ((Function) functions.lookup(new Name("Z")), result); 
	    }

	    private String getTypeList(ImmutableList<ProgramVariable> vars) {
		StringBuffer result = new StringBuffer("");
		final Iterator<ProgramVariable> it = vars.iterator();
		while (it.hasNext()) {
	         result.append(it.next().getContainerType().getFullName());
	         if (it.hasNext()) result.append(", ");         
		}
		return result.toString();
	    }

	    private Operator getAttributeInPrefixSort(Sort prefixSort, String attributeName) 
	           throws RecognitionException/*SemanticException*/ {
	        final JavaInfo javaInfo = getJavaInfo();

	        Operator result = null;
	        
	        if (inSchemaMode()) {
	            // if we are currently reading taclets we look for schema variables first
	            result = (SchemaVariable)variables().lookup(new Name(attributeName));
	        }
	        
	        assert inSchemaMode() || result == null; 
	        if (result == null) {
	            
	            final boolean unambigousAttributeName = attributeName.indexOf(':') != -1;

	            if (unambigousAttributeName) {     
	                result = javaInfo.getAttribute(attributeName);
	            } else if(inSchemaMode() && attributeName.equals("length")) {
	                try {
	                    result = javaInfo.getArrayLength();
	                } catch(Exception ex) {
	                    raiseException
	                       (new KeYSemanticException(input, getSourceName(), ex));
	                }
	            } else if(attributeName.equals("<inv>")) {
	                // The invariant observer "<inv>" is implicit and 
	                // not part of the class declaration
	                // A special case is needed, hence.
	                result = javaInfo.getInvProgramVar();
	            } else {
	                if (inSchemaMode()) {
	                    semanticError("Either undeclared schema variable '" + 
	                                  attributeName + "' or a not fully qualified attribute in taclet.");
	                }
	                final KeYJavaType prefixKJT = javaInfo.getKeYJavaType(prefixSort);
	                if (prefixKJT == null) {
	                    semanticError("Could not find type '"+prefixSort+"'. Maybe mispelled or "+
	                        "you use an array or object type in a .key-file with missing " + 
	                        "\\javaSource section.");
	                }
	                // WATCHOUT why not in DECLARATION MODE	   
	                if(!isDeclParser()) {			      	
	                    ProgramVariable var = javaInfo.getCanonicalFieldProgramVariable(attributeName, prefixKJT);
	                    if (var == null) {
	                        LogicVariable logicalvar = (LogicVariable)namespaces().variables().lookup(attributeName);
	                        if(logicalvar == null) {
	                            semanticError("There is no attribute '" + attributeName + 
	                                "' declared in type '" + prefixSort + "' and no logical variable of that name.");
		                    } else {
		                        result = logicalvar;
	                        }
	                    } else {
	                        result = var;
	                    }
	                }
	            }
	        }

	        if ( result == null && !("length".equals(attributeName)) ) {
	            throw new NotDeclException (input, "Attribute ", attributeName);
	        }
	        return result;
	    }

	   
	    public Term createAttributeTerm(Term prefix, 
	    				    Operator attribute) throws RecognitionException/*SemanticException*/ {
	        Term result = prefix;

	        if (attribute instanceof SchemaVariable) {
	            if (!inSchemaMode()) {
	                semanticError("Schemavariables may only occur inside taclets.");
	            }
		    SchemaVariable sv = (SchemaVariable) attribute;            
	            if(sv.sort() instanceof ProgramSVSort 
	                || sv.sort() == AbstractTermTransformer.METASORT) {
	                semanticError("Cannot use schema variable " + sv + " as an attribute"); 
	            }
	            result = getServices().getTermBuilder().select(sv.sort(), 
	                                           getServices().getTermBuilder().getBaseHeap(), 
	                                           prefix, 
	                                           getTermFactory().createTerm(attribute));
	        } else {
		            if(attribute instanceof LogicVariable) {
		                Term attrTerm = getTermFactory().createTerm(attribute);
		                result = getServices().getTermBuilder().dot(Sort.ANY, result, attrTerm);
		            } else if(attribute instanceof ProgramConstant) {
	                result = getTermFactory().createTerm(attribute);
	            } else if(attribute == getServices().getJavaInfo().getArrayLength()) {
	                result = getServices().getTermBuilder().dotLength(result);
	            } else {
		            ProgramVariable pv = (ProgramVariable) attribute;
	            	Function fieldSymbol 
	            		= getServices().getTypeConverter()
	            		               .getHeapLDT()
	            		               .getFieldSymbolForPV((LocationVariable)pv, 
	            		                                    getServices());        
	            	if (pv.isStatic()){
	                    result = getServices().getTermBuilder().staticDot(pv.sort(), fieldSymbol);
	            	} else {            
	                    result = getServices().getTermBuilder().dot(pv.sort(), result, fieldSymbol);                
	            	}
	            }
	        }
	        return result;
	    }

	    private LogicVariable bindVar(String id, Sort s) {
	        if(isGlobalDeclTermParser())
	  	  Debug.fail("bindVar was called in Global Declaration Term parser.");
	        LogicVariable v=new LogicVariable(new Name(id), s);
	        namespaces().setVariables(variables().extended(v));
	        return v;
	    }

	    private void bindVar(LogicVariable v) {
	        if(isGlobalDeclTermParser())
	  	  Debug.fail("bindVar was called in Global Declaration Term parser.");
	        namespaces().setVariables(variables().extended(v));
	    }

	    private void bindVar() {
	        if(isGlobalDeclTermParser())
	  	  Debug.fail("bindVar was called in Global Declaration Term parser.");
	        namespaces().setVariables ( new Namespace ( variables () ) );
	    }

	  private KeYJavaType getTypeByClassName(String s) 
	    throws RecognitionException/*KeYSemanticException*/ {
	        KeYJavaType kjt = null;              
	        try {
		    kjt=getJavaInfo().getTypeByClassName(s, null);
	        } catch(RuntimeException e){
	            return null;
	        }

	        return kjt;
	    }
	    
	    private boolean isPackage(String name){
	        try {   
	            return getJavaInfo().isPackage(name);
	        } catch(RuntimeException e){        
	            // may be thrown in cases of invalid java identifiers
	            return false;
	        } 
	    }
	    
	    protected boolean isHeapTerm(Term term) {
	        return term != null && term.sort() == 
	            getServices().getTypeConverter().getHeapLDT().targetSort();
	    }

	    private boolean isSequenceTerm(Term reference) {
	        return reference != null && reference.sort().name().equals(SeqLDT.NAME);
	    }

	    private boolean isIntTerm(Term reference) {
	        return reference.sort().name().equals(IntegerLDT.NAME);
	    }
	    
	    private void unbindVars(Namespace orig) {
	        if(isGlobalDeclTermParser()) {
	            Debug.fail("unbindVars was called in Global Declaration Term parser.");
	        }
	        namespaces().setVariables(orig);
	    }


	    private Set progVars(JavaBlock jb) {
		if(isGlobalDeclTermParser()) {
	  	  ProgramVariableCollector pvc
		      = new ProgramVariableCollector(jb.program(), getServices());
	          pvc.start();
	          return pvc.result();
	        }else 
	  	  if(!isDeclParser()) {
	            if ((isTermParser() || isProblemParser()) && jb.isEmpty()) {
	              return new LinkedHashSet();
	            }   
	            DeclarationProgramVariableCollector pvc
	               = new DeclarationProgramVariableCollector(jb.program(), getServices());
	            pvc.start();
	            return pvc.result();
	          }
		Debug.fail("KeYParser.progVars(): this statement should not be reachable.");
		return null;
	    }

	    private Term termForParsedVariable(ParsableVariable v) 
	        throws RecognitionException/*SemanticException*/ {
	        if ( v instanceof LogicVariable || v instanceof ProgramVariable) {
	            return getTermFactory().createTerm(v);
	        } else {
		  if(isGlobalDeclTermParser())
			semanticError(v + " is not a logic variable");          
	  	  if(isTermParser())
	               semanticError(v + " is an unknown kind of variable.");
		  if (inSchemaMode() && v instanceof SchemaVariable ) {
	               return getTermFactory().createTerm(v);
	          } else {
		       String errorMessage = "";
	               if ( inSchemaMode() ) {
	       	         errorMessage += v +" is not a program, logic or schema variable";
	               } else {
	                 errorMessage += v +" is not a logic or program variable";
	               }
	               semanticError(errorMessage);
	            }  
		}
		return null;
	    }
	    
	    private PairOfStringAndJavaBlock getJavaBlock(Token t) throws RecognitionException/*SemanticException*/ {
		PairOfStringAndJavaBlock sjb = new PairOfStringAndJavaBlock();
	        String s=t.getText();
		int index = s.indexOf("\n");
		sjb.opName = s.substring(0,index);
		s = s.substring(index+1);
		Debug.out("Modal operator name passed to getJavaBlock: ",sjb.opName);
		Debug.out("Java block passed to getJavaBlock: ", s);

	        JavaReader jr = javaReader;

		try {
	            if (inSchemaMode()) {
	                if(isProblemParser()) // Alt jr==null;
	                jr = new SchemaRecoder2KeY(parserConfig.services(), 
	                    parserConfig.namespaces());
	                ((SchemaJavaReader)jr).setSVNamespace(variables());
	            } else{
	                if(isProblemParser()) // Alt jr==null;
	                jr = new Recoder2KeY(parserConfig.services(), 
	                    parserConfig.namespaces());
	            }

	            if (inSchemaMode() || isGlobalDeclTermParser()) {
	                sjb.javaBlock = jr.readBlockWithEmptyContext(s);
	            }else{
	                sjb.javaBlock = jr.readBlockWithProgramVariables(programVariables(), s);
	            }
	        } catch (de.uka.ilkd.key.java.PosConvertException e) {
	            lineOffset=e.getLine()-1;
	            colOffset=e.getColumn()+1;
	            throw new RecognitionException(input);
	            //throw new JavaParserException(e.getMessage(), t.getText(), 
	            //    getSourceName(), t.getLine(), t.getCharPositionInLine(), lineOffset, colOffset);
	        } catch (de.uka.ilkd.key.java.ConvertException e) { 
	            if (e.parseException()!=null
	            &&  e.parseException().currentToken != null
	            &&  e.parseException().currentToken.next != null) {               
	                lineOffset=e.parseException().currentToken.next.beginLine;               
	                colOffset=e.parseException().currentToken.next.beginColumn;
	                e.parseException().currentToken.next.beginLine=getLine()-1;
	                e.parseException().currentToken.next.beginColumn=getColumn();
	                throw new RecognitionException(input);
	                //throw new JavaParserException(e.getMessage(), t.getText(), getSourceName(), t.getLine(), t.getCharPositionInLine(), -1, -1);  // row/columns already in text
	            }       
	            if (e.proofJavaException()!=null
	            &&  e.proofJavaException().currentToken != null
	            &&  e.proofJavaException().currentToken.next != null) {      
	                lineOffset = e.proofJavaException().currentToken.next.beginLine-1;
	                colOffset=e.proofJavaException().currentToken.next.beginColumn;
	                e.proofJavaException().currentToken.next.beginLine=getLine();
	                e.proofJavaException().currentToken.next.beginColumn =getColumn();
	                 throw new RecognitionException(input);
	                 //throw  new JavaParserException(e.getMessage(), t.getText(), getSourceName(), t.getLine(), t.getCharPositionInLine(), lineOffset, colOffset); 
	                            
	            }   
	            throw new RecognitionException(input);
	            //throw new JavaParserException(e.getMessage(), t.getText(), getSourceName(), t.getLine(), t.getCharPositionInLine());
	        } 
	        return sjb;
	    }

	    /**
	     * looks up and returns the sort of the given name or null if none has been found.
	     * If the sort is not found for the first time, the name is expanded with "java.lang." 
	     * and the look up restarts
	     */
	     private Sort lookupSort(String name) throws RecognitionException/*SemanticException*/ {
		Sort result = (Sort) sorts().lookup(new Name(name));
		if (result == null) {
		    if(name.equals(NullSort.NAME.toString())) {
		        Sort objectSort 
		        	= (Sort) sorts().lookup(new Name("java.lang.Object"));
		        if(objectSort == null) {
		            semanticError("Null sort cannot be used before "
		                          + "java.lang.Object is declared");
		        }
		        result = new NullSort(objectSort);
		        sorts().add(result);
		    } else {
	  	    	result = (Sort) sorts().lookup(new Name("java.lang."+name));
	  	    }
		}
		return result;
	     }
	     

	    /** looks up a function, (program) variable or static query of the 
	     * given name varfunc_id and the argument terms args in the namespaces 
	     * and java info. 
	     * @param varfunc_name the String with the symbols name
	     * @param args is null iff no argument list is given, for instance `f', 
	     * and is an array of size zero, if an empty argument list was given,
	     * for instance `f()'.
	     */
	    private Operator lookupVarfuncId(String varfunc_name, Term[] args) 
	        throws RecognitionException/*NotDeclException, SemanticException*/ {

	        // case 1: variable
	        Operator v = (Operator) variables().lookup(new Name(varfunc_name));
	        if (v != null && (args == null || (inSchemaMode() && v instanceof ModalOperatorSV))) {
	            return v;
	        }

	        // case 2: program variable
	        v = (Operator) programVariables().lookup
	            (new ProgramElementName(varfunc_name));
	        if (v != null && args==null) {
	            return v;
	        }
	        
	        // case 3: function
	        v = (Operator) functions().lookup(new Name(varfunc_name));
	        if (v != null) { // we allow both args==null (e.g. `c')
	                         // and args.length=0 (e.g. 'c())' here 
	            return v;
	        }

	        
	        // case 4: instantiation of sort depending function
	        int separatorIndex = varfunc_name.indexOf("::"); 
	        if (separatorIndex > 0) {
	            String sortName = varfunc_name.substring(0, separatorIndex);
	            String baseName = varfunc_name.substring(separatorIndex + 2);
	            Sort sort = lookupSort(sortName);
	            SortDependingFunction firstInstance 
	            	= SortDependingFunction.getFirstInstance(new Name(baseName), 
	            					         getServices());
	                        
	            if(sort != null && firstInstance != null) {
	                v = firstInstance.getInstanceFor(sort, getServices());
	                if(v != null) {
	                    return v;
	                }
	            } 
	        }
	        
	        // not found
	        if (args==null) {
	            throw new NotDeclException
	                (input, "(program) variable or constant", varfunc_name);
	        } else {
	            throw new NotDeclException
	                (input, "function or static query", varfunc_name);
	        }
	    }

	    private boolean isStaticAttribute() throws RecognitionException/*KeYSemanticException*/ {	
	        if(inSchemaMode()) return false;
	        final JavaInfo javaInfo = getJavaInfo();
	        KeYJavaType kjt = null;
		boolean result = false;
	//        try {
	            int n = 1; 
	            StringBuffer className = new StringBuffer(input.LT(n).getText());
		    while (isPackage(className.toString()) || input.LA(n+2)==NUM_LITERAL || 
		    		(input.LT(n+2)!=null && input.LT(n+2).getText()!=null && 
		    		input.LT(n+2).getText().length() > 0 && input.LT(n+2).getText().charAt(0)<='Z' && input.LT(n+2).getText().charAt(0)>='A' && 
		    		(input.LT(n+2).getText().length()==1 || 
		    		 input.LT(n+2).getText().charAt(1)<='z' && input.LT(n+2).getText().charAt(1)>='a'))){  	   
	                if (input.LA(n+1) != DOT && input.LA(n+1) != EMPTYBRACKETS) return false;
	                // maybe still an attribute starting with an uppercase letter followed by a lowercase letter
	                if(getTypeByClassName(className.toString()) != null){
	                    ProgramVariable maybeAttr = 
	                    javaInfo.getAttribute(input.LT(n+2).getText(), getTypeByClassName(className.toString()));
	                    if(maybeAttr!=null){
	                        return true;
	                    }
	                }
	                className.append(".");	       
	                className.append(input.LT(n+2).getText());
	                n+=2;
		    }	
	        while (input.LA(n+1) == EMPTYBRACKETS) {
	                className.append("[]");
	                n++;
	        }
		kjt = getTypeByClassName(className.toString());

		    if (kjt != null) { 
			// works as we do not have inner classes
			if (input.LA(n+1) == DOT) {
			    final ProgramVariable pv = 
			      javaInfo.getAttribute(input.LT(n+2).getText(), kjt);
			    result = (pv != null && pv.isStatic());		
			}    
		    }else{
		     result = false;
		    }
	//	} catch (antlr.TokenStreamException tse) {
	//	    // System.out.println("an exception occured"+tse);
	//	    result = false;
	//	}
		if(result && state.backtracking > 0) {
	           savedGuessing = state.backtracking;
		   state.backtracking = 0;
		}
		return result;
	    }

	    private boolean isTermTransformer() /*throws TokenStreamException*/ {  
	    if((input.LA(1) == IDENT &&
	         AbstractTermTransformer.name2metaop(input.LT(1).getText())!=null)
	       || input.LA(1) == IN_TYPE)
	      return true;
	    return false;
	    }

	    private boolean isStaticQuery() throws RecognitionException/*KeYSemanticException*/ {   
	    if(inSchemaMode()) return false;
	    final JavaInfo javaInfo = getJavaInfo();
	    boolean result = false;
	//    try {
	        int n = 1; 
	        KeYJavaType kjt = null;
	        StringBuffer className = new StringBuffer(input.LT(n).getText());
	        while (isPackage(className.toString())) {          
	          if (input.LA(n+1) != DOT) return false;
	          className.append(".");         
	          className.append(input.LT(n+2).getText());
	          n+=2;
	        }   
	        kjt = getTypeByClassName(className.toString());
	        if (kjt != null) { 
	           if (input.LA(n+1) == DOT && input.LA(n+3) == LPAREN) {
	               Iterator<IProgramMethod> it = javaInfo.getAllProgramMethods(kjt).iterator();
	               while(it.hasNext()) {
	                 final IProgramMethod pm = it.next();
	                 final String name = kjt.getFullName()+"::"+input.LT(n+2).getText();                 
	                 if(pm != null && pm.isStatic() && pm.name().toString().equals(name) ) {
	                   result = true;
			   break;
			 }
	               }
	           }   
	        }
	//    } catch (antlr.TokenStreamException tse) {
	//        result = false;
	//    }
	    if(result && state.backtracking > 0) {
	      savedGuessing = state.backtracking;
	      state.backtracking = 0;
	    }
	    return result;
	    }


	    private TacletBuilder createTacletBuilderFor
	        (Object find, int applicationRestriction) 
	        throws RecognitionException/*InvalidFindException*/ {
	        if ( applicationRestriction != RewriteTaclet.NONE &&
	             applicationRestriction != RewriteTaclet.IN_SEQUENT_STATE &&
	             !( find instanceof Term ) ) {
	            String mod = "";
	            if ((applicationRestriction & RewriteTaclet.SAME_UPDATE_LEVEL) != 0) {
	                mod = "\"\\sameUpdateLevel\"";
	            }
	            if ((applicationRestriction & RewriteTaclet.ANTECEDENT_POLARITY) != 0) {
	                if (mod != "") mod += " and ";
	                mod += "\"\\antecedentPolarity\""; 
	            }
	            if ((applicationRestriction & RewriteTaclet.SUCCEDENT_POLARITY) != 0) {
	                if (mod != "") mod += " and ";
	                mod += "\"\\succedentPolarity\"";
	            }
	            if (mod == "") {
	                mod = "Application restrictions";               
	            }
	            
	            throw new InvalidFindException
	                ( mod +  " may only be used for rewrite taclets:" + find,
	                 getSourceName(), getLine(), getColumn());
	        }
	        if ( find == null ) {
	            return new NoFindTacletBuilder();
	        } else if ( find instanceof Term ) {
	            return new RewriteTacletBuilder().setFind((Term)find)
	                .setApplicationRestriction(applicationRestriction);
	        } else if ( find instanceof Sequent ) {
	            Sequent findSeq = (Sequent) find;
	            if ( findSeq.isEmpty() ) {
	                return new NoFindTacletBuilder();
	            } else if (   findSeq.antecedent().size() == 1
	                          && findSeq.succedent().size() == 0 ) {
	                Term findFma = findSeq.antecedent().get(0).formula();
	                AntecTacletBuilder b = new AntecTacletBuilder();
	                b.setFind(findFma);
	                b.setIgnoreTopLevelUpdates((applicationRestriction & RewriteTaclet.IN_SEQUENT_STATE) == 0);
	                return b;
	            } else if (   findSeq.antecedent().size() == 0
	                          && findSeq.succedent().size() == 1 ) {
	                Term findFma = findSeq.succedent().get(0).formula();
	                SuccTacletBuilder b = new SuccTacletBuilder();
	                b.setFind(findFma);
	                b.setIgnoreTopLevelUpdates((applicationRestriction & RewriteTaclet.IN_SEQUENT_STATE) == 0);
	                return b;
	            } else {
	                throw new InvalidFindException
	                    ("Unknown find-sequent (perhaps null?):"+findSeq,
	                     getSourceName(), getLine(), getColumn());
	            }
	        } else {
	            throw new InvalidFindException
	                    ("Unknown find class type: " + find.getClass().getName(),
	                     getSourceName(), getLine(), getColumn());
	        }
	    }       

	    private void addGoalTemplate(TacletBuilder b,
	                                 String id,
	                                 Object rwObj,
	                                 Sequent addSeq,
	                                 ImmutableList<Taclet> addRList,
	                                 ImmutableSet<SchemaVariable> pvs,
	                                 ImmutableSet<Choice> soc) 
	        throws RecognitionException/*SemanticException*/
	        {
	            TacletGoalTemplate gt = null;
	            if ( rwObj == null ) {
	                // there is no replacewith, so we take
	                gt = new TacletGoalTemplate(addSeq,
	                                            addRList,
	                                            pvs);
	            } else {
	                if ( b instanceof NoFindTacletBuilder ) {
	                    // there is a replacewith without a find.
	                    throw new RecognitionException(input);
	                        //new UnfittingReplacewithException
	                        //("Replacewith without find", getSourceName(),
	                        // getLine(), getColumn());
	                } else if ( b instanceof SuccTacletBuilder
	                            || b instanceof AntecTacletBuilder ) {
	                    if ( rwObj instanceof Sequent ) {
	                        gt = new AntecSuccTacletGoalTemplate(addSeq,
	                                                             addRList,
	                                                             (Sequent)rwObj,
	                                                             pvs);  
	                    } else {
	                        throw new UnfittingReplacewithException
	                            ("Replacewith in a Antec-or SuccTaclet has "+
	                             "to contain a sequent (not a term)", 
	                             getSourceName(), getLine(), getColumn());
	                    }
	                } else if ( b instanceof RewriteTacletBuilder ) {
	                    if ( rwObj instanceof Term ) {
	                        gt = new RewriteTacletGoalTemplate(addSeq,
	                                                           addRList,
	                                                           (Term)rwObj,
	                                                           pvs);  
	                    } else {
	                        throw new UnfittingReplacewithException
	                            ("Replacewith in a RewriteTaclet has "+
	                             "to contain a term (not a sequent)", 
	                             getSourceName(), getLine(), getColumn());
	                    }
	                }
	            }
	            gt.setName(id); 
	            b.addTacletGoalTemplate(gt);
	            if(soc != null) b.addGoal2ChoicesMapping(gt,soc);
	        }
	     
	    public void testLiteral(String l1, String l2)
	    throws RecognitionException/*KeYSemanticException*/
	    {
	     if (!l1.equals(l2)){
	        semanticError("Expecting '"+l1+"', found '"+l2+"'.");
		};
	    }

	    /** parses a problem but without reading the declarations of
	     * sorts, functions and predicates. These have to be given
	     * explicitly.
	     * the rule sets of the current problem file will be added 
	     */ 
	    public Term parseTacletsAndProblem() 
	    throws RecognitionException/*, antlr.TokenStreamException*/{
	        resetSkips();
	        skipSorts(); skipFuncs(); skipPreds();    
	        return problem();
	    }

	    /**
	     * returns the ProgramMethod parsed in the jml_specifications section.
	     */
	    public IProgramMethod getProgramMethod(){
	        return pm;
	    }

	    public void addFunction(Function f) {
	        functions().add(f);
	    }
	    
	    private ImmutableSet<Modality> lookupOperatorSV(String opName, ImmutableSet<Modality> modalities) 
	    		throws RecognitionException/*KeYSemanticException*/ {
		ModalOperatorSV osv = (ModalOperatorSV)variables().lookup(new Name(opName));
	        if(osv == null) {
		    semanticError("Schema variable "+opName+" not defined.");
		}
	        modalities = modalities.union(osv.getModalities());
	        return modalities;
	    } 
	    
	    private ImmutableSet<Modality> opSVHelper(String opName, 
	                                     ImmutableSet<Modality> modalities) 
	        	throws RecognitionException/*KeYSemanticException*/ {
	        if(opName.charAt(0) == '#') {
	            return lookupOperatorSV(opName, modalities);           
	        } else {
		    switchToNormalMode();
	       	    Modality m = Modality.getModality(opName);
		    switchToSchemaMode();
	            if(m == null) {
	                semanticError("Unrecognised operator: "+opName);
	            }
	            modalities = modalities.add(m);
	       }
	       return modalities;
	    }

	    protected void semanticError(String message) throws RecognitionException {
	      throw new KeYSemanticException(input, getSourceName(), message);
	    }

	    private static class PairOfStringAndJavaBlock {
	      String opName;
	      JavaBlock javaBlock;
	    }
	    
	    private static boolean isSelectTerm(Term term) {
	        return term.op().name().toString().endsWith("::select") && term.arity() == 3;
	    }

	    private boolean isImplicitHeap(Term t) {
	        return getServices().getTermBuilder().getBaseHeap().equals(t);
	    }

	    // This is used for testing in TestTermParserHeap.java
	    public static final String NO_HEAP_EXPRESSION_BEFORE_AT_EXCEPTION_MESSAGE
	            = "Expecting select term before '@', not: ";

	    private Term replaceHeap(Term term, Term heap, int depth) throws RecognitionException {
	        if (depth > 0) {

	            if (isSelectTerm(term)) {

	                if (!isImplicitHeap(term.sub(0))) {
	                    semanticError("Expecting program variable heap as first argument of: " + term);
	                }

	                Term[] params = new Term[]{heap, replaceHeap(term.sub(1), heap, depth - 1), term.sub(2)};
	                return (getServices().getTermFactory().createTerm(term.op(), params));

	            } else if (term.op() instanceof ObserverFunction) {
	                if (!isImplicitHeap(term.sub(0))) {
	                    semanticError("Expecting program variable heap as first argument of: " + term);
	                }

	                Term[] params = new Term[term.arity()];
	                params[0] = heap;
	                params[1] = replaceHeap(term.sub(1), heap, depth - 1);
	                for (int i = 2; i < params.length; i++) {
	                    params[i] = term.sub(i);
	                }

	                return (getServices().getTermFactory().createTerm(term.op(), params));

	            } else {
	                semanticError(NO_HEAP_EXPRESSION_BEFORE_AT_EXCEPTION_MESSAGE + term);
	                throw new RecognitionException();
	            }

	        } else {
	            return term;
	        }
	    }

	    /*
	     * Replace standard heap by another heap in an observer function.
	     */
	    protected Term heapSelectionSuffix(Term term, Term heap) throws RecognitionException {

	        if (!isHeapTerm(heap)) {
	            semanticError("Expecting term of type Heap but sort is " + heap.sort()
	                    + " for term: " + term);
	        }

	        Term result = replaceHeap(term, heap, globalSelectNestingDepth);

	        // reset globalSelectNestingDepth
	        globalSelectNestingDepth = 0;

	        return result;
	    }

	    private String unescapeString(String string) {
	      char[] chars = string.toCharArray();
	      StringBuilder sb = new StringBuilder();
	      for(int i = 0; i < chars.length; i++) {
	         if(chars[i] == '\\' && i < chars.length - 1) {
	          switch(chars[++i]) {
	            case 'n': sb.append("\n"); break;
	            case 'f': sb.append("\f"); break;
	            case 'r': sb.append("\r"); break;
	            case 't': sb.append("\t"); break;
	            case 'b': sb.append("\b"); break;
	            case ':': sb.append("\\:"); break; // this is so in KeY ...
	            default: sb.append(chars[i]); break; // this more relaxed than before, \a becomes a ...
	          }
	        } else {
	          sb.append(chars[i]);
	        }
	      }
	      return sb.toString();
	    }

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




	// $ANTLR start "top"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1560:1: top : a= formula ;
	public final void top() throws RecognitionException {
		Term a =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1560:5: (a= formula )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1560:7: a= formula
			{
			pushFollow(FOLLOW_formula_in_top87);
			a=formula();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {	 
			   Debug.fail("KeYParser: top() should not be called. Ever.");	 
			}
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "top"



	// $ANTLR start "decls"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1565:1: decls : ( one_include_statement )* ( options_choice )? ({...}? => option_decls |{...}? => sort_decls |{...}? => prog_var_decls |{...}? => schema_var_decls | pred_decls | func_decls | transform_decls |{...}? => ruleset_decls )* ;
	public final void decls() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1565:7: ( ( one_include_statement )* ( options_choice )? ({...}? => option_decls |{...}? => sort_decls |{...}? => prog_var_decls |{...}? => schema_var_decls | pred_decls | func_decls | transform_decls |{...}? => ruleset_decls )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1566:9: ( one_include_statement )* ( options_choice )? ({...}? => option_decls |{...}? => sort_decls |{...}? => prog_var_decls |{...}? => schema_var_decls | pred_decls | func_decls | transform_decls |{...}? => ruleset_decls )*
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1566:9: ( one_include_statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= INCLUDE && LA1_0 <= INCLUDELDTS)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1566:10: one_include_statement
					{
					pushFollow(FOLLOW_one_include_statement_in_decls110);
					one_include_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop1;
				}
			}

			if ( state.backtracking==0 ) {
			           if(parse_includes) return;
			           activatedChoices = DefaultImmutableSet.<Choice>nil();  
				}
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1570:9: ( options_choice )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WITHOPTIONS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1570:10: options_choice
					{
					pushFollow(FOLLOW_options_choice_in_decls125);
					options_choice();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1571:9: ({...}? => option_decls |{...}? => sort_decls |{...}? => prog_var_decls |{...}? => schema_var_decls | pred_decls | func_decls | transform_decls |{...}? => ruleset_decls )*
			loop3:
			while (true) {
				int alt3=9;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==OPTIONSDECL) && ((!onlyWith))) {
					alt3=1;
				}
				else if ( (LA3_0==SORTS) && ((!onlyWith))) {
					alt3=2;
				}
				else if ( (LA3_0==PROGRAMVARIABLES) && ((!onlyWith))) {
					alt3=3;
				}
				else if ( (LA3_0==SCHEMAVARIABLES) && ((!onlyWith))) {
					alt3=4;
				}
				else if ( (LA3_0==PREDICATES) ) {
					alt3=5;
				}
				else if ( (LA3_0==FUNCTIONS) ) {
					alt3=6;
				}
				else if ( (LA3_0==TRANSFORMERS) ) {
					alt3=7;
				}
				else if ( (LA3_0==HEURISTICSDECL) && ((!onlyWith))) {
					alt3=8;
				}

				switch (alt3) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1572:13: {...}? => option_decls
					{
					if ( !((!onlyWith)) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "decls", "!onlyWith");
					}
					pushFollow(FOLLOW_option_decls_in_decls155);
					option_decls();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1574:13: {...}? => sort_decls
					{
					if ( !((!onlyWith)) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "decls", "!onlyWith");
					}
					pushFollow(FOLLOW_sort_decls_in_decls186);
					sort_decls();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1576:13: {...}? => prog_var_decls
					{
					if ( !((!onlyWith)) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "decls", "!onlyWith");
					}
					pushFollow(FOLLOW_prog_var_decls_in_decls213);
					prog_var_decls();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1578:13: {...}? => schema_var_decls
					{
					if ( !((!onlyWith)) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "decls", "!onlyWith");
					}
					pushFollow(FOLLOW_schema_var_decls_in_decls240);
					schema_var_decls();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1580:13: pred_decls
					{
					pushFollow(FOLLOW_pred_decls_in_decls264);
					pred_decls();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1582:13: func_decls
					{
					pushFollow(FOLLOW_func_decls_in_decls288);
					func_decls();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1584:13: transform_decls
					{
					pushFollow(FOLLOW_transform_decls_in_decls312);
					transform_decls();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1586:13: {...}? => ruleset_decls
					{
					if ( !((!onlyWith)) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "decls", "!onlyWith");
					}
					pushFollow(FOLLOW_ruleset_decls_in_decls339);
					ruleset_decls();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decls"



	// $ANTLR start "one_include_statement"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1590:1: one_include_statement : ( INCLUDE | ( INCLUDELDTS ) ) one_include[ldts] ( COMMA one_include[ldts] )* SEMI ;
	public final void one_include_statement() throws RecognitionException {

		   boolean ldts = false;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1594:5: ( ( INCLUDE | ( INCLUDELDTS ) ) one_include[ldts] ( COMMA one_include[ldts] )* SEMI )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1595:5: ( INCLUDE | ( INCLUDELDTS ) ) one_include[ldts] ( COMMA one_include[ldts] )* SEMI
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1595:5: ( INCLUDE | ( INCLUDELDTS ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INCLUDE) ) {
				alt4=1;
			}
			else if ( (LA4_0==INCLUDELDTS) ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1595:6: INCLUDE
					{
					match(input,INCLUDE,FOLLOW_INCLUDE_in_one_include_statement373); if (state.failed) return;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1595:16: ( INCLUDELDTS )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1595:16: ( INCLUDELDTS )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1595:17: INCLUDELDTS
					{
					match(input,INCLUDELDTS,FOLLOW_INCLUDELDTS_in_one_include_statement378); if (state.failed) return;
					if ( state.backtracking==0 ) {ldts = true; }
					}

					}
					break;

			}

			pushFollow(FOLLOW_one_include_in_one_include_statement388);
			one_include(ldts);
			state._fsp--;
			if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1596:23: ( COMMA one_include[ldts] )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1596:24: COMMA one_include[ldts]
					{
					match(input,COMMA,FOLLOW_COMMA_in_one_include_statement392); if (state.failed) return;
					pushFollow(FOLLOW_one_include_in_one_include_statement394);
					one_include(ldts);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,SEMI,FOLLOW_SEMI_in_one_include_statement399); if (state.failed) return;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "one_include_statement"



	// $ANTLR start "one_include"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1599:1: one_include[boolean ldt] : (absfile= IDENT |relfile= string_literal ) ;
	public final void one_include(boolean ldt) throws RecognitionException {
		Token absfile=null;
		String relfile =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1600:9: ( (absfile= IDENT |relfile= string_literal ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1601:9: (absfile= IDENT |relfile= string_literal )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1601:9: (absfile= IDENT |relfile= string_literal )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IDENT) ) {
				alt6=1;
			}
			else if ( (LA6_0==STRING_LITERAL) ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1601:10: absfile= IDENT
					{
					absfile=(Token)match(input,IDENT,FOLLOW_IDENT_in_one_include421); if (state.failed) return;
					if ( state.backtracking==0 ) { 
					                if(parse_includes){
					                    addInclude(absfile.getText(),false,ldt);
					                }
					            }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1606:11: relfile= string_literal
					{
					pushFollow(FOLLOW_string_literal_in_one_include438);
					relfile=string_literal();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { 
					                if(parse_includes){
					                    addInclude(relfile, true,ldt);
					                }
					            }
					}
					break;

			}

			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "one_include"



	// $ANTLR start "options_choice"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1613:1: options_choice : ( WITHOPTIONS activated_choice ( COMMA activated_choice )* SEMI ) ;
	public final void options_choice() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1614:3: ( ( WITHOPTIONS activated_choice ( COMMA activated_choice )* SEMI ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1615:3: ( WITHOPTIONS activated_choice ( COMMA activated_choice )* SEMI )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1615:3: ( WITHOPTIONS activated_choice ( COMMA activated_choice )* SEMI )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1615:4: WITHOPTIONS activated_choice ( COMMA activated_choice )* SEMI
			{
			match(input,WITHOPTIONS,FOLLOW_WITHOPTIONS_in_options_choice457); if (state.failed) return;
			pushFollow(FOLLOW_activated_choice_in_options_choice459);
			activated_choice();
			state._fsp--;
			if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1615:33: ( COMMA activated_choice )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1615:34: COMMA activated_choice
					{
					match(input,COMMA,FOLLOW_COMMA_in_options_choice462); if (state.failed) return;
					pushFollow(FOLLOW_activated_choice_in_options_choice464);
					activated_choice();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop7;
				}
			}

			match(input,SEMI,FOLLOW_SEMI_in_options_choice468); if (state.failed) return;
			}

			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "options_choice"



	// $ANTLR start "activated_choice"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1618:1: activated_choice : cat= IDENT COLON choice_= IDENT ;
	public final void activated_choice() throws RecognitionException {
		Token cat=null;
		Token choice_=null;


		    String name;
		    Choice c;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1621:2: (cat= IDENT COLON choice_= IDENT )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1622:9: cat= IDENT COLON choice_= IDENT
			{
			cat=(Token)match(input,IDENT,FOLLOW_IDENT_in_activated_choice491); if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_activated_choice493); if (state.failed) return;
			choice_=(Token)match(input,IDENT,FOLLOW_IDENT_in_activated_choice497); if (state.failed) return;
			if ( state.backtracking==0 ) {if(usedChoiceCategories.contains(cat.getText())){
			            throw new IllegalArgumentException("You have already chosen a different option for "+cat.getText());
			        }
			        usedChoiceCategories.add(cat.getText());
			        name = cat.getText()+":"+choice_.getText();
			        c = (Choice) choices().lookup(new Name(name));
			        if(c==null){
			            throw new NotDeclException(input, "Option", choice_.getText());
			        }else{
			            activatedChoices=activatedChoices.add(c);
			        }
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "activated_choice"



	// $ANTLR start "option_decls"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1637:1: option_decls : OPTIONSDECL LBRACE ( choice SEMI )* RBRACE ;
	public final void option_decls() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1638:9: ( OPTIONSDECL LBRACE ( choice SEMI )* RBRACE )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1639:9: OPTIONSDECL LBRACE ( choice SEMI )* RBRACE
			{
			match(input,OPTIONSDECL,FOLLOW_OPTIONSDECL_in_option_decls528); if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_option_decls530); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1639:28: ( choice SEMI )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==IDENT) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1639:29: choice SEMI
					{
					pushFollow(FOLLOW_choice_in_option_decls533);
					choice();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMI,FOLLOW_SEMI_in_option_decls535); if (state.failed) return;
					}
					break;

				default :
					break loop8;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_option_decls539); if (state.failed) return;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "option_decls"



	// $ANTLR start "choice"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1642:1: choice : category= IDENT ( COLON LBRACE choice_option[cat] ( COMMA choice_option[cat] )* RBRACE )? ;
	public final void choice() throws RecognitionException {
		Token category=null;


		    String cat=null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1644:2: (category= IDENT ( COLON LBRACE choice_option[cat] ( COMMA choice_option[cat] )* RBRACE )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1645:9: category= IDENT ( COLON LBRACE choice_option[cat] ( COMMA choice_option[cat] )* RBRACE )?
			{
			category=(Token)match(input,IDENT,FOLLOW_IDENT_in_choice566); if (state.failed) return;
			if ( state.backtracking==0 ) {cat=category.getText();}
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1645:50: ( COLON LBRACE choice_option[cat] ( COMMA choice_option[cat] )* RBRACE )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==COLON) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1645:51: COLON LBRACE choice_option[cat] ( COMMA choice_option[cat] )* RBRACE
					{
					match(input,COLON,FOLLOW_COLON_in_choice571); if (state.failed) return;
					match(input,LBRACE,FOLLOW_LBRACE_in_choice573); if (state.failed) return;
					pushFollow(FOLLOW_choice_option_in_choice575);
					choice_option(cat);
					state._fsp--;
					if (state.failed) return;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1645:83: ( COMMA choice_option[cat] )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1645:84: COMMA choice_option[cat]
							{
							match(input,COMMA,FOLLOW_COMMA_in_choice579); if (state.failed) return;
							pushFollow(FOLLOW_choice_option_in_choice581);
							choice_option(cat);
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop9;
						}
					}

					match(input,RBRACE,FOLLOW_RBRACE_in_choice586); if (state.failed) return;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			            if(!category2Default.containsKey(cat)){
			                choices().add(new Choice("On",cat));
			                choices().add(new Choice("Off",cat)); 
			                category2Default.put(cat, cat+":On");               
			            }
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "choice"



	// $ANTLR start "choice_option"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1655:1: choice_option[String cat] : choice_= IDENT ;
	public final void choice_option(String cat) throws RecognitionException {
		Token choice_=null;


		    String name;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1657:2: (choice_= IDENT )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1658:9: choice_= IDENT
			{
			choice_=(Token)match(input,IDENT,FOLLOW_IDENT_in_choice_option625); if (state.failed) return;
			if ( state.backtracking==0 ) { name=cat+":"+choice_.getText();
			        Choice c = (Choice) choices().lookup(new Name(name));
			        if(c==null){
			            c = new Choice(choice_.getText(),cat);
			            choices().add(c);
			        }
			            if(!category2Default.containsKey(cat)){
			                category2Default.put(cat, name);
			            }
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "choice_option"



	// $ANTLR start "sort_decls"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1673:1: sort_decls : SORTS LBRACE (multipleSorts= one_sort_decl )* RBRACE ;
	public final void sort_decls() throws RecognitionException {
		ImmutableList<Sort> multipleSorts =null;


		  ImmutableList<Sort> lsorts = ImmutableSLList.<Sort>nil();
		  multipleSorts = ImmutableSLList.<Sort>nil();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1678:3: ( SORTS LBRACE (multipleSorts= one_sort_decl )* RBRACE )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1678:3: SORTS LBRACE (multipleSorts= one_sort_decl )* RBRACE
			{
			match(input,SORTS,FOLLOW_SORTS_in_sort_decls647); if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_sort_decls649); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1679:8: (multipleSorts= one_sort_decl )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==ABSTRACT||LA11_0==GENERIC||LA11_0==IDENT||LA11_0==PROXY) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1679:10: multipleSorts= one_sort_decl
					{
					pushFollow(FOLLOW_one_sort_decl_in_sort_decls665);
					multipleSorts=one_sort_decl();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { lsorts = lsorts.prepend(multipleSorts); }
					}
					break;

				default :
					break loop11;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_sort_decls674); if (state.failed) return;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sort_decls"



	// $ANTLR start "one_sort_decl"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1683:1: one_sort_decl returns [ImmutableList<Sort> createdSorts = ImmutableSLList.<Sort>nil()] : ( GENERIC sortIds= simple_ident_comma_list ( ONEOF sortOneOf= oneof_sorts )? ( EXTENDS sortExt= extends_sorts )? | PROXY sortIds= simple_ident_comma_list ( EXTENDS sortExt= extends_sorts )? | ( ABSTRACT )? firstSort= simple_ident_dots ( ( EXTENDS sortExt= extends_sorts ) | ( ( COMMA ) sortIds= simple_ident_comma_list ) )? ) SEMI ;
	public final ImmutableList<Sort> one_sort_decl() throws RecognitionException {
		ImmutableList<Sort> createdSorts =  ImmutableSLList.<Sort>nil();


		ImmutableList<String> sortIds =null;
		Sort[] sortOneOf =null;
		Sort[] sortExt =null;
		String firstSort =null;


		    boolean isAbstractSort = false;
		    boolean isGenericSort = false;
		    boolean isProxySort = false;
		    sortExt=new Sort [0];
		    sortOneOf=new Sort [0];
		    sortIds = ImmutableSLList.<String>nil(); 

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1691:3: ( ( GENERIC sortIds= simple_ident_comma_list ( ONEOF sortOneOf= oneof_sorts )? ( EXTENDS sortExt= extends_sorts )? | PROXY sortIds= simple_ident_comma_list ( EXTENDS sortExt= extends_sorts )? | ( ABSTRACT )? firstSort= simple_ident_dots ( ( EXTENDS sortExt= extends_sorts ) | ( ( COMMA ) sortIds= simple_ident_comma_list ) )? ) SEMI )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1692:9: ( GENERIC sortIds= simple_ident_comma_list ( ONEOF sortOneOf= oneof_sorts )? ( EXTENDS sortExt= extends_sorts )? | PROXY sortIds= simple_ident_comma_list ( EXTENDS sortExt= extends_sorts )? | ( ABSTRACT )? firstSort= simple_ident_dots ( ( EXTENDS sortExt= extends_sorts ) | ( ( COMMA ) sortIds= simple_ident_comma_list ) )? ) SEMI
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1692:9: ( GENERIC sortIds= simple_ident_comma_list ( ONEOF sortOneOf= oneof_sorts )? ( EXTENDS sortExt= extends_sorts )? | PROXY sortIds= simple_ident_comma_list ( EXTENDS sortExt= extends_sorts )? | ( ABSTRACT )? firstSort= simple_ident_dots ( ( EXTENDS sortExt= extends_sorts ) | ( ( COMMA ) sortIds= simple_ident_comma_list ) )? )
			int alt17=3;
			switch ( input.LA(1) ) {
			case GENERIC:
				{
				alt17=1;
				}
				break;
			case PROXY:
				{
				alt17=2;
				}
				break;
			case ABSTRACT:
			case IDENT:
				{
				alt17=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return createdSorts;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1693:10: GENERIC sortIds= simple_ident_comma_list ( ONEOF sortOneOf= oneof_sorts )? ( EXTENDS sortExt= extends_sorts )?
					{
					match(input,GENERIC,FOLLOW_GENERIC_in_one_sort_decl714); if (state.failed) return createdSorts;
					if ( state.backtracking==0 ) {isGenericSort=true;}
					pushFollow(FOLLOW_simple_ident_comma_list_in_one_sort_decl722);
					sortIds=simple_ident_comma_list();
					state._fsp--;
					if (state.failed) return createdSorts;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1694:13: ( ONEOF sortOneOf= oneof_sorts )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==ONEOF) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1694:15: ONEOF sortOneOf= oneof_sorts
							{
							match(input,ONEOF,FOLLOW_ONEOF_in_one_sort_decl738); if (state.failed) return createdSorts;
							pushFollow(FOLLOW_oneof_sorts_in_one_sort_decl744);
							sortOneOf=oneof_sorts();
							state._fsp--;
							if (state.failed) return createdSorts;
							}
							break;

					}

					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1695:13: ( EXTENDS sortExt= extends_sorts )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==EXTENDS) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1695:15: EXTENDS sortExt= extends_sorts
							{
							match(input,EXTENDS,FOLLOW_EXTENDS_in_one_sort_decl764); if (state.failed) return createdSorts;
							pushFollow(FOLLOW_extends_sorts_in_one_sort_decl770);
							sortExt=extends_sorts();
							state._fsp--;
							if (state.failed) return createdSorts;
							}
							break;

					}

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1696:11: PROXY sortIds= simple_ident_comma_list ( EXTENDS sortExt= extends_sorts )?
					{
					match(input,PROXY,FOLLOW_PROXY_in_one_sort_decl785); if (state.failed) return createdSorts;
					if ( state.backtracking==0 ) {isProxySort=true;}
					pushFollow(FOLLOW_simple_ident_comma_list_in_one_sort_decl793);
					sortIds=simple_ident_comma_list();
					state._fsp--;
					if (state.failed) return createdSorts;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1697:13: ( EXTENDS sortExt= extends_sorts )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==EXTENDS) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1697:15: EXTENDS sortExt= extends_sorts
							{
							match(input,EXTENDS,FOLLOW_EXTENDS_in_one_sort_decl809); if (state.failed) return createdSorts;
							pushFollow(FOLLOW_extends_sorts_in_one_sort_decl815);
							sortExt=extends_sorts();
							state._fsp--;
							if (state.failed) return createdSorts;
							}
							break;

					}

					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1698:11: ( ABSTRACT )? firstSort= simple_ident_dots ( ( EXTENDS sortExt= extends_sorts ) | ( ( COMMA ) sortIds= simple_ident_comma_list ) )?
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1698:11: ( ABSTRACT )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==ABSTRACT) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1698:12: ABSTRACT
							{
							match(input,ABSTRACT,FOLLOW_ABSTRACT_in_one_sort_decl831); if (state.failed) return createdSorts;
							if ( state.backtracking==0 ) {isAbstractSort = true;}
							}
							break;

					}

					pushFollow(FOLLOW_simple_ident_dots_in_one_sort_decl851);
					firstSort=simple_ident_dots();
					state._fsp--;
					if (state.failed) return createdSorts;
					if ( state.backtracking==0 ) { sortIds = sortIds.prepend(firstSort); }
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1700:11: ( ( EXTENDS sortExt= extends_sorts ) | ( ( COMMA ) sortIds= simple_ident_comma_list ) )?
					int alt16=3;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==EXTENDS) ) {
						alt16=1;
					}
					else if ( (LA16_0==COMMA) ) {
						alt16=2;
					}
					switch (alt16) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1701:15: ( EXTENDS sortExt= extends_sorts )
							{
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1701:15: ( EXTENDS sortExt= extends_sorts )
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1701:16: EXTENDS sortExt= extends_sorts
							{
							match(input,EXTENDS,FOLLOW_EXTENDS_in_one_sort_decl882); if (state.failed) return createdSorts;
							pushFollow(FOLLOW_extends_sorts_in_one_sort_decl888);
							sortExt=extends_sorts();
							state._fsp--;
							if (state.failed) return createdSorts;
							}

							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1702:15: ( ( COMMA ) sortIds= simple_ident_comma_list )
							{
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1702:15: ( ( COMMA ) sortIds= simple_ident_comma_list )
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1702:16: ( COMMA ) sortIds= simple_ident_comma_list
							{
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1702:16: ( COMMA )
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1702:17: COMMA
							{
							match(input,COMMA,FOLLOW_COMMA_in_one_sort_decl909); if (state.failed) return createdSorts;
							}

							pushFollow(FOLLOW_simple_ident_comma_list_in_one_sort_decl916);
							sortIds=simple_ident_comma_list();
							state._fsp--;
							if (state.failed) return createdSorts;
							if ( state.backtracking==0 ) { sortIds = sortIds.prepend(firstSort) ; }
							}

							}
							break;

					}

					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_one_sort_decl945); if (state.failed) return createdSorts;
			if ( state.backtracking==0 ) {   
			            if (!skip_sorts) {
			                    Iterator<String> it = sortIds.iterator ();        
			                    while ( it.hasNext () ) {
			                        Name sort_name = new Name(it.next());   
			                        // attention: no expand to java.lang here!       
			                        if (sorts().lookup(sort_name) == null) {
			                            Sort s;
						    if (isGenericSort) {
			                                int i;
			                                ImmutableSet<Sort>  ext   = DefaultImmutableSet.<Sort>nil();
			                                ImmutableSet<Sort>  oneOf = DefaultImmutableSet.<Sort>nil();

			                                for ( i = 0; i != sortExt.length; ++i )
			                                ext = ext.add ( sortExt[i] );

			                                for ( i = 0; i != sortOneOf.length; ++i )
			                                oneOf = oneOf.add ( sortOneOf[i] );
			                                
			                                try {
			                                    s = new GenericSort(sort_name, ext, oneOf);
			                                } catch (GenericSupersortException e) {
			                                    throw new GenericSortException ( "sort", "Illegal sort given",
			                                        e.getIllegalSort(), getSourceName(), getLine(), getColumn());
			                                }
			                            } else if (new Name("any").equals(sort_name)) {
			                                s = Sort.ANY;
			                            } else  {
			                                ImmutableSet<Sort>  ext = DefaultImmutableSet.<Sort>nil();

			                                for ( int i = 0; i != sortExt.length; ++i ) {
			                                    ext = ext.add ( sortExt[i] );
			                                }

			                                if(isProxySort) {
			                                    s = new ProxySort(sort_name, ext);
			                                } else {
			                                s = new SortImpl(sort_name, ext, isAbstractSort);
			                                }
			                            }
			                            assert s != null;
			                            sorts().add ( s ); 

			                            createdSorts = createdSorts.append(s);
			                        }
			                }
			            }
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return createdSorts;
	}
	// $ANTLR end "one_sort_decl"



	// $ANTLR start "simple_ident_dots"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1754:1: simple_ident_dots returns [ String ident = \"\"; ] : id= simple_ident ( DOT (id= simple_ident |num= NUM_LITERAL ) )* ;
	public final String simple_ident_dots() throws RecognitionException {
		String ident =  "";;


		Token num=null;
		String id =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1755:3: (id= simple_ident ( DOT (id= simple_ident |num= NUM_LITERAL ) )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1756:3: id= simple_ident ( DOT (id= simple_ident |num= NUM_LITERAL ) )*
			{
			pushFollow(FOLLOW_simple_ident_in_simple_ident_dots967);
			id=simple_ident();
			state._fsp--;
			if (state.failed) return ident;
			if ( state.backtracking==0 ) { ident += id; }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1757:5: ( DOT (id= simple_ident |num= NUM_LITERAL ) )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==DOT) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1757:6: DOT (id= simple_ident |num= NUM_LITERAL )
					{
					match(input,DOT,FOLLOW_DOT_in_simple_ident_dots978); if (state.failed) return ident;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1758:3: (id= simple_ident |num= NUM_LITERAL )
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==IDENT) ) {
						alt18=1;
					}
					else if ( (LA18_0==NUM_LITERAL) ) {
						alt18=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return ident;}
						NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);
						throw nvae;
					}

					switch (alt18) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1758:4: id= simple_ident
							{
							pushFollow(FOLLOW_simple_ident_in_simple_ident_dots988);
							id=simple_ident();
							state._fsp--;
							if (state.failed) return ident;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1758:24: num= NUM_LITERAL
							{
							num=(Token)match(input,NUM_LITERAL,FOLLOW_NUM_LITERAL_in_simple_ident_dots994); if (state.failed) return ident;
							if ( state.backtracking==0 ) {id=num.getText();}
							}
							break;

					}

					if ( state.backtracking==0 ) {ident += "." + id;}
					}
					break;

				default :
					break loop19;
				}
			}

			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return ident;
	}
	// $ANTLR end "simple_ident_dots"



	// $ANTLR start "extends_sorts"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1762:1: extends_sorts returns [Sort[] extendsSorts = null] : s= any_sortId_check[!skip_sorts] ( COMMA s= any_sortId_check[!skip_sorts] )* ;
	public final Sort[] extends_sorts() throws RecognitionException {
		Sort[] extendsSorts =  null;


		Sort s =null;


		    List args = new LinkedList();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1766:5: (s= any_sortId_check[!skip_sorts] ( COMMA s= any_sortId_check[!skip_sorts] )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1767:9: s= any_sortId_check[!skip_sorts] ( COMMA s= any_sortId_check[!skip_sorts] )*
			{
			pushFollow(FOLLOW_any_sortId_check_in_extends_sorts1040);
			s=any_sortId_check(!skip_sorts);
			state._fsp--;
			if (state.failed) return extendsSorts;
			if ( state.backtracking==0 ) { args.add(s); }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1768:9: ( COMMA s= any_sortId_check[!skip_sorts] )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==COMMA) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1769:13: COMMA s= any_sortId_check[!skip_sorts]
					{
					match(input,COMMA,FOLLOW_COMMA_in_extends_sorts1067); if (state.failed) return extendsSorts;
					pushFollow(FOLLOW_any_sortId_check_in_extends_sorts1073);
					s=any_sortId_check(!skip_sorts);
					state._fsp--;
					if (state.failed) return extendsSorts;
					if ( state.backtracking==0 ) {args.add(s);}
					}
					break;

				default :
					break loop20;
				}
			}

			if ( state.backtracking==0 ) {
			            extendsSorts = (Sort[])args.toArray(AN_ARRAY_OF_SORTS);
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return extendsSorts;
	}
	// $ANTLR end "extends_sorts"



	// $ANTLR start "oneof_sorts"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1776:1: oneof_sorts returns [Sort[] oneOfSorts = null] : LBRACE s= sortId_check[true] ( COMMA s= sortId_check[true] )* RBRACE ;
	public final Sort[] oneof_sorts() throws RecognitionException {
		Sort[] oneOfSorts =  null;


		Sort s =null;


		    List args = new LinkedList();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1780:5: ( LBRACE s= sortId_check[true] ( COMMA s= sortId_check[true] )* RBRACE )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1780:7: LBRACE s= sortId_check[true] ( COMMA s= sortId_check[true] )* RBRACE
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_oneof_sorts1124); if (state.failed) return oneOfSorts;
			pushFollow(FOLLOW_sortId_check_in_oneof_sorts1138);
			s=sortId_check(true);
			state._fsp--;
			if (state.failed) return oneOfSorts;
			if ( state.backtracking==0 ) { args.add(s); }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1782:9: ( COMMA s= sortId_check[true] )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==COMMA) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1783:13: COMMA s= sortId_check[true]
					{
					match(input,COMMA,FOLLOW_COMMA_in_oneof_sorts1165); if (state.failed) return oneOfSorts;
					pushFollow(FOLLOW_sortId_check_in_oneof_sorts1171);
					s=sortId_check(true);
					state._fsp--;
					if (state.failed) return oneOfSorts;
					if ( state.backtracking==0 ) {args.add(s);}
					}
					break;

				default :
					break loop21;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_oneof_sorts1194); if (state.failed) return oneOfSorts;
			if ( state.backtracking==0 ) {
			        oneOfSorts = (Sort[])args.toArray(AN_ARRAY_OF_SORTS);
			      }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return oneOfSorts;
	}
	// $ANTLR end "oneof_sorts"



	// $ANTLR start "keyjavatype"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1790:1: keyjavatype returns [KeYJavaType kjt=null] : type= simple_ident_dots ( EMPTYBRACKETS )* ;
	public final KeYJavaType keyjavatype() throws RecognitionException {
		KeYJavaType kjt = null;


		String type =null;

		 
		   boolean array = false;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1794:5: (type= simple_ident_dots ( EMPTYBRACKETS )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1795:5: type= simple_ident_dots ( EMPTYBRACKETS )*
			{
			pushFollow(FOLLOW_simple_ident_dots_in_keyjavatype1225);
			type=simple_ident_dots();
			state._fsp--;
			if (state.failed) return kjt;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1795:30: ( EMPTYBRACKETS )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==EMPTYBRACKETS) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1795:31: EMPTYBRACKETS
					{
					match(input,EMPTYBRACKETS,FOLLOW_EMPTYBRACKETS_in_keyjavatype1228); if (state.failed) return kjt;
					if ( state.backtracking==0 ) {type += "[]"; array=true;}
					}
					break;

				default :
					break loop22;
				}
			}

			if ( state.backtracking==0 ) {
			        kjt = getJavaInfo().getKeYJavaType(type);
			            
			        //expand to "java.lang"            
			        if (kjt == null) {
			            try {
			                String guess = "java.lang." + type;
			       	        kjt = getJavaInfo().getKeYJavaType(guess);
			       	    } catch(Exception e) {
			       	        kjt = null;
			       	    }
			        }
			     
			        //arrays
			        if(kjt == null && array) {
			            try {
			                JavaBlock jb = getJavaInfo().readJavaBlock("{" + type + " k;}");
			                kjt = ((VariableDeclaration) 
			                        ((StatementBlock) jb.program()).getChildAt(0)).
			                            getTypeReference().getKeYJavaType();
			            } catch (Exception e) {
			                kjt = null;
			            }          
			        }
			     
			        //try as sort without Java type (neede e.g. for "Heap")
			        if(kjt == null) {
				    Sort sort = lookupSort(type);
				    if(sort != null) {
			                kjt = new KeYJavaType(null, sort);
			            }
			        }
			     
			        if(kjt == null) {
			            semanticError("Unknown type: " + type);
			        }
			    }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return kjt;
	}
	// $ANTLR end "keyjavatype"



	// $ANTLR start "prog_var_decls"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1835:1: prog_var_decls : PROGRAMVARIABLES LBRACE (kjt= keyjavatype var_names= simple_ident_comma_list SEMI )* RBRACE ;
	public final void prog_var_decls() throws RecognitionException {
		KeYJavaType kjt =null;
		ImmutableList<String> var_names =null;


		    String var_name;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1839:5: ( PROGRAMVARIABLES LBRACE (kjt= keyjavatype var_names= simple_ident_comma_list SEMI )* RBRACE )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1840:9: PROGRAMVARIABLES LBRACE (kjt= keyjavatype var_names= simple_ident_comma_list SEMI )* RBRACE
			{
			if ( state.backtracking==0 ) { switchToNormalMode();}
			match(input,PROGRAMVARIABLES,FOLLOW_PROGRAMVARIABLES_in_prog_var_decls1275); if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_prog_var_decls1285); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1843:9: (kjt= keyjavatype var_names= simple_ident_comma_list SEMI )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==IDENT) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1844:13: kjt= keyjavatype var_names= simple_ident_comma_list SEMI
					{
					pushFollow(FOLLOW_keyjavatype_in_prog_var_decls1314);
					kjt=keyjavatype();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_simple_ident_comma_list_in_prog_var_decls1332);
					var_names=simple_ident_comma_list();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
						        Iterator<String> it = var_names.iterator();
							while(it.hasNext()){
							  var_name = it.next();
							  ProgramElementName pvName = new ProgramElementName(var_name);
							  Named name = lookup(pvName);
					                  if (name != null ) {
							    // commented out as pv do not have unique name (at the moment)
							    //  throw new AmbigiousDeclException
					     		    //  	(var_name, getSourceName(), getLine(), getColumn());
							    if(!(name instanceof ProgramVariable) || (name instanceof ProgramVariable && 
								    !((ProgramVariable)name).getKeYJavaType().equals(kjt))) { 
					                      namespaces().programVariables().add(new LocationVariable
					                        (pvName, kjt));
							    }
					                  }else{
					                     namespaces().programVariables().add(new LocationVariable
					                        (pvName, kjt));
							  }
						       }
					            }
					match(input,SEMI,FOLLOW_SEMI_in_prog_var_decls1360); if (state.failed) return;
					}
					break;

				default :
					break loop23;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_prog_var_decls1382); if (state.failed) return;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog_var_decls"



	// $ANTLR start "string_literal"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1872:1: string_literal returns [String lit = null] : id= STRING_LITERAL ;
	public final String string_literal() throws RecognitionException {
		String lit =  null;


		Token id=null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1873:4: (id= STRING_LITERAL )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1874:6: id= STRING_LITERAL
			{
			id=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_string_literal1409); if (state.failed) return lit;
			if ( state.backtracking==0 ) {
			       lit = unescapeString(id.getText());
			       lit = lit.substring(1,lit.length()-1);
			       stringLiteralLine = id.getLine();
			     }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return lit;
	}
	// $ANTLR end "string_literal"



	// $ANTLR start "simple_ident"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1881:1: simple_ident returns [String ident = null] : id= IDENT ;
	public final String simple_ident() throws RecognitionException {
		String ident =  null;


		Token id=null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1882:4: (id= IDENT )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1883:6: id= IDENT
			{
			id=(Token)match(input,IDENT,FOLLOW_IDENT_in_simple_ident1439); if (state.failed) return ident;
			if ( state.backtracking==0 ) { ident = id.getText(); }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return ident;
	}
	// $ANTLR end "simple_ident"



	// $ANTLR start "simple_ident_comma_list"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1886:1: simple_ident_comma_list returns [ImmutableList<String> ids = ImmutableSLList.<String>nil()] : id= simple_ident ( COMMA id= simple_ident )* ;
	public final ImmutableList<String> simple_ident_comma_list() throws RecognitionException {
		ImmutableList<String> ids =  ImmutableSLList.<String>nil();


		String id =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1887:4: (id= simple_ident ( COMMA id= simple_ident )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1888:4: id= simple_ident ( COMMA id= simple_ident )*
			{
			pushFollow(FOLLOW_simple_ident_in_simple_ident_comma_list1467);
			id=simple_ident();
			state._fsp--;
			if (state.failed) return ids;
			if ( state.backtracking==0 ) { ids = ids.append(id); }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1889:4: ( COMMA id= simple_ident )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==COMMA) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1889:5: COMMA id= simple_ident
					{
					match(input,COMMA,FOLLOW_COMMA_in_simple_ident_comma_list1475); if (state.failed) return ids;
					pushFollow(FOLLOW_simple_ident_in_simple_ident_comma_list1481);
					id=simple_ident();
					state._fsp--;
					if (state.failed) return ids;
					if ( state.backtracking==0 ) { ids = ids.append(id); }
					}
					break;

				default :
					break loop24;
				}
			}

			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return ids;
	}
	// $ANTLR end "simple_ident_comma_list"



	// $ANTLR start "schema_var_decls"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1893:1: schema_var_decls : SCHEMAVARIABLES LBRACE ( one_schema_var_decl )* RBRACE ;
	public final void schema_var_decls() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1893:18: ( SCHEMAVARIABLES LBRACE ( one_schema_var_decl )* RBRACE )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1894:9: SCHEMAVARIABLES LBRACE ( one_schema_var_decl )* RBRACE
			{
			match(input,SCHEMAVARIABLES,FOLLOW_SCHEMAVARIABLES_in_schema_var_decls1504); if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_schema_var_decls1506); if (state.failed) return;
			if ( state.backtracking==0 ) { switchToSchemaMode(); }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1895:6: ( one_schema_var_decl )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==FORMULA||LA25_0==MODALOPERATOR||LA25_0==PROGRAM||(LA25_0 >= SKOLEMFORMULA && LA25_0 <= SKOLEMTERM)||(LA25_0 >= TERM && LA25_0 <= TERMLABEL)||LA25_0==UPDATE||(LA25_0 >= VARIABLE && LA25_0 <= VARIABLES)) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1895:8: one_schema_var_decl
					{
					pushFollow(FOLLOW_one_schema_var_decl_in_schema_var_decls1518);
					one_schema_var_decl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop25;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_schema_var_decls1531); if (state.failed) return;
			if ( state.backtracking==0 ) { switchToNormalMode(); }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "schema_var_decls"



	// $ANTLR start "one_schema_var_decl"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1899:1: one_schema_var_decl : ( ( MODALOPERATOR one_schema_modal_op_decl SEMI ) | ( ( PROGRAM ( schema_modifiers[mods] )? id= simple_ident ( LBRACKET nameString= simple_ident EQUALS parameter= simple_ident_dots RBRACKET )? ids= simple_ident_comma_list | FORMULA ( schema_modifiers[mods] )? ids= simple_ident_comma_list | TERMLABEL ( schema_modifiers[mods] )? ids= simple_ident_comma_list | UPDATE ( schema_modifiers[mods] )? ids= simple_ident_comma_list | SKOLEMFORMULA ( schema_modifiers[mods] )? ids= simple_ident_comma_list | ( TERM ( schema_modifiers[mods] )? | ( ( VARIABLES | VARIABLE ) ( schema_modifiers[mods] )? ) | ( SKOLEMTERM ( schema_modifiers[mods] )? ) ) s= any_sortId_check[true] ids= simple_ident_comma_list ) SEMI ) );
	public final void one_schema_var_decl() throws RecognitionException {
		String id =null;
		String nameString =null;
		String parameter =null;
		ImmutableList<String> ids =null;
		Sort s =null;


		    boolean makeVariableSV  = false;
		    boolean makeSkolemTermSV = false;
		    boolean makeTermLabelSV  = false;
		    SchemaVariableModifierSet mods = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1905:3: ( ( MODALOPERATOR one_schema_modal_op_decl SEMI ) | ( ( PROGRAM ( schema_modifiers[mods] )? id= simple_ident ( LBRACKET nameString= simple_ident EQUALS parameter= simple_ident_dots RBRACKET )? ids= simple_ident_comma_list | FORMULA ( schema_modifiers[mods] )? ids= simple_ident_comma_list | TERMLABEL ( schema_modifiers[mods] )? ids= simple_ident_comma_list | UPDATE ( schema_modifiers[mods] )? ids= simple_ident_comma_list | SKOLEMFORMULA ( schema_modifiers[mods] )? ids= simple_ident_comma_list | ( TERM ( schema_modifiers[mods] )? | ( ( VARIABLES | VARIABLE ) ( schema_modifiers[mods] )? ) | ( SKOLEMTERM ( schema_modifiers[mods] )? ) ) s= any_sortId_check[true] ids= simple_ident_comma_list ) SEMI ) )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==MODALOPERATOR) ) {
				alt37=1;
			}
			else if ( (LA37_0==FORMULA||LA37_0==PROGRAM||(LA37_0 >= SKOLEMFORMULA && LA37_0 <= SKOLEMTERM)||(LA37_0 >= TERM && LA37_0 <= TERMLABEL)||LA37_0==UPDATE||(LA37_0 >= VARIABLE && LA37_0 <= VARIABLES)) ) {
				alt37=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1906:4: ( MODALOPERATOR one_schema_modal_op_decl SEMI )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1906:4: ( MODALOPERATOR one_schema_modal_op_decl SEMI )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1906:5: MODALOPERATOR one_schema_modal_op_decl SEMI
					{
					match(input,MODALOPERATOR,FOLLOW_MODALOPERATOR_in_one_schema_var_decl1559); if (state.failed) return;
					pushFollow(FOLLOW_one_schema_modal_op_decl_in_one_schema_var_decl1561);
					one_schema_modal_op_decl();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMI,FOLLOW_SEMI_in_one_schema_var_decl1563); if (state.failed) return;
					}

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1908:3: ( ( PROGRAM ( schema_modifiers[mods] )? id= simple_ident ( LBRACKET nameString= simple_ident EQUALS parameter= simple_ident_dots RBRACKET )? ids= simple_ident_comma_list | FORMULA ( schema_modifiers[mods] )? ids= simple_ident_comma_list | TERMLABEL ( schema_modifiers[mods] )? ids= simple_ident_comma_list | UPDATE ( schema_modifiers[mods] )? ids= simple_ident_comma_list | SKOLEMFORMULA ( schema_modifiers[mods] )? ids= simple_ident_comma_list | ( TERM ( schema_modifiers[mods] )? | ( ( VARIABLES | VARIABLE ) ( schema_modifiers[mods] )? ) | ( SKOLEMTERM ( schema_modifiers[mods] )? ) ) s= any_sortId_check[true] ids= simple_ident_comma_list ) SEMI )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1908:3: ( ( PROGRAM ( schema_modifiers[mods] )? id= simple_ident ( LBRACKET nameString= simple_ident EQUALS parameter= simple_ident_dots RBRACKET )? ids= simple_ident_comma_list | FORMULA ( schema_modifiers[mods] )? ids= simple_ident_comma_list | TERMLABEL ( schema_modifiers[mods] )? ids= simple_ident_comma_list | UPDATE ( schema_modifiers[mods] )? ids= simple_ident_comma_list | SKOLEMFORMULA ( schema_modifiers[mods] )? ids= simple_ident_comma_list | ( TERM ( schema_modifiers[mods] )? | ( ( VARIABLES | VARIABLE ) ( schema_modifiers[mods] )? ) | ( SKOLEMTERM ( schema_modifiers[mods] )? ) ) s= any_sortId_check[true] ids= simple_ident_comma_list ) SEMI )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1909:4: ( PROGRAM ( schema_modifiers[mods] )? id= simple_ident ( LBRACKET nameString= simple_ident EQUALS parameter= simple_ident_dots RBRACKET )? ids= simple_ident_comma_list | FORMULA ( schema_modifiers[mods] )? ids= simple_ident_comma_list | TERMLABEL ( schema_modifiers[mods] )? ids= simple_ident_comma_list | UPDATE ( schema_modifiers[mods] )? ids= simple_ident_comma_list | SKOLEMFORMULA ( schema_modifiers[mods] )? ids= simple_ident_comma_list | ( TERM ( schema_modifiers[mods] )? | ( ( VARIABLES | VARIABLE ) ( schema_modifiers[mods] )? ) | ( SKOLEMTERM ( schema_modifiers[mods] )? ) ) s= any_sortId_check[true] ids= simple_ident_comma_list ) SEMI
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1909:4: ( PROGRAM ( schema_modifiers[mods] )? id= simple_ident ( LBRACKET nameString= simple_ident EQUALS parameter= simple_ident_dots RBRACKET )? ids= simple_ident_comma_list | FORMULA ( schema_modifiers[mods] )? ids= simple_ident_comma_list | TERMLABEL ( schema_modifiers[mods] )? ids= simple_ident_comma_list | UPDATE ( schema_modifiers[mods] )? ids= simple_ident_comma_list | SKOLEMFORMULA ( schema_modifiers[mods] )? ids= simple_ident_comma_list | ( TERM ( schema_modifiers[mods] )? | ( ( VARIABLES | VARIABLE ) ( schema_modifiers[mods] )? ) | ( SKOLEMTERM ( schema_modifiers[mods] )? ) ) s= any_sortId_check[true] ids= simple_ident_comma_list )
					int alt36=6;
					switch ( input.LA(1) ) {
					case PROGRAM:
						{
						alt36=1;
						}
						break;
					case FORMULA:
						{
						alt36=2;
						}
						break;
					case TERMLABEL:
						{
						alt36=3;
						}
						break;
					case UPDATE:
						{
						alt36=4;
						}
						break;
					case SKOLEMFORMULA:
						{
						alt36=5;
						}
						break;
					case SKOLEMTERM:
					case TERM:
					case VARIABLE:
					case VARIABLES:
						{
						alt36=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 36, 0, input);
						throw nvae;
					}
					switch (alt36) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1910:5: PROGRAM ( schema_modifiers[mods] )? id= simple_ident ( LBRACKET nameString= simple_ident EQUALS parameter= simple_ident_dots RBRACKET )? ids= simple_ident_comma_list
							{
							match(input,PROGRAM,FOLLOW_PROGRAM_in_one_schema_var_decl1583); if (state.failed) return;
							if ( state.backtracking==0 ) { mods = new SchemaVariableModifierSet.ProgramSV (); }
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1912:5: ( schema_modifiers[mods] )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==LBRACKET) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1912:7: schema_modifiers[mods]
									{
									pushFollow(FOLLOW_schema_modifiers_in_one_schema_var_decl1597);
									schema_modifiers(mods);
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							pushFollow(FOLLOW_simple_ident_in_one_schema_var_decl1612);
							id=simple_ident();
							state._fsp--;
							if (state.failed) return;
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1913:23: ( LBRACKET nameString= simple_ident EQUALS parameter= simple_ident_dots RBRACKET )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==LBRACKET) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1913:25: LBRACKET nameString= simple_ident EQUALS parameter= simple_ident_dots RBRACKET
									{
									match(input,LBRACKET,FOLLOW_LBRACKET_in_one_schema_var_decl1616); if (state.failed) return;
									pushFollow(FOLLOW_simple_ident_in_one_schema_var_decl1622);
									nameString=simple_ident();
									state._fsp--;
									if (state.failed) return;
									match(input,EQUALS,FOLLOW_EQUALS_in_one_schema_var_decl1624); if (state.failed) return;
									pushFollow(FOLLOW_simple_ident_dots_in_one_schema_var_decl1630);
									parameter=simple_ident_dots();
									state._fsp--;
									if (state.failed) return;
									match(input,RBRACKET,FOLLOW_RBRACKET_in_one_schema_var_decl1632); if (state.failed) return;
									}
									break;

							}

							if ( state.backtracking==0 ) {
							       if(nameString != null && !"name".equals(nameString)) {
							         semanticError("Unrecognized token '"+nameString+"', expected 'name'");
							       }
							       ProgramSVSort psv = ProgramSVSort.name2sort().get(new Name(id));
							       s = (Sort) (parameter != null ? psv.createInstance(parameter) : psv);
							       if (s == null) {
							         semanticError
							           ("Program SchemaVariable of type "+id+" not found.");
							       }
							    }
							pushFollow(FOLLOW_simple_ident_comma_list_in_one_schema_var_decl1647);
							ids=simple_ident_comma_list();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1925:5: FORMULA ( schema_modifiers[mods] )? ids= simple_ident_comma_list
							{
							match(input,FORMULA,FOLLOW_FORMULA_in_one_schema_var_decl1653); if (state.failed) return;
							if ( state.backtracking==0 ) { mods = new SchemaVariableModifierSet.FormulaSV (); }
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1927:5: ( schema_modifiers[mods] )?
							int alt28=2;
							int LA28_0 = input.LA(1);
							if ( (LA28_0==LBRACKET) ) {
								alt28=1;
							}
							switch (alt28) {
								case 1 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1927:7: schema_modifiers[mods]
									{
									pushFollow(FOLLOW_schema_modifiers_in_one_schema_var_decl1667);
									schema_modifiers(mods);
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							if ( state.backtracking==0 ) {s = Sort.FORMULA;}
							pushFollow(FOLLOW_simple_ident_comma_list_in_one_schema_var_decl1688);
							ids=simple_ident_comma_list();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 3 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1930:5: TERMLABEL ( schema_modifiers[mods] )? ids= simple_ident_comma_list
							{
							match(input,TERMLABEL,FOLLOW_TERMLABEL_in_one_schema_var_decl1695); if (state.failed) return;
							if ( state.backtracking==0 ) { makeTermLabelSV = true; }
							if ( state.backtracking==0 ) { mods = new SchemaVariableModifierSet.TermLabelSV (); }
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1933:5: ( schema_modifiers[mods] )?
							int alt29=2;
							int LA29_0 = input.LA(1);
							if ( (LA29_0==LBRACKET) ) {
								alt29=1;
							}
							switch (alt29) {
								case 1 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1933:7: schema_modifiers[mods]
									{
									pushFollow(FOLLOW_schema_modifiers_in_one_schema_var_decl1715);
									schema_modifiers(mods);
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							pushFollow(FOLLOW_simple_ident_comma_list_in_one_schema_var_decl1730);
							ids=simple_ident_comma_list();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 4 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1935:5: UPDATE ( schema_modifiers[mods] )? ids= simple_ident_comma_list
							{
							match(input,UPDATE,FOLLOW_UPDATE_in_one_schema_var_decl1736); if (state.failed) return;
							if ( state.backtracking==0 ) { mods = new SchemaVariableModifierSet.FormulaSV (); }
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1937:5: ( schema_modifiers[mods] )?
							int alt30=2;
							int LA30_0 = input.LA(1);
							if ( (LA30_0==LBRACKET) ) {
								alt30=1;
							}
							switch (alt30) {
								case 1 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1937:7: schema_modifiers[mods]
									{
									pushFollow(FOLLOW_schema_modifiers_in_one_schema_var_decl1750);
									schema_modifiers(mods);
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							if ( state.backtracking==0 ) {s = Sort.UPDATE;}
							pushFollow(FOLLOW_simple_ident_comma_list_in_one_schema_var_decl1771);
							ids=simple_ident_comma_list();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 5 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1940:5: SKOLEMFORMULA ( schema_modifiers[mods] )? ids= simple_ident_comma_list
							{
							match(input,SKOLEMFORMULA,FOLLOW_SKOLEMFORMULA_in_one_schema_var_decl1778); if (state.failed) return;
							if ( state.backtracking==0 ) { makeSkolemTermSV = true; }
							if ( state.backtracking==0 ) { mods = new SchemaVariableModifierSet.FormulaSV (); }
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1943:5: ( schema_modifiers[mods] )?
							int alt31=2;
							int LA31_0 = input.LA(1);
							if ( (LA31_0==LBRACKET) ) {
								alt31=1;
							}
							switch (alt31) {
								case 1 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1943:7: schema_modifiers[mods]
									{
									pushFollow(FOLLOW_schema_modifiers_in_one_schema_var_decl1799);
									schema_modifiers(mods);
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							if ( state.backtracking==0 ) {s = Sort.FORMULA;}
							pushFollow(FOLLOW_simple_ident_comma_list_in_one_schema_var_decl1824);
							ids=simple_ident_comma_list();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 6 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1946:5: ( TERM ( schema_modifiers[mods] )? | ( ( VARIABLES | VARIABLE ) ( schema_modifiers[mods] )? ) | ( SKOLEMTERM ( schema_modifiers[mods] )? ) ) s= any_sortId_check[true] ids= simple_ident_comma_list
							{
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1946:5: ( TERM ( schema_modifiers[mods] )? | ( ( VARIABLES | VARIABLE ) ( schema_modifiers[mods] )? ) | ( SKOLEMTERM ( schema_modifiers[mods] )? ) )
							int alt35=3;
							switch ( input.LA(1) ) {
							case TERM:
								{
								alt35=1;
								}
								break;
							case VARIABLE:
							case VARIABLES:
								{
								alt35=2;
								}
								break;
							case SKOLEMTERM:
								{
								alt35=3;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 35, 0, input);
								throw nvae;
							}
							switch (alt35) {
								case 1 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1946:10: TERM ( schema_modifiers[mods] )?
									{
									match(input,TERM,FOLLOW_TERM_in_one_schema_var_decl1837); if (state.failed) return;
									if ( state.backtracking==0 ) { mods = new SchemaVariableModifierSet.TermSV (); }
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1948:10: ( schema_modifiers[mods] )?
									int alt32=2;
									int LA32_0 = input.LA(1);
									if ( (LA32_0==LBRACKET) ) {
										alt32=1;
									}
									switch (alt32) {
										case 1 :
											// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1948:12: schema_modifiers[mods]
											{
											pushFollow(FOLLOW_schema_modifiers_in_one_schema_var_decl1861);
											schema_modifiers(mods);
											state._fsp--;
											if (state.failed) return;
											}
											break;

									}

									}
									break;
								case 2 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1949:9: ( ( VARIABLES | VARIABLE ) ( schema_modifiers[mods] )? )
									{
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1949:9: ( ( VARIABLES | VARIABLE ) ( schema_modifiers[mods] )? )
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1949:11: ( VARIABLES | VARIABLE ) ( schema_modifiers[mods] )?
									{
									if ( (input.LA(1) >= VARIABLE && input.LA(1) <= VARIABLES) ) {
										input.consume();
										state.errorRecovery=false;
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									if ( state.backtracking==0 ) { makeVariableSV = true; }
									if ( state.backtracking==0 ) { mods = new SchemaVariableModifierSet.VariableSV (); }
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1952:10: ( schema_modifiers[mods] )?
									int alt33=2;
									int LA33_0 = input.LA(1);
									if ( (LA33_0==LBRACKET) ) {
										alt33=1;
									}
									switch (alt33) {
										case 1 :
											// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1952:12: schema_modifiers[mods]
											{
											pushFollow(FOLLOW_schema_modifiers_in_one_schema_var_decl1919);
											schema_modifiers(mods);
											state._fsp--;
											if (state.failed) return;
											}
											break;

									}

									}

									}
									break;
								case 3 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1953:9: ( SKOLEMTERM ( schema_modifiers[mods] )? )
									{
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1953:9: ( SKOLEMTERM ( schema_modifiers[mods] )? )
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1953:10: SKOLEMTERM ( schema_modifiers[mods] )?
									{
									match(input,SKOLEMTERM,FOLLOW_SKOLEMTERM_in_one_schema_var_decl1936); if (state.failed) return;
									if ( state.backtracking==0 ) { makeSkolemTermSV = true; }
									if ( state.backtracking==0 ) { mods = new SchemaVariableModifierSet.SkolemTermSV (); }
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1956:10: ( schema_modifiers[mods] )?
									int alt34=2;
									int LA34_0 = input.LA(1);
									if ( (LA34_0==LBRACKET) ) {
										alt34=1;
									}
									switch (alt34) {
										case 1 :
											// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1956:12: schema_modifiers[mods]
											{
											pushFollow(FOLLOW_schema_modifiers_in_one_schema_var_decl1972);
											schema_modifiers(mods);
											state._fsp--;
											if (state.failed) return;
											}
											break;

									}

									}

									}
									break;

							}

							pushFollow(FOLLOW_any_sortId_check_in_one_schema_var_decl1999);
							s=any_sortId_check(true);
							state._fsp--;
							if (state.failed) return;
							pushFollow(FOLLOW_simple_ident_comma_list_in_one_schema_var_decl2010);
							ids=simple_ident_comma_list();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,SEMI,FOLLOW_SEMI_in_one_schema_var_decl2017); if (state.failed) return;
					if ( state.backtracking==0 ) { 
					     Iterator<String> it = ids.iterator();
					     while(it.hasNext())
					       schema_var_decl(it.next(),
					                       s,
					                       makeVariableSV,
					                       makeSkolemTermSV,
					                       makeTermLabelSV,
							       mods);
					   }
					}

					}
					break;

			}
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "one_schema_var_decl"



	// $ANTLR start "schema_modifiers"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1975:1: schema_modifiers[SchemaVariableModifierSet mods] : LBRACKET opts= simple_ident_comma_list RBRACKET ;
	public final void schema_modifiers(SchemaVariableModifierSet mods) throws RecognitionException {
		ImmutableList<String> opts =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1976:5: ( LBRACKET opts= simple_ident_comma_list RBRACKET )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1977:9: LBRACKET opts= simple_ident_comma_list RBRACKET
			{
			match(input,LBRACKET,FOLLOW_LBRACKET_in_schema_modifiers2049); if (state.failed) return;
			pushFollow(FOLLOW_simple_ident_comma_list_in_schema_modifiers2063);
			opts=simple_ident_comma_list();
			state._fsp--;
			if (state.failed) return;
			match(input,RBRACKET,FOLLOW_RBRACKET_in_schema_modifiers2082); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            final Iterator<String> it = opts.iterator ();
			            while ( it.hasNext () ) {
			                final String option = it.next();
			                if (!mods.addModifier(option))
			                    semanticError(option+ 
			                    ": Illegal or unknown modifier in declaration of schema variable");
			            }
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "schema_modifiers"



	// $ANTLR start "one_schema_modal_op_decl"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1991:1: one_schema_modal_op_decl : ( LPAREN sort= any_sortId_check[true] RPAREN )? LBRACE ids= simple_ident_comma_list RBRACE id= simple_ident ;
	public final void one_schema_modal_op_decl() throws RecognitionException {
		Sort sort =null;
		ImmutableList<String> ids =null;
		String id =null;


		    ImmutableSet<Modality> modalities = DefaultImmutableSet.<Modality>nil();
		    sort = Sort.FORMULA;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1996:5: ( ( LPAREN sort= any_sortId_check[true] RPAREN )? LBRACE ids= simple_ident_comma_list RBRACE id= simple_ident )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1997:9: ( LPAREN sort= any_sortId_check[true] RPAREN )? LBRACE ids= simple_ident_comma_list RBRACE id= simple_ident
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1997:9: ( LPAREN sort= any_sortId_check[true] RPAREN )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==LPAREN) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:1997:10: LPAREN sort= any_sortId_check[true] RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_one_schema_modal_op_decl2123); if (state.failed) return;
					pushFollow(FOLLOW_any_sortId_check_in_one_schema_modal_op_decl2129);
					sort=any_sortId_check(true);
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					           if (sort != Sort.FORMULA) { 
					               semanticError("Modal operator SV must be a FORMULA, not " + sort);
					           }            
					         }
					match(input,RPAREN,FOLLOW_RPAREN_in_one_schema_modal_op_decl2134); if (state.failed) return;
					}
					break;

			}

			match(input,LBRACE,FOLLOW_LBRACE_in_one_schema_modal_op_decl2147); if (state.failed) return;
			pushFollow(FOLLOW_simple_ident_comma_list_in_one_schema_modal_op_decl2153);
			ids=simple_ident_comma_list();
			state._fsp--;
			if (state.failed) return;
			match(input,RBRACE,FOLLOW_RBRACE_in_one_schema_modal_op_decl2155); if (state.failed) return;
			pushFollow(FOLLOW_simple_ident_in_one_schema_modal_op_decl2161);
			id=simple_ident();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {   if (skip_schemavariables) {	       
				       return;
				    }	        
			            Iterator<String> it1 = ids.iterator();
			            while(it1.hasNext()) {
			  	      modalities = opSVHelper(it1.next(), modalities);
			  	    }
			            SchemaVariable osv = (SchemaVariable)variables().lookup(new Name(id));
			            if(osv != null)
			              semanticError("Schema variable "+id+" already defined.");

			            osv = SchemaVariableFactory.createModalOperatorSV(new Name(id),  
			                        sort, modalities);
			            
			            if (inSchemaMode()) {
			                variables().add(osv);
			                //functions().add(osv);
			            }
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "one_schema_modal_op_decl"



	// $ANTLR start "pred_decl"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2024:1: pred_decl : pred_name= funcpred_name (whereToBind= where_to_bind )? argSorts= arg_sorts[!skip_predicates] SEMI ;
	public final void pred_decl() throws RecognitionException {
		String pred_name =null;
		Boolean[] whereToBind =null;
		Sort[] argSorts =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2025:5: (pred_name= funcpred_name (whereToBind= where_to_bind )? argSorts= arg_sorts[!skip_predicates] SEMI )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2026:9: pred_name= funcpred_name (whereToBind= where_to_bind )? argSorts= arg_sorts[!skip_predicates] SEMI
			{
			pushFollow(FOLLOW_funcpred_name_in_pred_decl2193);
			pred_name=funcpred_name();
			state._fsp--;
			if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2028:9: (whereToBind= where_to_bind )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==LBRACE) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2029:6: whereToBind= where_to_bind
					{
					pushFollow(FOLLOW_where_to_bind_in_pred_decl2223);
					whereToBind=where_to_bind();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_arg_sorts_in_pred_decl2267);
			argSorts=arg_sorts(!skip_predicates);
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			            if (!skip_predicates) {
			            
			                if(whereToBind != null 
				 	   && whereToBind.length != argSorts.length) {
			                    semanticError("Where-to-bind list must have same length "
			                                  + "as argument list");
			                }
			                 
			                Function p = null;            
			            
			            	int separatorIndex = pred_name.indexOf("::"); 
				        if (separatorIndex > 0) {
				            String sortName = pred_name.substring(0, separatorIndex);
				            String baseName = pred_name.substring(separatorIndex + 2);
					    Sort genSort = lookupSort(sortName);
					    
					    if(genSort instanceof GenericSort) {	        	            	
					    	p = SortDependingFunction.createFirstInstance(
					    	    		(GenericSort)genSort,
					    	    		new Name(baseName),
					    	    		Sort.FORMULA,
					    	    		argSorts,
					    	    		false);
					    }
				        }
			            
			                if(p == null) {	                        
			                    p = new Function(new Name(pred_name), 
			                    		     Sort.FORMULA, 
			                    		     argSorts,
			                    		     whereToBind,
			                    		     false);
			                }
					if (lookup(p.name()) != null) {
					    if(!isProblemParser()) {
					        throw new AmbigiousDeclException(p.name().toString(), 
					                                         getSourceName(), 
					                                         getLine(), 
					                                         getColumn());
					                                     
					    }
					}else{
			                  addFunction(p);         
			                }
			            } 
			        }
			match(input,SEMI,FOLLOW_SEMI_in_pred_decl2288); if (state.failed) return;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "pred_decl"



	// $ANTLR start "pred_decls"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2084:1: pred_decls : PREDICATES LBRACE ( pred_decl )* RBRACE ;
	public final void pred_decls() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2085:5: ( PREDICATES LBRACE ( pred_decl )* RBRACE )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2086:9: PREDICATES LBRACE ( pred_decl )* RBRACE
			{
			match(input,PREDICATES,FOLLOW_PREDICATES_in_pred_decls2314); if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_pred_decls2325); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2088:9: ( pred_decl )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==IDENT) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2089:13: pred_decl
					{
					pushFollow(FOLLOW_pred_decl_in_pred_decls2349);
					pred_decl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop40;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_pred_decls2371); if (state.failed) return;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "pred_decls"



	// $ANTLR start "location_ident"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2095:1: location_ident returns [int kind = NORMAL_NONRIGID] : id= simple_ident ;
	public final int location_ident() throws RecognitionException {
		int kind =  NORMAL_NONRIGID;


		String id =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2096:5: (id= simple_ident )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2097:9: id= simple_ident
			{
			pushFollow(FOLLOW_simple_ident_in_location_ident2405);
			id=simple_ident();
			state._fsp--;
			if (state.failed) return kind;
			if ( state.backtracking==0 ) { 
			          if ("Location".equals(id)) {
			             kind = LOCATION_MODIFIER;
			          } else if (!"Location".equals(id)) {
			            semanticError(
			                id+": Attribute of a Non Rigid Function can only be 'Location'");        
			          }
			       }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return kind;
	}
	// $ANTLR end "location_ident"



	// $ANTLR start "func_decl"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2110:1: func_decl : ( UNIQUE )? retSort= any_sortId_check[!skip_functions] func_name= funcpred_name (whereToBind= where_to_bind )? argSorts= arg_sorts[!skip_functions] SEMI ;
	public final void func_decl() throws RecognitionException {
		Sort retSort =null;
		String func_name =null;
		Boolean[] whereToBind =null;
		Sort[] argSorts =null;


		    boolean unique = false;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2114:5: ( ( UNIQUE )? retSort= any_sortId_check[!skip_functions] func_name= funcpred_name (whereToBind= where_to_bind )? argSorts= arg_sorts[!skip_functions] SEMI )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2115:9: ( UNIQUE )? retSort= any_sortId_check[!skip_functions] func_name= funcpred_name (whereToBind= where_to_bind )? argSorts= arg_sorts[!skip_functions] SEMI
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2115:9: ( UNIQUE )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==UNIQUE) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2116:13: UNIQUE
					{
					match(input,UNIQUE,FOLLOW_UNIQUE_in_func_decl2459); if (state.failed) return;
					if ( state.backtracking==0 ) {unique=true;}
					}
					break;

			}

			pushFollow(FOLLOW_any_sortId_check_in_func_decl2495);
			retSort=any_sortId_check(!skip_functions);
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_funcpred_name_in_func_decl2519);
			func_name=funcpred_name();
			state._fsp--;
			if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2123:2: (whereToBind= where_to_bind )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==LBRACE) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2124:6: whereToBind= where_to_bind
					{
					pushFollow(FOLLOW_where_to_bind_in_func_decl2543);
					whereToBind=where_to_bind();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_arg_sorts_in_func_decl2570);
			argSorts=arg_sorts(!skip_functions);
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			            if (!skip_functions) {
			            
				 	if(whereToBind != null 
				 	   && whereToBind.length != argSorts.length) {
			                    semanticError("Where-to-bind list must have same length "
			                                  + "as argument list");
			                } 
			            
			                Function f = null;
			                
				        int separatorIndex = func_name.indexOf("::"); 
				        if (separatorIndex > 0) {
				            String sortName = func_name.substring(0, separatorIndex);
				            String baseName = func_name.substring(separatorIndex + 2);
					    Sort genSort = lookupSort(sortName);
					    
					    if(genSort instanceof GenericSort) {	        	            	
					    	f = SortDependingFunction.createFirstInstance(
					    	    		(GenericSort)genSort,
					    	    		new Name(baseName),
					    	    		retSort,
					    	    		argSorts,
					    	    		unique);
					    }
				        }
				        
				        if(f == null) {
				            f = new Function(new Name(func_name), 
				                             retSort, 
				                             argSorts,
				                             whereToBind,
				                             unique);                    
				        }
					if (lookup(f.name()) != null) {
					    if(!isProblemParser()) {
					      throw new AmbigiousDeclException(f.name().toString(), 
					                                     getSourceName(), 
					                                     getLine(), 
					                                     getColumn());
					    }
					}else{
				    	    addFunction(f);
				        }
			            } 
			        }
			match(input,SEMI,FOLLOW_SEMI_in_func_decl2608); if (state.failed) return;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "func_decl"



	// $ANTLR start "func_decls"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2178:1: func_decls : FUNCTIONS LBRACE ( func_decl )* RBRACE ;
	public final void func_decls() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2179:5: ( FUNCTIONS LBRACE ( func_decl )* RBRACE )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2180:9: FUNCTIONS LBRACE ( func_decl )* RBRACE
			{
			match(input,FUNCTIONS,FOLLOW_FUNCTIONS_in_func_decls2633); if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_func_decls2644); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2182:9: ( func_decl )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==IDENT||LA43_0==UNIQUE) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2183:13: func_decl
					{
					pushFollow(FOLLOW_func_decl_in_func_decls2669);
					func_decl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop43;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_func_decls2691); if (state.failed) return;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "func_decls"



	// $ANTLR start "arg_sorts_or_formula"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2190:1: arg_sorts_or_formula[boolean checkSort] returns [Sort[] argSorts = null] : ( LPAREN (s= sortId_check[checkSort] | FORMULA ) ( COMMA (s= sortId_check[checkSort] | FORMULA ) )* RPAREN )? ;
	public final Sort[] arg_sorts_or_formula(boolean checkSort) throws RecognitionException {
		Sort[] argSorts =  null;


		Sort s =null;


		    List args = new LinkedList();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2194:5: ( ( LPAREN (s= sortId_check[checkSort] | FORMULA ) ( COMMA (s= sortId_check[checkSort] | FORMULA ) )* RPAREN )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2195:9: ( LPAREN (s= sortId_check[checkSort] | FORMULA ) ( COMMA (s= sortId_check[checkSort] | FORMULA ) )* RPAREN )?
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2195:9: ( LPAREN (s= sortId_check[checkSort] | FORMULA ) ( COMMA (s= sortId_check[checkSort] | FORMULA ) )* RPAREN )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==LPAREN) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2196:13: LPAREN (s= sortId_check[checkSort] | FORMULA ) ( COMMA (s= sortId_check[checkSort] | FORMULA ) )* RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_arg_sorts_or_formula2741); if (state.failed) return argSorts;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2198:13: (s= sortId_check[checkSort] | FORMULA )
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==IDENT) ) {
						alt44=1;
					}
					else if ( (LA44_0==FORMULA) ) {
						alt44=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return argSorts;}
						NoViableAltException nvae =
							new NoViableAltException("", 44, 0, input);
						throw nvae;
					}

					switch (alt44) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2198:15: s= sortId_check[checkSort]
							{
							pushFollow(FOLLOW_sortId_check_in_arg_sorts_or_formula2762);
							s=sortId_check(checkSort);
							state._fsp--;
							if (state.failed) return argSorts;
							if ( state.backtracking==0 ) { args.add(s); }
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2199:15: FORMULA
							{
							match(input,FORMULA,FOLLOW_FORMULA_in_arg_sorts_or_formula2781); if (state.failed) return argSorts;
							if ( state.backtracking==0 ) {args.add(Sort.FORMULA);}
							}
							break;

					}

					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2201:13: ( COMMA (s= sortId_check[checkSort] | FORMULA ) )*
					loop46:
					while (true) {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==COMMA) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2202:17: COMMA (s= sortId_check[checkSort] | FORMULA )
							{
							match(input,COMMA,FOLLOW_COMMA_in_arg_sorts_or_formula2818); if (state.failed) return argSorts;
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2202:23: (s= sortId_check[checkSort] | FORMULA )
							int alt45=2;
							int LA45_0 = input.LA(1);
							if ( (LA45_0==IDENT) ) {
								alt45=1;
							}
							else if ( (LA45_0==FORMULA) ) {
								alt45=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return argSorts;}
								NoViableAltException nvae =
									new NoViableAltException("", 45, 0, input);
								throw nvae;
							}

							switch (alt45) {
								case 1 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2202:25: s= sortId_check[checkSort]
									{
									pushFollow(FOLLOW_sortId_check_in_arg_sorts_or_formula2826);
									s=sortId_check(checkSort);
									state._fsp--;
									if (state.failed) return argSorts;
									if ( state.backtracking==0 ) {args.add(s);}
									}
									break;
								case 2 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2203:25: FORMULA
									{
									match(input,FORMULA,FOLLOW_FORMULA_in_arg_sorts_or_formula2855); if (state.failed) return argSorts;
									if ( state.backtracking==0 ) {args.add(Sort.FORMULA);}
									}
									break;

							}

							}
							break;

						default :
							break loop46;
						}
					}

					match(input,RPAREN,FOLLOW_RPAREN_in_arg_sorts_or_formula2889); if (state.failed) return argSorts;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			            argSorts = (Sort[])args.toArray(AN_ARRAY_OF_SORTS);
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return argSorts;
	}
	// $ANTLR end "arg_sorts_or_formula"



	// $ANTLR start "transform_decl"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2213:1: transform_decl : (retSort= any_sortId_check[!skip_transformers] | FORMULA ) trans_name= funcpred_name argSorts= arg_sorts_or_formula[!skip_transformers] SEMI ;
	public final void transform_decl() throws RecognitionException {
		Sort retSort =null;
		String trans_name =null;
		Sort[] argSorts =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2214:5: ( (retSort= any_sortId_check[!skip_transformers] | FORMULA ) trans_name= funcpred_name argSorts= arg_sorts_or_formula[!skip_transformers] SEMI )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2215:9: (retSort= any_sortId_check[!skip_transformers] | FORMULA ) trans_name= funcpred_name argSorts= arg_sorts_or_formula[!skip_transformers] SEMI
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2215:9: (retSort= any_sortId_check[!skip_transformers] | FORMULA )
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==IDENT) ) {
				alt48=1;
			}
			else if ( (LA48_0==FORMULA) ) {
				alt48=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2216:11: retSort= any_sortId_check[!skip_transformers]
					{
					pushFollow(FOLLOW_any_sortId_check_in_transform_decl2953);
					retSort=any_sortId_check(!skip_transformers);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2217:11: FORMULA
					{
					match(input,FORMULA,FOLLOW_FORMULA_in_transform_decl2966); if (state.failed) return;
					if ( state.backtracking==0 ) { retSort = Sort.FORMULA; }
					}
					break;

			}

			pushFollow(FOLLOW_funcpred_name_in_transform_decl2993);
			trans_name=funcpred_name();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_arg_sorts_or_formula_in_transform_decl3008);
			argSorts=arg_sorts_or_formula(!skip_transformers);
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			            if (!skip_transformers) {

			                Transformer t =
			                    new Transformer(new Name(trans_name),
			                                    retSort,
			                                    new ImmutableArray<Sort>(argSorts));

			                if (lookup(t.name()) != null) {
			                    if(!isProblemParser()) {
			                      throw new AmbigiousDeclException(t.name().toString(),
			                                                       getSourceName(),
			                                                       getLine(),
			                                                       getColumn());
			                    }
			                } else {
			                    addFunction(t);
			                }
			            }
			        }
			match(input,SEMI,FOLLOW_SEMI_in_transform_decl3030); if (state.failed) return;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "transform_decl"



	// $ANTLR start "transform_decls"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2247:1: transform_decls : TRANSFORMERS LBRACE ( transform_decl )* RBRACE ;
	public final void transform_decls() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2248:5: ( TRANSFORMERS LBRACE ( transform_decl )* RBRACE )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2249:9: TRANSFORMERS LBRACE ( transform_decl )* RBRACE
			{
			match(input,TRANSFORMERS,FOLLOW_TRANSFORMERS_in_transform_decls3055); if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_transform_decls3065); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2251:9: ( transform_decl )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==FORMULA||LA49_0==IDENT) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2252:13: transform_decl
					{
					pushFollow(FOLLOW_transform_decl_in_transform_decls3089);
					transform_decl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop49;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_transform_decls3111); if (state.failed) return;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "transform_decls"



	// $ANTLR start "arrayopid"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2257:1: arrayopid returns [KeYJavaType _array_op_id = null] : EMPTYBRACKETS LPAREN componentType= keyjavatype RPAREN ;
	public final KeYJavaType arrayopid() throws RecognitionException {
		KeYJavaType _array_op_id =  null;


		KeYJavaType componentType =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2259:5: ( EMPTYBRACKETS LPAREN componentType= keyjavatype RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2260:9: EMPTYBRACKETS LPAREN componentType= keyjavatype RPAREN
			{
			match(input,EMPTYBRACKETS,FOLLOW_EMPTYBRACKETS_in_arrayopid3144); if (state.failed) return _array_op_id;
			match(input,LPAREN,FOLLOW_LPAREN_in_arrayopid3154); if (state.failed) return _array_op_id;
			pushFollow(FOLLOW_keyjavatype_in_arrayopid3168);
			componentType=keyjavatype();
			state._fsp--;
			if (state.failed) return _array_op_id;
			match(input,RPAREN,FOLLOW_RPAREN_in_arrayopid3178); if (state.failed) return _array_op_id;
			}

			if ( state.backtracking==0 ) { _array_op_id = componentType; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _array_op_id;
	}
	// $ANTLR end "arrayopid"



	// $ANTLR start "arg_sorts"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2266:1: arg_sorts[boolean checkSort] returns [Sort[] argSorts = null] : ( LPAREN s= sortId_check[checkSort] ( COMMA s= sortId_check[checkSort] )* RPAREN )? ;
	public final Sort[] arg_sorts(boolean checkSort) throws RecognitionException {
		Sort[] argSorts =  null;


		Sort s =null;


		    List args = new LinkedList();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2270:5: ( ( LPAREN s= sortId_check[checkSort] ( COMMA s= sortId_check[checkSort] )* RPAREN )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2271:9: ( LPAREN s= sortId_check[checkSort] ( COMMA s= sortId_check[checkSort] )* RPAREN )?
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2271:9: ( LPAREN s= sortId_check[checkSort] ( COMMA s= sortId_check[checkSort] )* RPAREN )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==LPAREN) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2272:13: LPAREN s= sortId_check[checkSort] ( COMMA s= sortId_check[checkSort] )* RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_arg_sorts3227); if (state.failed) return argSorts;
					pushFollow(FOLLOW_sortId_check_in_arg_sorts3245);
					s=sortId_check(checkSort);
					state._fsp--;
					if (state.failed) return argSorts;
					if ( state.backtracking==0 ) { args.add(s); }
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2274:13: ( COMMA s= sortId_check[checkSort] )*
					loop50:
					while (true) {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==COMMA) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2275:17: COMMA s= sortId_check[checkSort]
							{
							match(input,COMMA,FOLLOW_COMMA_in_arg_sorts3280); if (state.failed) return argSorts;
							pushFollow(FOLLOW_sortId_check_in_arg_sorts3286);
							s=sortId_check(checkSort);
							state._fsp--;
							if (state.failed) return argSorts;
							if ( state.backtracking==0 ) {args.add(s);}
							}
							break;

						default :
							break loop50;
						}
					}

					match(input,RPAREN,FOLLOW_RPAREN_in_arg_sorts3319); if (state.failed) return argSorts;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			            argSorts = (Sort[])args.toArray(AN_ARRAY_OF_SORTS);
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return argSorts;
	}
	// $ANTLR end "arg_sorts"



	// $ANTLR start "where_to_bind"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2284:1: where_to_bind returns [Boolean[] result = null] : LBRACE ( TRUE | FALSE ) ( COMMA ( TRUE | FALSE ) )* RBRACE ;
	public final Boolean[] where_to_bind() throws RecognitionException {
		Boolean[] result =  null;



		    List<Boolean> list = new ArrayList<Boolean>();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2288:5: ( LBRACE ( TRUE | FALSE ) ( COMMA ( TRUE | FALSE ) )* RBRACE )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2289:9: LBRACE ( TRUE | FALSE ) ( COMMA ( TRUE | FALSE ) )* RBRACE
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_where_to_bind3382); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2290:9: ( TRUE | FALSE )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==TRUE) ) {
				alt52=1;
			}
			else if ( (LA52_0==FALSE) ) {
				alt52=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2291:13: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_where_to_bind3408); if (state.failed) return result;
					if ( state.backtracking==0 ) {list.add(true);}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2291:38: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_where_to_bind3414); if (state.failed) return result;
					if ( state.backtracking==0 ) {list.add(false);}
					}
					break;

			}

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2293:9: ( COMMA ( TRUE | FALSE ) )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==COMMA) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2294:12: COMMA ( TRUE | FALSE )
					{
					match(input,COMMA,FOLLOW_COMMA_in_where_to_bind3453); if (state.failed) return result;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2295:12: ( TRUE | FALSE )
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==TRUE) ) {
						alt53=1;
					}
					else if ( (LA53_0==FALSE) ) {
						alt53=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return result;}
						NoViableAltException nvae =
							new NoViableAltException("", 53, 0, input);
						throw nvae;
					}

					switch (alt53) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2296:16: TRUE
							{
							match(input,TRUE,FOLLOW_TRUE_in_where_to_bind3483); if (state.failed) return result;
							if ( state.backtracking==0 ) {list.add(true);}
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2296:41: FALSE
							{
							match(input,FALSE,FOLLOW_FALSE_in_where_to_bind3489); if (state.failed) return result;
							if ( state.backtracking==0 ) {list.add(false);}
							}
							break;

					}

					}
					break;

				default :
					break loop54;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_where_to_bind3525); if (state.failed) return result;
			if ( state.backtracking==0 ) {
			            result = list.toArray(new Boolean[0]);
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "where_to_bind"



	// $ANTLR start "ruleset_decls"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2305:1: ruleset_decls : HEURISTICSDECL LBRACE (id= simple_ident SEMI )* RBRACE ;
	public final void ruleset_decls() throws RecognitionException {
		String id =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2306:5: ( HEURISTICSDECL LBRACE (id= simple_ident SEMI )* RBRACE )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2307:9: HEURISTICSDECL LBRACE (id= simple_ident SEMI )* RBRACE
			{
			match(input,HEURISTICSDECL,FOLLOW_HEURISTICSDECL_in_ruleset_decls3563); if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_ruleset_decls3573); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2309:9: (id= simple_ident SEMI )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==IDENT) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2310:13: id= simple_ident SEMI
					{
					pushFollow(FOLLOW_simple_ident_in_ruleset_decls3601);
					id=simple_ident();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMI,FOLLOW_SEMI_in_ruleset_decls3603); if (state.failed) return;
					if ( state.backtracking==0 ) { 
					                if (!skip_rulesets) {
					                    RuleSet h = new RuleSet(new Name(id));
					                    if(ruleSets().lookup(new Name(id))==null){
					                        ruleSets().add(h);
					                    }
					                }
					            }
					}
					break;

				default :
					break loop55;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_ruleset_decls3639); if (state.failed) return;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ruleset_decls"



	// $ANTLR start "sortId"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2323:1: sortId returns [Sort _sort_id = null] : s= sortId_check[true] ;
	public final Sort sortId() throws RecognitionException {
		Sort _sort_id =  null;


		Sort s =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2325:5: (s= sortId_check[true] )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2326:9: s= sortId_check[true]
			{
			pushFollow(FOLLOW_sortId_check_in_sortId3676);
			s=sortId_check(true);
			state._fsp--;
			if (state.failed) return _sort_id;
			}

			if ( state.backtracking==0 ) { _sort_id = s; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _sort_id;
	}
	// $ANTLR end "sortId"



	// $ANTLR start "sortId_check"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2330:1: sortId_check[boolean checkSort] returns [Sort _sort_id_check = null] : p= sortId_check_help[checkSort] s= array_decls[p, checkSort] ;
	public final Sort sortId_check(boolean checkSort) throws RecognitionException {
		Sort _sort_id_check =  null;


		Pair<Sort,Type> p =null;
		Sort s =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2332:5: (p= sortId_check_help[checkSort] s= array_decls[p, checkSort] )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2333:9: p= sortId_check_help[checkSort] s= array_decls[p, checkSort]
			{
			pushFollow(FOLLOW_sortId_check_help_in_sortId_check3744);
			p=sortId_check_help(checkSort);
			state._fsp--;
			if (state.failed) return _sort_id_check;
			pushFollow(FOLLOW_array_decls_in_sortId_check3759);
			s=array_decls(p, checkSort);
			state._fsp--;
			if (state.failed) return _sort_id_check;
			}

			if ( state.backtracking==0 ) { _sort_id_check = s; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _sort_id_check;
	}
	// $ANTLR end "sortId_check"



	// $ANTLR start "any_sortId_check"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2338:1: any_sortId_check[boolean checkSort] returns [Sort _any_sort_id_check = null] : p= any_sortId_check_help[checkSort] s= array_decls[p, checkSort] ;
	public final Sort any_sortId_check(boolean checkSort) throws RecognitionException {
		Sort _any_sort_id_check =  null;


		Pair<Sort,Type> p =null;
		Sort s =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2340:5: (p= any_sortId_check_help[checkSort] s= array_decls[p, checkSort] )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2341:9: p= any_sortId_check_help[checkSort] s= array_decls[p, checkSort]
			{
			pushFollow(FOLLOW_any_sortId_check_help_in_any_sortId_check3819);
			p=any_sortId_check_help(checkSort);
			state._fsp--;
			if (state.failed) return _any_sort_id_check;
			pushFollow(FOLLOW_array_decls_in_any_sortId_check3834);
			s=array_decls(p, checkSort);
			state._fsp--;
			if (state.failed) return _any_sort_id_check;
			}

			if ( state.backtracking==0 ) { _any_sort_id_check = s; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _any_sort_id_check;
	}
	// $ANTLR end "any_sortId_check"



	// $ANTLR start "sortId_check_help"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2347:1: sortId_check_help[boolean checkSort] returns [Pair<Sort,Type> _sort_id_check_help = null] : result= any_sortId_check_help[checkSort] ;
	public final Pair<Sort,Type> sortId_check_help(boolean checkSort) throws RecognitionException {
		Pair<Sort,Type> _sort_id_check_help =  null;


		Pair<Sort,Type> result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2349:5: (result= any_sortId_check_help[checkSort] )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2350:9: result= any_sortId_check_help[checkSort]
			{
			pushFollow(FOLLOW_any_sortId_check_help_in_sortId_check_help3884);
			result=any_sortId_check_help(checkSort);
			state._fsp--;
			if (state.failed) return _sort_id_check_help;
			if ( state.backtracking==0 ) {
			            // don't allow generic sorts or collection sorts of
			            // generic sorts at this point
			            Sort s = result.first;
			            while ( s instanceof ArraySort ) {
			            	s = ((ArraySort)s).elementSort ();
			            }

			            if ( s instanceof GenericSort ) {
			                throw new GenericSortException ( "sort",
			                    "Non-generic sort expected", s,
			                    getSourceName (), getLine (), getColumn () );
			            }
			        }
			}

			if ( state.backtracking==0 ) { _sort_id_check_help = result; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _sort_id_check_help;
	}
	// $ANTLR end "sortId_check_help"



	// $ANTLR start "any_sortId_check_help"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2369:1: any_sortId_check_help[boolean checkSort] returns [Pair<Sort,Type> result = null] : name= simple_sort_name ;
	public final Pair<Sort,Type> any_sortId_check_help(boolean checkSort) throws RecognitionException {
		Pair<Sort,Type> result =  null;


		String name =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2370:5: (name= simple_sort_name )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2371:9: name= simple_sort_name
			{
			pushFollow(FOLLOW_simple_sort_name_in_any_sortId_check_help3936);
			name=simple_sort_name();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
			            //Special handling for byte, char, short, long:
			            //these are *not* sorts, but they are nevertheless valid
			            //prefixes for array sorts such as byte[], char[][][].
			            //Thus, we consider them aliases for the "int" sort, and remember
			            //the corresponding Java type for the case that an array sort 
			            //is being declared.
			            Type t = null;            
			            if(name.equals(PrimitiveType.JAVA_BYTE.getName())) {
			                t = PrimitiveType.JAVA_BYTE;
			                name = PrimitiveType.JAVA_INT.getName();
			            } else if(name.equals(PrimitiveType.JAVA_CHAR.getName())) {
			                t = PrimitiveType.JAVA_CHAR;
			                name = PrimitiveType.JAVA_INT.getName();            
			            } else if(name.equals(PrimitiveType.JAVA_SHORT.getName())) {
			                t = PrimitiveType.JAVA_SHORT;
			                name = PrimitiveType.JAVA_INT.getName();
			            } else if(name.equals(PrimitiveType.JAVA_INT.getName())) {
			                t = PrimitiveType.JAVA_INT;
			                name = PrimitiveType.JAVA_INT.getName();
			            } else if(name.equals(PrimitiveType.JAVA_LONG.getName())) {
			                t = PrimitiveType.JAVA_LONG;
			                name = PrimitiveType.JAVA_INT.getName();
			            } else if(name.equals(PrimitiveType.JAVA_BIGINT.getName())){
			                t = PrimitiveType.JAVA_BIGINT;
			                name = PrimitiveType.JAVA_BIGINT.getName();
			            }
			            
			            Sort s = null;
			            if(checkSort) {
			                s = lookupSort(name);
			                if(s == null) {
			                  throw new NotDeclException(input, "sort", name);
			                }
			            }
			            
			            result = new Pair<Sort,Type>(s, t);
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "any_sortId_check_help"



	// $ANTLR start "array_decls"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2413:1: array_decls[Pair<Sort,Type> p, boolean checksort] returns [Sort s = null] : ( EMPTYBRACKETS )* ;
	public final Sort array_decls(Pair<Sort,Type> p, boolean checksort) throws RecognitionException {
		Sort s =  null;



		    int n = 0;    

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2417:5: ( ( EMPTYBRACKETS )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2418:6: ( EMPTYBRACKETS )*
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2418:6: ( EMPTYBRACKETS )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==EMPTYBRACKETS) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2418:7: EMPTYBRACKETS
					{
					match(input,EMPTYBRACKETS,FOLLOW_EMPTYBRACKETS_in_array_decls3996); if (state.failed) return s;
					if ( state.backtracking==0 ) {n++;}
					}
					break;

				default :
					break loop56;
				}
			}

			if ( state.backtracking==0 ) {   if (!checksort) return s;
			            if(n != 0) {
			                final JavaInfo ji = getJavaInfo();
			                s = ArraySort.getArraySortForDim(p.first,
			                				 p.second, 
			                			         n, 
			                			         ji.objectSort(),
			                                                 ji.cloneableSort(), 
			                                                 ji.serializableSort());

			                Sort last = s;
			                do {
			                    final ArraySort as = (ArraySort) last;
			                    sorts().add(as);                        
			                    last = as.elementSort();
			                } while (last instanceof ArraySort && sorts().lookup(last.name()) == null);
			            } else {
			                s = p.first;
			            }
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "array_decls"



	// $ANTLR start "id_declaration"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2441:1: id_declaration returns [ IdDeclaration idd = null ] : id= IDENT ( COLON s= sortId_check[true] )? ;
	public final IdDeclaration id_declaration() throws RecognitionException {
		IdDeclaration idd =  null;


		Token id=null;
		Sort s =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2442:5: (id= IDENT ( COLON s= sortId_check[true] )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2443:9: id= IDENT ( COLON s= sortId_check[true] )?
			{
			id=(Token)match(input,IDENT,FOLLOW_IDENT_in_id_declaration4046); if (state.failed) return idd;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2444:9: ( COLON s= sortId_check[true] )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==COLON) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2444:11: COLON s= sortId_check[true]
					{
					match(input,COLON,FOLLOW_COLON_in_id_declaration4058); if (state.failed) return idd;
					pushFollow(FOLLOW_sortId_check_in_id_declaration4064);
					s=sortId_check(true);
					state._fsp--;
					if (state.failed) return idd;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			            idd = new IdDeclaration ( id.getText (), s );
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return idd;
	}
	// $ANTLR end "id_declaration"



	// $ANTLR start "funcpred_name"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2450:1: funcpred_name returns [String result = null] : ( ( sort_name DOUBLECOLON )=> (prefix= sort_name DOUBLECOLON name= simple_ident ) | (prefix= simple_ident ) );
	public final String funcpred_name() throws RecognitionException {
		String result =  null;


		String prefix =null;
		String name =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2451:5: ( ( sort_name DOUBLECOLON )=> (prefix= sort_name DOUBLECOLON name= simple_ident ) | (prefix= simple_ident ) )
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==IDENT) ) {
				int LA58_1 = input.LA(2);
				if ( (synpred1_KeYParser()) ) {
					alt58=1;
				}
				else if ( (true) ) {
					alt58=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}

			switch (alt58) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2453:5: ( sort_name DOUBLECOLON )=> (prefix= sort_name DOUBLECOLON name= simple_ident )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2453:32: (prefix= sort_name DOUBLECOLON name= simple_ident )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2453:33: prefix= sort_name DOUBLECOLON name= simple_ident
					{
					pushFollow(FOLLOW_sort_name_in_funcpred_name4123);
					prefix=sort_name();
					state._fsp--;
					if (state.failed) return result;
					match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_funcpred_name4134); if (state.failed) return result;
					pushFollow(FOLLOW_simple_ident_in_funcpred_name4140);
					name=simple_ident();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) {result = prefix + "::" + name;}
					}

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2456:5: (prefix= simple_ident )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2456:5: (prefix= simple_ident )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2456:6: prefix= simple_ident
					{
					pushFollow(FOLLOW_simple_ident_in_funcpred_name4159);
					prefix=simple_ident();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) {result = prefix; }
					}

					}
					break;

			}
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "funcpred_name"



	// $ANTLR start "simple_sort_name"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2461:1: simple_sort_name returns [String name = \"\"] : id= simple_ident_dots ;
	public final String simple_sort_name() throws RecognitionException {
		String name =  "";


		String id =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2462:5: (id= simple_ident_dots )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2463:9: id= simple_ident_dots
			{
			pushFollow(FOLLOW_simple_ident_dots_in_simple_sort_name4193);
			id=simple_ident_dots();
			state._fsp--;
			if (state.failed) return name;
			if ( state.backtracking==0 ) { name = id; }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "simple_sort_name"



	// $ANTLR start "sort_name"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2467:1: sort_name returns [String _sort_name = null] : name= simple_sort_name (brackets= EMPTYBRACKETS )* ;
	public final String sort_name() throws RecognitionException {
		String _sort_name =  null;


		Token brackets=null;
		String name =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2469:5: (name= simple_sort_name (brackets= EMPTYBRACKETS )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2470:9: name= simple_sort_name (brackets= EMPTYBRACKETS )*
			{
			pushFollow(FOLLOW_simple_sort_name_in_sort_name4235);
			name=simple_sort_name();
			state._fsp--;
			if (state.failed) return _sort_name;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2471:9: (brackets= EMPTYBRACKETS )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==EMPTYBRACKETS) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2471:10: brackets= EMPTYBRACKETS
					{
					brackets=(Token)match(input,EMPTYBRACKETS,FOLLOW_EMPTYBRACKETS_in_sort_name4248); if (state.failed) return _sort_name;
					if ( state.backtracking==0 ) {name += brackets.getText();}
					}
					break;

				default :
					break loop59;
				}
			}

			}

			if ( state.backtracking==0 ) { _sort_name = name; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _sort_name;
	}
	// $ANTLR end "sort_name"



	// $ANTLR start "formula"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2482:1: formula returns [Term _formula = null] : a= term ;
	public final Term formula() throws RecognitionException {
		Term _formula =  null;


		Term a =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2484:5: (a= term )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2485:9: a= term
			{
			pushFollow(FOLLOW_term_in_formula4291);
			a=term();
			state._fsp--;
			if (state.failed) return _formula;
			if ( state.backtracking==0 ) {
			            if (a != null && a.sort() != Sort.FORMULA ) {
			                semanticError("Just Parsed a Term where a Formula was expected.");
			            }
			        }
			}

			if ( state.backtracking==0 ) { _formula = a; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _formula;
	}
	// $ANTLR end "formula"



	// $ANTLR start "term"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2493:1: term returns [Term _term = null] : result= elementary_update_term ( PARALLEL a= elementary_update_term )* ;
	public final Term term() throws RecognitionException {
		Term _term =  null;


		Term result =null;
		Term a =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2495:5: (result= elementary_update_term ( PARALLEL a= elementary_update_term )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2496:9: result= elementary_update_term ( PARALLEL a= elementary_update_term )*
			{
			pushFollow(FOLLOW_elementary_update_term_in_term4338);
			result=elementary_update_term();
			state._fsp--;
			if (state.failed) return _term;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2497:9: ( PARALLEL a= elementary_update_term )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==PARALLEL) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2498:12: PARALLEL a= elementary_update_term
					{
					match(input,PARALLEL,FOLLOW_PARALLEL_in_term4361); if (state.failed) return _term;
					pushFollow(FOLLOW_elementary_update_term_in_term4365);
					a=elementary_update_term();
					state._fsp--;
					if (state.failed) return _term;
					if ( state.backtracking==0 ) {
					               result = getTermFactory().createTerm(UpdateJunctor.PARALLEL_UPDATE, result, a);
					           }
					}
					break;

				default :
					break loop60;
				}
			}

			}

			if ( state.backtracking==0 ) { _term = result; }
		}
		catch (TermCreationException ex) {

			              raiseException
					(new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _term;
	}
	// $ANTLR end "term"



	// $ANTLR start "elementary_update_term"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2511:1: elementary_update_term returns [Term _elementary_update_term=null] : result= equivalence_term ( ASSIGN a= equivalence_term )? ;
	public final Term elementary_update_term() throws RecognitionException {
		Term _elementary_update_term = null;


		Term result =null;
		Term a =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2513:9: (result= equivalence_term ( ASSIGN a= equivalence_term )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2514:9: result= equivalence_term ( ASSIGN a= equivalence_term )?
			{
			pushFollow(FOLLOW_equivalence_term_in_elementary_update_term4464);
			result=equivalence_term();
			state._fsp--;
			if (state.failed) return _elementary_update_term;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2515:9: ( ASSIGN a= equivalence_term )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==ASSIGN) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2516:13: ASSIGN a= equivalence_term
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_elementary_update_term4489); if (state.failed) return _elementary_update_term;
					pushFollow(FOLLOW_equivalence_term_in_elementary_update_term4493);
					a=equivalence_term();
					state._fsp--;
					if (state.failed) return _elementary_update_term;
					if ( state.backtracking==0 ) {
					                result = getServices().getTermBuilder().elementary(result, a);
					            }
					}
					break;

			}

			}

			if ( state.backtracking==0 ) { _elementary_update_term = result; }
		}
		catch (TermCreationException ex) {

			              raiseException
						(new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _elementary_update_term;
	}
	// $ANTLR end "elementary_update_term"



	// $ANTLR start "equivalence_term"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2528:1: equivalence_term returns [Term _equivalence_term = null] : a= implication_term ( EQV a1= implication_term )* ;
	public final Term equivalence_term() throws RecognitionException {
		Term _equivalence_term =  null;


		Term a =null;
		Term a1 =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2530:5: (a= implication_term ( EQV a1= implication_term )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2530:9: a= implication_term ( EQV a1= implication_term )*
			{
			pushFollow(FOLLOW_implication_term_in_equivalence_term4562);
			a=implication_term();
			state._fsp--;
			if (state.failed) return _equivalence_term;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2531:9: ( EQV a1= implication_term )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==EQV) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2531:10: EQV a1= implication_term
					{
					match(input,EQV,FOLLOW_EQV_in_equivalence_term4574); if (state.failed) return _equivalence_term;
					pushFollow(FOLLOW_implication_term_in_equivalence_term4578);
					a1=implication_term();
					state._fsp--;
					if (state.failed) return _equivalence_term;
					if ( state.backtracking==0 ) { a = getTermFactory().createTerm(Equality.EQV, new Term[]{a, a1});}
					}
					break;

				default :
					break loop62;
				}
			}

			}

			if ( state.backtracking==0 ) { _equivalence_term = a; }
		}
		catch (TermCreationException ex) {

			              raiseException
			                (new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _equivalence_term;
	}
	// $ANTLR end "equivalence_term"



	// $ANTLR start "implication_term"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2539:1: implication_term returns [Term _implication_term = null] : a= disjunction_term ( IMP a1= implication_term )? ;
	public final Term implication_term() throws RecognitionException {
		Term _implication_term =  null;


		Term a =null;
		Term a1 =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2541:5: (a= disjunction_term ( IMP a1= implication_term )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2541:9: a= disjunction_term ( IMP a1= implication_term )?
			{
			pushFollow(FOLLOW_disjunction_term_in_implication_term4636);
			a=disjunction_term();
			state._fsp--;
			if (state.failed) return _implication_term;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2542:9: ( IMP a1= implication_term )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==IMP) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2542:10: IMP a1= implication_term
					{
					match(input,IMP,FOLLOW_IMP_in_implication_term4648); if (state.failed) return _implication_term;
					pushFollow(FOLLOW_implication_term_in_implication_term4652);
					a1=implication_term();
					state._fsp--;
					if (state.failed) return _implication_term;
					if ( state.backtracking==0 ) { a = getTermFactory().createTerm(Junctor.IMP, new Term[]{a, a1});}
					}
					break;

			}

			}

			if ( state.backtracking==0 ) { _implication_term = a; }
		}
		catch (TermCreationException ex) {

			              raiseException
			                (new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _implication_term;
	}
	// $ANTLR end "implication_term"



	// $ANTLR start "disjunction_term"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2550:1: disjunction_term returns [Term _disjunction_term = null] : a= conjunction_term ( OR a1= conjunction_term )* ;
	public final Term disjunction_term() throws RecognitionException {
		Term _disjunction_term =  null;


		Term a =null;
		Term a1 =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2552:5: (a= conjunction_term ( OR a1= conjunction_term )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2552:9: a= conjunction_term ( OR a1= conjunction_term )*
			{
			pushFollow(FOLLOW_conjunction_term_in_disjunction_term4711);
			a=conjunction_term();
			state._fsp--;
			if (state.failed) return _disjunction_term;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2553:9: ( OR a1= conjunction_term )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==OR) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2553:10: OR a1= conjunction_term
					{
					match(input,OR,FOLLOW_OR_in_disjunction_term4723); if (state.failed) return _disjunction_term;
					pushFollow(FOLLOW_conjunction_term_in_disjunction_term4727);
					a1=conjunction_term();
					state._fsp--;
					if (state.failed) return _disjunction_term;
					if ( state.backtracking==0 ) { a = getTermFactory().createTerm(Junctor.OR, new Term[]{a, a1});}
					}
					break;

				default :
					break loop64;
				}
			}

			}

			if ( state.backtracking==0 ) { _disjunction_term = a; }
		}
		catch (TermCreationException ex) {

			              raiseException
			                (new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _disjunction_term;
	}
	// $ANTLR end "disjunction_term"



	// $ANTLR start "conjunction_term"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2561:1: conjunction_term returns [Term _conjunction_term = null] : a= term60 ( AND a1= term60 )* ;
	public final Term conjunction_term() throws RecognitionException {
		Term _conjunction_term =  null;


		Term a =null;
		Term a1 =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2563:5: (a= term60 ( AND a1= term60 )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2563:9: a= term60 ( AND a1= term60 )*
			{
			pushFollow(FOLLOW_term60_in_conjunction_term4786);
			a=term60();
			state._fsp--;
			if (state.failed) return _conjunction_term;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2564:9: ( AND a1= term60 )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==AND) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2564:10: AND a1= term60
					{
					match(input,AND,FOLLOW_AND_in_conjunction_term4798); if (state.failed) return _conjunction_term;
					pushFollow(FOLLOW_term60_in_conjunction_term4802);
					a1=term60();
					state._fsp--;
					if (state.failed) return _conjunction_term;
					if ( state.backtracking==0 ) { a = getTermFactory().createTerm(Junctor.AND, new Term[]{a, a1});}
					}
					break;

				default :
					break loop65;
				}
			}

			}

			if ( state.backtracking==0 ) { _conjunction_term = a; }
		}
		catch (TermCreationException ex) {

			              raiseException
					(new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _conjunction_term;
	}
	// $ANTLR end "conjunction_term"



	// $ANTLR start "term60"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2573:1: term60 returns [Term _term_60 = null] : (a= unary_formula |a= equality_term );
	public final Term term60() throws RecognitionException {
		Term _term_60 =  null;


		Term a =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2575:5: (a= unary_formula |a= equality_term )
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==EXISTS||LA66_0==FORALL||LA66_0==MODALITY||LA66_0==NOT) ) {
				alt66=1;
			}
			else if ( (LA66_0==AT||LA66_0==CHAR_LITERAL||LA66_0==FALSE||(LA66_0 >= IDENT && LA66_0 <= IFEX)||LA66_0==LBRACE||LA66_0==LPAREN||LA66_0==MINUS||LA66_0==NUM_LITERAL||LA66_0==STRING_LITERAL||LA66_0==TRUE) ) {
				alt66=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return _term_60;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}

			switch (alt66) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2576:9: a= unary_formula
					{
					pushFollow(FOLLOW_unary_formula_in_term604882);
					a=unary_formula();
					state._fsp--;
					if (state.failed) return _term_60;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2577:9: a= equality_term
					{
					pushFollow(FOLLOW_equality_term_in_term604896);
					a=equality_term();
					state._fsp--;
					if (state.failed) return _term_60;
					}
					break;

			}
			if ( state.backtracking==0 ) { _term_60 = a; }
		}
		catch (TermCreationException ex) {

			              raiseException
			                (new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _term_60;
	}
	// $ANTLR end "term60"



	// $ANTLR start "unary_formula"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2584:1: unary_formula returns [Term _unary_formula = null] : ( NOT a1= term60 |a= quantifierterm |a= modality_dl_term );
	public final Term unary_formula() throws RecognitionException {
		Term _unary_formula =  null;


		Term a1 =null;
		Term a =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2586:5: ( NOT a1= term60 |a= quantifierterm |a= modality_dl_term )
			int alt67=3;
			switch ( input.LA(1) ) {
			case NOT:
				{
				alt67=1;
				}
				break;
			case EXISTS:
			case FORALL:
				{
				alt67=2;
				}
				break;
			case MODALITY:
				{
				alt67=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return _unary_formula;}
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}
			switch (alt67) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2587:9: NOT a1= term60
					{
					match(input,NOT,FOLLOW_NOT_in_unary_formula4942); if (state.failed) return _unary_formula;
					pushFollow(FOLLOW_term60_in_unary_formula4949);
					a1=term60();
					state._fsp--;
					if (state.failed) return _unary_formula;
					if ( state.backtracking==0 ) { a = getTermFactory().createTerm(Junctor.NOT,new Term[]{a1}); }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2588:7: a= quantifierterm
					{
					pushFollow(FOLLOW_quantifierterm_in_unary_formula4963);
					a=quantifierterm();
					state._fsp--;
					if (state.failed) return _unary_formula;
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2589:9: a= modality_dl_term
					{
					pushFollow(FOLLOW_modality_dl_term_in_unary_formula4978);
					a=modality_dl_term();
					state._fsp--;
					if (state.failed) return _unary_formula;
					}
					break;

			}
			if ( state.backtracking==0 ) { _unary_formula = a; }
		}
		catch (TermCreationException ex) {

			              raiseException
			                (new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _unary_formula;
	}
	// $ANTLR end "unary_formula"



	// $ANTLR start "equality_term"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2597:1: equality_term returns [Term _equality_term = null] : a= logicTermReEntry ( ( EQUALS | NOT_EQUALS )=> ( EQUALS | NOT_EQUALS ) a1= logicTermReEntry )? ;
	public final Term equality_term() throws RecognitionException {
		Term _equality_term =  null;


		Term a =null;
		Term a1 =null;


		    boolean negated = false;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2602:5: (a= logicTermReEntry ( ( EQUALS | NOT_EQUALS )=> ( EQUALS | NOT_EQUALS ) a1= logicTermReEntry )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2603:9: a= logicTermReEntry ( ( EQUALS | NOT_EQUALS )=> ( EQUALS | NOT_EQUALS ) a1= logicTermReEntry )?
			{
			pushFollow(FOLLOW_logicTermReEntry_in_equality_term5033);
			a=logicTermReEntry();
			state._fsp--;
			if (state.failed) return _equality_term;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2605:9: ( ( EQUALS | NOT_EQUALS )=> ( EQUALS | NOT_EQUALS ) a1= logicTermReEntry )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==EQUALS) ) {
				int LA69_1 = input.LA(2);
				if ( (synpred2_KeYParser()) ) {
					alt69=1;
				}
			}
			else if ( (LA69_0==NOT_EQUALS) ) {
				int LA69_2 = input.LA(2);
				if ( (synpred2_KeYParser()) ) {
					alt69=1;
				}
			}
			switch (alt69) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2605:12: ( EQUALS | NOT_EQUALS )=> ( EQUALS | NOT_EQUALS ) a1= logicTermReEntry
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2606:8: ( EQUALS | NOT_EQUALS )
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==EQUALS) ) {
						alt68=1;
					}
					else if ( (LA68_0==NOT_EQUALS) ) {
						alt68=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return _equality_term;}
						NoViableAltException nvae =
							new NoViableAltException("", 68, 0, input);
						throw nvae;
					}

					switch (alt68) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2606:9: EQUALS
							{
							match(input,EQUALS,FOLLOW_EQUALS_in_equality_term5074); if (state.failed) return _equality_term;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2606:18: NOT_EQUALS
							{
							match(input,NOT_EQUALS,FOLLOW_NOT_EQUALS_in_equality_term5078); if (state.failed) return _equality_term;
							if ( state.backtracking==0 ) {negated = true;}
							}
							break;

					}

					pushFollow(FOLLOW_logicTermReEntry_in_equality_term5087);
					a1=logicTermReEntry();
					state._fsp--;
					if (state.failed) return _equality_term;
					if ( state.backtracking==0 ) { 
					                if (a.sort() == Sort.FORMULA ||
					                    a1.sort() == Sort.FORMULA) {
					                    String errorMessage = 
					                    "The term equality \'=\'/\'!=\' is not "+
					                    "allowed between formulas.\n Please use \'" + Equality.EQV +
					                    "\' in combination with \'" + Junctor.NOT + "\' instead.";
					                if (a.op() == Junctor.TRUE || a.op() == Junctor.FALSE ||
					                    a1.op() == Junctor.TRUE || a1.op() == Junctor.FALSE) {
					                    errorMessage += 
					                    " It seems as if you have mixed up the boolean " +
					                    "constants \'TRUE\'/\'FALSE\' " +
					                    "with the formulas \'true\'/\'false\'.";
					                }
					                semanticError(errorMessage);
					            }
					            a = getTermFactory().createTerm(Equality.EQUALS, a, a1);

					            if (negated) {
					              a = getTermFactory().createTerm(Junctor.NOT, a);
					            }
					        }
					}
					break;

			}

			}

			if ( state.backtracking==0 ) { _equality_term = a; }
		}
		catch (TermCreationException ex) {

			              raiseException
			                (new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _equality_term;
	}
	// $ANTLR end "equality_term"



	// $ANTLR start "relation_op"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2635:1: relation_op returns [Function op = null] : ( LESS | LESSEQUAL | GREATER | GREATEREQUAL ) ;
	public final Function relation_op() throws RecognitionException {
		Function op =  null;



		  String op_name = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2639:2: ( ( LESS | LESSEQUAL | GREATER | GREATEREQUAL ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2640:2: ( LESS | LESSEQUAL | GREATER | GREATEREQUAL )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2640:2: ( LESS | LESSEQUAL | GREATER | GREATEREQUAL )
			int alt70=4;
			switch ( input.LA(1) ) {
			case LESS:
				{
				alt70=1;
				}
				break;
			case LESSEQUAL:
				{
				alt70=2;
				}
				break;
			case GREATER:
				{
				alt70=3;
				}
				break;
			case GREATEREQUAL:
				{
				alt70=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return op;}
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}
			switch (alt70) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2641:5: LESS
					{
					match(input,LESS,FOLLOW_LESS_in_relation_op5142); if (state.failed) return op;
					if ( state.backtracking==0 ) { op_name = "lt"; }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2642:5: LESSEQUAL
					{
					match(input,LESSEQUAL,FOLLOW_LESSEQUAL_in_relation_op5158); if (state.failed) return op;
					if ( state.backtracking==0 ) { op_name = "leq"; }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2643:5: GREATER
					{
					match(input,GREATER,FOLLOW_GREATER_in_relation_op5169); if (state.failed) return op;
					if ( state.backtracking==0 ) { op_name = "gt"; }
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2644:5: GREATEREQUAL
					{
					match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_relation_op5182); if (state.failed) return op;
					if ( state.backtracking==0 ) { op_name = "geq"; }
					}
					break;

			}

			if ( state.backtracking==0 ) {
			     op = (Function) functions().lookup(new Name(op_name)); 
			     if(op == null) {
			       semanticError("Function symbol '"+op_name+"' not found.");
			     }
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "relation_op"



	// $ANTLR start "weak_arith_op"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2653:1: weak_arith_op returns [Function op = null] : ( PLUS | MINUS ) ;
	public final Function weak_arith_op() throws RecognitionException {
		Function op =  null;



		  String op_name = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2657:2: ( ( PLUS | MINUS ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2658:2: ( PLUS | MINUS )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2658:2: ( PLUS | MINUS )
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==PLUS) ) {
				alt71=1;
			}
			else if ( (LA71_0==MINUS) ) {
				alt71=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return op;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2659:5: PLUS
					{
					match(input,PLUS,FOLLOW_PLUS_in_weak_arith_op5213); if (state.failed) return op;
					if ( state.backtracking==0 ) { op_name = "add"; }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2660:5: MINUS
					{
					match(input,MINUS,FOLLOW_MINUS_in_weak_arith_op5229); if (state.failed) return op;
					if ( state.backtracking==0 ) { op_name = "sub"; }
					}
					break;

			}

			if ( state.backtracking==0 ) {
			     op = (Function) functions().lookup(new Name(op_name)); 
			     if(op == null) {
			       semanticError("Function symbol '"+op_name+"' not found.");
			     }
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "weak_arith_op"



	// $ANTLR start "strong_arith_op"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2669:1: strong_arith_op returns [Function op = null] : ( STAR | SLASH | PERCENT ) ;
	public final Function strong_arith_op() throws RecognitionException {
		Function op =  null;



		  String op_name = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2673:2: ( ( STAR | SLASH | PERCENT ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2674:2: ( STAR | SLASH | PERCENT )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2674:2: ( STAR | SLASH | PERCENT )
			int alt72=3;
			switch ( input.LA(1) ) {
			case STAR:
				{
				alt72=1;
				}
				break;
			case SLASH:
				{
				alt72=2;
				}
				break;
			case PERCENT:
				{
				alt72=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return op;}
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}
			switch (alt72) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2675:5: STAR
					{
					match(input,STAR,FOLLOW_STAR_in_strong_arith_op5267); if (state.failed) return op;
					if ( state.backtracking==0 ) { op_name = "mul"; }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2676:5: SLASH
					{
					match(input,SLASH,FOLLOW_SLASH_in_strong_arith_op5283); if (state.failed) return op;
					if ( state.backtracking==0 ) { op_name = "div"; }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2677:5: PERCENT
					{
					match(input,PERCENT,FOLLOW_PERCENT_in_strong_arith_op5298); if (state.failed) return op;
					if ( state.backtracking==0 ) { op_name = "mod"; }
					}
					break;

			}

			if ( state.backtracking==0 ) {
			     op = (Function) functions().lookup(new Name(op_name)); 
			     if(op == null) {
			       semanticError("Function symbol '"+op_name+"' not found.");
			     }
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "strong_arith_op"



	// $ANTLR start "logicTermReEntry"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2687:1: logicTermReEntry returns [Term _logic_term_re_entry = null] : a= weak_arith_op_term ( ( relation_op )=>op= relation_op a1= weak_arith_op_term )? ;
	public final Term logicTermReEntry() throws RecognitionException {
		Term _logic_term_re_entry =  null;


		Term a =null;
		Function op =null;
		Term a1 =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2689:4: (a= weak_arith_op_term ( ( relation_op )=>op= relation_op a1= weak_arith_op_term )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2690:4: a= weak_arith_op_term ( ( relation_op )=>op= relation_op a1= weak_arith_op_term )?
			{
			pushFollow(FOLLOW_weak_arith_op_term_in_logicTermReEntry5336);
			a=weak_arith_op_term();
			state._fsp--;
			if (state.failed) return _logic_term_re_entry;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2690:27: ( ( relation_op )=>op= relation_op a1= weak_arith_op_term )?
			int alt73=2;
			switch ( input.LA(1) ) {
				case LESS:
					{
					int LA73_1 = input.LA(2);
					if ( (synpred3_KeYParser()) ) {
						alt73=1;
					}
					}
					break;
				case LESSEQUAL:
					{
					int LA73_2 = input.LA(2);
					if ( (synpred3_KeYParser()) ) {
						alt73=1;
					}
					}
					break;
				case GREATER:
					{
					int LA73_3 = input.LA(2);
					if ( (synpred3_KeYParser()) ) {
						alt73=1;
					}
					}
					break;
				case GREATEREQUAL:
					{
					int LA73_4 = input.LA(2);
					if ( (synpred3_KeYParser()) ) {
						alt73=1;
					}
					}
					break;
			}
			switch (alt73) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2690:28: ( relation_op )=>op= relation_op a1= weak_arith_op_term
					{
					pushFollow(FOLLOW_relation_op_in_logicTermReEntry5349);
					op=relation_op();
					state._fsp--;
					if (state.failed) return _logic_term_re_entry;
					pushFollow(FOLLOW_weak_arith_op_term_in_logicTermReEntry5353);
					a1=weak_arith_op_term();
					state._fsp--;
					if (state.failed) return _logic_term_re_entry;
					if ( state.backtracking==0 ) {
					                 a = getTermFactory().createTerm(op, a, a1);
					              }
					}
					break;

			}

			}

			if ( state.backtracking==0 ) { _logic_term_re_entry = a; }
		}
		catch (TermCreationException ex) {

			              raiseException
			                (new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _logic_term_re_entry;
	}
	// $ANTLR end "logicTermReEntry"



	// $ANTLR start "weak_arith_op_term"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2700:1: weak_arith_op_term returns [Term _weak_arith_op_term = null] : a= strong_arith_op_term ( ( weak_arith_op )=>op= weak_arith_op a1= strong_arith_op_term )* ;
	public final Term weak_arith_op_term() throws RecognitionException {
		Term _weak_arith_op_term =  null;


		Term a =null;
		Function op =null;
		Term a1 =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2702:4: (a= strong_arith_op_term ( ( weak_arith_op )=>op= weak_arith_op a1= strong_arith_op_term )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2703:4: a= strong_arith_op_term ( ( weak_arith_op )=>op= weak_arith_op a1= strong_arith_op_term )*
			{
			pushFollow(FOLLOW_strong_arith_op_term_in_weak_arith_op_term5397);
			a=strong_arith_op_term();
			state._fsp--;
			if (state.failed) return _weak_arith_op_term;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2703:29: ( ( weak_arith_op )=>op= weak_arith_op a1= strong_arith_op_term )*
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==PLUS) ) {
					int LA74_26 = input.LA(2);
					if ( (synpred4_KeYParser()) ) {
						alt74=1;
					}

				}
				else if ( (LA74_0==MINUS) ) {
					int LA74_27 = input.LA(2);
					if ( (synpred4_KeYParser()) ) {
						alt74=1;
					}

				}

				switch (alt74) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2703:30: ( weak_arith_op )=>op= weak_arith_op a1= strong_arith_op_term
					{
					pushFollow(FOLLOW_weak_arith_op_in_weak_arith_op_term5409);
					op=weak_arith_op();
					state._fsp--;
					if (state.failed) return _weak_arith_op_term;
					pushFollow(FOLLOW_strong_arith_op_term_in_weak_arith_op_term5413);
					a1=strong_arith_op_term();
					state._fsp--;
					if (state.failed) return _weak_arith_op_term;
					if ( state.backtracking==0 ) {
					                  a = getTermFactory().createTerm(op, a, a1);
					                }
					}
					break;

				default :
					break loop74;
				}
			}

			}

			if ( state.backtracking==0 ) { _weak_arith_op_term = a; }
		}
		catch (TermCreationException ex) {

			              raiseException
					(new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _weak_arith_op_term;
	}
	// $ANTLR end "weak_arith_op_term"



	// $ANTLR start "strong_arith_op_term"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2712:1: strong_arith_op_term returns [Term _strong_arith_op_term = null] : a= term110 ( ( strong_arith_op )=>op= strong_arith_op a1= term110 )* ;
	public final Term strong_arith_op_term() throws RecognitionException {
		Term _strong_arith_op_term =  null;


		Term a =null;
		Function op =null;
		Term a1 =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2714:4: (a= term110 ( ( strong_arith_op )=>op= strong_arith_op a1= term110 )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2715:4: a= term110 ( ( strong_arith_op )=>op= strong_arith_op a1= term110 )*
			{
			pushFollow(FOLLOW_term110_in_strong_arith_op_term5456);
			a=term110();
			state._fsp--;
			if (state.failed) return _strong_arith_op_term;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2715:16: ( ( strong_arith_op )=>op= strong_arith_op a1= term110 )*
			loop75:
			while (true) {
				int alt75=2;
				switch ( input.LA(1) ) {
				case STAR:
					{
					int LA75_25 = input.LA(2);
					if ( (synpred5_KeYParser()) ) {
						alt75=1;
					}

					}
					break;
				case SLASH:
					{
					int LA75_26 = input.LA(2);
					if ( (synpred5_KeYParser()) ) {
						alt75=1;
					}

					}
					break;
				case PERCENT:
					{
					int LA75_27 = input.LA(2);
					if ( (synpred5_KeYParser()) ) {
						alt75=1;
					}

					}
					break;
				}
				switch (alt75) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2715:18: ( strong_arith_op )=>op= strong_arith_op a1= term110
					{
					pushFollow(FOLLOW_strong_arith_op_in_strong_arith_op_term5470);
					op=strong_arith_op();
					state._fsp--;
					if (state.failed) return _strong_arith_op_term;
					pushFollow(FOLLOW_term110_in_strong_arith_op_term5474);
					a1=term110();
					state._fsp--;
					if (state.failed) return _strong_arith_op_term;
					if ( state.backtracking==0 ) {
					                  a = getTermFactory().createTerm(op, a, a1);
					                }
					}
					break;

				default :
					break loop75;
				}
			}

			}

			if ( state.backtracking==0 ) { _strong_arith_op_term = a; }
		}
		catch (TermCreationException ex) {

			              raiseException
					(new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _strong_arith_op_term;
	}
	// $ANTLR end "strong_arith_op_term"



	// $ANTLR start "term110"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2731:1: term110 returns [Term _term110 = null] : (result= braces_term |result= accessterm ) ;
	public final Term term110() throws RecognitionException {
		Term _term110 =  null;


		Term result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2733:5: ( (result= braces_term |result= accessterm ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2734:9: (result= braces_term |result= accessterm )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2734:9: (result= braces_term |result= accessterm )
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==LBRACE) ) {
				alt76=1;
			}
			else if ( (LA76_0==AT||LA76_0==CHAR_LITERAL||LA76_0==FALSE||(LA76_0 >= IDENT && LA76_0 <= IFEX)||LA76_0==LPAREN||LA76_0==MINUS||LA76_0==NUM_LITERAL||LA76_0==STRING_LITERAL||LA76_0==TRUE) ) {
				alt76=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return _term110;}
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}

			switch (alt76) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2735:13: result= braces_term
					{
					pushFollow(FOLLOW_braces_term_in_term1105543);
					result=braces_term();
					state._fsp--;
					if (state.failed) return _term110;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2736:13: result= accessterm
					{
					pushFollow(FOLLOW_accessterm_in_term1105563);
					result=accessterm();
					state._fsp--;
					if (state.failed) return _term110;
					}
					break;

			}

			if ( state.backtracking==0 ) {
				/*
			            if (result.sort() == Sort.FORMULA) {
			                semanticError("Only terms may stand here.");
			            }
				*/
			        }
			}

			if ( state.backtracking==0 ) { _term110 = result; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _term110;
	}
	// $ANTLR end "term110"



	// $ANTLR start "staticAttributeOrQueryReference"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2776:1: staticAttributeOrQueryReference returns [String attrReference = \"\"] : id= IDENT ( EMPTYBRACKETS )* ;
	public final String staticAttributeOrQueryReference() throws RecognitionException {
		String attrReference =  "";


		Token id=null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2777:7: (id= IDENT ( EMPTYBRACKETS )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2779:7: id= IDENT ( EMPTYBRACKETS )*
			{
			id=(Token)match(input,IDENT,FOLLOW_IDENT_in_staticAttributeOrQueryReference5634); if (state.failed) return attrReference;
			if ( state.backtracking==0 ) {
			            attrReference = id.getText(); 
			            while (isPackage(attrReference) || input.LA(2)==NUM_LITERAL || 
			                (input.LT(2).getText().charAt(0)<='Z' && input.LT(2).getText().charAt(0)>='A' && 
				    		(input.LT(2).getText().length()==1 || input.LT(2).getText().charAt(1)<='z' && input.LT(2).getText().charAt(1)>='a')) &&
			                input.LA(1) == DOT) {
			                if(getTypeByClassName(attrReference)!=null){
			                    ProgramVariable maybeAttr = 
			                    getJavaInfo().getAttribute(input.LT(2).getText(), getTypeByClassName(attrReference));
			                    if(maybeAttr!=null){
			                        break;
			                    }
			                }

			                match(input, DOT, null);
			                attrReference += "." + input.LT(1).getText();
			                if(input.LA(1)==NUM_LITERAL){
			                	match(input, NUM_LITERAL, null);
			                }else{
			               	 	match(input, IDENT, null);
			                }
			            }      
			        }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2803:9: ( EMPTYBRACKETS )*
			loop77:
			while (true) {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==EMPTYBRACKETS) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2803:10: EMPTYBRACKETS
					{
					match(input,EMPTYBRACKETS,FOLLOW_EMPTYBRACKETS_in_staticAttributeOrQueryReference5655); if (state.failed) return attrReference;
					if ( state.backtracking==0 ) {attrReference += "[]";}
					}
					break;

				default :
					break loop77;
				}
			}

			if ( state.backtracking==0 ) {   KeYJavaType kjt = null;
			            kjt = getTypeByClassName(attrReference);
			            if (kjt == null) {
			                throw new NotDeclException(input, "Class", attrReference);
			            }	        
			            attrReference = kjt.getSort().name().toString();            
			            match(input, DOT, null);
			            attrReference += "::" + input.LT(1).getText();
			            match(input, IDENT, null);
				    if(savedGuessing > -1) {
				      state.backtracking = savedGuessing;
				      savedGuessing = -1;
				    }
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return attrReference;
	}
	// $ANTLR end "staticAttributeOrQueryReference"



	// $ANTLR start "static_attribute_suffix"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2820:1: static_attribute_suffix returns [Term result = null] : attributeName= staticAttributeOrQueryReference ;
	public final Term static_attribute_suffix() throws RecognitionException {
		Term result =  null;


		String attributeName =null;


		    Operator v = null;
		    attributeName = "";

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2825:5: (attributeName= staticAttributeOrQueryReference )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2826:9: attributeName= staticAttributeOrQueryReference
			{
			pushFollow(FOLLOW_staticAttributeOrQueryReference_in_static_attribute_suffix5719);
			attributeName=staticAttributeOrQueryReference();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {   
			         	String className;
			            if(attributeName.indexOf(':')!=-1){	
				       		className = 
					   			attributeName.substring(0, attributeName.indexOf(':'));
			            }else{
			          		className = 
					   			attributeName.substring(0, attributeName.lastIndexOf("."));	
			            }	
				       	v = getAttributeInPrefixSort(getTypeByClassName(className).getSort(), attributeName); 
				    }
			if ( state.backtracking==0 ) { result = createAttributeTerm(null, v); }
			}

		}
		catch (TermCreationException ex) {

			              raiseException
					(new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "static_attribute_suffix"



	// $ANTLR start "attribute_or_query_suffix"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2845:1: attribute_or_query_suffix[Term prefix] returns [Term _attribute_or_query_suffix = null] : DOT ( STAR | (memberName= attrid (result= query_suffix[prefix, memberName] )? ) ) ;
	public final Term attribute_or_query_suffix(Term prefix) throws RecognitionException {
		Term _attribute_or_query_suffix =  null;


		String memberName =null;
		Term result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2847:5: ( DOT ( STAR | (memberName= attrid (result= query_suffix[prefix, memberName] )? ) ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2848:5: DOT ( STAR | (memberName= attrid (result= query_suffix[prefix, memberName] )? ) )
			{
			match(input,DOT,FOLLOW_DOT_in_attribute_or_query_suffix5800); if (state.failed) return _attribute_or_query_suffix;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2848:9: ( STAR | (memberName= attrid (result= query_suffix[prefix, memberName] )? ) )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==STAR) ) {
				alt79=1;
			}
			else if ( (LA79_0==IDENT||LA79_0==LPAREN) ) {
				alt79=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return _attribute_or_query_suffix;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2848:11: STAR
					{
					match(input,STAR,FOLLOW_STAR_in_attribute_or_query_suffix5804); if (state.failed) return _attribute_or_query_suffix;
					if ( state.backtracking==0 ) { result = services.getTermBuilder().allFields(prefix); }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2849:7: (memberName= attrid (result= query_suffix[prefix, memberName] )? )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2849:7: (memberName= attrid (result= query_suffix[prefix, memberName] )? )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2849:9: memberName= attrid (result= query_suffix[prefix, memberName] )?
					{
					pushFollow(FOLLOW_attrid_in_attribute_or_query_suffix5820);
					memberName=attrid();
					state._fsp--;
					if (state.failed) return _attribute_or_query_suffix;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2850:5: (result= query_suffix[prefix, memberName] )?
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==LPAREN) ) {
						alt78=1;
					}
					switch (alt78) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2850:6: result= query_suffix[prefix, memberName]
							{
							pushFollow(FOLLOW_query_suffix_in_attribute_or_query_suffix5831);
							result=query_suffix(prefix, memberName);
							state._fsp--;
							if (state.failed) return _attribute_or_query_suffix;
							if ( state.backtracking==0 ) {assert result != null;}
							}
							break;

					}

					if ( state.backtracking==0 ) {
					        if(result == null)  {
					            if(prefix.sort() == getServices().getTypeConverter().getSeqLDT().targetSort()) {
					                if("length".equals(memberName)) {
					                    result = getServices().getTermBuilder().seqLen(prefix);
					                } else {
					                    semanticError("There is no attribute '" + memberName +
					                                  "' for sequences (Seq), only 'length' is supported.");
					                }
					            } else {
					                Operator v = getAttributeInPrefixSort(prefix.sort(), memberName);
					                result = createAttributeTerm(prefix, v);
					            }
					        }
					    }
					}

					}
					break;

			}

			}

			if ( state.backtracking==0 ) { _attribute_or_query_suffix = result; }
		}
		catch (TermCreationException ex) {

			    raiseException(new KeYSemanticException(input, getSourceName(), ex));

		}

		finally {
			// do for sure before leaving
		}
		return _attribute_or_query_suffix;
	}
	// $ANTLR end "attribute_or_query_suffix"



	// $ANTLR start "attrid"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2871:1: attrid returns [String attr = \"\";] : (id= simple_ident | LPAREN clss= sort_name DOUBLECOLON id2= simple_ident RPAREN );
	public final String attrid() throws RecognitionException {
		String attr =  "";;


		String id =null;
		String clss =null;
		String id2 =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2872:5: (id= simple_ident | LPAREN clss= sort_name DOUBLECOLON id2= simple_ident RPAREN )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==IDENT) ) {
				alt80=1;
			}
			else if ( (LA80_0==LPAREN) ) {
				alt80=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return attr;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2875:7: id= simple_ident
					{
					pushFollow(FOLLOW_simple_ident_in_attrid5893);
					id=simple_ident();
					state._fsp--;
					if (state.failed) return attr;
					if ( state.backtracking==0 ) { attr = id; }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2877:7: LPAREN clss= sort_name DOUBLECOLON id2= simple_ident RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_attrid5911); if (state.failed) return attr;
					pushFollow(FOLLOW_sort_name_in_attrid5917);
					clss=sort_name();
					state._fsp--;
					if (state.failed) return attr;
					match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_attrid5919); if (state.failed) return attr;
					pushFollow(FOLLOW_simple_ident_in_attrid5925);
					id2=simple_ident();
					state._fsp--;
					if (state.failed) return attr;
					match(input,RPAREN,FOLLOW_RPAREN_in_attrid5927); if (state.failed) return attr;
					if ( state.backtracking==0 ) { attr = clss + "::" + id2; }
					}
					break;

			}
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return attr;
	}
	// $ANTLR end "attrid"



	// $ANTLR start "query_suffix"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2881:1: query_suffix[Term prefix, String memberName] returns [Term result = null] : args= argument_list ;
	public final Term query_suffix(Term prefix, String memberName) throws RecognitionException {
		Term result =  null;


		Term[] args =null;


		    String classRef, name;
		    boolean brackets = false;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2886:5: (args= argument_list )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2887:5: args= argument_list
			{
			pushFollow(FOLLOW_argument_list_in_query_suffix5977);
			args=argument_list();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
			       // true in case class name is not explicitly mentioned as part of memberName
			       boolean implicitClassName = memberName.indexOf("::") == -1;
			       
			       if(implicitClassName) {
			          classRef = prefix.sort().name().toString();
			          name = memberName;
			       } else {
			          String parts[] = memberName.split("::", 2);
			          classRef = parts[0];
			          name = parts[1];
			       }
			       KeYJavaType kjt = getTypeByClassName(classRef);
			       if(kjt == null)
			          throw new NotDeclException(input, "Class", classRef);
			       classRef = kjt.getFullName();

			       result = getServices().getJavaInfo().getProgramMethodTerm(prefix, name, args, classRef, implicitClassName);
			    }
			}

		}
		catch (TermCreationException ex) {

			    raiseException(new KeYSemanticException(input, getSourceName(), ex));

		}

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "query_suffix"



	// $ANTLR start "accessterm"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2913:1: accessterm returns [Term _accessterm = null] : ( ( MINUS ~ NUM_LITERAL )=> MINUS result= term110 | ( LPAREN any_sortId_check[false] RPAREN term110 )=> LPAREN s= any_sortId_check[true] RPAREN result= term110 | ({...}?result= static_query |{...}?result= static_attribute_suffix |result= atom ) (abs= accessterm_bracket_suffix[result] |result= attribute_or_query_suffix[result] )* (result= heap_selection_suffix[result] )? );
	public final Term accessterm() throws RecognitionException {
		Term _accessterm =  null;


		Term result =null;
		Sort s =null;
		ParserRuleReturnScope abs =null;

		 int selectNestingDepth = globalSelectNestingDepth; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2916:5: ( ( MINUS ~ NUM_LITERAL )=> MINUS result= term110 | ( LPAREN any_sortId_check[false] RPAREN term110 )=> LPAREN s= any_sortId_check[true] RPAREN result= term110 | ({...}?result= static_query |{...}?result= static_attribute_suffix |result= atom ) (abs= accessterm_bracket_suffix[result] |result= attribute_or_query_suffix[result] )* (result= heap_selection_suffix[result] )? )
			int alt84=3;
			switch ( input.LA(1) ) {
			case MINUS:
				{
				int LA84_1 = input.LA(2);
				if ( (synpred6_KeYParser()) ) {
					alt84=1;
				}
				else if ( (true) ) {
					alt84=3;
				}

				}
				break;
			case LPAREN:
				{
				int LA84_2 = input.LA(2);
				if ( (synpred7_KeYParser()) ) {
					alt84=2;
				}
				else if ( (true) ) {
					alt84=3;
				}

				}
				break;
			case AT:
			case CHAR_LITERAL:
			case FALSE:
			case IDENT:
			case IF:
			case IFEX:
			case NUM_LITERAL:
			case STRING_LITERAL:
			case TRUE:
				{
				alt84=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return _accessterm;}
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}
			switch (alt84) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2917:7: ( MINUS ~ NUM_LITERAL )=> MINUS result= term110
					{
					match(input,MINUS,FOLLOW_MINUS_in_accessterm6032); if (state.failed) return _accessterm;
					pushFollow(FOLLOW_term110_in_accessterm6038);
					result=term110();
					state._fsp--;
					if (state.failed) return _accessterm;
					if ( state.backtracking==0 ) {
					            if (result.sort() != Sort.FORMULA) {
					                result = getTermFactory().createTerm
					                ((Function) functions().lookup(new Name("neg")), result);
					            } else {
					                semanticError("Formula cannot be prefixed with '-'");
					            }
					        }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2927:7: ( LPAREN any_sortId_check[false] RPAREN term110 )=> LPAREN s= any_sortId_check[true] RPAREN result= term110
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_accessterm6086); if (state.failed) return _accessterm;
					pushFollow(FOLLOW_any_sortId_check_in_accessterm6092);
					s=any_sortId_check(true);
					state._fsp--;
					if (state.failed) return _accessterm;
					match(input,RPAREN,FOLLOW_RPAREN_in_accessterm6095); if (state.failed) return _accessterm;
					pushFollow(FOLLOW_term110_in_accessterm6099);
					result=term110();
					state._fsp--;
					if (state.failed) return _accessterm;
					if ( state.backtracking==0 ) {
					         final Sort objectSort = getServices().getJavaInfo().objectSort();
					         if(s==null) {
					           semanticError("Tried to cast to unknown type.");
					         } else if (objectSort != null
					                    && !s.extendsTrans(objectSort) 
					                    && result.sort().extendsTrans(objectSort)) {
					                semanticError("Illegal cast from " + result.sort() + 
					                    " to sort " + s +
					                    ". Casts between primitive and reference types are not allowed. ");
					         }
					         result = getTermFactory().createTerm(s.getCastSymbol(getServices()), result);
						}
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2943:7: ({...}?result= static_query |{...}?result= static_attribute_suffix |result= atom ) (abs= accessterm_bracket_suffix[result] |result= attribute_or_query_suffix[result] )* (result= heap_selection_suffix[result] )?
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2943:7: ({...}?result= static_query |{...}?result= static_attribute_suffix |result= atom )
					int alt81=3;
					int LA81_0 = input.LA(1);
					if ( (LA81_0==IDENT) ) {
						int LA81_1 = input.LA(2);
						if ( ((isStaticQuery())) ) {
							alt81=1;
						}
						else if ( ((isStaticAttribute())) ) {
							alt81=2;
						}
						else if ( (true) ) {
							alt81=3;
						}

					}
					else if ( (LA81_0==AT||LA81_0==CHAR_LITERAL||LA81_0==FALSE||(LA81_0 >= IF && LA81_0 <= IFEX)||LA81_0==LPAREN||LA81_0==MINUS||LA81_0==NUM_LITERAL||LA81_0==STRING_LITERAL||LA81_0==TRUE) ) {
						alt81=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return _accessterm;}
						NoViableAltException nvae =
							new NoViableAltException("", 81, 0, input);
						throw nvae;
					}

					switch (alt81) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2943:9: {...}?result= static_query
							{
							if ( !((isStaticQuery())) ) {
								if (state.backtracking>0) {state.failed=true; return _accessterm;}
								throw new FailedPredicateException(input, "accessterm", "isStaticQuery()");
							}
							pushFollow(FOLLOW_static_query_in_accessterm6143);
							result=static_query();
							state._fsp--;
							if (state.failed) return _accessterm;
							if ( state.backtracking==0 ) { selectNestingDepth++; }
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2946:9: {...}?result= static_attribute_suffix
							{
							if ( !((isStaticAttribute())) ) {
								if (state.backtracking>0) {state.failed=true; return _accessterm;}
								throw new FailedPredicateException(input, "accessterm", "isStaticAttribute()");
							}
							pushFollow(FOLLOW_static_attribute_suffix_in_accessterm6189);
							result=static_attribute_suffix();
							state._fsp--;
							if (state.failed) return _accessterm;
							if ( state.backtracking==0 ) { selectNestingDepth++; }
							}
							break;
						case 3 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2949:9: result= atom
							{
							pushFollow(FOLLOW_atom_in_accessterm6213);
							result=atom();
							state._fsp--;
							if (state.failed) return _accessterm;
							if ( state.backtracking==0 ) { selectNestingDepth = globalSelectNestingDepth; }
							}
							break;

					}

					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2952:10: (abs= accessterm_bracket_suffix[result] |result= attribute_or_query_suffix[result] )*
					loop82:
					while (true) {
						int alt82=3;
						int LA82_0 = input.LA(1);
						if ( (LA82_0==LBRACKET) ) {
							alt82=1;
						}
						else if ( (LA82_0==DOT) ) {
							alt82=2;
						}

						switch (alt82) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2952:12: abs= accessterm_bracket_suffix[result]
							{
							pushFollow(FOLLOW_accessterm_bracket_suffix_in_accessterm6250);
							abs=accessterm_bracket_suffix(result);
							state._fsp--;
							if (state.failed) return _accessterm;
							if ( state.backtracking==0 ) {
							                 result = (abs!=null?((KeYParser.accessterm_bracket_suffix_return)abs).result:null);
							                 if((abs!=null?((KeYParser.accessterm_bracket_suffix_return)abs).increaseHeapSuffixCounter:false)) selectNestingDepth++;
							             }
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2957:12: result= attribute_or_query_suffix[result]
							{
							pushFollow(FOLLOW_attribute_or_query_suffix_in_accessterm6283);
							result=attribute_or_query_suffix(result);
							state._fsp--;
							if (state.failed) return _accessterm;
							if ( state.backtracking==0 ) { selectNestingDepth++; }
							}
							break;

						default :
							break loop82;
						}
					}

					if ( state.backtracking==0 ) { globalSelectNestingDepth = selectNestingDepth; }
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2963:5: (result= heap_selection_suffix[result] )?
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==AT) ) {
						alt83=1;
					}
					switch (alt83) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2963:7: result= heap_selection_suffix[result]
							{
							pushFollow(FOLLOW_heap_selection_suffix_in_accessterm6346);
							result=heap_selection_suffix(result);
							state._fsp--;
							if (state.failed) return _accessterm;
							}
							break;

					}

					}
					break;

			}
			if ( state.backtracking==0 ) { _accessterm = result; }
		}
		catch (TermCreationException ex) {

			    raiseException(new KeYSemanticException(input, getSourceName(), ex));

		}

		finally {
			// do for sure before leaving
		}
		return _accessterm;
	}
	// $ANTLR end "accessterm"



	// $ANTLR start "heap_selection_suffix"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2969:1: heap_selection_suffix[Term term] returns [Term result] : AT heap= accessterm ;
	public final Term heap_selection_suffix(Term term) throws RecognitionException {
		Term result = null;


		Term heap =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2970:5: ( AT heap= accessterm )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2971:5: AT heap= accessterm
			{
			match(input,AT,FOLLOW_AT_in_heap_selection_suffix6384); if (state.failed) return result;
			pushFollow(FOLLOW_accessterm_in_heap_selection_suffix6388);
			heap=accessterm();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { result = heapSelectionSuffix(term, heap); }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "heap_selection_suffix"


	public static class accessterm_bracket_suffix_return extends ParserRuleReturnScope {
		public Term result;
		public boolean increaseHeapSuffixCounter;
	};


	// $ANTLR start "accessterm_bracket_suffix"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2975:1: accessterm_bracket_suffix[Term reference] returns [Term result, boolean increaseHeapSuffixCounter] : ({...}?tmp= heap_update_suffix[reference] |{...}?tmp= seq_get_suffix[reference] |tmp= array_access_suffix[reference] );
	public final KeYParser.accessterm_bracket_suffix_return accessterm_bracket_suffix(Term reference) throws RecognitionException {
		KeYParser.accessterm_bracket_suffix_return retval = new KeYParser.accessterm_bracket_suffix_return();
		retval.start = input.LT(1);

		Term tmp =null;

		 retval.increaseHeapSuffixCounter = false; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2977:5: ({...}?tmp= heap_update_suffix[reference] |{...}?tmp= seq_get_suffix[reference] |tmp= array_access_suffix[reference] )
			int alt85=3;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==LBRACKET) ) {
				int LA85_1 = input.LA(2);
				if ( (( isHeapTerm(reference) )) ) {
					alt85=1;
				}
				else if ( (( isSequenceTerm(reference) )) ) {
					alt85=2;
				}
				else if ( (true) ) {
					alt85=3;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}

			switch (alt85) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2978:5: {...}?tmp= heap_update_suffix[reference]
					{
					if ( !(( isHeapTerm(reference) )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "accessterm_bracket_suffix", " isHeapTerm(reference) ");
					}
					pushFollow(FOLLOW_heap_update_suffix_in_accessterm_bracket_suffix6430);
					tmp=heap_update_suffix(reference);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.result = tmp; }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2979:7: {...}?tmp= seq_get_suffix[reference]
					{
					if ( !(( isSequenceTerm(reference) )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "accessterm_bracket_suffix", " isSequenceTerm(reference) ");
					}
					pushFollow(FOLLOW_seq_get_suffix_in_accessterm_bracket_suffix6447);
					tmp=seq_get_suffix(reference);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.result = tmp; }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2980:7: tmp= array_access_suffix[reference]
					{
					pushFollow(FOLLOW_array_access_suffix_in_accessterm_bracket_suffix6462);
					tmp=array_access_suffix(reference);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.result = tmp; retval.increaseHeapSuffixCounter = true; }
					}
					break;

			}
			retval.stop = input.LT(-1);

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "accessterm_bracket_suffix"



	// $ANTLR start "seq_get_suffix"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2983:1: seq_get_suffix[Term reference] returns [Term result] : LBRACKET indexTerm= logicTermReEntry RBRACKET ;
	public final Term seq_get_suffix(Term reference) throws RecognitionException {
		Term result = null;


		Term indexTerm =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2984:5: ( LBRACKET indexTerm= logicTermReEntry RBRACKET )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2985:5: LBRACKET indexTerm= logicTermReEntry RBRACKET
			{
			match(input,LBRACKET,FOLLOW_LBRACKET_in_seq_get_suffix6491); if (state.failed) return result;
			pushFollow(FOLLOW_logicTermReEntry_in_seq_get_suffix6498);
			indexTerm=logicTermReEntry();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
			        if(!isIntTerm(indexTerm)) semanticError("Expecting term of sort " + IntegerLDT.NAME + " as index of sequence " + reference + ", but found: " + indexTerm);
				    result = getServices().getTermBuilder().seqGet(Sort.ANY, reference, indexTerm);
			    }
			match(input,RBRACKET,FOLLOW_RBRACKET_in_seq_get_suffix6510); if (state.failed) return result;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "seq_get_suffix"



	// $ANTLR start "static_query"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2994:1: static_query returns [Term result = null] : queryRef= staticAttributeOrQueryReference args= argument_list ;
	public final Term static_query() throws RecognitionException {
		Term result =  null;


		String queryRef =null;
		Term[] args =null;


		    queryRef = "";

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2998:5: (queryRef= staticAttributeOrQueryReference args= argument_list )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2999:5: queryRef= staticAttributeOrQueryReference args= argument_list
			{
			pushFollow(FOLLOW_staticAttributeOrQueryReference_in_static_query6553);
			queryRef=staticAttributeOrQueryReference();
			state._fsp--;
			if (state.failed) return result;
			pushFollow(FOLLOW_argument_list_in_static_query6559);
			args=argument_list();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { 
			       int index = queryRef.indexOf(':');
			       String className = queryRef.substring(0, index); 
			       String qname = queryRef.substring(index+2); 
			       result = getServices().getJavaInfo().getStaticProgramMethodTerm(qname, args, className);
			       if(result == null && isTermParser()) {
				  final Sort sort = lookupSort(className);
			          if (sort == null) {
					semanticError("Could not find matching sort for " + className);
			          }
			          KeYJavaType kjt = getServices().getJavaInfo().getKeYJavaType(sort);
			          if (kjt == null) {
					semanticError("Found logic sort for " + className + 
					 " but no corresponding java type!");
			          }          
			       }
				    
			    }
			}

		}
		catch (TermCreationException ex) {

			    raiseException(new KeYSemanticException(input, getSourceName(), ex));

		}

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "static_query"



	// $ANTLR start "heap_update_suffix"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3023:1: heap_update_suffix[Term heap] returns [Term result=heap] : LBRACKET ( ( equivalence_term ASSIGN )=>target= equivalence_term ASSIGN val= equivalence_term |id= simple_ident args= argument_list ) RBRACKET ;
	public final Term heap_update_suffix(Term heap) throws RecognitionException {
		Term result = heap;


		Term target =null;
		Term val =null;
		String id =null;
		Term[] args =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3024:5: ( LBRACKET ( ( equivalence_term ASSIGN )=>target= equivalence_term ASSIGN val= equivalence_term |id= simple_ident args= argument_list ) RBRACKET )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3026:5: LBRACKET ( ( equivalence_term ASSIGN )=>target= equivalence_term ASSIGN val= equivalence_term |id= simple_ident args= argument_list ) RBRACKET
			{
			match(input,LBRACKET,FOLLOW_LBRACKET_in_heap_update_suffix6611); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3027:5: ( ( equivalence_term ASSIGN )=>target= equivalence_term ASSIGN val= equivalence_term |id= simple_ident args= argument_list )
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==NOT) && (synpred8_KeYParser())) {
				alt86=1;
			}
			else if ( (LA86_0==FORALL) && (synpred8_KeYParser())) {
				alt86=1;
			}
			else if ( (LA86_0==EXISTS) && (synpred8_KeYParser())) {
				alt86=1;
			}
			else if ( (LA86_0==MODALITY) && (synpred8_KeYParser())) {
				alt86=1;
			}
			else if ( (LA86_0==LBRACE) && (synpred8_KeYParser())) {
				alt86=1;
			}
			else if ( (LA86_0==MINUS) && (synpred8_KeYParser())) {
				alt86=1;
			}
			else if ( (LA86_0==LPAREN) && (synpred8_KeYParser())) {
				alt86=1;
			}
			else if ( (LA86_0==IDENT) ) {
				int LA86_8 = input.LA(2);
				if ( (synpred8_KeYParser()) ) {
					alt86=1;
				}
				else if ( (true) ) {
					alt86=2;
				}

			}
			else if ( (LA86_0==CHAR_LITERAL) && (synpred8_KeYParser())) {
				alt86=1;
			}
			else if ( (LA86_0==NUM_LITERAL) && (synpred8_KeYParser())) {
				alt86=1;
			}
			else if ( (LA86_0==AT) && (synpred8_KeYParser())) {
				alt86=1;
			}
			else if ( (LA86_0==TRUE) && (synpred8_KeYParser())) {
				alt86=1;
			}
			else if ( (LA86_0==FALSE) && (synpred8_KeYParser())) {
				alt86=1;
			}
			else if ( (LA86_0==IF) && (synpred8_KeYParser())) {
				alt86=1;
			}
			else if ( (LA86_0==IFEX) && (synpred8_KeYParser())) {
				alt86=1;
			}
			else if ( (LA86_0==STRING_LITERAL) && (synpred8_KeYParser())) {
				alt86=1;
			}

			switch (alt86) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3027:7: ( equivalence_term ASSIGN )=>target= equivalence_term ASSIGN val= equivalence_term
					{
					pushFollow(FOLLOW_equivalence_term_in_heap_update_suffix6636);
					target=equivalence_term();
					state._fsp--;
					if (state.failed) return result;
					match(input,ASSIGN,FOLLOW_ASSIGN_in_heap_update_suffix6638); if (state.failed) return result;
					pushFollow(FOLLOW_equivalence_term_in_heap_update_suffix6642);
					val=equivalence_term();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) {  // TODO at least make some check that it is a select term after all ...
					           Term objectTerm = target.sub(1);
					           Term fieldTerm  = target.sub(2);
					           result = getServices().getTermBuilder().store(heap, objectTerm, fieldTerm, val);
					        }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3034:7: id= simple_ident args= argument_list
					{
					pushFollow(FOLLOW_simple_ident_in_heap_update_suffix6662);
					id=simple_ident();
					state._fsp--;
					if (state.failed) return result;
					pushFollow(FOLLOW_argument_list_in_heap_update_suffix6666);
					args=argument_list();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) {
					           Function f = (Function)functions().lookup(new Name(id));
					           if(f == null) {
					             semanticError("Unknown heap constructor " + id);
					           }
					           Term[] augmentedArgs = new Term[args.length+1];
					           System.arraycopy(args, 0, augmentedArgs, 1, args.length);
					           augmentedArgs[0] = heap;
					           result = getTermFactory().createTerm(f, augmentedArgs);
					           if(!result.sort().name().toString().equals("Heap")) {
					              semanticError(id + " is not a heap constructor ");
					           }
					        }
					}
					break;

			}

			match(input,RBRACKET,FOLLOW_RBRACKET_in_heap_update_suffix6688); if (state.failed) return result;
			}

		}
		catch (TermCreationException ex) {

			    raiseException(new KeYSemanticException(input, getSourceName(), ex));

		}

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "heap_update_suffix"



	// $ANTLR start "array_access_suffix"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3055:1: array_access_suffix[Term arrayReference] returns [Term _array_access_suffix = null] : LBRACKET ( STAR |indexTerm= logicTermReEntry ( ( DOTRANGE )=> DOTRANGE rangeTo= logicTermReEntry )? ) RBRACKET ;
	public final Term array_access_suffix(Term arrayReference) throws RecognitionException {
		Term _array_access_suffix =  null;


		Term indexTerm =null;
		Term rangeTo =null;


		    Term rangeFrom = null;
		    Term result = arrayReference;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3061:2: ( LBRACKET ( STAR |indexTerm= logicTermReEntry ( ( DOTRANGE )=> DOTRANGE rangeTo= logicTermReEntry )? ) RBRACKET )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3062:4: LBRACKET ( STAR |indexTerm= logicTermReEntry ( ( DOTRANGE )=> DOTRANGE rangeTo= logicTermReEntry )? ) RBRACKET
			{
			match(input,LBRACKET,FOLLOW_LBRACKET_in_array_access_suffix6726); if (state.failed) return _array_access_suffix;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3063:2: ( STAR |indexTerm= logicTermReEntry ( ( DOTRANGE )=> DOTRANGE rangeTo= logicTermReEntry )? )
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==STAR) ) {
				alt88=1;
			}
			else if ( (LA88_0==AT||LA88_0==CHAR_LITERAL||LA88_0==FALSE||(LA88_0 >= IDENT && LA88_0 <= IFEX)||LA88_0==LBRACE||LA88_0==LPAREN||LA88_0==MINUS||LA88_0==NUM_LITERAL||LA88_0==STRING_LITERAL||LA88_0==TRUE) ) {
				alt88=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return _array_access_suffix;}
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}

			switch (alt88) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3063:6: STAR
					{
					match(input,STAR,FOLLOW_STAR_in_array_access_suffix6734); if (state.failed) return _array_access_suffix;
					if ( state.backtracking==0 ) {
					           	rangeFrom = toZNotation("0", functions());
					           	Term lt = getServices().getTermBuilder().dotLength(arrayReference);
					           	Term one = toZNotation("1", functions());
					  	   		rangeTo = getTermFactory().createTerm
					           		((Function) functions().lookup(new Name("sub")), lt, one); 
					        }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3070:11: indexTerm= logicTermReEntry ( ( DOTRANGE )=> DOTRANGE rangeTo= logicTermReEntry )?
					{
					pushFollow(FOLLOW_logicTermReEntry_in_array_access_suffix6753);
					indexTerm=logicTermReEntry();
					state._fsp--;
					if (state.failed) return _array_access_suffix;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3071:10: ( ( DOTRANGE )=> DOTRANGE rangeTo= logicTermReEntry )?
					int alt87=2;
					int LA87_0 = input.LA(1);
					if ( (LA87_0==DOTRANGE) && (synpred9_KeYParser())) {
						alt87=1;
					}
					switch (alt87) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3071:11: ( DOTRANGE )=> DOTRANGE rangeTo= logicTermReEntry
							{
							match(input,DOTRANGE,FOLLOW_DOTRANGE_in_array_access_suffix6772); if (state.failed) return _array_access_suffix;
							pushFollow(FOLLOW_logicTermReEntry_in_array_access_suffix6778);
							rangeTo=logicTermReEntry();
							state._fsp--;
							if (state.failed) return _array_access_suffix;
							if ( state.backtracking==0 ) {rangeFrom = indexTerm;}
							}
							break;

					}

					}
					break;

			}

			match(input,RBRACKET,FOLLOW_RBRACKET_in_array_access_suffix6813); if (state.failed) return _array_access_suffix;
			if ( state.backtracking==0 ) {       
				if(rangeTo != null) {
					if(quantifiedArrayGuard == null) {
						semanticError(
			  		  	"Quantified array expressions are only allowed in locations.");
					}
					LogicVariable indexVar = new LogicVariable(new Name("i"), 
					   	   		   (Sort) sorts().lookup(new Name("int")));
					indexTerm = getTermFactory().createTerm(indexVar);
					   	
					Function leq = (Function) functions().lookup(new Name("leq"));
					Term fromTerm = getTermFactory().createTerm(leq, rangeFrom, indexTerm);
					Term toTerm = getTermFactory().createTerm(leq, indexTerm, rangeTo);
					Term guardTerm = getTermFactory().createTerm(Junctor.AND, fromTerm, toTerm);
					quantifiedArrayGuard = getTermFactory().createTerm(Junctor.AND, quantifiedArrayGuard, guardTerm);
					}
			            result = getServices().getTermBuilder().dotArr(result, indexTerm); 
			    }
			}

			if ( state.backtracking==0 ) { _array_access_suffix = result; }
		}
		catch (TermCreationException ex) {

			               raiseException
			                (new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _array_access_suffix;
	}
	// $ANTLR end "array_access_suffix"



	// $ANTLR start "accesstermlist"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3101:1: accesstermlist returns [HashSet accessTerms = new LinkedHashSet()] : (t= accessterm ( COMMA t= accessterm )* )? ;
	public final HashSet accesstermlist() throws RecognitionException {
		HashSet accessTerms =  new LinkedHashSet();


		Term t =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3101:68: ( (t= accessterm ( COMMA t= accessterm )* )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3102:6: (t= accessterm ( COMMA t= accessterm )* )?
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3102:6: (t= accessterm ( COMMA t= accessterm )* )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==AT||LA90_0==CHAR_LITERAL||LA90_0==FALSE||(LA90_0 >= IDENT && LA90_0 <= IFEX)||LA90_0==LPAREN||LA90_0==MINUS||LA90_0==NUM_LITERAL||LA90_0==STRING_LITERAL||LA90_0==TRUE) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3102:7: t= accessterm ( COMMA t= accessterm )*
					{
					pushFollow(FOLLOW_accessterm_in_accesstermlist6873);
					t=accessterm();
					state._fsp--;
					if (state.failed) return accessTerms;
					if ( state.backtracking==0 ) {accessTerms.add(t);}
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3102:42: ( COMMA t= accessterm )*
					loop89:
					while (true) {
						int alt89=2;
						int LA89_0 = input.LA(1);
						if ( (LA89_0==COMMA) ) {
							alt89=1;
						}

						switch (alt89) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3102:44: COMMA t= accessterm
							{
							match(input,COMMA,FOLLOW_COMMA_in_accesstermlist6879); if (state.failed) return accessTerms;
							pushFollow(FOLLOW_accessterm_in_accesstermlist6883);
							t=accessterm();
							state._fsp--;
							if (state.failed) return accessTerms;
							if ( state.backtracking==0 ) {accessTerms.add(t);}
							}
							break;

						default :
							break loop89;
						}
					}

					}
					break;

			}

			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return accessTerms;
	}
	// $ANTLR end "accesstermlist"



	// $ANTLR start "atom"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3105:1: atom returns [Term _atom = null] : ({...}?a= specialTerm |a= funcpredvarterm | LPAREN a= term RPAREN | TRUE | FALSE |a= ifThenElseTerm |a= ifExThenElseTerm |literal= STRING_LITERAL ) ( LGUILLEMETS labels= label RGUILLEMETS )? ;
	public final Term atom() throws RecognitionException {
		Term _atom =  null;


		Token literal=null;
		Term a =null;
		ImmutableArray<TermLabel> labels =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3107:5: ( ({...}?a= specialTerm |a= funcpredvarterm | LPAREN a= term RPAREN | TRUE | FALSE |a= ifThenElseTerm |a= ifExThenElseTerm |literal= STRING_LITERAL ) ( LGUILLEMETS labels= label RGUILLEMETS )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3108:10: ({...}?a= specialTerm |a= funcpredvarterm | LPAREN a= term RPAREN | TRUE | FALSE |a= ifThenElseTerm |a= ifExThenElseTerm |literal= STRING_LITERAL ) ( LGUILLEMETS labels= label RGUILLEMETS )?
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3108:10: ({...}?a= specialTerm |a= funcpredvarterm | LPAREN a= term RPAREN | TRUE | FALSE |a= ifThenElseTerm |a= ifExThenElseTerm |literal= STRING_LITERAL )
			int alt91=8;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				int LA91_1 = input.LA(2);
				if ( (((isTermTransformer())&&(isTacletParser() || isProblemParser()))) ) {
					alt91=1;
				}
				else if ( (true) ) {
					alt91=2;
				}

				}
				break;
			case AT:
			case CHAR_LITERAL:
			case MINUS:
			case NUM_LITERAL:
				{
				alt91=2;
				}
				break;
			case LPAREN:
				{
				alt91=3;
				}
				break;
			case TRUE:
				{
				alt91=4;
				}
				break;
			case FALSE:
				{
				alt91=5;
				}
				break;
			case IF:
				{
				alt91=6;
				}
				break;
			case IFEX:
				{
				alt91=7;
				}
				break;
			case STRING_LITERAL:
				{
				alt91=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return _atom;}
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}
			switch (alt91) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3108:10: {...}?a= specialTerm
					{
					if ( !((isTermTransformer())) ) {
						if (state.backtracking>0) {state.failed=true; return _atom;}
						throw new FailedPredicateException(input, "atom", "isTermTransformer()");
					}
					pushFollow(FOLLOW_specialTerm_in_atom6928);
					a=specialTerm();
					state._fsp--;
					if (state.failed) return _atom;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3109:9: a= funcpredvarterm
					{
					pushFollow(FOLLOW_funcpredvarterm_in_atom6942);
					a=funcpredvarterm();
					state._fsp--;
					if (state.failed) return _atom;
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3110:9: LPAREN a= term RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atom6952); if (state.failed) return _atom;
					pushFollow(FOLLOW_term_in_atom6958);
					a=term();
					state._fsp--;
					if (state.failed) return _atom;
					match(input,RPAREN,FOLLOW_RPAREN_in_atom6960); if (state.failed) return _atom;
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3111:9: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_atom6970); if (state.failed) return _atom;
					if ( state.backtracking==0 ) { a = getTermFactory().createTerm(Junctor.TRUE); }
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3112:9: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_atom6983); if (state.failed) return _atom;
					if ( state.backtracking==0 ) { a = getTermFactory().createTerm(Junctor.FALSE); }
					}
					break;
				case 6 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3113:9: a= ifThenElseTerm
					{
					pushFollow(FOLLOW_ifThenElseTerm_in_atom6999);
					a=ifThenElseTerm();
					state._fsp--;
					if (state.failed) return _atom;
					}
					break;
				case 7 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3114:9: a= ifExThenElseTerm
					{
					pushFollow(FOLLOW_ifExThenElseTerm_in_atom7013);
					a=ifExThenElseTerm();
					state._fsp--;
					if (state.failed) return _atom;
					}
					break;
				case 8 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3115:9: literal= STRING_LITERAL
					{
					literal=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_atom7025); if (state.failed) return _atom;
					if ( state.backtracking==0 ) {
					            String s = unescapeString(literal.getText());
					            a = getServices().getTypeConverter().convertToLogicElement(new de.uka.ilkd.key.java.expression.literal.StringLiteral(s));
					        }
					}
					break;

			}

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3120:7: ( LGUILLEMETS labels= label RGUILLEMETS )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==LGUILLEMETS) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3120:8: LGUILLEMETS labels= label RGUILLEMETS
					{
					match(input,LGUILLEMETS,FOLLOW_LGUILLEMETS_in_atom7047); if (state.failed) return _atom;
					pushFollow(FOLLOW_label_in_atom7053);
					labels=label();
					state._fsp--;
					if (state.failed) return _atom;
					if ( state.backtracking==0 ) {if (labels.size() > 0) {a = getServices().getTermBuilder().addLabel(a, labels);} }
					match(input,RGUILLEMETS,FOLLOW_RGUILLEMETS_in_atom7057); if (state.failed) return _atom;
					}
					break;

			}

			}

			if ( state.backtracking==0 ) { _atom = a; }
		}
		catch (TermCreationException ex) {

			              raiseException
					(new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _atom;
	}
	// $ANTLR end "atom"



	// $ANTLR start "label"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3127:1: label returns [ImmutableArray<TermLabel> labels = new ImmutableArray<TermLabel>()] : l= single_label ( COMMA l= single_label )* ;
	public final ImmutableArray<TermLabel> label() throws RecognitionException {
		ImmutableArray<TermLabel> labels =  new ImmutableArray<TermLabel>();


		TermLabel l =null;


		  ArrayList<TermLabel> labelList = new ArrayList<TermLabel>();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3131:4: (l= single_label ( COMMA l= single_label )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3132:4: l= single_label ( COMMA l= single_label )*
			{
			pushFollow(FOLLOW_single_label_in_label7100);
			l=single_label();
			state._fsp--;
			if (state.failed) return labels;
			if ( state.backtracking==0 ) {labelList.add(l);}
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3132:39: ( COMMA l= single_label )*
			loop93:
			while (true) {
				int alt93=2;
				int LA93_0 = input.LA(1);
				if ( (LA93_0==COMMA) ) {
					alt93=1;
				}

				switch (alt93) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3132:40: COMMA l= single_label
					{
					match(input,COMMA,FOLLOW_COMMA_in_label7105); if (state.failed) return labels;
					pushFollow(FOLLOW_single_label_in_label7109);
					l=single_label();
					state._fsp--;
					if (state.failed) return labels;
					if ( state.backtracking==0 ) {labelList.add(l);}
					}
					break;

				default :
					break loop93;
				}
			}

			if ( state.backtracking==0 ) {
				labels = new ImmutableArray<TermLabel>((TermLabel[])labelList.toArray(new TermLabel[labelList.size()]));
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return labels;
	}
	// $ANTLR end "label"



	// $ANTLR start "single_label"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3138:1: single_label returns [TermLabel label=null] : (name= IDENT |star= STAR ) ( LPAREN param1= STRING_LITERAL ( COMMA param2= STRING_LITERAL )* RPAREN )? ;
	public final TermLabel single_label() throws RecognitionException {
		TermLabel label = null;


		Token name=null;
		Token star=null;
		Token param1=null;
		Token param2=null;


		  String labelName = "";
		  TermLabel left = null;
		  TermLabel right = null;
		  List<String> parameters = new LinkedList<String>();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3145:3: ( (name= IDENT |star= STAR ) ( LPAREN param1= STRING_LITERAL ( COMMA param2= STRING_LITERAL )* RPAREN )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3146:3: (name= IDENT |star= STAR ) ( LPAREN param1= STRING_LITERAL ( COMMA param2= STRING_LITERAL )* RPAREN )?
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3146:3: (name= IDENT |star= STAR )
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==IDENT) ) {
				alt94=1;
			}
			else if ( (LA94_0==STAR) ) {
				alt94=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return label;}
				NoViableAltException nvae =
					new NoViableAltException("", 94, 0, input);
				throw nvae;
			}

			switch (alt94) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3146:4: name= IDENT
					{
					name=(Token)match(input,IDENT,FOLLOW_IDENT_in_single_label7141); if (state.failed) return label;
					if ( state.backtracking==0 ) {labelName=name.getText();}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3146:45: star= STAR
					{
					star=(Token)match(input,STAR,FOLLOW_STAR_in_single_label7149); if (state.failed) return label;
					if ( state.backtracking==0 ) {labelName=star.getText();}
					}
					break;

			}

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3146:85: ( LPAREN param1= STRING_LITERAL ( COMMA param2= STRING_LITERAL )* RPAREN )?
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==LPAREN) ) {
				alt96=1;
			}
			switch (alt96) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3146:86: LPAREN param1= STRING_LITERAL ( COMMA param2= STRING_LITERAL )* RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_single_label7156); if (state.failed) return label;
					param1=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_single_label7160); if (state.failed) return label;
					if ( state.backtracking==0 ) {parameters.add(param1.getText().substring(1,param1.getText().length()-1));}
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3146:192: ( COMMA param2= STRING_LITERAL )*
					loop95:
					while (true) {
						int alt95=2;
						int LA95_0 = input.LA(1);
						if ( (LA95_0==COMMA) ) {
							alt95=1;
						}

						switch (alt95) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3146:193: COMMA param2= STRING_LITERAL
							{
							match(input,COMMA,FOLLOW_COMMA_in_single_label7165); if (state.failed) return label;
							param2=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_single_label7169); if (state.failed) return label;
							if ( state.backtracking==0 ) {parameters.add(param2.getText().substring(1,param2.getText().length()-1));}
							}
							break;

						default :
							break loop95;
						}
					}

					match(input,RPAREN,FOLLOW_RPAREN_in_single_label7175); if (state.failed) return label;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			      try {
			          if (inSchemaMode()) {
			               Named var = variables().lookup(new Name(labelName));
			               if (var instanceof TermLabel) {
			                    label = (TermLabel)var;
			               }
			          }
			          if (label == null) {
			                label = getServices().getProfile()
			                                .getTermLabelManager().parseLabel(labelName, parameters);
			          }
			      } catch(TermLabelException ex) {
			          raiseException
			                (new KeYSemanticException(input, getSourceName(), ex));
			      }
			  }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return label;
	}
	// $ANTLR end "single_label"



	// $ANTLR start "abbreviation"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3167:1: abbreviation returns [Term _abbreviation=null] : (sc= simple_ident ) ;
	public final Term abbreviation() throws RecognitionException {
		Term _abbreviation = null;


		String sc =null;

		 Term a = null; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3170:5: ( (sc= simple_ident ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3171:9: (sc= simple_ident )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3171:9: (sc= simple_ident )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3171:13: sc= simple_ident
			{
			pushFollow(FOLLOW_simple_ident_in_abbreviation7225);
			sc=simple_ident();
			state._fsp--;
			if (state.failed) return _abbreviation;
			if ( state.backtracking==0 ) {
			                a =  scm.getTerm(sc);
			                if(a==null){
			                    throw new NotDeclException(input, "abbreviation", sc);
			                }
			            }
			}

			}

			if ( state.backtracking==0 ) { _abbreviation = a; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _abbreviation;
	}
	// $ANTLR end "abbreviation"



	// $ANTLR start "ifThenElseTerm"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3182:1: ifThenElseTerm returns [Term _if_then_else_term = null] : IF LPAREN condF= term RPAREN THEN LPAREN thenT= term RPAREN ELSE LPAREN elseT= term RPAREN ;
	public final Term ifThenElseTerm() throws RecognitionException {
		Term _if_then_else_term =  null;


		Term condF =null;
		Term thenT =null;
		Term elseT =null;

		 Term result = null; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3185:5: ( IF LPAREN condF= term RPAREN THEN LPAREN thenT= term RPAREN ELSE LPAREN elseT= term RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3186:9: IF LPAREN condF= term RPAREN THEN LPAREN thenT= term RPAREN ELSE LPAREN elseT= term RPAREN
			{
			match(input,IF,FOLLOW_IF_in_ifThenElseTerm7287); if (state.failed) return _if_then_else_term;
			match(input,LPAREN,FOLLOW_LPAREN_in_ifThenElseTerm7289); if (state.failed) return _if_then_else_term;
			pushFollow(FOLLOW_term_in_ifThenElseTerm7295);
			condF=term();
			state._fsp--;
			if (state.failed) return _if_then_else_term;
			match(input,RPAREN,FOLLOW_RPAREN_in_ifThenElseTerm7297); if (state.failed) return _if_then_else_term;
			if ( state.backtracking==0 ) {
			            if (condF.sort() != Sort.FORMULA) {
			                semanticError
					  ("Condition of an \\if-then-else term has to be a formula.");
			            }
			        }
			match(input,THEN,FOLLOW_THEN_in_ifThenElseTerm7317); if (state.failed) return _if_then_else_term;
			match(input,LPAREN,FOLLOW_LPAREN_in_ifThenElseTerm7319); if (state.failed) return _if_then_else_term;
			pushFollow(FOLLOW_term_in_ifThenElseTerm7325);
			thenT=term();
			state._fsp--;
			if (state.failed) return _if_then_else_term;
			match(input,RPAREN,FOLLOW_RPAREN_in_ifThenElseTerm7327); if (state.failed) return _if_then_else_term;
			match(input,ELSE,FOLLOW_ELSE_in_ifThenElseTerm7337); if (state.failed) return _if_then_else_term;
			match(input,LPAREN,FOLLOW_LPAREN_in_ifThenElseTerm7339); if (state.failed) return _if_then_else_term;
			pushFollow(FOLLOW_term_in_ifThenElseTerm7345);
			elseT=term();
			state._fsp--;
			if (state.failed) return _if_then_else_term;
			match(input,RPAREN,FOLLOW_RPAREN_in_ifThenElseTerm7347); if (state.failed) return _if_then_else_term;
			if ( state.backtracking==0 ) {
			            result = getTermFactory().createTerm ( IfThenElse.IF_THEN_ELSE, new Term[]{condF, thenT, elseT} );
			        }
			}

			if ( state.backtracking==0 ) { _if_then_else_term = result; }
		}
		catch (TermCreationException ex) {

			              raiseException
					(new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _if_then_else_term;
	}
	// $ANTLR end "ifThenElseTerm"



	// $ANTLR start "ifExThenElseTerm"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3205:1: ifExThenElseTerm returns [Term _if_ex_then_else_term = null] : IFEX exVars= bound_variables LPAREN condF= term RPAREN THEN LPAREN thenT= term RPAREN ELSE LPAREN elseT= term RPAREN ;
	public final Term ifExThenElseTerm() throws RecognitionException {
		Term _if_ex_then_else_term =  null;


		ImmutableList<QuantifiableVariable> exVars =null;
		Term condF =null;
		Term thenT =null;
		Term elseT =null;


		    exVars 
		    	= ImmutableSLList.<QuantifiableVariable>nil();
		    Namespace orig = variables();
		    Term result = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3213:5: ( IFEX exVars= bound_variables LPAREN condF= term RPAREN THEN LPAREN thenT= term RPAREN ELSE LPAREN elseT= term RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3214:9: IFEX exVars= bound_variables LPAREN condF= term RPAREN THEN LPAREN thenT= term RPAREN ELSE LPAREN elseT= term RPAREN
			{
			match(input,IFEX,FOLLOW_IFEX_in_ifExThenElseTerm7422); if (state.failed) return _if_ex_then_else_term;
			pushFollow(FOLLOW_bound_variables_in_ifExThenElseTerm7428);
			exVars=bound_variables();
			state._fsp--;
			if (state.failed) return _if_ex_then_else_term;
			match(input,LPAREN,FOLLOW_LPAREN_in_ifExThenElseTerm7438); if (state.failed) return _if_ex_then_else_term;
			pushFollow(FOLLOW_term_in_ifExThenElseTerm7444);
			condF=term();
			state._fsp--;
			if (state.failed) return _if_ex_then_else_term;
			match(input,RPAREN,FOLLOW_RPAREN_in_ifExThenElseTerm7446); if (state.failed) return _if_ex_then_else_term;
			if ( state.backtracking==0 ) {
			            if (condF.sort() != Sort.FORMULA) {
			                semanticError
					  ("Condition of an \\ifEx-then-else term has to be a formula.");
			            }
			        }
			match(input,THEN,FOLLOW_THEN_in_ifExThenElseTerm7466); if (state.failed) return _if_ex_then_else_term;
			match(input,LPAREN,FOLLOW_LPAREN_in_ifExThenElseTerm7468); if (state.failed) return _if_ex_then_else_term;
			pushFollow(FOLLOW_term_in_ifExThenElseTerm7474);
			thenT=term();
			state._fsp--;
			if (state.failed) return _if_ex_then_else_term;
			match(input,RPAREN,FOLLOW_RPAREN_in_ifExThenElseTerm7476); if (state.failed) return _if_ex_then_else_term;
			match(input,ELSE,FOLLOW_ELSE_in_ifExThenElseTerm7486); if (state.failed) return _if_ex_then_else_term;
			match(input,LPAREN,FOLLOW_LPAREN_in_ifExThenElseTerm7488); if (state.failed) return _if_ex_then_else_term;
			pushFollow(FOLLOW_term_in_ifExThenElseTerm7494);
			elseT=term();
			state._fsp--;
			if (state.failed) return _if_ex_then_else_term;
			match(input,RPAREN,FOLLOW_RPAREN_in_ifExThenElseTerm7496); if (state.failed) return _if_ex_then_else_term;
			if ( state.backtracking==0 ) {
			            ImmutableArray<QuantifiableVariable> exVarsArray
			            	= new ImmutableArray<QuantifiableVariable>( 
			            	     exVars.toArray(new QuantifiableVariable[exVars.size()]));
			            result = getTermFactory().createTerm ( IfExThenElse.IF_EX_THEN_ELSE,  
			                                     new Term[]{condF, thenT, elseT}, 
			                                     exVarsArray, 
			                                     null );
			            if(!isGlobalDeclTermParser()) {
			                unbindVars(orig);
			            }
			        }
			}

			if ( state.backtracking==0 ) { _if_ex_then_else_term = result; }
		}
		catch (TermCreationException ex) {

			              raiseException
					(new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _if_ex_then_else_term;
	}
	// $ANTLR end "ifExThenElseTerm"



	// $ANTLR start "argument"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3243:1: argument returns [Term _argument = null] : ({...}?result= term |result= term60 ) ;
	public final Term argument() throws RecognitionException {
		Term _argument =  null;


		Term result =null;


		    ImmutableArray<QuantifiableVariable> vars = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3248:2: ( ({...}?result= term |result= term60 ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3249:2: ({...}?result= term |result= term60 )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3249:2: ({...}?result= term |result= term60 )
			int alt97=2;
			switch ( input.LA(1) ) {
			case NOT:
				{
				int LA97_1 = input.LA(2);
				if ( ((isTermParser() || isGlobalDeclTermParser())) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}

				}
				break;
			case FORALL:
				{
				int LA97_2 = input.LA(2);
				if ( ((isTermParser() || isGlobalDeclTermParser())) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}

				}
				break;
			case EXISTS:
				{
				int LA97_3 = input.LA(2);
				if ( ((isTermParser() || isGlobalDeclTermParser())) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}

				}
				break;
			case MODALITY:
				{
				int LA97_4 = input.LA(2);
				if ( ((isTermParser() || isGlobalDeclTermParser())) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}

				}
				break;
			case LBRACE:
				{
				int LA97_5 = input.LA(2);
				if ( ((isTermParser() || isGlobalDeclTermParser())) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}

				}
				break;
			case MINUS:
				{
				int LA97_6 = input.LA(2);
				if ( ((isTermParser() || isGlobalDeclTermParser())) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}

				}
				break;
			case LPAREN:
				{
				int LA97_7 = input.LA(2);
				if ( ((isTermParser() || isGlobalDeclTermParser())) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}

				}
				break;
			case IDENT:
				{
				int LA97_8 = input.LA(2);
				if ( ((isTermParser() || isGlobalDeclTermParser())) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}

				}
				break;
			case CHAR_LITERAL:
				{
				int LA97_9 = input.LA(2);
				if ( ((isTermParser() || isGlobalDeclTermParser())) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}

				}
				break;
			case NUM_LITERAL:
				{
				int LA97_10 = input.LA(2);
				if ( ((isTermParser() || isGlobalDeclTermParser())) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}

				}
				break;
			case AT:
				{
				int LA97_11 = input.LA(2);
				if ( ((isTermParser() || isGlobalDeclTermParser())) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}

				}
				break;
			case TRUE:
				{
				int LA97_12 = input.LA(2);
				if ( ((isTermParser() || isGlobalDeclTermParser())) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}

				}
				break;
			case FALSE:
				{
				int LA97_13 = input.LA(2);
				if ( ((isTermParser() || isGlobalDeclTermParser())) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}

				}
				break;
			case IF:
				{
				int LA97_14 = input.LA(2);
				if ( ((isTermParser() || isGlobalDeclTermParser())) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}

				}
				break;
			case IFEX:
				{
				int LA97_15 = input.LA(2);
				if ( ((isTermParser() || isGlobalDeclTermParser())) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}

				}
				break;
			case STRING_LITERAL:
				{
				int LA97_16 = input.LA(2);
				if ( ((isTermParser() || isGlobalDeclTermParser())) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return _argument;}
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}
			switch (alt97) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3251:4: {...}?result= term
					{
					if ( !((isTermParser() || isGlobalDeclTermParser())) ) {
						if (state.backtracking>0) {state.failed=true; return _argument;}
						throw new FailedPredicateException(input, "argument", "isTermParser() || isGlobalDeclTermParser()");
					}
					pushFollow(FOLLOW_term_in_argument7573);
					result=term();
					state._fsp--;
					if (state.failed) return _argument;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3254:6: result= term60
					{
					pushFollow(FOLLOW_term60_in_argument7591);
					result=term60();
					state._fsp--;
					if (state.failed) return _argument;
					}
					break;

			}

			}

			if ( state.backtracking==0 ) { _argument = result; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _argument;
	}
	// $ANTLR end "argument"



	// $ANTLR start "quantifierterm"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3259:1: quantifierterm returns [Term _quantifier_term = null] : ( FORALL | EXISTS ) vs= bound_variables a1= term60 ;
	public final Term quantifierterm() throws RecognitionException {
		Term _quantifier_term =  null;


		ImmutableList<QuantifiableVariable> vs =null;
		Term a1 =null;


		    Operator op = null;
		    Namespace orig = variables();  
		    Term a = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3266:9: ( ( FORALL | EXISTS ) vs= bound_variables a1= term60 )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3267:9: ( FORALL | EXISTS ) vs= bound_variables a1= term60
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3267:9: ( FORALL | EXISTS )
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==FORALL) ) {
				alt98=1;
			}
			else if ( (LA98_0==EXISTS) ) {
				alt98=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return _quantifier_term;}
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}

			switch (alt98) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3267:13: FORALL
					{
					match(input,FORALL,FOLLOW_FORALL_in_quantifierterm7632); if (state.failed) return _quantifier_term;
					if ( state.backtracking==0 ) { op = Quantifier.ALL; }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3268:13: EXISTS
					{
					match(input,EXISTS,FOLLOW_EXISTS_in_quantifierterm7648); if (state.failed) return _quantifier_term;
					if ( state.backtracking==0 ) { op = Quantifier.EX;  }
					}
					break;

			}

			pushFollow(FOLLOW_bound_variables_in_quantifierterm7666);
			vs=bound_variables();
			state._fsp--;
			if (state.failed) return _quantifier_term;
			pushFollow(FOLLOW_term60_in_quantifierterm7672);
			a1=term60();
			state._fsp--;
			if (state.failed) return _quantifier_term;
			if ( state.backtracking==0 ) {
			            a = getTermFactory().createTerm((Quantifier)op,
			                              new ImmutableArray<Term>(a1),
				       		      new ImmutableArray<QuantifiableVariable>(vs.toArray(new QuantifiableVariable[vs.size()])),
				       		      null);
			            if(!isGlobalDeclTermParser())
			              unbindVars(orig);
			        }
			}

			if ( state.backtracking==0 ) { _quantifier_term = a; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _quantifier_term;
	}
	// $ANTLR end "quantifierterm"



	// $ANTLR start "braces_term"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3283:1: braces_term returns [Term _update_or_substitution = null] : ( ( LBRACE SUBST )=>result= substitutionterm | ( LBRACE ( LPAREN | RBRACE ) )=>result= locset_term |result= updateterm );
	public final Term braces_term() throws RecognitionException {
		Term _update_or_substitution =  null;


		Term result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3285:7: ( ( LBRACE SUBST )=>result= substitutionterm | ( LBRACE ( LPAREN | RBRACE ) )=>result= locset_term |result= updateterm )
			int alt99=3;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==LBRACE) ) {
				int LA99_1 = input.LA(2);
				if ( (synpred10_KeYParser()) ) {
					alt99=1;
				}
				else if ( (synpred11_KeYParser()) ) {
					alt99=2;
				}
				else if ( (true) ) {
					alt99=3;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return _update_or_substitution;}
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}

			switch (alt99) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3286:7: ( LBRACE SUBST )=>result= substitutionterm
					{
					pushFollow(FOLLOW_substitutionterm_in_braces_term7719);
					result=substitutionterm();
					state._fsp--;
					if (state.failed) return _update_or_substitution;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3287:9: ( LBRACE ( LPAREN | RBRACE ) )=>result= locset_term
					{
					pushFollow(FOLLOW_locset_term_in_braces_term7747);
					result=locset_term();
					state._fsp--;
					if (state.failed) return _update_or_substitution;
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3288:10: result= updateterm
					{
					pushFollow(FOLLOW_updateterm_in_braces_term7762);
					result=updateterm();
					state._fsp--;
					if (state.failed) return _update_or_substitution;
					}
					break;

			}
			if ( state.backtracking==0 ) { _update_or_substitution = result; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _update_or_substitution;
	}
	// $ANTLR end "braces_term"



	// $ANTLR start "locset_term"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3291:1: locset_term returns [Term result = getServices().getTermBuilder().empty()] : LBRACE (l= location_term ( COMMA l= location_term )* )? RBRACE ;
	public final Term locset_term() throws RecognitionException {
		Term result =  getServices().getTermBuilder().empty();


		Term l =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3292:5: ( LBRACE (l= location_term ( COMMA l= location_term )* )? RBRACE )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3293:5: LBRACE (l= location_term ( COMMA l= location_term )* )? RBRACE
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_locset_term7791); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3294:9: (l= location_term ( COMMA l= location_term )* )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==LPAREN) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3294:11: l= location_term ( COMMA l= location_term )*
					{
					pushFollow(FOLLOW_location_term_in_locset_term7807);
					l=location_term();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = l; }
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3295:9: ( COMMA l= location_term )*
					loop100:
					while (true) {
						int alt100=2;
						int LA100_0 = input.LA(1);
						if ( (LA100_0==COMMA) ) {
							alt100=1;
						}

						switch (alt100) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3295:11: COMMA l= location_term
							{
							match(input,COMMA,FOLLOW_COMMA_in_locset_term7821); if (state.failed) return result;
							pushFollow(FOLLOW_location_term_in_locset_term7827);
							l=location_term();
							state._fsp--;
							if (state.failed) return result;
							if ( state.backtracking==0 ) { result = getServices().getTermBuilder().union(result, l); }
							}
							break;

						default :
							break loop100;
						}
					}

					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_locset_term7841); if (state.failed) return result;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "locset_term"



	// $ANTLR start "location_term"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3299:1: location_term returns [Term result] : LPAREN obj= equivalence_term COMMA field= equivalence_term RPAREN ;
	public final Term location_term() throws RecognitionException {
		Term result = null;


		Term obj =null;
		Term field =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3300:5: ( LPAREN obj= equivalence_term COMMA field= equivalence_term RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3301:5: LPAREN obj= equivalence_term COMMA field= equivalence_term RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_location_term7869); if (state.failed) return result;
			pushFollow(FOLLOW_equivalence_term_in_location_term7873);
			obj=equivalence_term();
			state._fsp--;
			if (state.failed) return result;
			match(input,COMMA,FOLLOW_COMMA_in_location_term7875); if (state.failed) return result;
			pushFollow(FOLLOW_equivalence_term_in_location_term7879);
			field=equivalence_term();
			state._fsp--;
			if (state.failed) return result;
			match(input,RPAREN,FOLLOW_RPAREN_in_location_term7881); if (state.failed) return result;
			if ( state.backtracking==0 ) { result = getServices().getTermBuilder().singleton(obj, field); }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "location_term"



	// $ANTLR start "substitutionterm"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3305:1: substitutionterm returns [Term _substitution_term = null] : LBRACE SUBST v= one_bound_variable SEMI a1= logicTermReEntry RBRACE (a2= term110 |a2= unary_formula ) ;
	public final Term substitutionterm() throws RecognitionException {
		Term _substitution_term =  null;


		QuantifiableVariable v =null;
		Term a1 =null;
		Term a2 =null;


		  SubstOp op = WarySubstOp.SUBST;
		   Namespace orig = variables();  
		  Term result = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3312:4: ( LBRACE SUBST v= one_bound_variable SEMI a1= logicTermReEntry RBRACE (a2= term110 |a2= unary_formula ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3313:4: LBRACE SUBST v= one_bound_variable SEMI a1= logicTermReEntry RBRACE (a2= term110 |a2= unary_formula )
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_substitutionterm7924); if (state.failed) return _substitution_term;
			match(input,SUBST,FOLLOW_SUBST_in_substitutionterm7926); if (state.failed) return _substitution_term;
			pushFollow(FOLLOW_one_bound_variable_in_substitutionterm7937);
			v=one_bound_variable();
			state._fsp--;
			if (state.failed) return _substitution_term;
			match(input,SEMI,FOLLOW_SEMI_in_substitutionterm7939); if (state.failed) return _substitution_term;
			if ( state.backtracking==0 ) { // Tricky part, v cannot be bound while parsing a1
			       if(!isGlobalDeclTermParser())
			          unbindVars(orig);
			     }
			pushFollow(FOLLOW_logicTermReEntry_in_substitutionterm7955);
			a1=logicTermReEntry();
			state._fsp--;
			if (state.failed) return _substitution_term;
			if ( state.backtracking==0 ) { // The rest of the tricky part, bind it again
			       if(!isGlobalDeclTermParser())
			          if(v instanceof LogicVariable)
			            bindVar((LogicVariable)v);
				  else
				    bindVar();
			     }
			match(input,RBRACE,FOLLOW_RBRACE_in_substitutionterm7967); if (state.failed) return _substitution_term;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3328:4: (a2= term110 |a2= unary_formula )
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==AT||LA102_0==CHAR_LITERAL||LA102_0==FALSE||(LA102_0 >= IDENT && LA102_0 <= IFEX)||LA102_0==LBRACE||LA102_0==LPAREN||LA102_0==MINUS||LA102_0==NUM_LITERAL||LA102_0==STRING_LITERAL||LA102_0==TRUE) ) {
				alt102=1;
			}
			else if ( (LA102_0==EXISTS||LA102_0==FORALL||LA102_0==MODALITY||LA102_0==NOT) ) {
				alt102=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return _substitution_term;}
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}

			switch (alt102) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3328:6: a2= term110
					{
					pushFollow(FOLLOW_term110_in_substitutionterm7978);
					a2=term110();
					state._fsp--;
					if (state.failed) return _substitution_term;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3328:21: a2= unary_formula
					{
					pushFollow(FOLLOW_unary_formula_in_substitutionterm7986);
					a2=unary_formula();
					state._fsp--;
					if (state.failed) return _substitution_term;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			      result = getServices().getTermBuilder().subst ( op, v, a1, a2 );
			      if(!isGlobalDeclTermParser())
			        unbindVars(orig);
			   }
			}

			if ( state.backtracking==0 ) { _substitution_term = result; }
		}
		catch (TermCreationException ex) {

			              raiseException
					(new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _substitution_term;
	}
	// $ANTLR end "substitutionterm"



	// $ANTLR start "updateterm"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3340:1: updateterm returns [Term _update_term = null] : LBRACE u= term RBRACE (a2= term110 |a2= unary_formula ) ;
	public final Term updateterm() throws RecognitionException {
		Term _update_term =  null;


		Term u =null;
		Term a2 =null;

		 Term result = null; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3343:9: ( LBRACE u= term RBRACE (a2= term110 |a2= unary_formula ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3344:9: LBRACE u= term RBRACE (a2= term110 |a2= unary_formula )
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_updateterm8035); if (state.failed) return _update_term;
			pushFollow(FOLLOW_term_in_updateterm8039);
			u=term();
			state._fsp--;
			if (state.failed) return _update_term;
			match(input,RBRACE,FOLLOW_RBRACE_in_updateterm8041); if (state.failed) return _update_term;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3345:9: (a2= term110 |a2= unary_formula )
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==AT||LA103_0==CHAR_LITERAL||LA103_0==FALSE||(LA103_0 >= IDENT && LA103_0 <= IFEX)||LA103_0==LBRACE||LA103_0==LPAREN||LA103_0==MINUS||LA103_0==NUM_LITERAL||LA103_0==STRING_LITERAL||LA103_0==TRUE) ) {
				alt103=1;
			}
			else if ( (LA103_0==EXISTS||LA103_0==FORALL||LA103_0==MODALITY||LA103_0==NOT) ) {
				alt103=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return _update_term;}
				NoViableAltException nvae =
					new NoViableAltException("", 103, 0, input);
				throw nvae;
			}

			switch (alt103) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3346:13: a2= term110
					{
					pushFollow(FOLLOW_term110_in_updateterm8069);
					a2=term110();
					state._fsp--;
					if (state.failed) return _update_term;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3348:13: a2= unary_formula
					{
					pushFollow(FOLLOW_unary_formula_in_updateterm8101);
					a2=unary_formula();
					state._fsp--;
					if (state.failed) return _update_term;
					}
					break;

			}

			if ( state.backtracking==0 ) {   
				    result = getTermFactory().createTerm(UpdateApplication.UPDATE_APPLICATION, u, a2);
			        }
			}

			if ( state.backtracking==0 ) { _update_term = result; }
		}
		catch (TermCreationException ex) {

			              raiseException
					(new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _update_term;
	}
	// $ANTLR end "updateterm"



	// $ANTLR start "bound_variables"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3359:1: bound_variables returns [ImmutableList<QuantifiableVariable> list = ImmutableSLList.<QuantifiableVariable>nil()] : var= one_bound_variable ( COMMA var= one_bound_variable )* SEMI ;
	public final ImmutableList<QuantifiableVariable> bound_variables() throws RecognitionException {
		ImmutableList<QuantifiableVariable> list =  ImmutableSLList.<QuantifiableVariable>nil();


		QuantifiableVariable var =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3360:7: (var= one_bound_variable ( COMMA var= one_bound_variable )* SEMI )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3361:7: var= one_bound_variable ( COMMA var= one_bound_variable )* SEMI
			{
			pushFollow(FOLLOW_one_bound_variable_in_bound_variables8180);
			var=one_bound_variable();
			state._fsp--;
			if (state.failed) return list;
			if ( state.backtracking==0 ) { list = list.append(var); }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3362:7: ( COMMA var= one_bound_variable )*
			loop104:
			while (true) {
				int alt104=2;
				int LA104_0 = input.LA(1);
				if ( (LA104_0==COMMA) ) {
					alt104=1;
				}

				switch (alt104) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3363:11: COMMA var= one_bound_variable
					{
					match(input,COMMA,FOLLOW_COMMA_in_bound_variables8202); if (state.failed) return list;
					pushFollow(FOLLOW_one_bound_variable_in_bound_variables8208);
					var=one_bound_variable();
					state._fsp--;
					if (state.failed) return list;
					if ( state.backtracking==0 ) { list = list.append(var); }
					}
					break;

				default :
					break loop104;
				}
			}

			match(input,SEMI,FOLLOW_SEMI_in_bound_variables8227); if (state.failed) return list;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return list;
	}
	// $ANTLR end "bound_variables"



	// $ANTLR start "one_bound_variable"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3368:1: one_bound_variable returns [QuantifiableVariable _one_bound_variable=null] : ({...}?v= one_logic_bound_variable_nosort |{...}?v= one_schema_bound_variable |{...}?v= one_logic_bound_variable );
	public final QuantifiableVariable one_bound_variable() throws RecognitionException {
		QuantifiableVariable _one_bound_variable = null;


		QuantifiableVariable v =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3370:3: ({...}?v= one_logic_bound_variable_nosort |{...}?v= one_schema_bound_variable |{...}?v= one_logic_bound_variable )
			int alt105=3;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==IDENT) ) {
				int LA105_1 = input.LA(2);
				if ( ((isGlobalDeclTermParser())) ) {
					alt105=1;
				}
				else if ( ((inSchemaMode())) ) {
					alt105=2;
				}
				else if ( ((!inSchemaMode())) ) {
					alt105=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return _one_bound_variable;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return _one_bound_variable;}
				NoViableAltException nvae =
					new NoViableAltException("", 105, 0, input);
				throw nvae;
			}

			switch (alt105) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3371:3: {...}?v= one_logic_bound_variable_nosort
					{
					if ( !((isGlobalDeclTermParser())) ) {
						if (state.backtracking>0) {state.failed=true; return _one_bound_variable;}
						throw new FailedPredicateException(input, "one_bound_variable", "isGlobalDeclTermParser()");
					}
					pushFollow(FOLLOW_one_logic_bound_variable_nosort_in_one_bound_variable8251);
					v=one_logic_bound_variable_nosort();
					state._fsp--;
					if (state.failed) return _one_bound_variable;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3373:3: {...}?v= one_schema_bound_variable
					{
					if ( !((inSchemaMode())) ) {
						if (state.backtracking>0) {state.failed=true; return _one_bound_variable;}
						throw new FailedPredicateException(input, "one_bound_variable", "inSchemaMode()");
					}
					pushFollow(FOLLOW_one_schema_bound_variable_in_one_bound_variable8264);
					v=one_schema_bound_variable();
					state._fsp--;
					if (state.failed) return _one_bound_variable;
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3375:3: {...}?v= one_logic_bound_variable
					{
					if ( !((!inSchemaMode())) ) {
						if (state.backtracking>0) {state.failed=true; return _one_bound_variable;}
						throw new FailedPredicateException(input, "one_bound_variable", "!inSchemaMode()");
					}
					pushFollow(FOLLOW_one_logic_bound_variable_in_one_bound_variable8277);
					v=one_logic_bound_variable();
					state._fsp--;
					if (state.failed) return _one_bound_variable;
					}
					break;

			}
			if ( state.backtracking==0 ) { _one_bound_variable = v; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _one_bound_variable;
	}
	// $ANTLR end "one_bound_variable"



	// $ANTLR start "one_schema_bound_variable"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3378:1: one_schema_bound_variable returns [QuantifiableVariable v=null] : id= simple_ident ;
	public final QuantifiableVariable one_schema_bound_variable() throws RecognitionException {
		QuantifiableVariable v = null;


		String id =null;


		  Operator ts = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3382:4: (id= simple_ident )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3383:4: id= simple_ident
			{
			pushFollow(FOLLOW_simple_ident_in_one_schema_bound_variable8300);
			id=simple_ident();
			state._fsp--;
			if (state.failed) return v;
			if ( state.backtracking==0 ) {
			      ts = (Operator) variables().lookup(new Name(id));   
			      if ( ! (ts instanceof VariableSV)) {
			        semanticError(ts+" is not allowed in a quantifier. Note, that you can't "
			        + "use the normal syntax for quantifiers of the form \"\\exists int i;\""
			        + " in taclets. You have to define the variable as a schema variable"
			        + " and use the syntax \"\\exists i;\" instead.");
			      }
			      v = (QuantifiableVariable) ts;
			      bindVar();
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return v;
	}
	// $ANTLR end "one_schema_bound_variable"



	// $ANTLR start "one_logic_bound_variable"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3396:1: one_logic_bound_variable returns [QuantifiableVariable v=null] : s= sortId id= simple_ident ;
	public final QuantifiableVariable one_logic_bound_variable() throws RecognitionException {
		QuantifiableVariable v = null;


		Sort s =null;
		String id =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3397:3: (s= sortId id= simple_ident )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3398:3: s= sortId id= simple_ident
			{
			pushFollow(FOLLOW_sortId_in_one_logic_bound_variable8318);
			s=sortId();
			state._fsp--;
			if (state.failed) return v;
			pushFollow(FOLLOW_simple_ident_in_one_logic_bound_variable8322);
			id=simple_ident();
			state._fsp--;
			if (state.failed) return v;
			if ( state.backtracking==0 ) {
			    v = bindVar(id, s);
			  }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return v;
	}
	// $ANTLR end "one_logic_bound_variable"



	// $ANTLR start "one_logic_bound_variable_nosort"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3403:1: one_logic_bound_variable_nosort returns [QuantifiableVariable v=null] : id= simple_ident ;
	public final QuantifiableVariable one_logic_bound_variable_nosort() throws RecognitionException {
		QuantifiableVariable v = null;


		String id =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3404:3: (id= simple_ident )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3405:3: id= simple_ident
			{
			pushFollow(FOLLOW_simple_ident_in_one_logic_bound_variable_nosort8340);
			id=simple_ident();
			state._fsp--;
			if (state.failed) return v;
			if ( state.backtracking==0 ) {
			    v = (LogicVariable)variables().lookup(new Name(id));
			  }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return v;
	}
	// $ANTLR end "one_logic_bound_variable_nosort"



	// $ANTLR start "modality_dl_term"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3410:1: modality_dl_term returns [Term _modality_dl_term = null] : modality= MODALITY ({...}?a1= term60 ) ;
	public final Term modality_dl_term() throws RecognitionException {
		Term _modality_dl_term =  null;


		Token modality=null;
		Term a1 =null;


		    Operator op = null;
		    PairOfStringAndJavaBlock sjb = null;
		    Term a = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3417:4: (modality= MODALITY ({...}?a1= term60 ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3418:4: modality= MODALITY ({...}?a1= term60 )
			{
			modality=(Token)match(input,MODALITY,FOLLOW_MODALITY_in_modality_dl_term8373); if (state.failed) return _modality_dl_term;
			if ( state.backtracking==0 ) {
			       sjb=getJavaBlock(modality);
			       Debug.out("op: ", sjb.opName);
			       Debug.out("program: ", sjb.javaBlock);
			       if(sjb.opName.charAt(0) == '#') {
			         if (!inSchemaMode()) {
			           semanticError
			             ("No schema elements allowed outside taclet declarations ("+sjb.opName+")");
			         }
			         op = (SchemaVariable)variables().lookup(new Name(sjb.opName));
			       } else {
			         op = Modality.getModality(sjb.opName);
			       }
			       if(op == null) {
			         semanticError("Unknown modal operator: "+sjb.opName);
			       }
			     }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3437:4: ({...}?a1= term60 )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3437:5: {...}?a1= term60
			{
			if ( !((op != null && op.arity() == 1)) ) {
				if (state.backtracking>0) {state.failed=true; return _modality_dl_term;}
				throw new FailedPredicateException(input, "modality_dl_term", "op != null && op.arity() == 1");
			}
			pushFollow(FOLLOW_term60_in_modality_dl_term8394);
			a1=term60();
			state._fsp--;
			if (state.failed) return _modality_dl_term;
			if ( state.backtracking==0 ) {
			            a = getTermFactory().createTerm(op, new Term[]{a1}, null, sjb.javaBlock);
			      }
			}

			}

			if ( state.backtracking==0 ) { _modality_dl_term = a; }
		}
		catch (TermCreationException ex) {

			              raiseException
					(new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _modality_dl_term;
	}
	// $ANTLR end "modality_dl_term"



	// $ANTLR start "argument_list"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3453:1: argument_list returns [Term[] _argument_list = null] : LPAREN (p1= argument ( COMMA p2= argument )* )? RPAREN ;
	public final Term[] argument_list() throws RecognitionException {
		Term[] _argument_list =  null;


		Term p1 =null;
		Term p2 =null;


		    List<Term> args = new LinkedList<Term>();
		    Term[] result = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3459:5: ( LPAREN (p1= argument ( COMMA p2= argument )* )? RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3460:9: LPAREN (p1= argument ( COMMA p2= argument )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_argument_list8482); if (state.failed) return _argument_list;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3461:9: (p1= argument ( COMMA p2= argument )* )?
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==AT||LA107_0==CHAR_LITERAL||LA107_0==EXISTS||LA107_0==FALSE||LA107_0==FORALL||(LA107_0 >= IDENT && LA107_0 <= IFEX)||LA107_0==LBRACE||LA107_0==LPAREN||LA107_0==MINUS||LA107_0==MODALITY||LA107_0==NOT||LA107_0==NUM_LITERAL||LA107_0==STRING_LITERAL||LA107_0==TRUE) ) {
				alt107=1;
			}
			switch (alt107) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3461:10: p1= argument ( COMMA p2= argument )*
					{
					pushFollow(FOLLOW_argument_in_argument_list8498);
					p1=argument();
					state._fsp--;
					if (state.failed) return _argument_list;
					if ( state.backtracking==0 ) { args.add(p1);  }
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3463:13: ( COMMA p2= argument )*
					loop106:
					while (true) {
						int alt106=2;
						int LA106_0 = input.LA(1);
						if ( (LA106_0==COMMA) ) {
							alt106=1;
						}

						switch (alt106) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3463:14: COMMA p2= argument
							{
							match(input,COMMA,FOLLOW_COMMA_in_argument_list8516); if (state.failed) return _argument_list;
							pushFollow(FOLLOW_argument_in_argument_list8522);
							p2=argument();
							state._fsp--;
							if (state.failed) return _argument_list;
							if ( state.backtracking==0 ) { args.add(p2); }
							}
							break;

						default :
							break loop106;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_argument_list8541); if (state.failed) return _argument_list;
			if ( state.backtracking==0 ) {
			            result = args.toArray(new Term[0]);
			        }
			}

			if ( state.backtracking==0 ) { _argument_list = result; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _argument_list;
	}
	// $ANTLR end "argument_list"



	// $ANTLR start "funcpredvarterm"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3472:1: funcpredvarterm returns [Term _func_pred_var_term = null] : (ch= CHAR_LITERAL | ( ( MINUS )? NUM_LITERAL )=> ( MINUS )? number= NUM_LITERAL | AT a= abbreviation |varfuncid= funcpred_name ( LIMITED )? ( (~ LBRACE | LBRACE bound_variables )=> ( LBRACE boundVars= bound_variables RBRACE )? args= argument_list )? );
	public final Term funcpredvarterm() throws RecognitionException {
		Term _func_pred_var_term =  null;


		Token ch=null;
		Token number=null;
		Term a =null;
		String varfuncid =null;
		ImmutableList<QuantifiableVariable> boundVars =null;
		Term[] args =null;


		    String neg = "";
		    boolean opSV = false;
		    Namespace orig = variables();
		    boolean limited = false;  

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3480:5: (ch= CHAR_LITERAL | ( ( MINUS )? NUM_LITERAL )=> ( MINUS )? number= NUM_LITERAL | AT a= abbreviation |varfuncid= funcpred_name ( LIMITED )? ( (~ LBRACE | LBRACE bound_variables )=> ( LBRACE boundVars= bound_variables RBRACE )? args= argument_list )? )
			int alt112=4;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==CHAR_LITERAL) ) {
				alt112=1;
			}
			else if ( (LA112_0==MINUS) && (synpred12_KeYParser())) {
				alt112=2;
			}
			else if ( (LA112_0==NUM_LITERAL) && (synpred12_KeYParser())) {
				alt112=2;
			}
			else if ( (LA112_0==AT) ) {
				alt112=3;
			}
			else if ( (LA112_0==IDENT) ) {
				alt112=4;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return _func_pred_var_term;}
				NoViableAltException nvae =
					new NoViableAltException("", 112, 0, input);
				throw nvae;
			}

			switch (alt112) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3481:7: ch= CHAR_LITERAL
					{
					ch=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_funcpredvarterm8590); if (state.failed) return _func_pred_var_term;
					if ( state.backtracking==0 ) {
					            String s = ch.getText();
					            int intVal = 0;
					            if (s.length()==3) {
					                intVal = (int)s.charAt(1);
					            } else {
					                try {
					                    intVal = Integer.parseInt(s.substring(3,s.length()-1),16);
					                } catch (NumberFormatException ex) {
					                    semanticError("'"+s+"' is not a valid character.");
					                }       
					            }
					            a = getTermFactory().createTerm((Function) functions().lookup(new Name("C")), 
					                                      toZNotation(""+intVal, functions()).sub(0));
					        }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3497:9: ( ( MINUS )? NUM_LITERAL )=> ( MINUS )? number= NUM_LITERAL
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3497:35: ( MINUS )?
					int alt108=2;
					int LA108_0 = input.LA(1);
					if ( (LA108_0==MINUS) ) {
						alt108=1;
					}
					switch (alt108) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3497:36: MINUS
							{
							match(input,MINUS,FOLLOW_MINUS_in_funcpredvarterm8621); if (state.failed) return _func_pred_var_term;
							if ( state.backtracking==0 ) {neg = "-";}
							}
							break;

					}

					number=(Token)match(input,NUM_LITERAL,FOLLOW_NUM_LITERAL_in_funcpredvarterm8629); if (state.failed) return _func_pred_var_term;
					if ( state.backtracking==0 ) { a = toZNotation(neg+number.getText(), functions());}
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3499:7: AT a= abbreviation
					{
					match(input,AT,FOLLOW_AT_in_funcpredvarterm8651); if (state.failed) return _func_pred_var_term;
					pushFollow(FOLLOW_abbreviation_in_funcpredvarterm8657);
					a=abbreviation();
					state._fsp--;
					if (state.failed) return _func_pred_var_term;
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3500:7: varfuncid= funcpred_name ( LIMITED )? ( (~ LBRACE | LBRACE bound_variables )=> ( LBRACE boundVars= bound_variables RBRACE )? args= argument_list )?
					{
					pushFollow(FOLLOW_funcpred_name_in_funcpredvarterm8669);
					varfuncid=funcpred_name();
					state._fsp--;
					if (state.failed) return _func_pred_var_term;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3500:33: ( LIMITED )?
					int alt109=2;
					int LA109_0 = input.LA(1);
					if ( (LA109_0==LIMITED) ) {
						alt109=1;
					}
					switch (alt109) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3500:34: LIMITED
							{
							match(input,LIMITED,FOLLOW_LIMITED_in_funcpredvarterm8672); if (state.failed) return _func_pred_var_term;
							if ( state.backtracking==0 ) {limited = true;}
							}
							break;

					}

					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3501:9: ( (~ LBRACE | LBRACE bound_variables )=> ( LBRACE boundVars= bound_variables RBRACE )? args= argument_list )?
					int alt111=2;
					int LA111_0 = input.LA(1);
					if ( (LA111_0==LBRACE) && (synpred13_KeYParser())) {
						alt111=1;
					}
					else if ( (LA111_0==LPAREN) && (synpred13_KeYParser())) {
						alt111=1;
					}
					switch (alt111) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3501:11: (~ LBRACE | LBRACE bound_variables )=> ( LBRACE boundVars= bound_variables RBRACE )? args= argument_list
							{
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3502:13: ( LBRACE boundVars= bound_variables RBRACE )?
							int alt110=2;
							int LA110_0 = input.LA(1);
							if ( (LA110_0==LBRACE) ) {
								alt110=1;
							}
							switch (alt110) {
								case 1 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3503:16: LBRACE boundVars= bound_variables RBRACE
									{
									match(input,LBRACE,FOLLOW_LBRACE_in_funcpredvarterm8730); if (state.failed) return _func_pred_var_term;
									pushFollow(FOLLOW_bound_variables_in_funcpredvarterm8752);
									boundVars=bound_variables();
									state._fsp--;
									if (state.failed) return _func_pred_var_term;
									match(input,RBRACE,FOLLOW_RBRACE_in_funcpredvarterm8770); if (state.failed) return _func_pred_var_term;
									}
									break;

							}

							pushFollow(FOLLOW_argument_list_in_funcpredvarterm8805);
							args=argument_list();
							state._fsp--;
							if (state.failed) return _func_pred_var_term;
							}
							break;

					}

					if ( state.backtracking==0 ) {  
					            if(varfuncid.equals("inReachableState") && args == null) {
						        a = getServices().getTermBuilder().wellFormed(getServices().getTypeConverter().getHeapLDT().getHeap());
						    } else if(varfuncid.equals("skip") && args == null) {
						        a = getTermFactory().createTerm(UpdateJunctor.SKIP);
						    } else {
						            Operator op = lookupVarfuncId(varfuncid, args);  
						            if(limited) {
						                if(op.getClass() == ObserverFunction.class) {
						                    op = getServices().getSpecificationRepository()
						                                      .limitObs((ObserverFunction)op).first;
						                } else {
						                    semanticError("Cannot can be limited: " + op);
						                }
						            }   
						                   
						            if (op instanceof ParsableVariable) {
						                a = termForParsedVariable((ParsableVariable)op);
						            } else {
						                if (args==null) {
						                    args = new Term[0];
						                }
						
						                if(boundVars == null) {
						                    a = getTermFactory().createTerm(op, args);
						                } else {
						                    //sanity check
						                    assert op instanceof Function;
						                    for(int i = 0; i < args.length; i++) {
						                        if(i < op.arity() && !op.bindVarsAt(i)) {
						                            for(QuantifiableVariable qv : args[i].freeVars()) {
						                                if(boundVars.contains(qv)) {
						                                    semanticError("Building function term "+op+" with bound variables failed: "
						                                                   + "Variable " + qv + " must not occur free in subterm " + args[i]);
						                                } 
						                            }	                            
						                        }
						                    }
						                    
						                    //create term
						                    a = getTermFactory().createTerm(op, args, new ImmutableArray<QuantifiableVariable>(boundVars.toArray(new QuantifiableVariable[boundVars.size()])), null);
						                }
						            }
						    }
						    
						    if(boundVars != null) {
						        unbindVars(orig);
						    }
					        }
					}
					break;

			}
			if ( state.backtracking==0 ) { _func_pred_var_term = a; }
		}
		catch (TermCreationException ex) {

			              raiseException
					(new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _func_pred_var_term;
	}
	// $ANTLR end "funcpredvarterm"



	// $ANTLR start "specialTerm"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3569:1: specialTerm returns [Term _special_term = null] :{...}?result= metaTerm ;
	public final Term specialTerm() throws RecognitionException {
		Term _special_term =  null;


		Term result =null;


		    Operator vf = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3573:35: ({...}?result= metaTerm )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3574:6: {...}?result= metaTerm
			{
			if ( !((isTacletParser() || isProblemParser())) ) {
				if (state.backtracking>0) {state.failed=true; return _special_term;}
				throw new FailedPredicateException(input, "specialTerm", "isTacletParser() || isProblemParser()");
			}
			pushFollow(FOLLOW_metaTerm_in_specialTerm8925);
			result=metaTerm();
			state._fsp--;
			if (state.failed) return _special_term;
			}

			if ( state.backtracking==0 ) { _special_term = result; }
		}
		catch (TermCreationException ex) {

			              raiseException
					(new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return _special_term;
	}
	// $ANTLR end "specialTerm"



	// $ANTLR start "arith_op"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3582:1: arith_op returns [String op = null] : ( PERCENT | STAR | MINUS | SLASH | PLUS );
	public final String arith_op() throws RecognitionException {
		String op =  null;


		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3583:5: ( PERCENT | STAR | MINUS | SLASH | PLUS )
			int alt113=5;
			switch ( input.LA(1) ) {
			case PERCENT:
				{
				alt113=1;
				}
				break;
			case STAR:
				{
				alt113=2;
				}
				break;
			case MINUS:
				{
				alt113=3;
				}
				break;
			case SLASH:
				{
				alt113=4;
				}
				break;
			case PLUS:
				{
				alt113=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return op;}
				NoViableAltException nvae =
					new NoViableAltException("", 113, 0, input);
				throw nvae;
			}
			switch (alt113) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3584:5: PERCENT
					{
					match(input,PERCENT,FOLLOW_PERCENT_in_arith_op8959); if (state.failed) return op;
					if ( state.backtracking==0 ) {op = "%";}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3585:5: STAR
					{
					match(input,STAR,FOLLOW_STAR_in_arith_op8967); if (state.failed) return op;
					if ( state.backtracking==0 ) {op = "*";}
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3586:5: MINUS
					{
					match(input,MINUS,FOLLOW_MINUS_in_arith_op8975); if (state.failed) return op;
					if ( state.backtracking==0 ) {op = "-";}
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3587:5: SLASH
					{
					match(input,SLASH,FOLLOW_SLASH_in_arith_op8983); if (state.failed) return op;
					if ( state.backtracking==0 ) {op = "/";}
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3588:5: PLUS
					{
					match(input,PLUS,FOLLOW_PLUS_in_arith_op8991); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = "+";}
					}
					break;

			}
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "arith_op"



	// $ANTLR start "varId"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3592:1: varId returns [ParsableVariable v = null] : id= IDENT ;
	public final ParsableVariable varId() throws RecognitionException {
		ParsableVariable v =  null;


		Token id=null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3593:5: (id= IDENT )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3594:9: id= IDENT
			{
			id=(Token)match(input,IDENT,FOLLOW_IDENT_in_varId9021); if (state.failed) return v;
			if ( state.backtracking==0 ) {   
			            v = (ParsableVariable) variables().lookup(new Name(id.getText()));
			            if (v == null) {
			                throw new NotDeclException(input, "variable", id.getText());
			            }
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return v;
	}
	// $ANTLR end "varId"



	// $ANTLR start "varIds"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3603:1: varIds returns [LinkedList list = new LinkedList()] : ids= simple_ident_comma_list ;
	public final LinkedList varIds() throws RecognitionException {
		LinkedList list =  new LinkedList();


		ImmutableList<String> ids =null;


		   ParsableVariable v = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3607:5: (ids= simple_ident_comma_list )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3608:7: ids= simple_ident_comma_list
			{
			pushFollow(FOLLOW_simple_ident_comma_list_in_varIds9066);
			ids=simple_ident_comma_list();
			state._fsp--;
			if (state.failed) return list;
			if ( state.backtracking==0 ) {
			         Iterator<String> it = ids.iterator();
				 while(it.hasNext()) {
				    String id = it.next();
			            v = (ParsableVariable) variables().lookup(new Name(id));
			            if (v == null) {
			               semanticError("Variable " +id + " not declared.");
			            }
				    list.add(v);
				 }
			      }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return list;
	}
	// $ANTLR end "varIds"



	// $ANTLR start "triggers"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3621:1: triggers[TacletBuilder b] : TRIGGER LBRACE id= simple_ident RBRACE t= term ( AVOID avoidCond= term ( COMMA avoidCond= term )* )? SEMI ;
	public final void triggers(TacletBuilder b) throws RecognitionException {
		String id =null;
		Term t =null;
		Term avoidCond =null;


		   id = null;
		   t = null;
		   Named triggerVar = null;
		   avoidCond = null;
		   ImmutableList<Term> avoidConditions = ImmutableSLList.<Term>nil();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3628:3: ( TRIGGER LBRACE id= simple_ident RBRACE t= term ( AVOID avoidCond= term ( COMMA avoidCond= term )* )? SEMI )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3629:4: TRIGGER LBRACE id= simple_ident RBRACE t= term ( AVOID avoidCond= term ( COMMA avoidCond= term )* )? SEMI
			{
			match(input,TRIGGER,FOLLOW_TRIGGER_in_triggers9088); if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_triggers9095); if (state.failed) return;
			pushFollow(FOLLOW_simple_ident_in_triggers9101);
			id=simple_ident();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {  
			     	  triggerVar = variables().lookup(new Name(id));
			     	  if (triggerVar == null || !(triggerVar instanceof SchemaVariable)) {
			     	  	semanticError("Undeclared schemavariable: " + id);
			     	  }  
			     	}
			match(input,RBRACE,FOLLOW_RBRACE_in_triggers9114); if (state.failed) return;
			pushFollow(FOLLOW_term_in_triggers9128);
			t=term();
			state._fsp--;
			if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3637:13: ( AVOID avoidCond= term ( COMMA avoidCond= term )* )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==AVOID) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3637:14: AVOID avoidCond= term ( COMMA avoidCond= term )*
					{
					match(input,AVOID,FOLLOW_AVOID_in_triggers9131); if (state.failed) return;
					pushFollow(FOLLOW_term_in_triggers9135);
					avoidCond=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {avoidConditions = avoidConditions.append(avoidCond);}
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3638:7: ( COMMA avoidCond= term )*
					loop114:
					while (true) {
						int alt114=2;
						int LA114_0 = input.LA(1);
						if ( (LA114_0==COMMA) ) {
							alt114=1;
						}

						switch (alt114) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3638:8: COMMA avoidCond= term
							{
							match(input,COMMA,FOLLOW_COMMA_in_triggers9147); if (state.failed) return;
							pushFollow(FOLLOW_term_in_triggers9151);
							avoidCond=term();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) {avoidConditions = avoidConditions.append(avoidCond);}
							}
							break;

						default :
							break loop114;
						}
					}

					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_triggers9159); if (state.failed) return;
			if ( state.backtracking==0 ) {
			     b.setTrigger(new Trigger((SchemaVariable)triggerVar, t, avoidConditions));
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "triggers"



	// $ANTLR start "taclet"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3644:1: taclet[ImmutableSet<Choice> choices, boolean axiomMode] returns [Taclet r] : ( LEMMA )? name= IDENT (choices_= option_list[choices_] )? LBRACE ( ( formula RBRACE )=>form= formula | ( SCHEMAVAR one_schema_var_decl )* ( ASSUMES LPAREN ifSeq= seq RPAREN )? ( FIND LPAREN find= termorseq RPAREN ( SAMEUPDATELEVEL | INSEQUENTSTATE | ANTECEDENTPOLARITY | SUCCEDENTPOLARITY )* )? ( VARCOND LPAREN varexplist[b] RPAREN )? goalspecs[b, find != null] modifiers[b] ) RBRACE ;
	public final Taclet taclet(ImmutableSet<Choice> choices, boolean axiomMode) throws RecognitionException {
		Taclet r = null;


		Token name=null;
		ImmutableSet<Choice> choices_ =null;
		Term form =null;
		Sequent ifSeq =null;
		Object find =null;

		 
		    ifSeq = Sequent.EMPTY_SEQUENT;
		    TacletBuilder b = null;
		    int applicationRestriction = RewriteTaclet.NONE;
		    choices_ = choices;
		    switchToNormalMode();
		    ImmutableSet<TacletAnnotation> tacletAnnotations = DefaultImmutableSet.<TacletAnnotation>nil();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3653:5: ( ( LEMMA )? name= IDENT (choices_= option_list[choices_] )? LBRACE ( ( formula RBRACE )=>form= formula | ( SCHEMAVAR one_schema_var_decl )* ( ASSUMES LPAREN ifSeq= seq RPAREN )? ( FIND LPAREN find= termorseq RPAREN ( SAMEUPDATELEVEL | INSEQUENTSTATE | ANTECEDENTPOLARITY | SUCCEDENTPOLARITY )* )? ( VARCOND LPAREN varexplist[b] RPAREN )? goalspecs[b, find != null] modifiers[b] ) RBRACE )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3654:7: ( LEMMA )? name= IDENT (choices_= option_list[choices_] )? LBRACE ( ( formula RBRACE )=>form= formula | ( SCHEMAVAR one_schema_var_decl )* ( ASSUMES LPAREN ifSeq= seq RPAREN )? ( FIND LPAREN find= termorseq RPAREN ( SAMEUPDATELEVEL | INSEQUENTSTATE | ANTECEDENTPOLARITY | SUCCEDENTPOLARITY )* )? ( VARCOND LPAREN varexplist[b] RPAREN )? goalspecs[b, find != null] modifiers[b] ) RBRACE
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3654:7: ( LEMMA )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==LEMMA) ) {
				alt116=1;
			}
			switch (alt116) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3654:8: LEMMA
					{
					match(input,LEMMA,FOLLOW_LEMMA_in_taclet9195); if (state.failed) return r;
					if ( state.backtracking==0 ) {tacletAnnotations = tacletAnnotations.add(de.uka.ilkd.key.rule.TacletAnnotation.LEMMA);}
					}
					break;

			}

			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_taclet9209); if (state.failed) return r;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3655:18: (choices_= option_list[choices_] )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==LPAREN) ) {
				alt117=1;
			}
			switch (alt117) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3655:19: choices_= option_list[choices_]
					{
					pushFollow(FOLLOW_option_list_in_taclet9214);
					choices_=option_list(choices_);
					state._fsp--;
					if (state.failed) return r;
					}
					break;

			}

			match(input,LBRACE,FOLLOW_LBRACE_in_taclet9226); if (state.failed) return r;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3657:7: ( ( formula RBRACE )=>form= formula | ( SCHEMAVAR one_schema_var_decl )* ( ASSUMES LPAREN ifSeq= seq RPAREN )? ( FIND LPAREN find= termorseq RPAREN ( SAMEUPDATELEVEL | INSEQUENTSTATE | ANTECEDENTPOLARITY | SUCCEDENTPOLARITY )* )? ( VARCOND LPAREN varexplist[b] RPAREN )? goalspecs[b, find != null] modifiers[b] )
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==NOT) && (synpred14_KeYParser())) {
				alt123=1;
			}
			else if ( (LA123_0==FORALL) && (synpred14_KeYParser())) {
				alt123=1;
			}
			else if ( (LA123_0==EXISTS) && (synpred14_KeYParser())) {
				alt123=1;
			}
			else if ( (LA123_0==MODALITY) && (synpred14_KeYParser())) {
				alt123=1;
			}
			else if ( (LA123_0==LBRACE) && (synpred14_KeYParser())) {
				alt123=1;
			}
			else if ( (LA123_0==MINUS) && (synpred14_KeYParser())) {
				alt123=1;
			}
			else if ( (LA123_0==LPAREN) ) {
				int LA123_7 = input.LA(2);
				if ( (synpred14_KeYParser()) ) {
					alt123=1;
				}
				else if ( (true) ) {
					alt123=2;
				}

			}
			else if ( (LA123_0==IDENT) && (synpred14_KeYParser())) {
				alt123=1;
			}
			else if ( (LA123_0==CHAR_LITERAL) && (synpred14_KeYParser())) {
				alt123=1;
			}
			else if ( (LA123_0==NUM_LITERAL) && (synpred14_KeYParser())) {
				alt123=1;
			}
			else if ( (LA123_0==AT) && (synpred14_KeYParser())) {
				alt123=1;
			}
			else if ( (LA123_0==TRUE) && (synpred14_KeYParser())) {
				alt123=1;
			}
			else if ( (LA123_0==FALSE) && (synpred14_KeYParser())) {
				alt123=1;
			}
			else if ( (LA123_0==IF) && (synpred14_KeYParser())) {
				alt123=1;
			}
			else if ( (LA123_0==IFEX) && (synpred14_KeYParser())) {
				alt123=1;
			}
			else if ( (LA123_0==STRING_LITERAL) ) {
				int LA123_16 = input.LA(2);
				if ( (synpred14_KeYParser()) ) {
					alt123=1;
				}
				else if ( (true) ) {
					alt123=2;
				}

			}
			else if ( (LA123_0==ADD||LA123_0==ADDRULES||LA123_0==ASSUMES||LA123_0==CLOSEGOAL||LA123_0==FIND||LA123_0==REPLACEWITH||LA123_0==SCHEMAVAR||LA123_0==VARCOND) ) {
				alt123=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 123, 0, input);
				throw nvae;
			}

			switch (alt123) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3657:9: ( formula RBRACE )=>form= formula
					{
					if ( state.backtracking==0 ) { if(!axiomMode) { semanticError("formula rules are only permitted for \\axioms"); }           }
					pushFollow(FOLLOW_formula_in_taclet9270);
					form=formula();
					state._fsp--;
					if (state.failed) return r;
					if ( state.backtracking==0 ) { r = null; }
					if ( state.backtracking==0 ) { b = createTacletBuilderFor(null, RewriteTaclet.NONE);
					           SequentFormula sform = new SequentFormula(form);
					           Semisequent semi = new Semisequent(sform);
					           Sequent addSeq = Sequent.createAnteSequent(semi);
					           ImmutableList<Taclet> noTaclets = ImmutableSLList.<Taclet>nil();
					           DefaultImmutableSet<SchemaVariable> noSV = DefaultImmutableSet.<SchemaVariable>nil();
					           addGoalTemplate(b, null, null, addSeq, noTaclets, noSV, null);
					           b.setName(new Name(name.getText()));
					           b.setChoices(choices_);
					           b.setAnnotations(tacletAnnotations);
					           r = b.getTaclet(); 
					           taclet2Builder.put(r,b);
					         }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3675:9: ( SCHEMAVAR one_schema_var_decl )* ( ASSUMES LPAREN ifSeq= seq RPAREN )? ( FIND LPAREN find= termorseq RPAREN ( SAMEUPDATELEVEL | INSEQUENTSTATE | ANTECEDENTPOLARITY | SUCCEDENTPOLARITY )* )? ( VARCOND LPAREN varexplist[b] RPAREN )? goalspecs[b, find != null] modifiers[b]
					{
					if ( state.backtracking==0 ) {
					           switchToSchemaMode();
					           //  schema var decls
					           namespaces().setVariables(new Namespace(variables()));
					        }
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3680:9: ( SCHEMAVAR one_schema_var_decl )*
					loop118:
					while (true) {
						int alt118=2;
						int LA118_0 = input.LA(1);
						if ( (LA118_0==SCHEMAVAR) ) {
							alt118=1;
						}

						switch (alt118) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3680:11: SCHEMAVAR one_schema_var_decl
							{
							match(input,SCHEMAVAR,FOLLOW_SCHEMAVAR_in_taclet9314); if (state.failed) return r;
							pushFollow(FOLLOW_one_schema_var_decl_in_taclet9316);
							one_schema_var_decl();
							state._fsp--;
							if (state.failed) return r;
							}
							break;

						default :
							break loop118;
						}
					}

					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3681:9: ( ASSUMES LPAREN ifSeq= seq RPAREN )?
					int alt119=2;
					int LA119_0 = input.LA(1);
					if ( (LA119_0==ASSUMES) ) {
						alt119=1;
					}
					switch (alt119) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3681:11: ASSUMES LPAREN ifSeq= seq RPAREN
							{
							match(input,ASSUMES,FOLLOW_ASSUMES_in_taclet9332); if (state.failed) return r;
							match(input,LPAREN,FOLLOW_LPAREN_in_taclet9334); if (state.failed) return r;
							pushFollow(FOLLOW_seq_in_taclet9338);
							ifSeq=seq();
							state._fsp--;
							if (state.failed) return r;
							match(input,RPAREN,FOLLOW_RPAREN_in_taclet9340); if (state.failed) return r;
							}
							break;

					}

					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3682:9: ( FIND LPAREN find= termorseq RPAREN ( SAMEUPDATELEVEL | INSEQUENTSTATE | ANTECEDENTPOLARITY | SUCCEDENTPOLARITY )* )?
					int alt121=2;
					int LA121_0 = input.LA(1);
					if ( (LA121_0==FIND) ) {
						alt121=1;
					}
					switch (alt121) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3682:11: FIND LPAREN find= termorseq RPAREN ( SAMEUPDATELEVEL | INSEQUENTSTATE | ANTECEDENTPOLARITY | SUCCEDENTPOLARITY )*
							{
							match(input,FIND,FOLLOW_FIND_in_taclet9356); if (state.failed) return r;
							match(input,LPAREN,FOLLOW_LPAREN_in_taclet9358); if (state.failed) return r;
							pushFollow(FOLLOW_termorseq_in_taclet9364);
							find=termorseq();
							state._fsp--;
							if (state.failed) return r;
							match(input,RPAREN,FOLLOW_RPAREN_in_taclet9366); if (state.failed) return r;
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3683:13: ( SAMEUPDATELEVEL | INSEQUENTSTATE | ANTECEDENTPOLARITY | SUCCEDENTPOLARITY )*
							loop120:
							while (true) {
								int alt120=5;
								switch ( input.LA(1) ) {
								case SAMEUPDATELEVEL:
									{
									alt120=1;
									}
									break;
								case INSEQUENTSTATE:
									{
									alt120=2;
									}
									break;
								case ANTECEDENTPOLARITY:
									{
									alt120=3;
									}
									break;
								case SUCCEDENTPOLARITY:
									{
									alt120=4;
									}
									break;
								}
								switch (alt120) {
								case 1 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3683:17: SAMEUPDATELEVEL
									{
									match(input,SAMEUPDATELEVEL,FOLLOW_SAMEUPDATELEVEL_in_taclet9385); if (state.failed) return r;
									if ( state.backtracking==0 ) { applicationRestriction |= RewriteTaclet.SAME_UPDATE_LEVEL; }
									}
									break;
								case 2 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3684:17: INSEQUENTSTATE
									{
									match(input,INSEQUENTSTATE,FOLLOW_INSEQUENTSTATE_in_taclet9405); if (state.failed) return r;
									if ( state.backtracking==0 ) { applicationRestriction |= RewriteTaclet.IN_SEQUENT_STATE; }
									}
									break;
								case 3 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3685:17: ANTECEDENTPOLARITY
									{
									match(input,ANTECEDENTPOLARITY,FOLLOW_ANTECEDENTPOLARITY_in_taclet9425); if (state.failed) return r;
									if ( state.backtracking==0 ) { applicationRestriction |= RewriteTaclet.ANTECEDENT_POLARITY; }
									}
									break;
								case 4 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3686:17: SUCCEDENTPOLARITY
									{
									match(input,SUCCEDENTPOLARITY,FOLLOW_SUCCEDENTPOLARITY_in_taclet9445); if (state.failed) return r;
									if ( state.backtracking==0 ) { applicationRestriction |= RewriteTaclet.SUCCEDENT_POLARITY; }
									}
									break;

								default :
									break loop120;
								}
							}

							}
							break;

					}

					if ( state.backtracking==0 ) { 
					            b = createTacletBuilderFor(find, applicationRestriction);
					            b.setName(new Name(name.getText()));
					            b.setIfSequent(ifSeq);
					        }
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3694:9: ( VARCOND LPAREN varexplist[b] RPAREN )?
					int alt122=2;
					int LA122_0 = input.LA(1);
					if ( (LA122_0==VARCOND) ) {
						alt122=1;
					}
					switch (alt122) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3694:11: VARCOND LPAREN varexplist[b] RPAREN
							{
							match(input,VARCOND,FOLLOW_VARCOND_in_taclet9496); if (state.failed) return r;
							match(input,LPAREN,FOLLOW_LPAREN_in_taclet9498); if (state.failed) return r;
							pushFollow(FOLLOW_varexplist_in_taclet9500);
							varexplist(b);
							state._fsp--;
							if (state.failed) return r;
							match(input,RPAREN,FOLLOW_RPAREN_in_taclet9503); if (state.failed) return r;
							}
							break;

					}

					pushFollow(FOLLOW_goalspecs_in_taclet9517);
					goalspecs(b, find != null);
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_modifiers_in_taclet9528);
					modifiers(b);
					state._fsp--;
					if (state.failed) return r;
					if ( state.backtracking==0 ) { 
					            b.setChoices(choices_);
					            b.setAnnotations(tacletAnnotations);
					            r = b.getTaclet(); 
					            taclet2Builder.put(r,b);
						  // dump local schema var decls
						  namespaces().setVariables(variables().parent());
					        }
					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_taclet9551); if (state.failed) return r;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "taclet"



	// $ANTLR start "modifiers"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3709:1: modifiers[TacletBuilder b] : (rs= rulesets | NONINTERACTIVE | DISPLAYNAME dname= string_literal | HELPTEXT htext= string_literal | triggers[b] )* ;
	public final void modifiers(TacletBuilder b) throws RecognitionException {
		Vector rs =null;
		String dname =null;
		String htext =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3710:9: ( (rs= rulesets | NONINTERACTIVE | DISPLAYNAME dname= string_literal | HELPTEXT htext= string_literal | triggers[b] )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3711:9: (rs= rulesets | NONINTERACTIVE | DISPLAYNAME dname= string_literal | HELPTEXT htext= string_literal | triggers[b] )*
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3711:9: (rs= rulesets | NONINTERACTIVE | DISPLAYNAME dname= string_literal | HELPTEXT htext= string_literal | triggers[b] )*
			loop124:
			while (true) {
				int alt124=6;
				switch ( input.LA(1) ) {
				case HEURISTICS:
					{
					alt124=1;
					}
					break;
				case NONINTERACTIVE:
					{
					alt124=2;
					}
					break;
				case DISPLAYNAME:
					{
					alt124=3;
					}
					break;
				case HELPTEXT:
					{
					alt124=4;
					}
					break;
				case TRIGGER:
					{
					alt124=5;
					}
					break;
				}
				switch (alt124) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3711:11: rs= rulesets
					{
					pushFollow(FOLLOW_rulesets_in_modifiers9580);
					rs=rulesets();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					           Iterator it = rs.iterator();
					           while(it.hasNext())
					               b.addRuleSet((RuleSet)it.next());
					         }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3716:11: NONINTERACTIVE
					{
					match(input,NONINTERACTIVE,FOLLOW_NONINTERACTIVE_in_modifiers9594); if (state.failed) return;
					if ( state.backtracking==0 ) { b.addRuleSet((RuleSet)ruleSets().lookup(new Name("notHumanReadable"))); }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3717:11: DISPLAYNAME dname= string_literal
					{
					match(input,DISPLAYNAME,FOLLOW_DISPLAYNAME_in_modifiers9608); if (state.failed) return;
					pushFollow(FOLLOW_string_literal_in_modifiers9614);
					dname=string_literal();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {b.setDisplayName(dname);}
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3719:11: HELPTEXT htext= string_literal
					{
					match(input,HELPTEXT,FOLLOW_HELPTEXT_in_modifiers9641); if (state.failed) return;
					pushFollow(FOLLOW_string_literal_in_modifiers9647);
					htext=string_literal();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {b.setHelpText(htext);}
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3721:11: triggers[b]
					{
					pushFollow(FOLLOW_triggers_in_modifiers9673);
					triggers(b);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop124;
				}
			}

			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "modifiers"



	// $ANTLR start "seq"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3725:1: seq returns [Sequent s] : ant= semisequent SEQARROW suc= semisequent ;
	public final Sequent seq() throws RecognitionException {
		Sequent s = null;


		Semisequent ant =null;
		Semisequent suc =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3725:25: (ant= semisequent SEQARROW suc= semisequent )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3726:9: ant= semisequent SEQARROW suc= semisequent
			{
			pushFollow(FOLLOW_semisequent_in_seq9726);
			ant=semisequent();
			state._fsp--;
			if (state.failed) return s;
			match(input,SEQARROW,FOLLOW_SEQARROW_in_seq9728); if (state.failed) return s;
			pushFollow(FOLLOW_semisequent_in_seq9732);
			suc=semisequent();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { s = Sequent.createSequent(ant, suc); }
			}

		}
		catch (RuntimeException ex) {

			         raiseException
			                (new KeYSemanticException(input, getSourceName(), ex));
			     
		}

		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "seq"



	// $ANTLR start "termorseq"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3734:1: termorseq returns [Object o] : (head= term ( COMMA s= seq | SEQARROW ss= semisequent )? | SEQARROW ss= semisequent );
	public final Object termorseq() throws RecognitionException {
		Object o = null;


		Term head =null;
		Sequent s =null;
		Semisequent ss =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3735:5: (head= term ( COMMA s= seq | SEQARROW ss= semisequent )? | SEQARROW ss= semisequent )
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==AT||LA126_0==CHAR_LITERAL||LA126_0==EXISTS||LA126_0==FALSE||LA126_0==FORALL||(LA126_0 >= IDENT && LA126_0 <= IFEX)||LA126_0==LBRACE||LA126_0==LPAREN||LA126_0==MINUS||LA126_0==MODALITY||LA126_0==NOT||LA126_0==NUM_LITERAL||LA126_0==STRING_LITERAL||LA126_0==TRUE) ) {
				alt126=1;
			}
			else if ( (LA126_0==SEQARROW) ) {
				alt126=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return o;}
				NoViableAltException nvae =
					new NoViableAltException("", 126, 0, input);
				throw nvae;
			}

			switch (alt126) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3736:9: head= term ( COMMA s= seq | SEQARROW ss= semisequent )?
					{
					pushFollow(FOLLOW_term_in_termorseq9789);
					head=term();
					state._fsp--;
					if (state.failed) return o;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3736:19: ( COMMA s= seq | SEQARROW ss= semisequent )?
					int alt125=3;
					int LA125_0 = input.LA(1);
					if ( (LA125_0==COMMA) ) {
						alt125=1;
					}
					else if ( (LA125_0==SEQARROW) ) {
						alt125=2;
					}
					switch (alt125) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3736:21: COMMA s= seq
							{
							match(input,COMMA,FOLLOW_COMMA_in_termorseq9793); if (state.failed) return o;
							pushFollow(FOLLOW_seq_in_termorseq9797);
							s=seq();
							state._fsp--;
							if (state.failed) return o;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3736:35: SEQARROW ss= semisequent
							{
							match(input,SEQARROW,FOLLOW_SEQARROW_in_termorseq9801); if (state.failed) return o;
							pushFollow(FOLLOW_semisequent_in_termorseq9805);
							ss=semisequent();
							state._fsp--;
							if (state.failed) return o;
							}
							break;

					}

					if ( state.backtracking==0 ) {        
					            if ( s == null ) {
					                if ( ss == null ) {
					                    // Just a term
					                    o = head;
					                } else {
					                    // A sequent with only head in the antecedent.
					                    Semisequent ant = Semisequent.EMPTY_SEMISEQUENT;
					                    ant = ant.insertFirst(
					                                          new SequentFormula(head)).semisequent();
					                    o = Sequent.createSequent(ant,ss);
					                }
					            } else {
					                // A sequent.  Prepend head to the antecedent.
					                Semisequent newAnt = s.antecedent();
					                newAnt = newAnt .insertFirst(
					                                             new SequentFormula(head)).semisequent();
					                o = Sequent.createSequent(newAnt,s.succedent());
					            }
					        }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3758:9: SEQARROW ss= semisequent
					{
					match(input,SEQARROW,FOLLOW_SEQARROW_in_termorseq9835); if (state.failed) return o;
					pushFollow(FOLLOW_semisequent_in_termorseq9839);
					ss=semisequent();
					state._fsp--;
					if (state.failed) return o;
					if ( state.backtracking==0 ) {
					            o = Sequent.createSequent(Semisequent.EMPTY_SEMISEQUENT,ss);
					        }
					}
					break;

			}
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return o;
	}
	// $ANTLR end "termorseq"



	// $ANTLR start "semisequent"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3764:1: semisequent returns [Semisequent _semi_sequent] : (|head= term ( COMMA ss= semisequent )? );
	public final Semisequent semisequent() throws RecognitionException {
		Semisequent _semi_sequent = null;


		Term head =null;
		Semisequent ss =null;

		 
		    ss = Semisequent.EMPTY_SEMISEQUENT; 

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3769:5: (|head= term ( COMMA ss= semisequent )? )
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==RPAREN||LA128_0==SEQARROW) ) {
				alt128=1;
			}
			else if ( (LA128_0==AT||LA128_0==CHAR_LITERAL||LA128_0==EXISTS||LA128_0==FALSE||LA128_0==FORALL||(LA128_0 >= IDENT && LA128_0 <= IFEX)||LA128_0==LBRACE||LA128_0==LPAREN||LA128_0==MINUS||LA128_0==MODALITY||LA128_0==NOT||LA128_0==NUM_LITERAL||LA128_0==STRING_LITERAL||LA128_0==TRUE) ) {
				alt128=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return _semi_sequent;}
				NoViableAltException nvae =
					new NoViableAltException("", 128, 0, input);
				throw nvae;
			}

			switch (alt128) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3770:21: 
					{
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3771:9: head= term ( COMMA ss= semisequent )?
					{
					pushFollow(FOLLOW_term_in_semisequent9901);
					head=term();
					state._fsp--;
					if (state.failed) return _semi_sequent;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3771:19: ( COMMA ss= semisequent )?
					int alt127=2;
					int LA127_0 = input.LA(1);
					if ( (LA127_0==COMMA) ) {
						alt127=1;
					}
					switch (alt127) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3771:21: COMMA ss= semisequent
							{
							match(input,COMMA,FOLLOW_COMMA_in_semisequent9905); if (state.failed) return _semi_sequent;
							pushFollow(FOLLOW_semisequent_in_semisequent9909);
							ss=semisequent();
							state._fsp--;
							if (state.failed) return _semi_sequent;
							}
							break;

					}

					if ( state.backtracking==0 ) { 
					          ss = ss.insertFirst(new SequentFormula(head)).semisequent(); 
					        }
					}
					break;

			}
			if ( state.backtracking==0 ) { _semi_sequent = ss; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _semi_sequent;
	}
	// $ANTLR end "semisequent"



	// $ANTLR start "varexplist"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3777:1: varexplist[TacletBuilder b] : varexp[b] ( COMMA varexp[b] )* ;
	public final void varexplist(TacletBuilder b) throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3777:29: ( varexp[b] ( COMMA varexp[b] )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3777:31: varexp[b] ( COMMA varexp[b] )*
			{
			pushFollow(FOLLOW_varexp_in_varexplist9937);
			varexp(b);
			state._fsp--;
			if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3777:41: ( COMMA varexp[b] )*
			loop129:
			while (true) {
				int alt129=2;
				int LA129_0 = input.LA(1);
				if ( (LA129_0==COMMA) ) {
					alt129=1;
				}

				switch (alt129) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3777:43: COMMA varexp[b]
					{
					match(input,COMMA,FOLLOW_COMMA_in_varexplist9942); if (state.failed) return;
					pushFollow(FOLLOW_varexp_in_varexplist9944);
					varexp(b);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop129;
				}
			}

			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varexplist"



	// $ANTLR start "varexp"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3779:1: varexp[TacletBuilder b] : ( ( varcond_applyUpdateOnRigid[b] | varcond_dropEffectlessElementaries[b] | varcond_dropEffectlessStores[b] | varcond_enum_const[b] | varcond_free[b] | varcond_hassort[b] | varcond_fieldtype[b] | varcond_equalUnique[b] | varcond_new[b] | varcond_newlabel[b] | varcond_observer[b] | varcond_different[b] | varcond_metadisjoint[b] | varcond_simplifyIfThenElseUpdate[b] | varcond_differentFields[b] ) | ( ( NOT_ )? ( varcond_abstractOrInterface[b, negated] | varcond_array[b, negated] | varcond_array_length[b, negated] | varcond_enumtype[b, negated] | varcond_freeLabelIn[b,negated] | varcond_localvariable[b, negated] | varcond_thisreference[b, negated] | varcond_reference[b, negated] | varcond_referencearray[b, negated] | varcond_static[b,negated] | varcond_staticmethod[b,negated] | varcond_final[b,negated] | varcond_typecheck[b, negated] | varcond_constant[b, negated] | varcond_label[b, negated] | varcond_static_field[b, negated] | varcond_subFormulas[b, negated] | varcond_containsAssignment[b, negated] ) ) );
	public final void varexp(TacletBuilder b) throws RecognitionException {

		  boolean negated = false;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3783:3: ( ( varcond_applyUpdateOnRigid[b] | varcond_dropEffectlessElementaries[b] | varcond_dropEffectlessStores[b] | varcond_enum_const[b] | varcond_free[b] | varcond_hassort[b] | varcond_fieldtype[b] | varcond_equalUnique[b] | varcond_new[b] | varcond_newlabel[b] | varcond_observer[b] | varcond_different[b] | varcond_metadisjoint[b] | varcond_simplifyIfThenElseUpdate[b] | varcond_differentFields[b] ) | ( ( NOT_ )? ( varcond_abstractOrInterface[b, negated] | varcond_array[b, negated] | varcond_array_length[b, negated] | varcond_enumtype[b, negated] | varcond_freeLabelIn[b,negated] | varcond_localvariable[b, negated] | varcond_thisreference[b, negated] | varcond_reference[b, negated] | varcond_referencearray[b, negated] | varcond_static[b,negated] | varcond_staticmethod[b,negated] | varcond_final[b,negated] | varcond_typecheck[b, negated] | varcond_constant[b, negated] | varcond_label[b, negated] | varcond_static_field[b, negated] | varcond_subFormulas[b, negated] | varcond_containsAssignment[b, negated] ) ) )
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==APPLY_UPDATE_ON_RIGID||(LA133_0 >= DIFFERENT && LA133_0 <= DIFFERENTFIELDS)||(LA133_0 >= DROP_EFFECTLESS_ELEMENTARIES && LA133_0 <= DROP_EFFECTLESS_STORES)||LA133_0==ENUM_CONST||LA133_0==EQUAL_UNIQUE||LA133_0==FIELDTYPE||LA133_0==HASSORT||LA133_0==ISOBSERVER||LA133_0==METADISJOINT||(LA133_0 >= NEW && LA133_0 <= NEWLABEL)||LA133_0==NOTFREEIN||LA133_0==SIMPLIFY_IF_THEN_ELSE_UPDATE) ) {
				alt133=1;
			}
			else if ( (LA133_0==CONTAINS_ASSIGNMENT||LA133_0==DISJOINTMODULONULL||LA133_0==FINAL||LA133_0==FREELABELIN||LA133_0==HASLABEL||LA133_0==HASSUBFORMULAS||(LA133_0 >= ISARRAY && LA133_0 <= ISENUMTYPE)||LA133_0==ISLOCALVARIABLE||(LA133_0 >= ISREFERENCE && LA133_0 <= IS_ABSTRACT_OR_INTERFACE)||LA133_0==NOT_||LA133_0==SAME||(LA133_0 >= STATIC && LA133_0 <= STRICT)) ) {
				alt133=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 133, 0, input);
				throw nvae;
			}

			switch (alt133) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3784:3: ( varcond_applyUpdateOnRigid[b] | varcond_dropEffectlessElementaries[b] | varcond_dropEffectlessStores[b] | varcond_enum_const[b] | varcond_free[b] | varcond_hassort[b] | varcond_fieldtype[b] | varcond_equalUnique[b] | varcond_new[b] | varcond_newlabel[b] | varcond_observer[b] | varcond_different[b] | varcond_metadisjoint[b] | varcond_simplifyIfThenElseUpdate[b] | varcond_differentFields[b] )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3784:3: ( varcond_applyUpdateOnRigid[b] | varcond_dropEffectlessElementaries[b] | varcond_dropEffectlessStores[b] | varcond_enum_const[b] | varcond_free[b] | varcond_hassort[b] | varcond_fieldtype[b] | varcond_equalUnique[b] | varcond_new[b] | varcond_newlabel[b] | varcond_observer[b] | varcond_different[b] | varcond_metadisjoint[b] | varcond_simplifyIfThenElseUpdate[b] | varcond_differentFields[b] )
					int alt130=15;
					switch ( input.LA(1) ) {
					case APPLY_UPDATE_ON_RIGID:
						{
						alt130=1;
						}
						break;
					case DROP_EFFECTLESS_ELEMENTARIES:
						{
						alt130=2;
						}
						break;
					case DROP_EFFECTLESS_STORES:
						{
						alt130=3;
						}
						break;
					case ENUM_CONST:
						{
						alt130=4;
						}
						break;
					case NOTFREEIN:
						{
						alt130=5;
						}
						break;
					case HASSORT:
						{
						alt130=6;
						}
						break;
					case FIELDTYPE:
						{
						alt130=7;
						}
						break;
					case EQUAL_UNIQUE:
						{
						alt130=8;
						}
						break;
					case NEW:
						{
						alt130=9;
						}
						break;
					case NEWLABEL:
						{
						alt130=10;
						}
						break;
					case ISOBSERVER:
						{
						alt130=11;
						}
						break;
					case DIFFERENT:
						{
						alt130=12;
						}
						break;
					case METADISJOINT:
						{
						alt130=13;
						}
						break;
					case SIMPLIFY_IF_THEN_ELSE_UPDATE:
						{
						alt130=14;
						}
						break;
					case DIFFERENTFIELDS:
						{
						alt130=15;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 130, 0, input);
						throw nvae;
					}
					switch (alt130) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3784:5: varcond_applyUpdateOnRigid[b]
							{
							pushFollow(FOLLOW_varcond_applyUpdateOnRigid_in_varexp9967);
							varcond_applyUpdateOnRigid(b);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3785:7: varcond_dropEffectlessElementaries[b]
							{
							pushFollow(FOLLOW_varcond_dropEffectlessElementaries_in_varexp9976);
							varcond_dropEffectlessElementaries(b);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 3 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3786:7: varcond_dropEffectlessStores[b]
							{
							pushFollow(FOLLOW_varcond_dropEffectlessStores_in_varexp9985);
							varcond_dropEffectlessStores(b);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 4 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3787:7: varcond_enum_const[b]
							{
							pushFollow(FOLLOW_varcond_enum_const_in_varexp9994);
							varcond_enum_const(b);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 5 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3788:7: varcond_free[b]
							{
							pushFollow(FOLLOW_varcond_free_in_varexp10003);
							varcond_free(b);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 6 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3789:7: varcond_hassort[b]
							{
							pushFollow(FOLLOW_varcond_hassort_in_varexp10012);
							varcond_hassort(b);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 7 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3790:7: varcond_fieldtype[b]
							{
							pushFollow(FOLLOW_varcond_fieldtype_in_varexp10021);
							varcond_fieldtype(b);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 8 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3791:7: varcond_equalUnique[b]
							{
							pushFollow(FOLLOW_varcond_equalUnique_in_varexp10030);
							varcond_equalUnique(b);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 9 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3792:7: varcond_new[b]
							{
							pushFollow(FOLLOW_varcond_new_in_varexp10039);
							varcond_new(b);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 10 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3793:7: varcond_newlabel[b]
							{
							pushFollow(FOLLOW_varcond_newlabel_in_varexp10048);
							varcond_newlabel(b);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 11 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3794:7: varcond_observer[b]
							{
							pushFollow(FOLLOW_varcond_observer_in_varexp10057);
							varcond_observer(b);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 12 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3795:7: varcond_different[b]
							{
							pushFollow(FOLLOW_varcond_different_in_varexp10066);
							varcond_different(b);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 13 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3796:7: varcond_metadisjoint[b]
							{
							pushFollow(FOLLOW_varcond_metadisjoint_in_varexp10075);
							varcond_metadisjoint(b);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 14 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3797:7: varcond_simplifyIfThenElseUpdate[b]
							{
							pushFollow(FOLLOW_varcond_simplifyIfThenElseUpdate_in_varexp10084);
							varcond_simplifyIfThenElseUpdate(b);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 15 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3798:7: varcond_differentFields[b]
							{
							pushFollow(FOLLOW_varcond_differentFields_in_varexp10093);
							varcond_differentFields(b);
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3801:3: ( ( NOT_ )? ( varcond_abstractOrInterface[b, negated] | varcond_array[b, negated] | varcond_array_length[b, negated] | varcond_enumtype[b, negated] | varcond_freeLabelIn[b,negated] | varcond_localvariable[b, negated] | varcond_thisreference[b, negated] | varcond_reference[b, negated] | varcond_referencearray[b, negated] | varcond_static[b,negated] | varcond_staticmethod[b,negated] | varcond_final[b,negated] | varcond_typecheck[b, negated] | varcond_constant[b, negated] | varcond_label[b, negated] | varcond_static_field[b, negated] | varcond_subFormulas[b, negated] | varcond_containsAssignment[b, negated] ) )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3801:3: ( ( NOT_ )? ( varcond_abstractOrInterface[b, negated] | varcond_array[b, negated] | varcond_array_length[b, negated] | varcond_enumtype[b, negated] | varcond_freeLabelIn[b,negated] | varcond_localvariable[b, negated] | varcond_thisreference[b, negated] | varcond_reference[b, negated] | varcond_referencearray[b, negated] | varcond_static[b,negated] | varcond_staticmethod[b,negated] | varcond_final[b,negated] | varcond_typecheck[b, negated] | varcond_constant[b, negated] | varcond_label[b, negated] | varcond_static_field[b, negated] | varcond_subFormulas[b, negated] | varcond_containsAssignment[b, negated] ) )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3801:5: ( NOT_ )? ( varcond_abstractOrInterface[b, negated] | varcond_array[b, negated] | varcond_array_length[b, negated] | varcond_enumtype[b, negated] | varcond_freeLabelIn[b,negated] | varcond_localvariable[b, negated] | varcond_thisreference[b, negated] | varcond_reference[b, negated] | varcond_referencearray[b, negated] | varcond_static[b,negated] | varcond_staticmethod[b,negated] | varcond_final[b,negated] | varcond_typecheck[b, negated] | varcond_constant[b, negated] | varcond_label[b, negated] | varcond_static_field[b, negated] | varcond_subFormulas[b, negated] | varcond_containsAssignment[b, negated] )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3801:5: ( NOT_ )?
					int alt131=2;
					int LA131_0 = input.LA(1);
					if ( (LA131_0==NOT_) ) {
						alt131=1;
					}
					switch (alt131) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3801:6: NOT_
							{
							match(input,NOT_,FOLLOW_NOT__in_varexp10113); if (state.failed) return;
							if ( state.backtracking==0 ) {negated = true;}
							}
							break;

					}

					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3802:5: ( varcond_abstractOrInterface[b, negated] | varcond_array[b, negated] | varcond_array_length[b, negated] | varcond_enumtype[b, negated] | varcond_freeLabelIn[b,negated] | varcond_localvariable[b, negated] | varcond_thisreference[b, negated] | varcond_reference[b, negated] | varcond_referencearray[b, negated] | varcond_static[b,negated] | varcond_staticmethod[b,negated] | varcond_final[b,negated] | varcond_typecheck[b, negated] | varcond_constant[b, negated] | varcond_label[b, negated] | varcond_static_field[b, negated] | varcond_subFormulas[b, negated] | varcond_containsAssignment[b, negated] )
					int alt132=18;
					switch ( input.LA(1) ) {
					case IS_ABSTRACT_OR_INTERFACE:
						{
						alt132=1;
						}
						break;
					case ISARRAY:
						{
						alt132=2;
						}
						break;
					case ISARRAYLENGTH:
						{
						alt132=3;
						}
						break;
					case ISENUMTYPE:
						{
						alt132=4;
						}
						break;
					case FREELABELIN:
						{
						alt132=5;
						}
						break;
					case ISLOCALVARIABLE:
						{
						alt132=6;
						}
						break;
					case ISTHISREFERENCE:
						{
						alt132=7;
						}
						break;
					case ISREFERENCE:
						{
						alt132=8;
						}
						break;
					case ISREFERENCEARRAY:
						{
						alt132=9;
						}
						break;
					case STATIC:
						{
						alt132=10;
						}
						break;
					case STATICMETHODREFERENCE:
						{
						alt132=11;
						}
						break;
					case FINAL:
						{
						alt132=12;
						}
						break;
					case DISJOINTMODULONULL:
					case ISSUBTYPE:
					case SAME:
					case STRICT:
						{
						alt132=13;
						}
						break;
					case ISCONSTANT:
						{
						alt132=14;
						}
						break;
					case HASLABEL:
						{
						alt132=15;
						}
						break;
					case ISSTATICFIELD:
						{
						alt132=16;
						}
						break;
					case HASSUBFORMULAS:
						{
						alt132=17;
						}
						break;
					case CONTAINS_ASSIGNMENT:
						{
						alt132=18;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 132, 0, input);
						throw nvae;
					}
					switch (alt132) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3802:9: varcond_abstractOrInterface[b, negated]
							{
							pushFollow(FOLLOW_varcond_abstractOrInterface_in_varexp10129);
							varcond_abstractOrInterface(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3803:8: varcond_array[b, negated]
							{
							pushFollow(FOLLOW_varcond_array_in_varexp10139);
							varcond_array(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 3 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3804:11: varcond_array_length[b, negated]
							{
							pushFollow(FOLLOW_varcond_array_length_in_varexp10152);
							varcond_array_length(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 4 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3805:11: varcond_enumtype[b, negated]
							{
							pushFollow(FOLLOW_varcond_enumtype_in_varexp10166);
							varcond_enumtype(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 5 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3806:11: varcond_freeLabelIn[b,negated]
							{
							pushFollow(FOLLOW_varcond_freeLabelIn_in_varexp10179);
							varcond_freeLabelIn(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 6 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3807:11: varcond_localvariable[b, negated]
							{
							pushFollow(FOLLOW_varcond_localvariable_in_varexp10201);
							varcond_localvariable(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 7 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3808:11: varcond_thisreference[b, negated]
							{
							pushFollow(FOLLOW_varcond_thisreference_in_varexp10222);
							varcond_thisreference(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 8 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3809:11: varcond_reference[b, negated]
							{
							pushFollow(FOLLOW_varcond_reference_in_varexp10243);
							varcond_reference(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 9 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3810:11: varcond_referencearray[b, negated]
							{
							pushFollow(FOLLOW_varcond_referencearray_in_varexp10264);
							varcond_referencearray(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 10 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3811:11: varcond_static[b,negated]
							{
							pushFollow(FOLLOW_varcond_static_in_varexp10277);
							varcond_static(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 11 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3812:11: varcond_staticmethod[b,negated]
							{
							pushFollow(FOLLOW_varcond_staticmethod_in_varexp10290);
							varcond_staticmethod(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 12 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3813:11: varcond_final[b,negated]
							{
							pushFollow(FOLLOW_varcond_final_in_varexp10305);
							varcond_final(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 13 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3814:11: varcond_typecheck[b, negated]
							{
							pushFollow(FOLLOW_varcond_typecheck_in_varexp10318);
							varcond_typecheck(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 14 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3815:11: varcond_constant[b, negated]
							{
							pushFollow(FOLLOW_varcond_constant_in_varexp10331);
							varcond_constant(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 15 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3816:11: varcond_label[b, negated]
							{
							pushFollow(FOLLOW_varcond_label_in_varexp10344);
							varcond_label(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 16 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3817:11: varcond_static_field[b, negated]
							{
							pushFollow(FOLLOW_varcond_static_field_in_varexp10357);
							varcond_static_field(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 17 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3818:11: varcond_subFormulas[b, negated]
							{
							pushFollow(FOLLOW_varcond_subFormulas_in_varexp10370);
							varcond_subFormulas(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 18 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3819:11: varcond_containsAssignment[b, negated]
							{
							pushFollow(FOLLOW_varcond_containsAssignment_in_varexp10383);
							varcond_containsAssignment(b, negated);
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}

					}
					break;

			}
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varexp"



	// $ANTLR start "varcond_applyUpdateOnRigid"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3825:1: varcond_applyUpdateOnRigid[TacletBuilder b] : APPLY_UPDATE_ON_RIGID LPAREN u= varId COMMA x= varId COMMA x2= varId RPAREN ;
	public final void varcond_applyUpdateOnRigid(TacletBuilder b) throws RecognitionException {
		ParsableVariable u =null;
		ParsableVariable x =null;
		ParsableVariable x2 =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3826:4: ( APPLY_UPDATE_ON_RIGID LPAREN u= varId COMMA x= varId COMMA x2= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3827:4: APPLY_UPDATE_ON_RIGID LPAREN u= varId COMMA x= varId COMMA x2= varId RPAREN
			{
			match(input,APPLY_UPDATE_ON_RIGID,FOLLOW_APPLY_UPDATE_ON_RIGID_in_varcond_applyUpdateOnRigid10419); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_applyUpdateOnRigid10421); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_applyUpdateOnRigid10425);
			u=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_applyUpdateOnRigid10427); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_applyUpdateOnRigid10431);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_applyUpdateOnRigid10433); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_applyUpdateOnRigid10437);
			x2=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_applyUpdateOnRigid10439); if (state.failed) return;
			if ( state.backtracking==0 ) {
			      b.addVariableCondition(new ApplyUpdateOnRigidCondition((UpdateSV)u, 
			                                                             (SchemaVariable)x, 
			                                                             (SchemaVariable)x2));
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_applyUpdateOnRigid"



	// $ANTLR start "varcond_dropEffectlessElementaries"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3835:1: varcond_dropEffectlessElementaries[TacletBuilder b] : DROP_EFFECTLESS_ELEMENTARIES LPAREN u= varId COMMA x= varId COMMA result= varId RPAREN ;
	public final void varcond_dropEffectlessElementaries(TacletBuilder b) throws RecognitionException {
		ParsableVariable u =null;
		ParsableVariable x =null;
		ParsableVariable result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3836:4: ( DROP_EFFECTLESS_ELEMENTARIES LPAREN u= varId COMMA x= varId COMMA result= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3837:4: DROP_EFFECTLESS_ELEMENTARIES LPAREN u= varId COMMA x= varId COMMA result= varId RPAREN
			{
			match(input,DROP_EFFECTLESS_ELEMENTARIES,FOLLOW_DROP_EFFECTLESS_ELEMENTARIES_in_varcond_dropEffectlessElementaries10458); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_dropEffectlessElementaries10460); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_dropEffectlessElementaries10464);
			u=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_dropEffectlessElementaries10466); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_dropEffectlessElementaries10470);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_dropEffectlessElementaries10472); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_dropEffectlessElementaries10476);
			result=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_dropEffectlessElementaries10478); if (state.failed) return;
			if ( state.backtracking==0 ) {
			      b.addVariableCondition(new DropEffectlessElementariesCondition((UpdateSV)u, 
			                                                                     (SchemaVariable)x, 
			                                                                     (SchemaVariable)result));
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_dropEffectlessElementaries"



	// $ANTLR start "varcond_dropEffectlessStores"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3845:1: varcond_dropEffectlessStores[TacletBuilder b] : DROP_EFFECTLESS_STORES LPAREN h= varId COMMA o= varId COMMA f= varId COMMA x= varId COMMA result= varId RPAREN ;
	public final void varcond_dropEffectlessStores(TacletBuilder b) throws RecognitionException {
		ParsableVariable h =null;
		ParsableVariable o =null;
		ParsableVariable f =null;
		ParsableVariable x =null;
		ParsableVariable result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3846:4: ( DROP_EFFECTLESS_STORES LPAREN h= varId COMMA o= varId COMMA f= varId COMMA x= varId COMMA result= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3847:4: DROP_EFFECTLESS_STORES LPAREN h= varId COMMA o= varId COMMA f= varId COMMA x= varId COMMA result= varId RPAREN
			{
			match(input,DROP_EFFECTLESS_STORES,FOLLOW_DROP_EFFECTLESS_STORES_in_varcond_dropEffectlessStores10497); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_dropEffectlessStores10499); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_dropEffectlessStores10503);
			h=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_dropEffectlessStores10505); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_dropEffectlessStores10509);
			o=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_dropEffectlessStores10511); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_dropEffectlessStores10515);
			f=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_dropEffectlessStores10517); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_dropEffectlessStores10521);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_dropEffectlessStores10523); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_dropEffectlessStores10527);
			result=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_dropEffectlessStores10529); if (state.failed) return;
			if ( state.backtracking==0 ) {
			      b.addVariableCondition(new DropEffectlessStoresCondition((TermSV)h,
			      							       (TermSV)o,
			      							       (TermSV)f,
			      							       (TermSV)x, 
			                                                               (TermSV)result));
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_dropEffectlessStores"



	// $ANTLR start "varcond_differentFields"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3857:1: varcond_differentFields[TacletBuilder b] : DIFFERENTFIELDS LPAREN x= varId COMMA y= varId RPAREN ;
	public final void varcond_differentFields(TacletBuilder b) throws RecognitionException {
		ParsableVariable x =null;
		ParsableVariable y =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3858:4: ( DIFFERENTFIELDS LPAREN x= varId COMMA y= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3859:4: DIFFERENTFIELDS LPAREN x= varId COMMA y= varId RPAREN
			{
			match(input,DIFFERENTFIELDS,FOLLOW_DIFFERENTFIELDS_in_varcond_differentFields10549); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_differentFields10554); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_differentFields10565);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_differentFields10567); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_differentFields10573);
			y=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_differentFields10578); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            b.addVariableCondition(new DifferentFields((SchemaVariable)x, (SchemaVariable)y));
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_differentFields"



	// $ANTLR start "varcond_simplifyIfThenElseUpdate"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3869:1: varcond_simplifyIfThenElseUpdate[TacletBuilder b] : SIMPLIFY_IF_THEN_ELSE_UPDATE LPAREN phi= varId COMMA u1= varId COMMA u2= varId COMMA commonFormula= varId COMMA result= varId RPAREN ;
	public final void varcond_simplifyIfThenElseUpdate(TacletBuilder b) throws RecognitionException {
		ParsableVariable phi =null;
		ParsableVariable u1 =null;
		ParsableVariable u2 =null;
		ParsableVariable commonFormula =null;
		ParsableVariable result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3870:4: ( SIMPLIFY_IF_THEN_ELSE_UPDATE LPAREN phi= varId COMMA u1= varId COMMA u2= varId COMMA commonFormula= varId COMMA result= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3871:4: SIMPLIFY_IF_THEN_ELSE_UPDATE LPAREN phi= varId COMMA u1= varId COMMA u2= varId COMMA commonFormula= varId COMMA result= varId RPAREN
			{
			match(input,SIMPLIFY_IF_THEN_ELSE_UPDATE,FOLLOW_SIMPLIFY_IF_THEN_ELSE_UPDATE_in_varcond_simplifyIfThenElseUpdate10597); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_simplifyIfThenElseUpdate10599); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_simplifyIfThenElseUpdate10603);
			phi=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_simplifyIfThenElseUpdate10605); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_simplifyIfThenElseUpdate10609);
			u1=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_simplifyIfThenElseUpdate10611); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_simplifyIfThenElseUpdate10615);
			u2=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_simplifyIfThenElseUpdate10617); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_simplifyIfThenElseUpdate10621);
			commonFormula=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_simplifyIfThenElseUpdate10623); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_simplifyIfThenElseUpdate10627);
			result=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_simplifyIfThenElseUpdate10629); if (state.failed) return;
			if ( state.backtracking==0 ) {
			      b.addVariableCondition(new SimplifyIfThenElseUpdateCondition((FormulaSV) phi,
			      															   (UpdateSV) u1,
			      															   (UpdateSV) u2,
			      															   (FormulaSV) commonFormula,
			                                                                   (SchemaVariable)result));
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_simplifyIfThenElseUpdate"



	// $ANTLR start "type_resolver"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3881:1: type_resolver returns [TypeResolver tr = null] : ( (s= any_sortId_check[true] ) | ( TYPEOF LPAREN y= varId RPAREN ) | ( CONTAINERTYPE LPAREN y= varId RPAREN ) );
	public final TypeResolver type_resolver() throws RecognitionException {
		TypeResolver tr =  null;


		Sort s =null;
		ParsableVariable y =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3882:5: ( (s= any_sortId_check[true] ) | ( TYPEOF LPAREN y= varId RPAREN ) | ( CONTAINERTYPE LPAREN y= varId RPAREN ) )
			int alt134=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt134=1;
				}
				break;
			case TYPEOF:
				{
				alt134=2;
				}
				break;
			case CONTAINERTYPE:
				{
				alt134=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return tr;}
				NoViableAltException nvae =
					new NoViableAltException("", 134, 0, input);
				throw nvae;
			}
			switch (alt134) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3883:5: (s= any_sortId_check[true] )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3883:5: (s= any_sortId_check[true] )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3883:6: s= any_sortId_check[true]
					{
					pushFollow(FOLLOW_any_sortId_check_in_type_resolver10658);
					s=any_sortId_check(true);
					state._fsp--;
					if (state.failed) return tr;
					if ( state.backtracking==0 ) {
					            if ( s instanceof GenericSort ) {
					                tr = TypeResolver.createGenericSortResolver((GenericSort)s);
					            } else {
					                tr = TypeResolver.createNonGenericSortResolver(s);
					            }
					        }
					}

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3893:5: ( TYPEOF LPAREN y= varId RPAREN )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3893:5: ( TYPEOF LPAREN y= varId RPAREN )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3894:9: TYPEOF LPAREN y= varId RPAREN
					{
					match(input,TYPEOF,FOLLOW_TYPEOF_in_type_resolver10705); if (state.failed) return tr;
					match(input,LPAREN,FOLLOW_LPAREN_in_type_resolver10707); if (state.failed) return tr;
					pushFollow(FOLLOW_varId_in_type_resolver10713);
					y=varId();
					state._fsp--;
					if (state.failed) return tr;
					match(input,RPAREN,FOLLOW_RPAREN_in_type_resolver10715); if (state.failed) return tr;
					if ( state.backtracking==0 ) {  
					            tr = TypeResolver.createElementTypeResolver((SchemaVariable)y); 
					        }
					}

					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3900:5: ( CONTAINERTYPE LPAREN y= varId RPAREN )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3900:5: ( CONTAINERTYPE LPAREN y= varId RPAREN )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3901:9: CONTAINERTYPE LPAREN y= varId RPAREN
					{
					match(input,CONTAINERTYPE,FOLLOW_CONTAINERTYPE_in_type_resolver10756); if (state.failed) return tr;
					match(input,LPAREN,FOLLOW_LPAREN_in_type_resolver10758); if (state.failed) return tr;
					pushFollow(FOLLOW_varId_in_type_resolver10764);
					y=varId();
					state._fsp--;
					if (state.failed) return tr;
					match(input,RPAREN,FOLLOW_RPAREN_in_type_resolver10766); if (state.failed) return tr;
					if ( state.backtracking==0 ) {  
					            tr = TypeResolver.createContainerTypeResolver((SchemaVariable)y); 
					        }
					}

					}
					break;

			}
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return tr;
	}
	// $ANTLR end "type_resolver"



	// $ANTLR start "varcond_new"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3908:1: varcond_new[TacletBuilder b] : NEW LPAREN x= varId COMMA ( TYPEOF LPAREN y= varId RPAREN | DEPENDINGON LPAREN y= varId RPAREN |kjt= keyjavatype ) RPAREN ;
	public final void varcond_new(TacletBuilder b) throws RecognitionException {
		ParsableVariable x =null;
		ParsableVariable y =null;
		KeYJavaType kjt =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3909:4: ( NEW LPAREN x= varId COMMA ( TYPEOF LPAREN y= varId RPAREN | DEPENDINGON LPAREN y= varId RPAREN |kjt= keyjavatype ) RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3910:4: NEW LPAREN x= varId COMMA ( TYPEOF LPAREN y= varId RPAREN | DEPENDINGON LPAREN y= varId RPAREN |kjt= keyjavatype ) RPAREN
			{
			match(input,NEW,FOLLOW_NEW_in_varcond_new10799); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_new10801); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_new10805);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_new10807); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3911:7: ( TYPEOF LPAREN y= varId RPAREN | DEPENDINGON LPAREN y= varId RPAREN |kjt= keyjavatype )
			int alt135=3;
			switch ( input.LA(1) ) {
			case TYPEOF:
				{
				alt135=1;
				}
				break;
			case DEPENDINGON:
				{
				alt135=2;
				}
				break;
			case IDENT:
				{
				alt135=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 135, 0, input);
				throw nvae;
			}
			switch (alt135) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3912:11: TYPEOF LPAREN y= varId RPAREN
					{
					match(input,TYPEOF,FOLLOW_TYPEOF_in_varcond_new10827); if (state.failed) return;
					match(input,LPAREN,FOLLOW_LPAREN_in_varcond_new10829); if (state.failed) return;
					pushFollow(FOLLOW_varId_in_varcond_new10833);
					y=varId();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_varcond_new10835); if (state.failed) return;
					if ( state.backtracking==0 ) {
						    b.addVarsNew((SchemaVariable) x, (SchemaVariable) y);
						  }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3916:10: DEPENDINGON LPAREN y= varId RPAREN
					{
					match(input,DEPENDINGON,FOLLOW_DEPENDINGON_in_varcond_new10856); if (state.failed) return;
					match(input,LPAREN,FOLLOW_LPAREN_in_varcond_new10858); if (state.failed) return;
					pushFollow(FOLLOW_varId_in_varcond_new10862);
					y=varId();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_varcond_new10864); if (state.failed) return;
					if ( state.backtracking==0 ) {
						    b.addVarsNewDependingOn((SchemaVariable)x, (SchemaVariable)y);
						  }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3919:9: kjt= keyjavatype
					{
					pushFollow(FOLLOW_keyjavatype_in_varcond_new10878);
					kjt=keyjavatype();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
							b.addVarsNew((SchemaVariable) x, kjt.getJavaType());
						  }
					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_new10893); if (state.failed) return;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_new"



	// $ANTLR start "varcond_newlabel"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3927:1: varcond_newlabel[TacletBuilder b] : NEWLABEL LPAREN x= varId RPAREN ;
	public final void varcond_newlabel(TacletBuilder b) throws RecognitionException {
		ParsableVariable x =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3928:3: ( NEWLABEL LPAREN x= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3929:3: NEWLABEL LPAREN x= varId RPAREN
			{
			match(input,NEWLABEL,FOLLOW_NEWLABEL_in_varcond_newlabel10911); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_newlabel10913); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_newlabel10917);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_newlabel10919); if (state.failed) return;
			if ( state.backtracking==0 ) {
			     b.addVariableCondition(new NewJumpLabelCondition((SchemaVariable)x));
			  }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_newlabel"



	// $ANTLR start "varcond_typecheck"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3933:1: varcond_typecheck[TacletBuilder b, boolean negated] : ( SAME | ISSUBTYPE | STRICT ISSUBTYPE | DISJOINTMODULONULL ) LPAREN fst= type_resolver COMMA snd= type_resolver RPAREN ;
	public final void varcond_typecheck(TacletBuilder b, boolean negated) throws RecognitionException {
		TypeResolver fst =null;
		TypeResolver snd =null;


		  TypeComparisonCondition.Mode mode = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3937:4: ( ( SAME | ISSUBTYPE | STRICT ISSUBTYPE | DISJOINTMODULONULL ) LPAREN fst= type_resolver COMMA snd= type_resolver RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3938:4: ( SAME | ISSUBTYPE | STRICT ISSUBTYPE | DISJOINTMODULONULL ) LPAREN fst= type_resolver COMMA snd= type_resolver RPAREN
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3938:4: ( SAME | ISSUBTYPE | STRICT ISSUBTYPE | DISJOINTMODULONULL )
			int alt136=4;
			switch ( input.LA(1) ) {
			case SAME:
				{
				alt136=1;
				}
				break;
			case ISSUBTYPE:
				{
				alt136=2;
				}
				break;
			case STRICT:
				{
				alt136=3;
				}
				break;
			case DISJOINTMODULONULL:
				{
				alt136=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 136, 0, input);
				throw nvae;
			}
			switch (alt136) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3938:7: SAME
					{
					match(input,SAME,FOLLOW_SAME_in_varcond_typecheck10941); if (state.failed) return;
					if ( state.backtracking==0 ) { 	
						  mode = negated 
						         ? TypeComparisonCondition.Mode.NOT_SAME 
						         : TypeComparisonCondition.Mode.SAME;
					      }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3944:7: ISSUBTYPE
					{
					match(input,ISSUBTYPE,FOLLOW_ISSUBTYPE_in_varcond_typecheck10960); if (state.failed) return;
					if ( state.backtracking==0 ) { 
					          mode = negated 
					                 ? TypeComparisonCondition.Mode.NOT_IS_SUBTYPE
					                 : TypeComparisonCondition.Mode.IS_SUBTYPE; 
					      }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3950:7: STRICT ISSUBTYPE
					{
					match(input,STRICT,FOLLOW_STRICT_in_varcond_typecheck10977); if (state.failed) return;
					match(input,ISSUBTYPE,FOLLOW_ISSUBTYPE_in_varcond_typecheck10979); if (state.failed) return;
					if ( state.backtracking==0 ) {
					          if(negated) {  
						      semanticError("A negated strict subtype check does not make sense.");
						  } 
						  mode = TypeComparisonCondition.Mode.STRICT_SUBTYPE;
					      }
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3957:7: DISJOINTMODULONULL
					{
					match(input,DISJOINTMODULONULL,FOLLOW_DISJOINTMODULONULL_in_varcond_typecheck10996); if (state.failed) return;
					if ( state.backtracking==0 ) {
					          if(negated) {
					              semanticError("Negation not supported");
					          }
					          mode = TypeComparisonCondition.Mode.DISJOINTMODULONULL;
					      }
					}
					break;

			}

			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_typecheck11016); if (state.failed) return;
			pushFollow(FOLLOW_type_resolver_in_varcond_typecheck11022);
			fst=type_resolver();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_typecheck11024); if (state.failed) return;
			pushFollow(FOLLOW_type_resolver_in_varcond_typecheck11030);
			snd=type_resolver();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_typecheck11032); if (state.failed) return;
			if ( state.backtracking==0 ) {
				b.addVariableCondition(new TypeComparisonCondition(fst, snd, mode));
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_typecheck"



	// $ANTLR start "varcond_free"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3972:1: varcond_free[TacletBuilder b] : NOTFREEIN LPAREN x= varId COMMA ys= varIds RPAREN ;
	public final void varcond_free(TacletBuilder b) throws RecognitionException {
		ParsableVariable x =null;
		LinkedList ys =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3973:4: ( NOTFREEIN LPAREN x= varId COMMA ys= varIds RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3974:4: NOTFREEIN LPAREN x= varId COMMA ys= varIds RPAREN
			{
			match(input,NOTFREEIN,FOLLOW_NOTFREEIN_in_varcond_free11053); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_free11055); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_free11059);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_free11061); if (state.failed) return;
			pushFollow(FOLLOW_varIds_in_varcond_free11065);
			ys=varIds();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_free11067); if (state.failed) return;
			if ( state.backtracking==0 ) {
			     Iterator it = ys.iterator();
			     while(it.hasNext()) {
			        b.addVarsNotFreeIn((SchemaVariable)x,(SchemaVariable)it.next());
			     }
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_free"



	// $ANTLR start "varcond_hassort"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3983:1: varcond_hassort[TacletBuilder b] : HASSORT LPAREN (x= varId | ELEMSORT LPAREN x= varId RPAREN ) COMMA s= any_sortId_check[true] RPAREN ;
	public final void varcond_hassort(TacletBuilder b) throws RecognitionException {
		ParsableVariable x =null;
		Sort s =null;


		  boolean elemSort = false;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3987:4: ( HASSORT LPAREN (x= varId | ELEMSORT LPAREN x= varId RPAREN ) COMMA s= any_sortId_check[true] RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3988:4: HASSORT LPAREN (x= varId | ELEMSORT LPAREN x= varId RPAREN ) COMMA s= any_sortId_check[true] RPAREN
			{
			match(input,HASSORT,FOLLOW_HASSORT_in_varcond_hassort11088); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_hassort11094); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3990:4: (x= varId | ELEMSORT LPAREN x= varId RPAREN )
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==IDENT) ) {
				alt137=1;
			}
			else if ( (LA137_0==ELEMSORT) ) {
				alt137=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 137, 0, input);
				throw nvae;
			}

			switch (alt137) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3990:5: x= varId
					{
					pushFollow(FOLLOW_varId_in_varcond_hassort11103);
					x=varId();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3990:15: ELEMSORT LPAREN x= varId RPAREN
					{
					match(input,ELEMSORT,FOLLOW_ELEMSORT_in_varcond_hassort11107); if (state.failed) return;
					match(input,LPAREN,FOLLOW_LPAREN_in_varcond_hassort11109); if (state.failed) return;
					pushFollow(FOLLOW_varId_in_varcond_hassort11113);
					x=varId();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_varcond_hassort11115); if (state.failed) return;
					if ( state.backtracking==0 ) {elemSort = true;}
					}
					break;

			}

			match(input,COMMA,FOLLOW_COMMA_in_varcond_hassort11124); if (state.failed) return;
			pushFollow(FOLLOW_any_sortId_check_in_varcond_hassort11132);
			s=any_sortId_check(true);
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_hassort11139); if (state.failed) return;
			if ( state.backtracking==0 ) {
			     if(!(s instanceof GenericSort)) {
			   	 throw new GenericSortException("sort",
			   					"Generic sort expected", 
			   					s,
			   					getSourceName(),
			   					getLine(), 
			   					getColumn());
			     } else if (!JavaTypeToSortCondition.checkSortedSV((SchemaVariable)x)) {
			   	 semanticError("Expected schema variable of kind EXPRESSION or TYPE, " 
			   	 	       + "but is " + x);
			     } else {
			         b.addVariableCondition(new JavaTypeToSortCondition((SchemaVariable)x, 
			     							    (GenericSort)s,
			     							    elemSort));
			     }
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_hassort"



	// $ANTLR start "varcond_fieldtype"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4013:1: varcond_fieldtype[TacletBuilder b] : FIELDTYPE LPAREN x= varId COMMA s= any_sortId_check[true] RPAREN ;
	public final void varcond_fieldtype(TacletBuilder b) throws RecognitionException {
		ParsableVariable x =null;
		Sort s =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4014:5: ( FIELDTYPE LPAREN x= varId COMMA s= any_sortId_check[true] RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4015:5: FIELDTYPE LPAREN x= varId COMMA s= any_sortId_check[true] RPAREN
			{
			match(input,FIELDTYPE,FOLLOW_FIELDTYPE_in_varcond_fieldtype11160); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_fieldtype11166); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_fieldtype11174);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_fieldtype11180); if (state.failed) return;
			pushFollow(FOLLOW_any_sortId_check_in_varcond_fieldtype11189);
			s=any_sortId_check(true);
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_fieldtype11197); if (state.failed) return;
			if ( state.backtracking==0 ) {
			        if(!(s instanceof GenericSort)) {
			            throw new GenericSortException("sort",
			                                        "Generic sort expected", 
			                                        s,
			                                        getSourceName(),
			                                        getLine(), 
			                                        getColumn());
			        } else if(!FieldTypeToSortCondition.checkSortedSV((SchemaVariable)x)) {
			            semanticError("Expected schema variable of kind EXPRESSION or TYPE, " 
			                          + "but is " + x);
			        } else {
			            b.addVariableCondition(new FieldTypeToSortCondition((SchemaVariable)x, 
			                                                               (GenericSort)s));
			        }
			    }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_fieldtype"



	// $ANTLR start "varcond_containsAssignment"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4039:1: varcond_containsAssignment[TacletBuilder b, boolean negated] : CONTAINS_ASSIGNMENT LPAREN x= varId RPAREN ;
	public final void varcond_containsAssignment(TacletBuilder b, boolean negated) throws RecognitionException {
		ParsableVariable x =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4040:4: ( CONTAINS_ASSIGNMENT LPAREN x= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4041:4: CONTAINS_ASSIGNMENT LPAREN x= varId RPAREN
			{
			match(input,CONTAINS_ASSIGNMENT,FOLLOW_CONTAINS_ASSIGNMENT_in_varcond_containsAssignment11220); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_containsAssignment11222); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_containsAssignment11226);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_containsAssignment11228); if (state.failed) return;
			if ( state.backtracking==0 ) {
			      b.addVariableCondition(new ContainsAssignmentCondition((SchemaVariable)x, negated));
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_containsAssignment"



	// $ANTLR start "varcond_enumtype"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4047:1: varcond_enumtype[TacletBuilder b, boolean negated] : ISENUMTYPE LPAREN tr= type_resolver RPAREN ;
	public final void varcond_enumtype(TacletBuilder b, boolean negated) throws RecognitionException {
		TypeResolver tr =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4048:4: ( ISENUMTYPE LPAREN tr= type_resolver RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4049:4: ISENUMTYPE LPAREN tr= type_resolver RPAREN
			{
			match(input,ISENUMTYPE,FOLLOW_ISENUMTYPE_in_varcond_enumtype11250); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_enumtype11252); if (state.failed) return;
			pushFollow(FOLLOW_type_resolver_in_varcond_enumtype11258);
			tr=type_resolver();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_enumtype11260); if (state.failed) return;
			if ( state.backtracking==0 ) {
			         b.addVariableCondition(new EnumTypeCondition(tr, negated));
			      }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_enumtype"



	// $ANTLR start "varcond_reference"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4056:1: varcond_reference[TacletBuilder b, boolean isPrimitive] : ISREFERENCE ( LBRACKET id= simple_ident RBRACKET )? LPAREN tr= type_resolver RPAREN ;
	public final void varcond_reference(TacletBuilder b, boolean isPrimitive) throws RecognitionException {
		String id =null;
		TypeResolver tr =null;


		  boolean nonNull = false;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4060:4: ( ISREFERENCE ( LBRACKET id= simple_ident RBRACKET )? LPAREN tr= type_resolver RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4061:4: ISREFERENCE ( LBRACKET id= simple_ident RBRACKET )? LPAREN tr= type_resolver RPAREN
			{
			match(input,ISREFERENCE,FOLLOW_ISREFERENCE_in_varcond_reference11288); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4061:16: ( LBRACKET id= simple_ident RBRACKET )?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==LBRACKET) ) {
				alt138=1;
			}
			switch (alt138) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4061:17: LBRACKET id= simple_ident RBRACKET
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_varcond_reference11291); if (state.failed) return;
					pushFollow(FOLLOW_simple_ident_in_varcond_reference11319);
					id=simple_ident();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {                                          	
					                   	if ("non_null".equals(id)) {
					                   	    nonNull = true;
					                   	} else {	   
					                            semanticError(id + 
					                   	      " is not an allowed modifier for the \\isReference variable condition.");
					                   	}                   	
					                     }
					match(input,RBRACKET,FOLLOW_RBRACKET_in_varcond_reference11339); if (state.failed) return;
					}
					break;

			}

			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_reference11347); if (state.failed) return;
			pushFollow(FOLLOW_type_resolver_in_varcond_reference11367);
			tr=type_resolver();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_reference11399); if (state.failed) return;
			if ( state.backtracking==0 ) { b.addVariableCondition(new TypeCondition(tr, !isPrimitive, nonNull)); }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_reference"



	// $ANTLR start "varcond_thisreference"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4077:1: varcond_thisreference[TacletBuilder b, boolean negated] : ISTHISREFERENCE LPAREN x= varId RPAREN ;
	public final void varcond_thisreference(TacletBuilder b, boolean negated) throws RecognitionException {
		ParsableVariable x =null;


		  x = null;
		  String id = null;
		  boolean nonNull = false;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4083:4: ( ISTHISREFERENCE LPAREN x= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4084:4: ISTHISREFERENCE LPAREN x= varId RPAREN
			{
			match(input,ISTHISREFERENCE,FOLLOW_ISTHISREFERENCE_in_varcond_thisreference11424); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_thisreference11429); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_thisreference11446);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_thisreference11478); if (state.failed) return;
			if ( state.backtracking==0 ) { b.addVariableCondition(new IsThisReference(x, negated)); }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_thisreference"



	// $ANTLR start "varcond_staticmethod"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4092:1: varcond_staticmethod[TacletBuilder b, boolean negated] : STATICMETHODREFERENCE LPAREN x= varId COMMA y= varId COMMA z= varId RPAREN ;
	public final void varcond_staticmethod(TacletBuilder b, boolean negated) throws RecognitionException {
		ParsableVariable x =null;
		ParsableVariable y =null;
		ParsableVariable z =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4093:4: ( STATICMETHODREFERENCE LPAREN x= varId COMMA y= varId COMMA z= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4094:4: STATICMETHODREFERENCE LPAREN x= varId COMMA y= varId COMMA z= varId RPAREN
			{
			match(input,STATICMETHODREFERENCE,FOLLOW_STATICMETHODREFERENCE_in_varcond_staticmethod11507); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_staticmethod11509); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_staticmethod11513);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_staticmethod11515); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_staticmethod11519);
			y=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_staticmethod11521); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_staticmethod11525);
			z=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_staticmethod11527); if (state.failed) return;
			if ( state.backtracking==0 ) {
			      b.addVariableCondition(new StaticMethodCondition
			         (negated, (SchemaVariable)x, (SchemaVariable)y, (SchemaVariable)z));
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_staticmethod"



	// $ANTLR start "varcond_referencearray"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4100:1: varcond_referencearray[TacletBuilder b, boolean primitiveElementType] : ISREFERENCEARRAY LPAREN x= varId RPAREN ;
	public final void varcond_referencearray(TacletBuilder b, boolean primitiveElementType) throws RecognitionException {
		ParsableVariable x =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4101:4: ( ISREFERENCEARRAY LPAREN x= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4102:4: ISREFERENCEARRAY LPAREN x= varId RPAREN
			{
			match(input,ISREFERENCEARRAY,FOLLOW_ISREFERENCEARRAY_in_varcond_referencearray11543); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_referencearray11545); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_referencearray11549);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_referencearray11551); if (state.failed) return;
			if ( state.backtracking==0 ) {
			     b.addVariableCondition(new ArrayComponentTypeCondition(
			       (SchemaVariable)x, !primitiveElementType));
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_referencearray"



	// $ANTLR start "varcond_array"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4108:1: varcond_array[TacletBuilder b, boolean negated] : ISARRAY LPAREN x= varId RPAREN ;
	public final void varcond_array(TacletBuilder b, boolean negated) throws RecognitionException {
		ParsableVariable x =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4109:4: ( ISARRAY LPAREN x= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4110:4: ISARRAY LPAREN x= varId RPAREN
			{
			match(input,ISARRAY,FOLLOW_ISARRAY_in_varcond_array11567); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_array11569); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_array11573);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_array11575); if (state.failed) return;
			if ( state.backtracking==0 ) {
			     b.addVariableCondition(new ArrayTypeCondition(
			       (SchemaVariable)x, negated));
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_array"



	// $ANTLR start "varcond_array_length"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4116:1: varcond_array_length[TacletBuilder b, boolean negated] : ISARRAYLENGTH LPAREN x= varId RPAREN ;
	public final void varcond_array_length(TacletBuilder b, boolean negated) throws RecognitionException {
		ParsableVariable x =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4117:4: ( ISARRAYLENGTH LPAREN x= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4118:4: ISARRAYLENGTH LPAREN x= varId RPAREN
			{
			match(input,ISARRAYLENGTH,FOLLOW_ISARRAYLENGTH_in_varcond_array_length11591); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_array_length11593); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_array_length11597);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_array_length11599); if (state.failed) return;
			if ( state.backtracking==0 ) {
			     b.addVariableCondition(new ArrayLengthCondition (
			       (SchemaVariable)x, negated));
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_array_length"



	// $ANTLR start "varcond_abstractOrInterface"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4125:1: varcond_abstractOrInterface[TacletBuilder b, boolean negated] : IS_ABSTRACT_OR_INTERFACE LPAREN tr= type_resolver RPAREN ;
	public final void varcond_abstractOrInterface(TacletBuilder b, boolean negated) throws RecognitionException {
		TypeResolver tr =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4126:4: ( IS_ABSTRACT_OR_INTERFACE LPAREN tr= type_resolver RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4127:4: IS_ABSTRACT_OR_INTERFACE LPAREN tr= type_resolver RPAREN
			{
			match(input,IS_ABSTRACT_OR_INTERFACE,FOLLOW_IS_ABSTRACT_OR_INTERFACE_in_varcond_abstractOrInterface11616); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_abstractOrInterface11618); if (state.failed) return;
			pushFollow(FOLLOW_type_resolver_in_varcond_abstractOrInterface11622);
			tr=type_resolver();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_abstractOrInterface11624); if (state.failed) return;
			if ( state.backtracking==0 ) {
			     b.addVariableCondition(new AbstractOrInterfaceType(tr, negated));
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_abstractOrInterface"



	// $ANTLR start "varcond_enum_const"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4132:1: varcond_enum_const[TacletBuilder b] : ENUM_CONST LPAREN x= varId RPAREN ;
	public final void varcond_enum_const(TacletBuilder b) throws RecognitionException {
		ParsableVariable x =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4133:4: ( ENUM_CONST LPAREN x= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4134:4: ENUM_CONST LPAREN x= varId RPAREN
			{
			match(input,ENUM_CONST,FOLLOW_ENUM_CONST_in_varcond_enum_const11640); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_enum_const11642); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_enum_const11646);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_enum_const11648); if (state.failed) return;
			if ( state.backtracking==0 ) {
			      b.addVariableCondition(new EnumConstantCondition(
				(SchemaVariable) x));     
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_enum_const"



	// $ANTLR start "varcond_final"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4140:1: varcond_final[TacletBuilder b, boolean negated] : FINAL LPAREN x= varId RPAREN ;
	public final void varcond_final(TacletBuilder b, boolean negated) throws RecognitionException {
		ParsableVariable x =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4141:4: ( FINAL LPAREN x= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4142:4: FINAL LPAREN x= varId RPAREN
			{
			match(input,FINAL,FOLLOW_FINAL_in_varcond_final11664); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_final11666); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_final11670);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_final11672); if (state.failed) return;
			if ( state.backtracking==0 ) {
			      b.addVariableCondition(new FinalReferenceCondition(
			  (SchemaVariable) x, negated));     
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_final"



	// $ANTLR start "varcond_static"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4148:1: varcond_static[TacletBuilder b, boolean negated] : STATIC LPAREN x= varId RPAREN ;
	public final void varcond_static(TacletBuilder b, boolean negated) throws RecognitionException {
		ParsableVariable x =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4149:4: ( STATIC LPAREN x= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4150:4: STATIC LPAREN x= varId RPAREN
			{
			match(input,STATIC,FOLLOW_STATIC_in_varcond_static11688); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_static11690); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_static11694);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_static11696); if (state.failed) return;
			if ( state.backtracking==0 ) {
			      b.addVariableCondition(new StaticReferenceCondition(
				(SchemaVariable) x, negated));     
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_static"



	// $ANTLR start "varcond_localvariable"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4156:1: varcond_localvariable[TacletBuilder b, boolean negated] : ISLOCALVARIABLE LPAREN x= varId RPAREN ;
	public final void varcond_localvariable(TacletBuilder b, boolean negated) throws RecognitionException {
		ParsableVariable x =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4157:4: ( ISLOCALVARIABLE LPAREN x= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4158:4: ISLOCALVARIABLE LPAREN x= varId RPAREN
			{
			match(input,ISLOCALVARIABLE,FOLLOW_ISLOCALVARIABLE_in_varcond_localvariable11712); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_localvariable11716); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_localvariable11720);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_localvariable11722); if (state.failed) return;
			if ( state.backtracking==0 ) {
			     	   b.addVariableCondition(new LocalVariableCondition((SchemaVariable) x, negated));
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_localvariable"



	// $ANTLR start "varcond_observer"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4165:1: varcond_observer[TacletBuilder b] : ISOBSERVER LPAREN obs= varId COMMA heap= varId RPAREN ;
	public final void varcond_observer(TacletBuilder b) throws RecognitionException {
		ParsableVariable obs =null;
		ParsableVariable heap =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4166:4: ( ISOBSERVER LPAREN obs= varId COMMA heap= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4167:4: ISOBSERVER LPAREN obs= varId COMMA heap= varId RPAREN
			{
			match(input,ISOBSERVER,FOLLOW_ISOBSERVER_in_varcond_observer11740); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_observer11744); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_observer11748);
			obs=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_observer11750); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_observer11754);
			heap=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_observer11757); if (state.failed) return;
			if ( state.backtracking==0 ) {
			     	   b.addVariableCondition(new ObserverCondition((TermSV)obs, 
			     	                                                (TermSV)heap));
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_observer"



	// $ANTLR start "varcond_different"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4175:1: varcond_different[TacletBuilder b] : DIFFERENT LPAREN var1= varId COMMA var2= varId RPAREN ;
	public final void varcond_different(TacletBuilder b) throws RecognitionException {
		ParsableVariable var1 =null;
		ParsableVariable var2 =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4176:4: ( DIFFERENT LPAREN var1= varId COMMA var2= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4177:4: DIFFERENT LPAREN var1= varId COMMA var2= varId RPAREN
			{
			match(input,DIFFERENT,FOLLOW_DIFFERENT_in_varcond_different11775); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_different11779); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_different11783);
			var1=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_different11785); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_different11789);
			var2=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_different11791); if (state.failed) return;
			if ( state.backtracking==0 ) {
			     	   b.addVariableCondition(new DifferentInstantiationCondition(
			     	   				(SchemaVariable)var1,
			     	   				 (SchemaVariable)var2));
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_different"



	// $ANTLR start "varcond_metadisjoint"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4186:1: varcond_metadisjoint[TacletBuilder b] : METADISJOINT LPAREN var1= varId COMMA var2= varId RPAREN ;
	public final void varcond_metadisjoint(TacletBuilder b) throws RecognitionException {
		ParsableVariable var1 =null;
		ParsableVariable var2 =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4187:4: ( METADISJOINT LPAREN var1= varId COMMA var2= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4188:4: METADISJOINT LPAREN var1= varId COMMA var2= varId RPAREN
			{
			match(input,METADISJOINT,FOLLOW_METADISJOINT_in_varcond_metadisjoint11809); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_metadisjoint11813); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_metadisjoint11817);
			var1=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_metadisjoint11819); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_metadisjoint11823);
			var2=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_metadisjoint11825); if (state.failed) return;
			if ( state.backtracking==0 ) {
			     	   b.addVariableCondition(new MetaDisjointCondition(
			     	   				(TermSV)var1,
			     	   				(TermSV)var2));
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_metadisjoint"



	// $ANTLR start "varcond_equalUnique"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4198:1: varcond_equalUnique[TacletBuilder b] : EQUAL_UNIQUE LPAREN t= varId COMMA t2= varId COMMA phi= varId RPAREN ;
	public final void varcond_equalUnique(TacletBuilder b) throws RecognitionException {
		ParsableVariable t =null;
		ParsableVariable t2 =null;
		ParsableVariable phi =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4199:4: ( EQUAL_UNIQUE LPAREN t= varId COMMA t2= varId COMMA phi= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4200:4: EQUAL_UNIQUE LPAREN t= varId COMMA t2= varId COMMA phi= varId RPAREN
			{
			match(input,EQUAL_UNIQUE,FOLLOW_EQUAL_UNIQUE_in_varcond_equalUnique11844); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_equalUnique11848); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_equalUnique11852);
			t=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_equalUnique11854); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_equalUnique11858);
			t2=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_equalUnique11860); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_equalUnique11864);
			phi=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_equalUnique11866); if (state.failed) return;
			if ( state.backtracking==0 ) {
			     	   b.addVariableCondition(new EqualUniqueCondition((TermSV) t, 
			     	                                                   (TermSV) t2, 
			     	                                                   (FormulaSV) phi));
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_equalUnique"



	// $ANTLR start "varcond_freeLabelIn"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4209:1: varcond_freeLabelIn[TacletBuilder b, boolean negated] : FREELABELIN LPAREN l= varId COMMA statement= varId RPAREN ;
	public final void varcond_freeLabelIn(TacletBuilder b, boolean negated) throws RecognitionException {
		ParsableVariable l =null;
		ParsableVariable statement =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4210:2: ( FREELABELIN LPAREN l= varId COMMA statement= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4212:2: FREELABELIN LPAREN l= varId COMMA statement= varId RPAREN
			{
			match(input,FREELABELIN,FOLLOW_FREELABELIN_in_varcond_freeLabelIn11883); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_freeLabelIn11890); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_freeLabelIn11894);
			l=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_freeLabelIn11896); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_freeLabelIn11900);
			statement=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_freeLabelIn11902); if (state.failed) return;
			if ( state.backtracking==0 ) {
			    	b.addVariableCondition(new FreeLabelInVariableCondition((SchemaVariable) l, 
			    	(SchemaVariable) statement, negated ));
			    }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_freeLabelIn"



	// $ANTLR start "varcond_constant"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4219:1: varcond_constant[TacletBuilder b, boolean negated] : ISCONSTANT LPAREN x= varId RPAREN ;
	public final void varcond_constant(TacletBuilder b, boolean negated) throws RecognitionException {
		ParsableVariable x =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4220:4: ( ISCONSTANT LPAREN x= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4221:4: ISCONSTANT LPAREN x= varId RPAREN
			{
			match(input,ISCONSTANT,FOLLOW_ISCONSTANT_in_varcond_constant11918); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_constant11928); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_constant11932);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_constant11934); if (state.failed) return;
			if ( state.backtracking==0 ) {
			           if (x instanceof TermSV) {
			                b.addVariableCondition(new ConstantCondition((TermSV) x, negated ));
			           } else {
			                assert x instanceof FormulaSV;
			                b.addVariableCondition(new ConstantCondition((FormulaSV) x, negated ));
			           }
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_constant"



	// $ANTLR start "varcond_label"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4232:1: varcond_label[TacletBuilder b, boolean negated] : HASLABEL LPAREN l= varId COMMA name= simple_ident RPAREN ;
	public final void varcond_label(TacletBuilder b, boolean negated) throws RecognitionException {
		ParsableVariable l =null;
		String name =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4233:4: ( HASLABEL LPAREN l= varId COMMA name= simple_ident RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4234:4: HASLABEL LPAREN l= varId COMMA name= simple_ident RPAREN
			{
			match(input,HASLABEL,FOLLOW_HASLABEL_in_varcond_label11950); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_label11960); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_label11964);
			l=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_varcond_label11966); if (state.failed) return;
			pushFollow(FOLLOW_simple_ident_in_varcond_label11970);
			name=simple_ident();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_label11972); if (state.failed) return;
			if ( state.backtracking==0 ) {
			           b.addVariableCondition(new TermLabelCondition((TermLabelSV) l, name, negated ));
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_label"



	// $ANTLR start "varcond_static_field"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4240:1: varcond_static_field[TacletBuilder b, boolean negated] : ISSTATICFIELD LPAREN field= varId RPAREN ;
	public final void varcond_static_field(TacletBuilder b, boolean negated) throws RecognitionException {
		ParsableVariable field =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4241:4: ( ISSTATICFIELD LPAREN field= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4242:4: ISSTATICFIELD LPAREN field= varId RPAREN
			{
			match(input,ISSTATICFIELD,FOLLOW_ISSTATICFIELD_in_varcond_static_field11988); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_static_field11998); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_static_field12002);
			field=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_static_field12004); if (state.failed) return;
			if ( state.backtracking==0 ) {
			           b.addVariableCondition(new StaticFieldCondition((SchemaVariable) field, negated ));
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_static_field"



	// $ANTLR start "varcond_subFormulas"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4248:1: varcond_subFormulas[TacletBuilder b, boolean negated] : HASSUBFORMULAS LPAREN x= varId RPAREN ;
	public final void varcond_subFormulas(TacletBuilder b, boolean negated) throws RecognitionException {
		ParsableVariable x =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4249:4: ( HASSUBFORMULAS LPAREN x= varId RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4250:4: HASSUBFORMULAS LPAREN x= varId RPAREN
			{
			match(input,HASSUBFORMULAS,FOLLOW_HASSUBFORMULAS_in_varcond_subFormulas12020); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_varcond_subFormulas12030); if (state.failed) return;
			pushFollow(FOLLOW_varId_in_varcond_subFormulas12034);
			x=varId();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_varcond_subFormulas12036); if (state.failed) return;
			if ( state.backtracking==0 ) {
			           b.addVariableCondition(new SubFormulaCondition((FormulaSV) x, negated ));
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varcond_subFormulas"



	// $ANTLR start "goalspecs"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4256:1: goalspecs[TacletBuilder b, boolean ruleWithFind] : ( CLOSEGOAL | goalspecwithoption[b, ruleWithFind] ( SEMI goalspecwithoption[b, ruleWithFind] )* );
	public final void goalspecs(TacletBuilder b, boolean ruleWithFind) throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4256:50: ( CLOSEGOAL | goalspecwithoption[b, ruleWithFind] ( SEMI goalspecwithoption[b, ruleWithFind] )* )
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==CLOSEGOAL) ) {
				alt140=1;
			}
			else if ( (LA140_0==ADD||LA140_0==ADDRULES||LA140_0==LPAREN||LA140_0==REPLACEWITH||LA140_0==STRING_LITERAL) ) {
				alt140=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 140, 0, input);
				throw nvae;
			}

			switch (alt140) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4257:9: CLOSEGOAL
					{
					match(input,CLOSEGOAL,FOLLOW_CLOSEGOAL_in_goalspecs12056); if (state.failed) return;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4258:7: goalspecwithoption[b, ruleWithFind] ( SEMI goalspecwithoption[b, ruleWithFind] )*
					{
					pushFollow(FOLLOW_goalspecwithoption_in_goalspecs12064);
					goalspecwithoption(b, ruleWithFind);
					state._fsp--;
					if (state.failed) return;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4258:43: ( SEMI goalspecwithoption[b, ruleWithFind] )*
					loop139:
					while (true) {
						int alt139=2;
						int LA139_0 = input.LA(1);
						if ( (LA139_0==SEMI) ) {
							alt139=1;
						}

						switch (alt139) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4258:45: SEMI goalspecwithoption[b, ruleWithFind]
							{
							match(input,SEMI,FOLLOW_SEMI_in_goalspecs12069); if (state.failed) return;
							pushFollow(FOLLOW_goalspecwithoption_in_goalspecs12071);
							goalspecwithoption(b, ruleWithFind);
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop139;
						}
					}

					}
					break;

			}
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "goalspecs"



	// $ANTLR start "goalspecwithoption"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4260:1: goalspecwithoption[TacletBuilder b, boolean ruleWithFind] : ( (soc= option_list[soc] LBRACE goalspec[b,soc,ruleWithFind] RBRACE ) | goalspec[b,null,ruleWithFind] ) ;
	public final void goalspecwithoption(TacletBuilder b, boolean ruleWithFind) throws RecognitionException {
		ImmutableSet<Choice> soc =null;


		    soc = DefaultImmutableSet.<Choice>nil();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4263:3: ( ( (soc= option_list[soc] LBRACE goalspec[b,soc,ruleWithFind] RBRACE ) | goalspec[b,null,ruleWithFind] ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4264:9: ( (soc= option_list[soc] LBRACE goalspec[b,soc,ruleWithFind] RBRACE ) | goalspec[b,null,ruleWithFind] )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4264:9: ( (soc= option_list[soc] LBRACE goalspec[b,soc,ruleWithFind] RBRACE ) | goalspec[b,null,ruleWithFind] )
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==LPAREN) ) {
				alt141=1;
			}
			else if ( (LA141_0==ADD||LA141_0==ADDRULES||LA141_0==REPLACEWITH||LA141_0==STRING_LITERAL) ) {
				alt141=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 141, 0, input);
				throw nvae;
			}

			switch (alt141) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4264:10: (soc= option_list[soc] LBRACE goalspec[b,soc,ruleWithFind] RBRACE )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4264:10: (soc= option_list[soc] LBRACE goalspec[b,soc,ruleWithFind] RBRACE )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4264:12: soc= option_list[soc] LBRACE goalspec[b,soc,ruleWithFind] RBRACE
					{
					pushFollow(FOLLOW_option_list_in_goalspecwithoption12104);
					soc=option_list(soc);
					state._fsp--;
					if (state.failed) return;
					match(input,LBRACE,FOLLOW_LBRACE_in_goalspecwithoption12123); if (state.failed) return;
					pushFollow(FOLLOW_goalspec_in_goalspecwithoption12141);
					goalspec(b, soc, ruleWithFind);
					state._fsp--;
					if (state.failed) return;
					match(input,RBRACE,FOLLOW_RBRACE_in_goalspecwithoption12161); if (state.failed) return;
					}

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4269:13: goalspec[b,null,ruleWithFind]
					{
					pushFollow(FOLLOW_goalspec_in_goalspecwithoption12188);
					goalspec(b, null, ruleWithFind);
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "goalspecwithoption"



	// $ANTLR start "option"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4273:1: option returns [Choice c=null] : cat= IDENT COLON choice_= IDENT ;
	public final Choice option() throws RecognitionException {
		Choice c = null;


		Token cat=null;
		Token choice_=null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4274:9: (cat= IDENT COLON choice_= IDENT )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4275:9: cat= IDENT COLON choice_= IDENT
			{
			cat=(Token)match(input,IDENT,FOLLOW_IDENT_in_option12227); if (state.failed) return c;
			match(input,COLON,FOLLOW_COLON_in_option12229); if (state.failed) return c;
			choice_=(Token)match(input,IDENT,FOLLOW_IDENT_in_option12233); if (state.failed) return c;
			if ( state.backtracking==0 ) {
			            c = (Choice) choices().lookup(new Name(cat.getText()+":"+choice_.getText()));
			            if(c==null) {
			                throw new NotDeclException(input, "Option", choice_.getText());
				    }
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "option"



	// $ANTLR start "option_list"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4284:1: option_list[ImmutableSet<Choice> soc] returns [ImmutableSet<Choice> result = null] : LPAREN c= option ( COMMA c= option )* RPAREN ;
	public final ImmutableSet<Choice> option_list(ImmutableSet<Choice> soc) throws RecognitionException {
		ImmutableSet<Choice> result =  null;


		Choice c =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4285:1: ( LPAREN c= option ( COMMA c= option )* RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4286:1: LPAREN c= option ( COMMA c= option )* RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_option_list12265); if (state.failed) return result;
			if ( state.backtracking==0 ) {result = soc; }
			pushFollow(FOLLOW_option_in_option_list12276);
			c=option();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {result = result.add(c);}
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4288:3: ( COMMA c= option )*
			loop142:
			while (true) {
				int alt142=2;
				int LA142_0 = input.LA(1);
				if ( (LA142_0==COMMA) ) {
					alt142=1;
				}

				switch (alt142) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4288:4: COMMA c= option
					{
					match(input,COMMA,FOLLOW_COMMA_in_option_list12283); if (state.failed) return result;
					pushFollow(FOLLOW_option_in_option_list12289);
					c=option();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) {result = result.add(c);}
					}
					break;

				default :
					break loop142;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_option_list12295); if (state.failed) return result;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "option_list"



	// $ANTLR start "goalspec"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4292:1: goalspec[TacletBuilder b, ImmutableSet<Choice> soc, boolean ruleWithFind] : (name= string_literal COLON )? ( (rwObj= replacewith (addSeq= add )? (addRList= addrules )? (addpv= addprogvar )? ) | (addSeq= add (addRList= addrules )? ) | (addRList= addrules ) ) ;
	public final void goalspec(TacletBuilder b, ImmutableSet<Choice> soc, boolean ruleWithFind) throws RecognitionException {
		String name =null;
		Object rwObj =null;
		Sequent addSeq =null;
		ImmutableList<Taclet> addRList =null;
		ImmutableSet<SchemaVariable> addpv =null;


		    addSeq = Sequent.EMPTY_SEQUENT;
		    addRList = ImmutableSLList.<Taclet>nil();
		    addpv = DefaultImmutableSet.<SchemaVariable>nil();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4298:5: ( (name= string_literal COLON )? ( (rwObj= replacewith (addSeq= add )? (addRList= addrules )? (addpv= addprogvar )? ) | (addSeq= add (addRList= addrules )? ) | (addRList= addrules ) ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4299:9: (name= string_literal COLON )? ( (rwObj= replacewith (addSeq= add )? (addRList= addrules )? (addpv= addprogvar )? ) | (addSeq= add (addRList= addrules )? ) | (addRList= addrules ) )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4299:9: (name= string_literal COLON )?
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==STRING_LITERAL) ) {
				alt143=1;
			}
			switch (alt143) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4299:10: name= string_literal COLON
					{
					pushFollow(FOLLOW_string_literal_in_goalspec12327);
					name=string_literal();
					state._fsp--;
					if (state.failed) return;
					match(input,COLON,FOLLOW_COLON_in_goalspec12329); if (state.failed) return;
					}
					break;

			}

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4300:9: ( (rwObj= replacewith (addSeq= add )? (addRList= addrules )? (addpv= addprogvar )? ) | (addSeq= add (addRList= addrules )? ) | (addRList= addrules ) )
			int alt148=3;
			switch ( input.LA(1) ) {
			case REPLACEWITH:
				{
				alt148=1;
				}
				break;
			case ADD:
				{
				alt148=2;
				}
				break;
			case ADDRULES:
				{
				alt148=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 148, 0, input);
				throw nvae;
			}
			switch (alt148) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4300:13: (rwObj= replacewith (addSeq= add )? (addRList= addrules )? (addpv= addprogvar )? )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4300:13: (rwObj= replacewith (addSeq= add )? (addRList= addrules )? (addpv= addprogvar )? )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4300:15: rwObj= replacewith (addSeq= add )? (addRList= addrules )? (addpv= addprogvar )?
					{
					pushFollow(FOLLOW_replacewith_in_goalspec12351);
					rwObj=replacewith();
					state._fsp--;
					if (state.failed) return;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4301:17: (addSeq= add )?
					int alt144=2;
					int LA144_0 = input.LA(1);
					if ( (LA144_0==ADD) ) {
						alt144=1;
					}
					switch (alt144) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4301:18: addSeq= add
							{
							pushFollow(FOLLOW_add_in_goalspec12372);
							addSeq=add();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4302:17: (addRList= addrules )?
					int alt145=2;
					int LA145_0 = input.LA(1);
					if ( (LA145_0==ADDRULES) ) {
						alt145=1;
					}
					switch (alt145) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4302:18: addRList= addrules
							{
							pushFollow(FOLLOW_addrules_in_goalspec12396);
							addRList=addrules();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4303:17: (addpv= addprogvar )?
					int alt146=2;
					int LA146_0 = input.LA(1);
					if ( (LA146_0==ADDPROGVARS) ) {
						alt146=1;
					}
					switch (alt146) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4303:18: addpv= addprogvar
							{
							pushFollow(FOLLOW_addprogvar_in_goalspec12420);
							addpv=addprogvar();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4305:11: (addSeq= add (addRList= addrules )? )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4305:11: (addSeq= add (addRList= addrules )? )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4305:13: addSeq= add (addRList= addrules )?
					{
					pushFollow(FOLLOW_add_in_goalspec12452);
					addSeq=add();
					state._fsp--;
					if (state.failed) return;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4305:24: (addRList= addrules )?
					int alt147=2;
					int LA147_0 = input.LA(1);
					if ( (LA147_0==ADDRULES) ) {
						alt147=1;
					}
					switch (alt147) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4305:25: addRList= addrules
							{
							pushFollow(FOLLOW_addrules_in_goalspec12457);
							addRList=addrules();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}

					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4306:11: (addRList= addrules )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4306:11: (addRList= addrules )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4306:13: addRList= addrules
					{
					pushFollow(FOLLOW_addrules_in_goalspec12477);
					addRList=addrules();
					state._fsp--;
					if (state.failed) return;
					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			            addGoalTemplate(b,name,rwObj,addSeq,addRList,addpv,soc);
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "goalspec"



	// $ANTLR start "replacewith"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4314:1: replacewith returns [Object _replace_with] : REPLACEWITH LPAREN o= termorseq RPAREN ;
	public final Object replacewith() throws RecognitionException {
		Object _replace_with = null;


		Object o =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4316:9: ( REPLACEWITH LPAREN o= termorseq RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4317:9: REPLACEWITH LPAREN o= termorseq RPAREN
			{
			match(input,REPLACEWITH,FOLLOW_REPLACEWITH_in_replacewith12537); if (state.failed) return _replace_with;
			match(input,LPAREN,FOLLOW_LPAREN_in_replacewith12539); if (state.failed) return _replace_with;
			pushFollow(FOLLOW_termorseq_in_replacewith12543);
			o=termorseq();
			state._fsp--;
			if (state.failed) return _replace_with;
			match(input,RPAREN,FOLLOW_RPAREN_in_replacewith12545); if (state.failed) return _replace_with;
			}

			if ( state.backtracking==0 ) { _replace_with = o; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _replace_with;
	}
	// $ANTLR end "replacewith"



	// $ANTLR start "add"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4319:1: add returns [Sequent _add] : ADD LPAREN s= seq RPAREN ;
	public final Sequent add() throws RecognitionException {
		Sequent _add = null;


		Sequent s =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4321:9: ( ADD LPAREN s= seq RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4322:9: ADD LPAREN s= seq RPAREN
			{
			match(input,ADD,FOLLOW_ADD_in_add12569); if (state.failed) return _add;
			match(input,LPAREN,FOLLOW_LPAREN_in_add12571); if (state.failed) return _add;
			pushFollow(FOLLOW_seq_in_add12575);
			s=seq();
			state._fsp--;
			if (state.failed) return _add;
			match(input,RPAREN,FOLLOW_RPAREN_in_add12577); if (state.failed) return _add;
			}

			if ( state.backtracking==0 ) { _add = s; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _add;
	}
	// $ANTLR end "add"



	// $ANTLR start "addrules"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4324:1: addrules returns [ImmutableList<Taclet> _add_rules] : ADDRULES LPAREN lor= tacletlist RPAREN ;
	public final ImmutableList<Taclet> addrules() throws RecognitionException {
		ImmutableList<Taclet> _add_rules = null;


		ImmutableList<Taclet> lor =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4326:9: ( ADDRULES LPAREN lor= tacletlist RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4327:9: ADDRULES LPAREN lor= tacletlist RPAREN
			{
			match(input,ADDRULES,FOLLOW_ADDRULES_in_addrules12601); if (state.failed) return _add_rules;
			match(input,LPAREN,FOLLOW_LPAREN_in_addrules12603); if (state.failed) return _add_rules;
			pushFollow(FOLLOW_tacletlist_in_addrules12607);
			lor=tacletlist();
			state._fsp--;
			if (state.failed) return _add_rules;
			match(input,RPAREN,FOLLOW_RPAREN_in_addrules12609); if (state.failed) return _add_rules;
			}

			if ( state.backtracking==0 ) { _add_rules = lor; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _add_rules;
	}
	// $ANTLR end "addrules"



	// $ANTLR start "addprogvar"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4329:1: addprogvar returns [ImmutableSet<SchemaVariable> _add_prog_var] : ADDPROGVARS LPAREN pvs= pvset RPAREN ;
	public final ImmutableSet<SchemaVariable> addprogvar() throws RecognitionException {
		ImmutableSet<SchemaVariable> _add_prog_var = null;


		ImmutableSet<SchemaVariable> pvs =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4331:9: ( ADDPROGVARS LPAREN pvs= pvset RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4332:9: ADDPROGVARS LPAREN pvs= pvset RPAREN
			{
			match(input,ADDPROGVARS,FOLLOW_ADDPROGVARS_in_addprogvar12633); if (state.failed) return _add_prog_var;
			match(input,LPAREN,FOLLOW_LPAREN_in_addprogvar12635); if (state.failed) return _add_prog_var;
			pushFollow(FOLLOW_pvset_in_addprogvar12639);
			pvs=pvset();
			state._fsp--;
			if (state.failed) return _add_prog_var;
			match(input,RPAREN,FOLLOW_RPAREN_in_addprogvar12641); if (state.failed) return _add_prog_var;
			}

			if ( state.backtracking==0 ) { _add_prog_var = pvs; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _add_prog_var;
	}
	// $ANTLR end "addprogvar"



	// $ANTLR start "tacletlist"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4334:1: tacletlist returns [ImmutableList<Taclet> _taclet_list] : head= taclet[DefaultImmutableSet.<Choice>nil(), false] (| COMMA lor= tacletlist ) ;
	public final ImmutableList<Taclet> tacletlist() throws RecognitionException {
		ImmutableList<Taclet> _taclet_list = null;


		Taclet head =null;
		ImmutableList<Taclet> lor =null;

		 
		    lor = ImmutableSLList.<Taclet>nil(); 

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4339:5: (head= taclet[DefaultImmutableSet.<Choice>nil(), false] (| COMMA lor= tacletlist ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4340:9: head= taclet[DefaultImmutableSet.<Choice>nil(), false] (| COMMA lor= tacletlist )
			{
			pushFollow(FOLLOW_taclet_in_tacletlist12675);
			head=taclet(DefaultImmutableSet.<Choice>nil(), false);
			state._fsp--;
			if (state.failed) return _taclet_list;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4341:9: (| COMMA lor= tacletlist )
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==RPAREN) ) {
				alt149=1;
			}
			else if ( (LA149_0==COMMA) ) {
				alt149=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return _taclet_list;}
				NoViableAltException nvae =
					new NoViableAltException("", 149, 0, input);
				throw nvae;
			}

			switch (alt149) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4341:21: 
					{
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4341:23: COMMA lor= tacletlist
					{
					match(input,COMMA,FOLLOW_COMMA_in_tacletlist12695); if (state.failed) return _taclet_list;
					pushFollow(FOLLOW_tacletlist_in_tacletlist12699);
					lor=tacletlist();
					state._fsp--;
					if (state.failed) return _taclet_list;
					}
					break;

			}

			if ( state.backtracking==0 ) { lor = lor.prepend(head); }
			}

			if ( state.backtracking==0 ) { _taclet_list = lor; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _taclet_list;
	}
	// $ANTLR end "tacletlist"



	// $ANTLR start "pvset"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4344:1: pvset returns [ImmutableSet<SchemaVariable> _pv_set] : pv= varId (| COMMA pvs= pvset ) ;
	public final ImmutableSet<SchemaVariable> pvset() throws RecognitionException {
		ImmutableSet<SchemaVariable> _pv_set = null;


		ParsableVariable pv =null;
		ImmutableSet<SchemaVariable> pvs =null;


		    pvs = DefaultImmutableSet.<SchemaVariable>nil();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4349:5: (pv= varId (| COMMA pvs= pvset ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4350:9: pv= varId (| COMMA pvs= pvset )
			{
			pushFollow(FOLLOW_varId_in_pvset12742);
			pv=varId();
			state._fsp--;
			if (state.failed) return _pv_set;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4351:9: (| COMMA pvs= pvset )
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==RPAREN) ) {
				alt150=1;
			}
			else if ( (LA150_0==COMMA) ) {
				alt150=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return _pv_set;}
				NoViableAltException nvae =
					new NoViableAltException("", 150, 0, input);
				throw nvae;
			}

			switch (alt150) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4351:21: 
					{
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4351:23: COMMA pvs= pvset
					{
					match(input,COMMA,FOLLOW_COMMA_in_pvset12758); if (state.failed) return _pv_set;
					pushFollow(FOLLOW_pvset_in_pvset12762);
					pvs=pvset();
					state._fsp--;
					if (state.failed) return _pv_set;
					}
					break;

			}

			if ( state.backtracking==0 ) { pvs = pvs.add
			                                          ((SchemaVariable)pv); }
			}

			if ( state.backtracking==0 ) { _pv_set = pvs; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _pv_set;
	}
	// $ANTLR end "pvset"



	// $ANTLR start "rulesets"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4354:1: rulesets returns [Vector rs = new Vector()] : HEURISTICS LPAREN ruleset[rs] ( COMMA ruleset[rs] )* RPAREN ;
	public final Vector rulesets() throws RecognitionException {
		Vector rs =  new Vector();


		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4354:45: ( HEURISTICS LPAREN ruleset[rs] ( COMMA ruleset[rs] )* RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4355:9: HEURISTICS LPAREN ruleset[rs] ( COMMA ruleset[rs] )* RPAREN
			{
			match(input,HEURISTICS,FOLLOW_HEURISTICS_in_rulesets12785); if (state.failed) return rs;
			match(input,LPAREN,FOLLOW_LPAREN_in_rulesets12787); if (state.failed) return rs;
			pushFollow(FOLLOW_ruleset_in_rulesets12789);
			ruleset(rs);
			state._fsp--;
			if (state.failed) return rs;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4355:39: ( COMMA ruleset[rs] )*
			loop151:
			while (true) {
				int alt151=2;
				int LA151_0 = input.LA(1);
				if ( (LA151_0==COMMA) ) {
					alt151=1;
				}

				switch (alt151) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4355:41: COMMA ruleset[rs]
					{
					match(input,COMMA,FOLLOW_COMMA_in_rulesets12794); if (state.failed) return rs;
					pushFollow(FOLLOW_ruleset_in_rulesets12796);
					ruleset(rs);
					state._fsp--;
					if (state.failed) return rs;
					}
					break;

				default :
					break loop151;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_rulesets12803); if (state.failed) return rs;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return rs;
	}
	// $ANTLR end "rulesets"



	// $ANTLR start "ruleset"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4357:1: ruleset[Vector rs] : id= IDENT ;
	public final void ruleset(Vector rs) throws RecognitionException {
		Token id=null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4358:9: (id= IDENT )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4359:9: id= IDENT
			{
			id=(Token)match(input,IDENT,FOLLOW_IDENT_in_ruleset12823); if (state.failed) return;
			if ( state.backtracking==0 ) {   
			            RuleSet h = (RuleSet) ruleSets().lookup(new Name(id.getText()));
			            if (h == null) {
			                throw new NotDeclException(input, "ruleset", id.getText());
			            }
			            rs.add(h);
			        }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ruleset"



	// $ANTLR start "metaId"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4369:1: metaId returns [TermTransformer v = null] : id= simple_ident ;
	public final TermTransformer metaId() throws RecognitionException {
		TermTransformer v =  null;


		String id =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4370:3: (id= simple_ident )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4371:3: id= simple_ident
			{
			pushFollow(FOLLOW_simple_ident_in_metaId12857);
			id=simple_ident();
			state._fsp--;
			if (state.failed) return v;
			if ( state.backtracking==0 ) {
			     v = AbstractTermTransformer.name2metaop(id);
			     if (v == null)
			       semanticError("Unknown metaoperator: "+id);
			  }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return v;
	}
	// $ANTLR end "metaId"



	// $ANTLR start "metaTerm"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4378:1: metaTerm returns [Term result = null] : (vf= metaId ( LPAREN t= term ( COMMA t= term )* RPAREN )? ) ;
	public final Term metaTerm() throws RecognitionException {
		Term result =  null;


		TermTransformer vf =null;
		Term t =null;


		    LinkedList al = new LinkedList();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4382:5: ( (vf= metaId ( LPAREN t= term ( COMMA t= term )* RPAREN )? ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4383:9: (vf= metaId ( LPAREN t= term ( COMMA t= term )* RPAREN )? )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4383:9: (vf= metaId ( LPAREN t= term ( COMMA t= term )* RPAREN )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4383:10: vf= metaId ( LPAREN t= term ( COMMA t= term )* RPAREN )?
			{
			pushFollow(FOLLOW_metaId_in_metaTerm12894);
			vf=metaId();
			state._fsp--;
			if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4384:12: ( LPAREN t= term ( COMMA t= term )* RPAREN )?
			int alt153=2;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==LPAREN) ) {
				alt153=1;
			}
			switch (alt153) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4384:14: LPAREN t= term ( COMMA t= term )* RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_metaTerm12910); if (state.failed) return result;
					pushFollow(FOLLOW_term_in_metaTerm12929);
					t=term();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) {
					                al.add(t);
					            }
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4389:13: ( COMMA t= term )*
					loop152:
					while (true) {
						int alt152=2;
						int LA152_0 = input.LA(1);
						if ( (LA152_0==COMMA) ) {
							alt152=1;
						}

						switch (alt152) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4389:15: COMMA t= term
							{
							match(input,COMMA,FOLLOW_COMMA_in_metaTerm12959); if (state.failed) return result;
							pushFollow(FOLLOW_term_in_metaTerm12982);
							t=term();
							state._fsp--;
							if (state.failed) return result;
							if ( state.backtracking==0 ) {
							                    al.add(t);
							                }
							}
							break;

						default :
							break loop152;
						}
					}

					match(input,RPAREN,FOLLOW_RPAREN_in_metaTerm13020); if (state.failed) return result;
					}
					break;

			}

			if ( state.backtracking==0 ) {   	      
			                result = getTermFactory().createTerm(vf, (Term[])al.toArray(AN_ARRAY_OF_TERMS));
			            }
			}

			}

		}
		catch (TermCreationException ex) {

			         raiseException
				    (new KeYSemanticException(input, getSourceName(), ex));
			        
		}

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "metaTerm"



	// $ANTLR start "contracts"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4405:1: contracts : CONTRACTS LBRACE ( one_contract )* RBRACE ;
	public final void contracts() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4406:4: ( CONTRACTS LBRACE ( one_contract )* RBRACE )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4407:4: CONTRACTS LBRACE ( one_contract )* RBRACE
			{
			match(input,CONTRACTS,FOLLOW_CONTRACTS_in_contracts13081); if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_contracts13090); if (state.failed) return;
			if ( state.backtracking==0 ) {
				    switchToNormalMode();
			       }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4411:8: ( one_contract )*
			loop154:
			while (true) {
				int alt154=2;
				int LA154_0 = input.LA(1);
				if ( (LA154_0==IDENT) ) {
					alt154=1;
				}

				switch (alt154) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4411:10: one_contract
					{
					pushFollow(FOLLOW_one_contract_in_contracts13103);
					one_contract();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop154;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_contracts13115); if (state.failed) return;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "contracts"



	// $ANTLR start "invariants"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4415:1: invariants : INVARIANTS LPAREN selfVar= one_logic_bound_variable RPAREN LBRACE ( one_invariant[(ParsableVariable)selfVar] )* RBRACE ;
	public final void invariants() throws RecognitionException {
		QuantifiableVariable selfVar =null;


		  Namespace orig = variables();  

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4419:4: ( INVARIANTS LPAREN selfVar= one_logic_bound_variable RPAREN LBRACE ( one_invariant[(ParsableVariable)selfVar] )* RBRACE )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4420:4: INVARIANTS LPAREN selfVar= one_logic_bound_variable RPAREN LBRACE ( one_invariant[(ParsableVariable)selfVar] )* RBRACE
			{
			match(input,INVARIANTS,FOLLOW_INVARIANTS_in_invariants13132); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_invariants13134); if (state.failed) return;
			pushFollow(FOLLOW_one_logic_bound_variable_in_invariants13138);
			selfVar=one_logic_bound_variable();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_invariants13140); if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_invariants13149); if (state.failed) return;
			if ( state.backtracking==0 ) {
				    switchToNormalMode();
			       }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4424:8: ( one_invariant[(ParsableVariable)selfVar] )*
			loop155:
			while (true) {
				int alt155=2;
				int LA155_0 = input.LA(1);
				if ( (LA155_0==IDENT) ) {
					alt155=1;
				}

				switch (alt155) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4424:10: one_invariant[(ParsableVariable)selfVar]
					{
					pushFollow(FOLLOW_one_invariant_in_invariants13162);
					one_invariant((ParsableVariable)selfVar);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop155;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_invariants13175); if (state.failed) return;
			if ( state.backtracking==0 ) {
			           unbindVars(orig);
			       }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "invariants"



	// $ANTLR start "one_contract"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4431:1: one_contract : contractName= simple_ident LBRACE ( prog_var_decls )? fma= formula MODIFIES modifiesClause= term RBRACE SEMI ;
	public final void one_contract() throws RecognitionException {
		String contractName =null;
		Term fma =null;
		Term modifiesClause =null;


		  String displayName = null;
		  Vector rs = null;
		  NamespaceSet oldServicesNamespaces = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4437:4: (contractName= simple_ident LBRACE ( prog_var_decls )? fma= formula MODIFIES modifiesClause= term RBRACE SEMI )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4438:4: contractName= simple_ident LBRACE ( prog_var_decls )? fma= formula MODIFIES modifiesClause= term RBRACE SEMI
			{
			pushFollow(FOLLOW_simple_ident_in_one_contract13200);
			contractName=simple_ident();
			state._fsp--;
			if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_one_contract13202); if (state.failed) return;
			if ( state.backtracking==0 ) { 
			        //for program variable declarations
			        namespaces().setProgramVariables(new Namespace(programVariables()));    
			     }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4443:6: ( prog_var_decls )?
			int alt156=2;
			int LA156_0 = input.LA(1);
			if ( (LA156_0==PROGRAMVARIABLES) ) {
				alt156=1;
			}
			switch (alt156) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4443:7: prog_var_decls
					{
					pushFollow(FOLLOW_prog_var_decls_in_one_contract13218);
					prog_var_decls();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_formula_in_one_contract13232);
			fma=formula();
			state._fsp--;
			if (state.failed) return;
			match(input,MODIFIES,FOLLOW_MODIFIES_in_one_contract13234); if (state.failed) return;
			pushFollow(FOLLOW_term_in_one_contract13240);
			modifiesClause=term();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			       DLSpecFactory dsf = new DLSpecFactory(getServices());
			       try {
			         contracts = contracts.prepend(dsf.createDLOperationContract(contractName,
			       					                         fma, 
			           				                         modifiesClause));
			       } catch(ProofInputException e) {
			         semanticError(e.getMessage());
			       }
			     }
			match(input,RBRACE,FOLLOW_RBRACE_in_one_contract13255); if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_one_contract13257); if (state.failed) return;
			if ( state.backtracking==0 ) {
			       //dump local program variable declarations
			       namespaces().setProgramVariables(programVariables().parent());
			     }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "one_contract"



	// $ANTLR start "one_invariant"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4462:1: one_invariant[ParsableVariable selfVar] : invName= simple_ident LBRACE fma= formula ( DISPLAYNAME displayName= string_literal )? RBRACE SEMI ;
	public final void one_invariant(ParsableVariable selfVar) throws RecognitionException {
		String invName =null;
		Term fma =null;
		String displayName =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4463:6: (invName= simple_ident LBRACE fma= formula ( DISPLAYNAME displayName= string_literal )? RBRACE SEMI )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4464:6: invName= simple_ident LBRACE fma= formula ( DISPLAYNAME displayName= string_literal )? RBRACE SEMI
			{
			pushFollow(FOLLOW_simple_ident_in_one_invariant13284);
			invName=simple_ident();
			state._fsp--;
			if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_one_invariant13286); if (state.failed) return;
			pushFollow(FOLLOW_formula_in_one_invariant13298);
			fma=formula();
			state._fsp--;
			if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4466:6: ( DISPLAYNAME displayName= string_literal )?
			int alt157=2;
			int LA157_0 = input.LA(1);
			if ( (LA157_0==DISPLAYNAME) ) {
				alt157=1;
			}
			switch (alt157) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4466:7: DISPLAYNAME displayName= string_literal
					{
					match(input,DISPLAYNAME,FOLLOW_DISPLAYNAME_in_one_invariant13306); if (state.failed) return;
					pushFollow(FOLLOW_string_literal_in_one_invariant13312);
					displayName=string_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			       DLSpecFactory dsf = new DLSpecFactory(getServices());
			       try {
			         invs = invs.add(dsf.createDLClassInvariant(invName,
			                                                    displayName,
			                                                    selfVar,
			                                                    fma));
			       } catch(ProofInputException e) {
			         semanticError(e.getMessage());
			       }
			     }
			match(input,RBRACE,FOLLOW_RBRACE_in_one_invariant13323); if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_one_invariant13325); if (state.failed) return;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "one_invariant"



	// $ANTLR start "problem"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4480:1: problem returns [ Term _problem = null ] : profile (pref= preferences ) string= bootClassPath stlist= classPaths string= javaSource decls ( contracts )* ( invariants )* ( ( RULES | AXIOMS ) (choices= option_list[choices] )? LBRACE (s= taclet[choices, axiomMode] SEMI )* RBRACE )* ( ( PROBLEM LBRACE a= formula RBRACE ) | CHOOSECONTRACT (chooseContract= string_literal SEMI )? | PROOFOBLIGATION (proofObligation= string_literal SEMI )? )? ;
	public final Term problem() throws RecognitionException {
		Term _problem =  null;


		String pref =null;
		String string =null;
		ImmutableList<String> stlist =null;
		ImmutableSet<Choice> choices =null;
		Taclet s =null;
		Term a =null;
		String chooseContract =null;
		String proofObligation =null;


		    boolean axiomMode = false;
		    int beginPos = 0;
		    choices=DefaultImmutableSet.<Choice>nil();
		    chooseContract = this.chooseContract;
		    proofObligation = this.proofObligation;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4493:4: ( profile (pref= preferences ) string= bootClassPath stlist= classPaths string= javaSource decls ( contracts )* ( invariants )* ( ( RULES | AXIOMS ) (choices= option_list[choices] )? LBRACE (s= taclet[choices, axiomMode] SEMI )* RBRACE )* ( ( PROBLEM LBRACE a= formula RBRACE ) | CHOOSECONTRACT (chooseContract= string_literal SEMI )? | PROOFOBLIGATION (proofObligation= string_literal SEMI )? )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4495:9: profile (pref= preferences ) string= bootClassPath stlist= classPaths string= javaSource decls ( contracts )* ( invariants )* ( ( RULES | AXIOMS ) (choices= option_list[choices] )? LBRACE (s= taclet[choices, axiomMode] SEMI )* RBRACE )* ( ( PROBLEM LBRACE a= formula RBRACE ) | CHOOSECONTRACT (chooseContract= string_literal SEMI )? | PROOFOBLIGATION (proofObligation= string_literal SEMI )? )?
			{
			pushFollow(FOLLOW_profile_in_problem13360);
			profile();
			state._fsp--;
			if (state.failed) return _problem;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4497:9: (pref= preferences )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4497:10: pref= preferences
			{
			pushFollow(FOLLOW_preferences_in_problem13376);
			pref=preferences();
			state._fsp--;
			if (state.failed) return _problem;
			}

			if ( state.backtracking==0 ) { beginPos = input.index(); }
			pushFollow(FOLLOW_bootClassPath_in_problem13405);
			string=bootClassPath();
			state._fsp--;
			if (state.failed) return _problem;
			pushFollow(FOLLOW_classPaths_in_problem13437);
			stlist=classPaths();
			state._fsp--;
			if (state.failed) return _problem;
			pushFollow(FOLLOW_javaSource_in_problem13452);
			string=javaSource();
			state._fsp--;
			if (state.failed) return _problem;
			pushFollow(FOLLOW_decls_in_problem13463);
			decls();
			state._fsp--;
			if (state.failed) return _problem;
			if ( state.backtracking==0 ) { 
			            if(parse_includes || onlyWith) return null;
			            switchToNormalMode();
			        }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4514:2: ( contracts )*
			loop158:
			while (true) {
				int alt158=2;
				int LA158_0 = input.LA(1);
				if ( (LA158_0==CONTRACTS) ) {
					alt158=1;
				}

				switch (alt158) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4514:4: contracts
					{
					pushFollow(FOLLOW_contracts_in_problem13490);
					contracts();
					state._fsp--;
					if (state.failed) return _problem;
					}
					break;

				default :
					break loop158;
				}
			}

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4515:2: ( invariants )*
			loop159:
			while (true) {
				int alt159=2;
				int LA159_0 = input.LA(1);
				if ( (LA159_0==INVARIANTS) ) {
					alt159=1;
				}

				switch (alt159) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4515:4: invariants
					{
					pushFollow(FOLLOW_invariants_in_problem13498);
					invariants();
					state._fsp--;
					if (state.failed) return _problem;
					}
					break;

				default :
					break loop159;
				}
			}

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4516:9: ( ( RULES | AXIOMS ) (choices= option_list[choices] )? LBRACE (s= taclet[choices, axiomMode] SEMI )* RBRACE )*
			loop163:
			while (true) {
				int alt163=2;
				int LA163_0 = input.LA(1);
				if ( (LA163_0==AXIOMS||LA163_0==RULES) ) {
					alt163=1;
				}

				switch (alt163) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4516:12: ( RULES | AXIOMS ) (choices= option_list[choices] )? LBRACE (s= taclet[choices, axiomMode] SEMI )* RBRACE
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4516:12: ( RULES | AXIOMS )
					int alt160=2;
					int LA160_0 = input.LA(1);
					if ( (LA160_0==RULES) ) {
						alt160=1;
					}
					else if ( (LA160_0==AXIOMS) ) {
						alt160=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return _problem;}
						NoViableAltException nvae =
							new NoViableAltException("", 160, 0, input);
						throw nvae;
					}

					switch (alt160) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4516:14: RULES
							{
							match(input,RULES,FOLLOW_RULES_in_problem13516); if (state.failed) return _problem;
							if ( state.backtracking==0 ) { axiomMode = false;}
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4517:14: AXIOMS
							{
							match(input,AXIOMS,FOLLOW_AXIOMS_in_problem13534); if (state.failed) return _problem;
							if ( state.backtracking==0 ) { axiomMode = true;}
							}
							break;

					}

					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4519:9: (choices= option_list[choices] )?
					int alt161=2;
					int LA161_0 = input.LA(1);
					if ( (LA161_0==LPAREN) ) {
						alt161=1;
					}
					switch (alt161) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4519:11: choices= option_list[choices]
							{
							pushFollow(FOLLOW_option_list_in_problem13565);
							choices=option_list(choices);
							state._fsp--;
							if (state.failed) return _problem;
							}
							break;

					}

					match(input,LBRACE,FOLLOW_LBRACE_in_problem13576); if (state.failed) return _problem;
					if ( state.backtracking==0 ) { 
					                switchToSchemaMode(); 
					            }
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4524:13: (s= taclet[choices, axiomMode] SEMI )*
					loop162:
					while (true) {
						int alt162=2;
						int LA162_0 = input.LA(1);
						if ( (LA162_0==IDENT||LA162_0==LEMMA) ) {
							alt162=1;
						}

						switch (alt162) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4525:17: s= taclet[choices, axiomMode] SEMI
							{
							pushFollow(FOLLOW_taclet_in_problem13627);
							s=taclet(choices, axiomMode);
							state._fsp--;
							if (state.failed) return _problem;
							match(input,SEMI,FOLLOW_SEMI_in_problem13630); if (state.failed) return _problem;
							if ( state.backtracking==0 ) {
							                        if (!skip_taclets) {
							                            final RuleKey key = new RuleKey(s); 
							                            if (taclets.containsKey(key)) {
								                        semanticError
							        	                ("Cannot add taclet \"" + s.name() + 
							                	            "\" to rule base as a taclet with the same "+
							                        	    "name already exists.");
							                            	
							                            } else {
							                            	taclets.put(key, s);
							                            }
							                        }
							                }
							}
							break;

						default :
							break loop162;
						}
					}

					match(input,RBRACE,FOLLOW_RBRACE_in_problem13677); if (state.failed) return _problem;
					if ( state.backtracking==0 ) {choices=DefaultImmutableSet.<Choice>nil();}
					}
					break;

				default :
					break loop163;
				}
			}

			if ( state.backtracking==0 ) { if(input.index() == 0) {
			             problemHeader = "";
			          } else {
			             problemHeader = lexer.toString(beginPos, input.index()-1);
			          } }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4550:9: ( ( PROBLEM LBRACE a= formula RBRACE ) | CHOOSECONTRACT (chooseContract= string_literal SEMI )? | PROOFOBLIGATION (proofObligation= string_literal SEMI )? )?
			int alt166=4;
			switch ( input.LA(1) ) {
				case PROBLEM:
					{
					alt166=1;
					}
					break;
				case CHOOSECONTRACT:
					{
					alt166=2;
					}
					break;
				case PROOFOBLIGATION:
					{
					alt166=3;
					}
					break;
			}
			switch (alt166) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4550:10: ( PROBLEM LBRACE a= formula RBRACE )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4550:10: ( PROBLEM LBRACE a= formula RBRACE )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4550:11: PROBLEM LBRACE a= formula RBRACE
					{
					match(input,PROBLEM,FOLLOW_PROBLEM_in_problem13715); if (state.failed) return _problem;
					match(input,LBRACE,FOLLOW_LBRACE_in_problem13717); if (state.failed) return _problem;
					if ( state.backtracking==0 ) { switchToNormalMode(); }
					pushFollow(FOLLOW_formula_in_problem13754);
					a=formula();
					state._fsp--;
					if (state.failed) return _problem;
					match(input,RBRACE,FOLLOW_RBRACE_in_problem13768); if (state.failed) return _problem;
					}

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4555:12: CHOOSECONTRACT (chooseContract= string_literal SEMI )?
					{
					match(input,CHOOSECONTRACT,FOLLOW_CHOOSECONTRACT_in_problem13796); if (state.failed) return _problem;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4555:27: (chooseContract= string_literal SEMI )?
					int alt164=2;
					int LA164_0 = input.LA(1);
					if ( (LA164_0==STRING_LITERAL) ) {
						alt164=1;
					}
					switch (alt164) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4555:28: chooseContract= string_literal SEMI
							{
							pushFollow(FOLLOW_string_literal_in_problem13801);
							chooseContract=string_literal();
							state._fsp--;
							if (state.failed) return _problem;
							match(input,SEMI,FOLLOW_SEMI_in_problem13803); if (state.failed) return _problem;
							}
							break;

					}

					if ( state.backtracking==0 ) {
						       if(chooseContract == null) {
						           chooseContract = "";
						       }
					           }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4562:12: PROOFOBLIGATION (proofObligation= string_literal SEMI )?
					{
					match(input,PROOFOBLIGATION,FOLLOW_PROOFOBLIGATION_in_problem13845); if (state.failed) return _problem;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4562:29: (proofObligation= string_literal SEMI )?
					int alt165=2;
					int LA165_0 = input.LA(1);
					if ( (LA165_0==STRING_LITERAL) ) {
						alt165=1;
					}
					switch (alt165) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4562:30: proofObligation= string_literal SEMI
							{
							pushFollow(FOLLOW_string_literal_in_problem13851);
							proofObligation=string_literal();
							state._fsp--;
							if (state.failed) return _problem;
							match(input,SEMI,FOLLOW_SEMI_in_problem13853); if (state.failed) return _problem;
							}
							break;

					}

					if ( state.backtracking==0 ) {
					               if(proofObligation == null) {
					                   proofObligation = "";
					               }
					           }
					}
					break;

			}

			}

			if ( state.backtracking==0 ) { 
			    _problem = a; 
			    this.chooseContract = chooseContract; 
			    this.proofObligation = proofObligation; 
			}
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _problem;
	}
	// $ANTLR end "problem"



	// $ANTLR start "bootClassPath"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4571:1: bootClassPath returns [String _boot_class_path = null] : ( BOOTCLASSPATH id= string_literal SEMI )? ;
	public final String bootClassPath() throws RecognitionException {
		String _boot_class_path =  null;


		String id =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4573:3: ( ( BOOTCLASSPATH id= string_literal SEMI )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4574:3: ( BOOTCLASSPATH id= string_literal SEMI )?
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4574:3: ( BOOTCLASSPATH id= string_literal SEMI )?
			int alt167=2;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==BOOTCLASSPATH) ) {
				alt167=1;
			}
			switch (alt167) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4574:5: BOOTCLASSPATH id= string_literal SEMI
					{
					match(input,BOOTCLASSPATH,FOLLOW_BOOTCLASSPATH_in_bootClassPath13906); if (state.failed) return _boot_class_path;
					pushFollow(FOLLOW_string_literal_in_bootClassPath13910);
					id=string_literal();
					state._fsp--;
					if (state.failed) return _boot_class_path;
					match(input,SEMI,FOLLOW_SEMI_in_bootClassPath13912); if (state.failed) return _boot_class_path;
					}
					break;

			}

			}

			if ( state.backtracking==0 ) { _boot_class_path = id; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _boot_class_path;
	}
	// $ANTLR end "bootClassPath"



	// $ANTLR start "classPaths"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4576:1: classPaths returns [ImmutableList<String> ids = ImmutableSLList.<String>nil()] : ( ( CLASSPATH s= string_literal ( COMMA s= string_literal )* SEMI ) | ( NODEFAULTCLASSES SEMI ) )* ;
	public final ImmutableList<String> classPaths() throws RecognitionException {
		ImmutableList<String> ids =  ImmutableSLList.<String>nil();


		String s =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4577:3: ( ( ( CLASSPATH s= string_literal ( COMMA s= string_literal )* SEMI ) | ( NODEFAULTCLASSES SEMI ) )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4578:3: ( ( CLASSPATH s= string_literal ( COMMA s= string_literal )* SEMI ) | ( NODEFAULTCLASSES SEMI ) )*
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4578:3: ( ( CLASSPATH s= string_literal ( COMMA s= string_literal )* SEMI ) | ( NODEFAULTCLASSES SEMI ) )*
			loop169:
			while (true) {
				int alt169=3;
				int LA169_0 = input.LA(1);
				if ( (LA169_0==CLASSPATH) ) {
					alt169=1;
				}
				else if ( (LA169_0==NODEFAULTCLASSES) ) {
					alt169=2;
				}

				switch (alt169) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4578:5: ( CLASSPATH s= string_literal ( COMMA s= string_literal )* SEMI )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4578:5: ( CLASSPATH s= string_literal ( COMMA s= string_literal )* SEMI )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4579:5: CLASSPATH s= string_literal ( COMMA s= string_literal )* SEMI
					{
					match(input,CLASSPATH,FOLLOW_CLASSPATH_in_classPaths13940); if (state.failed) return ids;
					pushFollow(FOLLOW_string_literal_in_classPaths13949);
					s=string_literal();
					state._fsp--;
					if (state.failed) return ids;
					if ( state.backtracking==0 ) {
					      ids = ids.append(s);
					    }
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4584:5: ( COMMA s= string_literal )*
					loop168:
					while (true) {
						int alt168=2;
						int LA168_0 = input.LA(1);
						if ( (LA168_0==COMMA) ) {
							alt168=1;
						}

						switch (alt168) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4584:6: COMMA s= string_literal
							{
							match(input,COMMA,FOLLOW_COMMA_in_classPaths13963); if (state.failed) return ids;
							pushFollow(FOLLOW_string_literal_in_classPaths13967);
							s=string_literal();
							state._fsp--;
							if (state.failed) return ids;
							if ( state.backtracking==0 ) {
							      ids = ids.append(s);
							    }
							}
							break;

						default :
							break loop168;
						}
					}

					match(input,SEMI,FOLLOW_SEMI_in_classPaths13991); if (state.failed) return ids;
					}

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4593:5: ( NODEFAULTCLASSES SEMI )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4593:5: ( NODEFAULTCLASSES SEMI )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4594:5: NODEFAULTCLASSES SEMI
					{
					match(input,NODEFAULTCLASSES,FOLLOW_NODEFAULTCLASSES_in_classPaths14014); if (state.failed) return ids;
					if ( state.backtracking==0 ) {
					      throw new NoViableAltException("\\noDefaultClasses is no longer supported. Use \\bootclasspath. See docs/README.classpath", -1, -1, input);
					    }
					match(input,SEMI,FOLLOW_SEMI_in_classPaths14022); if (state.failed) return ids;
					}

					}
					break;

				default :
					break loop169;
				}
			}

			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return ids;
	}
	// $ANTLR end "classPaths"



	// $ANTLR start "javaSource"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4602:1: javaSource returns [String _java_source = null] : ( JAVASOURCE result= oneJavaSource SEMI )? ;
	public final String javaSource() throws RecognitionException {
		String _java_source =  null;


		String result =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4604:4: ( ( JAVASOURCE result= oneJavaSource SEMI )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4605:4: ( JAVASOURCE result= oneJavaSource SEMI )?
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4605:4: ( JAVASOURCE result= oneJavaSource SEMI )?
			int alt170=2;
			int LA170_0 = input.LA(1);
			if ( (LA170_0==JAVASOURCE) ) {
				alt170=1;
			}
			switch (alt170) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4605:5: JAVASOURCE result= oneJavaSource SEMI
					{
					match(input,JAVASOURCE,FOLLOW_JAVASOURCE_in_javaSource14057); if (state.failed) return _java_source;
					pushFollow(FOLLOW_oneJavaSource_in_javaSource14070);
					result=oneJavaSource();
					state._fsp--;
					if (state.failed) return _java_source;
					match(input,SEMI,FOLLOW_SEMI_in_javaSource14076); if (state.failed) return _java_source;
					}
					break;

			}

			}

			if ( state.backtracking==0 ) { _java_source = result; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _java_source;
	}
	// $ANTLR end "javaSource"



	// $ANTLR start "oneJavaSource"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4611:1: oneJavaSource returns [String s = null] : (l= string_literal | SLASH | COLON | BACKSLASH )+ ;
	public final String oneJavaSource() throws RecognitionException {
		String s =  null;


		String l =null;


		  StringBuffer b=new StringBuffer();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4615:3: ( (l= string_literal | SLASH | COLON | BACKSLASH )+ )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4616:3: (l= string_literal | SLASH | COLON | BACKSLASH )+
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4616:3: (l= string_literal | SLASH | COLON | BACKSLASH )+
			int cnt171=0;
			loop171:
			while (true) {
				int alt171=5;
				switch ( input.LA(1) ) {
				case STRING_LITERAL:
					{
					alt171=1;
					}
					break;
				case SLASH:
					{
					alt171=2;
					}
					break;
				case COLON:
					{
					alt171=3;
					}
					break;
				case BACKSLASH:
					{
					alt171=4;
					}
					break;
				}
				switch (alt171) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4616:6: l= string_literal
					{
					pushFollow(FOLLOW_string_literal_in_oneJavaSource14109);
					l=string_literal();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {
					       b.append(l);
					     }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4620:6: SLASH
					{
					match(input,SLASH,FOLLOW_SLASH_in_oneJavaSource14124); if (state.failed) return s;
					if ( state.backtracking==0 ) { b.append("/"); }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4622:6: COLON
					{
					match(input,COLON,FOLLOW_COLON_in_oneJavaSource14139); if (state.failed) return s;
					if ( state.backtracking==0 ) {b.append(":");}
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4624:6: BACKSLASH
					{
					match(input,BACKSLASH,FOLLOW_BACKSLASH_in_oneJavaSource14152); if (state.failed) return s;
					if ( state.backtracking==0 ) {b.append("\\");}
					}
					break;

				default :
					if ( cnt171 >= 1 ) break loop171;
					if (state.backtracking>0) {state.failed=true; return s;}
					EarlyExitException eee = new EarlyExitException(171, input);
					throw eee;
				}
				cnt171++;
			}

			if ( state.backtracking==0 ) {
			    s = b.toString();
			  }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "oneJavaSource"



	// $ANTLR start "profile"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4631:1: profile : ( PROFILE profileName= string_literal SEMI )? ;
	public final void profile() throws RecognitionException {
		String profileName =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4631:8: ( ( PROFILE profileName= string_literal SEMI )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4632:9: ( PROFILE profileName= string_literal SEMI )?
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4632:9: ( PROFILE profileName= string_literal SEMI )?
			int alt172=2;
			int LA172_0 = input.LA(1);
			if ( (LA172_0==PROFILE) ) {
				alt172=1;
			}
			switch (alt172) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4632:10: PROFILE profileName= string_literal SEMI
					{
					match(input,PROFILE,FOLLOW_PROFILE_in_profile14179); if (state.failed) return;
					pushFollow(FOLLOW_string_literal_in_profile14183);
					profileName=string_literal();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { this.profileName = profileName; }
					match(input,SEMI,FOLLOW_SEMI_in_profile14187); if (state.failed) return;
					}
					break;

			}

			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "profile"



	// $ANTLR start "preferences"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4635:1: preferences returns [String _preferences = null] : ( KEYSETTINGS LBRACE (s= string_literal )? RBRACE )? ;
	public final String preferences() throws RecognitionException {
		String _preferences =  null;


		String s =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4636:28: ( ( KEYSETTINGS LBRACE (s= string_literal )? RBRACE )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4637:2: ( KEYSETTINGS LBRACE (s= string_literal )? RBRACE )?
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4637:2: ( KEYSETTINGS LBRACE (s= string_literal )? RBRACE )?
			int alt174=2;
			int LA174_0 = input.LA(1);
			if ( (LA174_0==KEYSETTINGS) ) {
				alt174=1;
			}
			switch (alt174) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4637:4: KEYSETTINGS LBRACE (s= string_literal )? RBRACE
					{
					match(input,KEYSETTINGS,FOLLOW_KEYSETTINGS_in_preferences14209); if (state.failed) return _preferences;
					match(input,LBRACE,FOLLOW_LBRACE_in_preferences14211); if (state.failed) return _preferences;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4638:3: (s= string_literal )?
					int alt173=2;
					int LA173_0 = input.LA(1);
					if ( (LA173_0==STRING_LITERAL) ) {
						alt173=1;
					}
					switch (alt173) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4638:4: s= string_literal
							{
							pushFollow(FOLLOW_string_literal_in_preferences14220);
							s=string_literal();
							state._fsp--;
							if (state.failed) return _preferences;
							}
							break;

					}

					match(input,RBRACE,FOLLOW_RBRACE_in_preferences14226); if (state.failed) return _preferences;
					}
					break;

			}

			}

			if ( state.backtracking==0 ) { _preferences = s; }
		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return _preferences;
	}
	// $ANTLR end "preferences"



	// $ANTLR start "proofScript"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4643:1: proofScript returns [ Triple<String, Integer, Integer> locatedString = null ] : PROOFSCRIPT ps= STRING_LITERAL ;
	public final Triple<String, Integer, Integer> proofScript() throws RecognitionException {
		Triple<String, Integer, Integer> locatedString =  null;


		Token ps=null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4644:5: ( PROOFSCRIPT ps= STRING_LITERAL )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4645:5: PROOFSCRIPT ps= STRING_LITERAL
			{
			match(input,PROOFSCRIPT,FOLLOW_PROOFSCRIPT_in_proofScript14248); if (state.failed) return locatedString;
			ps=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_proofScript14254); if (state.failed) return locatedString;
			if ( state.backtracking==0 ) { int line = ps.getLine();
			        // +1 for antlr starting at 0
			        // +1 for removing the leading "
			        int col = ps.getCharPositionInLine() + 2;
			        String content = ps.getText().substring(1, ps.getText().length()-1);
			        locatedString = new Triple<String, Integer, Integer>(content, line, col);
			      }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return locatedString;
	}
	// $ANTLR end "proofScript"



	// $ANTLR start "proof"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4655:1: proof[IProofFileParser prl] : ( PROOF proofBody[prl] )? ;
	public final void proof(IProofFileParser prl) throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4655:30: ( ( PROOF proofBody[prl] )? )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4656:9: ( PROOF proofBody[prl] )?
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4656:9: ( PROOF proofBody[prl] )?
			int alt175=2;
			int LA175_0 = input.LA(1);
			if ( (LA175_0==PROOF) ) {
				alt175=1;
			}
			switch (alt175) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4656:11: PROOF proofBody[prl]
					{
					match(input,PROOF,FOLLOW_PROOF_in_proof14287); if (state.failed) return;
					pushFollow(FOLLOW_proofBody_in_proof14289);
					proofBody(prl);
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "proof"



	// $ANTLR start "proofBody"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4660:1: proofBody[IProofFileParser prl] : LBRACE ( pseudosexpr[prl] )+ RBRACE ;
	public final void proofBody(IProofFileParser prl) throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4660:34: ( LBRACE ( pseudosexpr[prl] )+ RBRACE )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4661:9: LBRACE ( pseudosexpr[prl] )+ RBRACE
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_proofBody14317); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4662:13: ( pseudosexpr[prl] )+
			int cnt176=0;
			loop176:
			while (true) {
				int alt176=2;
				int LA176_0 = input.LA(1);
				if ( (LA176_0==LPAREN) ) {
					alt176=1;
				}

				switch (alt176) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4662:15: pseudosexpr[prl]
					{
					pushFollow(FOLLOW_pseudosexpr_in_proofBody14333);
					pseudosexpr(prl);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt176 >= 1 ) break loop176;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(176, input);
					throw eee;
				}
				cnt176++;
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_proofBody14348); if (state.failed) return;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "proofBody"



	// $ANTLR start "pseudosexpr"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4667:1: pseudosexpr[IProofFileParser prl] : LPAREN (proofElementId= expreid (str= string_literal )? ( pseudosexpr[prl] )* )? RPAREN ;
	public final void pseudosexpr(IProofFileParser prl) throws RecognitionException {
		IProofFileParser.ProofElementID proofElementId =null;
		String str =null;

		 str = ""; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4667:55: ( LPAREN (proofElementId= expreid (str= string_literal )? ( pseudosexpr[prl] )* )? RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4668:9: LPAREN (proofElementId= expreid (str= string_literal )? ( pseudosexpr[prl] )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_pseudosexpr14376); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4668:16: (proofElementId= expreid (str= string_literal )? ( pseudosexpr[prl] )* )?
			int alt179=2;
			int LA179_0 = input.LA(1);
			if ( (LA179_0==IDENT) ) {
				alt179=1;
			}
			switch (alt179) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4668:17: proofElementId= expreid (str= string_literal )? ( pseudosexpr[prl] )*
					{
					pushFollow(FOLLOW_expreid_in_pseudosexpr14381);
					proofElementId=expreid();
					state._fsp--;
					if (state.failed) return;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4669:13: (str= string_literal )?
					int alt177=2;
					int LA177_0 = input.LA(1);
					if ( (LA177_0==STRING_LITERAL) ) {
						alt177=1;
					}
					switch (alt177) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4669:14: str= string_literal
							{
							pushFollow(FOLLOW_string_literal_in_pseudosexpr14400);
							str=string_literal();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					if ( state.backtracking==0 ) { prl.beginExpr(proofElementId,str); }
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4671:13: ( pseudosexpr[prl] )*
					loop178:
					while (true) {
						int alt178=2;
						int LA178_0 = input.LA(1);
						if ( (LA178_0==LPAREN) ) {
							alt178=1;
						}

						switch (alt178) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4671:15: pseudosexpr[prl]
							{
							pushFollow(FOLLOW_pseudosexpr_in_pseudosexpr14438);
							pseudosexpr(prl);
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop178;
						}
					}

					}
					break;

			}

			if ( state.backtracking==0 ) { prl.endExpr(proofElementId, stringLiteralLine); }
			match(input,RPAREN,FOLLOW_RPAREN_in_pseudosexpr14473); if (state.failed) return;
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "pseudosexpr"



	// $ANTLR start "expreid"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4676:1: expreid returns [ IProofFileParser.ProofElementID proofElementId = null ] : id= simple_ident ;
	public final IProofFileParser.ProofElementID expreid() throws RecognitionException {
		IProofFileParser.ProofElementID proofElementId =  null;


		String id =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4677:4: (id= simple_ident )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:4678:4: id= simple_ident
			{
			pushFollow(FOLLOW_simple_ident_in_expreid14500);
			id=simple_ident();
			state._fsp--;
			if (state.failed) return proofElementId;
			if ( state.backtracking==0 ) {
			      proofElementId = prooflabel2tag.get(id);
			   }
			}

		}

		    catch(RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return proofElementId;
	}
	// $ANTLR end "expreid"

	// $ANTLR start synpred1_KeYParser
	public final void synpred1_KeYParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2453:5: ( sort_name DOUBLECOLON )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2453:6: sort_name DOUBLECOLON
		{
		pushFollow(FOLLOW_sort_name_in_synpred1_KeYParser4111);
		sort_name();
		state._fsp--;
		if (state.failed) return;
		match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_synpred1_KeYParser4113); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_KeYParser

	// $ANTLR start synpred2_KeYParser
	public final void synpred2_KeYParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2605:12: ( EQUALS | NOT_EQUALS )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:
		{
		if ( input.LA(1)==EQUALS||input.LA(1)==NOT_EQUALS ) {
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
	// $ANTLR end synpred2_KeYParser

	// $ANTLR start synpred3_KeYParser
	public final void synpred3_KeYParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2690:28: ( relation_op )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2690:29: relation_op
		{
		pushFollow(FOLLOW_relation_op_in_synpred3_KeYParser5340);
		relation_op();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_KeYParser

	// $ANTLR start synpred4_KeYParser
	public final void synpred4_KeYParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2703:30: ( weak_arith_op )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2703:31: weak_arith_op
		{
		pushFollow(FOLLOW_weak_arith_op_in_synpred4_KeYParser5401);
		weak_arith_op();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_KeYParser

	// $ANTLR start synpred5_KeYParser
	public final void synpred5_KeYParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2715:18: ( strong_arith_op )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2715:19: strong_arith_op
		{
		pushFollow(FOLLOW_strong_arith_op_in_synpred5_KeYParser5461);
		strong_arith_op();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred5_KeYParser

	// $ANTLR start synpred6_KeYParser
	public final void synpred6_KeYParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2917:7: ( MINUS ~ NUM_LITERAL )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2917:8: MINUS ~ NUM_LITERAL
		{
		match(input,MINUS,FOLLOW_MINUS_in_synpred6_KeYParser6024); if (state.failed) return;
		if ( (input.LA(1) >= ABSTRACT && input.LA(1) <= NOT_EQUALS)||(input.LA(1) >= ONEOF && input.LA(1) <= WS) ) {
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
	// $ANTLR end synpred6_KeYParser

	// $ANTLR start synpred7_KeYParser
	public final void synpred7_KeYParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2927:7: ( LPAREN any_sortId_check[false] RPAREN term110 )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:2927:8: LPAREN any_sortId_check[false] RPAREN term110
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred7_KeYParser6066); if (state.failed) return;
		pushFollow(FOLLOW_any_sortId_check_in_synpred7_KeYParser6068);
		any_sortId_check(false);
		state._fsp--;
		if (state.failed) return;
		match(input,RPAREN,FOLLOW_RPAREN_in_synpred7_KeYParser6071); if (state.failed) return;
		pushFollow(FOLLOW_term110_in_synpred7_KeYParser6073);
		term110();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred7_KeYParser

	// $ANTLR start synpred8_KeYParser
	public final void synpred8_KeYParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3027:7: ( equivalence_term ASSIGN )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3027:8: equivalence_term ASSIGN
		{
		pushFollow(FOLLOW_equivalence_term_in_synpred8_KeYParser6620);
		equivalence_term();
		state._fsp--;
		if (state.failed) return;
		match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred8_KeYParser6622); if (state.failed) return;
		}

	}
	// $ANTLR end synpred8_KeYParser

	// $ANTLR start synpred9_KeYParser
	public final void synpred9_KeYParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3071:11: ( DOTRANGE )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3071:12: DOTRANGE
		{
		match(input,DOTRANGE,FOLLOW_DOTRANGE_in_synpred9_KeYParser6767); if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_KeYParser

	// $ANTLR start synpred10_KeYParser
	public final void synpred10_KeYParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3286:7: ( LBRACE SUBST )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3286:8: LBRACE SUBST
		{
		match(input,LBRACE,FOLLOW_LBRACE_in_synpred10_KeYParser7708); if (state.failed) return;
		match(input,SUBST,FOLLOW_SUBST_in_synpred10_KeYParser7710); if (state.failed) return;
		}

	}
	// $ANTLR end synpred10_KeYParser

	// $ANTLR start synpred11_KeYParser
	public final void synpred11_KeYParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3287:9: ( LBRACE ( LPAREN | RBRACE ) )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3287:10: LBRACE ( LPAREN | RBRACE )
		{
		match(input,LBRACE,FOLLOW_LBRACE_in_synpred11_KeYParser7730); if (state.failed) return;
		if ( input.LA(1)==LPAREN||input.LA(1)==RBRACE ) {
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
	// $ANTLR end synpred11_KeYParser

	// $ANTLR start synpred12_KeYParser
	public final void synpred12_KeYParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3497:9: ( ( MINUS )? NUM_LITERAL )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3497:10: ( MINUS )? NUM_LITERAL
		{
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3497:10: ( MINUS )?
		int alt180=2;
		int LA180_0 = input.LA(1);
		if ( (LA180_0==MINUS) ) {
			alt180=1;
		}
		switch (alt180) {
			case 1 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3497:11: MINUS
				{
				match(input,MINUS,FOLLOW_MINUS_in_synpred12_KeYParser8611); if (state.failed) return;
				}
				break;

		}

		match(input,NUM_LITERAL,FOLLOW_NUM_LITERAL_in_synpred12_KeYParser8615); if (state.failed) return;
		}

	}
	// $ANTLR end synpred12_KeYParser

	// $ANTLR start synpred13_KeYParser
	public final void synpred13_KeYParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3501:11: (~ LBRACE | LBRACE bound_variables )
		int alt181=2;
		int LA181_0 = input.LA(1);
		if ( ((LA181_0 >= ABSTRACT && LA181_0 <= KEYSETTINGS)||(LA181_0 >= LBRACKET && LA181_0 <= WS)) ) {
			alt181=1;
		}
		else if ( (LA181_0==LBRACE) ) {
			alt181=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 181, 0, input);
			throw nvae;
		}

		switch (alt181) {
			case 1 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3501:12: ~ LBRACE
				{
				if ( (input.LA(1) >= ABSTRACT && input.LA(1) <= KEYSETTINGS)||(input.LA(1) >= LBRACKET && input.LA(1) <= WS) ) {
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
				break;
			case 2 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3501:22: LBRACE bound_variables
				{
				match(input,LBRACE,FOLLOW_LBRACE_in_synpred13_KeYParser8694); if (state.failed) return;
				pushFollow(FOLLOW_bound_variables_in_synpred13_KeYParser8696);
				bound_variables();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
	}
	// $ANTLR end synpred13_KeYParser

	// $ANTLR start synpred14_KeYParser
	public final void synpred14_KeYParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3657:9: ( formula RBRACE )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYParser.g:3657:10: formula RBRACE
		{
		pushFollow(FOLLOW_formula_in_synpred14_KeYParser9238);
		formula();
		state._fsp--;
		if (state.failed) return;
		match(input,RBRACE,FOLLOW_RBRACE_in_synpred14_KeYParser9240); if (state.failed) return;
		}

	}
	// $ANTLR end synpred14_KeYParser

	// Delegated rules

	public final boolean synpred7_KeYParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_KeYParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_KeYParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_KeYParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_KeYParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_KeYParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_KeYParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_KeYParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_KeYParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_KeYParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_KeYParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_KeYParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_KeYParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_KeYParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred11_KeYParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred11_KeYParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred13_KeYParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred13_KeYParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred14_KeYParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred14_KeYParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_KeYParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_KeYParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred12_KeYParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_KeYParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_KeYParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_KeYParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_KeYParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_KeYParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_formula_in_top87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_one_include_statement_in_decls110 = new BitSet(new long[]{0x0200000000000002L,0x2000000000001804L,0x2000100100800104L});
	public static final BitSet FOLLOW_options_choice_in_decls125 = new BitSet(new long[]{0x0200000000000002L,0x2000000000000004L,0x0000100100800104L});
	public static final BitSet FOLLOW_option_decls_in_decls155 = new BitSet(new long[]{0x0200000000000002L,0x2000000000000004L,0x0000100100800104L});
	public static final BitSet FOLLOW_sort_decls_in_decls186 = new BitSet(new long[]{0x0200000000000002L,0x2000000000000004L,0x0000100100800104L});
	public static final BitSet FOLLOW_prog_var_decls_in_decls213 = new BitSet(new long[]{0x0200000000000002L,0x2000000000000004L,0x0000100100800104L});
	public static final BitSet FOLLOW_schema_var_decls_in_decls240 = new BitSet(new long[]{0x0200000000000002L,0x2000000000000004L,0x0000100100800104L});
	public static final BitSet FOLLOW_pred_decls_in_decls264 = new BitSet(new long[]{0x0200000000000002L,0x2000000000000004L,0x0000100100800104L});
	public static final BitSet FOLLOW_func_decls_in_decls288 = new BitSet(new long[]{0x0200000000000002L,0x2000000000000004L,0x0000100100800104L});
	public static final BitSet FOLLOW_transform_decls_in_decls312 = new BitSet(new long[]{0x0200000000000002L,0x2000000000000004L,0x0000100100800104L});
	public static final BitSet FOLLOW_ruleset_decls_in_decls339 = new BitSet(new long[]{0x0200000000000002L,0x2000000000000004L,0x0000100100800104L});
	public static final BitSet FOLLOW_INCLUDE_in_one_include_statement373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000002000000000L});
	public static final BitSet FOLLOW_INCLUDELDTS_in_one_include_statement378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000002000000000L});
	public static final BitSet FOLLOW_one_include_in_one_include_statement388 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_one_include_statement392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000002000000000L});
	public static final BitSet FOLLOW_one_include_in_one_include_statement394 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_one_include_statement399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_one_include421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_literal_in_one_include438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITHOPTIONS_in_options_choice457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_activated_choice_in_options_choice459 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_options_choice462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_activated_choice_in_options_choice464 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_options_choice468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_activated_choice491 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_COLON_in_activated_choice493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_IDENT_in_activated_choice497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPTIONSDECL_in_option_decls528 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_option_decls530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000004000L});
	public static final BitSet FOLLOW_choice_in_option_decls533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_option_decls535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_option_decls539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_choice566 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_COLON_in_choice571 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_choice573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_choice_option_in_choice575 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_COMMA_in_choice579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_choice_option_in_choice581 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_choice586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_choice_option625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SORTS_in_sort_decls647 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_sort_decls649 = new BitSet(new long[]{0x0400000000000010L,0x0000000000000040L,0x0000000000005000L});
	public static final BitSet FOLLOW_one_sort_decl_in_sort_decls665 = new BitSet(new long[]{0x0400000000000010L,0x0000000000000040L,0x0000000000005000L});
	public static final BitSet FOLLOW_RBRACE_in_sort_decls674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERIC_in_one_sort_decl714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_comma_list_in_one_sort_decl722 = new BitSet(new long[]{0x0002000000000000L,0x1000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ONEOF_in_one_sort_decl738 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_oneof_sorts_in_one_sort_decl744 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_EXTENDS_in_one_sort_decl764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_extends_sorts_in_one_sort_decl770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_PROXY_in_one_sort_decl785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_comma_list_in_one_sort_decl793 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_EXTENDS_in_one_sort_decl809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_extends_sorts_in_one_sort_decl815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ABSTRACT_in_one_sort_decl831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_dots_in_one_sort_decl851 = new BitSet(new long[]{0x0002000001000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_EXTENDS_in_one_sort_decl882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_extends_sorts_in_one_sort_decl888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_one_sort_decl909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_comma_list_in_one_sort_decl916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_one_sort_decl945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_ident_in_simple_ident_dots967 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_DOT_in_simple_ident_dots978 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000040L});
	public static final BitSet FOLLOW_simple_ident_in_simple_ident_dots988 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_NUM_LITERAL_in_simple_ident_dots994 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_any_sortId_check_in_extends_sorts1040 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_COMMA_in_extends_sorts1067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_any_sortId_check_in_extends_sorts1073 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_LBRACE_in_oneof_sorts1124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_sortId_check_in_oneof_sorts1138 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_COMMA_in_oneof_sorts1165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_sortId_check_in_oneof_sorts1171 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_oneof_sorts1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_ident_dots_in_keyjavatype1225 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_EMPTYBRACKETS_in_keyjavatype1228 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_PROGRAMVARIABLES_in_prog_var_decls1275 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_prog_var_decls1285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000004000L});
	public static final BitSet FOLLOW_keyjavatype_in_prog_var_decls1314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_comma_list_in_prog_var_decls1332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_prog_var_decls1360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_prog_var_decls1382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_string_literal1409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_simple_ident1439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_ident_in_simple_ident_comma_list1467 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_COMMA_in_simple_ident_comma_list1475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_in_simple_ident_comma_list1481 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_SCHEMAVARIABLES_in_schema_var_decls1504 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_schema_var_decls1506 = new BitSet(new long[]{0x0080000000000000L,0x0002000000000000L,0x0C02030030004080L});
	public static final BitSet FOLLOW_one_schema_var_decl_in_schema_var_decls1518 = new BitSet(new long[]{0x0080000000000000L,0x0002000000000000L,0x0C02030030004080L});
	public static final BitSet FOLLOW_RBRACE_in_schema_var_decls1531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MODALOPERATOR_in_one_schema_var_decl1559 = new BitSet(new long[]{0x0000000000000000L,0x0000080200000000L});
	public static final BitSet FOLLOW_one_schema_modal_op_decl_in_one_schema_var_decl1561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_one_schema_var_decl1563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROGRAM_in_one_schema_var_decl1583 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000040L});
	public static final BitSet FOLLOW_schema_modifiers_in_one_schema_var_decl1597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_in_one_schema_var_decl1612 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000040L});
	public static final BitSet FOLLOW_LBRACKET_in_one_schema_var_decl1616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_in_one_schema_var_decl1622 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_EQUALS_in_one_schema_var_decl1624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_dots_in_one_schema_var_decl1630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_one_schema_var_decl1632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_comma_list_in_one_schema_var_decl1647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_FORMULA_in_one_schema_var_decl1653 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000040L});
	public static final BitSet FOLLOW_schema_modifiers_in_one_schema_var_decl1667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_comma_list_in_one_schema_var_decl1688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_TERMLABEL_in_one_schema_var_decl1695 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000040L});
	public static final BitSet FOLLOW_schema_modifiers_in_one_schema_var_decl1715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_comma_list_in_one_schema_var_decl1730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_UPDATE_in_one_schema_var_decl1736 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000040L});
	public static final BitSet FOLLOW_schema_modifiers_in_one_schema_var_decl1750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_comma_list_in_one_schema_var_decl1771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SKOLEMFORMULA_in_one_schema_var_decl1778 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000040L});
	public static final BitSet FOLLOW_schema_modifiers_in_one_schema_var_decl1799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_comma_list_in_one_schema_var_decl1824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_TERM_in_one_schema_var_decl1837 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000040L});
	public static final BitSet FOLLOW_schema_modifiers_in_one_schema_var_decl1861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_set_in_one_schema_var_decl1878 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000040L});
	public static final BitSet FOLLOW_schema_modifiers_in_one_schema_var_decl1919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_SKOLEMTERM_in_one_schema_var_decl1936 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000040L});
	public static final BitSet FOLLOW_schema_modifiers_in_one_schema_var_decl1972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_any_sortId_check_in_one_schema_var_decl1999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_comma_list_in_one_schema_var_decl2010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_one_schema_var_decl2017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_schema_modifiers2049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_comma_list_in_schema_modifiers2063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_schema_modifiers2082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_one_schema_modal_op_decl2123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_any_sortId_check_in_one_schema_modal_op_decl2129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_one_schema_modal_op_decl2134 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_one_schema_modal_op_decl2147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_comma_list_in_one_schema_modal_op_decl2153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_one_schema_modal_op_decl2155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_in_one_schema_modal_op_decl2161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcpred_name_in_pred_decl2193 = new BitSet(new long[]{0x0000000000000000L,0x0000080200000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_where_to_bind_in_pred_decl2223 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_arg_sorts_in_pred_decl2267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_pred_decl2288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PREDICATES_in_pred_decls2314 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_pred_decls2325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000004000L});
	public static final BitSet FOLLOW_pred_decl_in_pred_decls2349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_pred_decls2371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_ident_in_location_ident2405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIQUE_in_func_decl2459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_any_sortId_check_in_func_decl2495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_funcpred_name_in_func_decl2519 = new BitSet(new long[]{0x0000000000000000L,0x0000080200000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_where_to_bind_in_func_decl2543 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_arg_sorts_in_func_decl2570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_func_decl2608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTIONS_in_func_decls2633 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_func_decls2644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0001000000004000L});
	public static final BitSet FOLLOW_func_decl_in_func_decls2669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0001000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_func_decls2691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_arg_sorts_or_formula2741 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_sortId_check_in_arg_sorts_or_formula2762 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_FORMULA_in_arg_sorts_or_formula2781 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_arg_sorts_or_formula2818 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_sortId_check_in_arg_sorts_or_formula2826 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_FORMULA_in_arg_sorts_or_formula2855 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_arg_sorts_or_formula2889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_sortId_check_in_transform_decl2953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_FORMULA_in_transform_decl2966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_funcpred_name_in_transform_decl2993 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_arg_sorts_or_formula_in_transform_decl3008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_transform_decl3030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRANSFORMERS_in_transform_decls3055 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_transform_decls3065 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000040L,0x0000000000004000L});
	public static final BitSet FOLLOW_transform_decl_in_transform_decls3089 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000040L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_transform_decls3111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMPTYBRACKETS_in_arrayopid3144 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_arrayopid3154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_keyjavatype_in_arrayopid3168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_arrayopid3178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_arg_sorts3227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_sortId_check_in_arg_sorts3245 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_arg_sorts3280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_sortId_check_in_arg_sorts3286 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_arg_sorts3319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_where_to_bind3382 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_TRUE_in_where_to_bind3408 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_FALSE_in_where_to_bind3414 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_COMMA_in_where_to_bind3453 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_TRUE_in_where_to_bind3483 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_FALSE_in_where_to_bind3489 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_where_to_bind3525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEURISTICSDECL_in_ruleset_decls3563 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_ruleset_decls3573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000004000L});
	public static final BitSet FOLLOW_simple_ident_in_ruleset_decls3601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_ruleset_decls3603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_ruleset_decls3639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sortId_check_in_sortId3676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sortId_check_help_in_sortId_check3744 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_array_decls_in_sortId_check3759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_sortId_check_help_in_any_sortId_check3819 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_array_decls_in_any_sortId_check3834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_sortId_check_help_in_sortId_check_help3884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_sort_name_in_any_sortId_check_help3936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMPTYBRACKETS_in_array_decls3996 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_IDENT_in_id_declaration4046 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_COLON_in_id_declaration4058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_sortId_check_in_id_declaration4064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sort_name_in_funcpred_name4123 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_DOUBLECOLON_in_funcpred_name4134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_in_funcpred_name4140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_ident_in_funcpred_name4159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_ident_dots_in_simple_sort_name4193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_sort_name_in_sort_name4235 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_EMPTYBRACKETS_in_sort_name4248 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_term_in_formula4291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_elementary_update_term_in_term4338 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
	public static final BitSet FOLLOW_PARALLEL_in_term4361 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_elementary_update_term_in_term4365 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
	public static final BitSet FOLLOW_equivalence_term_in_elementary_update_term4464 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ASSIGN_in_elementary_update_term4489 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_equivalence_term_in_elementary_update_term4493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_implication_term_in_equivalence_term4562 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_EQV_in_equivalence_term4574 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_implication_term_in_equivalence_term4578 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_disjunction_term_in_implication_term4636 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_IMP_in_implication_term4648 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_implication_term_in_implication_term4652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conjunction_term_in_disjunction_term4711 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
	public static final BitSet FOLLOW_OR_in_disjunction_term4723 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_conjunction_term_in_disjunction_term4727 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
	public static final BitSet FOLLOW_term60_in_conjunction_term4786 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_AND_in_conjunction_term4798 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term60_in_conjunction_term4802 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_unary_formula_in_term604882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_equality_term_in_term604896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unary_formula4942 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term60_in_unary_formula4949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantifierterm_in_unary_formula4963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modality_dl_term_in_unary_formula4978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicTermReEntry_in_equality_term5033 = new BitSet(new long[]{0x0000100000000002L,0x0400000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_equality_term5074 = new BitSet(new long[]{0x0004000000082000L,0x08002802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_NOT_EQUALS_in_equality_term5078 = new BitSet(new long[]{0x0004000000082000L,0x08002802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_logicTermReEntry_in_equality_term5087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESS_in_relation_op5142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSEQUAL_in_relation_op5158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_in_relation_op5169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATEREQUAL_in_relation_op5182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_weak_arith_op5213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_weak_arith_op5229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_strong_arith_op5267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SLASH_in_strong_arith_op5283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERCENT_in_strong_arith_op5298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_weak_arith_op_term_in_logicTermReEntry5336 = new BitSet(new long[]{0x1800000000000002L,0x0000003000000000L});
	public static final BitSet FOLLOW_relation_op_in_logicTermReEntry5349 = new BitSet(new long[]{0x0004000000082000L,0x08002802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_weak_arith_op_term_in_logicTermReEntry5353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_strong_arith_op_term_in_weak_arith_op_term5397 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_weak_arith_op_in_weak_arith_op_term5409 = new BitSet(new long[]{0x0004000000082000L,0x08002802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_strong_arith_op_term_in_weak_arith_op_term5413 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_term110_in_strong_arith_op_term5456 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000240000001L});
	public static final BitSet FOLLOW_strong_arith_op_in_strong_arith_op_term5470 = new BitSet(new long[]{0x0004000000082000L,0x08002802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term110_in_strong_arith_op_term5474 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000240000001L});
	public static final BitSet FOLLOW_braces_term_in_term1105543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessterm_in_term1105563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_staticAttributeOrQueryReference5634 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_EMPTYBRACKETS_in_staticAttributeOrQueryReference5655 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_staticAttributeOrQueryReference_in_static_attribute_suffix5719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_attribute_or_query_suffix5800 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000040L,0x0000000200000000L});
	public static final BitSet FOLLOW_STAR_in_attribute_or_query_suffix5804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attrid_in_attribute_or_query_suffix5820 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_query_suffix_in_attribute_or_query_suffix5831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_ident_in_attrid5893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_attrid5911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_sort_name_in_attrid5917 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_DOUBLECOLON_in_attrid5919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_in_attrid5925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_attrid5927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argument_list_in_query_suffix5977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_accessterm6032 = new BitSet(new long[]{0x0004000000082000L,0x08002802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term110_in_accessterm6038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_accessterm6086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_any_sortId_check_in_accessterm6092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_accessterm6095 = new BitSet(new long[]{0x0004000000082000L,0x08002802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term110_in_accessterm6099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_static_query_in_accessterm6143 = new BitSet(new long[]{0x0000000800002002L,0x0000000400000000L});
	public static final BitSet FOLLOW_static_attribute_suffix_in_accessterm6189 = new BitSet(new long[]{0x0000000800002002L,0x0000000400000000L});
	public static final BitSet FOLLOW_atom_in_accessterm6213 = new BitSet(new long[]{0x0000000800002002L,0x0000000400000000L});
	public static final BitSet FOLLOW_accessterm_bracket_suffix_in_accessterm6250 = new BitSet(new long[]{0x0000000800002002L,0x0000000400000000L});
	public static final BitSet FOLLOW_attribute_or_query_suffix_in_accessterm6283 = new BitSet(new long[]{0x0000000800002002L,0x0000000400000000L});
	public static final BitSet FOLLOW_heap_selection_suffix_in_accessterm6346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_heap_selection_suffix6384 = new BitSet(new long[]{0x0004000000082000L,0x08002800000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_accessterm_in_heap_selection_suffix6388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_heap_update_suffix_in_accessterm_bracket_suffix6430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_seq_get_suffix_in_accessterm_bracket_suffix6447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_access_suffix_in_accessterm_bracket_suffix6462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_seq_get_suffix6491 = new BitSet(new long[]{0x0004000000082000L,0x08002802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_logicTermReEntry_in_seq_get_suffix6498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_seq_get_suffix6510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAttributeOrQueryReference_in_static_query6553 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_argument_list_in_static_query6559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_heap_update_suffix6611 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_equivalence_term_in_heap_update_suffix6636 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ASSIGN_in_heap_update_suffix6638 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_equivalence_term_in_heap_update_suffix6642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_simple_ident_in_heap_update_suffix6662 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_argument_list_in_heap_update_suffix6666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_heap_update_suffix6688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_array_access_suffix6726 = new BitSet(new long[]{0x0004000000082000L,0x08002802000001C0L,0x0000402200000000L});
	public static final BitSet FOLLOW_STAR_in_array_access_suffix6734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_logicTermReEntry_in_array_access_suffix6753 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_DOTRANGE_in_array_access_suffix6772 = new BitSet(new long[]{0x0004000000082000L,0x08002802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_logicTermReEntry_in_array_access_suffix6778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_array_access_suffix6813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessterm_in_accesstermlist6873 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_COMMA_in_accesstermlist6879 = new BitSet(new long[]{0x0004000000082000L,0x08002800000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_accessterm_in_accesstermlist6883 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_specialTerm_in_atom6928 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_funcpredvarterm_in_atom6942 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_atom6952 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term_in_atom6958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_atom6960 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_TRUE_in_atom6970 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_FALSE_in_atom6983 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_ifThenElseTerm_in_atom6999 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_ifExThenElseTerm_in_atom7013 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_atom7025 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_LGUILLEMETS_in_atom7047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000200000000L});
	public static final BitSet FOLLOW_label_in_atom7053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RGUILLEMETS_in_atom7057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_label_in_label7100 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_COMMA_in_label7105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000200000000L});
	public static final BitSet FOLLOW_single_label_in_label7109 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_IDENT_in_single_label7141 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_STAR_in_single_label7149 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_single_label7156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_single_label7160 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_single_label7165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_single_label7169 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_single_label7175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_ident_in_abbreviation7225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifThenElseTerm7287 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifThenElseTerm7289 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term_in_ifThenElseTerm7295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_ifThenElseTerm7297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_THEN_in_ifThenElseTerm7317 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifThenElseTerm7319 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term_in_ifThenElseTerm7325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_ifThenElseTerm7327 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ELSE_in_ifThenElseTerm7337 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifThenElseTerm7339 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term_in_ifThenElseTerm7345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_ifThenElseTerm7347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IFEX_in_ifExThenElseTerm7422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_bound_variables_in_ifExThenElseTerm7428 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifExThenElseTerm7438 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term_in_ifExThenElseTerm7444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_ifExThenElseTerm7446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_THEN_in_ifExThenElseTerm7466 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifExThenElseTerm7468 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term_in_ifExThenElseTerm7474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_ifExThenElseTerm7476 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_ELSE_in_ifExThenElseTerm7486 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifExThenElseTerm7488 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term_in_ifExThenElseTerm7494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_ifExThenElseTerm7496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_argument7573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term60_in_argument7591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORALL_in_quantifierterm7632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_EXISTS_in_quantifierterm7648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_bound_variables_in_quantifierterm7666 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term60_in_quantifierterm7672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_substitutionterm_in_braces_term7719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_locset_term_in_braces_term7747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateterm_in_braces_term7762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_locset_term7791 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_location_term_in_locset_term7807 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_COMMA_in_locset_term7821 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_location_term_in_locset_term7827 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_locset_term7841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_location_term7869 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_equivalence_term_in_location_term7873 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_location_term7875 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_equivalence_term_in_location_term7879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_location_term7881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_substitutionterm7924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_SUBST_in_substitutionterm7926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_one_bound_variable_in_substitutionterm7937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_substitutionterm7939 = new BitSet(new long[]{0x0004000000082000L,0x08002802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_logicTermReEntry_in_substitutionterm7955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_substitutionterm7967 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term110_in_substitutionterm7978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_formula_in_substitutionterm7986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_updateterm8035 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term_in_updateterm8039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_updateterm8041 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term110_in_updateterm8069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_formula_in_updateterm8101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_one_bound_variable_in_bound_variables8180 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_bound_variables8202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_one_bound_variable_in_bound_variables8208 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_bound_variables8227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_one_logic_bound_variable_nosort_in_one_bound_variable8251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_one_schema_bound_variable_in_one_bound_variable8264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_one_logic_bound_variable_in_one_bound_variable8277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_ident_in_one_schema_bound_variable8300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sortId_in_one_logic_bound_variable8318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_in_one_logic_bound_variable8322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_ident_in_one_logic_bound_variable_nosort8340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MODALITY_in_modality_dl_term8373 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term60_in_modality_dl_term8394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_argument_list8482 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000040000L});
	public static final BitSet FOLLOW_argument_in_argument_list8498 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_argument_list8516 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_argument_in_argument_list8522 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_argument_list8541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_funcpredvarterm8590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_funcpredvarterm8621 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_NUM_LITERAL_in_funcpredvarterm8629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_funcpredvarterm8651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_abbreviation_in_funcpredvarterm8657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcpred_name_in_funcpredvarterm8669 = new BitSet(new long[]{0x0000000000000002L,0x00000A0200000000L});
	public static final BitSet FOLLOW_LIMITED_in_funcpredvarterm8672 = new BitSet(new long[]{0x0000000000000002L,0x0000080200000000L});
	public static final BitSet FOLLOW_LBRACE_in_funcpredvarterm8730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_bound_variables_in_funcpredvarterm8752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_funcpredvarterm8770 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_argument_list_in_funcpredvarterm8805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_metaTerm_in_specialTerm8925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERCENT_in_arith_op8959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_arith_op8967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_arith_op8975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SLASH_in_arith_op8983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_arith_op8991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_varId9021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_ident_comma_list_in_varIds9066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRIGGER_in_triggers9088 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_triggers9095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_in_triggers9101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_triggers9114 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term_in_triggers9128 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_AVOID_in_triggers9131 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term_in_triggers9135 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_triggers9147 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term_in_triggers9151 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_triggers9159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEMMA_in_taclet9195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_IDENT_in_taclet9209 = new BitSet(new long[]{0x0000000000000000L,0x0000080200000000L});
	public static final BitSet FOLLOW_option_list_in_taclet9214 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_taclet9226 = new BitSet(new long[]{0x00648000004830A0L,0x0880A802000001C0L,0x0200402000410000L});
	public static final BitSet FOLLOW_formula_in_taclet9270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SCHEMAVAR_in_taclet9314 = new BitSet(new long[]{0x0080000000000000L,0x0002000000000000L,0x0C02030030000080L});
	public static final BitSet FOLLOW_one_schema_var_decl_in_taclet9316 = new BitSet(new long[]{0x00200000004010A0L,0x0000080000000000L,0x0200002000410000L});
	public static final BitSet FOLLOW_ASSUMES_in_taclet9332 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_taclet9334 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402004000000L});
	public static final BitSet FOLLOW_seq_in_taclet9338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_taclet9340 = new BitSet(new long[]{0x00200000004000A0L,0x0000080000000000L,0x0200002000010000L});
	public static final BitSet FOLLOW_FIND_in_taclet9356 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_taclet9358 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402004000000L});
	public static final BitSet FOLLOW_termorseq_in_taclet9364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_taclet9366 = new BitSet(new long[]{0x00000000004002A0L,0x0000080000002000L,0x020000A000210000L});
	public static final BitSet FOLLOW_SAMEUPDATELEVEL_in_taclet9385 = new BitSet(new long[]{0x00000000004002A0L,0x0000080000002000L,0x020000A000210000L});
	public static final BitSet FOLLOW_INSEQUENTSTATE_in_taclet9405 = new BitSet(new long[]{0x00000000004002A0L,0x0000080000002000L,0x020000A000210000L});
	public static final BitSet FOLLOW_ANTECEDENTPOLARITY_in_taclet9425 = new BitSet(new long[]{0x00000000004002A0L,0x0000080000002000L,0x020000A000210000L});
	public static final BitSet FOLLOW_SUCCEDENTPOLARITY_in_taclet9445 = new BitSet(new long[]{0x00000000004002A0L,0x0000080000002000L,0x020000A000210000L});
	public static final BitSet FOLLOW_VARCOND_in_taclet9496 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_taclet9498 = new BitSet(new long[]{0xE11828C264000400L,0x031810003FDE0000L,0x0000001C08100000L});
	public static final BitSet FOLLOW_varexplist_in_taclet9500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_taclet9503 = new BitSet(new long[]{0x00000000004000A0L,0x0000080000000000L,0x0000002000010000L});
	public static final BitSet FOLLOW_goalspecs_in_taclet9517 = new BitSet(new long[]{0x0000000400000000L,0x0040000000000003L,0x0000200000004000L});
	public static final BitSet FOLLOW_modifiers_in_taclet9528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_taclet9551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulesets_in_modifiers9580 = new BitSet(new long[]{0x0000000400000002L,0x0040000000000003L,0x0000200000000000L});
	public static final BitSet FOLLOW_NONINTERACTIVE_in_modifiers9594 = new BitSet(new long[]{0x0000000400000002L,0x0040000000000003L,0x0000200000000000L});
	public static final BitSet FOLLOW_DISPLAYNAME_in_modifiers9608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_string_literal_in_modifiers9614 = new BitSet(new long[]{0x0000000400000002L,0x0040000000000003L,0x0000200000000000L});
	public static final BitSet FOLLOW_HELPTEXT_in_modifiers9641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_string_literal_in_modifiers9647 = new BitSet(new long[]{0x0000000400000002L,0x0040000000000003L,0x0000200000000000L});
	public static final BitSet FOLLOW_triggers_in_modifiers9673 = new BitSet(new long[]{0x0000000400000002L,0x0040000000000003L,0x0000200000000000L});
	public static final BitSet FOLLOW_semisequent_in_seq9726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEQARROW_in_seq9728 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_semisequent_in_seq9732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_termorseq9789 = new BitSet(new long[]{0x0000000001000002L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_termorseq9793 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402004000000L});
	public static final BitSet FOLLOW_seq_in_termorseq9797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEQARROW_in_termorseq9801 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_semisequent_in_termorseq9805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEQARROW_in_termorseq9835 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_semisequent_in_termorseq9839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_semisequent9901 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_COMMA_in_semisequent9905 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_semisequent_in_semisequent9909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varexp_in_varexplist9937 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_COMMA_in_varexplist9942 = new BitSet(new long[]{0xE11828C264000400L,0x031810003FDE0000L,0x0000001C08100000L});
	public static final BitSet FOLLOW_varexp_in_varexplist9944 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_varcond_applyUpdateOnRigid_in_varexp9967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_dropEffectlessElementaries_in_varexp9976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_dropEffectlessStores_in_varexp9985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_enum_const_in_varexp9994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_free_in_varexp10003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_hassort_in_varexp10012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_fieldtype_in_varexp10021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_equalUnique_in_varexp10030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_new_in_varexp10039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_newlabel_in_varexp10048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_observer_in_varexp10057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_different_in_varexp10066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_metadisjoint_in_varexp10075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_simplifyIfThenElseUpdate_in_varexp10084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_differentFields_in_varexp10093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT__in_varexp10113 = new BitSet(new long[]{0xA110000204000000L,0x000000003F5E0000L,0x0000001C00100000L});
	public static final BitSet FOLLOW_varcond_abstractOrInterface_in_varexp10129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_array_in_varexp10139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_array_length_in_varexp10152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_enumtype_in_varexp10166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_freeLabelIn_in_varexp10179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_localvariable_in_varexp10201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_thisreference_in_varexp10222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_reference_in_varexp10243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_referencearray_in_varexp10264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_static_in_varexp10277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_staticmethod_in_varexp10290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_final_in_varexp10305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_typecheck_in_varexp10318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_constant_in_varexp10331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_label_in_varexp10344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_static_field_in_varexp10357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_subFormulas_in_varexp10370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varcond_containsAssignment_in_varexp10383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APPLY_UPDATE_ON_RIGID_in_varcond_applyUpdateOnRigid10419 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_applyUpdateOnRigid10421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_applyUpdateOnRigid10425 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_applyUpdateOnRigid10427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_applyUpdateOnRigid10431 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_applyUpdateOnRigid10433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_applyUpdateOnRigid10437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_applyUpdateOnRigid10439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_EFFECTLESS_ELEMENTARIES_in_varcond_dropEffectlessElementaries10458 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_dropEffectlessElementaries10460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_dropEffectlessElementaries10464 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_dropEffectlessElementaries10466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_dropEffectlessElementaries10470 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_dropEffectlessElementaries10472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_dropEffectlessElementaries10476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_dropEffectlessElementaries10478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_EFFECTLESS_STORES_in_varcond_dropEffectlessStores10497 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_dropEffectlessStores10499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_dropEffectlessStores10503 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_dropEffectlessStores10505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_dropEffectlessStores10509 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_dropEffectlessStores10511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_dropEffectlessStores10515 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_dropEffectlessStores10517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_dropEffectlessStores10521 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_dropEffectlessStores10523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_dropEffectlessStores10527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_dropEffectlessStores10529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIFFERENTFIELDS_in_varcond_differentFields10549 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_differentFields10554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_differentFields10565 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_differentFields10567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_differentFields10573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_differentFields10578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIMPLIFY_IF_THEN_ELSE_UPDATE_in_varcond_simplifyIfThenElseUpdate10597 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_simplifyIfThenElseUpdate10599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_simplifyIfThenElseUpdate10603 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_simplifyIfThenElseUpdate10605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_simplifyIfThenElseUpdate10609 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_simplifyIfThenElseUpdate10611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_simplifyIfThenElseUpdate10615 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_simplifyIfThenElseUpdate10617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_simplifyIfThenElseUpdate10621 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_simplifyIfThenElseUpdate10623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_simplifyIfThenElseUpdate10627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_simplifyIfThenElseUpdate10629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_sortId_check_in_type_resolver10658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEOF_in_type_resolver10705 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_type_resolver10707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_type_resolver10713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_type_resolver10715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTAINERTYPE_in_type_resolver10756 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_type_resolver10758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_type_resolver10764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_type_resolver10766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_varcond_new10799 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_new10801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_new10805 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_new10807 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L,0x0000800000000000L});
	public static final BitSet FOLLOW_TYPEOF_in_varcond_new10827 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_new10829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_new10833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_new10835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_DEPENDINGON_in_varcond_new10856 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_new10858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_new10862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_new10864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_keyjavatype_in_varcond_new10878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_new10893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLABEL_in_varcond_newlabel10911 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_newlabel10913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_newlabel10917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_newlabel10919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SAME_in_varcond_typecheck10941 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_ISSUBTYPE_in_varcond_typecheck10960 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_STRICT_in_varcond_typecheck10977 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_ISSUBTYPE_in_varcond_typecheck10979 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_DISJOINTMODULONULL_in_varcond_typecheck10996 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_typecheck11016 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000040L,0x0000800000000000L});
	public static final BitSet FOLLOW_type_resolver_in_varcond_typecheck11022 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_typecheck11024 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000040L,0x0000800000000000L});
	public static final BitSet FOLLOW_type_resolver_in_varcond_typecheck11030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_typecheck11032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTFREEIN_in_varcond_free11053 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_free11055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_free11059 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_free11061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varIds_in_varcond_free11065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_free11067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASSORT_in_varcond_hassort11088 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_hassort11094 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_hassort11103 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_ELEMSORT_in_varcond_hassort11107 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_hassort11109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_hassort11113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_hassort11115 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_hassort11124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_any_sortId_check_in_varcond_hassort11132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_hassort11139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELDTYPE_in_varcond_fieldtype11160 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_fieldtype11166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_fieldtype11174 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_fieldtype11180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_any_sortId_check_in_varcond_fieldtype11189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_fieldtype11197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTAINS_ASSIGNMENT_in_varcond_containsAssignment11220 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_containsAssignment11222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_containsAssignment11226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_containsAssignment11228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISENUMTYPE_in_varcond_enumtype11250 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_enumtype11252 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000040L,0x0000800000000000L});
	public static final BitSet FOLLOW_type_resolver_in_varcond_enumtype11258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_enumtype11260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISREFERENCE_in_varcond_reference11288 = new BitSet(new long[]{0x0000000000000000L,0x0000080400000000L});
	public static final BitSet FOLLOW_LBRACKET_in_varcond_reference11291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_in_varcond_reference11319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_varcond_reference11339 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_reference11347 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000040L,0x0000800000000000L});
	public static final BitSet FOLLOW_type_resolver_in_varcond_reference11367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_reference11399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISTHISREFERENCE_in_varcond_thisreference11424 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_thisreference11429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_thisreference11446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_thisreference11478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATICMETHODREFERENCE_in_varcond_staticmethod11507 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_staticmethod11509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_staticmethod11513 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_staticmethod11515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_staticmethod11519 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_staticmethod11521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_staticmethod11525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_staticmethod11527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISREFERENCEARRAY_in_varcond_referencearray11543 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_referencearray11545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_referencearray11549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_referencearray11551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISARRAY_in_varcond_array11567 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_array11569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_array11573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_array11575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISARRAYLENGTH_in_varcond_array_length11591 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_array_length11593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_array_length11597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_array_length11599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IS_ABSTRACT_OR_INTERFACE_in_varcond_abstractOrInterface11616 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_abstractOrInterface11618 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000040L,0x0000800000000000L});
	public static final BitSet FOLLOW_type_resolver_in_varcond_abstractOrInterface11622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_abstractOrInterface11624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENUM_CONST_in_varcond_enum_const11640 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_enum_const11642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_enum_const11646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_enum_const11648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FINAL_in_varcond_final11664 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_final11666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_final11670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_final11672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_varcond_static11688 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_static11690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_static11694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_static11696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISLOCALVARIABLE_in_varcond_localvariable11712 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_localvariable11716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_localvariable11720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_localvariable11722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISOBSERVER_in_varcond_observer11740 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_observer11744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_observer11748 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_observer11750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_observer11754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_observer11757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIFFERENT_in_varcond_different11775 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_different11779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_different11783 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_different11785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_different11789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_different11791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METADISJOINT_in_varcond_metadisjoint11809 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_metadisjoint11813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_metadisjoint11817 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_metadisjoint11819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_metadisjoint11823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_metadisjoint11825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUAL_UNIQUE_in_varcond_equalUnique11844 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_equalUnique11848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_equalUnique11852 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_equalUnique11854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_equalUnique11858 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_equalUnique11860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_equalUnique11864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_equalUnique11866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FREELABELIN_in_varcond_freeLabelIn11883 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_freeLabelIn11890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_freeLabelIn11894 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_freeLabelIn11896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_freeLabelIn11900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_freeLabelIn11902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISCONSTANT_in_varcond_constant11918 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_constant11928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_constant11932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_constant11934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASLABEL_in_varcond_label11950 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_label11960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_label11964 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_varcond_label11966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_ident_in_varcond_label11970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_label11972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISSTATICFIELD_in_varcond_static_field11988 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_static_field11998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_static_field12002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_static_field12004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASSUBFORMULAS_in_varcond_subFormulas12020 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_varcond_subFormulas12030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_varId_in_varcond_subFormulas12034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_varcond_subFormulas12036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLOSEGOAL_in_goalspecs12056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_goalspecwithoption_in_goalspecs12064 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_goalspecs12069 = new BitSet(new long[]{0x00000000000000A0L,0x0000080000000000L,0x0000002000010000L});
	public static final BitSet FOLLOW_goalspecwithoption_in_goalspecs12071 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_option_list_in_goalspecwithoption12104 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_goalspecwithoption12123 = new BitSet(new long[]{0x00000000000000A0L,0x0000000000000000L,0x0000002000010000L});
	public static final BitSet FOLLOW_goalspec_in_goalspecwithoption12141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_goalspecwithoption12161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_goalspec_in_goalspecwithoption12188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_option12227 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_COLON_in_option12229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_IDENT_in_option12233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_option_list12265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_option_in_option_list12276 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_option_list12283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_option_in_option_list12289 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_option_list12295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_literal_in_goalspec12327 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_COLON_in_goalspec12329 = new BitSet(new long[]{0x00000000000000A0L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_replacewith_in_goalspec12351 = new BitSet(new long[]{0x00000000000000E2L});
	public static final BitSet FOLLOW_add_in_goalspec12372 = new BitSet(new long[]{0x00000000000000C2L});
	public static final BitSet FOLLOW_addrules_in_goalspec12396 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_addprogvar_in_goalspec12420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_add_in_goalspec12452 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_addrules_in_goalspec12457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addrules_in_goalspec12477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REPLACEWITH_in_replacewith12537 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_replacewith12539 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402004000000L});
	public static final BitSet FOLLOW_termorseq_in_replacewith12543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_replacewith12545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_add12569 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_add12571 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402004000000L});
	public static final BitSet FOLLOW_seq_in_add12575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_add12577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADDRULES_in_addrules12601 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_addrules12603 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000040L});
	public static final BitSet FOLLOW_tacletlist_in_addrules12607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_addrules12609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADDPROGVARS_in_addprogvar12633 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_addprogvar12635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_pvset_in_addprogvar12639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_addprogvar12641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_taclet_in_tacletlist12675 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_COMMA_in_tacletlist12695 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000040L});
	public static final BitSet FOLLOW_tacletlist_in_tacletlist12699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varId_in_pvset12742 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_COMMA_in_pvset12758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_pvset_in_pvset12762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEURISTICS_in_rulesets12785 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_rulesets12787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ruleset_in_rulesets12789 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_rulesets12794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_ruleset_in_rulesets12796 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_rulesets12803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ruleset12823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_ident_in_metaId12857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_metaId_in_metaTerm12894 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_metaTerm12910 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term_in_metaTerm12929 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_metaTerm12959 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term_in_metaTerm12982 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_metaTerm13020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTRACTS_in_contracts13081 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_contracts13090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000004000L});
	public static final BitSet FOLLOW_one_contract_in_contracts13103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_contracts13115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INVARIANTS_in_invariants13132 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LPAREN_in_invariants13134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_one_logic_bound_variable_in_invariants13138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_invariants13140 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_invariants13149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000004000L});
	public static final BitSet FOLLOW_one_invariant_in_invariants13162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_invariants13175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_ident_in_one_contract13200 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_one_contract13202 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000100L});
	public static final BitSet FOLLOW_prog_var_decls_in_one_contract13218 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_formula_in_one_contract13232 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_MODIFIES_in_one_contract13234 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term_in_one_contract13240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_one_contract13255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_one_contract13257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_ident_in_one_invariant13284 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_one_invariant13286 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_formula_in_one_invariant13298 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_DISPLAYNAME_in_one_invariant13306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_string_literal_in_one_invariant13312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_one_invariant13323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_one_invariant13325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_profile_in_problem13360 = new BitSet(new long[]{0x0200000008348000L,0x2020000180009804L,0x2000100100880524L});
	public static final BitSet FOLLOW_preferences_in_problem13376 = new BitSet(new long[]{0x0200000008348000L,0x2020000080009804L,0x2000100100880524L});
	public static final BitSet FOLLOW_bootClassPath_in_problem13405 = new BitSet(new long[]{0x0200000008308000L,0x2020000080009804L,0x2000100100880524L});
	public static final BitSet FOLLOW_classPaths_in_problem13437 = new BitSet(new long[]{0x0200000008108000L,0x2000000080009804L,0x2000100100880524L});
	public static final BitSet FOLLOW_javaSource_in_problem13452 = new BitSet(new long[]{0x0200000008108000L,0x2000000000009804L,0x2000100100880524L});
	public static final BitSet FOLLOW_decls_in_problem13463 = new BitSet(new long[]{0x0000000008108002L,0x0000000000008000L,0x0000000000080420L});
	public static final BitSet FOLLOW_contracts_in_problem13490 = new BitSet(new long[]{0x0000000008108002L,0x0000000000008000L,0x0000000000080420L});
	public static final BitSet FOLLOW_invariants_in_problem13498 = new BitSet(new long[]{0x0000000000108002L,0x0000000000008000L,0x0000000000080420L});
	public static final BitSet FOLLOW_RULES_in_problem13516 = new BitSet(new long[]{0x0000000000000000L,0x0000080200000000L});
	public static final BitSet FOLLOW_AXIOMS_in_problem13534 = new BitSet(new long[]{0x0000000000000000L,0x0000080200000000L});
	public static final BitSet FOLLOW_option_list_in_problem13565 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_problem13576 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000040L,0x0000000000004000L});
	public static final BitSet FOLLOW_taclet_in_problem13627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_problem13630 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000040L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_problem13677 = new BitSet(new long[]{0x0000000000108002L,0x0000000000000000L,0x0000000000080420L});
	public static final BitSet FOLLOW_PROBLEM_in_problem13715 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_problem13717 = new BitSet(new long[]{0x0044800000082000L,0x0880A802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_formula_in_problem13754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_problem13768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHOOSECONTRACT_in_problem13796 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_string_literal_in_problem13801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_problem13803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROOFOBLIGATION_in_problem13845 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_string_literal_in_problem13851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_problem13853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOTCLASSPATH_in_bootClassPath13906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_string_literal_in_bootClassPath13910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_bootClassPath13912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASSPATH_in_classPaths13940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_string_literal_in_classPaths13949 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_classPaths13963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_string_literal_in_classPaths13967 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_classPaths13991 = new BitSet(new long[]{0x0000000000200002L,0x0020000000000000L});
	public static final BitSet FOLLOW_NODEFAULTCLASSES_in_classPaths14014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_classPaths14022 = new BitSet(new long[]{0x0000000000200002L,0x0020000000000000L});
	public static final BitSet FOLLOW_JAVASOURCE_in_javaSource14057 = new BitSet(new long[]{0x0000000000810000L,0x0000000000000000L,0x0000002040000000L});
	public static final BitSet FOLLOW_oneJavaSource_in_javaSource14070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_javaSource14076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_literal_in_oneJavaSource14109 = new BitSet(new long[]{0x0000000000810002L,0x0000000000000000L,0x0000002040000000L});
	public static final BitSet FOLLOW_SLASH_in_oneJavaSource14124 = new BitSet(new long[]{0x0000000000810002L,0x0000000000000000L,0x0000002040000000L});
	public static final BitSet FOLLOW_COLON_in_oneJavaSource14139 = new BitSet(new long[]{0x0000000000810002L,0x0000000000000000L,0x0000002040000000L});
	public static final BitSet FOLLOW_BACKSLASH_in_oneJavaSource14152 = new BitSet(new long[]{0x0000000000810002L,0x0000000000000000L,0x0000002040000000L});
	public static final BitSet FOLLOW_PROFILE_in_profile14179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_string_literal_in_profile14183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SEMI_in_profile14187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYSETTINGS_in_preferences14209 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LBRACE_in_preferences14211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000004000L});
	public static final BitSet FOLLOW_string_literal_in_preferences14220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_preferences14226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROOFSCRIPT_in_proofScript14248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_proofScript14254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROOF_in_proof14287 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_proofBody_in_proof14289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_proofBody14317 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_pseudosexpr_in_proofBody14333 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_proofBody14348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_pseudosexpr14376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000040000L});
	public static final BitSet FOLLOW_expreid_in_pseudosexpr14381 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000002000040000L});
	public static final BitSet FOLLOW_string_literal_in_pseudosexpr14400 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_pseudosexpr_in_pseudosexpr14438 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_pseudosexpr14473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_ident_in_expreid14500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sort_name_in_synpred1_KeYParser4111 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_DOUBLECOLON_in_synpred1_KeYParser4113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relation_op_in_synpred3_KeYParser5340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_weak_arith_op_in_synpred4_KeYParser5401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_strong_arith_op_in_synpred5_KeYParser5461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_synpred6_KeYParser6024 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xF7FFFFFFFFFFFFFFL,0x7FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_set_in_synpred6_KeYParser6026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred7_KeYParser6066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_any_sortId_check_in_synpred7_KeYParser6068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred7_KeYParser6071 = new BitSet(new long[]{0x0004000000082000L,0x08002802000001C0L,0x0000402000000000L});
	public static final BitSet FOLLOW_term110_in_synpred7_KeYParser6073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_equivalence_term_in_synpred8_KeYParser6620 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ASSIGN_in_synpred8_KeYParser6622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOTRANGE_in_synpred9_KeYParser6767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_synpred10_KeYParser7708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_SUBST_in_synpred10_KeYParser7710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_synpred11_KeYParser7730 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_set_in_synpred11_KeYParser7732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_synpred12_KeYParser8611 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_NUM_LITERAL_in_synpred12_KeYParser8615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred13_KeYParser8689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_synpred13_KeYParser8694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_bound_variables_in_synpred13_KeYParser8696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formula_in_synpred14_KeYParser9238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RBRACE_in_synpred14_KeYParser9240 = new BitSet(new long[]{0x0000000000000002L});
}
