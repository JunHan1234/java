package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String score = "";
		String grade = "";
		String plus = "+";
		String minus = "-";
		
		System.out.print("점수: ");
		score = sc.nextLine();
		
		
		if(score.equals("9") grade = "A";
		System.out.printf("%s", grade + plus);
		
	}
}
/*
다음 구간별로 학점을 부여하라.
98 이상 A+
94 이상 A
90 이상 A-
88 이상 B+
84 이상 B
80 이상 B-
80 미만 C
--

점수: 100
A+
*/