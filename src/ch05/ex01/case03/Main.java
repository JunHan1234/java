package ch05.ex01.case03;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		//user.userName // private의 효과를 확인하라.
		
		user.setUserName("최한석");
		user.setAge(12);
		
		// user를 덮어쓸 수 있다.
		user.setUserName("한아름");
		user.setAge(43);
		
		System.out.printf("%s, %d\n", user.getUserName(), user.getAge());
	}
}