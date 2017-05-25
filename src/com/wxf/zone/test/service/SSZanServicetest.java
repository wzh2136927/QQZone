package com.wxf.zone.test.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wxf.zone.entity.SSZan;
import com.wxf.zone.service.SSZanService;

public class SSZanServicetest {
	AbstractApplicationContext ctx=null;
    @Before 
    public void init(){
    	String conf="applicationContext.xml";
    	ctx=new ClassPathXmlApplicationContext(conf);
    	
    }
    @Test//测试创建赞
    public void test1(){
    	SSZanService service=ctx.getBean(SSZanService.class);
    	SSZan zan=new SSZan();
    	zan.setQq_user_id("c2f44dc3f3a2451aac6f4036b80ea25c");
    	zan.setQq_ss_id("c2f44dc3f3a2451aac6f4036b80ea25c");
    	service.createZan(zan);
    	
    	
    }

    
    
    @After
    public void destroy(){
    	
    	ctx.close();
    }
}
