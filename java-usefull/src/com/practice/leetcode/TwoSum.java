package com.practice.leetcode;

import java.util.HashSet;

/**
 * Find two numbers with given sum.
 * 
 * @author Karthik
 *
 */
public class TwoSum {

	public static void main(String[] args) {

		int target = 10;

		int[] a = { 1, 2, 3, 7 };

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < a.length; i++) {

			if (set.contains(target - a[i])) {
				System.out.println("======== FOUND ============");
				break;
			} else {
				set.add(a[i]);
			}

		}

	}

}
