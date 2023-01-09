package ch07.ex07.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = (int x, int y) -> {
			int result = x + y;
			return result; //2개이상 문장은 블록으로 묶어야 한다.
		};
		
		calculator = (a, b) -> a + b; //lamda스러운 방법 //return 명령문만 있을때는 block 생략가능하다.
		
		System.out.println(calculator.calc(1, 2));
	}
}
