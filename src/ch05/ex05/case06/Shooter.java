package ch05.ex05.case06;

public class Shooter {
	// 과제: 총잡이가 총을 소지한다. 를 디자인하라.
	private Gun gun; //오른쪽 "gun"을 dependency(의존객체)라 지칭한다.
	// Shooter has a Gun
	
	public void fire() {
		gun.fire();
	}

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
