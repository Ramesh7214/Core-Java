package com.gbn.staticex;

public class StaticOnVariable {

	public static void main(String[] args) {
		TestStaticOnVariable t1 = new TestStaticOnVariable();
		TestStaticOnVariable t2 = new TestStaticOnVariable();
		TestStaticOnVariable t3 = new TestStaticOnVariable();

		t1.display();
		t2.display();
		t3.display();

		t1.a = 20;
		//Test.a = 20;

		t1.display();
		t2.display();
		t3.display();

		t2.a = 30;
		//Test.a = 30;

		t1.display();
		t2.display();
		t3.display();

	}

}

class TestStaticOnVariable {
	static int a = 10;

	public void display() {
		System.out.println("Value of a : " + a);
	}
}