package com.wxf.zone.service;

import com.wxf.zone.entity.QQResult;

public interface SSService {
	QQResult createSS(String userId,String qq_ss_body);
    QQResult loadSS(String userId);
    QQResult deleteSS(String ssid);
}
