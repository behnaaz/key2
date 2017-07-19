// $ANTLR 3.5.2 /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g 2017-04-13 18:24:03

    package de.uka.ilkd.key.parser;

    import java.io.InputStream;
    import de.uka.ilkd.key.util.*;
    import java.util.HashMap;
    import java.util.LinkedHashMap;
    import antlr.CharStreamException;
    import antlr.TokenStreamException;
    import org.antlr.runtime.*;
    import java.util.NoSuchElementException;
    import java.io.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class KeYLexer extends Lexer {
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

	    class SaveStruct {
	        SaveStruct (CharStream input) {
	            this.input = input;
	            this.marker = input.mark();
	        }

	        public CharStream input;
	        public int marker;
	    }

	    protected Stack<SaveStruct> selector = new Stack<SaveStruct>();;

	    public Stack<SaveStruct> getSelector() {
	      return selector;
	    }

	   // We should override this method for handling EOF of included file
	   @Override
	   public Token nextToken(){
	     Token token = super.nextToken();

	     if (token.getType() == Token.EOF && !selector.empty()) {
	       // We've got EOF and have non empty stack.
	       SaveStruct ss = selector.pop();
	       setCharStream(ss.input);
	       input.rewind(ss.marker);
	       // this should be used instead of super [like below] to handle exits from nested includes
	       // it matters, when the 'include' token is the last in previous stream (using super, lexer 'crashes' returning EOF token)
	       token = this.nextToken();
	     }

	     // Skip first token after switching on another input.
	     // You need to use this rather than super as there may be nested include files
	     if (((CommonToken)token).getStartIndex() < 0) {
	       token = this.nextToken();
	     }

	     return token;
	   }

	   private String modalityBegin = null;
	   private String modalityEnd = null;

	   private static HashMap<String,String> modNames = new LinkedHashMap<String,String>(20);
	   private static HashMap<String,String> modPairs = new LinkedHashMap<String,String>(20);

	   static {
	      modNames.put("\\<","diamond");
	      modNames.put("\\diamond","diamond");
	      modNames.put("\\diamond_transaction","diamond_transaction");
	      modNames.put("\\[","box");
	      modNames.put("\\box","box");
	      modNames.put("\\box_transaction","box_transaction");
	      modNames.put("\\[[","throughout");
	      modNames.put("\\throughout","throughout");
	      modNames.put("\\throughout_transaction","throughout_transaction");

	      modPairs.put("\\<","\\>");
	      modPairs.put("\\modality","\\endmodality");
	      modPairs.put("\\diamond","\\endmodality");
	      modPairs.put("\\diamond_transaction","\\endmodality");
	      modPairs.put("\\[","\\]");
	      modPairs.put("\\box","\\endmodality");
	      modPairs.put("\\box_transaction","\\endmodality");
	      modPairs.put("\\[[","\\]]");
	      modPairs.put("\\throughout","\\endmodality");
	      modPairs.put("\\throughout_transaction","\\endmodality");
	   }

	   public void recover( RecognitionException ex, BitSet tokenSet ) throws CharStreamException {
	     input.consume();
	     int ttype = input.LA(1);
	     while (ttype != Token.EOF && !tokenSet.member(ttype)) {
	       input.consume();
	       ttype = input.LA(1);
	     }
	   }

	   private void matchAndTransformModality(int beginIndex) throws RecognitionException {
	      if(!modalityEnd.equals((String)modPairs.get(modalityBegin)))
	          throw new NoViableAltException("Unknown modality " +
		   "expression "+modalityBegin+"..."+modalityEnd+". (" +
		     getSourceName() + ", " + getLine() + ", " + getCharPositionInLine() + ")", -1, -1, input);

	      StringBuffer newText = new StringBuffer();
	      int index = 0;
	      int first = 0;
	      int last = 0;
	      String s = getText();
	      newText.append(s.substring(0,beginIndex));
	      index = beginIndex + modalityBegin.length();
	      String modName = "";
	      if("\\modality".equals(modalityBegin)) {
	         // Have to extract the name of (schema) modality inside the first {}
		 while(s.charAt(index) == ' ' || s.charAt(index) == '\t' ||
		       s.charAt(index) == '\n' || s.charAt(index) == '\r') index++;
		 if(s.charAt(index) != '{') {
	           throw new NoViableAltException("Expression "+modalityBegin+" should be followed by {...}. (" +
		     getSourceName() + ", " + getLine() + ", " + getCharPositionInLine() + ")", -1, -1, input);
		 }
	         index++;
		 first = index;
		 char currChar = s.charAt(index);
		 while(currChar == ' ' || currChar == '\t' ||
		       currChar == '\r' || currChar == '\n') {
		     index++; first = index;
		     currChar = s.charAt(index);
		 }
		 last = first;
		 while((currChar >= 'a' && currChar <= 'z') ||
		        (currChar >= 'A' && currChar <= 'Z') ||
			currChar == '_' || currChar == '#') {
		     index++; last = index;
		     currChar = s.charAt(index);
		 }
		 while(currChar == ' ' || currChar == '\t' ||
		       currChar == '\r' || currChar == '\n') {
		     index++;
		     currChar = s.charAt(index);
		 }
		 if(s.charAt(index) != '}') {
	            throw new NoViableAltException("Expected '}', found "+s.charAt(index)+". (" + getSourceName() + ", " + getLine() + ", " + getCharPositionInLine() + ")", -1, -1, input);
	         }
		 index++;
		 modName=s.substring(first,last);
		 if("".equals(modName)) {
	            throw new NoViableAltException("Empty modality name. Modality block	was: "+s + "(" + getSourceName() + ", " + getLine() + ", " + getCharPositionInLine() + ")", -1, -1, input);
		 }
	      }else{
	         modName = (String)modNames.get(modalityBegin);
		 if(modName==null) {
	            throw new NoViableAltException("Unknown modality "+modalityBegin+". (" + getSourceName() + ", " + getLine() + ", " + getCharPositionInLine() + ")", -1, -1, input);
		 }

	      }
	      newText.append(modName+"\n");
	      //Debug.out("Modality name :", modName);
	      last = s.lastIndexOf(modalityEnd);
	      newText.append(s.substring(index,last));
	      setText(newText.toString());
	      //Debug.out("Lexer: recognised Java block string: ", getText());
	   }



	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public KeYLexer() {} 
	public KeYLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public KeYLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g"; }

	// $ANTLR start "SORTS"
	public final void mSORTS() throws RecognitionException {
		try {
			int _type = SORTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:200:7: ( '\\\\sorts' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:200:8: '\\\\sorts'
			{
			match("\\sorts"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SORTS"

	// $ANTLR start "GENERIC"
	public final void mGENERIC() throws RecognitionException {
		try {
			int _type = GENERIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:201:10: ( '\\\\generic' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:201:12: '\\\\generic'
			{
			match("\\generic"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GENERIC"

	// $ANTLR start "PROXY"
	public final void mPROXY() throws RecognitionException {
		try {
			int _type = PROXY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:202:8: ( '\\\\proxy' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:202:10: '\\\\proxy'
			{
			match("\\proxy"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROXY"

	// $ANTLR start "EXTENDS"
	public final void mEXTENDS() throws RecognitionException {
		try {
			int _type = EXTENDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:203:17: ( '\\\\extends' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:203:19: '\\\\extends'
			{
			match("\\extends"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTENDS"

	// $ANTLR start "ONEOF"
	public final void mONEOF() throws RecognitionException {
		try {
			int _type = ONEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:204:15: ( '\\\\oneof' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:204:17: '\\\\oneof'
			{
			match("\\oneof"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ONEOF"

	// $ANTLR start "ABSTRACT"
	public final void mABSTRACT() throws RecognitionException {
		try {
			int _type = ABSTRACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:205:11: ( '\\\\abstract' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:205:13: '\\\\abstract'
			{
			match("\\abstract"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ABSTRACT"

	// $ANTLR start "SCHEMAVARIABLES"
	public final void mSCHEMAVARIABLES() throws RecognitionException {
		try {
			int _type = SCHEMAVARIABLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:208:18: ( '\\\\schemaVariables' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:208:20: '\\\\schemaVariables'
			{
			match("\\schemaVariables"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCHEMAVARIABLES"

	// $ANTLR start "SCHEMAVAR"
	public final void mSCHEMAVAR() throws RecognitionException {
		try {
			int _type = SCHEMAVAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:209:12: ( '\\\\schemaVar' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:209:14: '\\\\schemaVar'
			{
			match("\\schemaVar"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCHEMAVAR"

	// $ANTLR start "MODALOPERATOR"
	public final void mMODALOPERATOR() throws RecognitionException {
		try {
			int _type = MODALOPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:210:16: ( '\\\\modalOperator' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:210:18: '\\\\modalOperator'
			{
			match("\\modalOperator"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODALOPERATOR"

	// $ANTLR start "PROGRAM"
	public final void mPROGRAM() throws RecognitionException {
		try {
			int _type = PROGRAM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:211:10: ( '\\\\program' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:211:12: '\\\\program'
			{
			match("\\program"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROGRAM"

	// $ANTLR start "FORMULA"
	public final void mFORMULA() throws RecognitionException {
		try {
			int _type = FORMULA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:212:10: ( '\\\\formula' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:212:12: '\\\\formula'
			{
			match("\\formula"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FORMULA"

	// $ANTLR start "TERM"
	public final void mTERM() throws RecognitionException {
		try {
			int _type = TERM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:213:7: ( '\\\\term' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:213:9: '\\\\term'
			{
			match("\\term"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TERM"

	// $ANTLR start "UPDATE"
	public final void mUPDATE() throws RecognitionException {
		try {
			int _type = UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:214:9: ( '\\\\update' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:214:11: '\\\\update'
			{
			match("\\update"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UPDATE"

	// $ANTLR start "VARIABLES"
	public final void mVARIABLES() throws RecognitionException {
		try {
			int _type = VARIABLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:215:12: ( '\\\\variables' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:215:14: '\\\\variables'
			{
			match("\\variables"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLES"

	// $ANTLR start "VARIABLE"
	public final void mVARIABLE() throws RecognitionException {
		try {
			int _type = VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:216:11: ( '\\\\variable' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:216:13: '\\\\variable'
			{
			match("\\variable"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLE"

	// $ANTLR start "SKOLEMTERM"
	public final void mSKOLEMTERM() throws RecognitionException {
		try {
			int _type = SKOLEMTERM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:217:13: ( '\\\\skolemTerm' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:217:15: '\\\\skolemTerm'
			{
			match("\\skolemTerm"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SKOLEMTERM"

	// $ANTLR start "SKOLEMFORMULA"
	public final void mSKOLEMFORMULA() throws RecognitionException {
		try {
			int _type = SKOLEMFORMULA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:218:16: ( '\\\\skolemFormula' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:218:18: '\\\\skolemFormula'
			{
			match("\\skolemFormula"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SKOLEMFORMULA"

	// $ANTLR start "TERMLABEL"
	public final void mTERMLABEL() throws RecognitionException {
		try {
			int _type = TERMLABEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:219:12: ( '\\\\termlabel' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:219:14: '\\\\termlabel'
			{
			match("\\termlabel"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TERMLABEL"

	// $ANTLR start "MODIFIES"
	public final void mMODIFIES() throws RecognitionException {
		try {
			int _type = MODIFIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:222:11: ( '\\\\modifies' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:222:13: '\\\\modifies'
			{
			match("\\modifies"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODIFIES"

	// $ANTLR start "PROGRAMVARIABLES"
	public final void mPROGRAMVARIABLES() throws RecognitionException {
		try {
			int _type = PROGRAMVARIABLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:225:19: ( '\\\\programVariables' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:225:21: '\\\\programVariables'
			{
			match("\\programVariables"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROGRAMVARIABLES"

	// $ANTLR start "VARCOND"
	public final void mVARCOND() throws RecognitionException {
		try {
			int _type = VARCOND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:228:10: ( '\\\\varcond' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:228:12: '\\\\varcond'
			{
			match("\\varcond"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARCOND"

	// $ANTLR start "APPLY_UPDATE_ON_RIGID"
	public final void mAPPLY_UPDATE_ON_RIGID() throws RecognitionException {
		try {
			int _type = APPLY_UPDATE_ON_RIGID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:229:24: ( '\\\\applyUpdateOnRigid' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:229:26: '\\\\applyUpdateOnRigid'
			{
			match("\\applyUpdateOnRigid"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APPLY_UPDATE_ON_RIGID"

	// $ANTLR start "DEPENDINGON"
	public final void mDEPENDINGON() throws RecognitionException {
		try {
			int _type = DEPENDINGON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:230:21: ( '\\\\dependingOn' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:230:23: '\\\\dependingOn'
			{
			match("\\dependingOn"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEPENDINGON"

	// $ANTLR start "DISJOINTMODULONULL"
	public final void mDISJOINTMODULONULL() throws RecognitionException {
		try {
			int _type = DISJOINTMODULONULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:231:22: ( '\\\\disjointModuloNull' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:231:24: '\\\\disjointModuloNull'
			{
			match("\\disjointModuloNull"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DISJOINTMODULONULL"

	// $ANTLR start "DROP_EFFECTLESS_ELEMENTARIES"
	public final void mDROP_EFFECTLESS_ELEMENTARIES() throws RecognitionException {
		try {
			int _type = DROP_EFFECTLESS_ELEMENTARIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:232:31: ( '\\\\dropEffectlessElementaries' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:232:33: '\\\\dropEffectlessElementaries'
			{
			match("\\dropEffectlessElementaries"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DROP_EFFECTLESS_ELEMENTARIES"

	// $ANTLR start "DROP_EFFECTLESS_STORES"
	public final void mDROP_EFFECTLESS_STORES() throws RecognitionException {
		try {
			int _type = DROP_EFFECTLESS_STORES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:233:25: ( '\\\\dropEffectlessStores' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:233:27: '\\\\dropEffectlessStores'
			{
			match("\\dropEffectlessStores"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DROP_EFFECTLESS_STORES"

	// $ANTLR start "SIMPLIFY_IF_THEN_ELSE_UPDATE"
	public final void mSIMPLIFY_IF_THEN_ELSE_UPDATE() throws RecognitionException {
		try {
			int _type = SIMPLIFY_IF_THEN_ELSE_UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:234:31: ( '\\\\simplifyIfThenElseUpdate' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:234:33: '\\\\simplifyIfThenElseUpdate'
			{
			match("\\simplifyIfThenElseUpdate"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIMPLIFY_IF_THEN_ELSE_UPDATE"

	// $ANTLR start "ENUM_CONST"
	public final void mENUM_CONST() throws RecognitionException {
		try {
			int _type = ENUM_CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:235:13: ( '\\\\enumConstant' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:235:15: '\\\\enumConstant'
			{
			match("\\enumConstant"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENUM_CONST"

	// $ANTLR start "FREELABELIN"
	public final void mFREELABELIN() throws RecognitionException {
		try {
			int _type = FREELABELIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:236:21: ( '\\\\freeLabelIn' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:236:23: '\\\\freeLabelIn'
			{
			match("\\freeLabelIn"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FREELABELIN"

	// $ANTLR start "HASSORT"
	public final void mHASSORT() throws RecognitionException {
		try {
			int _type = HASSORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:237:10: ( '\\\\hasSort' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:237:12: '\\\\hasSort'
			{
			match("\\hasSort"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HASSORT"

	// $ANTLR start "FIELDTYPE"
	public final void mFIELDTYPE() throws RecognitionException {
		try {
			int _type = FIELDTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:238:12: ( '\\\\fieldType' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:238:14: '\\\\fieldType'
			{
			match("\\fieldType"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIELDTYPE"

	// $ANTLR start "FINAL"
	public final void mFINAL() throws RecognitionException {
		try {
			int _type = FINAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:239:8: ( '\\\\final' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:239:10: '\\\\final'
			{
			match("\\final"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FINAL"

	// $ANTLR start "ELEMSORT"
	public final void mELEMSORT() throws RecognitionException {
		try {
			int _type = ELEMSORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:240:11: ( '\\\\elemSort' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:240:13: '\\\\elemSort'
			{
			match("\\elemSort"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELEMSORT"

	// $ANTLR start "HASLABEL"
	public final void mHASLABEL() throws RecognitionException {
		try {
			int _type = HASLABEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:241:11: ( '\\\\hasLabel' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:241:13: '\\\\hasLabel'
			{
			match("\\hasLabel"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HASLABEL"

	// $ANTLR start "HASSUBFORMULAS"
	public final void mHASSUBFORMULAS() throws RecognitionException {
		try {
			int _type = HASSUBFORMULAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:242:17: ( '\\\\hasSubFormulas' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:242:19: '\\\\hasSubFormulas'
			{
			match("\\hasSubFormulas"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HASSUBFORMULAS"

	// $ANTLR start "ISARRAY"
	public final void mISARRAY() throws RecognitionException {
		try {
			int _type = ISARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:243:9: ( '\\\\isArray' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:243:10: '\\\\isArray'
			{
			match("\\isArray"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISARRAY"

	// $ANTLR start "ISARRAYLENGTH"
	public final void mISARRAYLENGTH() throws RecognitionException {
		try {
			int _type = ISARRAYLENGTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:244:15: ( '\\\\isArrayLength' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:244:16: '\\\\isArrayLength'
			{
			match("\\isArrayLength"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISARRAYLENGTH"

	// $ANTLR start "ISCONSTANT"
	public final void mISCONSTANT() throws RecognitionException {
		try {
			int _type = ISCONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:245:12: ( '\\\\isConstant' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:245:14: '\\\\isConstant'
			{
			match("\\isConstant"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISCONSTANT"

	// $ANTLR start "ISENUMTYPE"
	public final void mISENUMTYPE() throws RecognitionException {
		try {
			int _type = ISENUMTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:246:19: ( '\\\\isEnumType' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:246:20: '\\\\isEnumType'
			{
			match("\\isEnumType"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISENUMTYPE"

	// $ANTLR start "ISINDUCTVAR"
	public final void mISINDUCTVAR() throws RecognitionException {
		try {
			int _type = ISINDUCTVAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:247:13: ( '\\\\isInductVar' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:247:14: '\\\\isInductVar'
			{
			match("\\isInductVar"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISINDUCTVAR"

	// $ANTLR start "ISLOCALVARIABLE"
	public final void mISLOCALVARIABLE() throws RecognitionException {
		try {
			int _type = ISLOCALVARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:248:18: ( '\\\\isLocalVariable' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:248:20: '\\\\isLocalVariable'
			{
			match("\\isLocalVariable"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISLOCALVARIABLE"

	// $ANTLR start "ISOBSERVER"
	public final void mISOBSERVER() throws RecognitionException {
		try {
			int _type = ISOBSERVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:249:13: ( '\\\\isObserver' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:249:15: '\\\\isObserver'
			{
			match("\\isObserver"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISOBSERVER"

	// $ANTLR start "DIFFERENT"
	public final void mDIFFERENT() throws RecognitionException {
		try {
			int _type = DIFFERENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:250:12: ( '\\\\different' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:250:14: '\\\\different'
			{
			match("\\different"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIFFERENT"

	// $ANTLR start "METADISJOINT"
	public final void mMETADISJOINT() throws RecognitionException {
		try {
			int _type = METADISJOINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:251:15: ( '\\\\metaDisjoint' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:251:17: '\\\\metaDisjoint'
			{
			match("\\metaDisjoint"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "METADISJOINT"

	// $ANTLR start "ISTHISREFERENCE"
	public final void mISTHISREFERENCE() throws RecognitionException {
		try {
			int _type = ISTHISREFERENCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:252:17: ( '\\\\isThisReference' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:252:18: '\\\\isThisReference'
			{
			match("\\isThisReference"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISTHISREFERENCE"

	// $ANTLR start "DIFFERENTFIELDS"
	public final void mDIFFERENTFIELDS() throws RecognitionException {
		try {
			int _type = DIFFERENTFIELDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:253:17: ( '\\\\differentFields' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:253:18: '\\\\differentFields'
			{
			match("\\differentFields"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIFFERENTFIELDS"

	// $ANTLR start "ISREFERENCE"
	public final void mISREFERENCE() throws RecognitionException {
		try {
			int _type = ISREFERENCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:254:13: ( '\\\\isReference' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:254:14: '\\\\isReference'
			{
			match("\\isReference"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISREFERENCE"

	// $ANTLR start "ISREFERENCEARRAY"
	public final void mISREFERENCEARRAY() throws RecognitionException {
		try {
			int _type = ISREFERENCEARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:255:18: ( '\\\\isReferenceArray' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:255:19: '\\\\isReferenceArray'
			{
			match("\\isReferenceArray"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISREFERENCEARRAY"

	// $ANTLR start "ISSTATICFIELD"
	public final void mISSTATICFIELD() throws RecognitionException {
		try {
			int _type = ISSTATICFIELD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:256:16: ( '\\\\isStaticField' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:256:18: '\\\\isStaticField'
			{
			match("\\isStaticField"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISSTATICFIELD"

	// $ANTLR start "ISSUBTYPE"
	public final void mISSUBTYPE() throws RecognitionException {
		try {
			int _type = ISSUBTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:257:12: ( '\\\\sub' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:257:14: '\\\\sub'
			{
			match("\\sub"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISSUBTYPE"

	// $ANTLR start "EQUAL_UNIQUE"
	public final void mEQUAL_UNIQUE() throws RecognitionException {
		try {
			int _type = EQUAL_UNIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:258:15: ( '\\\\equalUnique' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:258:17: '\\\\equalUnique'
			{
			match("\\equalUnique"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL_UNIQUE"

	// $ANTLR start "NEW"
	public final void mNEW() throws RecognitionException {
		try {
			int _type = NEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:259:13: ( '\\\\new' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:259:15: '\\\\new'
			{
			match("\\new"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW"

	// $ANTLR start "NEWLABEL"
	public final void mNEWLABEL() throws RecognitionException {
		try {
			int _type = NEWLABEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:260:18: ( '\\\\newLabel' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:260:20: '\\\\newLabel'
			{
			match("\\newLabel"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLABEL"

	// $ANTLR start "CONTAINS_ASSIGNMENT"
	public final void mCONTAINS_ASSIGNMENT() throws RecognitionException {
		try {
			int _type = CONTAINS_ASSIGNMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:261:24: ( '\\\\containsAssignment' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:261:26: '\\\\containsAssignment'
			{
			match("\\containsAssignment"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTAINS_ASSIGNMENT"

	// $ANTLR start "NOT_"
	public final void mNOT_() throws RecognitionException {
		try {
			int _type = NOT_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:263:7: ( '\\\\not' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:263:9: '\\\\not'
			{
			match("\\not"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_"

	// $ANTLR start "NOTFREEIN"
	public final void mNOTFREEIN() throws RecognitionException {
		try {
			int _type = NOTFREEIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:264:19: ( '\\\\notFreeIn' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:264:21: '\\\\notFreeIn'
			{
			match("\\notFreeIn"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTFREEIN"

	// $ANTLR start "SAME"
	public final void mSAME() throws RecognitionException {
		try {
			int _type = SAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:265:7: ( '\\\\same' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:265:9: '\\\\same'
			{
			match("\\same"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SAME"

	// $ANTLR start "STATIC"
	public final void mSTATIC() throws RecognitionException {
		try {
			int _type = STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:266:9: ( '\\\\static' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:266:11: '\\\\static'
			{
			match("\\static"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATIC"

	// $ANTLR start "STATICMETHODREFERENCE"
	public final void mSTATICMETHODREFERENCE() throws RecognitionException {
		try {
			int _type = STATICMETHODREFERENCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:267:31: ( '\\\\staticMethodReference' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:267:33: '\\\\staticMethodReference'
			{
			match("\\staticMethodReference"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATICMETHODREFERENCE"

	// $ANTLR start "STRICT"
	public final void mSTRICT() throws RecognitionException {
		try {
			int _type = STRICT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:268:12: ( '\\\\strict' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:268:14: '\\\\strict'
			{
			match("\\strict"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRICT"

	// $ANTLR start "TYPEOF"
	public final void mTYPEOF() throws RecognitionException {
		try {
			int _type = TYPEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:269:9: ( '\\\\typeof' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:269:11: '\\\\typeof'
			{
			match("\\typeof"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPEOF"

	// $ANTLR start "INSTANTIATE_GENERIC"
	public final void mINSTANTIATE_GENERIC() throws RecognitionException {
		try {
			int _type = INSTANTIATE_GENERIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:270:22: ( '\\\\instantiateGeneric' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:270:24: '\\\\instantiateGeneric'
			{
			match("\\instantiateGeneric"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INSTANTIATE_GENERIC"

	// $ANTLR start "FORALL"
	public final void mFORALL() throws RecognitionException {
		try {
			int _type = FORALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:273:16: ( '\\\\forall' | '\\u2200' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='\\') ) {
				alt1=1;
			}
			else if ( (LA1_0=='\u2200') ) {
				alt1=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:273:18: '\\\\forall'
					{
					match("\\forall"); if (state.failed) return;

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:273:31: '\\u2200'
					{
					match('\u2200'); if (state.failed) return;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FORALL"

	// $ANTLR start "EXISTS"
	public final void mEXISTS() throws RecognitionException {
		try {
			int _type = EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:274:16: ( '\\\\exists' | '\\u2203' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\\') ) {
				alt2=1;
			}
			else if ( (LA2_0=='\u2203') ) {
				alt2=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:274:18: '\\\\exists'
					{
					match("\\exists"); if (state.failed) return;

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:274:31: '\\u2203'
					{
					match('\u2203'); if (state.failed) return;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXISTS"

	// $ANTLR start "SUBST"
	public final void mSUBST() throws RecognitionException {
		try {
			int _type = SUBST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:275:16: ( '\\\\subst' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:275:18: '\\\\subst'
			{
			match("\\subst"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUBST"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:276:7: ( '\\\\if' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:276:9: '\\\\if'
			{
			match("\\if"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "IFEX"
	public final void mIFEX() throws RecognitionException {
		try {
			int _type = IFEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:277:9: ( '\\\\ifEx' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:277:11: '\\\\ifEx'
			{
			match("\\ifEx"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IFEX"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:278:7: ( '\\\\then' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:278:9: '\\\\then'
			{
			match("\\then"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:279:7: ( '\\\\else' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:279:9: '\\\\else'
			{
			match("\\else"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:283:9: ( '\\\\include' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:283:10: '\\\\include'
			{
			match("\\include"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE"

	// $ANTLR start "INCLUDELDTS"
	public final void mINCLUDELDTS() throws RecognitionException {
		try {
			int _type = INCLUDELDTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:284:13: ( '\\\\includeLDTs' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:284:14: '\\\\includeLDTs'
			{
			match("\\includeLDTs"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDELDTS"

	// $ANTLR start "CLASSPATH"
	public final void mCLASSPATH() throws RecognitionException {
		try {
			int _type = CLASSPATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:285:11: ( '\\\\classpath' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:285:12: '\\\\classpath'
			{
			match("\\classpath"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASSPATH"

	// $ANTLR start "BOOTCLASSPATH"
	public final void mBOOTCLASSPATH() throws RecognitionException {
		try {
			int _type = BOOTCLASSPATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:286:15: ( '\\\\bootclasspath' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:286:16: '\\\\bootclasspath'
			{
			match("\\bootclasspath"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOTCLASSPATH"

	// $ANTLR start "NODEFAULTCLASSES"
	public final void mNODEFAULTCLASSES() throws RecognitionException {
		try {
			int _type = NODEFAULTCLASSES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:287:18: ( '\\\\noDefaultClasses' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:287:19: '\\\\noDefaultClasses'
			{
			match("\\noDefaultClasses"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NODEFAULTCLASSES"

	// $ANTLR start "JAVASOURCE"
	public final void mJAVASOURCE() throws RecognitionException {
		try {
			int _type = JAVASOURCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:288:12: ( '\\\\javaSource' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:288:13: '\\\\javaSource'
			{
			match("\\javaSource"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JAVASOURCE"

	// $ANTLR start "WITHOPTIONS"
	public final void mWITHOPTIONS() throws RecognitionException {
		try {
			int _type = WITHOPTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:289:20: ( '\\\\withOptions' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:289:21: '\\\\withOptions'
			{
			match("\\withOptions"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WITHOPTIONS"

	// $ANTLR start "OPTIONSDECL"
	public final void mOPTIONSDECL() throws RecognitionException {
		try {
			int _type = OPTIONSDECL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:290:20: ( '\\\\optionsDecl' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:290:21: '\\\\optionsDecl'
			{
			match("\\optionsDecl"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPTIONSDECL"

	// $ANTLR start "KEYSETTINGS"
	public final void mKEYSETTINGS() throws RecognitionException {
		try {
			int _type = KEYSETTINGS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:291:14: ( '\\\\settings' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:291:16: '\\\\settings'
			{
			match("\\settings"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYSETTINGS"

	// $ANTLR start "PROFILE"
	public final void mPROFILE() throws RecognitionException {
		try {
			int _type = PROFILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:292:17: ( '\\\\profile' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:292:19: '\\\\profile'
			{
			match("\\profile"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROFILE"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:295:7: ( 'true' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:295:9: 'true'
			{
			match("true"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:296:8: ( 'false' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:296:10: 'false'
			{
			match("false"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "SAMEUPDATELEVEL"
	public final void mSAMEUPDATELEVEL() throws RecognitionException {
		try {
			int _type = SAMEUPDATELEVEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:299:25: ( '\\\\sameUpdateLevel' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:299:27: '\\\\sameUpdateLevel'
			{
			match("\\sameUpdateLevel"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SAMEUPDATELEVEL"

	// $ANTLR start "INSEQUENTSTATE"
	public final void mINSEQUENTSTATE() throws RecognitionException {
		try {
			int _type = INSEQUENTSTATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:300:24: ( '\\\\inSequentState' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:300:26: '\\\\inSequentState'
			{
			match("\\inSequentState"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INSEQUENTSTATE"

	// $ANTLR start "ANTECEDENTPOLARITY"
	public final void mANTECEDENTPOLARITY() throws RecognitionException {
		try {
			int _type = ANTECEDENTPOLARITY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:301:28: ( '\\\\antecedentPolarity' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:301:30: '\\\\antecedentPolarity'
			{
			match("\\antecedentPolarity"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANTECEDENTPOLARITY"

	// $ANTLR start "SUCCEDENTPOLARITY"
	public final void mSUCCEDENTPOLARITY() throws RecognitionException {
		try {
			int _type = SUCCEDENTPOLARITY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:302:27: ( '\\\\succedentPolarity' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:302:29: '\\\\succedentPolarity'
			{
			match("\\succedentPolarity"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUCCEDENTPOLARITY"

	// $ANTLR start "CLOSEGOAL"
	public final void mCLOSEGOAL() throws RecognitionException {
		try {
			int _type = CLOSEGOAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:303:19: ( '\\\\closegoal' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:303:21: '\\\\closegoal'
			{
			match("\\closegoal"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSEGOAL"

	// $ANTLR start "HEURISTICSDECL"
	public final void mHEURISTICSDECL() throws RecognitionException {
		try {
			int _type = HEURISTICSDECL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:304:24: ( '\\\\heuristicsDecl' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:304:26: '\\\\heuristicsDecl'
			{
			match("\\heuristicsDecl"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEURISTICSDECL"

	// $ANTLR start "NONINTERACTIVE"
	public final void mNONINTERACTIVE() throws RecognitionException {
		try {
			int _type = NONINTERACTIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:305:17: ( '\\\\noninteractive' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:305:19: '\\\\noninteractive'
			{
			match("\\noninteractive"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NONINTERACTIVE"

	// $ANTLR start "DISPLAYNAME"
	public final void mDISPLAYNAME() throws RecognitionException {
		try {
			int _type = DISPLAYNAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:306:21: ( '\\\\displayname' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:306:23: '\\\\displayname'
			{
			match("\\displayname"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DISPLAYNAME"

	// $ANTLR start "HELPTEXT"
	public final void mHELPTEXT() throws RecognitionException {
		try {
			int _type = HELPTEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:307:18: ( '\\\\helptext' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:307:20: '\\\\helptext'
			{
			match("\\helptext"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HELPTEXT"

	// $ANTLR start "REPLACEWITH"
	public final void mREPLACEWITH() throws RecognitionException {
		try {
			int _type = REPLACEWITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:308:21: ( '\\\\replacewith' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:308:23: '\\\\replacewith'
			{
			match("\\replacewith"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REPLACEWITH"

	// $ANTLR start "ADDRULES"
	public final void mADDRULES() throws RecognitionException {
		try {
			int _type = ADDRULES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:309:18: ( '\\\\addrules' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:309:20: '\\\\addrules'
			{
			match("\\addrules"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDRULES"

	// $ANTLR start "ADDPROGVARS"
	public final void mADDPROGVARS() throws RecognitionException {
		try {
			int _type = ADDPROGVARS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:310:21: ( '\\\\addprogvars' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:310:23: '\\\\addprogvars'
			{
			match("\\addprogvars"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDPROGVARS"

	// $ANTLR start "HEURISTICS"
	public final void mHEURISTICS() throws RecognitionException {
		try {
			int _type = HEURISTICS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:311:20: ( '\\\\heuristics' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:311:22: '\\\\heuristics'
			{
			match("\\heuristics"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEURISTICS"

	// $ANTLR start "FIND"
	public final void mFIND() throws RecognitionException {
		try {
			int _type = FIND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:312:7: ( '\\\\find' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:312:9: '\\\\find'
			{
			match("\\find"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIND"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:313:6: ( '\\\\add' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:313:8: '\\\\add'
			{
			match("\\add"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "ASSUMES"
	public final void mASSUMES() throws RecognitionException {
		try {
			int _type = ASSUMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:314:10: ( '\\\\assumes' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:314:12: '\\\\assumes'
			{
			match("\\assumes"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSUMES"

	// $ANTLR start "TRIGGER"
	public final void mTRIGGER() throws RecognitionException {
		try {
			int _type = TRIGGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:315:10: ( '\\\\trigger' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:315:12: '\\\\trigger'
			{
			match("\\trigger"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRIGGER"

	// $ANTLR start "AVOID"
	public final void mAVOID() throws RecognitionException {
		try {
			int _type = AVOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:316:8: ( '\\\\avoid' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:316:10: '\\\\avoid'
			{
			match("\\avoid"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AVOID"

	// $ANTLR start "PREDICATES"
	public final void mPREDICATES() throws RecognitionException {
		try {
			int _type = PREDICATES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:318:13: ( '\\\\predicates' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:318:15: '\\\\predicates'
			{
			match("\\predicates"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PREDICATES"

	// $ANTLR start "FUNCTIONS"
	public final void mFUNCTIONS() throws RecognitionException {
		try {
			int _type = FUNCTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:319:12: ( '\\\\functions' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:319:14: '\\\\functions'
			{
			match("\\functions"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTIONS"

	// $ANTLR start "TRANSFORMERS"
	public final void mTRANSFORMERS() throws RecognitionException {
		try {
			int _type = TRANSFORMERS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:320:15: ( '\\\\transformers' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:320:17: '\\\\transformers'
			{
			match("\\transformers"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRANSFORMERS"

	// $ANTLR start "UNIQUE"
	public final void mUNIQUE() throws RecognitionException {
		try {
			int _type = UNIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:321:9: ( '\\\\unique' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:321:11: '\\\\unique'
			{
			match("\\unique"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNIQUE"

	// $ANTLR start "RULES"
	public final void mRULES() throws RecognitionException {
		try {
			int _type = RULES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:323:8: ( '\\\\rules' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:323:10: '\\\\rules'
			{
			match("\\rules"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULES"

	// $ANTLR start "AXIOMS"
	public final void mAXIOMS() throws RecognitionException {
		try {
			int _type = AXIOMS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:324:9: ( '\\\\axioms' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:324:11: '\\\\axioms'
			{
			match("\\axioms"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AXIOMS"

	// $ANTLR start "PROBLEM"
	public final void mPROBLEM() throws RecognitionException {
		try {
			int _type = PROBLEM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:325:17: ( '\\\\problem' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:325:19: '\\\\problem'
			{
			match("\\problem"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROBLEM"

	// $ANTLR start "CHOOSECONTRACT"
	public final void mCHOOSECONTRACT() throws RecognitionException {
		try {
			int _type = CHOOSECONTRACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:326:24: ( '\\\\chooseContract' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:326:26: '\\\\chooseContract'
			{
			match("\\chooseContract"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHOOSECONTRACT"

	// $ANTLR start "PROOFOBLIGATION"
	public final void mPROOFOBLIGATION() throws RecognitionException {
		try {
			int _type = PROOFOBLIGATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:327:25: ( '\\\\proofObligation' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:327:27: '\\\\proofObligation'
			{
			match("\\proofObligation"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROOFOBLIGATION"

	// $ANTLR start "PROOF"
	public final void mPROOF() throws RecognitionException {
		try {
			int _type = PROOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:328:15: ( '\\\\proof' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:328:17: '\\\\proof'
			{
			match("\\proof"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROOF"

	// $ANTLR start "PROOFSCRIPT"
	public final void mPROOFSCRIPT() throws RecognitionException {
		try {
			int _type = PROOFSCRIPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:329:21: ( '\\\\proofScript' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:329:23: '\\\\proofScript'
			{
			match("\\proofScript"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROOFSCRIPT"

	// $ANTLR start "CONTRACTS"
	public final void mCONTRACTS() throws RecognitionException {
		try {
			int _type = CONTRACTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:330:19: ( '\\\\contracts' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:330:21: '\\\\contracts'
			{
			match("\\contracts"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTRACTS"

	// $ANTLR start "INVARIANTS"
	public final void mINVARIANTS() throws RecognitionException {
		try {
			int _type = INVARIANTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:331:20: ( '\\\\invariants' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:331:22: '\\\\invariants'
			{
			match("\\invariants"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INVARIANTS"

	// $ANTLR start "LEMMA"
	public final void mLEMMA() throws RecognitionException {
		try {
			int _type = LEMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:334:10: ( '\\\\lemma' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:334:12: '\\\\lemma'
			{
			match("\\lemma"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEMMA"

	// $ANTLR start "IN_TYPE"
	public final void mIN_TYPE() throws RecognitionException {
		try {
			int _type = IN_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:337:10: ( '\\\\inType' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:337:12: '\\\\inType'
			{
			match("\\inType"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN_TYPE"

	// $ANTLR start "IS_ABSTRACT_OR_INTERFACE"
	public final void mIS_ABSTRACT_OR_INTERFACE() throws RecognitionException {
		try {
			int _type = IS_ABSTRACT_OR_INTERFACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:338:34: ( '\\\\isAbstractOrInterface' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:338:36: '\\\\isAbstractOrInterface'
			{
			match("\\isAbstractOrInterface"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IS_ABSTRACT_OR_INTERFACE"

	// $ANTLR start "CONTAINERTYPE"
	public final void mCONTAINERTYPE() throws RecognitionException {
		try {
			int _type = CONTAINERTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:339:23: ( '\\\\containerType' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:339:25: '\\\\containerType'
			{
			match("\\containerType"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTAINERTYPE"

	// $ANTLR start "LIMITED"
	public final void mLIMITED() throws RecognitionException {
		try {
			int _type = LIMITED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:341:17: ( '$lmtd' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:341:19: '$lmtd'
			{
			match("$lmtd"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIMITED"

	// $ANTLR start "LOCSET"
	public final void mLOCSET() throws RecognitionException {
		try {
			int _type = LOCSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:344:16: ( '\\\\locset' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:344:18: '\\\\locset'
			{
			match("\\locset"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOCSET"

	// $ANTLR start "SEQ"
	public final void mSEQ() throws RecognitionException {
		try {
			int _type = SEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:345:13: ( '\\\\seq' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:345:15: '\\\\seq'
			{
			match("\\seq"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEQ"

	// $ANTLR start "BIGINT"
	public final void mBIGINT() throws RecognitionException {
		try {
			int _type = BIGINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:346:16: ( '\\\\bigint' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:346:18: '\\\\bigint'
			{
			match("\\bigint"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIGINT"

	// $ANTLR start "UTF_PRECEDES"
	public final void mUTF_PRECEDES() throws RecognitionException {
		try {
			int _type = UTF_PRECEDES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:349:18: ( '\\u227A' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:349:20: '\\u227A'
			{
			match('\u227A'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UTF_PRECEDES"

	// $ANTLR start "UTF_IN"
	public final void mUTF_IN() throws RecognitionException {
		try {
			int _type = UTF_IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:350:12: ( '\\u220A' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:350:14: '\\u220A'
			{
			match('\u220A'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UTF_IN"

	// $ANTLR start "UTF_EMPTY"
	public final void mUTF_EMPTY() throws RecognitionException {
		try {
			int _type = UTF_EMPTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:351:15: ( '\\u2205' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:351:17: '\\u2205'
			{
			match('\u2205'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UTF_EMPTY"

	// $ANTLR start "UTF_UNION"
	public final void mUTF_UNION() throws RecognitionException {
		try {
			int _type = UTF_UNION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:352:15: ( '\\u222A' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:352:17: '\\u222A'
			{
			match('\u222A'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UTF_UNION"

	// $ANTLR start "UTF_INTERSECT"
	public final void mUTF_INTERSECT() throws RecognitionException {
		try {
			int _type = UTF_INTERSECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:353:19: ( '\\u2229' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:353:21: '\\u2229'
			{
			match('\u2229'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UTF_INTERSECT"

	// $ANTLR start "UTF_SUBSET"
	public final void mUTF_SUBSET() throws RecognitionException {
		try {
			int _type = UTF_SUBSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:354:16: ( '\\u2286' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:354:18: '\\u2286'
			{
			match('\u2286'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UTF_SUBSET"

	// $ANTLR start "UTF_SETMINUS"
	public final void mUTF_SETMINUS() throws RecognitionException {
		try {
			int _type = UTF_SETMINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:355:18: ( '\\u2216' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:355:20: '\\u2216'
			{
			match('\u2216'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UTF_SETMINUS"

	// $ANTLR start "VOCAB"
	public final void mVOCAB() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:359:4: ( '\\u0003' .. '\\u0377' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:
			{
			if ( (input.LA(1) >= '\u0003' && input.LA(1) <= '\u0377') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOCAB"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:363:3: ( ';' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:363:3: ';'
			{
			match(';'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "SLASH"
	public final void mSLASH() throws RecognitionException {
		try {
			int _type = SLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:367:3: ( '/' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:367:3: '/'
			{
			match('/'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SLASH"

	// $ANTLR start "BACKSLASH"
	public final void mBACKSLASH() throws RecognitionException {
		try {
			int _type = BACKSLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:371:3: ( '\\\\' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:371:3: '\\\\'
			{
			match('\\'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BACKSLASH"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:375:6: ( ':' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:375:6: ':'
			{
			match(':'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "DOUBLECOLON"
	public final void mDOUBLECOLON() throws RecognitionException {
		try {
			int _type = DOUBLECOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:379:6: ( '::' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:379:6: '::'
			{
			match("::"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLECOLON"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:383:6: ( ':=' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:383:6: ':='
			{
			match(":="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:387:3: ( '.' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:387:3: '.'
			{
			match('.'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "DOTRANGE"
	public final void mDOTRANGE() throws RecognitionException {
		try {
			int _type = DOTRANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:391:3: ( '.' '.' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:391:3: '.' '.'
			{
			match('.'); if (state.failed) return;
			match('.'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOTRANGE"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:395:3: ( ',' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:395:3: ','
			{
			match(','); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:399:2: ( '(' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:400:2: '('
			{
			match('('); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:404:3: ( ')' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:404:3: ')'
			{
			match(')'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACE"
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:408:3: ( '{' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:408:3: '{'
			{
			match('{'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACE"

	// $ANTLR start "RBRACE"
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:412:3: ( '}' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:412:3: '}'
			{
			match('}'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACE"

	// $ANTLR start "LBRACKET"
	public final void mLBRACKET() throws RecognitionException {
		try {
			int _type = LBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:416:3: ( '[' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:416:3: '['
			{
			match('['); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACKET"

	// $ANTLR start "RBRACKET"
	public final void mRBRACKET() throws RecognitionException {
		try {
			int _type = RBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:420:3: ( ']' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:420:3: ']'
			{
			match(']'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACKET"

	// $ANTLR start "EMPTYBRACKETS"
	public final void mEMPTYBRACKETS() throws RecognitionException {
		try {
			int _type = EMPTYBRACKETS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:424:3: ( '[' ']' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:424:3: '[' ']'
			{
			match('['); if (state.failed) return;
			match(']'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EMPTYBRACKETS"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:428:3: ( '@' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:428:3: '@'
			{
			match('@'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT"

	// $ANTLR start "PARALLEL"
	public final void mPARALLEL() throws RecognitionException {
		try {
			int _type = PARALLEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:432:7: ( '|' '|' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:432:7: '|' '|'
			{
			match('|'); if (state.failed) return;
			match('|'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARALLEL"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:437:3: ( '|' | '\\u2228' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:
			{
			if ( input.LA(1)=='|'||input.LA(1)=='\u2228' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:441:3: ( '&' | '\\u2227' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:
			{
			if ( input.LA(1)=='&'||input.LA(1)=='\u2227' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:445:3: ( '!' | '\\u00AC' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:
			{
			if ( input.LA(1)=='!'||input.LA(1)=='\u00AC' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "IMP"
	public final void mIMP() throws RecognitionException {
		try {
			int _type = IMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:449:3: ( '->' | '\\u2192' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='-') ) {
				alt3=1;
			}
			else if ( (LA3_0=='\u2192') ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:449:3: '->'
					{
					match("->"); if (state.failed) return;

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:449:10: '\\u2192'
					{
					match('\u2192'); if (state.failed) return;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMP"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:453:3: ( '=' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:453:3: '='
			{
			match('='); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUALS"

	// $ANTLR start "NOT_EQUALS"
	public final void mNOT_EQUALS() throws RecognitionException {
		try {
			int _type = NOT_EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:457:3: ( '!=' | '\\u2260' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='!') ) {
				alt4=1;
			}
			else if ( (LA4_0=='\u2260') ) {
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
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:457:3: '!='
					{
					match("!="); if (state.failed) return;

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:457:10: '\\u2260'
					{
					match('\u2260'); if (state.failed) return;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_EQUALS"

	// $ANTLR start "SEQARROW"
	public final void mSEQARROW() throws RecognitionException {
		try {
			int _type = SEQARROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:461:3: ( '==>' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:461:3: '==>'
			{
			match("==>"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEQARROW"

	// $ANTLR start "EXP"
	public final void mEXP() throws RecognitionException {
		try {
			int _type = EXP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:465:3: ( '^' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:465:3: '^'
			{
			match('^'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXP"

	// $ANTLR start "TILDE"
	public final void mTILDE() throws RecognitionException {
		try {
			int _type = TILDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:469:3: ( '~' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:469:3: '~'
			{
			match('~'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TILDE"

	// $ANTLR start "PERCENT"
	public final void mPERCENT() throws RecognitionException {
		try {
			int _type = PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:473:5: ( '%' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:473:5: '%'
			{
			match('%'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERCENT"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:477:5: ( '*' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:477:5: '*'
			{
			match('*'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:481:5: ( '-' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:481:5: '-'
			{
			match('-'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:485:5: ( '+' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:485:5: '+'
			{
			match('+'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "GREATER"
	public final void mGREATER() throws RecognitionException {
		try {
			int _type = GREATER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:489:5: ( '>' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:489:5: '>'
			{
			match('>'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER"

	// $ANTLR start "GREATEREQUAL"
	public final void mGREATEREQUAL() throws RecognitionException {
		try {
			int _type = GREATEREQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:493:5: ( '>' '=' | '\\u2265' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='>') ) {
				alt5=1;
			}
			else if ( (LA5_0=='\u2265') ) {
				alt5=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:493:5: '>' '='
					{
					match('>'); if (state.failed) return;
					match('='); if (state.failed) return;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:493:15: '\\u2265'
					{
					match('\u2265'); if (state.failed) return;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATEREQUAL"

	// $ANTLR start "RGUILLEMETS"
	public final void mRGUILLEMETS() throws RecognitionException {
		try {
			int _type = RGUILLEMETS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:497:7: ( '>' '>' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:497:11: '>' '>'
			{
			match('>'); if (state.failed) return;
			match('>'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RGUILLEMETS"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:501:9: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:501:9: ( ' ' | '\\t' | '\\n' | '\\r' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( state.backtracking==0 ) { _channel = HIDDEN; }
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:509:3: ( '\"' ( '\\\\' . |~ ( '\"' | '\\\\' ) )* '\"' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:509:4: '\"' ( '\\\\' . |~ ( '\"' | '\\\\' ) )* '\"'
			{
			match('\"'); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:509:8: ( '\\\\' . |~ ( '\"' | '\\\\' ) )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\\') ) {
					alt6=1;
				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:509:9: '\\\\' .
					{
					match('\\'); if (state.failed) return;
					matchAny(); if (state.failed) return;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:509:18: ~ ( '\"' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			match('\"'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "LESS_DISPATCH"
	public final void mLESS_DISPATCH() throws RecognitionException {
		try {
			int _type = LESS_DISPATCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:513:6: ( ( '<' ( LETTER )+ '>' )=> IMPLICIT_IDENT | ( '<' '-' '>' )=> EQV | ( '<' '=' )=> LESSEQUAL | ( '<' '<' )=> LGUILLEMETS | LESS )
			int alt7=5;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='<') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='-') && (synpred2_KeYLexer())) {
					alt7=2;
				}
				else if ( (LA7_1=='=') && (synpred3_KeYLexer())) {
					alt7=3;
				}
				else if ( (LA7_1=='<') && (synpred4_KeYLexer())) {
					alt7=4;
				}
				else if ( ((LA7_1 >= 'A' && LA7_1 <= 'Z')||(LA7_1 >= 'a' && LA7_1 <= 'z')) && (synpred1_KeYLexer())) {
					alt7=1;
				}

			}
			else if ( (LA7_0=='\u2194') && (synpred2_KeYLexer())) {
				alt7=2;
			}
			else if ( (LA7_0=='\u2264') && (synpred3_KeYLexer())) {
				alt7=3;
			}

			switch (alt7) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:514:6: ( '<' ( LETTER )+ '>' )=> IMPLICIT_IDENT
					{
					mIMPLICIT_IDENT(); if (state.failed) return;

					if ( state.backtracking==0 ) {_type = IDENT;}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:516:6: ( '<' '-' '>' )=> EQV
					{
					mEQV(); if (state.failed) return;

					if ( state.backtracking==0 ) {_type = EQV;}
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:518:6: ( '<' '=' )=> LESSEQUAL
					{
					mLESSEQUAL(); if (state.failed) return;

					if ( state.backtracking==0 ) {_type = LESSEQUAL;}
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:520:6: ( '<' '<' )=> LGUILLEMETS
					{
					mLGUILLEMETS(); if (state.failed) return;

					if ( state.backtracking==0 ) {_type = LGUILLEMETS;}
					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:522:6: LESS
					{
					mLESS(); if (state.failed) return;

					if ( state.backtracking==0 ) {_type = LESS;}
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS_DISPATCH"

	// $ANTLR start "LESS"
	public final void mLESS() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:526:3: ( '<' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:527:3: '<'
			{
			match('<'); if (state.failed) return;
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS"

	// $ANTLR start "LESSEQUAL"
	public final void mLESSEQUAL() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:531:3: ( '<' '=' | '\\u2264' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='<') ) {
				alt8=1;
			}
			else if ( (LA8_0=='\u2264') ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:532:3: '<' '='
					{
					match('<'); if (state.failed) return;
					match('='); if (state.failed) return;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:532:13: '\\u2264'
					{
					match('\u2264'); if (state.failed) return;
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSEQUAL"

	// $ANTLR start "LGUILLEMETS"
	public final void mLGUILLEMETS() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:536:3: ( '<' '<' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:537:3: '<' '<'
			{
			match('<'); if (state.failed) return;
			match('<'); if (state.failed) return;
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LGUILLEMETS"

	// $ANTLR start "IMPLICIT_IDENT"
	public final void mIMPLICIT_IDENT() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:542:3: ( '<' ( LETTER )+ '>' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:543:3: '<' ( LETTER )+ '>'
			{
			match('<'); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:543:7: ( LETTER )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= 'A' && LA9_0 <= 'Z')||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			match('>'); if (state.failed) return;
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPLICIT_IDENT"

	// $ANTLR start "EQV"
	public final void mEQV() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:547:3: ( '<->' | '\\u2194' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='<') ) {
				alt10=1;
			}
			else if ( (LA10_0=='\u2194') ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:547:3: '<->'
					{
					match("<->"); if (state.failed) return;

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:547:11: '\\u2194'
					{
					match('\u2194'); if (state.failed) return;
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQV"

	// $ANTLR start "PRIMES_OR_CHARLITERAL"
	public final void mPRIMES_OR_CHARLITERAL() throws RecognitionException {
		try {
			int _type = PRIMES_OR_CHARLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:551:6: ( ( '\\'' '\\'' )=> PRIMES | ( '\\'' '\\\\' )=> CHAR_LITERAL | ( '\\'' ~ ( '\\'' ) '\\'' )=> CHAR_LITERAL | PRIMES )
			int alt11=4;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='\'') ) {
				int LA11_1 = input.LA(2);
				if ( ((LA11_1 >= ' ' && LA11_1 <= '&')) ) {
					int LA11_2 = input.LA(3);
					if ( (LA11_2=='\'') ) {
						int LA11_8 = input.LA(4);
						if ( (synpred6_KeYLexer()) ) {
							alt11=2;
						}
						else if ( (synpred7_KeYLexer()) ) {
							alt11=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( ((LA11_1 >= '(' && LA11_1 <= '[')) ) {
					int LA11_3 = input.LA(3);
					if ( (LA11_3=='\'') ) {
						int LA11_8 = input.LA(4);
						if ( (synpred6_KeYLexer()) ) {
							alt11=2;
						}
						else if ( (synpred7_KeYLexer()) ) {
							alt11=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( ((LA11_1 >= ']' && LA11_1 <= '~')) ) {
					int LA11_4 = input.LA(3);
					if ( (LA11_4=='\'') ) {
						int LA11_8 = input.LA(4);
						if ( (synpred6_KeYLexer()) ) {
							alt11=2;
						}
						else if ( (synpred7_KeYLexer()) ) {
							alt11=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA11_1=='\\') ) {
					switch ( input.LA(3) ) {
					case '\'':
						{
						int LA11_9 = input.LA(4);
						if ( (LA11_9=='\'') ) {
							int LA11_8 = input.LA(5);
							if ( (synpred6_KeYLexer()) ) {
								alt11=2;
							}
							else if ( (synpred7_KeYLexer()) ) {
								alt11=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 9, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case '\\':
						{
						int LA11_10 = input.LA(4);
						if ( (LA11_10=='\'') ) {
							int LA11_8 = input.LA(5);
							if ( (synpred6_KeYLexer()) ) {
								alt11=2;
							}
							else if ( (synpred7_KeYLexer()) ) {
								alt11=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'n':
						{
						int LA11_11 = input.LA(4);
						if ( (LA11_11=='\'') ) {
							int LA11_8 = input.LA(5);
							if ( (synpred6_KeYLexer()) ) {
								alt11=2;
							}
							else if ( (synpred7_KeYLexer()) ) {
								alt11=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'r':
						{
						int LA11_12 = input.LA(4);
						if ( (LA11_12=='\'') ) {
							int LA11_8 = input.LA(5);
							if ( (synpred6_KeYLexer()) ) {
								alt11=2;
							}
							else if ( (synpred7_KeYLexer()) ) {
								alt11=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 't':
						{
						int LA11_13 = input.LA(4);
						if ( (LA11_13=='\'') ) {
							int LA11_8 = input.LA(5);
							if ( (synpred6_KeYLexer()) ) {
								alt11=2;
							}
							else if ( (synpred7_KeYLexer()) ) {
								alt11=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 13, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'b':
						{
						int LA11_14 = input.LA(4);
						if ( (LA11_14=='\'') ) {
							int LA11_8 = input.LA(5);
							if ( (synpred6_KeYLexer()) ) {
								alt11=2;
							}
							else if ( (synpred7_KeYLexer()) ) {
								alt11=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 14, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'f':
						{
						int LA11_15 = input.LA(4);
						if ( (LA11_15=='\'') ) {
							int LA11_8 = input.LA(5);
							if ( (synpred6_KeYLexer()) ) {
								alt11=2;
							}
							else if ( (synpred7_KeYLexer()) ) {
								alt11=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 15, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case '\"':
						{
						int LA11_16 = input.LA(4);
						if ( (LA11_16=='\'') ) {
							int LA11_8 = input.LA(5);
							if ( (synpred6_KeYLexer()) ) {
								alt11=2;
							}
							else if ( (synpred7_KeYLexer()) ) {
								alt11=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 16, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'u':
						{
						int LA11_17 = input.LA(4);
						if ( ((LA11_17 >= '0' && LA11_17 <= '9')||(LA11_17 >= 'A' && LA11_17 <= 'F')||(LA11_17 >= 'a' && LA11_17 <= 'f')) ) {
							int LA11_20 = input.LA(5);
							if ( ((LA11_20 >= '0' && LA11_20 <= '9')||(LA11_20 >= 'A' && LA11_20 <= 'F')||(LA11_20 >= 'a' && LA11_20 <= 'f')) ) {
								int LA11_21 = input.LA(6);
								if ( ((LA11_21 >= '0' && LA11_21 <= '9')||(LA11_21 >= 'A' && LA11_21 <= 'F')||(LA11_21 >= 'a' && LA11_21 <= 'f')) ) {
									int LA11_22 = input.LA(7);
									if ( ((LA11_22 >= '0' && LA11_22 <= '9')||(LA11_22 >= 'A' && LA11_22 <= 'F')||(LA11_22 >= 'a' && LA11_22 <= 'f')) ) {
										int LA11_23 = input.LA(8);
										if ( (LA11_23=='\'') ) {
											int LA11_8 = input.LA(9);
											if ( (synpred6_KeYLexer()) ) {
												alt11=2;
											}
											else if ( (synpred7_KeYLexer()) ) {
												alt11=3;
											}

											else {
												if (state.backtracking>0) {state.failed=true; return;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 11, 8, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

										}

										else {
											if (state.backtracking>0) {state.failed=true; return;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 11, 23, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 11, 22, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 11, 21, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 20, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 17, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (synpred5_KeYLexer()) ) {
					alt11=1;
				}
				else if ( (true) ) {
					alt11=4;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:552:6: ( '\\'' '\\'' )=> PRIMES
					{
					mPRIMES(); if (state.failed) return;

					if ( state.backtracking==0 ) {_type = PRIMES;}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:554:6: ( '\\'' '\\\\' )=> CHAR_LITERAL
					{
					mCHAR_LITERAL(); if (state.failed) return;

					if ( state.backtracking==0 ) {_type = CHAR_LITERAL;}
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:556:6: ( '\\'' ~ ( '\\'' ) '\\'' )=> CHAR_LITERAL
					{
					mCHAR_LITERAL(); if (state.failed) return;

					if ( state.backtracking==0 ) {_type = CHAR_LITERAL;}
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:558:6: PRIMES
					{
					mPRIMES(); if (state.failed) return;

					if ( state.backtracking==0 ) {_type = PRIMES;}
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRIMES_OR_CHARLITERAL"

	// $ANTLR start "PRIMES"
	public final void mPRIMES() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:564:3: ( ( '\\'' )+ )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:564:3: ( '\\'' )+
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:564:3: ( '\\'' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='\'') ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:564:4: '\\''
					{
					match('\''); if (state.failed) return;
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRIMES"

	// $ANTLR start "CHAR_LITERAL"
	public final void mCHAR_LITERAL() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:569:3: ( '\\'' ( ( ' ' .. '&' ) | ( '(' .. '[' ) | ( ']' .. '~' ) | ( '\\\\' ( '\\'' | '\\\\' | 'n' | 'r' | 't' | 'b' | 'f' | '\"' | 'u' HEX ) ) ) '\\'' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:569:3: '\\'' ( ( ' ' .. '&' ) | ( '(' .. '[' ) | ( ']' .. '~' ) | ( '\\\\' ( '\\'' | '\\\\' | 'n' | 'r' | 't' | 'b' | 'f' | '\"' | 'u' HEX ) ) ) '\\''
			{
			match('\''); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:570:17: ( ( ' ' .. '&' ) | ( '(' .. '[' ) | ( ']' .. '~' ) | ( '\\\\' ( '\\'' | '\\\\' | 'n' | 'r' | 't' | 'b' | 'f' | '\"' | 'u' HEX ) ) )
			int alt14=4;
			switch ( input.LA(1) ) {
			case ' ':
			case '!':
			case '\"':
			case '#':
			case '$':
			case '%':
			case '&':
				{
				alt14=1;
				}
				break;
			case '(':
			case ')':
			case '*':
			case '+':
			case ',':
			case '-':
			case '.':
			case '/':
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case ':':
			case ';':
			case '<':
			case '=':
			case '>':
			case '?':
			case '@':
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case '[':
				{
				alt14=2;
				}
				break;
			case ']':
			case '^':
			case '_':
			case '`':
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
			case '{':
			case '|':
			case '}':
			case '~':
				{
				alt14=3;
				}
				break;
			case '\\':
				{
				alt14=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:570:18: ( ' ' .. '&' )
					{
					if ( (input.LA(1) >= ' ' && input.LA(1) <= '&') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:571:18: ( '(' .. '[' )
					{
					if ( (input.LA(1) >= '(' && input.LA(1) <= '[') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:572:18: ( ']' .. '~' )
					{
					if ( (input.LA(1) >= ']' && input.LA(1) <= '~') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:573:18: ( '\\\\' ( '\\'' | '\\\\' | 'n' | 'r' | 't' | 'b' | 'f' | '\"' | 'u' HEX ) )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:573:18: ( '\\\\' ( '\\'' | '\\\\' | 'n' | 'r' | 't' | 'b' | 'f' | '\"' | 'u' HEX ) )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:573:19: '\\\\' ( '\\'' | '\\\\' | 'n' | 'r' | 't' | 'b' | 'f' | '\"' | 'u' HEX )
					{
					match('\\'); if (state.failed) return;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:573:24: ( '\\'' | '\\\\' | 'n' | 'r' | 't' | 'b' | 'f' | '\"' | 'u' HEX )
					int alt13=9;
					switch ( input.LA(1) ) {
					case '\'':
						{
						alt13=1;
						}
						break;
					case '\\':
						{
						alt13=2;
						}
						break;
					case 'n':
						{
						alt13=3;
						}
						break;
					case 'r':
						{
						alt13=4;
						}
						break;
					case 't':
						{
						alt13=5;
						}
						break;
					case 'b':
						{
						alt13=6;
						}
						break;
					case 'f':
						{
						alt13=7;
						}
						break;
					case '\"':
						{
						alt13=8;
						}
						break;
					case 'u':
						{
						alt13=9;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}
					switch (alt13) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:573:25: '\\''
							{
							match('\''); if (state.failed) return;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:573:32: '\\\\'
							{
							match('\\'); if (state.failed) return;
							}
							break;
						case 3 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:573:39: 'n'
							{
							match('n'); if (state.failed) return;
							}
							break;
						case 4 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:573:45: 'r'
							{
							match('r'); if (state.failed) return;
							}
							break;
						case 5 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:573:51: 't'
							{
							match('t'); if (state.failed) return;
							}
							break;
						case 6 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:573:57: 'b'
							{
							match('b'); if (state.failed) return;
							}
							break;
						case 7 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:573:63: 'f'
							{
							match('f'); if (state.failed) return;
							}
							break;
						case 8 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:573:69: '\"'
							{
							match('\"'); if (state.failed) return;
							}
							break;
						case 9 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:573:75: 'u' HEX
							{
							match('u'); if (state.failed) return;
							mHEX(); if (state.failed) return;

							}
							break;

					}

					}

					}
					break;

			}

			match('\''); if (state.failed) return;
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_LITERAL"

	// $ANTLR start "QUOTED_STRING_LITERAL"
	public final void mQUOTED_STRING_LITERAL() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:580:5: ( '\"' ( '\\\\' . | '\\n' |~ ( '\\n' | '\"' | '\\\\' ) )* '\"' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:580:7: '\"' ( '\\\\' . | '\\n' |~ ( '\\n' | '\"' | '\\\\' ) )* '\"'
			{
			match('\"'); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:580:11: ( '\\\\' . | '\\n' |~ ( '\\n' | '\"' | '\\\\' ) )*
			loop15:
			while (true) {
				int alt15=4;
				int LA15_0 = input.LA(1);
				if ( (LA15_0=='\\') ) {
					alt15=1;
				}
				else if ( (LA15_0=='\n') ) {
					alt15=2;
				}
				else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '!')||(LA15_0 >= '#' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
					alt15=3;
				}

				switch (alt15) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:580:12: '\\\\' .
					{
					match('\\'); if (state.failed) return;
					matchAny(); if (state.failed) return;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:580:21: '\\n'
					{
					match('\n'); if (state.failed) return;
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:580:28: ~ ( '\\n' | '\"' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop15;
				}
			}

			match('\"'); if (state.failed) return;
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTED_STRING_LITERAL"

	// $ANTLR start "SL_COMMENT"
	public final void mSL_COMMENT() throws RecognitionException {
		try {
			int _type = SL_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:583:2: ( '//' (~ ( '\\n' | '\\uFFFF' ) )* ( '\\n' | '\\uFFFF' | EOF ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:584:2: '//' (~ ( '\\n' | '\\uFFFF' ) )* ( '\\n' | '\\uFFFF' | EOF )
			{
			match("//"); if (state.failed) return;

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:585:2: (~ ( '\\n' | '\\uFFFF' ) )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '\u0000' && LA16_0 <= '\t')||(LA16_0 >= '\u000B' && LA16_0 <= '\uFFFE')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFE') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop16;
				}
			}

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:585:24: ( '\\n' | '\\uFFFF' | EOF )
			int alt17=3;
			switch ( input.LA(1) ) {
			case '\n':
				{
				alt17=1;
				}
				break;
			case '\uFFFF':
				{
				alt17=2;
				}
				break;
			default:
				alt17=3;
			}
			switch (alt17) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:585:25: '\\n'
					{
					match('\n'); if (state.failed) return;
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:585:32: '\\uFFFF'
					{
					match('\uFFFF'); if (state.failed) return;
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:585:43: EOF
					{
					match(EOF); if (state.failed) return;

					}
					break;

			}

			if ( state.backtracking==0 ) { _channel = HIDDEN; }
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SL_COMMENT"

	// $ANTLR start "ML_COMMENT"
	public final void mML_COMMENT() throws RecognitionException {
		try {
			int _type = ML_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:590:2: ( '/*' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:591:2: '/*'
			{
			match("/*"); if (state.failed) return;

			if ( state.backtracking==0 ) {
				  
				  final int startAtLine = input.getLine();
				  final int startAtColumn = input.getCharPositionInLine() - 2;
				  
				  while(true) {
				    if(input.LA(1) == '*' && input.LA(2) == '/') {
				      match("*/");
				      break;
				    }
				    if (input.LA(1) == EOF) {
			            throw new RecognitionException(input){
			                @Override
			                public String getMessage() {
			                    return "Unclosed comment in " + input.getSourceName() + "\n\n"
			                        + "Started a comment with '/*' at line " + startAtLine
			                        + " column " + startAtColumn
			                        + "  but reached end of file without encountering '*/'.";
			                }
			            };
				    } else {
					    input.consume();
				    }
				  }
				  _channel = HIDDEN;

				}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ML_COMMENT"

	// $ANTLR start "DIGIT_DISPATCH"
	public final void mDIGIT_DISPATCH() throws RecognitionException {
		try {
			int _type = DIGIT_DISPATCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:623:5: ( ( DIGIT ( ' ' | '\\t' | '\\r' | '\\n' )* LPAREN )=> DIGIT | ( '0' 'x' )=> HEX_LITERAL | NUM_LITERAL )
			int alt18=3;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='0') ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1=='x') && (synpred9_KeYLexer())) {
					alt18=2;
				}
				else if ( (synpred8_KeYLexer()) ) {
					alt18=1;
				}
				else if ( (true) ) {
					alt18=3;
				}

			}
			else if ( ((LA18_0 >= '1' && LA18_0 <= '9')) ) {
				int LA18_2 = input.LA(2);
				if ( (synpred8_KeYLexer()) ) {
					alt18=1;
				}
				else if ( (true) ) {
					alt18=3;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:624:5: ( DIGIT ( ' ' | '\\t' | '\\r' | '\\n' )* LPAREN )=> DIGIT
					{
					mDIGIT(); if (state.failed) return;

					if ( state.backtracking==0 ) {_type = IDENT;}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:625:5: ( '0' 'x' )=> HEX_LITERAL
					{
					mHEX_LITERAL(); if (state.failed) return;

					if ( state.backtracking==0 ) {_type = NUM_LITERAL;}
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:626:5: NUM_LITERAL
					{
					mNUM_LITERAL(); if (state.failed) return;

					if ( state.backtracking==0 ) {_type = NUM_LITERAL;}
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT_DISPATCH"

	// $ANTLR start "HEX_LITERAL"
	public final void mHEX_LITERAL() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:631:3: ( '0' 'x' ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )+ )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:631:3: '0' 'x' ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )+
			{
			match('0'); if (state.failed) return;
			match('x'); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:631:11: ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= '0' && LA19_0 <= '9')||(LA19_0 >= 'A' && LA19_0 <= 'F')||(LA19_0 >= 'a' && LA19_0 <= 'f')) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					if (state.backtracking>0) {state.failed=true; return;}
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
	}
	// $ANTLR end "HEX_LITERAL"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:636:3: ( '0' .. '9' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "HEX"
	public final void mHEX() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:642:3: ( ( 'a' .. 'f' | 'A' .. 'F' | DIGIT ) ( 'a' .. 'f' | 'A' .. 'F' | DIGIT ) ( 'a' .. 'f' | 'A' .. 'F' | DIGIT ) ( 'a' .. 'f' | 'A' .. 'F' | DIGIT ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:642:3: ( 'a' .. 'f' | 'A' .. 'F' | DIGIT ) ( 'a' .. 'f' | 'A' .. 'F' | DIGIT ) ( 'a' .. 'f' | 'A' .. 'F' | DIGIT ) ( 'a' .. 'f' | 'A' .. 'F' | DIGIT )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:650:3: ( 'a' .. 'z' | 'A' .. 'Z' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "IDCHAR"
	public final void mIDCHAR() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:655:3: ( LETTER | DIGIT | '_' | '#' | '$' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:
			{
			if ( (input.LA(1) >= '#' && input.LA(1) <= '$')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDCHAR"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:659:4: ( ( ( LETTER | '_' | '#' | '$' ) ( IDCHAR )* ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:659:4: ( ( LETTER | '_' | '#' | '$' ) ( IDCHAR )* )
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:659:4: ( ( LETTER | '_' | '#' | '$' ) ( IDCHAR )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:659:6: ( LETTER | '_' | '#' | '$' ) ( IDCHAR )*
			{
			if ( (input.LA(1) >= '#' && input.LA(1) <= '$')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:659:33: ( IDCHAR )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= '#' && LA20_0 <= '$')||(LA20_0 >= '0' && LA20_0 <= '9')||(LA20_0 >= 'A' && LA20_0 <= 'Z')||LA20_0=='_'||(LA20_0 >= 'a' && LA20_0 <= 'z')) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:
					{
					if ( (input.LA(1) >= '#' && input.LA(1) <= '$')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop20;
				}
			}

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENT"

	// $ANTLR start "NUM_LITERAL"
	public final void mNUM_LITERAL() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:665:5: ( ( DIGIT )+ )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:666:5: ( DIGIT )+
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:666:5: ( DIGIT )+
			int cnt21=0;
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt21 >= 1 ) break loop21;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(21, input);
					throw eee;
				}
				cnt21++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM_LITERAL"

	// $ANTLR start "MODALITY"
	public final void mMODALITY() throws RecognitionException {
		try {
			int _type = MODALITY;
			int _channel = DEFAULT_TOKEN_CHANNEL;

			    int _begin = getText().length();

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:678:3: ( '\\\\' ( ( LETTER | '_' )+ | '<' | '[' | '[[' ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:678:3: '\\\\' ( ( LETTER | '_' )+ | '<' | '[' | '[[' )
			{
			match('\\'); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:678:8: ( ( LETTER | '_' )+ | '<' | '[' | '[[' )
			int alt23=4;
			switch ( input.LA(1) ) {
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case '_':
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				{
				alt23=1;
				}
				break;
			case '<':
				{
				alt23=2;
				}
				break;
			case '[':
				{
				int LA23_3 = input.LA(2);
				if ( (LA23_3=='[') ) {
					alt23=4;
				}

				else {
					alt23=3;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:678:10: ( LETTER | '_' )+
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:678:10: ( LETTER | '_' )+
					int cnt22=0;
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( ((LA22_0 >= 'A' && LA22_0 <= 'Z')||LA22_0=='_'||(LA22_0 >= 'a' && LA22_0 <= 'z')) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:
							{
							if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt22 >= 1 ) break loop22;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(22, input);
							throw eee;
						}
						cnt22++;
					}

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:678:28: '<'
					{
					match('<'); if (state.failed) return;
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:678:34: '['
					{
					match('['); if (state.failed) return;
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:678:40: '[['
					{
					match("[["); if (state.failed) return;

					}
					break;

			}

			if ( state.backtracking==0 ) {
			    modalityBegin = getText();
			    Debug.out("modalityBegin == ", modalityBegin);
			    //int literalTest = testLiteralsTable(MODALITY);
			    //Debug.out("testLiteralsTable == ", literalTest);
			    //_type = testLiteralsTable(_type);
			    if(/*literalTest == MODALITY && */modPairs.get(modalityBegin) != null) {
			        /* This while with the following call to mMODALITYEND is
			         * and alternative to calling mJAVABLOCK, but it should be faster
			         */
			        while(true) {
			            if(input.LA(1) == '/' && input.LA(2) == '/') {
			                mSL_COMMENT(); continue;
			            }
			            if(input.LA(1) == '/' && input.LA(2) == '*') {
			                mML_COMMENT(); continue;
			            }
			            if(input.LA(1) == '/' && input.LA(2) == '*') {
			                mML_COMMENT(); continue;
			            }
			            if(input.LA(1) == '\"') {
			                mQUOTED_STRING_LITERAL(); continue;
			            }
			            if(input.LA(1) == '\'') {
			                mCHAR_LITERAL(); continue;
			            }
			            if(input.LA(1) == '\\' && (input.LA(2) == 'e' || input.LA(2) == '>' || input.LA(2) == ']'))
			                // check whether it follows an ENDMODALITY
			                break;
			            if (input.LA(1) == EOF) {
			                throw new NoViableAltException("Matched EOF", -1, -1, input);
			            } else {
			                input.consume();
			            }
			        }
			        mMODALITYEND();
			        //              mJAVABLOCK(false);
			        matchAndTransformModality(_begin);
			    }else{
			        if("\\includeFile".equals(modalityBegin)) {
			            // File inclusion
			            while(input.LA(1) == ' ' || input.LA(1) == '\t' || input.LA(1) == '\n')
			                match(input.LA(1));
			            int startIndex = getText().length()+1;
			            mQUOTED_STRING_LITERAL();
			            int stopIndex = getText().length()-1;
			            while(input.LA(1) == ' ' || input.LA(1) == '\t' || input.LA(1) == '\n')
			                match(input.LA(1));
			            mSEMI();
			            _channel = HIDDEN;
			            String fileName = getText().toString().substring(startIndex,stopIndex);
			            Debug.out("File to be included: ", fileName);
			            File incf = new File(fileName);
			            File f = new File(getSourceName());
			            if((f.isAbsolute() || f.getParentFile() != null) && !incf.isAbsolute()) {
			                f = new File(f.getParentFile(), fileName);
			                fileName = f.getAbsolutePath();
			            }
			            Debug.out("File to be included: ", fileName);
			            try {
			                // save current lexer's state
			                SaveStruct ss = new SaveStruct(input);
			                selector.push(ss);

			                Debug.out("Pushed lexer.");

			                // switch on new input stream
			                setCharStream(new ANTLRFileStream(fileName));
			                reset();
			            } catch (IOException fnf) {
			                throw new NoViableAltException("File '" + fileName + "' not found. (" +
			                        getSourceName() + ", " + getLine() + ", " + getCharPositionInLine() + ")", -1, -1, input);
			            }
			        } else {
			            _type = IDENT; // make it an IDENT starting with '\\'
			            // (it will not contain digits!)
			        }
			    }
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODALITY"

	// $ANTLR start "MODALITYEND"
	public final void mMODALITYEND() throws RecognitionException {
		try {
			 int _begin = getText().length(); 
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:761:3: ( '\\\\' ( 'endmodality' | '>' | ']' | ']]' ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:761:3: '\\\\' ( 'endmodality' | '>' | ']' | ']]' )
			{
			match('\\'); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:761:8: ( 'endmodality' | '>' | ']' | ']]' )
			int alt24=4;
			switch ( input.LA(1) ) {
			case 'e':
				{
				alt24=1;
				}
				break;
			case '>':
				{
				alt24=2;
				}
				break;
			case ']':
				{
				int LA24_3 = input.LA(2);
				if ( (LA24_3==']') ) {
					alt24=4;
				}

				else {
					alt24=3;
				}

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
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:761:10: 'endmodality'
					{
					match("endmodality"); if (state.failed) return;

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:761:26: '>'
					{
					match('>'); if (state.failed) return;
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:761:32: ']'
					{
					match(']'); if (state.failed) return;
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:761:38: ']]'
					{
					match("]]"); if (state.failed) return;

					}
					break;

			}

			if ( state.backtracking==0 ) {
				   modalityEnd = getText().substring(_begin);
			           Debug.out("modalityEnd == ", modalityEnd);
				}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODALITYEND"

	// $ANTLR start "JAVABLOCK"
	public final void mJAVABLOCK() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:769:5: ( ( SL_COMMENT | ML_COMMENT | '/' ~ ( '/' | '*' ) | CHAR_LITERAL | QUOTED_STRING_LITERAL | '\\r' | '\\n' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | ' ' | '\\t' | '{' | '}' | '(' | ')' | '[' | ']' | '<' | '>' | '.' | ',' | ';' | ':' | '?' | '%' | '*' | '-' | '=' | '+' | '~' | '&' | '|' | '^' | '!' | '@' | '#' | '$' )* MODALITYEND )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:770:5: ( SL_COMMENT | ML_COMMENT | '/' ~ ( '/' | '*' ) | CHAR_LITERAL | QUOTED_STRING_LITERAL | '\\r' | '\\n' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | ' ' | '\\t' | '{' | '}' | '(' | ')' | '[' | ']' | '<' | '>' | '.' | ',' | ';' | ':' | '?' | '%' | '*' | '-' | '=' | '+' | '~' | '&' | '|' | '^' | '!' | '@' | '#' | '$' )* MODALITYEND
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:770:5: ( SL_COMMENT | ML_COMMENT | '/' ~ ( '/' | '*' ) | CHAR_LITERAL | QUOTED_STRING_LITERAL | '\\r' | '\\n' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | ' ' | '\\t' | '{' | '}' | '(' | ')' | '[' | ']' | '<' | '>' | '.' | ',' | ';' | ':' | '?' | '%' | '*' | '-' | '=' | '+' | '~' | '&' | '|' | '^' | '!' | '@' | '#' | '$' )*
			loop25:
			while (true) {
				int alt25=40;
				switch ( input.LA(1) ) {
				case '/':
					{
					int LA25_2 = input.LA(2);
					if ( (LA25_2=='/') ) {
						alt25=1;
					}
					else if ( (LA25_2=='*') ) {
						alt25=2;
					}
					else if ( ((LA25_2 >= '\u0000' && LA25_2 <= ')')||(LA25_2 >= '+' && LA25_2 <= '.')||(LA25_2 >= '0' && LA25_2 <= '\uFFFF')) ) {
						alt25=3;
					}

					}
					break;
				case '\'':
					{
					alt25=4;
					}
					break;
				case '\"':
					{
					alt25=5;
					}
					break;
				case '\r':
					{
					alt25=6;
					}
					break;
				case '\n':
					{
					alt25=7;
					}
					break;
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt25=8;
					}
					break;
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					{
					alt25=9;
					}
					break;
				case '_':
					{
					alt25=10;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					{
					alt25=11;
					}
					break;
				case ' ':
					{
					alt25=12;
					}
					break;
				case '\t':
					{
					alt25=13;
					}
					break;
				case '{':
					{
					alt25=14;
					}
					break;
				case '}':
					{
					alt25=15;
					}
					break;
				case '(':
					{
					alt25=16;
					}
					break;
				case ')':
					{
					alt25=17;
					}
					break;
				case '[':
					{
					alt25=18;
					}
					break;
				case ']':
					{
					alt25=19;
					}
					break;
				case '<':
					{
					alt25=20;
					}
					break;
				case '>':
					{
					alt25=21;
					}
					break;
				case '.':
					{
					alt25=22;
					}
					break;
				case ',':
					{
					alt25=23;
					}
					break;
				case ';':
					{
					alt25=24;
					}
					break;
				case ':':
					{
					alt25=25;
					}
					break;
				case '?':
					{
					alt25=26;
					}
					break;
				case '%':
					{
					alt25=27;
					}
					break;
				case '*':
					{
					alt25=28;
					}
					break;
				case '-':
					{
					alt25=29;
					}
					break;
				case '=':
					{
					alt25=30;
					}
					break;
				case '+':
					{
					alt25=31;
					}
					break;
				case '~':
					{
					alt25=32;
					}
					break;
				case '&':
					{
					alt25=33;
					}
					break;
				case '|':
					{
					alt25=34;
					}
					break;
				case '^':
					{
					alt25=35;
					}
					break;
				case '!':
					{
					alt25=36;
					}
					break;
				case '@':
					{
					alt25=37;
					}
					break;
				case '#':
					{
					alt25=38;
					}
					break;
				case '$':
					{
					alt25=39;
					}
					break;
				}
				switch (alt25) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:771:2: SL_COMMENT
					{
					mSL_COMMENT(); if (state.failed) return;

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:772:9: ML_COMMENT
					{
					mML_COMMENT(); if (state.failed) return;

					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:773:9: '/' ~ ( '/' | '*' )
					{
					match('/'); if (state.failed) return;
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ')')||(input.LA(1) >= '+' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 4 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:774:9: CHAR_LITERAL
					{
					mCHAR_LITERAL(); if (state.failed) return;

					}
					break;
				case 5 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:775:9: QUOTED_STRING_LITERAL
					{
					mQUOTED_STRING_LITERAL(); if (state.failed) return;

					}
					break;
				case 6 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:776:9: '\\r'
					{
					match('\r'); if (state.failed) return;
					}
					break;
				case 7 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:777:9: '\\n'
					{
					match('\n'); if (state.failed) return;
					}
					break;
				case 8 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:778:9: 'a' .. 'z'
					{
					matchRange('a','z'); if (state.failed) return;
					}
					break;
				case 9 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:778:20: 'A' .. 'Z'
					{
					matchRange('A','Z'); if (state.failed) return;
					}
					break;
				case 10 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:778:31: '_'
					{
					match('_'); if (state.failed) return;
					}
					break;
				case 11 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:779:9: '0' .. '9'
					{
					matchRange('0','9'); if (state.failed) return;
					}
					break;
				case 12 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:780:9: ' '
					{
					match(' '); if (state.failed) return;
					}
					break;
				case 13 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:780:15: '\\t'
					{
					match('\t'); if (state.failed) return;
					}
					break;
				case 14 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:781:9: '{'
					{
					match('{'); if (state.failed) return;
					}
					break;
				case 15 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:781:15: '}'
					{
					match('}'); if (state.failed) return;
					}
					break;
				case 16 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:781:21: '('
					{
					match('('); if (state.failed) return;
					}
					break;
				case 17 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:781:27: ')'
					{
					match(')'); if (state.failed) return;
					}
					break;
				case 18 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:781:33: '['
					{
					match('['); if (state.failed) return;
					}
					break;
				case 19 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:781:39: ']'
					{
					match(']'); if (state.failed) return;
					}
					break;
				case 20 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:781:45: '<'
					{
					match('<'); if (state.failed) return;
					}
					break;
				case 21 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:781:51: '>'
					{
					match('>'); if (state.failed) return;
					}
					break;
				case 22 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:782:9: '.'
					{
					match('.'); if (state.failed) return;
					}
					break;
				case 23 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:782:15: ','
					{
					match(','); if (state.failed) return;
					}
					break;
				case 24 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:782:21: ';'
					{
					match(';'); if (state.failed) return;
					}
					break;
				case 25 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:782:27: ':'
					{
					match(':'); if (state.failed) return;
					}
					break;
				case 26 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:782:33: '?'
					{
					match('?'); if (state.failed) return;
					}
					break;
				case 27 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:783:9: '%'
					{
					match('%'); if (state.failed) return;
					}
					break;
				case 28 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:783:15: '*'
					{
					match('*'); if (state.failed) return;
					}
					break;
				case 29 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:783:21: '-'
					{
					match('-'); if (state.failed) return;
					}
					break;
				case 30 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:783:27: '='
					{
					match('='); if (state.failed) return;
					}
					break;
				case 31 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:783:33: '+'
					{
					match('+'); if (state.failed) return;
					}
					break;
				case 32 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:783:39: '~'
					{
					match('~'); if (state.failed) return;
					}
					break;
				case 33 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:783:45: '&'
					{
					match('&'); if (state.failed) return;
					}
					break;
				case 34 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:783:51: '|'
					{
					match('|'); if (state.failed) return;
					}
					break;
				case 35 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:783:57: '^'
					{
					match('^'); if (state.failed) return;
					}
					break;
				case 36 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:784:9: '!'
					{
					match('!'); if (state.failed) return;
					}
					break;
				case 37 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:784:15: '@'
					{
					match('@'); if (state.failed) return;
					}
					break;
				case 38 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:784:21: '#'
					{
					match('#'); if (state.failed) return;
					}
					break;
				case 39 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:784:27: '$'
					{
					match('$'); if (state.failed) return;
					}
					break;

				default :
					break loop25;
				}
			}

			mMODALITYEND(); if (state.failed) return;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JAVABLOCK"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:8: ( SORTS | GENERIC | PROXY | EXTENDS | ONEOF | ABSTRACT | SCHEMAVARIABLES | SCHEMAVAR | MODALOPERATOR | PROGRAM | FORMULA | TERM | UPDATE | VARIABLES | VARIABLE | SKOLEMTERM | SKOLEMFORMULA | TERMLABEL | MODIFIES | PROGRAMVARIABLES | VARCOND | APPLY_UPDATE_ON_RIGID | DEPENDINGON | DISJOINTMODULONULL | DROP_EFFECTLESS_ELEMENTARIES | DROP_EFFECTLESS_STORES | SIMPLIFY_IF_THEN_ELSE_UPDATE | ENUM_CONST | FREELABELIN | HASSORT | FIELDTYPE | FINAL | ELEMSORT | HASLABEL | HASSUBFORMULAS | ISARRAY | ISARRAYLENGTH | ISCONSTANT | ISENUMTYPE | ISINDUCTVAR | ISLOCALVARIABLE | ISOBSERVER | DIFFERENT | METADISJOINT | ISTHISREFERENCE | DIFFERENTFIELDS | ISREFERENCE | ISREFERENCEARRAY | ISSTATICFIELD | ISSUBTYPE | EQUAL_UNIQUE | NEW | NEWLABEL | CONTAINS_ASSIGNMENT | NOT_ | NOTFREEIN | SAME | STATIC | STATICMETHODREFERENCE | STRICT | TYPEOF | INSTANTIATE_GENERIC | FORALL | EXISTS | SUBST | IF | IFEX | THEN | ELSE | INCLUDE | INCLUDELDTS | CLASSPATH | BOOTCLASSPATH | NODEFAULTCLASSES | JAVASOURCE | WITHOPTIONS | OPTIONSDECL | KEYSETTINGS | PROFILE | TRUE | FALSE | SAMEUPDATELEVEL | INSEQUENTSTATE | ANTECEDENTPOLARITY | SUCCEDENTPOLARITY | CLOSEGOAL | HEURISTICSDECL | NONINTERACTIVE | DISPLAYNAME | HELPTEXT | REPLACEWITH | ADDRULES | ADDPROGVARS | HEURISTICS | FIND | ADD | ASSUMES | TRIGGER | AVOID | PREDICATES | FUNCTIONS | TRANSFORMERS | UNIQUE | RULES | AXIOMS | PROBLEM | CHOOSECONTRACT | PROOFOBLIGATION | PROOF | PROOFSCRIPT | CONTRACTS | INVARIANTS | LEMMA | IN_TYPE | IS_ABSTRACT_OR_INTERFACE | CONTAINERTYPE | LIMITED | LOCSET | SEQ | BIGINT | UTF_PRECEDES | UTF_IN | UTF_EMPTY | UTF_UNION | UTF_INTERSECT | UTF_SUBSET | UTF_SETMINUS | SEMI | SLASH | BACKSLASH | COLON | DOUBLECOLON | ASSIGN | DOT | DOTRANGE | COMMA | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | EMPTYBRACKETS | AT | PARALLEL | OR | AND | NOT | IMP | EQUALS | NOT_EQUALS | SEQARROW | EXP | TILDE | PERCENT | STAR | MINUS | PLUS | GREATER | GREATEREQUAL | RGUILLEMETS | WS | STRING_LITERAL | LESS_DISPATCH | PRIMES_OR_CHARLITERAL | SL_COMMENT | ML_COMMENT | DIGIT_DISPATCH | IDENT | MODALITY )
		int alt26=170;
		alt26 = dfa26.predict(input);
		switch (alt26) {
			case 1 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:10: SORTS
				{
				mSORTS(); if (state.failed) return;

				}
				break;
			case 2 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:16: GENERIC
				{
				mGENERIC(); if (state.failed) return;

				}
				break;
			case 3 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:24: PROXY
				{
				mPROXY(); if (state.failed) return;

				}
				break;
			case 4 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:30: EXTENDS
				{
				mEXTENDS(); if (state.failed) return;

				}
				break;
			case 5 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:38: ONEOF
				{
				mONEOF(); if (state.failed) return;

				}
				break;
			case 6 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:44: ABSTRACT
				{
				mABSTRACT(); if (state.failed) return;

				}
				break;
			case 7 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:53: SCHEMAVARIABLES
				{
				mSCHEMAVARIABLES(); if (state.failed) return;

				}
				break;
			case 8 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:69: SCHEMAVAR
				{
				mSCHEMAVAR(); if (state.failed) return;

				}
				break;
			case 9 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:79: MODALOPERATOR
				{
				mMODALOPERATOR(); if (state.failed) return;

				}
				break;
			case 10 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:93: PROGRAM
				{
				mPROGRAM(); if (state.failed) return;

				}
				break;
			case 11 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:101: FORMULA
				{
				mFORMULA(); if (state.failed) return;

				}
				break;
			case 12 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:109: TERM
				{
				mTERM(); if (state.failed) return;

				}
				break;
			case 13 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:114: UPDATE
				{
				mUPDATE(); if (state.failed) return;

				}
				break;
			case 14 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:121: VARIABLES
				{
				mVARIABLES(); if (state.failed) return;

				}
				break;
			case 15 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:131: VARIABLE
				{
				mVARIABLE(); if (state.failed) return;

				}
				break;
			case 16 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:140: SKOLEMTERM
				{
				mSKOLEMTERM(); if (state.failed) return;

				}
				break;
			case 17 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:151: SKOLEMFORMULA
				{
				mSKOLEMFORMULA(); if (state.failed) return;

				}
				break;
			case 18 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:165: TERMLABEL
				{
				mTERMLABEL(); if (state.failed) return;

				}
				break;
			case 19 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:175: MODIFIES
				{
				mMODIFIES(); if (state.failed) return;

				}
				break;
			case 20 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:184: PROGRAMVARIABLES
				{
				mPROGRAMVARIABLES(); if (state.failed) return;

				}
				break;
			case 21 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:201: VARCOND
				{
				mVARCOND(); if (state.failed) return;

				}
				break;
			case 22 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:209: APPLY_UPDATE_ON_RIGID
				{
				mAPPLY_UPDATE_ON_RIGID(); if (state.failed) return;

				}
				break;
			case 23 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:231: DEPENDINGON
				{
				mDEPENDINGON(); if (state.failed) return;

				}
				break;
			case 24 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:243: DISJOINTMODULONULL
				{
				mDISJOINTMODULONULL(); if (state.failed) return;

				}
				break;
			case 25 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:262: DROP_EFFECTLESS_ELEMENTARIES
				{
				mDROP_EFFECTLESS_ELEMENTARIES(); if (state.failed) return;

				}
				break;
			case 26 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:291: DROP_EFFECTLESS_STORES
				{
				mDROP_EFFECTLESS_STORES(); if (state.failed) return;

				}
				break;
			case 27 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:314: SIMPLIFY_IF_THEN_ELSE_UPDATE
				{
				mSIMPLIFY_IF_THEN_ELSE_UPDATE(); if (state.failed) return;

				}
				break;
			case 28 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:343: ENUM_CONST
				{
				mENUM_CONST(); if (state.failed) return;

				}
				break;
			case 29 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:354: FREELABELIN
				{
				mFREELABELIN(); if (state.failed) return;

				}
				break;
			case 30 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:366: HASSORT
				{
				mHASSORT(); if (state.failed) return;

				}
				break;
			case 31 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:374: FIELDTYPE
				{
				mFIELDTYPE(); if (state.failed) return;

				}
				break;
			case 32 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:384: FINAL
				{
				mFINAL(); if (state.failed) return;

				}
				break;
			case 33 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:390: ELEMSORT
				{
				mELEMSORT(); if (state.failed) return;

				}
				break;
			case 34 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:399: HASLABEL
				{
				mHASLABEL(); if (state.failed) return;

				}
				break;
			case 35 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:408: HASSUBFORMULAS
				{
				mHASSUBFORMULAS(); if (state.failed) return;

				}
				break;
			case 36 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:423: ISARRAY
				{
				mISARRAY(); if (state.failed) return;

				}
				break;
			case 37 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:431: ISARRAYLENGTH
				{
				mISARRAYLENGTH(); if (state.failed) return;

				}
				break;
			case 38 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:445: ISCONSTANT
				{
				mISCONSTANT(); if (state.failed) return;

				}
				break;
			case 39 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:456: ISENUMTYPE
				{
				mISENUMTYPE(); if (state.failed) return;

				}
				break;
			case 40 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:467: ISINDUCTVAR
				{
				mISINDUCTVAR(); if (state.failed) return;

				}
				break;
			case 41 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:479: ISLOCALVARIABLE
				{
				mISLOCALVARIABLE(); if (state.failed) return;

				}
				break;
			case 42 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:495: ISOBSERVER
				{
				mISOBSERVER(); if (state.failed) return;

				}
				break;
			case 43 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:506: DIFFERENT
				{
				mDIFFERENT(); if (state.failed) return;

				}
				break;
			case 44 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:516: METADISJOINT
				{
				mMETADISJOINT(); if (state.failed) return;

				}
				break;
			case 45 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:529: ISTHISREFERENCE
				{
				mISTHISREFERENCE(); if (state.failed) return;

				}
				break;
			case 46 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:545: DIFFERENTFIELDS
				{
				mDIFFERENTFIELDS(); if (state.failed) return;

				}
				break;
			case 47 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:561: ISREFERENCE
				{
				mISREFERENCE(); if (state.failed) return;

				}
				break;
			case 48 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:573: ISREFERENCEARRAY
				{
				mISREFERENCEARRAY(); if (state.failed) return;

				}
				break;
			case 49 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:590: ISSTATICFIELD
				{
				mISSTATICFIELD(); if (state.failed) return;

				}
				break;
			case 50 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:604: ISSUBTYPE
				{
				mISSUBTYPE(); if (state.failed) return;

				}
				break;
			case 51 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:614: EQUAL_UNIQUE
				{
				mEQUAL_UNIQUE(); if (state.failed) return;

				}
				break;
			case 52 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:627: NEW
				{
				mNEW(); if (state.failed) return;

				}
				break;
			case 53 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:631: NEWLABEL
				{
				mNEWLABEL(); if (state.failed) return;

				}
				break;
			case 54 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:640: CONTAINS_ASSIGNMENT
				{
				mCONTAINS_ASSIGNMENT(); if (state.failed) return;

				}
				break;
			case 55 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:660: NOT_
				{
				mNOT_(); if (state.failed) return;

				}
				break;
			case 56 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:665: NOTFREEIN
				{
				mNOTFREEIN(); if (state.failed) return;

				}
				break;
			case 57 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:675: SAME
				{
				mSAME(); if (state.failed) return;

				}
				break;
			case 58 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:680: STATIC
				{
				mSTATIC(); if (state.failed) return;

				}
				break;
			case 59 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:687: STATICMETHODREFERENCE
				{
				mSTATICMETHODREFERENCE(); if (state.failed) return;

				}
				break;
			case 60 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:709: STRICT
				{
				mSTRICT(); if (state.failed) return;

				}
				break;
			case 61 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:716: TYPEOF
				{
				mTYPEOF(); if (state.failed) return;

				}
				break;
			case 62 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:723: INSTANTIATE_GENERIC
				{
				mINSTANTIATE_GENERIC(); if (state.failed) return;

				}
				break;
			case 63 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:743: FORALL
				{
				mFORALL(); if (state.failed) return;

				}
				break;
			case 64 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:750: EXISTS
				{
				mEXISTS(); if (state.failed) return;

				}
				break;
			case 65 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:757: SUBST
				{
				mSUBST(); if (state.failed) return;

				}
				break;
			case 66 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:763: IF
				{
				mIF(); if (state.failed) return;

				}
				break;
			case 67 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:766: IFEX
				{
				mIFEX(); if (state.failed) return;

				}
				break;
			case 68 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:771: THEN
				{
				mTHEN(); if (state.failed) return;

				}
				break;
			case 69 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:776: ELSE
				{
				mELSE(); if (state.failed) return;

				}
				break;
			case 70 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:781: INCLUDE
				{
				mINCLUDE(); if (state.failed) return;

				}
				break;
			case 71 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:789: INCLUDELDTS
				{
				mINCLUDELDTS(); if (state.failed) return;

				}
				break;
			case 72 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:801: CLASSPATH
				{
				mCLASSPATH(); if (state.failed) return;

				}
				break;
			case 73 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:811: BOOTCLASSPATH
				{
				mBOOTCLASSPATH(); if (state.failed) return;

				}
				break;
			case 74 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:825: NODEFAULTCLASSES
				{
				mNODEFAULTCLASSES(); if (state.failed) return;

				}
				break;
			case 75 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:842: JAVASOURCE
				{
				mJAVASOURCE(); if (state.failed) return;

				}
				break;
			case 76 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:853: WITHOPTIONS
				{
				mWITHOPTIONS(); if (state.failed) return;

				}
				break;
			case 77 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:865: OPTIONSDECL
				{
				mOPTIONSDECL(); if (state.failed) return;

				}
				break;
			case 78 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:877: KEYSETTINGS
				{
				mKEYSETTINGS(); if (state.failed) return;

				}
				break;
			case 79 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:889: PROFILE
				{
				mPROFILE(); if (state.failed) return;

				}
				break;
			case 80 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:897: TRUE
				{
				mTRUE(); if (state.failed) return;

				}
				break;
			case 81 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:902: FALSE
				{
				mFALSE(); if (state.failed) return;

				}
				break;
			case 82 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:908: SAMEUPDATELEVEL
				{
				mSAMEUPDATELEVEL(); if (state.failed) return;

				}
				break;
			case 83 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:924: INSEQUENTSTATE
				{
				mINSEQUENTSTATE(); if (state.failed) return;

				}
				break;
			case 84 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:939: ANTECEDENTPOLARITY
				{
				mANTECEDENTPOLARITY(); if (state.failed) return;

				}
				break;
			case 85 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:958: SUCCEDENTPOLARITY
				{
				mSUCCEDENTPOLARITY(); if (state.failed) return;

				}
				break;
			case 86 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:976: CLOSEGOAL
				{
				mCLOSEGOAL(); if (state.failed) return;

				}
				break;
			case 87 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:986: HEURISTICSDECL
				{
				mHEURISTICSDECL(); if (state.failed) return;

				}
				break;
			case 88 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1001: NONINTERACTIVE
				{
				mNONINTERACTIVE(); if (state.failed) return;

				}
				break;
			case 89 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1016: DISPLAYNAME
				{
				mDISPLAYNAME(); if (state.failed) return;

				}
				break;
			case 90 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1028: HELPTEXT
				{
				mHELPTEXT(); if (state.failed) return;

				}
				break;
			case 91 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1037: REPLACEWITH
				{
				mREPLACEWITH(); if (state.failed) return;

				}
				break;
			case 92 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1049: ADDRULES
				{
				mADDRULES(); if (state.failed) return;

				}
				break;
			case 93 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1058: ADDPROGVARS
				{
				mADDPROGVARS(); if (state.failed) return;

				}
				break;
			case 94 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1070: HEURISTICS
				{
				mHEURISTICS(); if (state.failed) return;

				}
				break;
			case 95 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1081: FIND
				{
				mFIND(); if (state.failed) return;

				}
				break;
			case 96 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1086: ADD
				{
				mADD(); if (state.failed) return;

				}
				break;
			case 97 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1090: ASSUMES
				{
				mASSUMES(); if (state.failed) return;

				}
				break;
			case 98 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1098: TRIGGER
				{
				mTRIGGER(); if (state.failed) return;

				}
				break;
			case 99 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1106: AVOID
				{
				mAVOID(); if (state.failed) return;

				}
				break;
			case 100 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1112: PREDICATES
				{
				mPREDICATES(); if (state.failed) return;

				}
				break;
			case 101 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1123: FUNCTIONS
				{
				mFUNCTIONS(); if (state.failed) return;

				}
				break;
			case 102 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1133: TRANSFORMERS
				{
				mTRANSFORMERS(); if (state.failed) return;

				}
				break;
			case 103 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1146: UNIQUE
				{
				mUNIQUE(); if (state.failed) return;

				}
				break;
			case 104 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1153: RULES
				{
				mRULES(); if (state.failed) return;

				}
				break;
			case 105 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1159: AXIOMS
				{
				mAXIOMS(); if (state.failed) return;

				}
				break;
			case 106 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1166: PROBLEM
				{
				mPROBLEM(); if (state.failed) return;

				}
				break;
			case 107 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1174: CHOOSECONTRACT
				{
				mCHOOSECONTRACT(); if (state.failed) return;

				}
				break;
			case 108 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1189: PROOFOBLIGATION
				{
				mPROOFOBLIGATION(); if (state.failed) return;

				}
				break;
			case 109 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1205: PROOF
				{
				mPROOF(); if (state.failed) return;

				}
				break;
			case 110 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1211: PROOFSCRIPT
				{
				mPROOFSCRIPT(); if (state.failed) return;

				}
				break;
			case 111 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1223: CONTRACTS
				{
				mCONTRACTS(); if (state.failed) return;

				}
				break;
			case 112 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1233: INVARIANTS
				{
				mINVARIANTS(); if (state.failed) return;

				}
				break;
			case 113 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1244: LEMMA
				{
				mLEMMA(); if (state.failed) return;

				}
				break;
			case 114 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1250: IN_TYPE
				{
				mIN_TYPE(); if (state.failed) return;

				}
				break;
			case 115 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1258: IS_ABSTRACT_OR_INTERFACE
				{
				mIS_ABSTRACT_OR_INTERFACE(); if (state.failed) return;

				}
				break;
			case 116 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1283: CONTAINERTYPE
				{
				mCONTAINERTYPE(); if (state.failed) return;

				}
				break;
			case 117 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1297: LIMITED
				{
				mLIMITED(); if (state.failed) return;

				}
				break;
			case 118 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1305: LOCSET
				{
				mLOCSET(); if (state.failed) return;

				}
				break;
			case 119 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1312: SEQ
				{
				mSEQ(); if (state.failed) return;

				}
				break;
			case 120 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1316: BIGINT
				{
				mBIGINT(); if (state.failed) return;

				}
				break;
			case 121 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1323: UTF_PRECEDES
				{
				mUTF_PRECEDES(); if (state.failed) return;

				}
				break;
			case 122 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1336: UTF_IN
				{
				mUTF_IN(); if (state.failed) return;

				}
				break;
			case 123 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1343: UTF_EMPTY
				{
				mUTF_EMPTY(); if (state.failed) return;

				}
				break;
			case 124 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1353: UTF_UNION
				{
				mUTF_UNION(); if (state.failed) return;

				}
				break;
			case 125 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1363: UTF_INTERSECT
				{
				mUTF_INTERSECT(); if (state.failed) return;

				}
				break;
			case 126 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1377: UTF_SUBSET
				{
				mUTF_SUBSET(); if (state.failed) return;

				}
				break;
			case 127 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1388: UTF_SETMINUS
				{
				mUTF_SETMINUS(); if (state.failed) return;

				}
				break;
			case 128 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1401: SEMI
				{
				mSEMI(); if (state.failed) return;

				}
				break;
			case 129 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1406: SLASH
				{
				mSLASH(); if (state.failed) return;

				}
				break;
			case 130 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1412: BACKSLASH
				{
				mBACKSLASH(); if (state.failed) return;

				}
				break;
			case 131 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1422: COLON
				{
				mCOLON(); if (state.failed) return;

				}
				break;
			case 132 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1428: DOUBLECOLON
				{
				mDOUBLECOLON(); if (state.failed) return;

				}
				break;
			case 133 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1440: ASSIGN
				{
				mASSIGN(); if (state.failed) return;

				}
				break;
			case 134 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1447: DOT
				{
				mDOT(); if (state.failed) return;

				}
				break;
			case 135 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1451: DOTRANGE
				{
				mDOTRANGE(); if (state.failed) return;

				}
				break;
			case 136 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1460: COMMA
				{
				mCOMMA(); if (state.failed) return;

				}
				break;
			case 137 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1466: LPAREN
				{
				mLPAREN(); if (state.failed) return;

				}
				break;
			case 138 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1473: RPAREN
				{
				mRPAREN(); if (state.failed) return;

				}
				break;
			case 139 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1480: LBRACE
				{
				mLBRACE(); if (state.failed) return;

				}
				break;
			case 140 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1487: RBRACE
				{
				mRBRACE(); if (state.failed) return;

				}
				break;
			case 141 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1494: LBRACKET
				{
				mLBRACKET(); if (state.failed) return;

				}
				break;
			case 142 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1503: RBRACKET
				{
				mRBRACKET(); if (state.failed) return;

				}
				break;
			case 143 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1512: EMPTYBRACKETS
				{
				mEMPTYBRACKETS(); if (state.failed) return;

				}
				break;
			case 144 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1526: AT
				{
				mAT(); if (state.failed) return;

				}
				break;
			case 145 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1529: PARALLEL
				{
				mPARALLEL(); if (state.failed) return;

				}
				break;
			case 146 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1538: OR
				{
				mOR(); if (state.failed) return;

				}
				break;
			case 147 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1541: AND
				{
				mAND(); if (state.failed) return;

				}
				break;
			case 148 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1545: NOT
				{
				mNOT(); if (state.failed) return;

				}
				break;
			case 149 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1549: IMP
				{
				mIMP(); if (state.failed) return;

				}
				break;
			case 150 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1553: EQUALS
				{
				mEQUALS(); if (state.failed) return;

				}
				break;
			case 151 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1560: NOT_EQUALS
				{
				mNOT_EQUALS(); if (state.failed) return;

				}
				break;
			case 152 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1571: SEQARROW
				{
				mSEQARROW(); if (state.failed) return;

				}
				break;
			case 153 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1580: EXP
				{
				mEXP(); if (state.failed) return;

				}
				break;
			case 154 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1584: TILDE
				{
				mTILDE(); if (state.failed) return;

				}
				break;
			case 155 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1590: PERCENT
				{
				mPERCENT(); if (state.failed) return;

				}
				break;
			case 156 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1598: STAR
				{
				mSTAR(); if (state.failed) return;

				}
				break;
			case 157 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1603: MINUS
				{
				mMINUS(); if (state.failed) return;

				}
				break;
			case 158 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1609: PLUS
				{
				mPLUS(); if (state.failed) return;

				}
				break;
			case 159 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1614: GREATER
				{
				mGREATER(); if (state.failed) return;

				}
				break;
			case 160 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1622: GREATEREQUAL
				{
				mGREATEREQUAL(); if (state.failed) return;

				}
				break;
			case 161 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1635: RGUILLEMETS
				{
				mRGUILLEMETS(); if (state.failed) return;

				}
				break;
			case 162 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1647: WS
				{
				mWS(); if (state.failed) return;

				}
				break;
			case 163 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1650: STRING_LITERAL
				{
				mSTRING_LITERAL(); if (state.failed) return;

				}
				break;
			case 164 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1665: LESS_DISPATCH
				{
				mLESS_DISPATCH(); if (state.failed) return;

				}
				break;
			case 165 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1679: PRIMES_OR_CHARLITERAL
				{
				mPRIMES_OR_CHARLITERAL(); if (state.failed) return;

				}
				break;
			case 166 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1701: SL_COMMENT
				{
				mSL_COMMENT(); if (state.failed) return;

				}
				break;
			case 167 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1712: ML_COMMENT
				{
				mML_COMMENT(); if (state.failed) return;

				}
				break;
			case 168 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1723: DIGIT_DISPATCH
				{
				mDIGIT_DISPATCH(); if (state.failed) return;

				}
				break;
			case 169 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1738: IDENT
				{
				mIDENT(); if (state.failed) return;

				}
				break;
			case 170 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:1:1744: MODALITY
				{
				mMODALITY(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred1_KeYLexer
	public final void synpred1_KeYLexer_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:514:6: ( '<' ( LETTER )+ '>' )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:514:7: '<' ( LETTER )+ '>'
		{
		match('<'); if (state.failed) return;
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:514:11: ( LETTER )+
		int cnt27=0;
		loop27:
		while (true) {
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( ((LA27_0 >= 'A' && LA27_0 <= 'Z')||(LA27_0 >= 'a' && LA27_0 <= 'z')) ) {
				alt27=1;
			}

			switch (alt27) {
			case 1 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:
				{
				if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
					input.consume();
					state.failed=false;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return;}
					MismatchedSetException mse = new MismatchedSetException(null,input);
					recover(mse);
					throw mse;
				}
				}
				break;

			default :
				if ( cnt27 >= 1 ) break loop27;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(27, input);
				throw eee;
			}
			cnt27++;
		}

		match('>'); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_KeYLexer

	// $ANTLR start synpred2_KeYLexer
	public final void synpred2_KeYLexer_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:516:6: ( '<' '-' '>' )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:516:7: '<' '-' '>'
		{
		match('<'); if (state.failed) return;
		match('-'); if (state.failed) return;
		match('>'); if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_KeYLexer

	// $ANTLR start synpred3_KeYLexer
	public final void synpred3_KeYLexer_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:518:6: ( '<' '=' )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:518:7: '<' '='
		{
		match('<'); if (state.failed) return;
		match('='); if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_KeYLexer

	// $ANTLR start synpred4_KeYLexer
	public final void synpred4_KeYLexer_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:520:6: ( '<' '<' )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:520:7: '<' '<'
		{
		match('<'); if (state.failed) return;
		match('<'); if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_KeYLexer

	// $ANTLR start synpred5_KeYLexer
	public final void synpred5_KeYLexer_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:552:6: ( '\\'' '\\'' )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:552:7: '\\'' '\\''
		{
		match('\''); if (state.failed) return;
		match('\''); if (state.failed) return;
		}

	}
	// $ANTLR end synpred5_KeYLexer

	// $ANTLR start synpred6_KeYLexer
	public final void synpred6_KeYLexer_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:554:6: ( '\\'' '\\\\' )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:554:7: '\\'' '\\\\'
		{
		match('\''); if (state.failed) return;
		match('\\'); if (state.failed) return;
		}

	}
	// $ANTLR end synpred6_KeYLexer

	// $ANTLR start synpred7_KeYLexer
	public final void synpred7_KeYLexer_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:556:6: ( '\\'' ~ ( '\\'' ) '\\'' )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:556:7: '\\'' ~ ( '\\'' ) '\\''
		{
		match('\''); if (state.failed) return;
		if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
			input.consume();
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			recover(mse);
			throw mse;
		}
		match('\''); if (state.failed) return;
		}

	}
	// $ANTLR end synpred7_KeYLexer

	// $ANTLR start synpred8_KeYLexer
	public final void synpred8_KeYLexer_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:624:5: ( DIGIT ( ' ' | '\\t' | '\\r' | '\\n' )* LPAREN )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:624:6: DIGIT ( ' ' | '\\t' | '\\r' | '\\n' )* LPAREN
		{
		mDIGIT(); if (state.failed) return;

		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:624:12: ( ' ' | '\\t' | '\\r' | '\\n' )*
		loop28:
		while (true) {
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( ((LA28_0 >= '\t' && LA28_0 <= '\n')||LA28_0=='\r'||LA28_0==' ') ) {
				alt28=1;
			}

			switch (alt28) {
			case 1 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:
				{
				if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
					input.consume();
					state.failed=false;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return;}
					MismatchedSetException mse = new MismatchedSetException(null,input);
					recover(mse);
					throw mse;
				}
				}
				break;

			default :
				break loop28;
			}
		}

		mLPAREN(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred8_KeYLexer

	// $ANTLR start synpred9_KeYLexer
	public final void synpred9_KeYLexer_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:625:5: ( '0' 'x' )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/parser/KeYLexer.g:625:6: '0' 'x'
		{
		match('0'); if (state.failed) return;
		match('x'); if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_KeYLexer

	public final boolean synpred7_KeYLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_KeYLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_KeYLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_KeYLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_KeYLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_KeYLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_KeYLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_KeYLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_KeYLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_KeYLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_KeYLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_KeYLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_KeYLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_KeYLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_KeYLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_KeYLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_KeYLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_KeYLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA26 dfa26 = new DFA26(this);
	static final String DFA26_eotS =
		"\1\uffff\1\105\2\uffff\3\57\10\uffff\1\114\1\117\1\121\5\uffff\1\123\2"+
		"\uffff\1\33\2\uffff\1\41\1\125\1\uffff\1\127\7\uffff\1\131\7\uffff\25"+
		"\106\2\uffff\3\57\20\uffff\53\106\1\u00d8\15\106\3\57\4\106\1\u00f1\5"+
		"\106\1\u00f7\16\106\1\u010c\50\106\1\uffff\1\u013d\1\u013f\16\106\1\u014e"+
		"\2\57\5\106\1\uffff\1\106\1\u0158\3\106\1\uffff\13\106\1\u0167\10\106"+
		"\1\uffff\13\106\1\u017b\1\106\1\u017e\1\106\1\u0180\36\106\1\u01a0\1\106"+
		"\1\uffff\1\106\1\uffff\16\106\1\uffff\1\u01b2\1\u01b3\1\u01b4\3\106\1"+
		"\u01b8\2\106\1\uffff\4\106\1\u01bf\3\106\1\u01c5\5\106\1\uffff\1\106\1"+
		"\u01cc\7\106\1\u01d4\10\106\1\u01dd\1\uffff\2\106\1\uffff\1\106\1\uffff"+
		"\37\106\1\uffff\16\106\1\u020e\1\u020f\1\106\3\uffff\3\106\1\uffff\2\106"+
		"\1\u0218\1\u0219\2\106\1\uffff\5\106\1\uffff\2\106\1\3\3\106\1\uffff\7"+
		"\106\1\uffff\1\u022d\4\106\1\2\2\106\1\uffff\2\106\1\u0236\2\106\1\u0239"+
		"\1\u023a\32\106\1\u0255\12\106\1\u0260\3\106\2\uffff\1\u0264\7\106\2\uffff"+
		"\1\106\1\u026d\1\u026f\1\u0270\1\u0271\3\106\1\u0275\11\106\1\u027f\1"+
		"\uffff\3\106\1\u0283\4\106\1\uffff\1\u0288\1\106\2\uffff\1\106\1\u028b"+
		"\5\106\1\u0291\4\106\1\u0297\12\106\1\u02a3\2\106\1\uffff\12\106\1\uffff"+
		"\3\106\1\uffff\7\106\1\u02bb\1\uffff\1\106\3\uffff\3\106\1\uffff\1\106"+
		"\1\u02c1\2\106\1\u02c4\2\106\1\u02c7\1\106\1\uffff\1\106\1\u02ca\1\106"+
		"\1\uffff\4\106\1\uffff\1\106\1\u02d2\1\uffff\5\106\1\uffff\1\106\1\u02d9"+
		"\1\106\1\u02db\1\106\1\uffff\13\106\1\uffff\2\106\1\u02ea\15\106\1\u02f9"+
		"\6\106\1\uffff\5\106\1\uffff\2\106\1\uffff\2\106\1\uffff\2\106\1\uffff"+
		"\2\106\1\u030d\1\u030e\1\u030f\1\106\1\u0311\1\uffff\3\106\1\u0316\2\106"+
		"\1\uffff\1\106\1\uffff\16\106\1\uffff\1\u0328\4\106\1\u032d\1\u032e\1"+
		"\u032f\6\106\1\uffff\1\u0336\10\106\1\u033f\11\106\3\uffff\1\106\1\uffff"+
		"\4\106\1\uffff\2\106\1\u0351\2\106\1\u0354\1\u0355\2\106\1\u0358\6\106"+
		"\1\u035f\1\uffff\4\106\3\uffff\2\106\1\u0366\3\106\1\uffff\7\106\1\u0371"+
		"\1\uffff\1\106\1\u0373\1\u0374\2\106\1\u0377\2\106\1\u037a\1\106\1\u037c"+
		"\1\106\1\u037e\4\106\1\uffff\2\106\2\uffff\1\u0385\1\106\1\uffff\1\106"+
		"\1\u0389\2\106\1\u038c\1\106\1\uffff\6\106\1\uffff\1\u0394\1\u0395\10"+
		"\106\1\uffff\1\u039e\2\uffff\2\106\1\uffff\1\106\1\u03a2\1\uffff\1\u03a3"+
		"\1\uffff\1\106\1\uffff\6\106\1\uffff\3\106\1\uffff\2\106\1\uffff\7\106"+
		"\2\uffff\1\106\1\u03b8\6\106\1\uffff\2\106\1\u03c1\2\uffff\5\106\1\u03c7"+
		"\4\106\1\u03cc\5\106\1\u03d2\1\106\1\u03d4\1\106\1\uffff\10\106\1\uffff"+
		"\3\106\1\u03e2\1\u03e3\1\uffff\4\106\1\uffff\1\106\1\u03e9\1\106\1\u03eb"+
		"\1\106\1\uffff\1\u03ed\1\uffff\1\u03ee\2\106\1\u03f1\2\106\1\u03f4\3\106"+
		"\1\u03f8\2\106\2\uffff\1\106\1\u03fc\1\u03fd\2\106\1\uffff\1\106\1\uffff"+
		"\1\106\2\uffff\2\106\1\uffff\1\106\1\u0405\1\uffff\3\106\1\uffff\3\106"+
		"\2\uffff\1\u040c\1\106\1\u040e\2\106\1\u0411\1\106\1\uffff\6\106\1\uffff"+
		"\1\106\1\uffff\2\106\1\uffff\1\106\1\u041d\1\u041e\1\u041f\3\106\1\u0423"+
		"\1\u0424\2\106\3\uffff\3\106\2\uffff\3\106\1\u042d\2\106\1\u0430\1\106"+
		"\1\uffff\1\u0432\1\106\1\uffff\1\106\1\uffff\2\106\1\u0437\1\106\1\uffff"+
		"\1\106\1\u043a\1\uffff";
	static final String DFA26_eofS =
		"\u043b\uffff";
	static final String DFA26_minS =
		"\1\11\1\74\2\uffff\1\162\1\141\1\154\10\uffff\1\52\1\72\1\56\5\uffff\1"+
		"\135\2\uffff\1\174\2\uffff\1\75\1\76\1\uffff\1\75\7\uffff\1\75\7\uffff"+
		"\1\141\1\145\1\162\1\154\1\156\1\142\1\145\1\151\1\145\1\156\1\141\1\145"+
		"\1\141\1\146\1\145\1\150\1\151\1\141\1\151\2\145\2\uffff\1\165\1\154\1"+
		"\155\20\uffff\1\162\1\150\1\157\1\155\1\142\1\155\1\141\1\161\1\156\1"+
		"\145\1\151\1\165\1\145\1\165\1\145\1\164\1\163\1\160\1\164\1\144\1\163"+
		"\1\157\1\151\1\144\1\164\1\162\2\145\1\156\1\162\1\160\1\145\1\141\1\144"+
		"\1\151\1\162\1\160\1\146\1\157\1\163\1\154\1\101\1\123\1\101\1\167\1\104"+
		"\1\156\1\141\2\157\1\147\1\166\1\164\1\160\1\154\1\155\1\143\1\145\1\163"+
		"\2\164\1\145\1\154\1\160\1\101\1\143\1\145\1\164\1\151\1\164\1\101\1\145"+
		"\1\142\1\144\1\145\1\163\2\155\1\145\1\141\1\157\1\151\1\164\1\154\1\145"+
		"\1\101\1\165\1\151\1\157\3\141\1\145\1\154\1\141\1\143\1\155\1\145\1\156"+
		"\1\147\1\156\1\141\1\161\1\143\1\145\1\152\1\146\1\160\1\114\1\162\1\160"+
		"\1\142\1\157\2\156\1\157\1\142\1\150\1\145\2\164\1\154\1\145\1\141\1\171"+
		"\1\170\1\uffff\2\101\1\145\1\151\1\164\2\163\1\157\1\164\1\151\1\141\1"+
		"\150\1\154\1\145\1\155\1\163\1\43\1\145\1\144\1\163\1\155\1\145\1\154"+
		"\1\164\1\uffff\1\145\1\101\1\151\1\143\1\151\1\uffff\1\162\1\171\1\162"+
		"\1\151\1\154\1\146\1\151\1\156\1\164\1\103\1\123\1\101\1\154\1\146\1\157"+
		"\1\162\1\171\1\143\1\165\1\162\1\uffff\1\155\1\144\1\155\1\154\1\146\1"+
		"\104\1\165\1\154\1\114\1\144\1\154\1\101\1\164\1\101\1\157\1\101\1\147"+
		"\1\163\1\164\1\165\1\141\1\157\1\156\1\157\1\154\1\145\1\105\1\157\1\141"+
		"\1\151\1\164\1\162\1\163\1\156\1\165\1\144\1\143\1\163\1\151\1\146\2\141"+
		"\1\165\1\161\1\162\1\160\1\101\1\141\1\uffff\1\162\1\uffff\1\146\1\156"+
		"\1\141\1\163\1\145\1\163\1\143\1\156\1\123\1\117\1\141\1\163\1\141\1\145"+
		"\1\uffff\2\43\1\101\1\141\1\155\1\151\1\101\1\144\1\160\1\uffff\1\143"+
		"\1\164\1\156\1\151\1\101\1\141\1\154\1\145\1\101\1\143\1\144\1\163\2\157"+
		"\1\uffff\1\125\1\101\1\156\1\141\1\125\1\145\1\154\1\157\1\145\1\101\1"+
		"\163\1\117\2\151\2\154\1\141\1\124\1\101\1\uffff\1\151\1\141\1\uffff\1"+
		"\146\1\uffff\1\145\1\146\2\145\1\142\1\156\1\144\1\151\1\141\1\162\1\146"+
		"\1\162\2\142\1\163\1\145\1\141\1\164\1\163\1\155\1\165\1\141\1\145\1\163"+
		"\1\145\1\164\1\156\1\144\1\165\1\151\1\145\1\uffff\1\142\1\145\1\141\1"+
		"\164\1\151\1\141\1\160\1\147\1\145\1\154\1\164\1\157\1\160\1\143\2\101"+
		"\1\164\3\uffff\1\126\1\106\1\146\1\uffff\1\145\1\144\2\101\1\147\1\143"+
		"\1\uffff\1\155\1\145\1\155\1\142\1\143\1\uffff\1\141\1\163\1\101\1\156"+
		"\1\162\1\156\1\uffff\1\163\1\143\1\160\1\144\1\145\1\147\1\163\1\uffff"+
		"\1\101\1\160\1\145\1\163\1\141\1\101\1\142\1\171\1\uffff\1\157\1\142\1"+
		"\101\1\162\1\157\2\101\1\154\1\144\1\151\1\156\1\171\1\145\1\146\1\164"+
		"\1\106\1\145\1\164\1\170\1\171\1\162\1\164\1\124\1\143\1\154\1\162\1\122"+
		"\1\162\1\151\1\164\2\145\1\141\1\101\2\145\1\165\1\145\1\156\1\143\1\141"+
		"\1\157\1\103\1\141\1\101\1\165\1\164\1\145\2\uffff\1\101\1\141\1\145\1"+
		"\157\1\171\1\156\1\141\1\145\2\uffff\1\163\4\101\1\154\1\162\1\164\1\101"+
		"\1\163\1\164\1\151\1\104\1\164\1\144\1\145\1\163\1\166\1\101\1\uffff\1"+
		"\145\1\163\1\152\1\101\1\145\1\160\1\156\1\145\1\uffff\1\101\1\162\2\uffff"+
		"\1\145\1\101\1\156\1\164\2\156\1\145\1\101\1\157\1\154\1\151\1\164\1\101"+
		"\2\141\1\171\1\164\1\126\1\166\2\145\1\143\1\151\1\101\2\156\1\uffff\1"+
		"\154\1\111\1\154\1\162\1\145\2\164\1\141\1\157\1\163\1\uffff\1\162\1\151"+
		"\1\167\1\uffff\3\162\1\111\3\164\1\101\1\uffff\1\141\3\uffff\2\151\1\145"+
		"\1\uffff\1\164\1\101\1\161\1\145\1\101\1\141\1\156\1\101\1\141\1\uffff"+
		"\1\162\1\101\1\157\1\uffff\1\154\1\145\1\163\1\154\1\uffff\1\155\1\101"+
		"\1\uffff\1\147\1\115\1\141\1\164\1\143\1\uffff\1\162\1\101\1\143\1\101"+
		"\1\145\1\uffff\1\143\1\156\1\160\1\126\1\141\1\145\1\146\1\156\1\106\1"+
		"\141\1\104\1\uffff\2\164\1\101\1\156\1\164\1\141\1\101\1\162\1\163\1\150"+
		"\1\154\1\156\1\163\1\143\1\157\1\151\1\101\2\155\1\146\1\120\1\145\1\150"+
		"\1\uffff\1\162\1\147\1\160\1\163\1\141\1\uffff\1\165\1\143\1\uffff\2\164"+
		"\1\uffff\1\162\1\141\1\uffff\1\151\1\111\3\101\1\145\1\101\1\uffff\1\117"+
		"\1\157\1\155\1\101\1\164\1\155\1\uffff\1\163\1\uffff\1\156\2\164\1\145"+
		"\1\141\2\162\1\145\1\143\1\151\1\164\1\124\1\123\1\163\1\uffff\1\101\1"+
		"\103\1\143\1\163\1\124\3\101\1\164\1\160\1\145\1\156\1\164\1\141\1\uffff"+
		"\1\101\1\165\1\124\1\157\1\114\1\157\1\151\1\141\1\164\1\101\1\156\1\145"+
		"\1\154\1\145\1\120\1\163\1\164\2\156\3\uffff\1\162\1\uffff\1\156\1\144"+
		"\1\145\1\151\1\uffff\1\154\1\165\1\101\1\147\1\117\2\101\1\162\1\151\1"+
		"\101\1\162\3\145\1\163\1\164\1\101\1\uffff\1\154\1\164\1\163\1\171\3\uffff"+
		"\1\162\1\141\1\101\1\163\1\150\1\142\1\uffff\1\154\1\150\1\154\1\145\1"+
		"\144\1\141\1\164\1\101\1\uffff\1\164\2\101\1\117\1\157\1\101\1\157\1\164"+
		"\1\101\1\163\1\101\1\165\1\101\2\145\1\154\1\145\1\uffff\1\164\1\162\2"+
		"\uffff\1\101\1\141\1\uffff\1\145\1\101\1\154\1\107\1\101\1\141\1\uffff"+
		"\1\141\2\151\1\160\1\141\1\164\1\uffff\2\101\1\154\1\141\1\145\1\141\1"+
		"\166\1\122\1\142\1\151\1\uffff\1\101\2\uffff\1\156\1\154\1\uffff\1\162"+
		"\1\101\1\uffff\1\101\1\uffff\1\154\1\uffff\1\154\1\163\1\141\1\143\1\150"+
		"\1\111\1\uffff\1\142\1\156\1\162\1\uffff\1\144\1\145\1\uffff\1\164\1\163"+
		"\1\166\1\147\1\145\1\143\1\150\2\uffff\1\145\1\101\1\156\1\162\2\145\1"+
		"\154\1\157\1\uffff\1\122\1\141\1\101\2\uffff\1\157\1\144\2\163\1\154\1"+
		"\101\1\156\1\154\1\143\1\162\1\101\1\156\1\145\1\163\1\145\1\156\1\101"+
		"\1\164\1\101\1\163\1\uffff\1\105\1\151\1\154\1\146\1\145\1\156\1\151\1"+
		"\162\1\uffff\1\116\1\163\1\105\2\101\1\uffff\1\164\2\145\1\141\1\uffff"+
		"\1\145\1\101\1\145\1\101\1\155\1\uffff\1\101\1\uffff\1\101\1\154\1\164"+
		"\1\101\1\145\1\163\1\101\1\147\1\151\1\165\1\101\1\154\1\164\2\uffff\1"+
		"\145\2\101\1\171\1\162\1\uffff\1\163\1\uffff\1\145\2\uffff\1\163\1\171"+
		"\1\uffff\1\162\1\101\1\uffff\1\151\1\164\1\154\1\uffff\1\145\1\157\1\162"+
		"\2\uffff\1\101\1\151\1\101\1\156\1\145\1\101\1\145\1\uffff\1\144\1\171"+
		"\1\154\1\155\1\162\1\146\1\uffff\1\143\1\uffff\1\164\1\125\1\uffff\1\156"+
		"\3\101\2\145\1\141\2\101\1\160\1\143\3\uffff\1\156\1\163\1\143\2\uffff"+
		"\1\144\1\145\1\164\1\101\1\145\1\141\1\101\1\141\1\uffff\1\101\1\164\1"+
		"\uffff\1\162\1\uffff\1\145\1\151\1\101\1\145\1\uffff\1\163\1\101\1\uffff";
	static final String DFA26_maxS =
		"\1\u2286\1\172\2\uffff\1\162\1\141\1\154\10\uffff\1\57\1\75\1\56\5\uffff"+
		"\1\135\2\uffff\1\174\2\uffff\1\75\1\76\1\uffff\1\75\7\uffff\1\76\7\uffff"+
		"\1\165\1\145\1\162\1\170\1\160\1\170\1\157\1\165\1\171\1\160\1\141\1\162"+
		"\1\145\1\163\3\157\1\141\1\151\1\165\1\157\2\uffff\1\165\1\154\1\155\20"+
		"\uffff\1\162\1\150\1\157\1\155\1\143\1\155\1\162\1\164\1\156\1\157\1\164"+
		"\1\165\1\163\1\165\1\145\1\164\1\163\1\160\1\164\1\144\1\163\1\157\1\151"+
		"\1\144\1\164\1\162\1\145\2\156\1\162\1\160\1\145\1\151\1\144\1\151\1\162"+
		"\1\160\1\163\1\157\1\163\1\165\1\124\1\166\1\172\1\167\1\164\1\156\3\157"+
		"\1\147\1\166\1\164\1\160\1\154\1\155\1\143\1\145\1\163\2\164\1\145\1\154"+
		"\1\160\1\172\1\143\1\145\1\164\1\151\1\164\1\172\1\145\1\170\1\144\1\145"+
		"\1\163\2\155\1\145\1\141\1\157\1\151\1\164\1\154\1\145\1\172\1\165\1\151"+
		"\1\157\1\151\1\141\1\155\1\145\1\154\1\144\1\143\1\155\1\145\1\156\1\147"+
		"\1\156\1\141\1\161\1\151\1\145\1\160\1\146\1\160\1\123\1\162\1\160\1\162"+
		"\1\157\2\156\1\157\1\142\1\150\1\145\2\164\1\154\1\145\1\141\1\171\1\170"+
		"\1\uffff\2\172\1\145\1\151\1\164\2\163\1\157\1\164\1\151\1\141\1\150\1"+
		"\154\1\145\1\155\1\163\1\172\1\145\1\144\1\163\1\155\1\145\1\154\1\164"+
		"\1\uffff\1\145\1\172\1\151\1\143\1\151\1\uffff\1\162\1\171\1\162\1\151"+
		"\1\154\1\146\1\151\1\156\1\164\1\103\1\123\1\172\1\154\1\146\1\157\1\162"+
		"\1\171\1\143\1\165\1\162\1\uffff\1\155\1\144\1\155\1\154\1\146\1\104\1"+
		"\165\1\154\1\114\1\144\1\154\1\172\1\164\1\172\1\157\1\172\1\147\1\163"+
		"\1\164\1\165\1\141\1\157\1\156\1\157\1\154\1\145\1\105\1\165\1\141\1\151"+
		"\1\164\1\162\1\163\1\156\1\165\1\144\1\143\1\163\1\151\1\146\2\141\1\165"+
		"\1\161\1\162\1\160\1\172\1\141\1\uffff\1\162\1\uffff\1\146\1\156\1\162"+
		"\1\163\1\145\1\163\1\143\1\156\1\123\1\117\1\141\1\163\1\141\1\145\1\uffff"+
		"\3\172\1\141\1\155\1\151\1\172\1\144\1\160\1\uffff\1\143\1\164\1\156\1"+
		"\151\1\172\1\141\1\154\1\145\1\172\1\143\1\144\1\163\2\157\1\uffff\1\125"+
		"\1\172\1\156\1\141\1\125\1\145\1\154\1\157\1\145\1\172\1\163\1\117\2\151"+
		"\2\154\1\141\1\124\1\172\1\uffff\1\151\1\141\1\uffff\1\146\1\uffff\1\145"+
		"\1\146\2\145\1\142\1\156\1\144\1\151\1\141\1\162\1\146\1\162\2\142\1\163"+
		"\1\145\1\141\1\164\1\163\1\155\1\165\1\141\1\145\1\163\1\145\1\164\1\156"+
		"\1\144\1\165\1\151\1\145\1\uffff\1\142\1\145\1\141\1\164\1\151\1\141\1"+
		"\160\1\147\1\145\1\154\1\164\1\157\1\160\1\143\2\172\1\164\3\uffff\1\126"+
		"\1\124\1\146\1\uffff\1\145\1\144\2\172\1\147\1\143\1\uffff\1\155\1\145"+
		"\1\155\1\142\1\143\1\uffff\1\141\1\163\1\172\1\156\1\162\1\156\1\uffff"+
		"\1\163\1\143\1\160\1\144\1\145\1\147\1\163\1\uffff\1\172\1\160\1\145\1"+
		"\163\1\141\1\172\1\142\1\171\1\uffff\1\157\1\142\1\172\1\162\1\157\2\172"+
		"\1\154\1\144\1\151\1\156\1\171\1\145\1\146\1\164\1\106\1\145\1\164\1\170"+
		"\1\171\1\162\1\164\1\124\1\143\1\154\1\162\1\122\1\162\1\151\1\164\2\145"+
		"\1\141\1\172\2\145\1\165\1\145\1\156\1\143\1\141\1\157\1\103\1\141\1\172"+
		"\1\165\1\164\1\145\2\uffff\1\172\1\141\1\145\1\157\1\171\1\156\1\141\1"+
		"\145\2\uffff\1\163\4\172\1\154\1\162\1\164\1\172\1\163\1\164\1\151\1\104"+
		"\1\164\1\144\1\145\1\163\1\166\1\172\1\uffff\1\145\1\163\1\152\1\172\1"+
		"\145\1\160\1\156\1\145\1\uffff\1\172\1\162\2\uffff\1\145\1\172\1\156\1"+
		"\164\2\156\1\145\1\172\1\157\1\154\1\151\1\164\1\172\2\141\1\171\1\164"+
		"\1\126\1\166\2\145\1\143\1\151\1\172\2\156\1\uffff\1\154\1\111\1\154\1"+
		"\162\1\163\2\164\1\141\1\157\1\163\1\uffff\1\162\1\151\1\167\1\uffff\3"+
		"\162\1\111\3\164\1\172\1\uffff\1\141\3\uffff\2\151\1\145\1\uffff\1\164"+
		"\1\172\1\161\1\145\1\172\1\141\1\156\1\172\1\141\1\uffff\1\162\1\172\1"+
		"\157\1\uffff\1\154\1\145\1\163\1\154\1\uffff\1\155\1\172\1\uffff\1\147"+
		"\1\115\1\141\1\164\1\143\1\uffff\1\162\1\172\1\143\1\172\1\145\1\uffff"+
		"\1\143\1\156\1\160\1\126\1\141\1\145\1\146\1\156\1\106\1\141\1\104\1\uffff"+
		"\2\164\1\172\1\156\1\164\1\141\1\101\1\162\1\163\1\150\1\154\1\156\1\163"+
		"\1\143\1\157\1\151\1\172\2\155\1\146\1\120\1\145\1\150\1\uffff\1\162\1"+
		"\147\1\160\1\163\1\141\1\uffff\1\165\1\143\1\uffff\2\164\1\uffff\1\162"+
		"\1\141\1\uffff\1\151\1\111\3\172\1\145\1\172\1\uffff\1\117\1\157\1\155"+
		"\1\172\1\164\1\155\1\uffff\1\163\1\uffff\1\156\2\164\1\145\1\141\2\162"+
		"\1\145\1\143\1\151\1\164\1\124\1\123\1\163\1\uffff\1\172\1\103\1\143\1"+
		"\163\1\124\3\172\1\164\1\160\1\145\1\156\1\164\1\141\1\uffff\1\172\1\165"+
		"\1\124\1\157\1\114\1\157\1\151\1\141\1\164\1\172\1\156\1\145\1\154\1\145"+
		"\1\120\1\163\1\164\2\156\3\uffff\1\162\1\uffff\1\156\1\144\1\145\1\151"+
		"\1\uffff\1\154\1\165\1\172\1\147\1\117\2\172\1\162\1\151\1\172\1\162\3"+
		"\145\1\163\1\164\1\172\1\uffff\1\154\1\164\1\163\1\171\3\uffff\1\162\1"+
		"\141\1\172\1\163\1\150\1\142\1\uffff\1\154\1\150\1\154\1\145\1\144\1\141"+
		"\1\164\1\172\1\uffff\1\164\2\172\1\117\1\157\1\172\1\157\1\164\1\172\1"+
		"\163\1\172\1\165\1\172\2\145\1\154\1\145\1\uffff\1\164\1\162\2\uffff\1"+
		"\172\1\141\1\uffff\1\145\1\172\1\154\1\107\1\172\1\141\1\uffff\1\141\2"+
		"\151\1\160\1\141\1\164\1\uffff\2\172\1\154\1\141\1\145\1\141\1\166\1\122"+
		"\1\142\1\151\1\uffff\1\172\2\uffff\1\156\1\154\1\uffff\1\162\1\172\1\uffff"+
		"\1\172\1\uffff\1\154\1\uffff\1\154\1\163\1\141\1\143\1\150\1\111\1\uffff"+
		"\1\142\1\156\1\162\1\uffff\1\144\1\145\1\uffff\1\164\1\163\1\166\1\147"+
		"\1\145\1\143\1\150\2\uffff\1\145\1\172\1\156\1\162\2\145\1\154\1\157\1"+
		"\uffff\1\122\1\141\1\172\2\uffff\1\157\1\144\2\163\1\154\1\172\1\156\1"+
		"\154\1\143\1\162\1\172\1\156\1\145\1\163\1\145\1\156\1\172\1\164\1\172"+
		"\1\163\1\uffff\1\105\1\151\1\154\1\146\1\145\1\156\1\151\1\162\1\uffff"+
		"\1\116\1\163\1\123\2\172\1\uffff\1\164\2\145\1\141\1\uffff\1\145\1\172"+
		"\1\145\1\172\1\155\1\uffff\1\172\1\uffff\1\172\1\154\1\164\1\172\1\145"+
		"\1\163\1\172\1\147\1\151\1\165\1\172\1\154\1\164\2\uffff\1\145\2\172\1"+
		"\171\1\162\1\uffff\1\163\1\uffff\1\145\2\uffff\1\163\1\171\1\uffff\1\162"+
		"\1\172\1\uffff\1\151\1\164\1\154\1\uffff\1\145\1\157\1\162\2\uffff\1\172"+
		"\1\151\1\172\1\156\1\145\1\172\1\145\1\uffff\1\144\1\171\1\154\1\155\1"+
		"\162\1\146\1\uffff\1\143\1\uffff\1\164\1\125\1\uffff\1\156\3\172\2\145"+
		"\1\141\2\172\1\160\1\143\3\uffff\1\156\1\163\1\143\2\uffff\1\144\1\145"+
		"\1\164\1\172\1\145\1\141\1\172\1\141\1\uffff\1\172\1\164\1\uffff\1\162"+
		"\1\uffff\1\145\1\151\1\172\1\145\1\uffff\1\163\1\172\1\uffff";
	static final String DFA26_acceptS =
		"\2\uffff\1\77\1\100\3\uffff\1\171\1\172\1\173\1\174\1\175\1\176\1\177"+
		"\1\u0080\3\uffff\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\uffff\1\u008e"+
		"\1\u0090\1\uffff\1\u0092\1\u0093\2\uffff\1\u0095\1\uffff\1\u0094\1\u0097"+
		"\1\u0099\1\u009a\1\u009b\1\u009c\1\u009e\1\uffff\1\u00a0\1\u00a2\1\u00a3"+
		"\1\u00a4\1\u00a5\1\u00a8\1\u00a9\25\uffff\1\u0082\1\u00aa\3\uffff\1\u00a6"+
		"\1\u00a7\1\u0081\1\u0084\1\u0085\1\u0083\1\u0087\1\u0086\1\u008f\1\u008d"+
		"\1\u0091\1\u009d\1\u0098\1\u0096\1\u00a1\1\u009f\176\uffff\1\102\30\uffff"+
		"\1\62\5\uffff\1\167\24\uffff\1\140\60\uffff\1\64\1\uffff\1\67\16\uffff"+
		"\1\120\11\uffff\1\71\16\uffff\1\105\23\uffff\1\137\2\uffff\1\14\1\uffff"+
		"\1\104\37\uffff\1\103\21\uffff\1\121\1\165\1\1\3\uffff\1\101\6\uffff\1"+
		"\3\5\uffff\1\155\6\uffff\1\5\7\uffff\1\143\10\uffff\1\40\60\uffff\1\150"+
		"\1\161\10\uffff\1\72\1\74\23\uffff\1\151\10\uffff\1\75\2\uffff\1\15\1"+
		"\147\32\uffff\1\162\12\uffff\1\170\3\uffff\1\166\10\uffff\1\2\1\uffff"+
		"\1\12\1\117\1\152\3\uffff\1\4\11\uffff\1\141\3\uffff\1\13\4\uffff\1\142"+
		"\2\uffff\1\25\5\uffff\1\36\5\uffff\1\44\13\uffff\1\106\27\uffff\1\116"+
		"\5\uffff\1\41\2\uffff\1\6\2\uffff\1\134\2\uffff\1\23\7\uffff\1\17\6\uffff"+
		"\1\42\1\uffff\1\132\16\uffff\1\65\16\uffff\1\10\23\uffff\1\37\1\145\1"+
		"\22\1\uffff\1\16\4\uffff\1\53\21\uffff\1\70\4\uffff\1\157\1\110\1\126"+
		"\6\uffff\1\20\10\uffff\1\144\21\uffff\1\136\2\uffff\1\46\1\47\2\uffff"+
		"\1\52\6\uffff\1\160\6\uffff\1\113\12\uffff\1\156\1\uffff\1\63\1\115\2"+
		"\uffff\1\135\2\uffff\1\35\1\uffff\1\27\1\uffff\1\131\6\uffff\1\50\3\uffff"+
		"\1\57\2\uffff\1\107\7\uffff\1\114\1\133\10\uffff\1\34\3\uffff\1\54\1\146"+
		"\24\uffff\1\21\10\uffff\1\11\5\uffff\1\45\4\uffff\1\61\5\uffff\1\164\1"+
		"\uffff\1\111\15\uffff\1\43\1\127\5\uffff\1\123\1\uffff\1\130\1\uffff\1"+
		"\153\1\7\2\uffff\1\122\2\uffff\1\154\3\uffff\1\56\3\uffff\1\51\1\55\7"+
		"\uffff\1\24\6\uffff\1\60\1\uffff\1\112\2\uffff\1\125\13\uffff\1\26\1\124"+
		"\1\30\3\uffff\1\76\1\66\10\uffff\1\32\2\uffff\1\73\1\uffff\1\163\4\uffff"+
		"\1\33\2\uffff\1\31";
	static final String DFA26_specialS =
		"\u043b\uffff}>";
	static final String[] DFA26_transitionS = {
			"\2\52\2\uffff\1\52\22\uffff\1\52\1\35\1\53\1\57\1\6\1\45\1\34\1\55\1"+
			"\23\1\24\1\46\1\47\1\22\1\36\1\21\1\17\12\56\1\20\1\16\1\54\1\40\1\50"+
			"\1\uffff\1\31\32\57\1\27\1\1\1\30\1\43\1\57\1\uffff\5\57\1\5\15\57\1"+
			"\4\6\57\1\25\1\32\1\26\1\44\55\uffff\1\41\u20e5\uffff\1\37\1\uffff\1"+
			"\54\153\uffff\1\2\2\uffff\1\3\1\uffff\1\11\4\uffff\1\10\13\uffff\1\15"+
			"\20\uffff\1\34\1\33\1\13\1\12\65\uffff\1\42\3\uffff\1\54\1\51\24\uffff"+
			"\1\7\13\uffff\1\14",
			"\1\106\4\uffff\33\106\3\uffff\1\106\1\uffff\1\65\1\100\1\77\1\73\1\63"+
			"\1\67\1\61\1\74\1\75\1\101\1\106\1\104\1\66\1\76\1\64\1\62\1\106\1\103"+
			"\1\60\1\70\1\71\1\72\1\102\3\106",
			"",
			"",
			"\1\107",
			"\1\110",
			"\1\111",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\113\4\uffff\1\112",
			"\1\115\2\uffff\1\116",
			"\1\120",
			"",
			"",
			"",
			"",
			"",
			"\1\122",
			"",
			"",
			"\1\124",
			"",
			"",
			"\1\42",
			"\1\37",
			"",
			"\1\126",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\51\1\130",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\137\1\uffff\1\133\1\uffff\1\141\3\uffff\1\135\1\uffff\1\134\3\uffff"+
			"\1\132\4\uffff\1\140\1\136",
			"\1\142",
			"\1\143",
			"\1\146\1\uffff\1\145\2\uffff\1\147\6\uffff\1\144",
			"\1\150\1\uffff\1\151",
			"\1\152\1\uffff\1\155\11\uffff\1\154\1\uffff\1\153\2\uffff\1\156\2\uffff"+
			"\1\157\1\uffff\1\160",
			"\1\162\11\uffff\1\161",
			"\1\165\5\uffff\1\163\2\uffff\1\164\2\uffff\1\166",
			"\1\167\2\uffff\1\171\11\uffff\1\172\6\uffff\1\170",
			"\1\174\1\uffff\1\173",
			"\1\175",
			"\1\176\3\uffff\1\177\10\uffff\1\u0080",
			"\1\u0081\3\uffff\1\u0082",
			"\1\u0085\7\uffff\1\u0084\4\uffff\1\u0083",
			"\1\u0086\11\uffff\1\u0087",
			"\1\u008a\3\uffff\1\u0089\2\uffff\1\u0088",
			"\1\u008c\5\uffff\1\u008b",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f\17\uffff\1\u0090",
			"\1\u0091\11\uffff\1\u0092",
			"",
			"",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a\1\u009b",
			"\1\u009c",
			"\1\u009d\20\uffff\1\u009e",
			"\1\u00a0\2\uffff\1\u009f",
			"\1\u00a1",
			"\1\u00a3\11\uffff\1\u00a2",
			"\1\u00a5\12\uffff\1\u00a4",
			"\1\u00a6",
			"\1\u00a7\15\uffff\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7\10\uffff\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00be\7\uffff\1\u00bd",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c4\14\uffff\1\u00c3",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c8\10\uffff\1\u00c7",
			"\1\u00c9\1\uffff\1\u00ca\1\uffff\1\u00cb\3\uffff\1\u00cc\2\uffff\1\u00cd"+
			"\2\uffff\1\u00ce\2\uffff\1\u00d0\1\u00d1\1\u00cf",
			"\1\u00d4\1\u00d6\16\uffff\1\u00d3\17\uffff\1\u00d2\2\uffff\1\u00d5",
			"\4\106\1\u00d7\25\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u00d9",
			"\1\u00db\51\uffff\1\u00dc\5\uffff\1\u00da",
			"\1\u00dd",
			"\1\u00de\15\uffff\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\32\106\4\uffff\1\106\1\uffff\22\106\1\u00f0\7\106",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u00f8",
			"\1\u00fc\3\uffff\1\u00fb\1\u00fa\7\uffff\1\u00fd\10\uffff\1\u00f9",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\32\106\4\uffff\1\106\1\uffff\17\106\1\u010b\1\106\1\u010a\10\106",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110\7\uffff\1\u0111",
			"\1\u0112",
			"\1\u0114\13\uffff\1\u0113",
			"\1\u0115",
			"\1\u0116",
			"\1\u0117\2\uffff\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"\1\u0122\5\uffff\1\u0121",
			"\1\u0123",
			"\1\u0124\5\uffff\1\u0125",
			"\1\u0126",
			"\1\u0127",
			"\1\u0129\6\uffff\1\u0128",
			"\1\u012a",
			"\1\u012b",
			"\1\u012d\17\uffff\1\u012c",
			"\1\u012e",
			"\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"",
			"\13\106\1\u013c\16\106\4\uffff\1\106\1\uffff\32\106",
			"\5\106\1\u013e\24\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\2\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"",
			"\1\u0156",
			"\24\106\1\u0157\5\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\1\u0162",
			"\1\u0163",
			"\1\u0164",
			"\1\u0165",
			"\1\u0166",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"",
			"\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u017c",
			"\32\106\4\uffff\1\106\1\uffff\13\106\1\u017d\16\106",
			"\1\u017f",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"\1\u0187",
			"\1\u0188",
			"\1\u0189",
			"\1\u018a",
			"\1\u018b",
			"\1\u018c\5\uffff\1\u018d",
			"\1\u018e",
			"\1\u018f",
			"\1\u0190",
			"\1\u0191",
			"\1\u0192",
			"\1\u0193",
			"\1\u0194",
			"\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a",
			"\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e",
			"\1\u019f",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u01a1",
			"",
			"\1\u01a2",
			"",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5\20\uffff\1\u01a6",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\1\u01ad",
			"\1\u01ae",
			"\1\u01af",
			"\1\u01b0",
			"\1\u01b1",
			"",
			"\2\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\2\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u01b5",
			"\1\u01b6",
			"\1\u01b7",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u01b9",
			"\1\u01ba",
			"",
			"\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u01c0",
			"\1\u01c1",
			"\1\u01c2",
			"\16\106\1\u01c3\3\106\1\u01c4\7\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u01c6",
			"\1\u01c7",
			"\1\u01c8",
			"\1\u01c9",
			"\1\u01ca",
			"",
			"\1\u01cb",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2",
			"\1\u01d3",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u01d5",
			"\1\u01d6",
			"\1\u01d7",
			"\1\u01d8",
			"\1\u01d9",
			"\1\u01da",
			"\1\u01db",
			"\1\u01dc",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\1\u01de",
			"\1\u01df",
			"",
			"\1\u01e0",
			"",
			"\1\u01e1",
			"\1\u01e2",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u01e5",
			"\1\u01e6",
			"\1\u01e7",
			"\1\u01e8",
			"\1\u01e9",
			"\1\u01ea",
			"\1\u01eb",
			"\1\u01ec",
			"\1\u01ed",
			"\1\u01ee",
			"\1\u01ef",
			"\1\u01f0",
			"\1\u01f1",
			"\1\u01f2",
			"\1\u01f3",
			"\1\u01f4",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"\1\u01f9",
			"\1\u01fa",
			"\1\u01fb",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01fe",
			"\1\u01ff",
			"",
			"\1\u0200",
			"\1\u0201",
			"\1\u0202",
			"\1\u0203",
			"\1\u0204",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"\1\u020b",
			"\1\u020c",
			"\1\u020d",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0210",
			"",
			"",
			"",
			"\1\u0211",
			"\1\u0213\15\uffff\1\u0212",
			"\1\u0214",
			"",
			"\1\u0215",
			"\1\u0216",
			"\14\106\1\u0217\15\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u021a",
			"\1\u021b",
			"",
			"\1\u021c",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"",
			"\1\u0221",
			"\1\u0222",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0223",
			"\1\u0224",
			"\1\u0225",
			"",
			"\1\u0226",
			"\1\u0227",
			"\1\u0228",
			"\1\u0229",
			"\1\u022a",
			"\1\u022b",
			"\1\u022c",
			"",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u022e",
			"\1\u022f",
			"\1\u0230",
			"\1\u0231",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0232",
			"\1\u0233",
			"",
			"\1\u0234",
			"\1\u0235",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0237",
			"\1\u0238",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u023b",
			"\1\u023c",
			"\1\u023d",
			"\1\u023e",
			"\1\u023f",
			"\1\u0240",
			"\1\u0241",
			"\1\u0242",
			"\1\u0243",
			"\1\u0244",
			"\1\u0245",
			"\1\u0246",
			"\1\u0247",
			"\1\u0248",
			"\1\u0249",
			"\1\u024a",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d",
			"\1\u024e",
			"\1\u024f",
			"\1\u0250",
			"\1\u0251",
			"\1\u0252",
			"\1\u0253",
			"\1\u0254",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0256",
			"\1\u0257",
			"\1\u0258",
			"\1\u0259",
			"\1\u025a",
			"\1\u025b",
			"\1\u025c",
			"\1\u025d",
			"\1\u025e",
			"\1\u025f",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0261",
			"\1\u0262",
			"\1\u0263",
			"",
			"",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0265",
			"\1\u0266",
			"\1\u0267",
			"\1\u0268",
			"\1\u0269",
			"\1\u026a",
			"\1\u026b",
			"",
			"",
			"\1\u026c",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\25\106\1\u026e\4\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0272",
			"\1\u0273",
			"\1\u0274",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0276",
			"\1\u0277",
			"\1\u0278",
			"\1\u0279",
			"\1\u027a",
			"\1\u027b",
			"\1\u027c",
			"\1\u027d",
			"\1\u027e",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\1\u0280",
			"\1\u0281",
			"\1\u0282",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\1\u0287",
			"",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0289",
			"",
			"",
			"\1\u028a",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u028c",
			"\1\u028d",
			"\1\u028e",
			"\1\u028f",
			"\1\u0290",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0292",
			"\1\u0293",
			"\1\u0294",
			"\1\u0295",
			"\13\106\1\u0296\16\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0298",
			"\1\u0299",
			"\1\u029a",
			"\1\u029b",
			"\1\u029c",
			"\1\u029d",
			"\1\u029e",
			"\1\u029f",
			"\1\u02a0",
			"\1\u02a1",
			"\13\106\1\u02a2\16\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u02a4",
			"\1\u02a5",
			"",
			"\1\u02a6",
			"\1\u02a7",
			"\1\u02a8",
			"\1\u02a9",
			"\1\u02ab\15\uffff\1\u02aa",
			"\1\u02ac",
			"\1\u02ad",
			"\1\u02ae",
			"\1\u02af",
			"\1\u02b0",
			"",
			"\1\u02b1",
			"\1\u02b2",
			"\1\u02b3",
			"",
			"\1\u02b4",
			"\1\u02b5",
			"\1\u02b6",
			"\1\u02b7",
			"\1\u02b8",
			"\1\u02b9",
			"\1\u02ba",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\1\u02bc",
			"",
			"",
			"",
			"\1\u02bd",
			"\1\u02be",
			"\1\u02bf",
			"",
			"\1\u02c0",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u02c2",
			"\1\u02c3",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u02c5",
			"\1\u02c6",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u02c8",
			"",
			"\1\u02c9",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u02cb",
			"",
			"\1\u02cc",
			"\1\u02cd",
			"\1\u02ce",
			"\1\u02cf",
			"",
			"\1\u02d0",
			"\32\106\4\uffff\1\106\1\uffff\22\106\1\u02d1\7\106",
			"",
			"\1\u02d3",
			"\1\u02d4",
			"\1\u02d5",
			"\1\u02d6",
			"\1\u02d7",
			"",
			"\1\u02d8",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u02da",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u02dc",
			"",
			"\1\u02dd",
			"\1\u02de",
			"\1\u02df",
			"\1\u02e0",
			"\1\u02e1",
			"\1\u02e2",
			"\1\u02e3",
			"\1\u02e4",
			"\1\u02e5",
			"\1\u02e6",
			"\1\u02e7",
			"",
			"\1\u02e8",
			"\1\u02e9",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u02eb",
			"\1\u02ec",
			"\1\u02ed",
			"\1\u02ee",
			"\1\u02ef",
			"\1\u02f0",
			"\1\u02f1",
			"\1\u02f2",
			"\1\u02f3",
			"\1\u02f4",
			"\1\u02f5",
			"\1\u02f6",
			"\1\u02f7",
			"\32\106\4\uffff\1\106\1\uffff\10\106\1\u02f8\21\106",
			"\1\u02fa",
			"\1\u02fb",
			"\1\u02fc",
			"\1\u02fd",
			"\1\u02fe",
			"\1\u02ff",
			"",
			"\1\u0300",
			"\1\u0301",
			"\1\u0302",
			"\1\u0303",
			"\1\u0304",
			"",
			"\1\u0305",
			"\1\u0306",
			"",
			"\1\u0307",
			"\1\u0308",
			"",
			"\1\u0309",
			"\1\u030a",
			"",
			"\1\u030b",
			"\1\u030c",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0310",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\1\u0312",
			"\1\u0313",
			"\1\u0314",
			"\5\106\1\u0315\24\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0317",
			"\1\u0318",
			"",
			"\1\u0319",
			"",
			"\1\u031a",
			"\1\u031b",
			"\1\u031c",
			"\1\u031d",
			"\1\u031e",
			"\1\u031f",
			"\1\u0320",
			"\1\u0321",
			"\1\u0322",
			"\1\u0323",
			"\1\u0324",
			"\1\u0325",
			"\1\u0326",
			"\1\u0327",
			"",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0329",
			"\1\u032a",
			"\1\u032b",
			"\1\u032c",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0330",
			"\1\u0331",
			"\1\u0332",
			"\1\u0333",
			"\1\u0334",
			"\1\u0335",
			"",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0337",
			"\1\u0338",
			"\1\u0339",
			"\1\u033a",
			"\1\u033b",
			"\1\u033c",
			"\1\u033d",
			"\1\u033e",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0340",
			"\1\u0341",
			"\1\u0342",
			"\1\u0343",
			"\1\u0344",
			"\1\u0345",
			"\1\u0346",
			"\1\u0347",
			"\1\u0348",
			"",
			"",
			"",
			"\1\u0349",
			"",
			"\1\u034a",
			"\1\u034b",
			"\1\u034c",
			"\1\u034d",
			"",
			"\1\u034e",
			"\1\u034f",
			"\3\106\1\u0350\26\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0352",
			"\1\u0353",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0356",
			"\1\u0357",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0359",
			"\1\u035a",
			"\1\u035b",
			"\1\u035c",
			"\1\u035d",
			"\1\u035e",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\1\u0360",
			"\1\u0361",
			"\1\u0362",
			"\1\u0363",
			"",
			"",
			"",
			"\1\u0364",
			"\1\u0365",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0367",
			"\1\u0368",
			"\1\u0369",
			"",
			"\1\u036a",
			"\1\u036b",
			"\1\u036c",
			"\1\u036d",
			"\1\u036e",
			"\1\u036f",
			"\1\u0370",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\1\u0372",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0375",
			"\1\u0376",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0378",
			"\1\u0379",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u037b",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u037d",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u037f",
			"\1\u0380",
			"\1\u0381",
			"\1\u0382",
			"",
			"\1\u0383",
			"\1\u0384",
			"",
			"",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0386",
			"",
			"\1\u0387",
			"\1\u0388\31\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u038a",
			"\1\u038b",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u038d",
			"",
			"\1\u038e",
			"\1\u038f",
			"\1\u0390",
			"\1\u0391",
			"\1\u0392",
			"\1\u0393",
			"",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0396",
			"\1\u0397",
			"\1\u0398",
			"\1\u0399",
			"\1\u039a",
			"\1\u039b",
			"\1\u039c",
			"\1\u039d",
			"",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"",
			"\1\u039f",
			"\1\u03a0",
			"",
			"\1\u03a1",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\1\u03a4",
			"",
			"\1\u03a5",
			"\1\u03a6",
			"\1\u03a7",
			"\1\u03a8",
			"\1\u03a9",
			"\1\u03aa",
			"",
			"\1\u03ab",
			"\1\u03ac",
			"\1\u03ad",
			"",
			"\1\u03ae",
			"\1\u03af",
			"",
			"\1\u03b0",
			"\1\u03b1",
			"\1\u03b2",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"\1\u03b6",
			"",
			"",
			"\1\u03b7",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u03b9",
			"\1\u03ba",
			"\1\u03bb",
			"\1\u03bc",
			"\1\u03bd",
			"\1\u03be",
			"",
			"\1\u03bf",
			"\1\u03c0",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"",
			"\1\u03c2",
			"\1\u03c3",
			"\1\u03c4",
			"\1\u03c5",
			"\1\u03c6",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u03c8",
			"\1\u03c9",
			"\1\u03ca",
			"\1\u03cb",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u03cd",
			"\1\u03ce",
			"\1\u03cf",
			"\1\u03d0",
			"\1\u03d1",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u03d3",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u03d5",
			"",
			"\1\u03d6",
			"\1\u03d7",
			"\1\u03d8",
			"\1\u03d9",
			"\1\u03da",
			"\1\u03db",
			"\1\u03dc",
			"\1\u03dd",
			"",
			"\1\u03de",
			"\1\u03df",
			"\1\u03e0\15\uffff\1\u03e1",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\1\u03e4",
			"\1\u03e5",
			"\1\u03e6",
			"\1\u03e7",
			"",
			"\1\u03e8",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u03ea",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u03ec",
			"",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u03ef",
			"\1\u03f0",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u03f2",
			"\1\u03f3",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u03f5",
			"\1\u03f6",
			"\1\u03f7",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u03f9",
			"\1\u03fa",
			"",
			"",
			"\1\u03fb",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u03fe",
			"\1\u03ff",
			"",
			"\1\u0400",
			"",
			"\1\u0401",
			"",
			"",
			"\1\u0402",
			"\1\u0403",
			"",
			"\1\u0404",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"",
			"\1\u0406",
			"\1\u0407",
			"\1\u0408",
			"",
			"\1\u0409",
			"\1\u040a",
			"\1\u040b",
			"",
			"",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u040d",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u040f",
			"\1\u0410",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0412",
			"",
			"\1\u0413",
			"\1\u0414",
			"\1\u0415",
			"\1\u0416",
			"\1\u0417",
			"\1\u0418",
			"",
			"\1\u0419",
			"",
			"\1\u041a",
			"\1\u041b",
			"",
			"\1\u041c",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0420",
			"\1\u0421",
			"\1\u0422",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0425",
			"\1\u0426",
			"",
			"",
			"",
			"\1\u0427",
			"\1\u0428",
			"\1\u0429",
			"",
			"",
			"\1\u042a",
			"\1\u042b",
			"\1\u042c",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u042e",
			"\1\u042f",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0431",
			"",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0433",
			"",
			"\1\u0434",
			"",
			"\1\u0435",
			"\1\u0436",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			"\1\u0438",
			"",
			"\1\u0439",
			"\32\106\4\uffff\1\106\1\uffff\32\106",
			""
	};

	static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
	static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
	static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
	static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
	static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
	static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
	static final short[][] DFA26_transition;

	static {
		int numStates = DFA26_transitionS.length;
		DFA26_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
		}
	}

	protected class DFA26 extends DFA {

		public DFA26(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 26;
			this.eot = DFA26_eot;
			this.eof = DFA26_eof;
			this.min = DFA26_min;
			this.max = DFA26_max;
			this.accept = DFA26_accept;
			this.special = DFA26_special;
			this.transition = DFA26_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SORTS | GENERIC | PROXY | EXTENDS | ONEOF | ABSTRACT | SCHEMAVARIABLES | SCHEMAVAR | MODALOPERATOR | PROGRAM | FORMULA | TERM | UPDATE | VARIABLES | VARIABLE | SKOLEMTERM | SKOLEMFORMULA | TERMLABEL | MODIFIES | PROGRAMVARIABLES | VARCOND | APPLY_UPDATE_ON_RIGID | DEPENDINGON | DISJOINTMODULONULL | DROP_EFFECTLESS_ELEMENTARIES | DROP_EFFECTLESS_STORES | SIMPLIFY_IF_THEN_ELSE_UPDATE | ENUM_CONST | FREELABELIN | HASSORT | FIELDTYPE | FINAL | ELEMSORT | HASLABEL | HASSUBFORMULAS | ISARRAY | ISARRAYLENGTH | ISCONSTANT | ISENUMTYPE | ISINDUCTVAR | ISLOCALVARIABLE | ISOBSERVER | DIFFERENT | METADISJOINT | ISTHISREFERENCE | DIFFERENTFIELDS | ISREFERENCE | ISREFERENCEARRAY | ISSTATICFIELD | ISSUBTYPE | EQUAL_UNIQUE | NEW | NEWLABEL | CONTAINS_ASSIGNMENT | NOT_ | NOTFREEIN | SAME | STATIC | STATICMETHODREFERENCE | STRICT | TYPEOF | INSTANTIATE_GENERIC | FORALL | EXISTS | SUBST | IF | IFEX | THEN | ELSE | INCLUDE | INCLUDELDTS | CLASSPATH | BOOTCLASSPATH | NODEFAULTCLASSES | JAVASOURCE | WITHOPTIONS | OPTIONSDECL | KEYSETTINGS | PROFILE | TRUE | FALSE | SAMEUPDATELEVEL | INSEQUENTSTATE | ANTECEDENTPOLARITY | SUCCEDENTPOLARITY | CLOSEGOAL | HEURISTICSDECL | NONINTERACTIVE | DISPLAYNAME | HELPTEXT | REPLACEWITH | ADDRULES | ADDPROGVARS | HEURISTICS | FIND | ADD | ASSUMES | TRIGGER | AVOID | PREDICATES | FUNCTIONS | TRANSFORMERS | UNIQUE | RULES | AXIOMS | PROBLEM | CHOOSECONTRACT | PROOFOBLIGATION | PROOF | PROOFSCRIPT | CONTRACTS | INVARIANTS | LEMMA | IN_TYPE | IS_ABSTRACT_OR_INTERFACE | CONTAINERTYPE | LIMITED | LOCSET | SEQ | BIGINT | UTF_PRECEDES | UTF_IN | UTF_EMPTY | UTF_UNION | UTF_INTERSECT | UTF_SUBSET | UTF_SETMINUS | SEMI | SLASH | BACKSLASH | COLON | DOUBLECOLON | ASSIGN | DOT | DOTRANGE | COMMA | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | EMPTYBRACKETS | AT | PARALLEL | OR | AND | NOT | IMP | EQUALS | NOT_EQUALS | SEQARROW | EXP | TILDE | PERCENT | STAR | MINUS | PLUS | GREATER | GREATEREQUAL | RGUILLEMETS | WS | STRING_LITERAL | LESS_DISPATCH | PRIMES_OR_CHARLITERAL | SL_COMMENT | ML_COMMENT | DIGIT_DISPATCH | IDENT | MODALITY );";
		}
	}

}
