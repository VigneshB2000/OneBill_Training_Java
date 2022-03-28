package com.testyantra.corejava.handson.exception;

public class License {

	private String Name;
	private int age;

	public void applyForLicense(String Name, int age) {
		License license = new License();
        
		license.Name = Name;
		license.age = age;
		

		System.out.println("Name : " + license.Name);
		System.out.println("Age : " + license.age);

		if (age >= 18) {
			System.out.println("You are eligible for applying License");
		} else {
			try {
				throw new UnderageException("Under age");
			} catch (UnderageException u) {
				System.out.println(u.getMessage());
			}
		}
	}

}
