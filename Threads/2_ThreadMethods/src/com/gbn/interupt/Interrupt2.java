package com.gbn.interupt;

public class Interrupt2 extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		} catch (InterruptedException e) {
			System.out.println("Exception handled " + e);
		}
		System.out.println("thread still is running...");
	}

	public static void main(String[] args) {

		Interrupt2 t = new Interrupt2();
		t.start();
		t.interrupt();

	}

}
// interrupts or break down the sleep. but dont stop the thread