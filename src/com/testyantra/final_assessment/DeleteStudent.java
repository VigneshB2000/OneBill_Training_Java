package com.testyantra.final_assessment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class DeleteStudent {

	Scanner sc = new Scanner(System.in);
	DeleteStudent(LinkedList<Student> student){
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
