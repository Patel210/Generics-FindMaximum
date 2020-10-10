package com.capgemini.findmaxgenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaximum<E extends Comparable<E>> {

	ArrayList<E> list;

	/**
	 * Constructions with variable arguments
	 */
	public FindMaximum(E... items) {
		list = new ArrayList<E>();
		for (E item : items) {
			this.list.add(item);
		}
	}

	/**
	 * @return maximum of elements in the list
	 */
	public E max() {
		return max(list);
	}

	/**
	 * @param <E>
	 * @param list
	 * @return maximum of elements in the list
	 */
	public static <E extends Comparable<E>> E max(ArrayList<E> list) {
		try {
			list = Optional.ofNullable(list).stream().flatMap(a -> a.stream()).filter(x -> !Objects.isNull(x))
					.collect(Collectors.toCollection(ArrayList::new));
			E max =  Collections.max(list);
			printMax(list, max);
			return max;
		} catch (NoSuchElementException e) {
			return null;
		}
	}
	
	/**
	 * Prints the max of list
	 */
	public static <E> void printMax(ArrayList<E> list, E max) {
		System.out.println("Maximum of "+ list + ": "+ max);
	}
}
