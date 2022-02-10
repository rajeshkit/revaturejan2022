import java.util.Scanner;

public class VotingSystem {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=s.nextInt();
		if(age<=0) {
			throw new NegativeAgeException("Age should not be in negative");
		}
	}
}
