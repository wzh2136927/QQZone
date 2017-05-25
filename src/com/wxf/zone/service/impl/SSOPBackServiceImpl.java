package com.wxf.zone.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxf.zone.dao.SS_OP_BackDao;
import com.wxf.zone.entity.QQResult;
import com.wxf.zone.entity.SS_OP_Back;
import com.wxf.zone.service.SSOPBackService;
import com.wxf.zone.util.QQZoneException;
@Service
public class SSOPBackServiceImpl implements SSOPBackService,Serializable{
     @Autowired
     private SS_OP_BackDao dao;

	public QQResult loadopback(String ss_op_id) {
		// TODO Auto-generated method stub
		QQResult result=new QQResult();
		List<SS_OP_Back>list=dao.findAllBack(ss_op_id);
		if(list==null){
			result.setStatus(1);
			result.setMsg("加载回复出错");
			return result;
		}
		result.setStatus(0);
		result.setMsg("加载回复成功");
		result.setData(list);
		return result;
	}

	public QQResult create_reply(SS_OP_Back back) {
		// TODO Auto-generated method stub
		QQResult result=new QQResult();
		try{
			dao.save_reply(back);
			result.setStatus(0);
			result.setMsg("创建回复成功");
			result.setData(back);
		}catch(Exception e){
			result.setStatus(1);
			result.setMsg("创建回复出错可能是网络原因");
			throw new QQZoneException(e.getMessage());
		}
		return result;
	}
     
}
