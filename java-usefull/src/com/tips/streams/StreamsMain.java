package com.tips.streams;

import java.util.List;

public class StreamsMain {

	public static void main(String[] args) {
		
		List<String> names = List.of("Karthik","Bashyam","Java");
		names.stream().forEach(System.out::println);
		
		
	}
}
