package com.practice.leetcode;

public class SmallestValueInArray {
	
	public static void main(String[] args) {
		
		int array[] = {5,6,8,9,7,1,3,6,5};
		
		int small=array[0];
		for(int i=0; i< array.length - 1; i++) {
			
			if(array[i] < small)
				small = array[i];
			
		}
		System.out.println(small);
		
		
	}

}
