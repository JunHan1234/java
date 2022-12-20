package ch02.ex01;

public class C05Scope {
	public static void main(String[] args) {
		int i = 0;
		//int i = 0;
		int j = 0;
		{
			//int i = 0;
			int x = 0;
			int y = 0;
		}	// x와 y 변수의 scope은 여기까지 실행되고, terminate 한다.
		int x = 0;
	}	// i와 j 변수의 scope은 여기까지 실행되고, terminate 한다.
		// stack area에 변수들은 접시쌓기와 같이 하나씩 쌓이게(stack)되며,
		// 각 thread 종료 시 제일 위에있는 변수부터 terminate 된다.
}