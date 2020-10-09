package com.capgemini.findmaxgenerics;

public class FindMaximum {

	/**
	 * Returns maximum of 3 integers
	 */
	public Integer max(Integer integer1, Integer integer2, Integer integer3) {

		Integer max = integer1;
		if (integer2.compareTo(max) > 0) {
			max = integer2;
		}
		if (integer3.compareTo(max) > 0) {
			max = integer3;
		}
		return max;
	}
}
