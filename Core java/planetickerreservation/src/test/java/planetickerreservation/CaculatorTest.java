package planetickerreservation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CaculatorTest {
	@Test
	public void testAdd() {
		Caclulator c=new Caclulator();
		assertEquals(30,c.add(10,20));
	}
}
