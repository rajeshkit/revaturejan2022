package collectionsdemo;

import java.util.TreeMap;

class Trainee{
	public Integer id;
	public String name;
	public Trainee(Integer id, String name) {
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
public class HashMapDemo1 {
	public static void main(String[] args) {
		Trainee s1=new Trainee(123,"Rajesh");
		Trainee s2=new Trainee(124,"Ajay");
		Trainee s3=new Trainee(125,"Pandya");
		Trainee s4=new Trainee(126,"Yuvraj");
		TreeMap<Integer,Trainee> hm=new TreeMap<Integer,Trainee>();
		hm.put(11, s1);
		hm.put(26, s2);
		hm.put(72, s3);
		hm.put(20, s4);
		hm.put(72, s2);
		System.out.println(hm);
	}
}
