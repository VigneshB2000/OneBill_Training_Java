package com.testyantra.corejava.methodoverriding;

public class Benz extends Carr {

	@Override
	public void brake() {
		System.out.println("New Brakes Installed");
	}
}
