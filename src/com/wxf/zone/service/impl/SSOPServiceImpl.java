package com.wxf.zone.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxf.zone.dao.SSOPDao;
import com.wxf.zone.entity.QQResult;
import com.wxf.zone.entity.SS_OP;
import com.wxf.zone.service.SSOPService;
import com.wxf.zone.util.QQZoneException;
import com.wxf.zone.util.QQZoneUtil;
@Service
public class SSOPServiceImpl implements SSOPService,Serializable{
	  @Autowired
	  private SSOPDao dao;
/**
 * 根据说说id查找这条说说的所有评论
 */
	public QQResult loadAllSSOP(String ssid  ) {
		// TODO Auto-generated method stub
		QQResult result=new QQResult();
		List<SS_OP>list=dao.findAllOP(ssid);
		if(list==null){
			result.setStatus(1);
			result.setMsg("加载评论出错可能是网络原因");
			return result;
		}
		 result.setStatus(0);
		 result.setMsg("加载评论成功");
		 result.setData(list);
		return result;
	}
	/**
	 * 根据说说id和评论内容来发表评论
	 */
public QQResult createSSOp(String ssid,String userId, String ss_op_body) {
	// TODO Auto-generated method stub
	QQResult result=new QQResult();
	SS_OP op=new SS_OP();
	op.setQq_ss_id(ssid);
	op.setSs_op_body(ss_op_body);
	op.setSs_op_create_time(System.currentTimeMillis());
	op.setQq_user_id(userId);
	op.setSs_op_id(QQZoneUtil.createId());
	try{
	dao.saveop(op);
	result.setStatus(0);
	result.setMsg("发表评论成功");
	result.setData(op);
	
	}catch(Exception e){
		result.setStatus(1);
		result.setMsg("发表评论失败可能是网络原因");
		throw new QQZoneException(e.getMessage());
	}
	return result ;
}

}
