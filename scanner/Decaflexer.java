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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 1: OBVIAR_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void OBVIAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4,\u00fb\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\3\6\3`\n\3\r"+
		"\3\16\3a\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3+\3+\3+\3+\2,\3\3\1\5\4\2\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1"+
		"\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24"+
		"\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36"+
		"\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1\3\2\5\5"+
		"C\\aac|\6\62;C\\aac|\5\13\f\17\17\"\"\u00fc\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5_\3"+
		"\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\rk\3\2\2\2\17m\3\2\2\2\21o\3"+
		"\2\2\2\23q\3\2\2\2\25s\3\2\2\2\27u\3\2\2\2\31x\3\2\2\2\33{\3\2\2\2\35"+
		"~\3\2\2\2\37\u0081\3\2\2\2!\u0083\3\2\2\2#\u0085\3\2\2\2%\u0088\3\2\2"+
		"\2\'\u008b\3\2\2\2)\u008d\3\2\2\2+\u008f\3\2\2\2-\u0091\3\2\2\2/\u0093"+
		"\3\2\2\2\61\u0095\3\2\2\2\63\u0097\3\2\2\2\65\u009f\3\2\2\2\67\u00a7\3"+
		"\2\2\29\u00ad\3\2\2\2;\u00b5\3\2\2\2=\u00bb\3\2\2\2?\u00c4\3\2\2\2A\u00c9"+
		"\3\2\2\2C\u00cf\3\2\2\2E\u00d3\3\2\2\2G\u00d6\3\2\2\2I\u00da\3\2\2\2K"+
		"\u00e1\3\2\2\2M\u00e6\3\2\2\2O\u00eb\3\2\2\2Q\u00ed\3\2\2\2S\u00ef\3\2"+
		"\2\2U\u00f7\3\2\2\2W[\t\2\2\2XZ\t\3\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2"+
		"[\\\3\2\2\2\\\4\3\2\2\2][\3\2\2\2^`\t\4\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2"+
		"\2\2ab\3\2\2\2bc\3\2\2\2cd\b\3\2\2d\6\3\2\2\2ef\4\62;\2f\b\3\2\2\2gh\7"+
		"-\2\2h\n\3\2\2\2ij\7/\2\2j\f\3\2\2\2kl\7,\2\2l\16\3\2\2\2mn\7\61\2\2n"+
		"\20\3\2\2\2op\7#\2\2p\22\3\2\2\2qr\7\'\2\2r\24\3\2\2\2st\7?\2\2t\26\3"+
		"\2\2\2uv\7~\2\2vw\7~\2\2w\30\3\2\2\2xy\7(\2\2yz\7(\2\2z\32\3\2\2\2{|\7"+
		"-\2\2|}\7?\2\2}\34\3\2\2\2~\177\7/\2\2\177\u0080\7?\2\2\u0080\36\3\2\2"+
		"\2\u0081\u0082\7@\2\2\u0082 \3\2\2\2\u0083\u0084\7>\2\2\u0084\"\3\2\2"+
		"\2\u0085\u0086\7@\2\2\u0086\u0087\7?\2\2\u0087$\3\2\2\2\u0088\u0089\7"+
		">\2\2\u0089\u008a\7?\2\2\u008a&\3\2\2\2\u008b\u008c\7}\2\2\u008c(\3\2"+
		"\2\2\u008d\u008e\7\177\2\2\u008e*\3\2\2\2\u008f\u0090\7*\2\2\u0090,\3"+
		"\2\2\2\u0091\u0092\7+\2\2\u0092.\3\2\2\2\u0093\u0094\7]\2\2\u0094\60\3"+
		"\2\2\2\u0095\u0096\7_\2\2\u0096\62\3\2\2\2\u0097\u0098\7R\2\2\u0098\u0099"+
		"\7t\2\2\u0099\u009a\7q\2\2\u009a\u009b\7i\2\2\u009b\u009c\7t\2\2\u009c"+
		"\u009d\7c\2\2\u009d\u009e\7o\2\2\u009e\64\3\2\2\2\u009f\u00a0\7d\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7g\2\2"+
		"\u00a4\u00a5\7c\2\2\u00a5\u00a6\7p\2\2\u00a6\66\3\2\2\2\u00a7\u00a8\7"+
		"d\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac"+
		"\7m\2\2\u00ac8\3\2\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7c\2\2\u00af\u00b0"+
		"\7n\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7w\2\2\u00b3"+
		"\u00b4\7v\2\2\u00b4:\3\2\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7n\2\2\u00b7"+
		"\u00b8\7c\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7u\2\2\u00ba<\3\2\2\2\u00bb"+
		"\u00bc\7e\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7v\2\2"+
		"\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3"+
		"\7g\2\2\u00c3>\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7"+
		"\7u\2\2\u00c7\u00c8\7g\2\2\u00c8@\3\2\2\2\u00c9\u00ca\7h\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce"+
		"B\3\2\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7t\2\2\u00d2"+
		"D\3\2\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7h\2\2\u00d5F\3\2\2\2\u00d6\u00d7"+
		"\7k\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7v\2\2\u00d9H\3\2\2\2\u00da\u00db"+
		"\7t\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7w\2\2\u00de"+
		"\u00df\7t\2\2\u00df\u00e0\7p\2\2\u00e0J\3\2\2\2\u00e1\u00e2\7v\2\2\u00e2"+
		"\u00e3\7t\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5\7g\2\2\u00e5L\3\2\2\2\u00e6"+
		"\u00e7\7x\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7f\2\2"+
		"\u00eaN\3\2\2\2\u00eb\u00ec\7.\2\2\u00ecP\3\2\2\2\u00ed\u00ee\7=\2\2\u00ee"+
		"R\3\2\2\2\u00ef\u00f0\7$\2\2\u00f0\u00f1\7\"\2\2\u00f1\u00f2\7\60\2\2"+
		"\u00f2\u00f3\7,\2\2\u00f3\u00f4\7\"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6"+
		"\7$\2\2\u00f6T\3\2\2\2\u00f7\u00f8\7)\2\2\u00f8\u00f9\13\2\2\2\u00f9\u00fa"+
		"\7)\2\2\u00faV\3\2\2\2\5\2[a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}