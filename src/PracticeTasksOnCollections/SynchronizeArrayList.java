package PracticeTasksOnCollections;
import java.util.*;
public class SynchronizeArrayList {
	
	    public static void main(String args[]) {    
	        List<String> fruitList = new ArrayList<String>();  
	        fruitList.add("Mango");  
	        fruitList.add("Banana");  
	        fruitList.add("Apple");  
	        fruitList.add("Strawberry");  
	        fruitList.add("Pineapple");  
	        fruitList = Collections.synchronizedList(fruitList);  
                synchronized (fruitList) {  
	            Iterator<String> itr = fruitList.iterator();  
	            while (itr.hasNext()) {  
	                System.out.println(itr.next());  
	            }  
	        }  
	    }  

}
