package com.wxf.zone.service;

import com.wxf.zone.entity.QQResult;
import com.wxf.zone.entity.SS_OP_Back;

public interface SSOPBackService {
	QQResult loadopback(String ss_op_id);
    QQResult create_reply(SS_OP_Back back);
}
