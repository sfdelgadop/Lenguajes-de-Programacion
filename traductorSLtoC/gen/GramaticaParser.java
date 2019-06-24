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
		Tk_caso=19, Tk_desde=20, Tk_si=21, Tk_sino=22, Tk_subrutina=23, Tk_retorna=24, 
		Tk_ref=25, Tk_vector=26, Tk_matriz=27, Tk_sum=28, Tk_subt=29, Tk_div=30, 
		Tk_mult=31, Tk_mod=32, Tk_exp=33, Tk_less=34, Tk_lessEqual=35, Tk_bigger=36, 
		Tk_biggerEqual=37, Tk_equal=38, Tk_diferent=39, Tk_comma=40, Tk_colon=41, 
		Tk_semicolon=42, Tk_assig=43, Tk_okey=44, Tk_ckey=45, Tk_opar=46, Tk_cpar=47, 
		Tk_obracket=48, Tk_cbracket=49, Tk_num=50, Tk_str=51, Tk_id=52, EOL=53, 
		WS=54;
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
			null, "'inicio'", "'fin'", "'var'", "'cons'", "'tipos'", "'programa'", 
			"'numerico'", "'logico'", "'cadena'", "'registro'", "'TRUE'", "'FALSE'", 
			"'and'", "'or'", "'mientras'", "'repetir'", "'hasta'", "'eval'", "'caso'", 
			"'desde'", "'si'", "'sino'", "'subrutina'", "'retorna'", "'ref'", "'vector'", 
			"'matriz'", "'+'", "'-'", "'/'", "'*'", "'%'", "'^'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'<>'", "','", "':'", null, "'='", "'{'", "'}'", 
			"'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Tk_inicio", "Tk_fin", "Tk_var", "Tk_cons", "Tk_tipos", "Tk_programa", 
			"Tk_numerico", "Tk_logico", "Tk_cadena", "Tk_registro", "Tk_true", "Tk_false", 
			"Tk_and", "Tk_or", "Tk_mientras", "Tk_repetir", "Tk_hasta", "Tk_eval", 
			"Tk_caso", "Tk_desde", "Tk_si", "Tk_sino", "Tk_subrutina", "Tk_retorna", 
			"Tk_ref", "Tk_vector", "Tk_matriz", "Tk_sum", "Tk_subt", "Tk_div", "Tk_mult", 
			"Tk_mod", "Tk_exp", "Tk_less", "Tk_lessEqual", "Tk_bigger", "Tk_biggerEqual", 
			"Tk_equal", "Tk_diferent", "Tk_comma", "Tk_colon", "Tk_semicolon", "Tk_assig", 
			"Tk_okey", "Tk_ckey", "Tk_opar", "Tk_cpar", "Tk_obracket", "Tk_cbracket", 
			"Tk_num", "Tk_str", "Tk_id", "EOL", "WS"
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
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
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
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(100);
				eol();
				}
			}

			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_programa) {
				{
				setState(103);
				programa();
				}
			}

			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_var) | (1L << Tk_cons) | (1L << Tk_tipos))) != 0)) {
				{
				setState(106);
				declaraciones();
				}
			}

			setState(109);
			cuerpo();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_subrutina) {
				{
				setState(110);
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
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(Tk_programa);
			setState(114);
			match(Tk_id);
			setState(115);
			eol();
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
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_var:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				variables();
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(118);
					declaraciones();
					}
					break;
				}
				}
				break;
			case Tk_cons:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				constants();
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(122);
					declaraciones();
					}
					break;
				}
				}
				break;
			case Tk_tipos:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				types();
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(126);
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
			setState(131);
			match(Tk_var);
			setState(132);
			eol();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(133);
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
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(Tk_id);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_comma) {
					{
					{
					setState(137);
					match(Tk_comma);
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Tk_semicolon || _la==EOL) {
						{
						setState(138);
						eol();
						}
					}

					setState(141);
					match(Tk_id);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(Tk_colon);
				setState(148);
				tipo();
				setState(149);
				eol();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_id) {
					{
					setState(150);
					variables_aux();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(Tk_id);
				setState(154);
				match(Tk_colon);
				setState(155);
				match(Tk_vector);
				setState(156);
				match(Tk_obracket);
				setState(157);
				vectorAux();
				setState(158);
				match(Tk_cbracket);
				setState(159);
				tipo();
				setState(160);
				eol();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_id) {
					{
					setState(161);
					variables_aux();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(Tk_id);
				setState(165);
				match(Tk_colon);
				setState(166);
				match(Tk_matriz);
				setState(167);
				match(Tk_obracket);
				setState(168);
				vectorAux();
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(169);
					match(Tk_comma);
					setState(170);
					vectorAux();
					}
					}
					setState(173); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Tk_comma );
				setState(175);
				match(Tk_cbracket);
				setState(176);
				tipo();
				setState(177);
				eol();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_id) {
					{
					setState(178);
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
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_mult:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(Tk_mult);
				}
				break;
			case Tk_opar:
			case Tk_num:
			case Tk_id:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
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
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_numerico:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(Tk_numerico);
				}
				break;
			case Tk_logico:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(Tk_logico);
				}
				break;
			case Tk_cadena:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(Tk_cadena);
				}
				break;
			case Tk_registro:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
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
			setState(193);
			match(Tk_cons);
			setState(194);
			eol();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(195);
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
			setState(198);
			match(Tk_id);
			setState(199);
			match(Tk_assig);
			setState(200);
			valor();
			setState(201);
			eol();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(202);
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
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_opar:
			case Tk_num:
			case Tk_id:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				operacionMatematica(0);
				}
				break;
			case Tk_true:
			case Tk_false:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				verdad();
				}
				break;
			case Tk_str:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
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
			setState(210);
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
			setState(212);
			match(Tk_tipos);
			setState(213);
			eol();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(214);
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
			setState(217);
			match(Tk_id);
			setState(218);
			match(Tk_colon);
			setState(219);
			tipo();
			setState(220);
			eol();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(221);
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
			setState(224);
			match(Tk_registro);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(225);
				eol();
				}
			}

			setState(228);
			match(Tk_okey);
			setState(229);
			eol();
			setState(230);
			variables_aux();
			setState(231);
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
			setState(233);
			match(Tk_inicio);
			setState(234);
			eol();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(235);
				sentencias();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
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
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				asignacion();
				setState(244);
				eol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				condicional();
				setState(247);
				eol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				cicloMientras();
				setState(250);
				eol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				cicloRepetir();
				setState(253);
				eol();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				eval();
				setState(256);
				eol();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(258);
				desde();
				setState(259);
				eol();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(261);
				llamada();
				setState(262);
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
			setState(266);
			match(Tk_id);
			setState(267);
			match(Tk_assig);
			setState(268);
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
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				llamada();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				estruct();
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
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode Tk_ckey() { return getToken(GramaticaParser.Tk_ckey, 0); }
		public TerminalNode Tk_comma() { return getToken(GramaticaParser.Tk_comma, 0); }
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
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(Tk_okey);
				setState(276);
				valor();
				{
				setState(277);
				match(Tk_comma);
				setState(278);
				valor();
				}
				setState(280);
				match(Tk_ckey);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(Tk_okey);
				setState(283);
				valor();
				setState(284);
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
			setState(288);
			match(Tk_si);
			setState(289);
			match(Tk_opar);
			setState(290);
			condicion();
			setState(291);
			match(Tk_cpar);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(292);
				eol();
				}
			}

			setState(295);
			match(Tk_okey);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(296);
				eol();
				}
			}

			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(299);
				sentencias();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					condicionSinoSi();
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_sino) {
				{
				setState(311);
				condicionSino();
				}
			}

			setState(314);
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
			setState(316);
			match(Tk_sino);
			setState(317);
			match(Tk_si);
			setState(318);
			match(Tk_opar);
			setState(319);
			condicion();
			setState(320);
			match(Tk_cpar);
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(321);
				eol();
				}
				break;
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(324);
				sentencias();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(330);
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
			setState(333);
			match(Tk_sino);
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(334);
				eol();
				}
				break;
			}
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(337);
				sentencias();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(343);
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
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
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
			setState(346);
			match(Tk_mientras);
			setState(347);
			match(Tk_opar);
			setState(348);
			condicion();
			setState(349);
			match(Tk_cpar);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(350);
				eol();
				}
			}

			setState(353);
			match(Tk_okey);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(354);
				eol();
				}
			}

			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				setState(357);
				sentencias();
				}
			}

			setState(360);
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
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
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
			setState(362);
			match(Tk_repetir);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(363);
				eol();
				}
			}

			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				setState(366);
				sentencias();
				}
			}

			setState(369);
			match(Tk_hasta);
			setState(370);
			match(Tk_opar);
			setState(371);
			condicion();
			setState(372);
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
		public TerminalNode Tk_opar() { return getToken(GramaticaParser.Tk_opar, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode Tk_cpar() { return getToken(GramaticaParser.Tk_cpar, 0); }
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
			setState(374);
			match(Tk_eval);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(375);
				eol();
				}
			}

			setState(378);
			match(Tk_okey);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(379);
				eol();
				}
			}

			setState(382);
			match(Tk_opar);
			setState(383);
			condicion();
			setState(384);
			match(Tk_cpar);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_caso) {
				{
				{
				setState(385);
				evalAux();
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_sino) {
				{
				setState(391);
				condicionSino();
				}
			}

			setState(394);
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
			setState(396);
			match(Tk_caso);
			setState(397);
			match(Tk_opar);
			setState(398);
			condicion();
			setState(399);
			match(Tk_cpar);
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
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TerminalNode Tk_ckey() { return getToken(GramaticaParser.Tk_ckey, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
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
			setState(405);
			match(Tk_desde);
			setState(406);
			match(Tk_id);
			setState(407);
			match(Tk_assig);
			setState(408);
			operacionMatematica(0);
			setState(409);
			match(Tk_hasta);
			setState(410);
			operacionMatematica(0);
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

			setState(418);
			sentencias();
			setState(419);
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
			setState(421);
			match(Tk_id);
			setState(422);
			match(Tk_opar);
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(423);
				tiposLLamada();
				}
				break;
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_true) | (1L << Tk_false) | (1L << Tk_opar) | (1L << Tk_num) | (1L << Tk_str) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(426);
				tiposLLamada();
				setState(427);
				match(Tk_comma);
				setState(428);
				tiposLLamada();
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
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
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(Tk_num);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(Tk_str);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				llamada();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				operacionMatematica(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(441);
				condicion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(442);
				vector();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(443);
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
			setState(446);
			match(Tk_subrutina);
			setState(447);
			match(Tk_id);
			setState(448);
			match(Tk_opar);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_ref || _la==Tk_id) {
				{
				{
				setState(449);
				subParamatros();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			match(Tk_cpar);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_retorna) {
				{
				setState(456);
				match(Tk_retorna);
				setState(457);
				tipo();
				}
			}

			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(460);
				eol();
				}
				break;
			}
			setState(463);
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
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_var) | (1L << Tk_cons) | (1L << Tk_tipos))) != 0)) {
				{
				{
				setState(465);
				declaraciones();
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(471);
				eol();
				}
			}

			setState(474);
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
			setState(476);
			match(Tk_inicio);
			setState(477);
			eol();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				setState(478);
				sentencias();
				}
			}

			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_retorna) {
				{
				setState(481);
				retorna();
				}
			}

			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(484);
				eol();
				}
			}

			setState(487);
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
			setState(489);
			match(Tk_retorna);
			setState(490);
			match(Tk_opar);
			setState(491);
			retornaAux();
			setState(492);
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
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_id:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(Tk_id);
				}
				break;
			case Tk_num:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				match(Tk_num);
				}
				break;
			case Tk_true:
			case Tk_false:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
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
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_id:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(Tk_id);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_comma) {
					{
					{
					setState(500);
					match(Tk_comma);
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Tk_semicolon || _la==EOL) {
						{
						setState(501);
						eol();
						}
					}

					setState(504);
					match(Tk_id);
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(510);
				match(Tk_colon);
				setState(511);
				tipo();
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(512);
						eol();
						setState(513);
						subParamatros();
						}
						} 
					}
					setState(519);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				}
				break;
			case Tk_ref:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(Tk_ref);
				setState(521);
				match(Tk_id);
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_comma) {
					{
					{
					setState(522);
					match(Tk_comma);
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Tk_semicolon || _la==EOL) {
						{
						setState(523);
						eol();
						}
					}

					setState(526);
					match(Tk_id);
					}
					}
					setState(531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(532);
				match(Tk_colon);
				setState(533);
				tipo();
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(534);
						eol();
						setState(535);
						subParamatros();
						}
						} 
					}
					setState(541);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
			setState(545);
			precedencia1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperacionMatematicaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operacionMatematica);
					setState(547);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(548);
					signo1();
					{
					setState(549);
					precedencia1(0);
					}
					}
					} 
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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
			setState(557);
			precedencia2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Precedencia1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_precedencia1);
					setState(559);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(560);
					signo2();
					setState(561);
					precedencia2(0);
					}
					} 
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
			setState(569);
			precedencia3();
			}
			_ctx.stop = _input.LT(-1);
			setState(577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Precedencia2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_precedencia2);
					setState(571);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(572);
					signo3();
					setState(573);
					precedencia3();
					}
					} 
				}
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_opar:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				match(Tk_opar);
				setState(581);
				operacionMatematica(0);
				setState(582);
				match(Tk_cpar);
				}
				break;
			case Tk_num:
			case Tk_id:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
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
			setState(587);
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
			setState(589);
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
			setState(591);
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
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				match(Tk_id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				match(Tk_num);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
				llamada();
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
			setState(598);
			auxLog();
			setState(599);
			relacional();
			setState(600);
			auxLog();
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_and || _la==Tk_or) {
				{
				setState(601);
				condicionAux();
				setState(602);
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
			setState(606);
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
			setState(608);
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
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				match(Tk_id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				match(Tk_num);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				llamada();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(613);
				verdad();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(614);
				match(Tk_str);
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
			setState(617);
			match(Tk_id);
			setState(618);
			match(Tk_obracket);
			setState(619);
			operacionMatematica(0);
			setState(620);
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
			setState(622);
			match(Tk_id);
			setState(623);
			match(Tk_obracket);
			setState(624);
			operacionMatematica(0);
			setState(627); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(625);
				match(Tk_comma);
				setState(626);
				operacionMatematica(0);
				}
				}
				setState(629); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Tk_comma );
			setState(631);
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
			setState(633);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u027e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\5\2"+
		"h\n\2\3\2\5\2k\n\2\3\2\5\2n\n\2\3\2\3\2\5\2r\n\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\5\4z\n\4\3\4\3\4\5\4~\n\4\3\4\3\4\5\4\u0082\n\4\5\4\u0084\n\4\3\5\3"+
		"\5\3\5\5\5\u0089\n\5\3\6\3\6\3\6\5\6\u008e\n\6\3\6\7\6\u0091\n\6\f\6\16"+
		"\6\u0094\13\6\3\6\3\6\3\6\3\6\5\6\u009a\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00a5\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00ae\n\6\r\6"+
		"\16\6\u00af\3\6\3\6\3\6\3\6\5\6\u00b6\n\6\5\6\u00b8\n\6\3\7\3\7\5\7\u00bc"+
		"\n\7\3\b\3\b\3\b\3\b\5\b\u00c2\n\b\3\t\3\t\3\t\5\t\u00c7\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00ce\n\n\3\13\3\13\3\13\5\13\u00d3\n\13\3\f\3\f\3\r\3"+
		"\r\3\r\5\r\u00da\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00e1\n\16\3\17\3\17"+
		"\5\17\u00e5\n\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u00ef\n"+
		"\20\f\20\16\20\u00f2\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u010b\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u0114\n\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0121\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0128\n\25\3\25\3\25\5\25\u012c\n\25\3"+
		"\25\7\25\u012f\n\25\f\25\16\25\u0132\13\25\3\25\7\25\u0135\n\25\f\25\16"+
		"\25\u0138\13\25\3\25\5\25\u013b\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0145\n\26\3\26\7\26\u0148\n\26\f\26\16\26\u014b\13\26\3\26"+
		"\5\26\u014e\n\26\3\27\3\27\5\27\u0152\n\27\3\27\7\27\u0155\n\27\f\27\16"+
		"\27\u0158\13\27\3\27\5\27\u015b\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0162"+
		"\n\30\3\30\3\30\5\30\u0166\n\30\3\30\5\30\u0169\n\30\3\30\3\30\3\31\3"+
		"\31\5\31\u016f\n\31\3\31\5\31\u0172\n\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\5\32\u017b\n\32\3\32\3\32\5\32\u017f\n\32\3\32\3\32\3\32\3\32\7"+
		"\32\u0185\n\32\f\32\16\32\u0188\13\32\3\32\5\32\u018b\n\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u0194\n\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u019f\n\34\3\34\3\34\5\34\u01a3\n\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\5\35\u01ab\n\35\3\35\3\35\3\35\3\35\7\35\u01b1\n\35"+
		"\f\35\16\35\u01b4\13\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5"+
		"\36\u01bf\n\36\3\37\3\37\3\37\3\37\7\37\u01c5\n\37\f\37\16\37\u01c8\13"+
		"\37\3\37\3\37\3\37\5\37\u01cd\n\37\3\37\5\37\u01d0\n\37\3\37\3\37\3 \7"+
		" \u01d5\n \f \16 \u01d8\13 \3 \5 \u01db\n \3 \3 \3!\3!\3!\5!\u01e2\n!"+
		"\3!\5!\u01e5\n!\3!\5!\u01e8\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u01f4"+
		"\n#\3$\3$\3$\5$\u01f9\n$\3$\7$\u01fc\n$\f$\16$\u01ff\13$\3$\3$\3$\3$\3"+
		"$\7$\u0206\n$\f$\16$\u0209\13$\3$\3$\3$\3$\5$\u020f\n$\3$\7$\u0212\n$"+
		"\f$\16$\u0215\13$\3$\3$\3$\3$\3$\7$\u021c\n$\f$\16$\u021f\13$\5$\u0221"+
		"\n$\3%\3%\3%\3%\3%\3%\3%\7%\u022a\n%\f%\16%\u022d\13%\3&\3&\3&\3&\3&\3"+
		"&\3&\7&\u0236\n&\f&\16&\u0239\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0242"+
		"\n\'\f\'\16\'\u0245\13\'\3(\3(\3(\3(\3(\5(\u024c\n(\3)\3)\3*\3*\3+\3+"+
		"\3,\3,\3,\5,\u0257\n,\3-\3-\3-\3-\3-\3-\5-\u025f\n-\3.\3.\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\60\5\60\u026a\n\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\6\62\u0276\n\62\r\62\16\62\u0277\3\62\3\62\3\63\3\63\3"+
		"\63\2\5HJL\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bd\2\b\3\2\r\16\3\2\36\37\3\2 \"\3\2\17\20\3"+
		"\2$)\4\2,,\67\67\2\u02ae\2g\3\2\2\2\4s\3\2\2\2\6\u0083\3\2\2\2\b\u0085"+
		"\3\2\2\2\n\u00b7\3\2\2\2\f\u00bb\3\2\2\2\16\u00c1\3\2\2\2\20\u00c3\3\2"+
		"\2\2\22\u00c8\3\2\2\2\24\u00d2\3\2\2\2\26\u00d4\3\2\2\2\30\u00d6\3\2\2"+
		"\2\32\u00db\3\2\2\2\34\u00e2\3\2\2\2\36\u00eb\3\2\2\2 \u010a\3\2\2\2\""+
		"\u010c\3\2\2\2$\u0113\3\2\2\2&\u0120\3\2\2\2(\u0122\3\2\2\2*\u013e\3\2"+
		"\2\2,\u014f\3\2\2\2.\u015c\3\2\2\2\60\u016c\3\2\2\2\62\u0178\3\2\2\2\64"+
		"\u018e\3\2\2\2\66\u0197\3\2\2\28\u01a7\3\2\2\2:\u01be\3\2\2\2<\u01c0\3"+
		"\2\2\2>\u01d6\3\2\2\2@\u01de\3\2\2\2B\u01eb\3\2\2\2D\u01f3\3\2\2\2F\u0220"+
		"\3\2\2\2H\u0222\3\2\2\2J\u022e\3\2\2\2L\u023a\3\2\2\2N\u024b\3\2\2\2P"+
		"\u024d\3\2\2\2R\u024f\3\2\2\2T\u0251\3\2\2\2V\u0256\3\2\2\2X\u0258\3\2"+
		"\2\2Z\u0260\3\2\2\2\\\u0262\3\2\2\2^\u0269\3\2\2\2`\u026b\3\2\2\2b\u0270"+
		"\3\2\2\2d\u027b\3\2\2\2fh\5d\63\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\5\4"+
		"\3\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\5\6\4\2ml\3\2\2\2mn\3\2\2\2no\3\2"+
		"\2\2oq\5\36\20\2pr\5<\37\2qp\3\2\2\2qr\3\2\2\2r\3\3\2\2\2st\7\b\2\2tu"+
		"\7\66\2\2uv\5d\63\2v\5\3\2\2\2wy\5\b\5\2xz\5\6\4\2yx\3\2\2\2yz\3\2\2\2"+
		"z\u0084\3\2\2\2{}\5\20\t\2|~\5\6\4\2}|\3\2\2\2}~\3\2\2\2~\u0084\3\2\2"+
		"\2\177\u0081\5\30\r\2\u0080\u0082\5\6\4\2\u0081\u0080\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0084\3\2\2\2\u0083w\3\2\2\2\u0083{\3\2\2\2\u0083\177\3"+
		"\2\2\2\u0084\7\3\2\2\2\u0085\u0086\7\5\2\2\u0086\u0088\5d\63\2\u0087\u0089"+
		"\5\n\6\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\t\3\2\2\2\u008a"+
		"\u0092\7\66\2\2\u008b\u008d\7*\2\2\u008c\u008e\5d\63\2\u008d\u008c\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\7\66\2\2\u0090"+
		"\u008b\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7+\2\2\u0096"+
		"\u0097\5\16\b\2\u0097\u0099\5d\63\2\u0098\u009a\5\n\6\2\u0099\u0098\3"+
		"\2\2\2\u0099\u009a\3\2\2\2\u009a\u00b8\3\2\2\2\u009b\u009c\7\66\2\2\u009c"+
		"\u009d\7+\2\2\u009d\u009e\7\34\2\2\u009e\u009f\7\62\2\2\u009f\u00a0\5"+
		"\f\7\2\u00a0\u00a1\7\63\2\2\u00a1\u00a2\5\16\b\2\u00a2\u00a4\5d\63\2\u00a3"+
		"\u00a5\5\n\6\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00b8\3\2"+
		"\2\2\u00a6\u00a7\7\66\2\2\u00a7\u00a8\7+\2\2\u00a8\u00a9\7\35\2\2\u00a9"+
		"\u00aa\7\62\2\2\u00aa\u00ad\5\f\7\2\u00ab\u00ac\7*\2\2\u00ac\u00ae\5\f"+
		"\7\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\63\2\2\u00b2\u00b3\5"+
		"\16\b\2\u00b3\u00b5\5d\63\2\u00b4\u00b6\5\n\6\2\u00b5\u00b4\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u008a\3\2\2\2\u00b7\u009b\3\2"+
		"\2\2\u00b7\u00a6\3\2\2\2\u00b8\13\3\2\2\2\u00b9\u00bc\7!\2\2\u00ba\u00bc"+
		"\5H%\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\r\3\2\2\2\u00bd\u00c2"+
		"\7\t\2\2\u00be\u00c2\7\n\2\2\u00bf\u00c2\7\13\2\2\u00c0\u00c2\5\34\17"+
		"\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0"+
		"\3\2\2\2\u00c2\17\3\2\2\2\u00c3\u00c4\7\6\2\2\u00c4\u00c6\5d\63\2\u00c5"+
		"\u00c7\5\22\n\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\21\3\2\2"+
		"\2\u00c8\u00c9\7\66\2\2\u00c9\u00ca\7-\2\2\u00ca\u00cb\5\24\13\2\u00cb"+
		"\u00cd\5d\63\2\u00cc\u00ce\5\22\n\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00ce\23\3\2\2\2\u00cf\u00d3\5H%\2\u00d0\u00d3\5\26\f\2\u00d1\u00d3"+
		"\7\65\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2"+
		"\u00d3\25\3\2\2\2\u00d4\u00d5\t\2\2\2\u00d5\27\3\2\2\2\u00d6\u00d7\7\7"+
		"\2\2\u00d7\u00d9\5d\63\2\u00d8\u00da\5\32\16\2\u00d9\u00d8\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\31\3\2\2\2\u00db\u00dc\7\66\2\2\u00dc\u00dd\7+\2"+
		"\2\u00dd\u00de\5\16\b\2\u00de\u00e0\5d\63\2\u00df\u00e1\5\32\16\2\u00e0"+
		"\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\33\3\2\2\2\u00e2\u00e4\7\f\2"+
		"\2\u00e3\u00e5\5d\63\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\7.\2\2\u00e7\u00e8\5d\63\2\u00e8\u00e9\5\n\6\2\u00e9"+
		"\u00ea\7/\2\2\u00ea\35\3\2\2\2\u00eb\u00ec\7\3\2\2\u00ec\u00f0\5d\63\2"+
		"\u00ed\u00ef\5 \21\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\7\4\2\2\u00f4\37\3\2\2\2\u00f5\u00f6\5\"\22\2\u00f6\u00f7\5d\63"+
		"\2\u00f7\u010b\3\2\2\2\u00f8\u00f9\5(\25\2\u00f9\u00fa\5d\63\2\u00fa\u010b"+
		"\3\2\2\2\u00fb\u00fc\5.\30\2\u00fc\u00fd\5d\63\2\u00fd\u010b\3\2\2\2\u00fe"+
		"\u00ff\5\60\31\2\u00ff\u0100\5d\63\2\u0100\u010b\3\2\2\2\u0101\u0102\5"+
		"\62\32\2\u0102\u0103\5d\63\2\u0103\u010b\3\2\2\2\u0104\u0105\5\66\34\2"+
		"\u0105\u0106\5d\63\2\u0106\u010b\3\2\2\2\u0107\u0108\58\35\2\u0108\u0109"+
		"\5d\63\2\u0109\u010b\3\2\2\2\u010a\u00f5\3\2\2\2\u010a\u00f8\3\2\2\2\u010a"+
		"\u00fb\3\2\2\2\u010a\u00fe\3\2\2\2\u010a\u0101\3\2\2\2\u010a\u0104\3\2"+
		"\2\2\u010a\u0107\3\2\2\2\u010b!\3\2\2\2\u010c\u010d\7\66\2\2\u010d\u010e"+
		"\7-\2\2\u010e\u010f\5$\23\2\u010f#\3\2\2\2\u0110\u0114\58\35\2\u0111\u0114"+
		"\5\24\13\2\u0112\u0114\5&\24\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2"+
		"\u0113\u0112\3\2\2\2\u0114%\3\2\2\2\u0115\u0116\7.\2\2\u0116\u0117\5\24"+
		"\13\2\u0117\u0118\7*\2\2\u0118\u0119\5\24\13\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\7/\2\2\u011b\u0121\3\2\2\2\u011c\u011d\7.\2\2\u011d\u011e\5\24"+
		"\13\2\u011e\u011f\7/\2\2\u011f\u0121\3\2\2\2\u0120\u0115\3\2\2\2\u0120"+
		"\u011c\3\2\2\2\u0121\'\3\2\2\2\u0122\u0123\7\27\2\2\u0123\u0124\7\60\2"+
		"\2\u0124\u0125\5X-\2\u0125\u0127\7\61\2\2\u0126\u0128\5d\63\2\u0127\u0126"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\7.\2\2\u012a"+
		"\u012c\5d\63\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0130\3\2"+
		"\2\2\u012d\u012f\5 \21\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0136\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0133\u0135\5*\26\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0139\u013b\5,\27\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013d\7/\2\2\u013d)\3\2\2\2\u013e\u013f\7\30\2\2"+
		"\u013f\u0140\7\27\2\2\u0140\u0141\7\60\2\2\u0141\u0142\5X-\2\u0142\u0144"+
		"\7\61\2\2\u0143\u0145\5d\63\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2"+
		"\u0145\u0149\3\2\2\2\u0146\u0148\5 \21\2\u0147\u0146\3\2\2\2\u0148\u014b"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014d\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u014e\5d\63\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e+\3\2\2\2\u014f\u0151\7\30\2\2\u0150\u0152\5d\63\2\u0151\u0150"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0156\3\2\2\2\u0153\u0155\5 \21\2\u0154"+
		"\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015b\5d\63\2\u015a"+
		"\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b-\3\2\2\2\u015c\u015d\7\21\2\2"+
		"\u015d\u015e\7\60\2\2\u015e\u015f\5X-\2\u015f\u0161\7\61\2\2\u0160\u0162"+
		"\5d\63\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0165\7.\2\2\u0164\u0166\5d\63\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\u0168\3\2\2\2\u0167\u0169\5 \21\2\u0168\u0167\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\7/\2\2\u016b/\3\2\2\2\u016c"+
		"\u016e\7\22\2\2\u016d\u016f\5d\63\2\u016e\u016d\3\2\2\2\u016e\u016f\3"+
		"\2\2\2\u016f\u0171\3\2\2\2\u0170\u0172\5 \21\2\u0171\u0170\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\7\23\2\2\u0174\u0175\7"+
		"\60\2\2\u0175\u0176\5X-\2\u0176\u0177\7\61\2\2\u0177\61\3\2\2\2\u0178"+
		"\u017a\7\24\2\2\u0179\u017b\5d\63\2\u017a\u0179\3\2\2\2\u017a\u017b\3"+
		"\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\7.\2\2\u017d\u017f\5d\63\2\u017e"+
		"\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7\60"+
		"\2\2\u0181\u0182\5X-\2\u0182\u0186\7\61\2\2\u0183\u0185\5\64\33\2\u0184"+
		"\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018b\5,\27\2\u018a"+
		"\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\7/"+
		"\2\2\u018d\63\3\2\2\2\u018e\u018f\7\25\2\2\u018f\u0190\7\60\2\2\u0190"+
		"\u0191\5X-\2\u0191\u0193\7\61\2\2\u0192\u0194\5d\63\2\u0193\u0192\3\2"+
		"\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\5 \21\2\u0196"+
		"\65\3\2\2\2\u0197\u0198\7\26\2\2\u0198\u0199\7\66\2\2\u0199\u019a\7-\2"+
		"\2\u019a\u019b\5H%\2\u019b\u019c\7\23\2\2\u019c\u019e\5H%\2\u019d\u019f"+
		"\5d\63\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a2\7.\2\2\u01a1\u01a3\5d\63\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\5 \21\2\u01a5\u01a6\7/\2\2\u01a6"+
		"\67\3\2\2\2\u01a7\u01a8\7\66\2\2\u01a8\u01aa\7\60\2\2\u01a9\u01ab\5:\36"+
		"\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01b2\3\2\2\2\u01ac\u01ad"+
		"\5:\36\2\u01ad\u01ae\7*\2\2\u01ae\u01af\5:\36\2\u01af\u01b1\3\2\2\2\u01b0"+
		"\u01ac\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2"+
		"\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7\61\2\2\u01b6"+
		"9\3\2\2\2\u01b7\u01bf\7\64\2\2\u01b8\u01bf\7\65\2\2\u01b9\u01bf\58\35"+
		"\2\u01ba\u01bf\5H%\2\u01bb\u01bf\5X-\2\u01bc\u01bf\5`\61\2\u01bd\u01bf"+
		"\5b\62\2\u01be\u01b7\3\2\2\2\u01be\u01b8\3\2\2\2\u01be\u01b9\3\2\2\2\u01be"+
		"\u01ba\3\2\2\2\u01be\u01bb\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2"+
		"\2\2\u01bf;\3\2\2\2\u01c0\u01c1\7\31\2\2\u01c1\u01c2\7\66\2\2\u01c2\u01c6"+
		"\7\60\2\2\u01c3\u01c5\5F$\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6\3\2"+
		"\2\2\u01c9\u01cc\7\61\2\2\u01ca\u01cb\7\32\2\2\u01cb\u01cd\5\16\b\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01d0\5d"+
		"\63\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d2\5> \2\u01d2=\3\2\2\2\u01d3\u01d5\5\6\4\2\u01d4\u01d3\3\2\2\2\u01d5"+
		"\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01da\3\2"+
		"\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01db\5d\63\2\u01da\u01d9\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\5@!\2\u01dd?\3\2\2\2\u01de"+
		"\u01df\7\3\2\2\u01df\u01e1\5d\63\2\u01e0\u01e2\5 \21\2\u01e1\u01e0\3\2"+
		"\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e5\5B\"\2\u01e4"+
		"\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e8\5d"+
		"\63\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01ea\7\4\2\2\u01eaA\3\2\2\2\u01eb\u01ec\7\32\2\2\u01ec\u01ed\7\60\2"+
		"\2\u01ed\u01ee\5D#\2\u01ee\u01ef\7\61\2\2\u01efC\3\2\2\2\u01f0\u01f4\7"+
		"\66\2\2\u01f1\u01f4\7\64\2\2\u01f2\u01f4\5\26\f\2\u01f3\u01f0\3\2\2\2"+
		"\u01f3\u01f1\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4E\3\2\2\2\u01f5\u01fd\7"+
		"\66\2\2\u01f6\u01f8\7*\2\2\u01f7\u01f9\5d\63\2\u01f8\u01f7\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\7\66\2\2\u01fb\u01f6\3"+
		"\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7+\2\2\u0201\u0207\5\16"+
		"\b\2\u0202\u0203\5d\63\2\u0203\u0204\5F$\2\u0204\u0206\3\2\2\2\u0205\u0202"+
		"\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u0221\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020b\7\33\2\2\u020b\u0213\7"+
		"\66\2\2\u020c\u020e\7*\2\2\u020d\u020f\5d\63\2\u020e\u020d\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\7\66\2\2\u0211\u020c\3"+
		"\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0216\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\7+\2\2\u0217\u021d\5\16"+
		"\b\2\u0218\u0219\5d\63\2\u0219\u021a\5F$\2\u021a\u021c\3\2\2\2\u021b\u0218"+
		"\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u01f5\3\2\2\2\u0220\u020a\3\2"+
		"\2\2\u0221G\3\2\2\2\u0222\u0223\b%\1\2\u0223\u0224\5J&\2\u0224\u022b\3"+
		"\2\2\2\u0225\u0226\f\4\2\2\u0226\u0227\5P)\2\u0227\u0228\5J&\2\u0228\u022a"+
		"\3\2\2\2\u0229\u0225\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022cI\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u022f\b&\1\2\u022f"+
		"\u0230\5L\'\2\u0230\u0237\3\2\2\2\u0231\u0232\f\4\2\2\u0232\u0233\5R*"+
		"\2\u0233\u0234\5L\'\2\u0234\u0236\3\2\2\2\u0235\u0231\3\2\2\2\u0236\u0239"+
		"\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238K\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u023a\u023b\b\'\1\2\u023b\u023c\5N(\2\u023c\u0243\3\2\2"+
		"\2\u023d\u023e\f\4\2\2\u023e\u023f\5T+\2\u023f\u0240\5N(\2\u0240\u0242"+
		"\3\2\2\2\u0241\u023d\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244M\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u0247\7\60\2\2"+
		"\u0247\u0248\5H%\2\u0248\u0249\7\61\2\2\u0249\u024c\3\2\2\2\u024a\u024c"+
		"\5V,\2\u024b\u0246\3\2\2\2\u024b\u024a\3\2\2\2\u024cO\3\2\2\2\u024d\u024e"+
		"\t\3\2\2\u024eQ\3\2\2\2\u024f\u0250\t\4\2\2\u0250S\3\2\2\2\u0251\u0252"+
		"\7#\2\2\u0252U\3\2\2\2\u0253\u0257\7\66\2\2\u0254\u0257\7\64\2\2\u0255"+
		"\u0257\58\35\2\u0256\u0253\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0255\3\2"+
		"\2\2\u0257W\3\2\2\2\u0258\u0259\5^\60\2\u0259\u025a\5\\/\2\u025a\u025e"+
		"\5^\60\2\u025b\u025c\5Z.\2\u025c\u025d\5X-\2\u025d\u025f\3\2\2\2\u025e"+
		"\u025b\3\2\2\2\u025e\u025f\3\2\2\2\u025fY\3\2\2\2\u0260\u0261\t\5\2\2"+
		"\u0261[\3\2\2\2\u0262\u0263\t\6\2\2\u0263]\3\2\2\2\u0264\u026a\7\66\2"+
		"\2\u0265\u026a\7\64\2\2\u0266\u026a\58\35\2\u0267\u026a\5\26\f\2\u0268"+
		"\u026a\7\65\2\2\u0269\u0264\3\2\2\2\u0269\u0265\3\2\2\2\u0269\u0266\3"+
		"\2\2\2\u0269\u0267\3\2\2\2\u0269\u0268\3\2\2\2\u026a_\3\2\2\2\u026b\u026c"+
		"\7\66\2\2\u026c\u026d\7\62\2\2\u026d\u026e\5H%\2\u026e\u026f\7\63\2\2"+
		"\u026fa\3\2\2\2\u0270\u0271\7\66\2\2\u0271\u0272\7\62\2\2\u0272\u0275"+
		"\5H%\2\u0273\u0274\7*\2\2\u0274\u0276\5H%\2\u0275\u0273\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2"+
		"\2\2\u0279\u027a\7\63\2\2\u027ac\3\2\2\2\u027b\u027c\t\7\2\2\u027ce\3"+
		"\2\2\2Pgjmqy}\u0081\u0083\u0088\u008d\u0092\u0099\u00a4\u00af\u00b5\u00b7"+
		"\u00bb\u00c1\u00c6\u00cd\u00d2\u00d9\u00e0\u00e4\u00f0\u010a\u0113\u0120"+
		"\u0127\u012b\u0130\u0136\u013a\u0144\u0149\u014d\u0151\u0156\u015a\u0161"+
		"\u0165\u0168\u016e\u0171\u017a\u017e\u0186\u018a\u0193\u019e\u01a2\u01aa"+
		"\u01b2\u01be\u01c6\u01cc\u01cf\u01d6\u01da\u01e1\u01e4\u01e7\u01f3\u01f8"+
		"\u01fd\u0207\u020e\u0213\u021d\u0220\u022b\u0237\u0243\u024b\u0256\u025e"+
		"\u0269\u0277";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}