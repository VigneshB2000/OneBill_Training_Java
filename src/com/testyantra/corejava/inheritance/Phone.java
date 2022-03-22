package com.testyantra.corejava.inheritance;

public class Phone {

	int price = 2000;
	int ram = 1;
	
	public Phone() {
		System.out.println("from Phone superclass");
	}

	public Phone(int x, int y) {
		System.out.println("Configuration....");
		int ram = y;
		int price = x; 
	}

	public void Call() {
		System.out.println("Calling...");
	}

	public void Radio() {
		System.out.println("Playing Radio...");
	}

	public void Message(String msg) {
		System.out.println("Messaging...");
	}

}
