package com.testyantra.assignment.multilevel_inheritance;

public class Audi extends Car {
	String Manufacturer = "Audi";
	int SeatingCapacity = 5;

	public Audi() {
		System.out.println("Brand - Audi");
	}
	

	public void Start() {
		System.out.println("Audi Starts");
	}

	public void MaxSpeed(int m) {
		System.out.println("Maximum speed is " + m + " kmph");
	}

	public void MaxPower(int p) {
		System.out.println("Maximum Power is " + p + " kWh");
	}
	public void type() {
		System.out.println("Type: Sportscar");
	}
}
