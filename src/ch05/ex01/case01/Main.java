package ch05.ex01.case01;

public class Main {
	public static void main(String[] args) {
		int hour = 12;
		int minute = 35;
		int second = 30;
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
		
		Time time = new Time();		// local variable
		time.hour = 12;
		time.minute = 35;
		time.second = 30;
		System.out.printf("%d시 %d분 %d초\n", time.hour, time.minute, time.second);
		
		Time time2 = new Time();
		time2.hour = 10;
		time2.minute = 30;
		time2.second = 27;
		System.out.printf("%d시 %d분 %d초\n", time2.hour, time2.minute, time2.second);
		
		System.out.println(time); // hashCode 객체주소 return -> 682a0b20 (16진수)
		System.out.println(time2.toString()); // hashCode 객체주소 -> 3d075dc0 // .toString()은 생략할수있는 부분이다.
	} // 여기서 main method body가 끝나면서 stack area의 time2 변수 -> time 변수 순으로 끝이난다.
	  // method가 끝난 후 heap area의 mark된 garbage는 garbage collector thread(청소부)가 주기적으로 작동하며 청소를 한다.
}
