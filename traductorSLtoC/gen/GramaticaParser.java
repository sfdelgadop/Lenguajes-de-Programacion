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
		RULE_asignacion = 16, RULE_asignacionAux = 17, RULE_estruct = 18, RULE_estruct2 = 19, 
		RULE_condicional = 20, RULE_condicionSinoSi = 21, RULE_condicionSino = 22, 
		RULE_cicloMientras = 23, RULE_cicloRepetir = 24, RULE_eval = 25, RULE_evalAux = 26, 
		RULE_desde = 27, RULE_llamada = 28, RULE_tiposLLamada = 29, RULE_subRutinas = 30, 
		RULE_subRutinasDeclar = 31, RULE_subRutinasAux = 32, RULE_retorna = 33, 
		RULE_retornaAux = 34, RULE_subParamatros = 35, RULE_operacionMatematica = 36, 
		RULE_precedencia1 = 37, RULE_precedencia2 = 38, RULE_precedencia3 = 39, 
		RULE_signo1 = 40, RULE_signo2 = 41, RULE_signo3 = 42, RULE_auxNum = 43, 
		RULE_condicion = 44, RULE_condicionAux = 45, RULE_relacional = 46, RULE_auxLog = 47, 
		RULE_vector = 48, RULE_matriz = 49, RULE_eol = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "programa", "declaraciones", "variables", "variables_aux", "vectorAux", 
			"tipo", "constants", "constants_aux", "valor", "verdad", "types", "types_aux", 
			"registro", "cuerpo", "sentencias", "asignacion", "asignacionAux", "estruct", 
			"estruct2", "condicional", "condicionSinoSi", "condicionSino", "cicloMientras", 
			"cicloRepetir", "eval", "evalAux", "desde", "llamada", "tiposLLamada", 
			"subRutinas", "subRutinasDeclar", "subRutinasAux", "retorna", "retornaAux", 
			"subParamatros", "operacionMatematica", "precedencia1", "precedencia2", 
			"precedencia3", "signo1", "signo2", "signo3", "auxNum", "condicion", 
			"condicionAux", "relacional", "auxLog", "vector", "matriz", "eol"
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
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
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
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_semicolon || _la==EOL) {
				{
				{
				setState(102);
				eol();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_programa) {
				{
				setState(108);
				programa();
				}
			}

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_var) | (1L << Tk_cons) | (1L << Tk_tipos))) != 0)) {
				{
				setState(111);
				declaraciones();
				}
			}

			setState(114);
			cuerpo();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_subrutina) {
				{
				setState(115);
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
			setState(118);
			match(Tk_programa);
			setState(119);
			match(Tk_id);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_semicolon || _la==EOL) {
				{
				{
				setState(120);
				eol();
				}
				}
				setState(125);
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
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
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
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_var:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				variables();
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(127);
					declaraciones();
					}
					break;
				}
				}
				break;
			case Tk_cons:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				constants();
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(131);
					declaraciones();
					}
					break;
				}
				}
				break;
			case Tk_tipos:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				types();
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(135);
					declaraciones();
					}
					break;
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
			setState(140);
			match(Tk_var);
			setState(141);
			eol();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(142);
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(Tk_id);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_comma) {
					{
					{
					setState(146);
					match(Tk_comma);
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Tk_semicolon || _la==EOL) {
						{
						setState(147);
						eol();
						}
					}

					setState(150);
					match(Tk_id);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(Tk_colon);
				setState(157);
				tipo();
				setState(158);
				eol();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_id) {
					{
					setState(159);
					variables_aux();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(Tk_id);
				setState(163);
				match(Tk_colon);
				setState(164);
				match(Tk_vector);
				setState(165);
				match(Tk_obracket);
				setState(166);
				vectorAux();
				setState(167);
				match(Tk_cbracket);
				setState(168);
				tipo();
				setState(169);
				eol();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_id) {
					{
					setState(170);
					variables_aux();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(Tk_id);
				setState(174);
				match(Tk_colon);
				setState(175);
				match(Tk_matriz);
				setState(176);
				match(Tk_obracket);
				setState(177);
				vectorAux();
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(178);
					match(Tk_comma);
					setState(179);
					vectorAux();
					}
					}
					setState(182); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Tk_comma );
				setState(184);
				match(Tk_cbracket);
				setState(185);
				tipo();
				setState(186);
				eol();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_id) {
					{
					setState(187);
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
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_mult:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(Tk_mult);
				}
				break;
			case Tk_opar:
			case Tk_num:
			case Tk_id:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
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
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_numerico:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(Tk_numerico);
				}
				break;
			case Tk_logico:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(Tk_logico);
				}
				break;
			case Tk_cadena:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(Tk_cadena);
				}
				break;
			case Tk_registro:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				registro();
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
			setState(202);
			match(Tk_cons);
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
			setState(207);
			match(Tk_id);
			setState(208);
			match(Tk_assig);
			setState(209);
			valor();
			setState(210);
			eol();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(211);
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
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_opar:
			case Tk_num:
			case Tk_id:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				operacionMatematica(0);
				}
				break;
			case Tk_true:
			case Tk_false:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				verdad();
				}
				break;
			case Tk_str:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
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
			setState(219);
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
			setState(221);
			match(Tk_tipos);
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
			setState(226);
			match(Tk_id);
			setState(227);
			match(Tk_colon);
			setState(228);
			tipo();
			setState(229);
			eol();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(230);
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
			setState(233);
			match(Tk_registro);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(234);
				eol();
				}
			}

			setState(237);
			match(Tk_okey);
			setState(238);
			eol();
			setState(239);
			variables_aux();
			setState(240);
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
			setState(242);
			match(Tk_inicio);
			setState(243);
			eol();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(244);
				sentencias();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
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
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				asignacion();
				setState(253);
				eol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				condicional();
				setState(256);
				eol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				cicloMientras();
				setState(259);
				eol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				cicloRepetir();
				setState(262);
				eol();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
				eval();
				setState(265);
				eol();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				desde();
				setState(268);
				eol();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				llamada();
				setState(271);
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
			setState(275);
			match(Tk_id);
			setState(276);
			match(Tk_assig);
			setState(277);
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
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				llamada();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				estruct();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				vector();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(283);
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
		public Estruct2Context estruct2() {
			return getRuleContext(Estruct2Context.class,0);
		}
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
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(Tk_okey);
				setState(287);
				valor();
				{
				setState(288);
				match(Tk_comma);
				setState(289);
				estruct2();
				}
				setState(291);
				match(Tk_ckey);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(Tk_okey);
				setState(294);
				estruct();
				{
				setState(295);
				match(Tk_comma);
				setState(296);
				estruct();
				}
				setState(298);
				match(Tk_ckey);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(Tk_okey);
				setState(301);
				valor();
				setState(302);
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

	public static class Estruct2Context extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode Tk_ckey() { return getToken(GramaticaParser.Tk_ckey, 0); }
		public TerminalNode Tk_comma() { return getToken(GramaticaParser.Tk_comma, 0); }
		public Estruct2Context estruct2() {
			return getRuleContext(Estruct2Context.class,0);
		}
		public TerminalNode Tk_okey() { return getToken(GramaticaParser.Tk_okey, 0); }
		public Estruct2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruct2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEstruct2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEstruct2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEstruct2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Estruct2Context estruct2() throws RecognitionException {
		Estruct2Context _localctx = new Estruct2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_estruct2);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_true:
			case Tk_false:
			case Tk_opar:
			case Tk_num:
			case Tk_str:
			case Tk_id:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				valor();
				{
				setState(307);
				match(Tk_comma);
				setState(308);
				estruct2();
				}
				setState(310);
				match(Tk_ckey);
				}
				break;
			case Tk_okey:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(Tk_okey);
				setState(313);
				valor();
				setState(314);
				match(Tk_ckey);
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
		enterRule(_localctx, 40, RULE_condicional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(Tk_si);
			setState(319);
			match(Tk_opar);
			setState(320);
			condicion();
			setState(321);
			match(Tk_cpar);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(322);
				eol();
				}
			}

			setState(325);
			match(Tk_okey);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(326);
				eol();
				}
			}

			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(329);
				sentencias();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(335);
					condicionSinoSi();
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_sino) {
				{
				setState(341);
				condicionSino();
				}
			}

			setState(344);
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
		enterRule(_localctx, 42, RULE_condicionSinoSi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(Tk_sino);
			setState(347);
			match(Tk_si);
			setState(348);
			match(Tk_opar);
			setState(349);
			condicion();
			setState(350);
			match(Tk_cpar);
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(351);
				eol();
				}
				break;
			}
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(354);
				sentencias();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(360);
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
		enterRule(_localctx, 44, RULE_condicionSino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(Tk_sino);
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(364);
				eol();
				}
				break;
			}
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(367);
				sentencias();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(373);
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
		enterRule(_localctx, 46, RULE_cicloMientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(Tk_mientras);
			setState(377);
			match(Tk_opar);
			setState(378);
			condicion();
			setState(379);
			match(Tk_cpar);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(380);
				eol();
				}
			}

			setState(383);
			match(Tk_okey);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(384);
				eol();
				}
			}

			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(387);
				sentencias();
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
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
		enterRule(_localctx, 48, RULE_cicloRepetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(Tk_repetir);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(396);
				eol();
				}
			}

			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(399);
				sentencias();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
			match(Tk_hasta);
			setState(406);
			match(Tk_opar);
			setState(407);
			condicion();
			setState(408);
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
		enterRule(_localctx, 50, RULE_eval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(Tk_eval);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(411);
				eol();
				}
			}

			setState(414);
			match(Tk_okey);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(415);
				eol();
				}
			}

			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_caso) {
				{
				{
				setState(418);
				evalAux();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_sino) {
				{
				setState(424);
				condicionSino();
				}
			}

			setState(427);
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
		enterRule(_localctx, 52, RULE_evalAux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(Tk_caso);
			setState(430);
			match(Tk_opar);
			setState(431);
			condicion();
			setState(432);
			match(Tk_cpar);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(433);
				eol();
				}
			}

			setState(436);
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
		enterRule(_localctx, 54, RULE_desde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(Tk_desde);
			setState(439);
			match(Tk_id);
			setState(440);
			match(Tk_assig);
			setState(441);
			operacionMatematica(0);
			setState(442);
			match(Tk_hasta);
			setState(443);
			operacionMatematica(0);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_paso) {
				{
				setState(444);
				match(Tk_paso);
				setState(445);
				operacionMatematica(0);
				}
			}

			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(448);
				eol();
				}
			}

			setState(451);
			match(Tk_okey);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(452);
				eol();
				}
			}

			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(455);
				sentencias();
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
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
		enterRule(_localctx, 56, RULE_llamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(Tk_id);
			setState(464);
			match(Tk_opar);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_true) | (1L << Tk_false) | (1L << Tk_opar) | (1L << Tk_num) | (1L << Tk_str) | (1L << Tk_id))) != 0)) {
				{
				setState(465);
				tiposLLamada();
				}
			}

			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_comma) | (1L << Tk_semicolon) | (1L << EOL))) != 0)) {
				{
				{
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_semicolon || _la==EOL) {
					{
					setState(468);
					eol();
					}
				}

				setState(471);
				match(Tk_comma);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_semicolon || _la==EOL) {
					{
					setState(472);
					eol();
					}
				}

				setState(475);
				tiposLLamada();
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(481);
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
		enterRule(_localctx, 58, RULE_tiposLLamada);
		try {
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(Tk_num);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				match(Tk_str);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(485);
				llamada();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(486);
				operacionMatematica(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(487);
				condicion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(488);
				vector();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(489);
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
		enterRule(_localctx, 60, RULE_subRutinas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(Tk_subrutina);
			setState(493);
			match(Tk_id);
			setState(494);
			match(Tk_opar);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_ref || _la==Tk_id) {
				{
				{
				setState(495);
				subParamatros();
				}
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(501);
			match(Tk_cpar);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_retorna) {
				{
				setState(502);
				match(Tk_retorna);
				setState(503);
				tipo();
				}
			}

			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(506);
				eol();
				}
				break;
			}
			setState(509);
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
		enterRule(_localctx, 62, RULE_subRutinasDeclar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_var) | (1L << Tk_cons) | (1L << Tk_tipos))) != 0)) {
				{
				{
				setState(511);
				declaraciones();
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(517);
				eol();
				}
			}

			setState(520);
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
		enterRule(_localctx, 64, RULE_subRutinasAux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(Tk_inicio);
			setState(523);
			eol();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				setState(524);
				sentencias();
				}
			}

			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_retorna) {
				{
				setState(527);
				retorna();
				}
			}

			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(530);
				eol();
				}
			}

			setState(533);
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
		enterRule(_localctx, 66, RULE_retorna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(Tk_retorna);
			setState(536);
			match(Tk_opar);
			setState(537);
			retornaAux();
			setState(538);
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
		enterRule(_localctx, 68, RULE_retornaAux);
		try {
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_id:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(Tk_id);
				}
				break;
			case Tk_num:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				match(Tk_num);
				}
				break;
			case Tk_true:
			case Tk_false:
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
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
		enterRule(_localctx, 70, RULE_subParamatros);
		int _la;
		try {
			int _alt;
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_id:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				match(Tk_id);
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_comma) {
					{
					{
					setState(546);
					match(Tk_comma);
					setState(548);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Tk_semicolon || _la==EOL) {
						{
						setState(547);
						eol();
						}
					}

					setState(550);
					match(Tk_id);
					}
					}
					setState(555);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(556);
				match(Tk_colon);
				setState(557);
				tipo();
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(558);
						eol();
						setState(559);
						subParamatros();
						}
						} 
					}
					setState(565);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				}
				break;
			case Tk_ref:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				match(Tk_ref);
				setState(567);
				match(Tk_id);
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_comma) {
					{
					{
					setState(568);
					match(Tk_comma);
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Tk_semicolon || _la==EOL) {
						{
						setState(569);
						eol();
						}
					}

					setState(572);
					match(Tk_id);
					}
					}
					setState(577);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(578);
				match(Tk_colon);
				setState(579);
				tipo();
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(580);
						eol();
						setState(581);
						subParamatros();
						}
						} 
					}
					setState(587);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_operacionMatematica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(591);
			precedencia1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(599);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperacionMatematicaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operacionMatematica);
					setState(593);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(594);
					signo1();
					{
					setState(595);
					precedencia1(0);
					}
					}
					} 
				}
				setState(601);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_precedencia1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(603);
			precedencia2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Precedencia1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_precedencia1);
					setState(605);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(606);
					signo2();
					setState(607);
					precedencia2(0);
					}
					} 
				}
				setState(613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_precedencia2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(615);
			precedencia3();
			}
			_ctx.stop = _input.LT(-1);
			setState(623);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Precedencia2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_precedencia2);
					setState(617);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(618);
					signo3();
					setState(619);
					precedencia3();
					}
					} 
				}
				setState(625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		enterRule(_localctx, 78, RULE_precedencia3);
		try {
			setState(631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_opar:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				match(Tk_opar);
				setState(627);
				operacionMatematica(0);
				setState(628);
				match(Tk_cpar);
				}
				break;
			case Tk_num:
			case Tk_id:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
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
		enterRule(_localctx, 80, RULE_signo1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
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
		enterRule(_localctx, 82, RULE_signo2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
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
		enterRule(_localctx, 84, RULE_signo3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
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
		enterRule(_localctx, 86, RULE_auxNum);
		try {
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				match(Tk_id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				match(Tk_num);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(641);
				llamada();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(642);
				vector();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(643);
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
		enterRule(_localctx, 88, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			auxLog();
			setState(647);
			relacional();
			setState(648);
			auxLog();
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_and || _la==Tk_or) {
				{
				setState(649);
				condicionAux();
				setState(650);
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
		enterRule(_localctx, 90, RULE_condicionAux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
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
		enterRule(_localctx, 92, RULE_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
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
		enterRule(_localctx, 94, RULE_auxLog);
		try {
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				match(Tk_id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				match(Tk_num);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(660);
				llamada();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(661);
				verdad();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(662);
				match(Tk_str);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(663);
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
		enterRule(_localctx, 96, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(Tk_id);
			setState(667);
			match(Tk_obracket);
			setState(668);
			operacionMatematica(0);
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
		enterRule(_localctx, 98, RULE_matriz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(Tk_id);
			setState(672);
			match(Tk_obracket);
			setState(673);
			operacionMatematica(0);
			setState(676); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(674);
				match(Tk_comma);
				setState(675);
				operacionMatematica(0);
				}
				}
				setState(678); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Tk_comma );
			setState(680);
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
		enterRule(_localctx, 100, RULE_eol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
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
		case 36:
			return operacionMatematica_sempred((OperacionMatematicaContext)_localctx, predIndex);
		case 37:
			return precedencia1_sempred((Precedencia1Context)_localctx, predIndex);
		case 38:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u02af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\7\2j\n\2\f\2\16\2m\13\2\3\2\5\2p\n\2\3\2\5\2s\n\2\3\2\3\2\5\2"+
		"w\n\2\3\3\3\3\3\3\7\3|\n\3\f\3\16\3\177\13\3\3\4\3\4\5\4\u0083\n\4\3\4"+
		"\3\4\5\4\u0087\n\4\3\4\3\4\5\4\u008b\n\4\5\4\u008d\n\4\3\5\3\5\3\5\5\5"+
		"\u0092\n\5\3\6\3\6\3\6\5\6\u0097\n\6\3\6\7\6\u009a\n\6\f\6\16\6\u009d"+
		"\13\6\3\6\3\6\3\6\3\6\5\6\u00a3\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00ae\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00b7\n\6\r\6\16\6\u00b8"+
		"\3\6\3\6\3\6\3\6\5\6\u00bf\n\6\5\6\u00c1\n\6\3\7\3\7\5\7\u00c5\n\7\3\b"+
		"\3\b\3\b\3\b\5\b\u00cb\n\b\3\t\3\t\3\t\5\t\u00d0\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00d7\n\n\3\13\3\13\3\13\5\13\u00dc\n\13\3\f\3\f\3\r\3\r\3\r\5"+
		"\r\u00e3\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00ea\n\16\3\17\3\17\5\17\u00ee"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u00f8\n\20\f\20\16"+
		"\20\u00fb\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0114"+
		"\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u011f\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0133\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u013f\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u0146\n\26\3"+
		"\26\3\26\5\26\u014a\n\26\3\26\7\26\u014d\n\26\f\26\16\26\u0150\13\26\3"+
		"\26\7\26\u0153\n\26\f\26\16\26\u0156\13\26\3\26\5\26\u0159\n\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0163\n\27\3\27\7\27\u0166\n\27"+
		"\f\27\16\27\u0169\13\27\3\27\5\27\u016c\n\27\3\30\3\30\5\30\u0170\n\30"+
		"\3\30\7\30\u0173\n\30\f\30\16\30\u0176\13\30\3\30\5\30\u0179\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0180\n\31\3\31\3\31\5\31\u0184\n\31\3\31\7"+
		"\31\u0187\n\31\f\31\16\31\u018a\13\31\3\31\3\31\3\32\3\32\5\32\u0190\n"+
		"\32\3\32\7\32\u0193\n\32\f\32\16\32\u0196\13\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\5\33\u019f\n\33\3\33\3\33\5\33\u01a3\n\33\3\33\7\33\u01a6"+
		"\n\33\f\33\16\33\u01a9\13\33\3\33\5\33\u01ac\n\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u01b5\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u01c1\n\35\3\35\5\35\u01c4\n\35\3\35\3\35\5\35\u01c8\n"+
		"\35\3\35\7\35\u01cb\n\35\f\35\16\35\u01ce\13\35\3\35\3\35\3\36\3\36\3"+
		"\36\5\36\u01d5\n\36\3\36\5\36\u01d8\n\36\3\36\3\36\5\36\u01dc\n\36\3\36"+
		"\7\36\u01df\n\36\f\36\16\36\u01e2\13\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u01ed\n\37\3 \3 \3 \3 \7 \u01f3\n \f \16 \u01f6\13"+
		" \3 \3 \3 \5 \u01fb\n \3 \5 \u01fe\n \3 \3 \3!\7!\u0203\n!\f!\16!\u0206"+
		"\13!\3!\5!\u0209\n!\3!\3!\3\"\3\"\3\"\5\"\u0210\n\"\3\"\5\"\u0213\n\""+
		"\3\"\5\"\u0216\n\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\5$\u0222\n$\3%\3%\3"+
		"%\5%\u0227\n%\3%\7%\u022a\n%\f%\16%\u022d\13%\3%\3%\3%\3%\3%\7%\u0234"+
		"\n%\f%\16%\u0237\13%\3%\3%\3%\3%\5%\u023d\n%\3%\7%\u0240\n%\f%\16%\u0243"+
		"\13%\3%\3%\3%\3%\3%\7%\u024a\n%\f%\16%\u024d\13%\5%\u024f\n%\3&\3&\3&"+
		"\3&\3&\3&\3&\7&\u0258\n&\f&\16&\u025b\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\7\'\u0264\n\'\f\'\16\'\u0267\13\'\3(\3(\3(\3(\3(\3(\3(\7(\u0270\n(\f"+
		"(\16(\u0273\13(\3)\3)\3)\3)\3)\5)\u027a\n)\3*\3*\3+\3+\3,\3,\3-\3-\3-"+
		"\3-\3-\5-\u0287\n-\3.\3.\3.\3.\3.\3.\5.\u028f\n.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\5\61\u029b\n\61\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\6\63\u02a7\n\63\r\63\16\63\u02a8\3\63\3\63\3\64\3"+
		"\64\3\64\2\5JLN\65\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\b\3\2\r\16\3\2\37 \3\2!#\3\2\17\20"+
		"\3\2%*\4\2--::\2\u02ea\2k\3\2\2\2\4x\3\2\2\2\6\u008c\3\2\2\2\b\u008e\3"+
		"\2\2\2\n\u00c0\3\2\2\2\f\u00c4\3\2\2\2\16\u00ca\3\2\2\2\20\u00cc\3\2\2"+
		"\2\22\u00d1\3\2\2\2\24\u00db\3\2\2\2\26\u00dd\3\2\2\2\30\u00df\3\2\2\2"+
		"\32\u00e4\3\2\2\2\34\u00eb\3\2\2\2\36\u00f4\3\2\2\2 \u0113\3\2\2\2\"\u0115"+
		"\3\2\2\2$\u011e\3\2\2\2&\u0132\3\2\2\2(\u013e\3\2\2\2*\u0140\3\2\2\2,"+
		"\u015c\3\2\2\2.\u016d\3\2\2\2\60\u017a\3\2\2\2\62\u018d\3\2\2\2\64\u019c"+
		"\3\2\2\2\66\u01af\3\2\2\28\u01b8\3\2\2\2:\u01d1\3\2\2\2<\u01ec\3\2\2\2"+
		">\u01ee\3\2\2\2@\u0204\3\2\2\2B\u020c\3\2\2\2D\u0219\3\2\2\2F\u0221\3"+
		"\2\2\2H\u024e\3\2\2\2J\u0250\3\2\2\2L\u025c\3\2\2\2N\u0268\3\2\2\2P\u0279"+
		"\3\2\2\2R\u027b\3\2\2\2T\u027d\3\2\2\2V\u027f\3\2\2\2X\u0286\3\2\2\2Z"+
		"\u0288\3\2\2\2\\\u0290\3\2\2\2^\u0292\3\2\2\2`\u029a\3\2\2\2b\u029c\3"+
		"\2\2\2d\u02a1\3\2\2\2f\u02ac\3\2\2\2hj\5f\64\2ih\3\2\2\2jm\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2np\5\4\3\2on\3\2\2\2op\3\2\2\2pr\3"+
		"\2\2\2qs\5\6\4\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tv\5\36\20\2uw\5> \2vu\3"+
		"\2\2\2vw\3\2\2\2w\3\3\2\2\2xy\7\b\2\2y}\7\67\2\2z|\5f\64\2{z\3\2\2\2|"+
		"\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\5\3\2\2\2\177}\3\2\2\2\u0080\u0082\5"+
		"\b\5\2\u0081\u0083\5\6\4\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u008d\3\2\2\2\u0084\u0086\5\20\t\2\u0085\u0087\5\6\4\2\u0086\u0085\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u008d\3\2\2\2\u0088\u008a\5\30\r\2\u0089"+
		"\u008b\5\6\4\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2"+
		"\2\2\u008c\u0080\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u0088\3\2\2\2\u008d"+
		"\7\3\2\2\2\u008e\u008f\7\5\2\2\u008f\u0091\5f\64\2\u0090\u0092\5\n\6\2"+
		"\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\t\3\2\2\2\u0093\u009b\7"+
		"\67\2\2\u0094\u0096\7+\2\2\u0095\u0097\5f\64\2\u0096\u0095\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\7\67\2\2\u0099\u0094\3"+
		"\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7,\2\2\u009f\u00a0\5\16"+
		"\b\2\u00a0\u00a2\5f\64\2\u00a1\u00a3\5\n\6\2\u00a2\u00a1\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00c1\3\2\2\2\u00a4\u00a5\7\67\2\2\u00a5\u00a6\7"+
		",\2\2\u00a6\u00a7\7\35\2\2\u00a7\u00a8\7\63\2\2\u00a8\u00a9\5\f\7\2\u00a9"+
		"\u00aa\7\64\2\2\u00aa\u00ab\5\16\b\2\u00ab\u00ad\5f\64\2\u00ac\u00ae\5"+
		"\n\6\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00c1\3\2\2\2\u00af"+
		"\u00b0\7\67\2\2\u00b0\u00b1\7,\2\2\u00b1\u00b2\7\36\2\2\u00b2\u00b3\7"+
		"\63\2\2\u00b3\u00b6\5\f\7\2\u00b4\u00b5\7+\2\2\u00b5\u00b7\5\f\7\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\64\2\2\u00bb\u00bc\5\16\b\2\u00bc"+
		"\u00be\5f\64\2\u00bd\u00bf\5\n\6\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c1\3\2\2\2\u00c0\u0093\3\2\2\2\u00c0\u00a4\3\2\2\2\u00c0"+
		"\u00af\3\2\2\2\u00c1\13\3\2\2\2\u00c2\u00c5\7\"\2\2\u00c3\u00c5\5J&\2"+
		"\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\r\3\2\2\2\u00c6\u00cb\7"+
		"\t\2\2\u00c7\u00cb\7\n\2\2\u00c8\u00cb\7\13\2\2\u00c9\u00cb\5\34\17\2"+
		"\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\17\3\2\2\2\u00cc\u00cd\7\6\2\2\u00cd\u00cf\5f\64\2\u00ce"+
		"\u00d0\5\22\n\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\21\3\2\2"+
		"\2\u00d1\u00d2\7\67\2\2\u00d2\u00d3\7.\2\2\u00d3\u00d4\5\24\13\2\u00d4"+
		"\u00d6\5f\64\2\u00d5\u00d7\5\22\n\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3"+
		"\2\2\2\u00d7\23\3\2\2\2\u00d8\u00dc\5J&\2\u00d9\u00dc\5\26\f\2\u00da\u00dc"+
		"\7\66\2\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2"+
		"\u00dc\25\3\2\2\2\u00dd\u00de\t\2\2\2\u00de\27\3\2\2\2\u00df\u00e0\7\7"+
		"\2\2\u00e0\u00e2\5f\64\2\u00e1\u00e3\5\32\16\2\u00e2\u00e1\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\31\3\2\2\2\u00e4\u00e5\7\67\2\2\u00e5\u00e6\7,\2"+
		"\2\u00e6\u00e7\5\16\b\2\u00e7\u00e9\5f\64\2\u00e8\u00ea\5\32\16\2\u00e9"+
		"\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\33\3\2\2\2\u00eb\u00ed\7\f\2"+
		"\2\u00ec\u00ee\5f\64\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f0\7/\2\2\u00f0\u00f1\5f\64\2\u00f1\u00f2\5\n\6\2\u00f2"+
		"\u00f3\7\60\2\2\u00f3\35\3\2\2\2\u00f4\u00f5\7\3\2\2\u00f5\u00f9\5f\64"+
		"\2\u00f6\u00f8\5 \21\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fd\7\4\2\2\u00fd\37\3\2\2\2\u00fe\u00ff\5\"\22\2\u00ff\u0100\5f\64"+
		"\2\u0100\u0114\3\2\2\2\u0101\u0102\5*\26\2\u0102\u0103\5f\64\2\u0103\u0114"+
		"\3\2\2\2\u0104\u0105\5\60\31\2\u0105\u0106\5f\64\2\u0106\u0114\3\2\2\2"+
		"\u0107\u0108\5\62\32\2\u0108\u0109\5f\64\2\u0109\u0114\3\2\2\2\u010a\u010b"+
		"\5\64\33\2\u010b\u010c\5f\64\2\u010c\u0114\3\2\2\2\u010d\u010e\58\35\2"+
		"\u010e\u010f\5f\64\2\u010f\u0114\3\2\2\2\u0110\u0111\5:\36\2\u0111\u0112"+
		"\5f\64\2\u0112\u0114\3\2\2\2\u0113\u00fe\3\2\2\2\u0113\u0101\3\2\2\2\u0113"+
		"\u0104\3\2\2\2\u0113\u0107\3\2\2\2\u0113\u010a\3\2\2\2\u0113\u010d\3\2"+
		"\2\2\u0113\u0110\3\2\2\2\u0114!\3\2\2\2\u0115\u0116\7\67\2\2\u0116\u0117"+
		"\7.\2\2\u0117\u0118\5$\23\2\u0118#\3\2\2\2\u0119\u011f\5:\36\2\u011a\u011f"+
		"\5\24\13\2\u011b\u011f\5&\24\2\u011c\u011f\5b\62\2\u011d\u011f\5d\63\2"+
		"\u011e\u0119\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011b\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011d\3\2\2\2\u011f%\3\2\2\2\u0120\u0121\7/\2\2\u0121\u0122"+
		"\5\24\13\2\u0122\u0123\7+\2\2\u0123\u0124\5(\25\2\u0124\u0125\3\2\2\2"+
		"\u0125\u0126\7\60\2\2\u0126\u0133\3\2\2\2\u0127\u0128\7/\2\2\u0128\u0129"+
		"\5&\24\2\u0129\u012a\7+\2\2\u012a\u012b\5&\24\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\7\60\2\2\u012d\u0133\3\2\2\2\u012e\u012f\7/\2\2\u012f\u0130\5\24"+
		"\13\2\u0130\u0131\7\60\2\2\u0131\u0133\3\2\2\2\u0132\u0120\3\2\2\2\u0132"+
		"\u0127\3\2\2\2\u0132\u012e\3\2\2\2\u0133\'\3\2\2\2\u0134\u0135\5\24\13"+
		"\2\u0135\u0136\7+\2\2\u0136\u0137\5(\25\2\u0137\u0138\3\2\2\2\u0138\u0139"+
		"\7\60\2\2\u0139\u013f\3\2\2\2\u013a\u013b\7/\2\2\u013b\u013c\5\24\13\2"+
		"\u013c\u013d\7\60\2\2\u013d\u013f\3\2\2\2\u013e\u0134\3\2\2\2\u013e\u013a"+
		"\3\2\2\2\u013f)\3\2\2\2\u0140\u0141\7\30\2\2\u0141\u0142\7\61\2\2\u0142"+
		"\u0143\5Z.\2\u0143\u0145\7\62\2\2\u0144\u0146\5f\64\2\u0145\u0144\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\7/\2\2\u0148"+
		"\u014a\5f\64\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014e\3\2"+
		"\2\2\u014b\u014d\5 \21\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0154\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0151\u0153\5,\27\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0157\u0159\5.\30\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\7\60\2\2\u015b+\3\2\2\2\u015c\u015d\7\31\2"+
		"\2\u015d\u015e\7\30\2\2\u015e\u015f\7\61\2\2\u015f\u0160\5Z.\2\u0160\u0162"+
		"\7\62\2\2\u0161\u0163\5f\64\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2"+
		"\u0163\u0167\3\2\2\2\u0164\u0166\5 \21\2\u0165\u0164\3\2\2\2\u0166\u0169"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u016a\u016c\5f\64\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c-\3\2\2\2\u016d\u016f\7\31\2\2\u016e\u0170\5f\64\2\u016f\u016e"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0174\3\2\2\2\u0171\u0173\5 \21\2\u0172"+
		"\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0179\5f\64\2\u0178"+
		"\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179/\3\2\2\2\u017a\u017b\7\21\2\2"+
		"\u017b\u017c\7\61\2\2\u017c\u017d\5Z.\2\u017d\u017f\7\62\2\2\u017e\u0180"+
		"\5f\64\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0183\7/\2\2\u0182\u0184\5f\64\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2"+
		"\2\2\u0184\u0188\3\2\2\2\u0185\u0187\5 \21\2\u0186\u0185\3\2\2\2\u0187"+
		"\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018b\u018c\7\60\2\2\u018c\61\3\2\2\2\u018d\u018f"+
		"\7\22\2\2\u018e\u0190\5f\64\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2"+
		"\u0190\u0194\3\2\2\2\u0191\u0193\5 \21\2\u0192\u0191\3\2\2\2\u0193\u0196"+
		"\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0197\u0198\7\23\2\2\u0198\u0199\7\61\2\2\u0199\u019a\5"+
		"Z.\2\u019a\u019b\7\62\2\2\u019b\63\3\2\2\2\u019c\u019e\7\24\2\2\u019d"+
		"\u019f\5f\64\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01a2\7/\2\2\u01a1\u01a3\5f\64\2\u01a2\u01a1\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a7\3\2\2\2\u01a4\u01a6\5\66\34\2\u01a5\u01a4\3"+
		"\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ac\5.\30\2\u01ab\u01aa\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7\60\2\2\u01ae"+
		"\65\3\2\2\2\u01af\u01b0\7\25\2\2\u01b0\u01b1\7\61\2\2\u01b1\u01b2\5Z."+
		"\2\u01b2\u01b4\7\62\2\2\u01b3\u01b5\5f\64\2\u01b4\u01b3\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\5 \21\2\u01b7\67\3\2\2"+
		"\2\u01b8\u01b9\7\26\2\2\u01b9\u01ba\7\67\2\2\u01ba\u01bb\7.\2\2\u01bb"+
		"\u01bc\5J&\2\u01bc\u01bd\7\23\2\2\u01bd\u01c0\5J&\2\u01be\u01bf\7\27\2"+
		"\2\u01bf\u01c1\5J&\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3"+
		"\3\2\2\2\u01c2\u01c4\5f\64\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c7\7/\2\2\u01c6\u01c8\5f\64\2\u01c7\u01c6\3\2"+
		"\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cc\3\2\2\2\u01c9\u01cb\5 \21\2\u01ca"+
		"\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\7\60\2\2\u01d0"+
		"9\3\2\2\2\u01d1\u01d2\7\67\2\2\u01d2\u01d4\7\61\2\2\u01d3\u01d5\5<\37"+
		"\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01e0\3\2\2\2\u01d6\u01d8"+
		"\5f\64\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01db\7+\2\2\u01da\u01dc\5f\64\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2"+
		"\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\5<\37\2\u01de\u01d7\3\2\2\2\u01df"+
		"\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2"+
		"\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\7\62\2\2\u01e4;\3\2\2\2\u01e5\u01ed"+
		"\7\65\2\2\u01e6\u01ed\7\66\2\2\u01e7\u01ed\5:\36\2\u01e8\u01ed\5J&\2\u01e9"+
		"\u01ed\5Z.\2\u01ea\u01ed\5b\62\2\u01eb\u01ed\5d\63\2\u01ec\u01e5\3\2\2"+
		"\2\u01ec\u01e6\3\2\2\2\u01ec\u01e7\3\2\2\2\u01ec\u01e8\3\2\2\2\u01ec\u01e9"+
		"\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed=\3\2\2\2\u01ee"+
		"\u01ef\7\32\2\2\u01ef\u01f0\7\67\2\2\u01f0\u01f4\7\61\2\2\u01f1\u01f3"+
		"\5H%\2\u01f2\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01fa\7\62"+
		"\2\2\u01f8\u01f9\7\33\2\2\u01f9\u01fb\5\16\b\2\u01fa\u01f8\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fe\5f\64\2\u01fd\u01fc\3\2"+
		"\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\5@!\2\u0200?"+
		"\3\2\2\2\u0201\u0203\5\6\4\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2"+
		"\2\2\u0207\u0209\5f\64\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\5B\"\2\u020bA\3\2\2\2\u020c\u020d\7\3\2\2\u020d"+
		"\u020f\5f\64\2\u020e\u0210\5 \21\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2"+
		"\2\2\u0210\u0212\3\2\2\2\u0211\u0213\5D#\2\u0212\u0211\3\2\2\2\u0212\u0213"+
		"\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0216\5f\64\2\u0215\u0214\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\7\4\2\2\u0218C\3\2\2\2"+
		"\u0219\u021a\7\33\2\2\u021a\u021b\7\61\2\2\u021b\u021c\5F$\2\u021c\u021d"+
		"\7\62\2\2\u021dE\3\2\2\2\u021e\u0222\7\67\2\2\u021f\u0222\7\65\2\2\u0220"+
		"\u0222\5\26\f\2\u0221\u021e\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0220\3"+
		"\2\2\2\u0222G\3\2\2\2\u0223\u022b\7\67\2\2\u0224\u0226\7+\2\2\u0225\u0227"+
		"\5f\64\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u022a\7\67\2\2\u0229\u0224\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3"+
		"\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u022b\3\2\2\2\u022e"+
		"\u022f\7,\2\2\u022f\u0235\5\16\b\2\u0230\u0231\5f\64\2\u0231\u0232\5H"+
		"%\2\u0232\u0234\3\2\2\2\u0233\u0230\3\2\2\2\u0234\u0237\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u024f\3\2\2\2\u0237\u0235\3\2"+
		"\2\2\u0238\u0239\7\34\2\2\u0239\u0241\7\67\2\2\u023a\u023c\7+\2\2\u023b"+
		"\u023d\5f\64\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2"+
		"\2\2\u023e\u0240\7\67\2\2\u023f\u023a\3\2\2\2\u0240\u0243\3\2\2\2\u0241"+
		"\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0241\3\2"+
		"\2\2\u0244\u0245\7,\2\2\u0245\u024b\5\16\b\2\u0246\u0247\5f\64\2\u0247"+
		"\u0248\5H%\2\u0248\u024a\3\2\2\2\u0249\u0246\3\2\2\2\u024a\u024d\3\2\2"+
		"\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b"+
		"\3\2\2\2\u024e\u0223\3\2\2\2\u024e\u0238\3\2\2\2\u024fI\3\2\2\2\u0250"+
		"\u0251\b&\1\2\u0251\u0252\5L\'\2\u0252\u0259\3\2\2\2\u0253\u0254\f\4\2"+
		"\2\u0254\u0255\5R*\2\u0255\u0256\5L\'\2\u0256\u0258\3\2\2\2\u0257\u0253"+
		"\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"K\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025d\b\'\1\2\u025d\u025e\5N(\2\u025e"+
		"\u0265\3\2\2\2\u025f\u0260\f\4\2\2\u0260\u0261\5T+\2\u0261\u0262\5N(\2"+
		"\u0262\u0264\3\2\2\2\u0263\u025f\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263"+
		"\3\2\2\2\u0265\u0266\3\2\2\2\u0266M\3\2\2\2\u0267\u0265\3\2\2\2\u0268"+
		"\u0269\b(\1\2\u0269\u026a\5P)\2\u026a\u0271\3\2\2\2\u026b\u026c\f\4\2"+
		"\2\u026c\u026d\5V,\2\u026d\u026e\5P)\2\u026e\u0270\3\2\2\2\u026f\u026b"+
		"\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"O\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0275\7\61\2\2\u0275\u0276\5J&\2\u0276"+
		"\u0277\7\62\2\2\u0277\u027a\3\2\2\2\u0278\u027a\5X-\2\u0279\u0274\3\2"+
		"\2\2\u0279\u0278\3\2\2\2\u027aQ\3\2\2\2\u027b\u027c\t\3\2\2\u027cS\3\2"+
		"\2\2\u027d\u027e\t\4\2\2\u027eU\3\2\2\2\u027f\u0280\7$\2\2\u0280W\3\2"+
		"\2\2\u0281\u0287\7\67\2\2\u0282\u0287\7\65\2\2\u0283\u0287\5:\36\2\u0284"+
		"\u0287\5b\62\2\u0285\u0287\5d\63\2\u0286\u0281\3\2\2\2\u0286\u0282\3\2"+
		"\2\2\u0286\u0283\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0285\3\2\2\2\u0287"+
		"Y\3\2\2\2\u0288\u0289\5`\61\2\u0289\u028a\5^\60\2\u028a\u028e\5`\61\2"+
		"\u028b\u028c\5\\/\2\u028c\u028d\5Z.\2\u028d\u028f\3\2\2\2\u028e\u028b"+
		"\3\2\2\2\u028e\u028f\3\2\2\2\u028f[\3\2\2\2\u0290\u0291\t\5\2\2\u0291"+
		"]\3\2\2\2\u0292\u0293\t\6\2\2\u0293_\3\2\2\2\u0294\u029b\7\67\2\2\u0295"+
		"\u029b\7\65\2\2\u0296\u029b\5:\36\2\u0297\u029b\5\26\f\2\u0298\u029b\7"+
		"\66\2\2\u0299\u029b\5b\62\2\u029a\u0294\3\2\2\2\u029a\u0295\3\2\2\2\u029a"+
		"\u0296\3\2\2\2\u029a\u0297\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u0299\3\2"+
		"\2\2\u029ba\3\2\2\2\u029c\u029d\7\67\2\2\u029d\u029e\7\63\2\2\u029e\u029f"+
		"\5J&\2\u029f\u02a0\7\64\2\2\u02a0c\3\2\2\2\u02a1\u02a2\7\67\2\2\u02a2"+
		"\u02a3\7\63\2\2\u02a3\u02a6\5J&\2\u02a4\u02a5\7+\2\2\u02a5\u02a7\5J&\2"+
		"\u02a6\u02a4\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9"+
		"\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\7\64\2\2\u02abe\3\2\2\2\u02ac"+
		"\u02ad\t\7\2\2\u02adg\3\2\2\2Vkorv}\u0082\u0086\u008a\u008c\u0091\u0096"+
		"\u009b\u00a2\u00ad\u00b8\u00be\u00c0\u00c4\u00ca\u00cf\u00d6\u00db\u00e2"+
		"\u00e9\u00ed\u00f9\u0113\u011e\u0132\u013e\u0145\u0149\u014e\u0154\u0158"+
		"\u0162\u0167\u016b\u016f\u0174\u0178\u017f\u0183\u0188\u018f\u0194\u019e"+
		"\u01a2\u01a7\u01ab\u01b4\u01c0\u01c3\u01c7\u01cc\u01d4\u01d7\u01db\u01e0"+
		"\u01ec\u01f4\u01fa\u01fd\u0204\u0208\u020f\u0212\u0215\u0221\u0226\u022b"+
		"\u0235\u023c\u0241\u024b\u024e\u0259\u0265\u0271\u0279\u0286\u028e\u029a"+
		"\u02a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}