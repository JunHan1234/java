package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// compiler가 error message를 출력한다.
		// ctrl + shift + o 를 누르면 자동으로 error부분 coding을 해준다.
		// 복습: Scanner는 class, sc는 variable이다.
		/*
		System.out.print("문자열을 입력하세요.\n> ");
		// sc.nextLine();
		// System.out.print("입력했습니다.");
		*/
		// 과제: '<입력값>을 입력했습니다.'를 출력하라.
		/*
		String str = sc.nextLine(); // soft coding
		// String str = "hello" // hard coding = 입력값이 고정되어 있다.
		System.out.printf("<%s>을 입력했습니다.", str);
		// System.out.print('<' + sc.nextLine() + '>' + "을 입력했습니다.");
		*/
		
		// 과제: bug 를 해결하라.
		/*
		System.out.print("숫자를 입력하세요.\n> ");
		int i = sc.nextInt();
		System.out.println(i + "을 입력했습니다.");
		
		System.out.print("숫자를 입력하세요.\n> ");
		i = sc.nextInt(); //이 줄에 "sc.nextLine();" 추가한다. = 강사님의 답, 쓰레기를 치운다.
		System.out.println(i + "을 입력했습니다.");

		// String str = sc.nextLine();
		// 내 답, ENTER 키에 해당하는 \n을 여기 줄에서 소모해서 bug 를 해결한다. = 쓰레기를 여전히 치우지 못했다.
		
		System.out.print("문자열을 입력하세요.\n> ");
		String str = sc.nextLine();
		System.out.println(str + "을 입력했습니다.");
		*/
		// 버그가 일어나는 이유는 28행에서 숫자+ENTER 키를 입력하므로,
		// ENTER 키에 해당하는 \n이 문자열 값으로 들어가기 때문이다.
		
		System.out.print("문자를 입력하세요.\n> ");
		char c = sc.nextLine().charAt(0); // hello를 입력하면, 0번째 글자 h를 return한다.
		System.out.println(c + "를 입력했습니다.");
	}
}