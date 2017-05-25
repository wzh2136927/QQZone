package com.wxf.zone.web;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxf.zone.entity.QQResult;
import com.wxf.zone.service.SSService;
@Controller
@RequestMapping("/ss")
/**
 * 处理加载说说的controller
 *  
 * @author ASUS
 * 
 *
 */
public class SSLoadController implements Serializable {
  @Autowired
  private SSService service;
  @RequestMapping("/loadss.do")
  @ResponseBody
  /**
   * 
   * @param userId
   * @return QQResult
   */
  public QQResult execute(String userId){
	  QQResult result=service.loadSS(userId);
	 
	  return result;
	  
  }
}
