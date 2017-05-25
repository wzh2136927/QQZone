package com.wxf.zone.test.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wxf.zone.entity.User;
import com.wxf.zone.service.UserRegisteService;
import com.wxf.zone.util.QQZoneUtil;

public class UserRegisteServicetest {

	AbstractApplicationContext ctx=null;
    @Before 
    public void init(){
    	String conf="applicationContext.xml";
    	ctx=new ClassPathXmlApplicationContext(conf);
    	
    }
    @Test//测试注册用户
    public void test1(){
    	UserRegisteService service=ctx.getBean(UserRegisteService.class);
    	User user=new User();
    	user.setQq_user_name("王小帅1");
    	user.setQq_user_id(QQZoneUtil.createId());
    	user.setQq_user_password("111111");
    	user.setQq_user_number(QQZoneUtil.createNumber());
    	service.registe(user);
    	
    	
    }
    @After
    public void destroy(){
    	ctx.close();
    	
    }

}
