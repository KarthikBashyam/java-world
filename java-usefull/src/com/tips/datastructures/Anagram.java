package com.tips.datastructures;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {

		String s = "ab";
		String t = "a";

		Map<Character, Integer> map = new HashMap<>();

		for (char c : t.toCharArray()) {
			map.merge(c, 1, (ch, v) -> v + 1);
		}
		
		System.out.println(map);
		
		for (char c : s.toCharArray()) {

			if (map.containsKey(c)) {
				if (map.get(c) == 1) {
					map.remove(c);
				} else {
					map.put(c, map.get(c) - 1);
				}
			}
		}
		System.out.println(map);

		if (map.size() == 0) {
			System.out.println("======== ANAGRAM ==============");
		}

	}

}