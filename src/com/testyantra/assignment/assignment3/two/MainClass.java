package com.testyantra.assignment.assignment3.two;

public abstract class MainClass {
	MainClass(){
		System.out.println("This is constructor of abstact class");
	}
	public  abstract void a_method();
	
	public void na_method() {
		System.out.println("This is normal method of Abstract Class");
	}
}
