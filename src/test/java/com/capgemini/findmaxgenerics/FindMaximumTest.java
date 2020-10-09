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

	@Test
	public void testMaximumFloatAtPosition1Test() {
		Float max = findMaximum.max(6.0f, 3.0f, 2.0f);
		assertEquals(new Float(6.0f), max);
	}

	@Test
	public void testMaximumFloatAtPosition2Test() {
		Float max = findMaximum.max(6.0f, 8.0f, 2.0f);
		assertEquals(new Float(8.0f), max);
	}

	@Test
	public void testMaximumFloatAtPosition3Test() {
		Float max = findMaximum.max(6.0f, 3.0f, 11.0f);
		assertEquals(new Float(11.0f), max);
	}
}
