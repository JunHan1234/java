package ch07.ex06.case06;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pocket pocket = new Pocket();
		List<Number> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		
		list1.add(1); list1.add(2);
		list2.add(1); list2.add(2);
		list3.add(1.0); list3.add(2.0);
		list4.add("a"); list4.add("b");
		
		pocket.printList(list1); //wildcard를 사용했으므로 정해진 type이 없다.
		pocket.printList(list2); //따라서 모든 type을 받아들일 수 있다.
		pocket.printList(list3);
		pocket.printList(list4);
		
		System.out.println(pocket.add(list1));
		System.out.println(pocket.add(list2));
		System.out.println(pocket.add(list3));
		//System.out.println(pocket.add(list4)); //scope이 Number 이하이므로 String type 불가능.
	}
}
