package com.testyantra.final_assessment.interview;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class DeleteStudent {

	Scanner sc = new Scanner(System.in);
	DeleteStudent(TreeSet<Student> student){
		System.out.println("Enter the ID of the Student: ");
		int delId = sc.nextInt();
		Iterator<Student> iter = student.iterator();
		while (iter.hasNext()) {
			Student s = iter.next();
			if (s.getId() == delId) {
				student.remove(s);
				System.out.println("ID deleted successfully");
				break;
			}

		}

	}
	
}
