// $ANTLR 3.5 /Users/Anya/github/compiler-theory/mygrammar.g 2013-02-15 14:17:35

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class mygrammarParser extends Parser {
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


	public mygrammarParser(CommonTokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public mygrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}


	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return mygrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/Anya/github/compiler-theory/mygrammar.g"; }


	         public static void main(String[] args) throws RecognitionException, IOException {
	              mygrammarLexer l = new mygrammarLexer(new ANTLRFileStream(args[4]));
	              CommonTokenStream tokens = new CommonTokenStream(l);
	              mygrammarParser p = new mygramamrParser(tokens);
	              try {
	                  p.exp();
	              } 
	              catch (RecognitionException rex) {
	                  p.displayRecognitionError(tokenNames, rex);
	                  System.err.println("Exception: " + rex);
	              }
	              catch (IOException io) {
	                  System.err.println("Exception: " + io);
	              }
	          }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /Users/Anya/github/compiler-theory/mygrammar.g:64:1: program : includes decls ( procedure )* main EOF ;
	public final mygrammarParser.program_return program() throws RecognitionException {
		mygrammarParser.program_return retval = new mygrammarParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF5=null;
		ParserRuleReturnScope includes1 =null;
		ParserRuleReturnScope decls2 =null;
		ParserRuleReturnScope procedure3 =null;
		ParserRuleReturnScope main4 =null;

		Object EOF5_tree=null;

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:64:9: ( includes decls ( procedure )* main EOF )
			// /Users/Anya/github/compiler-theory/mygrammar.g:64:11: includes decls ( procedure )* main EOF
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_includes_in_program555);
			includes1=includes();
			state._fsp--;

			adaptor.addChild(root_0, includes1.getTree());

			pushFollow(FOLLOW_decls_in_program557);
			decls2=decls();
			state._fsp--;

			adaptor.addChild(root_0, decls2.getTree());

			// /Users/Anya/github/compiler-theory/mygrammar.g:64:26: ( procedure )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==35||LA1_0==38) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:64:27: procedure
					{
					pushFollow(FOLLOW_procedure_in_program560);
					procedure3=procedure();
					state._fsp--;

					adaptor.addChild(root_0, procedure3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			pushFollow(FOLLOW_main_in_program564);
			main4=main();
			state._fsp--;

			adaptor.addChild(root_0, main4.getTree());

			EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_program566); 
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
		return retval;
	}
	// $ANTLR end "program"


	public static class args_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "args"
	// /Users/Anya/github/compiler-theory/mygrammar.g:65:1: args : ( typeident ( COMMA typeident )* )? -> ( ^( ARGS ( typeident ( typeident )* )? ) )? ;
	public final mygrammarParser.args_return args() throws RecognitionException {
		mygrammarParser.args_return retval = new mygrammarParser.args_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA7=null;
		ParserRuleReturnScope typeident6 =null;
		ParserRuleReturnScope typeident8 =null;

		Object COMMA7_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_typeident=new RewriteRuleSubtreeStream(adaptor,"rule typeident");

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:65:7: ( ( typeident ( COMMA typeident )* )? -> ( ^( ARGS ( typeident ( typeident )* )? ) )? )
			// /Users/Anya/github/compiler-theory/mygrammar.g:65:9: ( typeident ( COMMA typeident )* )?
			{
			// /Users/Anya/github/compiler-theory/mygrammar.g:65:9: ( typeident ( COMMA typeident )* )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==35||LA3_0==38) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:65:10: typeident ( COMMA typeident )*
					{
					pushFollow(FOLLOW_typeident_in_args575);
					typeident6=typeident();
					state._fsp--;

					stream_typeident.add(typeident6.getTree());
					// /Users/Anya/github/compiler-theory/mygrammar.g:65:20: ( COMMA typeident )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==COMMA) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// /Users/Anya/github/compiler-theory/mygrammar.g:65:21: COMMA typeident
							{
							COMMA7=(Token)match(input,COMMA,FOLLOW_COMMA_in_args578);  
							stream_COMMA.add(COMMA7);

							pushFollow(FOLLOW_typeident_in_args580);
							typeident8=typeident();
							state._fsp--;

							stream_typeident.add(typeident8.getTree());
							}
							break;

						default :
							break loop2;
						}
					}

					}
					break;

			}

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
			// 65:41: -> ( ^( ARGS ( typeident ( typeident )* )? ) )?
			{
				// /Users/Anya/github/compiler-theory/mygrammar.g:65:44: ( ^( ARGS ( typeident ( typeident )* )? ) )?
				if ( stream_typeident.hasNext() ) {
					// /Users/Anya/github/compiler-theory/mygrammar.g:65:44: ^( ARGS ( typeident ( typeident )* )? )
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_1);
					// /Users/Anya/github/compiler-theory/mygrammar.g:65:51: ( typeident ( typeident )* )?
					if ( stream_typeident.hasNext()||stream_typeident.hasNext() ) {
						adaptor.addChild(root_1, stream_typeident.nextTree());
						// /Users/Anya/github/compiler-theory/mygrammar.g:65:61: ( typeident )*
						while ( stream_typeident.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "args"


	public static class includes_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "includes"
	// /Users/Anya/github/compiler-theory/mygrammar.g:66:1: includes : ( '#include' STRING )* -> ( ^( INCLS ( STRING )* ) )? ;
	public final mygrammarParser.includes_return includes() throws RecognitionException {
		mygrammarParser.includes_return retval = new mygrammarParser.includes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal9=null;
		Token STRING10=null;

		Object string_literal9_tree=null;
		Object STRING10_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:66:10: ( ( '#include' STRING )* -> ( ^( INCLS ( STRING )* ) )? )
			// /Users/Anya/github/compiler-theory/mygrammar.g:66:12: ( '#include' STRING )*
			{
			// /Users/Anya/github/compiler-theory/mygrammar.g:66:12: ( '#include' STRING )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==34) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:66:13: '#include' STRING
					{
					string_literal9=(Token)match(input,34,FOLLOW_34_in_includes608);  
					stream_34.add(string_literal9);

					STRING10=(Token)match(input,STRING,FOLLOW_STRING_in_includes610);  
					stream_STRING.add(STRING10);

					}
					break;

				default :
					break loop4;
				}
			}

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
			// 66:33: -> ( ^( INCLS ( STRING )* ) )?
			{
				// /Users/Anya/github/compiler-theory/mygrammar.g:66:36: ( ^( INCLS ( STRING )* ) )?
				if ( stream_STRING.hasNext() ) {
					// /Users/Anya/github/compiler-theory/mygrammar.g:66:36: ^( INCLS ( STRING )* )
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INCLS, "INCLS"), root_1);
					// /Users/Anya/github/compiler-theory/mygrammar.g:66:44: ( STRING )*
					while ( stream_STRING.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "includes"


	public static class main_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "main"
	// /Users/Anya/github/compiler-theory/mygrammar.g:67:1: main : 'main' LPAREN RPAREN body -> ^( MAIN body ) ;
	public final mygrammarParser.main_return main() throws RecognitionException {
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

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:67:6: ( 'main' LPAREN RPAREN body -> ^( MAIN body ) )
			// /Users/Anya/github/compiler-theory/mygrammar.g:67:14: 'main' LPAREN RPAREN body
			{
			string_literal11=(Token)match(input,39,FOLLOW_39_in_main637);  
			stream_39.add(string_literal11);

			LPAREN12=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_main639);  
			stream_LPAREN.add(LPAREN12);

			RPAREN13=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_main641);  
			stream_RPAREN.add(RPAREN13);

			pushFollow(FOLLOW_body_in_main643);
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
			// 67:40: -> ^( MAIN body )
			{
				// /Users/Anya/github/compiler-theory/mygrammar.g:67:43: ^( MAIN body )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MAIN, "MAIN"), root_1);
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
		return retval;
	}
	// $ANTLR end "main"


	public static class procedure_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedure"
	// /Users/Anya/github/compiler-theory/mygrammar.g:68:1: procedure : ( 'int' | 'char' )? ID ^ LPAREN ! args RPAREN ! body ;
	public final mygrammarParser.procedure_return procedure() throws RecognitionException {
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

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:68:11: ( ( 'int' | 'char' )? ID ^ LPAREN ! args RPAREN ! body )
			// /Users/Anya/github/compiler-theory/mygrammar.g:68:13: ( 'int' | 'char' )? ID ^ LPAREN ! args RPAREN ! body
			{
			root_0 = (Object)adaptor.nil();


			// /Users/Anya/github/compiler-theory/mygrammar.g:68:13: ( 'int' | 'char' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==35||LA5_0==38) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:
					{
					set15=input.LT(1);
					if ( input.LA(1)==35||input.LA(1)==38 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set15));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			ID16=(Token)match(input,ID,FOLLOW_ID_in_procedure667); 
			ID16_tree = (Object)adaptor.create(ID16);
			root_0 = (Object)adaptor.becomeRoot(ID16_tree, root_0);

			LPAREN17=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_procedure670); 
			pushFollow(FOLLOW_args_in_procedure673);
			args18=args();
			state._fsp--;

			adaptor.addChild(root_0, args18.getTree());

			RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_procedure675); 
			pushFollow(FOLLOW_body_in_procedure678);
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
		return retval;
	}
	// $ANTLR end "procedure"


	public static class typeident_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeident"
	// /Users/Anya/github/compiler-theory/mygrammar.g:69:1: typeident : ( 'int' ^ ID | 'char' ^ ID );
	public final mygrammarParser.typeident_return typeident() throws RecognitionException {
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

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:69:11: ( 'int' ^ ID | 'char' ^ ID )
			int alt6=2;
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
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:69:13: 'int' ^ ID
					{
					root_0 = (Object)adaptor.nil();


					string_literal21=(Token)match(input,38,FOLLOW_38_in_typeident685); 
					string_literal21_tree = (Object)adaptor.create(string_literal21);
					root_0 = (Object)adaptor.becomeRoot(string_literal21_tree, root_0);

					ID22=(Token)match(input,ID,FOLLOW_ID_in_typeident688); 
					ID22_tree = (Object)adaptor.create(ID22);
					adaptor.addChild(root_0, ID22_tree);

					}
					break;
				case 2 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:69:25: 'char' ^ ID
					{
					root_0 = (Object)adaptor.nil();


					string_literal23=(Token)match(input,35,FOLLOW_35_in_typeident692); 
					string_literal23_tree = (Object)adaptor.create(string_literal23);
					root_0 = (Object)adaptor.becomeRoot(string_literal23_tree, root_0);

					ID24=(Token)match(input,ID,FOLLOW_ID_in_typeident695); 
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
		return retval;
	}
	// $ANTLR end "typeident"


	public static class decls_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decls"
	// /Users/Anya/github/compiler-theory/mygrammar.g:70:1: decls : ( typeident SEMICOLON )* -> ( ^( DECS ( typeident )* ) )? ;
	public final mygrammarParser.decls_return decls() throws RecognitionException {
		mygrammarParser.decls_return retval = new mygrammarParser.decls_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON26=null;
		ParserRuleReturnScope typeident25 =null;

		Object SEMICOLON26_tree=null;
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleSubtreeStream stream_typeident=new RewriteRuleSubtreeStream(adaptor,"rule typeident");

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:70:8: ( ( typeident SEMICOLON )* -> ( ^( DECS ( typeident )* ) )? )
			// /Users/Anya/github/compiler-theory/mygrammar.g:70:10: ( typeident SEMICOLON )*
			{
			// /Users/Anya/github/compiler-theory/mygrammar.g:70:10: ( typeident SEMICOLON )*
			loop7:
			while (true) {
				int alt7=2;
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

				switch (alt7) {
				case 1 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:70:11: typeident SEMICOLON
					{
					pushFollow(FOLLOW_typeident_in_decls704);
					typeident25=typeident();
					state._fsp--;

					stream_typeident.add(typeident25.getTree());
					SEMICOLON26=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_decls706);  
					stream_SEMICOLON.add(SEMICOLON26);

					}
					break;

				default :
					break loop7;
				}
			}

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
			// 70:33: -> ( ^( DECS ( typeident )* ) )?
			{
				// /Users/Anya/github/compiler-theory/mygrammar.g:70:36: ( ^( DECS ( typeident )* ) )?
				if ( stream_typeident.hasNext() ) {
					// /Users/Anya/github/compiler-theory/mygrammar.g:70:36: ^( DECS ( typeident )* )
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECS, "DECS"), root_1);
					// /Users/Anya/github/compiler-theory/mygrammar.g:70:43: ( typeident )*
					while ( stream_typeident.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "decls"


	public static class stmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stmt"
	// /Users/Anya/github/compiler-theory/mygrammar.g:71:1: stmt : ( LBRACE ! stmtlist RBRACE !| 'while' LPAREN exp RPAREN stmt -> ^( 'while' ^( EXPR exp ) stmt ) | 'if' LPAREN exp RPAREN s= stmt ( options {greedy=true; } : 'else' s2= stmt )? -> ^( 'if' ^( EXPR exp ) $s ( ^( 'else' $s2) )? ) | ID ASSIGN ^ lexp SEMICOLON !| ( 'read' | 'readc' | 'output' | 'outputc' ) ^ LPAREN ! ID RPAREN ! SEMICOLON !| 'print' ^ LPAREN ! STRING RPAREN ! SEMICOLON !| 'return' ^ ( lexp )? SEMICOLON !| ID ^ LPAREN ! ID ( COMMA ! ID )* RPAREN ! SEMICOLON !);
	public final mygrammarParser.stmt_return stmt() throws RecognitionException {
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

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:71:6: ( LBRACE ! stmtlist RBRACE !| 'while' LPAREN exp RPAREN stmt -> ^( 'while' ^( EXPR exp ) stmt ) | 'if' LPAREN exp RPAREN s= stmt ( options {greedy=true; } : 'else' s2= stmt )? -> ^( 'if' ^( EXPR exp ) $s ( ^( 'else' $s2) )? ) | ID ASSIGN ^ lexp SEMICOLON !| ( 'read' | 'readc' | 'output' | 'outputc' ) ^ LPAREN ! ID RPAREN ! SEMICOLON !| 'print' ^ LPAREN ! STRING RPAREN ! SEMICOLON !| 'return' ^ ( lexp )? SEMICOLON !| ID ^ LPAREN ! ID ( COMMA ! ID )* RPAREN ! SEMICOLON !)
			int alt11=8;
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
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:71:8: LBRACE ! stmtlist RBRACE !
					{
					root_0 = (Object)adaptor.nil();


					LBRACE27=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_stmt727); 
					pushFollow(FOLLOW_stmtlist_in_stmt730);
					stmtlist28=stmtlist();
					state._fsp--;

					adaptor.addChild(root_0, stmtlist28.getTree());

					RBRACE29=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_stmt732); 
					}
					break;
				case 2 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:72:8: 'while' LPAREN exp RPAREN stmt
					{
					string_literal30=(Token)match(input,46,FOLLOW_46_in_stmt742);  
					stream_46.add(string_literal30);

					LPAREN31=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stmt744);  
					stream_LPAREN.add(LPAREN31);

					pushFollow(FOLLOW_exp_in_stmt746);
					exp32=exp();
					state._fsp--;

					stream_exp.add(exp32.getTree());
					RPAREN33=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stmt748);  
					stream_RPAREN.add(RPAREN33);

					pushFollow(FOLLOW_stmt_in_stmt750);
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
					// 72:39: -> ^( 'while' ^( EXPR exp ) stmt )
					{
						// /Users/Anya/github/compiler-theory/mygrammar.g:72:42: ^( 'while' ^( EXPR exp ) stmt )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_46.nextNode(), root_1);
						// /Users/Anya/github/compiler-theory/mygrammar.g:72:52: ^( EXPR exp )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);
						adaptor.addChild(root_2, stream_exp.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_stmt.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:73:8: 'if' LPAREN exp RPAREN s= stmt ( options {greedy=true; } : 'else' s2= stmt )?
					{
					string_literal35=(Token)match(input,37,FOLLOW_37_in_stmt773);  
					stream_37.add(string_literal35);

					LPAREN36=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stmt775);  
					stream_LPAREN.add(LPAREN36);

					pushFollow(FOLLOW_exp_in_stmt777);
					exp37=exp();
					state._fsp--;

					stream_exp.add(exp37.getTree());
					RPAREN38=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stmt779);  
					stream_RPAREN.add(RPAREN38);

					pushFollow(FOLLOW_stmt_in_stmt783);
					s=stmt();
					state._fsp--;

					stream_stmt.add(s.getTree());
					// /Users/Anya/github/compiler-theory/mygrammar.g:73:38: ( options {greedy=true; } : 'else' s2= stmt )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==36) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/Anya/github/compiler-theory/mygrammar.g:73:64: 'else' s2= stmt
							{
							string_literal39=(Token)match(input,36,FOLLOW_36_in_stmt795);  
							stream_36.add(string_literal39);

							pushFollow(FOLLOW_stmt_in_stmt799);
							s2=stmt();
							state._fsp--;

							stream_stmt.add(s2.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: 37, s2, exp, 36, s
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
					// 73:81: -> ^( 'if' ^( EXPR exp ) $s ( ^( 'else' $s2) )? )
					{
						// /Users/Anya/github/compiler-theory/mygrammar.g:73:84: ^( 'if' ^( EXPR exp ) $s ( ^( 'else' $s2) )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_37.nextNode(), root_1);
						// /Users/Anya/github/compiler-theory/mygrammar.g:73:91: ^( EXPR exp )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);
						adaptor.addChild(root_2, stream_exp.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_s.nextTree());
						// /Users/Anya/github/compiler-theory/mygrammar.g:73:106: ( ^( 'else' $s2) )?
						if ( stream_s2.hasNext()||stream_36.hasNext() ) {
							// /Users/Anya/github/compiler-theory/mygrammar.g:73:106: ^( 'else' $s2)
							{
							Object root_2 = (Object)adaptor.nil();
							root_2 = (Object)adaptor.becomeRoot(stream_36.nextNode(), root_2);
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
					// /Users/Anya/github/compiler-theory/mygrammar.g:74:8: ID ASSIGN ^ lexp SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					ID40=(Token)match(input,ID,FOLLOW_ID_in_stmt833); 
					ID40_tree = (Object)adaptor.create(ID40);
					adaptor.addChild(root_0, ID40_tree);

					ASSIGN41=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmt835); 
					ASSIGN41_tree = (Object)adaptor.create(ASSIGN41);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN41_tree, root_0);

					pushFollow(FOLLOW_lexp_in_stmt838);
					lexp42=lexp();
					state._fsp--;

					adaptor.addChild(root_0, lexp42.getTree());

					SEMICOLON43=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt840); 
					}
					break;
				case 5 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:75:8: ( 'read' | 'readc' | 'output' | 'outputc' ) ^ LPAREN ! ID RPAREN ! SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					set44=input.LT(1);
					set44=input.LT(1);
					if ( (input.LA(1) >= 40 && input.LA(1) <= 41)||(input.LA(1) >= 43 && input.LA(1) <= 44) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set44), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN45=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stmt867); 
					ID46=(Token)match(input,ID,FOLLOW_ID_in_stmt870); 
					ID46_tree = (Object)adaptor.create(ID46);
					adaptor.addChild(root_0, ID46_tree);

					RPAREN47=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stmt872); 
					SEMICOLON48=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt875); 
					}
					break;
				case 6 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:76:8: 'print' ^ LPAREN ! STRING RPAREN ! SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					string_literal49=(Token)match(input,42,FOLLOW_42_in_stmt885); 
					string_literal49_tree = (Object)adaptor.create(string_literal49);
					root_0 = (Object)adaptor.becomeRoot(string_literal49_tree, root_0);

					LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stmt888); 
					STRING51=(Token)match(input,STRING,FOLLOW_STRING_in_stmt891); 
					STRING51_tree = (Object)adaptor.create(STRING51);
					adaptor.addChild(root_0, STRING51_tree);

					RPAREN52=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stmt893); 
					SEMICOLON53=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt896); 
					}
					break;
				case 7 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:77:8: 'return' ^ ( lexp )? SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					string_literal54=(Token)match(input,45,FOLLOW_45_in_stmt906); 
					string_literal54_tree = (Object)adaptor.create(string_literal54);
					root_0 = (Object)adaptor.becomeRoot(string_literal54_tree, root_0);

					// /Users/Anya/github/compiler-theory/mygrammar.g:77:18: ( lexp )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==CHAR||LA9_0==ID||LA9_0==LPAREN||LA9_0==MINUS||LA9_0==NUMBER) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/Anya/github/compiler-theory/mygrammar.g:77:19: lexp
							{
							pushFollow(FOLLOW_lexp_in_stmt910);
							lexp55=lexp();
							state._fsp--;

							adaptor.addChild(root_0, lexp55.getTree());

							}
							break;

					}

					SEMICOLON56=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt914); 
					}
					break;
				case 8 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:78:8: ID ^ LPAREN ! ID ( COMMA ! ID )* RPAREN ! SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					ID57=(Token)match(input,ID,FOLLOW_ID_in_stmt924); 
					ID57_tree = (Object)adaptor.create(ID57);
					root_0 = (Object)adaptor.becomeRoot(ID57_tree, root_0);

					LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stmt927); 
					ID59=(Token)match(input,ID,FOLLOW_ID_in_stmt930); 
					ID59_tree = (Object)adaptor.create(ID59);
					adaptor.addChild(root_0, ID59_tree);

					// /Users/Anya/github/compiler-theory/mygrammar.g:78:23: ( COMMA ! ID )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==COMMA) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /Users/Anya/github/compiler-theory/mygrammar.g:78:24: COMMA ! ID
							{
							COMMA60=(Token)match(input,COMMA,FOLLOW_COMMA_in_stmt933); 
							ID61=(Token)match(input,ID,FOLLOW_ID_in_stmt936); 
							ID61_tree = (Object)adaptor.create(ID61);
							adaptor.addChild(root_0, ID61_tree);

							}
							break;

						default :
							break loop10;
						}
					}

					RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stmt940); 
					SEMICOLON63=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt943); 
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
		return retval;
	}
	// $ANTLR end "stmt"


	public static class stmtlist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stmtlist"
	// /Users/Anya/github/compiler-theory/mygrammar.g:79:1: stmtlist : ( stmt )* -> ( ^( STMTS ( stmt )* ) )? ;
	public final mygrammarParser.stmtlist_return stmtlist() throws RecognitionException {
		mygrammarParser.stmtlist_return retval = new mygrammarParser.stmtlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stmt64 =null;

		RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:79:10: ( ( stmt )* -> ( ^( STMTS ( stmt )* ) )? )
			// /Users/Anya/github/compiler-theory/mygrammar.g:79:12: ( stmt )*
			{
			// /Users/Anya/github/compiler-theory/mygrammar.g:79:12: ( stmt )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==ID||LA12_0==LBRACE||LA12_0==37||(LA12_0 >= 40 && LA12_0 <= 46)) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:79:13: stmt
					{
					pushFollow(FOLLOW_stmt_in_stmtlist952);
					stmt64=stmt();
					state._fsp--;

					stream_stmt.add(stmt64.getTree());
					}
					break;

				default :
					break loop12;
				}
			}

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
			// 79:20: -> ( ^( STMTS ( stmt )* ) )?
			{
				// /Users/Anya/github/compiler-theory/mygrammar.g:79:23: ( ^( STMTS ( stmt )* ) )?
				if ( stream_stmt.hasNext() ) {
					// /Users/Anya/github/compiler-theory/mygrammar.g:79:23: ^( STMTS ( stmt )* )
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STMTS, "STMTS"), root_1);
					// /Users/Anya/github/compiler-theory/mygrammar.g:79:31: ( stmt )*
					while ( stream_stmt.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "stmtlist"


	public static class body_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "body"
	// /Users/Anya/github/compiler-theory/mygrammar.g:80:1: body : LBRACE ! decls stmtlist RBRACE !;
	public final mygrammarParser.body_return body() throws RecognitionException {
		mygrammarParser.body_return retval = new mygrammarParser.body_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACE65=null;
		Token RBRACE68=null;
		ParserRuleReturnScope decls66 =null;
		ParserRuleReturnScope stmtlist67 =null;

		Object LBRACE65_tree=null;
		Object RBRACE68_tree=null;

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:80:7: ( LBRACE ! decls stmtlist RBRACE !)
			// /Users/Anya/github/compiler-theory/mygrammar.g:80:9: LBRACE ! decls stmtlist RBRACE !
			{
			root_0 = (Object)adaptor.nil();


			LBRACE65=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_body976); 
			pushFollow(FOLLOW_decls_in_body979);
			decls66=decls();
			state._fsp--;

			adaptor.addChild(root_0, decls66.getTree());

			pushFollow(FOLLOW_stmtlist_in_body981);
			stmtlist67=stmtlist();
			state._fsp--;

			adaptor.addChild(root_0, stmtlist67.getTree());

			RBRACE68=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_body983); 
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
		return retval;
	}
	// $ANTLR end "body"


	public static class exp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exp"
	// /Users/Anya/github/compiler-theory/mygrammar.g:81:1: exp : lexp ( ( GT | LT | GTE | LTE | NEQ | EQ ) ^ lexp )? ;
	public final mygrammarParser.exp_return exp() throws RecognitionException {
		mygrammarParser.exp_return retval = new mygrammarParser.exp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set70=null;
		ParserRuleReturnScope lexp69 =null;
		ParserRuleReturnScope lexp71 =null;

		Object set70_tree=null;

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:81:5: ( lexp ( ( GT | LT | GTE | LTE | NEQ | EQ ) ^ lexp )? )
			// /Users/Anya/github/compiler-theory/mygrammar.g:81:7: lexp ( ( GT | LT | GTE | LTE | NEQ | EQ ) ^ lexp )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_lexp_in_exp991);
			lexp69=lexp();
			state._fsp--;

			adaptor.addChild(root_0, lexp69.getTree());

			// /Users/Anya/github/compiler-theory/mygrammar.g:81:12: ( ( GT | LT | GTE | LTE | NEQ | EQ ) ^ lexp )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==EQ||(LA13_0 >= GT && LA13_0 <= GTE)||(LA13_0 >= LT && LA13_0 <= LTE)||LA13_0==NEQ) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:81:13: ( GT | LT | GTE | LTE | NEQ | EQ ) ^ lexp
					{
					set70=input.LT(1);
					set70=input.LT(1);
					if ( input.LA(1)==EQ||(input.LA(1) >= GT && input.LA(1) <= GTE)||(input.LA(1) >= LT && input.LA(1) <= LTE)||input.LA(1)==NEQ ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set70), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_lexp_in_exp1020);
					lexp71=lexp();
					state._fsp--;

					adaptor.addChild(root_0, lexp71.getTree());

					}
					break;

			}

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
		return retval;
	}
	// $ANTLR end "exp"


	public static class lexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lexp"
	// /Users/Anya/github/compiler-theory/mygrammar.g:82:1: lexp : term ( ( PLUS | MINUS ) ^ term )* ;
	public final mygrammarParser.lexp_return lexp() throws RecognitionException {
		mygrammarParser.lexp_return retval = new mygrammarParser.lexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set73=null;
		ParserRuleReturnScope term72 =null;
		ParserRuleReturnScope term74 =null;

		Object set73_tree=null;

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:82:7: ( term ( ( PLUS | MINUS ) ^ term )* )
			// /Users/Anya/github/compiler-theory/mygrammar.g:82:9: term ( ( PLUS | MINUS ) ^ term )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_term_in_lexp1030);
			term72=term();
			state._fsp--;

			adaptor.addChild(root_0, term72.getTree());

			// /Users/Anya/github/compiler-theory/mygrammar.g:82:14: ( ( PLUS | MINUS ) ^ term )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:82:15: ( PLUS | MINUS ) ^ term
					{
					set73=input.LT(1);
					set73=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set73), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_lexp1042);
					term74=term();
					state._fsp--;

					adaptor.addChild(root_0, term74.getTree());

					}
					break;

				default :
					break loop14;
				}
			}

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
		return retval;
	}
	// $ANTLR end "lexp"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// /Users/Anya/github/compiler-theory/mygrammar.g:83:1: term : factor ( ( TIMES | MOD | DIV ) ^ factor )* ;
	public final mygrammarParser.term_return term() throws RecognitionException {
		mygrammarParser.term_return retval = new mygrammarParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set76=null;
		ParserRuleReturnScope factor75 =null;
		ParserRuleReturnScope factor77 =null;

		Object set76_tree=null;

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:83:7: ( factor ( ( TIMES | MOD | DIV ) ^ factor )* )
			// /Users/Anya/github/compiler-theory/mygrammar.g:83:9: factor ( ( TIMES | MOD | DIV ) ^ factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_term1053);
			factor75=factor();
			state._fsp--;

			adaptor.addChild(root_0, factor75.getTree());

			// /Users/Anya/github/compiler-theory/mygrammar.g:83:16: ( ( TIMES | MOD | DIV ) ^ factor )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==DIV||LA15_0==MOD||LA15_0==TIMES) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:83:17: ( TIMES | MOD | DIV ) ^ factor
					{
					set76=input.LT(1);
					set76=input.LT(1);
					if ( input.LA(1)==DIV||input.LA(1)==MOD||input.LA(1)==TIMES ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set76), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factor_in_term1065);
					factor77=factor();
					state._fsp--;

					adaptor.addChild(root_0, factor77.getTree());

					}
					break;

				default :
					break loop15;
				}
			}

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
		return retval;
	}
	// $ANTLR end "term"


	public static class factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// /Users/Anya/github/compiler-theory/mygrammar.g:84:1: factor : ( LPAREN ! lexp RPAREN !| ( MINUS )? ( ID | NUMBER ) | CHAR | ID LPAREN ! ( ID ( COMMA ! ID )* )? RPAREN !);
	public final mygrammarParser.factor_return factor() throws RecognitionException {
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

		try {
			// /Users/Anya/github/compiler-theory/mygrammar.g:84:8: ( LPAREN ! lexp RPAREN !| ( MINUS )? ( ID | NUMBER ) | CHAR | ID LPAREN ! ( ID ( COMMA ! ID )* )? RPAREN !)
			int alt19=4;
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
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:84:10: LPAREN ! lexp RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN78=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_factor1074); 
					pushFollow(FOLLOW_lexp_in_factor1077);
					lexp79=lexp();
					state._fsp--;

					adaptor.addChild(root_0, lexp79.getTree());

					RPAREN80=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_factor1079); 
					}
					break;
				case 2 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:85:10: ( MINUS )? ( ID | NUMBER )
					{
					root_0 = (Object)adaptor.nil();


					// /Users/Anya/github/compiler-theory/mygrammar.g:85:10: ( MINUS )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==MINUS) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/Anya/github/compiler-theory/mygrammar.g:85:11: MINUS
							{
							MINUS81=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1092); 
							MINUS81_tree = (Object)adaptor.create(MINUS81);
							adaptor.addChild(root_0, MINUS81_tree);

							}
							break;

					}

					set82=input.LT(1);
					if ( input.LA(1)==ID||input.LA(1)==NUMBER ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set82));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 3 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:86:10: CHAR
					{
					root_0 = (Object)adaptor.nil();


					CHAR83=(Token)match(input,CHAR,FOLLOW_CHAR_in_factor1113); 
					CHAR83_tree = (Object)adaptor.create(CHAR83);
					adaptor.addChild(root_0, CHAR83_tree);

					}
					break;
				case 4 :
					// /Users/Anya/github/compiler-theory/mygrammar.g:87:10: ID LPAREN ! ( ID ( COMMA ! ID )* )? RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					ID84=(Token)match(input,ID,FOLLOW_ID_in_factor1124); 
					ID84_tree = (Object)adaptor.create(ID84);
					adaptor.addChild(root_0, ID84_tree);

					LPAREN85=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_factor1126); 
					// /Users/Anya/github/compiler-theory/mygrammar.g:87:21: ( ID ( COMMA ! ID )* )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==ID) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/Anya/github/compiler-theory/mygrammar.g:87:22: ID ( COMMA ! ID )*
							{
							ID86=(Token)match(input,ID,FOLLOW_ID_in_factor1130); 
							ID86_tree = (Object)adaptor.create(ID86);
							adaptor.addChild(root_0, ID86_tree);

							// /Users/Anya/github/compiler-theory/mygrammar.g:87:24: ( COMMA ! ID )*
							loop17:
							while (true) {
								int alt17=2;
								int LA17_0 = input.LA(1);
								if ( (LA17_0==COMMA) ) {
									alt17=1;
								}

								switch (alt17) {
								case 1 :
									// /Users/Anya/github/compiler-theory/mygrammar.g:87:25: COMMA ! ID
									{
									COMMA87=(Token)match(input,COMMA,FOLLOW_COMMA_in_factor1132); 
									ID88=(Token)match(input,ID,FOLLOW_ID_in_factor1135); 
									ID88_tree = (Object)adaptor.create(ID88);
									adaptor.addChild(root_0, ID88_tree);

									}
									break;

								default :
									break loop17;
								}
							}

							}
							break;

					}

					RPAREN89=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_factor1141); 
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
		return retval;
	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_includes_in_program555 = new BitSet(new long[]{0x000000C800008000L});
	public static final BitSet FOLLOW_decls_in_program557 = new BitSet(new long[]{0x000000C800008000L});
	public static final BitSet FOLLOW_procedure_in_program560 = new BitSet(new long[]{0x000000C800008000L});
	public static final BitSet FOLLOW_main_in_program564 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeident_in_args575 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_COMMA_in_args578 = new BitSet(new long[]{0x0000004800000000L});
	public static final BitSet FOLLOW_typeident_in_args580 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_34_in_includes608 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_STRING_in_includes610 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_39_in_main637 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_main639 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_main641 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_body_in_main643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_procedure667 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_procedure670 = new BitSet(new long[]{0x0000004810000000L});
	public static final BitSet FOLLOW_args_in_procedure673 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_procedure675 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_body_in_procedure678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_typeident685 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_typeident688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_typeident692 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_typeident695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeident_in_decls704 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_decls706 = new BitSet(new long[]{0x0000004800000002L});
	public static final BitSet FOLLOW_LBRACE_in_stmt727 = new BitSet(new long[]{0x00007F2008028000L});
	public static final BitSet FOLLOW_stmtlist_in_stmt730 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RBRACE_in_stmt732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_stmt742 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_stmt744 = new BitSet(new long[]{0x0000000002448040L});
	public static final BitSet FOLLOW_exp_in_stmt746 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_stmt748 = new BitSet(new long[]{0x00007F2000028000L});
	public static final BitSet FOLLOW_stmt_in_stmt750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_stmt773 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_stmt775 = new BitSet(new long[]{0x0000000002448040L});
	public static final BitSet FOLLOW_exp_in_stmt777 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_stmt779 = new BitSet(new long[]{0x00007F2000028000L});
	public static final BitSet FOLLOW_stmt_in_stmt783 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_stmt795 = new BitSet(new long[]{0x00007F2000028000L});
	public static final BitSet FOLLOW_stmt_in_stmt799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stmt833 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_stmt835 = new BitSet(new long[]{0x0000000002448040L});
	public static final BitSet FOLLOW_lexp_in_stmt838 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stmt840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_stmt850 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_stmt867 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_stmt870 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_stmt872 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stmt875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_stmt885 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_stmt888 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_STRING_in_stmt891 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_stmt893 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stmt896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_stmt906 = new BitSet(new long[]{0x0000000022448040L});
	public static final BitSet FOLLOW_lexp_in_stmt910 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stmt914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stmt924 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_stmt927 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_stmt930 = new BitSet(new long[]{0x0000000010000080L});
	public static final BitSet FOLLOW_COMMA_in_stmt933 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_stmt936 = new BitSet(new long[]{0x0000000010000080L});
	public static final BitSet FOLLOW_RPAREN_in_stmt940 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stmt943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stmt_in_stmtlist952 = new BitSet(new long[]{0x00007F2000028002L});
	public static final BitSet FOLLOW_LBRACE_in_body976 = new BitSet(new long[]{0x00007F6808028000L});
	public static final BitSet FOLLOW_decls_in_body979 = new BitSet(new long[]{0x00007F2008028000L});
	public static final BitSet FOLLOW_stmtlist_in_body981 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RBRACE_in_body983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lexp_in_exp991 = new BitSet(new long[]{0x0000000001186802L});
	public static final BitSet FOLLOW_set_in_exp994 = new BitSet(new long[]{0x0000000002448040L});
	public static final BitSet FOLLOW_lexp_in_exp1020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_lexp1030 = new BitSet(new long[]{0x0000000004400002L});
	public static final BitSet FOLLOW_set_in_lexp1033 = new BitSet(new long[]{0x0000000002448040L});
	public static final BitSet FOLLOW_term_in_lexp1042 = new BitSet(new long[]{0x0000000004400002L});
	public static final BitSet FOLLOW_factor_in_term1053 = new BitSet(new long[]{0x0000000100800402L});
	public static final BitSet FOLLOW_set_in_term1056 = new BitSet(new long[]{0x0000000002448040L});
	public static final BitSet FOLLOW_factor_in_term1065 = new BitSet(new long[]{0x0000000100800402L});
	public static final BitSet FOLLOW_LPAREN_in_factor1074 = new BitSet(new long[]{0x0000000002448040L});
	public static final BitSet FOLLOW_lexp_in_factor1077 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_factor1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_factor1092 = new BitSet(new long[]{0x0000000002008000L});
	public static final BitSet FOLLOW_set_in_factor1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_factor1113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor1124 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_factor1126 = new BitSet(new long[]{0x0000000010008000L});
	public static final BitSet FOLLOW_ID_in_factor1130 = new BitSet(new long[]{0x0000000010000080L});
	public static final BitSet FOLLOW_COMMA_in_factor1132 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_factor1135 = new BitSet(new long[]{0x0000000010000080L});
	public static final BitSet FOLLOW_RPAREN_in_factor1141 = new BitSet(new long[]{0x0000000000000002L});
}
