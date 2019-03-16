package com.gbn.finalex;

public class FinalOnMethod {
	
	public final void display()
	{
		System.out.println("display method");
	}

}

class TestFinal extends FinalOnMethod
{
	/*public final void display()   // Compile time error 
	{
		System.out.println("display method");    
	}*/
}