package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String score = "";
		String grade = "";
		String plusMinus = "";
		String finalGrade = "";
		
		System.out.print("점수: ");
		score = sc.nextLine();
		plusMinus = score.substring(0);
		
		if(score.startsWith("9")) grade = "A";
		else if(score.startsWith("8")) grade = "B";
		else grade = "C";
		if(plusMinus.matches("[8-9]*")) finalGrade = grade + "+";
		else if(plusMinus.matches("[4-7]*")) finalGrade = grade;
		else if(grade.equals("C")) finalGrade = "C";
		else finalGrade = grade + "-";
		System.out.println(finalGrade);
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