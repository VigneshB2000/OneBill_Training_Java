package com.testyantra.corejava.abstractclass;

public class Child extends Testing {

	public Child(int x) {
		super(x);
	}

	@Override
	void m1() {
		System.out.println("This is an implementation");
	}
}