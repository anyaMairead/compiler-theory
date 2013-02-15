// $ANTLR 3.5 /Users/Anya/github/compiler-theory/mygrammar.g 2013-02-15 13:36:07

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class mygrammarParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARGS", "ASSIGN", "CHAR", "COMMA", 
		"DECS", "DIGIT", "DIV", "EQ", "EXPR", "GT", "GTE", "ID", "INCLS", "LBRACE", 
		"LPAREN", "LT", "LTE", "MAIN", "MINUS", "MOD", "NEQ", "NUMBER", "PLUS", 
		"RBRACE", "RPAREN", "SEMICOLON", "STMTS", "STRING", "TIMES", "WS", "'#include'", 
		"'char'", "'else'", "'if'", "'int'", "'main'", "'output'", "'outputc'", 
		"'print'", "'read'", "'readc'", "'return'", "'while'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "includes", "stmt", "procedure", "stmtlist", "exp", "main", 
		"typeident", "lexp", "body", "term", "args", "factor", "decls", "program"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public mygrammarParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public mygrammarParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public mygrammarParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return mygrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/Anya/github/compiler-theory/mygrammar.g"; }


	         public static void main(String[] args) throws displayRecognitionError {
	              mygrammarLexer l = new mygrammarLexer(new ANTLRFileStream(args[4]));
	              CommonTokenStream tokens = new CommonTokenStream(l);
	              mygrammarParser p = new mygramamrParser(tokens);
	              try {
	                  p.expr();
	              } 
	              catch (Exception e) {
	                  System.err("Should hopefully never happen");
	              }
	          }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /Users/Anya/github/compiler-theory/mygrammar.g:60:1: program : includes decls ( procedure )* main EOF ;
	public final mygrammarParser.program_return program() throws  {
		mygrammarParser.program_return retval = new mygrammarParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF5=null;
		ParserRuleReturnScope includes1 =null;
		ParserRuleReturnScope decls2 =null;
		ParserRuleReturnScope procedure3 =null;
		ParserRuleReturnScope main4 =null;

		Object EOF5_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:60:9: ( includes decls ( procedure )* main EOF )
			dbg.enterAlt(1);

			// /Users/Anya/github/compiler-theory/mygrammar.g:60:11: includes decls ( procedure )* main EOF
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(60,11);
			pushFollow(FOLLOW_includes_in_program551);
			includes1=includes();
			state._fsp--;

			adaptor.addChild(root_0, includes1.getTree());
			dbg.location(60,20);
			pushFollow(FOLLOW_decls_in_program553);
			decls2=decls();
			state._fsp--;

			adaptor.addChild(root_0, decls2.getTree());
			dbg.location(60,26);
			// /Users/Anya/github/compiler-theory/mygrammar.g:60:26: ( procedure )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==35||LA1_0==38) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/Anya/github/compiler-theory/mygrammar.g:60:27: procedure
					{
					dbg.location(60,27);
					pushFollow(FOLLOW_procedure_in_program556);
					procedure3=procedure();
					state._fsp--;

					adaptor.addChild(root_0, procedure3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(60,39);
			pushFollow(FOLLOW_main_in_program560);
			main4=main();
			state._fsp--;

			adaptor.addChild(root_0, main4.getTree());
			dbg.location(60,44);
			EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_program562); 
			EOF5_tree = (Object)adaptor.create(EOF5);
			adaptor.addChild(root_0, EOF5_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(60, 46);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "program"


	public static class args_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "args"
	// /Users/Anya/github/compiler-theory/mygrammar.g:61:1: args : ( typeident ( COMMA typeident )* )? -> ( ^( ARGS ( typeident ( typeident )* )? ) )? ;
	public final mygrammarParser.args_return args() throws  {
		mygrammarParser.args_return retval = new mygrammarParser.args_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA7=null;
		ParserRuleReturnScope typeident6 =null;
		ParserRuleReturnScope typeident8 =null;

		Object COMMA7_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_typeident=new RewriteRuleSubtreeStream(adaptor,"rule typeident");

		try { dbg.enterRule(getGrammarFileName(), "args");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(61, 0);

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:61:7: ( ( typeident ( COMMA typeident )* )? -> ( ^( ARGS ( typeident ( typeident )* )? ) )? )
			dbg.enterAlt(1);

			// /Users/Anya/github/compiler-theory/mygrammar.g:61:9: ( typeident ( COMMA typeident )* )?
			{
			dbg.location(61,9);
			// /Users/Anya/github/compiler-theory/mygrammar.g:61:9: ( typeident ( COMMA typeident )* )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==35||LA3_0==38) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/Anya/github/compiler-theory/mygrammar.g:61:10: typeident ( COMMA typeident )*
					{
					dbg.location(61,10);
					pushFollow(FOLLOW_typeident_in_args571);
					typeident6=typeident();
					state._fsp--;

					stream_typeident.add(typeident6.getTree());dbg.location(61,20);
					// /Users/Anya/github/compiler-theory/mygrammar.g:61:20: ( COMMA typeident )*
					try { dbg.enterSubRule(2);

					loop2:
					while (true) {
						int alt2=2;
						try { dbg.enterDecision(2, decisionCanBacktrack[2]);

						int LA2_0 = input.LA(1);
						if ( (LA2_0==COMMA) ) {
							alt2=1;
						}

						} finally {dbg.exitDecision(2);}

						switch (alt2) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/Anya/github/compiler-theory/mygrammar.g:61:21: COMMA typeident
							{
							dbg.location(61,21);
							COMMA7=(Token)match(input,COMMA,FOLLOW_COMMA_in_args574);  
							stream_COMMA.add(COMMA7);
							dbg.location(61,27);
							pushFollow(FOLLOW_typeident_in_args576);
							typeident8=typeident();
							state._fsp--;

							stream_typeident.add(typeident8.getTree());
							}
							break;

						default :
							break loop2;
						}
					}
					} finally {dbg.exitSubRule(2);}

					}
					break;

			}
			} finally {dbg.exitSubRule(3);}

			// AST REWRITE
			// elements: typeident, typeident
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 61:41: -> ( ^( ARGS ( typeident ( typeident )* )? ) )?
			{
				dbg.location(61,44);
				// /Users/Anya/github/compiler-theory/mygrammar.g:61:44: ( ^( ARGS ( typeident ( typeident )* )? ) )?
				if ( stream_typeident.hasNext() ) {
					dbg.location(61,44);
					// /Users/Anya/github/compiler-theory/mygrammar.g:61:44: ^( ARGS ( typeident ( typeident )* )? )
					{
					Object root_1 = (Object)adaptor.nil();
					dbg.location(61,46);
					root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_1);
					dbg.location(61,51);
					// /Users/Anya/github/compiler-theory/mygrammar.g:61:51: ( typeident ( typeident )* )?
					if ( stream_typeident.hasNext()||stream_typeident.hasNext() ) {
						dbg.location(61,52);
						adaptor.addChild(root_1, stream_typeident.nextTree());dbg.location(61,61);
						// /Users/Anya/github/compiler-theory/mygrammar.g:61:61: ( typeident )*
						while ( stream_typeident.hasNext() ) {
							dbg.location(61,62);
							adaptor.addChild(root_1, stream_typeident.nextTree());
						}
						stream_typeident.reset();

					}
					stream_typeident.reset();
					stream_typeident.reset();

					adaptor.addChild(root_0, root_1);
					}

				}
				stream_typeident.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(61, 76);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "args");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "args"


	public static class includes_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "includes"
	// /Users/Anya/github/compiler-theory/mygrammar.g:62:1: includes : ( '#include' STRING )* -> ( ^( INCLS ( STRING )* ) )? ;
	public final mygrammarParser.includes_return includes() throws  {
		mygrammarParser.includes_return retval = new mygrammarParser.includes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal9=null;
		Token STRING10=null;

		Object string_literal9_tree=null;
		Object STRING10_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

		try { dbg.enterRule(getGrammarFileName(), "includes");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(62, 0);

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:62:10: ( ( '#include' STRING )* -> ( ^( INCLS ( STRING )* ) )? )
			dbg.enterAlt(1);

			// /Users/Anya/github/compiler-theory/mygrammar.g:62:12: ( '#include' STRING )*
			{
			dbg.location(62,12);
			// /Users/Anya/github/compiler-theory/mygrammar.g:62:12: ( '#include' STRING )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==34) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/Anya/github/compiler-theory/mygrammar.g:62:13: '#include' STRING
					{
					dbg.location(62,13);
					string_literal9=(Token)match(input,34,FOLLOW_34_in_includes604);  
					stream_34.add(string_literal9);
					dbg.location(62,24);
					STRING10=(Token)match(input,STRING,FOLLOW_STRING_in_includes606);  
					stream_STRING.add(STRING10);

					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}

			// AST REWRITE
			// elements: STRING
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 62:33: -> ( ^( INCLS ( STRING )* ) )?
			{
				dbg.location(62,36);
				// /Users/Anya/github/compiler-theory/mygrammar.g:62:36: ( ^( INCLS ( STRING )* ) )?
				if ( stream_STRING.hasNext() ) {
					dbg.location(62,36);
					// /Users/Anya/github/compiler-theory/mygrammar.g:62:36: ^( INCLS ( STRING )* )
					{
					Object root_1 = (Object)adaptor.nil();
					dbg.location(62,38);
					root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INCLS, "INCLS"), root_1);
					dbg.location(62,44);
					// /Users/Anya/github/compiler-theory/mygrammar.g:62:44: ( STRING )*
					while ( stream_STRING.hasNext() ) {
						dbg.location(62,45);
						adaptor.addChild(root_1, stream_STRING.nextNode());
					}
					stream_STRING.reset();

					adaptor.addChild(root_0, root_1);
					}

				}
				stream_STRING.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(62, 54);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "includes");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "includes"


	public static class main_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "main"
	// /Users/Anya/github/compiler-theory/mygrammar.g:63:1: main : 'main' LPAREN RPAREN body -> ^( MAIN body ) ;
	public final mygrammarParser.main_return main() throws  {
		mygrammarParser.main_return retval = new mygrammarParser.main_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal11=null;
		Token LPAREN12=null;
		Token RPAREN13=null;
		ParserRuleReturnScope body14 =null;

		Object string_literal11_tree=null;
		Object LPAREN12_tree=null;
		Object RPAREN13_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");

		try { dbg.enterRule(getGrammarFileName(), "main");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:63:6: ( 'main' LPAREN RPAREN body -> ^( MAIN body ) )
			dbg.enterAlt(1);

			// /Users/Anya/github/compiler-theory/mygrammar.g:63:8: 'main' LPAREN RPAREN body
			{
			dbg.location(63,8);
			string_literal11=(Token)match(input,39,FOLLOW_39_in_main627);  
			stream_39.add(string_literal11);
			dbg.location(63,15);
			LPAREN12=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_main629);  
			stream_LPAREN.add(LPAREN12);
			dbg.location(63,22);
			RPAREN13=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_main631);  
			stream_RPAREN.add(RPAREN13);
			dbg.location(63,29);
			pushFollow(FOLLOW_body_in_main633);
			body14=body();
			state._fsp--;

			stream_body.add(body14.getTree());
			// AST REWRITE
			// elements: body
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 63:34: -> ^( MAIN body )
			{
				dbg.location(63,37);
				// /Users/Anya/github/compiler-theory/mygrammar.g:63:37: ^( MAIN body )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(63,39);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MAIN, "MAIN"), root_1);
				dbg.location(63,44);
				adaptor.addChild(root_1, stream_body.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(63, 48);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "main");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "main"


	public static class procedure_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedure"
	// /Users/Anya/github/compiler-theory/mygrammar.g:64:1: procedure : ( 'int' | 'char' )? ID ^ LPAREN ! args RPAREN ! body ;
	public final mygrammarParser.procedure_return procedure() throws  {
		mygrammarParser.procedure_return retval = new mygrammarParser.procedure_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set15=null;
		Token ID16=null;
		Token LPAREN17=null;
		Token RPAREN19=null;
		ParserRuleReturnScope args18 =null;
		ParserRuleReturnScope body20 =null;

		Object set15_tree=null;
		Object ID16_tree=null;
		Object LPAREN17_tree=null;
		Object RPAREN19_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "procedure");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(64, 0);

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:64:11: ( ( 'int' | 'char' )? ID ^ LPAREN ! args RPAREN ! body )
			dbg.enterAlt(1);

			// /Users/Anya/github/compiler-theory/mygrammar.g:64:13: ( 'int' | 'char' )? ID ^ LPAREN ! args RPAREN ! body
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(64,13);
			// /Users/Anya/github/compiler-theory/mygrammar.g:64:13: ( 'int' | 'char' )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==35||LA5_0==38) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/Anya/github/compiler-theory/mygrammar.g:
					{
					dbg.location(64,13);
					set15=input.LT(1);
					if ( input.LA(1)==35||input.LA(1)==38 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set15));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}
					}
					break;

			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(64,33);
			ID16=(Token)match(input,ID,FOLLOW_ID_in_procedure657); 
			ID16_tree = (Object)adaptor.create(ID16);
			root_0 = (Object)adaptor.becomeRoot(ID16_tree, root_0);
			dbg.location(64,41);
			LPAREN17=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_procedure660); dbg.location(64,43);
			pushFollow(FOLLOW_args_in_procedure663);
			args18=args();
			state._fsp--;

			adaptor.addChild(root_0, args18.getTree());
			dbg.location(64,54);
			RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_procedure665); dbg.location(64,56);
			pushFollow(FOLLOW_body_in_procedure668);
			body20=body();
			state._fsp--;

			adaptor.addChild(root_0, body20.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(64, 59);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "procedure");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "procedure"


	public static class typeident_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeident"
	// /Users/Anya/github/compiler-theory/mygrammar.g:65:1: typeident : ( 'int' ^ ID | 'char' ^ ID );
	public final mygrammarParser.typeident_return typeident() throws  {
		mygrammarParser.typeident_return retval = new mygrammarParser.typeident_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal21=null;
		Token ID22=null;
		Token string_literal23=null;
		Token ID24=null;

		Object string_literal21_tree=null;
		Object ID22_tree=null;
		Object string_literal23_tree=null;
		Object ID24_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "typeident");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(65, 0);

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:65:11: ( 'int' ^ ID | 'char' ^ ID )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==38) ) {
				alt6=1;
			}
			else if ( (LA6_0==35) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/Anya/github/compiler-theory/mygrammar.g:65:13: 'int' ^ ID
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(65,18);
					string_literal21=(Token)match(input,38,FOLLOW_38_in_typeident675); 
					string_literal21_tree = (Object)adaptor.create(string_literal21);
					root_0 = (Object)adaptor.becomeRoot(string_literal21_tree, root_0);
					dbg.location(65,20);
					ID22=(Token)match(input,ID,FOLLOW_ID_in_typeident678); 
					ID22_tree = (Object)adaptor.create(ID22);
					adaptor.addChild(root_0, ID22_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/Anya/github/compiler-theory/mygrammar.g:65:25: 'char' ^ ID
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(65,31);
					string_literal23=(Token)match(input,35,FOLLOW_35_in_typeident682); 
					string_literal23_tree = (Object)adaptor.create(string_literal23);
					root_0 = (Object)adaptor.becomeRoot(string_literal23_tree, root_0);
					dbg.location(65,33);
					ID24=(Token)match(input,ID,FOLLOW_ID_in_typeident685); 
					ID24_tree = (Object)adaptor.create(ID24);
					adaptor.addChild(root_0, ID24_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(65, 34);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "typeident");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "typeident"


	public static class decls_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decls"
	// /Users/Anya/github/compiler-theory/mygrammar.g:66:1: decls : ( typeident SEMICOLON )* -> ( ^( DECS ( typeident )* ) )? ;
	public final mygrammarParser.decls_return decls() throws  {
		mygrammarParser.decls_return retval = new mygrammarParser.decls_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON26=null;
		ParserRuleReturnScope typeident25 =null;

		Object SEMICOLON26_tree=null;
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleSubtreeStream stream_typeident=new RewriteRuleSubtreeStream(adaptor,"rule typeident");

		try { dbg.enterRule(getGrammarFileName(), "decls");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:66:8: ( ( typeident SEMICOLON )* -> ( ^( DECS ( typeident )* ) )? )
			dbg.enterAlt(1);

			// /Users/Anya/github/compiler-theory/mygrammar.g:66:10: ( typeident SEMICOLON )*
			{
			dbg.location(66,10);
			// /Users/Anya/github/compiler-theory/mygrammar.g:66:10: ( typeident SEMICOLON )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==38) ) {
					int LA7_1 = input.LA(2);
					if ( (LA7_1==ID) ) {
						int LA7_4 = input.LA(3);
						if ( (LA7_4==SEMICOLON) ) {
							alt7=1;
						}

					}

				}
				else if ( (LA7_0==35) ) {
					int LA7_3 = input.LA(2);
					if ( (LA7_3==ID) ) {
						int LA7_5 = input.LA(3);
						if ( (LA7_5==SEMICOLON) ) {
							alt7=1;
						}

					}

				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/Anya/github/compiler-theory/mygrammar.g:66:11: typeident SEMICOLON
					{
					dbg.location(66,11);
					pushFollow(FOLLOW_typeident_in_decls694);
					typeident25=typeident();
					state._fsp--;

					stream_typeident.add(typeident25.getTree());dbg.location(66,21);
					SEMICOLON26=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_decls696);  
					stream_SEMICOLON.add(SEMICOLON26);

					}
					break;

				default :
					break loop7;
				}
			}
			} finally {dbg.exitSubRule(7);}

			// AST REWRITE
			// elements: typeident
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 66:33: -> ( ^( DECS ( typeident )* ) )?
			{
				dbg.location(66,36);
				// /Users/Anya/github/compiler-theory/mygrammar.g:66:36: ( ^( DECS ( typeident )* ) )?
				if ( stream_typeident.hasNext() ) {
					dbg.location(66,36);
					// /Users/Anya/github/compiler-theory/mygrammar.g:66:36: ^( DECS ( typeident )* )
					{
					Object root_1 = (Object)adaptor.nil();
					dbg.location(66,38);
					root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECS, "DECS"), root_1);
					dbg.location(66,43);
					// /Users/Anya/github/compiler-theory/mygrammar.g:66:43: ( typeident )*
					while ( stream_typeident.hasNext() ) {
						dbg.location(66,44);
						adaptor.addChild(root_1, stream_typeident.nextTree());
					}
					stream_typeident.reset();

					adaptor.addChild(root_0, root_1);
					}

				}
				stream_typeident.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(66, 56);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decls");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "decls"


	public static class stmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stmt"
	// /Users/Anya/github/compiler-theory/mygrammar.g:67:1: stmt : ( LBRACE ! stmtlist RBRACE !| 'while' LPAREN exp RPAREN stmt -> ^( 'while' ^( EXPR exp ) stmt ) | 'if' LPAREN exp RPAREN s= stmt ( options {greedy=true; } : 'else' s2= stmt )? -> ^( 'if' ^( EXPR exp ) $s ( ^( 'else' $s2) )? ) | ID ASSIGN ^ lexp SEMICOLON !| ( 'read' | 'readc' | 'output' | 'outputc' ) ^ LPAREN ! ID RPAREN ! SEMICOLON !| 'print' ^ LPAREN ! STRING RPAREN ! SEMICOLON !| 'return' ^ ( lexp )? SEMICOLON !| ID ^ LPAREN ! ID ( COMMA ! ID )* RPAREN ! SEMICOLON !);
	public final mygrammarParser.stmt_return stmt() throws  {
		mygrammarParser.stmt_return retval = new mygrammarParser.stmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACE27=null;
		Token RBRACE29=null;
		Token string_literal30=null;
		Token LPAREN31=null;
		Token RPAREN33=null;
		Token string_literal35=null;
		Token LPAREN36=null;
		Token RPAREN38=null;
		Token string_literal39=null;
		Token ID40=null;
		Token ASSIGN41=null;
		Token SEMICOLON43=null;
		Token set44=null;
		Token LPAREN45=null;
		Token ID46=null;
		Token RPAREN47=null;
		Token SEMICOLON48=null;
		Token string_literal49=null;
		Token LPAREN50=null;
		Token STRING51=null;
		Token RPAREN52=null;
		Token SEMICOLON53=null;
		Token string_literal54=null;
		Token SEMICOLON56=null;
		Token ID57=null;
		Token LPAREN58=null;
		Token ID59=null;
		Token COMMA60=null;
		Token ID61=null;
		Token RPAREN62=null;
		Token SEMICOLON63=null;
		ParserRuleReturnScope s =null;
		ParserRuleReturnScope s2 =null;
		ParserRuleReturnScope stmtlist28 =null;
		ParserRuleReturnScope exp32 =null;
		ParserRuleReturnScope stmt34 =null;
		ParserRuleReturnScope exp37 =null;
		ParserRuleReturnScope lexp42 =null;
		ParserRuleReturnScope lexp55 =null;

		Object LBRACE27_tree=null;
		Object RBRACE29_tree=null;
		Object string_literal30_tree=null;
		Object LPAREN31_tree=null;
		Object RPAREN33_tree=null;
		Object string_literal35_tree=null;
		Object LPAREN36_tree=null;
		Object RPAREN38_tree=null;
		Object string_literal39_tree=null;
		Object ID40_tree=null;
		Object ASSIGN41_tree=null;
		Object SEMICOLON43_tree=null;
		Object set44_tree=null;
		Object LPAREN45_tree=null;
		Object ID46_tree=null;
		Object RPAREN47_tree=null;
		Object SEMICOLON48_tree=null;
		Object string_literal49_tree=null;
		Object LPAREN50_tree=null;
		Object STRING51_tree=null;
		Object RPAREN52_tree=null;
		Object SEMICOLON53_tree=null;
		Object string_literal54_tree=null;
		Object SEMICOLON56_tree=null;
		Object ID57_tree=null;
		Object LPAREN58_tree=null;
		Object ID59_tree=null;
		Object COMMA60_tree=null;
		Object ID61_tree=null;
		Object RPAREN62_tree=null;
		Object SEMICOLON63_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
		RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");

		try { dbg.enterRule(getGrammarFileName(), "stmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(67, 0);

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:67:6: ( LBRACE ! stmtlist RBRACE !| 'while' LPAREN exp RPAREN stmt -> ^( 'while' ^( EXPR exp ) stmt ) | 'if' LPAREN exp RPAREN s= stmt ( options {greedy=true; } : 'else' s2= stmt )? -> ^( 'if' ^( EXPR exp ) $s ( ^( 'else' $s2) )? ) | ID ASSIGN ^ lexp SEMICOLON !| ( 'read' | 'readc' | 'output' | 'outputc' ) ^ LPAREN ! ID RPAREN ! SEMICOLON !| 'print' ^ LPAREN ! STRING RPAREN ! SEMICOLON !| 'return' ^ ( lexp )? SEMICOLON !| ID ^ LPAREN ! ID ( COMMA ! ID )* RPAREN ! SEMICOLON !)
			int alt11=8;
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			switch ( input.LA(1) ) {
			case LBRACE:
				{
				alt11=1;
				}
				break;
			case 46:
				{
				alt11=2;
				}
				break;
			case 37:
				{
				alt11=3;
				}
				break;
			case ID:
				{
				int LA11_4 = input.LA(2);
				if ( (LA11_4==ASSIGN) ) {
					alt11=4;
				}
				else if ( (LA11_4==LPAREN) ) {
					alt11=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 4, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 40:
			case 41:
			case 43:
			case 44:
				{
				alt11=5;
				}
				break;
			case 42:
				{
				alt11=6;
				}
				break;
			case 45:
				{
				alt11=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/Anya/github/compiler-theory/mygrammar.g:67:8: LBRACE ! stmtlist RBRACE !
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(67,14);
					LBRACE27=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_stmt717); dbg.location(67,16);
					pushFollow(FOLLOW_stmtlist_in_stmt720);
					stmtlist28=stmtlist();
					state._fsp--;

					adaptor.addChild(root_0, stmtlist28.getTree());
					dbg.location(67,31);
					RBRACE29=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_stmt722); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/Anya/github/compiler-theory/mygrammar.g:68:8: 'while' LPAREN exp RPAREN stmt
					{
					dbg.location(68,8);
					string_literal30=(Token)match(input,46,FOLLOW_46_in_stmt732);  
					stream_46.add(string_literal30);
					dbg.location(68,16);
					LPAREN31=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stmt734);  
					stream_LPAREN.add(LPAREN31);
					dbg.location(68,23);
					pushFollow(FOLLOW_exp_in_stmt736);
					exp32=exp();
					state._fsp--;

					stream_exp.add(exp32.getTree());dbg.location(68,27);
					RPAREN33=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stmt738);  
					stream_RPAREN.add(RPAREN33);
					dbg.location(68,34);
					pushFollow(FOLLOW_stmt_in_stmt740);
					stmt34=stmt();
					state._fsp--;

					stream_stmt.add(stmt34.getTree());
					// AST REWRITE
					// elements: stmt, 46, exp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 68:39: -> ^( 'while' ^( EXPR exp ) stmt )
					{
						dbg.location(68,42);
						// /Users/Anya/github/compiler-theory/mygrammar.g:68:42: ^( 'while' ^( EXPR exp ) stmt )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(68,44);
						root_1 = (Object)adaptor.becomeRoot(stream_46.nextNode(), root_1);
						dbg.location(68,52);
						// /Users/Anya/github/compiler-theory/mygrammar.g:68:52: ^( EXPR exp )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(68,54);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);
						dbg.location(68,59);
						adaptor.addChild(root_2, stream_exp.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(68,64);
						adaptor.addChild(root_1, stream_stmt.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/Anya/github/compiler-theory/mygrammar.g:69:8: 'if' LPAREN exp RPAREN s= stmt ( options {greedy=true; } : 'else' s2= stmt )?
					{
					dbg.location(69,8);
					string_literal35=(Token)match(input,37,FOLLOW_37_in_stmt763);  
					stream_37.add(string_literal35);
					dbg.location(69,13);
					LPAREN36=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stmt765);  
					stream_LPAREN.add(LPAREN36);
					dbg.location(69,20);
					pushFollow(FOLLOW_exp_in_stmt767);
					exp37=exp();
					state._fsp--;

					stream_exp.add(exp37.getTree());dbg.location(69,24);
					RPAREN38=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stmt769);  
					stream_RPAREN.add(RPAREN38);
					dbg.location(69,32);
					pushFollow(FOLLOW_stmt_in_stmt773);
					s=stmt();
					state._fsp--;

					stream_stmt.add(s.getTree());dbg.location(69,38);
					// /Users/Anya/github/compiler-theory/mygrammar.g:69:38: ( options {greedy=true; } : 'else' s2= stmt )?
					int alt8=2;
					try { dbg.enterSubRule(8);
					try { dbg.enterDecision(8, decisionCanBacktrack[8]);

					int LA8_0 = input.LA(1);
					if ( (LA8_0==36) ) {
						alt8=1;
					}
					} finally {dbg.exitDecision(8);}

					switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/Anya/github/compiler-theory/mygrammar.g:69:64: 'else' s2= stmt
							{
							dbg.location(69,64);
							string_literal39=(Token)match(input,36,FOLLOW_36_in_stmt785);  
							stream_36.add(string_literal39);
							dbg.location(69,73);
							pushFollow(FOLLOW_stmt_in_stmt789);
							s2=stmt();
							state._fsp--;

							stream_stmt.add(s2.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(8);}

					// AST REWRITE
					// elements: s, s2, 37, exp, 36
					// token labels: 
					// rule labels: retval, s2, s
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.getTree():null);
					RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 69:81: -> ^( 'if' ^( EXPR exp ) $s ( ^( 'else' $s2) )? )
					{
						dbg.location(69,84);
						// /Users/Anya/github/compiler-theory/mygrammar.g:69:84: ^( 'if' ^( EXPR exp ) $s ( ^( 'else' $s2) )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(69,86);
						root_1 = (Object)adaptor.becomeRoot(stream_37.nextNode(), root_1);
						dbg.location(69,91);
						// /Users/Anya/github/compiler-theory/mygrammar.g:69:91: ^( EXPR exp )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(69,93);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);
						dbg.location(69,98);
						adaptor.addChild(root_2, stream_exp.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(69,104);
						adaptor.addChild(root_1, stream_s.nextTree());dbg.location(69,106);
						// /Users/Anya/github/compiler-theory/mygrammar.g:69:106: ( ^( 'else' $s2) )?
						if ( stream_s2.hasNext()||stream_36.hasNext() ) {
							dbg.location(69,106);
							// /Users/Anya/github/compiler-theory/mygrammar.g:69:106: ^( 'else' $s2)
							{
							Object root_2 = (Object)adaptor.nil();
							dbg.location(69,108);
							root_2 = (Object)adaptor.becomeRoot(stream_36.nextNode(), root_2);
							dbg.location(69,116);
							adaptor.addChild(root_2, stream_s2.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_s2.reset();
						stream_36.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/Anya/github/compiler-theory/mygrammar.g:70:8: ID ASSIGN ^ lexp SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(70,8);
					ID40=(Token)match(input,ID,FOLLOW_ID_in_stmt823); 
					ID40_tree = (Object)adaptor.create(ID40);
					adaptor.addChild(root_0, ID40_tree);
					dbg.location(70,17);
					ASSIGN41=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmt825); 
					ASSIGN41_tree = (Object)adaptor.create(ASSIGN41);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN41_tree, root_0);
					dbg.location(70,19);
					pushFollow(FOLLOW_lexp_in_stmt828);
					lexp42=lexp();
					state._fsp--;

					adaptor.addChild(root_0, lexp42.getTree());
					dbg.location(70,33);
					SEMICOLON43=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt830); 
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/Anya/github/compiler-theory/mygrammar.g:71:8: ( 'read' | 'readc' | 'output' | 'outputc' ) ^ LPAREN ! ID RPAREN ! SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(71,49);
					set44=input.LT(1);
					set44=input.LT(1);
					if ( (input.LA(1) >= 40 && input.LA(1) <= 41)||(input.LA(1) >= 43 && input.LA(1) <= 44) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set44), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(71,57);
					LPAREN45=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stmt857); dbg.location(71,59);
					ID46=(Token)match(input,ID,FOLLOW_ID_in_stmt860); 
					ID46_tree = (Object)adaptor.create(ID46);
					adaptor.addChild(root_0, ID46_tree);
					dbg.location(71,68);
					RPAREN47=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stmt862); dbg.location(71,79);
					SEMICOLON48=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt865); 
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /Users/Anya/github/compiler-theory/mygrammar.g:72:8: 'print' ^ LPAREN ! STRING RPAREN ! SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(72,15);
					string_literal49=(Token)match(input,42,FOLLOW_42_in_stmt875); 
					string_literal49_tree = (Object)adaptor.create(string_literal49);
					root_0 = (Object)adaptor.becomeRoot(string_literal49_tree, root_0);
					dbg.location(72,23);
					LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stmt878); dbg.location(72,25);
					STRING51=(Token)match(input,STRING,FOLLOW_STRING_in_stmt881); 
					STRING51_tree = (Object)adaptor.create(STRING51);
					adaptor.addChild(root_0, STRING51_tree);
					dbg.location(72,38);
					RPAREN52=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stmt883); dbg.location(72,49);
					SEMICOLON53=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt886); 
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /Users/Anya/github/compiler-theory/mygrammar.g:73:8: 'return' ^ ( lexp )? SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(73,16);
					string_literal54=(Token)match(input,45,FOLLOW_45_in_stmt896); 
					string_literal54_tree = (Object)adaptor.create(string_literal54);
					root_0 = (Object)adaptor.becomeRoot(string_literal54_tree, root_0);
					dbg.location(73,18);
					// /Users/Anya/github/compiler-theory/mygrammar.g:73:18: ( lexp )?
					int alt9=2;
					try { dbg.enterSubRule(9);
					try { dbg.enterDecision(9, decisionCanBacktrack[9]);

					int LA9_0 = input.LA(1);
					if ( (LA9_0==CHAR||LA9_0==ID||LA9_0==LPAREN||LA9_0==MINUS||LA9_0==NUMBER) ) {
						alt9=1;
					}
					} finally {dbg.exitDecision(9);}

					switch (alt9) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/Anya/github/compiler-theory/mygrammar.g:73:19: lexp
							{
							dbg.location(73,19);
							pushFollow(FOLLOW_lexp_in_stmt900);
							lexp55=lexp();
							state._fsp--;

							adaptor.addChild(root_0, lexp55.getTree());

							}
							break;

					}
					} finally {dbg.exitSubRule(9);}
					dbg.location(73,35);
					SEMICOLON56=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt904); 
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// /Users/Anya/github/compiler-theory/mygrammar.g:74:8: ID ^ LPAREN ! ID ( COMMA ! ID )* RPAREN ! SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(74,10);
					ID57=(Token)match(input,ID,FOLLOW_ID_in_stmt914); 
					ID57_tree = (Object)adaptor.create(ID57);
					root_0 = (Object)adaptor.becomeRoot(ID57_tree, root_0);
					dbg.location(74,18);
					LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stmt917); dbg.location(74,20);
					ID59=(Token)match(input,ID,FOLLOW_ID_in_stmt920); 
					ID59_tree = (Object)adaptor.create(ID59);
					adaptor.addChild(root_0, ID59_tree);
					dbg.location(74,23);
					// /Users/Anya/github/compiler-theory/mygrammar.g:74:23: ( COMMA ! ID )*
					try { dbg.enterSubRule(10);

					loop10:
					while (true) {
						int alt10=2;
						try { dbg.enterDecision(10, decisionCanBacktrack[10]);

						int LA10_0 = input.LA(1);
						if ( (LA10_0==COMMA) ) {
							alt10=1;
						}

						} finally {dbg.exitDecision(10);}

						switch (alt10) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/Anya/github/compiler-theory/mygrammar.g:74:24: COMMA ! ID
							{
							dbg.location(74,29);
							COMMA60=(Token)match(input,COMMA,FOLLOW_COMMA_in_stmt923); dbg.location(74,31);
							ID61=(Token)match(input,ID,FOLLOW_ID_in_stmt926); 
							ID61_tree = (Object)adaptor.create(ID61);
							adaptor.addChild(root_0, ID61_tree);

							}
							break;

						default :
							break loop10;
						}
					}
					} finally {dbg.exitSubRule(10);}
					dbg.location(74,42);
					RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stmt930); dbg.location(74,53);
					SEMICOLON63=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt933); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(74, 53);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "stmt"


	public static class stmtlist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stmtlist"
	// /Users/Anya/github/compiler-theory/mygrammar.g:75:1: stmtlist : ( stmt )* -> ( ^( STMTS ( stmt )* ) )? ;
	public final mygrammarParser.stmtlist_return stmtlist() throws  {
		mygrammarParser.stmtlist_return retval = new mygrammarParser.stmtlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stmt64 =null;

		RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");

		try { dbg.enterRule(getGrammarFileName(), "stmtlist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(75, 0);

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:75:10: ( ( stmt )* -> ( ^( STMTS ( stmt )* ) )? )
			dbg.enterAlt(1);

			// /Users/Anya/github/compiler-theory/mygrammar.g:75:12: ( stmt )*
			{
			dbg.location(75,12);
			// /Users/Anya/github/compiler-theory/mygrammar.g:75:12: ( stmt )*
			try { dbg.enterSubRule(12);

			loop12:
			while (true) {
				int alt12=2;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				int LA12_0 = input.LA(1);
				if ( (LA12_0==ID||LA12_0==LBRACE||LA12_0==37||(LA12_0 >= 40 && LA12_0 <= 46)) ) {
					alt12=1;
				}

				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/Anya/github/compiler-theory/mygrammar.g:75:13: stmt
					{
					dbg.location(75,13);
					pushFollow(FOLLOW_stmt_in_stmtlist942);
					stmt64=stmt();
					state._fsp--;

					stream_stmt.add(stmt64.getTree());
					}
					break;

				default :
					break loop12;
				}
			}
			} finally {dbg.exitSubRule(12);}

			// AST REWRITE
			// elements: stmt
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 75:20: -> ( ^( STMTS ( stmt )* ) )?
			{
				dbg.location(75,23);
				// /Users/Anya/github/compiler-theory/mygrammar.g:75:23: ( ^( STMTS ( stmt )* ) )?
				if ( stream_stmt.hasNext() ) {
					dbg.location(75,23);
					// /Users/Anya/github/compiler-theory/mygrammar.g:75:23: ^( STMTS ( stmt )* )
					{
					Object root_1 = (Object)adaptor.nil();
					dbg.location(75,25);
					root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STMTS, "STMTS"), root_1);
					dbg.location(75,31);
					// /Users/Anya/github/compiler-theory/mygrammar.g:75:31: ( stmt )*
					while ( stream_stmt.hasNext() ) {
						dbg.location(75,32);
						adaptor.addChild(root_1, stream_stmt.nextTree());
					}
					stream_stmt.reset();

					adaptor.addChild(root_0, root_1);
					}

				}
				stream_stmt.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(75, 39);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stmtlist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "stmtlist"


	public static class body_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "body"
	// /Users/Anya/github/compiler-theory/mygrammar.g:76:1: body : LBRACE ! decls stmtlist RBRACE !;
	public final mygrammarParser.body_return body() throws  {
		mygrammarParser.body_return retval = new mygrammarParser.body_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACE65=null;
		Token RBRACE68=null;
		ParserRuleReturnScope decls66 =null;
		ParserRuleReturnScope stmtlist67 =null;

		Object LBRACE65_tree=null;
		Object RBRACE68_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "body");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(76, 0);

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:76:7: ( LBRACE ! decls stmtlist RBRACE !)
			dbg.enterAlt(1);

			// /Users/Anya/github/compiler-theory/mygrammar.g:76:9: LBRACE ! decls stmtlist RBRACE !
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(76,15);
			LBRACE65=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_body966); dbg.location(76,17);
			pushFollow(FOLLOW_decls_in_body969);
			decls66=decls();
			state._fsp--;

			adaptor.addChild(root_0, decls66.getTree());
			dbg.location(76,23);
			pushFollow(FOLLOW_stmtlist_in_body971);
			stmtlist67=stmtlist();
			state._fsp--;

			adaptor.addChild(root_0, stmtlist67.getTree());
			dbg.location(76,38);
			RBRACE68=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_body973); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(76, 38);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "body");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "body"


	public static class exp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exp"
	// /Users/Anya/github/compiler-theory/mygrammar.g:77:1: exp : lexp ( ( GT | LT | GTE | LTE | NEQ | EQ ) ^ lexp )? ;
	public final mygrammarParser.exp_return exp() throws  {
		mygrammarParser.exp_return retval = new mygrammarParser.exp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set70=null;
		ParserRuleReturnScope lexp69 =null;
		ParserRuleReturnScope lexp71 =null;

		Object set70_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(77, 0);

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:77:5: ( lexp ( ( GT | LT | GTE | LTE | NEQ | EQ ) ^ lexp )? )
			dbg.enterAlt(1);

			// /Users/Anya/github/compiler-theory/mygrammar.g:77:7: lexp ( ( GT | LT | GTE | LTE | NEQ | EQ ) ^ lexp )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(77,7);
			pushFollow(FOLLOW_lexp_in_exp981);
			lexp69=lexp();
			state._fsp--;

			adaptor.addChild(root_0, lexp69.getTree());
			dbg.location(77,12);
			// /Users/Anya/github/compiler-theory/mygrammar.g:77:12: ( ( GT | LT | GTE | LTE | NEQ | EQ ) ^ lexp )?
			int alt13=2;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( (LA13_0==EQ||(LA13_0 >= GT && LA13_0 <= GTE)||(LA13_0 >= LT && LA13_0 <= LTE)||LA13_0==NEQ) ) {
				alt13=1;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/Anya/github/compiler-theory/mygrammar.g:77:13: ( GT | LT | GTE | LTE | NEQ | EQ ) ^ lexp
					{
					dbg.location(77,46);
					set70=input.LT(1);
					set70=input.LT(1);
					if ( input.LA(1)==EQ||(input.LA(1) >= GT && input.LA(1) <= GTE)||(input.LA(1) >= LT && input.LA(1) <= LTE)||input.LA(1)==NEQ ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set70), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(77,48);
					pushFollow(FOLLOW_lexp_in_exp1010);
					lexp71=lexp();
					state._fsp--;

					adaptor.addChild(root_0, lexp71.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(13);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(77, 53);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exp"


	public static class lexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lexp"
	// /Users/Anya/github/compiler-theory/mygrammar.g:78:1: lexp : term ( ( PLUS | MINUS ) ^ term )* ;
	public final mygrammarParser.lexp_return lexp() throws  {
		mygrammarParser.lexp_return retval = new mygrammarParser.lexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set73=null;
		ParserRuleReturnScope term72 =null;
		ParserRuleReturnScope term74 =null;

		Object set73_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "lexp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(78, 0);

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:78:7: ( term ( ( PLUS | MINUS ) ^ term )* )
			dbg.enterAlt(1);

			// /Users/Anya/github/compiler-theory/mygrammar.g:78:9: term ( ( PLUS | MINUS ) ^ term )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(78,9);
			pushFollow(FOLLOW_term_in_lexp1020);
			term72=term();
			state._fsp--;

			adaptor.addChild(root_0, term72.getTree());
			dbg.location(78,14);
			// /Users/Anya/github/compiler-theory/mygrammar.g:78:14: ( ( PLUS | MINUS ) ^ term )*
			try { dbg.enterSubRule(14);

			loop14:
			while (true) {
				int alt14=2;
				try { dbg.enterDecision(14, decisionCanBacktrack[14]);

				int LA14_0 = input.LA(1);
				if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
					alt14=1;
				}

				} finally {dbg.exitDecision(14);}

				switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/Anya/github/compiler-theory/mygrammar.g:78:15: ( PLUS | MINUS ) ^ term
					{
					dbg.location(78,29);
					set73=input.LT(1);
					set73=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set73), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(78,31);
					pushFollow(FOLLOW_term_in_lexp1032);
					term74=term();
					state._fsp--;

					adaptor.addChild(root_0, term74.getTree());

					}
					break;

				default :
					break loop14;
				}
			}
			} finally {dbg.exitSubRule(14);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(78, 36);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lexp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "lexp"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// /Users/Anya/github/compiler-theory/mygrammar.g:79:1: term : factor ( ( TIMES | MOD | DIV ) ^ factor )* ;
	public final mygrammarParser.term_return term() throws  {
		mygrammarParser.term_return retval = new mygrammarParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set76=null;
		ParserRuleReturnScope factor75 =null;
		ParserRuleReturnScope factor77 =null;

		Object set76_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "term");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(79, 0);

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:79:7: ( factor ( ( TIMES | MOD | DIV ) ^ factor )* )
			dbg.enterAlt(1);

			// /Users/Anya/github/compiler-theory/mygrammar.g:79:9: factor ( ( TIMES | MOD | DIV ) ^ factor )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(79,9);
			pushFollow(FOLLOW_factor_in_term1043);
			factor75=factor();
			state._fsp--;

			adaptor.addChild(root_0, factor75.getTree());
			dbg.location(79,16);
			// /Users/Anya/github/compiler-theory/mygrammar.g:79:16: ( ( TIMES | MOD | DIV ) ^ factor )*
			try { dbg.enterSubRule(15);

			loop15:
			while (true) {
				int alt15=2;
				try { dbg.enterDecision(15, decisionCanBacktrack[15]);

				int LA15_0 = input.LA(1);
				if ( (LA15_0==DIV||LA15_0==MOD||LA15_0==TIMES) ) {
					alt15=1;
				}

				} finally {dbg.exitDecision(15);}

				switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/Anya/github/compiler-theory/mygrammar.g:79:17: ( TIMES | MOD | DIV ) ^ factor
					{
					dbg.location(79,32);
					set76=input.LT(1);
					set76=input.LT(1);
					if ( input.LA(1)==DIV||input.LA(1)==MOD||input.LA(1)==TIMES ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set76), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(79,34);
					pushFollow(FOLLOW_factor_in_term1055);
					factor77=factor();
					state._fsp--;

					adaptor.addChild(root_0, factor77.getTree());

					}
					break;

				default :
					break loop15;
				}
			}
			} finally {dbg.exitSubRule(15);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(79, 41);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "term");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "term"


	public static class factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// /Users/Anya/github/compiler-theory/mygrammar.g:80:1: factor : ( LPAREN ! lexp RPAREN !| ( MINUS )? ( ID | NUMBER ) | CHAR | ID LPAREN ! ( ID ( COMMA ! ID )* )? RPAREN !);
	public final mygrammarParser.factor_return factor() throws  {
		mygrammarParser.factor_return retval = new mygrammarParser.factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN78=null;
		Token RPAREN80=null;
		Token MINUS81=null;
		Token set82=null;
		Token CHAR83=null;
		Token ID84=null;
		Token LPAREN85=null;
		Token ID86=null;
		Token COMMA87=null;
		Token ID88=null;
		Token RPAREN89=null;
		ParserRuleReturnScope lexp79 =null;

		Object LPAREN78_tree=null;
		Object RPAREN80_tree=null;
		Object MINUS81_tree=null;
		Object set82_tree=null;
		Object CHAR83_tree=null;
		Object ID84_tree=null;
		Object LPAREN85_tree=null;
		Object ID86_tree=null;
		Object COMMA87_tree=null;
		Object ID88_tree=null;
		Object RPAREN89_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "factor");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(80, 0);

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:80:8: ( LPAREN ! lexp RPAREN !| ( MINUS )? ( ID | NUMBER ) | CHAR | ID LPAREN ! ( ID ( COMMA ! ID )* )? RPAREN !)
			int alt19=4;
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			switch ( input.LA(1) ) {
			case LPAREN:
				{
				alt19=1;
				}
				break;
			case MINUS:
			case NUMBER:
				{
				alt19=2;
				}
				break;
			case ID:
				{
				int LA19_3 = input.LA(2);
				if ( (LA19_3==LPAREN) ) {
					alt19=4;
				}
				else if ( ((LA19_3 >= DIV && LA19_3 <= EQ)||(LA19_3 >= GT && LA19_3 <= GTE)||(LA19_3 >= LT && LA19_3 <= LTE)||(LA19_3 >= MINUS && LA19_3 <= NEQ)||LA19_3==PLUS||(LA19_3 >= RPAREN && LA19_3 <= SEMICOLON)||LA19_3==TIMES) ) {
					alt19=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 3, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				alt19=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/Anya/github/compiler-theory/mygrammar.g:80:10: LPAREN ! lexp RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(80,16);
					LPAREN78=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_factor1064); dbg.location(80,18);
					pushFollow(FOLLOW_lexp_in_factor1067);
					lexp79=lexp();
					state._fsp--;

					adaptor.addChild(root_0, lexp79.getTree());
					dbg.location(80,29);
					RPAREN80=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_factor1069); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/Anya/github/compiler-theory/mygrammar.g:81:10: ( MINUS )? ( ID | NUMBER )
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(81,10);
					// /Users/Anya/github/compiler-theory/mygrammar.g:81:10: ( MINUS )?
					int alt16=2;
					try { dbg.enterSubRule(16);
					try { dbg.enterDecision(16, decisionCanBacktrack[16]);

					int LA16_0 = input.LA(1);
					if ( (LA16_0==MINUS) ) {
						alt16=1;
					}
					} finally {dbg.exitDecision(16);}

					switch (alt16) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/Anya/github/compiler-theory/mygrammar.g:81:11: MINUS
							{
							dbg.location(81,11);
							MINUS81=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1082); 
							MINUS81_tree = (Object)adaptor.create(MINUS81);
							adaptor.addChild(root_0, MINUS81_tree);

							}
							break;

					}
					} finally {dbg.exitSubRule(16);}
					dbg.location(81,19);
					set82=input.LT(1);
					if ( input.LA(1)==ID||input.LA(1)==NUMBER ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set82));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/Anya/github/compiler-theory/mygrammar.g:82:10: CHAR
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(82,10);
					CHAR83=(Token)match(input,CHAR,FOLLOW_CHAR_in_factor1103); 
					CHAR83_tree = (Object)adaptor.create(CHAR83);
					adaptor.addChild(root_0, CHAR83_tree);

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/Anya/github/compiler-theory/mygrammar.g:83:10: ID LPAREN ! ( ID ( COMMA ! ID )* )? RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(83,10);
					ID84=(Token)match(input,ID,FOLLOW_ID_in_factor1114); 
					ID84_tree = (Object)adaptor.create(ID84);
					adaptor.addChild(root_0, ID84_tree);
					dbg.location(83,19);
					LPAREN85=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_factor1116); dbg.location(83,21);
					// /Users/Anya/github/compiler-theory/mygrammar.g:83:21: ( ID ( COMMA ! ID )* )?
					int alt18=2;
					try { dbg.enterSubRule(18);
					try { dbg.enterDecision(18, decisionCanBacktrack[18]);

					int LA18_0 = input.LA(1);
					if ( (LA18_0==ID) ) {
						alt18=1;
					}
					} finally {dbg.exitDecision(18);}

					switch (alt18) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/Anya/github/compiler-theory/mygrammar.g:83:22: ID ( COMMA ! ID )*
							{
							dbg.location(83,22);
							ID86=(Token)match(input,ID,FOLLOW_ID_in_factor1120); 
							ID86_tree = (Object)adaptor.create(ID86);
							adaptor.addChild(root_0, ID86_tree);
							dbg.location(83,24);
							// /Users/Anya/github/compiler-theory/mygrammar.g:83:24: ( COMMA ! ID )*
							try { dbg.enterSubRule(17);

							loop17:
							while (true) {
								int alt17=2;
								try { dbg.enterDecision(17, decisionCanBacktrack[17]);

								int LA17_0 = input.LA(1);
								if ( (LA17_0==COMMA) ) {
									alt17=1;
								}

								} finally {dbg.exitDecision(17);}

								switch (alt17) {
								case 1 :
									dbg.enterAlt(1);

									// /Users/Anya/github/compiler-theory/mygrammar.g:83:25: COMMA ! ID
									{
									dbg.location(83,30);
									COMMA87=(Token)match(input,COMMA,FOLLOW_COMMA_in_factor1122); dbg.location(83,32);
									ID88=(Token)match(input,ID,FOLLOW_ID_in_factor1125); 
									ID88_tree = (Object)adaptor.create(ID88);
									adaptor.addChild(root_0, ID88_tree);

									}
									break;

								default :
									break loop17;
								}
							}
							} finally {dbg.exitSubRule(17);}

							}
							break;

					}
					} finally {dbg.exitSubRule(18);}
					dbg.location(83,45);
					RPAREN89=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_factor1131); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(83, 46);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "factor");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_includes_in_program551 = new BitSet(new long[]{0x000000C800008000L});
	public static final BitSet FOLLOW_decls_in_program553 = new BitSet(new long[]{0x000000C800008000L});
	public static final BitSet FOLLOW_procedure_in_program556 = new BitSet(new long[]{0x000000C800008000L});
	public static final BitSet FOLLOW_main_in_program560 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeident_in_args571 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_COMMA_in_args574 = new BitSet(new long[]{0x0000004800000000L});
	public static final BitSet FOLLOW_typeident_in_args576 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_34_in_includes604 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_STRING_in_includes606 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_39_in_main627 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_main629 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_main631 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_body_in_main633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_procedure657 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_procedure660 = new BitSet(new long[]{0x0000004810000000L});
	public static final BitSet FOLLOW_args_in_procedure663 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_procedure665 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_body_in_procedure668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_typeident675 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_typeident678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_typeident682 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_typeident685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeident_in_decls694 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_decls696 = new BitSet(new long[]{0x0000004800000002L});
	public static final BitSet FOLLOW_LBRACE_in_stmt717 = new BitSet(new long[]{0x00007F2008028000L});
	public static final BitSet FOLLOW_stmtlist_in_stmt720 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RBRACE_in_stmt722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_stmt732 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_stmt734 = new BitSet(new long[]{0x0000000002448040L});
	public static final BitSet FOLLOW_exp_in_stmt736 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_stmt738 = new BitSet(new long[]{0x00007F2000028000L});
	public static final BitSet FOLLOW_stmt_in_stmt740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_stmt763 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_stmt765 = new BitSet(new long[]{0x0000000002448040L});
	public static final BitSet FOLLOW_exp_in_stmt767 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_stmt769 = new BitSet(new long[]{0x00007F2000028000L});
	public static final BitSet FOLLOW_stmt_in_stmt773 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_stmt785 = new BitSet(new long[]{0x00007F2000028000L});
	public static final BitSet FOLLOW_stmt_in_stmt789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stmt823 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_stmt825 = new BitSet(new long[]{0x0000000002448040L});
	public static final BitSet FOLLOW_lexp_in_stmt828 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stmt830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_stmt840 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_stmt857 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_stmt860 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_stmt862 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stmt865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_stmt875 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_stmt878 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_STRING_in_stmt881 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_stmt883 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stmt886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_stmt896 = new BitSet(new long[]{0x0000000022448040L});
	public static final BitSet FOLLOW_lexp_in_stmt900 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stmt904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stmt914 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_stmt917 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_stmt920 = new BitSet(new long[]{0x0000000010000080L});
	public static final BitSet FOLLOW_COMMA_in_stmt923 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_stmt926 = new BitSet(new long[]{0x0000000010000080L});
	public static final BitSet FOLLOW_RPAREN_in_stmt930 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stmt933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stmt_in_stmtlist942 = new BitSet(new long[]{0x00007F2000028002L});
	public static final BitSet FOLLOW_LBRACE_in_body966 = new BitSet(new long[]{0x00007F6808028000L});
	public static final BitSet FOLLOW_decls_in_body969 = new BitSet(new long[]{0x00007F2008028000L});
	public static final BitSet FOLLOW_stmtlist_in_body971 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RBRACE_in_body973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lexp_in_exp981 = new BitSet(new long[]{0x0000000001186802L});
	public static final BitSet FOLLOW_set_in_exp984 = new BitSet(new long[]{0x0000000002448040L});
	public static final BitSet FOLLOW_lexp_in_exp1010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_lexp1020 = new BitSet(new long[]{0x0000000004400002L});
	public static final BitSet FOLLOW_set_in_lexp1023 = new BitSet(new long[]{0x0000000002448040L});
	public static final BitSet FOLLOW_term_in_lexp1032 = new BitSet(new long[]{0x0000000004400002L});
	public static final BitSet FOLLOW_factor_in_term1043 = new BitSet(new long[]{0x0000000100800402L});
	public static final BitSet FOLLOW_set_in_term1046 = new BitSet(new long[]{0x0000000002448040L});
	public static final BitSet FOLLOW_factor_in_term1055 = new BitSet(new long[]{0x0000000100800402L});
	public static final BitSet FOLLOW_LPAREN_in_factor1064 = new BitSet(new long[]{0x0000000002448040L});
	public static final BitSet FOLLOW_lexp_in_factor1067 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_factor1069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_factor1082 = new BitSet(new long[]{0x0000000002008000L});
	public static final BitSet FOLLOW_set_in_factor1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_factor1103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor1114 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_factor1116 = new BitSet(new long[]{0x0000000010008000L});
	public static final BitSet FOLLOW_ID_in_factor1120 = new BitSet(new long[]{0x0000000010000080L});
	public static final BitSet FOLLOW_COMMA_in_factor1122 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_factor1125 = new BitSet(new long[]{0x0000000010000080L});
	public static final BitSet FOLLOW_RPAREN_in_factor1131 = new BitSet(new long[]{0x0000000000000002L});
}
