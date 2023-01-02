package ch05.ex07.case02;

import ch05.home.ex06.case02.Console;

public class Main {
	public static void main(String[] args) {
		Console.info("main() start.");
		
		int a = 0;
		Stack.first();
		
		Console.info("main() stop.");
	} //run 시키면 call된 순서대로 (main->first->second) stack에 쌓이고,
	  //second first main 순으로 stack에서 제거된다.
}
