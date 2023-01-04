package ch06.ex06.case09;

public interface UI {
	static String in() {
		return "키보드로 입력하다.";
	} //interface에 있는 static method()는 상속 대상이 아니다.
	
	String out(); //interface의 method()만 상속 대상이다.
}
