// Generated from /home/sebastian/Documentos/GitHub/Lenguajes-de-Programacion/traductorSLtoC/grammar/Gramatica.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Tk_inicio", "Tk_fin", "Tk_var", "Tk_cons", "Tk_tipos", "Tk_programa", 
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u01d7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\6,\u0145\n,\r"+
		",\16,\u0146\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\6\64\u0158\n\64\r\64\16\64\u0159\3\64\3\64\6\64\u015e\n\64\r\64"+
		"\16\64\u015f\5\64\u0162\n\64\3\64\3\64\6\64\u0166\n\64\r\64\16\64\u0167"+
		"\3\64\3\64\6\64\u016c\n\64\r\64\16\64\u016d\5\64\u0170\n\64\5\64\u0172"+
		"\n\64\3\64\6\64\u0175\n\64\r\64\16\64\u0176\3\64\3\64\6\64\u017b\n\64"+
		"\r\64\16\64\u017c\5\64\u017f\n\64\3\64\3\64\6\64\u0183\n\64\r\64\16\64"+
		"\u0184\3\64\3\64\6\64\u0189\n\64\r\64\16\64\u018a\5\64\u018d\n\64\5\64"+
		"\u018f\n\64\5\64\u0191\n\64\3\65\3\65\7\65\u0195\n\65\f\65\16\65\u0198"+
		"\13\65\3\65\3\65\3\66\3\66\7\66\u019e\n\66\f\66\16\66\u01a1\13\66\3\66"+
		"\3\66\3\66\3\66\7\66\u01a7\n\66\f\66\16\66\u01aa\13\66\3\66\3\66\7\66"+
		"\u01ae\n\66\f\66\16\66\u01b1\13\66\3\67\3\67\3\67\3\67\7\67\u01b7\n\67"+
		"\f\67\16\67\u01ba\13\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\78\u01c5"+
		"\n8\f8\168\u01c8\138\38\38\39\69\u01cd\n9\r9\169\u01ce\3:\6:\u01d2\n:"+
		"\r:\16:\u01d3\3:\3:\4\u0196\u01b8\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;\3\2\7\3\2\62;\7\2C\\aac|\u00d3"+
		"\u00d3\u00f3\u00f3\b\2\62;C\\aac|\u00d3\u00d3\u00f3\u00f3\4\2\f\f\17\17"+
		"\4\2\13\13\"\"\2\u01ee\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5"+
		"|\3\2\2\2\7\u0080\3\2\2\2\t\u0084\3\2\2\2\13\u008a\3\2\2\2\r\u0090\3\2"+
		"\2\2\17\u0099\3\2\2\2\21\u00a2\3\2\2\2\23\u00a9\3\2\2\2\25\u00b0\3\2\2"+
		"\2\27\u00b9\3\2\2\2\31\u00be\3\2\2\2\33\u00c4\3\2\2\2\35\u00c8\3\2\2\2"+
		"\37\u00cb\3\2\2\2!\u00d4\3\2\2\2#\u00dc\3\2\2\2%\u00e2\3\2\2\2\'\u00e7"+
		"\3\2\2\2)\u00ec\3\2\2\2+\u00f2\3\2\2\2-\u00f7\3\2\2\2/\u00fa\3\2\2\2\61"+
		"\u00ff\3\2\2\2\63\u0109\3\2\2\2\65\u0111\3\2\2\2\67\u0115\3\2\2\29\u011c"+
		"\3\2\2\2;\u0123\3\2\2\2=\u0125\3\2\2\2?\u0127\3\2\2\2A\u0129\3\2\2\2C"+
		"\u012b\3\2\2\2E\u012d\3\2\2\2G\u012f\3\2\2\2I\u0131\3\2\2\2K\u0134\3\2"+
		"\2\2M\u0136\3\2\2\2O\u0139\3\2\2\2Q\u013c\3\2\2\2S\u013f\3\2\2\2U\u0141"+
		"\3\2\2\2W\u0144\3\2\2\2Y\u0148\3\2\2\2[\u014a\3\2\2\2]\u014c\3\2\2\2_"+
		"\u014e\3\2\2\2a\u0150\3\2\2\2c\u0152\3\2\2\2e\u0154\3\2\2\2g\u0190\3\2"+
		"\2\2i\u0192\3\2\2\2k\u019b\3\2\2\2m\u01b2\3\2\2\2o\u01c0\3\2\2\2q\u01cc"+
		"\3\2\2\2s\u01d1\3\2\2\2uv\7k\2\2vw\7p\2\2wx\7k\2\2xy\7e\2\2yz\7k\2\2z"+
		"{\7q\2\2{\4\3\2\2\2|}\7h\2\2}~\7k\2\2~\177\7p\2\2\177\6\3\2\2\2\u0080"+
		"\u0081\7x\2\2\u0081\u0082\7c\2\2\u0082\u0083\7t\2\2\u0083\b\3\2\2\2\u0084"+
		"\u0085\7e\2\2\u0085\u0086\7q\2\2\u0086\u0087\7p\2\2\u0087\u0088\7u\2\2"+
		"\u0088\u0089\7v\2\2\u0089\n\3\2\2\2\u008a\u008b\7v\2\2\u008b\u008c\7k"+
		"\2\2\u008c\u008d\7r\2\2\u008d\u008e\7q\2\2\u008e\u008f\7u\2\2\u008f\f"+
		"\3\2\2\2\u0090\u0091\7r\2\2\u0091\u0092\7t\2\2\u0092\u0093\7q\2\2\u0093"+
		"\u0094\7i\2\2\u0094\u0095\7t\2\2\u0095\u0096\7c\2\2\u0096\u0097\7o\2\2"+
		"\u0097\u0098\7c\2\2\u0098\16\3\2\2\2\u0099\u009a\7p\2\2\u009a\u009b\7"+
		"w\2\2\u009b\u009c\7o\2\2\u009c\u009d\7g\2\2\u009d\u009e\7t\2\2\u009e\u009f"+
		"\7k\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7q\2\2\u00a1\20\3\2\2\2\u00a2\u00a3"+
		"\7n\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7i\2\2\u00a5\u00a6\7k\2\2\u00a6"+
		"\u00a7\7e\2\2\u00a7\u00a8\7q\2\2\u00a8\22\3\2\2\2\u00a9\u00aa\7e\2\2\u00aa"+
		"\u00ab\7c\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7p\2\2"+
		"\u00ae\u00af\7c\2\2\u00af\24\3\2\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7"+
		"g\2\2\u00b2\u00b3\7i\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6"+
		"\7v\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7q\2\2\u00b8\26\3\2\2\2\u00b9\u00ba"+
		"\7V\2\2\u00ba\u00bb\7T\2\2\u00bb\u00bc\7W\2\2\u00bc\u00bd\7G\2\2\u00bd"+
		"\30\3\2\2\2\u00be\u00bf\7H\2\2\u00bf\u00c0\7C\2\2\u00c0\u00c1\7N\2\2\u00c1"+
		"\u00c2\7U\2\2\u00c2\u00c3\7G\2\2\u00c3\32\3\2\2\2\u00c4\u00c5\7c\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\u00c7\7f\2\2\u00c7\34\3\2\2\2\u00c8\u00c9\7q\2\2\u00c9"+
		"\u00ca\7t\2\2\u00ca\36\3\2\2\2\u00cb\u00cc\7o\2\2\u00cc\u00cd\7k\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7t\2\2"+
		"\u00d1\u00d2\7c\2\2\u00d2\u00d3\7u\2\2\u00d3 \3\2\2\2\u00d4\u00d5\7t\2"+
		"\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7r\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9"+
		"\7v\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7t\2\2\u00db\"\3\2\2\2\u00dc\u00dd"+
		"\7j\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7v\2\2\u00e0"+
		"\u00e1\7c\2\2\u00e1$\3\2\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7x\2\2\u00e4"+
		"\u00e5\7c\2\2\u00e5\u00e6\7n\2\2\u00e6&\3\2\2\2\u00e7\u00e8\7e\2\2\u00e8"+
		"\u00e9\7c\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7q\2\2\u00eb(\3\2\2\2\u00ec"+
		"\u00ed\7f\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7f\2\2"+
		"\u00f0\u00f1\7g\2\2\u00f1*\3\2\2\2\u00f2\u00f3\7r\2\2\u00f3\u00f4\7c\2"+
		"\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7q\2\2\u00f6,\3\2\2\2\u00f7\u00f8\7"+
		"u\2\2\u00f8\u00f9\7k\2\2\u00f9.\3\2\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc"+
		"\7k\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7q\2\2\u00fe\60\3\2\2\2\u00ff\u0100"+
		"\7u\2\2\u0100\u0101\7w\2\2\u0101\u0102\7d\2\2\u0102\u0103\7t\2\2\u0103"+
		"\u0104\7w\2\2\u0104\u0105\7v\2\2\u0105\u0106\7k\2\2\u0106\u0107\7p\2\2"+
		"\u0107\u0108\7c\2\2\u0108\62\3\2\2\2\u0109\u010a\7t\2\2\u010a\u010b\7"+
		"g\2\2\u010b\u010c\7v\2\2\u010c\u010d\7q\2\2\u010d\u010e\7t\2\2\u010e\u010f"+
		"\7p\2\2\u010f\u0110\7c\2\2\u0110\64\3\2\2\2\u0111\u0112\7t\2\2\u0112\u0113"+
		"\7g\2\2\u0113\u0114\7h\2\2\u0114\66\3\2\2\2\u0115\u0116\7x\2\2\u0116\u0117"+
		"\7g\2\2\u0117\u0118\7e\2\2\u0118\u0119\7v\2\2\u0119\u011a\7q\2\2\u011a"+
		"\u011b\7t\2\2\u011b8\3\2\2\2\u011c\u011d\7o\2\2\u011d\u011e\7c\2\2\u011e"+
		"\u011f\7v\2\2\u011f\u0120\7t\2\2\u0120\u0121\7k\2\2\u0121\u0122\7|\2\2"+
		"\u0122:\3\2\2\2\u0123\u0124\7-\2\2\u0124<\3\2\2\2\u0125\u0126\7/\2\2\u0126"+
		">\3\2\2\2\u0127\u0128\7\61\2\2\u0128@\3\2\2\2\u0129\u012a\7,\2\2\u012a"+
		"B\3\2\2\2\u012b\u012c\7\'\2\2\u012cD\3\2\2\2\u012d\u012e\7`\2\2\u012e"+
		"F\3\2\2\2\u012f\u0130\7>\2\2\u0130H\3\2\2\2\u0131\u0132\7>\2\2\u0132\u0133"+
		"\7?\2\2\u0133J\3\2\2\2\u0134\u0135\7@\2\2\u0135L\3\2\2\2\u0136\u0137\7"+
		"@\2\2\u0137\u0138\7?\2\2\u0138N\3\2\2\2\u0139\u013a\7?\2\2\u013a\u013b"+
		"\7?\2\2\u013bP\3\2\2\2\u013c\u013d\7>\2\2\u013d\u013e\7@\2\2\u013eR\3"+
		"\2\2\2\u013f\u0140\7.\2\2\u0140T\3\2\2\2\u0141\u0142\7<\2\2\u0142V\3\2"+
		"\2\2\u0143\u0145\7=\2\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147X\3\2\2\2\u0148\u0149\7?\2\2\u0149"+
		"Z\3\2\2\2\u014a\u014b\7}\2\2\u014b\\\3\2\2\2\u014c\u014d\7\177\2\2\u014d"+
		"^\3\2\2\2\u014e\u014f\7*\2\2\u014f`\3\2\2\2\u0150\u0151\7+\2\2\u0151b"+
		"\3\2\2\2\u0152\u0153\7]\2\2\u0153d\3\2\2\2\u0154\u0155\7_\2\2\u0155f\3"+
		"\2\2\2\u0156\u0158\t\2\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0161\3\2\2\2\u015b\u015d\7\60"+
		"\2\2\u015c\u015e\t\2\2\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015b\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0171\3\2\2\2\u0163\u0165\7g\2\2\u0164"+
		"\u0166\t\2\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u016f\3\2\2\2\u0169\u016b\7\60\2\2\u016a"+
		"\u016c\t\2\2\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0169\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u0163\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\u0191\3\2\2\2\u0173\u0175\t\2\2\2\u0174\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017e\3\2"+
		"\2\2\u0178\u017a\7\60\2\2\u0179\u017b\t\2\2\2\u017a\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2"+
		"\2\2\u017e\u0178\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u018e\3\2\2\2\u0180"+
		"\u0182\7G\2\2\u0181\u0183\t\2\2\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2"+
		"\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u018c\3\2\2\2\u0186"+
		"\u0188\7\60\2\2\u0187\u0189\t\2\2\2\u0188\u0187\3\2\2\2\u0189\u018a\3"+
		"\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c"+
		"\u0186\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u0180\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u0157\3\2\2\2\u0190"+
		"\u0174\3\2\2\2\u0191h\3\2\2\2\u0192\u0196\7$\2\2\u0193\u0195\13\2\2\2"+
		"\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0197\3\2\2\2\u0196\u0194"+
		"\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\7$\2\2\u019a"+
		"j\3\2\2\2\u019b\u019f\t\3\2\2\u019c\u019e\t\4\2\2\u019d\u019c\3\2\2\2"+
		"\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a8"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\5c\62\2\u01a3\u01a4\5g\64\2\u01a4"+
		"\u01a5\5e\63\2\u01a5\u01a7\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a7\u01aa\3\2"+
		"\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01af\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01ab\u01ac\7\60\2\2\u01ac\u01ae\5k\66\2\u01ad\u01ab\3"+
		"\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"l\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\7\61\2\2\u01b3\u01b4\7,\2\2"+
		"\u01b4\u01b8\3\2\2\2\u01b5\u01b7\13\2\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01bb\u01bc\7,\2\2\u01bc\u01bd\7\61\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01bf\b\67\2\2\u01bfn\3\2\2\2\u01c0\u01c1\7\61\2\2\u01c1\u01c2"+
		"\7\61\2\2\u01c2\u01c6\3\2\2\2\u01c3\u01c5\n\5\2\2\u01c4\u01c3\3\2\2\2"+
		"\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9"+
		"\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\b8\2\2\u01cap\3\2\2\2\u01cb\u01cd"+
		"\t\5\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cfr\3\2\2\2\u01d0\u01d2\t\6\2\2\u01d1\u01d0\3\2\2\2"+
		"\u01d2\u01d3\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d6\b:\2\2\u01d6t\3\2\2\2\33\2\u0146\u0159\u015f\u0161"+
		"\u0167\u016d\u016f\u0171\u0176\u017c\u017e\u0184\u018a\u018c\u018e\u0190"+
		"\u0196\u019f\u01a8\u01af\u01b8\u01c6\u01ce\u01d3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}