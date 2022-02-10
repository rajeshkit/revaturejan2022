package iodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {
	public static void main(String[] args) {
		Loan l1=new Loan(1000,"Rajesh",200000,20000);
		// l1 state id=1000,customerName=rajesh,loanAmount=200000,emi=20000
		
		Loan l2=new Loan(2000,"pal",300000,30000);
		// l2 state id=2000,customerName=pal,loanAmount=300000,emi=30000
		
		File f=new File("f:/loan.txt");
		try {
			ObjectOutputStream ois=new ObjectOutputStream(new FileOutputStream(f));
			ois.writeObject(l1);
			ois.writeObject(l2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
