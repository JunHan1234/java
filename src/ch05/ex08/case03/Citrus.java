package ch05.ex08.case03;

public class Citrus {
	private String citrusName;
	
	public Citrus() {
		//this.citrusName = "레드향"; // 별로 좋은 코드는 아니다. 11번째 줄과 중복코드이다. 상수냐, 변수냐 차이만 있을뿐이다.
		this("레드향");
	} // 기본생성자는 개발자가 따로 overloading 할 경우 자동생성되지 않는다.
	
	public Citrus(String citrusName) {
		this.citrusName = citrusName;
	}
	
	public void setCitrusName(String citrusName) {
		this.citrusName = citrusName;
	}
	
	public String getCitrusName() {
		return citrusName;
	}
}
