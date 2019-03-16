package com.gbn.oops;

public class MethodOverloading {

	public void display()
	{
		System.out.println("display() with no args");
	}
	
	public void display(int age)
	{
		System.out.println("display() with int args");
	}
	
	public void display(String name)
	{
		System.out.println("display() with String args");
	}
	
	public void display(int age ,String name)
	{
		System.out.println("display() with two args");
	}
}


