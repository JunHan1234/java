package ch08.ex04.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "gambit";
		
		try {
			if(userId.length() > 3)
				throw new LengthException("문자 길이가 초과되었습니다.");
		} catch(LengthException e) {
			e.printStackTrace(); //console 통한 message 선언부
		}
		
		throw new NumberException("숫자가 아닙니다.");
		//NumberException class에서 Exception의 자식인 RuntimeException을 직접상속받았기 때문에 try블록을 생략할 수 있다.
	}
}
