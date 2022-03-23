package com.testyantra.corejava.interfaceclass;

public class Student {

	public static void main(String[] args) {
		Calculator cal  = new Casio();
		System.out.println(cal.add(10,  20));
		System.out.println(cal.subtract(20,  10));
		System.out.println(cal.multiply(10, 20));
		System.out.println(cal.divide(20, 10));
		
		System.out.println();
		
		Calculator cal1 = new Texas();
		System.out.println(cal1.add(10,  20));
		System.out.println(cal1.subtract(20,  10));
		System.out.println(cal1.multiply(10, 20));
		System.out.println(cal1.divide(20, 10));
		

	}

}
