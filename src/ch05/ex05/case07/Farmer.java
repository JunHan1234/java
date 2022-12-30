package ch05.ex05.case07;

public class Farmer {
	public Apple sell(int price) {
		Apple apple = new Apple(); //농부가 사과를 따다.
		apple.setPrice(price); //사과에 가격을 붙이다.
		
		return apple; //농부가 수확한 사과에 return.
	}
}
