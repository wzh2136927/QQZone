package com.wxf.zone.web;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxf.zone.entity.QQResult;
import com.wxf.zone.entity.SS_OP_Back;
import com.wxf.zone.service.SSOPBackService;
   @Controller
   @RequestMapping("/reply")
public class SSOPBackCreateController implements Serializable{
       @Autowired
       private SSOPBackService service;
       @RequestMapping("/create_reply.do")
       @ResponseBody
       public QQResult execute(SS_OP_Back back){
    	   QQResult result=service.create_reply(back);
    	   return result;
       }
}
