package com.wxf.zone.service;

import com.wxf.zone.entity.QQResult;

public interface SSOPService {
	QQResult loadAllSSOP(String ssid );
	QQResult createSSOp(String ssid,String userId,String ss_op_body);
	

}
