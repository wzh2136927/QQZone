package com.wxf.zone.entity;

import java.io.Serializable;

public class User implements Serializable{
	private String qq_user_id;//用户id
	private String qq_user_password;
	private String  qq_user_name;
	private String  qq_user_hp;
	private String  qq_user_number;
	public String getQq_user_id() {
		return qq_user_id;
	}
	public void setQq_user_id(String qq_user_id) {
		this.qq_user_id = qq_user_id;
	}
	public String getQq_user_password() {
		return qq_user_password;
	}
	public void setQq_user_password(String qq_user_password) {
		this.qq_user_password = qq_user_password;
	}
	public String getQq_user_name() {
		return qq_user_name;
	}
	public void setQq_user_name(String qq_user_name) {
		this.qq_user_name = qq_user_name;
	}
	public String getQq_user_hp() {
		return qq_user_hp;
	}
	public void setQq_user_hp(String qq_user_hp) {
		this.qq_user_hp = qq_user_hp;
	}
	public String getQq_user_number() {
		return qq_user_number;
	}
	public void setQq_user_number(String qq_user_number) {
		this.qq_user_number = qq_user_number;
	}
	
	

}
