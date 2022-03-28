package com.testyantra.assignment.assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class AddingInput {

	public static int add(int[] a) {

		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum += a[i];
		}
		return sum;

	}

	public static void main(String[] args) {
		try {
			System.out.println("Enter the number of inputs to be used: ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int array[] = new int[n];

			for (int i = 0; i < array.length; i++) {
				array[i] = sc.nextInt();
			}
			sc.close();
			System.out.println(Arrays.toString(array));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
