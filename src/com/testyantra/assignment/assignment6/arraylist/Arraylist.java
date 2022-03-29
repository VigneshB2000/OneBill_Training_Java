package com.testyantra.assignment.assignment6.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import collections.implementation.Employee;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<Student> Stud = new ArrayList<>();
		Stud.add(new Student(002, "HHH", 76.5));
		Stud.add(new Student(004, "KKK", 43.2));
		Stud.add(new Student(001, "BBB", 89.0));
		Stud.add(new Student(007, "NNN", 67.7));
		Stud.add(new Student(005, "LLL", 98.9));
		Stud.add(new Student(003, "DDD", 56.8));
		Stud.add(new Student(010, "RRR", 45.0));
		Stud.add(new Student(006, "MMM", 12.6));

		System.out.println("ArrayList Before Sorting");
//			System.out.println(Stud);
		Iterator<Student> iterator = Stud.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//			Collections.sort(Stud);
		System.out.println("After Sorting..");
		System.out.println("Select the sorting criteria: \n 1.Name 2.RollNo 3.Mark");
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();

		switch (var) {
		case 1: {
			SortByName sortbyname = new SortByName();
			Collections.sort(Stud, sortbyname);
			break;
		}
		case 2: {
			SortByRollNo sortbyrollno = new SortByRollNo();
			Collections.sort(Stud, sortbyrollno);
			break;
		}
		case 3: {
			SortByMarks sortbymarks = new SortByMarks();
			Collections.sort(Stud, sortbymarks);
			break;
		}
		default: {
			System.out.println("Bad Input");
		}
		}

		for (Student element : Stud) {
			System.out.println(element);
		}

	}

}
