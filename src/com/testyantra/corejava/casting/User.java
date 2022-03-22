package com.testyantra.corejava.casting;

public class User {
	
	String name;
	long number;
	
	public User(String name, long number) {
		this.name = name;
		System.out.println("From User " + name);
		this.number = number;
		
	}
	
	public User() {
		System.out.println("From User...");
	}
	
	public void chat() {
		System.out.println(name+" is chatting");
	}
	
	public void videocall() {
		System.out.println(name+" is videoCalling");
	}

	

}
