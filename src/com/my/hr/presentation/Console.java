package com.my.hr.presentation;

import java.time.LocalDate;
import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	private static void inMsg(String msg) {
		System.out.print(msg + ": ");
	}

	public static int inNumId() {
		return (int)(Math.random() * 10000) + 1;
	}
	
	public static String inStr(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[a-zA-Z가-힣]+") && (0 < input.length() && input.length() <= 5);
			
			if(!input.matches("[a-zA-Z가-힣]+"))
				Console.err("노동자명을 한글 또는 영어문자로 적어주세요");
			else if(!(0 < input.length() && input.length() <= 5))
				Console.err("1글자 이상 5글자 이하로 적으세요.");
		} while(!isGood);
		
		return input;
	}
	
	public static LocalDate inHiredDate(String msg) {
		String input = "";
		int inInt = 0;
		int readYear = 0;
		int readMonth = 0;
		int readDay = 0;
		boolean isGood = false;
		
		Console.inMsg(msg);
		
		do {
			Console.inMsg("\n연");
			input = sc.nextLine();
			isGood = input.matches("[0-9]+") && (0 < input.length() && input.length() <= 4);

			if(!input.matches("[0-9]+")) Console.err("0 또는 자연수로 입력하세요.");
			else if(!(0 < input.length() && input.length() <= 4))
				Console.err("1자리 이상 4자리 이하 숫자로 입력하세요.");
		} while(!isGood);
		
		readYear = Integer.parseInt(input);
		
		do {
			Console.inMsg("월");
			input = sc.nextLine();
			isGood = input.matches("^[1-9][0-9]*");

			if(!input.matches("^[1-9][0-9]*")) Console.err("자연수로 입력하세요.");
			else {
				inInt = Integer.parseInt(input);
				if(!(1 <= inInt && inInt <= 12)) {
					Console.err("1 ~ 12 사이의 숫자로 입력하세요.");
					isGood = false;
				}
			}
		} while(!isGood);

		readMonth = inInt;
		
		do {
			Console.inMsg("일");
			input = sc.nextLine();
			isGood = input.matches("^[1-9][0-9]*");

			if(!input.matches("^[1-9][0-9]*")) Console.err("자연수로 입력하세요.");
			else {
				inInt = Integer.parseInt(input);
				if(!(1 <= inInt && inInt <= 31)) {
					Console.err("1 ~ 31 사이의 숫자로 입력하세요.");
					isGood = false;
				}
			}
		} while(!isGood);
		
		readDay = inInt;
		
		return LocalDate.of(readYear, readMonth, readDay);
	}
	
	public static void info(Object obj) {
		if(obj == null) obj = "노동자가 없습니다.";
		System.out.println(obj);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
