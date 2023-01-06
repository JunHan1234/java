package ch07.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> basket = new Basket<Apple>(); // new로 객체 생성할때 generic type 결정한다.
		basket.set(new Apple());
		System.out.println(basket.get());
		
		// basket.set(new Grape()); //type 불일치 -> 새로운 바구니가 필요.
		Basket<Grape> basket2 = new Basket<Grape>();
		basket2.set(new Grape());
		System.out.println(basket2.get());
	}
}
