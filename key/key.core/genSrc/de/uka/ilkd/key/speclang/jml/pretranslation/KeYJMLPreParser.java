// $ANTLR 3.5.2 /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g 2017-04-13 18:24:23

    package de.uka.ilkd.key.speclang.jml.pretranslation;

    import java.io.StringReader;
    import java.util.ArrayList;
    import java.util.Iterator;
    import java.util.List;

    import org.key_project.util.collection.*;
    import de.uka.ilkd.key.java.Position;
    import de.uka.ilkd.key.speclang.*;
    import de.uka.ilkd.key.speclang.translation.*;
    import de.uka.ilkd.key.ldt.HeapLDT;
    import de.uka.ilkd.key.logic.Name;
    import de.uka.ilkd.key.logic.TermBuilder;

    import de.uka.ilkd.key.speclang.jml.pretranslation.Behavior;
    import de.uka.ilkd.key.speclang.jml.pretranslation.TextualJMLClassAxiom;
    import de.uka.ilkd.key.speclang.jml.pretranslation.TextualJMLClassInv;
    import de.uka.ilkd.key.speclang.jml.pretranslation.TextualJMLConstruct;
    import de.uka.ilkd.key.speclang.jml.pretranslation.TextualJMLDepends;
    import de.uka.ilkd.key.speclang.jml.pretranslation.TextualJMLFieldDecl;
    import de.uka.ilkd.key.speclang.jml.pretranslation.TextualJMLInitially;
    import de.uka.ilkd.key.speclang.jml.pretranslation.TextualJMLLoopSpec;
    import de.uka.ilkd.key.speclang.jml.pretranslation.TextualJMLMethodDecl;
    import de.uka.ilkd.key.speclang.jml.pretranslation.TextualJMLRepresents;
    import de.uka.ilkd.key.speclang.jml.pretranslation.TextualJMLSetStatement;
    import de.uka.ilkd.key.speclang.jml.pretranslation.TextualJMLSpecCase;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class KeYJMLPreParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ACCESSIBLE", "ACCESSIBLE_REDUNDANTLY", 
		"ALSO", "ASSERT", "ASSERT_REDUNDANTLY", "ASSIGNABLE", "ASSIGNABLE_RED", 
		"ASSUME", "ASSUME_REDUNDANTLY", "AXIOM", "AXIOM_NAME_BEGIN", "AXIOM_NAME_END", 
		"BEHAVIOR", "BEHAVIOUR", "BODY", "BRACE_DISPATCH", "BREAKS", "BREAK_BEHAVIOR", 
		"BREAK_BEHAVIOUR", "CAPTURES", "CAPTURES_RED", "CODE", "CODE_BIGINT_MATH", 
		"CODE_JAVA_MATH", "CODE_SAFE_MATH", "COMMA", "CONST", "CONSTRAINT", "CONSTRAINT_RED", 
		"CONTINUES", "CONTINUE_BEHAVIOR", "CONTINUE_BEHAVIOUR", "DEBUG", "DECIMALINTEGERLITERAL", 
		"DECREASES", "DECREASES_REDUNDANTLY", "DECREASING", "DECREASING_REDUNDANTLY", 
		"DETERMINES", "DIGIT", "DIGITS", "DIVERGES", "DIVERGES_RED", "DOT", "DURATION", 
		"DURATION_RED", "EMPTYBRACKETS", "ENSURES", "ENSURES_FREE", "ENSURES_RED", 
		"EQUALITY", "ESC", "EXCEPTIONAL_BEHAVIOR", "EXCEPTIONAL_BEHAVIOUR", "EXSURES", 
		"EXSURES_RED", "FINAL", "FORALL", "FOR_EXAMPLE", "GHOST", "HELPER", "HEXDIGIT", 
		"HEXINTEGERLITERAL", "HEXNUMERAL", "IDENT", "IMPLIES_THAT", "IN", "INITIALLY", 
		"INSTANCE", "INTEGERLITERAL", "INTEGERTYPESUFFIX", "INVARIANT", "INVARIANT_RED", 
		"IN_RED", "JAVAOPERATOR", "JMLSPECIALSYMBOL", "JOIN_PROC", "LETTER", "LOOP_INVARIANT", 
		"LOOP_INVARIANT_RED", "LPAREN", "MAINTAINING", "MAINTAINING_REDUNDANTLY", 
		"MAPS", "MAPS_RED", "MEASURED_BY", "MEASURED_BY_REDUNDANTLY", "ML_COMMENT", 
		"MODEL", "MODEL_BEHAVIOR", "MODEL_BEHAVIOUR", "MODIFIABLE", "MODIFIABLE_RED", 
		"MODIFIES", "MODIFIES_RED", "MONITORED", "MONITORS_FOR", "NATIVE", "NEST_END", 
		"NEST_START", "NONZERODIGIT", "NON_NULL", "NORMAL_BEHAVIOR", "NORMAL_BEHAVIOUR", 
		"NOWARN", "NO_STATE", "NULLABLE", "NULLABLE_BY_DEFAULT", "OCTALDIGIT", 
		"OCTALINTEGERLITERAL", "OCTALNUMERAL", "OLD", "POST", "POST_RED", "PRE", 
		"PRE_RED", "PRIVATE", "PROTECTED", "PUBLIC", "PURE", "READABLE", "REPRESENTS", 
		"REPRESENTS_RED", "REQUIRES", "REQUIRES_FREE", "REQUIRES_RED", "RESPECTS", 
		"RETURNS", "RETURN_BEHAVIOR", "RETURN_BEHAVIOUR", "RPAREN", "SEMICOLON", 
		"SEPARATES", "SET", "SIGNALS", "SIGNALS_ONLY", "SIGNALS_ONLY_RED", "SIGNALS_RED", 
		"SL_COMMENT", "SPEC_BIGINT_MATH", "SPEC_JAVA_MATH", "SPEC_NAME", "SPEC_PROTECTED", 
		"SPEC_PUBLIC", "SPEC_SAFE_MATH", "STATIC", "STRICTFP", "STRICTLY_PURE", 
		"STRING_LITERAL", "SYNCHRONIZED", "TRANSIENT", "TWO_STATE", "UNINITIALIZED", 
		"UNREACHABLE", "VOLATILE", "WHEN", "WHEN_RED", "WORKING_SPACE", "WORKING_SPACE_RED", 
		"WRITABLE", "WS", "AXION_NAME_END", "CODE_SAVE_MATH", "INITIALISER", "LOOP_INVARIANT_REDUNDANTLY", 
		"SPEC_SAVE_MATH"
	};
	public static final int EOF=-1;
	public static final int ABSTRACT=4;
	public static final int ACCESSIBLE=5;
	public static final int ACCESSIBLE_REDUNDANTLY=6;
	public static final int ALSO=7;
	public static final int ASSERT=8;
	public static final int ASSERT_REDUNDANTLY=9;
	public static final int ASSIGNABLE=10;
	public static final int ASSIGNABLE_RED=11;
	public static final int ASSUME=12;
	public static final int ASSUME_REDUNDANTLY=13;
	public static final int AXIOM=14;
	public static final int AXIOM_NAME_BEGIN=15;
	public static final int AXIOM_NAME_END=16;
	public static final int BEHAVIOR=17;
	public static final int BEHAVIOUR=18;
	public static final int BODY=19;
	public static final int BRACE_DISPATCH=20;
	public static final int BREAKS=21;
	public static final int BREAK_BEHAVIOR=22;
	public static final int BREAK_BEHAVIOUR=23;
	public static final int CAPTURES=24;
	public static final int CAPTURES_RED=25;
	public static final int CODE=26;
	public static final int CODE_BIGINT_MATH=27;
	public static final int CODE_JAVA_MATH=28;
	public static final int CODE_SAFE_MATH=29;
	public static final int COMMA=30;
	public static final int CONST=31;
	public static final int CONSTRAINT=32;
	public static final int CONSTRAINT_RED=33;
	public static final int CONTINUES=34;
	public static final int CONTINUE_BEHAVIOR=35;
	public static final int CONTINUE_BEHAVIOUR=36;
	public static final int DEBUG=37;
	public static final int DECIMALINTEGERLITERAL=38;
	public static final int DECREASES=39;
	public static final int DECREASES_REDUNDANTLY=40;
	public static final int DECREASING=41;
	public static final int DECREASING_REDUNDANTLY=42;
	public static final int DETERMINES=43;
	public static final int DIGIT=44;
	public static final int DIGITS=45;
	public static final int DIVERGES=46;
	public static final int DIVERGES_RED=47;
	public static final int DOT=48;
	public static final int DURATION=49;
	public static final int DURATION_RED=50;
	public static final int EMPTYBRACKETS=51;
	public static final int ENSURES=52;
	public static final int ENSURES_FREE=53;
	public static final int ENSURES_RED=54;
	public static final int EQUALITY=55;
	public static final int ESC=56;
	public static final int EXCEPTIONAL_BEHAVIOR=57;
	public static final int EXCEPTIONAL_BEHAVIOUR=58;
	public static final int EXSURES=59;
	public static final int EXSURES_RED=60;
	public static final int FINAL=61;
	public static final int FORALL=62;
	public static final int FOR_EXAMPLE=63;
	public static final int GHOST=64;
	public static final int HELPER=65;
	public static final int HEXDIGIT=66;
	public static final int HEXINTEGERLITERAL=67;
	public static final int HEXNUMERAL=68;
	public static final int IDENT=69;
	public static final int IMPLIES_THAT=70;
	public static final int IN=71;
	public static final int INITIALLY=72;
	public static final int INSTANCE=73;
	public static final int INTEGERLITERAL=74;
	public static final int INTEGERTYPESUFFIX=75;
	public static final int INVARIANT=76;
	public static final int INVARIANT_RED=77;
	public static final int IN_RED=78;
	public static final int JAVAOPERATOR=79;
	public static final int JMLSPECIALSYMBOL=80;
	public static final int JOIN_PROC=81;
	public static final int LETTER=82;
	public static final int LOOP_INVARIANT=83;
	public static final int LOOP_INVARIANT_RED=84;
	public static final int LPAREN=85;
	public static final int MAINTAINING=86;
	public static final int MAINTAINING_REDUNDANTLY=87;
	public static final int MAPS=88;
	public static final int MAPS_RED=89;
	public static final int MEASURED_BY=90;
	public static final int MEASURED_BY_REDUNDANTLY=91;
	public static final int ML_COMMENT=92;
	public static final int MODEL=93;
	public static final int MODEL_BEHAVIOR=94;
	public static final int MODEL_BEHAVIOUR=95;
	public static final int MODIFIABLE=96;
	public static final int MODIFIABLE_RED=97;
	public static final int MODIFIES=98;
	public static final int MODIFIES_RED=99;
	public static final int MONITORED=100;
	public static final int MONITORS_FOR=101;
	public static final int NATIVE=102;
	public static final int NEST_END=103;
	public static final int NEST_START=104;
	public static final int NONZERODIGIT=105;
	public static final int NON_NULL=106;
	public static final int NORMAL_BEHAVIOR=107;
	public static final int NORMAL_BEHAVIOUR=108;
	public static final int NOWARN=109;
	public static final int NO_STATE=110;
	public static final int NULLABLE=111;
	public static final int NULLABLE_BY_DEFAULT=112;
	public static final int OCTALDIGIT=113;
	public static final int OCTALINTEGERLITERAL=114;
	public static final int OCTALNUMERAL=115;
	public static final int OLD=116;
	public static final int POST=117;
	public static final int POST_RED=118;
	public static final int PRE=119;
	public static final int PRE_RED=120;
	public static final int PRIVATE=121;
	public static final int PROTECTED=122;
	public static final int PUBLIC=123;
	public static final int PURE=124;
	public static final int READABLE=125;
	public static final int REPRESENTS=126;
	public static final int REPRESENTS_RED=127;
	public static final int REQUIRES=128;
	public static final int REQUIRES_FREE=129;
	public static final int REQUIRES_RED=130;
	public static final int RESPECTS=131;
	public static final int RETURNS=132;
	public static final int RETURN_BEHAVIOR=133;
	public static final int RETURN_BEHAVIOUR=134;
	public static final int RPAREN=135;
	public static final int SEMICOLON=136;
	public static final int SEPARATES=137;
	public static final int SET=138;
	public static final int SIGNALS=139;
	public static final int SIGNALS_ONLY=140;
	public static final int SIGNALS_ONLY_RED=141;
	public static final int SIGNALS_RED=142;
	public static final int SL_COMMENT=143;
	public static final int SPEC_BIGINT_MATH=144;
	public static final int SPEC_JAVA_MATH=145;
	public static final int SPEC_NAME=146;
	public static final int SPEC_PROTECTED=147;
	public static final int SPEC_PUBLIC=148;
	public static final int SPEC_SAFE_MATH=149;
	public static final int STATIC=150;
	public static final int STRICTFP=151;
	public static final int STRICTLY_PURE=152;
	public static final int STRING_LITERAL=153;
	public static final int SYNCHRONIZED=154;
	public static final int TRANSIENT=155;
	public static final int TWO_STATE=156;
	public static final int UNINITIALIZED=157;
	public static final int UNREACHABLE=158;
	public static final int VOLATILE=159;
	public static final int WHEN=160;
	public static final int WHEN_RED=161;
	public static final int WORKING_SPACE=162;
	public static final int WORKING_SPACE_RED=163;
	public static final int WRITABLE=164;
	public static final int WS=165;
	public static final int AXION_NAME_END=166;
	public static final int CODE_SAVE_MATH=167;
	public static final int INITIALISER=168;
	public static final int LOOP_INVARIANT_REDUNDANTLY=169;
	public static final int SPEC_SAVE_MATH=170;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public KeYJMLPreParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public KeYJMLPreParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return KeYJMLPreParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g"; }


	    private KeYJMLPreLexer lexer;
	    private SLTranslationExceptionManager excManager;
	    private ImmutableSet<PositionedString> warnings
		= DefaultImmutableSet.<PositionedString>nil();


	    private KeYJMLPreParser(KeYJMLPreLexer lexer,
	                            String fileName,
	                            Position offsetPos) {
		this(new CommonTokenStream(lexer));
		this.lexer      = lexer;
		this.excManager = new SLTranslationExceptionManager(this,
								    fileName,
								    offsetPos);
	    }


	    public KeYJMLPreParser(String comment,
				   String fileName,
				   Position offsetPos) {
		this(new KeYJMLPreLexer(new ANTLRStringStream(comment)),
		     fileName,
		     offsetPos);
	    }


	    private PositionedString createPositionedString(String text,
							    Token t) {
		return excManager.createPositionedString(text, t);
	    }

	    private PositionedString createPositionedString(final String text,
		    final Position pos) {
		return excManager.createPositionedString(text, pos);
	    }


	    private void raiseError(String msg) throws SLTranslationException {
	        throw excManager.createException(msg);
	    }


	    private void raiseNotSupported(String feature)
			throws SLTranslationException {
		PositionedString warning
			= excManager.createPositionedString(feature + " not supported");
		warnings = warnings.add(warning);
	    }


	    public ImmutableList<TextualJMLConstruct> parseClasslevelComment()
			throws SLTranslationException {
	        try {
	            return classlevel_comment();
	        } catch(RecognitionException e) {
		    throw excManager.convertException(getErrorMessage(e, KeYJMLPreLexerTokens.getTokennames()), e);
	        }
	    }


	    public ImmutableList<TextualJMLConstruct> parseMethodlevelComment()
			throws SLTranslationException {
	        try {
	            return methodlevel_comment();
	        } catch(RecognitionException e) {
		    throw excManager.convertException(getErrorMessage(e, KeYJMLPreLexerTokens.getTokennames()), e);
	        }
	    }


	    public ImmutableSet<PositionedString> getWarnings() {
		return warnings;
	    }

	    private PositionedString flipHeaps(String declString, PositionedString result) {
	       return flipHeaps(declString, result, false);
	    }

	    /*
	     * This method prepends a String to a given PositionedString and removes whitespaces from
	     * heap brackets at the beginning of it. (Why is this necessary?)
	     * 
	     * Note: Static manipulation of Strings that are passed to KeYJMLParser is fragile when it
	     * comes to error reporting. Original JML input should be left unmodified as much as possible
	     * so that correct error location can be reported to the user. Functionality of this method
	     * should be replaced by a more accurate implementation. (Kai Wallisch 07/2015)
	     */
	    private PositionedString flipHeaps(String declString, PositionedString result, boolean allowPreHeaps) {
	      String t = result.text;
	      String p = declString;

	      List<Name> validHeapNames = new ArrayList<Name>();

	      for(Name heapName : HeapLDT.VALID_HEAP_NAMES) {
	         validHeapNames.add(heapName);
	         if(allowPreHeaps) {
	           validHeapNames.add(new Name(heapName.toString()+"AtPre"));
	        }
	      }
	      for(Name heapName : validHeapNames) {
	        t = t.trim();
		    String l = "<"+heapName+">";
		    String lsp = "< "+heapName+" >";
	        if(t.startsWith(l) || t.startsWith(lsp)) {
	           p = l + p;
	           t = t.substring(t.startsWith(lsp) ? lsp.length() : l.length());
	           result = new PositionedString(t, result.fileName, result.pos);
	        }
	      }
	      if (p.contains("<")) {
	        /*
	         * Using normal prepend without update of position in case p contains a heap
	         * because in that case prependAndUpdatePosition() might produce a negative
	         * column value. However, this alternative is also not ideal because it does
	         * not update the position after prepending a string. A rewrite of this
	         * method that does not rely on low-level string manipulation is recommended
	         * to fix this issue.
	         */
	         result = result.prepend(p + " ");
	      } else {
	        result = result.prependAndUpdatePosition(p + " ");
	      }
	      return result;
	    }
	    
	  @Override
	  protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
	    throw new MismatchedTokenException(ttype, input);
	  }

	  @Override
	  public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
	    throw e;
	  }




	// $ANTLR start "classlevel_comment"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:199:1: classlevel_comment returns [ImmutableList<TextualJMLConstruct> result\n\t\t = ImmutableSLList.<TextualJMLConstruct>nil()] : mods= modifiers (list= classlevel_element[mods] mods= modifiers )* EOF ;
	public final ImmutableList<TextualJMLConstruct> classlevel_comment() throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  ImmutableSLList.<TextualJMLConstruct>nil();


		ImmutableList<String> mods =null;
		ImmutableList<TextualJMLConstruct> list =null;


		    mods = ImmutableSLList.<String>nil();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:206:5: (mods= modifiers (list= classlevel_element[mods] mods= modifiers )* EOF )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:209:5: mods= modifiers (list= classlevel_element[mods] mods= modifiers )* EOF
			{
			pushFollow(FOLLOW_modifiers_in_classlevel_comment115);
			mods=modifiers();
			state._fsp--;
			if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:210:5: (list= classlevel_element[mods] mods= modifiers )*
			loop1:
			while (true) {
				int alt1=2;
				alt1 = dfa1.predict(input);
				switch (alt1) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:211:7: list= classlevel_element[mods] mods= modifiers
					{
					pushFollow(FOLLOW_classlevel_element_in_classlevel_comment131);
					list=classlevel_element(mods);
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) {
					          if(list!=null) {
					             result = result.append(list);
					          }
					      }
					pushFollow(FOLLOW_modifiers_in_classlevel_comment150);
					mods=modifiers();
					state._fsp--;
					if (state.failed) return result;
					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_classlevel_comment163); if (state.failed) return result;
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "classlevel_comment"



	// $ANTLR start "classlevel_element"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:223:1: classlevel_element[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> r = null] : (result= class_invariant[mods] | ( accessible_keyword expression )=>result= depends_clause[mods] |result= method_specification[mods] |result= field_or_method_declaration[mods] |result= represents_clause[mods] |result= history_constraint[mods] |result= initially_clause[mods] |result= class_axiom[mods] |result= monitors_for_clause[mods] |result= readable_if_clause[mods] |result= writable_if_clause[mods] |result= datagroup_clause[mods] |result= set_statement[mods] |result= assert_statement[mods] |result= assume_statement[mods] |result= nowarn_pragma[mods] );
	public final ImmutableList<TextualJMLConstruct> classlevel_element(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  null;


		ImmutableList<TextualJMLConstruct> result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:228:9: (result= class_invariant[mods] | ( accessible_keyword expression )=>result= depends_clause[mods] |result= method_specification[mods] |result= field_or_method_declaration[mods] |result= represents_clause[mods] |result= history_constraint[mods] |result= initially_clause[mods] |result= class_axiom[mods] |result= monitors_for_clause[mods] |result= readable_if_clause[mods] |result= writable_if_clause[mods] |result= datagroup_clause[mods] |result= set_statement[mods] |result= assert_statement[mods] |result= assume_statement[mods] |result= nowarn_pragma[mods] )
			int alt2=16;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:229:9: result= class_invariant[mods]
					{
					pushFollow(FOLLOW_class_invariant_in_classlevel_element204);
					result=class_invariant(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:230:9: ( accessible_keyword expression )=>result= depends_clause[mods]
					{
					pushFollow(FOLLOW_depends_clause_in_classlevel_element225);
					result=depends_clause(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:231:9: result= method_specification[mods]
					{
					pushFollow(FOLLOW_method_specification_in_classlevel_element238);
					result=method_specification(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:232:9: result= field_or_method_declaration[mods]
					{
					pushFollow(FOLLOW_field_or_method_declaration_in_classlevel_element251);
					result=field_or_method_declaration(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:233:9: result= represents_clause[mods]
					{
					pushFollow(FOLLOW_represents_clause_in_classlevel_element264);
					result=represents_clause(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 6 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:234:9: result= history_constraint[mods]
					{
					pushFollow(FOLLOW_history_constraint_in_classlevel_element277);
					result=history_constraint(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 7 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:235:9: result= initially_clause[mods]
					{
					pushFollow(FOLLOW_initially_clause_in_classlevel_element290);
					result=initially_clause(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 8 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:236:9: result= class_axiom[mods]
					{
					pushFollow(FOLLOW_class_axiom_in_classlevel_element303);
					result=class_axiom(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 9 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:237:9: result= monitors_for_clause[mods]
					{
					pushFollow(FOLLOW_monitors_for_clause_in_classlevel_element316);
					result=monitors_for_clause(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 10 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:238:9: result= readable_if_clause[mods]
					{
					pushFollow(FOLLOW_readable_if_clause_in_classlevel_element329);
					result=readable_if_clause(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 11 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:239:9: result= writable_if_clause[mods]
					{
					pushFollow(FOLLOW_writable_if_clause_in_classlevel_element342);
					result=writable_if_clause(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 12 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:240:9: result= datagroup_clause[mods]
					{
					pushFollow(FOLLOW_datagroup_clause_in_classlevel_element355);
					result=datagroup_clause(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 13 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:241:9: result= set_statement[mods]
					{
					pushFollow(FOLLOW_set_statement_in_classlevel_element368);
					result=set_statement(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 14 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:242:9: result= assert_statement[mods]
					{
					pushFollow(FOLLOW_assert_statement_in_classlevel_element385);
					result=assert_statement(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 15 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:243:9: result= assume_statement[mods]
					{
					pushFollow(FOLLOW_assume_statement_in_classlevel_element399);
					result=assume_statement(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 16 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:244:9: result= nowarn_pragma[mods]
					{
					pushFollow(FOLLOW_nowarn_pragma_in_classlevel_element413);
					result=nowarn_pragma(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;

			}
			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "classlevel_element"



	// $ANTLR start "methodlevel_comment"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:248:1: methodlevel_comment returns [ImmutableList<TextualJMLConstruct> result\n\t\t = ImmutableSLList.<TextualJMLConstruct>nil()] : (mods= modifiers list= methodlevel_element[mods] )* EOF ;
	public final ImmutableList<TextualJMLConstruct> methodlevel_comment() throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  ImmutableSLList.<TextualJMLConstruct>nil();


		ImmutableList<String> mods =null;
		ImmutableList<TextualJMLConstruct> list =null;


		    mods = ImmutableSLList.<String>nil();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:255:5: ( (mods= modifiers list= methodlevel_element[mods] )* EOF )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:256:5: (mods= modifiers list= methodlevel_element[mods] )* EOF
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:256:5: (mods= modifiers list= methodlevel_element[mods] )*
			loop3:
			while (true) {
				int alt3=2;
				alt3 = dfa3.predict(input);
				switch (alt3) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:257:2: mods= modifiers list= methodlevel_element[mods]
					{
					pushFollow(FOLLOW_modifiers_in_methodlevel_comment448);
					mods=modifiers();
					state._fsp--;
					if (state.failed) return result;
					pushFollow(FOLLOW_methodlevel_element_in_methodlevel_comment453);
					list=methodlevel_element(mods);
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = result.append(list); }
					}
					break;

				default :
					break loop3;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_methodlevel_comment466); if (state.failed) return result;
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "methodlevel_comment"



	// $ANTLR start "methodlevel_element"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:263:1: methodlevel_element[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> r = null] : (result= field_or_method_declaration[mods] |result= set_statement[mods] |result= loop_specification[mods] |result= assert_statement[mods] |result= assume_statement[mods] |result= nowarn_pragma[mods] |result= debug_statement[mods] |result= block_specification[mods] );
	public final ImmutableList<TextualJMLConstruct> methodlevel_element(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  null;


		ImmutableList<TextualJMLConstruct> result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:268:9: (result= field_or_method_declaration[mods] |result= set_statement[mods] |result= loop_specification[mods] |result= assert_statement[mods] |result= assume_statement[mods] |result= nowarn_pragma[mods] |result= debug_statement[mods] |result= block_specification[mods] )
			int alt4=8;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt4=1;
				}
				break;
			case SET:
				{
				alt4=2;
				}
				break;
			case LOOP_INVARIANT:
			case MAINTAINING:
			case MAINTAINING_REDUNDANTLY:
			case LOOP_INVARIANT_REDUNDANTLY:
				{
				alt4=3;
				}
				break;
			case ASSERT:
			case ASSERT_REDUNDANTLY:
			case UNREACHABLE:
				{
				alt4=4;
				}
				break;
			case ASSUME:
			case ASSUME_REDUNDANTLY:
				{
				alt4=5;
				}
				break;
			case NOWARN:
				{
				alt4=6;
				}
				break;
			case DEBUG:
				{
				alt4=7;
				}
				break;
			case ABSTRACT:
			case ACCESSIBLE:
			case ACCESSIBLE_REDUNDANTLY:
			case ALSO:
			case ASSIGNABLE:
			case ASSIGNABLE_RED:
			case BEHAVIOR:
			case BEHAVIOUR:
			case BREAKS:
			case BREAK_BEHAVIOR:
			case BREAK_BEHAVIOUR:
			case CAPTURES:
			case CAPTURES_RED:
			case CODE_BIGINT_MATH:
			case CODE_JAVA_MATH:
			case CONTINUES:
			case CONTINUE_BEHAVIOR:
			case CONTINUE_BEHAVIOUR:
			case DETERMINES:
			case DIVERGES:
			case DIVERGES_RED:
			case DURATION:
			case DURATION_RED:
			case ENSURES:
			case ENSURES_FREE:
			case ENSURES_RED:
			case EXCEPTIONAL_BEHAVIOR:
			case EXCEPTIONAL_BEHAVIOUR:
			case EXSURES:
			case EXSURES_RED:
			case FINAL:
			case FORALL:
			case FOR_EXAMPLE:
			case GHOST:
			case HELPER:
			case IMPLIES_THAT:
			case INSTANCE:
			case JOIN_PROC:
			case MEASURED_BY:
			case MEASURED_BY_REDUNDANTLY:
			case MODEL:
			case MODEL_BEHAVIOR:
			case MODEL_BEHAVIOUR:
			case MODIFIABLE:
			case MODIFIABLE_RED:
			case MODIFIES:
			case MODIFIES_RED:
			case NEST_START:
			case NON_NULL:
			case NORMAL_BEHAVIOR:
			case NORMAL_BEHAVIOUR:
			case NO_STATE:
			case NULLABLE:
			case NULLABLE_BY_DEFAULT:
			case OLD:
			case POST:
			case POST_RED:
			case PRE:
			case PRE_RED:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case PURE:
			case REQUIRES:
			case REQUIRES_RED:
			case RESPECTS:
			case RETURNS:
			case RETURN_BEHAVIOR:
			case RETURN_BEHAVIOUR:
			case SEPARATES:
			case SIGNALS:
			case SIGNALS_ONLY:
			case SIGNALS_ONLY_RED:
			case SIGNALS_RED:
			case SPEC_BIGINT_MATH:
			case SPEC_JAVA_MATH:
			case SPEC_NAME:
			case SPEC_PROTECTED:
			case SPEC_PUBLIC:
			case STATIC:
			case STRICTLY_PURE:
			case TWO_STATE:
			case WHEN:
			case WHEN_RED:
			case WORKING_SPACE:
			case WORKING_SPACE_RED:
			case CODE_SAVE_MATH:
			case SPEC_SAVE_MATH:
				{
				alt4=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:269:9: result= field_or_method_declaration[mods]
					{
					pushFollow(FOLLOW_field_or_method_declaration_in_methodlevel_element507);
					result=field_or_method_declaration(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:270:9: result= set_statement[mods]
					{
					pushFollow(FOLLOW_set_statement_in_methodlevel_element520);
					result=set_statement(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:271:9: result= loop_specification[mods]
					{
					pushFollow(FOLLOW_loop_specification_in_methodlevel_element533);
					result=loop_specification(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:272:9: result= assert_statement[mods]
					{
					pushFollow(FOLLOW_assert_statement_in_methodlevel_element546);
					result=assert_statement(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:273:9: result= assume_statement[mods]
					{
					pushFollow(FOLLOW_assume_statement_in_methodlevel_element559);
					result=assume_statement(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 6 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:274:9: result= nowarn_pragma[mods]
					{
					pushFollow(FOLLOW_nowarn_pragma_in_methodlevel_element572);
					result=nowarn_pragma(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 7 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:275:9: result= debug_statement[mods]
					{
					pushFollow(FOLLOW_debug_statement_in_methodlevel_element585);
					result=debug_statement(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 8 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:276:9: result= block_specification[mods]
					{
					pushFollow(FOLLOW_block_specification_in_methodlevel_element598);
					result=block_specification(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;

			}
			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "methodlevel_element"



	// $ANTLR start "modifiers"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:285:1: modifiers returns [ImmutableList<String> result = ImmutableSLList.<String>nil()] : ( options {greedy=true; } :s= modifier )* ;
	public final ImmutableList<String> modifiers() throws RecognitionException, SLTranslationException {
		ImmutableList<String> result =  ImmutableSLList.<String>nil();


		String s =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:288:5: ( ( options {greedy=true; } :s= modifier )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:289:5: ( options {greedy=true; } :s= modifier )*
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:289:5: ( options {greedy=true; } :s= modifier )*
			loop5:
			while (true) {
				int alt5=2;
				alt5 = dfa5.predict(input);
				switch (alt5) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:292:2: s= modifier
					{
					pushFollow(FOLLOW_modifier_in_modifiers648);
					s=modifier();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = result.append(s); }
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "modifiers"



	// $ANTLR start "modifier"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:297:1: modifier returns [String result = null] : (abs= ABSTRACT |fin= FINAL |gho= GHOST |hel= HELPER |ins= INSTANCE |mod= MODEL |nnu= NON_NULL |nul= NULLABLE |nld= NULLABLE_BY_DEFAULT |pri= PRIVATE |pro= PROTECTED |pub= PUBLIC |pur= PURE |stp= STRICTLY_PURE |spr= SPEC_PROTECTED |spu= SPEC_PUBLIC |sta= STATIC |tst= TWO_STATE |nst= NO_STATE |sjm= SPEC_JAVA_MATH |ssm= SPEC_SAVE_MATH |sbm= SPEC_BIGINT_MATH |cjm= CODE_JAVA_MATH |csm= CODE_SAVE_MATH |cbm= CODE_BIGINT_MATH );
	public final String modifier() throws RecognitionException {
		String result =  null;


		Token abs=null;
		Token fin=null;
		Token gho=null;
		Token hel=null;
		Token ins=null;
		Token mod=null;
		Token nnu=null;
		Token nul=null;
		Token nld=null;
		Token pri=null;
		Token pro=null;
		Token pub=null;
		Token pur=null;
		Token stp=null;
		Token spr=null;
		Token spu=null;
		Token sta=null;
		Token tst=null;
		Token nst=null;
		Token sjm=null;
		Token ssm=null;
		Token sbm=null;
		Token cjm=null;
		Token csm=null;
		Token cbm=null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:297:40: (abs= ABSTRACT |fin= FINAL |gho= GHOST |hel= HELPER |ins= INSTANCE |mod= MODEL |nnu= NON_NULL |nul= NULLABLE |nld= NULLABLE_BY_DEFAULT |pri= PRIVATE |pro= PROTECTED |pub= PUBLIC |pur= PURE |stp= STRICTLY_PURE |spr= SPEC_PROTECTED |spu= SPEC_PUBLIC |sta= STATIC |tst= TWO_STATE |nst= NO_STATE |sjm= SPEC_JAVA_MATH |ssm= SPEC_SAVE_MATH |sbm= SPEC_BIGINT_MATH |cjm= CODE_JAVA_MATH |csm= CODE_SAVE_MATH |cbm= CODE_BIGINT_MATH )
			int alt6=25;
			switch ( input.LA(1) ) {
			case ABSTRACT:
				{
				alt6=1;
				}
				break;
			case FINAL:
				{
				alt6=2;
				}
				break;
			case GHOST:
				{
				alt6=3;
				}
				break;
			case HELPER:
				{
				alt6=4;
				}
				break;
			case INSTANCE:
				{
				alt6=5;
				}
				break;
			case MODEL:
				{
				alt6=6;
				}
				break;
			case NON_NULL:
				{
				alt6=7;
				}
				break;
			case NULLABLE:
				{
				alt6=8;
				}
				break;
			case NULLABLE_BY_DEFAULT:
				{
				alt6=9;
				}
				break;
			case PRIVATE:
				{
				alt6=10;
				}
				break;
			case PROTECTED:
				{
				alt6=11;
				}
				break;
			case PUBLIC:
				{
				alt6=12;
				}
				break;
			case PURE:
				{
				alt6=13;
				}
				break;
			case STRICTLY_PURE:
				{
				alt6=14;
				}
				break;
			case SPEC_PROTECTED:
				{
				alt6=15;
				}
				break;
			case SPEC_PUBLIC:
				{
				alt6=16;
				}
				break;
			case STATIC:
				{
				alt6=17;
				}
				break;
			case TWO_STATE:
				{
				alt6=18;
				}
				break;
			case NO_STATE:
				{
				alt6=19;
				}
				break;
			case SPEC_JAVA_MATH:
				{
				alt6=20;
				}
				break;
			case SPEC_SAVE_MATH:
				{
				alt6=21;
				}
				break;
			case SPEC_BIGINT_MATH:
				{
				alt6=22;
				}
				break;
			case CODE_JAVA_MATH:
				{
				alt6=23;
				}
				break;
			case CODE_SAVE_MATH:
				{
				alt6=24;
				}
				break;
			case CODE_BIGINT_MATH:
				{
				alt6=25;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:298:9: abs= ABSTRACT
					{
					abs=(Token)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifier681); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = abs.getText(); }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:299:9: fin= FINAL
					{
					fin=(Token)match(input,FINAL,FOLLOW_FINAL_in_modifier706); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = fin.getText(); }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:300:9: gho= GHOST
					{
					gho=(Token)match(input,GHOST,FOLLOW_GHOST_in_modifier734); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = gho.getText(); }
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:301:9: hel= HELPER
					{
					hel=(Token)match(input,HELPER,FOLLOW_HELPER_in_modifier762); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = hel.getText(); }
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:302:9: ins= INSTANCE
					{
					ins=(Token)match(input,INSTANCE,FOLLOW_INSTANCE_in_modifier789); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = ins.getText(); }
					}
					break;
				case 6 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:303:9: mod= MODEL
					{
					mod=(Token)match(input,MODEL,FOLLOW_MODEL_in_modifier814); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = mod.getText(); }
					}
					break;
				case 7 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:304:9: nnu= NON_NULL
					{
					nnu=(Token)match(input,NON_NULL,FOLLOW_NON_NULL_in_modifier842); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = nnu.getText(); }
					}
					break;
				case 8 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:305:9: nul= NULLABLE
					{
					nul=(Token)match(input,NULLABLE,FOLLOW_NULLABLE_in_modifier867); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = nul.getText(); }
					}
					break;
				case 9 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:306:9: nld= NULLABLE_BY_DEFAULT
					{
					nld=(Token)match(input,NULLABLE_BY_DEFAULT,FOLLOW_NULLABLE_BY_DEFAULT_in_modifier892); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = nld.getText(); }
					}
					break;
				case 10 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:307:9: pri= PRIVATE
					{
					pri=(Token)match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier906); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = pri.getText(); }
					}
					break;
				case 11 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:308:9: pro= PROTECTED
					{
					pro=(Token)match(input,PROTECTED,FOLLOW_PROTECTED_in_modifier932); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = pro.getText(); }
					}
					break;
				case 12 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:309:9: pub= PUBLIC
					{
					pub=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier956); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = pub.getText(); }
					}
					break;
				case 13 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:310:9: pur= PURE
					{
					pur=(Token)match(input,PURE,FOLLOW_PURE_in_modifier983); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = pur.getText(); }
					}
					break;
				case 14 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:311:9: stp= STRICTLY_PURE
					{
					stp=(Token)match(input,STRICTLY_PURE,FOLLOW_STRICTLY_PURE_in_modifier1012); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = stp.getText(); }
					}
					break;
				case 15 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:312:9: spr= SPEC_PROTECTED
					{
					spr=(Token)match(input,SPEC_PROTECTED,FOLLOW_SPEC_PROTECTED_in_modifier1032); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = spr.getText(); }
					}
					break;
				case 16 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:313:9: spu= SPEC_PUBLIC
					{
					spu=(Token)match(input,SPEC_PUBLIC,FOLLOW_SPEC_PUBLIC_in_modifier1051); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = spu.getText(); }
					}
					break;
				case 17 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:314:9: sta= STATIC
					{
					sta=(Token)match(input,STATIC,FOLLOW_STATIC_in_modifier1073); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = sta.getText(); }
					}
					break;
				case 18 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:315:9: tst= TWO_STATE
					{
					tst=(Token)match(input,TWO_STATE,FOLLOW_TWO_STATE_in_modifier1100); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = tst.getText(); }
					}
					break;
				case 19 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:316:9: nst= NO_STATE
					{
					nst=(Token)match(input,NO_STATE,FOLLOW_NO_STATE_in_modifier1124); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = nst.getText(); }
					}
					break;
				case 20 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:317:9: sjm= SPEC_JAVA_MATH
					{
					sjm=(Token)match(input,SPEC_JAVA_MATH,FOLLOW_SPEC_JAVA_MATH_in_modifier1149); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = sjm.getText(); }
					}
					break;
				case 21 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:318:9: ssm= SPEC_SAVE_MATH
					{
					ssm=(Token)match(input,SPEC_SAVE_MATH,FOLLOW_SPEC_SAVE_MATH_in_modifier1168); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = ssm.getText(); }
					}
					break;
				case 22 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:319:9: sbm= SPEC_BIGINT_MATH
					{
					sbm=(Token)match(input,SPEC_BIGINT_MATH,FOLLOW_SPEC_BIGINT_MATH_in_modifier1187); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = sbm.getText(); }
					}
					break;
				case 23 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:320:9: cjm= CODE_JAVA_MATH
					{
					cjm=(Token)match(input,CODE_JAVA_MATH,FOLLOW_CODE_JAVA_MATH_in_modifier1204); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = cjm.getText(); }
					}
					break;
				case 24 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:321:9: csm= CODE_SAVE_MATH
					{
					csm=(Token)match(input,CODE_SAVE_MATH,FOLLOW_CODE_SAVE_MATH_in_modifier1223); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = csm.getText(); }
					}
					break;
				case 25 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:322:9: cbm= CODE_BIGINT_MATH
					{
					cbm=(Token)match(input,CODE_BIGINT_MATH,FOLLOW_CODE_BIGINT_MATH_in_modifier1242); if (state.failed) return result;
					if ( state.backtracking==0 ) { result = cbm.getText(); }
					}
					break;

			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "modifier"



	// $ANTLR start "class_invariant"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:331:1: class_invariant[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : invariant_keyword ps= expression ;
	public final ImmutableList<TextualJMLConstruct> class_invariant(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  null;


		PositionedString ps =null;


		    String name = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:337:5: ( invariant_keyword ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:338:5: invariant_keyword ps= expression
			{
			pushFollow(FOLLOW_invariant_keyword_in_class_invariant1282);
			invariant_keyword();
			state._fsp--;
			if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_class_invariant1291);
			ps=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
				TextualJMLClassInv inv = name == null ? new TextualJMLClassInv(mods, ps) : new TextualJMLClassInv(mods, ps, name);
				result = ImmutableSLList.<TextualJMLConstruct>nil().prepend(inv);
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "class_invariant"



	// $ANTLR start "axiom_name"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:348:1: axiom_name returns [String result = null] : AXIOM_NAME_BEGIN id= IDENT AXIOM_NAME_END ;
	public final String axiom_name() throws RecognitionException, SLTranslationException {
		String result =  null;


		Token id=null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:349:5: ( AXIOM_NAME_BEGIN id= IDENT AXIOM_NAME_END )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:350:5: AXIOM_NAME_BEGIN id= IDENT AXIOM_NAME_END
			{
			match(input,AXIOM_NAME_BEGIN,FOLLOW_AXIOM_NAME_BEGIN_in_axiom_name1320); if (state.failed) return result;
			id=(Token)match(input,IDENT,FOLLOW_IDENT_in_axiom_name1324); if (state.failed) return result;
			match(input,AXIOM_NAME_END,FOLLOW_AXIOM_NAME_END_in_axiom_name1326); if (state.failed) return result;
			if ( state.backtracking==0 ) { result = id.getText(); }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "axiom_name"



	// $ANTLR start "invariant_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:355:1: invariant_keyword : ( INVARIANT | INVARIANT_RED );
	public final void invariant_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:356:9: ( INVARIANT | INVARIANT_RED )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= INVARIANT && input.LA(1) <= INVARIANT_RED) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "invariant_keyword"



	// $ANTLR start "class_axiom"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:362:1: class_axiom[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : AXIOM ps= expression ;
	public final ImmutableList<TextualJMLConstruct> class_axiom(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  null;


		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:365:5: ( AXIOM ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:366:5: AXIOM ps= expression
			{
			match(input,AXIOM,FOLLOW_AXIOM_in_class_axiom1416); if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_class_axiom1420);
			ps=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
			                         TextualJMLClassAxiom ax = new TextualJMLClassAxiom(mods, ps);
			                         result = ImmutableSLList.<TextualJMLConstruct>nil().prepend(ax);
			                         // axiom statements may not be prefixed with any modifiers (see Sect. 8 of the JML reference manual)
			                         if (!mods.isEmpty())
			                             raiseNotSupported("modifiers in axiom clause");
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "class_axiom"



	// $ANTLR start "initially_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:376:1: initially_clause[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : INITIALLY ps= expression ;
	public final ImmutableList<TextualJMLConstruct> initially_clause(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  null;


		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:379:5: ( INITIALLY ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:380:5: INITIALLY ps= expression
			{
			match(input,INITIALLY,FOLLOW_INITIALLY_in_initially_clause1485); if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_initially_clause1489);
			ps=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
			    TextualJMLInitially ini = new TextualJMLInitially(mods, ps);
			    result = ImmutableSLList.<TextualJMLConstruct>nil().prepend(ini);
			    for (String s: mods) {
			        if (!(s.equals("public")||s.equals("private")||s.equals("protected")))
			            raiseNotSupported("modifier "+s+" in initially clause");
			        }
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "initially_clause"



	// $ANTLR start "method_specification"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:395:1: method_specification[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> r = null] : ( also_keyword )* result= spec_case[mods] ( options {greedy=true; } : ( also_keyword )+ list= spec_case[ImmutableSLList.<String>nil()] )* ;
	public final ImmutableList<TextualJMLConstruct> method_specification(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  null;


		ImmutableList<TextualJMLConstruct> result =null;
		ImmutableList<TextualJMLConstruct> list =null;


		    list = ImmutableSLList.<TextualJMLConstruct>nil();
		    result = r;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:403:5: ( ( also_keyword )* result= spec_case[mods] ( options {greedy=true; } : ( also_keyword )+ list= spec_case[ImmutableSLList.<String>nil()] )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:404:5: ( also_keyword )* result= spec_case[mods] ( options {greedy=true; } : ( also_keyword )+ list= spec_case[ImmutableSLList.<String>nil()] )*
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:404:5: ( also_keyword )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==ALSO||LA7_0==FOR_EXAMPLE||LA7_0==IMPLIES_THAT) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:404:6: also_keyword
					{
					pushFollow(FOLLOW_also_keyword_in_method_specification1534);
					also_keyword();
					state._fsp--;
					if (state.failed) return r;
					}
					break;

				default :
					break loop7;
				}
			}

			pushFollow(FOLLOW_spec_case_in_method_specification1544);
			result=spec_case(mods);
			state._fsp--;
			if (state.failed) return r;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:406:5: ( options {greedy=true; } : ( also_keyword )+ list= spec_case[ImmutableSLList.<String>nil()] )*
			loop9:
			while (true) {
				int alt9=2;
				alt9 = dfa9.predict(input);
				switch (alt9) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:409:2: ( also_keyword )+ list= spec_case[ImmutableSLList.<String>nil()]
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:409:2: ( also_keyword )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==ALSO||LA8_0==FOR_EXAMPLE||LA8_0==IMPLIES_THAT) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:409:3: also_keyword
							{
							pushFollow(FOLLOW_also_keyword_in_method_specification1570);
							also_keyword();
							state._fsp--;
							if (state.failed) return r;
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							if (state.backtracking>0) {state.failed=true; return r;}
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					pushFollow(FOLLOW_spec_case_in_method_specification1576);
					list=spec_case(ImmutableSLList.<String>nil());
					state._fsp--;
					if (state.failed) return r;
					if ( state.backtracking==0 ) {
						    result = result.append(list);
						}
					}
					break;

				default :
					break loop9;
				}
			}

			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "method_specification"



	// $ANTLR start "also_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:417:1: also_keyword : ( ALSO | FOR_EXAMPLE | IMPLIES_THAT );
	public final void also_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:418:2: ( ALSO | FOR_EXAMPLE | IMPLIES_THAT )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( input.LA(1)==ALSO||input.LA(1)==FOR_EXAMPLE||input.LA(1)==IMPLIES_THAT ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "also_keyword"



	// $ANTLR start "spec_case"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:425:1: spec_case[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> r = null] : (result= lightweight_spec_case[mods] |result= heavyweight_spec_case[mods] );
	public final ImmutableList<TextualJMLConstruct> spec_case(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  null;


		ImmutableList<TextualJMLConstruct> result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:430:2: (result= lightweight_spec_case[mods] |result= heavyweight_spec_case[mods] )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= ACCESSIBLE && LA10_0 <= ACCESSIBLE_REDUNDANTLY)||(LA10_0 >= ASSIGNABLE && LA10_0 <= ASSIGNABLE_RED)||LA10_0==BREAKS||(LA10_0 >= CAPTURES && LA10_0 <= CAPTURES_RED)||LA10_0==CONTINUES||LA10_0==DETERMINES||(LA10_0 >= DIVERGES && LA10_0 <= DIVERGES_RED)||(LA10_0 >= DURATION && LA10_0 <= DURATION_RED)||(LA10_0 >= ENSURES && LA10_0 <= ENSURES_RED)||(LA10_0 >= EXSURES && LA10_0 <= EXSURES_RED)||LA10_0==FORALL||LA10_0==JOIN_PROC||(LA10_0 >= MEASURED_BY && LA10_0 <= MEASURED_BY_REDUNDANTLY)||(LA10_0 >= MODIFIABLE && LA10_0 <= MODIFIES_RED)||LA10_0==NEST_START||(LA10_0 >= OLD && LA10_0 <= PRE_RED)||LA10_0==REQUIRES||(LA10_0 >= REQUIRES_RED && LA10_0 <= RETURNS)||LA10_0==SEPARATES||(LA10_0 >= SIGNALS && LA10_0 <= SIGNALS_RED)||LA10_0==SPEC_NAME||(LA10_0 >= WHEN && LA10_0 <= WORKING_SPACE_RED)) ) {
				alt10=1;
			}
			else if ( (LA10_0==ABSTRACT||(LA10_0 >= BEHAVIOR && LA10_0 <= BEHAVIOUR)||(LA10_0 >= BREAK_BEHAVIOR && LA10_0 <= BREAK_BEHAVIOUR)||(LA10_0 >= CODE_BIGINT_MATH && LA10_0 <= CODE_JAVA_MATH)||(LA10_0 >= CONTINUE_BEHAVIOR && LA10_0 <= CONTINUE_BEHAVIOUR)||(LA10_0 >= EXCEPTIONAL_BEHAVIOR && LA10_0 <= EXCEPTIONAL_BEHAVIOUR)||LA10_0==FINAL||(LA10_0 >= GHOST && LA10_0 <= HELPER)||LA10_0==INSTANCE||(LA10_0 >= MODEL && LA10_0 <= MODEL_BEHAVIOUR)||(LA10_0 >= NON_NULL && LA10_0 <= NORMAL_BEHAVIOUR)||(LA10_0 >= NO_STATE && LA10_0 <= NULLABLE_BY_DEFAULT)||(LA10_0 >= PRIVATE && LA10_0 <= PURE)||(LA10_0 >= RETURN_BEHAVIOR && LA10_0 <= RETURN_BEHAVIOUR)||(LA10_0 >= SPEC_BIGINT_MATH && LA10_0 <= SPEC_JAVA_MATH)||(LA10_0 >= SPEC_PROTECTED && LA10_0 <= SPEC_PUBLIC)||LA10_0==STATIC||LA10_0==STRICTLY_PURE||LA10_0==TWO_STATE||LA10_0==CODE_SAVE_MATH||LA10_0==SPEC_SAVE_MATH) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:431:2: result= lightweight_spec_case[mods]
					{
					pushFollow(FOLLOW_lightweight_spec_case_in_spec_case1650);
					result=lightweight_spec_case(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:432:8: result= heavyweight_spec_case[mods]
					{
					pushFollow(FOLLOW_heavyweight_spec_case_in_spec_case1662);
					result=heavyweight_spec_case(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;

			}
			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "spec_case"



	// $ANTLR start "lightweight_spec_case"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:441:1: lightweight_spec_case[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> r = null] : result= generic_spec_case[mods, Behavior.NONE] ;
	public final ImmutableList<TextualJMLConstruct> lightweight_spec_case(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  null;


		ImmutableList<TextualJMLConstruct> result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:446:5: (result= generic_spec_case[mods, Behavior.NONE] )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:447:5: result= generic_spec_case[mods, Behavior.NONE]
			{
			pushFollow(FOLLOW_generic_spec_case_in_lightweight_spec_case1705);
			result=generic_spec_case(mods, Behavior.NONE);
			state._fsp--;
			if (state.failed) return r;
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "lightweight_spec_case"



	// $ANTLR start "heavyweight_spec_case"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:456:1: heavyweight_spec_case[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> r = null] : (s= modifier )? (result= behavior_spec_case[mods] |result= break_behavior_spec_case[mods] |result= continue_behavior_spec_case[mods] |result= exceptional_behavior_spec_case[mods] |result= normal_behavior_spec_case[mods] |result= model_behavior_spec_case[mods] |result= return_behavior_spec_case[mods] ) ;
	public final ImmutableList<TextualJMLConstruct> heavyweight_spec_case(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  null;


		String s =null;
		ImmutableList<TextualJMLConstruct> result =null;


		    result = r;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:463:5: ( (s= modifier )? (result= behavior_spec_case[mods] |result= break_behavior_spec_case[mods] |result= continue_behavior_spec_case[mods] |result= exceptional_behavior_spec_case[mods] |result= normal_behavior_spec_case[mods] |result= model_behavior_spec_case[mods] |result= return_behavior_spec_case[mods] ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:464:5: (s= modifier )? (result= behavior_spec_case[mods] |result= break_behavior_spec_case[mods] |result= continue_behavior_spec_case[mods] |result= exceptional_behavior_spec_case[mods] |result= normal_behavior_spec_case[mods] |result= model_behavior_spec_case[mods] |result= return_behavior_spec_case[mods] )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:464:5: (s= modifier )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ABSTRACT||(LA11_0 >= CODE_BIGINT_MATH && LA11_0 <= CODE_JAVA_MATH)||LA11_0==FINAL||(LA11_0 >= GHOST && LA11_0 <= HELPER)||LA11_0==INSTANCE||LA11_0==MODEL||LA11_0==NON_NULL||(LA11_0 >= NO_STATE && LA11_0 <= NULLABLE_BY_DEFAULT)||(LA11_0 >= PRIVATE && LA11_0 <= PURE)||(LA11_0 >= SPEC_BIGINT_MATH && LA11_0 <= SPEC_JAVA_MATH)||(LA11_0 >= SPEC_PROTECTED && LA11_0 <= SPEC_PUBLIC)||LA11_0==STATIC||LA11_0==STRICTLY_PURE||LA11_0==TWO_STATE||LA11_0==CODE_SAVE_MATH||LA11_0==SPEC_SAVE_MATH) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:464:6: s= modifier
					{
					pushFollow(FOLLOW_modifier_in_heavyweight_spec_case1749);
					s=modifier();
					state._fsp--;
					if (state.failed) return r;
					if ( state.backtracking==0 ) { mods = mods.append(s); }
					}
					break;

			}

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:465:5: (result= behavior_spec_case[mods] |result= break_behavior_spec_case[mods] |result= continue_behavior_spec_case[mods] |result= exceptional_behavior_spec_case[mods] |result= normal_behavior_spec_case[mods] |result= model_behavior_spec_case[mods] |result= return_behavior_spec_case[mods] )
			int alt12=7;
			switch ( input.LA(1) ) {
			case BEHAVIOR:
			case BEHAVIOUR:
				{
				alt12=1;
				}
				break;
			case BREAK_BEHAVIOR:
			case BREAK_BEHAVIOUR:
				{
				alt12=2;
				}
				break;
			case CONTINUE_BEHAVIOR:
			case CONTINUE_BEHAVIOUR:
				{
				alt12=3;
				}
				break;
			case EXCEPTIONAL_BEHAVIOR:
			case EXCEPTIONAL_BEHAVIOUR:
				{
				alt12=4;
				}
				break;
			case NORMAL_BEHAVIOR:
			case NORMAL_BEHAVIOUR:
				{
				alt12=5;
				}
				break;
			case MODEL_BEHAVIOR:
			case MODEL_BEHAVIOUR:
				{
				alt12=6;
				}
				break;
			case RETURN_BEHAVIOR:
			case RETURN_BEHAVIOUR:
				{
				alt12=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:466:6: result= behavior_spec_case[mods]
					{
					pushFollow(FOLLOW_behavior_spec_case_in_heavyweight_spec_case1769);
					result=behavior_spec_case(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:467:10: result= break_behavior_spec_case[mods]
					{
					pushFollow(FOLLOW_break_behavior_spec_case_in_heavyweight_spec_case1783);
					result=break_behavior_spec_case(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:468:10: result= continue_behavior_spec_case[mods]
					{
					pushFollow(FOLLOW_continue_behavior_spec_case_in_heavyweight_spec_case1797);
					result=continue_behavior_spec_case(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:469:10: result= exceptional_behavior_spec_case[mods]
					{
					pushFollow(FOLLOW_exceptional_behavior_spec_case_in_heavyweight_spec_case1811);
					result=exceptional_behavior_spec_case(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:470:6: result= normal_behavior_spec_case[mods]
					{
					pushFollow(FOLLOW_normal_behavior_spec_case_in_heavyweight_spec_case1821);
					result=normal_behavior_spec_case(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 6 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:471:6: result= model_behavior_spec_case[mods]
					{
					pushFollow(FOLLOW_model_behavior_spec_case_in_heavyweight_spec_case1831);
					result=model_behavior_spec_case(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 7 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:472:6: result= return_behavior_spec_case[mods]
					{
					pushFollow(FOLLOW_return_behavior_spec_case_in_heavyweight_spec_case1841);
					result=return_behavior_spec_case(mods);
					state._fsp--;
					if (state.failed) return r;
					}
					break;

			}

			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "heavyweight_spec_case"



	// $ANTLR start "behavior_spec_case"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:477:1: behavior_spec_case[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> r = null] : behavior_keyword result= generic_spec_case[mods, Behavior.BEHAVIOR] ;
	public final ImmutableList<TextualJMLConstruct> behavior_spec_case(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  null;


		ImmutableList<TextualJMLConstruct> result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:482:5: ( behavior_keyword result= generic_spec_case[mods, Behavior.BEHAVIOR] )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:483:5: behavior_keyword result= generic_spec_case[mods, Behavior.BEHAVIOR]
			{
			pushFollow(FOLLOW_behavior_keyword_in_behavior_spec_case1883);
			behavior_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_generic_spec_case_in_behavior_spec_case1891);
			result=generic_spec_case(mods, Behavior.BEHAVIOR);
			state._fsp--;
			if (state.failed) return r;
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "behavior_spec_case"



	// $ANTLR start "behavior_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:488:1: behavior_keyword : ( BEHAVIOR | BEHAVIOUR );
	public final void behavior_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:489:2: ( BEHAVIOR | BEHAVIOUR )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= BEHAVIOR && input.LA(1) <= BEHAVIOUR) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "behavior_keyword"



	// $ANTLR start "normal_behavior_spec_case"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:495:1: normal_behavior_spec_case[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> r = null] : normal_behavior_keyword result= generic_spec_case[mods, Behavior.NORMAL_BEHAVIOR] ;
	public final ImmutableList<TextualJMLConstruct> normal_behavior_spec_case(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  null;


		ImmutableList<TextualJMLConstruct> result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:500:5: ( normal_behavior_keyword result= generic_spec_case[mods, Behavior.NORMAL_BEHAVIOR] )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:501:5: normal_behavior_keyword result= generic_spec_case[mods, Behavior.NORMAL_BEHAVIOR]
			{
			pushFollow(FOLLOW_normal_behavior_keyword_in_normal_behavior_spec_case1947);
			normal_behavior_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_generic_spec_case_in_normal_behavior_spec_case1955);
			result=generic_spec_case(mods, Behavior.NORMAL_BEHAVIOR);
			state._fsp--;
			if (state.failed) return r;
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "normal_behavior_spec_case"



	// $ANTLR start "normal_behavior_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:506:1: normal_behavior_keyword : ( NORMAL_BEHAVIOR | NORMAL_BEHAVIOUR );
	public final void normal_behavior_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:507:2: ( NORMAL_BEHAVIOR | NORMAL_BEHAVIOUR )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= NORMAL_BEHAVIOR && input.LA(1) <= NORMAL_BEHAVIOUR) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "normal_behavior_keyword"



	// $ANTLR start "model_behavior_spec_case"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:512:1: model_behavior_spec_case[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> r = null] : model_behavior_keyword result= generic_spec_case[mods, Behavior.MODEL_BEHAVIOR] ;
	public final ImmutableList<TextualJMLConstruct> model_behavior_spec_case(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  null;


		ImmutableList<TextualJMLConstruct> result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:517:5: ( model_behavior_keyword result= generic_spec_case[mods, Behavior.MODEL_BEHAVIOR] )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:518:5: model_behavior_keyword result= generic_spec_case[mods, Behavior.MODEL_BEHAVIOR]
			{
			pushFollow(FOLLOW_model_behavior_keyword_in_model_behavior_spec_case2010);
			model_behavior_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_generic_spec_case_in_model_behavior_spec_case2018);
			result=generic_spec_case(mods, Behavior.MODEL_BEHAVIOR);
			state._fsp--;
			if (state.failed) return r;
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "model_behavior_spec_case"



	// $ANTLR start "model_behavior_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:523:1: model_behavior_keyword : ( MODEL_BEHAVIOR | MODEL_BEHAVIOUR );
	public final void model_behavior_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:524:7: ( MODEL_BEHAVIOR | MODEL_BEHAVIOUR )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= MODEL_BEHAVIOR && input.LA(1) <= MODEL_BEHAVIOUR) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "model_behavior_keyword"



	// $ANTLR start "exceptional_behavior_spec_case"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:529:1: exceptional_behavior_spec_case[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> r = null] : exceptional_behavior_keyword result= generic_spec_case[mods, Behavior.EXCEPTIONAL_BEHAVIOR] ;
	public final ImmutableList<TextualJMLConstruct> exceptional_behavior_spec_case(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  null;


		ImmutableList<TextualJMLConstruct> result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:534:5: ( exceptional_behavior_keyword result= generic_spec_case[mods, Behavior.EXCEPTIONAL_BEHAVIOR] )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:535:5: exceptional_behavior_keyword result= generic_spec_case[mods, Behavior.EXCEPTIONAL_BEHAVIOR]
			{
			pushFollow(FOLLOW_exceptional_behavior_keyword_in_exceptional_behavior_spec_case2077);
			exceptional_behavior_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_generic_spec_case_in_exceptional_behavior_spec_case2085);
			result=generic_spec_case(mods, Behavior.EXCEPTIONAL_BEHAVIOR);
			state._fsp--;
			if (state.failed) return r;
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "exceptional_behavior_spec_case"



	// $ANTLR start "exceptional_behavior_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:540:1: exceptional_behavior_keyword : ( EXCEPTIONAL_BEHAVIOR | EXCEPTIONAL_BEHAVIOUR );
	public final void exceptional_behavior_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:541:2: ( EXCEPTIONAL_BEHAVIOR | EXCEPTIONAL_BEHAVIOUR )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= EXCEPTIONAL_BEHAVIOR && input.LA(1) <= EXCEPTIONAL_BEHAVIOUR) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exceptional_behavior_keyword"



	// $ANTLR start "generic_spec_case"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:552:1: generic_spec_case[ImmutableList<String> mods, Behavior b] returns [ImmutableList<TextualJMLConstruct> r\n\t\t = ImmutableSLList.<TextualJMLConstruct>nil()] : (abbrvs= spec_var_decls )? ( (requires= spec_header (requires_free= free_spec_header )? ) ( options {greedy=true; } :result= generic_spec_body[mods, b, result] )? |result= generic_spec_body[mods, b, result] ) ;
	public final ImmutableList<TextualJMLConstruct> generic_spec_case(ImmutableList<String> mods, Behavior b) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  ImmutableSLList.<TextualJMLConstruct>nil();


		ImmutableList<PositionedString[]> abbrvs =null;
		ImmutableList<PositionedString> requires =null;
		ImmutableList<PositionedString> requires_free =null;
		ImmutableList<TextualJMLConstruct> result =null;


		    result = r;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:560:5: ( (abbrvs= spec_var_decls )? ( (requires= spec_header (requires_free= free_spec_header )? ) ( options {greedy=true; } :result= generic_spec_body[mods, b, result] )? |result= generic_spec_body[mods, b, result] ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:561:5: (abbrvs= spec_var_decls )? ( (requires= spec_header (requires_free= free_spec_header )? ) ( options {greedy=true; } :result= generic_spec_body[mods, b, result] )? |result= generic_spec_body[mods, b, result] )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:561:5: (abbrvs= spec_var_decls )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==FORALL||LA13_0==OLD) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:561:6: abbrvs= spec_var_decls
					{
					pushFollow(FOLLOW_spec_var_decls_in_generic_spec_case2148);
					abbrvs=spec_var_decls();
					state._fsp--;
					if (state.failed) return r;
					}
					break;

			}

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:562:5: ( (requires= spec_header (requires_free= free_spec_header )? ) ( options {greedy=true; } :result= generic_spec_body[mods, b, result] )? |result= generic_spec_body[mods, b, result] )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= PRE && LA16_0 <= PRE_RED)||LA16_0==REQUIRES||LA16_0==REQUIRES_RED) ) {
				alt16=1;
			}
			else if ( ((LA16_0 >= ACCESSIBLE && LA16_0 <= ACCESSIBLE_REDUNDANTLY)||(LA16_0 >= ASSIGNABLE && LA16_0 <= ASSIGNABLE_RED)||LA16_0==BREAKS||(LA16_0 >= CAPTURES && LA16_0 <= CAPTURES_RED)||LA16_0==CONTINUES||LA16_0==DETERMINES||(LA16_0 >= DIVERGES && LA16_0 <= DIVERGES_RED)||(LA16_0 >= DURATION && LA16_0 <= DURATION_RED)||(LA16_0 >= ENSURES && LA16_0 <= ENSURES_RED)||(LA16_0 >= EXSURES && LA16_0 <= EXSURES_RED)||LA16_0==JOIN_PROC||(LA16_0 >= MEASURED_BY && LA16_0 <= MEASURED_BY_REDUNDANTLY)||(LA16_0 >= MODIFIABLE && LA16_0 <= MODIFIES_RED)||LA16_0==NEST_START||(LA16_0 >= POST && LA16_0 <= POST_RED)||(LA16_0 >= RESPECTS && LA16_0 <= RETURNS)||LA16_0==SEPARATES||(LA16_0 >= SIGNALS && LA16_0 <= SIGNALS_RED)||LA16_0==SPEC_NAME||(LA16_0 >= WHEN && LA16_0 <= WORKING_SPACE_RED)) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:562:6: (requires= spec_header (requires_free= free_spec_header )? ) ( options {greedy=true; } :result= generic_spec_body[mods, b, result] )?
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:562:6: (requires= spec_header (requires_free= free_spec_header )? )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:562:7: requires= spec_header (requires_free= free_spec_header )?
					{
					pushFollow(FOLLOW_spec_header_in_generic_spec_case2160);
					requires=spec_header();
					state._fsp--;
					if (state.failed) return r;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:563:7: (requires_free= free_spec_header )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==REQUIRES_FREE) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:563:8: requires_free= free_spec_header
							{
							pushFollow(FOLLOW_free_spec_header_in_generic_spec_case2171);
							requires_free=free_spec_header();
							state._fsp--;
							if (state.failed) return r;
							}
							break;

					}

					}

					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:564:8: ( options {greedy=true; } :result= generic_spec_body[mods, b, result] )?
					int alt15=2;
					alt15 = dfa15.predict(input);
					switch (alt15) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:565:5: result= generic_spec_body[mods, b, result]
							{
							pushFollow(FOLLOW_generic_spec_body_in_generic_spec_case2204);
							result=generic_spec_body(mods, b, result);
							state._fsp--;
							if (state.failed) return r;
							}
							break;

					}

					if ( state.backtracking==0 ) {
							if (result.isEmpty()) {
							      result = result.append(new TextualJMLSpecCase(mods, b));
						        }

						        for(Iterator<TextualJMLConstruct> it = result.iterator();
					                    it.hasNext(); ) {
					                        TextualJMLSpecCase sc = (TextualJMLSpecCase) it.next();
					                        if (requires!=null) {
									sc.addRequires(requires);
					                        }
					                        if (requires_free!=null) {
									sc.addRequiresFree(requires_free);
					                        }
								if (abbrvs!=null) {
									for (PositionedString[] pz: abbrvs) {
										sc.addAbbreviation(pz);
								    }
								}
						        }
					        }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:587:7: result= generic_spec_body[mods, b, result]
					{
					pushFollow(FOLLOW_generic_spec_body_in_generic_spec_case2230);
					result=generic_spec_body(mods, b, result);
					state._fsp--;
					if (state.failed) return r;
					}
					break;

			}

			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "generic_spec_case"



	// $ANTLR start "spec_var_decls"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:592:1: spec_var_decls returns [ ImmutableList<PositionedString[]> result = ImmutableSLList.<PositionedString[]>nil() ] : (pz= old_clause | FORALL ps= expression )+ ;
	public final ImmutableList<PositionedString[]> spec_var_decls() throws RecognitionException, SLTranslationException {
		ImmutableList<PositionedString[]> result =  ImmutableSLList.<PositionedString[]>nil();


		PositionedString[] pz =null;
		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:595:5: ( (pz= old_clause | FORALL ps= expression )+ )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:596:5: (pz= old_clause | FORALL ps= expression )+
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:596:5: (pz= old_clause | FORALL ps= expression )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=3;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==OLD) ) {
					alt17=1;
				}
				else if ( (LA17_0==FORALL) ) {
					alt17=2;
				}

				switch (alt17) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:597:13: pz= old_clause
					{
					pushFollow(FOLLOW_old_clause_in_spec_var_decls2276);
					pz=old_clause();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = result.append(pz); }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:600:6: FORALL ps= expression
					{
					match(input,FORALL,FOLLOW_FORALL_in_spec_var_decls2311); if (state.failed) return result;
					pushFollow(FOLLOW_expression_in_spec_var_decls2315);
					ps=expression();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) {
						raiseNotSupported("specification variables");
					    }
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return result;}
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "spec_var_decls"



	// $ANTLR start "spec_header"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:608:1: spec_header returns [ImmutableList<PositionedString> result\n\t\t = ImmutableSLList.<PositionedString>nil()] : ( options {greedy=true; } :ps= requires_clause )+ ;
	public final ImmutableList<PositionedString> spec_header() throws RecognitionException, SLTranslationException {
		ImmutableList<PositionedString> result =  ImmutableSLList.<PositionedString>nil();


		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:612:5: ( ( options {greedy=true; } :ps= requires_clause )+ )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:613:5: ( options {greedy=true; } :ps= requires_clause )+
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:613:5: ( options {greedy=true; } :ps= requires_clause )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				alt18 = dfa18.predict(input);
				switch (alt18) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:616:2: ps= requires_clause
					{
					pushFollow(FOLLOW_requires_clause_in_spec_header2372);
					ps=requires_clause();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = result.append(ps); }
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					if (state.backtracking>0) {state.failed=true; return result;}
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
			}

			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "spec_header"



	// $ANTLR start "free_spec_header"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:621:1: free_spec_header returns [ImmutableList<PositionedString> result\n\t\t = ImmutableSLList.<PositionedString>nil()] : ( options {greedy=true; } :ps= requires_free_clause )+ ;
	public final ImmutableList<PositionedString> free_spec_header() throws RecognitionException, SLTranslationException {
		ImmutableList<PositionedString> result =  ImmutableSLList.<PositionedString>nil();


		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:625:5: ( ( options {greedy=true; } :ps= requires_free_clause )+ )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:626:5: ( options {greedy=true; } :ps= requires_free_clause )+
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:626:5: ( options {greedy=true; } :ps= requires_free_clause )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==REQUIRES_FREE) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:629:2: ps= requires_free_clause
					{
					pushFollow(FOLLOW_requires_free_clause_in_free_spec_header2426);
					ps=requires_free_clause();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { result = result.append(ps); }
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					if (state.backtracking>0) {state.failed=true; return result;}
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "free_spec_header"



	// $ANTLR start "requires_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:634:1: requires_clause returns [PositionedString r = null] : requires_keyword result= expression ;
	public final PositionedString requires_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:639:5: ( requires_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:640:5: requires_keyword result= expression
			{
			pushFollow(FOLLOW_requires_keyword_in_requires_clause2470);
			requires_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_requires_clause2474);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = flipHeaps("requires", result); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "requires_clause"



	// $ANTLR start "requires_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:644:1: requires_keyword : ( REQUIRES | REQUIRES_RED | PRE | PRE_RED );
	public final void requires_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:645:5: ( REQUIRES | REQUIRES_RED | PRE | PRE_RED )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= PRE && input.LA(1) <= PRE_RED)||input.LA(1)==REQUIRES||input.LA(1)==REQUIRES_RED ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "requires_keyword"



	// $ANTLR start "requires_free_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:651:1: requires_free_clause returns [PositionedString r = null] : REQUIRES_FREE result= expression ;
	public final PositionedString requires_free_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:656:5: ( REQUIRES_FREE result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:657:5: REQUIRES_FREE result= expression
			{
			match(input,REQUIRES_FREE,FOLLOW_REQUIRES_FREE_in_requires_free_clause2541); if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_requires_free_clause2545);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = flipHeaps("requires_free", result); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "requires_free_clause"



	// $ANTLR start "generic_spec_body"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:661:1: generic_spec_body[ImmutableList<String> mods, Behavior b, ImmutableList<TextualJMLConstruct> specs] returns [ImmutableList<TextualJMLConstruct> r = null] : (result= simple_spec_body[mods, b] | ( NEST_START result= generic_spec_case_seq[mods, b, specs] NEST_END ) );
	public final ImmutableList<TextualJMLConstruct> generic_spec_body(ImmutableList<String> mods, Behavior b, ImmutableList<TextualJMLConstruct> specs) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  null;


		ImmutableList<TextualJMLConstruct> result =null;


		    TextualJMLSpecCase sc;
		    result = r;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:669:5: (result= simple_spec_body[mods, b] | ( NEST_START result= generic_spec_case_seq[mods, b, specs] NEST_END ) )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( ((LA20_0 >= ACCESSIBLE && LA20_0 <= ACCESSIBLE_REDUNDANTLY)||(LA20_0 >= ASSIGNABLE && LA20_0 <= ASSIGNABLE_RED)||LA20_0==BREAKS||(LA20_0 >= CAPTURES && LA20_0 <= CAPTURES_RED)||LA20_0==CONTINUES||LA20_0==DETERMINES||(LA20_0 >= DIVERGES && LA20_0 <= DIVERGES_RED)||(LA20_0 >= DURATION && LA20_0 <= DURATION_RED)||(LA20_0 >= ENSURES && LA20_0 <= ENSURES_RED)||(LA20_0 >= EXSURES && LA20_0 <= EXSURES_RED)||LA20_0==JOIN_PROC||(LA20_0 >= MEASURED_BY && LA20_0 <= MEASURED_BY_REDUNDANTLY)||(LA20_0 >= MODIFIABLE && LA20_0 <= MODIFIES_RED)||(LA20_0 >= POST && LA20_0 <= POST_RED)||(LA20_0 >= RESPECTS && LA20_0 <= RETURNS)||LA20_0==SEPARATES||(LA20_0 >= SIGNALS && LA20_0 <= SIGNALS_RED)||LA20_0==SPEC_NAME||(LA20_0 >= WHEN && LA20_0 <= WORKING_SPACE_RED)) ) {
				alt20=1;
			}
			else if ( (LA20_0==NEST_START) ) {
				alt20=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:670:5: result= simple_spec_body[mods, b]
					{
					pushFollow(FOLLOW_simple_spec_body_in_generic_spec_body2584);
					result=simple_spec_body(mods, b);
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:672:5: ( NEST_START result= generic_spec_case_seq[mods, b, specs] NEST_END )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:672:5: ( NEST_START result= generic_spec_case_seq[mods, b, specs] NEST_END )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:673:7: NEST_START result= generic_spec_case_seq[mods, b, specs] NEST_END
					{
					match(input,NEST_START,FOLLOW_NEST_START_in_generic_spec_body2605); if (state.failed) return r;
					pushFollow(FOLLOW_generic_spec_case_seq_in_generic_spec_body2614);
					result=generic_spec_case_seq(mods, b, specs);
					state._fsp--;
					if (state.failed) return r;
					match(input,NEST_END,FOLLOW_NEST_END_in_generic_spec_body2622); if (state.failed) return r;
					}

					}
					break;

			}
			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "generic_spec_body"



	// $ANTLR start "generic_spec_case_seq"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:680:1: generic_spec_case_seq[ImmutableList<String> mods, Behavior b, ImmutableList<TextualJMLConstruct> specs] returns [ImmutableList<TextualJMLConstruct> r = ImmutableSLList.nil()] : result= generic_spec_case[mods, b] ( ( also_keyword )+ list= generic_spec_case[mods, b] )* ;
	public final ImmutableList<TextualJMLConstruct> generic_spec_case_seq(ImmutableList<String> mods, Behavior b, ImmutableList<TextualJMLConstruct> specs) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  ImmutableSLList.nil();


		ImmutableList<TextualJMLConstruct> result =null;
		ImmutableList<TextualJMLConstruct> list =null;


		    result = r;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:696:5: (result= generic_spec_case[mods, b] ( ( also_keyword )+ list= generic_spec_case[mods, b] )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:697:5: result= generic_spec_case[mods, b] ( ( also_keyword )+ list= generic_spec_case[mods, b] )*
			{
			pushFollow(FOLLOW_generic_spec_case_in_generic_spec_case_seq2665);
			result=generic_spec_case(mods, b);
			state._fsp--;
			if (state.failed) return r;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:698:5: ( ( also_keyword )+ list= generic_spec_case[mods, b] )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==ALSO||LA22_0==FOR_EXAMPLE||LA22_0==IMPLIES_THAT) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:699:9: ( also_keyword )+ list= generic_spec_case[mods, b]
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:699:9: ( also_keyword )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==ALSO||LA21_0==FOR_EXAMPLE||LA21_0==IMPLIES_THAT) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:699:10: also_keyword
							{
							pushFollow(FOLLOW_also_keyword_in_generic_spec_case_seq2683);
							also_keyword();
							state._fsp--;
							if (state.failed) return r;
							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							if (state.backtracking>0) {state.failed=true; return r;}
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					pushFollow(FOLLOW_generic_spec_case_in_generic_spec_case_seq2697);
					list=generic_spec_case(mods, b);
					state._fsp--;
					if (state.failed) return r;
					if ( state.backtracking==0 ) {
					            result = result.append(list);
					        }
					}
					break;

				default :
					break loop22;
				}
			}

			}

			if ( state.backtracking==0 ) {
			    for (TextualJMLConstruct tc: result)
			        for (TextualJMLConstruct z: specs) {
			            TextualJMLSpecCase a = (TextualJMLSpecCase) tc;
			            TextualJMLSpecCase c = (TextualJMLSpecCase) z;
			            System.out.println("---Contract A:\n"+a);
			            System.out.println("---Contract B:\n"+c);
			            r.append(a.merge(c));
			        }
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "generic_spec_case_seq"



	// $ANTLR start "simple_spec_body"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:708:1: simple_spec_body[ImmutableList<String> mods, Behavior b] returns [ImmutableList<TextualJMLConstruct> result = null] : ( options {greedy=true; } : simple_spec_body_clause[sc, b] )+ ;
	public final ImmutableList<TextualJMLConstruct> simple_spec_body(ImmutableList<String> mods, Behavior b) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  null;



		    TextualJMLSpecCase sc = new TextualJMLSpecCase(mods, b);
		    result = ImmutableSLList.<TextualJMLConstruct>nil().prepend(sc);

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:715:5: ( ( options {greedy=true; } : simple_spec_body_clause[sc, b] )+ )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:716:5: ( options {greedy=true; } : simple_spec_body_clause[sc, b] )+
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:716:5: ( options {greedy=true; } : simple_spec_body_clause[sc, b] )+
			int cnt23=0;
			loop23:
			while (true) {
				int alt23=2;
				alt23 = dfa23.predict(input);
				switch (alt23) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:719:2: simple_spec_body_clause[sc, b]
					{
					pushFollow(FOLLOW_simple_spec_body_clause_in_simple_spec_body2763);
					simple_spec_body_clause(sc, b);
					state._fsp--;
					if (state.failed) return result;
					}
					break;

				default :
					if ( cnt23 >= 1 ) break loop23;
					if (state.backtracking>0) {state.failed=true; return result;}
					EarlyExitException eee = new EarlyExitException(23, input);
					throw eee;
				}
				cnt23++;
			}

			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "simple_spec_body"



	// $ANTLR start "simple_spec_body_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:724:1: simple_spec_body_clause[TextualJMLSpecCase sc, Behavior b] : (ps= assignable_clause |ps= accessible_clause |ps= ensures_clause |ps= ensures_free_clause |ps= signals_clause |ps= joinproc_clause |ps= signals_only_clause |ps= diverges_clause |ps= measured_by_clause |ps= name_clause | captures_clause | when_clause | working_space_clause | duration_clause |ps= breaks_clause |ps= continues_clause |ps= returns_clause |ps= separates_clause |ps= determines_clause ) ;
	public final void simple_spec_body_clause(TextualJMLSpecCase sc, Behavior b) throws RecognitionException, SLTranslationException {
		PositionedString ps =null;


		    PositionedString[] pss;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:729:5: ( (ps= assignable_clause |ps= accessible_clause |ps= ensures_clause |ps= ensures_free_clause |ps= signals_clause |ps= joinproc_clause |ps= signals_only_clause |ps= diverges_clause |ps= measured_by_clause |ps= name_clause | captures_clause | when_clause | working_space_clause | duration_clause |ps= breaks_clause |ps= continues_clause |ps= returns_clause |ps= separates_clause |ps= determines_clause ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:730:5: (ps= assignable_clause |ps= accessible_clause |ps= ensures_clause |ps= ensures_free_clause |ps= signals_clause |ps= joinproc_clause |ps= signals_only_clause |ps= diverges_clause |ps= measured_by_clause |ps= name_clause | captures_clause | when_clause | working_space_clause | duration_clause |ps= breaks_clause |ps= continues_clause |ps= returns_clause |ps= separates_clause |ps= determines_clause )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:730:5: (ps= assignable_clause |ps= accessible_clause |ps= ensures_clause |ps= ensures_free_clause |ps= signals_clause |ps= joinproc_clause |ps= signals_only_clause |ps= diverges_clause |ps= measured_by_clause |ps= name_clause | captures_clause | when_clause | working_space_clause | duration_clause |ps= breaks_clause |ps= continues_clause |ps= returns_clause |ps= separates_clause |ps= determines_clause )
			int alt24=19;
			switch ( input.LA(1) ) {
			case ASSIGNABLE:
			case ASSIGNABLE_RED:
			case MODIFIABLE:
			case MODIFIABLE_RED:
			case MODIFIES:
			case MODIFIES_RED:
				{
				alt24=1;
				}
				break;
			case ACCESSIBLE:
			case ACCESSIBLE_REDUNDANTLY:
				{
				alt24=2;
				}
				break;
			case ENSURES:
			case ENSURES_RED:
			case POST:
			case POST_RED:
				{
				alt24=3;
				}
				break;
			case ENSURES_FREE:
				{
				alt24=4;
				}
				break;
			case EXSURES:
			case EXSURES_RED:
			case SIGNALS:
			case SIGNALS_RED:
				{
				alt24=5;
				}
				break;
			case JOIN_PROC:
				{
				alt24=6;
				}
				break;
			case SIGNALS_ONLY:
			case SIGNALS_ONLY_RED:
				{
				alt24=7;
				}
				break;
			case DIVERGES:
			case DIVERGES_RED:
				{
				alt24=8;
				}
				break;
			case MEASURED_BY:
			case MEASURED_BY_REDUNDANTLY:
				{
				alt24=9;
				}
				break;
			case SPEC_NAME:
				{
				alt24=10;
				}
				break;
			case CAPTURES:
			case CAPTURES_RED:
				{
				alt24=11;
				}
				break;
			case WHEN:
			case WHEN_RED:
				{
				alt24=12;
				}
				break;
			case WORKING_SPACE:
			case WORKING_SPACE_RED:
				{
				alt24=13;
				}
				break;
			case DURATION:
			case DURATION_RED:
				{
				alt24=14;
				}
				break;
			case BREAKS:
				{
				alt24=15;
				}
				break;
			case CONTINUES:
				{
				alt24=16;
				}
				break;
			case RETURNS:
				{
				alt24=17;
				}
				break;
			case RESPECTS:
			case SEPARATES:
				{
				alt24=18;
				}
				break;
			case DETERMINES:
				{
				alt24=19;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:731:6: ps= assignable_clause
					{
					pushFollow(FOLLOW_assignable_clause_in_simple_spec_body_clause2805);
					ps=assignable_clause();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { sc.addAssignable(ps); }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:732:6: ps= accessible_clause
					{
					pushFollow(FOLLOW_accessible_clause_in_simple_spec_body_clause2820);
					ps=accessible_clause();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { sc.addAccessible(ps); }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:733:6: ps= ensures_clause
					{
					pushFollow(FOLLOW_ensures_clause_in_simple_spec_body_clause2835);
					ps=ensures_clause();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { sc.addEnsures(ps); }
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:734:6: ps= ensures_free_clause
					{
					pushFollow(FOLLOW_ensures_free_clause_in_simple_spec_body_clause2853);
					ps=ensures_free_clause();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { sc.addEnsuresFree(ps); }
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:735:6: ps= signals_clause
					{
					pushFollow(FOLLOW_signals_clause_in_simple_spec_body_clause2866);
					ps=signals_clause();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { sc.addSignals(ps); }
					}
					break;
				case 6 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:736:8: ps= joinproc_clause
					{
					pushFollow(FOLLOW_joinproc_clause_in_simple_spec_body_clause2886);
					ps=joinproc_clause();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { sc.addJoinProcs(ps); }
					}
					break;
				case 7 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:737:6: ps= signals_only_clause
					{
					pushFollow(FOLLOW_signals_only_clause_in_simple_spec_body_clause2904);
					ps=signals_only_clause();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { sc.addSignalsOnly(ps); }
					}
					break;
				case 8 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:738:6: ps= diverges_clause
					{
					pushFollow(FOLLOW_diverges_clause_in_simple_spec_body_clause2917);
					ps=diverges_clause();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { sc.addDiverges(ps); }
					}
					break;
				case 9 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:739:6: ps= measured_by_clause
					{
					pushFollow(FOLLOW_measured_by_clause_in_simple_spec_body_clause2934);
					ps=measured_by_clause();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { sc.addMeasuredBy(ps); }
					}
					break;
				case 10 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:740:6: ps= name_clause
					{
					pushFollow(FOLLOW_name_clause_in_simple_spec_body_clause2948);
					ps=name_clause();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { sc.addName(ps); }
					}
					break;
				case 11 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:741:6: captures_clause
					{
					pushFollow(FOLLOW_captures_clause_in_simple_spec_body_clause2967);
					captures_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:742:6: when_clause
					{
					pushFollow(FOLLOW_when_clause_in_simple_spec_body_clause2974);
					when_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:743:6: working_space_clause
					{
					pushFollow(FOLLOW_working_space_clause_in_simple_spec_body_clause2981);
					working_space_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 14 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:744:6: duration_clause
					{
					pushFollow(FOLLOW_duration_clause_in_simple_spec_body_clause2988);
					duration_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 15 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:745:6: ps= breaks_clause
					{
					pushFollow(FOLLOW_breaks_clause_in_simple_spec_body_clause2997);
					ps=breaks_clause();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { sc.addBreaks(ps); }
					}
					break;
				case 16 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:746:6: ps= continues_clause
					{
					pushFollow(FOLLOW_continues_clause_in_simple_spec_body_clause3016);
					ps=continues_clause();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { sc.addContinues(ps); }
					}
					break;
				case 17 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:747:6: ps= returns_clause
					{
					pushFollow(FOLLOW_returns_clause_in_simple_spec_body_clause3032);
					ps=returns_clause();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { sc.addReturns(ps); }
					}
					break;
				case 18 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:748:13: ps= separates_clause
					{
					pushFollow(FOLLOW_separates_clause_in_simple_spec_body_clause3057);
					ps=separates_clause();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { sc.addInfFlowSpecs(ps); }
					}
					break;
				case 19 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:749:13: ps= determines_clause
					{
					pushFollow(FOLLOW_determines_clause_in_simple_spec_body_clause3080);
					ps=determines_clause();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { sc.addInfFlowSpecs(ps); }
					}
					break;

			}

			if ( state.backtracking==0 ) {
				if(b == Behavior.EXCEPTIONAL_BEHAVIOR
				   && !sc.getEnsures().isEmpty()) {
				    raiseError("ensures not allowed in exceptional behavior.");
				} else if(b == Behavior.NORMAL_BEHAVIOR
				          && !sc.getSignals().isEmpty()) {
				    raiseError("signals not allowed in normal behavior.");
				} else if(b == Behavior.NORMAL_BEHAVIOR
				          && !sc.getSignalsOnly().isEmpty()) {
				        raiseError("signals_only not allowed in normal behavior.");
				} else if(b == Behavior.NORMAL_BEHAVIOR
				          && !sc.getBreaks().isEmpty()) {
					raiseError("breaks not allowed in normal behavior.");
				} else if(b == Behavior.NORMAL_BEHAVIOR
				          && !sc.getContinues().isEmpty()) {
					raiseError("continues not allowed in normal behavior.");
				} else if(b == Behavior.NORMAL_BEHAVIOR
				          && !sc.getReturns().isEmpty()) {
					raiseError("returns not allowed in normal behavior.");
				}
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "simple_spec_body_clause"



	// $ANTLR start "separates_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:782:1: separates_clause returns [PositionedString r = null] : separates_keyword result= expression ;
	public final PositionedString separates_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:787:5: ( separates_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:788:5: separates_keyword result= expression
			{
			pushFollow(FOLLOW_separates_keyword_in_separates_clause3140);
			separates_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_separates_clause3144);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = result.prepend("separates "); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "separates_clause"



	// $ANTLR start "separates_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:792:1: separates_keyword : ( RESPECTS | SEPARATES );
	public final void separates_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:793:9: ( RESPECTS | SEPARATES )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( input.LA(1)==RESPECTS||input.LA(1)==SEPARATES ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "separates_keyword"



	// $ANTLR start "determines_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:799:1: determines_clause returns [PositionedString r = null] : determines_keyword result= expression ;
	public final PositionedString determines_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:804:5: ( determines_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:805:5: determines_keyword result= expression
			{
			pushFollow(FOLLOW_determines_keyword_in_determines_clause3208);
			determines_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_determines_clause3212);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = result.prepend("determines "); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "determines_clause"



	// $ANTLR start "determines_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:809:1: determines_keyword : DETERMINES ;
	public final void determines_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:810:9: ( DETERMINES )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:811:9: DETERMINES
			{
			match(input,DETERMINES,FOLLOW_DETERMINES_in_determines_keyword3232); if (state.failed) return;
			}

		}
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "determines_keyword"



	// $ANTLR start "assignable_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:815:1: assignable_clause returns [PositionedString r = null] : assignable_keyword result= expression ;
	public final PositionedString assignable_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:820:5: ( assignable_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:821:5: assignable_keyword result= expression
			{
			pushFollow(FOLLOW_assignable_keyword_in_assignable_clause3266);
			assignable_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_assignable_clause3270);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = flipHeaps("assignable", result); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "assignable_clause"



	// $ANTLR start "assignable_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:825:1: assignable_keyword : ( ASSIGNABLE | ASSIGNABLE_RED | MODIFIABLE | MODIFIABLE_RED | MODIFIES | MODIFIES_RED );
	public final void assignable_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:826:2: ( ASSIGNABLE | ASSIGNABLE_RED | MODIFIABLE | MODIFIABLE_RED | MODIFIES | MODIFIES_RED )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= ASSIGNABLE && input.LA(1) <= ASSIGNABLE_RED)||(input.LA(1) >= MODIFIABLE && input.LA(1) <= MODIFIES_RED) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignable_keyword"



	// $ANTLR start "accessible_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:836:1: accessible_clause returns [PositionedString r = null] : accessible_keyword result= expression ;
	public final PositionedString accessible_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:841:5: ( accessible_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:842:5: accessible_keyword result= expression
			{
			pushFollow(FOLLOW_accessible_keyword_in_accessible_clause3367);
			accessible_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_accessible_clause3371);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = flipHeaps("accessible", result, true); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "accessible_clause"



	// $ANTLR start "accessible_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:846:1: accessible_keyword : ( ACCESSIBLE | ACCESSIBLE_REDUNDANTLY );
	public final void accessible_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:847:9: ( ACCESSIBLE | ACCESSIBLE_REDUNDANTLY )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= ACCESSIBLE && input.LA(1) <= ACCESSIBLE_REDUNDANTLY) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "accessible_keyword"



	// $ANTLR start "measured_by_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:853:1: measured_by_clause returns [PositionedString r = null] : measured_by_keyword result= expression ;
	public final PositionedString measured_by_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:858:5: ( measured_by_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:860:5: measured_by_keyword result= expression
			{
			pushFollow(FOLLOW_measured_by_keyword_in_measured_by_clause3436);
			measured_by_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_measured_by_clause3440);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = result.prepend("decreases "); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "measured_by_clause"



	// $ANTLR start "measured_by_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:864:1: measured_by_keyword : ( MEASURED_BY | MEASURED_BY_REDUNDANTLY );
	public final void measured_by_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:865:9: ( MEASURED_BY | MEASURED_BY_REDUNDANTLY )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= MEASURED_BY && input.LA(1) <= MEASURED_BY_REDUNDANTLY) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "measured_by_keyword"



	// $ANTLR start "ensures_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:871:1: ensures_clause returns [PositionedString r = null] : ensures_keyword result= expression ;
	public final PositionedString ensures_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:876:5: ( ensures_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:877:5: ensures_keyword result= expression
			{
			pushFollow(FOLLOW_ensures_keyword_in_ensures_clause3504);
			ensures_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_ensures_clause3508);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = flipHeaps("ensures", result); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "ensures_clause"



	// $ANTLR start "ensures_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:881:1: ensures_keyword : ( ENSURES | ENSURES_RED | POST | POST_RED );
	public final void ensures_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:882:2: ( ENSURES | ENSURES_RED | POST | POST_RED )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( input.LA(1)==ENSURES||input.LA(1)==ENSURES_RED||(input.LA(1) >= POST && input.LA(1) <= POST_RED) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ensures_keyword"



	// $ANTLR start "ensures_free_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:887:1: ensures_free_clause returns [PositionedString r = null] : ENSURES_FREE result= expression ;
	public final PositionedString ensures_free_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:892:5: ( ENSURES_FREE result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:893:5: ENSURES_FREE result= expression
			{
			match(input,ENSURES_FREE,FOLLOW_ENSURES_FREE_in_ensures_free_clause3567); if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_ensures_free_clause3571);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = flipHeaps("ensures_free", result); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "ensures_free_clause"



	// $ANTLR start "signals_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:897:1: signals_clause returns [PositionedString r = null] : signals_keyword result= expression ;
	public final PositionedString signals_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:902:5: ( signals_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:903:5: signals_keyword result= expression
			{
			pushFollow(FOLLOW_signals_keyword_in_signals_clause3607);
			signals_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_signals_clause3611);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = result.prepend("signals "); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "signals_clause"



	// $ANTLR start "signals_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:907:1: signals_keyword : ( SIGNALS | SIGNALS_RED | EXSURES | EXSURES_RED );
	public final void signals_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:908:2: ( SIGNALS | SIGNALS_RED | EXSURES | EXSURES_RED )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= EXSURES && input.LA(1) <= EXSURES_RED)||input.LA(1)==SIGNALS||input.LA(1)==SIGNALS_RED ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "signals_keyword"



	// $ANTLR start "signals_only_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:916:1: signals_only_clause returns [PositionedString r = null] : signals_only_keyword result= expression ;
	public final PositionedString signals_only_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:921:5: ( signals_only_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:922:5: signals_only_keyword result= expression
			{
			pushFollow(FOLLOW_signals_only_keyword_in_signals_only_clause3688);
			signals_only_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_signals_only_clause3692);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = result.prepend("signals_only "); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "signals_only_clause"



	// $ANTLR start "signals_only_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:926:1: signals_only_keyword : ( SIGNALS_ONLY | SIGNALS_ONLY_RED );
	public final void signals_only_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:927:2: ( SIGNALS_ONLY | SIGNALS_ONLY_RED )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= SIGNALS_ONLY && input.LA(1) <= SIGNALS_ONLY_RED) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "signals_only_keyword"



	// $ANTLR start "diverges_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:933:1: diverges_clause returns [PositionedString r = null] : diverges_keyword result= expression ;
	public final PositionedString diverges_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:938:5: ( diverges_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:939:5: diverges_keyword result= expression
			{
			pushFollow(FOLLOW_diverges_keyword_in_diverges_clause3749);
			diverges_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_diverges_clause3753);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "diverges_clause"



	// $ANTLR start "diverges_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:943:1: diverges_keyword : ( DIVERGES | DIVERGES_RED );
	public final void diverges_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:944:2: ( DIVERGES | DIVERGES_RED )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= DIVERGES && input.LA(1) <= DIVERGES_RED) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "diverges_keyword"



	// $ANTLR start "captures_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:950:1: captures_clause : captures_keyword ps= expression ;
	public final void captures_clause() throws RecognitionException, SLTranslationException {
		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:951:5: ( captures_keyword ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:952:5: captures_keyword ps= expression
			{
			pushFollow(FOLLOW_captures_keyword_in_captures_clause3792);
			captures_keyword();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_expression_in_captures_clause3796);
			ps=expression();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
				raiseNotSupported("captures clauses");
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "captures_clause"



	// $ANTLR start "captures_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:959:1: captures_keyword : ( CAPTURES | CAPTURES_RED );
	public final void captures_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:960:2: ( CAPTURES | CAPTURES_RED )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= CAPTURES && input.LA(1) <= CAPTURES_RED) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "captures_keyword"



	// $ANTLR start "name_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:966:1: name_clause returns [PositionedString result = null] : spec= SPEC_NAME name= STRING_LITERAL SEMICOLON ;
	public final PositionedString name_clause() throws RecognitionException, SLTranslationException {
		PositionedString result =  null;


		Token spec=null;
		Token name=null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:969:5: (spec= SPEC_NAME name= STRING_LITERAL SEMICOLON )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:970:5: spec= SPEC_NAME name= STRING_LITERAL SEMICOLON
			{
			spec=(Token)match(input,SPEC_NAME,FOLLOW_SPEC_NAME_in_name_clause3849); if (state.failed) return result;
			name=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_name_clause3853); if (state.failed) return result;
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_name_clause3855); if (state.failed) return result;
			if ( state.backtracking==0 ) {
				result=createPositionedString(name.getText().substring(1,name.getText().length() - 1), spec);
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "name_clause"



	// $ANTLR start "when_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:977:1: when_clause : when_keyword ps= expression ;
	public final void when_clause() throws RecognitionException, SLTranslationException {
		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:978:5: ( when_keyword ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:979:5: when_keyword ps= expression
			{
			pushFollow(FOLLOW_when_keyword_in_when_clause3879);
			when_keyword();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_expression_in_when_clause3883);
			ps=expression();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
				raiseNotSupported("when clauses");
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "when_clause"



	// $ANTLR start "when_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:986:1: when_keyword : ( WHEN | WHEN_RED );
	public final void when_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:987:2: ( WHEN | WHEN_RED )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= WHEN && input.LA(1) <= WHEN_RED) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "when_keyword"



	// $ANTLR start "working_space_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:993:1: working_space_clause : working_space_keyword ps= expression ;
	public final void working_space_clause() throws RecognitionException, SLTranslationException {
		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:994:5: ( working_space_keyword ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:995:5: working_space_keyword ps= expression
			{
			pushFollow(FOLLOW_working_space_keyword_in_working_space_clause3928);
			working_space_keyword();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_expression_in_working_space_clause3932);
			ps=expression();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
				raiseNotSupported("working_space clauses");
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "working_space_clause"



	// $ANTLR start "working_space_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1002:1: working_space_keyword : ( WORKING_SPACE | WORKING_SPACE_RED );
	public final void working_space_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1003:2: ( WORKING_SPACE | WORKING_SPACE_RED )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= WORKING_SPACE && input.LA(1) <= WORKING_SPACE_RED) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "working_space_keyword"



	// $ANTLR start "duration_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1009:1: duration_clause : duration_keyword ps= expression ;
	public final void duration_clause() throws RecognitionException, SLTranslationException {
		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1010:5: ( duration_keyword ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1011:5: duration_keyword ps= expression
			{
			pushFollow(FOLLOW_duration_keyword_in_duration_clause3977);
			duration_keyword();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_expression_in_duration_clause3981);
			ps=expression();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
				raiseNotSupported("duration clauses");
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "duration_clause"



	// $ANTLR start "duration_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1018:1: duration_keyword : ( DURATION | DURATION_RED );
	public final void duration_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1019:2: ( DURATION | DURATION_RED )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= DURATION && input.LA(1) <= DURATION_RED) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "duration_keyword"



	// $ANTLR start "old_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1024:1: old_clause returns [ PositionedString[] result = new PositionedString[3] ] : OLD mods= modifiers typeps= type name= IDENT init= INITIALISER ;
	public final PositionedString[] old_clause() throws RecognitionException, SLTranslationException {
		PositionedString[] result =  new PositionedString[3];


		Token name=null;
		Token init=null;
		ImmutableList<String> mods =null;
		PositionedString typeps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1027:2: ( OLD mods= modifiers typeps= type name= IDENT init= INITIALISER )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1028:2: OLD mods= modifiers typeps= type name= IDENT init= INITIALISER
			{
			match(input,OLD,FOLLOW_OLD_in_old_clause4028); if (state.failed) return result;
			pushFollow(FOLLOW_modifiers_in_old_clause4032);
			mods=modifiers();
			state._fsp--;
			if (state.failed) return result;
			pushFollow(FOLLOW_type_in_old_clause4037);
			typeps=type();
			state._fsp--;
			if (state.failed) return result;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_old_clause4042); if (state.failed) return result;
			init=(Token)match(input,INITIALISER,FOLLOW_INITIALISER_in_old_clause4047); if (state.failed) return result;
			if ( state.backtracking==0 ) { // modifiers are ignored, don't make any sense here
				  result[0] = typeps;
				  result[1] = new PositionedString(name.getText(),name);
				  result[2] = new PositionedString(init.getText().substring(2),init);
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "old_clause"



	// $ANTLR start "type"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1039:1: type returns [PositionedString text = null;] : identToken= IDENT (t= EMPTYBRACKETS )* ;
	public final PositionedString type() throws RecognitionException {
		PositionedString text =  null;;


		Token identToken=null;
		Token t=null;


		    StringBuffer sb = new StringBuffer();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1046:5: (identToken= IDENT (t= EMPTYBRACKETS )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1047:5: identToken= IDENT (t= EMPTYBRACKETS )*
			{
			identToken=(Token)match(input,IDENT,FOLLOW_IDENT_in_type4079); if (state.failed) return text;
			if ( state.backtracking==0 ) { sb.append(identToken.getText()); }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1048:5: (t= EMPTYBRACKETS )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==EMPTYBRACKETS) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1048:6: t= EMPTYBRACKETS
					{
					t=(Token)match(input,EMPTYBRACKETS,FOLLOW_EMPTYBRACKETS_in_type4090); if (state.failed) return text;
					if ( state.backtracking==0 ) { sb.append(t.getText()); }
					}
					break;

				default :
					break loop25;
				}
			}

			}

			if ( state.backtracking==0 ) {
			    text = new PositionedString(sb.toString(), identToken);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return text;
	}
	// $ANTLR end "type"



	// $ANTLR start "field_or_method_declaration"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1051:1: field_or_method_declaration[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : typeps= type name= IDENT ( ( LPAREN )=>methodDecl= method_declaration[mods, typeps, name] |fieldDecl= field_declaration[mods, typeps, name] ) ;
	public final ImmutableList<TextualJMLConstruct> field_or_method_declaration(ImmutableList<String> mods) throws RecognitionException {
		ImmutableList<TextualJMLConstruct> result =  null;


		Token name=null;
		PositionedString typeps =null;
		ImmutableList<TextualJMLConstruct> methodDecl =null;
		ImmutableList<TextualJMLConstruct> fieldDecl =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1053:5: (typeps= type name= IDENT ( ( LPAREN )=>methodDecl= method_declaration[mods, typeps, name] |fieldDecl= field_declaration[mods, typeps, name] ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1054:5: typeps= type name= IDENT ( ( LPAREN )=>methodDecl= method_declaration[mods, typeps, name] |fieldDecl= field_declaration[mods, typeps, name] )
			{
			pushFollow(FOLLOW_type_in_field_or_method_declaration4115);
			typeps=type();
			state._fsp--;
			if (state.failed) return result;
			name=(Token)match(input,IDENT,FOLLOW_IDENT_in_field_or_method_declaration4120); if (state.failed) return result;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1055:5: ( ( LPAREN )=>methodDecl= method_declaration[mods, typeps, name] |fieldDecl= field_declaration[mods, typeps, name] )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==LPAREN) && (synpred2_KeYJMLPreParser())) {
				alt26=1;
			}
			else if ( (LA26_0==EMPTYBRACKETS||LA26_0==EQUALITY||LA26_0==SEMICOLON) ) {
				alt26=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1055:7: ( LPAREN )=>methodDecl= method_declaration[mods, typeps, name]
					{
					pushFollow(FOLLOW_method_declaration_in_field_or_method_declaration4139);
					methodDecl=method_declaration(mods, typeps, name);
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) {result = methodDecl;}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1057:7: fieldDecl= field_declaration[mods, typeps, name]
					{
					pushFollow(FOLLOW_field_declaration_in_field_or_method_declaration4162);
					fieldDecl=field_declaration(mods, typeps, name);
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) {result = fieldDecl;}
					}
					break;

			}

			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "field_or_method_declaration"



	// $ANTLR start "field_declaration"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1066:1: field_declaration[ImmutableList<String> mods, PositionedString type, Token name] returns [ImmutableList<TextualJMLConstruct> result = null] : (t= EMPTYBRACKETS )* (init= initialiser |semi= SEMICOLON ) ;
	public final ImmutableList<TextualJMLConstruct> field_declaration(ImmutableList<String> mods, PositionedString type, Token name) throws RecognitionException {
		ImmutableList<TextualJMLConstruct> result =  null;


		Token t=null;
		Token semi=null;
		String init =null;


		    StringBuffer sb = new StringBuffer(type.text + " " + name.getText());
		    String s;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1072:5: ( (t= EMPTYBRACKETS )* (init= initialiser |semi= SEMICOLON ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1073:5: (t= EMPTYBRACKETS )* (init= initialiser |semi= SEMICOLON )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1073:5: (t= EMPTYBRACKETS )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==EMPTYBRACKETS) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1073:6: t= EMPTYBRACKETS
					{
					t=(Token)match(input,EMPTYBRACKETS,FOLLOW_EMPTYBRACKETS_in_field_declaration4204); if (state.failed) return result;
					if ( state.backtracking==0 ) { sb.append(t.getText()); }
					}
					break;

				default :
					break loop27;
				}
			}

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1074:5: (init= initialiser |semi= SEMICOLON )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==EQUALITY) ) {
				alt28=1;
			}
			else if ( (LA28_0==SEMICOLON) ) {
				alt28=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1075:6: init= initialiser
					{
					pushFollow(FOLLOW_initialiser_in_field_declaration4223);
					init=initialiser();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { sb.append(init); }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1076:6: semi= SEMICOLON
					{
					semi=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_field_declaration4235); if (state.failed) return result;
					if ( state.backtracking==0 ) { sb.append(semi.getText()); }
					}
					break;

			}

			if ( state.backtracking==0 ) {
			        PositionedString ps = createPositionedString(sb.toString(), type.pos);
				TextualJMLFieldDecl fd = new TextualJMLFieldDecl(mods, ps);
				result = ImmutableSLList.<TextualJMLConstruct>nil().prepend(fd);
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "field_declaration"



	// $ANTLR start "method_declaration"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1091:1: method_declaration[ImmutableList<String> mods, PositionedString type, Token name] returns [ImmutableList<TextualJMLConstruct> result = null] : params= param_list (body= BODY |semi= SEMICOLON ) ;
	public final ImmutableList<TextualJMLConstruct> method_declaration(ImmutableList<String> mods, PositionedString type, Token name) throws RecognitionException {
		ImmutableList<TextualJMLConstruct> result =  null;


		Token body=null;
		Token semi=null;
		String params =null;


		    StringBuffer sb = new StringBuffer(type.text + " " + name.getText());
		    StringBuffer sbDefinition = new StringBuffer();
		    String s;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1098:5: (params= param_list (body= BODY |semi= SEMICOLON ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1099:5: params= param_list (body= BODY |semi= SEMICOLON )
			{
			pushFollow(FOLLOW_param_list_in_method_declaration4284);
			params=param_list();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { sb.append(params); }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1100:5: (body= BODY |semi= SEMICOLON )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==BODY) ) {
				alt29=1;
			}
			else if ( (LA29_0==SEMICOLON) ) {
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
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1101:6: body= BODY
					{
					body=(Token)match(input,BODY,FOLLOW_BODY_in_method_declaration4303); if (state.failed) return result;
					if ( state.backtracking==0 ) { sbDefinition.append(body.getText()); }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1102:6: semi= SEMICOLON
					{
					semi=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_method_declaration4320); if (state.failed) return result;
					}
					break;

			}

			if ( state.backtracking==0 ) {
				sb.append(";");
			        PositionedString ps = createPositionedString(sb.toString(), type.pos);
			        PositionedString psDefinition = null;
			        if(sbDefinition.length() > 0) {
			          String paramsString = params.trim();
			          String bodyString = new String(sbDefinition).trim();
			          assert paramsString.charAt(0) == '(' && paramsString.charAt(paramsString.length()-1) == ')';
			          paramsString = paramsString.substring(1, paramsString.length()-1).trim();
			          if(!paramsString.equals("")) {
			            StringBuffer stmp = new StringBuffer();
			            for(String t : paramsString.split(",")) {
			              t = t.trim();
			              t = t.substring(t.indexOf(" ")+1);
			              if(stmp.length() > 0) stmp.append(", ");
			              stmp.append(t);
			            }
			            paramsString = "("+new String(stmp) +")";
			          }else{
			            paramsString = "()";
			          }
			          assert bodyString.charAt(0) == '{' && bodyString.charAt(bodyString.length()-1) == '}';
			          bodyString = bodyString.substring(1, bodyString.length()-1).trim();
			          assert bodyString.startsWith("return ") : "return expected, instead: " + bodyString;
			          int beginIndex = bodyString.indexOf(" ") + 1;
			          int endIndex = bodyString.lastIndexOf(";");
			          bodyString = bodyString.substring(beginIndex, endIndex);

			          // TODO Other heaps? There is only one return statement.....
			          // TODO Better not encoded as a string but create equality directly.
			          psDefinition = createPositionedString("<heap> "+name.getText() +
			                paramsString + " == ("+bodyString+");", type.pos);
			        }

				TextualJMLMethodDecl md
					= new TextualJMLMethodDecl(mods, ps, name.getText(), psDefinition);
				result = ImmutableSLList.<TextualJMLConstruct>nil().prepend(md);
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "method_declaration"



	// $ANTLR start "param_list"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1144:1: param_list returns [String s = null] : t= LPAREN (param= param_decl (t= COMMA param= param_decl )* )? t= RPAREN ;
	public final String param_list() throws RecognitionException {
		String s =  null;


		Token t=null;
		String param =null;


		    final StringBuilder text = new StringBuilder();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1151:5: (t= LPAREN (param= param_decl (t= COMMA param= param_decl )* )? t= RPAREN )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1152:9: t= LPAREN (param= param_decl (t= COMMA param= param_decl )* )? t= RPAREN
			{
			t=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_param_list4369); if (state.failed) return s;
			if ( state.backtracking==0 ) { text.append(t.getText()); }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1153:9: (param= param_decl (t= COMMA param= param_decl )* )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==IDENT||LA31_0==NON_NULL||LA31_0==NULLABLE) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1154:13: param= param_decl (t= COMMA param= param_decl )*
					{
					pushFollow(FOLLOW_param_decl_in_param_list4397);
					param=param_decl();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { text.append(param); }
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1155:13: (t= COMMA param= param_decl )*
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==COMMA) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1156:17: t= COMMA param= param_decl
							{
							t=(Token)match(input,COMMA,FOLLOW_COMMA_in_param_list4433); if (state.failed) return s;
							pushFollow(FOLLOW_param_decl_in_param_list4453);
							param=param_decl();
							state._fsp--;
							if (state.failed) return s;
							if ( state.backtracking==0 ) { text.append(t.getText() + param); }
							}
							break;

						default :
							break loop30;
						}
					}

					}
					break;

			}

			t=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_param_list4509); if (state.failed) return s;
			if ( state.backtracking==0 ) { text.append(t.getText()); }
			}

			if ( state.backtracking==0 ) {
			    s = text.toString();
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "param_list"



	// $ANTLR start "param_decl"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1164:1: param_decl returns [String s = null] : (t= ( NON_NULL | NULLABLE ) )? t= IDENT ( ( AXIOM_NAME_BEGIN AXION_NAME_END | EMPTYBRACKETS ) )* t= IDENT ;
	public final String param_decl() throws RecognitionException {
		String s =  null;


		Token t=null;


		    final StringBuilder text = new StringBuilder();

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1171:5: ( (t= ( NON_NULL | NULLABLE ) )? t= IDENT ( ( AXIOM_NAME_BEGIN AXION_NAME_END | EMPTYBRACKETS ) )* t= IDENT )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1172:9: (t= ( NON_NULL | NULLABLE ) )? t= IDENT ( ( AXIOM_NAME_BEGIN AXION_NAME_END | EMPTYBRACKETS ) )* t= IDENT
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1172:9: (t= ( NON_NULL | NULLABLE ) )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==NON_NULL||LA32_0==NULLABLE) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1173:14: t= ( NON_NULL | NULLABLE )
					{
					t=input.LT(1);
					if ( input.LA(1)==NON_NULL||input.LA(1)==NULLABLE ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return s;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					if ( state.backtracking==0 ) {
					                text.append("/*@" + t.getText() + "@*/");
					             }
					}
					break;

			}

			t=(Token)match(input,IDENT,FOLLOW_IDENT_in_param_decl4611); if (state.failed) return s;
			if ( state.backtracking==0 ) {
			            text.append(t.getText());
			        }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1182:9: ( ( AXIOM_NAME_BEGIN AXION_NAME_END | EMPTYBRACKETS ) )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==AXIOM_NAME_BEGIN||LA34_0==EMPTYBRACKETS) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1183:11: ( AXIOM_NAME_BEGIN AXION_NAME_END | EMPTYBRACKETS )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1183:11: ( AXIOM_NAME_BEGIN AXION_NAME_END | EMPTYBRACKETS )
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==AXIOM_NAME_BEGIN) ) {
						alt33=1;
					}
					else if ( (LA33_0==EMPTYBRACKETS) ) {
						alt33=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return s;}
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}

					switch (alt33) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1183:13: AXIOM_NAME_BEGIN AXION_NAME_END
							{
							match(input,AXIOM_NAME_BEGIN,FOLLOW_AXIOM_NAME_BEGIN_in_param_decl4645); if (state.failed) return s;
							match(input,AXION_NAME_END,FOLLOW_AXION_NAME_END_in_param_decl4660); if (state.failed) return s;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1185:13: EMPTYBRACKETS
							{
							match(input,EMPTYBRACKETS,FOLLOW_EMPTYBRACKETS_in_param_decl4675); if (state.failed) return s;
							}
							break;

					}

					if ( state.backtracking==0 ) { text.append("[]"); }
					}
					break;

				default :
					break loop34;
				}
			}

			t=(Token)match(input,IDENT,FOLLOW_IDENT_in_param_decl4718); if (state.failed) return s;
			if ( state.backtracking==0 ) {
			            text.append(" " + t.getText());
			        }
			}

			if ( state.backtracking==0 ) {
			    s = text.toString();
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "param_decl"



	// $ANTLR start "represents_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1200:1: represents_clause[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : represents_keyword ps= expression ;
	public final ImmutableList<TextualJMLConstruct> represents_clause(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  null;


		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1203:5: ( represents_keyword ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1204:5: represents_keyword ps= expression
			{
			pushFollow(FOLLOW_represents_keyword_in_represents_clause4762);
			represents_keyword();
			state._fsp--;
			if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_represents_clause4766);
			ps=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
				TextualJMLRepresents rc
					= new TextualJMLRepresents(mods, ps.prepend("represents "));
				result = ImmutableSLList.<TextualJMLConstruct>nil().prepend(rc);
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "represents_clause"



	// $ANTLR start "represents_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1213:1: represents_keyword : ( REPRESENTS | REPRESENTS_RED );
	public final void represents_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1214:9: ( REPRESENTS | REPRESENTS_RED )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= REPRESENTS && input.LA(1) <= REPRESENTS_RED) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "represents_keyword"



	// $ANTLR start "depends_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1225:1: depends_clause[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : accessible_keyword ps= expression ;
	public final ImmutableList<TextualJMLConstruct> depends_clause(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  null;


		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1228:5: ( accessible_keyword ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1229:5: accessible_keyword ps= expression
			{
			pushFollow(FOLLOW_accessible_keyword_in_depends_clause4830);
			accessible_keyword();
			state._fsp--;
			if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_depends_clause4834);
			ps=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
				TextualJMLDepends d
					= new TextualJMLDepends(mods, flipHeaps("depends", ps, false));
				result = ImmutableSLList.<TextualJMLConstruct>nil().prepend(d);
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "depends_clause"



	// $ANTLR start "history_constraint"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1243:1: history_constraint[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : constraint_keyword ps= expression ;
	public final ImmutableList<TextualJMLConstruct> history_constraint(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  null;


		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1246:5: ( constraint_keyword ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1247:5: constraint_keyword ps= expression
			{
			pushFollow(FOLLOW_constraint_keyword_in_history_constraint4870);
			constraint_keyword();
			state._fsp--;
			if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_history_constraint4874);
			ps=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
				raiseNotSupported("history constraints");
				result = ImmutableSLList.<TextualJMLConstruct>nil();
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "history_constraint"



	// $ANTLR start "constraint_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1255:1: constraint_keyword : ( CONSTRAINT | CONSTRAINT_RED );
	public final void constraint_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1256:9: ( CONSTRAINT | CONSTRAINT_RED )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= CONSTRAINT && input.LA(1) <= CONSTRAINT_RED) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "constraint_keyword"



	// $ANTLR start "monitors_for_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1263:1: monitors_for_clause[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : MONITORS_FOR ps= expression ;
	public final ImmutableList<TextualJMLConstruct> monitors_for_clause(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  null;


		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1266:5: ( MONITORS_FOR ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1267:5: MONITORS_FOR ps= expression
			{
			match(input,MONITORS_FOR,FOLLOW_MONITORS_FOR_in_monitors_for_clause4934); if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_monitors_for_clause4938);
			ps=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
				raiseNotSupported("monitors_for clauses");
				result = ImmutableSLList.<TextualJMLConstruct>nil();
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "monitors_for_clause"



	// $ANTLR start "readable_if_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1275:1: readable_if_clause[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : READABLE ps= expression ;
	public final ImmutableList<TextualJMLConstruct> readable_if_clause(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  null;


		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1278:5: ( READABLE ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1279:5: READABLE ps= expression
			{
			match(input,READABLE,FOLLOW_READABLE_in_readable_if_clause4969); if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_readable_if_clause4973);
			ps=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
				raiseNotSupported("readable-if clauses");
				result = ImmutableSLList.<TextualJMLConstruct>nil();
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "readable_if_clause"



	// $ANTLR start "writable_if_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1287:1: writable_if_clause[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : WRITABLE ps= expression ;
	public final ImmutableList<TextualJMLConstruct> writable_if_clause(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  null;


		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1290:5: ( WRITABLE ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1291:5: WRITABLE ps= expression
			{
			match(input,WRITABLE,FOLLOW_WRITABLE_in_writable_if_clause5004); if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_writable_if_clause5008);
			ps=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
				raiseNotSupported("writable-if clauses");
				result = ImmutableSLList.<TextualJMLConstruct>nil();
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "writable_if_clause"



	// $ANTLR start "datagroup_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1299:1: datagroup_clause[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : ( in_group_clause | maps_into_clause );
	public final ImmutableList<TextualJMLConstruct> datagroup_clause(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  null;


		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1302:5: ( in_group_clause | maps_into_clause )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==IN||LA35_0==IN_RED) ) {
				alt35=1;
			}
			else if ( ((LA35_0 >= MAPS && LA35_0 <= MAPS_RED)) ) {
				alt35=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1303:5: in_group_clause
					{
					pushFollow(FOLLOW_in_group_clause_in_datagroup_clause5039);
					in_group_clause();
					state._fsp--;
					if (state.failed) return result;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1303:23: maps_into_clause
					{
					pushFollow(FOLLOW_maps_into_clause_in_datagroup_clause5043);
					maps_into_clause();
					state._fsp--;
					if (state.failed) return result;
					}
					break;

			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "datagroup_clause"



	// $ANTLR start "in_group_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1307:1: in_group_clause : in_keyword ps= expression ;
	public final void in_group_clause() throws RecognitionException, SLTranslationException {
		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1308:5: ( in_keyword ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1309:5: in_keyword ps= expression
			{
			pushFollow(FOLLOW_in_keyword_in_in_group_clause5062);
			in_keyword();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_expression_in_in_group_clause5066);
			ps=expression();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
				raiseNotSupported("in-group clauses");
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "in_group_clause"



	// $ANTLR start "in_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1316:1: in_keyword : ( IN | IN_RED );
	public final void in_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1317:2: ( IN | IN_RED )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( input.LA(1)==IN||input.LA(1)==IN_RED ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "in_keyword"



	// $ANTLR start "maps_into_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1323:1: maps_into_clause : maps_keyword ps= expression ;
	public final void maps_into_clause() throws RecognitionException, SLTranslationException {
		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1324:5: ( maps_keyword ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1325:5: maps_keyword ps= expression
			{
			pushFollow(FOLLOW_maps_keyword_in_maps_into_clause5110);
			maps_keyword();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_expression_in_maps_into_clause5114);
			ps=expression();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
				raiseNotSupported("maps-into clauses");
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "maps_into_clause"



	// $ANTLR start "maps_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1332:1: maps_keyword : ( MAPS | MAPS_RED );
	public final void maps_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1333:2: ( MAPS | MAPS_RED )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= MAPS && input.LA(1) <= MAPS_RED) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "maps_keyword"



	// $ANTLR start "nowarn_pragma"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1339:1: nowarn_pragma[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : NOWARN ps= expression ;
	public final ImmutableList<TextualJMLConstruct> nowarn_pragma(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  null;


		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1342:5: ( NOWARN ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1343:5: NOWARN ps= expression
			{
			match(input,NOWARN,FOLLOW_NOWARN_in_nowarn_pragma5165); if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_nowarn_pragma5169);
			ps=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
				raiseNotSupported("nowarn pragmas");
				result = ImmutableSLList.<TextualJMLConstruct>nil();
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "nowarn_pragma"



	// $ANTLR start "debug_statement"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1351:1: debug_statement[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : DEBUG ps= expression ;
	public final ImmutableList<TextualJMLConstruct> debug_statement(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  null;


		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1354:5: ( DEBUG ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1355:5: DEBUG ps= expression
			{
			match(input,DEBUG,FOLLOW_DEBUG_in_debug_statement5202); if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_debug_statement5206);
			ps=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
			  raiseNotSupported("debug statements");
			  result = ImmutableSLList.<TextualJMLConstruct>nil();
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "debug_statement"



	// $ANTLR start "set_statement"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1367:1: set_statement[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : SET ps= expression ;
	public final ImmutableList<TextualJMLConstruct> set_statement(ImmutableList<String> mods) throws RecognitionException {
		ImmutableList<TextualJMLConstruct> result =  null;


		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1369:5: ( SET ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1370:5: SET ps= expression
			{
			match(input,SET,FOLLOW_SET_in_set_statement5236); if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_set_statement5240);
			ps=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
				TextualJMLSetStatement ss = new TextualJMLSetStatement(mods, ps);
				result = ImmutableSLList.<TextualJMLConstruct>nil().prepend(ss);
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "set_statement"



	// $ANTLR start "loop_specification"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1383:1: loop_specification[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : ps= loop_invariant ( options {greedy=true; } :ps= loop_invariant |ps= loop_separates_clause |ps= loop_determines_clause |ps= assignable_clause |ps= variant_function )* ;
	public final ImmutableList<TextualJMLConstruct> loop_specification(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  null;


		PositionedString ps =null;


		   TextualJMLLoopSpec ls = new TextualJMLLoopSpec(mods);
		   result = ImmutableSLList.<TextualJMLConstruct>nil().prepend(ls);

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1390:5: (ps= loop_invariant ( options {greedy=true; } :ps= loop_invariant |ps= loop_separates_clause |ps= loop_determines_clause |ps= assignable_clause |ps= variant_function )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1391:5: ps= loop_invariant ( options {greedy=true; } :ps= loop_invariant |ps= loop_separates_clause |ps= loop_determines_clause |ps= assignable_clause |ps= variant_function )*
			{
			pushFollow(FOLLOW_loop_invariant_in_loop_specification5283);
			ps=loop_invariant();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) { ls.addInvariant(ps); }
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1392:5: ( options {greedy=true; } :ps= loop_invariant |ps= loop_separates_clause |ps= loop_determines_clause |ps= assignable_clause |ps= variant_function )*
			loop36:
			while (true) {
				int alt36=6;
				alt36 = dfa36.predict(input);
				switch (alt36) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1395:13: ps= loop_invariant
					{
					pushFollow(FOLLOW_loop_invariant_in_loop_specification5328);
					ps=loop_invariant();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { ls.addInvariant(ps); }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1396:13: ps= loop_separates_clause
					{
					pushFollow(FOLLOW_loop_separates_clause_in_loop_specification5352);
					ps=loop_separates_clause();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { ls.addInfFlowSpecs(ps); }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1397:13: ps= loop_determines_clause
					{
					pushFollow(FOLLOW_loop_determines_clause_in_loop_specification5375);
					ps=loop_determines_clause();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { ls.addInfFlowSpecs(ps); }
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1398:13: ps= assignable_clause
					{
					pushFollow(FOLLOW_assignable_clause_in_loop_specification5398);
					ps=assignable_clause();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { ls.addAssignable(ps); }
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1399:13: ps= variant_function
					{
					pushFollow(FOLLOW_variant_function_in_loop_specification5419);
					ps=variant_function();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) { ls.setVariant(ps); }
					}
					break;

				default :
					break loop36;
				}
			}

			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "loop_specification"



	// $ANTLR start "loop_invariant"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1404:1: loop_invariant returns [PositionedString r = null] : maintaining_keyword result= expression ;
	public final PositionedString loop_invariant() throws RecognitionException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1407:5: ( maintaining_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1408:5: maintaining_keyword result= expression
			{
			pushFollow(FOLLOW_maintaining_keyword_in_loop_invariant5460);
			maintaining_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_loop_invariant5464);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = flipHeaps("", result); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "loop_invariant"



	// $ANTLR start "maintaining_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1411:1: maintaining_keyword : ( MAINTAINING | MAINTAINING_REDUNDANTLY | LOOP_INVARIANT | LOOP_INVARIANT_REDUNDANTLY );
	public final void maintaining_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1412:9: ( MAINTAINING | MAINTAINING_REDUNDANTLY | LOOP_INVARIANT | LOOP_INVARIANT_REDUNDANTLY )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( input.LA(1)==LOOP_INVARIANT||(input.LA(1) >= MAINTAINING && input.LA(1) <= MAINTAINING_REDUNDANTLY)||input.LA(1)==LOOP_INVARIANT_REDUNDANTLY ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "maintaining_keyword"



	// $ANTLR start "variant_function"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1420:1: variant_function returns [PositionedString r = null] : decreasing_keyword result= expression ;
	public final PositionedString variant_function() throws RecognitionException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1423:5: ( decreasing_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1424:5: decreasing_keyword result= expression
			{
			pushFollow(FOLLOW_decreasing_keyword_in_variant_function5541);
			decreasing_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_variant_function5545);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = result.prepend("decreases "); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "variant_function"



	// $ANTLR start "decreasing_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1428:1: decreasing_keyword : ( DECREASING | DECREASING_REDUNDANTLY | DECREASES | DECREASES_REDUNDANTLY );
	public final void decreasing_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1429:9: ( DECREASING | DECREASING_REDUNDANTLY | DECREASES | DECREASES_REDUNDANTLY )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= DECREASES && input.LA(1) <= DECREASING_REDUNDANTLY) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decreasing_keyword"



	// $ANTLR start "loop_separates_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1438:1: loop_separates_clause returns [PositionedString r = null] : separates_keyword result= expression ;
	public final PositionedString loop_separates_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1443:5: ( separates_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1444:5: separates_keyword result= expression
			{
			pushFollow(FOLLOW_separates_keyword_in_loop_separates_clause5630);
			separates_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_loop_separates_clause5634);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = result.prepend("loop_separates "); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "loop_separates_clause"



	// $ANTLR start "loop_determines_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1448:1: loop_determines_clause returns [PositionedString r = null] : determines_keyword result= expression ;
	public final PositionedString loop_determines_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1453:5: ( determines_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1454:5: determines_keyword result= expression
			{
			pushFollow(FOLLOW_determines_keyword_in_loop_determines_clause5670);
			determines_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_loop_determines_clause5674);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = result.prepend("loop_determines "); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "loop_determines_clause"



	// $ANTLR start "assume_statement"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1464:1: assume_statement[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : assume_keyword ps= expression ;
	public final ImmutableList<TextualJMLConstruct> assume_statement(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  null;


		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1467:5: ( assume_keyword ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1468:5: assume_keyword ps= expression
			{
			pushFollow(FOLLOW_assume_keyword_in_assume_statement5707);
			assume_keyword();
			state._fsp--;
			if (state.failed) return result;
			pushFollow(FOLLOW_expression_in_assume_statement5711);
			ps=expression();
			state._fsp--;
			if (state.failed) return result;
			if ( state.backtracking==0 ) {
			        raiseNotSupported("assume statements");
				result = ImmutableSLList.<TextualJMLConstruct>nil();
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "assume_statement"



	// $ANTLR start "assume_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1476:1: assume_keyword : ( ASSUME | ASSUME_REDUNDANTLY );
	public final void assume_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1477:2: ( ASSUME | ASSUME_REDUNDANTLY )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= ASSUME && input.LA(1) <= ASSUME_REDUNDANTLY) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assume_keyword"



	// $ANTLR start "expression"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1489:1: expression returns [PositionedString result = null] : ( (t= LPAREN |t= RPAREN |{...}?t= SEMICOLON |t=~ ( LPAREN | RPAREN | SEMICOLON ) ) )* {...}?t= SEMICOLON ;
	public final PositionedString expression() throws RecognitionException {
		PositionedString result =  null;


		Token t=null;


		    int parenthesesCounter = 0;
		    // final StringBuilder text = new StringBuilder();
		    Token begin = null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1495:5: ( ( (t= LPAREN |t= RPAREN |{...}?t= SEMICOLON |t=~ ( LPAREN | RPAREN | SEMICOLON ) ) )* {...}?t= SEMICOLON )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1496:5: ( (t= LPAREN |t= RPAREN |{...}?t= SEMICOLON |t=~ ( LPAREN | RPAREN | SEMICOLON ) ) )* {...}?t= SEMICOLON
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1496:5: ( (t= LPAREN |t= RPAREN |{...}?t= SEMICOLON |t=~ ( LPAREN | RPAREN | SEMICOLON ) ) )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==SEMICOLON) ) {
					int LA38_1 = input.LA(2);
					if ( (( parenthesesCounter > 0 )) ) {
						alt38=1;
					}

				}
				else if ( ((LA38_0 >= ABSTRACT && LA38_0 <= RPAREN)||(LA38_0 >= SEPARATES && LA38_0 <= SPEC_SAVE_MATH)) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1497:9: (t= LPAREN |t= RPAREN |{...}?t= SEMICOLON |t=~ ( LPAREN | RPAREN | SEMICOLON ) )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1497:9: (t= LPAREN |t= RPAREN |{...}?t= SEMICOLON |t=~ ( LPAREN | RPAREN | SEMICOLON ) )
					int alt37=4;
					switch ( input.LA(1) ) {
					case LPAREN:
						{
						alt37=1;
						}
						break;
					case RPAREN:
						{
						alt37=2;
						}
						break;
					case SEMICOLON:
						{
						alt37=3;
						}
						break;
					case ABSTRACT:
					case ACCESSIBLE:
					case ACCESSIBLE_REDUNDANTLY:
					case ALSO:
					case ASSERT:
					case ASSERT_REDUNDANTLY:
					case ASSIGNABLE:
					case ASSIGNABLE_RED:
					case ASSUME:
					case ASSUME_REDUNDANTLY:
					case AXIOM:
					case AXIOM_NAME_BEGIN:
					case AXIOM_NAME_END:
					case BEHAVIOR:
					case BEHAVIOUR:
					case BODY:
					case BRACE_DISPATCH:
					case BREAKS:
					case BREAK_BEHAVIOR:
					case BREAK_BEHAVIOUR:
					case CAPTURES:
					case CAPTURES_RED:
					case CODE:
					case CODE_BIGINT_MATH:
					case CODE_JAVA_MATH:
					case CODE_SAFE_MATH:
					case COMMA:
					case CONST:
					case CONSTRAINT:
					case CONSTRAINT_RED:
					case CONTINUES:
					case CONTINUE_BEHAVIOR:
					case CONTINUE_BEHAVIOUR:
					case DEBUG:
					case DECIMALINTEGERLITERAL:
					case DECREASES:
					case DECREASES_REDUNDANTLY:
					case DECREASING:
					case DECREASING_REDUNDANTLY:
					case DETERMINES:
					case DIGIT:
					case DIGITS:
					case DIVERGES:
					case DIVERGES_RED:
					case DOT:
					case DURATION:
					case DURATION_RED:
					case EMPTYBRACKETS:
					case ENSURES:
					case ENSURES_FREE:
					case ENSURES_RED:
					case EQUALITY:
					case ESC:
					case EXCEPTIONAL_BEHAVIOR:
					case EXCEPTIONAL_BEHAVIOUR:
					case EXSURES:
					case EXSURES_RED:
					case FINAL:
					case FORALL:
					case FOR_EXAMPLE:
					case GHOST:
					case HELPER:
					case HEXDIGIT:
					case HEXINTEGERLITERAL:
					case HEXNUMERAL:
					case IDENT:
					case IMPLIES_THAT:
					case IN:
					case INITIALLY:
					case INSTANCE:
					case INTEGERLITERAL:
					case INTEGERTYPESUFFIX:
					case INVARIANT:
					case INVARIANT_RED:
					case IN_RED:
					case JAVAOPERATOR:
					case JMLSPECIALSYMBOL:
					case JOIN_PROC:
					case LETTER:
					case LOOP_INVARIANT:
					case LOOP_INVARIANT_RED:
					case MAINTAINING:
					case MAINTAINING_REDUNDANTLY:
					case MAPS:
					case MAPS_RED:
					case MEASURED_BY:
					case MEASURED_BY_REDUNDANTLY:
					case ML_COMMENT:
					case MODEL:
					case MODEL_BEHAVIOR:
					case MODEL_BEHAVIOUR:
					case MODIFIABLE:
					case MODIFIABLE_RED:
					case MODIFIES:
					case MODIFIES_RED:
					case MONITORED:
					case MONITORS_FOR:
					case NATIVE:
					case NEST_END:
					case NEST_START:
					case NONZERODIGIT:
					case NON_NULL:
					case NORMAL_BEHAVIOR:
					case NORMAL_BEHAVIOUR:
					case NOWARN:
					case NO_STATE:
					case NULLABLE:
					case NULLABLE_BY_DEFAULT:
					case OCTALDIGIT:
					case OCTALINTEGERLITERAL:
					case OCTALNUMERAL:
					case OLD:
					case POST:
					case POST_RED:
					case PRE:
					case PRE_RED:
					case PRIVATE:
					case PROTECTED:
					case PUBLIC:
					case PURE:
					case READABLE:
					case REPRESENTS:
					case REPRESENTS_RED:
					case REQUIRES:
					case REQUIRES_FREE:
					case REQUIRES_RED:
					case RESPECTS:
					case RETURNS:
					case RETURN_BEHAVIOR:
					case RETURN_BEHAVIOUR:
					case SEPARATES:
					case SET:
					case SIGNALS:
					case SIGNALS_ONLY:
					case SIGNALS_ONLY_RED:
					case SIGNALS_RED:
					case SL_COMMENT:
					case SPEC_BIGINT_MATH:
					case SPEC_JAVA_MATH:
					case SPEC_NAME:
					case SPEC_PROTECTED:
					case SPEC_PUBLIC:
					case SPEC_SAFE_MATH:
					case STATIC:
					case STRICTFP:
					case STRICTLY_PURE:
					case STRING_LITERAL:
					case SYNCHRONIZED:
					case TRANSIENT:
					case TWO_STATE:
					case UNINITIALIZED:
					case UNREACHABLE:
					case VOLATILE:
					case WHEN:
					case WHEN_RED:
					case WORKING_SPACE:
					case WORKING_SPACE_RED:
					case WRITABLE:
					case WS:
					case AXION_NAME_END:
					case CODE_SAVE_MATH:
					case INITIALISER:
					case LOOP_INVARIANT_REDUNDANTLY:
					case SPEC_SAVE_MATH:
						{
						alt37=4;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return result;}
						NoViableAltException nvae =
							new NoViableAltException("", 37, 0, input);
						throw nvae;
					}
					switch (alt37) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1498:13: t= LPAREN
							{
							t=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expression5791); if (state.failed) return result;
							if ( state.backtracking==0 ) { parenthesesCounter++; }
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1499:13: t= RPAREN
							{
							t=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expression5809); if (state.failed) return result;
							if ( state.backtracking==0 ) { parenthesesCounter--; }
							}
							break;
						case 3 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1500:13: {...}?t= SEMICOLON
							{
							if ( !(( parenthesesCounter > 0 )) ) {
								if (state.backtracking>0) {state.failed=true; return result;}
								throw new FailedPredicateException(input, "expression", " parenthesesCounter > 0 ");
							}
							t=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_expression5829); if (state.failed) return result;
							}
							break;
						case 4 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1501:13: t=~ ( LPAREN | RPAREN | SEMICOLON )
							{
							t=input.LT(1);
							if ( (input.LA(1) >= ABSTRACT && input.LA(1) <= LOOP_INVARIANT_RED)||(input.LA(1) >= MAINTAINING && input.LA(1) <= RETURN_BEHAVIOUR)||(input.LA(1) >= SEPARATES && input.LA(1) <= SPEC_SAVE_MATH) ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return result;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					if ( state.backtracking==0 ) { if (begin == null) { begin = t; } /*text.append(" " + t.getText());*/ }
					}
					break;

				default :
					break loop38;
				}
			}

			if ( !(( parenthesesCounter == 0 )) ) {
				if (state.backtracking>0) {state.failed=true; return result;}
				throw new FailedPredicateException(input, "expression", " parenthesesCounter == 0 ");
			}
			t=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_expression5893); if (state.failed) return result;
			if ( state.backtracking==0 ) { if (begin == null) { begin = t; } /*text.append(t.getText());*/ }
			if ( state.backtracking==0 ) {
			       // take the string from the token stream
			       // (do not reconstruct it with false whitespaces)
			       String coveredText = input.toString(begin, input.LT(-1));
			       result = createPositionedString(coveredText, begin);
			    }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "expression"



	// $ANTLR start "initialiser"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1514:1: initialiser returns [String s = null] : EQUALITY ps= expression ;
	public final String initialiser() throws RecognitionException {
		String s =  null;


		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1515:5: ( EQUALITY ps= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1516:9: EQUALITY ps= expression
			{
			match(input,EQUALITY,FOLLOW_EQUALITY_in_initialiser5926); if (state.failed) return s;
			pushFollow(FOLLOW_expression_in_initialiser5930);
			ps=expression();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { s = "=" + ps.text; }
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "initialiser"



	// $ANTLR start "block_specification"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1524:1: block_specification[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> r = null] : result= method_specification[mods] ;
	public final ImmutableList<TextualJMLConstruct> block_specification(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  null;


		ImmutableList<TextualJMLConstruct> result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1529:5: (result= method_specification[mods] )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1531:5: result= method_specification[mods]
			{
			pushFollow(FOLLOW_method_specification_in_block_specification5978);
			result=method_specification(mods);
			state._fsp--;
			if (state.failed) return r;
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "block_specification"



	// $ANTLR start "assert_statement"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1535:1: assert_statement[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> result = null] : ( assert_keyword ps= expression | UNREACHABLE SEMICOLON );
	public final ImmutableList<TextualJMLConstruct> assert_statement(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> result =  null;


		PositionedString ps =null;

		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1538:5: ( assert_keyword ps= expression | UNREACHABLE SEMICOLON )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( ((LA39_0 >= ASSERT && LA39_0 <= ASSERT_REDUNDANTLY)) ) {
				alt39=1;
			}
			else if ( (LA39_0==UNREACHABLE) ) {
				alt39=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return result;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1539:5: assert_keyword ps= expression
					{
					pushFollow(FOLLOW_assert_keyword_in_assert_statement6004);
					assert_keyword();
					state._fsp--;
					if (state.failed) return result;
					pushFollow(FOLLOW_expression_in_assert_statement6008);
					ps=expression();
					state._fsp--;
					if (state.failed) return result;
					if ( state.backtracking==0 ) {
						result = ImmutableSLList.<TextualJMLConstruct>nil().append(TextualJMLSpecCase.assert2blockContract(mods,ps));
					    }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1544:5: UNREACHABLE SEMICOLON
					{
					match(input,UNREACHABLE,FOLLOW_UNREACHABLE_in_assert_statement6026); if (state.failed) return result;
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assert_statement6028); if (state.failed) return result;
					if ( state.backtracking==0 ) {
					  result = ImmutableSLList.<TextualJMLConstruct>nil().append(TextualJMLSpecCase.assert2blockContract(mods,new PositionedString("false")));
					    }
					}
					break;

			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "assert_statement"



	// $ANTLR start "assert_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1551:1: assert_keyword : ( ASSERT | ASSERT_REDUNDANTLY );
	public final void assert_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1552:2: ( ASSERT | ASSERT_REDUNDANTLY )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= ASSERT && input.LA(1) <= ASSERT_REDUNDANTLY) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assert_keyword"



	// $ANTLR start "breaks_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1557:1: breaks_clause returns [PositionedString r = null] : breaks_keyword result= expression ;
	public final PositionedString breaks_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1562:2: ( breaks_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1563:2: breaks_keyword result= expression
			{
			pushFollow(FOLLOW_breaks_keyword_in_breaks_clause6083);
			breaks_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_breaks_clause6087);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = result.prepend("breaks "); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "breaks_clause"



	// $ANTLR start "breaks_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1567:1: breaks_keyword : BREAKS ;
	public final void breaks_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1568:2: ( BREAKS )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1569:2: BREAKS
			{
			match(input,BREAKS,FOLLOW_BREAKS_in_breaks_keyword6100); if (state.failed) return;
			}

		}
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "breaks_keyword"



	// $ANTLR start "continues_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1573:1: continues_clause returns [PositionedString r = null] : continues_keyword result= expression ;
	public final PositionedString continues_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1578:2: ( continues_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1579:2: continues_keyword result= expression
			{
			pushFollow(FOLLOW_continues_keyword_in_continues_clause6131);
			continues_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_continues_clause6135);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = result.prepend("continues "); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "continues_clause"



	// $ANTLR start "continues_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1583:1: continues_keyword : CONTINUES ;
	public final void continues_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1584:2: ( CONTINUES )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1585:2: CONTINUES
			{
			match(input,CONTINUES,FOLLOW_CONTINUES_in_continues_keyword6148); if (state.failed) return;
			}

		}
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "continues_keyword"



	// $ANTLR start "returns_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1589:1: returns_clause returns [PositionedString r = null] : returns_keyword result= expression ;
	public final PositionedString returns_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1594:2: ( returns_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1595:2: returns_keyword result= expression
			{
			pushFollow(FOLLOW_returns_keyword_in_returns_clause6179);
			returns_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_returns_clause6183);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = result.prepend("returns "); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "returns_clause"



	// $ANTLR start "returns_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1599:1: returns_keyword : RETURNS ;
	public final void returns_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1600:2: ( RETURNS )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1601:2: RETURNS
			{
			match(input,RETURNS,FOLLOW_RETURNS_in_returns_keyword6196); if (state.failed) return;
			}

		}
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "returns_keyword"



	// $ANTLR start "joinproc_clause"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1604:1: joinproc_clause returns [PositionedString r = null] : joinproc_keyword result= expression ;
	public final PositionedString joinproc_clause() throws RecognitionException, SLTranslationException {
		PositionedString r =  null;


		PositionedString result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1609:4: ( joinproc_keyword result= expression )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1610:4: joinproc_keyword result= expression
			{
			pushFollow(FOLLOW_joinproc_keyword_in_joinproc_clause6232);
			joinproc_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_joinproc_clause6236);
			result=expression();
			state._fsp--;
			if (state.failed) return r;
			if ( state.backtracking==0 ) { result = result.prepend("join_proc "); }
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "joinproc_clause"



	// $ANTLR start "joinproc_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1614:1: joinproc_keyword : JOIN_PROC ;
	public final void joinproc_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1615:4: ( JOIN_PROC )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1616:4: JOIN_PROC
			{
			match(input,JOIN_PROC,FOLLOW_JOIN_PROC_in_joinproc_keyword6251); if (state.failed) return;
			}

		}
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "joinproc_keyword"



	// $ANTLR start "break_behavior_spec_case"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1620:1: break_behavior_spec_case[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> r = null] : break_behavior_keyword result= generic_spec_case[mods, Behavior.BREAK_BEHAVIOR] ;
	public final ImmutableList<TextualJMLConstruct> break_behavior_spec_case(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  null;


		ImmutableList<TextualJMLConstruct> result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1625:5: ( break_behavior_keyword result= generic_spec_case[mods, Behavior.BREAK_BEHAVIOR] )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1626:5: break_behavior_keyword result= generic_spec_case[mods, Behavior.BREAK_BEHAVIOR]
			{
			pushFollow(FOLLOW_break_behavior_keyword_in_break_behavior_spec_case6286);
			break_behavior_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_generic_spec_case_in_break_behavior_spec_case6294);
			result=generic_spec_case(mods, Behavior.BREAK_BEHAVIOR);
			state._fsp--;
			if (state.failed) return r;
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "break_behavior_spec_case"



	// $ANTLR start "break_behavior_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1631:1: break_behavior_keyword : ( BREAK_BEHAVIOR | BREAK_BEHAVIOUR );
	public final void break_behavior_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1632:2: ( BREAK_BEHAVIOR | BREAK_BEHAVIOUR )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= BREAK_BEHAVIOR && input.LA(1) <= BREAK_BEHAVIOUR) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "break_behavior_keyword"



	// $ANTLR start "continue_behavior_spec_case"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1638:1: continue_behavior_spec_case[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> r = null] : continue_behavior_keyword result= generic_spec_case[mods, Behavior.CONTINUE_BEHAVIOR] ;
	public final ImmutableList<TextualJMLConstruct> continue_behavior_spec_case(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  null;


		ImmutableList<TextualJMLConstruct> result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1643:5: ( continue_behavior_keyword result= generic_spec_case[mods, Behavior.CONTINUE_BEHAVIOR] )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1644:5: continue_behavior_keyword result= generic_spec_case[mods, Behavior.CONTINUE_BEHAVIOR]
			{
			pushFollow(FOLLOW_continue_behavior_keyword_in_continue_behavior_spec_case6349);
			continue_behavior_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_generic_spec_case_in_continue_behavior_spec_case6357);
			result=generic_spec_case(mods, Behavior.CONTINUE_BEHAVIOR);
			state._fsp--;
			if (state.failed) return r;
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "continue_behavior_spec_case"



	// $ANTLR start "continue_behavior_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1649:1: continue_behavior_keyword : ( CONTINUE_BEHAVIOR | CONTINUE_BEHAVIOUR );
	public final void continue_behavior_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1650:2: ( CONTINUE_BEHAVIOR | CONTINUE_BEHAVIOUR )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= CONTINUE_BEHAVIOR && input.LA(1) <= CONTINUE_BEHAVIOUR) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "continue_behavior_keyword"



	// $ANTLR start "return_behavior_spec_case"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1656:1: return_behavior_spec_case[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> r = null] : return_behavior_keyword result= generic_spec_case[mods, Behavior.RETURN_BEHAVIOR] ;
	public final ImmutableList<TextualJMLConstruct> return_behavior_spec_case(ImmutableList<String> mods) throws RecognitionException, SLTranslationException {
		ImmutableList<TextualJMLConstruct> r =  null;


		ImmutableList<TextualJMLConstruct> result =null;

		 result = r; 
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1661:5: ( return_behavior_keyword result= generic_spec_case[mods, Behavior.RETURN_BEHAVIOR] )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1662:5: return_behavior_keyword result= generic_spec_case[mods, Behavior.RETURN_BEHAVIOR]
			{
			pushFollow(FOLLOW_return_behavior_keyword_in_return_behavior_spec_case6412);
			return_behavior_keyword();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_generic_spec_case_in_return_behavior_spec_case6420);
			result=generic_spec_case(mods, Behavior.RETURN_BEHAVIOR);
			state._fsp--;
			if (state.failed) return r;
			}

			if ( state.backtracking==0 ) { r = result; }
		}
		 
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "return_behavior_spec_case"



	// $ANTLR start "return_behavior_keyword"
	// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1667:1: return_behavior_keyword : ( RETURN_BEHAVIOR | RETURN_BEHAVIOUR );
	public final void return_behavior_keyword() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1668:2: ( RETURN_BEHAVIOR | RETURN_BEHAVIOUR )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:
			{
			if ( (input.LA(1) >= RETURN_BEHAVIOR && input.LA(1) <= RETURN_BEHAVIOUR) ) {
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
		 
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "return_behavior_keyword"

	// $ANTLR start synpred1_KeYJMLPreParser
	public final void synpred1_KeYJMLPreParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:230:9: ( accessible_keyword expression )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:230:10: accessible_keyword expression
		{
		pushFollow(FOLLOW_accessible_keyword_in_synpred1_KeYJMLPreParser216);
		accessible_keyword();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred1_KeYJMLPreParser218);
		expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_KeYJMLPreParser

	// $ANTLR start synpred2_KeYJMLPreParser
	public final void synpred2_KeYJMLPreParser_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1055:7: ( LPAREN )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/pretranslation/KeYJMLPreParser.g:1055:8: LPAREN
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred2_KeYJMLPreParser4130); if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_KeYJMLPreParser

	// Delegated rules

	public final boolean synpred2_KeYJMLPreParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_KeYJMLPreParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_KeYJMLPreParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_KeYJMLPreParser_fragment(); // can never throw exception
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
	protected DFA2 dfa2 = new DFA2(this);
	protected DFA3 dfa3 = new DFA3(this);
	protected DFA5 dfa5 = new DFA5(this);
	protected DFA9 dfa9 = new DFA9(this);
	protected DFA15 dfa15 = new DFA15(this);
	protected DFA18 dfa18 = new DFA18(this);
	protected DFA23 dfa23 = new DFA23(this);
	protected DFA36 dfa36 = new DFA36(this);
	static final String DFA1_eotS =
		"\112\uffff";
	static final String DFA1_eofS =
		"\1\1\111\uffff";
	static final String DFA1_minS =
		"\1\4\111\uffff";
	static final String DFA1_maxS =
		"\1\u00aa\111\uffff";
	static final String DFA1_acceptS =
		"\1\uffff\1\2\1\1\107\uffff";
	static final String DFA1_specialS =
		"\112\uffff}>";
	static final String[] DFA1_transitionS = {
			"\13\2\2\uffff\2\2\2\uffff\5\2\1\uffff\2\2\3\uffff\5\2\6\uffff\1\2\2\uffff"+
			"\2\2\1\uffff\2\2\1\uffff\3\2\2\uffff\11\2\3\uffff\5\2\2\uffff\3\2\2\uffff"+
			"\1\2\6\uffff\4\2\1\uffff\7\2\1\uffff\1\2\2\uffff\1\2\1\uffff\7\2\3\uffff"+
			"\15\2\1\uffff\5\2\2\uffff\6\2\1\uffff\5\2\1\uffff\1\2\1\uffff\1\2\3\uffff"+
			"\1\2\1\uffff\1\2\1\uffff\5\2\2\uffff\1\2\2\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "()* loopback of 210:5: (list= classlevel_element[mods] mods= modifiers )*";
		}
	}

	static final String DFA2_eotS =
		"\112\uffff";
	static final String DFA2_eofS =
		"\112\uffff";
	static final String DFA2_minS =
		"\1\4\1\uffff\1\0\107\uffff";
	static final String DFA2_maxS =
		"\1\u00aa\1\uffff\1\0\107\uffff";
	static final String DFA2_acceptS =
		"\1\uffff\1\1\1\uffff\1\3\66\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
		"\1\14\1\uffff\1\15\1\16\1\uffff\1\17\1\20\1\2";
	static final String DFA2_specialS =
		"\2\uffff\1\0\107\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\3\2\2\1\3\2\105\2\3\2\107\1\76\2\uffff\2\3\2\uffff\5\3\1\uffff\2\3"+
			"\3\uffff\2\74\3\3\6\uffff\1\3\2\uffff\2\3\1\uffff\2\3\1\uffff\3\3\2\uffff"+
			"\11\3\3\uffff\1\72\1\3\1\102\1\75\1\3\2\uffff\2\1\1\102\2\uffff\1\3\6"+
			"\uffff\2\102\2\3\1\uffff\7\3\1\uffff\1\77\2\uffff\1\3\1\uffff\3\3\1\110"+
			"\3\3\3\uffff\11\3\1\100\2\73\1\3\1\uffff\5\3\2\uffff\1\3\1\104\4\3\1"+
			"\uffff\5\3\1\uffff\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\1\105\1\uffff"+
			"\4\3\1\101\2\uffff\1\3\2\uffff\1\3",
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
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "223:1: classlevel_element[ImmutableList<String> mods] returns [ImmutableList<TextualJMLConstruct> r = null] : (result= class_invariant[mods] | ( accessible_keyword expression )=>result= depends_clause[mods] |result= method_specification[mods] |result= field_or_method_declaration[mods] |result= represents_clause[mods] |result= history_constraint[mods] |result= initially_clause[mods] |result= class_axiom[mods] |result= monitors_for_clause[mods] |result= readable_if_clause[mods] |result= writable_if_clause[mods] |result= datagroup_clause[mods] |result= set_statement[mods] |result= assert_statement[mods] |result= assume_statement[mods] |result= nowarn_pragma[mods] );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA2_2 = input.LA(1);
						 
						int index2_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_KeYJMLPreParser()) ) {s = 73;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index2_2);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 2, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA3_eotS =
		"\102\uffff";
	static final String DFA3_eofS =
		"\1\1\101\uffff";
	static final String DFA3_minS =
		"\1\4\101\uffff";
	static final String DFA3_maxS =
		"\1\u00aa\101\uffff";
	static final String DFA3_acceptS =
		"\1\uffff\1\2\1\1\77\uffff";
	static final String DFA3_specialS =
		"\102\uffff}>";
	static final String[] DFA3_transitionS = {
			"\12\2\3\uffff\2\2\2\uffff\5\2\1\uffff\2\2\5\uffff\4\2\5\uffff\1\2\2\uffff"+
			"\2\2\1\uffff\2\2\1\uffff\3\2\2\uffff\11\2\3\uffff\2\2\2\uffff\1\2\7\uffff"+
			"\1\2\1\uffff\1\2\2\uffff\2\2\2\uffff\2\2\1\uffff\7\2\4\uffff\1\2\1\uffff"+
			"\7\2\3\uffff\11\2\3\uffff\1\2\1\uffff\5\2\2\uffff\6\2\1\uffff\5\2\1\uffff"+
			"\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff\1\2\1\uffff\4\2\3\uffff\1\2\1\uffff"+
			"\2\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "()* loopback of 256:5: (mods= modifiers list= methodlevel_element[mods] )*";
		}
	}

	static final String DFA5_eotS =
		"\114\uffff";
	static final String DFA5_eofS =
		"\1\1\113\uffff";
	static final String DFA5_minS =
		"\1\4\113\uffff";
	static final String DFA5_maxS =
		"\1\u00aa\113\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\2\30\uffff\31\1\31\uffff";
	static final String DFA5_specialS =
		"\114\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\32\12\1\2\uffff\2\1\2\uffff\5\1\1\uffff\1\62\1\60\3\uffff\6\1\5\uffff"+
			"\1\1\2\uffff\2\1\1\uffff\2\1\1\uffff\3\1\2\uffff\4\1\1\33\2\1\1\34\1"+
			"\35\3\uffff\4\1\1\36\2\uffff\3\1\2\uffff\1\1\1\uffff\1\1\2\uffff\6\1"+
			"\1\uffff\1\37\6\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\40\3\1\1\54\1\41"+
			"\1\42\3\uffff\5\1\1\43\1\44\1\45\1\46\4\1\1\uffff\5\1\2\uffff\6\1\1\uffff"+
			"\1\57\1\55\1\1\1\50\1\51\1\uffff\1\52\1\uffff\1\47\3\uffff\1\53\1\uffff"+
			"\1\1\1\uffff\5\1\2\uffff\1\61\1\uffff\1\1\1\56",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 289:5: ( options {greedy=true; } :s= modifier )*";
		}
	}

	static final String DFA9_eotS =
		"\114\uffff";
	static final String DFA9_eofS =
		"\1\1\113\uffff";
	static final String DFA9_minS =
		"\1\4\113\uffff";
	static final String DFA9_maxS =
		"\1\u00aa\113\uffff";
	static final String DFA9_acceptS =
		"\1\uffff\1\2\33\uffff\1\1\56\uffff";
	static final String DFA9_specialS =
		"\114\uffff}>";
	static final String[] DFA9_transitionS = {
			"\3\1\1\35\7\1\2\uffff\2\1\2\uffff\5\1\1\uffff\2\1\3\uffff\6\1\5\uffff"+
			"\1\1\2\uffff\2\1\1\uffff\2\1\1\uffff\3\1\2\uffff\6\1\1\35\2\1\3\uffff"+
			"\1\1\1\35\3\1\2\uffff\3\1\2\uffff\1\1\1\uffff\1\1\2\uffff\6\1\1\uffff"+
			"\7\1\1\uffff\1\1\2\uffff\1\1\1\uffff\7\1\3\uffff\15\1\1\uffff\5\1\2\uffff"+
			"\6\1\1\uffff\5\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\5\1\2\uffff\1\1\1\uffff\2\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "()* loopback of 406:5: ( options {greedy=true; } : ( also_keyword )+ list= spec_case[ImmutableSLList.<String>nil()] )*";
		}
	}

	static final String DFA15_eotS =
		"\115\uffff";
	static final String DFA15_eofS =
		"\1\25\114\uffff";
	static final String DFA15_minS =
		"\1\4\114\uffff";
	static final String DFA15_maxS =
		"\1\u00aa\114\uffff";
	static final String DFA15_acceptS =
		"\1\uffff\24\1\1\2\67\uffff";
	static final String DFA15_specialS =
		"\115\uffff}>";
	static final String[] DFA15_transitionS = {
			"\1\25\2\2\3\25\2\1\3\25\2\uffff\2\25\2\uffff\1\17\2\25\2\13\1\uffff\2"+
			"\25\3\uffff\2\25\1\20\3\25\5\uffff\1\23\2\uffff\2\10\1\uffff\2\16\1\uffff"+
			"\1\3\1\4\1\3\2\uffff\2\25\2\5\5\25\3\uffff\5\25\2\uffff\3\25\2\uffff"+
			"\1\6\1\uffff\1\25\2\uffff\4\25\2\11\1\uffff\3\25\4\1\1\uffff\1\25\1\uffff"+
			"\1\25\1\24\1\uffff\7\25\3\uffff\1\25\2\3\12\25\1\uffff\1\25\1\22\1\21"+
			"\2\25\2\uffff\1\22\1\25\1\5\2\7\1\5\1\uffff\2\25\1\12\2\25\1\uffff\1"+
			"\25\1\uffff\1\25\3\uffff\1\25\1\uffff\1\25\1\uffff\2\14\2\15\1\25\2\uffff"+
			"\1\25\1\uffff\2\25",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "564:8: ( options {greedy=true; } :result= generic_spec_body[mods, b, result] )?";
		}
	}

	static final String DFA18_eotS =
		"\116\uffff";
	static final String DFA18_eofS =
		"\1\1\115\uffff";
	static final String DFA18_minS =
		"\1\4\115\uffff";
	static final String DFA18_maxS =
		"\1\u00aa\115\uffff";
	static final String DFA18_acceptS =
		"\1\uffff\1\2\62\uffff\1\1\31\uffff";
	static final String DFA18_specialS =
		"\116\uffff}>";
	static final String[] DFA18_transitionS = {
			"\13\1\2\uffff\2\1\2\uffff\5\1\1\uffff\2\1\3\uffff\6\1\5\uffff\1\1\2\uffff"+
			"\2\1\1\uffff\2\1\1\uffff\3\1\2\uffff\11\1\3\uffff\5\1\2\uffff\3\1\2\uffff"+
			"\1\1\1\uffff\1\1\2\uffff\6\1\1\uffff\7\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
			"\7\1\3\uffff\3\1\2\64\7\1\1\64\1\1\1\64\4\1\2\uffff\6\1\1\uffff\5\1\1"+
			"\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\1\uffff\5\1\2\uffff\1"+
			"\1\1\uffff\2\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "()+ loopback of 613:5: ( options {greedy=true; } :ps= requires_clause )+";
		}
	}

	static final String DFA23_eotS =
		"\115\uffff";
	static final String DFA23_eofS =
		"\1\1\114\uffff";
	static final String DFA23_minS =
		"\1\4\114\uffff";
	static final String DFA23_maxS =
		"\1\u00aa\114\uffff";
	static final String DFA23_acceptS =
		"\1\uffff\1\2\33\uffff\1\1\3\uffff\22\1\32\uffff";
	static final String DFA23_specialS =
		"\115\uffff}>";
	static final String[] DFA23_transitionS = {
			"\1\1\2\35\3\1\2\41\3\1\2\uffff\2\1\2\uffff\1\56\2\1\2\52\1\uffff\2\1"+
			"\3\uffff\2\1\1\57\3\1\5\uffff\1\62\2\uffff\2\47\1\uffff\2\55\1\uffff"+
			"\1\42\1\43\1\42\2\uffff\2\1\2\44\5\1\3\uffff\5\1\2\uffff\3\1\2\uffff"+
			"\1\45\1\uffff\1\1\2\uffff\4\1\2\50\1\uffff\3\1\4\41\1\uffff\1\1\1\uffff"+
			"\2\1\1\uffff\7\1\3\uffff\1\1\2\42\12\1\1\uffff\1\1\1\61\1\60\2\1\2\uffff"+
			"\1\61\1\1\1\44\2\46\1\44\1\uffff\2\1\1\51\2\1\1\uffff\1\1\1\uffff\1\1"+
			"\3\uffff\1\1\1\uffff\1\1\1\uffff\2\53\2\54\1\1\2\uffff\1\1\1\uffff\2"+
			"\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "()+ loopback of 716:5: ( options {greedy=true; } : simple_spec_body_clause[sc, b] )+";
		}
	}

	static final String DFA36_eotS =
		"\103\uffff";
	static final String DFA36_eofS =
		"\1\1\102\uffff";
	static final String DFA36_minS =
		"\1\4\102\uffff";
	static final String DFA36_maxS =
		"\1\u00aa\102\uffff";
	static final String DFA36_acceptS =
		"\1\uffff\1\6\33\uffff\1\1\11\uffff\1\4\20\uffff\1\2\1\3\10\uffff\1\5";
	static final String DFA36_specialS =
		"\103\uffff}>";
	static final String[] DFA36_transitionS = {
			"\6\1\2\47\2\1\3\uffff\2\1\2\uffff\5\1\1\uffff\2\1\5\uffff\4\1\1\uffff"+
			"\4\102\1\71\2\uffff\2\1\1\uffff\2\1\1\uffff\3\1\2\uffff\11\1\3\uffff"+
			"\2\1\2\uffff\1\1\7\uffff\1\1\1\uffff\1\35\2\uffff\2\35\2\uffff\2\1\1"+
			"\uffff\3\1\4\47\4\uffff\1\1\1\uffff\7\1\3\uffff\11\1\3\uffff\1\1\1\uffff"+
			"\1\1\1\70\3\1\2\uffff\1\70\5\1\1\uffff\5\1\1\uffff\1\1\1\uffff\1\1\3"+
			"\uffff\1\1\1\uffff\1\1\1\uffff\4\1\3\uffff\1\1\1\uffff\1\35\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "()* loopback of 1392:5: ( options {greedy=true; } :ps= loop_invariant |ps= loop_separates_clause |ps= loop_determines_clause |ps= assignable_clause |ps= variant_function )*";
		}
	}

	public static final BitSet FOLLOW_modifiers_in_classlevel_comment115 = new BitSet(new long[]{0xFE76C81F1BE67FF0L,0xFFF1FD2FEF0273E3L,0x0000049F515F7E7DL});
	public static final BitSet FOLLOW_classlevel_element_in_classlevel_comment131 = new BitSet(new long[]{0xFE76C81F1BE67FF0L,0xFFF1FD2FEF0273E3L,0x0000049F515F7E7DL});
	public static final BitSet FOLLOW_modifiers_in_classlevel_comment150 = new BitSet(new long[]{0xFE76C81F1BE67FF0L,0xFFF1FD2FEF0273E3L,0x0000049F515F7E7DL});
	public static final BitSet FOLLOW_EOF_in_classlevel_comment163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_class_invariant_in_classlevel_element204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_depends_clause_in_classlevel_element225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_specification_in_classlevel_element238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_or_method_declaration_in_classlevel_element251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_represents_clause_in_classlevel_element264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_history_constraint_in_classlevel_element277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_initially_clause_in_classlevel_element290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_class_axiom_in_classlevel_element303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_monitors_for_clause_in_classlevel_element316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readable_if_clause_in_classlevel_element329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_writable_if_clause_in_classlevel_element342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datagroup_clause_in_classlevel_element355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_statement_in_classlevel_element368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assert_statement_in_classlevel_element385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assume_statement_in_classlevel_element399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nowarn_pragma_in_classlevel_element413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_methodlevel_comment448 = new BitSet(new long[]{0xFE76C83C1BE63FF0L,0x1FF1FD0FECCA0263L,0x0000068F515F7E7DL});
	public static final BitSet FOLLOW_methodlevel_element_in_methodlevel_comment453 = new BitSet(new long[]{0xFE76C83C1BE63FF0L,0x1FF1FD0FECCA0263L,0x0000068F515F7E7DL});
	public static final BitSet FOLLOW_EOF_in_methodlevel_comment466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_or_method_declaration_in_methodlevel_element507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_statement_in_methodlevel_element520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_specification_in_methodlevel_element533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assert_statement_in_methodlevel_element546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assume_statement_in_methodlevel_element559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nowarn_pragma_in_methodlevel_element572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_debug_statement_in_methodlevel_element585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_specification_in_methodlevel_element598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_modifiers648 = new BitSet(new long[]{0x2000000018000012L,0x1E01C40020000203L,0x00000480115B0000L});
	public static final BitSet FOLLOW_ABSTRACT_in_modifier681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FINAL_in_modifier706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GHOST_in_modifier734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HELPER_in_modifier762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTANCE_in_modifier789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MODEL_in_modifier814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_NULL_in_modifier842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULLABLE_in_modifier867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULLABLE_BY_DEFAULT_in_modifier892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIVATE_in_modifier906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROTECTED_in_modifier932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUBLIC_in_modifier956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PURE_in_modifier983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRICTLY_PURE_in_modifier1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPEC_PROTECTED_in_modifier1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPEC_PUBLIC_in_modifier1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_modifier1073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWO_STATE_in_modifier1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NO_STATE_in_modifier1124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPEC_JAVA_MATH_in_modifier1149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPEC_SAVE_MATH_in_modifier1168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPEC_BIGINT_MATH_in_modifier1187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODE_JAVA_MATH_in_modifier1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODE_SAVE_MATH_in_modifier1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODE_BIGINT_MATH_in_modifier1242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_invariant_keyword_in_class_invariant1282 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_class_invariant1291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AXIOM_NAME_BEGIN_in_axiom_name1320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_IDENT_in_axiom_name1324 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AXIOM_NAME_END_in_axiom_name1326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AXIOM_in_class_axiom1416 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_class_axiom1420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INITIALLY_in_initially_clause1485 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_initially_clause1489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_also_keyword_in_method_specification1534 = new BitSet(new long[]{0xFE76C81C1BE60CF0L,0x1FF1DD0FEC020243L,0x0000048F115F7A7DL});
	public static final BitSet FOLLOW_spec_case_in_method_specification1544 = new BitSet(new long[]{0x8000000000000082L,0x0000000000000040L});
	public static final BitSet FOLLOW_also_keyword_in_method_specification1570 = new BitSet(new long[]{0xFE76C81C1BE60CF0L,0x1FF1DD0FEC020243L,0x0000048F115F7A7DL});
	public static final BitSet FOLLOW_spec_case_in_method_specification1576 = new BitSet(new long[]{0x8000000000000082L,0x0000000000000040L});
	public static final BitSet FOLLOW_lightweight_spec_case_in_spec_case1650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_heavyweight_spec_case_in_spec_case1662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_generic_spec_case_in_lightweight_spec_case1705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_heavyweight_spec_case1749 = new BitSet(new long[]{0x0600001800C60000L,0x00001800C0000000L,0x0000000000000060L});
	public static final BitSet FOLLOW_behavior_spec_case_in_heavyweight_spec_case1769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_break_behavior_spec_case_in_heavyweight_spec_case1783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_continue_behavior_spec_case_in_heavyweight_spec_case1797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exceptional_behavior_spec_case_in_heavyweight_spec_case1811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normal_behavior_spec_case_in_heavyweight_spec_case1821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_model_behavior_spec_case_in_heavyweight_spec_case1831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return_behavior_spec_case_in_heavyweight_spec_case1841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_behavior_keyword_in_behavior_spec_case1883 = new BitSet(new long[]{0x5876C80403200C60L,0x01F0010F0C020000L,0x0000000F00047A1DL});
	public static final BitSet FOLLOW_generic_spec_case_in_behavior_spec_case1891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normal_behavior_keyword_in_normal_behavior_spec_case1947 = new BitSet(new long[]{0x5876C80403200C60L,0x01F0010F0C020000L,0x0000000F00047A1DL});
	public static final BitSet FOLLOW_generic_spec_case_in_normal_behavior_spec_case1955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_model_behavior_keyword_in_model_behavior_spec_case2010 = new BitSet(new long[]{0x5876C80403200C60L,0x01F0010F0C020000L,0x0000000F00047A1DL});
	public static final BitSet FOLLOW_generic_spec_case_in_model_behavior_spec_case2018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exceptional_behavior_keyword_in_exceptional_behavior_spec_case2077 = new BitSet(new long[]{0x5876C80403200C60L,0x01F0010F0C020000L,0x0000000F00047A1DL});
	public static final BitSet FOLLOW_generic_spec_case_in_exceptional_behavior_spec_case2085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_spec_var_decls_in_generic_spec_case2148 = new BitSet(new long[]{0x1876C80403200C60L,0x01E0010F0C020000L,0x0000000F00047A1DL});
	public static final BitSet FOLLOW_spec_header_in_generic_spec_case2160 = new BitSet(new long[]{0x1876C80403200C62L,0x0060010F0C020000L,0x0000000F00047A1AL});
	public static final BitSet FOLLOW_free_spec_header_in_generic_spec_case2171 = new BitSet(new long[]{0x1876C80403200C62L,0x0060010F0C020000L,0x0000000F00047A18L});
	public static final BitSet FOLLOW_generic_spec_body_in_generic_spec_case2204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_generic_spec_body_in_generic_spec_case2230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_old_clause_in_spec_var_decls2276 = new BitSet(new long[]{0x4000000000000002L,0x0010000000000000L});
	public static final BitSet FOLLOW_FORALL_in_spec_var_decls2311 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_spec_var_decls2315 = new BitSet(new long[]{0x4000000000000002L,0x0010000000000000L});
	public static final BitSet FOLLOW_requires_clause_in_spec_header2372 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L,0x0000000000000005L});
	public static final BitSet FOLLOW_requires_free_clause_in_free_spec_header2426 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_requires_keyword_in_requires_clause2470 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_requires_clause2474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REQUIRES_FREE_in_requires_free_clause2541 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_requires_free_clause2545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_spec_body_in_generic_spec_body2584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEST_START_in_generic_spec_body2605 = new BitSet(new long[]{0x5876C80403200C60L,0x01F0010F0C020000L,0x0000000F00047A1DL});
	public static final BitSet FOLLOW_generic_spec_case_seq_in_generic_spec_body2614 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_NEST_END_in_generic_spec_body2622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_generic_spec_case_in_generic_spec_case_seq2665 = new BitSet(new long[]{0x8000000000000082L,0x0000000000000040L});
	public static final BitSet FOLLOW_also_keyword_in_generic_spec_case_seq2683 = new BitSet(new long[]{0xD876C80403200CE0L,0x01F0010F0C020040L,0x0000000F00047A1DL});
	public static final BitSet FOLLOW_generic_spec_case_in_generic_spec_case_seq2697 = new BitSet(new long[]{0x8000000000000082L,0x0000000000000040L});
	public static final BitSet FOLLOW_simple_spec_body_clause_in_simple_spec_body2763 = new BitSet(new long[]{0x1876C80403200C62L,0x0060000F0C020000L,0x0000000F00047A18L});
	public static final BitSet FOLLOW_assignable_clause_in_simple_spec_body_clause2805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessible_clause_in_simple_spec_body_clause2820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ensures_clause_in_simple_spec_body_clause2835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ensures_free_clause_in_simple_spec_body_clause2853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signals_clause_in_simple_spec_body_clause2866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joinproc_clause_in_simple_spec_body_clause2886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signals_only_clause_in_simple_spec_body_clause2904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_diverges_clause_in_simple_spec_body_clause2917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_measured_by_clause_in_simple_spec_body_clause2934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_clause_in_simple_spec_body_clause2948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_captures_clause_in_simple_spec_body_clause2967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_when_clause_in_simple_spec_body_clause2974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_working_space_clause_in_simple_spec_body_clause2981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_duration_clause_in_simple_spec_body_clause2988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breaks_clause_in_simple_spec_body_clause2997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_continues_clause_in_simple_spec_body_clause3016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returns_clause_in_simple_spec_body_clause3032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_separates_clause_in_simple_spec_body_clause3057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_determines_clause_in_simple_spec_body_clause3080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_separates_keyword_in_separates_clause3140 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_separates_clause3144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_determines_keyword_in_determines_clause3208 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_determines_clause3212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DETERMINES_in_determines_keyword3232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignable_keyword_in_assignable_clause3266 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_assignable_clause3270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessible_keyword_in_accessible_clause3367 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_accessible_clause3371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_measured_by_keyword_in_measured_by_clause3436 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_measured_by_clause3440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ensures_keyword_in_ensures_clause3504 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_ensures_clause3508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENSURES_FREE_in_ensures_free_clause3567 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_ensures_free_clause3571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signals_keyword_in_signals_clause3607 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_signals_clause3611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signals_only_keyword_in_signals_only_clause3688 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_signals_only_clause3692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_diverges_keyword_in_diverges_clause3749 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_diverges_clause3753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_captures_keyword_in_captures_clause3792 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_captures_clause3796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPEC_NAME_in_name_clause3849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_name_clause3853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_SEMICOLON_in_name_clause3855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_when_keyword_in_when_clause3879 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_when_clause3883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_working_space_keyword_in_working_space_clause3928 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_working_space_clause3932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_duration_keyword_in_duration_clause3977 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_duration_clause3981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLD_in_old_clause4028 = new BitSet(new long[]{0x2000000018000010L,0x1E01C40020000223L,0x00000480115B0000L});
	public static final BitSet FOLLOW_modifiers_in_old_clause4032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_type_in_old_clause4037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_IDENT_in_old_clause4042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_INITIALISER_in_old_clause4047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_type4079 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_EMPTYBRACKETS_in_type4090 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_type_in_field_or_method_declaration4115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_IDENT_in_field_or_method_declaration4120 = new BitSet(new long[]{0x0088000000000000L,0x0000000000200000L,0x0000000000000100L});
	public static final BitSet FOLLOW_method_declaration_in_field_or_method_declaration4139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_declaration_in_field_or_method_declaration4162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMPTYBRACKETS_in_field_declaration4204 = new BitSet(new long[]{0x0088000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_initialiser_in_field_declaration4223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_field_declaration4235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_list_in_method_declaration4284 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_BODY_in_method_declaration4303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_method_declaration4320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_param_list4369 = new BitSet(new long[]{0x0000000000000000L,0x0000840000000020L,0x0000000000000080L});
	public static final BitSet FOLLOW_param_decl_in_param_list4397 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_COMMA_in_param_list4433 = new BitSet(new long[]{0x0000000000000000L,0x0000840000000020L});
	public static final BitSet FOLLOW_param_decl_in_param_list4453 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_RPAREN_in_param_list4509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_param_decl4567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_IDENT_in_param_decl4611 = new BitSet(new long[]{0x0008000000008000L,0x0000000000000020L});
	public static final BitSet FOLLOW_AXIOM_NAME_BEGIN_in_param_decl4645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_AXION_NAME_END_in_param_decl4660 = new BitSet(new long[]{0x0008000000008000L,0x0000000000000020L});
	public static final BitSet FOLLOW_EMPTYBRACKETS_in_param_decl4675 = new BitSet(new long[]{0x0008000000008000L,0x0000000000000020L});
	public static final BitSet FOLLOW_IDENT_in_param_decl4718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_represents_keyword_in_represents_clause4762 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_represents_clause4766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessible_keyword_in_depends_clause4830 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_depends_clause4834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constraint_keyword_in_history_constraint4870 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_history_constraint4874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MONITORS_FOR_in_monitors_for_clause4934 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_monitors_for_clause4938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READABLE_in_readable_if_clause4969 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_readable_if_clause4973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WRITABLE_in_writable_if_clause5004 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_writable_if_clause5008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_group_clause_in_datagroup_clause5039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_maps_into_clause_in_datagroup_clause5043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_keyword_in_in_group_clause5062 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_in_group_clause5066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_maps_keyword_in_maps_into_clause5110 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_maps_into_clause5114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOWARN_in_nowarn_pragma5165 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_nowarn_pragma5169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEBUG_in_debug_statement5202 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_debug_statement5206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_set_statement5236 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_set_statement5240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_invariant_in_loop_specification5283 = new BitSet(new long[]{0x00000F8000000C02L,0x0000000F00C80000L,0x0000020000000208L});
	public static final BitSet FOLLOW_loop_invariant_in_loop_specification5328 = new BitSet(new long[]{0x00000F8000000C02L,0x0000000F00C80000L,0x0000020000000208L});
	public static final BitSet FOLLOW_loop_separates_clause_in_loop_specification5352 = new BitSet(new long[]{0x00000F8000000C02L,0x0000000F00C80000L,0x0000020000000208L});
	public static final BitSet FOLLOW_loop_determines_clause_in_loop_specification5375 = new BitSet(new long[]{0x00000F8000000C02L,0x0000000F00C80000L,0x0000020000000208L});
	public static final BitSet FOLLOW_assignable_clause_in_loop_specification5398 = new BitSet(new long[]{0x00000F8000000C02L,0x0000000F00C80000L,0x0000020000000208L});
	public static final BitSet FOLLOW_variant_function_in_loop_specification5419 = new BitSet(new long[]{0x00000F8000000C02L,0x0000000F00C80000L,0x0000020000000208L});
	public static final BitSet FOLLOW_maintaining_keyword_in_loop_invariant5460 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_loop_invariant5464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decreasing_keyword_in_variant_function5541 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_variant_function5545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_separates_keyword_in_loop_separates_clause5630 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_loop_separates_clause5634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_determines_keyword_in_loop_determines_clause5670 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_loop_determines_clause5674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assume_keyword_in_assume_statement5707 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_assume_statement5711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expression5791 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_RPAREN_in_expression5809 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_SEMICOLON_in_expression5829 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_set_in_expression5845 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_SEMICOLON_in_expression5893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALITY_in_initialiser5926 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_initialiser5930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_specification_in_block_specification5978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assert_keyword_in_assert_statement6004 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_assert_statement6008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNREACHABLE_in_assert_statement6026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_SEMICOLON_in_assert_statement6028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breaks_keyword_in_breaks_clause6083 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_breaks_clause6087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAKS_in_breaks_keyword6100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_continues_keyword_in_continues_clause6131 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_continues_clause6135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUES_in_continues_keyword6148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returns_keyword_in_returns_clause6179 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_returns_clause6183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURNS_in_returns_keyword6196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joinproc_keyword_in_joinproc_clause6232 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_joinproc_clause6236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOIN_PROC_in_joinproc_keyword6251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_break_behavior_keyword_in_break_behavior_spec_case6286 = new BitSet(new long[]{0x5876C80403200C60L,0x01F0010F0C020000L,0x0000000F00047A1DL});
	public static final BitSet FOLLOW_generic_spec_case_in_break_behavior_spec_case6294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_continue_behavior_keyword_in_continue_behavior_spec_case6349 = new BitSet(new long[]{0x5876C80403200C60L,0x01F0010F0C020000L,0x0000000F00047A1DL});
	public static final BitSet FOLLOW_generic_spec_case_in_continue_behavior_spec_case6357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return_behavior_keyword_in_return_behavior_spec_case6412 = new BitSet(new long[]{0x5876C80403200C60L,0x01F0010F0C020000L,0x0000000F00047A1DL});
	public static final BitSet FOLLOW_generic_spec_case_in_return_behavior_spec_case6420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessible_keyword_in_synpred1_KeYJMLPreParser216 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
	public static final BitSet FOLLOW_expression_in_synpred1_KeYJMLPreParser218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred2_KeYJMLPreParser4130 = new BitSet(new long[]{0x0000000000000002L});
}
