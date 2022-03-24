package com.testyantra.corejava.staticblock;

public class Staticblock {

	static int a ;
 static void show() {
	    a = a+10;
		System.out.println("Static method : a = "+a);
	}
	static {
		a=5;
		System.out.println(a);
		show();
	}
	public static void main(String[] args) {
		System.out.println("Main method");

	}

}
