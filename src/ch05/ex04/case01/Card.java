package ch05.ex04.case01;

public class Card {
	public String kind;
	public int number;
	public static int width; // 지금 수준에서 static variable은 사용 추천을 안한다. 공유 자원은 오염되기가 쉽기 때문이다. (무결성이 깨지기 쉽다.)
	public static int height; // 공유시켜도 오염시키지 않을 알고리즘을 작성할 수 있다면 사용해도 좋다.
}
