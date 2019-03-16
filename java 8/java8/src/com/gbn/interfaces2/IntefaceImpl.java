package com.gbn.interfaces2;

public class IntefaceImpl implements Inteface2, Interface1 {

	// we have to implenet method1 to resolve diamond problem. it is backward compatability
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		Inteface2.super.method1();
	}

}
