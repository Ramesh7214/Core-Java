package com.gbn.property;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * read from property file
 * first run EX1 to create property file.
 */
public class PropertyEx3 {
	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("creds.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("username"));  
	    System.out.println(p.getProperty("pasword"));  
	}

}
