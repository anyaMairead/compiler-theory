grammar mygrammar;

options {
    output = AST;
}

tokens {PLUS = '+';
        MINUS = '-';
        TIMES = '*';
        DIV = '/';
        MOD = '%';
        LT = '<';
        LTE = '<=';
        GT = '>';
        GTE = '>=';
        EQ = '==';
        NEQ = '!=';
        ASSIGN = '=';
        COMMA = ',';
        LPAREN = '(';
        RPAREN = ')';
        LBRACE = '{';
        RBRACE = '}';
        SEMICOLON = ';';
        //INCL = 'includes';
        
        //for outputting in the AST
        DECS ;
        ARGS ;
        MAIN  ;
        EXPR  ;
        STMTS  ;
        INCLS ;
        }
        
@members {public static main(String[] args) throws displayRecognitionError {
              Lexer l = new Lexer(new ANTLRFileStream(...));
              CommonTokenStream tokens = new CommonTokenStream(l);
              Parser p = new Parser(tokens);
              try {p.exp();} catch (Exception e) {System.err("Should hopefully never happen");}
          }
          }
          
/*LEXER*/

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
WS  :   ( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
CHAR :  '\'' (~('\''|'\\') ) '\'';
NUMBER 	: (DIGIT)+;
STRING :  '"' (~('\\'|'"') )* '"';
fragment DIGIT :	 '0'..'9';


/*PARSER*/
program	:	includes decls (procedure)* main EOF;
args 	:	(typeident (COMMA typeident)*)? -> ^(ARGS (typeident(typeident)*)?)?;
includes :	('#include' STRING)* -> ^(INCLS (STRING)*)?;
main	: 'main' LPAREN RPAREN body -> ^(MAIN body);
procedure :	('int' | 'char')? ID^ LPAREN! args RPAREN! body;
typeident :	'int'^ ID | 'char'^ ID;
decls 	:	(typeident SEMICOLON)* -> ^(DECS (typeident)*)?;
stmt : LBRACE! stmtlist RBRACE!
     | 'while' LPAREN exp RPAREN stmt -> ^('while' ^(EXPR exp) stmt)
     | 'if' LPAREN exp RPAREN s=stmt (options {greedy=true;} : 'else' s2=stmt)? -> ^('if' ^(EXPR exp) $s ^('else' $s2)?)
     | ID ASSIGN^ lexp SEMICOLON!
     | ('read' | 'readc' | 'output' | 'outputc')^ LPAREN! ID RPAREN! SEMICOLON!
     | 'print'^ LPAREN! STRING RPAREN! SEMICOLON!
     | 'return'^ (lexp)? SEMICOLON!
     | ID^ LPAREN! ID (COMMA! ID)* RPAREN! SEMICOLON!;
stmtlist : (stmt)* -> ^(STMTS (stmt)*)?;	 
body 	: LBRACE! decls stmtlist RBRACE!;
exp : lexp ((GT | LT | GTE | LTE  | NEQ | EQ)^ lexp)?;
lexp 	: term ((PLUS | MINUS)^ term)*;	
term 	: factor ((TIMES|MOD|DIV)^ factor)*;
factor : LPAREN! lexp RPAREN!
        |(MINUS)? (ID | NUMBER)
        |CHAR
        |ID LPAREN! (ID(COMMA! ID)*)? RPAREN! ;
	