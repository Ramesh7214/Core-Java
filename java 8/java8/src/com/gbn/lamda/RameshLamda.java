package com.gbn.lamda;

public class RameshLamda {
	public static void main(String[] args) {
		//MyInteface inteface = () -> System.out.println("Hello Ramesh");
		display(RameshLamda::sayHelloToRamesh);
	}
	
	public static void sayHelloToRamesh()
	{
		System.out.println("Hello Ramesh");
	}

	public static void display(MyInteface inteface) {
		inteface.hello();
	}

	private interface MyInteface {
		public void hello();
	}

}
