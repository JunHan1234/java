package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test() {
		A a = new A(); //VM이 같은 package에서 먼저 찾고, 다음 Library 찾고, 없으면 오류처리한다. -> 개발자가 직접 import해준다.
		
		int x = 0;
		//x = a.a; //private -> 해당 class(A)에서 getter setter(method)를 만들어 이를 통해 접근해야 한다.
		//x = a.b; //default -> 다른 패키지이므로 접근불가
		//x = a.c; //protected -> 다른 패키지이므로 접근불가
		x = a.d; //public -> 접근 제한이 없다.
		
		//a.m1(); //private method
		//a.m2(); //default method
		//a.m3(); //protected method
		a.m4(); //public method
	}
}
