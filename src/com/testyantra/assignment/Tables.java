package com.testyantra.assignment;

import java.util.*;

public class Tables {

	public static void tables(int a) {
		System.out.println("The tables are ");
		for (int i = 1; i <= 20; i++) {
			System.out.println(a + " * " + i + " = " + i * a);
		}

	}

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		tables(num);
		sc.close();
	}

}
