package com.testyantra.assignment.assignment6.arraylist;

public class Student implements Comparable<Student> {

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
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.rollNo - o.rollNo;
	}

}
