package com.testyantra.corejava.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program Started");
		File file = new File("File");
		try {
			FileReader fr = new FileReader(file);
			int read = fr.read();
			while (read != -1) {
				System.out.println((char) read);
				read = fr.read();

			}
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found exception");
		} catch (IOException e) {
			System.out.println("No data exist");
		}

		System.out.println("\nProgram Ends");

	}

}
