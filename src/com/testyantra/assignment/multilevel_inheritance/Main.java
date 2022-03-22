package com.testyantra.assignment.multilevel_inheritance;

public class Main {

	public static void main(String[] args) {
		R8 r8 = new R8();
		System.out.println();
		r8.Start();
		r8.Acceleration(r8.Acceleration);
		r8.type();
		r8.Seating(r8.SeatingCapacity);
		r8.MaxSpeed(r8.MaxSpeed);
		r8.MaxPower(r8.MaxPower);
		r8.Stop();

		System.out.println();
		System.out.println("==================================================");
		System.out.println();

		R8 r8etron = new R8(500, 375, 2.5, 2);
		r8etron.Start();
		System.out.println();
		r8etron.Acceleration(r8etron.Acceleration);
		r8etron.type();
		r8etron.Seating(r8etron.SeatingCapacity);
		r8etron.MaxSpeed(r8etron.MaxSpeed);
		r8etron.MaxPower(r8etron.MaxPower);
		r8etron.Stop();

	}

}
