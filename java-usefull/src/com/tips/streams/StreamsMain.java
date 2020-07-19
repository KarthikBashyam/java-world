package com.tips.streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamsMain {

	public static void main(String[] args) {

		List<String> names = List.of("Karthik", "Bashyam", "Java");
		names.stream().forEach(System.out::println);

		Stream.iterate(Long.MIN_VALUE, n -> n + 1).limit(10).forEach(System.out::println);
		
			  
			   
	}
	
}
