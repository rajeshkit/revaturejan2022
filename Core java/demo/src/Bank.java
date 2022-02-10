
public class Bank {
	
	public static void main(String[] args) {
		Customer c=new Customer(6000,"Rajesh","rajesh.kit@gmail.com",6879);
		System.out.println(c.getCustomerId());
		System.out.println(c.getCustomerName());
		System.out.println(c.getEmail());
		System.out.println(c.getPhone());
		Customer c1=new Customer();
		c1.setCustomerId(7697);
		c1.setCustomerName("sdgd");
		c1.setEmail("rajejsfk");
		c1.setPhone(7878);
		System.out.println(c1.getCustomerId());
		System.out.println(c1.getCustomerName());
		System.out.println(c1.getEmail());
		System.out.println(c1.getPhone());
	}
}
