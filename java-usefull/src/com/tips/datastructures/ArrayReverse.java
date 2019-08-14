package com.tips.datastructures;

public class ArrayReverse {
	
	
	public static void main(String[] args) {
		
		int array[] = {9,6,7,8,9,1,5,8,6,3};
		
		int temp = 0;
		
		for (int i = 0; i <= (array.length - 1)/2; i++) {
			
			temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
		
		for(int i=0; i<=array.length-1; i++) {
			System.out.println(array[i]);
		}
		
	}
	

}
