package ch05.ex08.case01;

public class Baby {
	private String babyName;
	
	public Baby() {} // compiler가 자동으로 생성하는 "기본 생성자"다.
	
	public Baby(String babyName) { //overloading할 때는 compiler가 기본생성자를 자동생성하지 않으므로 주의한다.
		this.babyName = babyName;
	} // 객체변수 생성 하자마자 멤버변수 값을 write 한다.
	
	public void setBabyName(String babyName) {
		this.babyName = babyName;
	} // 객체변수 생성 후에 멤버변수 값을 write 한다.
}
