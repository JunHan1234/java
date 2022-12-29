package ch05.ex05.case01;

public class Main {
	public static void main(String[] args) { // VM이 main method를 실행한다.
		Calculator calculator = new Calculator();
		
		int result = calculator.add(1, 2); // main method가 calculator.add(int int)를 call
		result = calculator.add(1, 2, 3); // main method가 calculator.add(int int int)를 call
		
		System.out.println(result);
	}
}
