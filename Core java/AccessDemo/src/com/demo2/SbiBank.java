package com.demo2;

import com.demo1.Cibil;

public class SbiBank extends Cibil {
	public void show() {
		System.out.println(name);
		int myScore = getScore();
		System.out.println(myScore);
	}
	public static void main(String[] args) {
		SbiBank sbi=new SbiBank();
		sbi.show();
		
	}
}
