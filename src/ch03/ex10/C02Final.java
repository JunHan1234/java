package ch03.ex10;

public class C02Final {
	public static void main(String[] args) {
		final int MAX = 3; //final을 이용해 변수를 상수로 만든다.
		// MAX = 1; //MAX가 상수로 변환되었으므로 compile error
		
		double area = 3.14 * 3 * 3;
		
		final double PI = 3.14; //final double type variable PI를 선언했다.
		int r = 3;
		area = PI * r * r;
	}
}