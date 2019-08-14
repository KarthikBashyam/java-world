package com.tips.datastructures;

public class ArraySort {

	public static void main(String[] args) {

		int array[] = { 2, 5, 6, 1, 9, 1, 1, 9, 7, 0 };

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < array[i]) {

					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}

		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
