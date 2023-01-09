package ch08.ex02.case05;

public class User {
	private String userName;
	private Level level;
	
	public User(String userName, Level level) {
		this.userName = userName;
		this.level = level;
	}
	
	public void upgradeLevel() {
		Level nextLevel = level.next();
		if(nextLevel == null)
			throw new IllegalStateException(
					"이미 최고 등급 " + this.level + "입니다.");
		this.level = nextLevel;
	}
	
}
