package com.gbn.list;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * ForEach
 */
public class ArrayListEx4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(null);
		

		for (String str : list) {
			System.out.println(str);
		}
	}

}
