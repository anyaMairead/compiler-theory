import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        mygrammarLexer lex = new mygrammarLexer(new ANTLRFileStream("/Users/Anya/github/compiler-theory/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        mygrammarParser g = new mygrammarParser(tokens);
        try {
            g.stmt();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}