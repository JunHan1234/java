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
	
	public void frontMenu() {
		System.out.println("ID / NAME / HIRED_DATE");
		List<Laborer> laborers = laborerService.getLaborerList();
		try {
			for(Laborer laborer: laborers) Console.info(laborer);
		} catch(Exception e) {
			System.out.println("노동자가 없습니다.");
		}
	}
	
	private void menu() {
		int laborerId = 0;
		String laborerName = "";
		LocalDate hiredDate = null;
		
		this.frontMenu();
		
		int inMenuNum = Console.inMenuNum();
		
		do {
			switch(inMenuNum) {
				case 1 -> {
					List<Laborer> laborers = laborerService.getLaborerList();
					try {
						System.out.println("ID / NAME / HIRED_DATE");
						for(Laborer laborer: laborers) Console.info(laborer);
					} catch(Exception e) {
						System.out.println("노동자가 없습니다.");
					} finally {
						inMenuNum = Console.inMenuNum();
					}
				}
				
				case 2 -> {
					laborerId = Console.inNumId();
					laborerName = Console.inStr("노동자명을 입력하세요");
					hiredDate = Console.inHiredDate("입사일을 입력하세요");
					
					laborerService.addLaborer(new Laborer(laborerId, laborerName, hiredDate));
					Console.info(laborerService.getLaborerList() + "을 추가했습니다.");
					
					inMenuNum = Console.inMenuNum();
				}
				
				case 3 -> {
					laborerName = Console.inStr("수정할 노동자명을 입력하세요");
					hiredDate = Console.inHiredDate("수정할 노동자의 입사일을 입력하세요");
					laborerService.fixLaborer(laborerName, hiredDate);
					Console.info(laborerService.getLaborerList() + "을 수정했습니다.");
				}
				
				case 4 -> {
					laborerService.delLaborer();
					Console.info("노동자를 삭제했습니다.");
				}
				
				case 0 -> {
					break;
				}
			}
		} while(inMenuNum != 0);
		Console.info("앱을 종료합니다.");
	}
	
	public void play() {
		this.menu();
	}
}
