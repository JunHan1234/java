package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String op = "";
		int result = 0;
		
		String tmp = "";
		boolean isGood = false;
		String errMsg = "input 0 or natural number.";
		
		do {
			do {
				isGood = false;
				System.out.print("a: "); tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+");  // * -> 0글자 이상 + -> 1글자 이상
				if(isGood) a = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("op: "); op = sc.nextLine();
				isGood = op.matches("[+-/\\*]"); // regular expression
				if(!isGood) System.out.println("input one of them(+, -, *, /).");
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("b: "); tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+");
				if(isGood) b = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			result = switch(op) {
			case "+" -> a + b;
			case "-" -> a - b;
			case "*" -> a * b;
			default -> a / b;
			};
			
			System.out.printf("%d %s %d = %d\n", a, op, b, result);
			
			System.out.println("continue(y/n)? ");
		} while(sc.nextLine().equalsIgnoreCase("y"));
		
		System.out.println("end.");
	}
}
		/*
		Scanner sc = new Scanner(System.in);
		String inputA = "";
		String inputB = "";
		String inputOp = "";
		String reset = "";
		int a = 0;
		int b = 0;
		int result = 0;
		
		do {
			do {
				System.out.print("a: ");
				inputA = sc.nextLine();
				if(!(inputA.matches("[0-9]*")) || inputA.equals(""))
					System.out.println("0 또는 자연수를 입력해주세요.");
				} while(!(inputA.matches("[0-9]*")) || inputA.equals(""));
			
			do {
				System.out.print("op: ");
				inputOp = sc.nextLine();
				if(!(inputOp.equals("+") || inputOp.equals("-") || inputOp.equals("*") || inputOp.equals("/")))
					System.out.println("연산자를 다시 입력해주세요.");
				} while(!(inputOp.equals("+") || inputOp.equals("-") || inputOp.equals("*") || inputOp.equals("/")));
			
			do {
				System.out.print("b: ");
				inputB = sc.nextLine();
				if(!(inputB.matches("[0-9]*")) || inputB.equals(""))
					System.out.println("0 또는 자연수를 입력해주세요.");
				} while(!(inputB.matches("[0-9]*")) || inputB.equals(""));
		
			a = Integer.parseInt(inputA);
			b = Integer.parseInt(inputB);
			
			switch(inputOp) {
			case "+" -> result = a + b;
			case "-" -> result = a - b;
			case "*" -> result = a * b;
			case "/" -> result = a / b;
			}
			
			System.out.printf("%d %s %d = %d\n", a, inputOp, b, result);
			System.out.print("continue(y/n)? ");
			reset = sc.nextLine();
			
		} while(reset.equalsIgnoreCase("y"));
		
		System.out.println("end.");
		*/

/*
과제: 계산기를 만들어라.
연산자는 +, -, *, / 이다.
입력값 a, b는 0또는 자연수이다.
/ 는 몫만을 구한다.

continue(y/n)? 에서 y 또는 Y를 입력하면 계산 작업을 재수행한다.
y 또는 Y 외를 입력하면 앱을 종료한다.
--

a: 1
op: +
b: 2
1 + 2 = 3
continue(y/n)? y
a: 2
op: *
b: 2
2 * 2 = 4
continue(y/n)? n
end.
*/