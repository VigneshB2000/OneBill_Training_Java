package com.testyantra.assignment.constructor;

public class Student {
	
	String Name;

	public Student(){
		System.out.println("Error: Unknown value");
	}
	
	public Student(String Name) {
		System.out.println("Name: "+Name);
	}
}
