package ch07.ex06.case06;

import java.util.List;

public class Pocket {
	{
		int i = 1 + 2;
		double d = 1.0 + 2.0;
		//new Number(1) + new Number(2);
	}
	
	// unbounded wildcard -> ?
	public void printList(List<?> list) { //사용할때 조차도 generic type을 정하지 않겠다하면, wildcard 사용한다.
		System.out.println(list);
	}
	
	public double add(List<? extends Number> list) { //Number 이하 ?타입
		double sum = 0;
		for(Number n: list) sum += n.doubleValue(); //list Number 이하.
		
		return sum;
	}
}
