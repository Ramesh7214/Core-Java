package com.gbn.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Ram", 25));
		al.add(new Employee("Ravi", 26));
		al.add(new Employee("Sree", 22));

		Collections.sort(al);
		
		for (Employee emp : al) {
			System.out.println(emp.getName() + " " + emp.getAge());
		}
	}
}
