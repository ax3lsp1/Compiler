/**Made By:
**José Eduardo Mendez Farnes
**Axel Ivan Mata Trujillo
**/
import compiler.scanner.CC4Scanner;
import compiler.parser.CC4Parser;
import compiler.ast.Ast;
import compiler.semantic.Semantic;
import compiler.irt.Irt;
import compiler.codegen.Codegen;
import compiler.opt.Algebraic;
import compiler.opt.ConstantFolding;
import compiler.lib.Debug;
import compiler.lib.ErrorHandler;
import java.io.*;
import java.util.Scanner;

public class Compiler{
	public static void main(String[] args)throws Exception{
	String fileName = ""; /**@fileName Saves the name of the file**/
	String option = ""; /**@option Saves the option as if "-o -target -h" etc**/
	String targetFile = ""; /**targetFile saves on what stage are you working on "semantic, scan, parse ... etc"**/
	int SCP = 0;
	if(args.length > 0){
	option = args[0].toLowerCase();
		if(args.length == 1)
			SCP = 1;
		else if(option.equals("-o"))
			SCP = 2;
		else if(option.equals("-target"))
			SCP = 3;
		else if(option.equals("-opt"))
			SCP = 4;
		else if(option.equals("-debug"))
			SCP = 5;
	} else {
		System.out.println("");	
		System.out.println("Loading Help instructions...");
		help(); 
	}
	
	switch(SCP){
	case 1:
		help();
		break;
	case 2: 
		/**@Output File writing**/
		fileName = args[1];
		File fis = new File(fileName);
		if(fis.exists())
			processCaller(option,fileName,targetFile);
		else
			System.out.println("the file path is invalid or doesn't exist");
		/**This works out with an intput as the form of: -o <Archivo de salida>**/
		break;
	case 3:
		/**@Target stages**/
		option = args[0].toLowerCase();
		targetFile = args[1];
		processCaller(option,"",targetFile);
		/**This works out with an intput as the form of: -target <debugging stance>**/
		break;
	case 4:
		/**@Optimization **/
		option = args[0].toLowerCase();
		targetFile = args[1];
		processCaller(option,"",targetFile);
		/**This works for optimization area (optimization or algebraic)**/
		break;
	case 5:
		/**@Debugger**/
		option = args[0].toLowerCase();
		targetFile = args[1];
		processCaller(option,"",targetFile);
		/**This works for debuggun stance, it sends parameters as "scanner:parser" ... etc**/
		break;
	}
	
	}//cierra todo el main
	
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

	public static void processCaller(String flag, String parameter,String targetDecition)throws IOException{
	CC4Scanner escanner;
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
		FileOutputStream output = new FileOutputStream(parameter);
		System.out.println("The parameter has been written to the file: " + parameter);
		output.close();
		/*Uses the stage of -o and writes to the output file "parameter"*/
		break;
	case 2:
		int targetDecider = targetPolicySelector(targetDecition);
		switch(targetDecider){
		case 1: 
			escanner = new CC4Scanner(parameter);
			break;
		case 2:
			escanner = new CC4Scanner(parameter);
			parser = new CC4Parser(escanner);		
			break;
		case 3:
			escanner = new CC4Scanner(parameter);
			parser = new CC4Parser(escanner);	
			ast = new Ast(parser);		
			break;
		case 4:
			escanner = new CC4Scanner(parameter);
			parser = new CC4Parser(escanner);	
			ast = new Ast(parser);			
			semantic = new Semantic(ast);		
			break;
		case 5:
			escanner = new CC4Scanner(parameter);
			parser = new CC4Parser(escanner);	
			ast = new Ast(parser);			
			semantic = new Semantic(ast);			
			irt = new Irt(semantic);
			break;		
		}
		/*Uses the stage of -target with parameter as: CC4scanner, parser... etc*/
		break;
	case 3:
		if(targetDecition.equals("algebraic"))
			opAlgebraica = new Algebraic(parameter);
		else 
			constFold = new ConstantFolding(parameter);
		break;
	case 4:
		Scanner sender = new Scanner(targetDecition).useDelimiter(":");
		while(sender.hasNext()){
		debugger = new Debug(sender.next());
		}
		break;
	case 5:
		 help();
		break;
	default: 
		System.out.println("Invalid target release:"+flag);
		System.out.println("Usage: <options> <source files>");
		System.out.println("use -h for a list of possible options");}
	}
	
	public static int flagSelector(String PT){
	int ACC = 1;
		if(PT.equals("-o"))
			ACC = 1;
		else if(PT.contains("-target"))
			ACC = 2;
		else if(PT.contains("-opt"))
			ACC = 3;
		else if(PT.contains("-debug"))
			ACC = 4;
		else if(PT.contains("-h"))
			ACC = 5;
		else 
			System.out.println("Error no existe");
	return ACC;
	}	
	
	public static int targetPolicySelector(String policiType){
	int policySelector = 0;
		if(policiType.equals("scanner"))
			policySelector = 1;
		else if(policiType.equals("parser"))
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