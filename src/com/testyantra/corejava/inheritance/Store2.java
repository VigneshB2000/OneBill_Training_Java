package com.testyantra.corejava.inheritance;

public class Store2 {

	public static void main(String[] args) {
		Samsung sam = new Samsung();
		sam.price = 11000;
		sam.ram = 6;
		sam.camera=48.0;
		sam.cameraCount = 4;
		sam.SpecialFeature = "Foldable";
		sam.Call();
		
		
		IPhone ip = new IPhone();
		ip.os = "IOS";
		ip.remind();
		

	}

}
