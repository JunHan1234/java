package ch07.ex07.case02;

@FunctionalInterface
public interface Human {
	void say(); //FunctionalInterface의 추상 method는 무조건 하나다.
	
	static void walk() { //static, default method들은 몇개가 와도 상관없다.
		System.out.println("Human walk.");
	}
	
	default void sleep() {
		System.out.println("Human sleep.");
	}
}
