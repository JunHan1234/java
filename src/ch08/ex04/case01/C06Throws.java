package ch08.ex04.case01;

public class C06Throws {
	/*
	public void first() {
		this.second();
	}
	
	public void second() {
		this.third();
	}
	
	public void third() {
		int i = 3 / 0;
	}
	*/
	
	public void first() {
		this.second();
	}
	
	public void second() {
		try {
			this.third();
		} catch (Exception e) {
			System.out.println("second()");
		}
	}
	
	//throws는 method 선언부에 사용한다.
	public void third() throws Exception { //method 단계에서 throws 문법을 사용하면 call하는 method에 try를 쓰는것이 강제된다.
		int i = 3 / 0;
	}
	
	public static void main(String[] args) {
		new C06Throws().first();
		System.out.println("end.");
	} //run 하면 stack별로 exception이 쌓인다. 제일 아래 문구가 먼저 실행된 것이다.
}
