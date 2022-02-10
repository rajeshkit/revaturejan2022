package com.revaturebank.customer;

public class Customer {
	static int id; // instance variable // scope
	static int phone;// instance variable //scope
	static float balance;// instance variable //scope
	void applyHouseLoan() {
		System.out.println("apply logic");
		Customer.id=100;
		Customer.phone=233;
		Customer.balance=78887;
	}
	void withdrawl() {
		System.out.println("withdrawl logic");
		Customer.id=200;
		Customer.phone=236;
		Customer.balance=76887;
	}
	void openAccount() {
		System.out.println("open account logic code");
		id=300;
		phone=213;
		balance=73887;
	}
	public static void main(String args[]) {
		Customer c1=new Customer(); 
		Customer c2=new Customer();
		id=300;
		phone=205;
		balance=72287;
		
		
		
	}
}
