package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.exceptions.AdminNotFoundException;
import com.example.demo.exceptions.CitizenNotFoundException;
import com.example.demo.exceptions.UserNotFoundException;

@ControllerAdvice
public class AadharException {
	
	@ExceptionHandler(value=AdminNotFoundException.class)
	public ResponseEntity<Object> handleException(AdminNotFoundException ex) {
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<Object> handleException(UserNotFoundException ex) {
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=CitizenNotFoundException.class)
	public ResponseEntity<Object> handleException(CitizenNotFoundException ex) {
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
}
