package com.gbn.lamda;

/*
 * Scope of variables
 */

public class Lambda4 {

	static int outerStaticNum;

	int outerNum;

	void testScopes() {
		int num = 1;

		Lambda2.Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);

		String convert = stringConverter.convert(2);
		System.out.println(convert); // 3

		Lambda2.Converter<Integer, String> stringConverter2 = (from) -> {
			outerNum = 1;
			return String.valueOf(from + outerNum);
		};
		System.out.println(stringConverter2.convert(2));
		
		
		String[] array = new String[1];
		Lambda2.Converter<Integer, String> stringConverter3 = (from) -> {
			array[0] = "Hi there";
			return String.valueOf(from);
		};

		System.out.println(stringConverter3.convert(2));

		System.out.println(array[0]);
	}

	public static void main(String[] args) {
		new Lambda4().testScopes();
	}

}