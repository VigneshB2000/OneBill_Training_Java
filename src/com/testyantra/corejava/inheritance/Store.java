package com.testyantra.corejava.inheritance;

public class Store {

	public static void main(String[] args) {
		Phone phone = new Phone();

		phone.Call();
		phone.Radio();
		phone.Message("Hello I'm Message");
		System.out.println("RAM: "+phone.ram);
		System.out.println("Price: "+phone.price);
		

		
		System.out.println("=============================================");
		
		SmartPhone smartphone = new SmartPhone();
		smartphone.Call();
		smartphone.play();
		smartphone.Message("This is new ...");
		smartphone.Radio();
		smartphone.selfie();
		System.out.println("RAM: "+smartphone.ram);
		System.out.println("Price: "+smartphone.price);
		
		System.out.println("=============================================");

		
		
		
				
		
	}

}
