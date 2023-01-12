package com.my.hr.service;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.dao.LaborerDao;
import com.my.hr.domain.Laborer;

public class LaborerServiceImpl implements LaborerService {
	private LaborerDao laborerDao;
	
	public LaborerServiceImpl() {}

	public LaborerServiceImpl(LaborerDao laborerDao) {
		this.laborerDao = laborerDao;
	}
	
	@Override
	public List<Laborer> getLaborerList() {
		return laborerDao.selectLaborerList();
	}
	
	@Override
	public Laborer getLaborer() {
		return laborerDao.selectLaborer();
	}

	@Override
	public void addLaborer(Laborer laborer) {
		laborerDao.insertLaborer(laborer);
	}

	@Override
	public void fixLaborer(String laborerName, LocalDate hiredDate) {
		laborerDao.updateLaborer(laborerName, hiredDate);
	}

	@Override
	public void delLaborer() {
		laborerDao.deleteLaborer();
	}
}
