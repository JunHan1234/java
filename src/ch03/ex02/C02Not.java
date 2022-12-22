package ch03.ex02;

public class C02Not {
	public static void main(String[] args) {
		boolean power = false;	// flag variable 두 가지 상태만 나타내는 변수를 말한다.
		power = !power; // 논리 부정 연산자 !
		System.out.println(power);
		
		power = !power;
		System.out.println(power);
	}
}
