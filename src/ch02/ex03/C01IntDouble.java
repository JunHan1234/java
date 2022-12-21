package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i; // 작은 값의 type은 큰 수의 type으로 "casting = 형변환" 할 수 있다.
		System.out.printf("%f, %d\n", d, i); // i 변수의 값은 read, d 변수의 값은 write한다.
		
		d = (double)i; // i 변수의 값을 read하고, read한 값을 (double)이라는 casting 연산자로 casting하고, return한 값을 d 변수에 write한다.
		System.out.printf("%f, %d\n", d, i);
		
		//i = d;
		i = (int)d;
		System.out.printf("%f, %d\n", d, i);
	}
}
