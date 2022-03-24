package com.testyantra.corejava.array;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner("System.in");
	   int []b;
	   b = new int[4];
		
		System.out.println("Enter array element");
		for(int i =0;i<4;i++) {
			b[i] = scan.nextInt();
		}
		
		for(int i = 0; i<b.length;i++ ) {
			System.out.print(b[i]);
		}
		

	}

}
