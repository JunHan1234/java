package ch06.ex06.case06;

import ch06.ex06.case04.Appliance;
import ch06.ex06.case05.Electronic;

public interface HomeAppliance extends Appliance, Electronic {
	//interface가 interface들을 상속받을 수 있다.
}
