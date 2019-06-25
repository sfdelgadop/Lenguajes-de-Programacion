// Generated from /home/sebastian/Documentos/GitHub/Lenguajes-de-Programacion/traductorSLtoC/grammar/Gramatica.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(GramaticaParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(GramaticaParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(GramaticaParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#variables_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables_aux(GramaticaParser.Variables_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#vectorAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorAux(GramaticaParser.VectorAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(GramaticaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#constants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstants(GramaticaParser.ConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#constants_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstants_aux(GramaticaParser.Constants_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(GramaticaParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#verdad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerdad(GramaticaParser.VerdadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(GramaticaParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#types_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes_aux(GramaticaParser.Types_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(GramaticaParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(GramaticaParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(GramaticaParser.SentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(GramaticaParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#asignacionAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionAux(GramaticaParser.AsignacionAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#estruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruct(GramaticaParser.EstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#estruct2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruct2(GramaticaParser.Estruct2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#condicionSinoSi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionSinoSi(GramaticaParser.CondicionSinoSiContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#condicionSino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionSino(GramaticaParser.CondicionSinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#cicloMientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloMientras(GramaticaParser.CicloMientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#cicloRepetir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloRepetir(GramaticaParser.CicloRepetirContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval(GramaticaParser.EvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#evalAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalAux(GramaticaParser.EvalAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#desde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesde(GramaticaParser.DesdeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#llamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada(GramaticaParser.LlamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#tiposLLamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiposLLamada(GramaticaParser.TiposLLamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#subRutinas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRutinas(GramaticaParser.SubRutinasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#subRutinasDeclar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRutinasDeclar(GramaticaParser.SubRutinasDeclarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#subRutinasAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRutinasAux(GramaticaParser.SubRutinasAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#retorna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorna(GramaticaParser.RetornaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#retornaAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetornaAux(GramaticaParser.RetornaAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#subParamatros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubParamatros(GramaticaParser.SubParamatrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#operacionMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacionMatematica(GramaticaParser.OperacionMatematicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#precedencia1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedencia1(GramaticaParser.Precedencia1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#precedencia2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedencia2(GramaticaParser.Precedencia2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#precedencia3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedencia3(GramaticaParser.Precedencia3Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#signo1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigno1(GramaticaParser.Signo1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#signo2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigno2(GramaticaParser.Signo2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#signo3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigno3(GramaticaParser.Signo3Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#auxNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxNum(GramaticaParser.AuxNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(GramaticaParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#condicionAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionAux(GramaticaParser.CondicionAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacional(GramaticaParser.RelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#auxLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxLog(GramaticaParser.AuxLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(GramaticaParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#matriz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatriz(GramaticaParser.MatrizContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#eol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEol(GramaticaParser.EolContext ctx);
}