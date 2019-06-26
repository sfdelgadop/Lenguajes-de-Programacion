// Generated from /home/sebastian/Documentos/GitHub/Lenguajes-de-Programacion/traductorSLtoC/grammar/Gramatica.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Tk_inicio=1, Tk_fin=2, Tk_var=3, Tk_cons=4, Tk_tipos=5, Tk_programa=6, 
		Tk_numerico=7, Tk_logico=8, Tk_cadena=9, Tk_registro=10, Tk_true=11, Tk_false=12, 
		Tk_and=13, Tk_or=14, Tk_mientras=15, Tk_repetir=16, Tk_hasta=17, Tk_eval=18, 
		Tk_caso=19, Tk_desde=20, Tk_paso=21, Tk_si=22, Tk_sino=23, Tk_subrutina=24, 
		Tk_retorna=25, Tk_ref=26, Tk_vector=27, Tk_matriz=28, Tk_sum=29, Tk_subt=30, 
		Tk_div=31, Tk_mult=32, Tk_mod=33, Tk_exp=34, Tk_less=35, Tk_lessEqual=36, 
		Tk_bigger=37, Tk_biggerEqual=38, Tk_equal=39, Tk_diferent=40, Tk_comma=41, 
		Tk_colon=42, Tk_semicolon=43, Tk_assig=44, Tk_okey=45, Tk_ckey=46, Tk_opar=47, 
		Tk_cpar=48, Tk_obracket=49, Tk_cbracket=50, Tk_num=51, Tk_str=52, Tk_id=53, 
		COMMENT=54, LINE_COMMENT=55, EOL=56, WS=57;
	public static final int
		RULE_s = 0, RULE_programa = 1, RULE_declaraciones = 2, RULE_variables = 3, 
		RULE_variables_aux = 4, RULE_vectorAux = 5, RULE_tipo = 6, RULE_constants = 7, 
		RULE_constants_aux = 8, RULE_valor = 9, RULE_verdad = 10, RULE_types = 11, 
		RULE_types_aux = 12, RULE_registro = 13, RULE_cuerpo = 14, RULE_sentencias = 15, 
		RULE_asignacion = 16, RULE_asignacionAux = 17, RULE_estruct = 18, RULE_condicional = 19, 
		RULE_condicionSinoSi = 20, RULE_condicionSino = 21, RULE_cicloMientras = 22, 
		RULE_cicloRepetir = 23, RULE_eval = 24, RULE_evalAux = 25, RULE_desde = 26, 
		RULE_llamada = 27, RULE_tiposLLamada = 28, RULE_subRutinas = 29, RULE_subRutinasDeclar = 30, 
		RULE_subRutinasAux = 31, RULE_retorna = 32, RULE_retornaAux = 33, RULE_subParamatros = 34, 
		RULE_operacionMatematica = 35, RULE_precedencia1 = 36, RULE_precedencia2 = 37, 
		RULE_precedencia3 = 38, RULE_signo1 = 39, RULE_signo2 = 40, RULE_signo3 = 41, 
		RULE_auxNum = 42, RULE_condicion = 43, RULE_condicionAux = 44, RULE_relacional = 45, 
		RULE_auxLog = 46, RULE_vector = 47, RULE_matriz = 48, RULE_eol = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "programa", "declaraciones", "variables", "variables_aux", "vectorAux", 
			"tipo", "constants", "constants_aux", "valor", "verdad", "types", "types_aux", 
			"registro", "cuerpo", "sentencias", "asignacion", "asignacionAux", "estruct", 
			"condicional", "condicionSinoSi", "condicionSino", "cicloMientras", "cicloRepetir", 
			"eval", "evalAux", "desde", "llamada", "tiposLLamada", "subRutinas", 
			"subRutinasDeclar", "subRutinasAux", "retorna", "retornaAux", "subParamatros", 
			"operacionMatematica", "precedencia1", "precedencia2", "precedencia3", 
			"signo1", "signo2", "signo3", "auxNum", "condicion", "condicionAux", 
			"relacional", "auxLog", "vector", "matriz", "eol"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fin'", "'var'", "'const'", "'tipos'", "'programa'", 
			"'numerico'", "'logico'", "'cadena'", "'registro'", "'TRUE'", "'FALSE'", 
			"'and'", "'or'", "'mientras'", "'repetir'", "'hasta'", "'eval'", "'caso'", 
			"'desde'", "'paso'", "'si'", "'sino'", "'subrutina'", "'retorna'", "'ref'", 
			"'vector'", "'matriz'", "'+'", "'-'", "'/'", "'*'", "'%'", "'^'", "'<'", 
			"'<='", "'>'", "'>='", "'=='", "'<>'", "','", "':'", null, "'='", "'{'", 
			"'}'", "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Tk_inicio", "Tk_fin", "Tk_var", "Tk_cons", "Tk_tipos", "Tk_programa", 
			"Tk_numerico", "Tk_logico", "Tk_cadena", "Tk_registro", "Tk_true", "Tk_false", 
			"Tk_and", "Tk_or", "Tk_mientras", "Tk_repetir", "Tk_hasta", "Tk_eval", 
			"Tk_caso", "Tk_desde", "Tk_paso", "Tk_si", "Tk_sino", "Tk_subrutina", 
			"Tk_retorna", "Tk_ref", "Tk_vector", "Tk_matriz", "Tk_sum", "Tk_subt", 
			"Tk_div", "Tk_mult", "Tk_mod", "Tk_exp", "Tk_less", "Tk_lessEqual", "Tk_bigger", 
			"Tk_biggerEqual", "Tk_equal", "Tk_diferent", "Tk_comma", "Tk_colon", 
			"Tk_semicolon", "Tk_assig", "Tk_okey", "Tk_ckey", "Tk_opar", "Tk_cpar", 
			"Tk_obracket", "Tk_cbracket", "Tk_num", "Tk_str", "Tk_id", "COMMENT", 
			"LINE_COMMENT", "EOL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public List<DeclaracionesContext> declaraciones() {
			return getRuleContexts(DeclaracionesContext.class);
		}
		public DeclaracionesContext declaraciones(int i) {
			return getRuleContext(DeclaracionesContext.class,i);
		}
		public SubRutinasContext subRutinas() {
			return getRuleContext(SubRutinasContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_semicolon || _la==EOL) {
				{
				{
				setState(100);
				eol();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_programa) {
				{
				setState(106);
				programa();
				}
			}

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_var) | (1L << Tk_cons) | (1L << Tk_tipos))) != 0)) {
				{
				{
				setState(109);
				declaraciones();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			cuerpo();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_subrutina) {
				{
				setState(116);
				subRutinas();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode Tk_programa() { return getToken(GramaticaParser.Tk_programa, 0); }
		public TerminalNode Tk_id() { return getToken(GramaticaParser.Tk_id, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(Tk_programa);
			setState(120);
			match(Tk_id);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_semicolon || _la==EOL) {
				{
				{
				setState(121);
				eol();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionesContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public ConstantsContext constants() {
			return getRuleContext(ConstantsContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaraciones);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_var:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				variables();
				}
				break;
			case Tk_cons:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				constants();
				}
				break;
			case Tk_tipos:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				types();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode Tk_var() { return getToken(GramaticaParser.Tk_var, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Variables_auxContext variables_aux() {
			return getRuleContext(Variables_auxContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(Tk_var);
			setState(133);
			eol();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(134);
				variables_aux();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variables_auxContext extends ParserRuleContext {
		public List<TerminalNode> Tk_id() { return getTokens(GramaticaParser.Tk_id); }
		public TerminalNode Tk_id(int i) {
			return getToken(GramaticaParser.Tk_id, i);
		}
		public TerminalNode Tk_colon() { return getToken(GramaticaParser.Tk_colon, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public List<TerminalNode> Tk_comma() { return getTokens(GramaticaParser.Tk_comma); }
		public TerminalNode Tk_comma(int i) {
			return getToken(GramaticaParser.Tk_comma, i);
		}
		public Variables_auxContext variables_aux() {
			return getRuleContext(Variables_auxContext.class,0);
		}
		public TerminalNode Tk_vector() { return getToken(GramaticaParser.Tk_vector, 0); }
		public TerminalNode Tk_obracket() { return getToken(GramaticaParser.Tk_obracket, 0); }
		public List<VectorAuxContext> vectorAux() {
			return getRuleContexts(VectorAuxContext.class);
		}
		public VectorAuxContext vectorAux(int i) {
			return getRuleContext(VectorAuxContext.class,i);
		}
		public TerminalNode Tk_cbracket() { return getToken(GramaticaParser.Tk_cbracket, 0); }
		public TerminalNode Tk_matriz() { return getToken(GramaticaParser.Tk_matriz, 0); }
		public Variables_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVariables_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVariables_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVariables_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variables_auxContext variables_aux() throws RecognitionException {
		Variables_auxContext _localctx = new Variables_auxContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variables_aux);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(Tk_id);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_comma) {
					{
					{
					setState(138);
					match(Tk_comma);
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Tk_semicolon || _la==EOL) {
						{
						setState(139);
						eol();
						}
					}

					setState(142);
					match(Tk_id);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(Tk_colon);
				setState(149);
				tipo();
				setState(150);
				eol();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_id) {
					{
					setState(151);
					variables_aux();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(Tk_id);
				setState(155);
				match(Tk_colon);
				setState(156);
				match(Tk_vector);
				setState(157);
				match(Tk_obracket);
				setState(158);
				vectorAux();
				setState(159);
				match(Tk_cbracket);
				setState(160);
				tipo();
				setState(161);
				eol();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_id) {
					{
					setState(162);
					variables_aux();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(Tk_id);
				setState(166);
				match(Tk_colon);
				setState(167);
				match(Tk_matriz);
				setState(168);
				match(Tk_obracket);
				setState(169);
				vectorAux();
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(170);
					match(Tk_comma);
					setState(171);
					vectorAux();
					}
					}
					setState(174); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Tk_comma );
				setState(176);
				match(Tk_cbracket);
				setState(177);
				tipo();
				setState(178);
				eol();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_id) {
					{
					setState(179);
					variables_aux();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorAuxContext extends ParserRuleContext {
		public TerminalNode Tk_mult() { return getToken(GramaticaParser.Tk_mult, 0); }
		public OperacionMatematicaContext operacionMatematica() {
			return getRuleContext(OperacionMatematicaContext.class,0);
		}
		public VectorAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVectorAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVectorAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVectorAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorAuxContext vectorAux() throws RecognitionException {
		VectorAuxContext _localctx = new VectorAuxContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vectorAux);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_mult:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(Tk_mult);
				}
				break;
			case Tk_opar:
			case Tk_num:
			case Tk_id:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				operacionMatematica(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode Tk_numerico() { return getToken(GramaticaParser.Tk_numerico, 0); }
		public TerminalNode Tk_logico() { return getToken(GramaticaParser.Tk_logico, 0); }
		public TerminalNode Tk_cadena() { return getToken(GramaticaParser.Tk_cadena, 0); }
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public TerminalNode Tk_id() { return getToken(GramaticaParser.Tk_id, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_numerico:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(Tk_numerico);
				}
				break;
			case Tk_logico:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(Tk_logico);
				}
				break;
			case Tk_cadena:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(Tk_cadena);
				}
				break;
			case Tk_registro:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				registro();
				}
				break;
			case Tk_id:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				match(Tk_id);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantsContext extends ParserRuleContext {
		public TerminalNode Tk_cons() { return getToken(GramaticaParser.Tk_cons, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Constants_auxContext constants_aux() {
			return getRuleContext(Constants_auxContext.class,0);
		}
		public ConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantsContext constants() throws RecognitionException {
		ConstantsContext _localctx = new ConstantsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(Tk_cons);
			setState(196);
			eol();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(197);
				constants_aux();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constants_auxContext extends ParserRuleContext {
		public TerminalNode Tk_id() { return getToken(GramaticaParser.Tk_id, 0); }
		public TerminalNode Tk_assig() { return getToken(GramaticaParser.Tk_assig, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Constants_auxContext constants_aux() {
			return getRuleContext(Constants_auxContext.class,0);
		}
		public Constants_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constants_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterConstants_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitConstants_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitConstants_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constants_auxContext constants_aux() throws RecognitionException {
		Constants_auxContext _localctx = new Constants_auxContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constants_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(Tk_id);
			setState(201);
			match(Tk_assig);
			setState(202);
			valor();
			setState(203);
			eol();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(204);
				constants_aux();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorContext extends ParserRuleContext {
		public OperacionMatematicaContext operacionMatematica() {
			return getRuleContext(OperacionMatematicaContext.class,0);
		}
		public VerdadContext verdad() {
			return getRuleContext(VerdadContext.class,0);
		}
		public TerminalNode Tk_str() { return getToken(GramaticaParser.Tk_str, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_valor);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_opar:
			case Tk_num:
			case Tk_id:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				operacionMatematica(0);
				}
				break;
			case Tk_true:
			case Tk_false:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				verdad();
				}
				break;
			case Tk_str:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(Tk_str);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerdadContext extends ParserRuleContext {
		public TerminalNode Tk_true() { return getToken(GramaticaParser.Tk_true, 0); }
		public TerminalNode Tk_false() { return getToken(GramaticaParser.Tk_false, 0); }
		public VerdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verdad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVerdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVerdad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVerdad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerdadContext verdad() throws RecognitionException {
		VerdadContext _localctx = new VerdadContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_verdad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !(_la==Tk_true || _la==Tk_false) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode Tk_tipos() { return getToken(GramaticaParser.Tk_tipos, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Types_auxContext types_aux() {
			return getRuleContext(Types_auxContext.class,0);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(Tk_tipos);
			setState(215);
			eol();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(216);
				types_aux();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Types_auxContext extends ParserRuleContext {
		public TerminalNode Tk_id() { return getToken(GramaticaParser.Tk_id, 0); }
		public TerminalNode Tk_colon() { return getToken(GramaticaParser.Tk_colon, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Types_auxContext types_aux() {
			return getRuleContext(Types_auxContext.class,0);
		}
		public Types_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTypes_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTypes_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTypes_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Types_auxContext types_aux() throws RecognitionException {
		Types_auxContext _localctx = new Types_auxContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_types_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(Tk_id);
			setState(220);
			match(Tk_colon);
			setState(221);
			tipo();
			setState(222);
			eol();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(223);
				types_aux();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode Tk_registro() { return getToken(GramaticaParser.Tk_registro, 0); }
		public TerminalNode Tk_okey() { return getToken(GramaticaParser.Tk_okey, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public Variables_auxContext variables_aux() {
			return getRuleContext(Variables_auxContext.class,0);
		}
		public TerminalNode Tk_ckey() { return getToken(GramaticaParser.Tk_ckey, 0); }
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(Tk_registro);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(227);
				eol();
				}
			}

			setState(230);
			match(Tk_okey);
			setState(231);
			eol();
			setState(232);
			variables_aux();
			setState(233);
			match(Tk_ckey);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CuerpoContext extends ParserRuleContext {
		public TerminalNode Tk_inicio() { return getToken(GramaticaParser.Tk_inicio, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode Tk_fin() { return getToken(GramaticaParser.Tk_fin, 0); }
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCuerpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCuerpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCuerpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(Tk_inicio);
			setState(236);
			eol();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(237);
				sentencias();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(Tk_fin);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciasContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CicloMientrasContext cicloMientras() {
			return getRuleContext(CicloMientrasContext.class,0);
		}
		public CicloRepetirContext cicloRepetir() {
			return getRuleContext(CicloRepetirContext.class,0);
		}
		public EvalContext eval() {
			return getRuleContext(EvalContext.class,0);
		}
		public DesdeContext desde() {
			return getRuleContext(DesdeContext.class,0);
		}
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSentencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sentencias);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				asignacion();
				setState(246);
				eol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				condicional();
				setState(249);
				eol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				cicloMientras();
				setState(252);
				eol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				cicloRepetir();
				setState(255);
				eol();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				eval();
				setState(258);
				eol();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(260);
				desde();
				setState(261);
				eol();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(263);
				llamada();
				setState(264);
				eol();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode Tk_id() { return getToken(GramaticaParser.Tk_id, 0); }
		public TerminalNode Tk_assig() { return getToken(GramaticaParser.Tk_assig, 0); }
		public AsignacionAuxContext asignacionAux() {
			return getRuleContext(AsignacionAuxContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(Tk_id);
			setState(269);
			match(Tk_assig);
			setState(270);
			asignacionAux();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionAuxContext extends ParserRuleContext {
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public EstructContext estruct() {
			return getRuleContext(EstructContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public MatrizContext matriz() {
			return getRuleContext(MatrizContext.class,0);
		}
		public AsignacionAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAsignacionAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAsignacionAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAsignacionAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionAuxContext asignacionAux() throws RecognitionException {
		AsignacionAuxContext _localctx = new AsignacionAuxContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_asignacionAux);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				llamada();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				estruct();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				vector();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				matriz();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstructContext extends ParserRuleContext {
		public TerminalNode Tk_okey() { return getToken(GramaticaParser.Tk_okey, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode Tk_ckey() { return getToken(GramaticaParser.Tk_ckey, 0); }
		public TerminalNode Tk_comma() { return getToken(GramaticaParser.Tk_comma, 0); }
		public List<EstructContext> estruct() {
			return getRuleContexts(EstructContext.class);
		}
		public EstructContext estruct(int i) {
			return getRuleContext(EstructContext.class,i);
		}
		public EstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEstruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEstruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructContext estruct() throws RecognitionException {
		EstructContext _localctx = new EstructContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_estruct);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(Tk_okey);
				setState(280);
				valor();
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_comma) {
					{
					setState(281);
					match(Tk_comma);
					setState(282);
					estruct();
					}
				}

				setState(285);
				match(Tk_ckey);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				valor();
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(288);
					match(Tk_comma);
					setState(289);
					estruct();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(Tk_okey);
				setState(293);
				estruct();
				{
				setState(294);
				match(Tk_comma);
				setState(295);
				estruct();
				}
				setState(297);
				match(Tk_ckey);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				match(Tk_okey);
				setState(300);
				valor();
				setState(301);
				match(Tk_ckey);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				match(Tk_okey);
				setState(304);
				match(Tk_ckey);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode Tk_si() { return getToken(GramaticaParser.Tk_si, 0); }
		public TerminalNode Tk_opar() { return getToken(GramaticaParser.Tk_opar, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode Tk_cpar() { return getToken(GramaticaParser.Tk_cpar, 0); }
		public TerminalNode Tk_okey() { return getToken(GramaticaParser.Tk_okey, 0); }
		public TerminalNode Tk_ckey() { return getToken(GramaticaParser.Tk_ckey, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public List<CondicionSinoSiContext> condicionSinoSi() {
			return getRuleContexts(CondicionSinoSiContext.class);
		}
		public CondicionSinoSiContext condicionSinoSi(int i) {
			return getRuleContext(CondicionSinoSiContext.class,i);
		}
		public CondicionSinoContext condicionSino() {
			return getRuleContext(CondicionSinoContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condicional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(Tk_si);
			setState(308);
			match(Tk_opar);
			setState(309);
			condicion();
			setState(310);
			match(Tk_cpar);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(311);
				eol();
				}
			}

			setState(314);
			match(Tk_okey);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(315);
				eol();
				}
			}

			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(318);
				sentencias();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(324);
					condicionSinoSi();
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_sino) {
				{
				setState(330);
				condicionSino();
				}
			}

			setState(333);
			match(Tk_ckey);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionSinoSiContext extends ParserRuleContext {
		public TerminalNode Tk_sino() { return getToken(GramaticaParser.Tk_sino, 0); }
		public TerminalNode Tk_si() { return getToken(GramaticaParser.Tk_si, 0); }
		public TerminalNode Tk_opar() { return getToken(GramaticaParser.Tk_opar, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode Tk_cpar() { return getToken(GramaticaParser.Tk_cpar, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public CondicionSinoSiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionSinoSi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCondicionSinoSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCondicionSinoSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCondicionSinoSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionSinoSiContext condicionSinoSi() throws RecognitionException {
		CondicionSinoSiContext _localctx = new CondicionSinoSiContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condicionSinoSi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(Tk_sino);
			setState(336);
			match(Tk_si);
			setState(337);
			match(Tk_opar);
			setState(338);
			condicion();
			setState(339);
			match(Tk_cpar);
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(340);
				eol();
				}
				break;
			}
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(343);
				sentencias();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(349);
				eol();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionSinoContext extends ParserRuleContext {
		public TerminalNode Tk_sino() { return getToken(GramaticaParser.Tk_sino, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public CondicionSinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionSino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCondicionSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCondicionSino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCondicionSino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionSinoContext condicionSino() throws RecognitionException {
		CondicionSinoContext _localctx = new CondicionSinoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condicionSino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(Tk_sino);
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(353);
				eol();
				}
				break;
			}
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(356);
				sentencias();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(362);
				eol();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloMientrasContext extends ParserRuleContext {
		public TerminalNode Tk_mientras() { return getToken(GramaticaParser.Tk_mientras, 0); }
		public TerminalNode Tk_opar() { return getToken(GramaticaParser.Tk_opar, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode Tk_cpar() { return getToken(GramaticaParser.Tk_cpar, 0); }
		public TerminalNode Tk_okey() { return getToken(GramaticaParser.Tk_okey, 0); }
		public TerminalNode Tk_ckey() { return getToken(GramaticaParser.Tk_ckey, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public CicloMientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloMientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCicloMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCicloMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCicloMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloMientrasContext cicloMientras() throws RecognitionException {
		CicloMientrasContext _localctx = new CicloMientrasContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cicloMientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(Tk_mientras);
			setState(366);
			match(Tk_opar);
			setState(367);
			condicion();
			setState(368);
			match(Tk_cpar);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(369);
				eol();
				}
			}

			setState(372);
			match(Tk_okey);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(373);
				eol();
				}
			}

			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(376);
				sentencias();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(Tk_ckey);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloRepetirContext extends ParserRuleContext {
		public TerminalNode Tk_repetir() { return getToken(GramaticaParser.Tk_repetir, 0); }
		public TerminalNode Tk_hasta() { return getToken(GramaticaParser.Tk_hasta, 0); }
		public TerminalNode Tk_opar() { return getToken(GramaticaParser.Tk_opar, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode Tk_cpar() { return getToken(GramaticaParser.Tk_cpar, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public CicloRepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloRepetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCicloRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCicloRepetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCicloRepetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloRepetirContext cicloRepetir() throws RecognitionException {
		CicloRepetirContext _localctx = new CicloRepetirContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cicloRepetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(Tk_repetir);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(385);
				eol();
				}
			}

			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(388);
				sentencias();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(Tk_hasta);
			setState(395);
			match(Tk_opar);
			setState(396);
			condicion();
			setState(397);
			match(Tk_cpar);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EvalContext extends ParserRuleContext {
		public TerminalNode Tk_eval() { return getToken(GramaticaParser.Tk_eval, 0); }
		public TerminalNode Tk_okey() { return getToken(GramaticaParser.Tk_okey, 0); }
		public TerminalNode Tk_ckey() { return getToken(GramaticaParser.Tk_ckey, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public List<EvalAuxContext> evalAux() {
			return getRuleContexts(EvalAuxContext.class);
		}
		public EvalAuxContext evalAux(int i) {
			return getRuleContext(EvalAuxContext.class,i);
		}
		public CondicionSinoContext condicionSino() {
			return getRuleContext(CondicionSinoContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_eval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(Tk_eval);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(400);
				eol();
				}
			}

			setState(403);
			match(Tk_okey);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(404);
				eol();
				}
			}

			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_caso) {
				{
				{
				setState(407);
				evalAux();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_sino) {
				{
				setState(413);
				condicionSino();
				}
			}

			setState(416);
			match(Tk_ckey);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EvalAuxContext extends ParserRuleContext {
		public TerminalNode Tk_caso() { return getToken(GramaticaParser.Tk_caso, 0); }
		public TerminalNode Tk_opar() { return getToken(GramaticaParser.Tk_opar, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode Tk_cpar() { return getToken(GramaticaParser.Tk_cpar, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public EvalAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEvalAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEvalAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEvalAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalAuxContext evalAux() throws RecognitionException {
		EvalAuxContext _localctx = new EvalAuxContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_evalAux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(Tk_caso);
			setState(419);
			match(Tk_opar);
			setState(420);
			condicion();
			setState(421);
			match(Tk_cpar);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(422);
				eol();
				}
			}

			setState(425);
			sentencias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesdeContext extends ParserRuleContext {
		public TerminalNode Tk_desde() { return getToken(GramaticaParser.Tk_desde, 0); }
		public TerminalNode Tk_id() { return getToken(GramaticaParser.Tk_id, 0); }
		public TerminalNode Tk_assig() { return getToken(GramaticaParser.Tk_assig, 0); }
		public List<OperacionMatematicaContext> operacionMatematica() {
			return getRuleContexts(OperacionMatematicaContext.class);
		}
		public OperacionMatematicaContext operacionMatematica(int i) {
			return getRuleContext(OperacionMatematicaContext.class,i);
		}
		public TerminalNode Tk_hasta() { return getToken(GramaticaParser.Tk_hasta, 0); }
		public TerminalNode Tk_okey() { return getToken(GramaticaParser.Tk_okey, 0); }
		public TerminalNode Tk_ckey() { return getToken(GramaticaParser.Tk_ckey, 0); }
		public TerminalNode Tk_paso() { return getToken(GramaticaParser.Tk_paso, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public DesdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDesde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDesde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDesde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesdeContext desde() throws RecognitionException {
		DesdeContext _localctx = new DesdeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_desde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(Tk_desde);
			setState(428);
			match(Tk_id);
			setState(429);
			match(Tk_assig);
			setState(430);
			operacionMatematica(0);
			setState(431);
			match(Tk_hasta);
			setState(432);
			operacionMatematica(0);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_paso) {
				{
				setState(433);
				match(Tk_paso);
				setState(434);
				operacionMatematica(0);
				}
			}

			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(437);
				eol();
				}
			}

			setState(440);
			match(Tk_okey);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(441);
				eol();
				}
			}

			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(444);
				sentencias();
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(450);
			match(Tk_ckey);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LlamadaContext extends ParserRuleContext {
		public TerminalNode Tk_id() { return getToken(GramaticaParser.Tk_id, 0); }
		public TerminalNode Tk_opar() { return getToken(GramaticaParser.Tk_opar, 0); }
		public TerminalNode Tk_cpar() { return getToken(GramaticaParser.Tk_cpar, 0); }
		public List<TiposLLamadaContext> tiposLLamada() {
			return getRuleContexts(TiposLLamadaContext.class);
		}
		public TiposLLamadaContext tiposLLamada(int i) {
			return getRuleContext(TiposLLamadaContext.class,i);
		}
		public List<TerminalNode> Tk_comma() { return getTokens(GramaticaParser.Tk_comma); }
		public TerminalNode Tk_comma(int i) {
			return getToken(GramaticaParser.Tk_comma, i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public LlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLlamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLlamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitLlamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaContext llamada() throws RecognitionException {
		LlamadaContext _localctx = new LlamadaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_llamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(Tk_id);
			setState(453);
			match(Tk_opar);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_true) | (1L << Tk_false) | (1L << Tk_opar) | (1L << Tk_num) | (1L << Tk_str) | (1L << Tk_id))) != 0)) {
				{
				setState(454);
				tiposLLamada();
				}
			}

			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_comma) | (1L << Tk_semicolon) | (1L << EOL))) != 0)) {
				{
				{
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_semicolon || _la==EOL) {
					{
					setState(457);
					eol();
					}
				}

				setState(460);
				match(Tk_comma);
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_semicolon || _la==EOL) {
					{
					setState(461);
					eol();
					}
				}

				setState(464);
				tiposLLamada();
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
			match(Tk_cpar);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TiposLLamadaContext extends ParserRuleContext {
		public TerminalNode Tk_num() { return getToken(GramaticaParser.Tk_num, 0); }
		public TerminalNode Tk_str() { return getToken(GramaticaParser.Tk_str, 0); }
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public OperacionMatematicaContext operacionMatematica() {
			return getRuleContext(OperacionMatematicaContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public MatrizContext matriz() {
			return getRuleContext(MatrizContext.class,0);
		}
		public TiposLLamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiposLLamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTiposLLamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTiposLLamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTiposLLamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposLLamadaContext tiposLLamada() throws RecognitionException {
		TiposLLamadaContext _localctx = new TiposLLamadaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tiposLLamada);
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(Tk_num);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(Tk_str);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				llamada();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				operacionMatematica(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(476);
				condicion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(477);
				vector();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(478);
				matriz();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubRutinasContext extends ParserRuleContext {
		public TerminalNode Tk_subrutina() { return getToken(GramaticaParser.Tk_subrutina, 0); }
		public TerminalNode Tk_id() { return getToken(GramaticaParser.Tk_id, 0); }
		public TerminalNode Tk_opar() { return getToken(GramaticaParser.Tk_opar, 0); }
		public TerminalNode Tk_cpar() { return getToken(GramaticaParser.Tk_cpar, 0); }
		public SubRutinasDeclarContext subRutinasDeclar() {
			return getRuleContext(SubRutinasDeclarContext.class,0);
		}
		public List<SubParamatrosContext> subParamatros() {
			return getRuleContexts(SubParamatrosContext.class);
		}
		public SubParamatrosContext subParamatros(int i) {
			return getRuleContext(SubParamatrosContext.class,i);
		}
		public TerminalNode Tk_retorna() { return getToken(GramaticaParser.Tk_retorna, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public SubRutinasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subRutinas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSubRutinas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSubRutinas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSubRutinas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubRutinasContext subRutinas() throws RecognitionException {
		SubRutinasContext _localctx = new SubRutinasContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_subRutinas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(Tk_subrutina);
			setState(482);
			match(Tk_id);
			setState(483);
			match(Tk_opar);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_ref || _la==Tk_id) {
				{
				{
				setState(484);
				subParamatros();
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			match(Tk_cpar);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_retorna) {
				{
				setState(491);
				match(Tk_retorna);
				setState(492);
				tipo();
				}
			}

			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(495);
				eol();
				}
				break;
			}
			setState(498);
			subRutinasDeclar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubRutinasDeclarContext extends ParserRuleContext {
		public SubRutinasAuxContext subRutinasAux() {
			return getRuleContext(SubRutinasAuxContext.class,0);
		}
		public List<DeclaracionesContext> declaraciones() {
			return getRuleContexts(DeclaracionesContext.class);
		}
		public DeclaracionesContext declaraciones(int i) {
			return getRuleContext(DeclaracionesContext.class,i);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public SubRutinasDeclarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subRutinasDeclar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSubRutinasDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSubRutinasDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSubRutinasDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubRutinasDeclarContext subRutinasDeclar() throws RecognitionException {
		SubRutinasDeclarContext _localctx = new SubRutinasDeclarContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_subRutinasDeclar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_var) | (1L << Tk_cons) | (1L << Tk_tipos))) != 0)) {
				{
				{
				setState(500);
				declaraciones();
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(506);
				eol();
				}
			}

			setState(509);
			subRutinasAux();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubRutinasAuxContext extends ParserRuleContext {
		public TerminalNode Tk_inicio() { return getToken(GramaticaParser.Tk_inicio, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TerminalNode Tk_fin() { return getToken(GramaticaParser.Tk_fin, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public RetornaContext retorna() {
			return getRuleContext(RetornaContext.class,0);
		}
		public SubRutinasAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subRutinasAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSubRutinasAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSubRutinasAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSubRutinasAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubRutinasAuxContext subRutinasAux() throws RecognitionException {
		SubRutinasAuxContext _localctx = new SubRutinasAuxContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_subRutinasAux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(Tk_inicio);
			setState(512);
			eol();
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				setState(513);
				sentencias();
				}
			}

			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_retorna) {
				{
				setState(516);
				retorna();
				}
			}

			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(519);
				eol();
				}
			}

			setState(522);
			match(Tk_fin);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornaContext extends ParserRuleContext {
		public TerminalNode Tk_retorna() { return getToken(GramaticaParser.Tk_retorna, 0); }
		public TerminalNode Tk_opar() { return getToken(GramaticaParser.Tk_opar, 0); }
		public RetornaAuxContext retornaAux() {
			return getRuleContext(RetornaAuxContext.class,0);
		}
		public TerminalNode Tk_cpar() { return getToken(GramaticaParser.Tk_cpar, 0); }
		public RetornaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRetorna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRetorna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRetorna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornaContext retorna() throws RecognitionException {
		RetornaContext _localctx = new RetornaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_retorna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(Tk_retorna);
			setState(525);
			match(Tk_opar);
			setState(526);
			retornaAux();
			setState(527);
			match(Tk_cpar);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornaAuxContext extends ParserRuleContext {
		public TerminalNode Tk_id() { return getToken(GramaticaParser.Tk_id, 0); }
		public TerminalNode Tk_num() { return getToken(GramaticaParser.Tk_num, 0); }
		public VerdadContext verdad() {
			return getRuleContext(VerdadContext.class,0);
		}
		public RetornaAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornaAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRetornaAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRetornaAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRetornaAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornaAuxContext retornaAux() throws RecognitionException {
		RetornaAuxContext _localctx = new RetornaAuxContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_retornaAux);
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_id:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				match(Tk_id);
				}
				break;
			case Tk_num:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				match(Tk_num);
				}
				break;
			case Tk_true:
			case Tk_false:
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				verdad();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubParamatrosContext extends ParserRuleContext {
		public List<TerminalNode> Tk_id() { return getTokens(GramaticaParser.Tk_id); }
		public TerminalNode Tk_id(int i) {
			return getToken(GramaticaParser.Tk_id, i);
		}
		public TerminalNode Tk_colon() { return getToken(GramaticaParser.Tk_colon, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> Tk_comma() { return getTokens(GramaticaParser.Tk_comma); }
		public TerminalNode Tk_comma(int i) {
			return getToken(GramaticaParser.Tk_comma, i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public List<SubParamatrosContext> subParamatros() {
			return getRuleContexts(SubParamatrosContext.class);
		}
		public SubParamatrosContext subParamatros(int i) {
			return getRuleContext(SubParamatrosContext.class,i);
		}
		public TerminalNode Tk_ref() { return getToken(GramaticaParser.Tk_ref, 0); }
		public SubParamatrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subParamatros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSubParamatros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSubParamatros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSubParamatros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubParamatrosContext subParamatros() throws RecognitionException {
		SubParamatrosContext _localctx = new SubParamatrosContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_subParamatros);
		int _la;
		try {
			int _alt;
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_id:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(Tk_id);
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_comma) {
					{
					{
					setState(535);
					match(Tk_comma);
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Tk_semicolon || _la==EOL) {
						{
						setState(536);
						eol();
						}
					}

					setState(539);
					match(Tk_id);
					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(545);
				match(Tk_colon);
				setState(546);
				tipo();
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(547);
						eol();
						setState(548);
						subParamatros();
						}
						} 
					}
					setState(554);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				}
				break;
			case Tk_ref:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				match(Tk_ref);
				setState(556);
				match(Tk_id);
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_comma) {
					{
					{
					setState(557);
					match(Tk_comma);
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Tk_semicolon || _la==EOL) {
						{
						setState(558);
						eol();
						}
					}

					setState(561);
					match(Tk_id);
					}
					}
					setState(566);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(567);
				match(Tk_colon);
				setState(568);
				tipo();
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(569);
						eol();
						setState(570);
						subParamatros();
						}
						} 
					}
					setState(576);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionMatematicaContext extends ParserRuleContext {
		public Precedencia1Context precedencia1() {
			return getRuleContext(Precedencia1Context.class,0);
		}
		public OperacionMatematicaContext operacionMatematica() {
			return getRuleContext(OperacionMatematicaContext.class,0);
		}
		public Signo1Context signo1() {
			return getRuleContext(Signo1Context.class,0);
		}
		public OperacionMatematicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionMatematica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperacionMatematica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperacionMatematica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitOperacionMatematica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionMatematicaContext operacionMatematica() throws RecognitionException {
		return operacionMatematica(0);
	}

	private OperacionMatematicaContext operacionMatematica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperacionMatematicaContext _localctx = new OperacionMatematicaContext(_ctx, _parentState);
		OperacionMatematicaContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_operacionMatematica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(580);
			precedencia1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperacionMatematicaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operacionMatematica);
					setState(582);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(583);
					signo1();
					{
					setState(584);
					precedencia1(0);
					}
					}
					} 
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Precedencia1Context extends ParserRuleContext {
		public Precedencia2Context precedencia2() {
			return getRuleContext(Precedencia2Context.class,0);
		}
		public Precedencia1Context precedencia1() {
			return getRuleContext(Precedencia1Context.class,0);
		}
		public Signo2Context signo2() {
			return getRuleContext(Signo2Context.class,0);
		}
		public Precedencia1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedencia1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrecedencia1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrecedencia1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrecedencia1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedencia1Context precedencia1() throws RecognitionException {
		return precedencia1(0);
	}

	private Precedencia1Context precedencia1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Precedencia1Context _localctx = new Precedencia1Context(_ctx, _parentState);
		Precedencia1Context _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_precedencia1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(592);
			precedencia2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Precedencia1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_precedencia1);
					setState(594);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(595);
					signo2();
					setState(596);
					precedencia2(0);
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Precedencia2Context extends ParserRuleContext {
		public Precedencia3Context precedencia3() {
			return getRuleContext(Precedencia3Context.class,0);
		}
		public Precedencia2Context precedencia2() {
			return getRuleContext(Precedencia2Context.class,0);
		}
		public Signo3Context signo3() {
			return getRuleContext(Signo3Context.class,0);
		}
		public Precedencia2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedencia2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrecedencia2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrecedencia2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrecedencia2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedencia2Context precedencia2() throws RecognitionException {
		return precedencia2(0);
	}

	private Precedencia2Context precedencia2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Precedencia2Context _localctx = new Precedencia2Context(_ctx, _parentState);
		Precedencia2Context _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_precedencia2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(604);
			precedencia3();
			}
			_ctx.stop = _input.LT(-1);
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Precedencia2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_precedencia2);
					setState(606);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(607);
					signo3();
					setState(608);
					precedencia3();
					}
					} 
				}
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Precedencia3Context extends ParserRuleContext {
		public TerminalNode Tk_opar() { return getToken(GramaticaParser.Tk_opar, 0); }
		public OperacionMatematicaContext operacionMatematica() {
			return getRuleContext(OperacionMatematicaContext.class,0);
		}
		public TerminalNode Tk_cpar() { return getToken(GramaticaParser.Tk_cpar, 0); }
		public AuxNumContext auxNum() {
			return getRuleContext(AuxNumContext.class,0);
		}
		public Precedencia3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedencia3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrecedencia3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrecedencia3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrecedencia3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedencia3Context precedencia3() throws RecognitionException {
		Precedencia3Context _localctx = new Precedencia3Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_precedencia3);
		try {
			setState(620);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_opar:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				match(Tk_opar);
				setState(616);
				operacionMatematica(0);
				setState(617);
				match(Tk_cpar);
				}
				break;
			case Tk_num:
			case Tk_id:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				auxNum();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signo1Context extends ParserRuleContext {
		public TerminalNode Tk_sum() { return getToken(GramaticaParser.Tk_sum, 0); }
		public TerminalNode Tk_subt() { return getToken(GramaticaParser.Tk_subt, 0); }
		public Signo1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signo1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSigno1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSigno1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSigno1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signo1Context signo1() throws RecognitionException {
		Signo1Context _localctx = new Signo1Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_signo1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_la = _input.LA(1);
			if ( !(_la==Tk_sum || _la==Tk_subt) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signo2Context extends ParserRuleContext {
		public TerminalNode Tk_div() { return getToken(GramaticaParser.Tk_div, 0); }
		public TerminalNode Tk_mult() { return getToken(GramaticaParser.Tk_mult, 0); }
		public TerminalNode Tk_mod() { return getToken(GramaticaParser.Tk_mod, 0); }
		public Signo2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signo2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSigno2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSigno2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSigno2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signo2Context signo2() throws RecognitionException {
		Signo2Context _localctx = new Signo2Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_signo2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_div) | (1L << Tk_mult) | (1L << Tk_mod))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signo3Context extends ParserRuleContext {
		public TerminalNode Tk_exp() { return getToken(GramaticaParser.Tk_exp, 0); }
		public Signo3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signo3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSigno3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSigno3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSigno3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signo3Context signo3() throws RecognitionException {
		Signo3Context _localctx = new Signo3Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_signo3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(Tk_exp);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AuxNumContext extends ParserRuleContext {
		public TerminalNode Tk_id() { return getToken(GramaticaParser.Tk_id, 0); }
		public TerminalNode Tk_num() { return getToken(GramaticaParser.Tk_num, 0); }
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public MatrizContext matriz() {
			return getRuleContext(MatrizContext.class,0);
		}
		public AuxNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAuxNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAuxNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAuxNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxNumContext auxNum() throws RecognitionException {
		AuxNumContext _localctx = new AuxNumContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_auxNum);
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				match(Tk_id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				match(Tk_num);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(630);
				llamada();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(631);
				vector();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(632);
				matriz();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionContext extends ParserRuleContext {
		public List<AuxLogContext> auxLog() {
			return getRuleContexts(AuxLogContext.class);
		}
		public AuxLogContext auxLog(int i) {
			return getRuleContext(AuxLogContext.class,i);
		}
		public RelacionalContext relacional() {
			return getRuleContext(RelacionalContext.class,0);
		}
		public CondicionAuxContext condicionAux() {
			return getRuleContext(CondicionAuxContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			auxLog();
			setState(636);
			relacional();
			setState(637);
			auxLog();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_and || _la==Tk_or) {
				{
				setState(638);
				condicionAux();
				setState(639);
				condicion();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionAuxContext extends ParserRuleContext {
		public TerminalNode Tk_or() { return getToken(GramaticaParser.Tk_or, 0); }
		public TerminalNode Tk_and() { return getToken(GramaticaParser.Tk_and, 0); }
		public CondicionAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCondicionAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCondicionAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCondicionAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionAuxContext condicionAux() throws RecognitionException {
		CondicionAuxContext _localctx = new CondicionAuxContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_condicionAux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_la = _input.LA(1);
			if ( !(_la==Tk_and || _la==Tk_or) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelacionalContext extends ParserRuleContext {
		public TerminalNode Tk_less() { return getToken(GramaticaParser.Tk_less, 0); }
		public TerminalNode Tk_equal() { return getToken(GramaticaParser.Tk_equal, 0); }
		public TerminalNode Tk_lessEqual() { return getToken(GramaticaParser.Tk_lessEqual, 0); }
		public TerminalNode Tk_bigger() { return getToken(GramaticaParser.Tk_bigger, 0); }
		public TerminalNode Tk_biggerEqual() { return getToken(GramaticaParser.Tk_biggerEqual, 0); }
		public TerminalNode Tk_diferent() { return getToken(GramaticaParser.Tk_diferent, 0); }
		public RelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacionalContext relacional() throws RecognitionException {
		RelacionalContext _localctx = new RelacionalContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_less) | (1L << Tk_lessEqual) | (1L << Tk_bigger) | (1L << Tk_biggerEqual) | (1L << Tk_equal) | (1L << Tk_diferent))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AuxLogContext extends ParserRuleContext {
		public TerminalNode Tk_id() { return getToken(GramaticaParser.Tk_id, 0); }
		public TerminalNode Tk_num() { return getToken(GramaticaParser.Tk_num, 0); }
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public VerdadContext verdad() {
			return getRuleContext(VerdadContext.class,0);
		}
		public TerminalNode Tk_str() { return getToken(GramaticaParser.Tk_str, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public AuxLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxLog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAuxLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAuxLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAuxLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxLogContext auxLog() throws RecognitionException {
		AuxLogContext _localctx = new AuxLogContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_auxLog);
		try {
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				match(Tk_id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				match(Tk_num);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(649);
				llamada();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(650);
				verdad();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(651);
				match(Tk_str);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(652);
				vector();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorContext extends ParserRuleContext {
		public TerminalNode Tk_id() { return getToken(GramaticaParser.Tk_id, 0); }
		public TerminalNode Tk_obracket() { return getToken(GramaticaParser.Tk_obracket, 0); }
		public OperacionMatematicaContext operacionMatematica() {
			return getRuleContext(OperacionMatematicaContext.class,0);
		}
		public TerminalNode Tk_cbracket() { return getToken(GramaticaParser.Tk_cbracket, 0); }
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(Tk_id);
			setState(656);
			match(Tk_obracket);
			setState(657);
			operacionMatematica(0);
			setState(658);
			match(Tk_cbracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrizContext extends ParserRuleContext {
		public TerminalNode Tk_id() { return getToken(GramaticaParser.Tk_id, 0); }
		public TerminalNode Tk_obracket() { return getToken(GramaticaParser.Tk_obracket, 0); }
		public List<OperacionMatematicaContext> operacionMatematica() {
			return getRuleContexts(OperacionMatematicaContext.class);
		}
		public OperacionMatematicaContext operacionMatematica(int i) {
			return getRuleContext(OperacionMatematicaContext.class,i);
		}
		public TerminalNode Tk_cbracket() { return getToken(GramaticaParser.Tk_cbracket, 0); }
		public List<TerminalNode> Tk_comma() { return getTokens(GramaticaParser.Tk_comma); }
		public TerminalNode Tk_comma(int i) {
			return getToken(GramaticaParser.Tk_comma, i);
		}
		public MatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matriz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMatriz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMatriz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrizContext matriz() throws RecognitionException {
		MatrizContext _localctx = new MatrizContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_matriz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(Tk_id);
			setState(661);
			match(Tk_obracket);
			setState(662);
			operacionMatematica(0);
			setState(665); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(663);
				match(Tk_comma);
				setState(664);
				operacionMatematica(0);
				}
				}
				setState(667); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Tk_comma );
			setState(669);
			match(Tk_cbracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EolContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(GramaticaParser.EOL, 0); }
		public TerminalNode Tk_semicolon() { return getToken(GramaticaParser.Tk_semicolon, 0); }
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_eol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			_la = _input.LA(1);
			if ( !(_la==Tk_semicolon || _la==EOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return operacionMatematica_sempred((OperacionMatematicaContext)_localctx, predIndex);
		case 36:
			return precedencia1_sempred((Precedencia1Context)_localctx, predIndex);
		case 37:
			return precedencia2_sempred((Precedencia2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean operacionMatematica_sempred(OperacionMatematicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean precedencia1_sempred(Precedencia1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean precedencia2_sempred(Precedencia2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u02a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\7\2"+
		"h\n\2\f\2\16\2k\13\2\3\2\5\2n\n\2\3\2\7\2q\n\2\f\2\16\2t\13\2\3\2\3\2"+
		"\5\2x\n\2\3\3\3\3\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\4\3\4\3\4\5\4\u0085"+
		"\n\4\3\5\3\5\3\5\5\5\u008a\n\5\3\6\3\6\3\6\5\6\u008f\n\6\3\6\7\6\u0092"+
		"\n\6\f\6\16\6\u0095\13\6\3\6\3\6\3\6\3\6\5\6\u009b\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00a6\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00af"+
		"\n\6\r\6\16\6\u00b0\3\6\3\6\3\6\3\6\5\6\u00b7\n\6\5\6\u00b9\n\6\3\7\3"+
		"\7\5\7\u00bd\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u00c4\n\b\3\t\3\t\3\t\5\t\u00c9"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00d0\n\n\3\13\3\13\3\13\5\13\u00d5\n\13"+
		"\3\f\3\f\3\r\3\r\3\r\5\r\u00dc\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00e3"+
		"\n\16\3\17\3\17\5\17\u00e7\n\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\7\20\u00f1\n\20\f\20\16\20\u00f4\13\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u010d\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0118\n\23\3\24\3\24\3\24\3\24\5\24\u011e\n\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u0125\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0134\n\24\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u013b\n\25\3\25\3\25\5\25\u013f\n\25\3\25\7\25\u0142\n\25\f\25\16\25"+
		"\u0145\13\25\3\25\7\25\u0148\n\25\f\25\16\25\u014b\13\25\3\25\5\25\u014e"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0158\n\26\3\26\7\26"+
		"\u015b\n\26\f\26\16\26\u015e\13\26\3\26\5\26\u0161\n\26\3\27\3\27\5\27"+
		"\u0165\n\27\3\27\7\27\u0168\n\27\f\27\16\27\u016b\13\27\3\27\5\27\u016e"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0175\n\30\3\30\3\30\5\30\u0179\n"+
		"\30\3\30\7\30\u017c\n\30\f\30\16\30\u017f\13\30\3\30\3\30\3\31\3\31\5"+
		"\31\u0185\n\31\3\31\7\31\u0188\n\31\f\31\16\31\u018b\13\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\5\32\u0194\n\32\3\32\3\32\5\32\u0198\n\32\3\32"+
		"\7\32\u019b\n\32\f\32\16\32\u019e\13\32\3\32\5\32\u01a1\n\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u01aa\n\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u01b6\n\34\3\34\5\34\u01b9\n\34\3\34\3\34\5"+
		"\34\u01bd\n\34\3\34\7\34\u01c0\n\34\f\34\16\34\u01c3\13\34\3\34\3\34\3"+
		"\35\3\35\3\35\5\35\u01ca\n\35\3\35\5\35\u01cd\n\35\3\35\3\35\5\35\u01d1"+
		"\n\35\3\35\7\35\u01d4\n\35\f\35\16\35\u01d7\13\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u01e2\n\36\3\37\3\37\3\37\3\37\7\37\u01e8"+
		"\n\37\f\37\16\37\u01eb\13\37\3\37\3\37\3\37\5\37\u01f0\n\37\3\37\5\37"+
		"\u01f3\n\37\3\37\3\37\3 \7 \u01f8\n \f \16 \u01fb\13 \3 \5 \u01fe\n \3"+
		" \3 \3!\3!\3!\5!\u0205\n!\3!\5!\u0208\n!\3!\5!\u020b\n!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\5#\u0217\n#\3$\3$\3$\5$\u021c\n$\3$\7$\u021f\n$"+
		"\f$\16$\u0222\13$\3$\3$\3$\3$\3$\7$\u0229\n$\f$\16$\u022c\13$\3$\3$\3"+
		"$\3$\5$\u0232\n$\3$\7$\u0235\n$\f$\16$\u0238\13$\3$\3$\3$\3$\3$\7$\u023f"+
		"\n$\f$\16$\u0242\13$\5$\u0244\n$\3%\3%\3%\3%\3%\3%\3%\7%\u024d\n%\f%\16"+
		"%\u0250\13%\3&\3&\3&\3&\3&\3&\3&\7&\u0259\n&\f&\16&\u025c\13&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\7\'\u0265\n\'\f\'\16\'\u0268\13\'\3(\3(\3(\3(\3("+
		"\5(\u026f\n(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3,\5,\u027c\n,\3-\3-\3-\3-"+
		"\3-\3-\5-\u0284\n-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0290"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\6\62\u029c\n\62"+
		"\r\62\16\62\u029d\3\62\3\62\3\63\3\63\3\63\2\5HJL\64\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\b"+
		"\3\2\r\16\3\2\37 \3\2!#\3\2\17\20\3\2%*\4\2--::\2\u02e1\2i\3\2\2\2\4y"+
		"\3\2\2\2\6\u0084\3\2\2\2\b\u0086\3\2\2\2\n\u00b8\3\2\2\2\f\u00bc\3\2\2"+
		"\2\16\u00c3\3\2\2\2\20\u00c5\3\2\2\2\22\u00ca\3\2\2\2\24\u00d4\3\2\2\2"+
		"\26\u00d6\3\2\2\2\30\u00d8\3\2\2\2\32\u00dd\3\2\2\2\34\u00e4\3\2\2\2\36"+
		"\u00ed\3\2\2\2 \u010c\3\2\2\2\"\u010e\3\2\2\2$\u0117\3\2\2\2&\u0133\3"+
		"\2\2\2(\u0135\3\2\2\2*\u0151\3\2\2\2,\u0162\3\2\2\2.\u016f\3\2\2\2\60"+
		"\u0182\3\2\2\2\62\u0191\3\2\2\2\64\u01a4\3\2\2\2\66\u01ad\3\2\2\28\u01c6"+
		"\3\2\2\2:\u01e1\3\2\2\2<\u01e3\3\2\2\2>\u01f9\3\2\2\2@\u0201\3\2\2\2B"+
		"\u020e\3\2\2\2D\u0216\3\2\2\2F\u0243\3\2\2\2H\u0245\3\2\2\2J\u0251\3\2"+
		"\2\2L\u025d\3\2\2\2N\u026e\3\2\2\2P\u0270\3\2\2\2R\u0272\3\2\2\2T\u0274"+
		"\3\2\2\2V\u027b\3\2\2\2X\u027d\3\2\2\2Z\u0285\3\2\2\2\\\u0287\3\2\2\2"+
		"^\u028f\3\2\2\2`\u0291\3\2\2\2b\u0296\3\2\2\2d\u02a1\3\2\2\2fh\5d\63\2"+
		"gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2ln\5\4\3\2"+
		"ml\3\2\2\2mn\3\2\2\2nr\3\2\2\2oq\5\6\4\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2"+
		"rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uw\5\36\20\2vx\5<\37\2wv\3\2\2\2wx\3\2\2"+
		"\2x\3\3\2\2\2yz\7\b\2\2z~\7\67\2\2{}\5d\63\2|{\3\2\2\2}\u0080\3\2\2\2"+
		"~|\3\2\2\2~\177\3\2\2\2\177\5\3\2\2\2\u0080~\3\2\2\2\u0081\u0085\5\b\5"+
		"\2\u0082\u0085\5\20\t\2\u0083\u0085\5\30\r\2\u0084\u0081\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\7\3\2\2\2\u0086\u0087\7\5\2\2"+
		"\u0087\u0089\5d\63\2\u0088\u008a\5\n\6\2\u0089\u0088\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\t\3\2\2\2\u008b\u0093\7\67\2\2\u008c\u008e\7+\2\2\u008d"+
		"\u008f\5d\63\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0092\7\67\2\2\u0091\u008c\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u0097\7,\2\2\u0097\u0098\5\16\b\2\u0098\u009a\5d\63\2\u0099"+
		"\u009b\5\n\6\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00b9\3\2"+
		"\2\2\u009c\u009d\7\67\2\2\u009d\u009e\7,\2\2\u009e\u009f\7\35\2\2\u009f"+
		"\u00a0\7\63\2\2\u00a0\u00a1\5\f\7\2\u00a1\u00a2\7\64\2\2\u00a2\u00a3\5"+
		"\16\b\2\u00a3\u00a5\5d\63\2\u00a4\u00a6\5\n\6\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00b9\3\2\2\2\u00a7\u00a8\7\67\2\2\u00a8\u00a9\7"+
		",\2\2\u00a9\u00aa\7\36\2\2\u00aa\u00ab\7\63\2\2\u00ab\u00ae\5\f\7\2\u00ac"+
		"\u00ad\7+\2\2\u00ad\u00af\5\f\7\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\7\64\2\2\u00b3\u00b4\5\16\b\2\u00b4\u00b6\5d\63\2\u00b5\u00b7\5"+
		"\n\6\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u008b\3\2\2\2\u00b8\u009c\3\2\2\2\u00b8\u00a7\3\2\2\2\u00b9\13\3\2\2"+
		"\2\u00ba\u00bd\7\"\2\2\u00bb\u00bd\5H%\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb"+
		"\3\2\2\2\u00bd\r\3\2\2\2\u00be\u00c4\7\t\2\2\u00bf\u00c4\7\n\2\2\u00c0"+
		"\u00c4\7\13\2\2\u00c1\u00c4\5\34\17\2\u00c2\u00c4\7\67\2\2\u00c3\u00be"+
		"\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\17\3\2\2\2\u00c5\u00c6\7\6\2\2\u00c6\u00c8\5d\63"+
		"\2\u00c7\u00c9\5\22\n\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\21\3\2\2\2\u00ca\u00cb\7\67\2\2\u00cb\u00cc\7.\2\2\u00cc\u00cd\5\24\13"+
		"\2\u00cd\u00cf\5d\63\2\u00ce\u00d0\5\22\n\2\u00cf\u00ce\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\23\3\2\2\2\u00d1\u00d5\5H%\2\u00d2\u00d5\5\26\f\2"+
		"\u00d3\u00d5\7\66\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3"+
		"\3\2\2\2\u00d5\25\3\2\2\2\u00d6\u00d7\t\2\2\2\u00d7\27\3\2\2\2\u00d8\u00d9"+
		"\7\7\2\2\u00d9\u00db\5d\63\2\u00da\u00dc\5\32\16\2\u00db\u00da\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\31\3\2\2\2\u00dd\u00de\7\67\2\2\u00de\u00df"+
		"\7,\2\2\u00df\u00e0\5\16\b\2\u00e0\u00e2\5d\63\2\u00e1\u00e3\5\32\16\2"+
		"\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\33\3\2\2\2\u00e4\u00e6"+
		"\7\f\2\2\u00e5\u00e7\5d\63\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\7/\2\2\u00e9\u00ea\5d\63\2\u00ea\u00eb\5\n"+
		"\6\2\u00eb\u00ec\7\60\2\2\u00ec\35\3\2\2\2\u00ed\u00ee\7\3\2\2\u00ee\u00f2"+
		"\5d\63\2\u00ef\u00f1\5 \21\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f5\u00f6\7\4\2\2\u00f6\37\3\2\2\2\u00f7\u00f8\5\"\22\2\u00f8\u00f9"+
		"\5d\63\2\u00f9\u010d\3\2\2\2\u00fa\u00fb\5(\25\2\u00fb\u00fc\5d\63\2\u00fc"+
		"\u010d\3\2\2\2\u00fd\u00fe\5.\30\2\u00fe\u00ff\5d\63\2\u00ff\u010d\3\2"+
		"\2\2\u0100\u0101\5\60\31\2\u0101\u0102\5d\63\2\u0102\u010d\3\2\2\2\u0103"+
		"\u0104\5\62\32\2\u0104\u0105\5d\63\2\u0105\u010d\3\2\2\2\u0106\u0107\5"+
		"\66\34\2\u0107\u0108\5d\63\2\u0108\u010d\3\2\2\2\u0109\u010a\58\35\2\u010a"+
		"\u010b\5d\63\2\u010b\u010d\3\2\2\2\u010c\u00f7\3\2\2\2\u010c\u00fa\3\2"+
		"\2\2\u010c\u00fd\3\2\2\2\u010c\u0100\3\2\2\2\u010c\u0103\3\2\2\2\u010c"+
		"\u0106\3\2\2\2\u010c\u0109\3\2\2\2\u010d!\3\2\2\2\u010e\u010f\7\67\2\2"+
		"\u010f\u0110\7.\2\2\u0110\u0111\5$\23\2\u0111#\3\2\2\2\u0112\u0118\58"+
		"\35\2\u0113\u0118\5\24\13\2\u0114\u0118\5&\24\2\u0115\u0118\5`\61\2\u0116"+
		"\u0118\5b\62\2\u0117\u0112\3\2\2\2\u0117\u0113\3\2\2\2\u0117\u0114\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118%\3\2\2\2\u0119\u011a"+
		"\7/\2\2\u011a\u011d\5\24\13\2\u011b\u011c\7+\2\2\u011c\u011e\5&\24\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7\60"+
		"\2\2\u0120\u0134\3\2\2\2\u0121\u0124\5\24\13\2\u0122\u0123\7+\2\2\u0123"+
		"\u0125\5&\24\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0134\3\2"+
		"\2\2\u0126\u0127\7/\2\2\u0127\u0128\5&\24\2\u0128\u0129\7+\2\2\u0129\u012a"+
		"\5&\24\2\u012a\u012b\3\2\2\2\u012b\u012c\7\60\2\2\u012c\u0134\3\2\2\2"+
		"\u012d\u012e\7/\2\2\u012e\u012f\5\24\13\2\u012f\u0130\7\60\2\2\u0130\u0134"+
		"\3\2\2\2\u0131\u0132\7/\2\2\u0132\u0134\7\60\2\2\u0133\u0119\3\2\2\2\u0133"+
		"\u0121\3\2\2\2\u0133\u0126\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0134\'\3\2\2\2\u0135\u0136\7\30\2\2\u0136\u0137\7\61\2\2\u0137\u0138"+
		"\5X-\2\u0138\u013a\7\62\2\2\u0139\u013b\5d\63\2\u013a\u0139\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\7/\2\2\u013d\u013f\5d\63"+
		"\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0143\3\2\2\2\u0140\u0142"+
		"\5 \21\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0149\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\5*"+
		"\26\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\5,"+
		"\27\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\7\60\2\2\u0150)\3\2\2\2\u0151\u0152\7\31\2\2\u0152\u0153\7\30\2"+
		"\2\u0153\u0154\7\61\2\2\u0154\u0155\5X-\2\u0155\u0157\7\62\2\2\u0156\u0158"+
		"\5d\63\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015c\3\2\2\2\u0159"+
		"\u015b\5 \21\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015c\u015d\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015f"+
		"\u0161\5d\63\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161+\3\2\2\2"+
		"\u0162\u0164\7\31\2\2\u0163\u0165\5d\63\2\u0164\u0163\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0169\3\2\2\2\u0166\u0168\5 \21\2\u0167\u0166\3\2\2\2\u0168"+
		"\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016d\3\2"+
		"\2\2\u016b\u0169\3\2\2\2\u016c\u016e\5d\63\2\u016d\u016c\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e-\3\2\2\2\u016f\u0170\7\21\2\2\u0170\u0171\7\61\2"+
		"\2\u0171\u0172\5X-\2\u0172\u0174\7\62\2\2\u0173\u0175\5d\63\2\u0174\u0173"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\7/\2\2\u0177"+
		"\u0179\5d\63\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017d\3\2"+
		"\2\2\u017a\u017c\5 \21\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u0180\u0181\7\60\2\2\u0181/\3\2\2\2\u0182\u0184\7\22\2\2\u0183\u0185"+
		"\5d\63\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0189\3\2\2\2\u0186"+
		"\u0188\5 \21\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c"+
		"\u018d\7\23\2\2\u018d\u018e\7\61\2\2\u018e\u018f\5X-\2\u018f\u0190\7\62"+
		"\2\2\u0190\61\3\2\2\2\u0191\u0193\7\24\2\2\u0192\u0194\5d\63\2\u0193\u0192"+
		"\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\7/\2\2\u0196"+
		"\u0198\5d\63\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019c\3\2"+
		"\2\2\u0199\u019b\5\64\33\2\u019a\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2"+
		"\2\2\u019f\u01a1\5,\27\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\7\60\2\2\u01a3\63\3\2\2\2\u01a4\u01a5\7\25"+
		"\2\2\u01a5\u01a6\7\61\2\2\u01a6\u01a7\5X-\2\u01a7\u01a9\7\62\2\2\u01a8"+
		"\u01aa\5d\63\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ac\5 \21\2\u01ac\65\3\2\2\2\u01ad\u01ae\7\26\2\2\u01ae\u01af"+
		"\7\67\2\2\u01af\u01b0\7.\2\2\u01b0\u01b1\5H%\2\u01b1\u01b2\7\23\2\2\u01b2"+
		"\u01b5\5H%\2\u01b3\u01b4\7\27\2\2\u01b4\u01b6\5H%\2\u01b5\u01b3\3\2\2"+
		"\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b9\5d\63\2\u01b8\u01b7"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\7/\2\2\u01bb"+
		"\u01bd\5d\63\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c1\3\2"+
		"\2\2\u01be\u01c0\5 \21\2\u01bf\u01be\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c4\u01c5\7\60\2\2\u01c5\67\3\2\2\2\u01c6\u01c7\7\67\2\2\u01c7"+
		"\u01c9\7\61\2\2\u01c8\u01ca\5:\36\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3"+
		"\2\2\2\u01ca\u01d5\3\2\2\2\u01cb\u01cd\5d\63\2\u01cc\u01cb\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\7+\2\2\u01cf\u01d1\5d\63"+
		"\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4"+
		"\5:\36\2\u01d3\u01cc\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7\62"+
		"\2\2\u01d99\3\2\2\2\u01da\u01e2\7\65\2\2\u01db\u01e2\7\66\2\2\u01dc\u01e2"+
		"\58\35\2\u01dd\u01e2\5H%\2\u01de\u01e2\5X-\2\u01df\u01e2\5`\61\2\u01e0"+
		"\u01e2\5b\62\2\u01e1\u01da\3\2\2\2\u01e1\u01db\3\2\2\2\u01e1\u01dc\3\2"+
		"\2\2\u01e1\u01dd\3\2\2\2\u01e1\u01de\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1"+
		"\u01e0\3\2\2\2\u01e2;\3\2\2\2\u01e3\u01e4\7\32\2\2\u01e4\u01e5\7\67\2"+
		"\2\u01e5\u01e9\7\61\2\2\u01e6\u01e8\5F$\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb"+
		"\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01ec\u01ef\7\62\2\2\u01ed\u01ee\7\33\2\2\u01ee\u01f0\5"+
		"\16\b\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1"+
		"\u01f3\5d\63\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01f5\5> \2\u01f5=\3\2\2\2\u01f6\u01f8\5\6\4\2\u01f7\u01f6"+
		"\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fe\5d\63\2\u01fd\u01fc\3\2"+
		"\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\5@!\2\u0200?"+
		"\3\2\2\2\u0201\u0202\7\3\2\2\u0202\u0204\5d\63\2\u0203\u0205\5 \21\2\u0204"+
		"\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0208\5B"+
		"\"\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209"+
		"\u020b\5d\63\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u020d\7\4\2\2\u020dA\3\2\2\2\u020e\u020f\7\33\2\2\u020f\u0210"+
		"\7\61\2\2\u0210\u0211\5D#\2\u0211\u0212\7\62\2\2\u0212C\3\2\2\2\u0213"+
		"\u0217\7\67\2\2\u0214\u0217\7\65\2\2\u0215\u0217\5\26\f\2\u0216\u0213"+
		"\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0215\3\2\2\2\u0217E\3\2\2\2\u0218"+
		"\u0220\7\67\2\2\u0219\u021b\7+\2\2\u021a\u021c\5d\63\2\u021b\u021a\3\2"+
		"\2\2\u021b\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\7\67\2\2\u021e"+
		"\u0219\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221\u0223\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\7,\2\2\u0224"+
		"\u022a\5\16\b\2\u0225\u0226\5d\63\2\u0226\u0227\5F$\2\u0227\u0229\3\2"+
		"\2\2\u0228\u0225\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u0244\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\7\34"+
		"\2\2\u022e\u0236\7\67\2\2\u022f\u0231\7+\2\2\u0230\u0232\5d\63\2\u0231"+
		"\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\7\67"+
		"\2\2\u0234\u022f\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\7,"+
		"\2\2\u023a\u0240\5\16\b\2\u023b\u023c\5d\63\2\u023c\u023d\5F$\2\u023d"+
		"\u023f\3\2\2\2\u023e\u023b\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2"+
		"\2\2\u0240\u0241\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0243"+
		"\u0218\3\2\2\2\u0243\u022d\3\2\2\2\u0244G\3\2\2\2\u0245\u0246\b%\1\2\u0246"+
		"\u0247\5J&\2\u0247\u024e\3\2\2\2\u0248\u0249\f\4\2\2\u0249\u024a\5P)\2"+
		"\u024a\u024b\5J&\2\u024b\u024d\3\2\2\2\u024c\u0248\3\2\2\2\u024d\u0250"+
		"\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024fI\3\2\2\2\u0250"+
		"\u024e\3\2\2\2\u0251\u0252\b&\1\2\u0252\u0253\5L\'\2\u0253\u025a\3\2\2"+
		"\2\u0254\u0255\f\4\2\2\u0255\u0256\5R*\2\u0256\u0257\5L\'\2\u0257\u0259"+
		"\3\2\2\2\u0258\u0254\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025bK\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025e\b\'\1\2"+
		"\u025e\u025f\5N(\2\u025f\u0266\3\2\2\2\u0260\u0261\f\4\2\2\u0261\u0262"+
		"\5T+\2\u0262\u0263\5N(\2\u0263\u0265\3\2\2\2\u0264\u0260\3\2\2\2\u0265"+
		"\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267M\3\2\2\2"+
		"\u0268\u0266\3\2\2\2\u0269\u026a\7\61\2\2\u026a\u026b\5H%\2\u026b\u026c"+
		"\7\62\2\2\u026c\u026f\3\2\2\2\u026d\u026f\5V,\2\u026e\u0269\3\2\2\2\u026e"+
		"\u026d\3\2\2\2\u026fO\3\2\2\2\u0270\u0271\t\3\2\2\u0271Q\3\2\2\2\u0272"+
		"\u0273\t\4\2\2\u0273S\3\2\2\2\u0274\u0275\7$\2\2\u0275U\3\2\2\2\u0276"+
		"\u027c\7\67\2\2\u0277\u027c\7\65\2\2\u0278\u027c\58\35\2\u0279\u027c\5"+
		"`\61\2\u027a\u027c\5b\62\2\u027b\u0276\3\2\2\2\u027b\u0277\3\2\2\2\u027b"+
		"\u0278\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027a\3\2\2\2\u027cW\3\2\2\2"+
		"\u027d\u027e\5^\60\2\u027e\u027f\5\\/\2\u027f\u0283\5^\60\2\u0280\u0281"+
		"\5Z.\2\u0281\u0282\5X-\2\u0282\u0284\3\2\2\2\u0283\u0280\3\2\2\2\u0283"+
		"\u0284\3\2\2\2\u0284Y\3\2\2\2\u0285\u0286\t\5\2\2\u0286[\3\2\2\2\u0287"+
		"\u0288\t\6\2\2\u0288]\3\2\2\2\u0289\u0290\7\67\2\2\u028a\u0290\7\65\2"+
		"\2\u028b\u0290\58\35\2\u028c\u0290\5\26\f\2\u028d\u0290\7\66\2\2\u028e"+
		"\u0290\5`\61\2\u028f\u0289\3\2\2\2\u028f\u028a\3\2\2\2\u028f\u028b\3\2"+
		"\2\2\u028f\u028c\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u028e\3\2\2\2\u0290"+
		"_\3\2\2\2\u0291\u0292\7\67\2\2\u0292\u0293\7\63\2\2\u0293\u0294\5H%\2"+
		"\u0294\u0295\7\64\2\2\u0295a\3\2\2\2\u0296\u0297\7\67\2\2\u0297\u0298"+
		"\7\63\2\2\u0298\u029b\5H%\2\u0299\u029a\7+\2\2\u029a\u029c\5H%\2\u029b"+
		"\u0299\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2"+
		"\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\7\64\2\2\u02a0c\3\2\2\2\u02a1\u02a2"+
		"\t\7\2\2\u02a2e\3\2\2\2Timrw~\u0084\u0089\u008e\u0093\u009a\u00a5\u00b0"+
		"\u00b6\u00b8\u00bc\u00c3\u00c8\u00cf\u00d4\u00db\u00e2\u00e6\u00f2\u010c"+
		"\u0117\u011d\u0124\u0133\u013a\u013e\u0143\u0149\u014d\u0157\u015c\u0160"+
		"\u0164\u0169\u016d\u0174\u0178\u017d\u0184\u0189\u0193\u0197\u019c\u01a0"+
		"\u01a9\u01b5\u01b8\u01bc\u01c1\u01c9\u01cc\u01d0\u01d5\u01e1\u01e9\u01ef"+
		"\u01f2\u01f9\u01fd\u0204\u0207\u020a\u0216\u021b\u0220\u022a\u0231\u0236"+
		"\u0240\u0243\u024e\u025a\u0266\u026e\u027b\u0283\u028f\u029d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}