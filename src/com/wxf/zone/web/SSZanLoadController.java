package com.wxf.zone.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxf.zone.entity.QQResult;
import com.wxf.zone.entity.SSZan;
import com.wxf.zone.service.SSZanService;

@Controller
@RequestMapping("/zan")
public class SSZanLoadController {
    @Autowired
    private SSZanService service;
    @RequestMapping("/loadzan.do")
    @ResponseBody
    public QQResult execute(String userId,String ssid){
    	SSZan zan=new SSZan();
    	zan.setQq_user_id(userId);
    	zan.setQq_ss_id(ssid);
    	QQResult result=service.loadAllZan(zan);
    	return result;
    }
}
