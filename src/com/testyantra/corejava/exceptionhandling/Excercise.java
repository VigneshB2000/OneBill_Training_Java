package com.testyantra.corejava.exceptionhandling;

import java.util.Scanner;

public class Excercise {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number");
			int num1 = sc.nextInt();
			System.out.println("Enter second number");
			int num2 = sc.nextInt();
			int res = 0;
			res = num1 / num2;

			int[] a;
			a = new int[res];
			a[4] = 20;
			System.out.println(a[4]);
			System.out.println(res);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The index you are accessing is out of bounds");
		} catch (ArithmeticException e) {
			System.out.println("Denominator should be greater than zero");
		}
		System.out.println("End of Program");
	}
//	catch(ArrayIndexOutOfBoundsException |ArithmeticException e) {
//		if(e instanceof ArrayIndexOutOfBoundsException) {
//			System.out.println("Out of bounds");
//		}
//		if(e instanceof ArithmeticException) {
//			System.out.println("Denominator should be greater than zero");
//		}
//	}
}
