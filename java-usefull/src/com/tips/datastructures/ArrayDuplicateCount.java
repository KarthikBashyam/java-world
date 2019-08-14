package com.tips.datastructures;

import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicateCount {
	
	
	public static void main(String[] args) {
		
		int array[] = {5,8,6,3,4,8,1,1};
		
		Map<Integer, Integer> count = new HashMap<>();
		
		for (int i = 0; i <= array.length - 1; i++) {

			for (int j = i + 1; j <= array.length - 1; j++) {
				
				if(array[i] == array[j]) {					
					count.merge(array[i], 2, Integer::sum);					
				} 

			}
		}
		System.out.println(count);
		
	}

}
