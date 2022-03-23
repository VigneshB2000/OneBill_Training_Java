package com.testyantra.corejava.interfaceclass;

public class Casio implements Calculator {

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int subtract(int x, int y) {
		return x-y;
	}

	@Override
	public int multiply(int x, int y) {
		return x*y;
	}

	@Override
	public int divide(int x, int y) {
		return x/y;
	}

	

}
