package com.testyantra.assignment.multilevel_inheritance;

public class Car {
	

	int Wheels = 4;
	String VehicleType = "Car";
	int MaxPower;
	int MaxSpeed;
	Long Price;
	double a;
	Car(){
		System.out.println("Analyais of Cars...");
	}

	public void Start() {
		System.out.println("Car Starts");
	}
	
	public void Acceleration(double a) {
		this.a = a;
		System.out.println("Acceleration: 0-100kms in "+ a + " seconds");
	}
	
	public void Seating(int Seat) {
		System.out.println("Maximum Seating Capacity: "+  Seat);
	}
	public void Stop() {
		System.out.println("Car Stops");
	}
}
