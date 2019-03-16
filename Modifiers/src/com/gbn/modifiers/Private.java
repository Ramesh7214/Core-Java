package com.gbn.modifiers;

class A
{
	private void display()
	{
		System.out.println("I am private method");
	}
	
	public void hello()
	{
		display();
	}
}

public class Private extends A{
	public static void main(String[] args) {
		A a = new A();
		//a.display();
		a.hello();
	}

}
