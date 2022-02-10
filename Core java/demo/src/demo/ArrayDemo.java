package demo;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int score[]=new int[10];// array declaration // primitive arrays
		
		int mark[]=new int[] {34,56,78,90,67,8,90};// array declaration with initialization
		// primitive arrays
		
		double phone[]=new double[6];  // primitive arrays
		
		String names[]=new String[10]; // reference type array
		
		// 10 integer input 10*32=320bit
		float cgpa[]=new float[5]; // 5 cgpa input 5*32=160 bits
		char gender[]=new char[6]; // 'f' 'e' 'm' 'a' 'l' 'e' or 'm' 'a' 'l' 'e'
		
		// read and write
		Scanner s=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			score[i]=s.nextInt();
		}
		
		
		//basic for loop
		for(int i=0;i<10;i++) {
			System.out.println(score[i]);
		}
		
		// advanced for loop
		for(int sc:score) { // arrayindex
			System.out.println(sc);
		}
		
	
		
	}
}
