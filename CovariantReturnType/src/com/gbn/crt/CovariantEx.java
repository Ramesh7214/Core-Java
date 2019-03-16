package com.gbn.crt;

class A {
	public void display()
	{
		System.out.println("I am A");
	}
}

class B extends A {
	public void display()
	{
		System.out.println("I am B");
	}
}

// "Class B is more narrow than class A"
// Classes demonstrating method overriding:

class C {
    A getFoo() {
        return new A();
    }
}

class D extends C {
    B getFoo() {
        return new B();
    }
}

public class CovariantEx {

	public static void main(String[] args) {
		new D().getFoo().display();;

	}

}
