package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	private static void err(String msg) {
		System.out.println("ERROR] " + msg + "가 아닙니다.");
	}
	
	public static String inStr(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[a-zA-Z가-힣]+");
			if(!isGood) Console.err("문자");
		} while(!isGood);
		
		return input;
	}
	
	public static int inNum(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("^[1-9][0-9]*");
			if(!isGood) Console.err("자연수");
		} while(!isGood);
		
		return Integer.parseInt(input);
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
}
	/*
	private static Scanner sc;
	private static String letterMsg;
	private static String numMsg;
	private static boolean isGood;
	
	static {
		sc = new Scanner(System.in);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	private static void err(String msg) {
		System.out.println("ERROR] " + msg + "가 아닙니다.");
	}
	
	public static String inStr(String msg) {
		do {
			Console.inMsg(msg);
			letterMsg = sc.nextLine();
			isGood = letterMsg.matches("[a-zA-Z가-힣]+");
			if(!isGood) Console.err("문자");
		} while(!isGood);
		return letterMsg;
	}
	
	public static String inNum(String msg) {
		do {
			Console.inMsg(msg);
			numMsg = sc.nextLine();
			isGood = numMsg.matches("^[1-9][0-9]*");
			if(!isGood) Console.err("자연수");
		} while(!isGood);
		return numMsg;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
}
	*/