package ch03.ex09;

public class C01Ternary {
	public static void main(String[] args) {
		int x = 2;
		int y = -1;
		
		int absX = (x >= 0) ? x : -x; // (조건문) ? (true면 실행) : (false면 실행)
		int absY = (y >= 0) ? y : -y;
		
		System.out.println(absX + ", " + absY);
	}
}