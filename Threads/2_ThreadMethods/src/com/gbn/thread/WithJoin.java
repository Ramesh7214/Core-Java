package com.gbn.thread;

public class WithJoin extends Thread {
	@Override
    public void run() {
    	Thread t = Thread.currentThread();
        System.out.println("Thread started: "+t.getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Thread ended: "+t.getName());    
    }

	public static void main(String[] args) throws Exception {
		WithJoin t1 = new WithJoin();
		WithJoin t2 = new WithJoin();
		WithJoin t3 = new WithJoin();
		WithJoin t4 = new WithJoin();
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();
		t4.join();

	}
}
