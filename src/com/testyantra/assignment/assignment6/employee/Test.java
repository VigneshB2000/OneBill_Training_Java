package com.testyantra.assignment.assignment6.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		ArrayList<Employee> employee = new ArrayList<>();
		employee.add(new Employee(002, "HHH", "Developer", 76500.00));
		employee.add(new Employee(004, "KKK", "Developer", 43200.00));
		employee.add(new Employee(001, "BBB", "Developer", 89000.00));
		employee.add(new Employee(007, "NNN", "Developer", 67700.00));
		employee.add(new Employee(005, "LLL", "Developer", 98900.00));
		employee.add(new Employee(003, "DDD", "Developer", 56800.00));
		employee.add(new Employee(010, "RRR", "Developer", 45000.00));
		employee.add(new Employee(006, "MMM", "Developer", 12600.00));

		System.out.println("ArrayList Before Sorting");
//			System.out.println(employee);

		Iterator<Employee> iterator = employee.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		Collections.sort(employee);
		System.out.println("After Sorting..");

		System.out.println("Select the sorting criteria: \n 1.Name 2.ID 3.Salary");
		Scanner sc = new Scanner(System.in);
		String var = sc.next();
		switch (var) {

		case "Name":
		case "NAME":
		case "name": {
			SortByName sortbyname = new SortByName();
			Collections.sort(employee, sortbyname);
			break;
		}
		case "ID":
		case "id":
		case "Id": {
			SortByID sortbyid = new SortByID();
			Collections.sort(employee, sortbyid);
			break;
		}
		case "Salary":
		case "SALARY":
		case "salary": {
			SortBySalary sortbysalary = new SortBySalary();
			Collections.sort(employee, sortbysalary);
		}
		default: {
			System.out.println("Bad Input");
		}
		}

		for (Employee element : employee) {
			System.out.println(element);
		}

	}

}
