package com.wxf.zone.util;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;

public class QQZoneUtil implements Serializable{
	 
	public static String md5(String msg)  {
		try{
		MessageDigest md=MessageDigest.getInstance("MD5");
		  byte[]input=msg.getBytes();
		byte[]output=md.digest(input);
		 
       String base64_msg= Base64.encodeBase64String(output); 
       return base64_msg;
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
	public static String createToken(){
		return createId();
	}
	public static String createId(){		
		UUID uid=UUID.randomUUID();
		return uid.toString().replaceAll("-", "");
	}
	 
	public static String createNumber(){
		Random random=new Random();
		String result=random.nextInt(1000000000)+1000000000+"";
		return result;
	}
	public static void main(String[] args) {
//		System.out.println(d_md5("c8837b23ff8aaa8a2dde9154"));
		 System.out.println(createNumber());
	}

}
