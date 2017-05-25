package com.wxf.zone.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxf.zone.dao.SSDao;
import com.wxf.zone.entity.QQResult;
import com.wxf.zone.entity.SS;
import com.wxf.zone.service.SSService;
import com.wxf.zone.util.QQZoneException;
import com.wxf.zone.util.QQZoneUtil;
@Service
public class SSServiceImpl implements SSService,Serializable{
@Autowired
private SSDao dao;
/**
 * 加载所有说说
 * @param userId
 * @return result
 * 
 */
	public QQResult loadSS(String userId) {
		// TODO Auto-generated method stub
		QQResult result=new QQResult();
		if(userId==null||userId==""){
			result.setStatus(1);
			result.setMsg("不能加载说说错误类型1");
			return result;
			
		}
		List<SS>list=dao.findAllMySS(userId.trim());
		 if(list==null ){
			 result.setStatus(2);
			 result.setMsg("查询错误无该用户错误类型2");
			 return result;
		 } 
		 result.setStatus(0);
		 result.setMsg("加载笔记成功 状态类型0");
		 result.setData(list);
		return result;
		 
	}
	/**
	 * 该方法是创建说说的方法
	 *  @param SS
	 *  @return result
	 */
	public QQResult createSS(String userId,String qq_ss_body) {
		// TODO Auto-generated method stub
		QQResult result=new QQResult();
		SS ss=new SS();
		if("".equals(userId)||userId==null){
			result.setStatus(1);
			result.setMsg("对不起无法为该用户创建说说错误类型1");
			return result;
		}
		ss.setQq_ss_body(qq_ss_body);
		ss.setQq_user_id(userId);
		ss.setQq_ss_create_time(System.currentTimeMillis());
		ss.setQq_ss_status_id(1);//1代表可见
		ss.setQq_ss_id(QQZoneUtil.createId());
		dao.insert(ss);
		result.setStatus(0);
		result.setData(ss);
		result.setMsg("创建说说成功");
		
		
		return result;
	}
	public QQResult deleteSS(String ssid) {
		// TODO Auto-generated method stub
		QQResult result=new QQResult();
		try{
		dao.update_ss_status(ssid);
		result.setStatus(0);
		result.setMsg("删除说说成功");
		
		}catch(Exception e){
			result.setStatus(1);
			result.setMsg("删除说说失败");
			throw new QQZoneException(e.getMessage());
		}
		return result;
	}

}
