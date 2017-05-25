package com.wxf.zone.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxf.zone.dao.UserDao;
import com.wxf.zone.entity.QQResult;
import com.wxf.zone.entity.User;
import com.wxf.zone.service.UserLoadService;
@Service
public class UserLoadServiceImpl implements UserLoadService,Serializable{

	  @Autowired
	  private UserDao dao;
	public QQResult load_user_msg(String qq_user_id) {
		System.out.println(qq_user_id+":Service");
		// TODO Auto-generated method stub
		QQResult result=new QQResult();
		User user=dao.findByUserId(qq_user_id);
		if(user!=null){
			result.setStatus(0);
			result.setMsg("加载用户信息成功");
			result.setData(user);
		}else{
			result.setStatus(1);
			result.setMsg("加载用户信息出错可能是网络原因");
		}
		return result;
	}

}
