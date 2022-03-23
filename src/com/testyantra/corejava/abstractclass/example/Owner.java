package com.testyantra.corejava.abstractclass.example;

public class Owner {

	public static void main(String[] args) {
		Pet p = new Alpha();
//		pet p = new Beta();
		p.sound();
		p.food();
		p.play();
//		p.sleep(); Pops out error
		Alpha a = (Alpha) p; // subclass subclass.obj = (Subclass) sperclass.obj 
		a.sleep(); //Down casting
		
		 

	}

}
