package ch06.ex06.case04;

public interface Appliance { //추상 class
	void on(); //interface 내부의 접근제한자는 모두 public이다.
	void off();//interface는 body{}가 없으므로 간결하다.
	//위 둘다 추상 method다.
}
