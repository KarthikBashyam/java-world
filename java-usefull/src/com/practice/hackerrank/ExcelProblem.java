package com.practice.hackerrank;

public class ExcelProblem {

	public static void main(String[] args) {

		// Excel Column to Number
		String str = "ZZ";

		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			result = (result * 26) + (str.charAt(i) - 'A') + 1;
		}

		System.out.println(result);

		// Number to Excel Column name.

		int num = 702;

		StringBuilder sb = new StringBuilder();
		
		while (num > 0) {
			int rem = num % 26;
			System.out.println(rem + 26);
			num = num / 26;
			System.out.println("Num:" + num);
		}
		
		System.out.println();

	}

}
