package ch07.ex05.case07;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, User> map = new HashMap<>();//Map<key의 type, value의 type>
		
		map.put(1, new User("최한석"));
		map.put(2, new User("한아름"));
		map.put(3, new User("양승일"));
		System.out.println(map);
		
		User user = map.get(1); //map의 key를 이용해 조회.
		System.out.println(user); //get은 조회를 할 뿐.
		System.out.println(map); //map 안의 data는 그대로.
		
		user = map.remove(1);
		System.out.println(user); //remove는 삭제.
		System.out.println(map);
	}
}
