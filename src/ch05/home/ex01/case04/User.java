package ch05.home.ex01.case04;

import java.time.LocalDate;

public class User {
	private String userName;
	private int age;
	private LocalDate regDate;
	
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}

	public LocalDate getJoinDate() {
		return regDate;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setJoinDate(LocalDate joinDate) {
		this.regDate = joinDate;
	}
}