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
		FOR=33, IF=34, INT=35, RETURN=36, TRUE=37, VOID=38, COMA=39, PUNTOCOMA=40, 
		CHAIN=41, CARACTER=42, COMENTARIO=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"ID", "OBVIAR", "NUMEROS", "'+'", "'-'", "'*'", "'/'", "'!'", "'%'", "'='", 
		"'||'", "'&&'", "'+='", "'-='", "'>'", "'<'", "'>='", "'<='", "'{'", "'}'", 
		"'('", "')'", "'['", "']'", "'Program'", "'boolean'", "'break'", "'callout'", 
		"'class'", "'continue'", "'else'", "'false'", "'for'", "'if'", "'int'", 
		"'return'", "'true'", "'void'", "','", "';'", "CHAIN", "CARACTER", "'//CARACTER'"
	};
	public static final String[] ruleNames = {
		"ID", "OBVIAR", "NUMEROS", "MAS", "MENOS", "MULTIPLICACION", "DIVISION", 
		"NEGADO", "MODULO", "IGUAL", "OR", "AND", "MASIGUAL", "MENOSIGUAL", "MAYORQUE", 
		"MENORQUE", "MAYORIGUAL", "MENORIGUAL", "LLAVEI", "LLAVED", "PARENTESISI", 
		"PARENTESISD", "CORCHETEI", "CORCHETED", "PROGRAM", "BOOLEAN", "BREAK", 
		"CALLOUT", "CLASS", "CONTINUE", "ELSE", "FALSE", "FOR", "IF", "INT", "RETURN", 
		"TRUE", "VOID", "COMA", "PUNTOCOMA", "CHAIN", "CARACTER", "COMENTARIO"
	};


	    
	    protected String m_out_put = "";    
	    
	    public String getOutPut() {
	        return m_out_put;
	    }

	    protected void AddToOutPut(String text) {
	        m_out_put = text;
	    }


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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: ID_action((RuleContext)_localctx, actionIndex); break;

		case 1: OBVIAR_action((RuleContext)_localctx, actionIndex); break;

		case 2: NUMEROS_action((RuleContext)_localctx, actionIndex); break;

		case 3: MAS_action((RuleContext)_localctx, actionIndex); break;

		case 4: MENOS_action((RuleContext)_localctx, actionIndex); break;

		case 5: MULTIPLICACION_action((RuleContext)_localctx, actionIndex); break;

		case 6: DIVISION_action((RuleContext)_localctx, actionIndex); break;

		case 7: NEGADO_action((RuleContext)_localctx, actionIndex); break;

		case 8: MODULO_action((RuleContext)_localctx, actionIndex); break;

		case 9: IGUAL_action((RuleContext)_localctx, actionIndex); break;

		case 10: OR_action((RuleContext)_localctx, actionIndex); break;

		case 11: AND_action((RuleContext)_localctx, actionIndex); break;

		case 12: MASIGUAL_action((RuleContext)_localctx, actionIndex); break;

		case 13: MENOSIGUAL_action((RuleContext)_localctx, actionIndex); break;

		case 14: MAYORQUE_action((RuleContext)_localctx, actionIndex); break;

		case 15: MENORQUE_action((RuleContext)_localctx, actionIndex); break;

		case 16: MAYORIGUAL_action((RuleContext)_localctx, actionIndex); break;

		case 17: MENORIGUAL_action((RuleContext)_localctx, actionIndex); break;

		case 18: LLAVEI_action((RuleContext)_localctx, actionIndex); break;

		case 19: LLAVED_action((RuleContext)_localctx, actionIndex); break;

		case 20: PARENTESISI_action((RuleContext)_localctx, actionIndex); break;

		case 21: PARENTESISD_action((RuleContext)_localctx, actionIndex); break;

		case 22: CORCHETEI_action((RuleContext)_localctx, actionIndex); break;

		case 23: CORCHETED_action((RuleContext)_localctx, actionIndex); break;

		case 24: PROGRAM_action((RuleContext)_localctx, actionIndex); break;

		case 25: BOOLEAN_action((RuleContext)_localctx, actionIndex); break;

		case 26: BREAK_action((RuleContext)_localctx, actionIndex); break;

		case 27: CALLOUT_action((RuleContext)_localctx, actionIndex); break;

		case 28: CLASS_action((RuleContext)_localctx, actionIndex); break;

		case 29: CONTINUE_action((RuleContext)_localctx, actionIndex); break;

		case 30: ELSE_action((RuleContext)_localctx, actionIndex); break;

		case 31: FALSE_action((RuleContext)_localctx, actionIndex); break;

		case 32: FOR_action((RuleContext)_localctx, actionIndex); break;

		case 33: IF_action((RuleContext)_localctx, actionIndex); break;

		case 34: INT_action((RuleContext)_localctx, actionIndex); break;

		case 35: RETURN_action((RuleContext)_localctx, actionIndex); break;

		case 36: TRUE_action((RuleContext)_localctx, actionIndex); break;

		case 37: VOID_action((RuleContext)_localctx, actionIndex); break;

		case 38: COMA_action((RuleContext)_localctx, actionIndex); break;

		case 39: PUNTOCOMA_action((RuleContext)_localctx, actionIndex); break;

		case 40: CHAIN_action((RuleContext)_localctx, actionIndex); break;

		case 41: CARACTER_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void CLASS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28: AddToOutPut("class"); break;
		}
	}
	private void MODULO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: AddToOutPut("MODULO"); break;
		}
	}
	private void CARACTER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 41: AddToOutPut("CHAR"); break;
		}
	}
	private void MASIGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: AddToOutPut("MASIGUAL"); break;
		}
	}
	private void MENOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: AddToOutPut("MENOS"); break;
		}
	}
	private void OBVIAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  skip();  break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30: AddToOutPut("else"); break;
		}
	}
	private void FOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32: AddToOutPut("for"); break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34: AddToOutPut("int"); break;
		}
	}
	private void PUNTOCOMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 39: AddToOutPut("PUNTOCOMA"); break;
		}
	}
	private void MENORIGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17: AddToOutPut("MENORIGUAL"); break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: AddToOutPut("AND"); break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  AddToOutPut("ID");  break;
		}
	}
	private void COMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 38: AddToOutPut("COMA"); break;
		}
	}
	private void TRUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 36: AddToOutPut("true"); break;
		}
	}
	private void NUMEROS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:  AddToOutPut("NUMERO"); break;
		}
	}
	private void BREAK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26: AddToOutPut("break"); break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33: AddToOutPut("if"); break;
		}
	}
	private void PARENTESISD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21: AddToOutPut("PARENTESISD"); break;
		}
	}
	private void LLAVEI_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18: AddToOutPut("LLAVEI"); break;
		}
	}
	private void BOOLEAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25: AddToOutPut("boolean"); break;
		}
	}
	private void MULTIPLICACION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: AddToOutPut("MULTIPLICACION"); break;
		}
	}
	private void MENORQUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15: AddToOutPut("MENORQUE"); break;
		}
	}
	private void PARENTESISI_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20: AddToOutPut("PARENTESISI"); break;
		}
	}
	private void CONTINUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29: AddToOutPut("continue"); break;
		}
	}
	private void NEGADO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: AddToOutPut("NEGADO"); break;
		}
	}
	private void MAS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: AddToOutPut("MAS"); break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: AddToOutPut("OR"); break;
		}
	}
	private void LLAVED_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19: AddToOutPut("LLAVED"); break;
		}
	}
	private void RETURN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35: AddToOutPut("return"); break;
		}
	}
	private void DIVISION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: AddToOutPut("DIVISION"); break;
		}
	}
	private void CORCHETEI_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22: AddToOutPut("CORCHETEI"); break;
		}
	}
	private void PROGRAM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24: AddToOutPut("Program"); break;
		}
	}
	private void VOID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 37: AddToOutPut("void"); break;
		}
	}
	private void IGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: AddToOutPut("IGUAL"); break;
		}
	}
	private void CORCHETED_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23: AddToOutPut("CORCHETED"); break;
		}
	}
	private void FALSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31: AddToOutPut("false"); break;
		}
	}
	private void MAYORQUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14: AddToOutPut("MAYORQUE"); break;
		}
	}
	private void MAYORIGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16: AddToOutPut("MAYORIGUAL"); break;
		}
	}
	private void MENOSIGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: AddToOutPut("MENOSIGUAL"); break;
		}
	}
	private void CHAIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 40: AddToOutPut("STRING"); break;
		}
	}
	private void CALLOUT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27: AddToOutPut("callout"); break;
		}
	}

	public static final String _serializedATN =
		"\2\4-\u014a\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\3\2\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\2\3\2"+
		"\3\3\6\3d\n\3\r\3\16\3e\3\3\3\3\3\4\6\4k\n\4\r\4\16\4l\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\2-\3\3\2\5"+
		"\4\3\7\5\4\t\6\5\13\7\6\r\b\7\17\t\b\21\n\t\23\13\n\25\f\13\27\r\f\31"+
		"\16\r\33\17\16\35\20\17\37\21\20!\22\21#\23\22%\24\23\'\25\24)\26\25+"+
		"\27\26-\30\27/\31\30\61\32\31\63\33\32\65\34\33\67\35\349\36\35;\37\36"+
		"= \37?! A\"!C#\"E$#G%$I&%K\'&M(\'O)(Q*)S+*U,+W-\1\3\2\5\5C\\aac|\6\62"+
		";C\\aac|\5\13\f\17\17\"\"\u014c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5c\3\2"+
		"\2\2\7j\3\2\2\2\tp\3\2\2\2\13s\3\2\2\2\rv\3\2\2\2\17y\3\2\2\2\21|\3\2"+
		"\2\2\23\177\3\2\2\2\25\u0082\3\2\2\2\27\u0085\3\2\2\2\31\u008a\3\2\2\2"+
		"\33\u008f\3\2\2\2\35\u0094\3\2\2\2\37\u0099\3\2\2\2!\u009c\3\2\2\2#\u009f"+
		"\3\2\2\2%\u00a4\3\2\2\2\'\u00a9\3\2\2\2)\u00ac\3\2\2\2+\u00af\3\2\2\2"+
		"-\u00b2\3\2\2\2/\u00b5\3\2\2\2\61\u00b8\3\2\2\2\63\u00bb\3\2\2\2\65\u00c5"+
		"\3\2\2\2\67\u00cf\3\2\2\29\u00d7\3\2\2\2;\u00e1\3\2\2\2=\u00e9\3\2\2\2"+
		"?\u00f4\3\2\2\2A\u00fb\3\2\2\2C\u0103\3\2\2\2E\u0109\3\2\2\2G\u010e\3"+
		"\2\2\2I\u0114\3\2\2\2K\u011d\3\2\2\2M\u0124\3\2\2\2O\u012b\3\2\2\2Q\u012e"+
		"\3\2\2\2S\u0131\3\2\2\2U\u013a\3\2\2\2W\u013f\3\2\2\2Y]\t\2\2\2Z\\\t\3"+
		"\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\b"+
		"\2\2\2a\4\3\2\2\2bd\t\4\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg"+
		"\3\2\2\2gh\b\3\3\2h\6\3\2\2\2ik\4\62;\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2"+
		"lm\3\2\2\2mn\3\2\2\2no\b\4\4\2o\b\3\2\2\2pq\7-\2\2qr\b\5\5\2r\n\3\2\2"+
		"\2st\7/\2\2tu\b\6\6\2u\f\3\2\2\2vw\7,\2\2wx\b\7\7\2x\16\3\2\2\2yz\7\61"+
		"\2\2z{\b\b\b\2{\20\3\2\2\2|}\7#\2\2}~\b\t\t\2~\22\3\2\2\2\177\u0080\7"+
		"\'\2\2\u0080\u0081\b\n\n\2\u0081\24\3\2\2\2\u0082\u0083\7?\2\2\u0083\u0084"+
		"\b\13\13\2\u0084\26\3\2\2\2\u0085\u0086\7~\2\2\u0086\u0087\7~\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\b\f\f\2\u0089\30\3\2\2\2\u008a\u008b\7(\2\2"+
		"\u008b\u008c\7(\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\r\r\2\u008e\32\3"+
		"\2\2\2\u008f\u0090\7-\2\2\u0090\u0091\7?\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\b\16\16\2\u0093\34\3\2\2\2\u0094\u0095\7/\2\2\u0095\u0096\7?\2"+
		"\2\u0096\u0097\3\2\2\2\u0097\u0098\b\17\17\2\u0098\36\3\2\2\2\u0099\u009a"+
		"\7@\2\2\u009a\u009b\b\20\20\2\u009b \3\2\2\2\u009c\u009d\7>\2\2\u009d"+
		"\u009e\b\21\21\2\u009e\"\3\2\2\2\u009f\u00a0\7@\2\2\u00a0\u00a1\7?\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\22\22\2\u00a3$\3\2\2\2\u00a4\u00a5"+
		"\7>\2\2\u00a5\u00a6\7?\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\23\23\2\u00a8"+
		"&\3\2\2\2\u00a9\u00aa\7}\2\2\u00aa\u00ab\b\24\24\2\u00ab(\3\2\2\2\u00ac"+
		"\u00ad\7\177\2\2\u00ad\u00ae\b\25\25\2\u00ae*\3\2\2\2\u00af\u00b0\7*\2"+
		"\2\u00b0\u00b1\b\26\26\2\u00b1,\3\2\2\2\u00b2\u00b3\7+\2\2\u00b3\u00b4"+
		"\b\27\27\2\u00b4.\3\2\2\2\u00b5\u00b6\7]\2\2\u00b6\u00b7\b\30\30\2\u00b7"+
		"\60\3\2\2\2\u00b8\u00b9\7_\2\2\u00b9\u00ba\b\31\31\2\u00ba\62\3\2\2\2"+
		"\u00bb\u00bc\7R\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7q\2\2\u00be\u00bf"+
		"\7i\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7o\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\b\32\32\2\u00c4\64\3\2\2\2\u00c5\u00c6\7d\2"+
		"\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca"+
		"\7g\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\b\33\33\2\u00ce\66\3\2\2\2\u00cf\u00d0\7d\2\2\u00d0\u00d1\7t\2"+
		"\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7m\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\b\34\34\2\u00d68\3\2\2\2\u00d7\u00d8\7e\2\2\u00d8"+
		"\u00d9\7c\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7q\2\2"+
		"\u00dc\u00dd\7w\2\2\u00dd\u00de\7v\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\b\35\35\2\u00e0:\3\2\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7n\2\2\u00e3"+
		"\u00e4\7c\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\3\2\2"+
		"\2\u00e7\u00e8\b\36\36\2\u00e8<\3\2\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb"+
		"\7q\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7k\2\2\u00ee"+
		"\u00ef\7p\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\3\2\2"+
		"\2\u00f2\u00f3\b\37\37\2\u00f3>\3\2\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6"+
		"\7n\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\b  \2\u00fa@\3\2\2\2\u00fb\u00fc\7h\2\2\u00fc\u00fd\7c\2\2\u00fd"+
		"\u00fe\7n\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7g\2\2\u0100\u0101\3\2\2"+
		"\2\u0101\u0102\b!!\2\u0102B\3\2\2\2\u0103\u0104\7h\2\2\u0104\u0105\7q"+
		"\2\2\u0105\u0106\7t\2\2\u0106\u0107\3\2\2\2\u0107\u0108\b\"\"\2\u0108"+
		"D\3\2\2\2\u0109\u010a\7k\2\2\u010a\u010b\7h\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\b##\2\u010dF\3\2\2\2\u010e\u010f\7k\2\2\u010f\u0110\7p\2\2\u0110"+
		"\u0111\7v\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b$$\2\u0113H\3\2\2\2\u0114"+
		"\u0115\7t\2\2\u0115\u0116\7g\2\2\u0116\u0117\7v\2\2\u0117\u0118\7w\2\2"+
		"\u0118\u0119\7t\2\2\u0119\u011a\7p\2\2\u011a\u011b\3\2\2\2\u011b\u011c"+
		"\b%%\2\u011cJ\3\2\2\2\u011d\u011e\7v\2\2\u011e\u011f\7t\2\2\u011f\u0120"+
		"\7w\2\2\u0120\u0121\7g\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b&&\2\u0123"+
		"L\3\2\2\2\u0124\u0125\7x\2\2\u0125\u0126\7q\2\2\u0126\u0127\7k\2\2\u0127"+
		"\u0128\7f\2\2\u0128\u0129\3\2\2\2\u0129\u012a\b\'\'\2\u012aN\3\2\2\2\u012b"+
		"\u012c\7.\2\2\u012c\u012d\b((\2\u012dP\3\2\2\2\u012e\u012f\7=\2\2\u012f"+
		"\u0130\b))\2\u0130R\3\2\2\2\u0131\u0132\7$\2\2\u0132\u0133\7\"\2\2\u0133"+
		"\u0134\7\60\2\2\u0134\u0135\7,\2\2\u0135\u0136\7\"\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0138\7$\2\2\u0138\u0139\b**\2\u0139T\3\2\2\2\u013a\u013b\7"+
		")\2\2\u013b\u013c\13\2\2\2\u013c\u013d\7)\2\2\u013d\u013e\b++\2\u013e"+
		"V\3\2\2\2\u013f\u0140\7\61\2\2\u0140\u0141\7\61\2\2\u0141\u0142\7E\2\2"+
		"\u0142\u0143\7C\2\2\u0143\u0144\7T\2\2\u0144\u0145\7C\2\2\u0145\u0146"+
		"\7E\2\2\u0146\u0147\7V\2\2\u0147\u0148\7G\2\2\u0148\u0149\7T\2\2\u0149"+
		"X\3\2\2\2\6\2]el";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}