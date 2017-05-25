package com.wxf.zone.test.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wxf.zone.entity.QQResult;
import com.wxf.zone.entity.SS;
import com.wxf.zone.service.SSService;

public class SSServicetest {

	AbstractApplicationContext ctx=null;
    @Before 
    public void init(){
    	String conf="applicationContext.xml";
    	ctx=new ClassPathXmlApplicationContext(conf);
    	
    }
    @Test//测试加载说说
    public void test1(){
    	SSService service=ctx.getBean(SSService.class);
    QQResult result=service.loadSS("  c2f44dc3f3a2451aac6f4036b80ea25c");
    	 List<SS>list=(ArrayList<SS>)result.data;
    	for(int i=0;i<list.size();i++){
    		SS ss=list.get(i);
    		System.out.println(ss.getQq_user_name()+"  "+ss.getQq_ss_create_time()
    				+"  "+ss.getQq_ss_body()
    				);
    		
    	}
    }
    @Test//测试创建说说
    public void test2(){
    	SSService service=ctx.getBean(SSService.class);
    	QQResult result=service.createSS("c2f44dc3f3a2451aac6f4036b80ea25c", "王小帅12第三条测试创建说说的说说");
    	System.out.println(result.msg);
    			
    	
    }
    @After
    public void destroy(){
    	
    	ctx.close();
    }
}
