package com.testyantra.corejava.mthd_ovrldng;

public class Finall {
	public static void Main(String[] args) {
		Test1 t1 = new Test1();
		t1.message();
		System.out.println(t1.add(2, 1));
		
		
		System.out.println("==========================");
		
		Test t = new Test();
		t.message();
		System.out.println(t.add(2, 1));
	}

}
