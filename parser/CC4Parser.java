package compiler.parser;
import compiler.scanner.*;
//import compiler.*;
import java.io.*;
import org.antlr.v4.runtime.*;
import java.util.LinkedList;
import compiler.lib.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CC4Parser{

	
    LinkedList<String> lista;
    protected Scanner vScanner = null;	
	String arch;
    protected String archivo_salida = null;		
	protected boolean parser_debug = false;	
	String out = "";
	
	public CC4Parser(Scanner scanner, boolean debug){
		parser_debug = debug;
		vScanner = scanner;
		this.arch = scanner.archivo_entrada;	
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
	
	
	
	
	
	
	public void parseando() throws Exception{
	
	compiler.scanner.DecafLexer lex = new compiler.scanner.DecafLexer(new ANTLRFileStream(arch));
	    CommonTokenStream tokens = new CommonTokenStream(lex);
	    compiler.parser.Decaf parser = new compiler.parser.Decaf(tokens);	

	    try {
	        parser.program();
			//System.out.println("Parseando");
	    }
	    catch (RecognitionException e) {
	        System.out.println("Error al parsear.");
	        System.exit(1);
	    }

		    	// Terminado el parseo, mostrar resultados
        if (archivo_salida == null || archivo_salida.equals(""))
            archivo_salida = "salida_parser.txt";

			ConcurrentLinkedQueue<String> vuelta = new ConcurrentLinkedQueue<String>();

			vuelta = parser.getOutPut();
			int cantidad = vuelta.size();
			
			String [] array = vuelta.toArray(new String[cantidad]);

			 if (parser_debug){
			for (int i=cantidad-1;i>=0;i--){
				System.out.println(array[i]);
			}
		}

    }

    public void SetArchivoSalida(String archivo_salida) {
        archivo_salida = archivo_salida;
    }	

}

