package ch07.ex05.case01;

public class Basket<E> { //generic type -> '아무거나'를 표현한다.
	private E e;		 //type 결정 시점을 뒤로 미룬다.
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}
