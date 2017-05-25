package com.wxf.zone.test.dao;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wxf.zone.dao.SSZanDao;
import com.wxf.zone.entity.SSZan;

public class SSZanDaotest {
	AbstractApplicationContext ctx=null;
    @Before 
    public void init(){
    	String conf="applicationContext.xml";
    	ctx=new ClassPathXmlApplicationContext(conf);
    	
    }
    
    @Test//测试创建赞
    public void test1(){
    	SSZanDao dao=ctx.getBean(SSZanDao.class);
    	SSZan zan=new SSZan();
    	zan.setQq_user_id("c2f44dc3f3a2451aac6f4036b80ea25c");
    	zan.setQq_ss_id("fde9d1d27eb944ddb0312d8e0b6d0e05");
    	dao.insertZan(zan);
    	
    }
    @Test//测试查询赞
    public void test2(){
    	SSZanDao dao=ctx.getBean(SSZanDao.class);
    	SSZan zan=new SSZan();
    	 
    	 
    	List<SSZan>list=dao.findAllZan("fde9d1d27eb944ddb0312d8e0b6d0e05");
    	if(list.size()>0&&list!=null){
    		 for(SSZan zan1:list){
    			 System.out.println(zan1.getQq_user_id()+":"+zan1.getQq_ss_id());
    		 }
    	}else if(list.size()==0){
    		System.out.println("这条说说还没有赞");
    	}
    	
    }
    
    @After
    public void destroy(){
    	
    	ctx.close();
    }

}
