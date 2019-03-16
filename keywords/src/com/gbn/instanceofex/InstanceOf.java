package com.gbn.instanceofex;

public class InstanceOf {
	public static void main(String[] args) {
		TestInstanceOf obj = new TestInstanceOf();
		if(obj instanceof TestInstanceOf)
		{
			System.out.println("This is a object of :TestInstanceOf");
		}
		else
		{
			System.out.println("This is a object of : "+obj.getClass().getName());
		}
	}
}

class TestInstanceOf
{
	
}