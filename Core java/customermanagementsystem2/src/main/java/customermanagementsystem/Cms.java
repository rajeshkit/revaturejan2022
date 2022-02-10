package customermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Cms {

	public static void main(String[] args) {
		System.out.println("Customer Management System");
		System.out.println("1. Insert Customer");
		System.out.println("2. Show All Customer");
		System.out.println("3. Delete a Customer");
		System.out.println("4. Update a Customer");
		System.out.println("5. Search Customer By ID");
		System.out.println("Choose Option");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		switch (choice) {
		case 1:
			Cms.insertCustomer();
			break;
		case 2:
			Cms.getAllCustomer();;
			break;
		case 3:
			Cms.deleteCustomer();
			break;
		case 4:
			Cms.updateCustomer();;
			break;
		case 5:
			Cms.getCustomerById();
			break;
		default:
			System.out.println("choose  a choice 1-5 ");


		}

	}

	public static void getCustomerById() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Customer ID to be searched");
		int customerId = s.nextInt();
			Statement stmt;
			try {
				stmt = (DBConfig.createDBConnection()).createStatement();
				ResultSet rs = stmt.executeQuery("select * from cms where id=" + customerId + "");
				if (rs.next()) {
					System.out.println(rs.getInt("id"));
					System.out.println(rs.getString("name"));
					System.out.println(rs.getString("phone"));
					System.out.println(rs.getString("address"));
				} else {
					System.out.println("There is no Customer id existing in the table");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

	public static void updateCustomer() {
		// get an customer id to be updated
		// get newname,newphone,newaddress
		// load the driver
		// connect to db
		// create statement
		// executeUpdate(update query)
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Customer ID to be updated");
		int customerId = s.nextInt();
		s.nextLine();
		System.out.println("Enter the new customer name ");
		String nname = s.nextLine();
		System.out.println("Enter the new customer phone ");
		String nphone = s.nextLine();
		System.out.println("Enter the new customer address ");
		String naddress = s.nextLine();
		try {
			Statement stmt = (DBConfig.createDBConnection()).createStatement();
			int no = stmt.executeUpdate("update cms set name='" + nname + "',phone='" + nphone + "',address='"
					+ naddress + "' where id=" + customerId + "");
			if (no != 0) {
				System.out.println("customer details updated");
			} else {
				System.out.println("customer details not updated");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void deleteCustomer() {
		// delete
		// scanner get the customer id wanted to delete
		// load the driver
		// connect
		// statement
		// executeUpdate(delete query with where clause)
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Customer ID you want to delete");
		int customerId = s.nextInt();
		try {
			
			Statement stmt = (DBConfig.createDBConnection()).createStatement();
			int no = stmt.executeUpdate("delete from cms where id=" + customerId + "");
			if (no != 0) {
				System.out.println("The customer ID:" + customerId + " " + "Deleted:" + no);
			} else {
				System.out.println("The customer ID:" + customerId + " " + "is not existing");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getAllCustomer() {
		// select query -> resultSet from the db--> process the resultset need to get my
		// data
		// load the driver
		// connect to db
		// statement
		// executeQuery
		// process the resultset
		
		try {
			Statement stmt = (DBConfig.createDBConnection()).createStatement();
			ResultSet rs = stmt.executeQuery("select * from cms");
			ArrayList<Customer> list=new ArrayList<Customer>();
			while (rs.next()) {// true
				Customer c=new Customer();
				c.setCustomerId(rs.getInt("id"));
				c.setCustomerName(rs.getString("name"));
				c.setCustomerPhone(rs.getString("phone"));
				c.setCustomerAddress(rs.getString("address"));
				list.add(c);
			}
			for (Customer customer : list) {
				System.out.println(customer);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void insertCustomer() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the customer ID:");
		int cId = s.nextInt();
		s.nextLine();
		System.out.println("Enter the customer name");
		String name = s.nextLine();
		System.out.println("Enter the phone");
		String phone = s.nextLine();
		System.out.println("Enter the address");
		String address = s.nextLine();
		Customer c=new Customer();
		c.setCustomerId(cId);
		c.setCustomerName(name);
		c.setCustomerPhone(phone);
		c.setCustomerAddress(address);

		// ********JDBC Code Starts here***********

		try {
			Statement stmt = (DBConfig.createDBConnection()).createStatement();
			int no = stmt.executeUpdate(
					"insert into cms values('" + c.getCustomerName() + "'," + c.getCustomerId() + ",'" + c.getCustomerPhone() + "','" + c.getCustomerAddress() + "')");
			System.out.println("Insert is done" + no);

		} 
		// ********JDBC Code Ends here***********
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		s.close();
	}

}
