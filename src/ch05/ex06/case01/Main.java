package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love java."); // static method는 접두사로 class 가능하다.
		//Man.tell(""); //instance method는 객체가 필요하다.
		
		Man man = new Man();
		man.tell("I LOVE JAVA.");
		man.say("Hello"); // 경고 -> 유지보수하는 사람이 say를 instance method로 왜곡할 가능성있다.
	}
}
