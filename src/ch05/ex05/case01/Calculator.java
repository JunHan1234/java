package ch05.ex05.case01;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	/*public int add(int x, int y) {
		return x + y;
	} //중복되는 method name(add int int)은 사용불가능하다.*/
	
	public int add(int a, int b, int c) {
		return a + b + c;
	} //add int int int 이므로 첫 add int int와는 다른 method -> "overloading"
}
