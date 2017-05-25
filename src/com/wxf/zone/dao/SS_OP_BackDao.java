package com.wxf.zone.dao;

import java.util.List;

import com.wxf.zone.entity.SS_OP_Back;

public interface SS_OP_BackDao {
	List<SS_OP_Back>findAllBack(String ss_op_id);
    int save_reply(SS_OP_Back back);
    
}
