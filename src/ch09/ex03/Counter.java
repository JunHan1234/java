package ch09.ex03;

public class Counter {
	private int val;
	
	public synchronized void increase() { //counter기계에 lock 걸기: synchronized
		val++;
	}
	
	public synchronized void decrease() { //lock을 걸어서 player들이 버튼 하나를 여러번 누르는걸 방지.
		val--;
	}
	
	public synchronized void print() {
		System.out.print(val + " ");
	}
}
