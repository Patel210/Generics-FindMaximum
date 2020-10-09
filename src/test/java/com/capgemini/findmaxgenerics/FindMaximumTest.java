package com.capgemini.findmaxgenerics;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FindMaximumTest {

	private FindMaximum findMaximum;

	@Before
	public void setup() {
		findMaximum = new FindMaximum();
	}

	@Test
	public void maximumIntegerAtPosition1Test() {
		Integer max = findMaximum.max(6, 3, 2);
		assertEquals(6, (int) max);
	}

	@Test
	public void maximumIntegerAtPosition2Test() {
		Integer max = findMaximum.max(6, 8, 2);
		assertEquals(8, (int) max);
	}

	@Test
	public void maximumIntegerAtPosition3Test() {
		Integer max = findMaximum.max(6, 3, 11);
		assertEquals(11, (int) max);
	}
}
