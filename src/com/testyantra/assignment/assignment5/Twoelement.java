package com.testyantra.assignment.assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Twoelement {

	public int[] returntwo(int[] a) {

		if (a.length >= 2) {
			int newArray[] = new int[2];
			for (int i = 0; i < 2; i++) {
				newArray[i] = a[i];
			}

			return newArray;
		} else
			return a;

	}

	public static void main(String[] args) {

		Twoelement two = new Twoelement();
		System.out.println("Enter the limit of the array:");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			int array[] = new int[num];
			for (int i = 0; i < num; i++) {
				array[i] = sc.nextInt();
			}
			sc.close();
			if (array.length >= 2) {
				System.out.println("The first two elements are " + Arrays.toString(two.returntwo(array)));
			} else {
				System.out.println("Array cinsits of " + Arrays.toString(two.returntwo(array)));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
