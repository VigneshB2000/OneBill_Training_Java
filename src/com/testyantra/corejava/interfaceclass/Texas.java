package com.testyantra.corejava.interfaceclass;

public class Texas implements Calculator {
	
	@Override
	public int add(int x, int y) {
		return x+y+1;
	}

	@Override
	public int subtract(int x, int y) {
		return x-y-1;
	}

	@Override
	public int multiply(int x, int y) {
		return x*y*10;
	}

	@Override
	public int divide(int x, int y) {
		return x/y/10;
	}

}
