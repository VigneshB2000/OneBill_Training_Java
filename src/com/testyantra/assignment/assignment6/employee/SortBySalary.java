package com.testyantra.assignment.assignment6.employee;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.Salary>o2.Salary) {
			return 1;
		}
		else if(o1.Salary<o2.Salary) {
			return -1;
		}
		else
		return 0;
	}

	

	



	

}
