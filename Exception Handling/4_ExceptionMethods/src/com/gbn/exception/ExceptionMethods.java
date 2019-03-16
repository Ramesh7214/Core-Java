package com.gbn.exception;

public class ExceptionMethods {
	public static void main(String[] args) {
		try {

		} catch (Exception e) {
			// Prints the result of toString() along with the stack trace to
			// System.err, the error output stream.
			e.printStackTrace();
			// Returns a detailed message about the exception that has occurred.
			// This message is initialized in the Throwable constructor.
			e.getMessage();
			// Returns the cause of the exception as represented by a Throwable
			// object.
			e.getCause();
			// Returns the name of the class concatenated with the result of
			// getMessage().
			e.toString();
		}
	}
}
