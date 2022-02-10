package com.revaturebank.card;

import java.util.Scanner;
import com.revaturebank.account.AccountOpening;

public class CreditCardSatement {
	public void showSatement() {
		
		// line where i am going to access the Creditcard class member
		Scanner s=new Scanner(System.in);
		s.nextInt();
		CreditCard c=new CreditCard();
		c.myCreditCard();
		System.out.println(c.cardType);
		AccountOpening acc=new AccountOpening();
		acc.showBalance();
		System.out.println(acc.balance);
	}
	public static void main(String[] args) {
		CreditCardSatement cc=new CreditCardSatement();
		cc.showSatement();
	}
}
