package ch03.ex09;

public class C01Ternary {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		int absX = (x >= 0) ? x : -x;
		int absY = (y >= 0) ? y : -y;
		
		System.out.println(absX + ", " + absY);
	}
}