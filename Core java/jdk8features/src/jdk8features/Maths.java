package jdk8features;

import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface Area{
	public float circle(float PI,int radius);
}

public class Maths {
	
	public static void main(String[] args) {
			Area a = (PI,radius)-> PI * radius * radius;
		    a.circle(3.14f, 10);
		    
		    Comparable<Integer> com = (o) -> {
		    	return 20-o;
			};
			System.out.println(com.compareTo(10));
			
			Consumer<Integer> con= (t) -> System.out.println(t);
			con.accept(345);
			
			Predicate<Integer> p = (t) -> 20>t;
			System.out.println(p.test(10));
			
	
	}
}
