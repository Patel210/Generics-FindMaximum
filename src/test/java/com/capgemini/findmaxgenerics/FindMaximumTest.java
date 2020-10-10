package com.capgemini.findmaxgenerics;

import static org.junit.Assert.*;
import org.junit.Test;

public class FindMaximumTest {

	@Test
	public void given6Integers_ShouldReturnTheMaxTest() {
		FindMaximum<Integer> findMaximum = new FindMaximum(-8, 5, 3, 13, 0, 7); // 6 parameters
		Integer max = findMaximum.max();
		assertEquals(13, (int) max);
	}

	@Test
	public void given2IntegersAnd1NullInput_ShouldReturnTheMaxTest() {
		FindMaximum<Integer> findMaximum = new FindMaximum(-8, null, 37); // 3 parameters
		Integer max = findMaximum.max();
		assertEquals(37, (int) max);
	}

	@Test
	public void given3NullIntegers_ShouldReturnNullTest() {
		FindMaximum<Integer> findMaximum = new FindMaximum<Integer>(null, null, null); // 3 parameters
		Integer max = findMaximum.max();
		assertEquals(null, max);
	}

	@Test
	public void given6Floats_ShouldReturnTheMaxTest() {
		FindMaximum<Float> findMaximum = new FindMaximum<Float>(-8.0f, 5.0f, 3.0f, 13.0f, 0f, 7.0f); // 6 parameters
		Float max = findMaximum.max();
		assertEquals(new Float(13.0f), max);
	}

	@Test
	public void given3Floats_ShouldReturnTheMaxTest() {
		FindMaximum<Float> findMaximum = new FindMaximum<Float>(-8.0f, 5.0f, 37.0f); // 3 parameters
		Float max = findMaximum.max();
		assertEquals(new Float(37.0f), max);
	}

	@Test
	public void given3NullFloat_ShouldReturnNullTest() {
		FindMaximum<Float> findMaximum = new FindMaximum<Float>(null, null, null); // 3 parameters
		Float max = findMaximum.max();
		assertEquals(null, max);
	}

	@Test
	public void given3Strings_ShouldReturnTheMax_Lexicographically_Test() {
		FindMaximum<String> findMaximum = new FindMaximum<String>("Peach", "Apple", "Banana"); // 3 parameters
		String max = findMaximum.max();
		assertEquals("Peach", max);
	}

	@Test
	public void given3StringsAnd1NullInput_ShouldReturnTheMax_Lexicographically_Test() {
		FindMaximum<String> findMaximum = new FindMaximum<String>("Apple", "Mango", null, "Peach", "Strawberry"); // 5 parameters
		String max = findMaximum.max();
		assertEquals("Strawberry", max);
	}

	@Test
	public void given3NullStrings_ShouldReturnNullTest() {
		FindMaximum<String> findMaximum = new FindMaximum<String>(null, null, null); // 3 parameters
		String max = findMaximum.max();
		assertEquals(null, max);
	}
}
