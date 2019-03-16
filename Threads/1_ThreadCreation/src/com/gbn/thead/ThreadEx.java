package com.gbn.thead;

public class ThreadEx extends Thread{

	public static void main(String[] args) {
		ThreadEx t = new ThreadEx();
		t.start();

	}
	@Override
	public void run() {
		System.out.println("run() executed !");
	}
}
