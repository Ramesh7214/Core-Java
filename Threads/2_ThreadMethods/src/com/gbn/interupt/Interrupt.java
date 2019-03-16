package com.gbn.interupt;

public class Interrupt extends Thread{
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		Interrupt t = new Interrupt();
		t.start();
		t.interrupt();

	}

}
