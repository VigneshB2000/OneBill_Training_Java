package com.testyantra.corejava.hasarelationship;

public class Flipkart {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		Battery battery = new Battery();
	    Screen screen = new Screen();
	    ROM rom = new ROM();
	    
	    battery.brand = "Dell";
	    battery.capacity = 20000;
	    battery.type = "Lithum- ion";
	    
	    rom.type = "DDR4";
	    rom.size = 32;
	    rom.clockSpeed = 3.6;
	    
	    screen.brand = "Samsung";
	    screen.resolution = 4320;
	    screen.size = 32;
	    screen.type = "OLED";
	    
	    laptop.Brand = "HP";
	    laptop.Price=100000;
	    
	    laptop.battery = battery;
	    laptop.rom = rom;
	    laptop.screen = screen;
	    
	    System.out.println(laptop);
	}

	
}
