package ch05.ex05.case10;

public class Man {
	public void strip() {}
	public void wash() {}
	public void wear(Pajamas pajamas) {}
	public void lie() {}
	
	public void sleep(Pajamas pajamas) {
		this.strip(); // this = Man type 의 객체를 지칭한다.
		this.wash();
		this.wear(pajamas);
		this.lie();
	}
}
