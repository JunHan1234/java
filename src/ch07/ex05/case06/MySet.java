package ch07.ex05.case06;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		System.out.println(set); //set의 특징: 중복된 값이 없다. 
		//-> set에는 key가 없기 때문이다. value만으로 구별하기 때문에 중복값이 존재할 수 없다.
	}
}
