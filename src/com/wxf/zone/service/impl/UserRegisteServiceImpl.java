package com.wxf.zone.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxf.zone.dao.UserDao;
import com.wxf.zone.entity.QQResult;
import com.wxf.zone.entity.User;
import com.wxf.zone.service.UserRegisteService;
import com.wxf.zone.util.QQZoneUtil;
@Service
public class UserRegisteServiceImpl implements UserRegisteService,Serializable {
@Autowired
private  UserDao dao;

 
public QQResult registe(User user)  {
	// TODO Auto-generated method stub
	// 传递进来用户名昵称密码
	// 设置ID
	// 密码加密
	 
	QQResult result = new QQResult();
	String userId = QQZoneUtil.createId();
	User user1 = dao.findByName(user.getQq_user_name());
	if (user1 != null) {
		result.setStatus(1);
		result.setMsg("用户名已经被占用");
		return result;
	}
	user.setQq_user_id(userId);
	//String md5_pwd = QQZoneUtil.md5(user.getQq_user_password());
	user.setQq_user_password(user.getQq_user_password());
	dao.save(user);
	result.setStatus(0);
	
	result.setMsg("注册成功");
 //System.out.println(10/0);
	return result;
 
}
  
}
