package com.revaturebank.common;

public class Loan {
	int amount;
	int loanNumber;
	static int phone;
	public static void test() {
		System.out.println("test method");
	}
	public void show() {
		Loan.test();
		System.out.println(amount);
		System.out.println(loanNumber);
	}
	public void display() {
		show();
		System.out.println(amount);
		System.out.println(loanNumber);
	}
	public static void main(String args[]) {
		Loan l=new Loan();
		System.out.println(l.amount);
		System.out.println(l.loanNumber);
		System.out.println(Loan.phone);
		Loan.test();
		Math.abs(3535.343);
		l.show();
		l.display();
	}
}
