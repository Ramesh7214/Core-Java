package com.gbn.exception;

public class UncheckedExceptionEx {

	private void display() {
		System.out.println("display() method called");
	}

	public static void main(String[] args) {
		UncheckedExceptionEx obj = null;
		obj.display();
	}
}
