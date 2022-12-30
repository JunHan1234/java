package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	private static String tmp;
	private static boolean isGood;
	
	static {
		sc = new Scanner(System.in);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	public static String inStr(String msg) {
		do {
			Console.inMsg(msg);
			String letter = sc.nextLine();
			isGood = letter.matches("[a-zA-Z가-힣]+");
			if(!isGood) System.out.println("ERROR] 문자가 아닙니다.");
		} while(!isGood);
		return tmp;
	}
	
	public static String inNum(String msg) {
		do {
			Console.inMsg(msg);
			String num = sc.nextLine();
			isGood = num.matches("[1-9]+");
			if(!isGood) System.out.println("ERROR] 자연수가 아닙니다.");
		} while(!isGood);
		return tmp;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
}