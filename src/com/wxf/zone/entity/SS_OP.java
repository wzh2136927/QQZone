package com.wxf.zone.entity;

import java.io.Serializable;
/**
 * 该类是说说评论的实体bean
 * @author ASUS
 *
 */
public class SS_OP implements Serializable {
	private String qq_user_name;
    private String 	ss_op_id    ;      
	private String  qq_user_id ;     
	private String  qq_ss_id   ;         
    private Long ss_op_create_time ;  
	private String ss_op_body ;
	public String getSs_op_id() {
		return ss_op_id;
	}
	public void setSs_op_id(String ss_op_id) {
		this.ss_op_id = ss_op_id;
	}
	public String getQq_user_id() {
		return qq_user_id;
	}
	public void setQq_user_id(String qq_user_id) {
		this.qq_user_id = qq_user_id;
	}
	public String getQq_ss_id() {
		return qq_ss_id;
	}
	public void setQq_ss_id(String qq_ss_id) {
		this.qq_ss_id = qq_ss_id;
	}
	public Long getSs_op_create_time() {
		return ss_op_create_time;
	}
	public void setSs_op_create_time(Long ss_op_create_time) {
		this.ss_op_create_time = ss_op_create_time;
	}
	public String getSs_op_body() {
		return ss_op_body;
	}
	public void setSs_op_body(String ss_op_body) {
		this.ss_op_body = ss_op_body;
	}
	public String getQq_user_name() {
		return qq_user_name;
	}
	public void setQq_user_name(String qq_user_name) {
		this.qq_user_name = qq_user_name;
	}   
	
}
