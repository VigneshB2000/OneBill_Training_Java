package com.testyantra.assignment.assignment3.finalclass;

public final class MainClass {

	int x = 10;
	static int y = 20;
	MainClass(){
		System.out.println("This is Constructor from Main Class");
	}
	public void Display() {
		System.out.println("Instance variable is "+x);
		System.out.println("Static variable is "+y);
	}
	public void Display(int a, int b) {
		System.out.println("Instance variable is " + a);
		System.out.println("Global Variable is "+ b);
	}
}
