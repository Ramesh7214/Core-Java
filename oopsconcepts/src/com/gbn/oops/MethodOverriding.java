package com.gbn.oops;

class Bike
{
	public void engineCC()
	{
		System.out.println("100 CC");
	}
	public void breakType()
	{
		System.out.println("Drum type");
	}
	
}

class Honda extends Bike
{
	
	@Override
	public void engineCC() {
		System.out.println("250 CC");
	}
	@Override
	public void breakType() {
		System.out.println("Disk type");
	}
}

class Bajaj extends Bike
{
	@Override
	public void engineCC() {
		System.out.println("110 CC");
	}
	
}


public class MethodOverriding {

	public static void main(String[] args) {
		Honda honda = new Honda();
		honda.engineCC();
		honda.breakType();
		
		Bajaj bajaj = new Bajaj();
		bajaj.engineCC();
		bajaj.breakType();
	}
}
