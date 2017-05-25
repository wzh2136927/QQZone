package com.wxf.zone.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxf.zone.entity.QQResult;
import com.wxf.zone.service.SSService;

@Controller
@RequestMapping("/ss")
public class SSDeleteController {
    @Autowired
    private SSService service;
    @RequestMapping("/del_ss.do")
    @ResponseBody
    public QQResult execute(String ssid){
    	QQResult result=service.deleteSS(ssid);
    	return result;
    }
}
