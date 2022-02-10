import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter customer ID:");
		int cId=s.nextInt();
		s.nextLine();
		System.out.println("Enter customer Name:");
		String cName=s.nextLine();
		System.out.println("Enter customer Phone:");
		String cPhone=s.nextLine();
		System.out.println("Enter customer Address:");
		String cAddress=s.nextLine();
		Loan l1=new Loan();
		l1.accountDetails(cId, cName, cPhone, cAddress);//pass by value
		Customer c=new Customer();
		c.setId(cId);
		c.setName(cName);
		c.setPhone(cPhone);
		c.setAddress(cAddress);
		l1.accountDetails(c);// pass by reference
		
//		System.out.println(c.getId()+" "+c.getName()+" "+c.getPhone()+" "+c.getAddress());
		
	}
}
