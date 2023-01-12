package com.my.hr.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.my.hr.domain.Laborer;

public class LaborerDaoImpl implements LaborerDao {
	private List<Laborer> laborers;
	private Laborer laborer;
	
	public LaborerDaoImpl(List<Laborer> laborers) {
		this.laborers = new ArrayList<>(laborers);
	}

	@Override
	public List<Laborer> selectLaborers() {
		return this.laborers;
	}

	@Override
	public void insertLaborer(Laborer laborer) {
		this.laborer = laborer;
	}

	@Override
	public void updateLaborer(String laborerName, LocalDate hiredDate) {
		this.laborer.setLaborerName(laborerName);
		this.laborer.setHiredDate(hiredDate);
	}

	@Override
	public void deleteLaborer() {
		this.laborer = null;
	}
}
