package com.wxf.zone.dao;

import java.util.List;

import com.wxf.zone.entity.SS_OP;

public interface SSOPDao {
	List<SS_OP>findAllOP(String qq_ss_id);
	int saveop(SS_OP op);
}
