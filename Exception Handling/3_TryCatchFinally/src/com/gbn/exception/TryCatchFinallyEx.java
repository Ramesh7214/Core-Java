package com.gbn.exception;

public class TryCatchFinallyEx {
	
	public static void main(String[] args) {
		
		 int a = Integer.parseInt(args[0]); // number formate
		 
		 try
		 {
		 int b = Integer.parseInt(args[1]);//index out of bound
		 
		
			 int result = a/b; // airthmatic
			 System.out.println("result : "+result);
		 }catch(ArithmeticException exception)
		 {
			 System.out.println("ArithmeticException occured :"+exception.getMessage());
		 }
		 catch(ArrayIndexOutOfBoundsException exception)
		 {
			 System.out.println("IndexOutOfBoundsException occured :"+exception.getMessage());
		 }
		 catch(Exception exception)
		 {
			 System.out.println("Exception occured :"+exception.getMessage());
		 }
		 finally {
			System.out.println("finally executed!");
		}
	}
}
