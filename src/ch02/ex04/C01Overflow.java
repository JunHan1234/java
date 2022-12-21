package ch02.ex04;

public class C01Overflow {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; // promotion
		i = (int)b; // casting 연산자를 이용한 상태이다.
		System.out.println(i);
		
		int i2 = 300;
		byte b2 = (byte)i2; // casting 연산자를 이용한 강제 타입변환이다.
		System.out.println(b2); // overflow 현상을 확인할 수 있다. binary check!
	}

}
