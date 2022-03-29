package com.testyantra.assignment.assignment7.linkedlist;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student>{

	

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.mark>o2.mark) {
			return 1;
		}
		else if(o2.mark>o1.mark) {
			return -1;
		}
		else
			return 0;
	}



	

}
