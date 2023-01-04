package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		//부모type을 큰 수로, 자식type을 작은 수로 본다.
		B b = c; //c type이 b type으로 promotion 후 할당됐다.
		A a = c; //c type이 a type으로 promotion 후 할당됐다.
		
		c = (C)a; //a type을 C로 casting해서 c type에 할당했다.
		c = (C)b; //b type을 C로 casting해서 c type에 할당했다.
		
		b = (B)a; //a type을 B로 casting해서 b type에 할당했다.
		
		//String s = (String)c; //자신이 안가지고 있는 type으로는 변환 불가능하다.
	}
}
