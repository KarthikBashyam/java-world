package com.practice.hackerrank;

/**
 * 
 * 
 * @author Karthik
 *
 */
public class GameOfTwoStacks {

	public static void main(String[] args) {

		int[] a = { 4, 2, 4, 6, 1 };
		int[] b = { 2, 1, 8, 5 };

		int x = 10;

		int count = 0;
		int sum = 0;
		int i = 0;
		int j = 0;

		while (sum < x) {

			int st1 = a[i];
			int st2 = b[j];

			if (st1 < st2 && (sum + a[i]) < x) {
				++count;
				sum += a[i];
				System.out.println("Element:" + a[i]);
				++i;
			} else if ((sum + b[j]) < x) {
				++count;
				sum += b[j];
				System.out.println("Element:" + b[j]);
				++j;
			} else {
				break;
			}
			System.out.println("Sum:" + sum);
			
			System.out.println("================= NOT WORKING =====================");

		}

	}

}
