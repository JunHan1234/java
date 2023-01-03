package ch06.ex03.case02;

public class Dog extends Animal { //Dog "is a" Animal
	@Override
	public void shout() {
		System.out.println("멍멍.");
	}
}
