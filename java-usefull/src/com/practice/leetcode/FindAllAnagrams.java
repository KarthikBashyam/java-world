package com.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {

	public static void main(String[] args) {

		String s = "abab";
		String p = "ab";

		System.out.println(findAnagrams(s, p));

	}

	public static List<Integer> findAnagrams(String s, String p) {

		List<Integer> indice = new ArrayList<>();

		char[] key = p.toCharArray();
		Arrays.sort(key);

		for (int i = 0; i < s.length(); i++) {

			if (i + p.length() <= s.length()) {
				char[] arr = s.substring(i, i + p.length()).toCharArray();
				Arrays.sort(arr);
				String sub = new String(arr);

				if (new String(key).equals(sub)) {
					indice.add(i);
				}

			}

		}

		return indice;

	}

}
