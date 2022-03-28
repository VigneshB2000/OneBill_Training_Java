package com.testyantra.assignment.assignment5.throwss;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
	
	public int age() throws InputMismatchException{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		return age;
		
	}
	
	public void fun(int a, int b) throws ArithmeticException{
		int result = a/b;
	}

	public static void main(String[] args) {
	
		System.out.println("Enter your age in numbers:");
		Demo1 demo = new Demo1();
		int num1 = 21, num2=0;
		try {
		System.out.println(demo.age());
		}catch(InputMismatchException i) {
			System.out.println("Input Mismatch Exception Occurred");
		}
		try {
			demo.fun(num1, num2);
		}catch(ArithmeticException i) {
			System.out.println("Arithmetic Exception Occurred");
		}
		finally {
			System.out.println("Program ends");
		}

	}

}
