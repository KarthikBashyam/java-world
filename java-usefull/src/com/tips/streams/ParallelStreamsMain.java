package com.tips.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.tips.dto.Gender;
import com.tips.dto.Person;

public class ParallelStreamsMain {
	
	public static void main(String[] args) {
		
		
		//Parallel streams is not a good choice for findFirst
		
				List<Person> persons = Arrays.asList(new Person("John",30,Gender.MALE),
													  new Person("Nick",38,Gender.MALE),
													  new Person("Stana",32, Gender.FEMALE),
													  new Person("Austin",40, Gender.MALE),													  
													  new Person("Rebecca",32, Gender.FEMALE),
													  new Person("Nikki",36, Gender.FEMALE),
													  new Person("Mary Elizebeth",31,Gender.FEMALE));
				
				//find first female whose age is greater than 30
				//parallel will touch many elements other than stana
				Optional<Person> personParallel = persons.stream()
					   .parallel()
					   .filter(ParallelStreamsMain::filterPerson)
					   .findFirst();
				System.out.println("Parallel Found : " + personParallel.get().getName());
				
				Optional<Person> personSerial = persons.stream()
						   .filter(ParallelStreamsMain::filterPerson)
						   .findFirst();
				System.out.println("Serial Found : " + personSerial.get().getName());
				
		
	}
	
	private static boolean filterPerson(Person p) {
		System.out.println(p.getName() + " - "+ Thread.currentThread().getName());
		return p.getAge() > 30 && p.getGender() == Gender.FEMALE;
	}
	
	
}
