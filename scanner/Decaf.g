lexer grammar Decaf;

@header {
package compiler.scanner;
}

ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
OBVIAR : '\n'|' '|'\t'|'\r';
NUMEROS : '0'..'9';

MAS :'+';
MENOS :'-';
MULTIPLICACION :'*';
DIVISION :'/';
NEGADO :'!';
MODULO :'%';
IGUAL : '=';
OR : '||';
AND : '&&';
MASIGUAL : '+=';
MENOSIGUAL : '-=';

MAYORQUE :'>';
MENORQUE :'<';
MAYORIGUAL :'>=';
MENORIGUAL :'<=';

LLAVEI :'{';
LLAVED :'}';
PARENTESISI :'(';
PARENTESISD :')';
CORCHETEI :'[';
CORCHETED :']';

PROGRAM :'Program';
BOOLEAN :'boolean';
BREAK :'break';
CALLOUT :'callout';
CLASS :'class';
CONTINUE :'continue';
ELSE :'else';
FALSE :'false';
FOR :'for';
IF :'if';
INT :'int';
RETURN :'return';
TRUE :'true';
VOID :'void';

COMA :',';
PUNTOCOMA :';';