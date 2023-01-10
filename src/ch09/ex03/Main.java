package ch09.ex03;

public class Main {
	public static void main(String[] args) { //학습을 위해 이 예제에서는 main thread는 생각하지 말자.
		Counter counter = new Counter();
		new Player(counter).start(); //thread 하나가 시작.
		new Player(counter).start();
		new Player(counter).start(); //thread 여러개 시작하면서 난리가 남.
		// -> counter에 lock을 걸어서 중복으로 누르는 행위를 개선한다.
		// 결국 처리는 cpu가 수행하기 때문에 thread 실행순서는 cpu 마음대로 진행한다.
		// cpu는 이미 n개의 process(한글, 크롬, background, eclipse 등등)을 수행하고 있기때문이다.
	}
}
