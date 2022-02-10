package com.revaturebank.account;


class AccountOpening {
	public AccountOpening() {
		
	}
	private static final int BALANCE=1000; // instance variable - method area
	public String name="Rajesh";// instance variable - heap
	protected int phone;// instance variable - heap
	boolean gender;// instance variable - heap
	void showBalance() { // instance method - method area
		System.out.println("Balance is"+BALANCE);
	}
}
