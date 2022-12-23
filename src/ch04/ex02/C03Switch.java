package ch04.ex02;

public class C03Switch {
	public static void main(String[] args) {
		int day = 2;
		
		String dayName = switch(day) { //할당 연산자 = 와 switch
		case 1 -> "sunday";
		case 2 -> "monday";
		case 3 -> "tuesday";
		case 4 -> "wednesday";
		case 5 -> "thursday";
		case 6 -> "friday";
		case 7 -> "saturday";
		default -> "none";
		}; //할당 연산자와 결합시 ;로 마무리한다.
		
		System.out.println(dayName);
	}
}
