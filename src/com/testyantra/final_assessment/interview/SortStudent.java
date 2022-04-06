package com.testyantra.final_assessment.interview;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class SortStudent {

	Scanner sc = new Scanner(System.in);
	SortStudent(TreeSet<Student> student){
		LinkedList<Student> stud = new LinkedList<Student>();
		System.out.println("Enter the way the list is to be sorted: 1.Name 2.ID 3.Marks 4.Course");
		int sort = sc.nextInt();
		switch (sort) {
		case 1: {
			SortByName sortByName = new SortByName();
			stud.sort(sortByName);
			break;
		}
		case 2: {
			SortById sortById = new SortById();
			stud.sort(sortById);
			break;
		}
		case 3: {
			SortByMarks sortByMarks = new SortByMarks();
			stud.sort(sortByMarks);
			break;
		}
		case 4: {
			SortByCourse sortByCourse = new SortByCourse();
			stud.sort(sortByCourse);
			break;
		}
		default:
			System.out.println("Enter a valid Choice");
			System.out.println();
		}
	}

}
