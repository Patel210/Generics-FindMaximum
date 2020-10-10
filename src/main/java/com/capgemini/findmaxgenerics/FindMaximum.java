package com.capgemini.findmaxgenerics;

public class FindMaximum<E extends Comparable<E>> {

	E e1, e2, e3;

	/**
	 * Constructor
	 */
	public FindMaximum(E e1, E e2, E e3) {
		super();
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
	}

	/**
	 * @return Maximum of 3 fields
	 */
	public E max() {
		return max(e1, e2, e3);
	}

	/**
	 * @param <E>
	 * @param e1
	 * @param e2
	 * @param e3
	 * @return Maximum of 3 parameters
	 */
	private E max(E e1, E e2, E e3) {
		E max = e1;
		if (e2.compareTo(max) > 0) {
			max = e2;
		}
		if (e3.compareTo(max) > 0) {
			max = e3;
		}
		return max;
	}
}
