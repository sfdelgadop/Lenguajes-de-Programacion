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
		RULE_llamada = 27, RULE_tiposLLamada = 28, RULE_subRutinas = 29, RULE_subRutinasAux = 30, 
		RULE_retorna = 31, RULE_subParamatros = 32, RULE_operacionMatematica = 33, 
		RULE_precedencia1 = 34, RULE_precedencia2 = 35, RULE_precedencia3 = 36, 
		RULE_signo1 = 37, RULE_signo2 = 38, RULE_signo3 = 39, RULE_auxNum = 40, 
		RULE_condicion = 41, RULE_condicionAux = 42, RULE_relacional = 43, RULE_auxLog = 44, 
		RULE_vector = 45, RULE_matriz = 46, RULE_eol = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "programa", "declaraciones", "variables", "variables_aux", "vectorAux", 
			"tipo", "constants", "constants_aux", "valor", "verdad", "types", "types_aux", 
			"registro", "cuerpo", "sentencias", "asignacion", "asignacionAux", "estruct", 
			"condicional", "condicionSinoSi", "condicionSino", "cicloMientras", "cicloRepetir", 
			"eval", "evalAux", "desde", "llamada", "tiposLLamada", "subRutinas", 
			"subRutinasAux", "retorna", "subParamatros", "operacionMatematica", "precedencia1", 
			"precedencia2", "precedencia3", "signo1", "signo2", "signo3", "auxNum", 
			"condicion", "condicionAux", "relacional", "auxLog", "vector", "matriz", 
			"eol"
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(96);
				eol();
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_programa) {
				{
				setState(99);
				programa();
				}
			}

			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_var) | (1L << Tk_cons) | (1L << Tk_tipos))) != 0)) {
				{
				setState(102);
				declaraciones();
				}
			}

			setState(105);
			cuerpo();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_subrutina) {
				{
				setState(106);
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
			setState(109);
			match(Tk_programa);
			setState(110);
			match(Tk_id);
			setState(111);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_var:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				variables();
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(114);
					declaraciones();
					}
					break;
				}
				}
				break;
			case Tk_cons:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				constants();
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(118);
					declaraciones();
					}
					break;
				}
				}
				break;
			case Tk_tipos:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				types();
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(122);
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
			setState(127);
			match(Tk_var);
			setState(128);
			eol();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(129);
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(Tk_id);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_comma) {
					{
					{
					setState(133);
					match(Tk_comma);
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Tk_semicolon || _la==EOL) {
						{
						setState(134);
						eol();
						}
					}

					setState(137);
					match(Tk_id);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(Tk_colon);
				setState(144);
				tipo();
				setState(145);
				eol();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_id) {
					{
					setState(146);
					variables_aux();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(Tk_id);
				setState(150);
				match(Tk_colon);
				setState(151);
				match(Tk_vector);
				setState(152);
				match(Tk_obracket);
				setState(153);
				vectorAux();
				setState(154);
				match(Tk_cbracket);
				setState(155);
				tipo();
				setState(156);
				eol();
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_id) {
					{
					setState(157);
					variables_aux();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(Tk_id);
				setState(161);
				match(Tk_colon);
				setState(162);
				match(Tk_matriz);
				setState(163);
				match(Tk_obracket);
				setState(164);
				vectorAux();
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(165);
					match(Tk_comma);
					setState(166);
					vectorAux();
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Tk_comma );
				setState(171);
				match(Tk_cbracket);
				setState(172);
				tipo();
				setState(173);
				eol();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_id) {
					{
					setState(174);
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
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_mult:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(Tk_mult);
				}
				break;
			case Tk_opar:
			case Tk_num:
			case Tk_id:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
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
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_numerico:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(Tk_numerico);
				}
				break;
			case Tk_logico:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(Tk_logico);
				}
				break;
			case Tk_cadena:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(Tk_cadena);
				}
				break;
			case Tk_registro:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
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
			setState(189);
			match(Tk_cons);
			setState(190);
			eol();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(191);
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
			setState(194);
			match(Tk_id);
			setState(195);
			match(Tk_assig);
			setState(196);
			valor();
			setState(197);
			eol();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(198);
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
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_opar:
			case Tk_num:
			case Tk_id:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				operacionMatematica(0);
				}
				break;
			case Tk_true:
			case Tk_false:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				verdad();
				}
				break;
			case Tk_str:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
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
			setState(206);
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
			setState(208);
			match(Tk_tipos);
			setState(209);
			eol();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(210);
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
			setState(213);
			match(Tk_id);
			setState(214);
			match(Tk_colon);
			setState(215);
			tipo();
			setState(216);
			eol();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(217);
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
			setState(220);
			match(Tk_registro);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(221);
				eol();
				}
			}

			setState(224);
			match(Tk_okey);
			setState(225);
			eol();
			setState(226);
			variables_aux();
			setState(227);
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
			setState(229);
			match(Tk_inicio);
			setState(230);
			eol();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(231);
				sentencias();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
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
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				asignacion();
				setState(240);
				eol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				condicional();
				setState(243);
				eol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				cicloMientras();
				setState(246);
				eol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				cicloRepetir();
				setState(249);
				eol();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				eval();
				setState(252);
				eol();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				desde();
				setState(255);
				eol();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				llamada();
				setState(258);
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
			setState(262);
			match(Tk_id);
			setState(263);
			match(Tk_assig);
			setState(264);
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
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				llamada();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
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
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(Tk_okey);
				setState(272);
				valor();
				{
				setState(273);
				match(Tk_comma);
				setState(274);
				valor();
				}
				setState(276);
				match(Tk_ckey);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(Tk_okey);
				setState(279);
				valor();
				setState(280);
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
			setState(284);
			match(Tk_si);
			setState(285);
			match(Tk_opar);
			setState(286);
			condicion();
			setState(287);
			match(Tk_cpar);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(288);
				eol();
				}
			}

			setState(291);
			match(Tk_okey);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(292);
				eol();
				}
			}

			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(295);
				sentencias();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(301);
					condicionSinoSi();
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_sino) {
				{
				setState(307);
				condicionSino();
				}
			}

			setState(310);
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
			setState(312);
			match(Tk_sino);
			setState(313);
			match(Tk_si);
			setState(314);
			match(Tk_opar);
			setState(315);
			condicion();
			setState(316);
			match(Tk_cpar);
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(317);
				eol();
				}
				break;
			}
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(320);
				sentencias();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(326);
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
			setState(329);
			match(Tk_sino);
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(330);
				eol();
				}
				break;
			}
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(333);
				sentencias();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(339);
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
			setState(342);
			match(Tk_mientras);
			setState(343);
			match(Tk_opar);
			setState(344);
			condicion();
			setState(345);
			match(Tk_cpar);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(346);
				eol();
				}
			}

			setState(349);
			match(Tk_okey);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(350);
				eol();
				}
			}

			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				setState(353);
				sentencias();
				}
			}

			setState(356);
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
			setState(358);
			match(Tk_repetir);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(359);
				eol();
				}
			}

			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				setState(362);
				sentencias();
				}
			}

			setState(365);
			match(Tk_hasta);
			setState(366);
			match(Tk_opar);
			setState(367);
			condicion();
			setState(368);
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
			setState(370);
			match(Tk_eval);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(371);
				eol();
				}
			}

			setState(374);
			match(Tk_okey);
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
			match(Tk_opar);
			setState(379);
			condicion();
			setState(380);
			match(Tk_cpar);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_caso) {
				{
				{
				setState(381);
				evalAux();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_sino) {
				{
				setState(387);
				condicionSino();
				}
			}

			setState(390);
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
			setState(392);
			match(Tk_caso);
			setState(393);
			match(Tk_opar);
			setState(394);
			condicion();
			setState(395);
			match(Tk_cpar);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(396);
				eol();
				}
			}

			setState(399);
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
			setState(401);
			match(Tk_desde);
			setState(402);
			match(Tk_id);
			setState(403);
			match(Tk_assig);
			setState(404);
			operacionMatematica(0);
			setState(405);
			match(Tk_hasta);
			setState(406);
			operacionMatematica(0);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(407);
				eol();
				}
			}

			setState(410);
			match(Tk_okey);
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
			sentencias();
			setState(415);
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
			setState(417);
			match(Tk_id);
			setState(418);
			match(Tk_opar);
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(419);
				tiposLLamada();
				}
				break;
			}
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_true) | (1L << Tk_false) | (1L << Tk_opar) | (1L << Tk_num) | (1L << Tk_str) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(422);
				tiposLLamada();
				setState(423);
				match(Tk_comma);
				setState(424);
				tiposLLamada();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
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
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(Tk_num);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(Tk_str);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				llamada();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				operacionMatematica(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(437);
				condicion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(438);
				vector();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(439);
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
		public SubRutinasAuxContext subRutinasAux() {
			return getRuleContext(SubRutinasAuxContext.class,0);
		}
		public SubParamatrosContext subParamatros() {
			return getRuleContext(SubParamatrosContext.class,0);
		}
		public TerminalNode Tk_retorna() { return getToken(GramaticaParser.Tk_retorna, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public List<DeclaracionesContext> declaraciones() {
			return getRuleContexts(DeclaracionesContext.class);
		}
		public DeclaracionesContext declaraciones(int i) {
			return getRuleContext(DeclaracionesContext.class,i);
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
			setState(442);
			match(Tk_subrutina);
			setState(443);
			match(Tk_id);
			setState(444);
			match(Tk_opar);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_ref || _la==Tk_id) {
				{
				setState(445);
				subParamatros();
				}
			}

			setState(448);
			match(Tk_cpar);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_retorna) {
				{
				setState(449);
				match(Tk_retorna);
				setState(450);
				tipo();
				}
			}

			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(453);
				eol();
				}
				break;
			}
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_var) | (1L << Tk_cons) | (1L << Tk_tipos))) != 0)) {
				{
				{
				setState(456);
				declaraciones();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(462);
				eol();
				}
			}

			setState(465);
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
		enterRule(_localctx, 60, RULE_subRutinasAux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(Tk_inicio);
			setState(468);
			eol();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				setState(469);
				sentencias();
				}
			}

			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_retorna) {
				{
				setState(472);
				retorna();
				}
			}

			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(475);
				eol();
				}
			}

			setState(478);
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
		public TerminalNode Tk_id() { return getToken(GramaticaParser.Tk_id, 0); }
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
		enterRule(_localctx, 62, RULE_retorna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(Tk_retorna);
			setState(481);
			match(Tk_opar);
			setState(482);
			match(Tk_id);
			setState(483);
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
		public SubParamatrosContext subParamatros() {
			return getRuleContext(SubParamatrosContext.class,0);
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
		enterRule(_localctx, 64, RULE_subParamatros);
		int _la;
		try {
			setState(522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_id:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(Tk_id);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_comma) {
					{
					{
					setState(486);
					match(Tk_comma);
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Tk_semicolon || _la==EOL) {
						{
						setState(487);
						eol();
						}
					}

					setState(490);
					match(Tk_id);
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(496);
				match(Tk_colon);
				setState(497);
				tipo();
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_semicolon || _la==EOL) {
					{
					setState(498);
					eol();
					setState(499);
					subParamatros();
					}
				}

				}
				break;
			case Tk_ref:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				match(Tk_ref);
				setState(504);
				match(Tk_id);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_comma) {
					{
					{
					setState(505);
					match(Tk_comma);
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
					match(Tk_id);
					}
					}
					setState(514);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(515);
				match(Tk_colon);
				setState(516);
				tipo();
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_semicolon || _la==EOL) {
					{
					setState(517);
					eol();
					setState(518);
					subParamatros();
					}
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_operacionMatematica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(525);
			precedencia1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperacionMatematicaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operacionMatematica);
					setState(527);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(528);
					signo1();
					{
					setState(529);
					precedencia1(0);
					}
					}
					} 
				}
				setState(535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_precedencia1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(537);
			precedencia2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Precedencia1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_precedencia1);
					setState(539);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(540);
					signo2();
					setState(541);
					precedencia2(0);
					}
					} 
				}
				setState(547);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_precedencia2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(549);
			precedencia3();
			}
			_ctx.stop = _input.LT(-1);
			setState(557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Precedencia2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_precedencia2);
					setState(551);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(552);
					signo3();
					setState(553);
					precedencia3();
					}
					} 
				}
				setState(559);
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
		enterRule(_localctx, 72, RULE_precedencia3);
		try {
			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_opar:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				match(Tk_opar);
				setState(561);
				operacionMatematica(0);
				setState(562);
				match(Tk_cpar);
				}
				break;
			case Tk_num:
			case Tk_id:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
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
		enterRule(_localctx, 74, RULE_signo1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
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
		enterRule(_localctx, 76, RULE_signo2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
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
		enterRule(_localctx, 78, RULE_signo3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
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
		enterRule(_localctx, 80, RULE_auxNum);
		try {
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				match(Tk_id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(Tk_num);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
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
		enterRule(_localctx, 82, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			auxLog();
			setState(579);
			relacional();
			setState(580);
			auxLog();
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_and || _la==Tk_or) {
				{
				setState(581);
				condicionAux();
				setState(582);
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
		enterRule(_localctx, 84, RULE_condicionAux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
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
		enterRule(_localctx, 86, RULE_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
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
		enterRule(_localctx, 88, RULE_auxLog);
		try {
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				match(Tk_id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				match(Tk_num);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(592);
				llamada();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(593);
				verdad();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(594);
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
		enterRule(_localctx, 90, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(Tk_id);
			setState(598);
			match(Tk_obracket);
			setState(599);
			operacionMatematica(0);
			setState(600);
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
		enterRule(_localctx, 92, RULE_matriz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(Tk_id);
			setState(603);
			match(Tk_obracket);
			setState(604);
			operacionMatematica(0);
			setState(607); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(605);
				match(Tk_comma);
				setState(606);
				operacionMatematica(0);
				}
				}
				setState(609); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Tk_comma );
			setState(611);
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
		enterRule(_localctx, 94, RULE_eol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
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
		case 33:
			return operacionMatematica_sempred((OperacionMatematicaContext)_localctx, predIndex);
		case 34:
			return precedencia1_sempred((Precedencia1Context)_localctx, predIndex);
		case 35:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u026a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\5\2d\n\2\3\2\5\2g\n\2\3"+
		"\2\5\2j\n\2\3\2\3\2\5\2n\n\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4v\n\4\3\4\3\4"+
		"\5\4z\n\4\3\4\3\4\5\4~\n\4\5\4\u0080\n\4\3\5\3\5\3\5\5\5\u0085\n\5\3\6"+
		"\3\6\3\6\5\6\u008a\n\6\3\6\7\6\u008d\n\6\f\6\16\6\u0090\13\6\3\6\3\6\3"+
		"\6\3\6\5\6\u0096\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a1\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00aa\n\6\r\6\16\6\u00ab\3\6\3\6\3\6"+
		"\3\6\5\6\u00b2\n\6\5\6\u00b4\n\6\3\7\3\7\5\7\u00b8\n\7\3\b\3\b\3\b\3\b"+
		"\5\b\u00be\n\b\3\t\3\t\3\t\5\t\u00c3\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00ca"+
		"\n\n\3\13\3\13\3\13\5\13\u00cf\n\13\3\f\3\f\3\r\3\r\3\r\5\r\u00d6\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00dd\n\16\3\17\3\17\5\17\u00e1\n\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u00eb\n\20\f\20\16\20\u00ee"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0107\n\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u0110\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u011d\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0124\n\25\3\25\3\25\5\25\u0128\n\25\3\25\7\25\u012b\n\25\f\25\16"+
		"\25\u012e\13\25\3\25\7\25\u0131\n\25\f\25\16\25\u0134\13\25\3\25\5\25"+
		"\u0137\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0141\n\26\3"+
		"\26\7\26\u0144\n\26\f\26\16\26\u0147\13\26\3\26\5\26\u014a\n\26\3\27\3"+
		"\27\5\27\u014e\n\27\3\27\7\27\u0151\n\27\f\27\16\27\u0154\13\27\3\27\5"+
		"\27\u0157\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u015e\n\30\3\30\3\30\5\30"+
		"\u0162\n\30\3\30\5\30\u0165\n\30\3\30\3\30\3\31\3\31\5\31\u016b\n\31\3"+
		"\31\5\31\u016e\n\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u0177\n\32"+
		"\3\32\3\32\5\32\u017b\n\32\3\32\3\32\3\32\3\32\7\32\u0181\n\32\f\32\16"+
		"\32\u0184\13\32\3\32\5\32\u0187\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0190\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u019b"+
		"\n\34\3\34\3\34\5\34\u019f\n\34\3\34\3\34\3\34\3\35\3\35\3\35\5\35\u01a7"+
		"\n\35\3\35\3\35\3\35\3\35\7\35\u01ad\n\35\f\35\16\35\u01b0\13\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01bb\n\36\3\37\3\37\3\37"+
		"\3\37\5\37\u01c1\n\37\3\37\3\37\3\37\5\37\u01c6\n\37\3\37\5\37\u01c9\n"+
		"\37\3\37\7\37\u01cc\n\37\f\37\16\37\u01cf\13\37\3\37\5\37\u01d2\n\37\3"+
		"\37\3\37\3 \3 \3 \5 \u01d9\n \3 \5 \u01dc\n \3 \5 \u01df\n \3 \3 \3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\5\"\u01eb\n\"\3\"\7\"\u01ee\n\"\f\"\16\"\u01f1"+
		"\13\"\3\"\3\"\3\"\3\"\3\"\5\"\u01f8\n\"\3\"\3\"\3\"\3\"\5\"\u01fe\n\""+
		"\3\"\7\"\u0201\n\"\f\"\16\"\u0204\13\"\3\"\3\"\3\"\3\"\3\"\5\"\u020b\n"+
		"\"\5\"\u020d\n\"\3#\3#\3#\3#\3#\3#\3#\7#\u0216\n#\f#\16#\u0219\13#\3$"+
		"\3$\3$\3$\3$\3$\3$\7$\u0222\n$\f$\16$\u0225\13$\3%\3%\3%\3%\3%\3%\3%\7"+
		"%\u022e\n%\f%\16%\u0231\13%\3&\3&\3&\3&\3&\5&\u0238\n&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3*\5*\u0243\n*\3+\3+\3+\3+\3+\3+\5+\u024b\n+\3,\3,\3-\3-\3"+
		".\3.\3.\3.\3.\5.\u0256\n.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\6\60"+
		"\u0262\n\60\r\60\16\60\u0263\3\60\3\60\3\61\3\61\3\61\2\5DFH\62\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`\2\b\3\2\r\16\3\2\36\37\3\2 \"\3\2\17\20\3\2$)\4\2,,\67\67\2\u029a"+
		"\2c\3\2\2\2\4o\3\2\2\2\6\177\3\2\2\2\b\u0081\3\2\2\2\n\u00b3\3\2\2\2\f"+
		"\u00b7\3\2\2\2\16\u00bd\3\2\2\2\20\u00bf\3\2\2\2\22\u00c4\3\2\2\2\24\u00ce"+
		"\3\2\2\2\26\u00d0\3\2\2\2\30\u00d2\3\2\2\2\32\u00d7\3\2\2\2\34\u00de\3"+
		"\2\2\2\36\u00e7\3\2\2\2 \u0106\3\2\2\2\"\u0108\3\2\2\2$\u010f\3\2\2\2"+
		"&\u011c\3\2\2\2(\u011e\3\2\2\2*\u013a\3\2\2\2,\u014b\3\2\2\2.\u0158\3"+
		"\2\2\2\60\u0168\3\2\2\2\62\u0174\3\2\2\2\64\u018a\3\2\2\2\66\u0193\3\2"+
		"\2\28\u01a3\3\2\2\2:\u01ba\3\2\2\2<\u01bc\3\2\2\2>\u01d5\3\2\2\2@\u01e2"+
		"\3\2\2\2B\u020c\3\2\2\2D\u020e\3\2\2\2F\u021a\3\2\2\2H\u0226\3\2\2\2J"+
		"\u0237\3\2\2\2L\u0239\3\2\2\2N\u023b\3\2\2\2P\u023d\3\2\2\2R\u0242\3\2"+
		"\2\2T\u0244\3\2\2\2V\u024c\3\2\2\2X\u024e\3\2\2\2Z\u0255\3\2\2\2\\\u0257"+
		"\3\2\2\2^\u025c\3\2\2\2`\u0267\3\2\2\2bd\5`\61\2cb\3\2\2\2cd\3\2\2\2d"+
		"f\3\2\2\2eg\5\4\3\2fe\3\2\2\2fg\3\2\2\2gi\3\2\2\2hj\5\6\4\2ih\3\2\2\2"+
		"ij\3\2\2\2jk\3\2\2\2km\5\36\20\2ln\5<\37\2ml\3\2\2\2mn\3\2\2\2n\3\3\2"+
		"\2\2op\7\b\2\2pq\7\66\2\2qr\5`\61\2r\5\3\2\2\2su\5\b\5\2tv\5\6\4\2ut\3"+
		"\2\2\2uv\3\2\2\2v\u0080\3\2\2\2wy\5\20\t\2xz\5\6\4\2yx\3\2\2\2yz\3\2\2"+
		"\2z\u0080\3\2\2\2{}\5\30\r\2|~\5\6\4\2}|\3\2\2\2}~\3\2\2\2~\u0080\3\2"+
		"\2\2\177s\3\2\2\2\177w\3\2\2\2\177{\3\2\2\2\u0080\7\3\2\2\2\u0081\u0082"+
		"\7\5\2\2\u0082\u0084\5`\61\2\u0083\u0085\5\n\6\2\u0084\u0083\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\t\3\2\2\2\u0086\u008e\7\66\2\2\u0087\u0089\7*\2\2"+
		"\u0088\u008a\5`\61\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008d\7\66\2\2\u008c\u0087\3\2\2\2\u008d\u0090\3\2\2\2"+
		"\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0091\u0092\7+\2\2\u0092\u0093\5\16\b\2\u0093\u0095\5`\61\2\u0094"+
		"\u0096\5\n\6\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u00b4\3\2"+
		"\2\2\u0097\u0098\7\66\2\2\u0098\u0099\7+\2\2\u0099\u009a\7\34\2\2\u009a"+
		"\u009b\7\62\2\2\u009b\u009c\5\f\7\2\u009c\u009d\7\63\2\2\u009d\u009e\5"+
		"\16\b\2\u009e\u00a0\5`\61\2\u009f\u00a1\5\n\6\2\u00a0\u009f\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00b4\3\2\2\2\u00a2\u00a3\7\66\2\2\u00a3\u00a4\7"+
		"+\2\2\u00a4\u00a5\7\35\2\2\u00a5\u00a6\7\62\2\2\u00a6\u00a9\5\f\7\2\u00a7"+
		"\u00a8\7*\2\2\u00a8\u00aa\5\f\7\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\7\63\2\2\u00ae\u00af\5\16\b\2\u00af\u00b1\5`\61\2\u00b0\u00b2\5"+
		"\n\6\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u0086\3\2\2\2\u00b3\u0097\3\2\2\2\u00b3\u00a2\3\2\2\2\u00b4\13\3\2\2"+
		"\2\u00b5\u00b8\7!\2\2\u00b6\u00b8\5D#\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6"+
		"\3\2\2\2\u00b8\r\3\2\2\2\u00b9\u00be\7\t\2\2\u00ba\u00be\7\n\2\2\u00bb"+
		"\u00be\7\13\2\2\u00bc\u00be\5\34\17\2\u00bd\u00b9\3\2\2\2\u00bd\u00ba"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\17\3\2\2\2\u00bf"+
		"\u00c0\7\6\2\2\u00c0\u00c2\5`\61\2\u00c1\u00c3\5\22\n\2\u00c2\u00c1\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\21\3\2\2\2\u00c4\u00c5\7\66\2\2\u00c5"+
		"\u00c6\7-\2\2\u00c6\u00c7\5\24\13\2\u00c7\u00c9\5`\61\2\u00c8\u00ca\5"+
		"\22\n\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\23\3\2\2\2\u00cb"+
		"\u00cf\5D#\2\u00cc\u00cf\5\26\f\2\u00cd\u00cf\7\65\2\2\u00ce\u00cb\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\25\3\2\2\2\u00d0\u00d1"+
		"\t\2\2\2\u00d1\27\3\2\2\2\u00d2\u00d3\7\7\2\2\u00d3\u00d5\5`\61\2\u00d4"+
		"\u00d6\5\32\16\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\31\3\2"+
		"\2\2\u00d7\u00d8\7\66\2\2\u00d8\u00d9\7+\2\2\u00d9\u00da\5\16\b\2\u00da"+
		"\u00dc\5`\61\2\u00db\u00dd\5\32\16\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3"+
		"\2\2\2\u00dd\33\3\2\2\2\u00de\u00e0\7\f\2\2\u00df\u00e1\5`\61\2\u00e0"+
		"\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7."+
		"\2\2\u00e3\u00e4\5`\61\2\u00e4\u00e5\5\n\6\2\u00e5\u00e6\7/\2\2\u00e6"+
		"\35\3\2\2\2\u00e7\u00e8\7\3\2\2\u00e8\u00ec\5`\61\2\u00e9\u00eb\5 \21"+
		"\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\4\2\2\u00f0"+
		"\37\3\2\2\2\u00f1\u00f2\5\"\22\2\u00f2\u00f3\5`\61\2\u00f3\u0107\3\2\2"+
		"\2\u00f4\u00f5\5(\25\2\u00f5\u00f6\5`\61\2\u00f6\u0107\3\2\2\2\u00f7\u00f8"+
		"\5.\30\2\u00f8\u00f9\5`\61\2\u00f9\u0107\3\2\2\2\u00fa\u00fb\5\60\31\2"+
		"\u00fb\u00fc\5`\61\2\u00fc\u0107\3\2\2\2\u00fd\u00fe\5\62\32\2\u00fe\u00ff"+
		"\5`\61\2\u00ff\u0107\3\2\2\2\u0100\u0101\5\66\34\2\u0101\u0102\5`\61\2"+
		"\u0102\u0107\3\2\2\2\u0103\u0104\58\35\2\u0104\u0105\5`\61\2\u0105\u0107"+
		"\3\2\2\2\u0106\u00f1\3\2\2\2\u0106\u00f4\3\2\2\2\u0106\u00f7\3\2\2\2\u0106"+
		"\u00fa\3\2\2\2\u0106\u00fd\3\2\2\2\u0106\u0100\3\2\2\2\u0106\u0103\3\2"+
		"\2\2\u0107!\3\2\2\2\u0108\u0109\7\66\2\2\u0109\u010a\7-\2\2\u010a\u010b"+
		"\5$\23\2\u010b#\3\2\2\2\u010c\u0110\58\35\2\u010d\u0110\5\24\13\2\u010e"+
		"\u0110\5&\24\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2"+
		"\2\2\u0110%\3\2\2\2\u0111\u0112\7.\2\2\u0112\u0113\5\24\13\2\u0113\u0114"+
		"\7*\2\2\u0114\u0115\5\24\13\2\u0115\u0116\3\2\2\2\u0116\u0117\7/\2\2\u0117"+
		"\u011d\3\2\2\2\u0118\u0119\7.\2\2\u0119\u011a\5\24\13\2\u011a\u011b\7"+
		"/\2\2\u011b\u011d\3\2\2\2\u011c\u0111\3\2\2\2\u011c\u0118\3\2\2\2\u011d"+
		"\'\3\2\2\2\u011e\u011f\7\27\2\2\u011f\u0120\7\60\2\2\u0120\u0121\5T+\2"+
		"\u0121\u0123\7\61\2\2\u0122\u0124\5`\61\2\u0123\u0122\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\7.\2\2\u0126\u0128\5`\61\2\u0127"+
		"\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012c\3\2\2\2\u0129\u012b\5 "+
		"\21\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u0132\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\5*"+
		"\26\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0137\5,"+
		"\27\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0139\7/\2\2\u0139)\3\2\2\2\u013a\u013b\7\30\2\2\u013b\u013c\7\27\2\2"+
		"\u013c\u013d\7\60\2\2\u013d\u013e\5T+\2\u013e\u0140\7\61\2\2\u013f\u0141"+
		"\5`\61\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0145\3\2\2\2\u0142"+
		"\u0144\5 \21\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u014a\5`\61\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a+\3\2\2\2"+
		"\u014b\u014d\7\30\2\2\u014c\u014e\5`\61\2\u014d\u014c\3\2\2\2\u014d\u014e"+
		"\3\2\2\2\u014e\u0152\3\2\2\2\u014f\u0151\5 \21\2\u0150\u014f\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0155\u0157\5`\61\2\u0156\u0155\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157-\3\2\2\2\u0158\u0159\7\21\2\2\u0159\u015a\7\60\2"+
		"\2\u015a\u015b\5T+\2\u015b\u015d\7\61\2\2\u015c\u015e\5`\61\2\u015d\u015c"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\7.\2\2\u0160"+
		"\u0162\5`\61\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2"+
		"\2\2\u0163\u0165\5 \21\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\7/\2\2\u0167/\3\2\2\2\u0168\u016a\7\22\2\2"+
		"\u0169\u016b\5`\61\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d"+
		"\3\2\2\2\u016c\u016e\5 \21\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\7\23\2\2\u0170\u0171\7\60\2\2\u0171\u0172\5"+
		"T+\2\u0172\u0173\7\61\2\2\u0173\61\3\2\2\2\u0174\u0176\7\24\2\2\u0175"+
		"\u0177\5`\61\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u017a\7.\2\2\u0179\u017b\5`\61\2\u017a\u0179\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\7\60\2\2\u017d\u017e\5"+
		"T+\2\u017e\u0182\7\61\2\2\u017f\u0181\5\64\33\2\u0180\u017f\3\2\2\2\u0181"+
		"\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0186\3\2"+
		"\2\2\u0184\u0182\3\2\2\2\u0185\u0187\5,\27\2\u0186\u0185\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\7/\2\2\u0189\63\3\2\2\2"+
		"\u018a\u018b\7\25\2\2\u018b\u018c\7\60\2\2\u018c\u018d\5T+\2\u018d\u018f"+
		"\7\61\2\2\u018e\u0190\5`\61\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2"+
		"\u0190\u0191\3\2\2\2\u0191\u0192\5 \21\2\u0192\65\3\2\2\2\u0193\u0194"+
		"\7\26\2\2\u0194\u0195\7\66\2\2\u0195\u0196\7-\2\2\u0196\u0197\5D#\2\u0197"+
		"\u0198\7\23\2\2\u0198\u019a\5D#\2\u0199\u019b\5`\61\2\u019a\u0199\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\7.\2\2\u019d"+
		"\u019f\5`\61\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01a1\5 \21\2\u01a1\u01a2\7/\2\2\u01a2\67\3\2\2\2\u01a3\u01a4"+
		"\7\66\2\2\u01a4\u01a6\7\60\2\2\u01a5\u01a7\5:\36\2\u01a6\u01a5\3\2\2\2"+
		"\u01a6\u01a7\3\2\2\2\u01a7\u01ae\3\2\2\2\u01a8\u01a9\5:\36\2\u01a9\u01aa"+
		"\7*\2\2\u01aa\u01ab\5:\36\2\u01ab\u01ad\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ad"+
		"\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2"+
		"\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\7\61\2\2\u01b29\3\2\2\2\u01b3\u01bb"+
		"\7\64\2\2\u01b4\u01bb\7\65\2\2\u01b5\u01bb\58\35\2\u01b6\u01bb\5D#\2\u01b7"+
		"\u01bb\5T+\2\u01b8\u01bb\5\\/\2\u01b9\u01bb\5^\60\2\u01ba\u01b3\3\2\2"+
		"\2\u01ba\u01b4\3\2\2\2\u01ba\u01b5\3\2\2\2\u01ba\u01b6\3\2\2\2\u01ba\u01b7"+
		"\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb;\3\2\2\2\u01bc"+
		"\u01bd\7\31\2\2\u01bd\u01be\7\66\2\2\u01be\u01c0\7\60\2\2\u01bf\u01c1"+
		"\5B\"\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c5\7\61\2\2\u01c3\u01c4\7\32\2\2\u01c4\u01c6\5\16\b\2\u01c5\u01c3"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c9\5`\61\2\u01c8"+
		"\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cd\3\2\2\2\u01ca\u01cc\5\6"+
		"\4\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d2\5`"+
		"\61\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d4\5> \2\u01d4=\3\2\2\2\u01d5\u01d6\7\3\2\2\u01d6\u01d8\5`\61\2\u01d7"+
		"\u01d9\5 \21\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2"+
		"\2\2\u01da\u01dc\5@!\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de"+
		"\3\2\2\2\u01dd\u01df\5`\61\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e1\7\4\2\2\u01e1?\3\2\2\2\u01e2\u01e3\7\32\2\2"+
		"\u01e3\u01e4\7\60\2\2\u01e4\u01e5\7\66\2\2\u01e5\u01e6\7\61\2\2\u01e6"+
		"A\3\2\2\2\u01e7\u01ef\7\66\2\2\u01e8\u01ea\7*\2\2\u01e9\u01eb\5`\61\2"+
		"\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee"+
		"\7\66\2\2\u01ed\u01e8\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2"+
		"\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3"+
		"\7+\2\2\u01f3\u01f7\5\16\b\2\u01f4\u01f5\5`\61\2\u01f5\u01f6\5B\"\2\u01f6"+
		"\u01f8\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u020d\3\2"+
		"\2\2\u01f9\u01fa\7\33\2\2\u01fa\u0202\7\66\2\2\u01fb\u01fd\7*\2\2\u01fc"+
		"\u01fe\5`\61\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2"+
		"\2\2\u01ff\u0201\7\66\2\2\u0200\u01fb\3\2\2\2\u0201\u0204\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2"+
		"\2\2\u0205\u0206\7+\2\2\u0206\u020a\5\16\b\2\u0207\u0208\5`\61\2\u0208"+
		"\u0209\5B\"\2\u0209\u020b\3\2\2\2\u020a\u0207\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u020d\3\2\2\2\u020c\u01e7\3\2\2\2\u020c\u01f9\3\2\2\2\u020d"+
		"C\3\2\2\2\u020e\u020f\b#\1\2\u020f\u0210\5F$\2\u0210\u0217\3\2\2\2\u0211"+
		"\u0212\f\4\2\2\u0212\u0213\5L\'\2\u0213\u0214\5F$\2\u0214\u0216\3\2\2"+
		"\2\u0215\u0211\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218E\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021b\b$\1\2\u021b\u021c"+
		"\5H%\2\u021c\u0223\3\2\2\2\u021d\u021e\f\4\2\2\u021e\u021f\5N(\2\u021f"+
		"\u0220\5H%\2\u0220\u0222\3\2\2\2\u0221\u021d\3\2\2\2\u0222\u0225\3\2\2"+
		"\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224G\3\2\2\2\u0225\u0223"+
		"\3\2\2\2\u0226\u0227\b%\1\2\u0227\u0228\5J&\2\u0228\u022f\3\2\2\2\u0229"+
		"\u022a\f\4\2\2\u022a\u022b\5P)\2\u022b\u022c\5J&\2\u022c\u022e\3\2\2\2"+
		"\u022d\u0229\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230"+
		"\3\2\2\2\u0230I\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0233\7\60\2\2\u0233"+
		"\u0234\5D#\2\u0234\u0235\7\61\2\2\u0235\u0238\3\2\2\2\u0236\u0238\5R*"+
		"\2\u0237\u0232\3\2\2\2\u0237\u0236\3\2\2\2\u0238K\3\2\2\2\u0239\u023a"+
		"\t\3\2\2\u023aM\3\2\2\2\u023b\u023c\t\4\2\2\u023cO\3\2\2\2\u023d\u023e"+
		"\7#\2\2\u023eQ\3\2\2\2\u023f\u0243\7\66\2\2\u0240\u0243\7\64\2\2\u0241"+
		"\u0243\58\35\2\u0242\u023f\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0241\3\2"+
		"\2\2\u0243S\3\2\2\2\u0244\u0245\5Z.\2\u0245\u0246\5X-\2\u0246\u024a\5"+
		"Z.\2\u0247\u0248\5V,\2\u0248\u0249\5T+\2\u0249\u024b\3\2\2\2\u024a\u0247"+
		"\3\2\2\2\u024a\u024b\3\2\2\2\u024bU\3\2\2\2\u024c\u024d\t\5\2\2\u024d"+
		"W\3\2\2\2\u024e\u024f\t\6\2\2\u024fY\3\2\2\2\u0250\u0256\7\66\2\2\u0251"+
		"\u0256\7\64\2\2\u0252\u0256\58\35\2\u0253\u0256\5\26\f\2\u0254\u0256\7"+
		"\65\2\2\u0255\u0250\3\2\2\2\u0255\u0251\3\2\2\2\u0255\u0252\3\2\2\2\u0255"+
		"\u0253\3\2\2\2\u0255\u0254\3\2\2\2\u0256[\3\2\2\2\u0257\u0258\7\66\2\2"+
		"\u0258\u0259\7\62\2\2\u0259\u025a\5D#\2\u025a\u025b\7\63\2\2\u025b]\3"+
		"\2\2\2\u025c\u025d\7\66\2\2\u025d\u025e\7\62\2\2\u025e\u0261\5D#\2\u025f"+
		"\u0260\7*\2\2\u0260\u0262\5D#\2\u0261\u025f\3\2\2\2\u0262\u0263\3\2\2"+
		"\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266"+
		"\7\63\2\2\u0266_\3\2\2\2\u0267\u0268\t\7\2\2\u0268a\3\2\2\2Ocfimuy}\177"+
		"\u0084\u0089\u008e\u0095\u00a0\u00ab\u00b1\u00b3\u00b7\u00bd\u00c2\u00c9"+
		"\u00ce\u00d5\u00dc\u00e0\u00ec\u0106\u010f\u011c\u0123\u0127\u012c\u0132"+
		"\u0136\u0140\u0145\u0149\u014d\u0152\u0156\u015d\u0161\u0164\u016a\u016d"+
		"\u0176\u017a\u0182\u0186\u018f\u019a\u019e\u01a6\u01ae\u01ba\u01c0\u01c5"+
		"\u01c8\u01cd\u01d1\u01d8\u01db\u01de\u01ea\u01ef\u01f7\u01fd\u0202\u020a"+
		"\u020c\u0217\u0223\u022f\u0237\u0242\u024a\u0255\u0263";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}