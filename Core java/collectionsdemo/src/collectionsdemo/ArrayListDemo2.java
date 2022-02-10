package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	public Integer id;
	public Integer salary;
	public String name;
	public Student(Integer id,Integer salary, String name) {
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
	@Override
	public int compareTo(Student o) {
		if(this.salary>o.salary) {
			return -1;
		}
		if(this.salary<o.salary) {
			return 1;
		}
		return 0;
	}
}
public class ArrayListDemo2 {
	public static void main(String[] args) {
		Student s1=new Student(128,500,"Rajesh");
		Student s2=new Student(200,1000,"Ajay");
		Student s3=new Student(11,400,"Pandya");
		Student s4=new Student(8,2000,"Yuvraj");
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println(list);
		Collections.sort(list); 
		System.out.println(list);
	}
}
