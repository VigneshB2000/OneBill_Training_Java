package com.testyantra.corejava.methodoverriding;

public class Manual {

	public static void main(String[] args) {
		Ferrari frr = new Ferrari();
		frr.drive();
		frr.brake();
		frr.horn();
		
		System.out.println();
		
		Benz bnz = new Benz();
		bnz.drive();
		bnz.brake();
		bnz.horn();
		
		

	}

}
