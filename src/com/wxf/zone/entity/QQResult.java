package com.wxf.zone.entity;

import java.io.Serializable;

public class QQResult  implements Serializable{
	public Object data;
	public String msg;
	public int  status;
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	 
	

}
