

public class Demo1 {					// declaring an exception
	public static void main(String[] args) throws ArithmeticException {
		System.out.println("inside main method");
		System.out.println("Inside try block");
		//int k=10/0; //throw new ArithmeticException(); // implicitly created Exception
		String s;
		
			throw new ArithmeticException(); // explicit created Exception
		
	}

}
