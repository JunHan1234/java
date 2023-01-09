package ch08.ex02.case03;

public class Main {
	public static void main(String[] args) {
		String name = Way.LEFT.name(); 		//code name이 return
		int ordinal = Way.LEFT.ordinal();	//code value가 return
		System.out.printf("%s %d\n", name, ordinal);
		name = Way.RIGHT.name();
		ordinal = Way.RIGHT.ordinal();
		System.out.printf("%s %d\n", name, ordinal);
		
		Way[] ways = Way.values(); // 0, 1번째 요소들을 ways에 저장.
		for(Way way: ways) System.out.print(way + " ");
		System.out.println();
		
		Way way = Way.valueOf("LEFT");
		System.out.println(way);
	}
}
