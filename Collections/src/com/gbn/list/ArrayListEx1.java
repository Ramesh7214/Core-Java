package com.gbn.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * without Generics
 */

public class ArrayListEx1 {

	public static void main(String[] args) {

		// Creating list and adding elements
		List list = new ArrayList();
		list.add("abc");
		list.add(2);
		list.add(2.2);
		list.add("abc");
		list.add(null);
		
		//System.out.println(list);

		// iterating lists
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}