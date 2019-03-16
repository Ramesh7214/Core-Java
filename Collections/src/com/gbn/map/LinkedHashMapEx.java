package com.gbn.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(100, "a");
		lhm.put(101, "b");
		lhm.put(102, "d");
		lhm.put(null, "c");
		lhm.put(103, "c");
		lhm.put(null, "c");
		
		System.out.println(lhm);

	/*	for (Map.Entry m : lhm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		lhm.remove(100);
		System.out.println(lhm);*/
	}
}