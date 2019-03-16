package com.gbn.daemon;

public class ThreadDaemon extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("Thread running !");
		} finally {
			System.out.println("finally called");
		}
	}

	public static void main(String[] args) {
		ThreadDaemon t1 = new ThreadDaemon();
		ThreadDaemon t2 = new ThreadDaemon();
		t1.setDaemon(true);
		t1.start();
		t2.start();

	}
//in busy situation finally will not called . because jvm will automatically ends daemon after
	//all thread termination

	

}
