package com.testyantra.assignment.assignment7.String;

public class Stringbasics {
	
	public static void concat1( String s1) {
		s1+="Hello";
	}
	public static void concat2( StringBuilder s2) {
		s2.append("Appended");
	}
	public static void concat3( StringBuffer s3) {
		s3.append("Appended");
	}

	public static void main(String[] args) {
		String s1 = "Vicky";
		concat1(s1);
		System.out.println("String: "+s1);
		StringBuilder s2 = new StringBuilder("Vignesh ");
		concat2(s2);
		System.out.println("StringBuilder: "+s2);
		StringBuffer s3 = new StringBuffer("Vicky ");
		concat3(s3);
		System.out.println("StringBuffer :"+s3);
		
		
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sbd = new StringBuilder(s1);
		sbd.append("....");
		System.out.println(sbd);

	}

}
