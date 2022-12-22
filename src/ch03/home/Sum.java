package ch03.home;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		System.out.print("a: ");
		num1 = sc.nextInt();
		System.out.print("b: ");
		num2 = sc.nextInt();
		
		sum = num1 + num2;
		System.out.printf("%d + %d = %d", num1, num2, sum);
		// System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
	}
}
/*
과제: 두 자연수를 입력받아, 그 합계를 출력하라.
--

a: 1
b: 2
1 + 2 = 3
*/