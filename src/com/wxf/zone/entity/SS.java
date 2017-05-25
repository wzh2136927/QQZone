package com.wxf.zone.entity;

import java.io.Serializable;
/**
 * 该类是说说实体类
 * @author ASUS
 *
 */
public class SS implements Serializable{
	private String qq_ss_id;    //说说id
	private String qq_user_id;     //属于哪个用户
	private String  qq_ss_body; //说说内容
	private Integer  qq_ss_status_id  ; //说说状态是否已经被删除 1:没有2:删除不可见
	private Long qq_ss_create_time;//说说创建时间
	private String qq_user_name;
	 
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
	public String getQq_ss_body() {
		return qq_ss_body;
	}
	public void setQq_ss_body(String qq_ss_body) {
		this.qq_ss_body = qq_ss_body;
	}
	public Integer getQq_ss_status_id() {
		return qq_ss_status_id;
	}
	public void setQq_ss_status_id(Integer qq_ss_status_id) {
		this.qq_ss_status_id = qq_ss_status_id;
	}
	public Long getQq_ss_create_time() {
		return qq_ss_create_time;
	}
	public void setQq_ss_create_time(Long qq_ss_create_time) {
		this.qq_ss_create_time = qq_ss_create_time;
	}
	public String getQq_user_name() {
		return qq_user_name;
	}
	public void setQq_user_name(String qq_user_name) {
		this.qq_user_name = qq_user_name;
	}
	
}
