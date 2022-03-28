package com.testyantra.corejava.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class Vignesh {

	public static void main(String[] args) {
		Sasi sd = new Sasi();

		File file = new File("Filee");
		String task;
		try {
			task = sd.task(file);
			System.out.println(task);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
	}

}
