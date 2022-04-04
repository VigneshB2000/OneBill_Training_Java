package com.testyantra.final_assessment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class GetStudent {
	Scanner sc = new Scanner(System.in);
	GetStudent(LinkedList<Student> student){
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
			}
		}
		if(sts!=true) {
			try {
				throw new MyException("No such ID exists");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
