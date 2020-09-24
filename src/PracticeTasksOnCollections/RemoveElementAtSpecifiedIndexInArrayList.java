package PracticeTasksOnCollections;
import java.util.*;
public class RemoveElementAtSpecifiedIndexInArrayList {

	    public static void main(String[] args) 
	    {
	        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "john", "peter", "kohli") );
	         
	        System.out.println(namesList);
	        namesList.set(0, "Dhoni");
	        System.out.println(namesList); 
	       
	    }
	}


