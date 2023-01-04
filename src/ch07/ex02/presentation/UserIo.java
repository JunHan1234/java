package ch07.ex02.presentation;

import ch07.ex02.service.UserService;

public class UserIo { //업무명+Io //-> User 업무를 위한 입출력.
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void play() {
		Console.info(userService.getUser());
	}
}
