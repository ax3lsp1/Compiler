package compiler.ast;


import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
import compiler.parser.Decaf;
import compiler.parser.DecafBaseVisitor;

public class AstVisitor extends DecafBaseVisitor<Node>{

@Override public Node visitDeclaracion_programa(Decaf.Declaracion_programaContext ctx) 
	{ 
	Root root = new Root();
		List<Decaf.Field_declContext> list = ctx.field_decl();
		
		for(Decaf.Field_declContext e : list){

     		root.add(visit(e));//visitDeclaracion_campos
			System.out.println(e);
		}
		return root;
	}


	@Override public Node visitDeclaracion_campos(Decaf.Declaracion_camposContext ctx) 
	{ 
		List<Decaf.Decl_listContext> list = ctx.decl_list();
		Root vd_c = new Root();
		
		
		for(Decaf.Decl_listContext e : list){
			vd_c.add(visit(e));//visitDeclaracion_id
			System.out.println(e);
		}
		return vd_c;	
	}
	
	
	@Override public Node visitDeclaracion_id(Decaf.Declaracion_idContext ctx) 
	{ 	
		return new Id(ctx.ID().getText());
	}	
	
	
	
	
	/*
	@Override
	public Node visitLine(DecafParser.LineContext ctx){
		Root root = new Root();
		List<DecafParser.ExpContext> list = ctx.exp();
		
		for(DecafParser.ExpContext e : list){
			root.add(visit(e));
		}
		return root;
	}
	
	@Override
	public Node visitInt(DecafParser.IntContext ctx){
		return new IntLiteral(ctx.INTEGER().getText());
	}
	
	@Override
	public Node visitFloat(DecafParser.FloatContext ctx){
		return new FloatLiteral(ctx.FLOAT().getText());
	}
	
	@Override
	public Node visitParen(DecafParser.ParenContext ctx){
		return visit(ctx.exp());
	}
	
	@Override
	public Node visitPlusMinus(DecafParser.PlusMinusContext ctx){
		TerminalNode op = ctx.MINUS() == null ? ctx.PLUS() : ctx.MINUS();
		return new BinOp(op.getText(), visit(ctx.exp(0)), visit(ctx.exp(1)));
	}
	
	@Override
	public Node visitTimesDiv(DecafParser.TimesDivContext ctx){
		TerminalNode op = ctx.DIV() == null ? ctx.TIMES() : ctx.DIV();
		return new BinOp(op.getText(), visit(ctx.exp(0)), visit(ctx.exp(1)));
	}*/
}
