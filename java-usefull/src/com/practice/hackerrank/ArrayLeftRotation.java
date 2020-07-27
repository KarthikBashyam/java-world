	package com.practice.hackerrank;

public class ArrayLeftRotation {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };

		bestPerformanceMethod(a);
		System.exit(0);

		int n = 4;
		int d = 4;

		for (int i = 0; i < d; i++) {

			int start = a[0];

			for (int j = 0; j < d; j++) {
				if (j < a.length - 1)
					a[j] = a[j + 1];
			}

			a[a.length - 1] = start;
		}
		print(a);
	}

	private static void bestPerformanceMethod(int[] a) {

		int d = 4;

		int sub = Math.abs(a.length - d);

		int subStart = Math.abs(a.length - sub);

		for (int i = subStart; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for (int j = 0; j < subStart; j++) {
			System.out.println(a[j]);
		}

	}

	private static void print(int[] a) {
		for (int e : a) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

}