package com.gbn.object;

public class UsingCloning implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {

		UsingCloning object1 = new UsingCloning();
		UsingCloning object2 = (UsingCloning) object1.clone();
		object2.usingCloning();
	}

	public void usingCloning()
	{
		System.out.println("object created using cloning");
	}
}
