package ch07.ex04.case03;

public class Slot {
	private Ball[] balls;
	
	public Slot() { //Slot has a 45 balls
		balls = new Ball[45];
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = new Ball(i + 1);
	}
	
	public Ball chuck() {
		int i = 0;
		Ball ball = null;
		
		do {
			i = (int)(Math.random() * 45);
			ball = balls[i]; //balls[i] 값을 ball에 백업한다.
			balls[i] = null; //사용이 끝난 balls[i]의 값을 null로 초기화한다.
		} while(ball == null); //ball 값이 null이면 반복한다.
		
		return ball;
	}
}
