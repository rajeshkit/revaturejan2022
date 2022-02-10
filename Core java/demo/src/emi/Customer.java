package emi;


public class Customer {
	public int calculate(int a,int b,int... val) {
		int sum=0;
		for (int i : val) {
			sum=sum + i;
		}
		int total = a + b + sum;
		return total;
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		System.out.println(c.calculate(33, 56,89,90));
		
		
//		int scores[]={56,34,89,890,3,234};//89
//		int scores1[]={56,34,89,80,3,234};
//		boolean result=Arrays.equals(scores, scores1);
//		System.out.println(result);
//		//Arrays.sort(scores);
//		int[] answer = Arrays.copyOfRange(scores, 3, 5);
//		for (int i : answer) {
//			System.out.println(i);
//		}
		
		
	}
}
