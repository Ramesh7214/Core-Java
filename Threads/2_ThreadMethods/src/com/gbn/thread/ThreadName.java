package com.gbn.thread;

public class ThreadName extends Thread {
	@Override
	public void run() {
		
	}
	
	public static void main(String[] args) {
		ThreadName t = new ThreadName();
		System.out.println(t.getName());
		
		t.setName("MyThread");
		System.out.println(t.getName());
		
	}

}
