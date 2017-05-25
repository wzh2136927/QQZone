package com.wxf.zone.web;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxf.zone.entity.QQResult;
import com.wxf.zone.service.SSService;
@Controller
@RequestMapping("/ss")
public class SSCreateController implements Serializable {
@Autowired
private SSService service;
@RequestMapping("/create.do")
@ResponseBody
public QQResult execute(String userId,String qq_ss_body){
	QQResult result=service.createSS(userId, qq_ss_body);
	return result;

}
}
