package designpattern;

public class Employee {
	private static Employee e1=null;
	private Employee() {
		System.out.println("employee public constrcutor");
	}
	public static Employee getInstance() {
		if(e1==null) {
			e1=new Employee();
		}
		return e1;
	}
}
