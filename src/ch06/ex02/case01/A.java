package ch06.ex02.case01;

public class A {
	private int a;
	int b; //default. package 안에서만 사용가능하다.
	protected int c; //package 안에서, 상속 전제하에 자식 객체가 사용가능하다.
	public int d;
	
	private void m1() {}
	void m2() {}
	protected void m3() {}
	public void m4() {}
}
