package ch07.home.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Slot {
	private List<Ball> balls;
	
	public Slot() {
		balls = new ArrayList<>();
		
		for(int i = 1; i <= 45; i++)
			balls.add(new Ball(i));
	}
	
	public Ball chuck() {
		int i = (int)(Math.random() * balls.size()); //0 <= i < 45
		return balls.remove(i); //삭제한 공을 return
	}
}
