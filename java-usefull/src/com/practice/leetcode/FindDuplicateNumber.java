package com.practice.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {

	public static void main(String[] args) {

		int[] nums = { 1, 6, 3, 2, 2, 4, 5, 6 };

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {

			if (set.contains(nums[i])) {
				System.out.println(nums[i]);
				break;
			}
			set.add(nums[i]);
		}

	}

}