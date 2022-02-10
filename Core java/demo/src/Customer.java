//encapsulation - data and code together
// you can control how data can be accessed by other programs
public class Customer {
	private int customerId;
	private String customerName;
	private String email;
	private int phone;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, String email, int phone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
	}
	//setter - write the value to the instance
	// getter - read the value from instance
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
}
