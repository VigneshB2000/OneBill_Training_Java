package collections.implementation;

import java.util.Comparator;

public class SortByID implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.id - o2.id;
	}

}
