package com.gbn.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * min max addall methods
 */
public class CollectionsEx1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(34);
		list.add(23);

		System.out.println(list);

		Collections.addAll(list, 34, 46);
		System.out.println(list);

		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
	}
}
