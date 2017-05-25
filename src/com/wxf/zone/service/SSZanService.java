package com.wxf.zone.service;

import com.wxf.zone.entity.QQResult;
import com.wxf.zone.entity.SSZan;

public interface SSZanService {
	QQResult createZan(SSZan zan);
	QQResult loadAllZan(SSZan zan);
	

}
