package com.gbn.interface3;

public interface Inteface1 {

	default String concat(String a, String b) {
		if (!isNull(a) && !isNull(b)) {
			return a + " " + b;
		} else {
			return "GBN";
		}
	}

	static boolean isNull(String str) {
		return (str == null || "".equals(str)) ? true : false;
	}

}
