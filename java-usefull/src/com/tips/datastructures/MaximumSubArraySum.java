package com.tips.datastructures;

public class MaximumSubArraySum {

	public static void main(String[] args) {

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int sum = 0;
		int max = 0;

		for (int i = 0; i < nums.length; i++) {

			sum += nums[i];

			if (sum < 0 && sum < max) {
				sum = 0;
			}

			max = Math.max(sum, max);

		}
		System.out.println(max);
	}

}
