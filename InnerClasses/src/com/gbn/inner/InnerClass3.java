package com.gbn.inner;

/*
 * annonymous inner class
 */
public class InnerClass3 {

	public static void main(String[] args) {
		MyInteface obj = new MyInteface() {

			public void display() {
				System.out.println("I am anonymously implemented");
			}
		};

		obj.display();
	}
}
