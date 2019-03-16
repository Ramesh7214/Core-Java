package com.gbn.object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UsingDeSerialization {

	public static void main(String[] args) {
		UsingDeSerialization obj = new UsingDeSerialization();
		ReadyToSerialization readyToSerialization = new ReadyToSerialization();
		
		obj.serialize(readyToSerialization);
		ReadyToSerialization getObject = obj.deSerialize();
		getObject.display();
		
		
	}

	public void serialize(ReadyToSerialization obj) {
		try {
			ReadyToSerialization si = new ReadyToSerialization();
			FileOutputStream fos = new FileOutputStream("ReadyToSerialization.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(si);
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ReadyToSerialization deSerialize() {
		ReadyToSerialization si = null;
		try {
			FileInputStream fis = new FileInputStream("ReadyToSerialization.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			si = (ReadyToSerialization) ois.readObject();
			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return si;
	}
}

class ReadyToSerialization implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void display() {
		System.out.println("Hello some one deserialized me!");
	}
}