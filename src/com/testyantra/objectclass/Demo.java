package com.testyantra.objectclass;

import java.util.LinkedList;

public class Demo {
	
	
	@Override
	public String toString() {
		return "O";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof LinkedList<?>) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	protected void finalize()throws Throwable {
		System.out.println("this is from Finalize");
	}
	
	

	public static void main(String[] args) {
		

		Demo a = new Demo();
		System.out.println(a);
		
		Demo demo2 = new Demo();
		System.out.println("This is object 2 of demo "+ demo2);
//		boolean equals = demo2.equals(demo);
//		System.out.println(equals);
		
		a = null;
		
		Demo demo3 = new Demo();
		int hashCode  = demo3.hashCode();
		System.out.println(hashCode);
		demo2 = null;
		demo3 = null;
		System.gc();
	}
}
	


