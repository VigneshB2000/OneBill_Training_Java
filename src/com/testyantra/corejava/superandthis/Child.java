package com.testyantra.corejava.superandthis;

public class Child extends Parent {
	int z;
	int a;
	int b;
	int c;
	int d;

	public Child(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("from child ------> 3 parameters");

	}

	public Child(int x, int y, int z, int a, int b) {
//		super(x,y);
//		this.z = z;
		this(x, y, z);
		this.a = a;
		this.b = b;
		System.out.println("from child ------> 5 parameters");

	}

	public Child(int x, int y, int z, int a, int b, int c, int d) {
		this(x, y, z, a, b);
		this.c = c;
		this.d = d;
		System.out.println("from child ------> 7 parameters");
	}

}
