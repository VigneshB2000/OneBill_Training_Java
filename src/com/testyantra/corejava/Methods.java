package com.testyantra.corejava;

public class Methods {

	
	Methods(){
		System.out.println("I'm from Methods");
	}
	
	static int a = 10;
	int b = 20;
	
	
	static int add(int x, int y) {
		return x + y;
	}

//	static int product(int x, int y) {
//		return x * y;
//	}
//
//	static double division(double x, double y) {
//		return x / y;
//	}
//
//	static boolean logic(boolean x, boolean y) {
//		return x && y;
//	}

//	Method Overloading = different number of arguments
	static void add(int x, int y, int z) {
		System.out.println(x + y + z);
	}

//	Method Overloading = different type of arguments
	static void add(double x, double y) {
		System.out.println(x * y);
	}

	static void add(double x, int y) {
		System.out.println(x * y);
	}
	
//	Method Overloading = Sequence of args

	static void add(int x, double y) {
		System.out.println(x * y);
	}

	public static void main(String[] args) {

		System.out.println(Methods.add(2, 5));
//		System.out.println(Methods.product(5, 3));
//		System.out.println(Methods.division(75.5, 5));
//		System.out.println(Methods.logic(false, true));
	}

}
