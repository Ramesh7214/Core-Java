package com.gbn.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
	
	public static void main(String[] args) {
		 TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
		  hm.put(103,"a");  
		  hm.put(102,"e");  
		  hm.put(101,"c");  
		  hm.put(100,"d");  
		  System.out.println(hm);
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
	}
