package ch05.ex05.case05;

public class Main {
	public static void main(String[] args) {
		Apple apple = new Apple();
		Basket basket = new Basket();
		
		basket.setApple(apple); //바구니에 사과를 집어넣다.
		basket.getApple(); //바구니에서 사과를 꺼내다.
	}
}
