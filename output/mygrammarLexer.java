// $ANTLR 3.5 /Users/Anya/github/compiler-theory/mygrammar.g 2013-02-15 14:17:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mygrammarLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int ARGS=4;
	public static final int ASSIGN=5;
	public static final int CHAR=6;
	public static final int COMMA=7;
	public static final int DECS=8;
	public static final int DIGIT=9;
	public static final int DIV=10;
	public static final int EQ=11;
	public static final int EXPR=12;
	public static final int GT=13;
	public static final int GTE=14;
	public static final int ID=15;
	public static final int INCLS=16;
	public static final int LBRACE=17;
	public static final int LPAREN=18;
	public static final int LT=19;
	public static final int LTE=20;
	public static final int MAIN=21;
	public static final int MINUS=22;
	public static final int MOD=23;
	public static final int NEQ=24;
	public static final int NUMBER=25;
	public static final int PLUS=26;
	public static final int RBRACE=27;
	public static final int RPAREN=28;
	public static final int SEMICOLON=29;
	public static final int STMTS=30;
	public static final int STRING=31;
	public static final int TIMES=32;
	public static final int WS=33;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public mygrammarLexer() {} 
	public mygrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public mygrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/Anya/github/compiler-theory/mygrammar.g"; }

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:2:8: ( '=' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:2:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:3:7: ( ',' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:3:9: ','
			{
			match(','); 
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
			// /Users/Anya/github/compiler-theory/mygrammar.g:4:5: ( '/' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:4:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:5:4: ( '==' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:5:6: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:6:4: ( '>' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:6:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "GTE"
	public final void mGTE() throws RecognitionException {
		try {
			int _type = GTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:7:5: ( '>=' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:7:7: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTE"

	// $ANTLR start "LBRACE"
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:8:8: ( '{' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:8:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACE"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:9:8: ( '(' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:9:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:10:4: ( '<' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:10:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LTE"
	public final void mLTE() throws RecognitionException {
		try {
			int _type = LTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:11:5: ( '<=' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:11:7: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTE"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:12:7: ( '-' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:12:9: '-'
			{
			match('-'); 
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
			// /Users/Anya/github/compiler-theory/mygrammar.g:13:5: ( '%' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:13:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:14:5: ( '!=' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:14:7: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:15:6: ( '+' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:15:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "RBRACE"
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:16:8: ( '}' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:16:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACE"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:17:8: ( ')' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:17:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:18:11: ( ';' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:18:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "TIMES"
	public final void mTIMES() throws RecognitionException {
		try {
			int _type = TIMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:19:7: ( '*' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:19:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMES"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:20:7: ( '#include' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:20:9: '#include'
			{
			match("#include"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:21:7: ( 'char' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:21:9: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:22:7: ( 'else' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:22:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:23:7: ( 'if' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:23:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:24:7: ( 'int' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:24:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:25:7: ( 'main' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:25:9: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:26:7: ( 'output' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:26:9: 'output'
			{
			match("output"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:27:7: ( 'outputc' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:27:9: 'outputc'
			{
			match("outputc"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:28:7: ( 'print' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:28:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:29:7: ( 'read' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:29:9: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:30:7: ( 'readc' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:30:9: 'readc'
			{
			match("readc"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:31:7: ( 'return' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:31:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:32:7: ( 'while' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:32:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:55:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /Users/Anya/github/compiler-theory/mygrammar.g:55:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/Anya/github/compiler-theory/mygrammar.g:55:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
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
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:56:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /Users/Anya/github/compiler-theory/mygrammar.g:56:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:57:6: ( '\\'' (~ ( '\\'' | '\\\\' ) ) '\\'' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:57:9: '\\'' (~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:58:9: ( ( '-' )? ( DIGIT )+ )
			// /Users/Anya/github/compiler-theory/mygrammar.g:58:11: ( '-' )? ( DIGIT )+
			{
			// /Users/Anya/github/compiler-theory/mygrammar.g:58:11: ( '-' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='-') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:58:12: '-'
					{
					match('-'); 
					}
					break;

			}

			// /Users/Anya/github/compiler-theory/mygrammar.g:58:18: ( DIGIT )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Anya/github/compiler-theory/mygrammar.g:59:8: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:59:11: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/Anya/github/compiler-theory/mygrammar.g:59:15: (~ ( '\\\\' | '\"' ) )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '[')||(LA4_0 >= ']' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:60:16: ( '0' .. '9' )
			// /Users/Anya/github/compiler-theory/mygrammar.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
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

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/Anya/github/compiler-theory/mygrammar.g:1:8: ( ASSIGN | COMMA | DIV | EQ | GT | GTE | LBRACE | LPAREN | LT | LTE | MINUS | MOD | NEQ | PLUS | RBRACE | RPAREN | SEMICOLON | TIMES | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | ID | WS | CHAR | NUMBER | STRING )
		int alt5=36;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:10: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 2 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:17: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 3 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:23: DIV
				{
				mDIV(); 

				}
				break;
			case 4 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:27: EQ
				{
				mEQ(); 

				}
				break;
			case 5 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:30: GT
				{
				mGT(); 

				}
				break;
			case 6 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:33: GTE
				{
				mGTE(); 

				}
				break;
			case 7 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:37: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 8 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:44: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 9 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:51: LT
				{
				mLT(); 

				}
				break;
			case 10 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:54: LTE
				{
				mLTE(); 

				}
				break;
			case 11 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:58: MINUS
				{
				mMINUS(); 

				}
				break;
			case 12 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:64: MOD
				{
				mMOD(); 

				}
				break;
			case 13 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:68: NEQ
				{
				mNEQ(); 

				}
				break;
			case 14 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:72: PLUS
				{
				mPLUS(); 

				}
				break;
			case 15 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:77: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 16 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:84: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 17 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:91: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 18 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:101: TIMES
				{
				mTIMES(); 

				}
				break;
			case 19 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:107: T__34
				{
				mT__34(); 

				}
				break;
			case 20 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:113: T__35
				{
				mT__35(); 

				}
				break;
			case 21 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:119: T__36
				{
				mT__36(); 

				}
				break;
			case 22 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:125: T__37
				{
				mT__37(); 

				}
				break;
			case 23 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:131: T__38
				{
				mT__38(); 

				}
				break;
			case 24 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:137: T__39
				{
				mT__39(); 

				}
				break;
			case 25 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:143: T__40
				{
				mT__40(); 

				}
				break;
			case 26 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:149: T__41
				{
				mT__41(); 

				}
				break;
			case 27 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:155: T__42
				{
				mT__42(); 

				}
				break;
			case 28 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:161: T__43
				{
				mT__43(); 

				}
				break;
			case 29 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:167: T__44
				{
				mT__44(); 

				}
				break;
			case 30 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:173: T__45
				{
				mT__45(); 

				}
				break;
			case 31 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:179: T__46
				{
				mT__46(); 

				}
				break;
			case 32 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:185: ID
				{
				mID(); 

				}
				break;
			case 33 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:188: WS
				{
				mWS(); 

				}
				break;
			case 34 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:191: CHAR
				{
				mCHAR(); 

				}
				break;
			case 35 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:196: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 36 :
				// /Users/Anya/github/compiler-theory/mygrammar.g:1:203: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\1\uffff\1\37\2\uffff\1\41\2\uffff\1\43\1\44\10\uffff\10\31\14\uffff\2"+
		"\31\1\60\10\31\1\uffff\1\72\6\31\1\101\1\102\1\uffff\1\103\2\31\1\107"+
		"\2\31\3\uffff\1\31\1\113\1\114\1\uffff\1\31\1\116\1\120\2\uffff\1\121"+
		"\1\uffff\1\122\3\uffff";
	static final String DFA5_eofS =
		"\123\uffff";
	static final String DFA5_minS =
		"\1\11\1\75\2\uffff\1\75\2\uffff\1\75\1\60\10\uffff\1\150\1\154\1\146\1"+
		"\141\1\165\1\162\1\145\1\150\14\uffff\1\141\1\163\1\60\1\164\1\151\1\164"+
		"\1\151\1\141\1\151\1\162\1\145\1\uffff\1\60\1\156\1\160\1\156\1\144\1"+
		"\165\1\154\2\60\1\uffff\1\60\1\165\1\164\1\60\1\162\1\145\3\uffff\1\164"+
		"\2\60\1\uffff\1\156\2\60\2\uffff\1\60\1\uffff\1\60\3\uffff";
	static final String DFA5_maxS =
		"\1\175\1\75\2\uffff\1\75\2\uffff\1\75\1\71\10\uffff\1\150\1\154\1\156"+
		"\1\141\1\165\1\162\1\145\1\150\14\uffff\1\141\1\163\1\172\1\164\1\151"+
		"\1\164\1\151\1\164\1\151\1\162\1\145\1\uffff\1\172\1\156\1\160\1\156\1"+
		"\144\1\165\1\154\2\172\1\uffff\1\172\1\165\1\164\1\172\1\162\1\145\3\uffff"+
		"\1\164\2\172\1\uffff\1\156\2\172\2\uffff\1\172\1\uffff\1\172\3\uffff";
	static final String DFA5_acceptS =
		"\2\uffff\1\2\1\3\1\uffff\1\7\1\10\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21"+
		"\1\22\1\23\10\uffff\1\40\1\41\1\42\1\43\1\44\1\4\1\1\1\6\1\5\1\12\1\11"+
		"\1\13\13\uffff\1\26\11\uffff\1\27\6\uffff\1\24\1\25\1\30\3\uffff\1\34"+
		"\3\uffff\1\33\1\35\1\uffff\1\37\1\uffff\1\31\1\36\1\32";
	static final String DFA5_specialS =
		"\123\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\32\2\uffff\1\32\22\uffff\1\32\1\12\1\35\1\20\1\uffff\1\11\1\uffff"+
			"\1\33\1\6\1\15\1\17\1\13\1\2\1\10\1\uffff\1\3\12\34\1\uffff\1\16\1\7"+
			"\1\1\1\4\2\uffff\32\31\4\uffff\1\31\1\uffff\2\31\1\21\1\31\1\22\3\31"+
			"\1\23\3\31\1\24\1\31\1\25\1\26\1\31\1\27\4\31\1\30\3\31\1\5\1\uffff\1"+
			"\14",
			"\1\36",
			"",
			"",
			"\1\40",
			"",
			"",
			"\1\42",
			"\12\34",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\45",
			"\1\46",
			"\1\47\7\uffff\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\56",
			"\1\57",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65\22\uffff\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\104",
			"\1\105",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\2\31\1\106\27\31",
			"\1\110",
			"\1\111",
			"",
			"",
			"",
			"\1\112",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\1\115",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\2\31\1\117\27\31",
			"",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
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
			return "1:1: Tokens : ( ASSIGN | COMMA | DIV | EQ | GT | GTE | LBRACE | LPAREN | LT | LTE | MINUS | MOD | NEQ | PLUS | RBRACE | RPAREN | SEMICOLON | TIMES | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | ID | WS | CHAR | NUMBER | STRING );";
		}
	}

}
