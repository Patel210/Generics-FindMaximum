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

	/**
	 * Returns maximum of 3 integers
	 */
	public Float max(Float float1, Float float2, Float float3) {

		Float max = float1;
		if (float2.compareTo(max) > 0) {
			max = float2;
		}
		if (float3.compareTo(max) > 0) {
			max = float3;
		}
		return max;
	}
}
