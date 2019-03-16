package com.gbn.property;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
/*
 * to print sytem properties
 */
public class PropertyEx2 {
	public static void main(String[] args) {
		Properties prop = System.getProperties();
		Set set = prop.entrySet();

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
