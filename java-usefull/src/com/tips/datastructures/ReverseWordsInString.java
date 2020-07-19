package com.tips.datastructures;

import java.util.Arrays;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String s = "a good   example";

		String[] strs = s.split(" ");
		System.out.println(Arrays.toString(strs));

		StringBuffer sb = new StringBuffer();

		for (int i = strs.length - 1; i >= 0; i--) {
			if (!strs[i].trim().equals("")) {
				sb.append(strs[i].trim() + " ");
			}
		}

		System.out.println(sb.toString().trim());

	}

}