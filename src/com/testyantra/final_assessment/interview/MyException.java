package com.testyantra.final_assessment.interview;

@SuppressWarnings("serial")
public class MyException extends Exception{

	String message;
	public MyException(String msg) {
		message = msg;
	}
	public String getMessage() {
		System.out.println("Error");
		return message;
	}
}
