package com.capgemini.findmaxgenerics;

public class FindMaximum {

	/**
	 * @param <E>
	 * @param a
	 * @param b
	 * @param c
	 * @return Maximum of 3 parameters
	 */
	public <E extends Comparable<E>> E max(E a, E b, E c) {

		E max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;
	}
}
