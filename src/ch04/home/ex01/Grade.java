package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int tenDigit = 0;
		int oneDigit = 0;
		String grade = ""; //data는 data끼리 모아둔다.
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		tenDigit = score / 10;
		oneDigit = score % 10;
		
		if(tenDigit >= 9) grade = "A";
		else if(tenDigit >= 8) grade = "B"; // 가독성(통일성)을 위해 ==를 사용하지 않고 >=로 일관적으로 써준다.
		else grade = "C";
		
		if(score >= 80) {
			if(oneDigit >= 8 || tenDigit == 10) grade += "+";
			else if(0 <= oneDigit && oneDigit < 4) grade += "-";
		}
		
		System.out.println(grade);		
	}
}
		/*
		String score = "";
		String grade = "";
		String plusMinus = "";
		String finalGrade = "";
		
		System.out.print("점수: ");
		score = sc.nextLine();
		plusMinus = score.substring(0);
		
		if(score.matches("[100]*"))	finalGrade = "A+";
		else if(score.startsWith("9")) grade = "A";
		else if(score.startsWith("8")) grade = "B";
		else grade = "C";
		
		if(plusMinus.matches("[8-9]*")) finalGrade = grade + "+";
		else if(plusMinus.matches("[4-7]*")) finalGrade = grade;
		else if(grade.matches("C")) final finalGrade = "C";
		else finalGrade = grade + "-";
		*/
		/*
		int score = 0;
		int gradeScore = 0;
		String strScore = "";
		String plusMinus = "";
		String grade = "";
		String finalGrade = "";
		strScore = score + "";
		plusMinus = strScore.substring(0);
		
		System.out.print("점수: ");
		score = sc.nextInt();
		gradeScore = score / 10;
		
		if(gradeScore == 10) finalGrade = "A+";
		else if(9 <= gradeScore && gradeScore < 10) grade = "A";
		else if(8 <= gradeScore && gradeScore < 9) grade = "B";
		else finalGrade = "C";
		System.out.println(finalGrade);
		
		if(plusMinus.matches("[8-9]*")) finalGrade = grade + "+";
		else if(plusMinus.matches("[4-7]*")) finalGrade = grade;
		else finalGrade = grade + "-";
		
		System.out.println(finalGrade);
		*/

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