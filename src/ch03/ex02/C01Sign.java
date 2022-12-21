package ch03.ex02;

public class C01Sign {
	public static void main(String[] args) {
		int i = -10;
		i = +i; //+는 양수를 나타내는 연산자 (곱하기 1을 한다.)
		System.out.println(i);
		
		i = -10;
		i = -i; // 곱하기 -1을 한다.
		System.out.println(i);
	}
}
