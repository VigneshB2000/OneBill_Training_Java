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
		
		ArrayList list1 = new ArrayList();
		list.add(60);
		list.add(20);
		list.add(1000);
		list.add(440);
		list.add(200);
		list.add(10);
		
		
		
		Iterator<Integer> iterator = list1.iterator();
		Collections.sort(list1);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
