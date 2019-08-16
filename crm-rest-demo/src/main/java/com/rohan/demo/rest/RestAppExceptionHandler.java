package com.rohan.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestAppExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handlerException(CustomerNotFoundException ex){
		CustomerErrorResponse error = new CustomerErrorResponse();
		
		error.setStatusCode(HttpStatus.NOT_FOUND.value());
		error.setMessage(ex.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handlerException(Exception ex){
		CustomerErrorResponse error = new CustomerErrorResponse();
		
		error.setStatusCode(HttpStatus.BAD_REQUEST.value());
		error.setMessage(ex.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
