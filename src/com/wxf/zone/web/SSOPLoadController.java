package com.wxf.zone.web;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxf.zone.entity.QQResult;
import com.wxf.zone.service.SSOPService;

@Controller
@RequestMapping("/ssop")
public class SSOPLoadController implements Serializable {
    @Autowired
    private SSOPService service;
    @RequestMapping("/loadssop.do")
    @ResponseBody
    public QQResult execute(String ssid,String opbody){
    	QQResult result=service.loadAllSSOP(ssid );
    	return result;
    	
    }
}
