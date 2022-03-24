package com.testyantra.assignment.assignment3.finalclass;

public class SubClass /*extends MainClass */ { //cannot be inherited

	int a = 90;
	static int b = 100;
	public static void main(String[] args) {
		MainClass mainclass = new MainClass();
		mainclass.Display();
		SubClass sc = new SubClass();
		mainclass.Display(sc.a, b);

	}

}
