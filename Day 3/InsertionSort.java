package com.ds.sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] array = { 4, 2, 3, 1, 5, 10, 9 };
		insertionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static void insertionSort(int[] array) {
		/**
		 * 1.Take the first element from the array and place it in proper asceding
		 * position
		 */
		int N = array.length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}

	}
}
