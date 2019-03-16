package com.gbn.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {
	public static void main(String args[]) {
		
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("a"); // duplicate
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		/*// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
	}

}
