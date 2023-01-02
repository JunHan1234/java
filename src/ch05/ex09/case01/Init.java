package ch05.ex09.case01;

import ch05.home.ex06.case02.Console;

public class Init {
	private static int s; // static variable
	private int i; // instance variable
	
	static {
		Init.s = 1; // 초기화로 업무상 기본값 설정한다.
		//this.i = 1; //문법상 사용 불가능하다.
		Console.info("static{}");
	}
	
	{
		this.i = 1; // instance variable 초기화한다.
		Init.s = 1; // 사용가능하나 가독성이 안좋다.
		Console.info("{}");
	}
	
	{
		Console.info("{}2"); // instance block 은 여러개 만들수 있지만 하나의 block으로 합치면 되므로 의미가 없다.
	}
	
	public Init() {
		Console.info("Init{}");
	}
	
	public Init(int i) {
		Console.info("Init(int)");
	}// 실행 순서 = static block -> instance block -> 생성자 block
}