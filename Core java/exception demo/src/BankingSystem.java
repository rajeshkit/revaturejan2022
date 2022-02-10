import java.util.Scanner;

public class BankingSystem {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the withdrawl amount");
		int amount=s.nextInt();
		if(amount<=5000) {
			try {
				throw new InsuffientFundException("Balance is insufficient");
			}catch(InsuffientFundException e) {
				System.out.println(e.getMessage());
				System.out.println(e.getClass().getCanonicalName());
			}
		}
	}
}
