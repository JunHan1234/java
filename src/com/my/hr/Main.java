package com.my.hr;

import java.util.ArrayList;

import com.my.hr.dao.LaborerDao;
import com.my.hr.dao.LaborerDaoImpl;
import com.my.hr.domain.Laborer;
import com.my.hr.presentation.LaborerIo;
import com.my.hr.service.LaborerService;
import com.my.hr.service.LaborerServiceImpl;

public class Main {
	public static void main(String[] args) {
		LaborerDao laborerDao = new LaborerDaoImpl(new ArrayList<Laborer>());
		LaborerService laborerService = new LaborerServiceImpl(laborerDao);
		LaborerIo laborerIo = new LaborerIo(laborerService);
		
		laborerIo.play();
	}
}
