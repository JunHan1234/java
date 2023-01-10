package ch09.ex02;

public class Counter implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread()/*현재 작동중인 thread를 return*/.getName() + ": start.");
		
		for(char c = 'a'; c <= 'f'; c++) {
			System.out.println(Thread.currentThread().getName() + ": " + c);
			try {
				System.out.println(Thread.currentThread().getName() + ": sleep.");
				Thread.sleep(1000/*시간단위 ms*/);
			} catch(InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + ": interrupted.");
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}
