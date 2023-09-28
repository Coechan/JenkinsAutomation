package JunitCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Classes.Calculator;

class TestCalculator {
	
	Calculator calculator = new Calculator();

	@Test
	void testAdd() {
		double expected = 4;
		double actual= calculator.add(2,2);
		assertEquals(expected,actual);
	}

	@Test
	void testSubstract() {
		double expected = 1;
		double actual= calculator.subtract(3,2);
		assertEquals(expected,actual);
	}
	
	@Test
	void testDiv() {
		double expected = 1;
		double actual= calculator.div(8,8);
		assertEquals(expected,actual);
	}
	
	@Test
	void testDivByZero() {
		Double expected = Double.POSITIVE_INFINITY;
		Double actual= calculator.div(8,0);
		assertEquals(expected,actual);
	}
	@Test
	void testMult() {
		double expected = 1;
		double actual= calculator.mult(1,1);
		assertEquals(expected,actual);
	}
      
}
