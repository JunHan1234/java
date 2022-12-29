package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a"; //String type를 만드는 2가지 방법이다.
		b = s == "a"; //true
		
		s = new String("a"); //String type를 만드는 2가지 방법이다.
		System.out.println(s);
		b = s == "a"; //false

		b = s.equals("a"); //true //equals는 논리적인 관점에서 두 데이터가 같은지 판단한다.
		// 위와 같은 오류를 해결하기 위하여 비교연산자 대신 equals를 적극 활용한다.
		System.out.println(b);
	}
}