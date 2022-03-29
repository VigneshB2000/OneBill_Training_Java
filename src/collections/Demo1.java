package collections;

import java.util.List;
import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		List l = new ArrayList();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);

		list.addAll(l);
		ArrayList li = new ArrayList();
		li.add(100);
		li.add(200);

		list.removeAll(li);

		System.out.println(list);

		System.out.println(l);
		System.out.println(list);
		System.out.println(list.get(3));

	}

}