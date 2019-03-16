package com.gbn.thisex;

public class ThisOnMethod {
	
	public void display1()
	{
		System.out.println("super class display");
		this.display2();
	}
	
	public void display2()
	{
		System.out.println("display2 method ");
	}

	public static void main(String[] args) {
		new ThisOnMethod().display1();

	}
}

