grammar mygrammar;

tokens {PLUS = '+';
        MINUS = '-';
        TIMES = '*';
        DIVIDE = "/";
        MOD = "%";
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
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

INT :	'0'..'9'+;

STRING :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"';

CHAR :  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\'';

WS  :   ( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};

/*maybe not for small-c*/

FLOAT :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
          | '.' ('0'..'9')+ EXPONENT?
          | ('0'..'9')+ EXPONENT;

COMMENT :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};


fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
ESC_SEQ :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');

/*PARSER*/