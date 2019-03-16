package com.gbn.reflection;

import java.lang.reflect.Method;

/*
 * methods invoking
 */
public class ReflectionEx2 {

	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("com.gbn.reflection.MyClass");
			MyClass myClass = (MyClass) clazz.newInstance();
			Method[] m = clazz.getDeclaredMethods();

			for (Method method : m) {
				method.setAccessible(true); // private methods also acceasable
				method.invoke(myClass, null);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
