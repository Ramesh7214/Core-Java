package com.gbn.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * synchronizing other collection
 */
public class CollectionsEx2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "ONE");
		map.put(2, "TWO");
		map.put(3, "THREE");
		
		List<String> synchList = Collections.synchronizedList(list);
		Set<String> synchSet = Collections.synchronizedSet(set);
		Map<Integer, String> synchMap = Collections.synchronizedMap(map);
		
		System.out.println(synchList);
		System.out.println(synchSet);
		System.out.println(synchMap);

	}
}
