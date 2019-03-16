package com.gbn.exception;

public class ThrowEx {

	public void display(ThrowEx obj) {
		if (obj == null) {
			throw new RuntimeException("Object should not be null");
		}
		else
		{
			System.out.println("No Exception");
		}
	}

	public static void main(String[] args) {
		ThrowEx obj = new ThrowEx();
		obj.display(null);

	}
}
