package com.testyantra.corejava;
 
public class IfElse {
//	static int mon = 3000;
	
	public static void main(String[] args) {
		
		
		int money = 11500;
//		System.out.println(mon<10000?"ChickManglur....":"Goa....");
		
		if (money>10000 && money<11000) {
			System.out.println("Goa");
		}
		else if(money>11000 && money<12000) {
			System.out.println("Delhi");
		}
		else if(money>12000){
			System.out.println("Shimla");
		}
		else {
			System.out.println("Chickmanglur");
		}
		

	}

}
