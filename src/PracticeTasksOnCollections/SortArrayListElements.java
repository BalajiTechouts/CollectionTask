package PracticeTasksOnCollections;
import java.util.*;
public class SortArrayListElements {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add("aaa");
		list.add("ppp");
		list.add("bbb");
		list.add("TTT");
		System.out.println("ArrayList before Sorting:"+list);
		Collections.sort(list);
		System.out.println("ArrayList After Sorting:"+list);
		
		}

}
