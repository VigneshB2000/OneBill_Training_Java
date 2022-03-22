package com.testyantra.assignment;

import java.util.Scanner;

public class Series {

	public static void series(int a, int b, int num) {
		int sum;

		for (int i = 0; i < num; i++) {
			int result = 0;
			for (int j = 0; j <= i; j++) {
				result = (int) (result + (Math.pow(2, j) * b));
			}
			sum = result + a;
			System.out.print(sum + ", ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a = sc.nextInt();
		System.out.println("Enter the value for b");
		int b = sc.nextInt();
		System.out.println("Enter the limit value");
		int num = sc.nextInt();
		series(a, b, num);
		sc.close();
	}

}
