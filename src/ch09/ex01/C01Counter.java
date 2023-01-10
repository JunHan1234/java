package ch09.ex01;

public class C01Counter {
	public static void main(String[] args) {
		System.out.println("main start."); //main thread의 시작.
		
		Thread thread1 = new Thread(() -> { //새로운 thread 생성.
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		});
		
		Thread thread2 = new Thread(() -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		});
		
		thread1.start(); //thread1 작동 시작.
		thread2.start(); //thread2 작동 시작.
		//시간을 쪼개가며 thread1, 2가 병렬처리 되는것을 시각적으로 console에서 확인할 수 있다.
		
		System.out.println("main end."); //main thread의 끝.
	}
}
