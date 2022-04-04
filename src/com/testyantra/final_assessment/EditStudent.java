package com.testyantra.final_assessment;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class EditStudent{

	Scanner sc = new Scanner(System.in);
	public EditStudent(LinkedList<Student> student){
		System.out.println("Enter the ID of the Student: ");
		int editId = sc.nextInt();
		System.out.println("Name :");
		String editName = sc.next();
		System.out.println("Course : ");
		String editCourse = sc.next();
		System.out.println("Marks : ");
		double editMark = sc.nextDouble();

		ListIterator<Student> iter = student.listIterator();
		System.out.println("");
		while (iter.hasNext()) {
			Student s = iter.next();
			if (s.getId() == editId) {
				iter.set(new Student(editId, editName, editCourse, editMark));
				System.out.println("ID edited successfully");
				break;
			} else {
				System.out.println("Enter correct ID..");
				break;
			}
		}	
	}
	
}
