package com.tips.reactive;

public class ReactiveTestDrive {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };		

		for (int i = (a.length - 1)/2; i >= 0; i--) {
			int temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		
		for(int i=0;i <=a.length-1;i++) {
			System.out.println(a[i]);
		}

	}

}
