package com.testyantra.corejava.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet<>();
		hashset.add(10);
		System.out.println(hashset.add(10));
		hashset.add(20);
		hashset.add(30);
		hashset.add(40);
		hashset.add(50);
		Iterator<Integer> iterator = hashset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("========================================");

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		linkedHashSet.add(40);
		linkedHashSet.add(50);
		Iterator<Integer> iterator2 = linkedHashSet.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

		System.out.println("========================================");

		TreeSet<Object> treeSet = new TreeSet<>();
		treeSet.add(40);
		treeSet.add(13);
		treeSet.add(56);
		treeSet.add(01);
		treeSet.add(78);
		treeSet.add(98);
		Iterator<Object> iterator3 = treeSet.iterator();

		while (iterator3.hasNext()) {
			System.out.println(iterator3.next());
		}
		System.out.println("========================================");
	}

}
