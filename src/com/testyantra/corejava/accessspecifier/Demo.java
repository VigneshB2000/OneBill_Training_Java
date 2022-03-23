package com.testyantra.corejava.accessspecifier;

public class Demo {

	public int x = 10;
	protected int y = 20;
	int z = 30;
	private int a = 40;

	public void Showpub() {
		System.out.println(x);
	}
	protected void Showpro() {
		System.out.println(y);
	}
	 void Showdef() {
		System.out.println(z);
	}
	private void Showpri() {
		System.out.println(a);
	}

}
