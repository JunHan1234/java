package ch04.ex03;

public class C01While {
	public static void main(String[] args) {
		int weight = 80;
		int jumpCnt = 0;
		
		while(weight > 60) { //몸무게가 60을 초과한다면, 줄넘기를 반복한다.
			jumpCnt++;
			weight--;
		} //weight이 60 미만이 될 때까지 실행문을 반복한다.
		
		System.out.printf("%d번 줄넘기해서, 몸무게 %dkg이 되었습니다.", jumpCnt, weight);
	}
}