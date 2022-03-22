package com.testyantra.corejava.inheritance;

public class Store4 {
public static void main(String[] arg) {
	SmartPhone smartphone = new SmartPhone(2000,4, 56.0, 3);
	System.out.println(smartphone.price);
	System.out.println(smartphone.ram);
	System.out.println(smartphone.camera);
	System.out.println(smartphone.cameraCount);
	
	SmartPhone smartphone1 = new SmartPhone(11000,16);
	System.out.println(smartphone1.price);
	System.out.println(smartphone1.ram);
}
}
