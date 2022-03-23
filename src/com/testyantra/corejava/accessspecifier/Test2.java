package com.testyantra.corejava.accessspecifier;

public class Test2 {
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.x);
		System.out.println();
		
		demo.Showpub();
		demo.Showpro();
		demo.Showdef();
//		demo.Showpri();
	
	
		System.out.println(demo.x);
		System.out.println(demo.y);
		System.out.println(demo.z);
//		System.out.println(demo.a);
	}
}
