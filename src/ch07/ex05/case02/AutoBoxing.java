package ch07.ex05.case02;

public class AutoBoxing {
	public static void main(String[] args) {
		System.out.println(add(1, 2));
	}
	
	private static int add(Integer a, Integer b) { //자동으로 add method의 값 1, 2들이 Integer class type으로 boxing된다.
		return a + b; //auto unboxing 이 되어 int type으로 계산이 된다.
	}
}
