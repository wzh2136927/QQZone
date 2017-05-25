package com.wxf.zone.test.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wxf.zone.entity.QQResult;
import com.wxf.zone.service.UserLoginService;

public class UserLoginServicetest {
	AbstractApplicationContext ctx=null;
    @Before 
    public void init(){
    	String conf="applicationContext.xml";
    	ctx=new ClassPathXmlApplicationContext(conf);
    	
    }
    
    @Test
    public void test1(){
    	UserLoginService service=ctx.getBean(UserLoginService.class);
    	QQResult result=service.checkNumber("123");
    	System.out.println(result.msg);
    	
    }
    @After
    public void destroy(){
    	ctx.close();
    	
    }
}
