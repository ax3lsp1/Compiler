package compiler.scanner;
import compiler.*;
import org.antlr.v4.runtime.*;
import java.io.*;
import java.util.*;

public class Scanner{

	protected boolean scanner_debug = false;
    public String archivo_entrada = null;													//	string m_archivo
    protected DecafLexer lex = null;												//objeto decaflexer
    protected String archivo_salida = null;											//archivo de salida
	protected String text = "";
	//protected int linea = "";
	
	public Scanner(String archivo, boolean debug){
	archivo_entrada = archivo;
	scanner_debug = debug;
	}	
	
   	void Escribir(String imp){
   		try{
   			FileOutputStream ext = new FileOutputStream (archivo_salida,true);
		    PrintStream salida = new PrintStream(ext);
		    salida.println(imp);
		    ext.close();		
		}
	catch (java.io.IOException e) {
		System.out.println("Ocurrio un error y no se pudo escribir en el archivo " + archivo_salida);
	}
   	}

	public void Scanning(){
		try{
		CharStream cs = new ANTLRFileStream(archivo_entrada);
			lex = new DecafLexer(cs);
	}
	catch (IOException e) {
	    System.out.println("Error al leer archivo de entrada: " + archivo_entrada);
	    System.exit(1);
	}	


	

	Token token = lex.nextToken();
	while (token.getType() != Token.EOF){

       if (archivo_salida == null || archivo_salida.equals(""))
            archivo_salida = "salida.txt";

		text = lex.getOutPut();
		


		Escribir("Type: " + token.getType() + "    Line: "+ token.getLine() + "    Char position: " + token.getCharPositionInLine() + "    Text: " + text);
	
	
//	System.out.println("Type: " + token.getType() + "    Line: "+ token.getLine() + "    Char position: " + token.getCharPositionInLine() + "    Text: " + text);
	token = lex.nextToken();
        if (scanner_debug)
	    System.out.println(text);
    }
	}

	
	public void SetArchivoSalida(String archivo_salida) {
        this.archivo_salida = archivo_salida;
    }
	
}