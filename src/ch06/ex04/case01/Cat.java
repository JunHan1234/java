package ch06.ex04.case01;

public class Cat extends Animal {
	private int age;
	
	public Cat(String catName, int age) {
		super(catName); // 부모에서 온 변수 값은 부모가 초기화한다.
		//this.animalName = catName;
		this.age = age; // 내 변수 값은 내가 초기화한다.
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", this.getAnimalName(), this.getAge());
	}
}
