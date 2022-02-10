public class UncheckedExceptionPropgation {
	
	
	public void multiply()  {
		System.out.println("multiply method starts");
		int k=10/0;  // throw new ArithmeticException() unchecked exception
		System.out.println("multiply method ends");
	}
	
	public void add() {
		System.out.println("Add method starts");
		multiply();
		System.out.println("Add method ends");
	}
	public static void main(String[] args)
	{
		UncheckedExceptionPropgation rd=new UncheckedExceptionPropgation();
		rd.add();
		
	}
}
