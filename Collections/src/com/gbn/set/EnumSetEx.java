package com.gbn.set;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
/*
 * converts enum to set
 */

public class EnumSetEx {
	
	public static void main(String[] args) {
		 Set<Days> set = EnumSet.of(Days.TUESDAY, Days.WEDNESDAY, Days.FRIDAY,Days.TUESDAY);  
		 
		 System.out.println(set);
		 
		  /*  Iterator<Days> iter = set.iterator();  
		    while (iter.hasNext())  
		      System.out.println(iter.next());*/  
		  }  
	}

enum Days {  
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
	}  
