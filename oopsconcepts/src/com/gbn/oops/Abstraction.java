package com.gbn.oops;

abstract class Vehicle
{
	abstract public void engineType();
}

class TVS extends Vehicle
{

	@Override
	public void engineType() {
		System.out.println("110 CC");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		TVS tvs = new TVS();
		tvs.engineType();
	}
}
