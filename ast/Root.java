package compiler.ast;

import java.util.List;
import java.util.LinkedList;

public class Root extends Node{
	private List<Node> list;
	
	public Root(){
		list = new LinkedList<Node>();
	}
	
	public void add(Node node){
		list.add(node);
	}
	
	public void print(String padding){
		for(Node n : list){
			System.out.println("exp ->");
			n.print(padding + "\t");
		}
	}
	
	public void print(){
		print("");
	}
} 
 
 
