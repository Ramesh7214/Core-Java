package com.gbn.reflection;
/*
 * creating object
 */
public class ReflectionEx1 {

	public static void main(String[] args) {
		Class clazz;
		try {
			clazz = Class.forName(args[0]); //"com.gbn.reflection.MyClass"
			MyClass myClass = (MyClass) clazz.newInstance();
			myClass.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
