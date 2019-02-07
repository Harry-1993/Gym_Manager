package com.gym.demo.exception;

import org.springframework.http.HttpStatus;

public class CustomerExceptionClass extends Exception{

	private HttpStatus code;
	private String message;
	
	public CustomerExceptionClass() {
		
	}//end def constructor
	

	public CustomerExceptionClass(HttpStatus code, String message) {
		super();
		this.code = code;
		this.message = message;
	}//end param constructor


	public HttpStatus getCode() {
		return code;
	}

	public void setCode(HttpStatus code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
