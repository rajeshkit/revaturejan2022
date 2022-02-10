import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest { // to perform a junit
	@BeforeAll
	public static void start() {
		System.out.println("*****Before All test case*****");
	}
	@AfterAll
	public static void last() {
		System.out.println("****After All test case****");
	}
	@BeforeEach
	public void welcome() {
		System.out.println("Before Every Test case");
	}
	@AfterEach
	public void end() {
		System.out.println("After Every Test case");
	}
	
	
	@Test
	public void testAddPositive() { // Test case method
		Calculator c=new Calculator();
		int total = c.add(10, 30);
		assertEquals(40, total); 
	}
	@Test
	public void testAddNegative() { // Test case method
		Calculator c=new Calculator();
		int total = c.add(-10,-30);
		assertEquals(-40, total); 
	}
	@Test
	public void testGreater() {
		Calculator c=new Calculator();
		boolean result=c.greater(30, 10);
		assertTrue(result);
	}
	
	
	
	
	
	
	
}
