package ch02.ex02;

import java.time.LocalDate;
import java.time.LocalTime;

public class C07Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2025, 1, 1);
		LocalTime time = LocalTime.of(18, 7, 13);
		
		System.out.println(date.toString()); // date 변수가 String값으로 return 받는다.
		System.out.println(time);
	}
}
