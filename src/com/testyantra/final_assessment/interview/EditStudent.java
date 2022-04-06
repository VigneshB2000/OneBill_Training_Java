package com.testyantra.final_assessment.interview;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeSet;

public class EditStudent{

	Scanner sc = new Scanner(System.in);
	public EditStudent(TreeSet<Student> student){
		System.out.println("Enter the ID of the Student: ");
		int editId = sc.nextInt();
		System.out.println("Name :");
		String editName = sc.next();
		System.out.println("Course : ");
		String editCourse = sc.next();
		System.out.println("Marks : ");
		double editMark = sc.nextDouble();
		
		LinkedList<Student> stud = new LinkedList<Student>();

		ListIterator<Student> iter = stud.listIterator();
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
