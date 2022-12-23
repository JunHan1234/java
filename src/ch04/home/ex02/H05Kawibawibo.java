package ch04.home.ex02;

import java.util.Scanner;

public class H05Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.print("1. 가위, 2.바위, 3.보 \n> ");
		playerChoice = sc.nextInt();
		appChoice = (int)(Math.random() * 3) + 1;
		
		if(1 <= playerChoice && playerChoice <= 3) {
			result = switch(playerChoice - appChoice) {
			case -2, 1 -> "You win.";
			case -1, 2 -> "You lose.";
			default -> "Fair";
			};
			
			choice = switch(playerChoice) {
			case 1 -> "가위";
			case 2 -> "바위";
			default -> "보";
			};
			System.out.println("You: " + choice);
			
			choice = switch(appChoice) {
			case 1 -> "가위";
			case 2 -> "바위";
			default -> "보";
			};
			System.out.println("Me: " + choice); //나중에 method 를 이용하여 이 중복문제를 해결한다.
		} else result = "[ERROR] 1, 2, 3 중에서 입력하세요.";
		
		System.out.println('\n' + result);
	}
}
		/*
		Scanner sc = new Scanner(System.in);
		int user = 0;
		int com = 0;
		int gameMatch = 0;
		String userChoice = "";
		String comChoice = "";
		
		System.out.print("1.가위, 2.바위, 3.보\n> ");
		user = sc.nextInt();
		com = (int)(Math.random() * 3) + 1;
		gameMatch = user - com;
		
		switch(user) {
		case 1 -> userChoice = "가위";
		case 2 -> userChoice = "바위";
		case 3 -> userChoice = "보";
		default -> gameMatch = -1;
		}
		
		switch(com) {
		case 1 -> comChoice = "가위";
		case 2 -> comChoice = "바위";
		default -> comChoice = "보";
		}
		
		System.out.printf("You: %s\n", userChoice);
		System.out.printf("Me: %s\n", comChoice);
		System.out.println();
		
		if(gameMatch == 0)
			System.out.println("Fair");
		else if(gameMatch == -2 || gameMatch == 1)
			System.out.println("You win.");
		else
			System.out.println("You lose.");
		*/
	
/*
과제: 앱과 가위바위보를 하라. 게임 결과를 출력하라. 결과는
You win.
You lose.
Fair.
중 하나이다.
--

 1.가위, 2.바위, 3.보
 > 1
 You: 가위
 Me: 보
 
 You win.
*/