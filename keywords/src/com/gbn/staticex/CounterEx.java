package com.gbn.staticex;

public class CounterEx {
	static int counter = 0;

	public static void hitCounterEx() {
		counter += 1;
	}
	
	public static void numberOfCounts()
	{
		System.out.println("Number of Hits : "+ counter);
	}
	
	public static void main(String[] args) {
		/*CounterEx counter1 = new CounterEx();
		CounterEx counter2 = new CounterEx();
		CounterEx counter3 = new CounterEx();
		CounterEx counter4 = new CounterEx();*/
		
		CounterEx.hitCounterEx();
		CounterEx.hitCounterEx();
		CounterEx.hitCounterEx();
		CounterEx.hitCounterEx();
		
		CounterEx.numberOfCounts();
	}
}
