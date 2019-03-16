package com.gbn.thread;

public class ThreadGroupEx extends Thread {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("subgroup 1");
		ThreadGroupEx t =new ThreadGroupEx();
		Thread t1 = new Thread(tg,t, "thread 1");t1.start();
		Thread t2 = new Thread(tg,t, "thread 2");t2.start();
		Thread t3 = new Thread(tg,t, "thread 3");t3.start();
		//tg = new ThreadGroup("subgroup 2");
		int agc = tg.activeGroupCount();
		System.out.println("Active thread groups in " + tg.getName() + " thread group: " + agc);
		tg.list();
	}
}
