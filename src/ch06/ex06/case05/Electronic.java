package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	//interface에서는 instance를 만들지 않기 때문에 static variable만 가능하다.
	public static final int VOLTAGE = 200;
	//interface는 추상 class라서 생성자가 없으므로 멤버변수 선언과 초기화를 동시 진행한다.
	/*public*/static final String MAKER_NAME = "LG";
	/*public static*/final int WEIGHT = 10;
	/*public static final*/LocalDate PRODUCED_DATE = LocalDate.now();
	//public static final이 기본으로, 생략하더라도 자동추가된다.
	
	public abstract void displayMsg();
	/*public*/abstract int getTemperature();
	/*public abstract*/String getModelName();
	//method()는 public abstract가 기본이다. 생략하더라도 자동추가된다.
}
