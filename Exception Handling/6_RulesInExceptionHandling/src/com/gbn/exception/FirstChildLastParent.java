package com.gbn.exception;

public class FirstChildLastParent {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (RuntimeException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		/*
		try {
			Thread.sleep(1000);
		} catch (Exception e) { // not allowed
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (RuntimeException e) {
			// TODO: handle exception
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}*/

	}

}
