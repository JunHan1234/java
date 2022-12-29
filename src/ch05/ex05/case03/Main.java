package ch05.ex05.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Paper paper = new Paper(); // main method의 paper와 add method의 paper는 서로 다른 variable이다.
		
		int result = calculator.add(1, 2); //주어: calculator 서술어: add -> calculator가 add 한다.
		System.out.println(result);
		
		paper.setA(1);
		paper.setB(2);
		paper = calculator.add(paper); //calculator(주어)가 paper(목적어)를 add(서술어)한다.
		System.out.println(paper.getResult());
	}
}
