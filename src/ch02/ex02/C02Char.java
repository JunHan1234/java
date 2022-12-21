package ch02.ex02;

public class C02Char {
	public static void main(String[] args) {
		char c = 'A'; //개발자라면, A = 65, a = 97, 0 = 48 의 unicode 값을 기억하자.
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
		
		c = 65;
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
		
		c = 0x0041;
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
		
		c = '\u0041'; // unicode의 0041 문자를 call한다.
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));		
	}
}
