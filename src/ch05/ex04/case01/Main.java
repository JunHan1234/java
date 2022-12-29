package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		System.out.printf("%d, %d\n", Card.width, Card.height);
		
		Card.width = 10;
		Card.height = 20;
		
		// Card.kind; //compile error -> 존재하지 않는 객체(instance)변수이므로 사용불가능하다. (객체를 먼저 생성해야한다.)
		// Card.number;
		
		Card card1 = new Card(); // instance variable "card1"을 생성한다.
		Card card2 = new Card();
		
		card1.kind = "heart";
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;

		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, card1.width, card1.height);
		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, Card.width, Card.height);
		// 제대로 된 코드는 아래쪽이다. 유지보수하는자가 Card class의 width, height값을 instance variable card1의 width, height로 착각할 수 있기 때문이다.
		
		System.out.printf("%s %d %d %d\n", card2.kind, card2.number, card2.width, card2.height);
	}
}