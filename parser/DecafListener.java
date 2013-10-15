// Generated from parser/Decaf.g by ANTLR 4.0
package compiler.parser;import java.util.concurrent.ConcurrentLinkedQueue;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface DecafListener extends ParseTreeListener {
	void enterExpresion_operacion_noigual(Decaf.Expresion_operacion_noigualContext ctx);
	void exitExpresion_operacion_noigual(Decaf.Expresion_operacion_noigualContext ctx);

	void enterLiteral_caracter(Decaf.Literal_caracterContext ctx);
	void exitLiteral_caracter(Decaf.Literal_caracterContext ctx);

	void enterDeclaracion_parametros(Decaf.Declaracion_parametrosContext ctx);
	void exitDeclaracion_parametros(Decaf.Declaracion_parametrosContext ctx);

	void enterOperador_mas_igual(Decaf.Operador_mas_igualContext ctx);
	void exitOperador_mas_igual(Decaf.Operador_mas_igualContext ctx);

	void enterDeclaracion_programa(Decaf.Declaracion_programaContext ctx);
	void exitDeclaracion_programa(Decaf.Declaracion_programaContext ctx);

	void enterExpresion_location(Decaf.Expresion_locationContext ctx);
	void exitExpresion_location(Decaf.Expresion_locationContext ctx);

	void enterTipo_entero(Decaf.Tipo_enteroContext ctx);
	void exitTipo_entero(Decaf.Tipo_enteroContext ctx);

	void enterExpresion_operacion_menorigual(Decaf.Expresion_operacion_menorigualContext ctx);
	void exitExpresion_operacion_menorigual(Decaf.Expresion_operacion_menorigualContext ctx);

	void enterExpresion_operacion_igual(Decaf.Expresion_operacion_igualContext ctx);
	void exitExpresion_operacion_igual(Decaf.Expresion_operacion_igualContext ctx);

	void enterExpresion_operacion_div(Decaf.Expresion_operacion_divContext ctx);
	void exitExpresion_operacion_div(Decaf.Expresion_operacion_divContext ctx);

	void enterBoolean_literal_true(Decaf.Boolean_literal_trueContext ctx);
	void exitBoolean_literal_true(Decaf.Boolean_literal_trueContext ctx);

	void enterDeclaracion_arreglo(Decaf.Declaracion_arregloContext ctx);
	void exitDeclaracion_arreglo(Decaf.Declaracion_arregloContext ctx);

	void enterSentencia_break(Decaf.Sentencia_breakContext ctx);
	void exitSentencia_break(Decaf.Sentencia_breakContext ctx);

	void enterSentencia_for(Decaf.Sentencia_forContext ctx);
	void exitSentencia_for(Decaf.Sentencia_forContext ctx);

	void enterBlock_declaracion_sentencias(Decaf.Block_declaracion_sentenciasContext ctx);
	void exitBlock_declaracion_sentencias(Decaf.Block_declaracion_sentenciasContext ctx);

	void enterExpresion_parentesis(Decaf.Expresion_parentesisContext ctx);
	void exitExpresion_parentesis(Decaf.Expresion_parentesisContext ctx);

	void enterExpresion_methodcall(Decaf.Expresion_methodcallContext ctx);
	void exitExpresion_methodcall(Decaf.Expresion_methodcallContext ctx);

	void enterBlock_declaracion_variables(Decaf.Block_declaracion_variablesContext ctx);
	void exitBlock_declaracion_variables(Decaf.Block_declaracion_variablesContext ctx);

	void enterOperaciones_subplus(Decaf.Operaciones_subplusContext ctx);
	void exitOperaciones_subplus(Decaf.Operaciones_subplusContext ctx);

	void enterInt_literal_numeros(Decaf.Int_literal_numerosContext ctx);
	void exitInt_literal_numeros(Decaf.Int_literal_numerosContext ctx);

	void enterExpresion_negada(Decaf.Expresion_negadaContext ctx);
	void exitExpresion_negada(Decaf.Expresion_negadaContext ctx);

	void enterTipo_void(Decaf.Tipo_voidContext ctx);
	void exitTipo_void(Decaf.Tipo_voidContext ctx);

	void enterDeclaracion_id(Decaf.Declaracion_idContext ctx);
	void exitDeclaracion_id(Decaf.Declaracion_idContext ctx);

	void enterSentencia_if(Decaf.Sentencia_ifContext ctx);
	void exitSentencia_if(Decaf.Sentencia_ifContext ctx);

	void enterExpresion_operacion_sub(Decaf.Expresion_operacion_subContext ctx);
	void exitExpresion_operacion_sub(Decaf.Expresion_operacion_subContext ctx);

	void enterDeclaracion_metodos(Decaf.Declaracion_metodosContext ctx);
	void exitDeclaracion_metodos(Decaf.Declaracion_metodosContext ctx);

	void enterCallout_expresion(Decaf.Callout_expresionContext ctx);
	void exitCallout_expresion(Decaf.Callout_expresionContext ctx);

	void enterExpresion_operacion_binaria(Decaf.Expresion_operacion_binariaContext ctx);
	void exitExpresion_operacion_binaria(Decaf.Expresion_operacion_binariaContext ctx);

	void enterExpresion_operacion_plus(Decaf.Expresion_operacion_plusContext ctx);
	void exitExpresion_operacion_plus(Decaf.Expresion_operacion_plusContext ctx);

	void enterMethodcall_callout(Decaf.Methodcall_calloutContext ctx);
	void exitMethodcall_callout(Decaf.Methodcall_calloutContext ctx);

	void enterSentencia_block(Decaf.Sentencia_blockContext ctx);
	void exitSentencia_block(Decaf.Sentencia_blockContext ctx);

	void enterSentencia_return(Decaf.Sentencia_returnContext ctx);
	void exitSentencia_return(Decaf.Sentencia_returnContext ctx);

	void enterString_literal_chain(Decaf.String_literal_chainContext ctx);
	void exitString_literal_chain(Decaf.String_literal_chainContext ctx);

	void enterVariable_arreglo(Decaf.Variable_arregloContext ctx);
	void exitVariable_arreglo(Decaf.Variable_arregloContext ctx);

	void enterExpresion_operacion_mayorque(Decaf.Expresion_operacion_mayorqueContext ctx);
	void exitExpresion_operacion_mayorque(Decaf.Expresion_operacion_mayorqueContext ctx);

	void enterLiteral_hex(Decaf.Literal_hexContext ctx);
	void exitLiteral_hex(Decaf.Literal_hexContext ctx);

	void enterExpresion_operacion_and(Decaf.Expresion_operacion_andContext ctx);
	void exitExpresion_operacion_and(Decaf.Expresion_operacion_andContext ctx);

	void enterOperaciones_muldiv(Decaf.Operaciones_muldivContext ctx);
	void exitOperaciones_muldiv(Decaf.Operaciones_muldivContext ctx);

	void enterExpresion_operacion_mayorigual(Decaf.Expresion_operacion_mayorigualContext ctx);
	void exitExpresion_operacion_mayorigual(Decaf.Expresion_operacion_mayorigualContext ctx);

	void enterCallout_stringliteral(Decaf.Callout_stringliteralContext ctx);
	void exitCallout_stringliteral(Decaf.Callout_stringliteralContext ctx);

	void enterTipo_boolean(Decaf.Tipo_booleanContext ctx);
	void exitTipo_boolean(Decaf.Tipo_booleanContext ctx);

	void enterExpresion_operacion_mul(Decaf.Expresion_operacion_mulContext ctx);
	void exitExpresion_operacion_mul(Decaf.Expresion_operacion_mulContext ctx);

	void enterDeclaracion_campos(Decaf.Declaracion_camposContext ctx);
	void exitDeclaracion_campos(Decaf.Declaracion_camposContext ctx);

	void enterDeclaracion_metodo(Decaf.Declaracion_metodoContext ctx);
	void exitDeclaracion_metodo(Decaf.Declaracion_metodoContext ctx);

	void enterDeclaracion_var(Decaf.Declaracion_varContext ctx);
	void exitDeclaracion_var(Decaf.Declaracion_varContext ctx);

	void enterInt_literal_boolean(Decaf.Int_literal_booleanContext ctx);
	void exitInt_literal_boolean(Decaf.Int_literal_booleanContext ctx);

	void enterLiteral_numeros(Decaf.Literal_numerosContext ctx);
	void exitLiteral_numeros(Decaf.Literal_numerosContext ctx);

	void enterVariable_id(Decaf.Variable_idContext ctx);
	void exitVariable_id(Decaf.Variable_idContext ctx);

	void enterTipos_metodos(Decaf.Tipos_metodosContext ctx);
	void exitTipos_metodos(Decaf.Tipos_metodosContext ctx);

	void enterOperador_menos_igual(Decaf.Operador_menos_igualContext ctx);
	void exitOperador_menos_igual(Decaf.Operador_menos_igualContext ctx);

	void enterSentencia_metodcall(Decaf.Sentencia_metodcallContext ctx);
	void exitSentencia_metodcall(Decaf.Sentencia_metodcallContext ctx);

	void enterSentencia_continue(Decaf.Sentencia_continueContext ctx);
	void exitSentencia_continue(Decaf.Sentencia_continueContext ctx);

	void enterOperador_asignacion(Decaf.Operador_asignacionContext ctx);
	void exitOperador_asignacion(Decaf.Operador_asignacionContext ctx);

	void enterExpresion_operacion_or(Decaf.Expresion_operacion_orContext ctx);
	void exitExpresion_operacion_or(Decaf.Expresion_operacion_orContext ctx);

	void enterSentencia_operacion(Decaf.Sentencia_operacionContext ctx);
	void exitSentencia_operacion(Decaf.Sentencia_operacionContext ctx);

	void enterExpresion_literal(Decaf.Expresion_literalContext ctx);
	void exitExpresion_literal(Decaf.Expresion_literalContext ctx);

	void enterDefinicion_block(Decaf.Definicion_blockContext ctx);
	void exitDefinicion_block(Decaf.Definicion_blockContext ctx);

	void enterNombre_metodo(Decaf.Nombre_metodoContext ctx);
	void exitNombre_metodo(Decaf.Nombre_metodoContext ctx);

	void enterLiteral_bool_literal(Decaf.Literal_bool_literalContext ctx);
	void exitLiteral_bool_literal(Decaf.Literal_bool_literalContext ctx);

	void enterBoolean_literal_false(Decaf.Boolean_literal_falseContext ctx);
	void exitBoolean_literal_false(Decaf.Boolean_literal_falseContext ctx);

	void enterExpresion_operacion_menorque(Decaf.Expresion_operacion_menorqueContext ctx);
	void exitExpresion_operacion_menorque(Decaf.Expresion_operacion_menorqueContext ctx);

	void enterExpresion_menos_operacion(Decaf.Expresion_menos_operacionContext ctx);
	void exitExpresion_menos_operacion(Decaf.Expresion_menos_operacionContext ctx);
}