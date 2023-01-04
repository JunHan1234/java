package ch07.ex01.case04;

public class Main {
	public static void main(String[] args) {
		//시청에서 Platanus를 심는다.
		Platanus platanus = new Platanus(); //시청직원의 관점.
		
		Tree tree = new Platanus(); //행인의 관점.
		platanus = (Platanus)tree; //행인이 시청직원에게 무슨 나무냐 묻다.
		
		tree = platanus;
		tree = (Tree)platanus;
	}
}
