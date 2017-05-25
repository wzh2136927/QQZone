package com.wxf.zone.dao;

import java.util.List;

import com.wxf.zone.entity.SS;

public interface SSDao {
	void insert(SS ss);
	List<SS> findAllMySS(String id);
	int update_ss_status(String qq_ss_id);
}
