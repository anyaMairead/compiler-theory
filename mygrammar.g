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
        COMMA = ',';
        LPAREN = '(';
        RPAREN = ')';
        LBRACE = '{';
        RBRACE = '}';
        }
        
@members {public static main(String[] args) throws {
              Lexer l = new Lexer(new ANTLRFileStream(...));
              CommonTokenStream tokens = new CommonTokenStream(l);
              Parser p = new Parser(tokens);
              try {p.exp();} catch (Exception e) {System.out.println("Should hopefully never happen");}
          }
          }
          
/*LEXER*/
CHAR :  '\'' (~('\''|'\\') ) '\'';

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

INT :	'0'..'9'+;

NUMBER 	:	(INT)+;

STRING :  '"' (~('\\'|'"') )* '"';



WS  :   ( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};



/*PARSER*/
program	:	...;
includes :	...;
main	: ...;
procedure :	...;
typeident :	...;
decls 	:	...;
stmt : ...;
body 	: ...;
exp : ...;
lexp 	: ...;	
term 	: factor ((TIMES|MOD|DIV) factor)*;
factor : LPAREN lexp RPAREN
        |(MINUS)? (ID | NUMBER)
        |CHAR
        |ID LPAREN (ID(COMMA ID)*)? RPAREN ;
	