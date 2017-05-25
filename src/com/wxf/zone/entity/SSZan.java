package com.wxf.zone.entity;

import java.io.Serializable;
/**
 * 说说的赞实体类
 * @author ASUS
 *
 */
public class SSZan implements Serializable {
	 private String qq_ss_id;
  private String qq_user_id;
  
  public String getQq_ss_id() {
		return qq_ss_id;
	}
	public void setQq_ss_id(String qq_ss_id) {
		this.qq_ss_id = qq_ss_id;
	}
	  
 
public String getQq_user_id() {
	return qq_user_id;
}
public void setQq_user_id(String qq_user_id) {
	this.qq_user_id = qq_user_id;
}

}
