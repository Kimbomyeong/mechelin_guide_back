package data.dao;

import java.util.HashMap;

import data.dto.ReportDto;

public interface ReportDaoInter {
	public void insertReport(ReportDto dto);
	public Integer selectIsReport(HashMap<String, Integer> map);
}
