package com.gbn.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread name : "+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		 ExecutorService executor = Executors.newFixedThreadPool(5);
		 
		 for (int i = 0; i < 5; i++) {  
			 executor.execute(new ThreadPool());
		 }
	}
}
//we can create our own pool
