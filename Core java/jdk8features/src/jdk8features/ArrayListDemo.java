package jdk8features;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(67);
		list.add(789);
		list.add(9);
		list.add(70);
		list.add(78);
		list.add(89);
//		//123,67,789,9,70,78,89   70,78   70,78
//		list.stream().filter(t-> t%2==0).forEach(t->System.out.println(t));
//		System.out.println("***********************");
//		//123,67,789,9,70,78,89
//		list.stream().map((t)->t*10).forEach(t->System.out.println(t));
//		// transform //1230	670 7890 90	700 780	890
//		Comparator<Integer> c=(o1,o2)->o1-o2;
//		Integer max = list.stream().min(c).get();
//		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
//		System.out.println(max);
		System.out.println();
		list.stream().filter(e->e%2!=0).map(e->e*2).sorted().forEach(e->System.out.println(e));
	}
}
