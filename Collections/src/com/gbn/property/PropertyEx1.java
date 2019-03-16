package com.gbn.property;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyEx1 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("username", "gbn");
		prop.setProperty("pasword", "test");
		
		
		System.out.println(prop);
		
		try {
			prop.store(new FileWriter("creds.properties"),"Prop Example");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
