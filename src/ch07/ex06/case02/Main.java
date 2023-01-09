package ch07.ex06.case02;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Animal> zoo = new ArrayList<>();
		//zoo.add(new Tiger()); = zoo.add(Cosmos.getAnimal("호랑이"));
		//zoo.add(new Falcon()); = zoo.add(Cosmos.getAnimal("매"));
		
		//zoo.clear(); //List 초기화 method
		
		zoo.add(Cosmos.getAnimal("호랑이"));//Cosmos.getAnimal("호랑이") = new Tiger()
		zoo.add(Cosmos.getAnimal("매"));	//Cosmos.getAnimal("매") = new Falcon()
		
		for(Animal animal: zoo) {
			if(animal instanceof Tiger tiger) System.out.println("호랑이");
			else if(animal instanceof Falcon falcon) System.out.println("매");
			animal.eat();
			animal.move();
		}
	}
}
