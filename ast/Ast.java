package compiler.ast;
import compiler.parser.*;
import org.antlr.v4.runtime.tree.*;

public class Ast {





	public Ast(CC4Parser parser){
	
		try{
		ParseTree tree = parser.parseandoAST();
			} 
			
			catch (Exception e){
			System.out.println("Error al parsear.");
			}
		
		
		AstVisitor visitor = new AstVisitor();
		Root root = (Root)visitor.visit(tree);
		root.print();
	}
}