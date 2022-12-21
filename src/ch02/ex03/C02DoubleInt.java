package ch02.ex03;

public class C02DoubleInt {
	public static void main(String[] args) {
		double d = 1.92;
		int i = (int)d;
		System.out.println(i); // d 변수의 값이 i 변수로 overflow 했다.
		
		double f = Math.floor(d); //소숫점 이하 내림처리
		double r = Math.round(d); //소숫점 이하 올림처리
		System.out.printf("%.2f, %.2f\n", f, r);
		
		// 과제: = 오른편을 채워라.
		int f2 = (int)f;
		int r2 = (int)r;
		System.out.printf("%d, %d\n", f2, r2);
	}
}
