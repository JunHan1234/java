package ch07.ex05.case05;

public class Main3 {
	public static void main(String[] args) {
		Floor floor1 = new Floor();//1층 준비.
		Floor floor2 = new Floor();//2층 준비.
		House house = new House(); //n층 고양이집 준비.
		
		for(int i = 0; i < 3; i++) {
			floor1.add(new Cat("고양이" + i));
			floor2.add(new Cat("야옹이" + i));
		}
		System.out.printf("%s\n%s\n", floor1, floor2);
		
		house.add(floor1);//1층 고양이집 건설
		house.add(floor2);//2층 고양이집 건설
		System.out.println(house);
		System.out.println();
		
		// 과제: 고양이 여섯마리에게 밥을 먹여라.
		for(Floor floor: house) //house의 floor를 끄집어내어 늘어놓다.
			for(Cat cat: floor) cat.eat();  //floor가 list type이므로 for each 다시 가능.
	}										//floor의 cat들을 끄집어내어 늘어놓다. -> cat들에게 eat()을 시키다.
}
/*
과제:
List<Cat> -> Floor
List<List<Cat>> -> House
로 refactoring 하라.
*/