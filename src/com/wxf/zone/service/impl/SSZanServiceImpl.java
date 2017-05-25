package com.wxf.zone.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxf.zone.dao.SSZanDao;
import com.wxf.zone.entity.QQResult;
import com.wxf.zone.entity.SSZan;
import com.wxf.zone.service.SSZanService;
import com.wxf.zone.util.QQZoneException;

@Service
public class SSZanServiceImpl  implements SSZanService,Serializable{
	@Autowired
	private SSZanDao dao;

	public QQResult createZan(SSZan zan) {
		// TODO Auto-generated method stub
		QQResult result=new QQResult();
	     try{
	    	 String qq_ss_id=zan.getQq_ss_id();
	    	// System.out.println("service说说Id:"+qq_ss_id+":"+zan.getQq_user_id());
	    	 dao.insertZan(zan);
	    	
	    	
	    	List<SSZan>list= dao.findAllZan(qq_ss_id);
	    	//System.out.println(list.size());
	    	if(list!=null&&list.size()>0){
	    		result.setStatus(0);
	    		result.setMsg("赞成功");
	    		result.setData(list);
	    	}
	     }catch(Exception e){
	    	 result.setStatus(1);
	    	 result.setMsg("赞失败可能是对方设置了权限");
	    	 throw new QQZoneException(e.getMessage());
	     }
		return result;
	}

	public QQResult loadAllZan(SSZan zan) {
		// TODO Auto-generated method stub
		
		QQResult result=new QQResult();
		 String qq_ss_id=zan.getQq_ss_id();
		
         try{
    	List<SSZan>list= dao.findAllZan(qq_ss_id);
    	//System.out.println(list.size());
    	if(list!=null&&list.size()>=0){
    		result.setStatus(0);
    		result.setMsg("赞成功");
    		result.setData(list);
    	}
         }
    	catch(Exception e){
    		 result.setStatus(1);
	    	 result.setMsg(" 加载赞失败可能是网络原因请重新加载");
	    	 throw new QQZoneException(e.getMessage());
    	}
		return result;
	}
	

}
