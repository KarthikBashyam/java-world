package com.practice.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFreqElements {

	public static void main(String[] args) {
		
		test();

		/*
		 * int[] nums = { 5, 2, 5, 3, 5, 3, 1, 1, 3 };
		 * 
		 * Map<Integer, Integer> map = new HashMap<>();
		 * 
		 * for (int n : nums) { map.merge(n, 1, (k, v) -> k + 1); }
		 * System.out.println(map); List<Integer> collect = map.entrySet().stream()
		 * .sorted(Map.Entry.<Integer,
		 * Integer>comparingByValue().reversed()).limit(2).map(e -> e.getKey())
		 * .collect(Collectors.toList()); System.out.println(collect); int[] res = new
		 * int[collect.size()];
		 * 
		 * for (int i = 0; i < collect.size(); i++) { res[i] = collect.get(i); }
		 */
		
	}

	private static void test() {
		
		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};				 
		String[] list2 = {"KFC","Burger King","Tapioca Express","Shogun"};
		
		 Map<String, Integer> list = new HashMap<>();
	        
	        for(int i = 0; i < list1.length; i++) {
	            list.put(list1[i],i);
	        }
	        
	        Map<String, Integer> result = new HashMap<>();
	        
	        for(int j = 0; j < list2.length; j++) {
	            
	            if(list.containsKey(list2[j])) {                
	                result.put(list2[j], list.get(list2[j]) + j);                
	            }            
	        }
	    	System.out.println(result);
	        List<String> collect = result.entrySet().stream()
					.sorted(Map.Entry.<String, Integer>comparingByValue()).limit(1).map(e -> e.getKey())
					.collect(Collectors.toList());
			
			String[] res = new String[collect.size()];
			
			for (int i = 0; i < collect.size(); i++) {
				res[i] = collect.get(i);
			}
			
			System.out.println(Arrays.toString(res));
		
	}
}
