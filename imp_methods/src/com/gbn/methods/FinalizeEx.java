package com.gbn.methods;

class X
{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called");
	}
	
}

public class FinalizeEx {

	public static void main(String[] args) {
		X x= new X();
		x = null;
		System.gc();
		//Runtime.getRuntime().gc();

	}

}
