package com.testyantra.final_assessment;

import java.util.LinkedList;
import java.util.Scanner;

public class SortStudent {

	Scanner sc = new Scanner(System.in);
	SortStudent(LinkedList<Student> student){
		System.out.println("Enter the way the list is to be sorted: 1.Name 2.ID 3.Marks 4.Course");
		int sort = sc.nextInt();
		switch (sort) {
		case 1: {
			SortByName sortByName = new SortByName();
			student.sort(sortByName);
			break;
		}
		case 2: {
			SortById sortById = new SortById();
			student.sort(sortById);
			break;
		}
		case 3: {
			SortByMarks sortByMarks = new SortByMarks();
			student.sort(sortByMarks);
			break;
		}
		case 4: {
			SortByCourse sortByCourse = new SortByCourse();
			student.sort(sortByCourse);
			break;
		}
		default:
			System.out.println("Enter a valid Choice");
			System.out.println();
		}
	}

}
