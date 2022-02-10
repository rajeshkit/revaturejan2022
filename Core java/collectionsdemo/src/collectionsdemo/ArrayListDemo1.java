package collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		//Array -  static in size
		Vector<Long> list=new Vector<Long>();// dynamic in size
		//ArrayList<Long> list1=new ArrayList<Long>();
		
		list.add(5656L);
		list.add(6768L);
		list.add(8989L);
		list.add(1, 7777L);
		list.add(2434L);
		list.add(null);
		list.add(8989L);
		list.add(6768L);
		list.add(6768L);
		list.add(null);
		list.add(0,2222L);
		System.out.println(list.toString());
	
		
	}
}
