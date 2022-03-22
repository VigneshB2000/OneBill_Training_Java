package com.testyantra.assignment.multilevel_inheritance;

public class R8 extends Audi {

	int MaxSpeed = 450;
	int MaxPower = 340;
	double Acceleration = 3.9;

	public R8() {
		System.out.println("Model - Audi R8");

	}

	public R8(int MaxSpeed, int MaxPower, double Acceleration, int SeatingCapacity) {
		System.out.println("Model - Audi R8 Etron");
		this.MaxPower = MaxPower;
		this.MaxSpeed = MaxSpeed;
		this.SeatingCapacity = SeatingCapacity;
		this.Acceleration = Acceleration;

	}

	public void Start() {
		System.out.println("Audi - R8 Starts");
	}

	public void Stop() {
		System.out.println("Audi - R8 Stops");
	}

}
