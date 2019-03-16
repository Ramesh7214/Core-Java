package com.gbn.inner;

/*
 * Local inner class
 */
public class InnerClass2 {

	public static void main(String[] args) {
		display();
	}

	public static void display() {
		class Logger {
			public void innerMethod() {
				System.out.println("Inner method");
			}
		}

		new Logger().innerMethod();
	}

}
