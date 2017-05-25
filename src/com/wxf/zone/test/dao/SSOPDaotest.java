package com.wxf.zone.test.dao;

 
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wxf.zone.dao.SSOPDao;
import com.wxf.zone.entity.SS_OP;
import com.wxf.zone.util.QQZoneUtil;

public class SSOPDaotest {

	AbstractApplicationContext ctx=null;
    @Before 
    public void init(){
    	String conf="applicationContext.xml";
    	ctx=new ClassPathXmlApplicationContext(conf);
    	
    }
    
    @Test//测试创建评论
    public void test1(){
    	SSOPDao dao=ctx.getBean(SSOPDao.class);
    	SS_OP op=new SS_OP();
    	op.setQq_ss_id("ffddf65035174c8bb9eb15ed2d42f2c5");
    	op.setQq_user_id("c2f44dc3f3a2451aac6f4036b80ea25c");
    	op.setSs_op_body("hello王小帅的第一条说说评论");
    	op.setSs_op_id(QQZoneUtil.createId());
    	op.setSs_op_create_time(System.currentTimeMillis());
    	int n=dao.saveop(op);
    	System.out.println(n);
    }
    @Test//测试加载某一个说说的所有评论
    public void test2(){
    	SSOPDao dao=ctx.getBean(SSOPDao.class);
        String ssid="ffddf65035174c8bb9eb15ed2d42f2c5";
        List<SS_OP>list=dao.findAllOP(ssid);
        if(list!=null&&list.size()>0){
        	for(int i=0;i<list.size();i++){
        		SS_OP op=list.get(i);
        		Date date=new Date(op.getSs_op_create_time());
        		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        		String time=sdf.format(date);
        		System.out.println(op.getQq_user_name()+":"+time+op.getSs_op_body());
        	}
        }
        
    	
    }
    @Test
    public void test3(){
    	String str="";
    	str="<div class='comments-op'>"+
		"<span class=' ui-mr10 state'> 20:59</span>"+
		"<a class='act-reply' href='javascript:;' data-cmd='qz_reply' data-version='6.2' data-action='http://taotao.qq.com/cgi-bin/emotion_cgi_re_feeds' data-param='t1_source=&amp;t1_uin=935754223&amp;t1_tid=ef79c6373ae7f157df720e00&amp;t2_uin=406036250&amp;t2_tid=2&amp;subdotype=55702&amp;signin=0&amp;sceneid=100' data-charset='utf-8' data-tuin='' data-config='1|1|1|0|1,taotaoact.qzone.qq.com,@InputReply|1,taotaoact.qzone.qq.com,@ClickReply|1,taotaoact.qzone.qq.com,commentPresentClick'>"+
		"<b class='hide-clip'>回复</b>"+
		"</a>"+
	"</div>";
    }
    @After
    public void destroy(){
    	
    	ctx.close();
    }

}
