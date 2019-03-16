package com.gbn.thisex;

public class ThisAsArgument {

	public void display1() {
		display2(this);
	}

	public void display2(ThisAsArgument arg) {
		System.out.println("dispaly2() called");
	}

	public static void main(String[] args) {
		new ThisAsArgument().display1();

	}
}
