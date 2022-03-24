package com.testyantra.assignment.assignment3.two;

public class SubClass extends MainClass {

	@Override
	public void a_method() {
		System.out.println("This is abstract method");
	}

	public static void main(String[] args) {
		SubClass subclass = new SubClass();
		subclass.a_method();
		subclass.na_method();
	}

}
