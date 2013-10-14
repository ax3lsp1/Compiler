parser grammar Decaf;options {    tokenVocab=DecafLexer;}@header {package compiler.parser;import java.util.concurrent.ConcurrentLinkedQueue;}@members {ConcurrentLinkedQueue<String> lista = new ConcurrentLinkedQueue<String>();		public void Imprimir(String elementos){			System.out.println(elementos);		}		public ConcurrentLinkedQueue<String> getOutPut() {        return lista;		}}program : 				CLASS PROGRAM LLAVEI field_decl* method_decl* LLAVED {lista.add("Program Declaration");}  #declaracion_programa;field_decl 				: type (decl_list) (COMA (decl_list))* PUNTOCOMA {lista.add("field_decl");}  #declaracion_campos;decl_list 				: ID  #declaracion_id						| ID CORCHETEI int_literal CORCHETED {lista.add("decl_list");}  #declaracion_arreglo;						method_decl 			: method_type ID PARENTESISI par_dec? PARENTESISD block {lista.add("method_decl");} #declaracion_metodos;method_type 			: type {lista.add("method_type: type");}  #tipos_metodos;par_dec 				: (type ID) ((COMA (type ID))*)  #declaracion_parametros;block 					: LLAVEI block_decl* statement* LLAVED {lista.add("block");}  #definicion_block;block_decl 				: var_decl #block_declaracion_variables						| statement #block_declaracion_sentencias;						var_decl 				: type ID (COMA ID)* PUNTOCOMA #declaracion_var;type 					: INT {lista.add("type int");} #tipo_entero 						| BOOLEAN {lista.add("type boolean");} #tipo_boolean 						| VOID {lista.add("method_type: VOID");} #tipo_void;						statement 				: location assign_op expr PUNTOCOMA {lista.add("statement asign");}  #sentencia_operacion						| method_call PUNTOCOMA {lista.add("statement method_call");}  #sentencia_metodcall						| IF PARENTESISI expr PARENTESISD block (ELSE block)? {lista.add("statement if block");}  #sentencia_if						| FOR ID IGUAL expr COMA expr block {lista.add("statement for block");}  #sentencia_for						| RETURN expr? PUNTOCOMA {lista.add("statement return");}  #sentencia_return						| BREAK PUNTOCOMA {lista.add("statement break");}  #sentencia_break						| CONTINUE PUNTOCOMA {lista.add("statement continue");}  #sentencia_continue						| block {lista.add("statement block");} #sentencia_block;						assign_op 				: IGUAL {lista.add("assign_op =");} #operador_asignacion						| MENOSIGUAL {lista.add("assign_op +=");} #operador_menos_igual						| MASIGUAL {lista.add("assign_op -=");} #operador_mas_igual;						method_call 			: method_name PARENTESISI (expr (COMA expr)*)? PARENTESISD {lista.add("method_call name");} #declaracion_metodo						| CALLOUT PARENTESISI string_literal (COMA callout_arg)* PARENTESISD {lista.add("method_call callout");} #methodcall_callout;						method_name 			: ID {lista.add("method_name");}  #nombre_metodo;location 				: ID {lista.add("variable id");} #variable_id						| ID CORCHETEI expr CORCHETED {lista.add("id arreglo");} #variable_arreglo;						expr 					: NEGADO bin_op #expresion_negada						| MENOS bin_op #expresion_menos_operacion						| bin_op #expresion_operacion_binaria;						bin_op 					: and_logico (OR and_logico)* #expresion_operacion_or;and_logico 				: comparacion_menor (AND comparacion_menor)* #expresion_operacion_and;comparacion_menor 		: comparacion_mayor (MENORQUE comparacion_mayor)* #expresion_operacion_menorque;comparacion_mayor 	    : comparacion_menorigual (MAYORQUE comparacion_menorigual)* #expresion_operacion_mayorque;comparacion_menorigual  : comparacion_mayorigual (MENORIGUAL comparacion_mayorigual)* #expresion_operacion_menorigual;comparacion_mayorigual  : comparacion_igual (MAYORIGUAL comparacion_igual)* #expresion_operacion_mayorigual;comparacion_igual 		: comparacion_noesigual (IGUAL comparacion_noesigual)* #expresion_operacion_igual;comparacion_noesigual 	: subplus_operations (NOESIGUAL subplus_operations)* #expresion_operacion_noigual;subplus_operations 		: muldiv_operations (operations_adsub)* #operaciones_subplus;operations_adsub		: MAS muldiv_operations #expresion_operacion_plus 						| MENOS muldiv_operations #expresion_operacion_sub;muldiv_operations 		: expresion (operations_muldiv)* #operaciones_muldiv;operations_muldiv		: MULTIPLICACION expresion #expresion_operacion_mul 						| DIVISION expresion #expresion_operacion_div;						expresion 				: location #expresion_location 						| method_call #expresion_methodcall 						| literal #expresion_literal 						| PARENTESISI expr PARENTESISD #expresion_parentesis;						callout_arg 			: expr {lista.add("callout_arg expr");} #callout_expresion  						| string_literal {lista.add("callout_arg literal");} #callout_stringliteral;						literal 				: NUMEROS {lista.add("numero");} #literal_numeros						| CARACTER {lista.add("caracter");} #literal_caracter						| bool_literal {lista.add("boolean");} #literal_bool_literal 						| HEX {lista.add("hexadecimal");} #literal_hex;						int_literal 			: NUMEROS {lista.add("numero");} #int_literal_numeros 						| BOOLEAN {lista.add("boolean");} #int_literal_boolean;						bool_literal			: TRUE {lista.add("TRUE");} #boolean_literal_true 						| FALSE {lista.add("FALSE");} #boolean_literal_false;						string_literal 			: CHAIN {lista.add("string_literal");} #string_literal_chain;