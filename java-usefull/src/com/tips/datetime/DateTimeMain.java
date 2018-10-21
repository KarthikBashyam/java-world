package com.tips.datetime;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimeMain {

	public static void main(String[] args) {

		// Calculating time difference
		Instant start = Instant.now();
		System.out.println("Time Elapsed :" + Duration.between(start, Instant.now()).toMillis());

		// Temporal Adjusters
		LocalDate date = LocalDate.of(2019, 8, 6).with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println(date.getDayOfMonth());

		TemporalAdjuster NEXT_BIRTH_DAY = t -> {
			return LocalDate.now().plusYears(1).withDayOfMonth(1).withMonth(1);
		};

		LocalDate nextBday = LocalDate.now().with(NEXT_BIRTH_DAY);
		System.out.println(nextBday.getDayOfWeek());
		
		

	}
}
