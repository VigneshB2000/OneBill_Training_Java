package com.testyantra.assignment.assignment6.employee;

public class Employee implements Comparable<Employee> {

	int id;
	String Name;
	String Designation;
	double Salary;

	public Employee(int id, String name, String Designation, double Salary) {
		super();
		this.id = id;
		this.Name = name;
		this.Designation = Designation;
		this.Salary = Salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Designation=" + Designation + ", Salary=" + Salary + "]";
	}

	@Override
	public int compareTo(Employee o) {

		return this.id - o.id;
	}

}
