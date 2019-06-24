// Generated from /home/sebastian/IdeaProjects/traductorSLtoC/grammar/Gramatica.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
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
			"Tk_caso", "Tk_desde", "Tk_si", "Tk_sino", "Tk_subrutina", "Tk_retorna", 
			"Tk_ref", "Tk_vector", "Tk_matriz", "Tk_sum", "Tk_subt", "Tk_div", "Tk_mult", 
			"Tk_mod", "Tk_exp", "Tk_less", "Tk_lessEqual", "Tk_bigger", "Tk_biggerEqual", 
			"Tk_equal", "Tk_diferent", "Tk_comma", "Tk_colon", "Tk_semicolon", "Tk_assig", 
			"Tk_okey", "Tk_ckey", "Tk_opar", "Tk_cpar", "Tk_obracket", "Tk_cbracket", 
			"Tk_num", "Tk_str", "Tk_id", "EOL", "WS"
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


	public HelloLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u01a8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)"+
		"\3)\3*\3*\3+\6+\u0139\n+\r+\16+\u013a\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\6\63\u014c\n\63\r\63\16\63\u014d\3\63\3\63\6"+
		"\63\u0152\n\63\r\63\16\63\u0153\5\63\u0156\n\63\3\63\3\63\6\63\u015a\n"+
		"\63\r\63\16\63\u015b\3\63\3\63\6\63\u0160\n\63\r\63\16\63\u0161\5\63\u0164"+
		"\n\63\5\63\u0166\n\63\3\63\6\63\u0169\n\63\r\63\16\63\u016a\3\63\3\63"+
		"\6\63\u016f\n\63\r\63\16\63\u0170\5\63\u0173\n\63\3\63\3\63\6\63\u0177"+
		"\n\63\r\63\16\63\u0178\3\63\3\63\6\63\u017d\n\63\r\63\16\63\u017e\5\63"+
		"\u0181\n\63\5\63\u0183\n\63\5\63\u0185\n\63\3\64\3\64\6\64\u0189\n\64"+
		"\r\64\16\64\u018a\3\64\3\64\3\65\3\65\7\65\u0191\n\65\f\65\16\65\u0194"+
		"\13\65\3\65\3\65\7\65\u0198\n\65\f\65\16\65\u019b\13\65\3\66\6\66\u019e"+
		"\n\66\r\66\16\66\u019f\3\67\6\67\u01a3\n\67\r\67\16\67\u01a4\3\67\3\67"+
		"\2\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8\3\2\b\3\2\62;\6\2\"\"\63;C\\c|\7\2C\\aac|\u00d3\u00d3\u00f3\u00f3\b"+
		"\2\62;C\\aac|\u00d3\u00d3\u00f3\u00f3\4\2\f\f\17\17\4\2\13\13\"\"\2\u01bc"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\3o\3\2\2\2\5v\3\2\2\2\7z\3\2\2\2\t~\3\2\2\2\13\u0083\3\2\2\2\r\u0089"+
		"\3\2\2\2\17\u0092\3\2\2\2\21\u009b\3\2\2\2\23\u00a2\3\2\2\2\25\u00a9\3"+
		"\2\2\2\27\u00b2\3\2\2\2\31\u00b7\3\2\2\2\33\u00bd\3\2\2\2\35\u00c1\3\2"+
		"\2\2\37\u00c4\3\2\2\2!\u00cd\3\2\2\2#\u00d5\3\2\2\2%\u00db\3\2\2\2\'\u00e0"+
		"\3\2\2\2)\u00e5\3\2\2\2+\u00eb\3\2\2\2-\u00ee\3\2\2\2/\u00f3\3\2\2\2\61"+
		"\u00fd\3\2\2\2\63\u0105\3\2\2\2\65\u0109\3\2\2\2\67\u0110\3\2\2\29\u0117"+
		"\3\2\2\2;\u0119\3\2\2\2=\u011b\3\2\2\2?\u011d\3\2\2\2A\u011f\3\2\2\2C"+
		"\u0121\3\2\2\2E\u0123\3\2\2\2G\u0125\3\2\2\2I\u0128\3\2\2\2K\u012a\3\2"+
		"\2\2M\u012d\3\2\2\2O\u0130\3\2\2\2Q\u0133\3\2\2\2S\u0135\3\2\2\2U\u0138"+
		"\3\2\2\2W\u013c\3\2\2\2Y\u013e\3\2\2\2[\u0140\3\2\2\2]\u0142\3\2\2\2_"+
		"\u0144\3\2\2\2a\u0146\3\2\2\2c\u0148\3\2\2\2e\u0184\3\2\2\2g\u0186\3\2"+
		"\2\2i\u018e\3\2\2\2k\u019d\3\2\2\2m\u01a2\3\2\2\2op\7k\2\2pq\7p\2\2qr"+
		"\7k\2\2rs\7e\2\2st\7k\2\2tu\7q\2\2u\4\3\2\2\2vw\7h\2\2wx\7k\2\2xy\7p\2"+
		"\2y\6\3\2\2\2z{\7x\2\2{|\7c\2\2|}\7t\2\2}\b\3\2\2\2~\177\7e\2\2\177\u0080"+
		"\7q\2\2\u0080\u0081\7p\2\2\u0081\u0082\7u\2\2\u0082\n\3\2\2\2\u0083\u0084"+
		"\7v\2\2\u0084\u0085\7k\2\2\u0085\u0086\7r\2\2\u0086\u0087\7q\2\2\u0087"+
		"\u0088\7u\2\2\u0088\f\3\2\2\2\u0089\u008a\7r\2\2\u008a\u008b\7t\2\2\u008b"+
		"\u008c\7q\2\2\u008c\u008d\7i\2\2\u008d\u008e\7t\2\2\u008e\u008f\7c\2\2"+
		"\u008f\u0090\7o\2\2\u0090\u0091\7c\2\2\u0091\16\3\2\2\2\u0092\u0093\7"+
		"p\2\2\u0093\u0094\7w\2\2\u0094\u0095\7o\2\2\u0095\u0096\7g\2\2\u0096\u0097"+
		"\7t\2\2\u0097\u0098\7k\2\2\u0098\u0099\7e\2\2\u0099\u009a\7q\2\2\u009a"+
		"\20\3\2\2\2\u009b\u009c\7n\2\2\u009c\u009d\7q\2\2\u009d\u009e\7i\2\2\u009e"+
		"\u009f\7k\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7q\2\2\u00a1\22\3\2\2\2\u00a2"+
		"\u00a3\7e\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7g\2\2"+
		"\u00a6\u00a7\7p\2\2\u00a7\u00a8\7c\2\2\u00a8\24\3\2\2\2\u00a9\u00aa\7"+
		"t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7i\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae"+
		"\7u\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7q\2\2\u00b1"+
		"\26\3\2\2\2\u00b2\u00b3\7V\2\2\u00b3\u00b4\7T\2\2\u00b4\u00b5\7W\2\2\u00b5"+
		"\u00b6\7G\2\2\u00b6\30\3\2\2\2\u00b7\u00b8\7H\2\2\u00b8\u00b9\7C\2\2\u00b9"+
		"\u00ba\7N\2\2\u00ba\u00bb\7U\2\2\u00bb\u00bc\7G\2\2\u00bc\32\3\2\2\2\u00bd"+
		"\u00be\7c\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7f\2\2\u00c0\34\3\2\2\2\u00c1"+
		"\u00c2\7q\2\2\u00c2\u00c3\7t\2\2\u00c3\36\3\2\2\2\u00c4\u00c5\7o\2\2\u00c5"+
		"\u00c6\7k\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7v\2\2"+
		"\u00c9\u00ca\7t\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7u\2\2\u00cc \3\2\2"+
		"\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1"+
		"\7g\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7t\2\2\u00d4"+
		"\"\3\2\2\2\u00d5\u00d6\7j\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7u\2\2\u00d8"+
		"\u00d9\7v\2\2\u00d9\u00da\7c\2\2\u00da$\3\2\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"\u00dd\7x\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7n\2\2\u00df&\3\2\2\2\u00e0"+
		"\u00e1\7e\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7q\2\2"+
		"\u00e4(\3\2\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7u\2"+
		"\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7g\2\2\u00ea*\3\2\2\2\u00eb\u00ec\7"+
		"u\2\2\u00ec\u00ed\7k\2\2\u00ed,\3\2\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0"+
		"\7k\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7q\2\2\u00f2.\3\2\2\2\u00f3\u00f4"+
		"\7u\2\2\u00f4\u00f5\7w\2\2\u00f5\u00f6\7d\2\2\u00f6\u00f7\7t\2\2\u00f7"+
		"\u00f8\7w\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7p\2\2"+
		"\u00fb\u00fc\7c\2\2\u00fc\60\3\2\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7"+
		"g\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7q\2\2\u0101\u0102\7t\2\2\u0102\u0103"+
		"\7p\2\2\u0103\u0104\7c\2\2\u0104\62\3\2\2\2\u0105\u0106\7t\2\2\u0106\u0107"+
		"\7g\2\2\u0107\u0108\7h\2\2\u0108\64\3\2\2\2\u0109\u010a\7x\2\2\u010a\u010b"+
		"\7g\2\2\u010b\u010c\7e\2\2\u010c\u010d\7v\2\2\u010d\u010e\7q\2\2\u010e"+
		"\u010f\7t\2\2\u010f\66\3\2\2\2\u0110\u0111\7o\2\2\u0111\u0112\7c\2\2\u0112"+
		"\u0113\7v\2\2\u0113\u0114\7t\2\2\u0114\u0115\7k\2\2\u0115\u0116\7|\2\2"+
		"\u01168\3\2\2\2\u0117\u0118\7-\2\2\u0118:\3\2\2\2\u0119\u011a\7/\2\2\u011a"+
		"<\3\2\2\2\u011b\u011c\7\61\2\2\u011c>\3\2\2\2\u011d\u011e\7,\2\2\u011e"+
		"@\3\2\2\2\u011f\u0120\7\'\2\2\u0120B\3\2\2\2\u0121\u0122\7`\2\2\u0122"+
		"D\3\2\2\2\u0123\u0124\7>\2\2\u0124F\3\2\2\2\u0125\u0126\7>\2\2\u0126\u0127"+
		"\7?\2\2\u0127H\3\2\2\2\u0128\u0129\7@\2\2\u0129J\3\2\2\2\u012a\u012b\7"+
		"@\2\2\u012b\u012c\7?\2\2\u012cL\3\2\2\2\u012d\u012e\7?\2\2\u012e\u012f"+
		"\7?\2\2\u012fN\3\2\2\2\u0130\u0131\7>\2\2\u0131\u0132\7@\2\2\u0132P\3"+
		"\2\2\2\u0133\u0134\7.\2\2\u0134R\3\2\2\2\u0135\u0136\7<\2\2\u0136T\3\2"+
		"\2\2\u0137\u0139\7=\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bV\3\2\2\2\u013c\u013d\7?\2\2\u013d"+
		"X\3\2\2\2\u013e\u013f\7}\2\2\u013fZ\3\2\2\2\u0140\u0141\7\177\2\2\u0141"+
		"\\\3\2\2\2\u0142\u0143\7*\2\2\u0143^\3\2\2\2\u0144\u0145\7+\2\2\u0145"+
		"`\3\2\2\2\u0146\u0147\7]\2\2\u0147b\3\2\2\2\u0148\u0149\7_\2\2\u0149d"+
		"\3\2\2\2\u014a\u014c\t\2\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0155\3\2\2\2\u014f\u0151\7\60"+
		"\2\2\u0150\u0152\t\2\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u014f\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u0165\3\2\2\2\u0157\u0159\7g\2\2\u0158"+
		"\u015a\t\2\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u0163\3\2\2\2\u015d\u015f\7\60\2\2\u015e"+
		"\u0160\t\2\2\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u015d\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0157\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\u0185\3\2\2\2\u0167\u0169\t\2\2\2\u0168\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0172\3\2"+
		"\2\2\u016c\u016e\7\60\2\2\u016d\u016f\t\2\2\2\u016e\u016d\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2"+
		"\2\2\u0172\u016c\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0182\3\2\2\2\u0174"+
		"\u0176\7G\2\2\u0175\u0177\t\2\2\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0180\3\2\2\2\u017a"+
		"\u017c\7\60\2\2\u017b\u017d\t\2\2\2\u017c\u017b\3\2\2\2\u017d\u017e\3"+
		"\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180"+
		"\u017a\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0174\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u014b\3\2\2\2\u0184"+
		"\u0168\3\2\2\2\u0185f\3\2\2\2\u0186\u0188\7$\2\2\u0187\u0189\t\3\2\2\u0188"+
		"\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c\u018d\7$\2\2\u018dh\3\2\2\2\u018e\u0192"+
		"\t\4\2\2\u018f\u0191\t\5\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0199\3\2\2\2\u0194\u0192\3\2"+
		"\2\2\u0195\u0196\7\60\2\2\u0196\u0198\5i\65\2\u0197\u0195\3\2\2\2\u0198"+
		"\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019aj\3\2\2\2"+
		"\u019b\u0199\3\2\2\2\u019c\u019e\t\6\2\2\u019d\u019c\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0l\3\2\2\2\u01a1"+
		"\u01a3\t\7\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\b\67\2\2\u01a7"+
		"n\3\2\2\2\30\2\u013a\u014d\u0153\u0155\u015b\u0161\u0163\u0165\u016a\u0170"+
		"\u0172\u0178\u017e\u0180\u0182\u0184\u018a\u0192\u0199\u019f\u01a4\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}