package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeSerializationDemo {
	public static void main(String[] args) {
		File f=new File("f:/loan.txt");
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
			Object o=ois.readObject();
			Loan l1=(Loan)o;
			System.out.println(l1.id+l1.emi+l1.customerName+l1.loanAmount);
			Object o1=ois.readObject();
			Loan l2=(Loan)o1;
			System.out.println(l2.id+l2.emi+l2.customerName+l2.loanAmount);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
