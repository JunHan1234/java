package com.my.hr.domain;

import java.time.LocalDate;

public class Laborer {
	private int laborerId;
	private String laborerName;
	private LocalDate hiredDate;
	
	public Laborer(int laborerId, String laborerName, LocalDate hiredDate) {
		this.laborerId = laborerId;
		this.laborerName = laborerName;
		this.hiredDate = hiredDate;
	}

	public int getLaborerId() {
		return laborerId;
	}

	public String getLaborerName() {
		return laborerName;
	}

	public LocalDate getHiredDate() {
		return hiredDate;
	}

	public void setLaborerId(int laborerId) {
		this.laborerId = laborerId;
	}

	public void setLaborerName(String laborerName) {
		this.laborerName = laborerName;
	}

	public void setHiredDate(LocalDate hiredDate) {
		this.hiredDate = hiredDate;
	}
	
	@Override
	public String toString() {
		return String.format("%d %10s %10s",
				this.laborerId, this.laborerName, this.hiredDate);
	}
}
