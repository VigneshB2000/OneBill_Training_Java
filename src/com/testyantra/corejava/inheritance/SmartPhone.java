package com.testyantra.corejava.inheritance;

public class SmartPhone extends Phone{

	int price = 100000;
	int ram = 16;
	double camera = 64.0;
	int cameraCount = 4;
	
	public SmartPhone(int price, int ram, double camera, int cameraCount) {
		super(price,ram);
		this.price=price;
		this.ram = ram;
		this.camera = camera;
		this.cameraCount = cameraCount;
		System.out.println("From SmartPhone This is subclass");
	}

	public SmartPhone(int price, int ram) {
		super(price,ram);
		this.price=price;
		this.ram =ram;
		System.out.println("From SmartPhone This is subclass");
	}


	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	public void play() {
		System.out.println("Playing Sekiro...");
	}

	public void selfie() {
		System.out.println("Taking Selfies...");
	}

}
