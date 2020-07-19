package com.tips.datastructures;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {

		int nums[] = { 1, 1, 2, 2, 3, 3, 4, 5 };

		Set<Integer> set = new HashSet<>();

		int index = 0;

		for (int e : nums) {

			if (!set.contains(e)) {
				nums[index++] = e;
				set.add(e);
			}

		}

	}

}
