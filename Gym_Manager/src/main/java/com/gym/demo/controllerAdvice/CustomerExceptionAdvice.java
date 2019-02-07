package com.gym.demo.controllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.gym.demo.exception.CustomerExceptionClass;
import com.gym.demo.exception.CustomerNotFound;

@ControllerAdvice
public class CustomerExceptionAdvice {

	@ExceptionHandler(value = CustomerNotFound.class)
	public ResponseEntity customerNotFound()
	{
		return new ResponseEntity(new CustomerExceptionClass(HttpStatus.NOT_FOUND, "Customer not found"),HttpStatus.NOT_FOUND);
	}//end customerNotFound
}
