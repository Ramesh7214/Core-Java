package com.gbn.thread;

public class ThreadEx extends Thread{

	@Override
	public void run() {
		 for(int i=1;i<5;i++){  
			    try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
			    System.out.println(i);  
			  }  
	}
	
	public static void main(String[] args) {
		ThreadEx t1=new ThreadEx();  
		ThreadEx t2=new ThreadEx();  
	   
	  t1.start();  
	  t2.start(); }

}
