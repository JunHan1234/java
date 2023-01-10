package ch07.ex06.case07;

import java.util.ArrayList;

public class Container<E> extends ArrayList<E> { //Container는 각각 여러종류를 담을 수 있다.
	public void contain(E thing) {
		this.add(thing);
	}
}
