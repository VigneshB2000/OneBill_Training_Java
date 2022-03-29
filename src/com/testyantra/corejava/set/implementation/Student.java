package com.testyantra.corejava.set.implementation;

public class Student {

	int rollNo;
	double mark;
	String Name;

	public Student(int rollNo, String Name, double mark) {
		super();
		this.Name = Name;
		this.rollNo = rollNo;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", mark=" + mark + ", Name=" + Name + "]";
	}

	@Override
	public int hashCode() {

		return rollNo;
	}

	@Override
	public boolean equals(Object obj) {
		Student std = (Student) obj;
		return this.rollNo == std.rollNo;
	}

}
