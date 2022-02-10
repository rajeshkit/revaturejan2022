package customermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "root1234";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Customer ID to be searched");
		int customerId = s.nextInt();
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from cms where id=" + customerId + "");
			if (rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("phone"));
				System.out.println(rs.getString("address"));
			} else {
				System.out.println("There is no Customer id existing in the table");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "root1234";
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
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			int no = stmt.executeUpdate("update cms set name='" + nname + "',phone='" + nphone + "',address='"
					+ naddress + "' where id=" + customerId + "");
			if (no != 0) {
				System.out.println("customer details updated");
			} else {
				System.out.println("customer details not updated");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "root1234";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Customer ID you want to delete");
		int customerId = s.nextInt();
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			int no = stmt.executeUpdate("delete from cms where id=" + customerId + "");
			if (no != 0) {
				System.out.println("The customer ID:" + customerId + " " + "Deleted:" + no);
			} else {
				System.out.println("The customer ID:" + customerId + " " + "is not existing");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "root1234";
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from cms");
			while (rs.next()) {// true
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("phone"));
				System.out.println(rs.getString("address"));
				System.out.println("******************************");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void insertCustomer() {
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "root1234";
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

		// ********JDBC Code Starts here***********

		try {
			// step 1 Load the Driver class from postgres jdbc driver lib line30
			Class.forName("org.postgresql.Driver");
			// step 2 create a connection to the database line 32
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			int no = stmt.executeUpdate(
					"insert into cms values('" + name + "'," + cId + ",'" + phone + "','" + address + "')");
			System.out.println("Insert is done" + no);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ********JDBC Code Ends here***********
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		s.close();
	}

}
