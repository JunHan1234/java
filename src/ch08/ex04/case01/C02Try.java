package ch08.ex04.case01;

public class C02Try {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try { //예외처리를 VM에게 떠넘기지 않고 내가 처리하고 싶을 때 쓸 수 있다.
			int result = arr[10]; //app을 종료시키지 않고 끝까지 살리는게 목적이다.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error.");
		}
		
		System.out.println("end.");
	}
}
