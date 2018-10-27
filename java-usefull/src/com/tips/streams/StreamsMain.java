package com.tips.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.tips.dto.Gender;
import com.tips.dto.Person;

public class StreamsMain {

	public static void main(String[] args) {

		List<String> names = List.of("Karthik", "Bashyam", "Java");
		names.stream().forEach(System.out::println);

		Stream.iterate(Long.MIN_VALUE, n -> n + 1).limit(10).forEach(System.out::println);
		
			  
			   
	}
	
}
