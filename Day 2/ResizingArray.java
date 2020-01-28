package com.ds;

public class ResizingArray {
	// Initial size of Array
	int N = 0;

	// Create the Atray with initial size
	int[] stack = new int[1];

	/**
	 * In order to resize the Array: 1. insert : When Array is full then double the
	 * size of the array and copy all the items 2. remove : When the Array is
	 * qudrilatral size then halve the size of the array.
	 */

	public void inser(int item) {
		if (N == stack.length) {
			resize(2 * stack.length);
		}
		stack[N++] = item;
	}

	private void resize(int newSize) {
		int[] copy = new int[newSize];
		for (int i = 0; i < stack.length; i++) {
			copy[i] = stack[i];
		}
		stack = copy;
	}

	public int remove() {
		int item = stack[--N];
		stack[N] = 0;
		if (N > 0 && N == stack.length / 4) {
			resize(stack.length / 2);
		}
		return item;
	}

	public int size() {
		return stack.length;
	}

	public static void main(String[] args) {
		ResizingArray resizingArray = new ResizingArray();
		resizingArray.inser(10);
		resizingArray.inser(20);
	}
}
