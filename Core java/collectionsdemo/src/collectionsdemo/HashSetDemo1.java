package collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;

class Employee{
	public Integer id;
	public String name;
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+id+","+name+")";
	}
}
public class HashSetDemo1 {
	public static void main(String[] args) {
		Employee s1=new Employee(123,"Rajesh");
		Employee s2=new Employee(124,"Ajay");
		Employee s3=new Employee(125,"Pandya");
		Employee s4=new Employee(126,"Yuvraj");
		HashSet<Employee> list=new HashSet<Employee>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s1);
		list.add(null);
		list.add(null);
		
		Iterator<Employee> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
