package ch06.ex02.case02;

public class Friend {
	public void play() {
		Parent parent = new Parent();
		
		// parent.getRegNum(); //private
		parent.getParentName(); //public
		parent.getMoney(); //protected
		parent.addMoney(1000); //default
	}
}
