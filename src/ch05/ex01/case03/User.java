package ch05.ex01.case03;

public class User {
	private String userName; // encapsulation -> userName 이라는 객체로 객체데이터를 캡슐화한다.
	private int age;
	// alt + shift + s -> Generate Getters and Setters 클릭 후(혹은 r) 자동생성한다.
	public String getUserName() { // getter
		return userName;
	}
	
	public void setUserName(/*User this*/String userName) { // setter
		this.userName = userName;
	}
	
	public int getAge(/*User this*/) { // public은 외부에서도 보이는 일종의 문(domain)이다.
		return /*this. 생략*/age;
	}
	
	public void setAge(int age) {
		this.age = age;
	} // accessor(접근 제어자)
}
/* void -> return값이 없다 를 표현한다.*/
/* set~ -> ~를 쓰다(write) 를 관용적으로 표현한다.*/
/* method {} 내부는 투명(transparent)하다.*/
/* this -> 객체 지칭을 한다. 여기서는 User type의 객체*/
/* get~ -> ~를 읽다(read) 를 관용적으로 표현한다.*/