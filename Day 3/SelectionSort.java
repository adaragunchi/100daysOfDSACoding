package com.ds.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] array = { 4, 2, 3, 1, 5, 10, 9 };
		selectionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	private static void selectionSort(int[] array) {

		/**
		 * 1.Take the first element as the Min then compare that with rest of the array
		 * 2.If you found that if left element in the right array is less than element
		 * in the left array then ecxchnage
		 * 
		 */

		int N = array.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}

	}
}
