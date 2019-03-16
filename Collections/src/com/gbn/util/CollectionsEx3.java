package com.gbn.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * number of repeated values
 */
public class CollectionsEx3 {
	 public static void main(String a[]){
         
	        List<String> ll = new ArrayList<String>();
	        ll.add("one");
	        ll.add("two");
	        ll.add("three");
	        ll.add("four");
	        ll.add("two");
	        ll.add("three");
	        ll.add("two");
	        ll.add("one");
	        
	        System.out.println("Actual list: "+ll);
	        System.out.println("Frequency of 'one': "+Collections.frequency(ll, "one"));
	        System.out.println("Frequency of 'three': "+Collections.frequency(ll, "three"));
	        System.out.println("Frequency of 'two': "+Collections.frequency(ll, "two"));
	    }

}
