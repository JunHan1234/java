package ch03.home.ex06;

import java.util.Scanner;

public class Adjust {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double delFloor = 0;
		
		System.out.print("x: ");
		x = sc.nextDouble();
		
		delFloor = x - x % 1;
		System.out.printf("%.1f", delFloor);
	}
}
/*
과제: % 연산자를 이용해서, 실수값의 소수점 이하를 내림처리하라.
(casting), Math API 를 사용 안 한다.
실수값은 sc.nextDouble() 로 입력한다.
--

x: 3.1492
3.0
*/