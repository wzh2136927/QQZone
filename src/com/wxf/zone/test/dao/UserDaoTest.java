package com.wxf.zone.test.dao;

 
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wxf.zone.dao.UserDao;
import com.wxf.zone.entity.SS;
import com.wxf.zone.entity.User;
import com.wxf.zone.util.QQZoneUtil;

public class UserDaoTest {
	AbstractApplicationContext ctx=null;
    @Before 
    public void init(){
    	String conf="applicationContext.xml";
    	ctx=new ClassPathXmlApplicationContext(conf);
    	
    }
    
    @Test//测试
    public void test1(){
   // System.out.println(ctx);
     UserDao dao=ctx.getBean(UserDao.class);
       User user=dao.findByNumber("123");
     System.out.println(user);
    	
    }
    @Test
    public void test2(){
    	  UserDao dao=ctx.getBean(UserDao.class);
    	  User user=new User();
    	  user.setQq_user_id(QQZoneUtil.createId());
    	  user.setQq_user_number(QQZoneUtil.createNumber());
    	  user.setQq_user_name("王小帅");
    	  user.setQq_user_password("2136927wxf");
    	   dao.save(user);
    }
     
    @Test//根据 昵称查找用户
    public void test3(){
    	  UserDao dao=ctx.getBean(UserDao.class);
    	  User user=dao.findByName("王小帅");
    	  Assert.assertNotNull(user);
    	  System.out.println(user.getQq_user_password());
    }
   
    @After
    public void destroy(){
    	
    	ctx.close();
    }
	 

}
