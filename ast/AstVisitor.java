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
		List<Decaf.Method_declContext> list2 = ctx.method_decl();
		
		for(Decaf.Field_declContext e : list){

     		root.add(visit(e));//visitDeclaracion_campos
			//System.out.println(e);
		}
		
		for(Decaf.Method_declContext e : list2){

     		root.add(visit(e));//visitDeclaracion_campos
			//System.out.println(e);
		}
		
		//printList(root);
		return root;
	}


	/*printlist(LinkedList linkedList) 
	{
		for (int i = 0; i < linkedList.size(); i++) {
                System.out.println(linkedList.get(i));
            }
	}*/
	
	
	@Override public Node visitDeclaracion_campos(Decaf.Declaracion_camposContext ctx) 
	{ 
		Decaf.TypeContext obj = ctx.type();
		Root vd_t = new Root();
		
			vd_t.add(visit(obj));//tipo_entero o tipo_booleano o tipo_void
			//System.out.println(obj);		
		
	
		List<Decaf.Decl_listContext> list = ctx.decl_list();
		//Root vd_c = new Root();
		for(Decaf.Decl_listContext e : list){
			vd_t.add(visit(e));//visitDeclaracion_id o declaracion_arreglo
			//System.out.println(e);
		}
		return vd_t;	
	}
	
///////////////type///////////////////////

@Override public Node visitTipo_entero(Decaf.Tipo_enteroContext ctx) 
{ 
	return new IntLiteralType(ctx.INT().getText());
}

@Override public Node visitTipo_boolean(Decaf.Tipo_booleanContext ctx) 
{ 
	return new BooleanType(ctx.BOOLEAN().getText());
}

@Override public Node visitTipo_void(Decaf.Tipo_voidContext ctx) 
{ 
	return new VoidLiteralType(ctx.VOID().getText());
}

////////////////type end/////////////////////	
	
	
			
///////////////field declaration begin///////////////////////	
	@Override public Node visitDeclaracion_id(Decaf.Declaracion_idContext ctx) 
	{ 	
		return new Id(ctx.ID().getText());
	}	

	@Override public Node visitDeclaracion_arreglo(Decaf.Declaracion_arregloContext ctx) 
	{ 
		Root il_c = new Root();
		Decaf.Int_literalContext obj = ctx.int_literal();
			il_c.add(visit(obj));//int_literal
			//System.out.println(obj);
		return il_c; 
	}
	
	@Override public Node visitInt_literal_numeros(Decaf.Int_literal_numerosContext ctx) 
	{ 
		return new IntLiteralArray(ctx.NUMEROS().getText());
	}
	
	@Override public Node visitInt_literal_boolean(Decaf.Int_literal_booleanContext ctx) 
	{ 
		return new BooleanLiteralArray(ctx.BOOLEAN().getText());
	}

///////////////field declaration end///////////////////////	

/////////////////metod declaration begin///////////////////
/*
	@Override public Node visitDeclaracion_metodos(Decaf.Declaracion_metodosContext ctx) 
	{ 
		Decaf.Method_typeContext obj = ctx.method_type(); //Tipos_metodos
		Root vd_m = new Root();
		vd_m.add(visit(obj));
	
		Decaf.Par_decContext obj2 = ctx.par_dec(); //Declaracion_parametros
		vd_m.add(visit(obj2));
		
		Decaf.BlockContext obj3 = ctx.block(); // block_decl o statemet
		vd_m.add(visit(obj3));
	
	return vd_m; 
	}
	
	@Override public Node visitTipos_metodos(Decaf.Tipos_metodosContext ctx) 
	{
		Decaf.TypeContext obj = ctx.type();
		Root tm_c = new Root();
		tm_c.add(visit(obj));	
		
	return tm_c; 
	}
		
	@Override public Node visitDeclaracion_parametros(Decaf.Declaracion_parametrosContext ctx) 
	{ 
		List<Decaf.TypeContext> list = ctx.type();
		Root vd_p = new Root();
		
		for(Decaf.TypeContext e : list){
			vd_p.add(visit(e));
			//System.out.println(e);
		}	
	
	return vd_p; 
	}
	
	

	@Override public Node visitDefinicion_block(Decaf.Definicion_blockContext ctx) 
	{ 
	
		return visitChildren(ctx); 
	}*/
	
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
