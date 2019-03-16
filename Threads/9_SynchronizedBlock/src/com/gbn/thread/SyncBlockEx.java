package com.gbn.thread;

class One extends Thread{
	Printer p;

	public One(Printer p) {
		this.p = p;
	}
	
	@Override
	public void run() {
		p.print();
	}
}

class Two extends Thread{
	Printer p;

	public Two(Printer p) {
		this.p = p;
	}
	
	@Override
	public void run() {
		p.print();
	}
}

public class SyncBlockEx{
	public static void main(String[] args) {
		Printer p = new Printer();
		
		One t1 = new One(p);
		Two t2 = new Two(p);
		
		t1.start();
		t2.start();

	}
}
