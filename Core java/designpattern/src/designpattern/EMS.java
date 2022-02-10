package designpattern;

public class EMS {
	public static void main(String[] args) {

		Employee emp1 = Employee.getInstance();
		Employee emp2 = Employee.getInstance();
		Employee emp3 = Employee.getInstance();
		System.out.println(emp1.hashCode());
		
		System.out.println(emp2.hashCode());
		System.out.println(emp1==emp2);
		System.out.println(emp3.hashCode());
		System.out.println(emp1==emp3);
	}
}
