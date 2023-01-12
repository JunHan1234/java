package com.my.hr.test;

import java.time.LocalDate;

import com.my.hr.domain.Laborer;
import com.my.hr.service.LaborerServiceImpl;

public class LaborerServiceTest {
	public static void main(String[] args) {
		LaborerServiceImpl laborerService = new LaborerServiceImpl();
		
		Laborer laborer1 = new Laborer(1, "hi", LocalDate.of(2002, 01, 01));
		
		System.out.println(laborer1);
	}
}
