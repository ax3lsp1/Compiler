// Generated from parser/Decafparser.g by ANTLR 4.0
package compiler.parser;import compiler.scanner.Decaf.tokens;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Decafparser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=29, MODULO=9, CARACTER=42, MASIGUAL=13, MENOS=5, OBVIAR=2, ELSE=31, 
		FOR=33, INT=35, PUNTOCOMA=40, MENORIGUAL=18, AND=12, ID=1, COMA=39, TRUE=37, 
		NUMEROS=3, BREAK=27, IF=34, PARENTESISD=22, LLAVEI=19, BOOLEAN=26, MULTIPLICACION=6, 
		MENORQUE=16, PARENTESISI=21, CONTINUE=30, NEGADO=8, MAS=4, OR=11, LLAVED=20, 
		RETURN=36, DIVISION=7, CORCHETEI=23, PROGRAM=25, VOID=38, IGUAL=10, CORCHETED=24, 
		FALSE=32, MAYORQUE=15, MAYORIGUAL=17, MENOSIGUAL=14, CHAIN=41, CALLOUT=28;
	public static final String[] tokenNames = {
		"<INVALID>", "ID", "OBVIAR", "NUMEROS", "'+'", "'-'", "'*'", "'/'", "'!'", 
		"'%'", "'='", "'||'", "'&&'", "'+='", "'-='", "'>'", "'<'", "'>='", "'<='", 
		"'{'", "'}'", "'('", "')'", "'['", "']'", "'Program'", "'boolean'", "'break'", 
		"'callout'", "'class'", "'continue'", "'else'", "'false'", "'for'", "'if'", 
		"'int'", "'return'", "'true'", "'void'", "','", "';'", "CHAIN", "CARACTER"
	};
	public static final int
		RULE_program = 0, RULE_field_decl = 1, RULE_decl_list = 2, RULE_method_decl = 3, 
		RULE_var_decl = 4, RULE_type = 5, RULE_statement = 6, RULE_block = 7, 
		RULE_assign_op = 8, RULE_method_call = 9, RULE_method_name = 10, RULE_callout_arg = 11, 
		RULE_string_literal = 12, RULE_location = 13, RULE_expr = 14, RULE_bin_op = 15, 
		RULE_and_logico = 16, RULE_comparacion = 17, RULE_suma = 18, RULE_multiplica = 19, 
		RULE_expr_prim = 20, RULE_literal = 21, RULE_int_literal = 22, RULE_char_literal = 23, 
		RULE_bool_literal = 24;
	public static final String[] ruleNames = {
		"program", "field_decl", "decl_list", "method_decl", "var_decl", "type", 
		"statement", "block", "assign_op", "method_call", "method_name", "callout_arg", 
		"string_literal", "location", "expr", "bin_op", "and_logico", "comparacion", 
		"suma", "multiplica", "expr_prim", "literal", "int_literal", "char_literal", 
		"bool_literal"
	};

	@Override
	public String getGrammarFileName() { return "Decafparser.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public Decafparser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public TerminalNode LLAVEI() { return getToken(Decafparser.LLAVEI, 0); }
		public TerminalNode PROGRAM() { return getToken(Decafparser.PROGRAM, 0); }
		public TerminalNode CLASS() { return getToken(Decafparser.CLASS, 0); }
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public TerminalNode LLAVED() { return getToken(Decafparser.LLAVED, 0); }
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(CLASS);
			setState(51); match(PROGRAM);
			setState(52); match(LLAVEI);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(53); field_decl();
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << VOID))) != 0)) {
				{
				{
				setState(59); method_decl();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65); match(LLAVED);
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

	public static class Field_declContext extends ParserRuleContext {
		public List<Decl_listContext> decl_list() {
			return getRuleContexts(Decl_listContext.class);
		}
		public TerminalNode PUNTOCOMA() { return getToken(Decafparser.PUNTOCOMA, 0); }
		public TerminalNode COMA(int i) {
			return getToken(Decafparser.COMA, i);
		}
		public List<TerminalNode> COMA() { return getTokens(Decafparser.COMA); }
		public Decl_listContext decl_list(int i) {
			return getRuleContext(Decl_listContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); type();
			setState(68); decl_list();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(69); match(COMA);
				setState(70); decl_list();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76); match(PUNTOCOMA);
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

	public static class Decl_listContext extends ParserRuleContext {
		public TerminalNode CORCHETEI() { return getToken(Decafparser.CORCHETEI, 0); }
		public TerminalNode CORCHETED() { return getToken(Decafparser.CORCHETED, 0); }
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TerminalNode ID() { return getToken(Decafparser.ID, 0); }
		public Decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterDecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitDecl_list(this);
		}
	}

	public final Decl_listContext decl_list() throws RecognitionException {
		Decl_listContext _localctx = new Decl_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_list);
		try {
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); match(ID);
				setState(80); match(CORCHETEI);
				setState(81); int_literal();
				setState(82); match(CORCHETED);
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

	public static class Method_declContext extends ParserRuleContext {
		public TerminalNode PARENTESISD() { return getToken(Decafparser.PARENTESISD, 0); }
		public TerminalNode ID(int i) {
			return getToken(Decafparser.ID, i);
		}
		public TerminalNode VOID() { return getToken(Decafparser.VOID, 0); }
		public TerminalNode PARENTESISI() { return getToken(Decafparser.PARENTESISI, 0); }
		public TerminalNode COMA(int i) {
			return getToken(Decafparser.COMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(Decafparser.ID); }
		public List<TerminalNode> COMA() { return getTokens(Decafparser.COMA); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
				{
				setState(86); type();
				}
				break;
			case VOID:
				{
				setState(87); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(90); match(ID);
			setState(91); match(PARENTESISI);
			setState(103);
			_la = _input.LA(1);
			if (_la==BOOLEAN || _la==INT) {
				{
				setState(92); type();
				setState(93); match(ID);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(94); match(COMA);
					setState(95); type();
					setState(96); match(ID);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(105); match(PARENTESISD);
			setState(106); block();
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode ID(int i) {
			return getToken(Decafparser.ID, i);
		}
		public TerminalNode PUNTOCOMA() { return getToken(Decafparser.PUNTOCOMA, 0); }
		public TerminalNode COMA(int i) {
			return getToken(Decafparser.COMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(Decafparser.ID); }
		public List<TerminalNode> COMA() { return getTokens(Decafparser.COMA); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); type();
			setState(109); match(ID);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(110); match(COMA);
				setState(111); match(ID);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117); match(PUNTOCOMA);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(Decafparser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(Decafparser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode PARENTESISD() { return getToken(Decafparser.PARENTESISD, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode PARENTESISI() { return getToken(Decafparser.PARENTESISI, 0); }
		public TerminalNode CONTINUE() { return getToken(Decafparser.CONTINUE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode ELSE() { return getToken(Decafparser.ELSE, 0); }
		public TerminalNode RETURN() { return getToken(Decafparser.RETURN, 0); }
		public TerminalNode FOR() { return getToken(Decafparser.FOR, 0); }
		public TerminalNode IGUAL() { return getToken(Decafparser.IGUAL, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(Decafparser.PUNTOCOMA, 0); }
		public TerminalNode ID() { return getToken(Decafparser.ID, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMA() { return getToken(Decafparser.COMA, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(Decafparser.BREAK, 0); }
		public TerminalNode IF() { return getToken(Decafparser.IF, 0); }
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121); location();
				setState(122); assign_op();
				setState(123); expr();
				setState(124); match(PUNTOCOMA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); method_call();
				setState(127); match(PUNTOCOMA);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129); match(IF);
				setState(130); match(PARENTESISI);
				setState(131); expr();
				setState(132); match(PARENTESISD);
				setState(133); block();
				setState(136);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(134); match(ELSE);
					setState(135); block();
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138); match(FOR);
				setState(139); match(ID);
				setState(140); match(IGUAL);
				setState(141); expr();
				setState(142); match(COMA);
				setState(143); expr();
				setState(144); block();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146); match(RETURN);
				setState(148);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMEROS) | (1L << MENOS) | (1L << NEGADO) | (1L << PARENTESISD) | (1L << CALLOUT) | (1L << FALSE) | (1L << TRUE) | (1L << CARACTER))) != 0)) {
					{
					setState(147); expr();
					}
				}

				setState(150); match(PUNTOCOMA);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151); match(BREAK);
				setState(152); match(PUNTOCOMA);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(153); match(CONTINUE);
				setState(154); match(PUNTOCOMA);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(155); block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode LLAVEI() { return getToken(Decafparser.LLAVEI, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public TerminalNode LLAVED() { return getToken(Decafparser.LLAVED, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(LLAVEI);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INT) {
				{
				{
				setState(159); var_decl();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << LLAVEI) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN))) != 0)) {
				{
				{
				setState(165); statement();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171); match(LLAVED);
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

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode MASIGUAL() { return getToken(Decafparser.MASIGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(Decafparser.IGUAL, 0); }
		public TerminalNode MENOSIGUAL() { return getToken(Decafparser.MENOSIGUAL, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitAssign_op(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MASIGUAL) | (1L << MENOSIGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode PARENTESISD() { return getToken(Decafparser.PARENTESISD, 0); }
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public TerminalNode PARENTESISI() { return getToken(Decafparser.PARENTESISI, 0); }
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public TerminalNode COMA(int i) {
			return getToken(Decafparser.COMA, i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(Decafparser.COMA); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode CALLOUT() { return getToken(Decafparser.CALLOUT, 0); }
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method_call);
		int _la;
		try {
			setState(201);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(175); method_name();
				setState(176); match(PARENTESISI);
				setState(185);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(177); expr();
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(178); match(COMA);
						setState(179); expr();
						}
						}
						setState(184);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(187); match(PARENTESISD);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(189); match(CALLOUT);
				setState(190); match(PARENTESISI);
				setState(191); string_literal();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(192); match(COMA);
					setState(193); callout_arg();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199); match(PARENTESISD);
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

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Decafparser.ID, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitMethod_name(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(ID);
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

	public static class Callout_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterCallout_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitCallout_arg(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_callout_arg);
		try {
			setState(207);
			switch (_input.LA(1)) {
			case ID:
			case NUMEROS:
			case MENOS:
			case NEGADO:
			case PARENTESISD:
			case CALLOUT:
			case FALSE:
			case TRUE:
			case CARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); expr();
				}
				break;
			case CHAIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(206); string_literal();
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

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode CHAIN() { return getToken(Decafparser.CHAIN, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitString_literal(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(CHAIN);
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode CORCHETEI() { return getToken(Decafparser.CORCHETEI, 0); }
		public TerminalNode CORCHETED() { return getToken(Decafparser.CORCHETED, 0); }
		public TerminalNode ID() { return getToken(Decafparser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_location);
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212); match(ID);
				setState(213); match(CORCHETEI);
				setState(214); expr();
				setState(215); match(CORCHETED);
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

	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		try {
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219); location();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220); method_call();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221); literal();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222); bin_op();
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

	public static class Bin_opContext extends ParserRuleContext {
		public And_logicoContext and_logico(int i) {
			return getRuleContext(And_logicoContext.class,i);
		}
		public TerminalNode OR(int i) {
			return getToken(Decafparser.OR, i);
		}
		public List<And_logicoContext> and_logico() {
			return getRuleContexts(And_logicoContext.class);
		}
		public List<TerminalNode> OR() { return getTokens(Decafparser.OR); }
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitBin_op(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bin_op);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225); and_logico();
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(226); match(OR);
					setState(227); and_logico();
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class And_logicoContext extends ParserRuleContext {
		public List<TerminalNode> AND() { return getTokens(Decafparser.AND); }
		public TerminalNode AND(int i) {
			return getToken(Decafparser.AND, i);
		}
		public ComparacionContext comparacion(int i) {
			return getRuleContext(ComparacionContext.class,i);
		}
		public List<ComparacionContext> comparacion() {
			return getRuleContexts(ComparacionContext.class);
		}
		public And_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterAnd_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitAnd_logico(this);
		}
	}

	public final And_logicoContext and_logico() throws RecognitionException {
		And_logicoContext _localctx = new And_logicoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_and_logico);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233); comparacion();
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(234); match(AND);
					setState(235); comparacion();
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class ComparacionContext extends ParserRuleContext {
		public List<SumaContext> suma() {
			return getRuleContexts(SumaContext.class);
		}
		public List<TerminalNode> MENORQUE() { return getTokens(Decafparser.MENORQUE); }
		public TerminalNode MENORQUE(int i) {
			return getToken(Decafparser.MENORQUE, i);
		}
		public List<TerminalNode> MENORIGUAL() { return getTokens(Decafparser.MENORIGUAL); }
		public List<TerminalNode> MAYORIGUAL() { return getTokens(Decafparser.MAYORIGUAL); }
		public List<TerminalNode> MAYORQUE() { return getTokens(Decafparser.MAYORQUE); }
		public TerminalNode MAYORIGUAL(int i) {
			return getToken(Decafparser.MAYORIGUAL, i);
		}
		public TerminalNode MENORIGUAL(int i) {
			return getToken(Decafparser.MENORIGUAL, i);
		}
		public TerminalNode MAYORQUE(int i) {
			return getToken(Decafparser.MAYORQUE, i);
		}
		public SumaContext suma(int i) {
			return getRuleContext(SumaContext.class,i);
		}
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitComparacion(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparacion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241); suma();
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(250);
					switch (_input.LA(1)) {
					case MENORQUE:
						{
						setState(242); match(MENORQUE);
						setState(243); suma();
						}
						break;
					case MAYORQUE:
						{
						setState(244); match(MAYORQUE);
						setState(245); suma();
						}
						break;
					case MENORIGUAL:
						{
						setState(246); match(MENORIGUAL);
						setState(247); suma();
						}
						break;
					case MAYORIGUAL:
						{
						setState(248); match(MAYORIGUAL);
						setState(249); suma();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class SumaContext extends ParserRuleContext {
		public TerminalNode MAS(int i) {
			return getToken(Decafparser.MAS, i);
		}
		public TerminalNode MENOS(int i) {
			return getToken(Decafparser.MENOS, i);
		}
		public List<MultiplicaContext> multiplica() {
			return getRuleContexts(MultiplicaContext.class);
		}
		public List<TerminalNode> MENOS() { return getTokens(Decafparser.MENOS); }
		public MultiplicaContext multiplica(int i) {
			return getRuleContext(MultiplicaContext.class,i);
		}
		public List<TerminalNode> MAS() { return getTokens(Decafparser.MAS); }
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitSuma(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_suma);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255); multiplica();
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(260);
					switch (_input.LA(1)) {
					case MAS:
						{
						setState(256); match(MAS);
						setState(257); multiplica();
						}
						break;
					case MENOS:
						{
						setState(258); match(MENOS);
						setState(259); multiplica();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class MultiplicaContext extends ParserRuleContext {
		public TerminalNode MODULO(int i) {
			return getToken(Decafparser.MODULO, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(Decafparser.DIVISION); }
		public List<TerminalNode> MODULO() { return getTokens(Decafparser.MODULO); }
		public Expr_primContext expr_prim(int i) {
			return getRuleContext(Expr_primContext.class,i);
		}
		public List<Expr_primContext> expr_prim() {
			return getRuleContexts(Expr_primContext.class);
		}
		public List<TerminalNode> MULTIPLICACION() { return getTokens(Decafparser.MULTIPLICACION); }
		public TerminalNode MULTIPLICACION(int i) {
			return getToken(Decafparser.MULTIPLICACION, i);
		}
		public TerminalNode DIVISION(int i) {
			return getToken(Decafparser.DIVISION, i);
		}
		public MultiplicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterMultiplica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitMultiplica(this);
		}
	}

	public final MultiplicaContext multiplica() throws RecognitionException {
		MultiplicaContext _localctx = new MultiplicaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiplica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265); expr_prim();
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(272);
					switch (_input.LA(1)) {
					case MULTIPLICACION:
						{
						setState(266); match(MULTIPLICACION);
						setState(267); expr_prim();
						}
						break;
					case DIVISION:
						{
						setState(268); match(DIVISION);
						setState(269); expr_prim();
						}
						break;
					case MODULO:
						{
						setState(270); match(MODULO);
						setState(271); expr_prim();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class Expr_primContext extends ParserRuleContext {
		public TerminalNode PARENTESISD() { return getToken(Decafparser.PARENTESISD, 0); }
		public TerminalNode PARENTESISI() { return getToken(Decafparser.PARENTESISI, 0); }
		public TerminalNode NEGADO() { return getToken(Decafparser.NEGADO, 0); }
		public TerminalNode MENOS() { return getToken(Decafparser.MENOS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_primContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_prim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterExpr_prim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitExpr_prim(this);
		}
	}

	public final Expr_primContext expr_prim() throws RecognitionException {
		Expr_primContext _localctx = new Expr_primContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_prim);
		try {
			setState(285);
			switch (_input.LA(1)) {
			case MENOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(277); match(MENOS);
				setState(278); expr();
				}
				break;
			case NEGADO:
				enterOuterAlt(_localctx, 2);
				{
				setState(279); match(NEGADO);
				setState(280); expr();
				}
				break;
			case PARENTESISD:
				enterOuterAlt(_localctx, 3);
				{
				setState(281); match(PARENTESISD);
				setState(282); expr();
				setState(283); match(PARENTESISI);
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

	public static class LiteralContext extends ParserRuleContext {
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		try {
			setState(290);
			switch (_input.LA(1)) {
			case NUMEROS:
				enterOuterAlt(_localctx, 1);
				{
				setState(287); int_literal();
				}
				break;
			case CARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(288); char_literal();
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(289); bool_literal();
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

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode NUMEROS() { return getToken(Decafparser.NUMEROS, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitInt_literal(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); match(NUMEROS);
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

	public static class Char_literalContext extends ParserRuleContext {
		public TerminalNode CARACTER() { return getToken(Decafparser.CARACTER, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterChar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitChar_literal(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(CARACTER);
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

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(Decafparser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(Decafparser.TRUE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafparserListener ) ((DecafparserListener)listener).exitBool_literal(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static final String _serializedATN =
		"\2\3,\u012d\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\3\2\3\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2"+
		"\3\2\7\2?\n\2\f\2\16\2B\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3J\n\3\f\3\16\3"+
		"M\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4W\n\4\3\5\3\5\5\5[\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\5\5j\n\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\7\6s\n\6\f\6\16\6v\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008b\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0097\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u009f\n\b\3\t\3\t\7\t\u00a3\n\t\f\t\16\t\u00a6\13\t\3\t\7\t\u00a9"+
		"\n\t\f\t\16\t\u00ac\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00b7\n\13\f\13\16\13\u00ba\13\13\5\13\u00bc\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u00c5\n\13\f\13\16\13\u00c8\13\13\3\13\3\13\5\13"+
		"\u00cc\n\13\3\f\3\f\3\r\3\r\5\r\u00d2\n\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00dc\n\17\3\20\3\20\3\20\3\20\5\20\u00e2\n\20\3\21\3"+
		"\21\3\21\7\21\u00e7\n\21\f\21\16\21\u00ea\13\21\3\22\3\22\3\22\7\22\u00ef"+
		"\n\22\f\22\16\22\u00f2\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\7\23\u00fd\n\23\f\23\16\23\u0100\13\23\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u0107\n\24\f\24\16\24\u010a\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\7\25\u0113\n\25\f\25\16\25\u0116\13\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u0120\n\26\3\27\3\27\3\27\5\27\u0125\n\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\2\5\4\34\34%%\4\f\f\17\20\4\"\"\'\'\u013e\2\64\3\2\2\2"+
		"\4E\3\2\2\2\6V\3\2\2\2\bZ\3\2\2\2\nn\3\2\2\2\fy\3\2\2\2\16\u009e\3\2\2"+
		"\2\20\u00a0\3\2\2\2\22\u00af\3\2\2\2\24\u00cb\3\2\2\2\26\u00cd\3\2\2\2"+
		"\30\u00d1\3\2\2\2\32\u00d3\3\2\2\2\34\u00db\3\2\2\2\36\u00e1\3\2\2\2 "+
		"\u00e3\3\2\2\2\"\u00eb\3\2\2\2$\u00f3\3\2\2\2&\u0101\3\2\2\2(\u010b\3"+
		"\2\2\2*\u011f\3\2\2\2,\u0124\3\2\2\2.\u0126\3\2\2\2\60\u0128\3\2\2\2\62"+
		"\u012a\3\2\2\2\64\65\7\37\2\2\65\66\7\33\2\2\66:\7\25\2\2\679\5\4\3\2"+
		"8\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;@\3\2\2\2<:\3\2\2\2=?\5\b\5"+
		"\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\26"+
		"\2\2D\3\3\2\2\2EF\5\f\7\2FK\5\6\4\2GH\7)\2\2HJ\5\6\4\2IG\3\2\2\2JM\3\2"+
		"\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7*\2\2O\5\3\2\2\2PW\7\3"+
		"\2\2QR\7\3\2\2RS\7\31\2\2ST\5.\30\2TU\7\32\2\2UW\3\2\2\2VP\3\2\2\2VQ\3"+
		"\2\2\2W\7\3\2\2\2X[\5\f\7\2Y[\7(\2\2ZX\3\2\2\2ZY\3\2\2\2[\\\3\2\2\2\\"+
		"]\7\3\2\2]i\7\27\2\2^_\5\f\7\2_f\7\3\2\2`a\7)\2\2ab\5\f\7\2bc\7\3\2\2"+
		"ce\3\2\2\2d`\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2"+
		"i^\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\30\2\2lm\5\20\t\2m\t\3\2\2\2no\5\f"+
		"\7\2ot\7\3\2\2pq\7)\2\2qs\7\3\2\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2"+
		"\2\2uw\3\2\2\2vt\3\2\2\2wx\7*\2\2x\13\3\2\2\2yz\t\2\2\2z\r\3\2\2\2{|\5"+
		"\34\17\2|}\5\22\n\2}~\5\36\20\2~\177\7*\2\2\177\u009f\3\2\2\2\u0080\u0081"+
		"\5\24\13\2\u0081\u0082\7*\2\2\u0082\u009f\3\2\2\2\u0083\u0084\7$\2\2\u0084"+
		"\u0085\7\27\2\2\u0085\u0086\5\36\20\2\u0086\u0087\7\30\2\2\u0087\u008a"+
		"\5\20\t\2\u0088\u0089\7!\2\2\u0089\u008b\5\20\t\2\u008a\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u009f\3\2\2\2\u008c\u008d\7#\2\2\u008d\u008e"+
		"\7\3\2\2\u008e\u008f\7\f\2\2\u008f\u0090\5\36\20\2\u0090\u0091\7)\2\2"+
		"\u0091\u0092\5\36\20\2\u0092\u0093\5\20\t\2\u0093\u009f\3\2\2\2\u0094"+
		"\u0096\7&\2\2\u0095\u0097\5\36\20\2\u0096\u0095\3\2\2\2\u0096\u0097\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u009f\7*\2\2\u0099\u009a\7\35\2\2\u009a"+
		"\u009f\7*\2\2\u009b\u009c\7 \2\2\u009c\u009f\7*\2\2\u009d\u009f\5\20\t"+
		"\2\u009e{\3\2\2\2\u009e\u0080\3\2\2\2\u009e\u0083\3\2\2\2\u009e\u008c"+
		"\3\2\2\2\u009e\u0094\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009b\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\17\3\2\2\2\u00a0\u00a4\7\25\2\2\u00a1\u00a3\5\n\6"+
		"\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00aa\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\5\16\b\2"+
		"\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\26\2\2"+
		"\u00ae\21\3\2\2\2\u00af\u00b0\t\3\2\2\u00b0\23\3\2\2\2\u00b1\u00b2\5\26"+
		"\f\2\u00b2\u00bb\7\27\2\2\u00b3\u00b8\5\36\20\2\u00b4\u00b5\7)\2\2\u00b5"+
		"\u00b7\5\36\20\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00b3\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\30"+
		"\2\2\u00be\u00cc\3\2\2\2\u00bf\u00c0\7\36\2\2\u00c0\u00c1\7\27\2\2\u00c1"+
		"\u00c6\5\32\16\2\u00c2\u00c3\7)\2\2\u00c3\u00c5\5\30\r\2\u00c4\u00c2\3"+
		"\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\30\2\2\u00ca\u00cc\3"+
		"\2\2\2\u00cb\u00b1\3\2\2\2\u00cb\u00bf\3\2\2\2\u00cc\25\3\2\2\2\u00cd"+
		"\u00ce\7\3\2\2\u00ce\27\3\2\2\2\u00cf\u00d2\5\36\20\2\u00d0\u00d2\5\32"+
		"\16\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\31\3\2\2\2\u00d3\u00d4"+
		"\7+\2\2\u00d4\33\3\2\2\2\u00d5\u00dc\7\3\2\2\u00d6\u00d7\7\3\2\2\u00d7"+
		"\u00d8\7\31\2\2\u00d8\u00d9\5\36\20\2\u00d9\u00da\7\32\2\2\u00da\u00dc"+
		"\3\2\2\2\u00db\u00d5\3\2\2\2\u00db\u00d6\3\2\2\2\u00dc\35\3\2\2\2\u00dd"+
		"\u00e2\5\34\17\2\u00de\u00e2\5\24\13\2\u00df\u00e2\5,\27\2\u00e0\u00e2"+
		"\5 \21\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\37\3\2\2\2\u00e3\u00e8\5\"\22\2\u00e4\u00e5\7\r\2"+
		"\2\u00e5\u00e7\5\"\22\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9!\3\2\2\2\u00ea\u00e8\3\2\2\2"+
		"\u00eb\u00f0\5$\23\2\u00ec\u00ed\7\16\2\2\u00ed\u00ef\5$\23\2\u00ee\u00ec"+
		"\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"#\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00fe\5&\24\2\u00f4\u00f5\7\22\2\2"+
		"\u00f5\u00fd\5&\24\2\u00f6\u00f7\7\21\2\2\u00f7\u00fd\5&\24\2\u00f8\u00f9"+
		"\7\24\2\2\u00f9\u00fd\5&\24\2\u00fa\u00fb\7\23\2\2\u00fb\u00fd\5&\24\2"+
		"\u00fc\u00f4\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"%\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0108\5(\25\2\u0102\u0103\7\6\2\2"+
		"\u0103\u0107\5(\25\2\u0104\u0105\7\7\2\2\u0105\u0107\5(\25\2\u0106\u0102"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\'\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u0114\5*\26\2"+
		"\u010c\u010d\7\b\2\2\u010d\u0113\5*\26\2\u010e\u010f\7\t\2\2\u010f\u0113"+
		"\5*\26\2\u0110\u0111\7\13\2\2\u0111\u0113\5*\26\2\u0112\u010c\3\2\2\2"+
		"\u0112\u010e\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115)\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u0118\7\7\2\2\u0118\u0120\5\36\20\2\u0119\u011a\7\n\2\2\u011a\u0120\5"+
		"\36\20\2\u011b\u011c\7\30\2\2\u011c\u011d\5\36\20\2\u011d\u011e\7\27\2"+
		"\2\u011e\u0120\3\2\2\2\u011f\u0117\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u011b"+
		"\3\2\2\2\u0120+\3\2\2\2\u0121\u0125\5.\30\2\u0122\u0125\5\60\31\2\u0123"+
		"\u0125\5\62\32\2\u0124\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3"+
		"\2\2\2\u0125-\3\2\2\2\u0126\u0127\7\5\2\2\u0127/\3\2\2\2\u0128\u0129\7"+
		",\2\2\u0129\61\3\2\2\2\u012a\u012b\t\4\2\2\u012b\63\3\2\2\2 :@KVZfit\u008a"+
		"\u0096\u009e\u00a4\u00aa\u00b8\u00bb\u00c6\u00cb\u00d1\u00db\u00e1\u00e8"+
		"\u00f0\u00fc\u00fe\u0106\u0108\u0112\u0114\u011f\u0124";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}