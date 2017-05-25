package com.wxf.zone.test.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wxf.zone.entity.QQResult;
import com.wxf.zone.service.UserLoadService;

public class UserLoadServicetest {

	AbstractApplicationContext ctx=null;
    @Before 
    public void init(){
    	String conf="applicationContext.xml";
    	ctx=new ClassPathXmlApplicationContext(conf);
    	
    }
    @Test//测试加载用户信息
    public void test1(){
    	UserLoadService service=ctx.getBean(UserLoadService.class);
    	QQResult result=service.load_user_msg("c2f44dc3f3a2451aac6f4036b80ea25c");
    	System.out.println(result.msg);
    	
    }
    
    @After
    public void destroy(){
    	
    	ctx.close();
    }
}
