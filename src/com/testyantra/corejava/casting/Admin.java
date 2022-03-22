package com.testyantra.corejava.casting;

public class Admin extends User {
	
	public Admin(String name, long number) {
		super(name, number);
		System.out.println("From Admin");
	}
	
	public void addUser(String username, long number) {
		System.out.println(username + " added");
	}
	
	public void RemoveUser(String username, long number) {
		System.out.println(username+" removed");
	}

}
