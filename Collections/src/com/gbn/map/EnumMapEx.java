package com.gbn.map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapEx {
	public static void main(String[] args) {
		EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
		map.put(Days.ONE, "1");
		map.put(Days.TWO, "2");
		map.put(Days.THREE, "3");
		map.put(Days.FOUR, "4");

		System.out.println(map);
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}

enum Days {
	ONE, TWO, THREE, FOUR
};