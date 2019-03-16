package com.gbn.superex;

class One
{
	int age = 28;
}

class Two extends One
{
	String name = "gbn";
	int age = 20;
	
	public void display()
	{
		System.out.println("name :"+name+" age: "+age);
		System.out.println("name :"+name+" age: "+super.age);
	}
}


public class SuperOnVariable {

	public static void main(String[] args) {
		new Two().display();
	}

}
