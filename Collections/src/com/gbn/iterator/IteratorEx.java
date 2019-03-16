package com.gbn.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorEx {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("abc");
		list.add(2);
		list.add(2.2);
		list.add("abc");
		
		Iterator itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*ListIterator lit = list.listIterator();
		while()) {lit.hasNext(
			System.out.println(lit.next());
			System.out.println(lit.previous());
		}
		
		
		*/
		
		
	}

}
