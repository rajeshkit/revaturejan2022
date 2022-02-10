package collectionsdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(9894851, "Rajesh");
		hm.put(7788676, "vijay");
		hm.put(878664, "Roshini");
		hm.put(89895, "vishali");
		hm.put(7788676, "abc");
		hm.put(null, "xyz");
		System.out.println(hm);
//		System.out.println("**************");
//		Iterator<Integer> itr=hm.keySet().iterator();
//		while(itr.hasNext()) {
//			Integer key = itr.next();
//			System.out.println(key);
//			System.out.println(hm.get(key));
//		}
//		System.out.println("**************");
//		Iterator<String> itr1=hm.values().iterator();
//		while(itr1.hasNext()) {
//			System.out.println(itr1.next());
//		}
//		for (String val : hm.values()) {
//			System.out.println(val);
//		}
		System.out.println("**************");
		Iterator<Entry<Integer,String>> itr2=hm.entrySet().iterator();
		while(itr2.hasNext()) {
			Entry<Integer,String> e = itr2.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		for (Entry<Integer,String> en : hm.entrySet()) {
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
	}
}
