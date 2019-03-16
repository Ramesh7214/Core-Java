package com.gbn.enum2;
/*
 * Enum with field and constructor
 */

public enum Months {
	
	JAN(1),
	FEB(2),
	MAR(3),
	APR(4);
	
	private int numberOfMonth;// field
	
	Months(int numberOfMonth) // constructor
	{
		this.numberOfMonth = numberOfMonth;
	}
	
	public int getNumberOfMonth()
	{
		return numberOfMonth;
	}

}
