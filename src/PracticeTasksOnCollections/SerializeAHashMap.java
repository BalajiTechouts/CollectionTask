//  In the below class we are storing the HashMap content in a hashmap.ser serialized file. Once you run the below code it would produce a hashmap.ser file. This file would be used in the next class for de-serialization.

package PracticeTasksOnCollections;
import java.io.*;
import java.util.HashMap;
public class SerializeAHashMap {
	
	      public static void main(String [] args)
	      {
	           HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	           hmap.put(11, "AB");
	           hmap.put(2, "CD");
	           hmap.put(33, "EF");
	           hmap.put(9, "GH");
	           hmap.put(3, "IJ");
	           try
	           {
	                  FileOutputStream fos = new FileOutputStream("hashmap.ser");
	                  ObjectOutputStream oos = new ObjectOutputStream(fos);
	                  oos.writeObject(hmap);
	                  oos.close();
	                  fos.close();
	                  System.out.printf("Serialized HashMap data is saved in hashmap.ser");
	           }
	           catch(IOException ioe)
	            {
	                  ioe.printStackTrace();
	            }
	      }
	}


