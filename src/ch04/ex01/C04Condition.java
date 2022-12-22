package ch04.ex01;

public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		if(0 < a && a < 4) System.out.println("good."); // 범위를 조건문으로 쓸때 변수를 가운데로 모은다.
		
		//과제: b값이 'a'초과 'c'미만 범위에 있으면, good을 말하라.
		char b = 'b';
		if('a' < b && b < 'c') System.out.println("good");
		
		int x = 0;
		int y = 0;
		if((x = 1 + 2) > 0 || (y = 1 - 2) > 0) // 비교연산자 앞부분에서 true값이 나왔으므로, 뒤의 계산은 진행하지 않는다. 따라서 y = 0
			System.out.printf("x: %d, y: %d\n", x, y);
		
		String s = "he";
		/*
		if(s.equals("he") || s.equals("HE") || s.equals("He") || s.equals("hE"))
			System.out.println("he");
		// 과제: 위 조건문의 중복을 제거하라
		 */
		if(s.equalsIgnoreCase("he"))  //API를 적절히 기억해 활용하라.
			System.out.println("he");
		
		s = "";
		if(s.equals("")) System.out.println("값이 없다.");
		
		boolean power = false;
		if(!power) System.out.println("전원을 켜다.");
	}
}