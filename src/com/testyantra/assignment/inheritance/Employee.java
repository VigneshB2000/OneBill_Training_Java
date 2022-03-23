package com.testyantra.assignment.inheritance;

public class Employee extends Member {

	String Specialization;
	
	public Employee(String Name, int Age, long PhoneNumber, String Address, long Salary, String Specialization) {
		
		super(Name, Age, PhoneNumber, Address, Salary);
		System.out.println("From Employee Class... ");
		System.out.println("Specialization: "+ Specialization);
		
	}

}
