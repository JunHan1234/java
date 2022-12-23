package ch04.ex02;

public class C04Switch {
	public static void main(String[] args) {
		String comment = "ab";
		
		String msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 2 -> "good.";
		default -> "too long";
		};
		System.out.println(msg + '\n');
		
		msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 11 -> {yield "I don't know.";}
		case 2 -> {
			String message = comment + " is good.";
			yield message;
		}
		default -> {yield comment + " is too long.";}
		// 단순 expression이므로, {}블럭없이 comment + "";도 가능하다.
		};
		System.out.println(msg);
		
		// yield: keyword가 아니다. restricted identifier(제한자)이다.
		int yield = 1; //명백한 증거, 제한자 yield는 변수선언 가능하다.
		System.out.println(yield);
		//int switch = 1; //switch는 keyword이므로 변수선언 불가하다.
	}
}
