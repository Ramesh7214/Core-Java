package com.gbn.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * sorting collection
 */
public class CollectionsEx4 {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("c");
		al.add("e");
		al.add("b");

		Collections.sort(al);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
