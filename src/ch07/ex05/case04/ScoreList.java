package ch07.ex05.case04;

import java.util.ArrayList;
import java.util.List;

public class ScoreList {
	public static void main(String[] args) {
		List<Integer> score1 = new ArrayList<>(); //row 1
		List<Integer> score2 = new ArrayList<>(); //row 2
		List<List<Integer>> scores = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			score1.add(80 + i);
			score2.add(90 + i);
		}
		System.out.printf("%s\n%s\n", score1, score2);
		
		scores.add(score1);
		scores.add(score2);
		System.out.println(scores); //2개의 row가 들어있는 table
	}
}
