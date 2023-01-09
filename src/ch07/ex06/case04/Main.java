package ch07.ex06.case04;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		Integer[] arr1 = {1, 2, 3};
		String[] arr2 = {"a", "b", "c"};
		
		int i = box.getLastVal(arr1);	//generic method의 사용.
		String s = box.getLastVal(arr2);
		
		System.out.printf("%d %s", i, s); //return 값을 출력해봤다.
	}
}
