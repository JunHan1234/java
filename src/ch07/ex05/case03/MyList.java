package ch07.ex05.case03;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); //좌변의 다이아<>값이 할당되었다면 우변의 값을 적지 않아도 자동으로 입력된다.
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		
		System.out.println(list);
		
		for(int i: list) System.out.print(i + " "); //iterating
		System.out.println();
		
		System.out.println(list.get(0));
		
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		list.remove(1); //delete -> list의 key들이 하나씩 당겨진다.
		System.out.println(list);
		
		// 과제: list 의 모든 원소를 삭제하라.
		/* 
		// 1. API를 이용한 간단한 방법
		list.removeAll(list); //주어 list에서 목적어 list값을 똑같이 없애는 알고리즘이다.
		System.out.println(list);
		*/
		/*
		// 2. list 뒷열부터 삭제하는 방법
		 list = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
		 for(int i = list.size() - 1; i >= 0; i--)
		 	 list.remove(i);
		 System.out.println(list);
		*/
		// 3. list 앞열부터 삭제하는 방법
		do {
			list.remove(0);
		} while(list.size() != 0);
		
		System.out.println(list);
	}
}
