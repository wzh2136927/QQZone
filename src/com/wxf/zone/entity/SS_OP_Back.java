package com.wxf.zone.entity;

import java.io.Serializable;

public class SS_OP_Back implements Serializable{
	private String ss_op_back_id ;  
	 private String qq_user_id;      
	 private String ss_op_back_body; 
	 private Long  ss_op_back_time;  
	 private String  ss_op_id   ;
	 private String current_username;//回复人的name
	 private String reply_name;//回复给reply_name
	public String getSs_op_back_id() {
		return ss_op_back_id;
	}
	public void setSs_op_back_id(String ss_op_back_id) {
		this.ss_op_back_id = ss_op_back_id;
	}
	public String getQq_user_id() {
		return qq_user_id;
	}
	public void setQq_user_id(String qq_user_id) {
		this.qq_user_id = qq_user_id;
	}
	public String getSs_op_back_body() {
		return ss_op_back_body;
	}
	public void setSs_op_back_body(String ss_op_back_body) {
		this.ss_op_back_body = ss_op_back_body;
	}
	public Long getSs_op_back_time() {
		return ss_op_back_time;
	}
	public void setSs_op_back_time(Long ss_op_back_time) {
		this.ss_op_back_time = ss_op_back_time;
	}
	public String getSs_op_id() {
		return ss_op_id;
	}
	public void setSs_op_id(String ss_op_id) {
		this.ss_op_id = ss_op_id;
	}
	public String getCurrent_username() {
		return current_username;
	}
	public void setCurrent_username(String current_username) {
		this.current_username = current_username;
	}
	public String getReply_name() {
		return reply_name;
	}
	public void setReply_name(String reply_name) {
		this.reply_name = reply_name;
	}      
	 
}
