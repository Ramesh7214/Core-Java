package com.gbn.set;

import java.util.HashSet;

public class HashSetEx2 {
	public static void main(String[] args) {
			// Creating HashSet and adding elements
			HashSet<String> set = new HashSet<String>();
			set.add("a");
			set.add("b");
			set.add("c");
			set.add("d");
			set.add(null);
			System.out.println("Set 1 : "+set);
			
			HashSet<String> set2 = new HashSet<String>();
			set.add("e");
			set.add("f");
			
			System.out.println("Set 2 : "+set2);
			
			set.addAll(set2);
			System.out.println("After adding set2 : "+set);
			
			HashSet<String> set3 = (HashSet<String>) set.clone();
			System.out.println("Cloned set : "+set3);
			
	}
}
