package com.gbn.test;

import com.gbn.module.Maruthi;
import com.gbn.module.MaruthiDao;

public class Test {

	public static void main(String[] args) {

		Maruthi maruthi  = new Maruthi();
		maruthi.setName("MARUTHI");
		maruthi.setModel("ALTO");
		maruthi.setGearType("MANUAL");
		
		new MaruthiDao().save(maruthi);
	}

}
