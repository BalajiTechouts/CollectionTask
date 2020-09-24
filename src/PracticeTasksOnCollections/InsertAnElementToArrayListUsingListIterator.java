package PracticeTasksOnCollections;
import java.util.ArrayList;
import java.util.ListIterator;
public class InsertAnElementToArrayListUsingListIterator {
	
	   public static void main(String[] args) {
	      ArrayList<Integer>arrList = new ArrayList<Integer>();
	      arrList.add(50);
	      arrList.add(60);
	      arrList.add(70);
	      arrList.add(80);
	      arrList.add(90);
	      arrList.add(100);
	      arrList.add(110);
	      arrList.add(120);
	      ListIterator<Integer>iterator = arrList.listIterator();
	      iterator.add(5000);
	      iterator.add(6000);
	      iterator.add(7000);
	      for (Integer i: arrList) {
	         System.out.println(i);
	      }
	   }
}
