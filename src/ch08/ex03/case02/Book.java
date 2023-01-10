package ch08.ex03.case02;

import java.time.LocalDate;

public class Book { //아래 code는 record를 일반 class로 구현해본것이다.
	private final String title;
	private final int price;
	private final LocalDate printedDate;
	
	public Book(String title, int price, LocalDate printedDate) {
		this.title = title;
		this.price = price;
		this.printedDate = printedDate;
	}
	
	//아래는 내 입맛에 맞게 알고리즘을 구현하면 된다.
	@Override
	public final String toString() {return null;}
	
	@Override
	public final int hashCode() {return 0;}
	
	@Override
	public final boolean equals(Object o) {return false;}
	
	public String title() {return null;}
	public int price() {return 0;}
	public LocalDate printedDate() {return null;}
}
