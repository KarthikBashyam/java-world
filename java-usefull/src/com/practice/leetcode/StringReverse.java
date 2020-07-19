package com.practice.leetcode;

public class StringReverse {

	public static void main(String[] args) {

		String str = "Hi Karthik";

		char[] array = str.toCharArray();

		int len = array.length;

		for (int i = 0; i < len / 2; i++) {

			char temp = array[i];

			array[i] = array[len - i - 1];
			array[len - i - 1] = temp;

		}

		System.out.println(String.valueOf(array));

	}

}
