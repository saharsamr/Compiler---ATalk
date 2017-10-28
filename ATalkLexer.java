// Generated from ATalk.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ATalkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, CM=4, NATURALNUM=5, ARITHNUM=6, ACTOR=7, RECEIVER=8, 
		SENDER=9, SELF=10, READ=11, WRITE=12, IF=13, ELSEIF=14, ELSE=15, FOREACH=16, 
		IN=17, BEGIN=18, END=19, BREAK=20, QUIT=21, INT=22, CHAR=23, EQUAL=24, 
		NOTEQUAL=25, LT=26, GT=27, OR=28, AND=29, NOT=30, LPAR=31, RPAR=32, ADD=33, 
		SUB=34, MULT=35, DIV=36, ASSIGN=37, LBRAC=38, RBRAC=39, NEWLINE=40, SENDOP=41, 
		WS=42, ID=43, STRING=44, CHARACTER=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "LOWERCASE", "UPPERCASE", "NATURALDIGIT", "ARITHDIGIT", 
		"ARITHOPERANDS", "CM", "NATURALNUM", "ARITHNUM", "ACTOR", "RECEIVER", 
		"SENDER", "SELF", "READ", "WRITE", "IF", "ELSEIF", "ELSE", "FOREACH", 
		"IN", "BEGIN", "END", "BREAK", "QUIT", "INT", "CHAR", "EQUAL", "NOTEQUAL", 
		"LT", "GT", "OR", "AND", "NOT", "LPAR", "RPAR", "ADD", "SUB", "MULT", 
		"DIV", "ASSIGN", "LBRAC", "RBRAC", "NEWLINE", "SENDOP", "WS", "ID", "STRING", 
		"CHARACTER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'{'", "'}'", null, null, null, "'actor'", "'receiver'", 
		"'sender'", "'self'", "'read'", "'write'", "'if'", "'elseif'", "'else'", 
		"'foreach'", "'in'", "'begin'", "'end'", "'break'", "'quit'", "'int'", 
		"'char'", "'=='", "'<>'", "'<'", "'>'", "'or'", "'and'", "'not'", "'('", 
		"')'", "'+'", "'-'", "'*'", "'/'", "'='", "'['", "']'", null, "'<<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "CM", "NATURALNUM", "ARITHNUM", "ACTOR", "RECEIVER", 
		"SENDER", "SELF", "READ", "WRITE", "IF", "ELSEIF", "ELSE", "FOREACH", 
		"IN", "BEGIN", "END", "BREAK", "QUIT", "INT", "CHAR", "EQUAL", "NOTEQUAL", 
		"LT", "GT", "OR", "AND", "NOT", "LPAR", "RPAR", "ADD", "SUB", "MULT", 
		"DIV", "ASSIGN", "LBRAC", "RBRAC", "NEWLINE", "SENDOP", "WS", "ID", "STRING", 
		"CHARACTER"
	};
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


	  void print(String str){
	    System.out.println(str);
	  }


	public ATalkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ATalk.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u013f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\7\nz"+
		"\n\n\f\n\16\n}\13\n\3\n\3\n\3\13\3\13\7\13\u0083\n\13\f\13\16\13\u0086"+
		"\13\13\3\f\3\f\3\f\7\f\u008b\n\f\f\f\16\f\u008e\13\f\5\f\u0090\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\6.\u0118\n.\r.\16.\u0119\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\5\61\u0126\n\61\3\61\3\61\3\61\3"+
		"\61\7\61\u012c\n\61\f\61\16\61\u012f\13\61\3\62\3\62\7\62\u0133\n\62\f"+
		"\62\16\62\u0136\13\62\3\62\3\62\3\63\3\63\5\63\u013c\n\63\3\63\3\63\3"+
		"\u0134\2\64\3\3\5\4\7\5\t\2\13\2\r\2\17\2\21\2\23\6\25\7\27\b\31\t\33"+
		"\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67\30"+
		"9\31;\32=\33?\34A\35C\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a-c.e/\3\2\n\3"+
		"\2c|\3\2C\\\3\2\63;\3\2\62;\3\2,\61\3\2\f\f\5\2\13\13\17\17\"\"\3\2))"+
		"\2\u0146\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7k\3"+
		"\2\2\2\tm\3\2\2\2\13o\3\2\2\2\rq\3\2\2\2\17s\3\2\2\2\21u\3\2\2\2\23w\3"+
		"\2\2\2\25\u0080\3\2\2\2\27\u008f\3\2\2\2\31\u0091\3\2\2\2\33\u0097\3\2"+
		"\2\2\35\u00a0\3\2\2\2\37\u00a7\3\2\2\2!\u00ac\3\2\2\2#\u00b1\3\2\2\2%"+
		"\u00b7\3\2\2\2\'\u00ba\3\2\2\2)\u00c1\3\2\2\2+\u00c6\3\2\2\2-\u00ce\3"+
		"\2\2\2/\u00d1\3\2\2\2\61\u00d7\3\2\2\2\63\u00db\3\2\2\2\65\u00e1\3\2\2"+
		"\2\67\u00e6\3\2\2\29\u00ea\3\2\2\2;\u00ef\3\2\2\2=\u00f2\3\2\2\2?\u00f5"+
		"\3\2\2\2A\u00f7\3\2\2\2C\u00f9\3\2\2\2E\u00fc\3\2\2\2G\u0100\3\2\2\2I"+
		"\u0104\3\2\2\2K\u0106\3\2\2\2M\u0108\3\2\2\2O\u010a\3\2\2\2Q\u010c\3\2"+
		"\2\2S\u010e\3\2\2\2U\u0110\3\2\2\2W\u0112\3\2\2\2Y\u0114\3\2\2\2[\u0117"+
		"\3\2\2\2]\u011b\3\2\2\2_\u011e\3\2\2\2a\u0125\3\2\2\2c\u0130\3\2\2\2e"+
		"\u0139\3\2\2\2gh\7.\2\2h\4\3\2\2\2ij\7}\2\2j\6\3\2\2\2kl\7\177\2\2l\b"+
		"\3\2\2\2mn\t\2\2\2n\n\3\2\2\2op\t\3\2\2p\f\3\2\2\2qr\t\4\2\2r\16\3\2\2"+
		"\2st\t\5\2\2t\20\3\2\2\2uv\t\6\2\2v\22\3\2\2\2w{\7%\2\2xz\n\7\2\2yx\3"+
		"\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\b\n\2\2"+
		"\177\24\3\2\2\2\u0080\u0084\5\r\7\2\u0081\u0083\5\17\b\2\u0082\u0081\3"+
		"\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\26\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0090\7\62\2\2\u0088\u008c\5\r\7"+
		"\2\u0089\u008b\5\17\b\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0087\3\2\2\2\u008f\u0088\3\2\2\2\u0090\30\3\2\2\2\u0091\u0092"+
		"\7c\2\2\u0092\u0093\7e\2\2\u0093\u0094\7v\2\2\u0094\u0095\7q\2\2\u0095"+
		"\u0096\7t\2\2\u0096\32\3\2\2\2\u0097\u0098\7t\2\2\u0098\u0099\7g\2\2\u0099"+
		"\u009a\7e\2\2\u009a\u009b\7g\2\2\u009b\u009c\7k\2\2\u009c\u009d\7x\2\2"+
		"\u009d\u009e\7g\2\2\u009e\u009f\7t\2\2\u009f\34\3\2\2\2\u00a0\u00a1\7"+
		"u\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7f\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\u00a6\7t\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9"+
		"\7g\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7h\2\2\u00ab \3\2\2\2\u00ac\u00ad"+
		"\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7f\2\2\u00b0"+
		"\"\3\2\2\2\u00b1\u00b2\7y\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7k\2\2\u00b4"+
		"\u00b5\7v\2\2\u00b5\u00b6\7g\2\2\u00b6$\3\2\2\2\u00b7\u00b8\7k\2\2\u00b8"+
		"\u00b9\7h\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7n\2\2\u00bc"+
		"\u00bd\7u\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7h\2\2"+
		"\u00c0(\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7u\2"+
		"\2\u00c4\u00c5\7g\2\2\u00c5*\3\2\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7"+
		"q\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc"+
		"\7e\2\2\u00cc\u00cd\7j\2\2\u00cd,\3\2\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0.\3\2\2\2\u00d1\u00d2\7d\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4"+
		"\7i\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7p\2\2\u00d6\60\3\2\2\2\u00d7\u00d8"+
		"\7g\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7f\2\2\u00da\62\3\2\2\2\u00db\u00dc"+
		"\7d\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7c\2\2\u00df"+
		"\u00e0\7m\2\2\u00e0\64\3\2\2\2\u00e1\u00e2\7s\2\2\u00e2\u00e3\7w\2\2\u00e3"+
		"\u00e4\7k\2\2\u00e4\u00e5\7v\2\2\u00e5\66\3\2\2\2\u00e6\u00e7\7k\2\2\u00e7"+
		"\u00e8\7p\2\2\u00e8\u00e9\7v\2\2\u00e98\3\2\2\2\u00ea\u00eb\7e\2\2\u00eb"+
		"\u00ec\7j\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7t\2\2\u00ee:\3\2\2\2\u00ef"+
		"\u00f0\7?\2\2\u00f0\u00f1\7?\2\2\u00f1<\3\2\2\2\u00f2\u00f3\7>\2\2\u00f3"+
		"\u00f4\7@\2\2\u00f4>\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6@\3\2\2\2\u00f7\u00f8"+
		"\7@\2\2\u00f8B\3\2\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7t\2\2\u00fbD\3"+
		"\2\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7f\2\2\u00ff"+
		"F\3\2\2\2\u0100\u0101\7p\2\2\u0101\u0102\7q\2\2\u0102\u0103\7v\2\2\u0103"+
		"H\3\2\2\2\u0104\u0105\7*\2\2\u0105J\3\2\2\2\u0106\u0107\7+\2\2\u0107L"+
		"\3\2\2\2\u0108\u0109\7-\2\2\u0109N\3\2\2\2\u010a\u010b\7/\2\2\u010bP\3"+
		"\2\2\2\u010c\u010d\7,\2\2\u010dR\3\2\2\2\u010e\u010f\7\61\2\2\u010fT\3"+
		"\2\2\2\u0110\u0111\7?\2\2\u0111V\3\2\2\2\u0112\u0113\7]\2\2\u0113X\3\2"+
		"\2\2\u0114\u0115\7_\2\2\u0115Z\3\2\2\2\u0116\u0118\7\f\2\2\u0117\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\\\3\2\2\2\u011b\u011c\7>\2\2\u011c\u011d\7>\2\2\u011d^\3\2\2\2\u011e"+
		"\u011f\t\b\2\2\u011f\u0120\3\2\2\2\u0120\u0121\b\60\2\2\u0121`\3\2\2\2"+
		"\u0122\u0126\7a\2\2\u0123\u0126\5\t\5\2\u0124\u0126\5\13\6\2\u0125\u0122"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126\u012d\3\2\2\2\u0127"+
		"\u012c\7a\2\2\u0128\u012c\5\t\5\2\u0129\u012c\5\13\6\2\u012a\u012c\5\17"+
		"\b\2\u012b\u0127\3\2\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012eb\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0134\7$\2\2\u0131\u0133"+
		"\13\2\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0135\3\2\2\2"+
		"\u0134\u0132\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138"+
		"\7$\2\2\u0138d\3\2\2\2\u0139\u013b\t\t\2\2\u013a\u013c\13\2\2\2\u013b"+
		"\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\t\t"+
		"\2\2\u013ef\3\2\2\2\r\2{\u0084\u008c\u008f\u0119\u0125\u012b\u012d\u0134"+
		"\u013b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}