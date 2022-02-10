package collectionsdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
		
		TreeSet<Integer> hs=new TreeSet<Integer>();
		hs.add(998);
		hs.add(566);
		hs.add(898);
		hs.add(998);
		hs.add(344);
		hs.add(999);
		hs.add(998);
	
		System.out.println(hs);
	}
}
