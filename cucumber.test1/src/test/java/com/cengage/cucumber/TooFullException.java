package com.cengage.cucumber;

public class TooFullException extends Exception {
	private static final long serialVersionUID = -2814735068558350146L;

	public TooFullException() {
		// empty
	}

	public TooFullException(String message) {
		super(message);
	}

	public TooFullException(Throwable cause) {
		super(cause);
	}

	public TooFullException(String message, Throwable cause) {
		super(message, cause);
	}
}
