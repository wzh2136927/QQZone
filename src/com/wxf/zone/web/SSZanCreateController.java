package com.wxf.zone.web;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxf.zone.entity.QQResult;
import com.wxf.zone.entity.SSZan;
import com.wxf.zone.service.SSZanService;

@Controller
@RequestMapping("/zan")
public class SSZanCreateController implements Serializable {
      @Autowired
      private SSZanService service;
      @RequestMapping("/createandzan.do")
      @ResponseBody
      public QQResult execute(String userId,String ssid){
    	 //  System.out.println("用户ID:"+userId+"/n"+"说说Id:"+ssid);
    	 // System.out.println(userId);
    	  SSZan zan=new SSZan();
    	  zan.setQq_ss_id(ssid);
    	  zan.setQq_user_id(userId);
    	  QQResult result=service.createZan(zan);
    	  return result;
      }
}
