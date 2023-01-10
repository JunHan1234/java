package ch08.ex04.case02;

public class LengthException extends Exception {
	public LengthException(String msg) {
		super(msg); //초기화도 부모에게 떠넘긴다.
	}
}
