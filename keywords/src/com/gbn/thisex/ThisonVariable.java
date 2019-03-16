package com.gbn.thisex;

public class ThisonVariable {
	
	int age;
	String name;
	
	public ThisonVariable(int age, String name)
	{
		this.age = age;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("name : "+name+" age :"+age);
	}

	public static void main(String[] args) {
		
		new ThisonVariable(28, "ram").display();

	}

}
