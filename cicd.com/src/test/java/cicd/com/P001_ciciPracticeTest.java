package cicd.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P001_ciciPracticeTest {

	@Test
	public void testAdd() {
		 P001_cicipractice calc = new P001_cicipractice();
	        assertEquals(5, calc.add(2, 3));
		
	}
	
	 @Test
	    public void testSubtract() {
	        P001_cicipractice calc = new P001_cicipractice();
	        assertEquals(1, calc.subtract(3, 2));
	
	 }
}
