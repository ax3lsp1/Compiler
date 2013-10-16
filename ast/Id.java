package compiler.ast;

public class Id extends Node{
	private String value;
	
	public Id(String v){
		value = v;
	}
	
	public void print(String padding){
		System.out.println(padding + value);
	}
}
