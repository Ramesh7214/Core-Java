package com.gbn.enum3;
/*
 * enum with method
 */

public enum Caliculations {
	PLUS, MINUS, TIMES, DIVIDE;

	int calculate(int x, int y) {
		switch (this) {
		case PLUS:
			return x + y;
		case MINUS:
			return x - y;
		case TIMES:
			return x * y;
		case DIVIDE:
			return x / y;
		default:
			throw new AssertionError("Unknown operations " + this);
		}
	}

}
