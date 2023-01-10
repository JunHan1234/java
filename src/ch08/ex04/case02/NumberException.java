package ch08.ex04.case02;

public class NumberException extends RuntimeException { //이 경우 Main에서 try 블록을 안써도 된다.
	public NumberException(String msg) {
		super(msg);
	}
}
