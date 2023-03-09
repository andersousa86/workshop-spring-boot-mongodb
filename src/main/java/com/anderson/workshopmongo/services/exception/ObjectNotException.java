package com.anderson.workshopmongo.services.exception;

public class ObjectNotException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ObjectNotException(String msg) {
		super(msg);
	}

}
