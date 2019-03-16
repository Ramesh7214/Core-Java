package com.gbn.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsKeyword {

	public void readFile() throws IOException {
		FileInputStream fis = null;
		fis = new FileInputStream("B:/myfile.txt");
		int k;

		while ((k = fis.read()) != -1) {
			System.out.print((char) k);
		}

		fis.close();
	}
}
