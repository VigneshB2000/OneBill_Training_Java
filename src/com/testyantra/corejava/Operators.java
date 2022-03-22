package com.testyantra.corejava;

public class Operators {

	public static void main(String[] args) {
//      Unary Operators
		float a = 10;
		System.out.println(a); //10
		System.out.println(++a); //11
		System.out.println(a++); //11
		System.out.println(a);//12
		System.out.println(--a);//11
		System.out.println(a--);//11
		System.out.println(a);//10
		
		//Arithmetic Operators
		
		a=20;
		float b=30;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
		//Relational Operators
		
		b = 40;
		System.out.println(a<=b);//true
		System.out.println(a>=b);//false
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		
		
		//Logical Operators
		
		b = 5;
		int c = 40;
		System.out.println(c>a && c>b);//true
		System.out.println(c>a || c>b);//true
		
		
		//Bitwise Operators
		
		System.out.println(10&2);//2
		System.out.println(10|2);//10
		System.out.println(4|2);//6
		System.out.println(4|10);//14


	}

}
