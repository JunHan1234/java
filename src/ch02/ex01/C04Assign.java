package ch02.ex01;

public class C04Assign {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.printf("%d, %d\n", a, b);
		
		a = b; //오른편 변수 b 의 data값을 read해서 a에 assign 시킨다.
		System.out.printf("%d, %d\n", a, b);
		
		a = b + 1; //할당 연산자 오른편에 expression을 줄 수도 있다.
		System.out.printf("%d, %d\n", a, b);
		
		double d = Math.random();
		System.out.printf("%.2f", d); //소수점 아래 2자리만 보고싶은 경우다.
	}
}