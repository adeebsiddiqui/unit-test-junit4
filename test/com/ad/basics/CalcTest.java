package com.ad.basics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {
	
	private Calc calculator;

	@Before
	public void setUp() throws Exception {
		calculator = new Calc();
	}

	@After
	public void tearDown() throws Exception {
		calculator = null;
	}

	@Test
	public void add_ShouldReturnCorrectSummationResult_WhenInputIsTwoNumbers() { //<method>_Should<expected>_When<condition>
		assertEquals(8, calculator.add(5, 3));
	}

	@Test
	public void subtract_ShouldReturnCorrectSubtractionResult_WhenInputIsTwoNumbers() {
		assertEquals(3, calculator.subtract(8, 5));
	}

	@Test
	public void multiply_ShouldReturnCorrectMultiplicationResult_WhenInputIsTwoNumbers() {
		assertEquals(15, calculator.multiply(5, 3));
	}

	@Test
	public void division_ShouldReturnCorrectDivisionResult_WhenInputIsTwoNumbers() {
		assertEquals(5, calculator.divide(15, 3));
	}
}
