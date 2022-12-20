package ch02.ex01;

public class C01Variable {
	public static void main(String[] args) {
		boolean bl = false;
		//constant false값을 생성하고, boolean타입의 bl이라는 변수를 뒤이어 생성 후(bl변수 선언) constant의 false값을 assign(대입)한다.
		bl = true;
		//byte bl; error message를 읽고 힌트를 얻어 해결한다.
		/*
			multi line comment
		*/
		byte b = 0; // statement
		short s = 0;
		char c = 0;
		int i = 0;
		long l = 0;
		float f = 0.0f;
		double d = 0.0;
		
		String str = ""; // empty string ""안에 \n이 자동으로 들어가있다.
		
		int a;
		a = 0; // 최초의 할당값을 initialization이라 한다.
		
		int x;
		int y;
		//int x, y; 가독성이 떨어지는 나쁜 코드다.
		//int x2 = 0, y2 = 0; 가독성이 떨어지는 나쁜 코드다.
	}
}