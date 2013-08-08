// Generated from Decaf.g by ANTLR 4.0

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
public class Decaf extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, OBVIAR=2, NUMEROS=3, MAS=4, MENOS=5, MULTIPLICACION=6, DIVISION=7, 
		NEGADO=8, MODULO=9, IGUAL=10, OR=11, AND=12, MASIGUAL=13, MENOSIGUAL=14, 
		MAYORQUE=15, MENORQUE=16, MAYORIGUAL=17, MENORIGUAL=18, LLAVEI=19, LLAVED=20, 
		PARENTESISI=21, PARENTESISD=22, CORCHETEI=23, CORCHETED=24, PROGRAM=25, 
		BOOLEAN=26, BREAK=27, CALLOUT=28, CLASS=29, CONTINUE=30, ELSE=31, FALSE=32, 
		FOR=33, IF=34, INT=35, RETURN=36, TRUE=37, VOID=38, COMA=39, PUNTOCOMA=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"ID", "OBVIAR", "NUMEROS", "'+'", "'-'", "'*'", "'/'", "'!'", "'%'", "'='", 
		"'||'", "'&&'", "'+='", "'-='", "'>'", "'<'", "'>='", "'<='", "'{'", "'}'", 
		"'('", "')'", "'['", "']'", "'Program'", "'boolean'", "'break'", "'callout'", 
		"'class'", "'continue'", "'else'", "'false'", "'for'", "'if'", "'int'", 
		"'return'", "'true'", "'void'", "','", "';'"
	};
	public static final String[] ruleNames = {
		"ID", "OBVIAR", "NUMEROS", "MAS", "MENOS", "MULTIPLICACION", "DIVISION", 
		"NEGADO", "MODULO", "IGUAL", "OR", "AND", "MASIGUAL", "MENOSIGUAL", "MAYORQUE", 
		"MENORQUE", "MAYORIGUAL", "MENORIGUAL", "LLAVEI", "LLAVED", "PARENTESISI", 
		"PARENTESISD", "CORCHETEI", "CORCHETED", "PROGRAM", "BOOLEAN", "BREAK", 
		"CALLOUT", "CLASS", "CONTINUE", "ELSE", "FALSE", "FOR", "IF", "INT", "RETURN", 
		"TRUE", "VOID", "COMA", "PUNTOCOMA"
	};


	public Decaf(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Decaf.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4*\u00e6\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\3\2\3\2\7\2V\n\2\f\2\16\2Y\13\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3)\3)\2*\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1"+
		"\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1"+
		";\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1\3\2\5\5C\\aac|\6"+
		"\62;C\\aac|\5\13\f\17\17\"\"\u00e6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5Z\3\2\2\2\7\\\3\2\2\2\t^\3\2\2\2\13`"+
		"\3\2\2\2\rb\3\2\2\2\17d\3\2\2\2\21f\3\2\2\2\23h\3\2\2\2\25j\3\2\2\2\27"+
		"l\3\2\2\2\31o\3\2\2\2\33r\3\2\2\2\35u\3\2\2\2\37x\3\2\2\2!z\3\2\2\2#|"+
		"\3\2\2\2%\177\3\2\2\2\'\u0082\3\2\2\2)\u0084\3\2\2\2+\u0086\3\2\2\2-\u0088"+
		"\3\2\2\2/\u008a\3\2\2\2\61\u008c\3\2\2\2\63\u008e\3\2\2\2\65\u0096\3\2"+
		"\2\2\67\u009e\3\2\2\29\u00a4\3\2\2\2;\u00ac\3\2\2\2=\u00b2\3\2\2\2?\u00bb"+
		"\3\2\2\2A\u00c0\3\2\2\2C\u00c6\3\2\2\2E\u00ca\3\2\2\2G\u00cd\3\2\2\2I"+
		"\u00d1\3\2\2\2K\u00d8\3\2\2\2M\u00dd\3\2\2\2O\u00e2\3\2\2\2Q\u00e4\3\2"+
		"\2\2SW\t\2\2\2TV\t\3\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\4\3"+
		"\2\2\2YW\3\2\2\2Z[\t\4\2\2[\6\3\2\2\2\\]\4\62;\2]\b\3\2\2\2^_\7-\2\2_"+
		"\n\3\2\2\2`a\7/\2\2a\f\3\2\2\2bc\7,\2\2c\16\3\2\2\2de\7\61\2\2e\20\3\2"+
		"\2\2fg\7#\2\2g\22\3\2\2\2hi\7\'\2\2i\24\3\2\2\2jk\7?\2\2k\26\3\2\2\2l"+
		"m\7~\2\2mn\7~\2\2n\30\3\2\2\2op\7(\2\2pq\7(\2\2q\32\3\2\2\2rs\7-\2\2s"+
		"t\7?\2\2t\34\3\2\2\2uv\7/\2\2vw\7?\2\2w\36\3\2\2\2xy\7@\2\2y \3\2\2\2"+
		"z{\7>\2\2{\"\3\2\2\2|}\7@\2\2}~\7?\2\2~$\3\2\2\2\177\u0080\7>\2\2\u0080"+
		"\u0081\7?\2\2\u0081&\3\2\2\2\u0082\u0083\7}\2\2\u0083(\3\2\2\2\u0084\u0085"+
		"\7\177\2\2\u0085*\3\2\2\2\u0086\u0087\7*\2\2\u0087,\3\2\2\2\u0088\u0089"+
		"\7+\2\2\u0089.\3\2\2\2\u008a\u008b\7]\2\2\u008b\60\3\2\2\2\u008c\u008d"+
		"\7_\2\2\u008d\62\3\2\2\2\u008e\u008f\7R\2\2\u008f\u0090\7t\2\2\u0090\u0091"+
		"\7q\2\2\u0091\u0092\7i\2\2\u0092\u0093\7t\2\2\u0093\u0094\7c\2\2\u0094"+
		"\u0095\7o\2\2\u0095\64\3\2\2\2\u0096\u0097\7d\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7q\2\2\u0099\u009a\7n\2\2\u009a\u009b\7g\2\2\u009b\u009c\7c\2\2"+
		"\u009c\u009d\7p\2\2\u009d\66\3\2\2\2\u009e\u009f\7d\2\2\u009f\u00a0\7"+
		"t\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7m\2\2\u00a38"+
		"\3\2\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7n\2\2\u00a7"+
		"\u00a8\7n\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7v\2\2"+
		"\u00ab:\3\2\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7c\2"+
		"\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7u\2\2\u00b1<\3\2\2\2\u00b2\u00b3\7"+
		"e\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7"+
		"\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		">\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7u\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf@\3\2\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2\7c\2\2\u00c2"+
		"\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7g\2\2\u00c5B\3\2\2\2\u00c6"+
		"\u00c7\7h\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7t\2\2\u00c9D\3\2\2\2\u00ca"+
		"\u00cb\7k\2\2\u00cb\u00cc\7h\2\2\u00ccF\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce"+
		"\u00cf\7p\2\2\u00cf\u00d0\7v\2\2\u00d0H\3\2\2\2\u00d1\u00d2\7t\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7t\2\2"+
		"\u00d6\u00d7\7p\2\2\u00d7J\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7t\2"+
		"\2\u00da\u00db\7w\2\2\u00db\u00dc\7g\2\2\u00dcL\3\2\2\2\u00dd\u00de\7"+
		"x\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7f\2\2\u00e1N"+
		"\3\2\2\2\u00e2\u00e3\7.\2\2\u00e3P\3\2\2\2\u00e4\u00e5\7=\2\2\u00e5R\3"+
		"\2\2\2\4\2W";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}