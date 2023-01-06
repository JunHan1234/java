package ch07.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<Cat> floor1 = new ArrayList<>();
		List<Cat> floor2 = new ArrayList<>();
		List<List<Cat>> house = new ArrayList<>(); //2층 고양이집 건설.
		
		for(int i = 0; i < 3; i++) {
			floor1.add(new Cat("고양이" + i));
			floor2.add(new Cat("야옹이" + i));
		}
		System.out.printf("%s\n%s\n", floor1, floor2);
		
		house.add(floor1);
		house.add(floor2);
		System.out.println(house);
		System.out.println();
		
		// 과제: 고양이 여섯마리에게 밥을 먹여라.
		for(List<Cat> floor: house)
			for(Cat cat: floor) cat.eat(); //floor가 list type이므로 for each 다시 가능.
	}
}
