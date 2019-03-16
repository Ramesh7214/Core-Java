package com.gbn.exception;

public class NoStatementsAllowed {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(1000);
		}
	//	Sytem.out.println("not allowed")
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("not allowed");
		finally {
			
		}
	}
}
