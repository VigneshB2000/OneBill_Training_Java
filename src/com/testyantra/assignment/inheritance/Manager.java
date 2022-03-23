package com.testyantra.assignment.inheritance;

public class Manager extends Member {
	String Department;
	public Manager(String Name, int Age, long PhoneNumber, String Address, long Salary, String Department) {
		super(Name, Age, PhoneNumber, Address, Salary);
		System.out.println("From Manager Class... ");
		System.out.println("Department: " +Department);
		
	}

	

}
