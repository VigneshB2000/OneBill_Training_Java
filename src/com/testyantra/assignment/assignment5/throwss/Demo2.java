package com.testyantra.assignment.assignment5.throwss;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo2 {
	
	
	
public String fileread(String f) throws FileNotFoundException{
	File file = new File(f);
	String str = "";
	Scanner scan = new Scanner(file);
	if(file.exists()) {
	while(scan.hasNextLine()) {
		str += scan.nextLine(); 
	}
	return str;
	}
	else {
		try {
		throw new FileNotFoundException("The File mentioned Does not exist");
	}catch(FileNotFoundException e) {
	}}
		return str;
}

	public static void main(String[] args) {
		Demo2 d2 = new Demo2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = sc.nextLine();
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		System.out.println("Upload Supporting Documents:");
		String fil = sc.next();
		try {
		System.out.println(d2.fileread(fil));
		}catch(FileNotFoundException e)
		{
		  System.out.println(e.getMessage());
		}
		finally {
			System.out.println("End of the program");
		}

	}

}
