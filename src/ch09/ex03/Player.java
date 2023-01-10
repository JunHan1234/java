package ch09.ex03;

public class Player extends Thread {
	private Counter counter; //counter기계를 player들이 경쟁하며 누르는 그림.
	
	public Player(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			counter.increase();
			counter.decrease();
			
			if(i % 10 == 0) counter.print(); //10단위로 줄바꿈.
			
			try {
				Thread.sleep((int)(Math.random() * 2));
			} catch(InterruptedException e) {}
		}
	}
}
