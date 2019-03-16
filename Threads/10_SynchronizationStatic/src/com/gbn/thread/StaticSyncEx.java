package com.gbn.thread;

class One extends Thread {
	@Override
	public void run() {
		Printer.print();
	}
}

class Two extends Thread {
	@Override
	public void run() {
		Printer.print();
	}
}

public class StaticSyncEx {
	public static void main(String[] args) {

		One t1 = new One();
		Two t2 = new Two();

		t1.start();
		t2.start();

	}
}
