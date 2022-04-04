package collections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyDemo {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		list.add(60);
		list.add(20);
		list.add(1000);
		list.add(440);
		list.add(200);
		list.add(10);
		list.test();
//		System.out.println(list.get(2));
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(60);
		list1.add(20);
		list1.add(1000);
		list1.add(440);
		list1.add(200);
		list1.add(10);
		
		
		
		Iterator<Integer> iterator = list1.iterator();
		Collections.sort(list1);

//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		for( Object o: list1) {
			System.out.println(o);
		}
	}

}
