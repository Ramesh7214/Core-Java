package com.gbn.inner;

/*
 * Inner class
 */
public class InnerClass4 {

	public static void main(String[] args) {

		InnerClass4 obj = new InnerClass4();

		MyInner obj2 = obj.new MyInner(2, 3);
		System.out.println(obj2.add());

	}

	class MyInner {
		int a;
		int b;

		public MyInner(int a, int b) {
			this.a = a;
			this.b = b;
		}

		public int add() {
			return a + b;
		}
	}

}
