package com.gbn.staticex;

public class StaticBlockVsInitBlock {
	static{
		System.out.println("static block");
	}
	
	{
		System.out.println("initialization block");
	}
	public static void main(String[] args) {
		
		new StaticBlockVsInitBlock();
	
	}

}
