// Generated from Decaflexer.g by ANTLR 4.0

package compiler.scanner;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Decaflexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, OBVIAR=2, NUMEROS=3, MAS=4, MENOS=5, MULTIPLICACION=6, DIVISION=7, 
		NEGADO=8, MODULO=9, IGUAL=10, OR=11, AND=12, MASIGUAL=13, MENOSIGUAL=14, 
		MAYORQUE=15, MENORQUE=16, MAYORIGUAL=17, MENORIGUAL=18, LLAVEI=19, LLAVED=20, 
		PARENTESISI=21, PARENTESISD=22, CORCHETEI=23, CORCHETED=24, PROGRAM=25, 
		BOOLEAN=26, BREAK=27, CALLOUT=28, CLASS=29, CONTINUE=30, ELSE=31, FALSE=32, 
		FOR=33, IF=34, INT=35, RETURN=36, TRUE=37, VOID=38, COMA=39, PUNTOCOMA=40, 
		CHAIN=41, CARACTER=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"ID", "OBVIAR", "NUMEROS", "'+'", "'-'", "'*'", "'/'", "'!'", "'%'", "'='", 
		"'||'", "'&&'", "'+='", "'-='", "'>'", "'<'", "'>='", "'<='", "'{'", "'}'", 
		"'('", "')'", "'['", "']'", "'Program'", "'boolean'", "'break'", "'callout'", 
		"'class'", "'continue'", "'else'", "'false'", "'for'", "'if'", "'int'", 
		"'return'", "'true'", "'void'", "','", "';'", "CHAIN", "CARACTER"
	};
	public static final String[] ruleNames = {
		"ID", "OBVIAR", "NUMEROS", "MAS", "MENOS", "MULTIPLICACION", "DIVISION", 
		"NEGADO", "MODULO", "IGUAL", "OR", "AND", "MASIGUAL", "MENOSIGUAL", "MAYORQUE", 
		"MENORQUE", "MAYORIGUAL", "MENORIGUAL", "LLAVEI", "LLAVED", "PARENTESISI", 
		"PARENTESISD", "CORCHETEI", "CORCHETED", "PROGRAM", "BOOLEAN", "BREAK", 
		"CALLOUT", "CLASS", "CONTINUE", "ELSE", "FALSE", "FOR", "IF", "INT", "RETURN", 
		"TRUE", "VOID", "COMA", "PUNTOCOMA", "CHAIN", "CARACTER"
	};


	public Decaflexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Decaflexer.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4,\u00f6\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\2,\3"+
		"\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r"+
		"\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\""+
		"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1\3\2\5\5C\\aac|\6\62;C\\aa"+
		"c|\5\13\f\17\17\"\"\u00f6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5^\3\2\2\2\7`\3\2\2\2\tb"+
		"\3\2\2\2\13d\3\2\2\2\rf\3\2\2\2\17h\3\2\2\2\21j\3\2\2\2\23l\3\2\2\2\25"+
		"n\3\2\2\2\27p\3\2\2\2\31s\3\2\2\2\33v\3\2\2\2\35y\3\2\2\2\37|\3\2\2\2"+
		"!~\3\2\2\2#\u0080\3\2\2\2%\u0083\3\2\2\2\'\u0086\3\2\2\2)\u0088\3\2\2"+
		"\2+\u008a\3\2\2\2-\u008c\3\2\2\2/\u008e\3\2\2\2\61\u0090\3\2\2\2\63\u0092"+
		"\3\2\2\2\65\u009a\3\2\2\2\67\u00a2\3\2\2\29\u00a8\3\2\2\2;\u00b0\3\2\2"+
		"\2=\u00b6\3\2\2\2?\u00bf\3\2\2\2A\u00c4\3\2\2\2C\u00ca\3\2\2\2E\u00ce"+
		"\3\2\2\2G\u00d1\3\2\2\2I\u00d5\3\2\2\2K\u00dc\3\2\2\2M\u00e1\3\2\2\2O"+
		"\u00e6\3\2\2\2Q\u00e8\3\2\2\2S\u00ea\3\2\2\2U\u00f2\3\2\2\2W[\t\2\2\2"+
		"XZ\t\3\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\4\3\2\2\2][\3\2"+
		"\2\2^_\t\4\2\2_\6\3\2\2\2`a\4\62;\2a\b\3\2\2\2bc\7-\2\2c\n\3\2\2\2de\7"+
		"/\2\2e\f\3\2\2\2fg\7,\2\2g\16\3\2\2\2hi\7\61\2\2i\20\3\2\2\2jk\7#\2\2"+
		"k\22\3\2\2\2lm\7\'\2\2m\24\3\2\2\2no\7?\2\2o\26\3\2\2\2pq\7~\2\2qr\7~"+
		"\2\2r\30\3\2\2\2st\7(\2\2tu\7(\2\2u\32\3\2\2\2vw\7-\2\2wx\7?\2\2x\34\3"+
		"\2\2\2yz\7/\2\2z{\7?\2\2{\36\3\2\2\2|}\7@\2\2} \3\2\2\2~\177\7>\2\2\177"+
		"\"\3\2\2\2\u0080\u0081\7@\2\2\u0081\u0082\7?\2\2\u0082$\3\2\2\2\u0083"+
		"\u0084\7>\2\2\u0084\u0085\7?\2\2\u0085&\3\2\2\2\u0086\u0087\7}\2\2\u0087"+
		"(\3\2\2\2\u0088\u0089\7\177\2\2\u0089*\3\2\2\2\u008a\u008b\7*\2\2\u008b"+
		",\3\2\2\2\u008c\u008d\7+\2\2\u008d.\3\2\2\2\u008e\u008f\7]\2\2\u008f\60"+
		"\3\2\2\2\u0090\u0091\7_\2\2\u0091\62\3\2\2\2\u0092\u0093\7R\2\2\u0093"+
		"\u0094\7t\2\2\u0094\u0095\7q\2\2\u0095\u0096\7i\2\2\u0096\u0097\7t\2\2"+
		"\u0097\u0098\7c\2\2\u0098\u0099\7o\2\2\u0099\64\3\2\2\2\u009a\u009b\7"+
		"d\2\2\u009b\u009c\7q\2\2\u009c\u009d\7q\2\2\u009d\u009e\7n\2\2\u009e\u009f"+
		"\7g\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7p\2\2\u00a1\66\3\2\2\2\u00a2\u00a3"+
		"\7d\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7c\2\2\u00a6"+
		"\u00a7\7m\2\2\u00a78\3\2\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7c\2\2\u00aa"+
		"\u00ab\7n\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7w\2\2"+
		"\u00ae\u00af\7v\2\2\u00af:\3\2\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7n\2"+
		"\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7u\2\2\u00b5<\3\2"+
		"\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba"+
		"\7v\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7w\2\2\u00bd"+
		"\u00be\7g\2\2\u00be>\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7n\2\2\u00c1"+
		"\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3@\3\2\2\2\u00c4\u00c5\7h\2\2\u00c5"+
		"\u00c6\7c\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7g\2\2"+
		"\u00c9B\3\2\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7t\2"+
		"\2\u00cdD\3\2\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7h\2\2\u00d0F\3\2\2\2"+
		"\u00d1\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7v\2\2\u00d4H\3\2\2"+
		"\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9"+
		"\7w\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7p\2\2\u00dbJ\3\2\2\2\u00dc\u00dd"+
		"\7v\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7g\2\2\u00e0"+
		"L\3\2\2\2\u00e1\u00e2\7x\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7k\2\2\u00e4"+
		"\u00e5\7f\2\2\u00e5N\3\2\2\2\u00e6\u00e7\7.\2\2\u00e7P\3\2\2\2\u00e8\u00e9"+
		"\7=\2\2\u00e9R\3\2\2\2\u00ea\u00eb\7$\2\2\u00eb\u00ec\7\"\2\2\u00ec\u00ed"+
		"\7\60\2\2\u00ed\u00ee\7,\2\2\u00ee\u00ef\7\"\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\7$\2\2\u00f1T\3\2\2\2\u00f2\u00f3\7)\2\2\u00f3\u00f4\13\2\2\2\u00f4"+
		"\u00f5\7)\2\2\u00f5V\3\2\2\2\4\2[";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}