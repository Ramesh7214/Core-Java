package com.gbn.constructor;

public class ConstructorFlow {

	public static void main(String[] args) {

		new Four();
	}

}

class One {
	
	public One()
	{
		super();
		System.out.println("Called One default constructor !");
	}
	
	public One(int a)
	{
		this();
		System.out.println("Called One parameterized constructor !");
	}
	
	public One(String a)
	{
		this();
		System.out.println("Called One parameterized constructor !");
	}
}

class Two extends One {
	public Two()
	{
		super("a");
		System.out.println("Called Two default constructor !");
	}
	
	public Two(int a)
	{
		this();
		System.out.println("Called Two parameterized constructor !");
	}
}

class Three extends Two {
	public Three()
	{
		super(1);
		System.out.println("Called Three default constructor !");
	}
	
	public Three(int a)
	{
		this();
		System.out.println("Called Three parameterized constructor !");
	}
}

class Four extends Three {
	public Four()
	{
		this(1);
		System.out.println("Called Four default constructor !");
	}
	
	public Four(int a)
	{
		super(1);
		System.out.println("Called Four parameterized constructor !");
	}
}