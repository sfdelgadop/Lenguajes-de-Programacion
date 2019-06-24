// Generated from /home/sebastian/IdeaProjects/traductorSLtoC/grammar/Gramatica.g4 by ANTLR 4.7.2
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
		RULE_llamada = 27, RULE_tiposLLamada = 28, RULE_subRutinas = 29, RULE_subParamatros = 30, 
		RULE_operacionMatematica = 31, RULE_precedencia1 = 32, RULE_precedencia2 = 33, 
		RULE_precedencia3 = 34, RULE_signo1 = 35, RULE_signo2 = 36, RULE_signo3 = 37, 
		RULE_auxNum = 38, RULE_condicion = 39, RULE_condicionAux = 40, RULE_relacional = 41, 
		RULE_auxLog = 42, RULE_vector = 43, RULE_matriz = 44, RULE_eol = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "programa", "declaraciones", "variables", "variables_aux", "vectorAux", 
			"tipo", "constants", "constants_aux", "valor", "verdad", "types", "types_aux", 
			"registro", "cuerpo", "sentencias", "asignacion", "asignacionAux", "estruct", 
			"condicional", "condicionSinoSi", "condicionSino", "cicloMientras", "cicloRepetir", 
			"eval", "evalAux", "desde", "llamada", "tiposLLamada", "subRutinas", 
			"subParamatros", "operacionMatematica", "precedencia1", "precedencia2", 
			"precedencia3", "signo1", "signo2", "signo3", "auxNum", "condicion", 
			"condicionAux", "relacional", "auxLog", "vector", "matriz", "eol"
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
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(92);
				eol();
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_programa) {
				{
				setState(95);
				programa();
				}
			}

			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_var) | (1L << Tk_cons) | (1L << Tk_tipos))) != 0)) {
				{
				setState(98);
				declaraciones();
				}
			}

			setState(101);
			cuerpo();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_subrutina) {
				{
				setState(102);
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
			setState(105);
			match(Tk_programa);
			setState(106);
			match(Tk_id);
			setState(107);
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
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_var:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				variables();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_var) | (1L << Tk_cons) | (1L << Tk_tipos))) != 0)) {
					{
					setState(110);
					declaraciones();
					}
				}

				}
				break;
			case Tk_cons:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				constants();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_var) | (1L << Tk_cons) | (1L << Tk_tipos))) != 0)) {
					{
					setState(114);
					declaraciones();
					}
				}

				}
				break;
			case Tk_tipos:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				types();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_var) | (1L << Tk_cons) | (1L << Tk_tipos))) != 0)) {
					{
					setState(118);
					declaraciones();
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
			setState(123);
			match(Tk_var);
			setState(124);
			eol();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(125);
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
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(Tk_id);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_comma) {
					{
					{
					setState(129);
					match(Tk_comma);
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Tk_semicolon || _la==EOL) {
						{
						setState(130);
						eol();
						}
					}

					setState(133);
					match(Tk_id);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(Tk_colon);
				setState(140);
				tipo();
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(Tk_id);
				setState(146);
				match(Tk_colon);
				setState(147);
				match(Tk_vector);
				setState(148);
				match(Tk_obracket);
				setState(149);
				vectorAux();
				setState(150);
				match(Tk_cbracket);
				setState(151);
				tipo();
				setState(152);
				eol();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_id) {
					{
					setState(153);
					variables_aux();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(Tk_id);
				setState(157);
				match(Tk_colon);
				setState(158);
				match(Tk_matriz);
				setState(159);
				match(Tk_obracket);
				setState(160);
				vectorAux();
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161);
					match(Tk_comma);
					setState(162);
					vectorAux();
					}
					}
					setState(165); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Tk_comma );
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
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_mult:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(Tk_mult);
				}
				break;
			case Tk_opar:
			case Tk_num:
			case Tk_id:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
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
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_numerico:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(Tk_numerico);
				}
				break;
			case Tk_logico:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(Tk_logico);
				}
				break;
			case Tk_cadena:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(Tk_cadena);
				}
				break;
			case Tk_registro:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
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
			setState(185);
			match(Tk_cons);
			setState(186);
			eol();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(187);
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
			setState(190);
			match(Tk_id);
			setState(191);
			match(Tk_assig);
			setState(192);
			valor();
			setState(193);
			eol();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(194);
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
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_opar:
			case Tk_num:
			case Tk_id:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				operacionMatematica(0);
				}
				break;
			case Tk_true:
			case Tk_false:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				verdad();
				}
				break;
			case Tk_str:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
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
			setState(202);
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
			setState(204);
			match(Tk_tipos);
			setState(205);
			eol();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(206);
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
			setState(209);
			match(Tk_id);
			setState(210);
			match(Tk_colon);
			setState(211);
			tipo();
			setState(212);
			eol();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_id) {
				{
				setState(213);
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
			setState(216);
			match(Tk_registro);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(217);
				eol();
				}
			}

			setState(220);
			match(Tk_okey);
			setState(221);
			eol();
			setState(222);
			variables_aux();
			setState(223);
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
			setState(225);
			match(Tk_inicio);
			setState(226);
			eol();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(227);
				sentencias();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
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
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				asignacion();
				setState(236);
				eol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				condicional();
				setState(239);
				eol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				cicloMientras();
				setState(242);
				eol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				cicloRepetir();
				setState(245);
				eol();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(247);
				eval();
				setState(248);
				eol();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				desde();
				setState(251);
				eol();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				llamada();
				setState(254);
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
			setState(258);
			match(Tk_id);
			setState(259);
			match(Tk_assig);
			setState(260);
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				llamada();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
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
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(Tk_okey);
				setState(268);
				valor();
				{
				setState(269);
				match(Tk_comma);
				setState(270);
				valor();
				}
				setState(272);
				match(Tk_ckey);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(Tk_okey);
				setState(275);
				valor();
				setState(276);
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
			setState(280);
			match(Tk_si);
			setState(281);
			match(Tk_opar);
			setState(282);
			condicion();
			setState(283);
			match(Tk_cpar);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(284);
				eol();
				}
			}

			setState(287);
			match(Tk_okey);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(288);
				eol();
				}
			}

			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(291);
				sentencias();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					condicionSinoSi();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_sino) {
				{
				setState(303);
				condicionSino();
				}
			}

			setState(306);
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
			setState(308);
			match(Tk_sino);
			setState(309);
			match(Tk_si);
			setState(310);
			match(Tk_opar);
			setState(311);
			condicion();
			setState(312);
			match(Tk_cpar);
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(313);
				eol();
				}
				break;
			}
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(316);
				sentencias();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(322);
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
			setState(325);
			match(Tk_sino);
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(326);
				eol();
				}
				break;
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
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(335);
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
			setState(338);
			match(Tk_mientras);
			setState(339);
			match(Tk_opar);
			setState(340);
			condicion();
			setState(341);
			match(Tk_cpar);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(342);
				eol();
				}
			}

			setState(345);
			match(Tk_okey);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(346);
				eol();
				}
			}

			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				setState(349);
				sentencias();
				}
			}

			setState(352);
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
			setState(354);
			match(Tk_repetir);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(355);
				eol();
				}
			}

			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				setState(358);
				sentencias();
				}
			}

			setState(361);
			match(Tk_hasta);
			setState(362);
			match(Tk_opar);
			setState(363);
			condicion();
			setState(364);
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
			setState(366);
			match(Tk_eval);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(367);
				eol();
				}
			}

			setState(370);
			match(Tk_okey);
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
			match(Tk_opar);
			setState(375);
			condicion();
			setState(376);
			match(Tk_cpar);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_caso) {
				{
				{
				setState(377);
				evalAux();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_sino) {
				{
				setState(383);
				condicionSino();
				}
			}

			setState(386);
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
			setState(388);
			match(Tk_caso);
			setState(389);
			match(Tk_opar);
			setState(390);
			condicion();
			setState(391);
			match(Tk_cpar);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(392);
				eol();
				}
			}

			setState(395);
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
			setState(397);
			match(Tk_desde);
			setState(398);
			match(Tk_id);
			setState(399);
			match(Tk_assig);
			setState(400);
			operacionMatematica(0);
			setState(401);
			match(Tk_hasta);
			setState(402);
			operacionMatematica(0);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(403);
				eol();
				}
			}

			setState(406);
			match(Tk_okey);
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
			sentencias();
			setState(411);
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
			setState(413);
			match(Tk_id);
			setState(414);
			match(Tk_opar);
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(415);
				tiposLLamada();
				}
				break;
			}
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_true) | (1L << Tk_false) | (1L << Tk_opar) | (1L << Tk_num) | (1L << Tk_str) | (1L << Tk_id))) != 0)) {
				{
				{
				setState(418);
				tiposLLamada();
				setState(419);
				match(Tk_comma);
				setState(420);
				tiposLLamada();
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(427);
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
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(Tk_num);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(Tk_str);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				llamada();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				operacionMatematica(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(433);
				condicion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(434);
				vector();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(435);
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
		public List<TerminalNode> Tk_id() { return getTokens(GramaticaParser.Tk_id); }
		public TerminalNode Tk_id(int i) {
			return getToken(GramaticaParser.Tk_id, i);
		}
		public List<TerminalNode> Tk_opar() { return getTokens(GramaticaParser.Tk_opar); }
		public TerminalNode Tk_opar(int i) {
			return getToken(GramaticaParser.Tk_opar, i);
		}
		public List<TerminalNode> Tk_cpar() { return getTokens(GramaticaParser.Tk_cpar); }
		public TerminalNode Tk_cpar(int i) {
			return getToken(GramaticaParser.Tk_cpar, i);
		}
		public TerminalNode Tk_inicio() { return getToken(GramaticaParser.Tk_inicio, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TerminalNode Tk_fin() { return getToken(GramaticaParser.Tk_fin, 0); }
		public SubParamatrosContext subParamatros() {
			return getRuleContext(SubParamatrosContext.class,0);
		}
		public List<TerminalNode> Tk_retorna() { return getTokens(GramaticaParser.Tk_retorna); }
		public TerminalNode Tk_retorna(int i) {
			return getToken(GramaticaParser.Tk_retorna, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
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
			setState(438);
			match(Tk_subrutina);
			setState(439);
			match(Tk_id);
			setState(440);
			match(Tk_opar);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_ref || _la==Tk_id) {
				{
				setState(441);
				subParamatros();
				}
			}

			setState(444);
			match(Tk_cpar);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_retorna) {
				{
				setState(445);
				match(Tk_retorna);
				setState(446);
				tipo();
				}
			}

			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(449);
				eol();
				}
				break;
			}
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_var) | (1L << Tk_cons) | (1L << Tk_tipos))) != 0)) {
				{
				setState(452);
				declaraciones();
				}
			}

			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(455);
				eol();
				}
			}

			setState(458);
			match(Tk_inicio);
			setState(459);
			eol();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mientras) | (1L << Tk_repetir) | (1L << Tk_eval) | (1L << Tk_desde) | (1L << Tk_si) | (1L << Tk_id))) != 0)) {
				{
				setState(460);
				sentencias();
				}
			}

			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_retorna) {
				{
				setState(463);
				match(Tk_retorna);
				setState(464);
				match(Tk_opar);
				setState(465);
				match(Tk_id);
				setState(466);
				match(Tk_cpar);
				}
			}

			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_semicolon || _la==EOL) {
				{
				setState(469);
				eol();
				}
			}

			setState(472);
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
		enterRule(_localctx, 60, RULE_subParamatros);
		int _la;
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_id:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				match(Tk_id);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_comma) {
					{
					{
					setState(475);
					match(Tk_comma);
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Tk_semicolon || _la==EOL) {
						{
						setState(476);
						eol();
						}
					}

					setState(479);
					match(Tk_id);
					}
					}
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(485);
				match(Tk_colon);
				setState(486);
				tipo();
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_semicolon || _la==EOL) {
					{
					setState(487);
					eol();
					setState(488);
					subParamatros();
					}
				}

				}
				break;
			case Tk_ref:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(Tk_ref);
				setState(493);
				match(Tk_id);
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tk_comma) {
					{
					{
					setState(494);
					match(Tk_comma);
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Tk_semicolon || _la==EOL) {
						{
						setState(495);
						eol();
						}
					}

					setState(498);
					match(Tk_id);
					}
					}
					setState(503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(504);
				match(Tk_colon);
				setState(505);
				tipo();
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_semicolon || _la==EOL) {
					{
					setState(506);
					eol();
					setState(507);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_operacionMatematica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(514);
			precedencia1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(522);
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
					setState(516);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(517);
					signo1();
					{
					setState(518);
					precedencia1(0);
					}
					}
					} 
				}
				setState(524);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_precedencia1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(526);
			precedencia2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(534);
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
					setState(528);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(529);
					signo2();
					setState(530);
					precedencia2(0);
					}
					} 
				}
				setState(536);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_precedencia2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(538);
			precedencia3();
			}
			_ctx.stop = _input.LT(-1);
			setState(546);
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
					setState(540);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(541);
					signo3();
					setState(542);
					precedencia3();
					}
					} 
				}
				setState(548);
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
		enterRule(_localctx, 68, RULE_precedencia3);
		try {
			setState(554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_opar:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(Tk_opar);
				setState(550);
				operacionMatematica(0);
				setState(551);
				match(Tk_cpar);
				}
				break;
			case Tk_num:
			case Tk_id:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
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
		enterRule(_localctx, 70, RULE_signo1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
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
		enterRule(_localctx, 72, RULE_signo2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
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
		enterRule(_localctx, 74, RULE_signo3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
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
		enterRule(_localctx, 76, RULE_auxNum);
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				match(Tk_id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				match(Tk_num);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(564);
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
		enterRule(_localctx, 78, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			auxLog();
			setState(568);
			relacional();
			setState(569);
			auxLog();
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_and || _la==Tk_or) {
				{
				setState(570);
				condicionAux();
				setState(571);
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
		enterRule(_localctx, 80, RULE_condicionAux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
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
		enterRule(_localctx, 82, RULE_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
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
		enterRule(_localctx, 84, RULE_auxLog);
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(Tk_id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				match(Tk_num);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				llamada();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(582);
				verdad();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(583);
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
		enterRule(_localctx, 86, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(Tk_id);
			setState(587);
			match(Tk_obracket);
			setState(588);
			operacionMatematica(0);
			setState(589);
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
		enterRule(_localctx, 88, RULE_matriz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(Tk_id);
			setState(592);
			match(Tk_obracket);
			setState(593);
			operacionMatematica(0);
			setState(596); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(594);
				match(Tk_comma);
				setState(595);
				operacionMatematica(0);
				}
				}
				setState(598); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Tk_comma );
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
		enterRule(_localctx, 90, RULE_eol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
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
		case 31:
			return operacionMatematica_sempred((OperacionMatematicaContext)_localctx, predIndex);
		case 32:
			return precedencia1_sempred((Precedencia1Context)_localctx, predIndex);
		case 33:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u025f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\5\2`\n\2\3\2\5\2c\n\2\3\2\5\2f\n\2\3\2\3\2"+
		"\5\2j\n\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4r\n\4\3\4\3\4\5\4v\n\4\3\4\3\4\5"+
		"\4z\n\4\5\4|\n\4\3\5\3\5\3\5\5\5\u0081\n\5\3\6\3\6\3\6\5\6\u0086\n\6\3"+
		"\6\7\6\u0089\n\6\f\6\16\6\u008c\13\6\3\6\3\6\3\6\3\6\5\6\u0092\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009d\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\6\6\u00a6\n\6\r\6\16\6\u00a7\3\6\3\6\3\6\3\6\5\6\u00ae\n\6\5\6\u00b0"+
		"\n\6\3\7\3\7\5\7\u00b4\n\7\3\b\3\b\3\b\3\b\5\b\u00ba\n\b\3\t\3\t\3\t\5"+
		"\t\u00bf\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00c6\n\n\3\13\3\13\3\13\5\13\u00cb"+
		"\n\13\3\f\3\f\3\r\3\r\3\r\5\r\u00d2\n\r\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00d9\n\16\3\17\3\17\5\17\u00dd\n\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\7\20\u00e7\n\20\f\20\16\20\u00ea\13\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u0103\n\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\5\23\u010c\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0119\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0120\n\25\3\25\3"+
		"\25\5\25\u0124\n\25\3\25\7\25\u0127\n\25\f\25\16\25\u012a\13\25\3\25\7"+
		"\25\u012d\n\25\f\25\16\25\u0130\13\25\3\25\5\25\u0133\n\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u013d\n\26\3\26\7\26\u0140\n\26\f\26"+
		"\16\26\u0143\13\26\3\26\5\26\u0146\n\26\3\27\3\27\5\27\u014a\n\27\3\27"+
		"\7\27\u014d\n\27\f\27\16\27\u0150\13\27\3\27\5\27\u0153\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u015a\n\30\3\30\3\30\5\30\u015e\n\30\3\30\5\30\u0161"+
		"\n\30\3\30\3\30\3\31\3\31\5\31\u0167\n\31\3\31\5\31\u016a\n\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\5\32\u0173\n\32\3\32\3\32\5\32\u0177\n\32"+
		"\3\32\3\32\3\32\3\32\7\32\u017d\n\32\f\32\16\32\u0180\13\32\3\32\5\32"+
		"\u0183\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u018c\n\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0197\n\34\3\34\3\34\5\34"+
		"\u019b\n\34\3\34\3\34\3\34\3\35\3\35\3\35\5\35\u01a3\n\35\3\35\3\35\3"+
		"\35\3\35\7\35\u01a9\n\35\f\35\16\35\u01ac\13\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u01b7\n\36\3\37\3\37\3\37\3\37\5\37\u01bd"+
		"\n\37\3\37\3\37\3\37\5\37\u01c2\n\37\3\37\5\37\u01c5\n\37\3\37\5\37\u01c8"+
		"\n\37\3\37\5\37\u01cb\n\37\3\37\3\37\3\37\5\37\u01d0\n\37\3\37\3\37\3"+
		"\37\3\37\5\37\u01d6\n\37\3\37\5\37\u01d9\n\37\3\37\3\37\3 \3 \3 \5 \u01e0"+
		"\n \3 \7 \u01e3\n \f \16 \u01e6\13 \3 \3 \3 \3 \3 \5 \u01ed\n \3 \3 \3"+
		" \3 \5 \u01f3\n \3 \7 \u01f6\n \f \16 \u01f9\13 \3 \3 \3 \3 \3 \5 \u0200"+
		"\n \5 \u0202\n \3!\3!\3!\3!\3!\3!\3!\7!\u020b\n!\f!\16!\u020e\13!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0217\n\"\f\"\16\"\u021a\13\"\3#\3#\3#\3"+
		"#\3#\3#\3#\7#\u0223\n#\f#\16#\u0226\13#\3$\3$\3$\3$\3$\5$\u022d\n$\3%"+
		"\3%\3&\3&\3\'\3\'\3(\3(\3(\5(\u0238\n(\3)\3)\3)\3)\3)\3)\5)\u0240\n)\3"+
		"*\3*\3+\3+\3,\3,\3,\3,\3,\5,\u024b\n,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\6"+
		".\u0257\n.\r.\16.\u0258\3.\3.\3/\3/\3/\2\5@BD\60\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\b\3\2\r"+
		"\16\3\2\36\37\3\2 \"\3\2\17\20\3\2$)\4\2,,\67\67\2\u0291\2_\3\2\2\2\4"+
		"k\3\2\2\2\6{\3\2\2\2\b}\3\2\2\2\n\u00af\3\2\2\2\f\u00b3\3\2\2\2\16\u00b9"+
		"\3\2\2\2\20\u00bb\3\2\2\2\22\u00c0\3\2\2\2\24\u00ca\3\2\2\2\26\u00cc\3"+
		"\2\2\2\30\u00ce\3\2\2\2\32\u00d3\3\2\2\2\34\u00da\3\2\2\2\36\u00e3\3\2"+
		"\2\2 \u0102\3\2\2\2\"\u0104\3\2\2\2$\u010b\3\2\2\2&\u0118\3\2\2\2(\u011a"+
		"\3\2\2\2*\u0136\3\2\2\2,\u0147\3\2\2\2.\u0154\3\2\2\2\60\u0164\3\2\2\2"+
		"\62\u0170\3\2\2\2\64\u0186\3\2\2\2\66\u018f\3\2\2\28\u019f\3\2\2\2:\u01b6"+
		"\3\2\2\2<\u01b8\3\2\2\2>\u0201\3\2\2\2@\u0203\3\2\2\2B\u020f\3\2\2\2D"+
		"\u021b\3\2\2\2F\u022c\3\2\2\2H\u022e\3\2\2\2J\u0230\3\2\2\2L\u0232\3\2"+
		"\2\2N\u0237\3\2\2\2P\u0239\3\2\2\2R\u0241\3\2\2\2T\u0243\3\2\2\2V\u024a"+
		"\3\2\2\2X\u024c\3\2\2\2Z\u0251\3\2\2\2\\\u025c\3\2\2\2^`\5\\/\2_^\3\2"+
		"\2\2_`\3\2\2\2`b\3\2\2\2ac\5\4\3\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2df\5\6"+
		"\4\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi\5\36\20\2hj\5<\37\2ih\3\2\2\2ij\3"+
		"\2\2\2j\3\3\2\2\2kl\7\b\2\2lm\7\66\2\2mn\5\\/\2n\5\3\2\2\2oq\5\b\5\2p"+
		"r\5\6\4\2qp\3\2\2\2qr\3\2\2\2r|\3\2\2\2su\5\20\t\2tv\5\6\4\2ut\3\2\2\2"+
		"uv\3\2\2\2v|\3\2\2\2wy\5\30\r\2xz\5\6\4\2yx\3\2\2\2yz\3\2\2\2z|\3\2\2"+
		"\2{o\3\2\2\2{s\3\2\2\2{w\3\2\2\2|\7\3\2\2\2}~\7\5\2\2~\u0080\5\\/\2\177"+
		"\u0081\5\n\6\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\t\3\2\2\2\u0082"+
		"\u008a\7\66\2\2\u0083\u0085\7*\2\2\u0084\u0086\5\\/\2\u0085\u0084\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\7\66\2\2\u0088"+
		"\u0083\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7+\2\2\u008e"+
		"\u008f\5\16\b\2\u008f\u0091\5\\/\2\u0090\u0092\5\n\6\2\u0091\u0090\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u00b0\3\2\2\2\u0093\u0094\7\66\2\2\u0094"+
		"\u0095\7+\2\2\u0095\u0096\7\34\2\2\u0096\u0097\7\62\2\2\u0097\u0098\5"+
		"\f\7\2\u0098\u0099\7\63\2\2\u0099\u009a\5\16\b\2\u009a\u009c\5\\/\2\u009b"+
		"\u009d\5\n\6\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00b0\3\2"+
		"\2\2\u009e\u009f\7\66\2\2\u009f\u00a0\7+\2\2\u00a0\u00a1\7\35\2\2\u00a1"+
		"\u00a2\7\62\2\2\u00a2\u00a5\5\f\7\2\u00a3\u00a4\7*\2\2\u00a4\u00a6\5\f"+
		"\7\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\63\2\2\u00aa\u00ab\5"+
		"\16\b\2\u00ab\u00ad\5\\/\2\u00ac\u00ae\5\n\6\2\u00ad\u00ac\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u0082\3\2\2\2\u00af\u0093\3\2"+
		"\2\2\u00af\u009e\3\2\2\2\u00b0\13\3\2\2\2\u00b1\u00b4\7!\2\2\u00b2\u00b4"+
		"\5@!\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\r\3\2\2\2\u00b5\u00ba"+
		"\7\t\2\2\u00b6\u00ba\7\n\2\2\u00b7\u00ba\7\13\2\2\u00b8\u00ba\5\34\17"+
		"\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\17\3\2\2\2\u00bb\u00bc\7\6\2\2\u00bc\u00be\5\\/\2\u00bd"+
		"\u00bf\5\22\n\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\21\3\2\2"+
		"\2\u00c0\u00c1\7\66\2\2\u00c1\u00c2\7-\2\2\u00c2\u00c3\5\24\13\2\u00c3"+
		"\u00c5\5\\/\2\u00c4\u00c6\5\22\n\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\23\3\2\2\2\u00c7\u00cb\5@!\2\u00c8\u00cb\5\26\f\2\u00c9\u00cb"+
		"\7\65\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2"+
		"\u00cb\25\3\2\2\2\u00cc\u00cd\t\2\2\2\u00cd\27\3\2\2\2\u00ce\u00cf\7\7"+
		"\2\2\u00cf\u00d1\5\\/\2\u00d0\u00d2\5\32\16\2\u00d1\u00d0\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\31\3\2\2\2\u00d3\u00d4\7\66\2\2\u00d4\u00d5\7+\2"+
		"\2\u00d5\u00d6\5\16\b\2\u00d6\u00d8\5\\/\2\u00d7\u00d9\5\32\16\2\u00d8"+
		"\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\33\3\2\2\2\u00da\u00dc\7\f\2"+
		"\2\u00db\u00dd\5\\/\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00df\7.\2\2\u00df\u00e0\5\\/\2\u00e0\u00e1\5\n\6\2\u00e1"+
		"\u00e2\7/\2\2\u00e2\35\3\2\2\2\u00e3\u00e4\7\3\2\2\u00e4\u00e8\5\\/\2"+
		"\u00e5\u00e7\5 \21\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\7\4\2\2\u00ec\37\3\2\2\2\u00ed\u00ee\5\"\22\2\u00ee\u00ef\5\\/"+
		"\2\u00ef\u0103\3\2\2\2\u00f0\u00f1\5(\25\2\u00f1\u00f2\5\\/\2\u00f2\u0103"+
		"\3\2\2\2\u00f3\u00f4\5.\30\2\u00f4\u00f5\5\\/\2\u00f5\u0103\3\2\2\2\u00f6"+
		"\u00f7\5\60\31\2\u00f7\u00f8\5\\/\2\u00f8\u0103\3\2\2\2\u00f9\u00fa\5"+
		"\62\32\2\u00fa\u00fb\5\\/\2\u00fb\u0103\3\2\2\2\u00fc\u00fd\5\66\34\2"+
		"\u00fd\u00fe\5\\/\2\u00fe\u0103\3\2\2\2\u00ff\u0100\58\35\2\u0100\u0101"+
		"\5\\/\2\u0101\u0103\3\2\2\2\u0102\u00ed\3\2\2\2\u0102\u00f0\3\2\2\2\u0102"+
		"\u00f3\3\2\2\2\u0102\u00f6\3\2\2\2\u0102\u00f9\3\2\2\2\u0102\u00fc\3\2"+
		"\2\2\u0102\u00ff\3\2\2\2\u0103!\3\2\2\2\u0104\u0105\7\66\2\2\u0105\u0106"+
		"\7-\2\2\u0106\u0107\5$\23\2\u0107#\3\2\2\2\u0108\u010c\58\35\2\u0109\u010c"+
		"\5\24\13\2\u010a\u010c\5&\24\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2"+
		"\u010b\u010a\3\2\2\2\u010c%\3\2\2\2\u010d\u010e\7.\2\2\u010e\u010f\5\24"+
		"\13\2\u010f\u0110\7*\2\2\u0110\u0111\5\24\13\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\7/\2\2\u0113\u0119\3\2\2\2\u0114\u0115\7.\2\2\u0115\u0116\5\24"+
		"\13\2\u0116\u0117\7/\2\2\u0117\u0119\3\2\2\2\u0118\u010d\3\2\2\2\u0118"+
		"\u0114\3\2\2\2\u0119\'\3\2\2\2\u011a\u011b\7\27\2\2\u011b\u011c\7\60\2"+
		"\2\u011c\u011d\5P)\2\u011d\u011f\7\61\2\2\u011e\u0120\5\\/\2\u011f\u011e"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\7.\2\2\u0122"+
		"\u0124\5\\/\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0128\3\2"+
		"\2\2\u0125\u0127\5 \21\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012e\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u012d\5*\26\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0131\u0133\5,\27\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\7/\2\2\u0135)\3\2\2\2\u0136\u0137\7\30\2\2"+
		"\u0137\u0138\7\27\2\2\u0138\u0139\7\60\2\2\u0139\u013a\5P)\2\u013a\u013c"+
		"\7\61\2\2\u013b\u013d\5\\/\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u0141\3\2\2\2\u013e\u0140\5 \21\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144\u0146\5\\/\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146+\3\2\2\2\u0147\u0149\7\30\2\2\u0148\u014a\5\\/\2\u0149\u0148"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014e\3\2\2\2\u014b\u014d\5 \21\2\u014c"+
		"\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0153\5\\/\2\u0152"+
		"\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153-\3\2\2\2\u0154\u0155\7\21\2\2"+
		"\u0155\u0156\7\60\2\2\u0156\u0157\5P)\2\u0157\u0159\7\61\2\2\u0158\u015a"+
		"\5\\/\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015d\7.\2\2\u015c\u015e\5\\/\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2"+
		"\2\u015e\u0160\3\2\2\2\u015f\u0161\5 \21\2\u0160\u015f\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7/\2\2\u0163/\3\2\2\2\u0164\u0166"+
		"\7\22\2\2\u0165\u0167\5\\/\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u016a\5 \21\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u016c\7\23\2\2\u016c\u016d\7\60\2\2\u016d"+
		"\u016e\5P)\2\u016e\u016f\7\61\2\2\u016f\61\3\2\2\2\u0170\u0172\7\24\2"+
		"\2\u0171\u0173\5\\/\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0176\7.\2\2\u0175\u0177\5\\/\2\u0176\u0175\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\7\60\2\2\u0179\u017a\5"+
		"P)\2\u017a\u017e\7\61\2\2\u017b\u017d\5\64\33\2\u017c\u017b\3\2\2\2\u017d"+
		"\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0182\3\2"+
		"\2\2\u0180\u017e\3\2\2\2\u0181\u0183\5,\27\2\u0182\u0181\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7/\2\2\u0185\63\3\2\2\2"+
		"\u0186\u0187\7\25\2\2\u0187\u0188\7\60\2\2\u0188\u0189\5P)\2\u0189\u018b"+
		"\7\61\2\2\u018a\u018c\5\\/\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018e\5 \21\2\u018e\65\3\2\2\2\u018f\u0190\7\26\2"+
		"\2\u0190\u0191\7\66\2\2\u0191\u0192\7-\2\2\u0192\u0193\5@!\2\u0193\u0194"+
		"\7\23\2\2\u0194\u0196\5@!\2\u0195\u0197\5\\/\2\u0196\u0195\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\7.\2\2\u0199\u019b\5\\"+
		"/\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019d\5 \21\2\u019d\u019e\7/\2\2\u019e\67\3\2\2\2\u019f\u01a0\7\66\2"+
		"\2\u01a0\u01a2\7\60\2\2\u01a1\u01a3\5:\36\2\u01a2\u01a1\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01aa\3\2\2\2\u01a4\u01a5\5:\36\2\u01a5\u01a6\7*"+
		"\2\2\u01a6\u01a7\5:\36\2\u01a7\u01a9\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2"+
		"\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\7\61\2\2\u01ae9\3\2\2\2\u01af\u01b7"+
		"\7\64\2\2\u01b0\u01b7\7\65\2\2\u01b1\u01b7\58\35\2\u01b2\u01b7\5@!\2\u01b3"+
		"\u01b7\5P)\2\u01b4\u01b7\5X-\2\u01b5\u01b7\5Z.\2\u01b6\u01af\3\2\2\2\u01b6"+
		"\u01b0\3\2\2\2\u01b6\u01b1\3\2\2\2\u01b6\u01b2\3\2\2\2\u01b6\u01b3\3\2"+
		"\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7;\3\2\2\2\u01b8\u01b9"+
		"\7\31\2\2\u01b9\u01ba\7\66\2\2\u01ba\u01bc\7\60\2\2\u01bb\u01bd\5> \2"+
		"\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c1"+
		"\7\61\2\2\u01bf\u01c0\7\32\2\2\u01c0\u01c2\5\16\b\2\u01c1\u01bf\3\2\2"+
		"\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c5\5\\/\2\u01c4\u01c3"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c8\5\6\4\2\u01c7"+
		"\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01cb\5\\"+
		"/\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01cd\7\3\2\2\u01cd\u01cf\5\\/\2\u01ce\u01d0\5 \21\2\u01cf\u01ce\3\2"+
		"\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d5\3\2\2\2\u01d1\u01d2\7\32\2\2\u01d2"+
		"\u01d3\7\60\2\2\u01d3\u01d4\7\66\2\2\u01d4\u01d6\7\61\2\2\u01d5\u01d1"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d9\5\\/\2\u01d8"+
		"\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\7\4"+
		"\2\2\u01db=\3\2\2\2\u01dc\u01e4\7\66\2\2\u01dd\u01df\7*\2\2\u01de\u01e0"+
		"\5\\/\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e3\7\66\2\2\u01e2\u01dd\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3"+
		"\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7"+
		"\u01e8\7+\2\2\u01e8\u01ec\5\16\b\2\u01e9\u01ea\5\\/\2\u01ea\u01eb\5> "+
		"\2\u01eb\u01ed\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u0202"+
		"\3\2\2\2\u01ee\u01ef\7\33\2\2\u01ef\u01f7\7\66\2\2\u01f0\u01f2\7*\2\2"+
		"\u01f1\u01f3\5\\/\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4"+
		"\3\2\2\2\u01f4\u01f6\7\66\2\2\u01f5\u01f0\3\2\2\2\u01f6\u01f9\3\2\2\2"+
		"\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f7"+
		"\3\2\2\2\u01fa\u01fb\7+\2\2\u01fb\u01ff\5\16\b\2\u01fc\u01fd\5\\/\2\u01fd"+
		"\u01fe\5> \2\u01fe\u0200\3\2\2\2\u01ff\u01fc\3\2\2\2\u01ff\u0200\3\2\2"+
		"\2\u0200\u0202\3\2\2\2\u0201\u01dc\3\2\2\2\u0201\u01ee\3\2\2\2\u0202?"+
		"\3\2\2\2\u0203\u0204\b!\1\2\u0204\u0205\5B\"\2\u0205\u020c\3\2\2\2\u0206"+
		"\u0207\f\4\2\2\u0207\u0208\5H%\2\u0208\u0209\5B\"\2\u0209\u020b\3\2\2"+
		"\2\u020a\u0206\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020dA\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\b\"\1\2\u0210"+
		"\u0211\5D#\2\u0211\u0218\3\2\2\2\u0212\u0213\f\4\2\2\u0213\u0214\5J&\2"+
		"\u0214\u0215\5D#\2\u0215\u0217\3\2\2\2\u0216\u0212\3\2\2\2\u0217\u021a"+
		"\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219C\3\2\2\2\u021a"+
		"\u0218\3\2\2\2\u021b\u021c\b#\1\2\u021c\u021d\5F$\2\u021d\u0224\3\2\2"+
		"\2\u021e\u021f\f\4\2\2\u021f\u0220\5L\'\2\u0220\u0221\5F$\2\u0221\u0223"+
		"\3\2\2\2\u0222\u021e\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225E\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\7\60\2\2"+
		"\u0228\u0229\5@!\2\u0229\u022a\7\61\2\2\u022a\u022d\3\2\2\2\u022b\u022d"+
		"\5N(\2\u022c\u0227\3\2\2\2\u022c\u022b\3\2\2\2\u022dG\3\2\2\2\u022e\u022f"+
		"\t\3\2\2\u022fI\3\2\2\2\u0230\u0231\t\4\2\2\u0231K\3\2\2\2\u0232\u0233"+
		"\7#\2\2\u0233M\3\2\2\2\u0234\u0238\7\66\2\2\u0235\u0238\7\64\2\2\u0236"+
		"\u0238\58\35\2\u0237\u0234\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0236\3\2"+
		"\2\2\u0238O\3\2\2\2\u0239\u023a\5V,\2\u023a\u023b\5T+\2\u023b\u023f\5"+
		"V,\2\u023c\u023d\5R*\2\u023d\u023e\5P)\2\u023e\u0240\3\2\2\2\u023f\u023c"+
		"\3\2\2\2\u023f\u0240\3\2\2\2\u0240Q\3\2\2\2\u0241\u0242\t\5\2\2\u0242"+
		"S\3\2\2\2\u0243\u0244\t\6\2\2\u0244U\3\2\2\2\u0245\u024b\7\66\2\2\u0246"+
		"\u024b\7\64\2\2\u0247\u024b\58\35\2\u0248\u024b\5\26\f\2\u0249\u024b\7"+
		"\65\2\2\u024a\u0245\3\2\2\2\u024a\u0246\3\2\2\2\u024a\u0247\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024a\u0249\3\2\2\2\u024bW\3\2\2\2\u024c\u024d\7\66\2\2"+
		"\u024d\u024e\7\62\2\2\u024e\u024f\5@!\2\u024f\u0250\7\63\2\2\u0250Y\3"+
		"\2\2\2\u0251\u0252\7\66\2\2\u0252\u0253\7\62\2\2\u0253\u0256\5@!\2\u0254"+
		"\u0255\7*\2\2\u0255\u0257\5@!\2\u0256\u0254\3\2\2\2\u0257\u0258\3\2\2"+
		"\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b"+
		"\7\63\2\2\u025b[\3\2\2\2\u025c\u025d\t\7\2\2\u025d]\3\2\2\2O_beiquy{\u0080"+
		"\u0085\u008a\u0091\u009c\u00a7\u00ad\u00af\u00b3\u00b9\u00be\u00c5\u00ca"+
		"\u00d1\u00d8\u00dc\u00e8\u0102\u010b\u0118\u011f\u0123\u0128\u012e\u0132"+
		"\u013c\u0141\u0145\u0149\u014e\u0152\u0159\u015d\u0160\u0166\u0169\u0172"+
		"\u0176\u017e\u0182\u018b\u0196\u019a\u01a2\u01aa\u01b6\u01bc\u01c1\u01c4"+
		"\u01c7\u01ca\u01cf\u01d5\u01d8\u01df\u01e4\u01ec\u01f2\u01f7\u01ff\u0201"+
		"\u020c\u0218\u0224\u022c\u0237\u023f\u024a\u0258";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}