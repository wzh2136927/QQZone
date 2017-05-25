package com.wxf.zone.dao;

import java.util.List;

import com.wxf.zone.entity.SSZan;

/**
 * 关于qq赞的相关方法
 * @author ASUS
 *
 */
public interface SSZanDao {
	/**
	 * 点赞的时候调用该方法创建一个赞
	 * @param zan
	 */
	void insertZan(SSZan zan);
	/**
	 * 
	 * @param zan
	 * @return
	 */
	List<SSZan>findAllZan(String qq_ss_id);
	
	
}
