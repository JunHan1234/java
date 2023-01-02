package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A {
	public void test() {
		int x = 0;
		
		//x = this.a; //private이므로 사용 불가.
		//x = this.b; //default -> package가 다르므로 사용 불가.
		x = this.c; //protected -> package가 다르지만 상속받았으므로 사용 가능.
		x = this.d; //public
		
		//this.m1();
		//this.m2();
		this.m3();
		this.m4();
	}
}
