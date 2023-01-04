package ch06.ex06.case03;

import ch06.ex06.case01.Appliance;

public class Fridge extends Appliance {
	@Override
	public void off() {} //Override로 추상 method를 고쳐준다.
						 //-> class Fridge를 일반 class로 설정가능해졌다.
}
