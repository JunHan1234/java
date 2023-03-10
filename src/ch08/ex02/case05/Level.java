package ch08.ex02.case05;

public enum Level {
	GOLD(3, null), SILVER(2, GOLD), COPPER(1, SILVER); //생성자 이용하면 끝에 ; 찍기.
	
	private final int value;
	private final Level next;
	
	private Level(int value, Level next) {//enum의 생성자는 private이다.
		this.value = value;				  //내부에서 값을 생성하는 용도로 쓴다.
		this.next = next;				  //값은 위의 브실골이다.
	}
	
	public int value() {
		return this.value;
	}
	
	public Level next() {
		return this.next;
	}
}
