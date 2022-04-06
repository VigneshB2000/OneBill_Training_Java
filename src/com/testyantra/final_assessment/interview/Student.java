package com.testyantra.final_assessment.interview;


public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private double marks;
	private String course;

	Student(int id, String name, String course, double marks) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public Student() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}

	@Override
	public int compareTo(Student o) {
		return o.getId();
	}

}
