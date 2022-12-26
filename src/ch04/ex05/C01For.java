package ch04.ex05;

public class C01For {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) { // for 내부는, 초기값; 조건문; 증감식; 순이다.
			System.out.print("*");
		}
		System.out.println();
		
		for(int i = 0; i < 10; i++) // 블럭 생략 가능
			System.out.print(i + " ");
		System.out.println();
		
		// 과제: 초기값 i = 1 상황에서, 0 이상 9 이하를 출력하라.
		
		for(int i = 1; i < 11; i++)
			System.out.print(i - 1 + " ");
	}
}
