package ch07.home.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Slot slot = new Slot(); //45개의 공이 준비되어있는 슬롯 준비.
		List<Ball> balls = new ArrayList<>(); //공이 들어갈 빈 공간
		
		for(int i = 0; i < 6; i++)
			balls.add(slot.chuck()); //빈 공간에 슬롯에서 6개의 공을 뽑다.
		
		for(Ball ball: balls)
			System.out.print(ball);
	}
}
/*
과제: ch07.ex04.case03.Slot 에서
[] -> List 로, refactoring 하라.
*/