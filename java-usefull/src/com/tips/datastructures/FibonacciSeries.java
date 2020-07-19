package com.tips.datastructures;

import java.util.HashMap;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		Scanner scanner = new Scanner(System.in);
		// int count = scanner.nextInt();
		int count = 10;
		// 0,1,1,2,3,5

		for (int i = 2; i <= count; i++) {

			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;

		}
		System.out.println("======= Recursive ==========");
		for (int i = 0; i <= 10; i++) {
			System.out.println(fib(i));
		}

	}

	// Memoization
	private static HashMap<Integer, Integer> cache = new HashMap<>();

	public static int fib(int n) {
		int returnVal;
		if (n <= 1) {
			return n;
		} else if (cache.containsKey(Integer.valueOf(n))) {
			return cache.get(Integer.valueOf(n));
		} else {
			returnVal = fib(n - 1) + fib(n - 2);
			cache.putIfAbsent(n, returnVal);
			return returnVal;
		}

	}

}
