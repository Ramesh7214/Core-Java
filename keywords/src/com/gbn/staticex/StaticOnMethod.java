package com.gbn.staticex;

public class StaticOnMethod {
	
	public static void main(String[] args) {

		TestStaticOnMethod.display();
	}

}

class TestStaticOnMethod
{
	public static void display()
	{
		System.out.println("you called me without creating object !");
	}
}