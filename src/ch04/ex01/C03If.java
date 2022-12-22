package ch04.ex01;

public class C03If {
	public static void main(String[] args) {
		/*
		int hour = 22;
		
		if(hour < 12) {
			System.out.println("Good Morning.");
		} else if(hour < 18) {
			System.out.println("Good Afternoon.");
		} else if(hour < 21) {
			System.out.println("Good Evening.");
		} else {
			System.out.println("Good Night.");
		} //중복코드가 많으므로 나쁜코드다.
		*/
		
		// 과제: code 7 ~ 15 line 을 개선하라.
		//		 .println() 을 한번만 사용하라.
		
		int hour = 11;
		String say = "";
		
		if(hour < 12) say = "Good Morning.";
		else if(hour < 18) say = "Good Afternoon.";
		else if(hour < 21) say = "Good Evening.";
		else say = "Good Night.";
		System.out.println(say);
	}
}