package PracticeTasksOnCollections;
import java.util.*;
public class AddelementAtSpecifiedIndexInArraylist {
	
	    public static void main(String[] args) 
	    {
	        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "ravi", "shankar", "balaji") );
	         
	        System.out.println(namesList); 
	         namesList.add(0, "Ramana");
	        System.out.println(namesList);
	    }
	}


