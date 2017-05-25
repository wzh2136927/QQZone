package com.wxf.zone.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxf.zone.entity.QQResult;
import com.wxf.zone.entity.User;
import com.wxf.zone.service.UserRegisteService;
import com.wxf.zone.util.QQZoneException;
import com.wxf.zone.util.QQZoneUtil;

 @Controller
 @RequestMapping("/user")
public class UserRegisteController {
 @Autowired
	private UserRegisteService service;
  @RequestMapping("/registe.do")
  @ResponseBody
  public QQResult execute(String qq_user_name,String qq_user_password){
	 //System.out.println("注册开始执行");
	  User user=new User();
	  user.setQq_user_name(qq_user_name);
	  user.setQq_user_password(qq_user_password);
	  user.setQq_user_id(QQZoneUtil.createId());
	  user.setQq_user_number(QQZoneUtil.createNumber());
	  try{
	  QQResult result= service.registe(user);
	  System.out.println(result.getMsg()+":"+result.getStatus());
	  return result;
	  }catch(Exception e){
		  
		  throw new QQZoneException("注冊失敗");
	  }
	  
	  
  }
}
