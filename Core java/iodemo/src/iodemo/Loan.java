package iodemo;

import java.io.Serializable;

class Loan implements Serializable{
	public int id;
	public String customerName;
	public int loanAmount;
	public float emi;
	public Loan(int id, String customerName, int loanAmount, float emi) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.loanAmount = loanAmount;
		this.emi = emi;
	}
	
}