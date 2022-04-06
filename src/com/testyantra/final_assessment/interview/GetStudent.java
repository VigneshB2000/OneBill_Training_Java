package com.testyantra.final_assessment.interview;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class GetStudent {
	Scanner sc = new Scanner(System.in);
	GetStudent(TreeSet<Student> student){
		System.out.println("Enter the ID of the Student: ");
		int getId = sc.nextInt();
		Iterator<Student> iter = student.iterator();
		boolean sts = false;
		while (iter.hasNext()) {
			Student s = iter.next();
			if (s.getId() == getId) {
				System.out.println("Name: " + s.getName());
				System.out.println("ID: " + s.getId());
				System.out.println("Course: " + s.getCourse());
				System.out.println("Marks: " + s.getMarks());
				sts=true;
				return;
			}
		}
		if(sts!=true) {
			try {
				throw new MyException("No such ID exists");
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
				return;
			}
		}
	}

}
