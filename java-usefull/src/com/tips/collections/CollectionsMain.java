package com.tips.collections;

import static java.util.stream.Collectors.toMap;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.tips.dto.Employee;

public class CollectionsMain {

	public static void main(String[] args) {

		List<Employee> names = List.of(new Employee(1L, "John"), 
									   new Employee(2L, "Carl"), 
									   new Employee(1L, "Kathy"));
		
		//throws Exception Duplicate Key
		/*Map<Long, Object> empMap = names.stream()
										.collect(toMap(Employee::getId, v -> v));*/
		
		// To avoid exception pass resolver.
		Map<Long, Employee> empMap = names.stream()
				.collect(toMap(Employee::getId, Function.identity(), (e1,e2) -> e2));
		empMap.forEach((k,v) -> System.out.println(k +" - "+ v));
		
		

	}

}
