// $ANTLR 3.5.2 /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g 2017-04-13 18:24:12

    package de.uka.ilkd.key.speclang.jml.translation;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class KeYJMLLexer extends Lexer {
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

	   @Override
	   public void reportError(RecognitionException e) {
	      if (e instanceof MismatchedTokenException) {
	         MismatchedTokenException m = (MismatchedTokenException) e;
	         String message = "Unexpected character '" + (char) e.c + "' in line "
	               + e.line + ":" + e.charPositionInLine
	               + ". Expected character is: '" + (char) m.expecting + "'";
	         message += "\nFile name: " + getSourceName();
	         throw new RuntimeException(message, e);
	      }
	      throw new RuntimeException(e);
	   }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public KeYJMLLexer() {} 
	public KeYJMLLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public KeYJMLLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g"; }

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:23:13: ( 'boolean' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:23:15: 'boolean'
			{
			match("boolean"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "BYTE"
	public final void mBYTE() throws RecognitionException {
		try {
			int _type = BYTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:24:10: ( 'byte' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:24:12: 'byte'
			{
			match("byte"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BYTE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:25:11: ( 'false' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:25:13: 'false'
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

	// $ANTLR start "INSTANCEOF"
	public final void mINSTANCEOF() throws RecognitionException {
		try {
			int _type = INSTANCEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:26:16: ( 'instanceof' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:26:18: 'instanceof'
			{
			match("instanceof"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INSTANCEOF"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:27:9: ( 'int' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:27:11: 'int'
			{
			match("int"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "LONG"
	public final void mLONG() throws RecognitionException {
		try {
			int _type = LONG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:28:10: ( 'long' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:28:12: 'long'
			{
			match("long"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG"

	// $ANTLR start "NEW"
	public final void mNEW() throws RecognitionException {
		try {
			int _type = NEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:29:9: ( 'new' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:29:11: 'new'
			{
			match("new"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW"

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:30:10: ( 'null' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:30:12: 'null'
			{
			match("null"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULL"

	// $ANTLR start "SHORT"
	public final void mSHORT() throws RecognitionException {
		try {
			int _type = SHORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:31:11: ( 'short' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:31:13: 'short'
			{
			match("short"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHORT"

	// $ANTLR start "SUPER"
	public final void mSUPER() throws RecognitionException {
		try {
			int _type = SUPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:32:11: ( 'super' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:32:13: 'super'
			{
			match("super"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUPER"

	// $ANTLR start "THIS"
	public final void mTHIS() throws RecognitionException {
		try {
			int _type = THIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:33:10: ( 'this' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:33:12: 'this'
			{
			match("this"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THIS"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:34:10: ( 'true' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:34:12: 'true'
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

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:35:10: ( 'void' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:35:12: 'void'
			{
			match("void"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "ACCESSIBLE"
	public final void mACCESSIBLE() throws RecognitionException {
		try {
			int _type = ACCESSIBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:38:21: ( 'accessible' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:38:23: 'accessible'
			{
			match("accessible"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ACCESSIBLE"

	// $ANTLR start "ASSIGNABLE"
	public final void mASSIGNABLE() throws RecognitionException {
		try {
			int _type = ASSIGNABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:39:21: ( 'assignable' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:39:23: 'assignable'
			{
			match("assignable"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGNABLE"

	// $ANTLR start "BREAKS"
	public final void mBREAKS() throws RecognitionException {
		try {
			int _type = BREAKS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:40:21: ( 'breaks' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:40:23: 'breaks'
			{
			match("breaks"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAKS"

	// $ANTLR start "CONTINUES"
	public final void mCONTINUES() throws RecognitionException {
		try {
			int _type = CONTINUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:41:21: ( 'continues' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:41:23: 'continues'
			{
			match("continues"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUES"

	// $ANTLR start "DECREASES"
	public final void mDECREASES() throws RecognitionException {
		try {
			int _type = DECREASES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:42:21: ( 'decreases' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:42:23: 'decreases'
			{
			match("decreases"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECREASES"

	// $ANTLR start "DEPENDS"
	public final void mDEPENDS() throws RecognitionException {
		try {
			int _type = DEPENDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:43:21: ( 'depends' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:43:23: 'depends'
			{
			match("depends"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEPENDS"

	// $ANTLR start "DETERMINES"
	public final void mDETERMINES() throws RecognitionException {
		try {
			int _type = DETERMINES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:44:21: ( 'determines' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:44:23: 'determines'
			{
			match("determines"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DETERMINES"

	// $ANTLR start "ENSURES"
	public final void mENSURES() throws RecognitionException {
		try {
			int _type = ENSURES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:45:21: ( 'ensures' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:45:23: 'ensures'
			{
			match("ensures"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENSURES"

	// $ANTLR start "ENSURES_FREE"
	public final void mENSURES_FREE() throws RecognitionException {
		try {
			int _type = ENSURES_FREE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:46:21: ( 'ensures_free' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:46:23: 'ensures_free'
			{
			match("ensures_free"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENSURES_FREE"

	// $ANTLR start "LOOP_DETERMINES"
	public final void mLOOP_DETERMINES() throws RecognitionException {
		try {
			int _type = LOOP_DETERMINES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:47:21: ( 'loop_determines' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:47:23: 'loop_determines'
			{
			match("loop_determines"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOOP_DETERMINES"

	// $ANTLR start "LOOP_SEPARATES"
	public final void mLOOP_SEPARATES() throws RecognitionException {
		try {
			int _type = LOOP_SEPARATES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:48:21: ( 'loop_separates' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:48:23: 'loop_separates'
			{
			match("loop_separates"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOOP_SEPARATES"

	// $ANTLR start "MODEL_METHOD_AXIOM"
	public final void mMODEL_METHOD_AXIOM() throws RecognitionException {
		try {
			int _type = MODEL_METHOD_AXIOM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:49:27: ( 'model_method_axiom' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:49:29: 'model_method_axiom'
			{
			match("model_method_axiom"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODEL_METHOD_AXIOM"

	// $ANTLR start "NON_NULL"
	public final void mNON_NULL() throws RecognitionException {
		try {
			int _type = NON_NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:50:21: ( 'non_null' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:50:23: 'non_null'
			{
			match("non_null"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NON_NULL"

	// $ANTLR start "NULLABLE"
	public final void mNULLABLE() throws RecognitionException {
		try {
			int _type = NULLABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:51:21: ( 'nullable' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:51:23: 'nullable'
			{
			match("nullable"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULLABLE"

	// $ANTLR start "REPRESENTS"
	public final void mREPRESENTS() throws RecognitionException {
		try {
			int _type = REPRESENTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:52:21: ( 'represents' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:52:23: 'represents'
			{
			match("represents"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REPRESENTS"

	// $ANTLR start "REQUIRES"
	public final void mREQUIRES() throws RecognitionException {
		try {
			int _type = REQUIRES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:53:21: ( 'requires' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:53:23: 'requires'
			{
			match("requires"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REQUIRES"

	// $ANTLR start "REQUIRES_FREE"
	public final void mREQUIRES_FREE() throws RecognitionException {
		try {
			int _type = REQUIRES_FREE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:54:21: ( 'requires_free' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:54:23: 'requires_free'
			{
			match("requires_free"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REQUIRES_FREE"

	// $ANTLR start "RETURNS"
	public final void mRETURNS() throws RecognitionException {
		try {
			int _type = RETURNS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:55:21: ( 'returns' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:55:23: 'returns'
			{
			match("returns"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURNS"

	// $ANTLR start "JOIN_PROC"
	public final void mJOIN_PROC() throws RecognitionException {
		try {
			int _type = JOIN_PROC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:56:21: ( 'join_proc' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:56:23: 'join_proc'
			{
			match("join_proc"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOIN_PROC"

	// $ANTLR start "SEPARATES"
	public final void mSEPARATES() throws RecognitionException {
		try {
			int _type = SEPARATES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:57:21: ( 'separates' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:57:23: 'separates'
			{
			match("separates"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEPARATES"

	// $ANTLR start "SIGNALS"
	public final void mSIGNALS() throws RecognitionException {
		try {
			int _type = SIGNALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:58:21: ( 'signals' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:58:23: 'signals'
			{
			match("signals"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIGNALS"

	// $ANTLR start "SIGNALS_ONLY"
	public final void mSIGNALS_ONLY() throws RecognitionException {
		try {
			int _type = SIGNALS_ONLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:59:21: ( 'signals_only' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:59:23: 'signals_only'
			{
			match("signals_only"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIGNALS_ONLY"

	// $ANTLR start "ALLFIELDS"
	public final void mALLFIELDS() throws RecognitionException {
		try {
			int _type = ALLFIELDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:62:26: ( '\\\\all_fields' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:62:28: '\\\\all_fields'
			{
			match("\\all_fields"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALLFIELDS"

	// $ANTLR start "ALLOBJECTS"
	public final void mALLOBJECTS() throws RecognitionException {
		try {
			int _type = ALLOBJECTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:63:26: ( '\\\\all_objects' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:63:28: '\\\\all_objects'
			{
			match("\\all_objects"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALLOBJECTS"

	// $ANTLR start "BACKUP"
	public final void mBACKUP() throws RecognitionException {
		try {
			int _type = BACKUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:64:26: ( '\\\\backup' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:64:28: '\\\\backup'
			{
			match("\\backup"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BACKUP"

	// $ANTLR start "BIGINT"
	public final void mBIGINT() throws RecognitionException {
		try {
			int _type = BIGINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:65:26: ( '\\\\bigint' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:65:28: '\\\\bigint'
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

	// $ANTLR start "BSUM"
	public final void mBSUM() throws RecognitionException {
		try {
			int _type = BSUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:66:26: ( '\\\\bsum' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:66:28: '\\\\bsum'
			{
			match("\\bsum"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BSUM"

	// $ANTLR start "BY"
	public final void mBY() throws RecognitionException {
		try {
			int _type = BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:67:26: ( '\\\\by' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:67:28: '\\\\by'
			{
			match("\\by"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BY"

	// $ANTLR start "DECLASSIFIES"
	public final void mDECLASSIFIES() throws RecognitionException {
		try {
			int _type = DECLASSIFIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:68:26: ( '\\\\declassifies' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:68:28: '\\\\declassifies'
			{
			match("\\declassifies"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECLASSIFIES"

	// $ANTLR start "DISJOINT"
	public final void mDISJOINT() throws RecognitionException {
		try {
			int _type = DISJOINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:69:26: ( '\\\\disjoint' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:69:28: '\\\\disjoint'
			{
			match("\\disjoint"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DISJOINT"

	// $ANTLR start "DOMAIN_IMPLIES_CREATED"
	public final void mDOMAIN_IMPLIES_CREATED() throws RecognitionException {
		try {
			int _type = DOMAIN_IMPLIES_CREATED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:70:28: ( '\\\\domain_implies_created' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:70:30: '\\\\domain_implies_created'
			{
			match("\\domain_implies_created"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOMAIN_IMPLIES_CREATED"

	// $ANTLR start "DURATION"
	public final void mDURATION() throws RecognitionException {
		try {
			int _type = DURATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:71:26: ( '\\\\duration' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:71:28: '\\\\duration'
			{
			match("\\duration"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DURATION"

	// $ANTLR start "ELEMTYPE"
	public final void mELEMTYPE() throws RecognitionException {
		try {
			int _type = ELEMTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:72:26: ( '\\\\elemtype' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:72:28: '\\\\elemtype'
			{
			match("\\elemtype"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELEMTYPE"

	// $ANTLR start "EMPTYSET"
	public final void mEMPTYSET() throws RecognitionException {
		try {
			int _type = EMPTYSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:73:26: ( '\\\\empty' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:73:28: '\\\\empty'
			{
			match("\\empty"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EMPTYSET"

	// $ANTLR start "ERASES"
	public final void mERASES() throws RecognitionException {
		try {
			int _type = ERASES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:74:26: ( '\\\\erases' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:74:28: '\\\\erases'
			{
			match("\\erases"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERASES"

	// $ANTLR start "EVERYTHING"
	public final void mEVERYTHING() throws RecognitionException {
		try {
			int _type = EVERYTHING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:75:26: ( '\\\\everything' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:75:28: '\\\\everything'
			{
			match("\\everything"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EVERYTHING"

	// $ANTLR start "EXCEPTION"
	public final void mEXCEPTION() throws RecognitionException {
		try {
			int _type = EXCEPTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:76:26: ( '\\\\exception' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:76:28: '\\\\exception'
			{
			match("\\exception"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXCEPTION"

	// $ANTLR start "EXISTS"
	public final void mEXISTS() throws RecognitionException {
		try {
			int _type = EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:77:26: ( '\\\\exists' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:77:28: '\\\\exists'
			{
			match("\\exists"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXISTS"

	// $ANTLR start "FORALL"
	public final void mFORALL() throws RecognitionException {
		try {
			int _type = FORALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:78:26: ( '\\\\forall' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:78:28: '\\\\forall'
			{
			match("\\forall"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FORALL"

	// $ANTLR start "FREE"
	public final void mFREE() throws RecognitionException {
		try {
			int _type = FREE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:79:26: ( '\\\\free' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:79:28: '\\\\free'
			{
			match("\\free"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FREE"

	// $ANTLR start "FRESH"
	public final void mFRESH() throws RecognitionException {
		try {
			int _type = FRESH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:80:26: ( '\\\\fresh' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:80:28: '\\\\fresh'
			{
			match("\\fresh"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRESH"

	// $ANTLR start "INDEX"
	public final void mINDEX() throws RecognitionException {
		try {
			int _type = INDEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:81:26: ( '\\\\index' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:81:28: '\\\\index'
			{
			match("\\index"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INDEX"

	// $ANTLR start "INDEXOF"
	public final void mINDEXOF() throws RecognitionException {
		try {
			int _type = INDEXOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:82:26: ( '\\\\seq_indexOf' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:82:28: '\\\\seq_indexOf'
			{
			match("\\seq_indexOf"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INDEXOF"

	// $ANTLR start "INTERSECT"
	public final void mINTERSECT() throws RecognitionException {
		try {
			int _type = INTERSECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:83:26: ( '\\\\intersect' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:83:28: '\\\\intersect'
			{
			match("\\intersect"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTERSECT"

	// $ANTLR start "INTO"
	public final void mINTO() throws RecognitionException {
		try {
			int _type = INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:84:26: ( '\\\\into' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:84:28: '\\\\into'
			{
			match("\\into"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTO"

	// $ANTLR start "INV"
	public final void mINV() throws RecognitionException {
		try {
			int _type = INV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:85:26: ( '\\\\inv' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:85:28: '\\\\inv'
			{
			match("\\inv"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INV"

	// $ANTLR start "INVARIANT_FOR"
	public final void mINVARIANT_FOR() throws RecognitionException {
		try {
			int _type = INVARIANT_FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:86:26: ( '\\\\invariant_for' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:86:28: '\\\\invariant_for'
			{
			match("\\invariant_for"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INVARIANT_FOR"

	// $ANTLR start "IN_DOMAIN"
	public final void mIN_DOMAIN() throws RecognitionException {
		try {
			int _type = IN_DOMAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:87:26: ( '\\\\in_domain' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:87:28: '\\\\in_domain'
			{
			match("\\in_domain"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN_DOMAIN"

	// $ANTLR start "IS_FINITE"
	public final void mIS_FINITE() throws RecognitionException {
		try {
			int _type = IS_FINITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:88:26: ( '\\\\is_finite' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:88:28: '\\\\is_finite'
			{
			match("\\is_finite"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IS_FINITE"

	// $ANTLR start "IS_INITIALIZED"
	public final void mIS_INITIALIZED() throws RecognitionException {
		try {
			int _type = IS_INITIALIZED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:89:26: ( '\\\\is_initialized' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:89:28: '\\\\is_initialized'
			{
			match("\\is_initialized"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IS_INITIALIZED"

	// $ANTLR start "ITSELF"
	public final void mITSELF() throws RecognitionException {
		try {
			int _type = ITSELF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:90:26: ( '\\\\itself' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:90:28: '\\\\itself'
			{
			match("\\itself"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ITSELF"

	// $ANTLR start "LBLNEG"
	public final void mLBLNEG() throws RecognitionException {
		try {
			int _type = LBLNEG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:91:26: ( '\\\\lblneg' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:91:28: '\\\\lblneg'
			{
			match("\\lblneg"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBLNEG"

	// $ANTLR start "LBLPOS"
	public final void mLBLPOS() throws RecognitionException {
		try {
			int _type = LBLPOS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:92:26: ( '\\\\lblpos' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:92:28: '\\\\lblpos'
			{
			match("\\lblpos"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBLPOS"

	// $ANTLR start "LOCKSET"
	public final void mLOCKSET() throws RecognitionException {
		try {
			int _type = LOCKSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:93:26: ( '\\\\lockset' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:93:28: '\\\\lockset'
			{
			match("\\lockset"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOCKSET"

	// $ANTLR start "LOCSET"
	public final void mLOCSET() throws RecognitionException {
		try {
			int _type = LOCSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:94:26: ( '\\\\locset' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:94:28: '\\\\locset'
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

	// $ANTLR start "MAP"
	public final void mMAP() throws RecognitionException {
		try {
			int _type = MAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:95:26: ( '\\\\map' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:95:28: '\\\\map'
			{
			match("\\map"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAP"

	// $ANTLR start "MAPEMPTY"
	public final void mMAPEMPTY() throws RecognitionException {
		try {
			int _type = MAPEMPTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:96:26: ( '\\\\map_empty' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:96:28: '\\\\map_empty'
			{
			match("\\map_empty"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAPEMPTY"

	// $ANTLR start "MAP_GET"
	public final void mMAP_GET() throws RecognitionException {
		try {
			int _type = MAP_GET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:97:26: ( '\\\\map_get' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:97:28: '\\\\map_get'
			{
			match("\\map_get"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAP_GET"

	// $ANTLR start "MAP_OVERRIDE"
	public final void mMAP_OVERRIDE() throws RecognitionException {
		try {
			int _type = MAP_OVERRIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:98:26: ( '\\\\map_override' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:98:28: '\\\\map_override'
			{
			match("\\map_override"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAP_OVERRIDE"

	// $ANTLR start "MAP_REMOVE"
	public final void mMAP_REMOVE() throws RecognitionException {
		try {
			int _type = MAP_REMOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:99:26: ( '\\\\map_remove' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:99:28: '\\\\map_remove'
			{
			match("\\map_remove"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAP_REMOVE"

	// $ANTLR start "MAP_SINGLETON"
	public final void mMAP_SINGLETON() throws RecognitionException {
		try {
			int _type = MAP_SINGLETON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:100:26: ( '\\\\map_singleton' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:100:28: '\\\\map_singleton'
			{
			match("\\map_singleton"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAP_SINGLETON"

	// $ANTLR start "MAP_SIZE"
	public final void mMAP_SIZE() throws RecognitionException {
		try {
			int _type = MAP_SIZE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:101:26: ( '\\\\map_size' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:101:28: '\\\\map_size'
			{
			match("\\map_size"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAP_SIZE"

	// $ANTLR start "MAP_UPDATE"
	public final void mMAP_UPDATE() throws RecognitionException {
		try {
			int _type = MAP_UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:102:26: ( '\\\\map_update' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:102:29: '\\\\map_update'
			{
			match("\\map_update"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAP_UPDATE"

	// $ANTLR start "MAX"
	public final void mMAX() throws RecognitionException {
		try {
			int _type = MAX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:103:26: ( '\\\\max' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:103:28: '\\\\max'
			{
			match("\\max"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAX"

	// $ANTLR start "MEASURED_BY"
	public final void mMEASURED_BY() throws RecognitionException {
		try {
			int _type = MEASURED_BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:104:26: ( '\\\\measured_by' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:104:28: '\\\\measured_by'
			{
			match("\\measured_by"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MEASURED_BY"

	// $ANTLR start "MIN"
	public final void mMIN() throws RecognitionException {
		try {
			int _type = MIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:105:26: ( '\\\\min' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:105:28: '\\\\min'
			{
			match("\\min"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIN"

	// $ANTLR start "NEWELEMSFRESH"
	public final void mNEWELEMSFRESH() throws RecognitionException {
		try {
			int _type = NEWELEMSFRESH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:106:26: ( '\\\\new_elems_fresh' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:106:28: '\\\\new_elems_fresh'
			{
			match("\\new_elems_fresh"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWELEMSFRESH"

	// $ANTLR start "NEW_OBJECTS"
	public final void mNEW_OBJECTS() throws RecognitionException {
		try {
			int _type = NEW_OBJECTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:107:26: ( '\\\\new_objects' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:107:28: '\\\\new_objects'
			{
			match("\\new_objects"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_OBJECTS"

	// $ANTLR start "NONNULLELEMENTS"
	public final void mNONNULLELEMENTS() throws RecognitionException {
		try {
			int _type = NONNULLELEMENTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:108:26: ( '\\\\nonnullelements' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:108:28: '\\\\nonnullelements'
			{
			match("\\nonnullelements"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NONNULLELEMENTS"

	// $ANTLR start "NOTHING"
	public final void mNOTHING() throws RecognitionException {
		try {
			int _type = NOTHING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:109:26: ( '\\\\nothing' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:109:28: '\\\\nothing'
			{
			match("\\nothing"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTHING"

	// $ANTLR start "NOT_ASSIGNED"
	public final void mNOT_ASSIGNED() throws RecognitionException {
		try {
			int _type = NOT_ASSIGNED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:110:26: ( '\\\\not_assigned' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:110:28: '\\\\not_assigned'
			{
			match("\\not_assigned"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_ASSIGNED"

	// $ANTLR start "NOT_MODIFIED"
	public final void mNOT_MODIFIED() throws RecognitionException {
		try {
			int _type = NOT_MODIFIED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:111:26: ( '\\\\not_modified' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:111:28: '\\\\not_modified'
			{
			match("\\not_modified"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_MODIFIED"

	// $ANTLR start "NOT_SPECIFIED"
	public final void mNOT_SPECIFIED() throws RecognitionException {
		try {
			int _type = NOT_SPECIFIED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:112:26: ( '\\\\not_specified' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:112:28: '\\\\not_specified'
			{
			match("\\not_specified"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_SPECIFIED"

	// $ANTLR start "NUM_OF"
	public final void mNUM_OF() throws RecognitionException {
		try {
			int _type = NUM_OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:113:26: ( '\\\\num_of' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:113:28: '\\\\num_of'
			{
			match("\\num_of"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM_OF"

	// $ANTLR start "OLD"
	public final void mOLD() throws RecognitionException {
		try {
			int _type = OLD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:114:26: ( '\\\\old' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:114:28: '\\\\old'
			{
			match("\\old"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OLD"

	// $ANTLR start "PERMISSION"
	public final void mPERMISSION() throws RecognitionException {
		try {
			int _type = PERMISSION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:115:26: ( '\\\\permission' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:115:28: '\\\\permission'
			{
			match("\\permission"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERMISSION"

	// $ANTLR start "PRE"
	public final void mPRE() throws RecognitionException {
		try {
			int _type = PRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:116:26: ( '\\\\pre' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:116:28: '\\\\pre'
			{
			match("\\pre"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRE"

	// $ANTLR start "PRODUCT"
	public final void mPRODUCT() throws RecognitionException {
		try {
			int _type = PRODUCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:117:26: ( '\\\\product' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:117:28: '\\\\product'
			{
			match("\\product"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRODUCT"

	// $ANTLR start "REACH"
	public final void mREACH() throws RecognitionException {
		try {
			int _type = REACH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:118:26: ( '\\\\reach' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:118:28: '\\\\reach'
			{
			match("\\reach"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REACH"

	// $ANTLR start "REACHLOCS"
	public final void mREACHLOCS() throws RecognitionException {
		try {
			int _type = REACHLOCS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:119:26: ( '\\\\reachLocs' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:119:28: '\\\\reachLocs'
			{
			match("\\reachLocs"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REACHLOCS"

	// $ANTLR start "REAL"
	public final void mREAL() throws RecognitionException {
		try {
			int _type = REAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:120:26: ( '\\\\real' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:120:28: '\\\\real'
			{
			match("\\real"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REAL"

	// $ANTLR start "RESULT"
	public final void mRESULT() throws RecognitionException {
		try {
			int _type = RESULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:121:26: ( '\\\\result' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:121:28: '\\\\result'
			{
			match("\\result"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RESULT"

	// $ANTLR start "SAME"
	public final void mSAME() throws RecognitionException {
		try {
			int _type = SAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:122:26: ( '\\\\same' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:122:28: '\\\\same'
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

	// $ANTLR start "SEQ"
	public final void mSEQ() throws RecognitionException {
		try {
			int _type = SEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:123:26: ( '\\\\seq' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:123:28: '\\\\seq'
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

	// $ANTLR start "SEQ2MAP"
	public final void mSEQ2MAP() throws RecognitionException {
		try {
			int _type = SEQ2MAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:124:26: ( '\\\\seq_2_map' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:124:28: '\\\\seq_2_map'
			{
			match("\\seq_2_map"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEQ2MAP"

	// $ANTLR start "SEQCONCAT"
	public final void mSEQCONCAT() throws RecognitionException {
		try {
			int _type = SEQCONCAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:125:26: ( '\\\\seq_concat' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:125:28: '\\\\seq_concat'
			{
			match("\\seq_concat"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEQCONCAT"

	// $ANTLR start "SEQDEF"
	public final void mSEQDEF() throws RecognitionException {
		try {
			int _type = SEQDEF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:126:26: ( '\\\\seq_def' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:126:28: '\\\\seq_def'
			{
			match("\\seq_def"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEQDEF"

	// $ANTLR start "SEQEMPTY"
	public final void mSEQEMPTY() throws RecognitionException {
		try {
			int _type = SEQEMPTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:127:26: ( '\\\\seq_empty' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:127:28: '\\\\seq_empty'
			{
			match("\\seq_empty"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEQEMPTY"

	// $ANTLR start "SEQGET"
	public final void mSEQGET() throws RecognitionException {
		try {
			int _type = SEQGET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:128:26: ( '\\\\seq_get' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:128:28: '\\\\seq_get'
			{
			match("\\seq_get"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEQGET"

	// $ANTLR start "SEQREPLACE"
	public final void mSEQREPLACE() throws RecognitionException {
		try {
			int _type = SEQREPLACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:129:26: ( '\\\\seq_put' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:129:28: '\\\\seq_put'
			{
			match("\\seq_put"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEQREPLACE"

	// $ANTLR start "SEQREVERSE"
	public final void mSEQREVERSE() throws RecognitionException {
		try {
			int _type = SEQREVERSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:130:26: ( '\\\\seq_reverse' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:130:28: '\\\\seq_reverse'
			{
			match("\\seq_reverse"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEQREVERSE"

	// $ANTLR start "SEQSINGLETON"
	public final void mSEQSINGLETON() throws RecognitionException {
		try {
			int _type = SEQSINGLETON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:131:26: ( '\\\\seq_singleton' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:131:28: '\\\\seq_singleton'
			{
			match("\\seq_singleton"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEQSINGLETON"

	// $ANTLR start "SEQSUB"
	public final void mSEQSUB() throws RecognitionException {
		try {
			int _type = SEQSUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:132:26: ( '\\\\seq_sub' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:132:28: '\\\\seq_sub'
			{
			match("\\seq_sub"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEQSUB"

	// $ANTLR start "SETMINUS"
	public final void mSETMINUS() throws RecognitionException {
		try {
			int _type = SETMINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:133:26: ( '\\\\set_minus' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:133:28: '\\\\set_minus'
			{
			match("\\set_minus"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SETMINUS"

	// $ANTLR start "SINGLETON"
	public final void mSINGLETON() throws RecognitionException {
		try {
			int _type = SINGLETON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:134:26: ( '\\\\singleton' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:134:28: '\\\\singleton'
			{
			match("\\singleton"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SINGLETON"

	// $ANTLR start "SPACE"
	public final void mSPACE() throws RecognitionException {
		try {
			int _type = SPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:135:26: ( '\\\\space' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:135:28: '\\\\space'
			{
			match("\\space"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPACE"

	// $ANTLR start "STATIC_INVARIANT_FOR"
	public final void mSTATIC_INVARIANT_FOR() throws RecognitionException {
		try {
			int _type = STATIC_INVARIANT_FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:136:26: ( '\\\\static_invariant_for' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:136:28: '\\\\static_invariant_for'
			{
			match("\\static_invariant_for"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATIC_INVARIANT_FOR"

	// $ANTLR start "STRICTLY_NOTHING"
	public final void mSTRICTLY_NOTHING() throws RecognitionException {
		try {
			int _type = STRICTLY_NOTHING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:137:26: ( '\\\\strictly_nothing' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:137:28: '\\\\strictly_nothing'
			{
			match("\\strictly_nothing"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRICTLY_NOTHING"

	// $ANTLR start "STRING_EQUAL"
	public final void mSTRING_EQUAL() throws RecognitionException {
		try {
			int _type = STRING_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:138:26: ( '\\\\string_equal' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:138:28: '\\\\string_equal'
			{
			match("\\string_equal"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_EQUAL"

	// $ANTLR start "SUBSET"
	public final void mSUBSET() throws RecognitionException {
		try {
			int _type = SUBSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:139:26: ( '\\\\subset' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:139:28: '\\\\subset'
			{
			match("\\subset"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUBSET"

	// $ANTLR start "SUCH_THAT"
	public final void mSUCH_THAT() throws RecognitionException {
		try {
			int _type = SUCH_THAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:140:26: ( '\\\\such_that' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:140:28: '\\\\such_that'
			{
			match("\\such_that"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUCH_THAT"

	// $ANTLR start "SUM"
	public final void mSUM() throws RecognitionException {
		try {
			int _type = SUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:141:26: ( '\\\\sum' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:141:28: '\\\\sum'
			{
			match("\\sum"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUM"

	// $ANTLR start "TRANSACTIONUPDATED"
	public final void mTRANSACTIONUPDATED() throws RecognitionException {
		try {
			int _type = TRANSACTIONUPDATED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:142:26: ( '\\\\transactionUpdated' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:142:28: '\\\\transactionUpdated'
			{
			match("\\transactionUpdated"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRANSACTIONUPDATED"

	// $ANTLR start "TRANSIENT"
	public final void mTRANSIENT() throws RecognitionException {
		try {
			int _type = TRANSIENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:143:26: ( '\\\\transient' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:143:28: '\\\\transient'
			{
			match("\\transient"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRANSIENT"

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:144:26: ( '\\\\TYPE' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:144:28: '\\\\TYPE'
			{
			match("\\TYPE"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE"

	// $ANTLR start "TYPEOF"
	public final void mTYPEOF() throws RecognitionException {
		try {
			int _type = TYPEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:145:26: ( '\\\\typeof' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:145:28: '\\\\typeof'
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

	// $ANTLR start "TYPE_SMALL"
	public final void mTYPE_SMALL() throws RecognitionException {
		try {
			int _type = TYPE_SMALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:146:26: ( '\\\\type' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:146:28: '\\\\type'
			{
			match("\\type"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_SMALL"

	// $ANTLR start "UNION"
	public final void mUNION() throws RecognitionException {
		try {
			int _type = UNION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:147:26: ( '\\\\set_union' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:147:28: '\\\\set_union'
			{
			match("\\set_union"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNION"

	// $ANTLR start "UNIONINF"
	public final void mUNIONINF() throws RecognitionException {
		try {
			int _type = UNIONINF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:148:26: ( '\\\\infinite_union' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:148:28: '\\\\infinite_union'
			{
			match("\\infinite_union"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNIONINF"

	// $ANTLR start "VALUES"
	public final void mVALUES() throws RecognitionException {
		try {
			int _type = VALUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:149:26: ( '\\\\values' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:149:28: '\\\\values'
			{
			match("\\values"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VALUES"

	// $ANTLR start "WORKINGSPACE"
	public final void mWORKINGSPACE() throws RecognitionException {
		try {
			int _type = WORKINGSPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:150:26: ( '\\\\working_space' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:150:28: '\\\\working_space'
			{
			match("\\working_space"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WORKINGSPACE"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:156:5: ( '&' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:156:7: '&'
			{
			match('&'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "BITWISENOT"
	public final void mBITWISENOT() throws RecognitionException {
		try {
			int _type = BITWISENOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:157:12: ( '~' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:157:14: '~'
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
	// $ANTLR end "BITWISENOT"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:158:7: ( ':' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:158:9: ':'
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

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:159:7: ( ',' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:159:9: ','
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

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:160:5: ( '/' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:160:7: '/'
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
	// $ANTLR end "DIV"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:161:5: ( '.' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:161:7: '.'
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

	// $ANTLR start "DOTDOT"
	public final void mDOTDOT() throws RecognitionException {
		try {
			int _type = DOTDOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:162:8: ( '..' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:162:10: '..'
			{
			match(".."); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOTDOT"

	// $ANTLR start "EQUAL_SINGLE"
	public final void mEQUAL_SINGLE() throws RecognitionException {
		try {
			int _type = EQUAL_SINGLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:163:14: ( '=' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:163:16: '='
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
	// $ANTLR end "EQUAL_SINGLE"

	// $ANTLR start "EQV_ANTIV"
	public final void mEQV_ANTIV() throws RecognitionException {
		try {
			int _type = EQV_ANTIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:164:10: ( '<==>' | '<=!=>' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='<') ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='=') ) {
					int LA1_2 = input.LA(3);
					if ( (LA1_2=='=') ) {
						alt1=1;
					}
					else if ( (LA1_2=='!') ) {
						alt1=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 2, input);
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
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:164:12: '<==>'
					{
					match("<==>"); if (state.failed) return;

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:164:21: '<=!=>'
					{
					match("<=!=>"); if (state.failed) return;

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
	// $ANTLR end "EQV_ANTIV"

	// $ANTLR start "EQ_NEQ"
	public final void mEQ_NEQ() throws RecognitionException {
		try {
			int _type = EQ_NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:165:8: ( '==' | '!=' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='=') ) {
				alt2=1;
			}
			else if ( (LA2_0=='!') ) {
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
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:165:10: '=='
					{
					match("=="); if (state.failed) return;

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:165:17: '!='
					{
					match("!="); if (state.failed) return;

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
	// $ANTLR end "EQ_NEQ"

	// $ANTLR start "GEQ"
	public final void mGEQ() throws RecognitionException {
		try {
			int _type = GEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:166:5: ( '>=' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:166:7: '>='
			{
			match(">="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GEQ"

	// $ANTLR start "IMPLIES"
	public final void mIMPLIES() throws RecognitionException {
		try {
			int _type = IMPLIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:167:9: ( '==>' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:167:11: '==>'
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
	// $ANTLR end "IMPLIES"

	// $ANTLR start "IMPLIESBACKWARD"
	public final void mIMPLIESBACKWARD() throws RecognitionException {
		try {
			int _type = IMPLIESBACKWARD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:168:17: ( '<==' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:168:19: '<=='
			{
			match("<=="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPLIESBACKWARD"

	// $ANTLR start "INCLUSIVEOR"
	public final void mINCLUSIVEOR() throws RecognitionException {
		try {
			int _type = INCLUSIVEOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:169:13: ( '|' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:169:15: '|'
			{
			match('|'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUSIVEOR"

	// $ANTLR start "LARROW"
	public final void mLARROW() throws RecognitionException {
		try {
			int _type = LARROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:170:8: ( '<-' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:170:10: '<-'
			{
			match("<-"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LARROW"

	// $ANTLR start "LBRACE"
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:171:8: ( '{' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:171:10: '{'
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

	// $ANTLR start "LEQ"
	public final void mLEQ() throws RecognitionException {
		try {
			int _type = LEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:172:5: ( '<=' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:172:7: '<='
			{
			match("<="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEQ"

	// $ANTLR start "LOCKSET_LEQ"
	public final void mLOCKSET_LEQ() throws RecognitionException {
		try {
			int _type = LOCKSET_LEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:173:12: ( '<#=' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:173:14: '<#='
			{
			match("<#="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOCKSET_LEQ"

	// $ANTLR start "LOCKSET_LT"
	public final void mLOCKSET_LT() throws RecognitionException {
		try {
			int _type = LOCKSET_LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:174:11: ( '<#' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:174:13: '<#'
			{
			match("<#"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOCKSET_LT"

	// $ANTLR start "LOGICALAND"
	public final void mLOGICALAND() throws RecognitionException {
		try {
			int _type = LOGICALAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:175:12: ( '&&' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:175:14: '&&'
			{
			match("&&"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOGICALAND"

	// $ANTLR start "LOGICALOR"
	public final void mLOGICALOR() throws RecognitionException {
		try {
			int _type = LOGICALOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:176:11: ( '||' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:176:13: '||'
			{
			match("||"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOGICALOR"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:177:7: ( '-' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:177:9: '-'
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

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:178:5: ( '%' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:178:7: '%'
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
	// $ANTLR end "MOD"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:179:6: ( '*' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:179:8: '*'
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
	// $ANTLR end "MULT"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:180:5: ( '!' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:180:7: '!'
			{
			match('!'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:181:6: ( '+' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:181:8: '+'
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

	// $ANTLR start "QUESTIONMARK"
	public final void mQUESTIONMARK() throws RecognitionException {
		try {
			int _type = QUESTIONMARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:182:14: ( '?' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:182:16: '?'
			{
			match('?'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTIONMARK"

	// $ANTLR start "RBRACE"
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:183:8: ( '}' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:183:10: '}'
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

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:184:6: ( ';' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:184:8: ';'
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

	// $ANTLR start "SHIFTLEFT"
	public final void mSHIFTLEFT() throws RecognitionException {
		try {
			int _type = SHIFTLEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:185:11: ( '<<' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:185:13: '<<'
			{
			match("<<"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHIFTLEFT"

	// $ANTLR start "SHIFTRIGHT"
	public final void mSHIFTRIGHT() throws RecognitionException {
		try {
			int _type = SHIFTRIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:186:12: ( '>>' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:186:14: '>>'
			{
			match(">>"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHIFTRIGHT"

	// $ANTLR start "ST"
	public final void mST() throws RecognitionException {
		try {
			int _type = ST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:187:4: ( '<:' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:187:6: '<:'
			{
			match("<:"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ST"

	// $ANTLR start "UNSIGNEDSHIFTRIGHT"
	public final void mUNSIGNEDSHIFTRIGHT() throws RecognitionException {
		try {
			int _type = UNSIGNEDSHIFTRIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:188:20: ( '>>>' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:188:22: '>>>'
			{
			match(">>>"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNSIGNEDSHIFTRIGHT"

	// $ANTLR start "XOR"
	public final void mXOR() throws RecognitionException {
		try {
			int _type = XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:189:5: ( '^' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:189:7: '^'
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
	// $ANTLR end "XOR"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:191:4: ( '>' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:191:6: '>'
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
	// $ANTLR end "GT"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:192:13: ( '<' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:192:15: '<'
			{
			match('<'); if (state.failed) return;
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LT_IMPLICIT_GT_DISPATCH"
	public final void mLT_IMPLICIT_GT_DISPATCH() throws RecognitionException {
		try {
			int _type = LT_IMPLICIT_GT_DISPATCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:195:5: ( ( LT ( LETTER )+ GT )=> LT ( LETTER )+ GT | LT )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='<') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='$'||(LA4_1 >= 'A' && LA4_1 <= 'Z')||LA4_1=='_'||(LA4_1 >= 'a' && LA4_1 <= 'z')) && (synpred1_KeYJMLLexer())) {
					alt4=1;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:196:7: ( LT ( LETTER )+ GT )=> LT ( LETTER )+ GT
					{
					mLT(); if (state.failed) return;

					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:196:31: ( LETTER )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0=='$'||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:
							{
							if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
							if ( cnt3 >= 1 ) break loop3;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					mGT(); if (state.failed) return;

					if ( state.backtracking==0 ) {_type = IDENT;}
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:198:7: LT
					{
					mLT(); if (state.failed) return;

					if ( state.backtracking==0 ) {_type = LT;}
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
	// $ANTLR end "LT_IMPLICIT_GT_DISPATCH"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:202:2: ( '(' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:203:2: '('
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
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:207:3: ( ')' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:207:3: ')'
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

	// $ANTLR start "LBRACKET"
	public final void mLBRACKET() throws RecognitionException {
		try {
			int _type = LBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:211:2: ( '[' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:212:2: '['
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
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:216:2: ( ']' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:217:2: ']'
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

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:222:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:234:2: ( '0' .. '9' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:
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

	// $ANTLR start "HEXDIGIT"
	public final void mHEXDIGIT() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:240:5: ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEXDIGIT"

	// $ANTLR start "LETTERORDIGIT"
	public final void mLETTERORDIGIT() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:247:5: ( LETTER | DIGIT )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "LETTERORDIGIT"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:252:4: ( LETTER ( LETTERORDIGIT )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:253:4: LETTER ( LETTERORDIGIT )*
			{
			mLETTER(); if (state.failed) return;

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:253:11: ( LETTERORDIGIT )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='$'||(LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop5;
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

	// $ANTLR start "JML_IDENT"
	public final void mJML_IDENT() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:258:3: ( '\\\\' IDENT )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:259:3: '\\\\' IDENT
			{
			match('\\'); if (state.failed) return;
			mIDENT(); if (state.failed) return;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JML_IDENT"

	// $ANTLR start "DL_ESCAPE"
	public final void mDL_ESCAPE() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:262:11: ( '\\\\dl_' LETTER ( LETTERORDIGIT )* )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:263:3: '\\\\dl_' LETTER ( LETTERORDIGIT )*
			{
			match("\\dl_"); if (state.failed) return;

			mLETTER(); if (state.failed) return;

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:263:20: ( LETTERORDIGIT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='$'||(LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DL_ESCAPE"

	// $ANTLR start "BACKSLASH_PREFIXED"
	public final void mBACKSLASH_PREFIXED() throws RecognitionException {
		try {
			int _type = BACKSLASH_PREFIXED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:265:19: ( ( '\\\\dl_' )=> DL_ESCAPE | ( '\\\\nowarn' )=> PRAGMA | JML_IDENT )
			int alt7=3;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\\') ) {
				switch ( input.LA(2) ) {
				case 'd':
					{
					int LA7_2 = input.LA(3);
					if ( (LA7_2=='l') ) {
						int LA7_5 = input.LA(4);
						if ( (LA7_5=='_') ) {
							int LA7_7 = input.LA(5);
							if ( (LA7_7=='$'||(LA7_7 >= 'A' && LA7_7 <= 'Z')||LA7_7=='_'||(LA7_7 >= 'a' && LA7_7 <= 'z')) ) {
								int LA7_9 = input.LA(6);
								if ( (synpred2_KeYJMLLexer()) ) {
									alt7=1;
								}
								else if ( (true) ) {
									alt7=3;
								}

							}

							else {
								alt7=3;
							}

						}

						else {
							alt7=3;
						}

					}

					else {
						alt7=3;
					}

					}
					break;
				case 'n':
					{
					int LA7_3 = input.LA(3);
					if ( (LA7_3=='o') ) {
						int LA7_6 = input.LA(4);
						if ( (LA7_6=='w') ) {
							int LA7_8 = input.LA(5);
							if ( (LA7_8=='a') ) {
								int LA7_10 = input.LA(6);
								if ( (LA7_10=='r') ) {
									int LA7_12 = input.LA(7);
									if ( (LA7_12=='n') ) {
										int LA7_13 = input.LA(8);
										if ( (synpred3_KeYJMLLexer()) ) {
											alt7=2;
										}
										else if ( (true) ) {
											alt7=3;
										}

									}

									else {
										alt7=3;
									}

								}

								else {
									alt7=3;
								}

							}

							else {
								alt7=3;
							}

						}

						else {
							alt7=3;
						}

					}

					else {
						alt7=3;
					}

					}
					break;
				case '$':
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
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
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
					alt7=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:266:4: ( '\\\\dl_' )=> DL_ESCAPE
					{
					mDL_ESCAPE(); if (state.failed) return;

					if ( state.backtracking==0 ) { _type = DL_ESCAPE; }
					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:267:4: ( '\\\\nowarn' )=> PRAGMA
					{
					mPRAGMA(); if (state.failed) return;

					if ( state.backtracking==0 ) { _type = PRAGMA; }
					}
					break;
				case 3 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:268:4: JML_IDENT
					{
					mJML_IDENT(); if (state.failed) return;

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
	// $ANTLR end "BACKSLASH_PREFIXED"

	// $ANTLR start "HEXNUMERAL"
	public final void mHEXNUMERAL() throws RecognitionException {
		try {
			int _type = HEXNUMERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:272:5: ( '0' ( 'x' | 'X' ) ( HEXDIGIT )+ )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:273:9: '0' ( 'x' | 'X' ) ( HEXDIGIT )+
			{
			match('0'); if (state.failed) return;
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:273:23: ( HEXDIGIT )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'F')||(LA8_0 >= 'a' && LA8_0 <= 'f')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:
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
					if ( cnt8 >= 1 ) break loop8;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEXNUMERAL"

	// $ANTLR start "DIGITS"
	public final void mDIGITS() throws RecognitionException {
		try {
			int _type = DIGITS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:277:5: ( ( DIGIT )+ )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:278:9: ( DIGIT )+
			{
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:278:9: ( DIGIT )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:
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
					if ( cnt9 >= 1 ) break loop9;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGITS"

	// $ANTLR start "CHAR_LITERAL"
	public final void mCHAR_LITERAL() throws RecognitionException {
		try {
			int _type = CHAR_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:281:13: ( '\\'' ( ( ' ' .. '&' ) | ( '(' .. '[' ) | ( ']' .. '~' ) | ( '\\\\' ( '\\'' | '\\\\' | 'n' | 'r' | 't' | 'b' | 'f' | '\"' | 'u' ( HEXDIGIT )+ ) ) ) '\\'' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:282:9: '\\'' ( ( ' ' .. '&' ) | ( '(' .. '[' ) | ( ']' .. '~' ) | ( '\\\\' ( '\\'' | '\\\\' | 'n' | 'r' | 't' | 'b' | 'f' | '\"' | 'u' ( HEXDIGIT )+ ) ) ) '\\''
			{
			match('\''); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:283:17: ( ( ' ' .. '&' ) | ( '(' .. '[' ) | ( ']' .. '~' ) | ( '\\\\' ( '\\'' | '\\\\' | 'n' | 'r' | 't' | 'b' | 'f' | '\"' | 'u' ( HEXDIGIT )+ ) ) )
			int alt12=4;
			switch ( input.LA(1) ) {
			case ' ':
			case '!':
			case '\"':
			case '#':
			case '$':
			case '%':
			case '&':
				{
				alt12=1;
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
				alt12=2;
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
				alt12=3;
				}
				break;
			case '\\':
				{
				alt12=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:283:18: ( ' ' .. '&' )
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
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:284:18: ( '(' .. '[' )
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
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:285:18: ( ']' .. '~' )
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
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:286:18: ( '\\\\' ( '\\'' | '\\\\' | 'n' | 'r' | 't' | 'b' | 'f' | '\"' | 'u' ( HEXDIGIT )+ ) )
					{
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:286:18: ( '\\\\' ( '\\'' | '\\\\' | 'n' | 'r' | 't' | 'b' | 'f' | '\"' | 'u' ( HEXDIGIT )+ ) )
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:286:19: '\\\\' ( '\\'' | '\\\\' | 'n' | 'r' | 't' | 'b' | 'f' | '\"' | 'u' ( HEXDIGIT )+ )
					{
					match('\\'); if (state.failed) return;
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:286:24: ( '\\'' | '\\\\' | 'n' | 'r' | 't' | 'b' | 'f' | '\"' | 'u' ( HEXDIGIT )+ )
					int alt11=9;
					switch ( input.LA(1) ) {
					case '\'':
						{
						alt11=1;
						}
						break;
					case '\\':
						{
						alt11=2;
						}
						break;
					case 'n':
						{
						alt11=3;
						}
						break;
					case 'r':
						{
						alt11=4;
						}
						break;
					case 't':
						{
						alt11=5;
						}
						break;
					case 'b':
						{
						alt11=6;
						}
						break;
					case 'f':
						{
						alt11=7;
						}
						break;
					case '\"':
						{
						alt11=8;
						}
						break;
					case 'u':
						{
						alt11=9;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}
					switch (alt11) {
						case 1 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:286:25: '\\''
							{
							match('\''); if (state.failed) return;
							}
							break;
						case 2 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:286:32: '\\\\'
							{
							match('\\'); if (state.failed) return;
							}
							break;
						case 3 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:286:39: 'n'
							{
							match('n'); if (state.failed) return;
							}
							break;
						case 4 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:286:45: 'r'
							{
							match('r'); if (state.failed) return;
							}
							break;
						case 5 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:286:51: 't'
							{
							match('t'); if (state.failed) return;
							}
							break;
						case 6 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:286:57: 'b'
							{
							match('b'); if (state.failed) return;
							}
							break;
						case 7 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:286:63: 'f'
							{
							match('f'); if (state.failed) return;
							}
							break;
						case 8 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:286:69: '\"'
							{
							match('\"'); if (state.failed) return;
							}
							break;
						case 9 :
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:286:75: 'u' ( HEXDIGIT )+
							{
							match('u'); if (state.failed) return;
							// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:286:79: ( HEXDIGIT )+
							int cnt10=0;
							loop10:
							while (true) {
								int alt10=2;
								int LA10_0 = input.LA(1);
								if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'F')||(LA10_0 >= 'a' && LA10_0 <= 'f')) ) {
									alt10=1;
								}

								switch (alt10) {
								case 1 :
									// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:
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
									if ( cnt10 >= 1 ) break loop10;
									if (state.backtracking>0) {state.failed=true; return;}
									EarlyExitException eee = new EarlyExitException(10, input);
									throw eee;
								}
								cnt10++;
							}

							}
							break;

					}

					}

					}
					break;

			}

			match('\''); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_LITERAL"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:292:5: ( '\"' ( ESC |~ ( '\"' | '\\\\' ) )* '\"' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:292:7: '\"' ( ESC |~ ( '\"' | '\\\\' ) )* '\"'
			{
			match('\"'); if (state.failed) return;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:292:11: ( ESC |~ ( '\"' | '\\\\' ) )*
			loop13:
			while (true) {
				int alt13=3;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='\\') ) {
					alt13=1;
				}
				else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '!')||(LA13_0 >= '#' && LA13_0 <= '[')||(LA13_0 >= ']' && LA13_0 <= '\uFFFF')) ) {
					alt13=2;
				}

				switch (alt13) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:292:13: ESC
					{
					mESC(); if (state.failed) return;

					}
					break;
				case 2 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:292:19: ~ ( '\"' | '\\\\' )
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
					break loop13;
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

	// $ANTLR start "ESC"
	public final void mESC() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:297:5: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | ':' | ' ' ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:297:7: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | ':' | ' ' )
			{
			match('\\'); if (state.failed) return;
			if ( input.LA(1)==' '||input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)==':'||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
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
	// $ANTLR end "ESC"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:312:2: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\u000C' | '@' ) )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:312:4: ( ' ' | '\\t' | '\\n' | '\\r' | '\\u000C' | '@' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' '||input.LA(1)=='@' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( state.backtracking==0 ) {_channel=HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "INFORMAL_DESCRIPTION"
	public final void mINFORMAL_DESCRIPTION() throws RecognitionException {
		try {
			int _type = INFORMAL_DESCRIPTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:324:5: ( '(*' ( '*' ~ ')' |~ '*' )* '*)' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:325:9: '(*' ( '*' ~ ')' |~ '*' )* '*)'
			{
			match("(*"); if (state.failed) return;

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:326:9: ( '*' ~ ')' |~ '*' )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='*') ) {
					int LA14_1 = input.LA(2);
					if ( ((LA14_1 >= '\u0000' && LA14_1 <= '(')||(LA14_1 >= '*' && LA14_1 <= '\uFFFF')) ) {
						alt14=1;
					}

				}
				else if ( ((LA14_0 >= '\u0000' && LA14_0 <= ')')||(LA14_0 >= '+' && LA14_0 <= '\uFFFF')) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:327:13: '*' ~ ')'
					{
					match('*'); if (state.failed) return;
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '(')||(input.LA(1) >= '*' && input.LA(1) <= '\uFFFF') ) {
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
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:329:13: ~ '*'
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ')')||(input.LA(1) >= '+' && input.LA(1) <= '\uFFFF') ) {
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
					break loop14;
				}
			}

			match("*)"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INFORMAL_DESCRIPTION"

	// $ANTLR start "SL_COMMENT"
	public final void mSL_COMMENT() throws RecognitionException {
		try {
			int _type = SL_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:335:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:336:5: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); if (state.failed) return;

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:336:10: (~ ( '\\n' | '\\r' ) )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '\uFFFF')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:336:24: ( '\\r' )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='\r') ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:336:24: '\\r'
					{
					match('\r'); if (state.failed) return;
					}
					break;

			}

			match('\n'); if (state.failed) return;
			if ( state.backtracking==0 ) {_channel=HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SL_COMMENT"

	// $ANTLR start "DOC_COMMENT"
	public final void mDOC_COMMENT() throws RecognitionException {
		try {
			int _type = DOC_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:340:2: ( '/**' ( options {greedy=false; } : . )* '*/' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:341:2: '/**' ( options {greedy=false; } : . )* '*/'
			{
			match("/**"); if (state.failed) return;

			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:342:2: ( options {greedy=false; } : . )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0=='*') ) {
					int LA17_1 = input.LA(2);
					if ( (LA17_1=='/') ) {
						alt17=2;
					}
					else if ( ((LA17_1 >= '\u0000' && LA17_1 <= '.')||(LA17_1 >= '0' && LA17_1 <= '\uFFFF')) ) {
						alt17=1;
					}

				}
				else if ( ((LA17_0 >= '\u0000' && LA17_0 <= ')')||(LA17_0 >= '+' && LA17_0 <= '\uFFFF')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:342:30: .
					{
					matchAny(); if (state.failed) return;
					}
					break;

				default :
					break loop17;
				}
			}

			match("*/"); if (state.failed) return;

			if ( state.backtracking==0 ) {_channel=HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOC_COMMENT"

	// $ANTLR start "PRAGMA"
	public final void mPRAGMA() throws RecognitionException {
		try {
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:348:5: ( '\\\\nowarn' )
			// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:349:5: '\\\\nowarn'
			{
			match("\\nowarn"); if (state.failed) return;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRAGMA"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:8: ( BOOLEAN | BYTE | FALSE | INSTANCEOF | INT | LONG | NEW | NULL | SHORT | SUPER | THIS | TRUE | VOID | ACCESSIBLE | ASSIGNABLE | BREAKS | CONTINUES | DECREASES | DEPENDS | DETERMINES | ENSURES | ENSURES_FREE | LOOP_DETERMINES | LOOP_SEPARATES | MODEL_METHOD_AXIOM | NON_NULL | NULLABLE | REPRESENTS | REQUIRES | REQUIRES_FREE | RETURNS | JOIN_PROC | SEPARATES | SIGNALS | SIGNALS_ONLY | ALLFIELDS | ALLOBJECTS | BACKUP | BIGINT | BSUM | BY | DECLASSIFIES | DISJOINT | DOMAIN_IMPLIES_CREATED | DURATION | ELEMTYPE | EMPTYSET | ERASES | EVERYTHING | EXCEPTION | EXISTS | FORALL | FREE | FRESH | INDEX | INDEXOF | INTERSECT | INTO | INV | INVARIANT_FOR | IN_DOMAIN | IS_FINITE | IS_INITIALIZED | ITSELF | LBLNEG | LBLPOS | LOCKSET | LOCSET | MAP | MAPEMPTY | MAP_GET | MAP_OVERRIDE | MAP_REMOVE | MAP_SINGLETON | MAP_SIZE | MAP_UPDATE | MAX | MEASURED_BY | MIN | NEWELEMSFRESH | NEW_OBJECTS | NONNULLELEMENTS | NOTHING | NOT_ASSIGNED | NOT_MODIFIED | NOT_SPECIFIED | NUM_OF | OLD | PERMISSION | PRE | PRODUCT | REACH | REACHLOCS | REAL | RESULT | SAME | SEQ | SEQ2MAP | SEQCONCAT | SEQDEF | SEQEMPTY | SEQGET | SEQREPLACE | SEQREVERSE | SEQSINGLETON | SEQSUB | SETMINUS | SINGLETON | SPACE | STATIC_INVARIANT_FOR | STRICTLY_NOTHING | STRING_EQUAL | SUBSET | SUCH_THAT | SUM | TRANSACTIONUPDATED | TRANSIENT | TYPE | TYPEOF | TYPE_SMALL | UNION | UNIONINF | VALUES | WORKINGSPACE | AND | BITWISENOT | COLON | COMMA | DIV | DOT | DOTDOT | EQUAL_SINGLE | EQV_ANTIV | EQ_NEQ | GEQ | IMPLIES | IMPLIESBACKWARD | INCLUSIVEOR | LARROW | LBRACE | LEQ | LOCKSET_LEQ | LOCKSET_LT | LOGICALAND | LOGICALOR | MINUS | MOD | MULT | NOT | PLUS | QUESTIONMARK | RBRACE | SEMI | SHIFTLEFT | SHIFTRIGHT | ST | UNSIGNEDSHIFTRIGHT | XOR | GT | LT_IMPLICIT_GT_DISPATCH | LPAREN | RPAREN | LBRACKET | RBRACKET | IDENT | BACKSLASH_PREFIXED | HEXNUMERAL | DIGITS | CHAR_LITERAL | STRING_LITERAL | WS | INFORMAL_DESCRIPTION | SL_COMMENT | DOC_COMMENT )
		int alt18=174;
		alt18 = dfa18.predict(input);
		switch (alt18) {
			case 1 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:10: BOOLEAN
				{
				mBOOLEAN(); if (state.failed) return;

				}
				break;
			case 2 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:18: BYTE
				{
				mBYTE(); if (state.failed) return;

				}
				break;
			case 3 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:23: FALSE
				{
				mFALSE(); if (state.failed) return;

				}
				break;
			case 4 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:29: INSTANCEOF
				{
				mINSTANCEOF(); if (state.failed) return;

				}
				break;
			case 5 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:40: INT
				{
				mINT(); if (state.failed) return;

				}
				break;
			case 6 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:44: LONG
				{
				mLONG(); if (state.failed) return;

				}
				break;
			case 7 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:49: NEW
				{
				mNEW(); if (state.failed) return;

				}
				break;
			case 8 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:53: NULL
				{
				mNULL(); if (state.failed) return;

				}
				break;
			case 9 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:58: SHORT
				{
				mSHORT(); if (state.failed) return;

				}
				break;
			case 10 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:64: SUPER
				{
				mSUPER(); if (state.failed) return;

				}
				break;
			case 11 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:70: THIS
				{
				mTHIS(); if (state.failed) return;

				}
				break;
			case 12 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:75: TRUE
				{
				mTRUE(); if (state.failed) return;

				}
				break;
			case 13 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:80: VOID
				{
				mVOID(); if (state.failed) return;

				}
				break;
			case 14 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:85: ACCESSIBLE
				{
				mACCESSIBLE(); if (state.failed) return;

				}
				break;
			case 15 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:96: ASSIGNABLE
				{
				mASSIGNABLE(); if (state.failed) return;

				}
				break;
			case 16 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:107: BREAKS
				{
				mBREAKS(); if (state.failed) return;

				}
				break;
			case 17 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:114: CONTINUES
				{
				mCONTINUES(); if (state.failed) return;

				}
				break;
			case 18 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:124: DECREASES
				{
				mDECREASES(); if (state.failed) return;

				}
				break;
			case 19 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:134: DEPENDS
				{
				mDEPENDS(); if (state.failed) return;

				}
				break;
			case 20 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:142: DETERMINES
				{
				mDETERMINES(); if (state.failed) return;

				}
				break;
			case 21 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:153: ENSURES
				{
				mENSURES(); if (state.failed) return;

				}
				break;
			case 22 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:161: ENSURES_FREE
				{
				mENSURES_FREE(); if (state.failed) return;

				}
				break;
			case 23 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:174: LOOP_DETERMINES
				{
				mLOOP_DETERMINES(); if (state.failed) return;

				}
				break;
			case 24 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:190: LOOP_SEPARATES
				{
				mLOOP_SEPARATES(); if (state.failed) return;

				}
				break;
			case 25 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:205: MODEL_METHOD_AXIOM
				{
				mMODEL_METHOD_AXIOM(); if (state.failed) return;

				}
				break;
			case 26 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:224: NON_NULL
				{
				mNON_NULL(); if (state.failed) return;

				}
				break;
			case 27 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:233: NULLABLE
				{
				mNULLABLE(); if (state.failed) return;

				}
				break;
			case 28 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:242: REPRESENTS
				{
				mREPRESENTS(); if (state.failed) return;

				}
				break;
			case 29 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:253: REQUIRES
				{
				mREQUIRES(); if (state.failed) return;

				}
				break;
			case 30 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:262: REQUIRES_FREE
				{
				mREQUIRES_FREE(); if (state.failed) return;

				}
				break;
			case 31 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:276: RETURNS
				{
				mRETURNS(); if (state.failed) return;

				}
				break;
			case 32 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:284: JOIN_PROC
				{
				mJOIN_PROC(); if (state.failed) return;

				}
				break;
			case 33 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:294: SEPARATES
				{
				mSEPARATES(); if (state.failed) return;

				}
				break;
			case 34 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:304: SIGNALS
				{
				mSIGNALS(); if (state.failed) return;

				}
				break;
			case 35 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:312: SIGNALS_ONLY
				{
				mSIGNALS_ONLY(); if (state.failed) return;

				}
				break;
			case 36 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:325: ALLFIELDS
				{
				mALLFIELDS(); if (state.failed) return;

				}
				break;
			case 37 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:335: ALLOBJECTS
				{
				mALLOBJECTS(); if (state.failed) return;

				}
				break;
			case 38 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:346: BACKUP
				{
				mBACKUP(); if (state.failed) return;

				}
				break;
			case 39 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:353: BIGINT
				{
				mBIGINT(); if (state.failed) return;

				}
				break;
			case 40 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:360: BSUM
				{
				mBSUM(); if (state.failed) return;

				}
				break;
			case 41 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:365: BY
				{
				mBY(); if (state.failed) return;

				}
				break;
			case 42 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:368: DECLASSIFIES
				{
				mDECLASSIFIES(); if (state.failed) return;

				}
				break;
			case 43 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:381: DISJOINT
				{
				mDISJOINT(); if (state.failed) return;

				}
				break;
			case 44 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:390: DOMAIN_IMPLIES_CREATED
				{
				mDOMAIN_IMPLIES_CREATED(); if (state.failed) return;

				}
				break;
			case 45 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:413: DURATION
				{
				mDURATION(); if (state.failed) return;

				}
				break;
			case 46 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:422: ELEMTYPE
				{
				mELEMTYPE(); if (state.failed) return;

				}
				break;
			case 47 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:431: EMPTYSET
				{
				mEMPTYSET(); if (state.failed) return;

				}
				break;
			case 48 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:440: ERASES
				{
				mERASES(); if (state.failed) return;

				}
				break;
			case 49 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:447: EVERYTHING
				{
				mEVERYTHING(); if (state.failed) return;

				}
				break;
			case 50 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:458: EXCEPTION
				{
				mEXCEPTION(); if (state.failed) return;

				}
				break;
			case 51 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:468: EXISTS
				{
				mEXISTS(); if (state.failed) return;

				}
				break;
			case 52 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:475: FORALL
				{
				mFORALL(); if (state.failed) return;

				}
				break;
			case 53 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:482: FREE
				{
				mFREE(); if (state.failed) return;

				}
				break;
			case 54 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:487: FRESH
				{
				mFRESH(); if (state.failed) return;

				}
				break;
			case 55 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:493: INDEX
				{
				mINDEX(); if (state.failed) return;

				}
				break;
			case 56 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:499: INDEXOF
				{
				mINDEXOF(); if (state.failed) return;

				}
				break;
			case 57 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:507: INTERSECT
				{
				mINTERSECT(); if (state.failed) return;

				}
				break;
			case 58 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:517: INTO
				{
				mINTO(); if (state.failed) return;

				}
				break;
			case 59 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:522: INV
				{
				mINV(); if (state.failed) return;

				}
				break;
			case 60 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:526: INVARIANT_FOR
				{
				mINVARIANT_FOR(); if (state.failed) return;

				}
				break;
			case 61 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:540: IN_DOMAIN
				{
				mIN_DOMAIN(); if (state.failed) return;

				}
				break;
			case 62 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:550: IS_FINITE
				{
				mIS_FINITE(); if (state.failed) return;

				}
				break;
			case 63 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:560: IS_INITIALIZED
				{
				mIS_INITIALIZED(); if (state.failed) return;

				}
				break;
			case 64 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:575: ITSELF
				{
				mITSELF(); if (state.failed) return;

				}
				break;
			case 65 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:582: LBLNEG
				{
				mLBLNEG(); if (state.failed) return;

				}
				break;
			case 66 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:589: LBLPOS
				{
				mLBLPOS(); if (state.failed) return;

				}
				break;
			case 67 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:596: LOCKSET
				{
				mLOCKSET(); if (state.failed) return;

				}
				break;
			case 68 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:604: LOCSET
				{
				mLOCSET(); if (state.failed) return;

				}
				break;
			case 69 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:611: MAP
				{
				mMAP(); if (state.failed) return;

				}
				break;
			case 70 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:615: MAPEMPTY
				{
				mMAPEMPTY(); if (state.failed) return;

				}
				break;
			case 71 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:624: MAP_GET
				{
				mMAP_GET(); if (state.failed) return;

				}
				break;
			case 72 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:632: MAP_OVERRIDE
				{
				mMAP_OVERRIDE(); if (state.failed) return;

				}
				break;
			case 73 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:645: MAP_REMOVE
				{
				mMAP_REMOVE(); if (state.failed) return;

				}
				break;
			case 74 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:656: MAP_SINGLETON
				{
				mMAP_SINGLETON(); if (state.failed) return;

				}
				break;
			case 75 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:670: MAP_SIZE
				{
				mMAP_SIZE(); if (state.failed) return;

				}
				break;
			case 76 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:679: MAP_UPDATE
				{
				mMAP_UPDATE(); if (state.failed) return;

				}
				break;
			case 77 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:690: MAX
				{
				mMAX(); if (state.failed) return;

				}
				break;
			case 78 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:694: MEASURED_BY
				{
				mMEASURED_BY(); if (state.failed) return;

				}
				break;
			case 79 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:706: MIN
				{
				mMIN(); if (state.failed) return;

				}
				break;
			case 80 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:710: NEWELEMSFRESH
				{
				mNEWELEMSFRESH(); if (state.failed) return;

				}
				break;
			case 81 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:724: NEW_OBJECTS
				{
				mNEW_OBJECTS(); if (state.failed) return;

				}
				break;
			case 82 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:736: NONNULLELEMENTS
				{
				mNONNULLELEMENTS(); if (state.failed) return;

				}
				break;
			case 83 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:752: NOTHING
				{
				mNOTHING(); if (state.failed) return;

				}
				break;
			case 84 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:760: NOT_ASSIGNED
				{
				mNOT_ASSIGNED(); if (state.failed) return;

				}
				break;
			case 85 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:773: NOT_MODIFIED
				{
				mNOT_MODIFIED(); if (state.failed) return;

				}
				break;
			case 86 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:786: NOT_SPECIFIED
				{
				mNOT_SPECIFIED(); if (state.failed) return;

				}
				break;
			case 87 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:800: NUM_OF
				{
				mNUM_OF(); if (state.failed) return;

				}
				break;
			case 88 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:807: OLD
				{
				mOLD(); if (state.failed) return;

				}
				break;
			case 89 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:811: PERMISSION
				{
				mPERMISSION(); if (state.failed) return;

				}
				break;
			case 90 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:822: PRE
				{
				mPRE(); if (state.failed) return;

				}
				break;
			case 91 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:826: PRODUCT
				{
				mPRODUCT(); if (state.failed) return;

				}
				break;
			case 92 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:834: REACH
				{
				mREACH(); if (state.failed) return;

				}
				break;
			case 93 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:840: REACHLOCS
				{
				mREACHLOCS(); if (state.failed) return;

				}
				break;
			case 94 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:850: REAL
				{
				mREAL(); if (state.failed) return;

				}
				break;
			case 95 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:855: RESULT
				{
				mRESULT(); if (state.failed) return;

				}
				break;
			case 96 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:862: SAME
				{
				mSAME(); if (state.failed) return;

				}
				break;
			case 97 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:867: SEQ
				{
				mSEQ(); if (state.failed) return;

				}
				break;
			case 98 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:871: SEQ2MAP
				{
				mSEQ2MAP(); if (state.failed) return;

				}
				break;
			case 99 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:879: SEQCONCAT
				{
				mSEQCONCAT(); if (state.failed) return;

				}
				break;
			case 100 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:889: SEQDEF
				{
				mSEQDEF(); if (state.failed) return;

				}
				break;
			case 101 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:896: SEQEMPTY
				{
				mSEQEMPTY(); if (state.failed) return;

				}
				break;
			case 102 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:905: SEQGET
				{
				mSEQGET(); if (state.failed) return;

				}
				break;
			case 103 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:912: SEQREPLACE
				{
				mSEQREPLACE(); if (state.failed) return;

				}
				break;
			case 104 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:923: SEQREVERSE
				{
				mSEQREVERSE(); if (state.failed) return;

				}
				break;
			case 105 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:934: SEQSINGLETON
				{
				mSEQSINGLETON(); if (state.failed) return;

				}
				break;
			case 106 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:947: SEQSUB
				{
				mSEQSUB(); if (state.failed) return;

				}
				break;
			case 107 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:954: SETMINUS
				{
				mSETMINUS(); if (state.failed) return;

				}
				break;
			case 108 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:963: SINGLETON
				{
				mSINGLETON(); if (state.failed) return;

				}
				break;
			case 109 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:973: SPACE
				{
				mSPACE(); if (state.failed) return;

				}
				break;
			case 110 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:979: STATIC_INVARIANT_FOR
				{
				mSTATIC_INVARIANT_FOR(); if (state.failed) return;

				}
				break;
			case 111 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1000: STRICTLY_NOTHING
				{
				mSTRICTLY_NOTHING(); if (state.failed) return;

				}
				break;
			case 112 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1017: STRING_EQUAL
				{
				mSTRING_EQUAL(); if (state.failed) return;

				}
				break;
			case 113 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1030: SUBSET
				{
				mSUBSET(); if (state.failed) return;

				}
				break;
			case 114 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1037: SUCH_THAT
				{
				mSUCH_THAT(); if (state.failed) return;

				}
				break;
			case 115 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1047: SUM
				{
				mSUM(); if (state.failed) return;

				}
				break;
			case 116 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1051: TRANSACTIONUPDATED
				{
				mTRANSACTIONUPDATED(); if (state.failed) return;

				}
				break;
			case 117 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1070: TRANSIENT
				{
				mTRANSIENT(); if (state.failed) return;

				}
				break;
			case 118 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1080: TYPE
				{
				mTYPE(); if (state.failed) return;

				}
				break;
			case 119 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1085: TYPEOF
				{
				mTYPEOF(); if (state.failed) return;

				}
				break;
			case 120 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1092: TYPE_SMALL
				{
				mTYPE_SMALL(); if (state.failed) return;

				}
				break;
			case 121 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1103: UNION
				{
				mUNION(); if (state.failed) return;

				}
				break;
			case 122 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1109: UNIONINF
				{
				mUNIONINF(); if (state.failed) return;

				}
				break;
			case 123 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1118: VALUES
				{
				mVALUES(); if (state.failed) return;

				}
				break;
			case 124 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1125: WORKINGSPACE
				{
				mWORKINGSPACE(); if (state.failed) return;

				}
				break;
			case 125 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1138: AND
				{
				mAND(); if (state.failed) return;

				}
				break;
			case 126 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1142: BITWISENOT
				{
				mBITWISENOT(); if (state.failed) return;

				}
				break;
			case 127 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1153: COLON
				{
				mCOLON(); if (state.failed) return;

				}
				break;
			case 128 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1159: COMMA
				{
				mCOMMA(); if (state.failed) return;

				}
				break;
			case 129 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1165: DIV
				{
				mDIV(); if (state.failed) return;

				}
				break;
			case 130 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1169: DOT
				{
				mDOT(); if (state.failed) return;

				}
				break;
			case 131 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1173: DOTDOT
				{
				mDOTDOT(); if (state.failed) return;

				}
				break;
			case 132 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1180: EQUAL_SINGLE
				{
				mEQUAL_SINGLE(); if (state.failed) return;

				}
				break;
			case 133 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1193: EQV_ANTIV
				{
				mEQV_ANTIV(); if (state.failed) return;

				}
				break;
			case 134 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1203: EQ_NEQ
				{
				mEQ_NEQ(); if (state.failed) return;

				}
				break;
			case 135 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1210: GEQ
				{
				mGEQ(); if (state.failed) return;

				}
				break;
			case 136 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1214: IMPLIES
				{
				mIMPLIES(); if (state.failed) return;

				}
				break;
			case 137 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1222: IMPLIESBACKWARD
				{
				mIMPLIESBACKWARD(); if (state.failed) return;

				}
				break;
			case 138 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1238: INCLUSIVEOR
				{
				mINCLUSIVEOR(); if (state.failed) return;

				}
				break;
			case 139 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1250: LARROW
				{
				mLARROW(); if (state.failed) return;

				}
				break;
			case 140 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1257: LBRACE
				{
				mLBRACE(); if (state.failed) return;

				}
				break;
			case 141 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1264: LEQ
				{
				mLEQ(); if (state.failed) return;

				}
				break;
			case 142 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1268: LOCKSET_LEQ
				{
				mLOCKSET_LEQ(); if (state.failed) return;

				}
				break;
			case 143 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1280: LOCKSET_LT
				{
				mLOCKSET_LT(); if (state.failed) return;

				}
				break;
			case 144 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1291: LOGICALAND
				{
				mLOGICALAND(); if (state.failed) return;

				}
				break;
			case 145 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1302: LOGICALOR
				{
				mLOGICALOR(); if (state.failed) return;

				}
				break;
			case 146 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1312: MINUS
				{
				mMINUS(); if (state.failed) return;

				}
				break;
			case 147 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1318: MOD
				{
				mMOD(); if (state.failed) return;

				}
				break;
			case 148 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1322: MULT
				{
				mMULT(); if (state.failed) return;

				}
				break;
			case 149 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1327: NOT
				{
				mNOT(); if (state.failed) return;

				}
				break;
			case 150 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1331: PLUS
				{
				mPLUS(); if (state.failed) return;

				}
				break;
			case 151 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1336: QUESTIONMARK
				{
				mQUESTIONMARK(); if (state.failed) return;

				}
				break;
			case 152 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1349: RBRACE
				{
				mRBRACE(); if (state.failed) return;

				}
				break;
			case 153 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1356: SEMI
				{
				mSEMI(); if (state.failed) return;

				}
				break;
			case 154 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1361: SHIFTLEFT
				{
				mSHIFTLEFT(); if (state.failed) return;

				}
				break;
			case 155 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1371: SHIFTRIGHT
				{
				mSHIFTRIGHT(); if (state.failed) return;

				}
				break;
			case 156 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1382: ST
				{
				mST(); if (state.failed) return;

				}
				break;
			case 157 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1385: UNSIGNEDSHIFTRIGHT
				{
				mUNSIGNEDSHIFTRIGHT(); if (state.failed) return;

				}
				break;
			case 158 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1404: XOR
				{
				mXOR(); if (state.failed) return;

				}
				break;
			case 159 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1408: GT
				{
				mGT(); if (state.failed) return;

				}
				break;
			case 160 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1411: LT_IMPLICIT_GT_DISPATCH
				{
				mLT_IMPLICIT_GT_DISPATCH(); if (state.failed) return;

				}
				break;
			case 161 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1435: LPAREN
				{
				mLPAREN(); if (state.failed) return;

				}
				break;
			case 162 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1442: RPAREN
				{
				mRPAREN(); if (state.failed) return;

				}
				break;
			case 163 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1449: LBRACKET
				{
				mLBRACKET(); if (state.failed) return;

				}
				break;
			case 164 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1458: RBRACKET
				{
				mRBRACKET(); if (state.failed) return;

				}
				break;
			case 165 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1467: IDENT
				{
				mIDENT(); if (state.failed) return;

				}
				break;
			case 166 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1473: BACKSLASH_PREFIXED
				{
				mBACKSLASH_PREFIXED(); if (state.failed) return;

				}
				break;
			case 167 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1492: HEXNUMERAL
				{
				mHEXNUMERAL(); if (state.failed) return;

				}
				break;
			case 168 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1503: DIGITS
				{
				mDIGITS(); if (state.failed) return;

				}
				break;
			case 169 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1510: CHAR_LITERAL
				{
				mCHAR_LITERAL(); if (state.failed) return;

				}
				break;
			case 170 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1523: STRING_LITERAL
				{
				mSTRING_LITERAL(); if (state.failed) return;

				}
				break;
			case 171 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1538: WS
				{
				mWS(); if (state.failed) return;

				}
				break;
			case 172 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1541: INFORMAL_DESCRIPTION
				{
				mINFORMAL_DESCRIPTION(); if (state.failed) return;

				}
				break;
			case 173 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1562: SL_COMMENT
				{
				mSL_COMMENT(); if (state.failed) return;

				}
				break;
			case 174 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:1:1573: DOC_COMMENT
				{
				mDOC_COMMENT(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred1_KeYJMLLexer
	public final void synpred1_KeYJMLLexer_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:196:7: ( LT ( LETTER )+ GT )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:196:8: LT ( LETTER )+ GT
		{
		mLT(); if (state.failed) return;

		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:196:11: ( LETTER )+
		int cnt19=0;
		loop19:
		while (true) {
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='$'||(LA19_0 >= 'A' && LA19_0 <= 'Z')||LA19_0=='_'||(LA19_0 >= 'a' && LA19_0 <= 'z')) ) {
				alt19=1;
			}

			switch (alt19) {
			case 1 :
				// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:
				{
				if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

		mGT(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_KeYJMLLexer

	// $ANTLR start synpred2_KeYJMLLexer
	public final void synpred2_KeYJMLLexer_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:266:4: ( '\\\\dl_' )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:266:5: '\\\\dl_'
		{
		match("\\dl_"); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_KeYJMLLexer

	// $ANTLR start synpred3_KeYJMLLexer
	public final void synpred3_KeYJMLLexer_fragment() throws RecognitionException {
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:267:4: ( '\\\\nowarn' )
		// /home/hudson/jobs/KeY 2.6/workspace/key/key.core/src/de/uka/ilkd/key/speclang/jml/translation/KeYJMLLexer.g:267:5: '\\\\nowarn'
		{
		match("\\nowarn"); if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_KeYJMLLexer

	public final boolean synpred1_KeYJMLLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_KeYJMLLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_KeYJMLLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_KeYJMLLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_KeYJMLLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_KeYJMLLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA18 dfa18 = new DFA18(this);
	static final String DFA18_eotS =
		"\1\uffff\17\51\1\uffff\1\132\3\uffff\1\135\1\137\1\141\1\147\1\151\1\154"+
		"\1\156\11\uffff\1\160\4\uffff\1\53\4\uffff\30\51\21\130\10\uffff\1\150"+
		"\1\uffff\1\u00bd\1\uffff\1\u00bf\6\uffff\1\u00c1\6\uffff\5\51\1\u00c7"+
		"\2\51\1\u00ca\25\51\4\130\1\u00e4\45\130\1\uffff\1\u0117\6\uffff\1\51"+
		"\1\u0119\3\51\1\uffff\1\u011d\1\51\1\uffff\1\u0120\5\51\1\u0126\1\u0127"+
		"\1\u0128\14\51\4\130\1\uffff\16\130\1\u014a\4\130\1\u0151\10\130\1\u015a"+
		"\2\130\1\u0160\1\u0161\1\130\1\u0163\4\130\1\u0169\1\130\1\u016b\10\130"+
		"\1\uffff\1\51\1\uffff\1\51\1\u0177\1\51\1\uffff\2\51\1\uffff\1\51\1\u017d"+
		"\1\u017e\2\51\3\uffff\14\51\3\130\1\u0191\13\130\1\u019d\3\130\1\u01a1"+
		"\1\130\1\uffff\6\130\1\uffff\1\130\1\u01b3\6\130\1\uffff\5\130\2\uffff"+
		"\1\130\1\uffff\5\130\1\uffff\1\130\1\uffff\2\130\1\u01d1\2\130\1\u01d5"+
		"\1\u01d6\2\130\1\51\1\u01da\1\uffff\5\51\2\uffff\16\51\4\130\1\uffff\5"+
		"\130\1\u01f7\5\130\1\uffff\1\u01fd\1\u01fe\1\130\1\uffff\21\130\1\uffff"+
		"\1\130\1\u0213\32\130\1\u022f\1\uffff\3\130\2\uffff\2\130\1\u0236\1\uffff"+
		"\6\51\1\u023e\4\51\1\u0243\1\51\1\u0246\3\51\1\u024a\1\51\2\130\1\u024e"+
		"\1\u024f\5\130\1\uffff\1\u0255\2\130\1\u0258\1\u0259\2\uffff\6\130\1\u0260"+
		"\15\130\1\uffff\3\130\1\u0271\1\130\1\u0273\1\u0274\1\130\1\u0276\16\130"+
		"\1\u0286\3\130\1\uffff\1\u028a\2\130\1\u028d\1\u028e\1\130\1\uffff\3\51"+
		"\1\u0293\1\u0294\2\51\1\uffff\4\51\1\uffff\2\51\1\uffff\2\51\1\u02a0\1"+
		"\uffff\1\51\2\130\2\uffff\5\130\1\uffff\2\130\2\uffff\6\130\1\uffff\3"+
		"\130\1\u02b4\1\130\1\u02b6\1\u02b7\2\130\1\u02ba\6\130\1\uffff\1\130\2"+
		"\uffff\1\u02c2\1\uffff\1\130\1\u02c4\11\130\1\u02ce\3\130\1\uffff\1\130"+
		"\1\u02d3\1\130\1\uffff\2\130\2\uffff\1\130\3\51\2\uffff\1\u02db\3\51\1"+
		"\u02df\1\u02e0\5\51\1\uffff\1\u02e6\3\130\1\u02ea\1\130\1\u02ec\1\u02ed"+
		"\13\130\1\uffff\1\130\2\uffff\2\130\1\uffff\7\130\1\uffff\1\130\1\uffff"+
		"\3\130\1\u0307\5\130\1\uffff\4\130\1\uffff\4\130\1\u0315\2\51\1\uffff"+
		"\1\51\1\u0319\1\u031a\2\uffff\1\u031b\2\51\1\u031e\1\51\1\uffff\3\130"+
		"\1\uffff\1\130\2\uffff\1\130\1\u0325\1\u0326\1\130\1\u0328\1\130\1\u032a"+
		"\2\130\1\u032d\1\130\1\u032f\2\130\1\u0332\1\u0333\1\u0334\3\130\1\u0338"+
		"\1\u0339\3\130\1\uffff\11\130\1\u0346\1\130\1\u0348\1\130\1\uffff\3\51"+
		"\3\uffff\2\51\1\uffff\1\51\1\u0350\3\130\1\u0354\2\uffff\1\130\1\uffff"+
		"\1\130\1\uffff\2\130\1\uffff\1\u0359\1\uffff\2\130\3\uffff\3\130\2\uffff"+
		"\1\130\1\u0360\1\130\1\u0362\7\130\1\u036a\1\uffff\1\130\1\uffff\1\130"+
		"\2\51\1\u036f\1\u0370\2\51\1\uffff\1\u0373\2\130\1\uffff\3\130\1\u0379"+
		"\1\uffff\1\u037a\5\130\1\uffff\1\130\1\uffff\1\u0381\1\130\1\u0383\4\130"+
		"\1\uffff\2\130\2\51\2\uffff\1\51\1\u038d\1\uffff\1\u038e\4\130\2\uffff"+
		"\3\130\1\u0396\1\u0397\1\130\1\uffff\1\130\1\uffff\1\130\1\u039b\1\u039c"+
		"\3\130\1\51\1\u03a1\1\51\2\uffff\1\130\1\u03a4\2\130\1\u03a7\2\130\2\uffff"+
		"\1\u03aa\2\130\2\uffff\1\u03ad\1\130\1\u03af\1\u03b0\1\uffff\1\51\1\130"+
		"\1\uffff\1\u03b3\1\u03b4\1\uffff\2\130\1\uffff\2\130\1\uffff\1\130\2\uffff"+
		"\1\51\1\130\2\uffff\2\130\1\u03be\1\u03bf\1\130\1\51\2\130\1\u03c4\2\uffff"+
		"\1\130\1\u03c6\2\130\1\uffff\1\130\1\uffff\2\130\1\u03cc\2\130\1\uffff"+
		"\1\130\1\u03d0\1\130\1\uffff\1\u03d2\1\uffff";
	static final String DFA18_eofS =
		"\u03d3\uffff";
	static final String DFA18_minS =
		"\1\11\1\157\1\141\1\156\1\157\2\145\1\150\1\157\1\143\1\157\1\145\1\156"+
		"\1\157\1\145\1\157\1\44\1\46\3\uffff\1\52\1\56\1\75\1\43\2\75\1\174\11"+
		"\uffff\1\52\4\uffff\1\130\4\uffff\1\157\1\164\1\145\1\154\1\163\1\156"+
		"\1\167\1\154\1\156\1\157\2\160\1\147\1\151\1\165\1\151\1\143\1\163\1\156"+
		"\1\143\1\163\1\144\1\160\1\151\1\154\1\141\1\145\1\154\1\157\1\156\1\141"+
		"\1\142\1\141\1\145\1\154\2\145\1\162\1\131\1\141\1\157\10\uffff\1\76\1"+
		"\uffff\1\41\1\uffff\1\75\6\uffff\1\76\6\uffff\1\154\1\145\1\141\1\163"+
		"\1\164\1\44\1\147\1\160\1\44\1\154\1\137\1\162\1\145\1\141\1\156\1\163"+
		"\1\145\1\144\1\145\1\151\1\164\1\162\2\145\1\165\1\145\1\162\2\165\1\156"+
		"\1\154\1\143\1\147\1\165\1\44\1\143\1\163\1\155\1\162\1\145\1\160\1\141"+
		"\1\145\1\143\1\162\1\145\2\137\1\163\1\161\1\155\1\156\2\141\1\142\1\154"+
		"\1\143\1\160\1\141\1\156\1\167\1\156\1\155\1\144\1\162\1\145\2\141\1\160"+
		"\1\120\1\154\1\162\1\uffff\1\76\6\uffff\1\145\1\44\1\153\1\145\1\141\1"+
		"\uffff\1\44\1\137\1\uffff\1\44\1\156\1\164\2\162\1\141\3\44\1\163\1\147"+
		"\1\151\1\145\1\156\2\162\1\154\1\145\1\151\1\162\2\137\1\153\1\151\1\155"+
		"\1\uffff\1\154\1\152\2\141\1\155\1\164\1\163\1\162\1\145\1\163\1\141\3"+
		"\145\1\44\1\144\1\151\1\146\1\145\1\44\1\137\1\145\1\147\1\143\1\164\1"+
		"\151\1\163\1\150\1\44\1\156\1\153\2\44\1\163\1\44\1\137\1\156\2\137\1"+
		"\44\1\155\1\44\1\144\1\143\1\165\1\156\1\145\1\105\1\165\1\153\1\uffff"+
		"\1\141\1\uffff\1\163\1\44\1\156\1\uffff\1\144\1\142\1\uffff\1\165\2\44"+
		"\1\141\1\154\3\uffff\1\163\2\156\1\141\1\144\1\155\1\145\1\137\1\163\1"+
		"\162\1\156\1\160\1\146\1\165\1\156\1\44\1\141\1\157\1\151\2\164\1\171"+
		"\1\145\1\171\1\160\1\164\1\154\1\44\1\150\1\170\1\162\1\44\1\162\1\uffff"+
		"\1\157\1\156\1\151\1\156\1\154\1\62\1\uffff\1\155\1\44\1\154\1\145\1\151"+
		"\1\143\1\145\1\137\1\uffff\1\145\1\157\1\163\2\145\2\uffff\1\165\1\uffff"+
		"\1\145\1\165\1\151\1\141\1\157\1\uffff\1\151\1\uffff\1\165\1\150\1\44"+
		"\1\154\1\163\2\44\1\145\1\151\1\156\1\44\1\uffff\1\143\2\145\2\154\2\uffff"+
		"\1\164\1\163\1\151\1\141\1\165\2\163\1\151\1\163\1\155\2\145\1\163\1\162"+
		"\1\151\1\142\1\160\1\164\1\uffff\1\163\1\151\1\156\1\151\1\171\1\44\1"+
		"\163\2\164\1\163\1\154\1\uffff\2\44\1\163\1\uffff\1\151\1\155\1\151\1"+
		"\156\1\151\1\146\1\156\1\137\1\157\1\145\1\155\1\145\1\165\1\145\2\151"+
		"\1\156\1\uffff\1\145\1\44\1\143\1\164\1\147\2\164\1\147\1\163\1\145\1"+
		"\164\1\155\1\145\1\166\1\145\1\151\1\160\1\162\1\154\1\142\1\154\1\156"+
		"\1\163\1\157\1\160\1\146\1\163\1\143\1\44\1\uffff\1\164\1\141\1\146\2"+
		"\uffff\1\163\1\156\1\44\1\uffff\1\145\1\164\1\160\1\145\1\154\1\145\1"+
		"\44\2\142\2\145\1\44\1\156\1\44\1\145\1\156\1\163\1\44\1\157\1\145\1\152"+
		"\2\44\1\163\1\156\1\137\1\157\1\160\1\uffff\1\44\1\150\1\151\2\44\2\uffff"+
		"\1\145\2\141\1\164\1\151\1\164\1\44\1\144\1\155\1\156\1\146\1\160\2\164"+
		"\1\166\1\156\1\142\1\156\1\151\1\164\1\uffff\1\137\1\154\1\137\1\44\1"+
		"\150\2\44\1\164\1\44\1\160\1\164\1\145\1\155\1\156\1\144\2\145\1\152\1"+
		"\154\1\147\1\163\1\144\1\145\1\44\1\163\1\164\1\157\1\uffff\1\44\1\143"+
		"\1\145\2\44\1\147\1\uffff\1\157\1\145\1\141\2\44\1\163\1\157\1\uffff\2"+
		"\154\2\163\1\uffff\1\145\1\146\1\uffff\2\164\1\44\1\uffff\1\143\1\154"+
		"\1\145\2\uffff\1\151\1\164\1\151\1\156\1\145\1\uffff\1\151\1\157\2\uffff"+
		"\1\143\1\156\1\151\1\145\1\164\1\151\1\uffff\1\145\1\141\1\143\1\44\1"+
		"\164\2\44\1\145\1\147\1\44\1\165\2\157\1\151\1\171\1\145\1\uffff\1\141"+
		"\2\uffff\1\44\1\uffff\1\164\1\44\1\162\1\157\1\147\1\145\1\141\1\144\1"+
		"\155\2\145\1\44\2\151\1\143\1\uffff\1\151\1\44\1\143\1\uffff\1\164\1\156"+
		"\2\uffff\1\137\1\146\2\162\2\uffff\1\44\1\156\2\145\2\44\1\163\1\162\1"+
		"\150\1\163\1\146\1\uffff\1\44\1\144\1\143\1\146\1\44\1\155\2\44\2\156"+
		"\2\164\1\156\1\137\1\145\1\141\1\170\1\160\1\141\1\uffff\1\171\2\uffff"+
		"\1\162\1\154\1\uffff\1\163\3\156\1\137\1\161\1\164\1\uffff\1\171\1\uffff"+
		"\1\162\1\166\1\154\1\44\1\164\1\137\1\163\1\143\1\154\1\uffff\1\147\1"+
		"\146\1\151\1\157\1\uffff\1\163\1\151\1\164\1\163\1\44\1\155\1\141\1\uffff"+
		"\1\154\2\44\2\uffff\1\44\1\145\1\157\1\44\1\162\1\uffff\1\163\1\164\1"+
		"\151\1\uffff\1\160\2\uffff\1\147\2\44\1\137\1\44\1\165\1\44\1\154\1\117"+
		"\1\44\1\164\1\44\1\163\1\145\3\44\1\166\1\156\1\165\2\44\1\151\2\145\1"+
		"\uffff\1\145\1\142\1\137\1\164\1\145\1\156\1\151\1\146\1\156\1\44\1\157"+
		"\1\44\1\160\1\uffff\1\151\1\164\1\171\3\uffff\1\145\1\144\1\uffff\1\145"+
		"\1\44\1\163\1\145\1\154\1\44\2\uffff\1\146\1\uffff\1\156\1\uffff\1\151"+
		"\1\146\1\uffff\1\44\1\uffff\1\145\1\164\3\uffff\1\141\1\157\1\141\2\uffff"+
		"\1\144\1\44\1\164\1\44\1\171\1\146\1\163\1\155\2\145\1\151\1\44\1\uffff"+
		"\1\156\1\uffff\1\141\1\156\1\145\2\44\1\137\1\145\1\uffff\1\44\1\163\1"+
		"\151\1\uffff\1\157\1\151\1\172\1\44\1\uffff\1\44\1\157\1\162\1\164\1\154"+
		"\1\145\1\uffff\1\157\1\uffff\1\44\1\162\1\44\1\145\2\144\1\145\1\uffff"+
		"\1\125\1\143\1\145\1\163\2\uffff\1\141\1\44\1\uffff\1\44\1\145\1\162\1"+
		"\157\1\145\2\uffff\1\156\1\151\1\150\2\44\1\156\1\uffff\1\145\1\uffff"+
		"\1\156\2\44\1\144\1\160\1\145\1\163\1\44\1\170\2\uffff\1\163\1\44\1\156"+
		"\1\144\1\44\1\141\1\151\2\uffff\1\44\1\163\1\164\2\uffff\1\44\1\144\2"+
		"\44\1\uffff\1\151\1\137\1\uffff\2\44\1\uffff\2\156\1\uffff\1\150\1\163"+
		"\1\uffff\1\141\2\uffff\1\157\1\143\2\uffff\1\164\1\147\2\44\1\164\1\155"+
		"\1\162\1\137\1\44\2\uffff\1\145\1\44\1\145\1\146\1\uffff\1\144\1\uffff"+
		"\1\141\1\157\1\44\1\164\1\162\1\uffff\1\145\1\44\1\144\1\uffff\1\44\1"+
		"\uffff";
	static final String DFA18_maxS =
		"\1\176\1\171\1\141\1\156\1\157\2\165\1\162\1\157\1\163\1\157\1\145\1\156"+
		"\1\157\1\145\1\157\1\172\1\46\3\uffff\1\57\1\56\3\75\1\76\1\174\11\uffff"+
		"\1\52\4\uffff\1\170\4\uffff\1\157\1\164\1\145\1\154\1\164\1\157\1\167"+
		"\1\154\1\156\1\157\2\160\1\147\1\151\1\165\1\151\1\143\1\163\1\156\1\164"+
		"\1\163\1\144\1\164\1\151\1\154\1\171\1\165\1\170\1\162\1\164\1\165\1\157"+
		"\1\151\1\165\1\154\1\162\1\145\1\171\1\131\1\141\1\157\10\uffff\1\76\1"+
		"\uffff\1\75\1\uffff\1\75\6\uffff\1\76\6\uffff\1\154\1\145\1\141\1\163"+
		"\1\164\1\172\1\147\1\160\1\172\1\154\1\137\1\162\1\145\1\141\1\156\1\163"+
		"\1\145\1\144\1\145\1\151\1\164\1\162\2\145\1\165\1\145\1\162\2\165\1\156"+
		"\1\154\1\143\1\147\1\165\1\172\1\143\1\163\1\155\1\162\1\145\1\160\1\141"+
		"\1\145\1\151\1\162\1\145\1\166\1\137\1\163\1\164\1\155\1\156\1\141\1\162"+
		"\1\155\1\154\1\143\1\170\1\141\1\156\1\167\1\164\1\155\1\144\1\162\1\157"+
		"\1\163\1\141\1\160\1\120\1\154\1\162\1\uffff\1\76\6\uffff\1\145\1\172"+
		"\1\153\1\145\1\141\1\uffff\1\172\1\137\1\uffff\1\172\1\156\1\164\2\162"+
		"\1\141\3\172\1\163\1\147\1\151\1\145\1\156\2\162\1\154\1\145\1\151\1\162"+
		"\2\137\1\153\1\151\1\155\1\uffff\1\154\1\152\2\141\1\155\1\164\1\163\1"+
		"\162\1\145\1\163\1\141\1\163\1\145\1\157\1\172\1\144\2\151\1\145\1\172"+
		"\1\137\1\145\1\147\1\143\1\164\1\151\1\163\1\150\1\172\1\160\1\163\2\172"+
		"\1\163\1\172\1\137\1\156\1\150\1\137\1\172\1\155\1\172\1\144\1\154\1\165"+
		"\1\156\1\145\1\105\1\165\1\153\1\uffff\1\141\1\uffff\1\163\1\172\1\156"+
		"\1\uffff\1\163\1\142\1\uffff\1\165\2\172\1\141\1\154\3\uffff\1\163\2\156"+
		"\1\141\1\144\1\155\1\145\1\137\1\163\1\162\1\156\1\160\1\157\1\165\1\156"+
		"\1\172\1\141\1\157\1\151\2\164\1\171\1\145\1\171\1\160\1\164\1\154\1\172"+
		"\1\150\1\170\1\162\1\172\1\162\1\uffff\1\157\1\156\1\151\1\156\1\154\1"+
		"\163\1\uffff\1\165\1\172\1\154\1\145\1\151\1\156\1\145\1\137\1\uffff\1"+
		"\145\1\157\1\163\1\145\1\165\2\uffff\1\165\1\uffff\1\157\1\165\1\151\1"+
		"\163\1\157\1\uffff\1\151\1\uffff\1\165\1\150\1\172\1\154\1\163\2\172\1"+
		"\145\1\151\1\156\1\172\1\uffff\1\143\2\145\2\154\2\uffff\1\164\1\163\1"+
		"\151\1\141\1\165\2\163\1\151\1\163\1\155\2\145\1\163\1\162\1\151\1\142"+
		"\1\160\1\164\1\uffff\1\163\1\151\1\156\1\151\1\171\1\172\1\163\2\164\1"+
		"\163\1\154\1\uffff\2\172\1\163\1\uffff\1\151\1\155\1\151\1\156\1\151\1"+
		"\146\1\156\1\137\1\157\1\145\1\155\1\145\1\165\1\145\1\165\1\151\1\156"+
		"\1\uffff\1\145\1\172\1\143\1\164\1\147\2\164\1\147\1\163\1\145\1\164\1"+
		"\155\1\145\1\166\1\145\1\151\1\160\1\162\1\154\1\142\1\154\1\156\1\163"+
		"\1\157\1\160\1\146\1\163\1\143\1\172\1\uffff\1\164\1\151\1\146\2\uffff"+
		"\1\163\1\156\1\172\1\uffff\1\145\1\164\1\160\1\145\1\154\1\145\1\172\2"+
		"\142\2\145\1\172\1\156\1\172\1\145\1\156\1\163\1\172\1\157\1\145\1\152"+
		"\2\172\1\163\1\156\1\137\1\157\1\160\1\uffff\1\172\1\150\1\151\2\172\2"+
		"\uffff\1\145\2\141\1\164\1\151\1\164\1\172\1\144\1\155\1\156\1\146\1\160"+
		"\2\164\1\166\1\156\1\142\1\156\1\151\1\164\1\uffff\1\137\1\154\1\137\1"+
		"\172\1\150\2\172\1\164\1\172\1\160\1\164\1\145\1\155\1\172\1\144\2\145"+
		"\1\152\1\154\1\147\1\163\1\144\1\145\1\172\1\163\1\164\1\157\1\uffff\1"+
		"\172\1\143\1\145\2\172\1\147\1\uffff\1\157\1\145\1\141\2\172\1\163\1\157"+
		"\1\uffff\2\154\2\163\1\uffff\1\145\1\146\1\uffff\2\164\1\172\1\uffff\1"+
		"\143\1\154\1\145\2\uffff\1\151\1\164\1\151\1\156\1\145\1\uffff\1\151\1"+
		"\157\2\uffff\1\143\1\156\1\151\1\145\1\164\1\151\1\uffff\1\145\1\141\1"+
		"\143\1\172\1\164\2\172\1\145\1\147\1\172\1\165\2\157\1\151\1\171\1\145"+
		"\1\uffff\1\141\2\uffff\1\172\1\uffff\1\164\1\172\1\162\1\157\1\147\1\145"+
		"\1\141\1\144\1\155\2\145\1\172\2\151\1\143\1\uffff\1\151\1\172\1\143\1"+
		"\uffff\1\164\1\156\2\uffff\1\137\1\146\2\162\2\uffff\1\172\1\156\2\145"+
		"\2\172\1\163\1\162\1\150\1\163\1\146\1\uffff\1\172\1\144\1\143\1\146\1"+
		"\172\1\155\2\172\2\156\2\164\1\156\1\137\1\145\1\141\1\170\1\160\1\141"+
		"\1\uffff\1\171\2\uffff\1\162\1\154\1\uffff\1\163\3\156\1\137\1\161\1\164"+
		"\1\uffff\1\171\1\uffff\1\162\1\166\1\154\1\172\1\164\1\137\1\163\1\143"+
		"\1\154\1\uffff\1\147\1\146\1\151\1\157\1\uffff\1\163\1\151\1\164\1\163"+
		"\1\172\1\155\1\141\1\uffff\1\154\2\172\2\uffff\1\172\1\145\1\157\1\172"+
		"\1\162\1\uffff\1\163\1\164\1\151\1\uffff\1\160\2\uffff\1\147\2\172\1\137"+
		"\1\172\1\165\1\172\1\154\1\117\1\172\1\164\1\172\1\163\1\145\3\172\1\166"+
		"\1\156\1\165\2\172\1\151\2\145\1\uffff\1\145\1\142\1\137\1\164\1\145\1"+
		"\156\1\151\1\146\1\156\1\172\1\157\1\172\1\160\1\uffff\1\151\1\164\1\171"+
		"\3\uffff\1\145\1\144\1\uffff\1\145\1\172\1\163\1\145\1\154\1\172\2\uffff"+
		"\1\146\1\uffff\1\156\1\uffff\1\151\1\146\1\uffff\1\172\1\uffff\1\145\1"+
		"\164\3\uffff\1\141\1\157\1\141\2\uffff\1\144\1\172\1\164\1\172\1\171\1"+
		"\146\1\163\1\155\2\145\1\151\1\172\1\uffff\1\156\1\uffff\1\141\1\156\1"+
		"\145\2\172\1\137\1\145\1\uffff\1\172\1\163\1\151\1\uffff\1\157\1\151\2"+
		"\172\1\uffff\1\172\1\157\1\162\1\164\1\154\1\145\1\uffff\1\157\1\uffff"+
		"\1\172\1\162\1\172\1\145\2\144\1\145\1\uffff\1\125\1\143\1\145\1\163\2"+
		"\uffff\1\141\1\172\1\uffff\1\172\1\145\1\162\1\157\1\145\2\uffff\1\156"+
		"\1\151\1\150\2\172\1\156\1\uffff\1\145\1\uffff\1\156\2\172\1\144\1\160"+
		"\1\145\1\163\1\172\1\170\2\uffff\1\163\1\172\1\156\1\144\1\172\1\141\1"+
		"\151\2\uffff\1\172\1\163\1\164\2\uffff\1\172\1\144\2\172\1\uffff\1\151"+
		"\1\137\1\uffff\2\172\1\uffff\2\156\1\uffff\1\150\1\163\1\uffff\1\141\2"+
		"\uffff\1\157\1\143\2\uffff\1\164\1\147\2\172\1\164\1\155\1\162\1\137\1"+
		"\172\2\uffff\1\145\1\172\1\145\1\146\1\uffff\1\144\1\uffff\1\141\1\157"+
		"\1\172\1\164\1\162\1\uffff\1\145\1\172\1\144\1\uffff\1\172\1\uffff";
	static final String DFA18_acceptS =
		"\22\uffff\1\176\1\177\1\u0080\7\uffff\1\u008c\1\u0092\1\u0093\1\u0094"+
		"\1\u0096\1\u0097\1\u0098\1\u0099\1\u009e\1\uffff\1\u00a2\1\u00a3\1\u00a4"+
		"\1\u00a5\1\uffff\1\u00a8\1\u00a9\1\u00aa\1\u00ab\51\uffff\1\u00a6\1\u0090"+
		"\1\175\1\u00ad\1\u00ae\1\u0081\1\u0083\1\u0082\1\uffff\1\u0084\1\uffff"+
		"\1\u008b\1\uffff\1\u009a\1\u009c\1\u00a0\1\u0086\1\u0095\1\u0087\1\uffff"+
		"\1\u009f\1\u0091\1\u008a\1\u00ac\1\u00a1\1\u00a7\110\uffff\1\u0088\1\uffff"+
		"\1\u0085\1\u008d\1\u008e\1\u008f\1\u009d\1\u009b\5\uffff\1\5\2\uffff\1"+
		"\7\31\uffff\1\51\62\uffff\1\u0089\1\uffff\1\2\3\uffff\1\6\2\uffff\1\10"+
		"\5\uffff\1\13\1\14\1\15\41\uffff\1\73\6\uffff\1\141\10\uffff\1\163\5\uffff"+
		"\1\105\1\115\1\uffff\1\117\5\uffff\1\130\1\uffff\1\132\13\uffff\1\3\5"+
		"\uffff\1\11\1\12\22\uffff\1\50\13\uffff\1\65\3\uffff\1\72\21\uffff\1\140"+
		"\35\uffff\1\136\3\uffff\1\170\1\166\3\uffff\1\20\34\uffff\1\57\5\uffff"+
		"\1\66\1\67\24\uffff\1\155\33\uffff\1\134\6\uffff\1\1\7\uffff\1\42\4\uffff"+
		"\1\23\2\uffff\1\25\3\uffff\1\37\3\uffff\1\46\1\47\5\uffff\1\60\2\uffff"+
		"\1\63\1\64\6\uffff\1\100\20\uffff\1\161\1\uffff\1\101\1\102\1\uffff\1"+
		"\104\17\uffff\1\127\3\uffff\1\137\2\uffff\1\167\1\173\4\uffff\1\33\1\32"+
		"\13\uffff\1\35\23\uffff\1\144\1\uffff\1\146\1\147\2\uffff\1\152\7\uffff"+
		"\1\103\1\uffff\1\107\11\uffff\1\123\4\uffff\1\133\7\uffff\1\41\3\uffff"+
		"\1\21\1\22\5\uffff\1\40\3\uffff\1\53\1\uffff\1\55\1\56\31\uffff\1\113"+
		"\15\uffff\1\4\3\uffff\1\16\1\17\1\24\2\uffff\1\34\6\uffff\1\62\1\71\1"+
		"\uffff\1\75\1\uffff\1\76\2\uffff\1\142\1\uffff\1\145\2\uffff\1\153\1\171"+
		"\1\154\3\uffff\1\162\1\106\14\uffff\1\135\1\uffff\1\165\7\uffff\1\44\3"+
		"\uffff\1\61\4\uffff\1\143\6\uffff\1\111\1\uffff\1\114\7\uffff\1\131\4"+
		"\uffff\1\43\1\26\2\uffff\1\45\5\uffff\1\70\1\150\6\uffff\1\116\1\uffff"+
		"\1\121\11\uffff\1\36\1\52\7\uffff\1\160\1\110\3\uffff\1\124\1\125\4\uffff"+
		"\1\30\2\uffff\1\74\2\uffff\1\151\2\uffff\1\112\2\uffff\1\126\1\uffff\1"+
		"\174\1\27\2\uffff\1\172\1\77\11\uffff\1\120\1\122\4\uffff\1\157\1\uffff"+
		"\1\31\5\uffff\1\164\3\uffff\1\156\1\uffff\1\54";
	static final String DFA18_specialS =
		"\u03d3\uffff}>";
	static final String[] DFA18_transitionS = {
			"\2\56\1\uffff\2\56\22\uffff\1\56\1\31\1\55\1\uffff\1\51\1\36\1\21\1\54"+
			"\1\45\1\46\1\37\1\40\1\24\1\35\1\26\1\25\1\52\11\53\1\23\1\43\1\30\1"+
			"\27\1\32\1\41\1\56\32\51\1\47\1\20\1\50\1\44\1\51\1\uffff\1\11\1\1\1"+
			"\12\1\13\1\14\1\2\2\51\1\3\1\17\1\51\1\4\1\15\1\5\3\51\1\16\1\6\1\7\1"+
			"\51\1\10\4\51\1\34\1\33\1\42\1\22",
			"\1\57\2\uffff\1\61\6\uffff\1\60",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65\11\uffff\1\67\5\uffff\1\66",
			"\1\72\2\uffff\1\70\1\73\13\uffff\1\71",
			"\1\74\11\uffff\1\75",
			"\1\76",
			"\1\77\17\uffff\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\130\34\uffff\23\130\1\125\6\130\4\uffff\1\130\1\uffff\1\107\1\110"+
			"\1\130\1\111\1\112\1\113\2\130\1\114\2\130\1\116\1\117\1\120\1\121\1"+
			"\122\1\130\1\123\1\115\1\124\1\130\1\126\1\127\3\130",
			"\1\131",
			"",
			"",
			"",
			"\1\134\4\uffff\1\133",
			"\1\136",
			"\1\140",
			"\1\144\11\uffff\1\143\14\uffff\1\146\1\uffff\1\145\1\142",
			"\1\150",
			"\1\152\1\153",
			"\1\155",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\157",
			"",
			"",
			"",
			"",
			"\1\161\37\uffff\1\161",
			"",
			"",
			"",
			"",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166\1\167",
			"\1\170\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087\14\uffff\1\u0088\3\uffff\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c\1\u008d\2\uffff\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091\7\uffff\1\u0092\11\uffff\1\u0093\5\uffff\1\u0094",
			"\1\u0095\3\uffff\1\u0096\5\uffff\1\u0097\5\uffff\1\u0098",
			"\1\u0099\1\u009a\4\uffff\1\u009b\3\uffff\1\u009c\1\uffff\1\u009d",
			"\1\u009e\2\uffff\1\u009f",
			"\1\u00a0\4\uffff\1\u00a1\1\u00a2",
			"\1\u00a4\3\uffff\1\u00a3\3\uffff\1\u00a5\6\uffff\1\u00a6\3\uffff\1\u00a7"+
			"\1\u00a8",
			"\1\u00a9\14\uffff\1\u00aa",
			"\1\u00ab\3\uffff\1\u00ac\3\uffff\1\u00ad",
			"\1\u00ae\11\uffff\1\u00af\5\uffff\1\u00b0",
			"\1\u00b1",
			"\1\u00b2\14\uffff\1\u00b3",
			"\1\u00b4",
			"\1\u00b5\6\uffff\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00ba",
			"",
			"\1\u00bc\33\uffff\1\u00bb",
			"",
			"\1\u00be",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00c0",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u00c8",
			"\1\u00c9",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ed\5\uffff\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f4\4\uffff\1\u00f1\1\uffff\1\u00f5\15\uffff\1\u00f2\1\uffff\1"+
			"\u00f3",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8\2\uffff\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd\20\uffff\1\u00fe",
			"\1\u00ff\1\u0100\11\uffff\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104\7\uffff\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109\5\uffff\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e\11\uffff\1\u010f",
			"\1\u0110\21\uffff\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\u0115",
			"\1\u0116",
			"",
			"\1\u00bc",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0118",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u011e",
			"",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\1\u011f\31\51",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"\1\u0125",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
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
			"",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144\15\uffff\1\u0145",
			"\1\u0146",
			"\1\u0147\11\uffff\1\u0148",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\1\u0149"+
			"\31\130",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d\2\uffff\1\u014e",
			"\1\u014f",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\u0150\1\uffff\32\130",
			"\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u015b\1\uffff\1\u015c",
			"\1\u015d\7\uffff\1\u015e",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\u015f\1\uffff\32\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0162",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0164",
			"\1\u0165",
			"\1\u0167\10\uffff\1\u0166",
			"\1\u0168",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u016a",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u016c",
			"\1\u016d\10\uffff\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"",
			"\1\u0175",
			"",
			"\1\u0176",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u0178",
			"",
			"\1\u0179\16\uffff\1\u017a",
			"\1\u017b",
			"",
			"\1\u017c",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u017f",
			"\1\u0180",
			"",
			"",
			"",
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
			"\1\u018c",
			"\1\u018d\10\uffff\1\u018e",
			"\1\u018f",
			"\1\u0190",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
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
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u019e",
			"\1\u019f",
			"\1\u01a0",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u01a2",
			"",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a6",
			"\1\u01a7",
			"\1\u01a9\60\uffff\1\u01aa\1\u01ab\1\u01ac\1\uffff\1\u01ad\1\uffff\1"+
			"\u01a8\6\uffff\1\u01ae\1\uffff\1\u01af\1\u01b0",
			"",
			"\1\u01b1\7\uffff\1\u01b2",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u01b4",
			"\1\u01b5",
			"\1\u01b6",
			"\1\u01b7\12\uffff\1\u01b8",
			"\1\u01b9",
			"\1\u01ba",
			"",
			"\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
			"\1\u01bf\1\uffff\1\u01c0\7\uffff\1\u01c1\2\uffff\1\u01c2\1\u01c3\1\uffff"+
			"\1\u01c4",
			"",
			"",
			"\1\u01c5",
			"",
			"\1\u01c6\11\uffff\1\u01c7",
			"\1\u01c8",
			"\1\u01c9",
			"\1\u01ca\13\uffff\1\u01cb\5\uffff\1\u01cc",
			"\1\u01cd",
			"",
			"\1\u01ce",
			"",
			"\1\u01cf",
			"\1\u01d0",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u01d2",
			"\1\u01d3",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\16\130\1"+
			"\u01d4\13\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u01d7",
			"\1\u01d8",
			"\1\u01d9",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"\1\u01db",
			"\1\u01dc",
			"\1\u01dd",
			"\1\u01de",
			"\1\u01df",
			"",
			"",
			"\1\u01e0",
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
			"",
			"\1\u01f2",
			"\1\u01f3",
			"\1\u01f4",
			"\1\u01f5",
			"\1\u01f6",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u01f8",
			"\1\u01f9",
			"\1\u01fa",
			"\1\u01fb",
			"\1\u01fc",
			"",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
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
			"\1\u020e\13\uffff\1\u020f",
			"\1\u0210",
			"\1\u0211",
			"",
			"\1\u0212",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0214",
			"\1\u0215",
			"\1\u0216",
			"\1\u0217",
			"\1\u0218",
			"\1\u0219",
			"\1\u021a",
			"\1\u021b",
			"\1\u021c",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\1\u0221",
			"\1\u0222",
			"\1\u0223",
			"\1\u0224",
			"\1\u0225",
			"\1\u0226",
			"\1\u0227",
			"\1\u0228",
			"\1\u0229",
			"\1\u022a",
			"\1\u022b",
			"\1\u022c",
			"\1\u022d",
			"\1\130\13\uffff\12\130\7\uffff\13\130\1\u022e\16\130\4\uffff\1\130\1"+
			"\uffff\32\130",
			"",
			"\1\u0230",
			"\1\u0231\7\uffff\1\u0232",
			"\1\u0233",
			"",
			"",
			"\1\u0234",
			"\1\u0235",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"\1\u0237",
			"\1\u0238",
			"\1\u0239",
			"\1\u023a",
			"\1\u023b",
			"\1\u023c",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\u023d\1\uffff\32\51",
			"\1\u023f",
			"\1\u0240",
			"\1\u0241",
			"\1\u0242",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u0244",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\u0245\1\uffff\32\51",
			"\1\u0247",
			"\1\u0248",
			"\1\u0249",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0250",
			"\1\u0251",
			"\1\u0252",
			"\1\u0253",
			"\1\u0254",
			"",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0256",
			"\1\u0257",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"",
			"",
			"\1\u025a",
			"\1\u025b",
			"\1\u025c",
			"\1\u025d",
			"\1\u025e",
			"\1\u025f",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0261",
			"\1\u0262",
			"\1\u0263",
			"\1\u0264",
			"\1\u0265",
			"\1\u0266",
			"\1\u0267",
			"\1\u0268",
			"\1\u0269",
			"\1\u026a",
			"\1\u026b",
			"\1\u026c",
			"\1\u026d",
			"",
			"\1\u026e",
			"\1\u026f",
			"\1\u0270",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0272",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0275",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0277",
			"\1\u0278",
			"\1\u0279",
			"\1\u027a",
			"\1\u027b\13\uffff\1\u027c",
			"\1\u027d",
			"\1\u027e",
			"\1\u027f",
			"\1\u0280",
			"\1\u0281",
			"\1\u0282",
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0287",
			"\1\u0288",
			"\1\u0289",
			"",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u028b",
			"\1\u028c",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u028f",
			"",
			"\1\u0290",
			"\1\u0291",
			"\1\u0292",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u0295",
			"\1\u0296",
			"",
			"\1\u0297",
			"\1\u0298",
			"\1\u0299",
			"\1\u029a",
			"",
			"\1\u029b",
			"\1\u029c",
			"",
			"\1\u029d",
			"\1\u029e",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\u029f\1\uffff\32\51",
			"",
			"\1\u02a1",
			"\1\u02a2",
			"\1\u02a3",
			"",
			"",
			"\1\u02a4",
			"\1\u02a5",
			"\1\u02a6",
			"\1\u02a7",
			"\1\u02a8",
			"",
			"\1\u02a9",
			"\1\u02aa",
			"",
			"",
			"\1\u02ab",
			"\1\u02ac",
			"\1\u02ad",
			"\1\u02ae",
			"\1\u02af",
			"\1\u02b0",
			"",
			"\1\u02b1",
			"\1\u02b2",
			"\1\u02b3",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u02b5",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u02b8",
			"\1\u02b9",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u02bb",
			"\1\u02bc",
			"\1\u02bd",
			"\1\u02be",
			"\1\u02bf",
			"\1\u02c0",
			"",
			"\1\u02c1",
			"",
			"",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"",
			"\1\u02c3",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u02c5",
			"\1\u02c6",
			"\1\u02c7",
			"\1\u02c8",
			"\1\u02c9",
			"\1\u02ca",
			"\1\u02cb",
			"\1\u02cc",
			"\1\u02cd",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u02cf",
			"\1\u02d0",
			"\1\u02d1",
			"",
			"\1\u02d2",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u02d4",
			"",
			"\1\u02d5",
			"\1\u02d6",
			"",
			"",
			"\1\u02d7",
			"\1\u02d8",
			"\1\u02d9",
			"\1\u02da",
			"",
			"",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u02dc",
			"\1\u02dd",
			"\1\u02de",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u02e1",
			"\1\u02e2",
			"\1\u02e3",
			"\1\u02e4",
			"\1\u02e5",
			"",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u02e7",
			"\1\u02e8",
			"\1\u02e9",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u02eb",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
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
			"\1\u02f8",
			"",
			"\1\u02f9",
			"",
			"",
			"\1\u02fa",
			"\1\u02fb",
			"",
			"\1\u02fc",
			"\1\u02fd",
			"\1\u02fe",
			"\1\u02ff",
			"\1\u0300",
			"\1\u0301",
			"\1\u0302",
			"",
			"\1\u0303",
			"",
			"\1\u0304",
			"\1\u0305",
			"\1\u0306",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0308",
			"\1\u0309",
			"\1\u030a",
			"\1\u030b",
			"\1\u030c",
			"",
			"\1\u030d",
			"\1\u030e",
			"\1\u030f",
			"\1\u0310",
			"",
			"\1\u0311",
			"\1\u0312",
			"\1\u0313",
			"\1\u0314",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u0316",
			"\1\u0317",
			"",
			"\1\u0318",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u031c",
			"\1\u031d",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u031f",
			"",
			"\1\u0320",
			"\1\u0321",
			"\1\u0322",
			"",
			"\1\u0323",
			"",
			"",
			"\1\u0324",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0327",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0329",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u032b",
			"\1\u032c",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u032e",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0330",
			"\1\u0331",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0335",
			"\1\u0336",
			"\1\u0337",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u033a",
			"\1\u033b",
			"\1\u033c",
			"",
			"\1\u033d",
			"\1\u033e",
			"\1\u033f",
			"\1\u0340",
			"\1\u0341",
			"\1\u0342",
			"\1\u0343",
			"\1\u0344",
			"\1\u0345",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0347",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0349",
			"",
			"\1\u034a",
			"\1\u034b",
			"\1\u034c",
			"",
			"",
			"",
			"\1\u034d",
			"\1\u034e",
			"",
			"\1\u034f",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0351",
			"\1\u0352",
			"\1\u0353",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"",
			"",
			"\1\u0355",
			"",
			"\1\u0356",
			"",
			"\1\u0357",
			"\1\u0358",
			"",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"",
			"\1\u035a",
			"\1\u035b",
			"",
			"",
			"",
			"\1\u035c",
			"\1\u035d",
			"\1\u035e",
			"",
			"",
			"\1\u035f",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0361",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0363",
			"\1\u0364",
			"\1\u0365",
			"\1\u0366",
			"\1\u0367",
			"\1\u0368",
			"\1\u0369",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"",
			"\1\u036b",
			"",
			"\1\u036c",
			"\1\u036d",
			"\1\u036e",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u0371",
			"\1\u0372",
			"",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0374",
			"\1\u0375",
			"",
			"\1\u0376",
			"\1\u0377",
			"\1\u0378",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u037b",
			"\1\u037c",
			"\1\u037d",
			"\1\u037e",
			"\1\u037f",
			"",
			"\1\u0380",
			"",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0382",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0384",
			"\1\u0385",
			"\1\u0386",
			"\1\u0387",
			"",
			"\1\u0388",
			"\1\u0389",
			"\1\u038a",
			"\1\u038b",
			"",
			"",
			"\1\u038c",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u038f",
			"\1\u0390",
			"\1\u0391",
			"\1\u0392",
			"",
			"",
			"\1\u0393",
			"\1\u0394",
			"\1\u0395",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u0398",
			"",
			"\1\u0399",
			"",
			"\1\u039a",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u039d",
			"\1\u039e",
			"\1\u039f",
			"\1\u03a0",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u03a2",
			"",
			"",
			"\1\u03a3",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u03a5",
			"\1\u03a6",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u03a8",
			"\1\u03a9",
			"",
			"",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u03ab",
			"\1\u03ac",
			"",
			"",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u03ae",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"\1\u03b1",
			"\1\u03b2",
			"",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"",
			"\1\u03b5",
			"\1\u03b6",
			"",
			"\1\u03b7",
			"\1\u03b8",
			"",
			"\1\u03b9",
			"",
			"",
			"\1\u03ba",
			"\1\u03bb",
			"",
			"",
			"\1\u03bc",
			"\1\u03bd",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u03c0",
			"\1\u03c1",
			"\1\u03c2",
			"\1\u03c3",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"",
			"",
			"\1\u03c5",
			"\1\51\13\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u03c7",
			"\1\u03c8",
			"",
			"\1\u03c9",
			"",
			"\1\u03ca",
			"\1\u03cb",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u03cd",
			"\1\u03ce",
			"",
			"\1\u03cf",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
			"\1\u03d1",
			"",
			"\1\130\13\uffff\12\130\7\uffff\32\130\4\uffff\1\130\1\uffff\32\130",
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
			return "1:1: Tokens : ( BOOLEAN | BYTE | FALSE | INSTANCEOF | INT | LONG | NEW | NULL | SHORT | SUPER | THIS | TRUE | VOID | ACCESSIBLE | ASSIGNABLE | BREAKS | CONTINUES | DECREASES | DEPENDS | DETERMINES | ENSURES | ENSURES_FREE | LOOP_DETERMINES | LOOP_SEPARATES | MODEL_METHOD_AXIOM | NON_NULL | NULLABLE | REPRESENTS | REQUIRES | REQUIRES_FREE | RETURNS | JOIN_PROC | SEPARATES | SIGNALS | SIGNALS_ONLY | ALLFIELDS | ALLOBJECTS | BACKUP | BIGINT | BSUM | BY | DECLASSIFIES | DISJOINT | DOMAIN_IMPLIES_CREATED | DURATION | ELEMTYPE | EMPTYSET | ERASES | EVERYTHING | EXCEPTION | EXISTS | FORALL | FREE | FRESH | INDEX | INDEXOF | INTERSECT | INTO | INV | INVARIANT_FOR | IN_DOMAIN | IS_FINITE | IS_INITIALIZED | ITSELF | LBLNEG | LBLPOS | LOCKSET | LOCSET | MAP | MAPEMPTY | MAP_GET | MAP_OVERRIDE | MAP_REMOVE | MAP_SINGLETON | MAP_SIZE | MAP_UPDATE | MAX | MEASURED_BY | MIN | NEWELEMSFRESH | NEW_OBJECTS | NONNULLELEMENTS | NOTHING | NOT_ASSIGNED | NOT_MODIFIED | NOT_SPECIFIED | NUM_OF | OLD | PERMISSION | PRE | PRODUCT | REACH | REACHLOCS | REAL | RESULT | SAME | SEQ | SEQ2MAP | SEQCONCAT | SEQDEF | SEQEMPTY | SEQGET | SEQREPLACE | SEQREVERSE | SEQSINGLETON | SEQSUB | SETMINUS | SINGLETON | SPACE | STATIC_INVARIANT_FOR | STRICTLY_NOTHING | STRING_EQUAL | SUBSET | SUCH_THAT | SUM | TRANSACTIONUPDATED | TRANSIENT | TYPE | TYPEOF | TYPE_SMALL | UNION | UNIONINF | VALUES | WORKINGSPACE | AND | BITWISENOT | COLON | COMMA | DIV | DOT | DOTDOT | EQUAL_SINGLE | EQV_ANTIV | EQ_NEQ | GEQ | IMPLIES | IMPLIESBACKWARD | INCLUSIVEOR | LARROW | LBRACE | LEQ | LOCKSET_LEQ | LOCKSET_LT | LOGICALAND | LOGICALOR | MINUS | MOD | MULT | NOT | PLUS | QUESTIONMARK | RBRACE | SEMI | SHIFTLEFT | SHIFTRIGHT | ST | UNSIGNEDSHIFTRIGHT | XOR | GT | LT_IMPLICIT_GT_DISPATCH | LPAREN | RPAREN | LBRACKET | RBRACKET | IDENT | BACKSLASH_PREFIXED | HEXNUMERAL | DIGITS | CHAR_LITERAL | STRING_LITERAL | WS | INFORMAL_DESCRIPTION | SL_COMMENT | DOC_COMMENT );";
		}
	}

}
