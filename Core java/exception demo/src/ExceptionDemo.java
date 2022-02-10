import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) throws IOException {


		int numerator=10;
		int denominator=5;
		float total =0;
		ExceptionDemo ed=null;
		int[] scores=new int[5];
		System.out.println("statement 1");
		System.out.println("statement 2");
		System.out.println("statement 3");
		System.out.println("statement 4");
		System.out.println("statement 5");
		try(FileReader fr=new FileReader(""); Scanner s=new Scanner(System.in)) {
			total = numerator/denominator; //jvm creates an object for ArithmeticException
			scores[2]=90;				  // ArrayIndexOutOfBoundsException				
			System.out.println(ed.hashCode());//NullPointerException
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | 
				NullPointerException | FileNotFoundException e ) {// handler
			System.out.println(e.getMessage());
			System.out.println(e.getClass().getCanonicalName());
			System.out.println(e.getStackTrace().clone());
		}
		System.out.println("The total is: "+total);
		System.out.println("statement 6");
		System.out.println("statement 7");
		System.out.println("statement 8");
	}
}
