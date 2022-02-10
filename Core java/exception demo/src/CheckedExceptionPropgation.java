import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionPropgation {
	
	
	public void multiply() throws FileNotFoundException{
		System.out.println("multiply method starts");
		FileReader fr=new FileReader("");  // Checked FileNotFoundException
		System.out.println("multiply method ends");
	}
	
	public void add() throws FileNotFoundException {
		System.out.println("Add method starts");
		multiply();
		System.out.println("Add method ends");
	}
	public static void main(String[] args) throws FileNotFoundException
	{
		CheckedExceptionPropgation rd=new CheckedExceptionPropgation();
		rd.add();
		
	}
}
