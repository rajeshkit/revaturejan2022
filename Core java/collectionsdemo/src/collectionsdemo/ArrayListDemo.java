package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		// list - collection reference variable
		// is going to point one or more objects
		int k = 123; // primitive value
		list.add(k); // internally it converts int type Integer object	 // autoboxing
		list.add(67);
		list.add(789);
		list.add(9);
		list.add(70);
		list.add(78);
		list.add(89);
		//write a logic to find a max from the list
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	
	}
}
