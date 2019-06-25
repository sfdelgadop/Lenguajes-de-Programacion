import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
	public static void main(String[] args) throws Exception {
		try{
			// crear un analizador léxico que se alimenta a partir de la entrada (archivo  o consola)
			GramaticaLexer lexer;
			if (args.length>0)
				lexer = new GramaticaLexer(CharStreams.fromFileName(args[0]));
			else
				lexer = new GramaticaLexer(CharStreams.fromStream(System.in));
			// Identificar al analizador léxico como fuente de tokens para el sintactico
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// Crear el objeto correspondiente al analizador sintáctico que se alimenta a partir del buffer de tokens
			GramaticaParser parser = new GramaticaParser(tokens);
			ParseTree tree = parser.s(); // Iniciar el analisis sintáctico en la regla inicial:
			//System.out.println(tree.toStringTree(parser)); // imprime el arbol al estilo LISP
			// Create a generic parse tree walker that can trigger callbacks

			ParseTreeWalker walker = new ParseTreeWalker();
			// Walk the tree created during the parse, trigger callbacks

			walker.walk(new Translator(), tree);
			System.out.println(); // print a \n after translation





		} catch (Exception e){
			System.err.println("Error (Test): " + e);
		}
	}
}
