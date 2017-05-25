package com.wxf.zone.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxf.zone.entity.QQResult;
import com.wxf.zone.service.SSOPBackService;

@Controller
@RequestMapping("/opback")
public class SSOPBackLoadController {
            @Autowired
            private SSOPBackService service;
            @RequestMapping("/loadopback.do")
            @ResponseBody
            public QQResult execute(String ss_op_id){
            	QQResult result=service.loadopback(ss_op_id);
            	return result;
            }
}
