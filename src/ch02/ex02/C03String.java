package ch02.ex02;

public class C03String {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum; //int를 String으로 변환한다.
		System.out.println(sumStr);
		
		int i = Integer.parseInt(sumStr);
		
		String s = a + b + ""; // 연산자 우선순위는 + 가 여러개 있는경우 왼쪽부터 계산한다.
		System.out.println(s);
		
		s = "" + a + b; // 문자 + a 먼저 계산되고, + b가 나중이므로, String 12가 최종으로 생성된다.
		System.out.println(s);
		
		String dialog = "John said, \"hello\"."; // \를 이용해 다양한 escape 문자(특수문자)를 이용할 수 있다.
		System.out.println(dialog);
	}
}