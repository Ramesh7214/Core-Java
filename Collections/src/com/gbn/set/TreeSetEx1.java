package com.gbn.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx1 {
	
	public static void main(String[] args) {
		 //Creating and adding elements  
		  TreeSet<String> al=new TreeSet<String>();  
		  al.add("d");  
		  al.add("b");  
		  al.add("c");  
		  al.add("a");  
		  //al.add(null);
		  
		  System.out.println(al);
		  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

}
