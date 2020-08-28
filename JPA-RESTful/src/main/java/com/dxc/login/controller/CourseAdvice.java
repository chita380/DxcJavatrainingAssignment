package com.dxc.login.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dxc.login.exception.CourseException;

@RestControllerAdvice
public class CourseAdvice {

	@ExceptionHandler(value = {CourseException.class }) // map bet exception class  and advisor class
	public  ResponseEntity<String> handleException1(Exception ex){ // it take any exception as ip
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_REQUEST);
		
	}
	
	
}
