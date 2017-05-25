package com.wxf.zone.service;

import com.wxf.zone.entity.QQResult;

public interface UserLoginService {
	QQResult checkNumber(String number,String password);
    QQResult  checkNumber(String author);
}
