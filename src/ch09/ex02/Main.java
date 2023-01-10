package ch09.ex02;

public class Main {
	public static void main(String[] args) throws InterruptedException {//main thread 생성, 실행.
		System.out.println(Thread.currentThread().getName() + ": start");
		
		Thread counter = new Thread(new Counter()); //counter thread 생성.
		counter.start(); //VM에게 counter thread 실행 요청.
		
		int tries = 1;
		while(counter.isAlive()) {
			if(tries <= 2) {
				counter.join(1000);
				System.out.println(Thread.currentThread().getName() + ": wait " + tries++);
			} else {
				System.out.println(Thread.currentThread().getName() + ": irritated.");
				counter.interrupt(); //counter를 깨운다.
				counter.join(); //counter가 깰때까지 무한정 기다린다.
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end");
	}
}
