package com.gbn.thread;

public class ShutdownHookEx extends Thread{
	@Override
	public void run() {
		System.out.println("Shutdown hook called");
	}
	public static void main(String[] args) {
		
		ShutdownHookEx t = new ShutdownHookEx();
		Runtime.getRuntime().addShutdownHook(t);
		System.out.println("Pre-exit");
		System.exit(0);
		System.out.println("post-exit");
	}
}
