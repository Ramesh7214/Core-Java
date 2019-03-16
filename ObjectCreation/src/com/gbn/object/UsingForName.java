package com.gbn.object;

public class UsingForName {

	public static void main(String[] args) throws Exception {
			UsingForName object = (UsingForName) Class.forName("com.gbn.object.UsingForName").newInstance();
			object.usingForName();
	}

	public void usingForName()
	{
		System.out.println("Object created using Class.forName()");
	}

}
