package com.gbn.superex;

class A {
	int age;

	public A(int age) {
		this.age = age;
	}
}

class B extends A {
	public B(int age) {
		super(age);
	}
	public void display()
	{
		System.out.println("age called from super : "+super.age);
	}
}

public class SuperOnConstructor {

	public static void main(String[] args) {
		new B(28).display();
	}
}
