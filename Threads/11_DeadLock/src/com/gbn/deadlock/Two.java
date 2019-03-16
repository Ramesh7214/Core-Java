package com.gbn.deadlock;

public class Two extends Thread {

	private Printer printer;
	private Scanner scanner;

	public Two(Printer printer, Scanner scanner) {
		this.printer = printer;
		this.scanner = scanner;
	}

	@Override
	public void run() {
		synchronized (scanner) {// Thread2 gets lock on scanner and try to get lock on
								// printer
			// after 500ms
			System.out.println("Thread2 trying to get lock on Printer");
			synchronized (printer) {
				System.out.println("Thread2 got all lock");
			}
		}
	}
}
