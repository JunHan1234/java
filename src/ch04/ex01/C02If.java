package ch04.ex01;

public class C02If {
	public static void main(String[] args) {
		int visitCnt = 0;
		
		if(visitCnt < 1) {
			System.out.println("첫방문입니다.");
			visitCnt++;
		} else {
			System.out.println("재방문입니다.");
		}
		
		//실행문이 하나이므로 축약할 수 있다.
		if(visitCnt < 1) System.out.println("첫방문입니다.");
		else System.out.println("재방문입니다.");
	}
}