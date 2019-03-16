package com.gbn.thead;

public class RunnableEx implements Runnable{
	@Override
	public void run() {
		System.out.println("run() executed !");
		
	}
	public static void main(String[] args) {
		Thread t = new Thread(new RunnableEx());
		t.start();
		Thread t2 = new Thread(new RunnableEx());
		t2.start();
		Thread t3 = new Thread(new RunnableEx());
		t3.start();
	}
}
