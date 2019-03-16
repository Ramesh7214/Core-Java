package com.gbn.functionalInteface;
/*
 * functionla intefaces are new in JDK 8
 * must have only one non-Object abstract method
 *  best practice to add annotation @FunctionalInterface
 *  Can have default methods with body
 *  Can have static methods with boyd
 *  
 *  Use full when we work with lambda expressions
 */

@FunctionalInterface
public interface MyFunctionalInterface {

	public void method1();
	
	//public String toString(); // un comment . no error. becuase it is Object  method
	
	//public String method2(); // un comment - error . because it is non Object method. Two non object abstract methods not allowed
	
	default void method3()
	{
		System.out.println("I am default");
	}
	
	static void method4()
	{
		System.out.println("I am static");
	}
}
