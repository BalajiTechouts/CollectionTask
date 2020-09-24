package PracticeTasksOnCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
public class SynchronizeAHashMap {
public static void main(String args[]) {
	         HashMap<Integer, String> hmap= new HashMap<Integer, String>();
	         hmap.put(2, "AbdulKalam");
	         hmap.put(33, "AlluriSeetharamaRaju");
	         hmap.put(1, "Dhoni");
	         hmap.put(4, "Sachin");
	         hmap.put(66, "Kohli");
          Map map= Collections.synchronizedMap(hmap);
	         Set set = map.entrySet();
	         synchronized(map){
	             Iterator i = set.iterator();
	             // Display elements
	             while(i.hasNext()) {
	                Map.Entry me = (Map.Entry)i.next();
	                System.out.print(me.getKey() + ": ");
	                System.out.println(me.getValue());
	             }
	         }
	    }


}