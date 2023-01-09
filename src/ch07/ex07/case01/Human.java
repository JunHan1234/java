package ch07.ex07.case01;

@FunctionalInterface
public interface Human { //type 하나에 method 하나.
	void say();
	//void tell(); //@FunctionalInterface에서는 method를 하나만 선언가능.
}
