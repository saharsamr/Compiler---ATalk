import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

// Visit https://stackoverflow.com/questions/26451636/how-do-i-use-antlr-generated-parser-and-lexer
public class ATalk {
	public static void main(String[] args) throws IOException {
		ANTLRInputStream reader = new ANTLRFileStream(args[0]);

		// Pass #1
		ATalkPass1Lexer pass1Lexer = new ATalkPass1Lexer(reader);
		CommonTokenStream pass1Tokens = new CommonTokenStream(pass1Lexer);
		ATalkPass1Parser pass1Parser = new ATalkPass1Parser(pass1Tokens);
		ParseTree pass1Tree = pass1Parser.program(); // Program is starting production rule
		// System.out.println(pass1Tree.toStringTree());

		// Pass #2
		reader.reset();
		ATalkPass2Lexer pass2Lexer = new ATalkPass2Lexer(reader);
		CommonTokenStream pass2Tokens = new CommonTokenStream(pass2Lexer);
		ATalkPass2Parser pass2Parser = new ATalkPass2Parser(pass2Tokens);
		ParseTree pass2Tree = pass2Parser.program();
	}
}
