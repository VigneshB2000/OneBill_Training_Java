package com.testyantra.assignment.assignment5;

import java.util.Scanner;
import java.util.Arrays;

public class Fibonacci {

	public static int fibo(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else
			return (fibo(num - 1) + fibo(num - 2));
	}

	public static void main(String[] args) {
		System.out.println("Enter the limit: ");
		try {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int array[] = new int[n];

			for (int i = 0; i < n; i++) {
				array[i] = fibo(i);
			}
			sc.close();
			System.out.println("The Fibonacci Numbers till " + n + " :");
			System.out.println(Arrays.toString(array));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
