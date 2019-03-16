package com.gbn.deadlock;

public class DeadLocEx {
	public static void main(String[] args) throws Exception{//not a good practice, ideally should handle
		Printer a = new Printer();
		Scanner b = new Scanner();
		One thread1 = new One(a,b);//These are actually application classes having thread property
		Two thread2 = new Two(a,b);
		new Thread(thread1,"Thread1").start();//Thread1 starts executing run and get lock of a and wait 1 sec
		Thread.sleep(500);
		new Thread(thread2,"Thread2").start();//thead to starts after 500 ms and gets lock to b and try to get lock on a
	}

}
