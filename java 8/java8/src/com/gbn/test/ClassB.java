package com.gbn.test;

public class ClassB extends ClassA {
	
	public static void display()
	{
		System.out.println("child");
	}
	
	public static void main(String[] args) {
		
		ClassA b = new ClassB();
	    b.display();
	}

}
