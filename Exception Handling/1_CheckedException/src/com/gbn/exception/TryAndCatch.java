package com.gbn.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryAndCatch {
	public void readFile() {
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("D:/myfile.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int k;

		try {
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
