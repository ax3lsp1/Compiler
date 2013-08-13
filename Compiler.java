/**Made By:
**José Eduardo Mendez Farnes
**Axel Ivan Mata Trujillo
**/
import compiler.scanner.*;
import compiler.parser.*;
import compiler.ast.*;
import compiler.semantic.*;
import compiler.irt.*;
import compiler.codegen.*;
import compiler.opt.*;
import compiler.lib.*;

public class Compiler{
	public static void main(String[] args)throws Exception{
	String fileName = ""; //Saves the name of the file
	String option = ""; //Saves the option as if "-o -target -
	String targetFile = ""; //Guarda que stage se trabaja "semantic, scan, parse ... etc"
	
	if(args.length > 0){
	option = args[0].toLowerCase();
		if(args.length == 1)
		help();
		else if(args[1].equals("-target")){
		targetFile = args[1].toLowerCase();
		fileName = args[2].toLowerCase();
		processCaller(option,fileName,targetFile);}
		else {
		option = args[0].toLowerCase();
		fileName = args[1].toLowerCase();
		processCaller(option,fileName,targetFile);}
		}
	else{
		System.out.println("");	
		System.out.println("Loading Help instructions...");
		help(); }
	}
	
	public static void help(){
	System.out.println("");	
	System.out.println("-o <outname>     Escribir el output a un archivo de texto llamado <outname>.");
	System.out.println("-target <stage>  Donde <stage> es uno de: scan, parse, ast, semantic, irt, ");	
	System.out.println("                 codegen; la compilación debe proceder hasta la etapa indicada.");	
	System.out.println("                 Por ejemplo, si <stage> es scan, una instancia de scan debe ");
	System.out.println("                 ser creada imprimiendo en el archivo de salida stage: scanning.");	
	System.out.println("                 Si es parse una instancia de parser debe ser creada a partir ");	
	System.out.println("                 de la instancia de scanner imprimiendo stage: parsing, además ");	
	System.out.println("                 del mensaje de scanner y así sucesivamente.");	
	System.out.println("-opt <optimzation> uno de: constant, algebraic; la compilación");		
	System.out.println("                 debe hacer solo la optimización que se le pida,y debe imprimir ");		
	System.out.println("                 como en -target optimizing: constant folding o optimizing: ");	
	System.out.println("                 algebraic simplification.");	
	System.out.println("-debug <stage>	 Imprimir información de debugging. Debe haber un mensaje por ");	
	System.out.println("                 cada etapa listada en <stage> de la forma Debugging <stage>.");	
	System.out.println("                 <stage> tiene las mismas opciones de -target, con la ");	
	System.out.println("                 diferencia que se pueden debuggear varias etapas, separandolas");	
	System.out.println("                 con ':' de la forma scan:parse:etc. ");		
    System.out.println("-h               Muestra esta ayuda al usuario.");	
	System.out.println("");	
	}

	public static void processCaller(String flag, String parameter,String targetDecition){
	Scanner escanner;
	CC4Parser parser;
	Ast ast;
	Semantic semantic;
	Irt irt;
	Algebraic opAlgebraica;
	ConstantFolding constFold;
	Debug debugger;
	int decider = flagSelector(flag);
	switch(decider){
	case 1: 
		System.out.println("Se escribio al nombre del archivo: " + parameter);
		break;
	case 2:
		int targetDecider =targetPolicySelector(parameter);
		switch(targetDecider){
		case 1: 
			escanner = new Scanner(parameter);
			System.out.println("Stage:[Scanner]");
			break;
		case 2:
			escanner = new Scanner(parameter);
			parser = new CC4Parser(escanner);
			System.out.println("Stage:[Parser]");			
			break;
		case 3:
			escanner = new Scanner(parameter);
			parser = new CC4Parser(escanner);
			ast = new Ast(parser);
			System.out.println("Stage:[AST]");			
			break;
		case 4:
			escanner = new Scanner(parameter);
			parser = new CC4Parser(escanner);
			ast = new Ast(parser);		
			semantic = new Semantic(ast);
			System.out.println("Stage:[Semantic]");			
			break;
		case 5:
			escanner = new Scanner(parameter);
			parser = new CC4Parser(escanner);
			ast = new Ast(parser);		
			semantic = new Semantic(ast);
			irt = new Irt(semantic);
			System.out.println("Stage:[Irt]");	
			break;		
		}
		break;
	case 3:
		if(targetDecition.equals("Algebraic"))
			opAlgebraica = new Algebraic(parameter);
		else 
			constFold = new ConstantFolding(parameter);
		break;
	case 4:
		debugger = new Debug(parameter);
		break;
	case 5:
		 help();
		break;
	default: 
		System.out.println("Invalid target release:"+flag);
		System.out.println("Usage: <options> <source files>");
		System.out.println("use -h for a list of possible options");}
	}
	
	public static int flagSelector(String policiType){
	int policySelector = 0;
		if(policiType.equals("-o"))
			policySelector = 1;
		else if(policiType.equals("-target"))
			policySelector = 2;
		else if(policiType.equals("-opt"))
			policySelector = 3;
		else if(policiType.equals("-debug"))
			policySelector = 4;
		else if(policiType.equals("-h"))
			policySelector = 5;
	return policySelector;
	}	
	
	public static int targetPolicySelector(String policiType){
	int policySelector = 0;
		if(policiType.equals("scan"))
			policySelector = 1;
		else if(policiType.equals("parse"))
			policySelector = 2;
		else if(policiType.equals("ast"))
			policySelector = 3;
		else if(policiType.equals("semantic"))
			policySelector = 4;
		else if(policiType.equals("irt"))
			policySelector = 5;
		else if(policiType.equals("codegen"))
			policySelector = 6;
	return policySelector;
	}		
}