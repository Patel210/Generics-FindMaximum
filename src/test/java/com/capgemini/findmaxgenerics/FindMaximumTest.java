package com.capgemini.findmaxgenerics;

import static org.junit.Assert.*;
import org.junit.Test;

public class FindMaximumTest {

	@Test
	public void maximumIntegerAtPosition1Test() {
		FindMaximum<Integer> findMaximum = new FindMaximum(6, 3, 2);
		Integer max = findMaximum.max();
		assertEquals(6, (int) max);
	}

	@Test
	public void maximumIntegerAtPosition2Test() {
		FindMaximum<Integer> findMaximum = new FindMaximum(6, 8, 2);
		Integer max = findMaximum.max();
		assertEquals(8, (int) max);
	}

	@Test
	public void maximumIntegerAtPosition3Test() {
		FindMaximum<Integer> findMaximum = new FindMaximum<Integer>(6, 3, 11);
		Integer max = findMaximum.max();
		assertEquals(11, (int) max);
	}

	@Test
	public void testMaximumFloatAtPosition1Test() {
		FindMaximum<Float> findMaximum = new FindMaximum<Float>(6.0f, 3.0f, 2.0f);
		Float max = findMaximum.max();
		assertEquals(new Float(6.0f), max);
	}

	@Test
	public void testMaximumFloatAtPosition2Test() {
		FindMaximum<Float> findMaximum = new FindMaximum<Float>(6.0f, 8.0f, 2.0f);
		Float max = findMaximum.max();
		assertEquals(new Float(8.0f), max);
	}

	@Test
	public void testMaximumFloatAtPosition3Test() {
		FindMaximum<Float> findMaximum = new FindMaximum<Float>(6.0f, 3.0f, 11.0f);
		Float max = findMaximum.max();
		assertEquals(new Float(11.0f), max);
	}

	@Test
	public void maximumStringAtPosition1test() {
		FindMaximum<String> findMaximum = new FindMaximum<String>("Peach", "Apple", "Banana");
		String max = findMaximum.max();
		assertEquals("Peach", max);
	}

	@Test
	public void maximumStringAtPosition2test() {
		FindMaximum<String> findMaximum = new FindMaximum<String>("Banana", "Peach", "Apple");
		String max = findMaximum.max();
		assertEquals("Peach", max);
	}

	@Test
	public void maximumStringAtPosition3test() {
		FindMaximum<String> findMaximum = new FindMaximum<String>("Apple", "Banana", "Peach");
		String max = findMaximum.max();
		assertEquals("Peach", max);
	}
}
