import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.io.*;

public class Translator extends GramaticaBaseListener {

	private static BufferedWriter out;

	static {
		try {
			out = new BufferedWriter(new FileWriter(new File("output/output.gcc")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void file(String txt) {
		try {
			out.write(txt);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void Cfile() {
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void exitS(GramaticaParser.SContext ctx) {
		Cfile();
	}

	//////////////////////////////////////    estructura del programa principal    /////////////////////////////////////////////////
	@Override
	public void enterPrograma(GramaticaParser.ProgramaContext ctx) {

		if (ctx.Tk_programa() != null) {
			file("// program ");

		}

		if (ctx.Tk_id() != null) {
			file(ctx.Tk_id().getText());
			file("\n");

		}
	}

	@Override
	public void enterCuerpo(GramaticaParser.CuerpoContext ctx) {

		if (ctx.Tk_inicio() != null) {
			file("int main() \n{\n");

		}
	}

	@Override
	public void exitCuerpo(GramaticaParser.CuerpoContext ctx) {

		if (ctx.Tk_fin() != null) {
			file("\n}\n");

		}

	}

	////////////////////////////////////////////////// Declaraciones ////////////////////////////////////////////////////////


	//Variables
	@Override
	public void enterVariables_aux(GramaticaParser.Variables_auxContext ctx) {

		if (ctx.tipo() != null) {
			if (ctx.tipo().getChild(0) == ctx.tipo().Tk_numerico()) {
				file("float ");
			}
			if (ctx.tipo().getChild(0) == ctx.tipo().Tk_cadena()) {
				file("string ");
			}
			if (ctx.tipo().getChild(0) == ctx.tipo().Tk_logico()) {
				file("bool ");
			}
			if (ctx.tipo().getChild(0) == ctx.tipo().registro()) {
				file("struct ");
			}
		}

		for (ParseTree i : ctx.children) {
			if (i.getText().equals(":")) {
				break;
			}
			file(i.getText());
		}

		if (ctx.Tk_vector() != null) {
			file("[");
			if(ctx.vectorAux(0).getChild(0) == ctx.vectorAux(0).operacionMatematica()){
				file(ctx.vectorAux(0).getChild(0).getText());
			}
			file("]");

		}

		if (ctx.Tk_matriz() != null) {
			for(GramaticaParser.VectorAuxContext i : ctx.vectorAux()){
				file("[");
				if(i.getChild(0) == i.operacionMatematica()){
					file(i.getText());
				}
				file("]");
			}
		}

		if (ctx.eol() != null) {
			if (ctx.tipo().getChild(0) != ctx.tipo().registro()) {
				file(";\n");
			}
		}
	}

	@Override
	public void enterRegistro(GramaticaParser.RegistroContext ctx) {
		file(" {\n");
	}

	@Override
	public void exitRegistro(GramaticaParser.RegistroContext ctx) {
		file("}\n");
	}

	//Constantes

	@Override
	public void enterConstants_aux(GramaticaParser.Constants_auxContext ctx) {
		file("const ");

		if(ctx.valor().getChild(0) == ctx.valor().verdad()){

			file("bool ");
		}

		if(ctx.valor().getChild(0) == ctx.valor().operacionMatematica()){

			file("float ");
		}

		if(ctx.valor().getChild(0) == ctx.valor().Tk_str()){

			file("string ");
		}

		file(ctx.Tk_id().getText());
		file(" = ");

		if(ctx.valor().getChild(0) != ctx.valor().verdad()){
			file(ctx.valor().getText());
		}else {
			if(ctx.valor().getText().equals("TRUE")){
				file("true");
			}
			if(ctx.valor().getText().equals("FALSE")){
				file("false");
			}
		}

		file(";\n");

	}

	//tipos

	// WTF y aquí qué?


	////////////////////////////////////////////////    Sentencias    ///////////////////////////////////////////////////////

	// asignaciones

	@Override
	public void enterAsignacion(GramaticaParser.AsignacionContext ctx) {
		if (ctx.Tk_id() != null) {
			file(ctx.Tk_id().getText());

		}
		if (ctx.Tk_assig() != null) {
			file(" = ");

		}
		if(ctx.asignacionAux().getChild(0) == ctx.asignacionAux().llamada()){
			file(ctx.asignacionAux().getChild(0).getText());

		}
		if(ctx.asignacionAux().valor() != null){
			if(ctx.asignacionAux().valor().getChild(0) == ctx.asignacionAux().valor().verdad()){
				if(ctx.asignacionAux().valor().getText().equals("TRUE")){
					file("true");
				}
				if(ctx.asignacionAux().valor().getText().equals("FALSE")){
					file("false");
				}

			}else{
				file(ctx.asignacionAux().valor().getChild(0).getText());

			}
		}
	}

	@Override
	public void exitAsignacion(GramaticaParser.AsignacionContext ctx) {
		file(";\n");
	}

	// condicional (if)

	@Override
	public void enterCondicional(GramaticaParser.CondicionalContext ctx) {
		file("if ( ");
		file(ctx.condicion().getText());
		file(" ) \n{\n");

	}
	@Override
	public void exitCondicional(GramaticaParser.CondicionalContext ctx) {
		file("} \n ");
	}

	@Override
	public void enterCondicionSinoSi(GramaticaParser.CondicionSinoSiContext ctx) {
		file("}else if (");
		file(ctx.condicion().getText());
		file(") \n{\n");

	}

	@Override
	public void enterCondicionSino(GramaticaParser.CondicionSinoContext ctx) {
		file("}else\n{\n");
	}

	//ciclo mientras (while)

	@Override
	public void enterCicloMientras(GramaticaParser.CicloMientrasContext ctx) {
		file("while ( ");
		file(ctx.condicion().getText());
		file(" )\n{\n");
	}

	@Override
	public void exitCicloMientras(GramaticaParser.CicloMientrasContext ctx) {
		file("}\n");
	}

	//ciclo repetir hasta

	@Override
	public void enterCicloRepetir(GramaticaParser.CicloRepetirContext ctx) {
		file("do\n{\n");
	}

	@Override
	public void exitCicloRepetir(GramaticaParser.CicloRepetirContext ctx) {
		file("}\nwhile ( ");
		file(ctx.condicion().getText());
		file(" );");

	}

	//eval (switch-case)

	@Override
	public void enterEval(GramaticaParser.EvalContext ctx) {
	}//falta el Break
	@Override
	public void exitEval(GramaticaParser.EvalContext ctx) {
		file("\n}\n");
	}

	@Override
	public void enterEvalAux(GramaticaParser.EvalAuxContext ctx) {
		file("if (");
		file(ctx.condicion().getText());
		file(") \n{\n");
	}

	//ciclo desde hasta

	@Override
	public void enterDesde(GramaticaParser.DesdeContext ctx) {
		file("for (");
			file(ctx.Tk_id().getText());
			file(" = ");
			file(ctx.operacionMatematica(0).getText());
			file(" ; ");
			file(ctx.Tk_id().getText());
			file("<");
			file(ctx.operacionMatematica(1).getText());
			if(ctx.Tk_paso() != null){
				file(" ; i = i + ");
				file(ctx.operacionMatematica(2).getText());
				file(")\n{\n");
			}else{

				file(" ; i++)\n{\n");
			}
		}
	@Override
	public void exitDesde(GramaticaParser.DesdeContext ctx) {
		file("\n}\n");
	}

	//llamado de funciones

	@Override
	public void enterLlamada(GramaticaParser.LlamadaContext ctx) {
		if(ctx.Tk_id().getText().equals("imprimir")){
			file("cout");
			for(GramaticaParser.TiposLLamadaContext i : ctx.tiposLLamada()){
				file(" << ");

				file(i.getText());
			}
			file(";\n");

		}
		if(ctx.Tk_id().getText().equals("leer")){
			file("cin >> ");
			for(GramaticaParser.TiposLLamadaContext i : ctx.tiposLLamada()){
				file(" >> ");

				file(i.getText());
			}
			file(";\n");

		}

		// no se llaman funciones únicas aparte de estas dos no se como lograr que funcionen aparte
	}




////////////////////////////////////////////////// Sub RUtinas  ////////////////////////////////////////////////////////////////


	@Override
	public void enterSubRutinas(GramaticaParser.SubRutinasContext ctx) {
		if(ctx.tipo() != null){
			file(ctx.tipo().getText());
			if(ctx.tipo().Tk_logico() == ctx.tipo().getChild(0)){
				file("bool ");
			}
			if(ctx.tipo().Tk_cadena() == ctx.tipo().getChild(0)){
				file("string ");
			}
			if(ctx.tipo().Tk_numerico() == ctx.tipo().getChild(0)){
				file("float ");
			}
		}else {
			file("void ");
		}
		if(ctx.Tk_id() != null){
			file(ctx.Tk_id().getText());
		}
		file(" ( ");

	}

	@Override
	public void enterSubParamatros(GramaticaParser.SubParamatrosContext ctx) {

		boolean b = false;
		for(TerminalNode i : ctx.Tk_id()){
			if(b){
				file(" , ");
			}
			b = true;
			if(ctx.tipo() != null) {
				file(ctx.tipo().getText());
				if (ctx.tipo().Tk_numerico() == ctx.tipo().getChild(0)) {
					file("float ");
				}
				if (ctx.tipo().Tk_logico() == ctx.tipo().getChild(0)) {
					file("bool ");
				}
				if (ctx.tipo().Tk_cadena() == ctx.tipo().getChild(0)) {
					file("string ");
				}
			}
			if(ctx.Tk_ref() != null){
				file("&");
			}
			file(i.getText());
		}
		file(" ");
	}

	@Override
	public void enterSubRutinasDeclar(GramaticaParser.SubRutinasDeclarContext ctx) {
		file(")\n");
	}

	@Override
	public void enterSubRutinasAux(GramaticaParser.SubRutinasAuxContext ctx) {
		file("{\n");
	}
	@Override
	public void exitSubRutinasAux(GramaticaParser.SubRutinasAuxContext ctx) {
		file("\n}\n");
	}

	@Override
	public void enterRetorna(GramaticaParser.RetornaContext ctx) {
		file("return ");
		if(ctx.retornaAux().getChild(0) == ctx.retornaAux().verdad()){
			if(ctx.retornaAux().getText().equals("TRUE")){
				file("true");
			}
			if(ctx.retornaAux().getText().equals("FALSE")){
				file("false");
			}
		}else {
			file(ctx.retornaAux().getText());
		}
		file(" ;\n");

	}

/////////////////////////////////////// no se como llamar esta sección 2.0 //////////////////////////////////////////////////
// por ahora vacía


}