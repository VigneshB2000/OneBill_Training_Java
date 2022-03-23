package com.testyantra.corejava.abstractclass.example;

public class Alpha  extends Pet{

	@Override
	void sound() {
		System.out.println("Chirpp");
		
	}

	@Override
	void food() {
		System.out.println("Millet");
	}

	@Override
	void play() {
		System.out.println("Combat");
		
	}
	
	void sleep() {
		System.out.println("16 hours");
	}

}
