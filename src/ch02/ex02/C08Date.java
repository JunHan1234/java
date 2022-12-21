package ch02.ex02;

import java.time.LocalDate;

public class C08Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		date = date.plusDays(1); //method 숫자만큼 date 변수에 추가한다.
		date = date.minusDays(1); //method 숫자만큼 date 변수에 추가한다.
		
		System.out.println(date);
	}
}
