package com.testyantra.assignment;

import java.util.*;

public class OddEven {

	public static void odd(int a) {
		System.out.println("The odd numbers are ");
		for (int i = 1; i <= a; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void even(int a) {
		System.out.println("The even numbers are ");
		for (int i = 0; i <= a; i += 2) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		odd(num);
		even(num);
		sc.close();
	}

}
