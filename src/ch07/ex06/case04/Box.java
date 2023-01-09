package ch07.ex06.case04;

public class Box {
	public <T> T getLastVal(T[] arr) { //generic method
		return arr[arr.length - 1];
	}
}
