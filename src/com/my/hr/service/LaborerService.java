package com.my.hr.service;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.domain.Laborer;

public interface LaborerService {
	public List<Laborer> getLaborerList();
	public Laborer getLaborer();
	public void addLaborer(Laborer laborer);
	public void fixLaborer(String laborerName, LocalDate hiredDate);
	public void delLaborer();
}
