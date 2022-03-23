package com.testyantra.corejava.encapsulation;

public class Company {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		
//		Getters
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getDesignation());
		System.out.println(emp.getSalary());
	
//		Setters
		emp.setName("Gokul");
		emp.setAge(30);
		emp.setDesignation("Engineer");
		emp.setSalary(200000);
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getDesignation());
		System.out.println(emp.getSalary());
		
		

	}
}
