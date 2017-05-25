package com.wxf.zone.test.dao;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wxf.zone.dao.SSDao;
import com.wxf.zone.entity.SS;
import com.wxf.zone.util.QQZoneUtil;

public class SSDaotest {

	AbstractApplicationContext ctx=null;
    @Before 
    public void init(){
    	String conf="applicationContext.xml";
    	ctx=new ClassPathXmlApplicationContext(conf);
    	
    }
    @Test//测试插入说说
    public void test1(){
    	 SSDao dao=ctx.getBean(SSDao.class);
    	 SS ss=new SS();
    	 ss.setQq_ss_id(QQZoneUtil.createId());
    	 ss.setQq_user_id("c2f44dc3f3a2451aac6f4036b80ea25c");
    	 ss.setQq_ss_status_id(1);
    	 
    	 ss.setQq_ss_create_time(System.currentTimeMillis());
    	 ss.setQq_ss_body("王小帅12第二条测试创建说说的说说");
    	 dao.insert(ss);
    	
    }
    @Test//测试加载说说
    public void test4(){
    	 SSDao dao=ctx.getBean(SSDao.class);
    	 List<SS> list=dao.findAllMySS("c2f44dc3f3a2451aac6f4036b80ea25c");
    	 if(list.size()!=0&&list!=null){
    		 for(int i=0;i<list.size();i++){
    			 SS ss=list.get(i);
    			 Date time=new Date(ss.getQq_ss_create_time());
    			 SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    			 
    			 System.out.println(ss.getQq_user_name()+sdf.format(time)+ss.getQq_ss_body());
    			 
    		 }
    	 }
    }
    @Test//测试更改说说状态 将说说放入回收站
    public void test5(){
    	SSDao dao=ctx.getBean(SSDao.class);
    	String qq_ss_id="736bd7077e464ec0a06042f475b3141f";
    	int n=dao.update_ss_status(qq_ss_id);
    	System.out.println(n);
    	
    }
    
    @Test
    public void test6(){
    	String str="";
     str= " <li class='comments-item bor3'>"+
 	"<div class='comments-item-bd'>"+
	"<div class='comments-content'>"+
		"&nbsp;"+
		"<a class='c_tx q_namecard' target='_blank' href='http://user.qzone.qq.com/1003933958'>发水 、</a>"+
		"&nbsp; : 牛逼。"+
		"<div class='comments-op'>"+
			"<span class=' ui-mr10 state'> 15:25</span>"+
			"<a class='act-reply'	href='javascript:;' data-charset='utf-8'>"+
			"<b class='hide-clip'>回复</b>"+
			"</a>"+
		"</div>"+
	"</div>"+
"</div>"+
"</li>";
    }
    @Test
    public void test7(){
     String str="";
     str="<div class='comments-list mod-comments-sub'>"+
		"<ul>"+
		"<li"+
			"class='comments-item bor3'	>"+
			"<div class='comments-item-bd'>"+
				"<div class='comments-content'>"+
					"&nbsp;<a class='c_tx q_namecard'    >"+
					"严芳芳</a>&nbsp;回复&nbsp;"+
					"<a class='c_tx q_namecard'   >来生缘</a>&nbsp; : 来条士力架"+
					"<div class='comments-op'>"+
						 "<a class='act-reply' href='javascript:;'>"+
						 "<b class='hide-clip'>回复</b>"+
						"</a>"+
					"</div>"+
				"</div>"+
			"</div>"+
		"</li>"+
	"</ul>"+
"</div>";
    }
    @After
    public void destroy(){
    	
    	ctx.close();
    }

}
