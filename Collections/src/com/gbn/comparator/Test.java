package com.gbn.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("a", 25));
		al.add(new Employee("c", 26));
		al.add(new Employee("b", 22));

		Collections.sort(al,new EmployeeAgeComparator());
		for (Employee emp : al) {
			System.out.println(emp.getName() + " " + emp.getAge());
		}
		
		Collections.sort(al,new EmployeeNameComparator());
		for (Employee emp : al) {
			System.out.println(emp.getName() + " " + emp.getAge());
		}
	}
}
