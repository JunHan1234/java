package ch06.home.ex04.case03;

public class Circle {
	private Point point; //Circle "has a" Point
	private int r;
	
	public Circle(Point point, int r) {
		this.point = point;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", this.point, this.r);
	}
}