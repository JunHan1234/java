package ch04.home.ex04;

import java.util.Scanner;

public class H01OneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean isGood = false;
		
		do {
			System.out.print("> ");
			isGood = sc.nextLine().matches("[1-9]");
			if(!isGood) System.out.println("한자리 자연수를 입력하세요.");
		} while(!isGood);
		
		System.out.println("끝.");
		/* 내 답안
		do {
			System.out.print("한자리 자연수를 입력하세요.: ");
			input = sc.nextLine();
			
			if(input.length() != 1) System.out.println("한자리 숫자가 아닙니다.");
			else if(!(input.matches("[1-9]"))) System.out.println("자연수가 아닙니다.");
			
		} while(!(input.matches("[1-9]")));
		
		System.out.println("한자리 자연수를 입력받았습니다.");
		*/
	}
}
/*
과제: 한자리 자연수를 입력받아라.
*/