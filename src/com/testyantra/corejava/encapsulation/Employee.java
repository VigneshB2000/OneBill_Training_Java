package com.testyantra.corejava.encapsulation;

public class Employee {
	String Name = "Vicky";
	private int age = 20;
	private String designation = "Trainee";
	private double salary = 20000000;

	public String getName() {
		return Name;
	}

	public int getAge() {
		return age;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
