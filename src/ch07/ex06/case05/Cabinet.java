package ch07.ex06.case05;

public class Cabinet<T extends A>/* A를 상속받은 generic type이므로 곧 A이하의 A 상속 type지칭 */ {
	public T getLastVal(T[] arr) { //A 이하인 녀석들만 사용가능 method.
		return arr[arr.length - 1];
	}
	
	public <S extends C> S getFinalVal(S[] arr) { //C 이하. (C, B 해당)
		return arr[arr.length - 1]; //C 이하인 것만 사용가능한 method.
	}
}
