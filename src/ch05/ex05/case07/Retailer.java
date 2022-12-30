package ch05.ex05.case07;

public class Retailer {
	public Apple sell(Apple apple) {
		apple.setPrice(apple.getPrice() * 2); // 농부가 판 사과에 2배가격을 붙이다.
		return apple; // 농부가 수확한 사과에 return.
	}
}
