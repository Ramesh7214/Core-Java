package com.gbn.enum4;


/*
 * looping enum
 */
public class Test {

	public static void main(String[] args) {

		// 1 - looping
		
		System.out.println("=== loop =====!!");

		for (Months month : Months.values()) {
			System.out.println(month);
		}

		// 2 - comparing
		System.out.println();
		System.out.println("==== Comparing=====!!");
		if(Months.JAN == Months.FEB)
		{
			System.out.println("Both are sme");
		} else {
			System.out.println("Both are not same !!");
		}
		
		// 3 -switch
		System.out.println();
		System.out.println("==== switch =======!!");
		Months month = Months.FEB; 
		
		switch (month) {
        case JAN:
            System.out.println("This is Jan");
            break;
        case FEB:
            System.out.println("This is Feb");
            break;
        case MAR:
            System.out.println("This is March");
            break;
        default:
            throw new AssertionError("Unknown month " + month);

    }
	}

}
