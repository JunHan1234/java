package com.my.hr.dao;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.domain.Laborer;

public interface LaborerDao {
	public List<Laborer> selectLaborers();
	public void insertLaborer(Laborer laborer);
	public void updateLaborer(String laborerName, LocalDate hiredDate);
	public void deleteLaborer();
} 
