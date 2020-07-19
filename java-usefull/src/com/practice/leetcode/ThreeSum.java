package com.practice.leetcode;

import java.util.Arrays;

/**
 * Given a sum find if there are three numbers with that sum. Triplets
 * 
 * @author Karthik
 *
 */
public class ThreeSum {

	public static void main(String[] args) {

		int[] a =  {4, -9, 0, 11, 6, -20, 1, 7};

		Arrays.sort(a);
		for(int e : a) {
			System.out.println(e);
		}
		int target = 24;
		int sum = 0;

		for (int i = 0; i < 3; i++) {

			sum += a[i];
		}
		System.out.println(sum);
		if(sum == target) {
			System.out.println("==== FOUND =======");
		}
		
		for(int i=3; i < a.length; i++) {
			sum = (sum + a[i]) - a [i - 3];
			if(sum  == target) {
				System.out.println("************ FOUND ******");
			} 
		}

	}

}
