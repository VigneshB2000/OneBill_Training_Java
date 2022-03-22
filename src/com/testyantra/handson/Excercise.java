package com.testyantra.handson;

public class Excercise {

	public static void main(String[] args) {
		int a = 20, b = 30, c = 40;
		System.out.println(a > b && ++c > b);// false
		System.out.println(a++ < b || ++c < b);// true
		System.out.println(a++ < b || ++c < b++);// true
		System.out.println(c);// 40
		System.out.println(a);// 22
		System.out.println(b);// 30

	}

}
