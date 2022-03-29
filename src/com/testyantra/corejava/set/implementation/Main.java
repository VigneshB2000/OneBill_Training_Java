package com.testyantra.corejava.set.implementation;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		Student student = new Student(9, "Bruce Wayne", 78.2);
		Student student1 = new Student(2, "Tony Stark", 98.4);
		Student student2 = new Student(6, "Bary Allen", 48.5);
		Student student3 = new Student(4, "Steve Rogers", 66.6);
		Student student4 = new Student(1, "Steve Rogers", 66.6);
		Student student5 = new Student(4, "Steve Rogers", 66.6);

		HashSet<Student> hashSet = new HashSet<>();
		hashSet.add(student2);
		hashSet.add(student1);
		hashSet.add(student3);
		hashSet.add(student);
		hashSet.add(student4);
		hashSet.add(student5);

		for (Student std : hashSet) {
			System.out.println(std);
		}

	}
}
