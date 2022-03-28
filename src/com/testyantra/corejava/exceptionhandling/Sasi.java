package com.testyantra.corejava.exceptionhandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Sasi {

	public String task(File file) throws IOException {
		String s = "";
		FileReader fr = new FileReader(file);
		int read  = fr.read();
		while(read!=-1) {
			s=s+((char) read);
			read = fr.read();
		}

		return s;
	}

}
