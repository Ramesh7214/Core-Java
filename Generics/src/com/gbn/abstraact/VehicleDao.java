package com.gbn.abstraact;

public class VehicleDao<R extends Vehicle> {
	
	public  void save(R vehicle)
	{
		System.out.println("Save logic");
	}

}
