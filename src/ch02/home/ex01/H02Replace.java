package ch02.home.ex01;

import java.util.Scanner;

public class H02Replace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a에 숫자를 입력해주세요.\n>"); // presentation logic, IO(Input/Output)
		int a = sc.nextInt(); // sc.nextLine(); 여기선 ENTER입력값으로 오류가 안나므로, 필요없는 쓰레기 코드다.
		System.out.print("b에 숫자를 입력해주세요.\n>");
		int b = sc.nextInt(); // sc.nextLine();
		System.out.printf("a = %d, b = %d\n", a, b);
		
		System.out.println("a와 b의 값을 바꿉니다.");
		int temp = 0; // business logic
		temp = a;
		a = b;
		b = temp;
		System.out.printf("바뀐 값은 각각 a = %d, b = %d 입니다.", a, b);
	}
}
/*
과제: H01을 확장성 있게 고도화하라.
*/