package com.gbn.inner;

/*
 * static inner classes
 */
public class Innerclass1 {

	public static void main(String[] args) {
		Innerclass1.MyInner.display1(); // calling static method of static class
		
		Innerclass1.MyInner obj = new Innerclass1.MyInner(); // calling non static method of static class
		obj.display2();

	}

	static class MyInner {

		public static void display1() {
			System.out.println("I am static inner class static method");
		}
		
		public void display2()
		{
			System.out.println("I am static inner class non-static method");
		}
	}
}
