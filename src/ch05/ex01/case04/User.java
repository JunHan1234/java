package ch05.ex01.case04;

public class User {
	private String userName;
	
	public void setUserName(String userName) {
		char familyName = userName.charAt(0);
		
		if(familyName == '최')
			this.userName = userName;
		else this.userName = "누구세요?";
	}	// Setter와 Getter를 통해 integrity(무결성) 을 확보할 수 있다.
	
	public String getUserName() {
		return this.userName;
	}
}