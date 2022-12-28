package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String userName = "";
		int age = 0;
		LocalDate regDate = null;
		
		Scanner sc = new Scanner(System.in);
		String tmp = "";
		boolean isGood = false;
		// 빈 줄은 성격이 다른 두 단락을 나눌 때 넣는다.
		
		do {
			System.out.print("이름: ");
			userName = sc.nextLine();
			isGood = userName.matches("[a-zA-z가-힣]+");
			if(!isGood) System.out.println("이름을 다시 입력해주세요.");
		} while(!isGood);
		
		do {
			isGood = false;
			System.out.print("나이: ");
			tmp = sc.nextLine();
			isGood = tmp.matches("[0-9]+");
			if(isGood) age = Integer.parseInt(tmp);
			else System.out.println("숫자로 나이를 다시 입력해주세요.");
		} while(!isGood);
		
		regDate = LocalDate.now();
		
		User user = new User();
		user.setUserName(userName);
		user.setAge(age);
		user.setJoinDate(regDate);
		
		System.out.printf("\n이름: %s\n나이: %d\n가입일: %s",
				user.getUserName(), user.getAge(), user.getJoinDate());
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