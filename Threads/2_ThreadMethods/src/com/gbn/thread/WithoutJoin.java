package com.gbn.thread;

public class WithoutJoin extends Thread {
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

	public static void main(String[] args) {
		WithoutJoin t1 = new WithoutJoin();
		WithoutJoin t2 = new WithoutJoin();
		WithoutJoin t3 = new WithoutJoin();
		WithoutJoin t4 = new WithoutJoin();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
