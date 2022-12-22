package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c); // overflow 때문에 값의 변질이 일어난다.
		
		c = (long)a * b;
		System.out.println(c); // 해결법
		
		int x = a * b / a;
		System.out.println(x); // overflow 때문에 값의 변질이 일어난다.
		x = a / b * a;
		System.out.println(x); // 관점의 전환으로 연산 순서를 변경하여 해결한다.
	}
}
