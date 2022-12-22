package ch03.ex07;

public class C01Compare {
	public static void main(String[] args) {
		boolean b = 'A' < 'B';
		b = '0' == 0;
		b = 'A' != 65;
		
		b = 10.0 == 10.0f;
		b = 0.1 == 0.1f;
		b = (float)0.1 == 0.1f; // double type 에서 float type 으로 bit를 낮추어 오류를 해결한다.
		
		System.out.println(b);
	}
}
