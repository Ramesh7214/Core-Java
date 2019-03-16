package com.gbn.constructor;

public class DefaultConstructor {

	public static void main(String[] args) {
		Test test = new Test();
		test.display();
	}
}

class Test {
	
	 /* Test(){  // By default JVM provides 
	  
	  } */
	 
	public void display() {
		System.out.println("display() called !");
	}
}