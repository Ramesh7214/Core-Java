package com.gbn.interfaces1;

public interface Inteface1 {
	
	default void method1() 
	{
		System.out.println("Hello I am method1 from Interface1");
	}
	
	public void method2();

}
