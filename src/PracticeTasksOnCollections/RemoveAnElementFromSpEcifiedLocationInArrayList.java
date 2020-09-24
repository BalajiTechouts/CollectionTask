package PracticeTasksOnCollections;
import java.util.*;
public class RemoveAnElementFromSpEcifiedLocationInArrayList {
	public static void main(String args[]) {
	 ArrayList<String> al = new ArrayList<String>();
	       al.add("AA");
	       al.add("BB");
	       al.add("CC");
	       al.add("DD");
	       al.add("AA");
	       al.add("ZZ");
	       System.out.println("ArrayList before remove:");
	       for(String var: al){
	            System.out.println(var);
	       }
	       al.remove(0);
	       al.remove(2);
	       al.remove(3);
	       System.out.println("ArrayList after remove:");
	       for(String var: al){
	             System.out.println(var);
	       }
	    }

}
