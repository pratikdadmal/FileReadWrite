package ReadTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDemo implements Serializable{
	
	int id;
	String str;
	
	SerializableDemo(int id,String str)
	{
		this.id=id;
		this.str=str;
	}
	
public static class Nested
{
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	SerializableDemo demo = new SerializableDemo(101,"Pratik");
	
	File file = new File("abc.txt");
	FileOutputStream fos = new FileOutputStream(file);
	ObjectOutputStream oos = new ObjectOutputStream(fos);
//	FileInputStream fis = new FileInputStream(file);
//	ObjectInputStream ois = new ObjectInputStream(fis);
//	SerializableDemo demo1  = (SerializableDemo) ois.readObject();
//	System.out.println(demo1.id+" "+demo1.str);
	
	oos.writeObject(demo);
	System.out.println(oos);
	oos.flush();
	oos.close();
	System.out.println("File Successfully Created");

 }
  }
}
