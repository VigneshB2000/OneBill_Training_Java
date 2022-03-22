package com.testyantra.corejava;

public class Constructor {

	Constructor() {
		System.out.println("Hi I'm From Constructor");
	}

	public static void main(String[] args) {
		Constructor con = new Constructor();
		System.out.println(Methods.add(12, 12));
		System.out.println(Methods.a);

		Methods m = new Methods();
		m.add(2.2, 222);
		System.out.println("The value of B from Methods is" + m.b);

	}

}
