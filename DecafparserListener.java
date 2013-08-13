// Generated from parser/Decafparser.g by ANTLR 4.0
package compiler.parser;import compiler.scanner.Decaf.tokens;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface DecafparserListener extends ParseTreeListener {
	void enterExpr_prim(Decafparser.Expr_primContext ctx);
	void exitExpr_prim(Decafparser.Expr_primContext ctx);

	void enterSuma(Decafparser.SumaContext ctx);
	void exitSuma(Decafparser.SumaContext ctx);

	void enterLocation(Decafparser.LocationContext ctx);
	void exitLocation(Decafparser.LocationContext ctx);

	void enterBlock(Decafparser.BlockContext ctx);
	void exitBlock(Decafparser.BlockContext ctx);

	void enterExpr(Decafparser.ExprContext ctx);
	void exitExpr(Decafparser.ExprContext ctx);

	void enterBin_op(Decafparser.Bin_opContext ctx);
	void exitBin_op(Decafparser.Bin_opContext ctx);

	void enterType(Decafparser.TypeContext ctx);
	void exitType(Decafparser.TypeContext ctx);

	void enterBool_literal(Decafparser.Bool_literalContext ctx);
	void exitBool_literal(Decafparser.Bool_literalContext ctx);

	void enterCallout_arg(Decafparser.Callout_argContext ctx);
	void exitCallout_arg(Decafparser.Callout_argContext ctx);

	void enterMultiplica(Decafparser.MultiplicaContext ctx);
	void exitMultiplica(Decafparser.MultiplicaContext ctx);

	void enterMethod_call(Decafparser.Method_callContext ctx);
	void exitMethod_call(Decafparser.Method_callContext ctx);

	void enterDecl_list(Decafparser.Decl_listContext ctx);
	void exitDecl_list(Decafparser.Decl_listContext ctx);

	void enterInt_literal(Decafparser.Int_literalContext ctx);
	void exitInt_literal(Decafparser.Int_literalContext ctx);

	void enterMethod_name(Decafparser.Method_nameContext ctx);
	void exitMethod_name(Decafparser.Method_nameContext ctx);

	void enterVar_decl(Decafparser.Var_declContext ctx);
	void exitVar_decl(Decafparser.Var_declContext ctx);

	void enterChar_literal(Decafparser.Char_literalContext ctx);
	void exitChar_literal(Decafparser.Char_literalContext ctx);

	void enterStatement(Decafparser.StatementContext ctx);
	void exitStatement(Decafparser.StatementContext ctx);

	void enterProgram(Decafparser.ProgramContext ctx);
	void exitProgram(Decafparser.ProgramContext ctx);

	void enterAnd_logico(Decafparser.And_logicoContext ctx);
	void exitAnd_logico(Decafparser.And_logicoContext ctx);

	void enterField_decl(Decafparser.Field_declContext ctx);
	void exitField_decl(Decafparser.Field_declContext ctx);

	void enterComparacion(Decafparser.ComparacionContext ctx);
	void exitComparacion(Decafparser.ComparacionContext ctx);

	void enterString_literal(Decafparser.String_literalContext ctx);
	void exitString_literal(Decafparser.String_literalContext ctx);

	void enterAssign_op(Decafparser.Assign_opContext ctx);
	void exitAssign_op(Decafparser.Assign_opContext ctx);

	void enterMethod_decl(Decafparser.Method_declContext ctx);
	void exitMethod_decl(Decafparser.Method_declContext ctx);

	void enterLiteral(Decafparser.LiteralContext ctx);
	void exitLiteral(Decafparser.LiteralContext ctx);
}