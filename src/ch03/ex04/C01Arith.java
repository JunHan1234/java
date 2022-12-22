package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		// 과제: 아래 compile error 를 해결하라.
		//		 byte c 는 건드리지 않는다.
		byte c = (byte)(a + b);
		System.out.println(c);
		
		//c = c + 1; // byte vs int compile error
		c++; // 간단한 해결책이다.
		System.out.println(c);
		
		double d = a / b; // overflow 한 값을 뒤늦게 double 변수에 넣어봤자, 사라진 값은 돌아오지 않는다.
		System.out.println(d);
		
		// 과제: d 변수에 1.5가 저장되도록 하라.
		d = (double)a / b; // a값 3을 read하여 double로 casting한다.
		System.out.println(d);
		d = 1.0 * a / b; // 또 다른 방법이다.
		System.out.println(d);
		
		// bad
		d = (double)(a / b);
		System.out.println(d); // 기억의 왜곡이다. a와 b의 int연산이 먼저이므로 1.0이 답으로 나온다.
		d = a / b * 1.0;
		System.out.println(d);
	}
}
