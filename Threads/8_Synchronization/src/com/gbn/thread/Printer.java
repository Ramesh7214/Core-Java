package com.gbn.thread;

public class Printer {
	//remove synchronized in print method to check problem
	
	public synchronized void print() {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
		}
	}
}
