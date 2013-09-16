lexer grammar Decaf;

@header {
package compiler.scanner;
}

	
@members {
    
    protected String m_out_put = "";    
    
    public String getOutPut() {
        return m_out_put;
    }

    protected void AddToOutPut(String text) {
        m_out_put = text;
    }
}	
	


ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* { AddToOutPut("ID"); };
OBVIAR : ('\t'|' '|'\r'|'\n')+{ skip(); };
NUMEROS : ('0'..'9')+ { AddToOutPut("NUMERO");};

MAS :'+' {AddToOutPut("MAS");};
MENOS :'-' {AddToOutPut("MENOS");};
MULTIPLICACION :'*' {AddToOutPut("MULTIPLICACION");};
DIVISION :'/' {AddToOutPut("DIVISION");};
NEGADO :'!' {AddToOutPut("NEGADO");};
MODULO :'%' {AddToOutPut("MODULO");};
IGUAL : '=' {AddToOutPut("IGUAL");};
OR : '||' {AddToOutPut("OR");};
AND : '&&' {AddToOutPut("AND");};
MASIGUAL : '+=' {AddToOutPut("MASIGUAL");};
MENOSIGUAL : '-=' {AddToOutPut("MENOSIGUAL");};

MAYORQUE :'>' {AddToOutPut("MAYORQUE");};
MENORQUE :'<' {AddToOutPut("MENORQUE");};
MAYORIGUAL :'>=' {AddToOutPut("MAYORIGUAL");};
MENORIGUAL :'<=' {AddToOutPut("MENORIGUAL");};

LLAVEI :'{' {AddToOutPut("LLAVEI");};
LLAVED :'}' {AddToOutPut("LLAVED");};
PARENTESISI :'(' {AddToOutPut("PARENTESISI");};
PARENTESISD :')' {AddToOutPut("PARENTESISD");};
CORCHETEI :'[' {AddToOutPut("CORCHETEI");};
CORCHETED :']' {AddToOutPut("CORCHETED");};

PROGRAM :'Program' {AddToOutPut("Program");};
BOOLEAN :'boolean' {AddToOutPut("boolean");};
BREAK :'break' {AddToOutPut("break");};
CALLOUT :'callout' {AddToOutPut("callout");};
CLASS :'class' {AddToOutPut("class");};
CONTINUE :'continue' {AddToOutPut("continue");};
ELSE :'else' {AddToOutPut("else");};
FALSE :'false' {AddToOutPut("false");};
FOR :'for' {AddToOutPut("for");};
IF :'if' {AddToOutPut("if");};
INT :'int' {AddToOutPut("int");};
RETURN :'return' {AddToOutPut("return");};
TRUE :'true' {AddToOutPut("true");};
VOID :'void' {AddToOutPut("void");};

COMA :',' {AddToOutPut("COMA");};
PUNTOCOMA :';' {AddToOutPut("PUNTOCOMA");};
CHAIN: '"'' .* ''"' {AddToOutPut("STRING");};
CARACTER: '\'' . '\'' {AddToOutPut("CHAR");};
COMENTARIO: '//CARACTER';