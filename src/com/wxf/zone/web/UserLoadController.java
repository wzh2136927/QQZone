package com.wxf.zone.web;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxf.zone.entity.QQResult;
import com.wxf.zone.service.UserLoadService;
@Controller
@RequestMapping("/user")
public class UserLoadController implements Serializable{
            @Autowired
            private UserLoadService service;
            @RequestMapping("/getName.do")
            @ResponseBody
            public QQResult execute(String qq_user_id){
            	System.out.println(qq_user_id+":Controller");
            	QQResult result=service.load_user_msg(qq_user_id);
            	System.out.println(result.msg);
                return result;
            }
}
