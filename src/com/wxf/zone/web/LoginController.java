package com.wxf.zone.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxf.zone.entity.QQResult;
import com.wxf.zone.service.UserLoginService;

 @Controller
 @RequestMapping("/user")
public class LoginController {
 @Autowired
 private UserLoginService service;
 @RequestMapping("/login.do")
 @ResponseBody
 public QQResult execute(HttpServletRequest request){
	 //System.out.println(111);
	 String author=request.getHeader("Authorization");
	 System.out.println(author);
	 QQResult result=service.checkNumber(author);
	// System.out.println(number);
	 return result;
	 
 }
}
