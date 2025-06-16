package com.example.demo.exceptions;

public class EmployeeNotFoundException  extends RuntimeException{

	public EmployeeNotFoundException(String msg) {
		super(msg);
	}
}
