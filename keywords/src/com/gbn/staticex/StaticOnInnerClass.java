package com.gbn.staticex;

public class StaticOnInnerClass {

	public static void main(String[] args) {
		StaticOnInnerClass.TestInnerClass.display();

	}
	
	static class TestInnerClass
	{
		static void display()
		{
			System.out.println("Static inner class");
		}
	}

}
