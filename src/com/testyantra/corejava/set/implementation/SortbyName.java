package com.testyantra.corejava.set.implementation;

import java.util.Comparator;

public class SortbyName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.Name.compareTo(o2.Name);
	}



}
