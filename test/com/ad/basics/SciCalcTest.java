package com.ad.basics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SciCalcTest {
	
	private SciCalc sciCal;

	@Before
	public void setUp() throws Exception {
		sciCal = new SciCalc();
	}

	@After
	public void tearDown() throws Exception {
		sciCal = null;
	}

	@Test
	public void square_ShouldReturnCorrectSquareOfNumber_WhenInputNumberProvided() { //<method>_Should<expected>_When<condition>
		assertEquals(25, sciCal.square(5));
	}
	
	@Test
	public void square_ShouldReturnIncorrectSquareOfNumber_WhenInputNumberProvided() {
		assertNotEquals(20, sciCal.square(5));
	}

	@Test
	public void cube_ShouldReturnCorrectCubeOfNumber_WhenInputNumberProvided() {
		assertEquals(27, sciCal.cube(3));
	}

	@Test
	public void cube_ShouldReturnIncorrectCubeOfNumber_WhenInputNumberProvided() {
		assertNotEquals(20, sciCal.cube(3));
	}
}
