package com.gbn.oops;

class One {
	String name = "gbn";
}

class Two extends One {
	int age = 28;

	public void display() {
		System.out.println("name : " + name + ", age " + age);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		One obj1 = new One();
		//obj1.display(); // here we get error as One doesnt have display method
		Two obj2 = new Two();
		obj2.display(); 
		One obj3 = new Two();
		//obj3.display(); // here we get error as One doesnt have display method 
	}
}
