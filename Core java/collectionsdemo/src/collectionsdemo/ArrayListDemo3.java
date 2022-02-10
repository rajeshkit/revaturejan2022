package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

class Customer {
	public Integer id;
	public Integer salary;
	public String name;
	public Customer(Integer id,Integer salary, String name) {
		super();
		this.id = id;
		this.name = name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+id+","+name+","+salary+")";
	}
}
public class ArrayListDemo3 {
	public static void main(String[] args) {
		Customer s1=new Customer(128,500,"Rajesh");
		Customer s2=new Customer(200,1000,"Ajay");
		Customer s3=new Customer(11,400,"Pandya");
		Customer s4=new Customer(8,2000,"Yuvraj");
		ArrayList<Customer> list=new ArrayList<Customer>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println(list);
		Collections.sort(list,new CustomerNameComparetor()); // Comparator
		System.out.println(list);
		Collections.sort(list,new CustomerIdComparator()); // Comparator
		System.out.println(list);
		Collections.sort(list,new CustomerSalaryComparator()); // Comparator
		System.out.println(list);
	}
}
