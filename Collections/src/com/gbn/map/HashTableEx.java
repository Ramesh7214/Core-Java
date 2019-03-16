package com.gbn.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(100, "a");
		ht.put(102, "b");
		ht.put(101, "c");
		ht.put(103, "d");
	//	ht.put(null, "f"); // not allow null keys
	//	ht.put(104, null); // not allow null values
		
		
		for (Map.Entry m : ht.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
