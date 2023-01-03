package ch06.ex03.case02;

public class Cat extends Animal { // Cat "is a" Animal
	@Override	//annotation -> 주석(comment, Override)
	public void shout() {	// 재 정의 "@Override" //접근 제한자는 부모 정의보다 넓어야한다.
		System.out.println("야옹야옹");
	}
}
