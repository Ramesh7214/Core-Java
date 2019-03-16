package com.gbn.modifiers;

class ProtectedEx
{
	protected void display()
	{
		System.out.println("protected method !");
	}
}

public class Protected {
	public static void main(String[] args) {
		ProtectedEx obj = new ProtectedEx();
		obj.display();
	}
	protected void display()
	{
		System.out.println("protected method !");
	}

}
