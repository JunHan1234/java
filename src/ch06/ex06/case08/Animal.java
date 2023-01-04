package ch06.ex06.case08;

public interface Animal {
	void move();
	
	default void eat() { } //interface상에서 알고리즘 구현하고 싶을때 default 이용한다.
}
