package ch06.ex04.case03;

public class Circle extends Point {
	private int r;
	
	//과제: 위 compile error를 해결토록, 생성자를 기술하라.
	public Circle(int x, int y, int r) {
		super(x, y);	// 부모것은 부모가 초기화한다.
		this.r = r;		// 내것은 내가 초기화한다.
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", this.getX(), this.getY(), r);
	}
}