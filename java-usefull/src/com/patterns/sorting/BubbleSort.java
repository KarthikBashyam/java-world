package com.patterns.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int array[] = { 7, 9, 8, 6, 4, 2, 1 };

		for (int i = array.length - 1; i >= 0; i--) {

			for (int j = 1; j <= i; j++) {

				if (array[j - 1] > array[j]) {

					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}

			}

		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
