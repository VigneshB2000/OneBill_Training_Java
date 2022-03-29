package collections.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Company {

	public static void main(String[] args) {
		Employee vignesh = new Employee(1, "Vignesh", "Software Developer", 30000);
		Employee gokul = new Employee(2, "Gokul", "Software Developer", 30000);
		Employee rajan = new Employee(3, "Rajan", "Software Developer", 30000);
		Employee sasi = new Employee(4, "Sasidharan", "Software Developer", 30000);
		Employee pavi = new Employee(5, "pavithran", "Software Developer", 30000);

		ArrayList<Employee> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(rajan);
		listOfEmployees.add(vignesh);
		listOfEmployees.add(pavi);
		listOfEmployees.add(gokul);
		listOfEmployees.add(sasi);

		Collections.sort(listOfEmployees);

		System.out.println(listOfEmployees);

		SortByID sortbyID = new SortByID();
		SortByName sortbyName = new SortByName();

		Collections.sort(listOfEmployees, sortbyID);
		System.out.println(listOfEmployees);

		Collections.sort(listOfEmployees, sortbyName);
		System.out.println(listOfEmployees);

		System.out.println("===========================================");

		for (int i = 0; i < listOfEmployees.size(); i++) {
			System.out.println(listOfEmployees.get(i));
		}

		System.out.println("===========================================");

		for (Employee employee : listOfEmployees) {
			System.out.println(employee);
		}
		System.out.println("===========================================");

		Iterator<Employee> iterator = listOfEmployees.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
