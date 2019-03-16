package com.gbn.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(1, "gbn");
		map.put(null, "Hello");
		map.put(4, null);	
		map.put(5, null);
		System.out.println(map);

		//retrieve map
/*		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		map.remove(2);
		
		System.out.println(map);*/
	
	}

}
