package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		boolean isGood = false;
		String temp = "";
		int tempAge = 0;
		
		do {
			isGood = false;
			System.out.print("이름: "); temp = sc.nextLine();
			isGood = temp.matches("[a-zA-z]+");
			if(!isGood) System.out.println("영어로 이름을 다시 입력해주세요.");
			if(isGood) user.setUserName(temp);
		} while(!isGood);
		
		do {
			isGood = false;
			System.out.print("나이: "); temp = sc.nextLine();
			isGood = temp.matches("[0-9]+");
			if(!isGood) System.out.println("숫자로 나이를 다시 입력해주세요.");
			if(isGood) tempAge = Integer.parseInt(temp);
		} while(!isGood);
		
		user.setAge(tempAge);
		user.setJoinDate(LocalDate.now());
		
		System.out.println();
		System.out.printf("이름: %s\n나이: %d\n가입일: %s", user.getUserName(), user.getAge(), user.getJoinDate());
	}
}
/*
과제: user를 생성하라.
user가 user의 이름, 나이를 수동 입력한다.
app이 user의 가입일을 자동 입력한다.
--

이름: gambit
나이: 25

이름: gambit
나이: 25
가입일: 2022-12-27
*/