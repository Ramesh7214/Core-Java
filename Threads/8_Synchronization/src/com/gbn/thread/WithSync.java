package com.gbn.thread;

class Onee extends Thread {
	Printer p;

	public Onee(Printer p) {
		this.p = p;
	}

	@Override
	public void run() {
		p.print();
	}
}

class Twoo extends Thread {
	Printer p;

	public Twoo(Printer p) {
		this.p = p;
	}

	@Override
	public void run() {
		p.print();
	}
}

public class WithSync extends Thread {
	public static void main(String[] args) {
		Printer p = new Printer();

		One t1 = new One(p);
		Two t2 = new Two(p);

		t1.start();
		t2.start();

	}
}
