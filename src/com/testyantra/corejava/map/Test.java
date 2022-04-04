package com.testyantra.corejava.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		HashMap<String, Long> hashMap = new HashMap<>();
		hashMap.put("Aajan", 918273645l);
		hashMap.put("Rahman", 187654329l);
		hashMap.put("Caveen", 123456789l);

		Set<Entry<String, Long>> entrySet = hashMap.entrySet();

		Iterator<Entry<String, Long>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		Set<String> keySet = hashMap.keySet();
		for(String name:keySet) {
			System.out.println(name);
		}
	
		for(String name:keySet) {
			System.out.println(hashMap.get(name));
		}
		

	}

}
