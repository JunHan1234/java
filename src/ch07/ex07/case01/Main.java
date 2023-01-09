package ch07.ex07.case01;

public class Main {
	public static void main(String[] args) {	//lamda 기법
		Human human = () -> System.out.println("hello"); //say method를 human type 변수에 담다.
		human.say();
	}
}
