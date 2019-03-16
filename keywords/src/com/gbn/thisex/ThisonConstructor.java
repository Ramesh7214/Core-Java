package com.gbn.thisex;

public class ThisonConstructor {
	String name;
	
	public ThisonConstructor() {
		this("gbn");
	}
	
	public ThisonConstructor(String name)
	{
		this.name = name;
		System.out.println(this.name);
	}
	
	public static void main(String[] args) {
		new ThisonConstructor();
	}

}
