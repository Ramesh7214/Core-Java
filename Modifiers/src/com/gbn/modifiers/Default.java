package com.gbn.modifiers;

class One {
	void display() {
		System.out.println("I am default method");
	}
}

public class Default {

	public static void main(String[] args) {
		One obj = new One();
		obj.display(); // possible in another class
	}
	void display() {
		System.out.println("I am default method");
	}
}
