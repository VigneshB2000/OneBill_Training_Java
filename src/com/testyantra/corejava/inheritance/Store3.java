package com.testyantra.corejava.inheritance;

public class Store3 {
	public static void Main(String[] args) {
		Phone phone = new Phone(1200,6);
		System.out.println(phone.price);
		System.out.println(phone.ram);
		

		Phone phone2 = new Phone(20000,8);
		System.out.println(phone2.price);
		System.out.println(phone2.ram);

	}

}
