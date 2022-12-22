package ch03.ex03;

public class BitWise {
	public static void main(String[] args) {
		int x = 10;
		System.out.printf("%s, %d\n", 
				"0000000000000000000000000000" + Integer.toBinaryString(x), x);
		//0을 이용해 시각적으로 int의 빈 공간을 표현했다.
		x = ~x;
		System.out.printf("%s, %d\n", Integer.toBinaryString(x), x); // BitWise 를 이용하여 Binary상 숫자 0을 1로 바꾼다.
	}
}
