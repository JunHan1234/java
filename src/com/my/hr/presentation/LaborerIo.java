package com.my.hr.presentation;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.domain.Laborer;
import com.my.hr.service.LaborerService;

public class LaborerIo {
	private LaborerService laborerService;
	
	public LaborerIo(LaborerService laborerService) {
		this.laborerService = laborerService;
	}
	
	private void menu() {
		System.out.println("노동자ID / 노동자명 / 입사일");
		
		List<Laborer> laborers = laborerService.getLaborers();
		for(Laborer laborer: laborers)
			Console.info(laborer);
	}
	
	public void play() {
		int laborerId = 0;
		String laborerName = "";
		LocalDate hiredDate = null;
		
		this.menu();
		
		laborerId = Console.inNumId();
		laborerName = Console.inStr("노동자명을 입력하세요");
		hiredDate = Console.inHiredDate("입사일을 입력하세요");
		
		laborerService.addLaborer(new Laborer(laborerId, laborerName, hiredDate));
		Console.info(laborerService.getLaborers() + "을 추가했습니다.");
		
		laborerName = Console.inStr("수정할 노동자명을 입력하세요");
		laborerService.fixLaborer(laborerName, hiredDate);
		Console.info(laborerService.getLaborers() + "을 수정했습니다.");
		
		laborerService.delLaborer();
		Console.info("노동자를 삭제했습니다.");
		
		this.menu();
	}
}
