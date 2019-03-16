package com.gbn.object;

public class UsingFactory {

	public static void main(String[] args) {

		FactoryExample  obj = FactoryExample.getFactoryExample();
		obj.display();
	}
}

class FactoryExample {

	public static FactoryExample getFactoryExample() {
		return new FactoryExample();
	}

	public void display() {
		System.out.println("object created using factory method !");
	}
}