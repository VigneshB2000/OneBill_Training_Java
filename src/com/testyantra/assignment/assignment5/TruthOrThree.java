package com.testyantra.assignment.assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class TruthOrThree {

	public boolean Condition(int[] Array) {
		int count = 0;
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] == 3) {
				count++;
			}
			if (i + 1 < Array.length) {
				if (Array[i] == 3 && Array[i + 1] == 3) {
					return false;
				}
			}
		}

		if (count == 3) {
			return true;
		}
		return false;
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
			TruthOrThree tt = new TruthOrThree();
			System.out.println(tt.Condition(array));
			System.out.println(Arrays.toString(array));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
