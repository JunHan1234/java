package ch02.home.ex02;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int readYear = 0;
		int readMonth = 0;
		int readDay = 0;
		
		System.out.println("공연 일자를 입력하세요.");
		System.out.print("년: ");
		readYear = sc.nextInt();
		System.out.print("월: ");
		readMonth = sc.nextInt();
		System.out.print("일: ");
		readDay = sc.nextInt();
		
		LocalDate showDate = LocalDate.of(readYear, readMonth, readDay);

		System.out.println();
		System.out.println(showDate + " 공연을 예매했습니다.");
		System.out.println(showDate.minusDays(3) + " 까지 환불이 가능합니다.");
	}
}

/*
과제: 예매하라. 환불은 공연일로부터 3일전까지 가능하다.
--

공연 일자를 입력하세요.
년: 2025
월: 7
일: 17

2025-07-17 공연을 예매했습니다.
2025-07-14 까지 환불이 가능합니다.
*/