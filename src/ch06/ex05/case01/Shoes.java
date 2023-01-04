package ch06.ex05.case01;

public class Shoes extends Product { //Shoes is a Product
	public int price;
	
	public Shoes(int price) {
		super(price * 2); // 빠르게 test 해보는 방법. parameter에 산술연산자를 넣는다.
		this.price = price;
	}
	/*
	@Override
	public int getPrice() {
		return this.price; //Shoes의 price로 Override.
		//return super.getPrice(); //Product의 price로 Override.
	}
	*/
}
