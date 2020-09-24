// (Have Some Doubt Clarify it Later)De-Serialization: Here we are reproducing the HashMap object and it’s content from a serialized file which we have created by running the above code i.e in SerializeAHashMap Program.
package PracticeTasksOnCollections;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class DeserializationofHashMap {
	
	   public static void main(String [] args)
	   {
	      HashMap<Integer, String> map = null;
	      try
	      {
	         FileInputStream fis = new FileInputStream("hashmap.ser");
	         ObjectInputStream ois = new ObjectInputStream(fis);
	         map = (HashMap) ois.readObject();
	         ois.close();
	         fis.close();
	      }catch(IOException ioe)
	      {
	         ioe.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("Deserialized HashMap..");
	      Set set = map.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key: "+ mentry.getKey() + " & Value: ");
	         System.out.println(mentry.getValue());
	      }
	    }
}
