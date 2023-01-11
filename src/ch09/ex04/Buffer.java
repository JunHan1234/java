package ch09.ex04;

public class Buffer {
	private Integer val;
	
	public synchronized int remove() {
		while(this.val == null) {
			try {
				wait(); //소비자는 값이 없으면 wait한다.
			} catch(InterruptedException e) {}
		}
		
		int val = this.val;
		this.val = null;
		notifyAll(); //불특정 다수의 thread를 깨운다.

		return val;
	}
	
	public synchronized void add(Integer val) {
		while(this.val != null) {
			try {
				wait(); //생산자는 값이 있으면 wait한다.
			} catch(InterruptedException e) {}
		}
			
		this.val = val;
		notifyAll();
	}
}
