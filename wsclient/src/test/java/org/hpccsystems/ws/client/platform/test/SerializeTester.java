package org.hpccsystems.ws.client.platform.test;

import java.io.*;
import org.hpccsystems.ws.client.utils.DelimitedDataOptions;

public class SerializeTester {

	public static void main(String[] args) {

		DelimitedDataOptions ddo = new DelimitedDataOptions("one","two","three","four");
		DelimitedDataOptions ddo_deserialized = null;

		try
		{
			FileOutputStream f = new FileOutputStream("serializetester.ser");
			ObjectOutputStream out = new ObjectOutputStream(f);
			out.writeObject(ddo);
			out.close();
			f.close();
		} catch(IOException i)
		{
			i.printStackTrace();
		}
		
		try
		{
			FileInputStream f = new FileInputStream("serializetester.ser");
			ObjectInputStream in = new ObjectInputStream(f);
			ddo_deserialized = (DelimitedDataOptions) in.readObject();
			in.close();
			f.close();
		} catch(IOException i)
		{
			i.printStackTrace();
		} catch(ClassNotFoundException c)
		{
			System.out.println("Class not found");
			c.printStackTrace();
		}
		
		System.out.println("Deserialized DelimitedDataOptions");
		System.out.println("Escape Sequence: " + ddo_deserialized.getEscapeSequence());
		System.out.println("Field Delimiter: " + ddo_deserialized.getFieldDelimiter());
		System.out.println("Record Terminator: " + ddo_deserialized.getRecordTerminator());
		System.out.println("Quote: " + ddo_deserialized.getQuote());
	}

}
