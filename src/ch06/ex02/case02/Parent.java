package ch06.ex02.case02;

public class Parent {
	private String regNum;
	private String parentName;
	private int money;

	private String getRegNum() {
		return regNum;
	}

	public String getParentName() {
		return parentName;
	}

	protected int getMoney() {
		return money;
	}
	
	void addMoney(int money) { // default -> 같은 package 내에서만 addMoney 가능.
		this.money += money; //누가 돈을 주면 재산이 늘어남을 표현했다.
	}
}
