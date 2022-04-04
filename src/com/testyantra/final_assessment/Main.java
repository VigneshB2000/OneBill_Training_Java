package com.testyantra.final_assessment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Map.Entry;

import java.util.Scanner;

public class Main extends Student {

	Main(int id, String name, String course, double marks) {
		super(id, name, course, marks);
	}

	static LinkedList<Student> student = new LinkedList<>();

	public static void main(String[] args) {

		student.add(new Student(2, "BBB", "Python", 76.0));
		student.add(new Student(9, "GGG", "CyberSecurity", 90.5));
		student.add(new Student(3, "JJJ", "Java", 89.2));
		student.add(new Student(7, "NNN", "C++", 34.5));
		student.add(new Student(1, "QQQ", "Java", 55.4));
		student.add(new Student(8, "YYY", "CyberSecurity", 69.0));
		student.add(new Student(10, "OOO", "Java", 95.3));
		student.add(new Student(4, "ZZZ", "Python", 88.8));
		student.add(new Student(16, "XXX", "C++", 40.7));

		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Add Student");
		hashMap.put(2, "Edit Student");
		hashMap.put(3, "Delete Student");
		hashMap.put(4, "List of Students");
		hashMap.put(5, "Get Student by ID");
		hashMap.put(6, "Sort List");
		hashMap.put(7, "Exit");

		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();

		boolean status = true;
		int selection;
		Scanner sc = new Scanner(System.in);

		while (status) {
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			System.out.println();
			System.out.println("**********************************************");
			System.out.println("Enter the operation you wanna continue");
			selection = sc.nextInt();

			switch (selection) {
			case 1: {
				new AddStudent(student);
				System.out.println();
				System.out.println("**********************************************");
				break;
			}
			case 2: {
				new EditStudent(student);
				System.out.println();
				System.out.println("**********************************************");
				break;
			}
			case 3: {
				new DeleteStudent(student);
				System.out.println();
				System.out.println("**********************************************");
				break;
			}
			case 4: {
				Iterator<Student> iter = student.iterator();
				while (iter.hasNext()) {
					System.out.println(iter.next());
				}
				System.out.println();
				System.out.println("**********************************************");
				System.out.println();
				break;
			}
			case 5: {
				new GetStudent(student);
				System.out.println();
				System.out.println("**********************************************");
				System.out.println();
				break;
			}
			case 6: {
				new SortStudent(student);
				for (Student s : student) {
					System.out.println(s);
				}
				System.out.println();
				System.out.println("**********************************************");
				System.out.println();
				break;
			}
			case 7: {
				status = false;
				break;
			}
			default:
				System.out.println("Please enter correct number. Try again...");
				System.out.println();
				System.out.println("**********************************************");
				System.out.println();
				break;
			}
		}

		sc.close();
		System.out.println("Thank You...");
		System.out.println("**********************************************");
	}

}
