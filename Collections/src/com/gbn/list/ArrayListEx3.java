package com.gbn.list;

import java.util.ArrayList;
import java.util.List;

/*
 * different methods
 */
public class ArrayListEx3 {
	public static void main(String[] args) {

		// Creating list and adding elements
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("c");

		System.out.println("After add() method list : " + list);

		list.add(1, "b"); // add element at perticular index

		System.out.println("After adding at index list : " + list);

			List<String> list2 = new ArrayList<String>();
		list2.add("d");
		list2.add("e");

		list.addAll(list2); // to add another collection

			System.out.println("After appending another list : " + list);

				Object[] str = list.toArray(); // to convert in to array
		System.out.println("Converted to Array : " + str);
		
			System.out.println("Contains a ? : "+list.contains("z"));

			list.clear(); // clears the list
		System.out.println("Cleared the list : " + list);
	}
}
