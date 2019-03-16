package com.gbn.deadlock;

public class One extends Thread {

	private Printer printer;
	private Scanner scanner;

	public One(Printer printer, Scanner scanner) {
		this.printer = printer;
		this.scanner = scanner;
	}

	@Override
	public void run() {
		synchronized (printer) {// Thread 1 gets lock to printer and goes to sleep for 1
			// sec
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread-1 trying to get lock on Scanner");
			synchronized (scanner) {
				System.out.println("THread-1 got all lock");
			}
		}
	}
}
