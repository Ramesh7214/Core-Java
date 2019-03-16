package com.gbn.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx1 {
	
	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("a");  
		queue.add("b");  
		queue.add("c");  
		queue.add("d");  
		queue.add("e");  
		
		System.out.println("head:"+queue.element());   // return head
		System.out.println("head:"+queue.peek());   // return head 
		
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		queue.remove();  // removes had element
		queue.poll();  // removes had element . return null if queue is empty
		
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
	}

}
