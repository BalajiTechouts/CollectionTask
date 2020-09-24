package PracticeTasksOnCollections;
import java.util.*;
public class ReplaceAnElementAtSpecifiedIndexArrayList {
	
	    public static void main(String[] args) 
	    {
	        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "kajal", "Thrisha", "Anushka") );
	         
	        System.out.println(namesList);
	        namesList.set(0, "samantha");
	        System.out.println(namesList);
	    }

}
