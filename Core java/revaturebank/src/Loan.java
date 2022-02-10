
public class Loan {

	public void accountDetails(int id, String n, String p, String a) {
		System.out.println(id+" "+n+" "+p+" "+a);
	}

	public void accountDetails(Customer customer) {
		System.out.println(customer.getId());
		System.out.println(customer.getName());
		System.out.println(customer.getPhone());
		System.out.println(customer.getAddress());
	}
}
