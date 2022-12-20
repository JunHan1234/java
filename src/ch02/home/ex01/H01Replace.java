package ch02.home.ex01;

public class H01Replace {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		int temp = 0; //temporary 값 (잠시 쓸 임시 값)
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("a = %d, b = %d", a, b);
	}
}
/* 과제: 두 변수의 데이터를 교환하라.
a: 1, b: 2
a: c, b: 1
*/