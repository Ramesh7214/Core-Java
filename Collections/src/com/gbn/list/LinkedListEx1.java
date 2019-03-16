package com.gbn.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add(null);

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
