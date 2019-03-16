package com.gbn.interface3;

public class InterfaceImpl implements Inteface1 {

	public static void main(String[] args) {
		InterfaceImpl obj = new InterfaceImpl();
		System.out.println(obj.concat("", "Technoliges"));
	}
	
	public boolean isNull(String str) {
		return (str == null ) ? true : false;
	}
	
	/*public String concat(String a, String b) {
		if (!isNull(a) && !isNull(b)) {
			return a + " " + b;
		} else {
			return "GBN";
		}
	}*/
	
}
