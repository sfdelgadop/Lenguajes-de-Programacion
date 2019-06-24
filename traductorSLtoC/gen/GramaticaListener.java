// Generated from /home/sebastian/IdeaProjects/traductorSLtoC/grammar/Gramatica.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(GramaticaParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(GramaticaParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(GramaticaParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(GramaticaParser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(GramaticaParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(GramaticaParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#variables_aux}.
	 * @param ctx the parse tree
	 */
	void enterVariables_aux(GramaticaParser.Variables_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#variables_aux}.
	 * @param ctx the parse tree
	 */
	void exitVariables_aux(GramaticaParser.Variables_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#vectorAux}.
	 * @param ctx the parse tree
	 */
	void enterVectorAux(GramaticaParser.VectorAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#vectorAux}.
	 * @param ctx the parse tree
	 */
	void exitVectorAux(GramaticaParser.VectorAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GramaticaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GramaticaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterConstants(GramaticaParser.ConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitConstants(GramaticaParser.ConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#constants_aux}.
	 * @param ctx the parse tree
	 */
	void enterConstants_aux(GramaticaParser.Constants_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#constants_aux}.
	 * @param ctx the parse tree
	 */
	void exitConstants_aux(GramaticaParser.Constants_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(GramaticaParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(GramaticaParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#verdad}.
	 * @param ctx the parse tree
	 */
	void enterVerdad(GramaticaParser.VerdadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#verdad}.
	 * @param ctx the parse tree
	 */
	void exitVerdad(GramaticaParser.VerdadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(GramaticaParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(GramaticaParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#types_aux}.
	 * @param ctx the parse tree
	 */
	void enterTypes_aux(GramaticaParser.Types_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#types_aux}.
	 * @param ctx the parse tree
	 */
	void exitTypes_aux(GramaticaParser.Types_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(GramaticaParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(GramaticaParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo(GramaticaParser.CuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo(GramaticaParser.CuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(GramaticaParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(GramaticaParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(GramaticaParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(GramaticaParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#asignacionAux}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionAux(GramaticaParser.AsignacionAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#asignacionAux}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionAux(GramaticaParser.AsignacionAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#estruct}.
	 * @param ctx the parse tree
	 */
	void enterEstruct(GramaticaParser.EstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#estruct}.
	 * @param ctx the parse tree
	 */
	void exitEstruct(GramaticaParser.EstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#condicionSinoSi}.
	 * @param ctx the parse tree
	 */
	void enterCondicionSinoSi(GramaticaParser.CondicionSinoSiContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#condicionSinoSi}.
	 * @param ctx the parse tree
	 */
	void exitCondicionSinoSi(GramaticaParser.CondicionSinoSiContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#condicionSino}.
	 * @param ctx the parse tree
	 */
	void enterCondicionSino(GramaticaParser.CondicionSinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#condicionSino}.
	 * @param ctx the parse tree
	 */
	void exitCondicionSino(GramaticaParser.CondicionSinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#cicloMientras}.
	 * @param ctx the parse tree
	 */
	void enterCicloMientras(GramaticaParser.CicloMientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#cicloMientras}.
	 * @param ctx the parse tree
	 */
	void exitCicloMientras(GramaticaParser.CicloMientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#cicloRepetir}.
	 * @param ctx the parse tree
	 */
	void enterCicloRepetir(GramaticaParser.CicloRepetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#cicloRepetir}.
	 * @param ctx the parse tree
	 */
	void exitCicloRepetir(GramaticaParser.CicloRepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(GramaticaParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(GramaticaParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#evalAux}.
	 * @param ctx the parse tree
	 */
	void enterEvalAux(GramaticaParser.EvalAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#evalAux}.
	 * @param ctx the parse tree
	 */
	void exitEvalAux(GramaticaParser.EvalAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#desde}.
	 * @param ctx the parse tree
	 */
	void enterDesde(GramaticaParser.DesdeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#desde}.
	 * @param ctx the parse tree
	 */
	void exitDesde(GramaticaParser.DesdeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#llamada}.
	 * @param ctx the parse tree
	 */
	void enterLlamada(GramaticaParser.LlamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#llamada}.
	 * @param ctx the parse tree
	 */
	void exitLlamada(GramaticaParser.LlamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tiposLLamada}.
	 * @param ctx the parse tree
	 */
	void enterTiposLLamada(GramaticaParser.TiposLLamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tiposLLamada}.
	 * @param ctx the parse tree
	 */
	void exitTiposLLamada(GramaticaParser.TiposLLamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#subRutinas}.
	 * @param ctx the parse tree
	 */
	void enterSubRutinas(GramaticaParser.SubRutinasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#subRutinas}.
	 * @param ctx the parse tree
	 */
	void exitSubRutinas(GramaticaParser.SubRutinasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#subParamatros}.
	 * @param ctx the parse tree
	 */
	void enterSubParamatros(GramaticaParser.SubParamatrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#subParamatros}.
	 * @param ctx the parse tree
	 */
	void exitSubParamatros(GramaticaParser.SubParamatrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operacionMatematica}.
	 * @param ctx the parse tree
	 */
	void enterOperacionMatematica(GramaticaParser.OperacionMatematicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operacionMatematica}.
	 * @param ctx the parse tree
	 */
	void exitOperacionMatematica(GramaticaParser.OperacionMatematicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#precedencia1}.
	 * @param ctx the parse tree
	 */
	void enterPrecedencia1(GramaticaParser.Precedencia1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#precedencia1}.
	 * @param ctx the parse tree
	 */
	void exitPrecedencia1(GramaticaParser.Precedencia1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#precedencia2}.
	 * @param ctx the parse tree
	 */
	void enterPrecedencia2(GramaticaParser.Precedencia2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#precedencia2}.
	 * @param ctx the parse tree
	 */
	void exitPrecedencia2(GramaticaParser.Precedencia2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#precedencia3}.
	 * @param ctx the parse tree
	 */
	void enterPrecedencia3(GramaticaParser.Precedencia3Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#precedencia3}.
	 * @param ctx the parse tree
	 */
	void exitPrecedencia3(GramaticaParser.Precedencia3Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#signo1}.
	 * @param ctx the parse tree
	 */
	void enterSigno1(GramaticaParser.Signo1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#signo1}.
	 * @param ctx the parse tree
	 */
	void exitSigno1(GramaticaParser.Signo1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#signo2}.
	 * @param ctx the parse tree
	 */
	void enterSigno2(GramaticaParser.Signo2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#signo2}.
	 * @param ctx the parse tree
	 */
	void exitSigno2(GramaticaParser.Signo2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#signo3}.
	 * @param ctx the parse tree
	 */
	void enterSigno3(GramaticaParser.Signo3Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#signo3}.
	 * @param ctx the parse tree
	 */
	void exitSigno3(GramaticaParser.Signo3Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#auxNum}.
	 * @param ctx the parse tree
	 */
	void enterAuxNum(GramaticaParser.AuxNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#auxNum}.
	 * @param ctx the parse tree
	 */
	void exitAuxNum(GramaticaParser.AuxNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(GramaticaParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(GramaticaParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#condicionAux}.
	 * @param ctx the parse tree
	 */
	void enterCondicionAux(GramaticaParser.CondicionAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#condicionAux}.
	 * @param ctx the parse tree
	 */
	void exitCondicionAux(GramaticaParser.CondicionAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#relacional}.
	 * @param ctx the parse tree
	 */
	void enterRelacional(GramaticaParser.RelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#relacional}.
	 * @param ctx the parse tree
	 */
	void exitRelacional(GramaticaParser.RelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#auxLog}.
	 * @param ctx the parse tree
	 */
	void enterAuxLog(GramaticaParser.AuxLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#auxLog}.
	 * @param ctx the parse tree
	 */
	void exitAuxLog(GramaticaParser.AuxLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(GramaticaParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(GramaticaParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#matriz}.
	 * @param ctx the parse tree
	 */
	void enterMatriz(GramaticaParser.MatrizContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#matriz}.
	 * @param ctx the parse tree
	 */
	void exitMatriz(GramaticaParser.MatrizContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#eol}.
	 * @param ctx the parse tree
	 */
	void enterEol(GramaticaParser.EolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#eol}.
	 * @param ctx the parse tree
	 */
	void exitEol(GramaticaParser.EolContext ctx);
}