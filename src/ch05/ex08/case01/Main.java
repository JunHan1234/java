package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby(); // 객체가 만들어 진 이유는 new가 실행되었기 때문이다.
		baby.setBabyName("초롱이");
		// case 1 생성자가 만들어 진 후 나중에 객체 이름을 setter로 초기화했다.
		
		baby = new Baby("튼튼이");
		// case 2 생성자가 만들어 진 직후에 객체 이름 초기화했다.
	}
}