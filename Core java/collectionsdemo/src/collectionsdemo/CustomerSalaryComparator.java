package collectionsdemo;

import java.util.Comparator;

public class CustomerSalaryComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.salary>o2.salary) {
			return 1;
		}
		if(o1.salary<o2.salary) {
			return -1;
		}
		return 0;
	}

}
