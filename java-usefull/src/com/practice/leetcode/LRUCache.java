package com.practice.leetcode;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LRUCache {

	public static void main(String[] args) {

		int capacity = 2;

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>(capacity, 1.0f, true) {
			@Override
			protected boolean removeEldestEntry(Entry<Integer, Integer> eldest) {
				return size() > capacity;
			}

		};

		map.put(1, 1);
		map.put(2, 2);
		System.out.println(map.getOrDefault(1, -1));
		map.put(3, 3);
		System.out.println(map.getOrDefault(2, -1));
		map.put(4, 4);
		System.out.println(map.getOrDefault(1, -1));
		System.out.println(map.getOrDefault(3, -1));
		System.out.println(map.getOrDefault(4, -1));
	}

}
