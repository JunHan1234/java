package ch06.ex02.case01;

public class B {
	public void test() {
		A a = new A();
		
		int x = 0;
		//x = a.a; //private -> 해당 class(A)에서 getter setter(method)를 만들어 이를 통해 접근해야 한다.
		x = a.b; //default -> 동일 패키지이므로 접근가능
		x = a.c; //protected -> 동일 패키지이므로 접근가능
		x = a.d; //public -> 접근 제한이 없다.
		
		//a.m1(); //private method
		a.m2(); //default method
		a.m3(); //protected method
		a.m4(); //public method
	}
}
