package com.gbn.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("a");
		lhs.add("b");
		lhs.add("a");
		lhs.add("c");
		lhs.add(null);
		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
