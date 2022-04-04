package com.testyantra.final_assessment;

import java.util.LinkedList;
import java.util.Scanner;

public class AddStudent {

	Scanner sc = new Scanner(System.in);
	AddStudent(LinkedList<Student> student){
		System.out.println("Enter the number of students to be added: ");
		int limit = sc.nextInt();
		System.out.println("Enter the student details in order of ID, Name, Course, Marks");
		for(int i = 1;i<=limit;i++) {
			System.out.println("Enter ID:");
			int id = sc.nextInt();
			System.out.println("Enter Name: ");
			String name = sc.next();
			System.out.println("Enter Course : ");
			String course = sc.next();
			System.out.println("Enter Marks");
			Double mark= sc.nextDouble();
			student.add(new Student(id, name, course,mark));
			System.out.println();
		}
		System.out.println("Details entered Successfully...");
	}
}
