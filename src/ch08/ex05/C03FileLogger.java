package ch08.ex05;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class C03FileLogger {
	private Logger logger;
	
	public C03FileLogger() {
		this.logger = Logger.getLogger(this.getClass().getName()); //soft coding
	}
	
	public void log() throws Exception {
		Handler handler = new FileHandler("c:/DEV/ch08.ex05.xml");
		logger.addHandler(handler);
		
		logger.info("로깅을 시작합니다.");
		logger.severe("예외가 발생했습니다.");
		logger.info("로깅을 마칩니다.");
		//위 3개를 handler의 memory에 저장했다.
		
		handler.flush(); //handler의 memory 저장 요소를 모두 xml파일에 쏟아내다.
		handler.close();
	}
	
	public static void main(String[] args) throws Exception { //main이 떠넘긴 Exception은 VM이 받는다.
		new C03FileLogger().log();
	}
}
