package com.testyantra.assignment.inheritance;

public class Member {
	String Name;
	int Age;
	long PhoneNumber;
	String Address;
	long Salary;
	
	public Member(String Name, int Age, long PhoneNumber, String Address, long Salary) {
		System.out.println("From Member Class ...");
		System.out.println("Name: " + Name);
		System.out.println("Age: " + Age);
		System.out.println("PhoneNumber: " + PhoneNumber);
		System.out.println("Address: " + Address);
		printSalary(Salary);
		System.out.println();
	}

	public void printSalary(long salary) {
		System.out.println("Salary: "+ salary);
	}
	

}
