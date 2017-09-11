import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeListener;


public class main {

static String output = "";
public static void main(String[] args) 
{
    try 
    {
        ANTLRInputStream input = new ANTLRInputStream(
            new FileInputStream(args[0]));    

        LinguagemAlgoritimicaLexer lexer = new LinguagemAlgoritimicaLexer(input);
        LinguagemAlgoritimicaParser parser = new LinguagemAlgoritimicaParser(new CommonTokenStream(lexer));
        parser.addErrorListener(new BaseErrorListener()
        {
        	 @Override
        	 public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) 
             {
                if (output.isEmpty()) {
                    String token = ((CommonToken) offendingSymbol).getText();
                    if (token.matches("<EOF>")) {
                        token = new String("EOF");
                    }
                    main.output = main.output.concat("Linha " + line + ": erro sintatico proximo a " + token + "\n");
                }
        	 }
        });

        try {
            parser.programa();
        }
        catch (ParseCancellationException pce) {
            if (pce.getMessage() != null) {
                main.output = main.output.concat(pce.getMessage());
            }
        }

        /*FileWriter fileWriter2 = new FileWriter("output.txt");
        PrintWriter printWriter2 = new PrintWriter(fileWriter2);
        printWriter2.append('\n'+args[1]);
        printWriter2.close();
        */
        
        System.out.println("Salvando em "+args[1]);
        FileWriter fileWriter = new FileWriter(args[1]);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(main.output);
        printWriter.println("Fim da compilacao");
        printWriter.close();
        
    }
    catch (IOException e) 
    {
        e.printStackTrace();
    }
}
}
